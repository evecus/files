package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.media3.common.util.EGLSurfaceTexture;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.Log;
import defpackage.sp0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class PlaceholderSurface extends Surface {
    private static final String TAG = "PlaceholderSurface";
    private static int secureMode;
    private static boolean secureModeInitialized;
    public final boolean secure;
    private final PlaceholderSurfaceThread thread;
    private boolean threadReleased;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class PlaceholderSurfaceThread extends HandlerThread implements Handler.Callback {
        private static final int MSG_INIT = 1;
        private static final int MSG_RELEASE = 2;
        private EGLSurfaceTexture eglSurfaceTexture;
        private Handler handler;
        private Error initError;
        private RuntimeException initException;
        private PlaceholderSurface surface;

        public PlaceholderSurfaceThread() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void initInternal(int i) {
            this.eglSurfaceTexture.getClass();
            this.eglSurfaceTexture.init(i);
            this.surface = new PlaceholderSurface(this, this.eglSurfaceTexture.getSurfaceTexture(), i != 0);
        }

        private void releaseInternal() {
            this.eglSurfaceTexture.getClass();
            this.eglSurfaceTexture.release();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i != 1) {
                    if (i != 2) {
                        return true;
                    }
                    try {
                        releaseInternal();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    initInternal(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (GlUtil.GlException e) {
                    Log.e(PlaceholderSurface.TAG, "Failed to initialize placeholder surface", e);
                    this.initException = new IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    Log.e(PlaceholderSurface.TAG, "Failed to initialize placeholder surface", e2);
                    this.initError = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    Log.e(PlaceholderSurface.TAG, "Failed to initialize placeholder surface", e3);
                    this.initException = e3;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }

        public PlaceholderSurface init(int i) {
            boolean z;
            start();
            Handler handler = new Handler(getLooper(), this);
            this.handler = handler;
            this.eglSurfaceTexture = new EGLSurfaceTexture(handler);
            synchronized (this) {
                z = false;
                this.handler.obtainMessage(1, i, 0).sendToTarget();
                while (this.surface == null && this.initException == null && this.initError == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.initException;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.initError;
            if (error != null) {
                throw error;
            }
            PlaceholderSurface placeholderSurface = this.surface;
            placeholderSurface.getClass();
            return placeholderSurface;
        }

        public void release() {
            this.handler.getClass();
            this.handler.sendEmptyMessage(2);
        }
    }

    private PlaceholderSurface(PlaceholderSurfaceThread placeholderSurfaceThread, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.thread = placeholderSurfaceThread;
        this.secure = z;
    }

    private static int getSecureMode(Context context) {
        try {
            if (GlUtil.isProtectedContentExtensionSupported(context)) {
                return GlUtil.isSurfacelessContextExtensionSupported() ? 1 : 2;
            }
            return 0;
        } catch (GlUtil.GlException e) {
            Log.e(TAG, "Failed to determine secure mode due to GL error: " + e.getMessage());
            return 0;
        }
    }

    public static synchronized boolean isSecureSupported(Context context) {
        boolean z;
        synchronized (PlaceholderSurface.class) {
            try {
                if (!secureModeInitialized) {
                    secureMode = getSecureMode(context);
                    secureModeInitialized = true;
                }
                z = secureMode != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public static PlaceholderSurface newInstance(Context context, boolean z) {
        sp0.z(!z || isSecureSupported(context));
        return new PlaceholderSurfaceThread().init(z ? secureMode : 0);
    }

    @Deprecated
    public static PlaceholderSurface newInstanceV17(Context context, boolean z) {
        return newInstance(context, z);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.thread) {
            try {
                if (!this.threadReleased) {
                    this.thread.release();
                    this.threadReleased = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

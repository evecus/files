package androidx.media3.common.video;

import android.graphics.Bitmap;
import android.hardware.DataSpace;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.video.DefaultHardwareBufferFrame;
import androidx.media3.common.video.FrameWriter;
import androidx.media3.common.video.HardwareBufferPool;
import androidx.media3.common.video.SurfaceHolderFrameWriter;
import defpackage.a05;
import defpackage.c05;
import defpackage.h;
import defpackage.h8;
import defpackage.hn3;
import defpackage.sp0;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class SurfaceHolderFrameWriter implements FrameWriter, SurfaceHolder.Callback {
    private static final int CAPACITY = 2;
    private Format currentFormat;
    private long currentUsageFlags;
    private final HardwareBufferNativeHelpers hardwareBufferNativeHelpers;
    private final HardwareBufferPool hardwareBufferPool;
    private ImageWriter imageWriter;
    private boolean isSurfaceChangeRequested;
    private HardwareBuffer lastQueuedHardwareBuffer;
    private final Listener listener;
    private final Executor listenerExecutor;
    private final Object lock;
    private Surface surface;
    private SurfaceHolder surfaceHolder;
    private final Executor surfaceHolderExecutor;
    private Runnable wakeupListener;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class InternalImage {
        final Image image;
        final ImageWriter imageWriter;
        final boolean needsCopy;

        public InternalImage(Image image, ImageWriter imageWriter, boolean z) {
            this.image = image;
            this.imageWriter = imageWriter;
            this.needsCopy = z;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Listener {
        void onEnded();

        void onError(VideoFrameProcessingException videoFrameProcessingException);

        void onFrameAboutToBeRendered(long j, long j2, Format format);
    }

    private SurfaceHolderFrameWriter(SurfaceHolder surfaceHolder, Executor executor, Listener listener, Executor executor2, HardwareBufferNativeHelpers hardwareBufferNativeHelpers) {
        if (Build.VERSION.SDK_INT < 33) {
            sp0.z(hardwareBufferNativeHelpers != null);
        }
        this.lock = new Object();
        this.surfaceHolder = surfaceHolder;
        this.surfaceHolderExecutor = executor;
        this.listener = listener;
        this.listenerExecutor = executor2;
        this.hardwareBufferNativeHelpers = hardwareBufferNativeHelpers;
        this.hardwareBufferPool = new HardwareBufferPool(2);
        if (surfaceHolder != null) {
            surfaceHolder.addCallback(this);
        }
    }

    private static int colorRangeToDataSpaceRange(int i) {
        return i != 1 ? i != 2 ? 0 : 268435456 : C.BUFFER_FLAG_FIRST_SAMPLE;
    }

    private static int colorSpaceToDataSpaceStandard(int i) {
        if (i == 1) {
            return 65536;
        }
        if (i != 2) {
            return i != 6 ? 0 : 393216;
        }
        return 131072;
    }

    private static int colorTransferToDataSpaceTransfer(int i) {
        if (i == 1) {
            return 4194304;
        }
        if (i == 2) {
            return 8388608;
        }
        if (i == 3) {
            return 12582912;
        }
        if (i == 6) {
            return 29360128;
        }
        if (i == 7) {
            return 33554432;
        }
        if (i != 10) {
            return 0;
        }
        return Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
    }

    public static SurfaceHolderFrameWriter create(SurfaceHolder surfaceHolder, Executor executor, Listener listener, Executor executor2) {
        return new SurfaceHolderFrameWriter(surfaceHolder, executor, listener, executor2, null);
    }

    private InternalImage dequeueInternalImage(boolean z) {
        ImageWriter imageWriter = this.imageWriter;
        imageWriter.getClass();
        Image dequeueInputImage = imageWriter.dequeueInputImage();
        ImageWriter imageWriter2 = this.imageWriter;
        imageWriter2.getClass();
        return new InternalImage(dequeueInputImage, imageWriter2, z);
    }

    private static Bitmap.Config getBitmapConfig(int i) {
        boolean z = true;
        if (i != 43 && i != 1) {
            z = false;
        }
        sp0.o(z);
        return (i != 43 || Build.VERSION.SDK_INT < 33) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_1010102;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dequeueInputFrame$4(IllegalStateException illegalStateException) {
        this.listener.onError(new VideoFrameProcessingException(illegalStateException));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getInfo$1(Format format, long j) {
        ColorInfo colorInfo = format.colorInfo;
        if (colorInfo != null) {
            return (!ColorInfo.isTransferHdr(colorInfo) || Build.VERSION.SDK_INT >= 33) && format.width > 0 && format.height > 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queueInputFrame$6(IOException iOException) {
        this.listener.onError(new VideoFrameProcessingException(iOException));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queueInputFrame$7() {
        this.listener.onError(new VideoFrameProcessingException("Failed to copy HardwareBuffer via JNI."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queueInputFrame$8(IllegalStateException illegalStateException) {
        this.listener.onError(new VideoFrameProcessingException(illegalStateException));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queueInputFrame$9(DefaultHardwareBufferFrame defaultHardwareBufferFrame, long j) {
        this.listener.onFrameAboutToBeRendered(defaultHardwareBufferFrame.getContentTimeUs(), j, defaultHardwareBufferFrame.getFormat());
    }

    private void maybeRestoreBackupFrame() {
        HardwareBuffer hardwareBuffer;
        ImageWriter imageWriter = this.imageWriter;
        if (imageWriter == null || (hardwareBuffer = this.lastQueuedHardwareBuffer) == null || hardwareBuffer.isClosed()) {
            return;
        }
        Image dequeueInputImage = imageWriter.dequeueInputImage();
        if (dequeueInputImage.getWidth() != hardwareBuffer.getWidth() || dequeueInputImage.getHeight() != hardwareBuffer.getHeight() || dequeueInputImage.getFormat() != hardwareBuffer.getFormat()) {
            dequeueInputImage.close();
            return;
        }
        HardwareBufferNativeHelpers hardwareBufferNativeHelpers = this.hardwareBufferNativeHelpers;
        if (hardwareBufferNativeHelpers != null) {
            HardwareBuffer hardwareBuffer2 = dequeueInputImage.getHardwareBuffer();
            hardwareBuffer2.getClass();
            sp0.z(hardwareBufferNativeHelpers.nativeCopyHardwareBufferToHardwareBuffer(hardwareBuffer, hardwareBuffer2));
        } else if (Build.VERSION.SDK_INT >= 29) {
            Bitmap wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, null);
            wrapHardwareBuffer.getClass();
            Bitmap copy = wrapHardwareBuffer.copy(getBitmapConfig(hardwareBuffer.getFormat()), false);
            if (copy != null) {
                ByteBuffer buffer = dequeueInputImage.getPlanes()[0].getBuffer();
                buffer.rewind();
                copy.copyPixelsToBuffer(buffer);
            }
        }
        imageWriter.queueInputImage(dequeueInputImage);
    }

    private void releaseFrameResources(DefaultHardwareBufferFrame defaultHardwareBufferFrame) {
        defaultHardwareBufferFrame.getHardwareBuffer().close();
        InternalImage internalImage = (InternalImage) defaultHardwareBufferFrame.getInternalImage();
        internalImage.getClass();
        internalImage.image.close();
    }

    @Override // androidx.media3.common.video.FrameWriter, java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            try {
                HardwareBuffer hardwareBuffer = this.lastQueuedHardwareBuffer;
                if (hardwareBuffer != null) {
                    hardwareBuffer.close();
                    this.lastQueuedHardwareBuffer = null;
                }
                ImageWriter imageWriter = this.imageWriter;
                if (imageWriter != null) {
                    imageWriter.close();
                    this.imageWriter = null;
                }
                SurfaceHolder surfaceHolder = this.surfaceHolder;
                if (surfaceHolder != null) {
                    surfaceHolder.removeCallback(this);
                    this.surfaceHolder = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.common.video.FrameWriter
    public void configure(Format format, long j) {
        byte b = 1;
        sp0.o(format.colorInfo != null);
        sp0.o(format.width > 0);
        sp0.o(format.height > 0);
        synchronized (this.lock) {
            try {
                if (format.equals(this.currentFormat) && j == this.currentUsageFlags) {
                    return;
                }
                this.currentFormat = format;
                this.currentUsageFlags = j;
                HardwareBuffer hardwareBuffer = this.lastQueuedHardwareBuffer;
                if (hardwareBuffer != null) {
                    hardwareBuffer.close();
                    this.lastQueuedHardwareBuffer = null;
                }
                ImageWriter imageWriter = this.imageWriter;
                if (imageWriter != null) {
                    imageWriter.close();
                    this.imageWriter = null;
                }
                SurfaceHolder surfaceHolder = this.surfaceHolder;
                if (surfaceHolder == null) {
                    return;
                }
                this.isSurfaceChangeRequested = true;
                this.surfaceHolderExecutor.execute(new c05(surfaceHolder, b));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.common.video.FrameWriter
    public AsyncFrame dequeueInputFrame(final Executor executor, final Runnable runnable) {
        synchronized (this.lock) {
            Format format = this.currentFormat;
            long j = this.currentUsageFlags;
            final byte b = 0;
            final byte b2 = 1;
            sp0.A(format != null, "configure() must be called before dequeueInputFrame()");
            if (this.imageWriter == null || this.isSurfaceChangeRequested) {
                this.wakeupListener = new Runnable() { // from class: d05
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (b2) {
                            case 0:
                                executor.execute(runnable);
                                break;
                            default:
                                executor.execute(runnable);
                                break;
                        }
                    }
                };
                return null;
            }
            try {
                if (Build.VERSION.SDK_INT < 33 && j != 0 && j != 48) {
                    sp0.z(this.hardwareBufferNativeHelpers != null);
                    HardwareBufferPool.HardwareBufferWithFence hardwareBufferWithFence = this.hardwareBufferPool.get(format, j | 3, new Runnable() { // from class: d05
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (b) {
                                case 0:
                                    executor.execute(runnable);
                                    break;
                                default:
                                    executor.execute(runnable);
                                    break;
                            }
                        }
                    });
                    if (hardwareBufferWithFence == null) {
                        return null;
                    }
                    return new AsyncFrame(new DefaultHardwareBufferFrame.Builder(hardwareBufferWithFence.hardwareBuffer).setInternalImage(dequeueInternalImage(true)).setFormat(format).build(), hardwareBufferWithFence.acquireFence);
                }
                InternalImage dequeueInternalImage = dequeueInternalImage(false);
                HardwareBuffer hardwareBuffer = dequeueInternalImage.image.getHardwareBuffer();
                hardwareBuffer.getClass();
                return new AsyncFrame(new DefaultHardwareBufferFrame.Builder(hardwareBuffer).setInternalImage(dequeueInternalImage).setFormat(format).build(), null);
            } catch (IllegalStateException e) {
                this.listenerExecutor.execute(new a05(this, e, b2));
                return null;
            }
        }
    }

    @Override // androidx.media3.common.video.FrameWriter
    public FrameWriter.Info getInfo() {
        return new hn3((byte) 10);
    }

    @Override // androidx.media3.common.video.FrameWriter
    public void queueInputFrame(Frame frame, SyncFenceWrapper syncFenceWrapper) {
        sp0.o(frame instanceof DefaultHardwareBufferFrame);
        final DefaultHardwareBufferFrame defaultHardwareBufferFrame = (DefaultHardwareBufferFrame) frame;
        Object internalImage = defaultHardwareBufferFrame.getInternalImage();
        internalImage.getClass();
        InternalImage internalImage2 = (InternalImage) internalImage;
        Image image = internalImage2.image;
        ImageWriter imageWriter = internalImage2.imageWriter;
        synchronized (this.lock) {
            if (syncFenceWrapper != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    try {
                        image.setFence(syncFenceWrapper.asSyncFence());
                    } catch (IOException e) {
                        this.listenerExecutor.execute(new h8(this, e, (byte) 28));
                        syncFenceWrapper.close();
                        releaseFrameResources(defaultHardwareBufferFrame);
                        return;
                    }
                }
            }
            if (this.imageWriter != imageWriter) {
                releaseFrameResources(defaultHardwareBufferFrame);
                return;
            }
            boolean z = internalImage2.needsCopy;
            byte b = 0;
            if (z) {
                sp0.z(this.hardwareBufferNativeHelpers != null);
                HardwareBuffer hardwareBuffer = image.getHardwareBuffer();
                hardwareBuffer.getClass();
                try {
                    if (!this.hardwareBufferNativeHelpers.nativeCopyHardwareBufferToHardwareBuffer(defaultHardwareBufferFrame.getHardwareBuffer(), hardwareBuffer)) {
                        this.listenerExecutor.execute(new h(this, (byte) 23));
                        releaseFrameResources(defaultHardwareBufferFrame);
                        hardwareBuffer.close();
                        return;
                    }
                    this.hardwareBufferPool.recycle(defaultHardwareBufferFrame.getHardwareBuffer(), null);
                    hardwareBuffer.close();
                } finally {
                }
            } else {
                defaultHardwareBufferFrame.getHardwareBuffer().close();
            }
            HardwareBuffer hardwareBuffer2 = this.lastQueuedHardwareBuffer;
            if (hardwareBuffer2 != null) {
                hardwareBuffer2.close();
                this.lastQueuedHardwareBuffer = null;
            }
            HardwareBuffer hardwareBuffer3 = image.getHardwareBuffer();
            hardwareBuffer3.getClass();
            this.lastQueuedHardwareBuffer = hardwareBuffer3;
            Object obj = defaultHardwareBufferFrame.getMetadata().get(Frame.KEY_DISPLAY_TIME_NS);
            boolean z2 = obj instanceof Number;
            final long j = C.TIME_UNSET;
            if (z2) {
                long longValue = ((Number) obj).longValue();
                if (longValue != C.TIME_UNSET) {
                    image.setTimestamp(longValue);
                }
                j = longValue;
            }
            try {
                imageWriter.queueInputImage(image);
            } catch (IllegalStateException e2) {
                this.listenerExecutor.execute(new a05(this, e2, b));
                image.close();
            }
            this.listenerExecutor.execute(new Runnable() { // from class: b05
                @Override // java.lang.Runnable
                public final void run() {
                    SurfaceHolderFrameWriter.this.lambda$queueInputFrame$9(defaultHardwareBufferFrame, j);
                }
            });
        }
    }

    public void setSurfaceHolder(SurfaceHolder surfaceHolder) {
        synchronized (this.lock) {
            try {
                SurfaceHolder surfaceHolder2 = this.surfaceHolder;
                if (surfaceHolder2 != null) {
                    surfaceHolder2.removeCallback(this);
                }
                this.surfaceHolder = surfaceHolder;
                HardwareBuffer hardwareBuffer = this.lastQueuedHardwareBuffer;
                if (hardwareBuffer != null) {
                    hardwareBuffer.close();
                    this.lastQueuedHardwareBuffer = null;
                }
                ImageWriter imageWriter = this.imageWriter;
                if (imageWriter != null) {
                    imageWriter.close();
                    this.imageWriter = null;
                }
                if (surfaceHolder != null) {
                    surfaceHolder.addCallback(this);
                    if (this.currentFormat != null) {
                        this.isSurfaceChangeRequested = true;
                        this.surfaceHolderExecutor.execute(new c05(surfaceHolder, (byte) 0));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.common.video.FrameWriter
    public void signalEndOfStream() {
        Executor executor = this.listenerExecutor;
        Listener listener = this.listener;
        Objects.requireNonNull(listener);
        executor.execute(new h(listener, (byte) 24));
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        synchronized (this.lock) {
            try {
                if (surfaceHolder != this.surfaceHolder) {
                    return;
                }
                Format format = this.currentFormat;
                if (format == null) {
                    return;
                }
                int i4 = format.pixelFormat;
                if (i4 == -1) {
                    i4 = ColorInfo.isTransferHdr(format.colorInfo) ? 43 : 1;
                }
                int i5 = format.width;
                if (i2 == i5 && i3 == format.height && i == i4) {
                    ImageWriter imageWriter = this.imageWriter;
                    if (imageWriter != null) {
                        if (surfaceHolder.getSurface().equals(this.surface)) {
                            return;
                        } else {
                            imageWriter.close();
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 33) {
                        ImageWriter.Builder hardwareBufferFormat = new ImageWriter.Builder(surfaceHolder.getSurface()).setMaxImages(2).setUsage(this.currentUsageFlags | 51).setHardwareBufferFormat(i4);
                        ColorInfo colorInfo = format.colorInfo;
                        colorInfo.getClass();
                        this.imageWriter = hardwareBufferFormat.setDataSpace(DataSpace.pack(colorSpaceToDataSpaceStandard(colorInfo.colorSpace), colorTransferToDataSpaceTransfer(format.colorInfo.colorTransfer), colorRangeToDataSpaceRange(format.colorInfo.colorRange))).build();
                    } else {
                        this.imageWriter = ImageWriter.newInstance(surfaceHolder.getSurface(), 2);
                    }
                    this.surface = surfaceHolder.getSurface();
                    this.isSurfaceChangeRequested = false;
                    maybeRestoreBackupFrame();
                    Runnable runnable = this.wakeupListener;
                    this.wakeupListener = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    return;
                }
                this.surface = null;
                surfaceHolder.setFixedSize(i5, format.height);
                surfaceHolder.setFormat(i4);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        synchronized (this.lock) {
            try {
                ImageWriter imageWriter = this.imageWriter;
                if (imageWriter != null) {
                    imageWriter.close();
                    this.imageWriter = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static SurfaceHolderFrameWriter create(SurfaceHolder surfaceHolder, Executor executor, Listener listener, Executor executor2, HardwareBufferNativeHelpers hardwareBufferNativeHelpers) {
        return new SurfaceHolderFrameWriter(surfaceHolder, executor, listener, executor2, hardwareBufferNativeHelpers);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }
}

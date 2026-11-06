package defpackage;

import android.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.common.util.WifiLockManager;
import androidx.media3.datasource.cache.CacheWriter;
import androidx.media3.exoplayer.CodecParameters;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class n95 implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ n95(Object obj, Object obj2, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.I) {
            case 0:
                Runnable runnable = (Runnable) this.J;
                vj4 vj4Var = (vj4) this.K;
                try {
                    runnable.run();
                    return;
                } finally {
                    vj4Var.b();
                }
            case 1:
                Util.lambda$transformFutureAsync$1((al4) this.J, (fl2) this.K);
                return;
            case 2:
                CacheWriter cacheWriter = (CacheWriter) this.J;
                String str = (String) this.K;
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    try {
                        try {
                            cacheWriter.cache();
                            Log.d("VideoMediaCache", "预取完成: " + jx4.f0(60, str) + ", " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                            obj = sn5.c;
                        } catch (Throwable th) {
                            synchronized (sn5.c) {
                                try {
                                    rn5 rn5Var = sn5.e;
                                    if ((rn5Var != null ? rn5Var.b : null) == cacheWriter) {
                                        sn5.e = null;
                                    }
                                    throw th;
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        obj = sn5.c;
                        synchronized (obj) {
                            try {
                                rn5 rn5Var2 = sn5.e;
                                if ((rn5Var2 != null ? rn5Var2.b : null) == cacheWriter) {
                                    sn5.e = null;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                    synchronized (obj) {
                        try {
                            rn5 rn5Var3 = sn5.e;
                            if ((rn5Var3 != null ? rn5Var3.b : null) == cacheWriter) {
                                sn5.e = null;
                            }
                            return;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                } catch (Exception e) {
                    Object obj2 = sn5.c;
                    synchronized (obj2) {
                        rn5 rn5Var4 = sn5.e;
                        if ((rn5Var4 != null ? rn5Var4.b : null) == cacheWriter) {
                            Log.w("VideoMediaCache", "预取失败: ".concat(jx4.f0(60, str)), e);
                        }
                        synchronized (obj2) {
                            try {
                                rn5 rn5Var5 = sn5.e;
                                if ((rn5Var5 != null ? rn5Var5.b : null) == cacheWriter) {
                                    sn5.e = null;
                                    return;
                                }
                                return;
                            } finally {
                            }
                        }
                    }
                }
            case 3:
                ((VideoRendererEventListener.EventDispatcher) this.J).lambda$decoderReleased$7((String) this.K);
                return;
            case 4:
                ((VideoRendererEventListener.EventDispatcher) this.J).lambda$videoCodecError$9((Exception) this.K);
                return;
            case 5:
                ((VideoRendererEventListener.EventDispatcher) this.J).lambda$disabled$8((DecoderCounters) this.K);
                return;
            case 6:
                ((VideoRendererEventListener.EventDispatcher) this.J).lambda$videoCodecParametersChanged$10((CodecParameters) this.K);
                return;
            default:
                ((WifiLockManager) this.J).lambda$postUpdateWifiLock$1((AtomicBoolean) this.K);
                return;
        }
    }
}

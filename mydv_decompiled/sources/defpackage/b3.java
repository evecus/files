package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class b3 {
    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern a(int i, int i2) {
        return new MediaCodec.CryptoInfo.Pattern(i, i2);
    }

    public static /* synthetic */ LocaleList b(Locale[] localeArr) {
        return new LocaleList(localeArr);
    }

    public static /* synthetic */ LocaleSpan c(LocaleList localeList) {
        return new LocaleSpan(localeList);
    }

    public static /* synthetic */ void d() {
    }

    public static void e(u13 u13Var) {
        boolean isTerminated;
        ExecutorService executorService = u13Var.I;
        if ((Build.VERSION.SDK_INT <= 23 || u13Var != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            u13Var.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        u13Var.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void f(x13 x13Var) {
        boolean isTerminated;
        ExecutorService executorService = x13Var.I;
        if ((Build.VERSION.SDK_INT <= 23 || x13Var != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            x13Var.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        x13Var.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void g(ExecutorService executorService) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            executorService.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void h() {
    }
}

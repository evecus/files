package defpackage;

import androidx.media3.common.util.Util;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class pf0 implements ThreadFactory {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    public /* synthetic */ pf0(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread lambda$newSingleThreadExecutor$3;
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 0:
                Thread thread = new Thread(runnable, str);
                thread.setPriority(10);
                return thread;
            default:
                lambda$newSingleThreadExecutor$3 = Util.lambda$newSingleThreadExecutor$3(str, runnable);
                return lambda$newSingleThreadExecutor$3;
        }
    }
}

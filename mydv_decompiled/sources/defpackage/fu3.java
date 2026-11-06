package defpackage;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class fu3 implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Context J;

    public /* synthetic */ fu3(Context context, byte b) {
        this.I = b;
        this.J = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        byte b2 = 1;
        Context context = this.J;
        switch (b) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new fu3(context, b2));
                break;
            default:
                j42.o0(context, new fp((byte) 1), j42.n, false);
                break;
        }
    }
}

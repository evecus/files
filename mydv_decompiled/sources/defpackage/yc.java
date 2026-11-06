package defpackage;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class yc implements b81 {
    public final Context a;

    public yc(Context context, byte b) {
        switch (b) {
            case 1:
                this.a = context.getApplicationContext();
                break;
            case 2:
                this.a = context;
                break;
            default:
                this.a = context.getApplicationContext();
                break;
        }
    }

    @Override // defpackage.b81
    public void a(vt0 vt0Var) {
        pf0 pf0Var = new pf0("EmojiCompatInitializer", (byte) 0);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), pf0Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new pr(this, vt0Var, threadPoolExecutor, (byte) 1));
    }
}

package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class pg0 {
    public final mc3 a;
    public final Context b;
    public final Object c;
    public final LinkedHashSet d;
    public Object e;

    public pg0(Context context, mc3 mc3Var) {
        this.a = mc3Var;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.b = applicationContext;
        this.c = new Object();
        this.d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.e = obj;
                ((ob1) this.a.d).execute(new h8(o70.r1(this.d), this, (byte) 10));
            }
        }
    }

    public abstract void c();

    public abstract void d();
}

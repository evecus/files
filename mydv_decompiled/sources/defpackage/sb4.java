package defpackage;

import androidx.media3.common.util.Log;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class sb4 implements gc4 {
    public static final da k = new da((Object) new fa4(5), (Object) new yv3((byte) 13), (byte) 10);
    public final gk3 a;
    public float g;
    public final gk3 b = new gk3(0);
    public final gk3 c = new gk3(0);
    public final jk3 d = ad4.w(Boolean.FALSE);
    public final t33 e = new t33();
    public final gk3 f = new gk3(Log.LOG_LEVEL_OFF);
    public final qs0 h = new qs0(new tf2(this, 21));
    public final wu0 i = dt4.b(new vj(this, (byte) 3));
    public final wu0 j = dt4.b(new vj(this, (byte) 4));

    public sb4(int i) {
        this.a = new gk3(i);
    }

    @Override // defpackage.gc4
    public final boolean a() {
        return this.h.a();
    }

    @Override // defpackage.gc4
    public final boolean b() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    @Override // defpackage.gc4
    public final boolean c() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    @Override // defpackage.gc4
    public final Object d(d53 d53Var, hn1 hn1Var, gj0 gj0Var) {
        Object d = this.h.d(d53Var, hn1Var, gj0Var);
        return d == el0.I ? d : wd5.a;
    }

    @Override // defpackage.gc4
    public final float e(float f) {
        return this.h.e(f);
    }
}

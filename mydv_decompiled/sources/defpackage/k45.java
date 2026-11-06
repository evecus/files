package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class k45 implements gc4 {
    public final /* synthetic */ gc4 a;
    public final wu0 b;
    public final wu0 c;

    public k45(gc4 gc4Var, final l45 l45Var) {
        this.a = gc4Var;
        final byte b = 0;
        this.b = dt4.b(new rm1() { // from class: j45
            @Override // defpackage.rm1
            public final Object invoke() {
                byte b2 = b;
                l45 l45Var2 = l45Var;
                switch (b2) {
                    case 0:
                        return Boolean.valueOf(l45Var2.a.h() < l45Var2.b.h());
                    default:
                        return Boolean.valueOf(l45Var2.a.h() > 0.0f);
                }
            }
        });
        final byte b2 = 1;
        this.c = dt4.b(new rm1() { // from class: j45
            @Override // defpackage.rm1
            public final Object invoke() {
                byte b22 = b2;
                l45 l45Var2 = l45Var;
                switch (b22) {
                    case 0:
                        return Boolean.valueOf(l45Var2.a.h() < l45Var2.b.h());
                    default:
                        return Boolean.valueOf(l45Var2.a.h() > 0.0f);
                }
            }
        });
    }

    @Override // defpackage.gc4
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.gc4
    public final boolean b() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // defpackage.gc4
    public final boolean c() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // defpackage.gc4
    public final Object d(d53 d53Var, hn1 hn1Var, gj0 gj0Var) {
        return this.a.d(d53Var, hn1Var, gj0Var);
    }

    @Override // defpackage.gc4
    public final float e(float f) {
        return this.a.e(f);
    }
}

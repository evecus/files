package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zc3 {
    public final Object a;
    public int b;
    public final /* synthetic */ ad3 c;

    public zc3(ad3 ad3Var, int i) {
        this.c = ad3Var;
        this.a = ad3Var.a[i];
        this.b = i;
    }

    public final int a() {
        int i = this.b;
        Object obj = this.a;
        ad3 ad3Var = this.c;
        if (i == -1 || i >= ad3Var.c || !jl2.z(obj, ad3Var.a[i])) {
            this.b = ad3Var.c(obj);
        }
        int i2 = this.b;
        if (i2 == -1) {
            return 0;
        }
        return ad3Var.b[i2];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zc3) {
            zc3 zc3Var = (zc3) obj;
            if (a() == zc3Var.a() && jl2.z(this.a, zc3Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        return a() ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int a = a();
        if (a == 1) {
            return valueOf;
        }
        return valueOf + " x " + a;
    }
}

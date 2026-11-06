package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class k74 implements dn4, t32 {
    public final pk0 a;
    public final pk0 b;
    public final pk0 c;
    public final pk0 d;

    public k74(pk0 pk0Var, pk0 pk0Var2, pk0 pk0Var3, pk0 pk0Var4) {
        this.a = pk0Var;
        this.b = pk0Var2;
        this.c = pk0Var3;
        this.d = pk0Var4;
    }

    public static k74 c(k74 k74Var, pk0 pk0Var, pk0 pk0Var2, pk0 pk0Var3, pk0 pk0Var4, int i) {
        if ((i & 1) != 0) {
            pk0Var = k74Var.a;
        }
        if ((i & 2) != 0) {
            pk0Var2 = k74Var.b;
        }
        if ((i & 4) != 0) {
            pk0Var3 = k74Var.c;
        }
        if ((i & 8) != 0) {
            pk0Var4 = k74Var.d;
        }
        k74Var.getClass();
        return new k74(pk0Var, pk0Var2, pk0Var3, pk0Var4);
    }

    @Override // defpackage.dn4
    public final yg3 a(long j, da2 da2Var, iu0 iu0Var) {
        float a = this.a.a(j, iu0Var);
        float a2 = this.b.a(j, iu0Var);
        float a3 = this.c.a(j, iu0Var);
        float a4 = this.d.a(j, iu0Var);
        float b = fq4.b(j);
        float f = a + a4;
        if (f > b) {
            float f2 = b / f;
            a *= f2;
            a4 *= f2;
        }
        float f3 = a2 + a3;
        if (f3 > b) {
            float f4 = b / f3;
            a2 *= f4;
            a3 *= f4;
        }
        if (a < 0.0f || a2 < 0.0f || a3 < 0.0f || a4 < 0.0f) {
            StringBuilder B = hf1.B("Corner size in Px can't be negative(topStart = ", a, ", topEnd = ", a2, ", bottomEnd = ");
            B.append(a3);
            B.append(", bottomStart = ");
            B.append(a4);
            B.append(")!");
            t02.a(B.toString());
        }
        if (a + a2 + a3 + a4 == 0.0f) {
            return new wg3(sv2.g(0L, j));
        }
        m14 g = sv2.g(0L, j);
        da2 da2Var2 = da2.I;
        float f5 = da2Var == da2Var2 ? a : a2;
        long floatToRawIntBits = (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L);
        if (da2Var == da2Var2) {
            a = a2;
        }
        long floatToRawIntBits2 = (Float.floatToRawIntBits(a) << 32) | (Float.floatToRawIntBits(a) & 4294967295L);
        float f6 = da2Var == da2Var2 ? a3 : a4;
        long floatToRawIntBits3 = (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L);
        if (da2Var != da2Var2) {
            a4 = a3;
        }
        return new xg3(new h74(g.a, g.b, g.c, g.d, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits3, (Float.floatToRawIntBits(a4) << 32) | (Float.floatToRawIntBits(a4) & 4294967295L)));
    }

    @Override // defpackage.t32
    public final Object b(Object obj, float f) {
        if (j42.c(obj, mw2.j) || obj == null) {
            k74 k74Var = l74.a;
            by3 by3Var = new by3();
            obj = new k74(by3Var, by3Var, by3Var, by3Var);
        }
        if (!(obj instanceof k74)) {
            return null;
        }
        k74 k74Var2 = (k74) obj;
        k74 k74Var3 = l74.a;
        return new k74(new bx2(this.a, k74Var2.a, f), new bx2(this.b, k74Var2.b, f), new bx2(this.c, k74Var2.c, f), new bx2(this.d, k74Var2.d, f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k74)) {
            return false;
        }
        k74 k74Var = (k74) obj;
        return j42.c(this.a, k74Var.a) && j42.c(this.b, k74Var.b) && j42.c(this.c, k74Var.c) && j42.c(this.d, k74Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ")";
    }
}

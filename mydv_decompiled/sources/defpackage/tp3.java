package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class tp3 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final float k;
    public final long l;
    public final long m;

    public tp3(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = f2;
        this.l = j6;
        this.m = j7;
    }

    public final boolean a() {
        return this.h;
    }

    public final boolean b() {
        return this.e;
    }

    public final List c() {
        return this.i;
    }

    public final long d() {
        return this.a;
    }

    public final long e() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp3)) {
            return false;
        }
        tp3 tp3Var = (tp3) obj;
        return rt0.p(this.a, tp3Var.a) && this.b == tp3Var.b && pd3.c(this.c, tp3Var.c) && pd3.c(this.d, tp3Var.d) && this.e == tp3Var.e && Float.compare(this.f, tp3Var.f) == 0 && this.g == tp3Var.g && this.h == tp3Var.h && this.i.equals(tp3Var.i) && pd3.c(this.j, tp3Var.j) && Float.compare(this.k, tp3Var.k) == 0 && pd3.c(this.l, tp3Var.l) && pd3.c(this.m, tp3Var.m);
    }

    public final long f() {
        return this.l;
    }

    public final long g() {
        return this.d;
    }

    public final long h() {
        return this.c;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return i82.Q(this.m) + ((i82.Q(this.l) + jp0.o(this.k, (i82.Q(this.j) + ((this.i.hashCode() + ((((jp0.o(this.f, (((i82.Q(this.d) + ((i82.Q(this.c) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31)) * 31) + (this.e ? 1231 : 1237)) * 31, 31) + this.g) * 31) + (this.h ? 1231 : 1237)) * 31)) * 31)) * 31, 31)) * 31);
    }

    public final float i() {
        return this.f;
    }

    public final float j() {
        return this.k;
    }

    public final long k() {
        return this.j;
    }

    public final int l() {
        return this.g;
    }

    public final long m() {
        return this.b;
    }

    public final String toString() {
        String M = rt0.M(this.a);
        String h = pd3.h(this.c);
        String h2 = pd3.h(this.d);
        String c = cq3.c(this.g);
        String h3 = pd3.h(this.j);
        String h4 = pd3.h(this.l);
        String h5 = pd3.h(this.m);
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append(M);
        sb.append(", uptime=");
        sb.append(this.b);
        r7.N(sb, ", positionOnScreen=", h, ", position=", h2);
        sb.append(", down=");
        sb.append(this.e);
        sb.append(", pressure=");
        sb.append(this.f);
        sb.append(", type=");
        sb.append(c);
        sb.append(", activeHover=");
        sb.append(this.h);
        sb.append(", historical=");
        sb.append(this.i);
        sb.append(", scrollDelta=");
        sb.append(h3);
        sb.append(", scaleGestureFactor=");
        sb.append(this.k);
        sb.append(", panGestureOffset=");
        sb.append(h4);
        sb.append(", originalEventPosition=");
        sb.append(h5);
        sb.append(")");
        return sb.toString();
    }
}

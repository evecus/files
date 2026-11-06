package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class yt4 implements kj {
    public final g55 a;
    public final long b;
    public final qk1 c;
    public final lk1 d;
    public final mk1 e;
    public final mj1 f;
    public final String g;
    public final long h;
    public final wu i;
    public final h55 j;
    public final tq2 k;
    public final long l;
    public final m35 m;
    public final an4 n;
    public final fo3 o;
    public final z31 p;

    public yt4(long j, long j2, qk1 qk1Var, lk1 lk1Var, mk1 mk1Var, mj1 mj1Var, String str, long j3, wu wuVar, h55 h55Var, tq2 tq2Var, long j4, m35 m35Var, an4 an4Var, int i) {
        this((i & 1) != 0 ? x70.g : j, (i & 2) != 0 ? p65.c : j2, (i & 4) != 0 ? null : qk1Var, (i & 8) != 0 ? null : lk1Var, (i & 16) != 0 ? null : mk1Var, (i & 32) != 0 ? null : mj1Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? p65.c : j3, (i & 256) != 0 ? null : wuVar, (i & 512) != 0 ? null : h55Var, (i & 1024) != 0 ? null : tq2Var, (i & 2048) != 0 ? x70.g : j4, (i & 4096) != 0 ? null : m35Var, (i & 8192) != 0 ? null : an4Var, (fo3) null, (z31) null);
    }

    public final boolean a(yt4 yt4Var) {
        if (this == yt4Var) {
            return true;
        }
        if (!p65.a(this.b, yt4Var.b) || !j42.c(this.c, yt4Var.c) || !j42.c(this.d, yt4Var.d) || !j42.c(this.e, yt4Var.e) || !j42.c(this.f, yt4Var.f) || !j42.c(this.g, yt4Var.g) || !p65.a(this.h, yt4Var.h) || !j42.c(this.i, yt4Var.i) || !j42.c(this.j, yt4Var.j) || !j42.c(this.k, yt4Var.k)) {
            return false;
        }
        long j = yt4Var.l;
        int i = x70.h;
        return zc5.a(this.l, j) && j42.c(this.o, yt4Var.o);
    }

    public final boolean b(yt4 yt4Var) {
        return j42.c(this.a, yt4Var.a) && j42.c(this.m, yt4Var.m) && j42.c(this.n, yt4Var.n) && j42.c(this.p, yt4Var.p);
    }

    public final yt4 c(yt4 yt4Var) {
        if (yt4Var == null) {
            return this;
        }
        g55 g55Var = yt4Var.a;
        return zt4.a(this, g55Var.a(), g55Var.d(), g55Var.getAlpha(), yt4Var.b, yt4Var.c, yt4Var.d, yt4Var.e, yt4Var.f, yt4Var.g, yt4Var.h, yt4Var.i, yt4Var.j, yt4Var.k, yt4Var.l, yt4Var.m, yt4Var.n, yt4Var.o, yt4Var.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt4)) {
            return false;
        }
        yt4 yt4Var = (yt4) obj;
        return a(yt4Var) && b(yt4Var);
    }

    public final int hashCode() {
        g55 g55Var = this.a;
        long a = g55Var.a();
        int i = x70.h;
        int Q = i82.Q(a) * 31;
        wy d = g55Var.d();
        int floatToIntBits = (Float.floatToIntBits(g55Var.getAlpha()) + ((Q + (d != null ? d.hashCode() : 0)) * 31)) * 31;
        q65[] q65VarArr = p65.b;
        int Q2 = (i82.Q(this.b) + floatToIntBits) * 31;
        qk1 qk1Var = this.c;
        int i2 = (Q2 + (qk1Var != null ? qk1Var.I : 0)) * 31;
        lk1 lk1Var = this.d;
        int i3 = (i2 + (lk1Var != null ? lk1Var.a : 0)) * 31;
        mk1 mk1Var = this.e;
        int i4 = (i3 + (mk1Var != null ? mk1Var.a : 0)) * 31;
        mj1 mj1Var = this.f;
        int hashCode = (i4 + (mj1Var != null ? mj1Var.hashCode() : 0)) * 31;
        String str = this.g;
        int Q3 = (i82.Q(this.h) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        wu wuVar = this.i;
        int floatToIntBits2 = (Q3 + (wuVar != null ? Float.floatToIntBits(wuVar.a) : 0)) * 31;
        h55 h55Var = this.j;
        int hashCode2 = (floatToIntBits2 + (h55Var != null ? h55Var.hashCode() : 0)) * 31;
        tq2 tq2Var = this.k;
        int l = pt1.l((hashCode2 + (tq2Var != null ? tq2Var.I.hashCode() : 0)) * 31, 31, this.l);
        m35 m35Var = this.m;
        int i5 = (l + (m35Var != null ? m35Var.a : 0)) * 31;
        an4 an4Var = this.n;
        int hashCode3 = (i5 + (an4Var != null ? an4Var.hashCode() : 0)) * 31;
        fo3 fo3Var = this.o;
        int hashCode4 = (hashCode3 + (fo3Var != null ? fo3Var.hashCode() : 0)) * 31;
        z31 z31Var = this.p;
        return hashCode4 + (z31Var != null ? z31Var.hashCode() : 0);
    }

    public final String toString() {
        g55 g55Var = this.a;
        String i = x70.i(g55Var.a());
        wy d = g55Var.d();
        float alpha = g55Var.getAlpha();
        String d2 = p65.d(this.b);
        String d3 = p65.d(this.h);
        String i2 = x70.i(this.l);
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        sb.append(i);
        sb.append(", brush=");
        sb.append(d);
        sb.append(", alpha=");
        sb.append(alpha);
        sb.append(", fontSize=");
        sb.append(d2);
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        r7.N(sb, this.g, ", letterSpacing=", d3, ", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        sb.append(i2);
        sb.append(", textDecoration=");
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=");
        sb.append(this.o);
        sb.append(", drawStyle=");
        sb.append(this.p);
        sb.append(")");
        return sb.toString();
    }

    public yt4(g55 g55Var, long j, qk1 qk1Var, lk1 lk1Var, mk1 mk1Var, mj1 mj1Var, String str, long j2, wu wuVar, h55 h55Var, tq2 tq2Var, long j3, m35 m35Var, an4 an4Var, fo3 fo3Var, z31 z31Var) {
        this.a = g55Var;
        this.b = j;
        this.c = qk1Var;
        this.d = lk1Var;
        this.e = mk1Var;
        this.f = mj1Var;
        this.g = str;
        this.h = j2;
        this.i = wuVar;
        this.j = h55Var;
        this.k = tq2Var;
        this.l = j3;
        this.m = m35Var;
        this.n = an4Var;
        this.o = fo3Var;
        this.p = z31Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public yt4(long r24, long r26, defpackage.qk1 r28, defpackage.lk1 r29, defpackage.mk1 r30, defpackage.mj1 r31, java.lang.String r32, long r33, defpackage.wu r35, defpackage.h55 r36, defpackage.tq2 r37, long r38, defpackage.m35 r40, defpackage.an4 r41, defpackage.fo3 r42, defpackage.z31 r43) {
        /*
            r23 = this;
            r0 = r24
            r2 = 16
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L2f
            t90 r2 = new t90
            r2.<init>(r0)
        Ld:
            r3 = r23
            r5 = r26
            r7 = r28
            r8 = r29
            r9 = r30
            r10 = r31
            r11 = r32
            r12 = r33
            r14 = r35
            r15 = r36
            r16 = r37
            r17 = r38
            r19 = r40
            r20 = r41
            r21 = r42
            r22 = r43
            r4 = r2
            goto L32
        L2f:
            f55 r2 = defpackage.f55.a
            goto Ld
        L32:
            r3.<init>(r4, r5, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yt4.<init>(long, long, qk1, lk1, mk1, mj1, java.lang.String, long, wu, h55, tq2, long, m35, an4, fo3, z31):void");
    }
}

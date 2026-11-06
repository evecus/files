package defpackage;

import androidx.media3.exoplayer.source.ProgressiveMediaSource;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class m65 {
    public static final m65 d = new m65(0, 0, null, null, 0, 0, 0, 16777215);
    public final yt4 a;
    public final ck3 b;
    public final ko3 c;

    public m65(long j, long j2, qk1 qk1Var, mj1 mj1Var, long j3, int i, long j4, int i2) {
        this(new yt4((i2 & 1) != 0 ? x70.g : j, (i2 & 2) != 0 ? p65.c : j2, (i2 & 4) != 0 ? null : qk1Var, (lk1) null, (mk1) null, (i2 & 32) != 0 ? null : mj1Var, (i2 & 64) != 0 ? null : "tnum", (i2 & 128) != 0 ? p65.c : j3, (wu) null, (h55) null, (tq2) null, x70.g, (m35) null, (an4) null, (fo3) null, (z31) null), new ck3((32768 & i2) != 0 ? 0 : i, 0, (i2 & 131072) != 0 ? p65.c : j4, null, null, null, 0, 0, null), null);
    }

    public static m65 a(m65 m65Var, long j, long j2, qk1 qk1Var, mj1 mj1Var, long j3, an4 an4Var, long j4, pj2 pj2Var, int i) {
        long j5;
        long j6;
        ko3 ko3Var = j42.h;
        long a = (i & 1) != 0 ? m65Var.a.a.a() : j;
        long j7 = (i & 2) != 0 ? m65Var.a.b : j2;
        qk1 qk1Var2 = (i & 4) != 0 ? m65Var.a.c : qk1Var;
        yt4 yt4Var = m65Var.a;
        lk1 lk1Var = yt4Var.d;
        mk1 mk1Var = yt4Var.e;
        mj1 mj1Var2 = (i & 32) != 0 ? yt4Var.f : mj1Var;
        String str = yt4Var.g;
        long j8 = (i & 128) != 0 ? yt4Var.h : j3;
        wu wuVar = yt4Var.i;
        h55 h55Var = yt4Var.j;
        tq2 tq2Var = yt4Var.k;
        long j9 = yt4Var.l;
        m35 m35Var = yt4Var.m;
        an4 an4Var2 = (i & 8192) != 0 ? yt4Var.n : an4Var;
        z31 z31Var = yt4Var.p;
        ck3 ck3Var = m65Var.b;
        int i2 = ck3Var.a;
        int i3 = (i & 65536) != 0 ? ck3Var.b : 1;
        if ((i & 131072) != 0) {
            j5 = j9;
            j6 = ck3Var.c;
        } else {
            j5 = j9;
            j6 = j4;
        }
        i55 i55Var = ck3Var.d;
        ko3 ko3Var2 = (i & 524288) != 0 ? m65Var.c : ko3Var;
        pj2 pj2Var2 = (i & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? ck3Var.f : pj2Var;
        int i4 = ck3Var.g;
        int i5 = i3;
        int i6 = ck3Var.h;
        b65 b65Var = ck3Var.i;
        long a2 = yt4Var.a.a();
        int i7 = x70.h;
        return new m65(new yt4(zc5.a(a, a2) ? yt4Var.a : a != 16 ? new t90(a) : f55.a, j7, qk1Var2, lk1Var, mk1Var, mj1Var2, str, j8, wuVar, h55Var, tq2Var, j5, m35Var, an4Var2, ko3Var2 != null ? ko3Var2.a : null, z31Var), new ck3(i2, i5, j6, i55Var, ko3Var2 != null ? ko3Var2.b : null, pj2Var2, i4, i6, b65Var), ko3Var2);
    }

    public static m65 f(m65 m65Var, long j, long j2, qk1 qk1Var, long j3, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? p65.c : j2;
        qk1 qk1Var2 = (i2 & 4) != 0 ? null : qk1Var;
        long j6 = (i2 & 128) != 0 ? p65.c : j3;
        long j7 = x70.g;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j8 = (i2 & 131072) != 0 ? p65.c : j4;
        yt4 a = zt4.a(m65Var.a, j, null, Float.NaN, j5, qk1Var2, null, null, null, null, j6, null, null, null, j7, null, null, null, null);
        ck3 a2 = dk3.a(m65Var.b, i3, 0, j8, null, null, null, 0, 0, null);
        return (m65Var.a == a && m65Var.b == a2) ? m65Var : new m65(a, a2);
    }

    public final wy b() {
        return this.a.a.d();
    }

    public final long c() {
        return this.a.a.a();
    }

    public final boolean d(m65 m65Var) {
        if (this != m65Var) {
            return j42.c(this.b, m65Var.b) && this.a.a(m65Var.a);
        }
        return true;
    }

    public final m65 e(m65 m65Var) {
        return (m65Var == null || m65Var.equals(d)) ? this : new m65(this.a.c(m65Var.a), this.b.a(m65Var.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m65)) {
            return false;
        }
        m65 m65Var = (m65) obj;
        return j42.c(this.a, m65Var.a) && j42.c(this.b, m65Var.b) && j42.c(this.c, m65Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ko3 ko3Var = this.c;
        return hashCode + (ko3Var != null ? ko3Var.hashCode() : 0);
    }

    public final String toString() {
        String i = x70.i(c());
        wy b = b();
        yt4 yt4Var = this.a;
        float alpha = yt4Var.a.getAlpha();
        String d2 = p65.d(yt4Var.b);
        qk1 qk1Var = yt4Var.c;
        lk1 lk1Var = yt4Var.d;
        mk1 mk1Var = yt4Var.e;
        mj1 mj1Var = yt4Var.f;
        String str = yt4Var.g;
        String d3 = p65.d(yt4Var.h);
        wu wuVar = yt4Var.i;
        h55 h55Var = yt4Var.j;
        tq2 tq2Var = yt4Var.k;
        String i2 = x70.i(yt4Var.l);
        m35 m35Var = yt4Var.m;
        an4 an4Var = yt4Var.n;
        z31 z31Var = yt4Var.p;
        ck3 ck3Var = this.b;
        String a = k25.a(ck3Var.a);
        String a2 = q35.a(ck3Var.b);
        String d4 = p65.d(ck3Var.c);
        i55 i55Var = ck3Var.d;
        pj2 pj2Var = ck3Var.f;
        String a3 = kj2.a(ck3Var.g);
        String a4 = cw1.a(ck3Var.h);
        b65 b65Var = ck3Var.i;
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append(i);
        sb.append(", brush=");
        sb.append(b);
        sb.append(", alpha=");
        sb.append(alpha);
        sb.append(", fontSize=");
        sb.append(d2);
        sb.append(", fontWeight=");
        sb.append(qk1Var);
        sb.append(", fontStyle=");
        sb.append(lk1Var);
        sb.append(", fontSynthesis=");
        sb.append(mk1Var);
        sb.append(", fontFamily=");
        sb.append(mj1Var);
        sb.append(", fontFeatureSettings=");
        r7.N(sb, str, ", letterSpacing=", d3, ", baselineShift=");
        sb.append(wuVar);
        sb.append(", textGeometricTransform=");
        sb.append(h55Var);
        sb.append(", localeList=");
        sb.append(tq2Var);
        sb.append(", background=");
        sb.append(i2);
        sb.append(", textDecoration=");
        sb.append(m35Var);
        sb.append(", shadow=");
        sb.append(an4Var);
        sb.append(", drawStyle=");
        sb.append(z31Var);
        sb.append(", textAlign=");
        sb.append(a);
        sb.append(", textDirection=");
        r7.N(sb, a2, ", lineHeight=", d4, ", textIndent=");
        sb.append(i55Var);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(pj2Var);
        sb.append(", lineBreak=");
        sb.append(a3);
        sb.append(", hyphens=");
        sb.append(a4);
        sb.append(", textMotion=");
        sb.append(b65Var);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m65(defpackage.yt4 r4, defpackage.ck3 r5) {
        /*
            r3 = this;
            fo3 r0 = r4.o
            vn3 r1 = r5.e
            if (r0 != 0) goto La
            if (r1 != 0) goto La
            r0 = 0
            goto L10
        La:
            ko3 r2 = new ko3
            r2.<init>(r0, r1)
            r0 = r2
        L10:
            r3.<init>(r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m65.<init>(yt4, ck3):void");
    }

    public m65(yt4 yt4Var, ck3 ck3Var, ko3 ko3Var) {
        this.a = yt4Var;
        this.b = ck3Var;
        this.c = ko3Var;
    }
}

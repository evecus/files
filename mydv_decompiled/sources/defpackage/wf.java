package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class wf extends TextPaint {
    public pd a;
    public m35 b;
    public byte c;
    public an4 d;
    public x70 e;
    public wy f;
    public wu0 g;
    public fq4 h;
    public z31 i;

    public final qj3 a() {
        pd pdVar = this.a;
        if (pdVar != null) {
            return pdVar;
        }
        pd pdVar2 = new pd(this);
        this.a = pdVar2;
        return pdVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        ((pd) a()).e(i);
        this.c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if ((r1 == null ? false : defpackage.fq4.a(r1.a, r5)) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(final defpackage.wy r4, final long r5, float r7) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto Ld
            r3.g = r0
            r3.f = r0
            r3.h = r0
            r3.setShader(r0)
            return
        Ld:
            boolean r1 = r4 instanceof defpackage.rt4
            if (r1 == 0) goto L1d
            rt4 r4 = (defpackage.rt4) r4
            long r4 = r4.a
            long r4 = defpackage.hc4.Y(r4, r7)
            r3.d(r4)
            return
        L1d:
            boolean r1 = r4 instanceof defpackage.xm4
            if (r1 == 0) goto L6f
            wy r1 = r3.f
            boolean r1 = defpackage.j42.c(r1, r4)
            if (r1 == 0) goto L37
            fq4 r1 = r3.h
            if (r1 != 0) goto L2f
            r1 = 0
            goto L35
        L2f:
            long r1 = r1.a
            boolean r1 = defpackage.fq4.a(r1, r5)
        L35:
            if (r1 != 0) goto L54
        L37:
            r1 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L54
            r3.f = r4
            fq4 r1 = new fq4
            r1.<init>(r5)
            r3.h = r1
            vf r1 = new vf
            r1.<init>()
            wu0 r4 = defpackage.dt4.b(r1)
            r3.g = r4
        L54:
            qj3 r4 = r3.a()
            wu0 r5 = r3.g
            if (r5 == 0) goto L63
            java.lang.Object r5 = r5.getValue()
            android.graphics.Shader r5 = (android.graphics.Shader) r5
            goto L64
        L63:
            r5 = r0
        L64:
            pd r4 = (defpackage.pd) r4
            r4.i(r5)
            r3.e = r0
            defpackage.a5.U(r3, r7)
            return
        L6f:
            defpackage.s83.v()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wf.c(wy, long, float):void");
    }

    public final void d(long j) {
        x70 x70Var = this.e;
        if ((x70Var == null ? false : zc5.a(x70Var.a, j)) || j == 16) {
            return;
        }
        this.e = new x70(j);
        setColor(qb.i0(j));
        this.g = null;
        this.f = null;
        this.h = null;
        setShader(null);
    }

    public final void e(z31 z31Var) {
        if (z31Var == null || j42.c(this.i, z31Var)) {
            return;
        }
        this.i = z31Var;
        if (z31Var.equals(me1.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(z31Var instanceof rx4)) {
            s83.v();
            return;
        }
        ((pd) a()).m(1);
        rx4 rx4Var = (rx4) z31Var;
        ((pd) a()).l(rx4Var.a);
        qj3 a = a();
        ((pd) a).a.setStrokeMiter(rx4Var.b);
        ((pd) a()).k(rx4Var.d);
        ((pd) a()).j(rx4Var.c);
        ((pd) a()).a.setPathEffect(null);
    }

    public final void f(an4 an4Var) {
        if (an4Var == null || j42.c(this.d, an4Var)) {
            return;
        }
        this.d = an4Var;
        if (an4Var.equals(an4.d)) {
            clearShadowLayer();
            return;
        }
        an4 an4Var2 = this.d;
        float f = an4Var2.c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (an4Var2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), qb.i0(this.d.a));
    }

    public final void g(m35 m35Var) {
        if (m35Var == null || j42.c(this.b, m35Var)) {
            return;
        }
        this.b = m35Var;
        int i = m35Var.a;
        setUnderlineText((i | 1) == i);
        int i2 = this.b.a;
        setStrikeThruText((i2 | 2) == i2);
    }
}

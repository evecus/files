package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextUtils;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class td {
    public final xd a;
    public final int b;
    public final long c;
    public final s55 d;
    public final CharSequence e;
    public final float f;
    public final List g;

    /* JADX WARN: Removed duplicated region for block: B:110:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0342 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01c6 A[EDGE_INSN: B:160:0x01c6->B:75:0x01c6 BREAK  A[LOOP:0: B:69:0x01b6->B:72:0x01c3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public td(defpackage.xd r22, int r23, int r24, long r25) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.td.<init>(xd, int, int, long):void");
    }

    public final s55 a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        vn3 vn3Var;
        float c = c();
        xd xdVar = this.a;
        wf wfVar = xdVar.g;
        int i8 = xdVar.l;
        ja2 ja2Var = xdVar.i;
        m65 m65Var = xdVar.b;
        ud udVar = vd.a;
        ko3 ko3Var = m65Var.c;
        return new s55(charSequence, c, wfVar, i, truncateAt, i8, (ko3Var == null || (vn3Var = ko3Var.b) == null) ? false : vn3Var.a, i3, i5, i6, i7, i4, i2, ja2Var);
    }

    public final long b(m14 m14Var, int i, hn3 hn3Var) {
        int[] M;
        RectF i0 = sp0.i0(m14Var);
        byte b = 0;
        int i2 = (!eg5.n(i, 0) && eg5.n(i, 1)) ? 1 : 0;
        rd rdVar = new rd(hn3Var, b);
        int i3 = Build.VERSION.SDK_INT;
        s55 s55Var = this.d;
        if (i3 >= 34) {
            s55Var.getClass();
            M = z4.f(s55Var, i0, i2, rdVar);
        } else {
            M = hc4.M(s55Var, s55Var.f, s55Var.c(), i0, i2, rdVar);
        }
        return M == null ? d65.b : ui4.c(M[0], M[1]);
    }

    public final float c() {
        return dh0.h(this.c);
    }

    public final void d(o10 o10Var) {
        Canvas b = ba.b(o10Var);
        s55 s55Var = this.d;
        if (s55Var.d) {
            b.save();
            b.clipRect(0.0f, 0.0f, c(), this.f);
        }
        int i = s55Var.h;
        if (b.getClipBounds(s55Var.o)) {
            if (i != 0) {
                b.translate(0.0f, i);
            }
            ThreadLocal threadLocal = w55.a;
            Object obj = threadLocal.get();
            if (obj == null) {
                obj = new m25();
                threadLocal.set(obj);
            }
            m25 m25Var = (m25) obj;
            m25Var.a = b;
            try {
                s55Var.f.draw(m25Var);
                if (i != 0) {
                    b.translate(0.0f, (-1.0f) * i);
                }
            } finally {
                m25Var.a = null;
            }
        }
        if (s55Var.d) {
            b.restore();
        }
    }

    public final void e(o10 o10Var, long j, an4 an4Var, m35 m35Var, z31 z31Var) {
        wf wfVar = this.a.g;
        byte b = wfVar.c;
        wfVar.d(j);
        wfVar.f(an4Var);
        wfVar.g(m35Var);
        wfVar.e(z31Var);
        wfVar.b(3);
        new n1(1, this, td.class, "paint", "paint(Landroidx/compose/ui/graphics/Canvas;)V", 0, (byte) 1).invoke(o10Var);
        wfVar.b(b);
    }

    public final void f(o10 o10Var, wy wyVar, float f, an4 an4Var, m35 m35Var, z31 z31Var) {
        wf wfVar = this.a.g;
        byte b = wfVar.c;
        wfVar.c(wyVar, (Float.floatToRawIntBits(c()) << 32) | (Float.floatToRawIntBits(this.f) & 4294967295L), f);
        wfVar.f(an4Var);
        wfVar.g(m35Var);
        wfVar.e(z31Var);
        wfVar.b(3);
        new sd(this).invoke(o10Var);
        wfVar.b(b);
    }
}

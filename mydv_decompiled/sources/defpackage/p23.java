package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;
import androidx.media3.common.util.Log;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class p23 extends wa3 {
    public final uu2 f;
    public final iz g;
    public rv4 h;

    public p23(oc4 oc4Var, uu2 uu2Var, cc4 cc4Var, iu0 iu0Var) {
        super(oc4Var, cc4Var, iu0Var);
        this.f = uu2Var;
        this.g = qb.g(Log.LOG_LEVEL_OFF, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.p23 r11, defpackage.r24 r12, defpackage.o24 r13, defpackage.oc4 r14, defpackage.r24 r15, long r16, defpackage.gj0 r18) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p23.f(p23, r24, o24, oc4, r24, long, gj0):java.lang.Object");
    }

    public static l23 j(iz izVar) {
        l23 l23Var = null;
        pj4 n = oh4.n(new d(new k23(izVar, (byte) 0), null));
        while (n.hasNext()) {
            l23 l23Var2 = (l23) n.next();
            if (l23Var != null) {
                l23Var2 = l23Var.a(l23Var2);
            }
            l23Var = l23Var2;
        }
        return l23Var;
    }

    public final float d(mc4 mc4Var, float f) {
        oc4 oc4Var = this.a;
        long i = oc4Var.i(oc4Var.e(f));
        oc4 oc4Var2 = mc4Var.a;
        return oc4Var.h(oc4Var.f(oc4Var2.d(oc4Var2.k, i, 1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0169 A[PHI: r12
      0x0169: PHI (r12v6 java.lang.Object) = (r12v4 java.lang.Object), (r12v7 java.lang.Object) binds: [B:38:0x00fe, B:28:0x0167] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x016a A[PHI: r16
      0x016a: PHI (r16v1 wd5) = (r16v0 wd5), (r16v2 wd5) binds: [B:36:0x00d4, B:28:0x0167] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.oc4 r20, defpackage.l23 r21, float r22, float r23, defpackage.gj0 r24) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p23.e(oc4, l23, float, float, gj0):java.lang.Object");
    }

    public final boolean g(kp3 kp3Var) {
        long j;
        iu0 iu0Var = this.c;
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.f.I;
        int i = Build.VERSION.SDK_INT;
        float f = -(i > 26 ? x9.p(viewConfiguration) : iu0Var.P(64.0f));
        float f2 = -(i > 26 ? x9.n(viewConfiguration) : iu0Var.P(64.0f));
        List list = kp3Var.a;
        pd3 pd3Var = new pd3(0L);
        int size = list.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            j = pd3Var.a;
            if (i2 >= size) {
                break;
            }
            pd3Var = new pd3(pd3.f(j, ((rp3) list.get(i2)).j));
            i2++;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f) & 4294967295L);
        oc4 oc4Var = this.a;
        float j2 = oc4Var.j(oc4Var.f(floatToRawIntBits));
        if (j2 != 0.0f) {
            gc4 gc4Var = oc4Var.a;
            z = j2 > 0.0f ? gc4Var.c() : gc4Var.b();
        }
        if (z) {
            return !(this.g.d(new l23(floatToRawIntBits, ((rp3) o70.T0(kp3Var.a)).b, false)) instanceof z40);
        }
        return this.d;
    }

    public final void h(kp3 kp3Var, lp3 lp3Var, long j) {
        if (kp3Var.f == 6) {
            List list = kp3Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((rp3) list.get(i)).l()) {
                    return;
                }
            }
            if (lp3Var == lp3.I && this.d) {
                g(kp3Var);
                wa3.a(kp3Var);
            }
            if (lp3Var == lp3.J && !this.d && g(kp3Var)) {
                wa3.a(kp3Var);
            }
        }
    }

    public final void i(dl0 dl0Var) {
        if (this.h == null) {
            this.h = p70.g0(dl0Var, null, null, new jd(this, null, (byte) 6), 3);
        }
    }
}

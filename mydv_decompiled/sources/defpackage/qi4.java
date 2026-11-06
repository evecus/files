package defpackage;

import android.os.Build;
import android.text.Spanned;
import android.view.View;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class qi4 {
    public static final float b = 24.0f;
    public static hx1 c;
    public final /* synthetic */ byte a = 1;

    public static void a(StringBuilder sb, Object obj, tm1 tm1Var) {
        if (tm1Var != null) {
            sb.append((CharSequence) tm1Var.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static final int b(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static n74 c(int i) {
        int i2 = (i & 1) != 0 ? 8 : 10;
        float f = i2;
        float cos = 1.0f / ((float) Math.cos(sg5.b / f));
        ok0 ok0Var = new ok0(1.0f, 2);
        float[] fArr = new float[i2 * 2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            long c0 = sp0.c0(sg5.d(cos, (sg5.b / f) * 2.0f * i4), rf1.a(0.0f, 0.0f));
            int i5 = i3 + 1;
            fArr[i3] = sp0.V(c0);
            i3 += 2;
            fArr[i5] = sp0.W(c0);
        }
        return rt0.e(fArr, ok0Var, null, 0.0f, 0.0f);
    }

    public static final hk3 d(long j) {
        return new hk3(j);
    }

    public static final m14 e(k13 k13Var, boolean z, boolean z2) {
        if (!k13Var.getNode().isAttached()) {
            return m14.e;
        }
        if (z) {
            return ut0.S(k13Var, 8).h1();
        }
        na3 S = ut0.S(k13Var, 8);
        return mu0.q(S).J(S, z2);
    }

    public static cs f(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new cs(ed.c(view));
        }
        return null;
    }

    public static final boolean g(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static int h(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        s83.t(hf1.u(i, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    public static final void i(fe0 fe0Var, Integer num) {
        sg sgVar = q8.d0;
        if (((go1) fe0Var).S) {
            ((go1) fe0Var).b(num, sgVar);
        }
    }

    public static final void j(fe0 fe0Var) {
        ((go1) fe0Var).b(wd5.a, new yi4((byte) 19));
    }

    public static final void k(fe0 fe0Var, hn1 hn1Var, Object obj) {
        if (((go1) fe0Var).S || !j42.c(((go1) fe0Var).Q(), obj)) {
            go1 go1Var = (go1) fe0Var;
            go1Var.o0(obj);
            go1Var.b(obj, hn1Var);
        }
    }

    public static final Object l(x75 x75Var, hn1 hn1Var) {
        vt0.D(x75Var, new gy0(rt0.w(x75Var.M.getContext()).y(x75Var.N, x75Var, x75Var.L)));
        return oh4.s(x75Var, false, x75Var, hn1Var);
    }

    public static n74 m(int i, ok0 ok0Var) {
        ok0Var.getClass();
        float[] fArr = new float[i * 4];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f = sg5.b / i;
            long d = sg5.d(1.0f, 2.0f * f * i3);
            fArr[i2] = sp0.V(d) + 0.0f;
            fArr[i2 + 1] = sp0.W(d) + 0.0f;
            long d2 = sg5.d(0.8f, f * ((i3 * 2) + 1));
            int i4 = i2 + 3;
            fArr[i2 + 2] = sp0.V(d2) + 0.0f;
            i2 += 4;
            fArr[i4] = sp0.W(d2) + 0.0f;
        }
        return rt0.e(fArr, ok0Var, null, 0.0f, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n(long r6, defpackage.hn1 r8, defpackage.gj0 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.y75
            if (r0 == 0) goto L13
            r0 = r9
            y75 r0 = (defpackage.y75) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            y75 r0 = new y75
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.J
            int r1 = r0.K
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            r24 r6 = r0.I
            defpackage.mu0.V(r9)     // Catch: defpackage.v75 -> L28
            return r9
        L28:
            r7 = move-exception
            goto L56
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r6)
            return r2
        L30:
            defpackage.mu0.V(r9)
            r4 = 0
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L3a
            goto L5c
        L3a:
            r24 r9 = new r24
            r9.<init>()
            r0.I = r9     // Catch: defpackage.v75 -> L54
            r0.K = r3     // Catch: defpackage.v75 -> L54
            x75 r1 = new x75     // Catch: defpackage.v75 -> L54
            r1.<init>(r6, r0)     // Catch: defpackage.v75 -> L54
            r9.I = r1     // Catch: defpackage.v75 -> L54
            java.lang.Object r6 = l(r1, r8)     // Catch: defpackage.v75 -> L54
            el0 r7 = defpackage.el0.I
            if (r6 != r7) goto L53
            return r7
        L53:
            return r6
        L54:
            r7 = move-exception
            r6 = r9
        L56:
            v52 r8 = r7.I
            java.lang.Object r6 = r6.I
            if (r8 != r6) goto L5d
        L5c:
            return r2
        L5d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qi4.n(long, hn1, gj0):java.lang.Object");
    }

    public int hashCode() {
        switch (this.a) {
            case 1:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                String c2 = s24.a(getClass()).c();
                c2.getClass();
                return c2;
            default:
                return super.toString();
        }
    }
}

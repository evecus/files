package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.view.Display;
import android.view.WindowManager;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class n84 implements vz3, nw5, uy2, mn3, ip, sk0 {
    public static final n84 A0;
    public static final n84 B0;
    public static final n84 C0;
    public static final n84 D0;
    public static final n84 E0;
    public static final n84 F0;
    public static final n84 G0;
    public static final n84 H0;
    public static final n84 I0;
    public static final n84 J;
    public static final n84 J0;
    public static final n84 K;
    public static final n84 K0;
    public static final n84 L;
    public static final n84 L0;
    public static final n84 M;
    public static final n84 M0;
    public static final n84 N;
    public static final n84 N0;
    public static final n84 O;
    public static final n84 W;
    public static final n84 X;
    public static final n84 Y;
    public static final n84 Z;
    public static final n84 a0;
    public static final n84 b0;
    public static final n84 c0;
    public static final n84 d0;
    public static final n84 e0;
    public static final n84 f0;
    public static final n84 g0;
    public static final n84 h0;
    public static final n84 i0;
    public static final n84 j0;
    public static final n84 k0;
    public static final n84 l0;
    public static final n84 m0;
    public static final n84 n0;
    public static final n84 o0;
    public static final n84 p0;
    public static final n84 q0;
    public static final n84 r0;
    public static final n84 s0;
    public static final n84 t0;
    public static final n84 u0;
    public static final n84 v0;
    public static final n84 w0;
    public static final n84 x0;
    public static final n84 y0;
    public static final n84 z0;
    public final /* synthetic */ byte I;
    public static final n84 P = new n84(1);
    public static final n84 Q = new n84(2);
    public static final n84 R = new n84(3);
    public static final hn3 S = new hn3(5);
    public static final hn3 T = new hn3(6);
    public static final hn3 U = new hn3(7);
    public static final hn3 V = new hn3(8);
    public static final n84 O0 = new n84(6);
    public static final n84 P0 = new n84(7);
    public static final hn3 Q0 = new hn3(12);
    public static final hn3 R0 = new hn3(13);
    public static final hn3 S0 = new hn3(14);
    public static final hn3 T0 = new hn3(20);
    public static final n84 U0 = new n84(11);
    public static final n84 V0 = new n84(12);

    static {
        byte b = 0;
        J = new n84(b);
        K = new n84(b);
        L = new n84(b);
        M = new n84(b);
        N = new n84(b);
        O = new n84(b);
        byte b2 = 5;
        W = new n84(b2);
        X = new n84(b2);
        Y = new n84(b2);
        Z = new n84(b2);
        a0 = new n84(b2);
        b0 = new n84(b2);
        c0 = new n84(b2);
        d0 = new n84(b2);
        e0 = new n84(b2);
        f0 = new n84(b2);
        g0 = new n84(b2);
        h0 = new n84(b2);
        i0 = new n84(b2);
        j0 = new n84(b2);
        k0 = new n84(b2);
        l0 = new n84(b2);
        m0 = new n84(b2);
        n0 = new n84(b2);
        o0 = new n84(b2);
        p0 = new n84(b2);
        q0 = new n84(b2);
        r0 = new n84(b2);
        s0 = new n84(b2);
        t0 = new n84(b2);
        u0 = new n84(b2);
        v0 = new n84(b2);
        w0 = new n84(b2);
        x0 = new n84(b2);
        y0 = new n84(b2);
        z0 = new n84(b2);
        A0 = new n84(b2);
        B0 = new n84(b2);
        C0 = new n84(b2);
        D0 = new n84(b2);
        E0 = new n84(b2);
        F0 = new n84(b2);
        G0 = new n84(b2);
        H0 = new n84(b2);
        I0 = new n84(b2);
        J0 = new n84(b2);
        K0 = new n84(b2);
        L0 = new n84(b2);
        M0 = new n84(b2);
        N0 = new n84(b2);
    }

    public n84(String str, float f, float f2) {
        this.I = (byte) 23;
        str.getClass();
        if (f <= f2) {
            return;
        }
        s83.t("min must be less than or equal to max");
        throw null;
    }

    @Override // defpackage.ip, defpackage.mp
    public /* synthetic */ float b() {
        switch (this.I) {
        }
        return 0.0f;
    }

    @Override // defpackage.nw5
    public jw5 c(Activity activity, ju0 ju0Var) {
        hx.a.getClass();
        return new jw5(new fx(gx.a().d(activity)), ju0Var.i(activity));
    }

    @Override // defpackage.ip
    public void d(iu0 iu0Var, int i, int[] iArr, da2 da2Var, int[] iArr2) {
        int i2 = 0;
        switch (this.I) {
            case 15:
                int length = iArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i2 < length) {
                    int i5 = iArr[i2];
                    iArr2[i3] = i4;
                    i4 += i5;
                    i2++;
                    i3++;
                }
                break;
            default:
                int i6 = 0;
                for (int i7 : iArr) {
                    i6 += i7;
                }
                int length2 = iArr.length;
                int i8 = i - i6;
                int i9 = 0;
                while (i2 < length2) {
                    int i10 = iArr[i2];
                    iArr2[i9] = i8;
                    i8 += i10;
                    i2++;
                    i9++;
                }
                break;
        }
    }

    @Override // defpackage.vz3
    public float e(float f) {
        double d = f;
        return (float) (d <= 0.04045d ? d / 12.92d : e21.Q((d + 0.055d) / 1.055d, 2.4d));
    }

    @Override // defpackage.nw5
    public jw5 f(Context context, ju0 ju0Var) {
        context.getClass();
        Context context2 = context;
        while (true) {
            if (!(context2 instanceof ContextWrapper)) {
                context2 = context;
                break;
            }
            if ((context2 instanceof Activity) || (context2 instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) context2;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            context2 = contextWrapper.getBaseContext();
            context2.getClass();
        }
        if (context2 instanceof Activity) {
            return c((Activity) context2, ju0Var);
        }
        if (!(context2 instanceof InputMethodService) && !(context2 instanceof Application)) {
            s83.t("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new jw5(new Rect(0, 0, point.x, point.y), ju0Var.i(context));
    }

    @Override // defpackage.mn3
    public tq2 g() {
        return new tq2(p70.j0(new sq2(Locale.getDefault())));
    }

    @Override // defpackage.vz3
    public float h(float f) {
        double d = f;
        return (float) (d <= 0.0031308d ? d * 12.92d : (e21.Q(d, 0.4166666666666667d) * 1.055d) - 0.055d);
    }

    public byte[] i(byte[] bArr, int i, int i2) {
        switch (this.I) {
            case 19:
                return Arrays.copyOfRange(bArr, i, i2 + i);
            case 20:
                return Arrays.copyOfRange(bArr, i, i2 + i);
            case 21:
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, i, bArr2, 0, i2);
                return bArr2;
            default:
                byte[] bArr3 = new byte[i2];
                System.arraycopy(bArr, i, bArr3, 0, i2);
                return bArr3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0081 -> B:13:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0084 -> B:13:0x0064). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(java.util.List r6, defpackage.rp4 r7, defpackage.gj0 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.fp0
            if (r0 == 0) goto L13
            r0 = r8
            fp0 r0 = (defpackage.fp0) r0
            int r1 = r0.M
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.M = r1
            goto L18
        L13:
            fp0 r0 = new fp0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r5 = r0.K
            int r8 = r0.M
            r1 = 0
            r2 = 2
            r3 = 1
            el0 r4 = defpackage.el0.I
            if (r8 == 0) goto L41
            if (r8 == r3) goto L39
            if (r8 != r2) goto L33
            java.util.Iterator r6 = r0.J
            java.io.Serializable r7 = r0.I
            r24 r7 = (defpackage.r24) r7
            defpackage.mu0.V(r5)     // Catch: java.lang.Throwable -> L31
            goto L64
        L31:
            r5 = move-exception
            goto L7d
        L33:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r5)
            return r1
        L39:
            java.io.Serializable r6 = r0.I
            java.util.List r6 = (java.util.List) r6
            defpackage.mu0.V(r5)
            goto L5a
        L41:
            defpackage.mu0.V(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            hp0 r8 = new hp0
            r8.<init>(r6, r5, r1)
            r0.I = r5
            r0.M = r3
            java.lang.Object r6 = r7.a(r8, r0)
            if (r6 != r4) goto L59
            goto L7c
        L59:
            r6 = r5
        L5a:
            r24 r5 = new r24
            r5.<init>()
            java.util.Iterator r6 = r6.iterator()
            r7 = r5
        L64:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto L8a
            java.lang.Object r5 = r6.next()
            tm1 r5 = (defpackage.tm1) r5
            r0.I = r7     // Catch: java.lang.Throwable -> L31
            r0.J = r6     // Catch: java.lang.Throwable -> L31
            r0.M = r2     // Catch: java.lang.Throwable -> L31
            java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L31
            if (r5 != r4) goto L64
        L7c:
            return r4
        L7d:
            java.lang.Object r8 = r7.I
            if (r8 != 0) goto L84
            r7.I = r5
            goto L64
        L84:
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            defpackage.sv2.i(r8, r5)
            goto L64
        L8a:
            java.lang.Object r5 = r7.I
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 != 0) goto L93
            wd5 r5 = defpackage.wd5.a
            return r5
        L93:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n84.j(java.util.List, rp4, gj0):java.lang.Object");
    }

    @Override // defpackage.uy2
    public boolean k(sx2 sx2Var) {
        return false;
    }

    public String toString() {
        switch (this.I) {
            case 11:
                return "REAR FACING";
            case 15:
                return "AbsoluteArrangement#Left";
            case 16:
                return "AbsoluteArrangement#Right";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ n84(byte b) {
        this.I = b;
    }

    @Override // defpackage.uy2
    public void a(sx2 sx2Var, boolean z) {
    }
}

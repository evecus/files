package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ih2 {
    public final kd a;
    public final g12 b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public d55 j;
    public u55 k;
    public td3 l;
    public m14 m;
    public m14 n;
    public final Object c = new Object();
    public final CursorAnchorInfo.Builder o = new CursorAnchorInfo.Builder();
    public final float[] p = nw2.a();
    public final Matrix q = new Matrix();

    public ih2(kd kdVar, g12 g12Var) {
        this.a = kdVar;
        this.b = g12Var;
    }

    public final void a() {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        g12 g12Var = this.b;
        InputMethodManager q = g12Var.q();
        View view = (View) g12Var.J;
        if (!q.isActive(view) || this.j == null || this.l == null || this.k == null || this.m == null || this.n == null) {
            return;
        }
        float[] fArr = this.p;
        nw2.d(fArr);
        ca2 ca2Var = (ca2) this.a.I.L.getValue();
        if (ca2Var != null) {
            if (!ca2Var.h()) {
                ca2Var = null;
            }
            if (ca2Var != null) {
                ca2Var.i(fArr);
            }
        }
        m14 m14Var = this.n;
        m14Var.getClass();
        float f = -m14Var.a;
        m14 m14Var2 = this.n;
        m14Var2.getClass();
        nw2.i(fArr, f, -m14Var2.b);
        Matrix matrix = this.q;
        o7.O(matrix, fArr);
        d55 d55Var = this.j;
        d55Var.getClass();
        long j = d55Var.b;
        td3 td3Var = this.l;
        td3Var.getClass();
        u55 u55Var = this.k;
        u55Var.getClass();
        m14 m14Var3 = this.m;
        m14Var3.getClass();
        m14 m14Var4 = this.n;
        m14Var4.getClass();
        boolean z4 = this.f;
        boolean z5 = this.g;
        boolean z6 = this.h;
        boolean z7 = this.i;
        CursorAnchorInfo.Builder builder = this.o;
        builder.reset();
        builder.setMatrix(matrix);
        d65 d65Var = d55Var.c;
        int f2 = d65.f(j);
        builder.setSelectionRange(f2, d65.e(j));
        s44 s44Var = s44.J;
        if (!z4 || f2 < 0) {
            z = z5;
            z2 = z6;
        } else {
            int k = td3Var.k(f2);
            m14 c = u55Var.c(k);
            z = z5;
            z2 = z6;
            float q2 = ut0.q(c.a, 0.0f, (int) (u55Var.c >> 32));
            boolean n = e21.n(m14Var3, q2, c.b);
            boolean n2 = e21.n(m14Var3, q2, c.d);
            boolean z8 = u55Var.a(k) == s44Var;
            int i2 = (n || n2) ? 1 : 0;
            if (!n || !n2) {
                i2 |= 2;
            }
            if (z8) {
                i2 |= 4;
            }
            float f3 = c.b;
            float f4 = c.d;
            builder.setInsertionMarkerLocation(q2, f3, f4, f4, i2);
        }
        if (z) {
            int f5 = d65Var != null ? d65.f(d65Var.a) : -1;
            int e = d65Var != null ? d65.e(d65Var.a) : -1;
            if (f5 >= 0 && f5 < e) {
                builder.setComposingText(f5, d55Var.a.J.subSequence(f5, e));
                int k2 = td3Var.k(f5);
                int k3 = td3Var.k(e);
                float[] fArr2 = new float[(k3 - k2) * 4];
                z3 = z7;
                u55Var.b.a(ui4.c(k2, k3), fArr2);
                while (f5 < e) {
                    int k4 = td3Var.k(f5);
                    int i3 = (k4 - k2) * 4;
                    float f6 = fArr2[i3];
                    float f7 = fArr2[i3 + 1];
                    int i4 = e;
                    float f8 = fArr2[i3 + 2];
                    float f9 = fArr2[i3 + 3];
                    int i5 = k2;
                    int i6 = (m14Var3.a < f8 ? 1 : 0) & (f6 < m14Var3.c ? 1 : 0) & (m14Var3.b < f9 ? 1 : 0) & (f7 < m14Var3.d ? 1 : 0);
                    if (!e21.n(m14Var3, f6, f7) || !e21.n(m14Var3, f8, f9)) {
                        i6 |= 2;
                    }
                    if (u55Var.a(k4) == s44Var) {
                        i6 |= 4;
                    }
                    int i7 = f5;
                    builder.addCharacterBounds(i7, f6, f7, f8, f9, i6);
                    f5 = i7 + 1;
                    e = i4;
                    k2 = i5;
                }
                i = Build.VERSION.SDK_INT;
                if (i >= 33 && z2) {
                    l5.l(builder, m14Var4);
                }
                if (i >= 34 && z3) {
                    z4.b(builder, u55Var, m14Var3);
                }
                g12Var.q().updateCursorAnchorInfo(view, builder.build());
                this.e = false;
            }
        }
        z3 = z7;
        i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            l5.l(builder, m14Var4);
        }
        if (i >= 34) {
            z4.b(builder, u55Var, m14Var3);
        }
        g12Var.q().updateCursorAnchorInfo(view, builder.build());
        this.e = false;
    }
}

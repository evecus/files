package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class w23 {
    public final zw a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public w23(zw zwVar, long j, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int g;
        int i5;
        this.a = zwVar;
        this.b = i;
        if (dh0.j(j) != 0 || dh0.i(j) != 0) {
            r02.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) zwVar.e;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            zj3 zj3Var = (zj3) arrayList2.get(i6);
            xd xdVar = zj3Var.a;
            int h = dh0.h(j);
            if (dh0.c(j)) {
                i4 = i6;
                g = dh0.g(j) - ((int) Math.ceil(f));
                if (g < 0) {
                    g = 0;
                }
            } else {
                i4 = i6;
                g = dh0.g(j);
            }
            i3 = 0;
            td tdVar = new td(xdVar, this.b - i7, i2, eh0.b(0, h, 0, g, 5));
            float f2 = tdVar.f + f;
            s55 s55Var = tdVar.d;
            int i8 = i7 + s55Var.g;
            arrayList.add(new yj3(tdVar, zj3Var.b, zj3Var.c, i7, i8, f, f2));
            if (!s55Var.d) {
                if (i8 == this.b) {
                    i5 = i4;
                    if (i5 != p70.X((ArrayList) this.a.e)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i8;
                f = f2;
            }
            z = true;
            i7 = i8;
            f = f2;
            break;
        }
        i3 = 0;
        z = false;
        this.e = f;
        this.f = i7;
        this.c = z;
        this.h = arrayList;
        this.d = dh0.h(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i9 = i3; i9 < size2; i9++) {
            yj3 yj3Var = (yj3) arrayList.get(i9);
            List list = yj3Var.a.g;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i10 = i3; i10 < size3; i10++) {
                m14 m14Var = (m14) list.get(i10);
                arrayList4.add(m14Var != null ? yj3Var.a(m14Var) : null);
            }
            u70.I0(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.a.b).size()) {
            int size4 = ((List) this.a.b).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i11 = i3; i11 < size4; i11++) {
                arrayList5.add(null);
            }
            arrayList3 = o70.f1(arrayList3, arrayList5);
        }
        this.g = arrayList3;
    }

    public static void i(w23 w23Var, o10 o10Var, long j, an4 an4Var, m35 m35Var, z31 z31Var) {
        w23Var.getClass();
        o10Var.f();
        ArrayList arrayList = w23Var.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            yj3 yj3Var = (yj3) arrayList.get(i);
            yj3Var.a.e(o10Var, j, an4Var, m35Var, z31Var);
            o10Var.m(0.0f, yj3Var.a.f);
        }
        o10Var.n();
    }

    public static void j(w23 w23Var, o10 o10Var, wy wyVar, float f, an4 an4Var, m35 m35Var, z31 z31Var) {
        w23Var.getClass();
        o10Var.f();
        ArrayList arrayList = w23Var.h;
        if (arrayList.size() <= 1) {
            d4.u(w23Var, o10Var, wyVar, f, an4Var, m35Var, z31Var);
        } else if (wyVar instanceof rt4) {
            d4.u(w23Var, o10Var, wyVar, f, an4Var, m35Var, z31Var);
        } else {
            if (!(wyVar instanceof xm4)) {
                s83.v();
                return;
            }
            int size = arrayList.size();
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i = 0; i < size; i++) {
                td tdVar = ((yj3) arrayList.get(i)).a;
                f3 += tdVar.f;
                f2 = Math.max(f2, tdVar.c());
            }
            Shader c = ((xm4) wyVar).c((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
            Matrix matrix = new Matrix();
            c.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                td tdVar2 = ((yj3) arrayList.get(i2)).a;
                tdVar2.f(o10Var, new xy(c), f, an4Var, m35Var, z31Var);
                o10Var.m(0.0f, tdVar2.f);
                matrix.setTranslate(0.0f, -tdVar2.f);
                c.setLocalMatrix(matrix);
            }
        }
        o10Var.n();
    }

    public final void a(long j, float[] fArr) {
        k(d65.f(j));
        l(d65.e(j));
        p24 p24Var = new p24();
        p24Var.I = 0;
        dq2.I(this.h, j, new bx(j, fArr, p24Var, new o24()));
    }

    public final float b(int i) {
        m(i);
        ArrayList arrayList = this.h;
        yj3 yj3Var = (yj3) arrayList.get(dq2.G(i, arrayList));
        td tdVar = yj3Var.a;
        return tdVar.d.e(i - yj3Var.d) + yj3Var.f;
    }

    public final int c(int i, boolean z) {
        int f;
        m(i);
        ArrayList arrayList = this.h;
        yj3 yj3Var = (yj3) arrayList.get(dq2.G(i, arrayList));
        td tdVar = yj3Var.a;
        int i2 = i - yj3Var.d;
        s55 s55Var = tdVar.d;
        if (z) {
            Layout layout = s55Var.f;
            ThreadLocal threadLocal = w55.a;
            if (layout.getEllipsisCount(i2) <= 0 || s55Var.b != TextUtils.TruncateAt.END) {
                zw c = s55Var.c();
                Layout layout2 = (Layout) c.a;
                f = c.i(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                f = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            f = s55Var.f(i2);
        }
        return f + yj3Var.b;
    }

    public final int d(int i) {
        int length = ((oj) this.a.a).J.length();
        ArrayList arrayList = this.h;
        yj3 yj3Var = (yj3) arrayList.get(i >= length ? p70.X(arrayList) : i < 0 ? 0 : dq2.F(i, arrayList));
        return yj3Var.a.d.g(yj3Var.d(i)) + yj3Var.d;
    }

    public final int e(float f) {
        int lineForVertical;
        ArrayList arrayList = this.h;
        yj3 yj3Var = (yj3) arrayList.get(dq2.H(arrayList, f));
        int i = yj3Var.c - yj3Var.b;
        int i2 = yj3Var.d;
        if (i == 0) {
            return i2;
        }
        td tdVar = yj3Var.a;
        float f2 = f - yj3Var.f;
        s55 s55Var = tdVar.d;
        int i3 = (int) (f2 - 0.0f);
        int i4 = s55Var.g;
        if (i4 <= 0) {
            lineForVertical = 0;
        } else {
            lineForVertical = s55Var.f.getLineForVertical(i3 - s55Var.h);
            int i5 = i4 - 1;
            if (lineForVertical > i5) {
                lineForVertical = i5;
            }
        }
        return lineForVertical + i2;
    }

    public final float f(int i) {
        m(i);
        ArrayList arrayList = this.h;
        yj3 yj3Var = (yj3) arrayList.get(dq2.G(i, arrayList));
        td tdVar = yj3Var.a;
        return tdVar.d.i(i - yj3Var.d) + yj3Var.f;
    }

    public final int g(long j) {
        int offsetForHorizontal;
        int i = (int) (j & 4294967295L);
        float intBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        yj3 yj3Var = (yj3) arrayList.get(dq2.H(arrayList, intBitsToFloat));
        int i2 = yj3Var.c;
        int i3 = yj3Var.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        td tdVar = yj3Var.a;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat(i) - yj3Var.f;
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
        s55 s55Var = tdVar.d;
        int intBitsToFloat4 = (int) (Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits)) - 0.0f);
        Layout layout = s55Var.f;
        int lineForVertical = layout.getLineForVertical(intBitsToFloat4 - s55Var.h);
        if (lineForVertical >= s55Var.g) {
            offsetForHorizontal = layout.getText().length();
        } else {
            offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (s55Var.b(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (floatToRawIntBits >> 32)));
        }
        return offsetForHorizontal + i3;
    }

    public final long h(m14 m14Var, int i, hn3 hn3Var) {
        long j;
        long j2;
        float f = m14Var.b;
        ArrayList arrayList = this.h;
        int H = dq2.H(arrayList, f);
        float f2 = ((yj3) arrayList.get(H)).g;
        float f3 = m14Var.d;
        if (f2 >= f3 || H == p70.X(arrayList)) {
            yj3 yj3Var = (yj3) arrayList.get(H);
            return yj3Var.b(yj3Var.a.b(yj3Var.c(m14Var), i, hn3Var), true);
        }
        int H2 = dq2.H(arrayList, f3);
        long j3 = d65.b;
        while (true) {
            j = d65.b;
            if (!d65.b(j3, j) || H > H2) {
                break;
            }
            yj3 yj3Var2 = (yj3) arrayList.get(H);
            j3 = yj3Var2.b(yj3Var2.a.b(yj3Var2.c(m14Var), i, hn3Var), true);
            H++;
        }
        if (d65.b(j3, j)) {
            return j;
        }
        while (true) {
            j2 = d65.b;
            if (!d65.b(j, j2) || H > H2) {
                break;
            }
            yj3 yj3Var3 = (yj3) arrayList.get(H2);
            j = yj3Var3.b(yj3Var3.a.b(yj3Var3.c(m14Var), i, hn3Var), true);
            H2--;
        }
        return d65.b(j, j2) ? j3 : ui4.c((int) (j3 >> 32), (int) (4294967295L & j));
    }

    public final void k(int i) {
        boolean z = false;
        zw zwVar = this.a;
        if (i >= 0 && i < ((oj) zwVar.a).J.length()) {
            z = true;
        }
        if (z) {
            return;
        }
        r02.a("offset(" + i + ") is out of bounds [0, " + ((oj) zwVar.a).J.length() + ")");
    }

    public final void l(int i) {
        boolean z = false;
        zw zwVar = this.a;
        if (i >= 0 && i <= ((oj) zwVar.a).J.length()) {
            z = true;
        }
        if (z) {
            return;
        }
        r02.a("offset(" + i + ") is out of bounds [0, " + ((oj) zwVar.a).J.length() + "]");
    }

    public final void m(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        r02.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ")");
    }

    public /* synthetic */ w23(zw zwVar, long j, int i, int i2, int i3) {
        this(zwVar, j, i, i2);
    }
}

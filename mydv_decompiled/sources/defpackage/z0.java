package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import okhttp3.internal.url._UrlKt;

/* loaded from: classes2.dex */
public abstract class z0 extends u0 implements Iterable {
    public static final y K = new y(z0.class, (byte) 18);
    public final e0[] I;
    public e0[] J;

    public z0(f0 f0Var) {
        if (f0Var == null) {
            zy.m("'elementVector' cannot be null");
            throw null;
        }
        e0[] d = f0Var.d();
        this.I = d;
        this.J = d.length < 2 ? d : null;
    }

    @Override // defpackage.u0, defpackage.n0
    public final int hashCode() {
        e0[] e0VarArr = this.I;
        int length = e0VarArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i += e0VarArr[length].d().hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new cq(f0.b(this.I));
    }

    @Override // defpackage.u0
    public final boolean m(u0 u0Var) {
        if (u0Var instanceof z0) {
            z0 z0Var = (z0) u0Var;
            int length = this.I.length;
            if (z0Var.I.length == length) {
                qn0 qn0Var = (qn0) t();
                qn0 qn0Var2 = (qn0) z0Var.t();
                for (int i = 0; i < length; i++) {
                    u0 d = qn0Var.I[i].d();
                    u0 d2 = qn0Var2.I[i].d();
                    if (d == d2 || d.m(d2)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.u0
    public final boolean o() {
        return true;
    }

    @Override // defpackage.u0
    public u0 t() {
        if (this.J == null) {
            e0[] e0VarArr = (e0[]) this.I.clone();
            this.J = e0VarArr;
            int length = e0VarArr.length;
            if (length >= 2) {
                y0[] y0VarArr = new y0[length];
                for (int i = 0; i < length; i++) {
                    e0 e0Var = e0VarArr[i];
                    try {
                        u0 d = e0Var.d();
                        d.getClass();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        d.p(byteArrayOutputStream);
                        y0VarArr[i] = new y0(e0Var, byteArrayOutputStream.toByteArray());
                    } catch (IOException unused) {
                        s83.t("cannot encode object added to SET");
                    }
                }
                Arrays.sort(y0VarArr, y0.c);
                for (int i2 = 0; i2 < length; i2++) {
                    e0VarArr[i2] = y0VarArr[i2].a;
                }
            }
        }
        qn0 qn0Var = new qn0(true, this.J);
        qn0Var.M = -1;
        return qn0Var;
    }

    public final String toString() {
        e0[] e0VarArr = this.I;
        int length = e0VarArr.length;
        if (length == 0) {
            return _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            sb.append(e0VarArr[i]);
            i++;
            if (i >= length) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
        }
    }

    @Override // defpackage.u0
    public u0 u() {
        qn0 qn0Var = new qn0(this.I, this.J);
        qn0Var.M = -1;
        return qn0Var;
    }

    public z0() {
        e0[] e0VarArr = f0.d;
        this.I = e0VarArr;
        this.J = e0VarArr;
    }

    public z0(boolean z, e0[] e0VarArr) {
        this.I = e0VarArr;
        if (!z && e0VarArr.length >= 2) {
            e0VarArr = null;
        }
        this.J = e0VarArr;
    }

    public z0(e0[] e0VarArr, e0[] e0VarArr2) {
        this.I = e0VarArr;
        this.J = e0VarArr2;
    }
}

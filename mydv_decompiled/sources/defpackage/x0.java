package defpackage;

import androidx.media3.extractor.ts.TsExtractor;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import okhttp3.internal.url._UrlKt;

/* loaded from: classes2.dex */
public abstract class x0 extends u0 implements Iterable {
    public static final y J = new y(x0.class, (byte) 17);
    public e0[] I;

    public x0(e0 e0Var, e0 e0Var2) {
        if (e0Var == null) {
            zy.m("'element1' cannot be null");
            throw null;
        }
        if (e0Var2 != null) {
            this.I = new e0[]{e0Var, e0Var2};
        } else {
            zy.m("'element2' cannot be null");
            throw null;
        }
    }

    public static x0 x(Object obj) {
        if (obj == null || (obj instanceof x0)) {
            return (x0) obj;
        }
        if (obj instanceof e0) {
            u0 d = ((e0) obj).d();
            if (d instanceof x0) {
                return (x0) d;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (x0) J.g((byte[]) obj);
            } catch (IOException e) {
                throw k21.V("failed to construct sequence from byte[]", e);
            }
        }
        s83.t("unknown object in getInstance: ".concat(obj.getClass().getName()));
        return null;
    }

    public a0 A() {
        return new us(v());
    }

    public fn0 B() {
        return ((x0) u()).B();
    }

    public r0 C() {
        r0[] w = w();
        return new xs(xs.w(w), w);
    }

    public z0 D() {
        return new bt(false, this.I);
    }

    @Override // defpackage.u0, defpackage.n0
    public int hashCode() {
        int length = this.I.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * TsExtractor.TS_STREAM_TYPE_AIT) ^ this.I[length].d().hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new cq(this.I);
    }

    @Override // defpackage.u0
    public final boolean m(u0 u0Var) {
        if (!(u0Var instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) u0Var;
        int size = size();
        if (x0Var.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            u0 d = this.I[i].d();
            u0 d2 = x0Var.I[i].d();
            if (d != d2 && !d.m(d2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.u0
    public final boolean o() {
        return true;
    }

    public int size() {
        return this.I.length;
    }

    @Override // defpackage.u0
    public u0 t() {
        pn0 pn0Var = new pn0(false, this.I);
        pn0Var.L = -1;
        return pn0Var;
    }

    public final String toString() {
        int size = size();
        if (size == 0) {
            return _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            sb.append(this.I[i]);
            i++;
            if (i >= size) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
        }
    }

    @Override // defpackage.u0
    public u0 u() {
        pn0 pn0Var = new pn0(this.I, (byte) 1);
        pn0Var.L = -1;
        return pn0Var;
    }

    public final a0[] v() {
        int size = size();
        a0[] a0VarArr = new a0[size];
        for (int i = 0; i < size; i++) {
            a0VarArr[i] = a0.x(this.I[i]);
        }
        return a0VarArr;
    }

    public final r0[] w() {
        int size = size();
        r0[] r0VarArr = new r0[size];
        for (int i = 0; i < size; i++) {
            r0VarArr[i] = r0.v(this.I[i]);
        }
        return r0VarArr;
    }

    public e0 y(int i) {
        return this.I[i];
    }

    public Enumeration z() {
        return new w0(this);
    }

    public x0(e0 e0Var) {
        if (e0Var != null) {
            this.I = new e0[]{e0Var};
        } else {
            zy.m("'element' cannot be null");
            throw null;
        }
    }

    public x0() {
        this.I = f0.d;
    }

    public x0(f0 f0Var) {
        if (f0Var != null) {
            this.I = f0Var.d();
        } else {
            zy.m("'elementVector' cannot be null");
            throw null;
        }
    }

    public x0(e0[] e0VarArr) {
        this.I = e0VarArr;
    }
}

package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class xr4 extends a4 {
    public static final xr4 J = new xr4(new Object[0]);
    public final Object[] I;

    public xr4(Object[] objArr) {
        this.I = objArr;
    }

    @Override // defpackage.w1
    public final int c() {
        return this.I.length;
    }

    @Override // defpackage.a4
    public final a4 d(int i, Object obj) {
        Object[] objArr = this.I;
        mu0.l(i, objArr.length);
        if (i == objArr.length) {
            return e(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            dq.T0(0, i, 6, objArr, objArr2);
            dq.Q0(i + 1, i, objArr.length, objArr, objArr2);
            objArr2[i] = obj;
            return new xr4(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        dq.Q0(i + 1, i, objArr.length - 1, objArr, copyOf);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new qm3(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // defpackage.a4
    public final a4 e(Object obj) {
        Object[] objArr = this.I;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            copyOf[objArr.length] = obj;
            return new xr4(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new qm3(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // defpackage.a4
    public final a4 f(Collection collection) {
        Object[] objArr = this.I;
        if (collection.size() + objArr.length > 32) {
            rm3 h = h();
            h.addAll(collection);
            return h.e();
        }
        Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new xr4(copyOf);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.I;
        mu0.k(i, objArr.length);
        return objArr[i];
    }

    @Override // defpackage.a4
    public final rm3 h() {
        return new rm3(this, null, this.I, 0);
    }

    @Override // defpackage.y2, java.util.List
    public final int indexOf(Object obj) {
        return dq.f1(this.I, obj);
    }

    @Override // defpackage.a4
    public final a4 j(z3 z3Var) {
        Object[] objArr = this.I;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) z3Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArr2[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? J : new xr4(dq.W0(objArr2, 0, length));
    }

    @Override // defpackage.a4
    public final a4 l(int i) {
        Object[] objArr = this.I;
        mu0.k(i, objArr.length);
        if (objArr.length == 1) {
            return J;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        dq.Q0(i, i + 1, objArr.length, objArr, copyOf);
        return new xr4(copyOf);
    }

    @Override // defpackage.y2, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.I;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.y2, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.I;
        mu0.l(i, objArr.length);
        return new dz(objArr, i, objArr.length);
    }

    @Override // defpackage.a4
    public final a4 m(int i, Object obj) {
        Object[] objArr = this.I;
        mu0.k(i, objArr.length);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = obj;
        return new xr4(copyOf);
    }
}

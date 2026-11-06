package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class l05 extends q13 {
    public final Object a;
    public final Object b;
    public final Object[] c;
    public final PointerInputEventHandler d;

    public l05(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj = (i & 1) != 0 ? null : obj;
        obj2 = (i & 2) != 0 ? null : obj2;
        objArr = (i & 4) != 0 ? null : objArr;
        this.a = obj;
        this.b = obj2;
        this.c = objArr;
        this.d = pointerInputEventHandler;
    }

    @Override // defpackage.q13
    public final k13 create() {
        return new r05(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l05)) {
            return false;
        }
        l05 l05Var = (l05) obj;
        if (!j42.c(this.a, l05Var.a) || !j42.c(this.b, l05Var.b)) {
            return false;
        }
        Object[] objArr = l05Var.c;
        Object[] objArr2 = this.c;
        if (objArr2 != null) {
            if (objArr == null || !Arrays.equals(objArr2, objArr)) {
                return false;
            }
        } else if (objArr != null) {
            return false;
        }
        return this.d == l05Var.d;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        int hashCode2 = (hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.c;
        return this.d.hashCode() + ((hashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.d("pointerInput");
        z12Var.b().b(this.a, "key1");
        z12Var.b().b(this.b, "key2");
        z12Var.b().b(this.c, "keys");
        z12Var.b().b(this.d, "pointerInputEventHandler");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        r05 r05Var = (r05) k13Var;
        Object obj = r05Var.I;
        Object obj2 = this.a;
        boolean z = !j42.c(obj, obj2);
        r05Var.I = obj2;
        Object obj3 = r05Var.J;
        Object obj4 = this.b;
        if (!j42.c(obj3, obj4)) {
            z = true;
        }
        r05Var.J = obj4;
        Object[] objArr = r05Var.K;
        Object[] objArr2 = this.c;
        if (objArr != null && objArr2 == null) {
            z = true;
        }
        if (objArr == null && objArr2 != null) {
            z = true;
        }
        if (objArr != null && objArr2 != null && !Arrays.equals(objArr2, objArr)) {
            z = true;
        }
        r05Var.K = objArr2;
        Class<?> cls = r05Var.L.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.d;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            r05Var.l0();
        }
        r05Var.L = pointerInputEventHandler;
    }
}

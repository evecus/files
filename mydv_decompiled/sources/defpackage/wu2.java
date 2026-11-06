package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class wu2 implements Map.Entry, z72 {
    public final zu2 I;
    public final int J;
    public final int K;

    public wu2(zu2 zu2Var, int i) {
        this.I = zu2Var;
        this.J = i;
        this.K = zu2Var.P;
    }

    public final void a() {
        if (this.I.P != this.K) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return j42.c(entry.getKey(), getKey()) && j42.c(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.I.I[this.J];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.I.J;
        objArr.getClass();
        return objArr[this.J];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        zu2 zu2Var = this.I;
        zu2Var.c();
        Object[] objArr = zu2Var.J;
        if (objArr == null) {
            int length = zu2Var.I.length;
            if (length < 0) {
                s83.t("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            zu2Var.J = objArr;
        }
        int i = this.J;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}

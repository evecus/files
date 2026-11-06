package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class vu2 extends xu2 implements Iterator, w72 {
    public final /* synthetic */ byte M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vu2(zu2 zu2Var, boolean z) {
        super(zu2Var);
        this.M = (byte) 0;
    }

    public void c(StringBuilder sb) {
        int i = this.J;
        zu2 zu2Var = this.I;
        if (i >= zu2Var.N) {
            zy.k();
            return;
        }
        this.J = i + 1;
        this.K = i;
        Object obj = zu2Var.I[i];
        if (obj == zu2Var) {
            sb.append("(this Map)");
        } else {
            sb.append(obj);
        }
        sb.append('=');
        Object[] objArr = zu2Var.J;
        objArr.getClass();
        Object obj2 = objArr[this.K];
        if (obj2 == zu2Var) {
            sb.append("(this Map)");
        } else {
            sb.append(obj2);
        }
        b();
    }

    public int d() {
        int i = this.J;
        zu2 zu2Var = this.I;
        if (i >= zu2Var.N) {
            zy.k();
            return 0;
        }
        this.J = i + 1;
        this.K = i;
        Object obj = zu2Var.I[i];
        int hashCode = obj != null ? obj.hashCode() : 0;
        Object[] objArr = zu2Var.J;
        objArr.getClass();
        Object obj2 = objArr[this.K];
        int hashCode2 = hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
        b();
        return hashCode2;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.M;
        zu2 zu2Var = this.I;
        switch (b) {
            case 0:
                a();
                int i = this.J;
                if (i >= zu2Var.N) {
                    zy.k();
                    break;
                } else {
                    this.J = i + 1;
                    this.K = i;
                    wu2 wu2Var = new wu2(zu2Var, i);
                    b();
                    break;
                }
            default:
                a();
                int i2 = this.J;
                if (i2 >= zu2Var.N) {
                    zy.k();
                    break;
                } else {
                    this.J = i2 + 1;
                    this.K = i2;
                    Object obj = zu2Var.I[i2];
                    b();
                    break;
                }
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vu2(zu2 zu2Var, byte b) {
        super(zu2Var);
        this.M = b;
    }
}

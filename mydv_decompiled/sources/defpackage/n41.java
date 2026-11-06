package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class n41 implements Iterator, w72 {
    public final /* synthetic */ byte I;
    public int J;
    public final Object K;

    public n41(o41 o41Var) {
        this.I = (byte) 0;
        this.K = o41Var.a.iterator();
        this.J = o41Var.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.I;
        Object obj = this.K;
        switch (b) {
            case 0:
                Iterator it = (Iterator) obj;
                while (this.J > 0 && it.hasNext()) {
                    it.next();
                    this.J--;
                }
                break;
            case 1:
                if (this.J > 0) {
                    break;
                }
                break;
            case 2:
                if (this.J < ((byte[]) obj).length) {
                    break;
                }
                break;
            case 3:
                if (this.J < ((int[]) obj).length) {
                    break;
                }
                break;
            case 4:
                if (this.J < ((long[]) obj).length) {
                    break;
                }
                break;
            default:
                if (this.J < ((short[]) obj).length) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.I;
        Object obj = this.K;
        switch (b) {
            case 0:
                Iterator it = (Iterator) obj;
                while (this.J > 0 && it.hasNext()) {
                    it.next();
                    this.J--;
                }
                break;
            case 1:
                xa1 xa1Var = (xa1) obj;
                int i = xa1Var.c;
                int i2 = this.J;
                this.J = i2 - 1;
                break;
            case 2:
                int i3 = this.J;
                byte[] bArr = (byte[]) obj;
                if (i3 >= bArr.length) {
                    s83.l(String.valueOf(i3));
                    break;
                } else {
                    this.J = i3 + 1;
                    break;
                }
            case 3:
                int i4 = this.J;
                int[] iArr = (int[]) obj;
                if (i4 >= iArr.length) {
                    s83.l(String.valueOf(i4));
                    break;
                } else {
                    this.J = i4 + 1;
                    break;
                }
            case 4:
                int i5 = this.J;
                long[] jArr = (long[]) obj;
                if (i5 >= jArr.length) {
                    s83.l(String.valueOf(i5));
                    break;
                } else {
                    this.J = i5 + 1;
                    break;
                }
            default:
                int i6 = this.J;
                short[] sArr = (short[]) obj;
                if (i6 >= sArr.length) {
                    s83.l(String.valueOf(i6));
                    break;
                } else {
                    this.J = i6 + 1;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.I) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public n41(xa1 xa1Var) {
        this.I = (byte) 1;
        this.K = xa1Var;
        this.J = xa1Var.c;
    }

    public /* synthetic */ n41(Object obj, byte b) {
        this.I = b;
        this.K = obj;
    }
}

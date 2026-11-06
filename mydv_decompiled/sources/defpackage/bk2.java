package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bk2 implements Iterator, w72 {
    public final CharSequence I;
    public byte J;
    public int K;
    public int L;
    public int M;

    public bk2(CharSequence charSequence) {
        this.I = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        byte b = this.J;
        if (b != 0) {
            return b == 1;
        }
        if (this.M < 0) {
            this.J = (byte) 2;
            return false;
        }
        CharSequence charSequence = this.I;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i3 = this.K; i3 < length2; i3++) {
            char charAt = charSequence.charAt(i3);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i2 = i3 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i3;
                this.J = (byte) 1;
                this.M = i;
                this.L = length;
                return true;
            }
        }
        i = -1;
        this.J = (byte) 1;
        this.M = i;
        this.L = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            zy.k();
            return null;
        }
        this.J = (byte) 0;
        int i = this.L;
        int i2 = this.K;
        this.K = this.M + i;
        return this.I.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class e00 extends g00 {
    public final byte[] L;

    public e00(byte[] bArr) {
        this.I = 0;
        bArr.getClass();
        this.L = bArr;
    }

    @Override // defpackage.g00
    public byte c(int i) {
        return this.L[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g00) || size() != ((g00) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof e00)) {
            return obj.equals(this);
        }
        e00 e00Var = (e00) obj;
        int i = this.I;
        int i2 = e00Var.I;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > e00Var.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > e00Var.size()) {
            StringBuilder C = hf1.C("Ran off end of other: 0, ", size, ", ");
            C.append(e00Var.size());
            throw new IllegalArgumentException(C.toString());
        }
        byte[] bArr = e00Var.L;
        int h = h() + size;
        int h2 = h();
        int h3 = e00Var.h();
        while (h2 < h) {
            if (this.L[h2] != bArr[h3]) {
                return false;
            }
            h2++;
            h3++;
        }
        return true;
    }

    @Override // defpackage.g00
    public void f(int i, byte[] bArr) {
        System.arraycopy(this.L, 0, bArr, 0, i);
    }

    public int h() {
        return 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c00(this);
    }

    public byte j(int i) {
        return this.L[i];
    }

    @Override // defpackage.g00
    public int size() {
        return this.L.length;
    }
}

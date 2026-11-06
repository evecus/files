package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class eu0 implements c71 {
    public final int a;
    public final int b;

    public eu0(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        r02.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.c71
    public final void a(d71 d71Var) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.a) {
                int i4 = i3 + 1;
                int i5 = d71Var.b;
                if (i5 <= i4) {
                    i3 = i5;
                    break;
                } else {
                    i3 = (Character.isHighSurrogate(d71Var.b((i5 - i4) + (-1))) && Character.isLowSurrogate(d71Var.b(d71Var.b - i4))) ? i3 + 2 : i4;
                    i2++;
                }
            } else {
                break;
            }
        }
        int i6 = 0;
        while (true) {
            if (i >= this.b) {
                break;
            }
            int i7 = i6 + 1;
            int i8 = d71Var.c;
            a1 a1Var = d71Var.a;
            if (i8 + i7 >= a1Var.d()) {
                i6 = a1Var.d() - d71Var.c;
                break;
            } else {
                i6 = (Character.isHighSurrogate(d71Var.b((d71Var.c + i7) + (-1))) && Character.isLowSurrogate(d71Var.b(d71Var.c + i7))) ? i6 + 2 : i7;
                i++;
            }
        }
        int i9 = d71Var.c;
        d71Var.a(i9, i6 + i9);
        int i10 = d71Var.b;
        d71Var.a(i10 - i3, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu0)) {
            return false;
        }
        eu0 eu0Var = (eu0) obj;
        return this.a == eu0Var.a && this.b == eu0Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return hf1.v("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=", this.a, ", lengthAfterCursor=", this.b, ")");
    }
}

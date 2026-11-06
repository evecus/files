package defpackage;

import java.text.CharacterIterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class v50 implements CharacterIterator {
    public final CharSequence I;
    public final int J;
    public int K = 0;

    public v50(CharSequence charSequence, int i) {
        this.I = charSequence;
        this.J = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.K;
        if (i == this.J) {
            return (char) 65535;
        }
        return this.I.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.K = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.J;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.K;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.J;
        if (i == 0) {
            this.K = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.K = i2;
        return this.I.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.K + 1;
        this.K = i;
        int i2 = this.J;
        if (i < i2) {
            return this.I.charAt(i);
        }
        this.K = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.K;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.K = i2;
        return this.I.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.J || i < 0) {
            s83.t("invalid position");
            return (char) 0;
        }
        this.K = i;
        return current();
    }
}

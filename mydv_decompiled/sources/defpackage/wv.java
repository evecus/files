package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class wv {
    public static final byte[] e = new byte[1792];
    public final CharSequence a;
    public final int b;
    public int c;
    public char d;

    static {
        for (int i = 0; i < 1792; i++) {
            e[i] = Character.getDirectionality(i);
        }
    }

    public wv(CharSequence charSequence) {
        this.a = charSequence;
        this.b = charSequence.length();
    }

    public final byte a() {
        int i = this.c - 1;
        CharSequence charSequence = this.a;
        char charAt = charSequence.charAt(i);
        this.d = charAt;
        boolean isLowSurrogate = Character.isLowSurrogate(charAt);
        int i2 = this.c;
        if (isLowSurrogate) {
            int codePointBefore = Character.codePointBefore(charSequence, i2);
            this.c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.c = i2 - 1;
        char c = this.d;
        return c < 1792 ? e[c] : Character.getDirectionality(c);
    }
}

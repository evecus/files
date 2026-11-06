package defpackage;

import java.nio.charset.CharacterCodingException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class r42 extends Exception {
    public final short I;

    public r42(CharacterCodingException characterCodingException) {
        super(characterCodingException);
        this.I = (short) 1007;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r42(int i, String str) {
        super(str);
        this.I = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r42(int i) {
        this.I = i;
    }
}

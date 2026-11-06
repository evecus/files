package defpackage;

/* loaded from: classes2.dex */
public final class n61 extends jq {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n61(byte[] bArr, byte b) {
        super(true);
        switch (b) {
            case 3:
                if (bArr.length != 56) {
                    s83.t("'buf' must have length 56");
                    throw null;
                }
                super(true);
                System.arraycopy(bArr, 0, new byte[56], 0, 56);
                return;
            default:
                if (bArr.length != 32) {
                    s83.t("'buf' must have length 32");
                    throw null;
                }
                System.arraycopy(bArr, 0, new byte[32], 0, 32);
                return;
        }
    }
}

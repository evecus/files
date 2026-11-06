package androidx.media3.decoder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class CryptoException extends Exception {
    public final int errorCode;

    public CryptoException(int i, String str) {
        super(str);
        this.errorCode = i;
    }
}

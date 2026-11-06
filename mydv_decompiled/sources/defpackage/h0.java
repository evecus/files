package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class h0 extends IOException {
    public final /* synthetic */ byte I;
    public final Exception J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(String str, Exception exc, byte b) {
        super(str);
        this.I = b;
        this.J = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        byte b = this.I;
        Exception exc = this.J;
        switch (b) {
            case 0:
                return (RuntimeException) exc;
            case 1:
                return (RuntimeException) exc;
            case 2:
                return (RuntimeException) exc;
            default:
                return exc;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(String str, byte b) {
        super(str);
        this.I = b;
    }
}

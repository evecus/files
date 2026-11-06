package defpackage;

/* loaded from: classes2.dex */
public final class t0 extends IllegalStateException {
    public final /* synthetic */ byte I;
    public Exception J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(String str, Exception exc) {
        super(str);
        this.I = (byte) 0;
        this.J = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        switch (this.I) {
        }
        return this.J;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(String str, byte b) {
        super(str);
        this.I = b;
    }
}

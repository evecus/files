package defpackage;

/* loaded from: classes2.dex */
public final class vp0 extends IllegalStateException {
    public final Exception I;

    public vp0(String str, Exception exc) {
        super(str);
        this.I = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.I;
    }
}

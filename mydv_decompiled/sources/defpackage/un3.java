package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class un3 extends CancellationException {
    public final /* synthetic */ byte I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ un3(String str, byte b) {
        super(str);
        this.I = b;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.I) {
            case 0:
                setStackTrace(p70.z);
                break;
            default:
                setStackTrace(mw2.i);
                break;
        }
        return this;
    }
}

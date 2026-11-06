package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gl2 implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ AtomicBoolean J;

    public /* synthetic */ gl2(AtomicBoolean atomicBoolean, byte b) {
        this.I = b;
        this.J = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        AtomicBoolean atomicBoolean = this.J;
        switch (b) {
            case 0:
                atomicBoolean.set(true);
                break;
            default:
                atomicBoolean.set(true);
                break;
        }
    }
}

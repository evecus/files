package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class ph4 {
    public static final kh4 a = new kh4(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(kh4 kh4Var) {
        kh4Var.getClass();
        if (kh4Var.f != null || kh4Var.g != null) {
            s83.t("Failed requirement.");
            return;
        }
        if (kh4Var.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        kh4 kh4Var2 = a;
        kh4 kh4Var3 = (kh4) atomicReference.getAndSet(kh4Var2);
        if (kh4Var3 == kh4Var2) {
            return;
        }
        int i = kh4Var3 != null ? kh4Var3.c : 0;
        if (i >= 65536) {
            atomicReference.set(kh4Var3);
            return;
        }
        kh4Var.f = kh4Var3;
        kh4Var.b = 0;
        kh4Var.c = i + 8192;
        atomicReference.set(kh4Var);
    }

    public static final kh4 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        kh4 kh4Var = a;
        kh4 kh4Var2 = (kh4) atomicReference.getAndSet(kh4Var);
        if (kh4Var2 == kh4Var) {
            return new kh4();
        }
        if (kh4Var2 == null) {
            atomicReference.set(null);
            return new kh4();
        }
        atomicReference.set(kh4Var2.f);
        kh4Var2.f = null;
        kh4Var2.c = 0;
        return kh4Var2;
    }
}

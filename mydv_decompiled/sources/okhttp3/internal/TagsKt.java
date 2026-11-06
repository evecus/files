package okhttp3.internal;

import defpackage.rm1;
import defpackage.t72;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class TagsKt {
    public static final <T> T computeIfAbsent(AtomicReference<Tags> atomicReference, t72 t72Var, rm1 rm1Var) {
        atomicReference.getClass();
        t72Var.getClass();
        rm1Var.getClass();
        T t = null;
        while (true) {
            Tags tags = atomicReference.get();
            T t2 = (T) tags.get(t72Var);
            if (t2 != null) {
                return t2;
            }
            if (t == null) {
                t = (T) rm1Var.invoke();
            }
            Tags plus = tags.plus(t72Var, t);
            while (!atomicReference.compareAndSet(tags, plus)) {
                if (atomicReference.get() != tags) {
                    break;
                }
            }
            return t;
        }
    }
}

package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lb1 {
    public static final j81 c = new j81((byte) 2);
    public static final LinkedHashMap d = new LinkedHashMap();
    public final ReentrantLock a;
    public final g12 b;

    public lb1(String str, boolean z) {
        ReentrantLock reentrantLock;
        synchronized (c) {
            try {
                LinkedHashMap linkedHashMap = d;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    linkedHashMap.put(str, obj);
                }
                reentrantLock = (ReentrantLock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = reentrantLock;
        this.b = z ? new g12(str) : null;
    }
}

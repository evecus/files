package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class cz4 implements ew1 {
    public volatile boolean I = false;
    public final ConcurrentHashMap J = new ConcurrentHashMap();
    public final LinkedBlockingQueue K = new LinkedBlockingQueue();

    @Override // defpackage.ew1
    public final synchronized gr2 f(String str) {
        bz4 bz4Var;
        bz4Var = (bz4) this.J.get(str);
        if (bz4Var == null) {
            bz4Var = new bz4(str, this.K, this.I);
            this.J.put(str, bz4Var);
        }
        return bz4Var;
    }
}

package defpackage;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class e52 {
    public final WorkDatabase_Impl a;
    public final fb5 b;
    public final LinkedHashMap c;
    public final ReentrantLock d;
    public final u7 e;
    public final d52 f;
    public final Object g;

    public e52(WorkDatabase_Impl workDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.a = workDatabase_Impl;
        fb5 fb5Var = new fb5(workDatabase_Impl, linkedHashMap, linkedHashMap2, strArr, workDatabase_Impl.j, new sd(1, this, e52.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, (byte) 1));
        this.b = fb5Var;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new u7(this);
        this.f = new d52(this);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.g = new Object();
        fb5Var.k = new ce(this, (byte) 22);
    }

    public final Object a(k05 k05Var) {
        Object f;
        WorkDatabase_Impl workDatabase_Impl = this.a;
        return ((!workDatabase_Impl.j() || workDatabase_Impl.m()) && (f = this.b.f(k05Var)) == el0.I) ? f : wd5.a;
    }
}

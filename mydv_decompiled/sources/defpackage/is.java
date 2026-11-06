package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class is {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(is.class, "notCompletedCount$volatile");
    public final kt0[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public is(kt0[] kt0VarArr) {
        this.a = kt0VarArr;
        this.notCompletedCount$volatile = kt0VarArr.length;
    }
}

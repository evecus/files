package coil3.request;

import defpackage.fj0;
import defpackage.j42;
import defpackage.v52;
import defpackage.wd5;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class BaseRequestDelegate implements RequestDelegate {
    private final v52 job;

    private /* synthetic */ BaseRequestDelegate(v52 v52Var) {
        this.job = v52Var;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BaseRequestDelegate m102boximpl(v52 v52Var) {
        return new BaseRequestDelegate(v52Var);
    }

    /* renamed from: dispose-impl, reason: not valid java name */
    public static void m104disposeimpl(v52 v52Var) {
        v52Var.e(null);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m105equalsimpl(v52 v52Var, Object obj) {
        return (obj instanceof BaseRequestDelegate) && j42.c(v52Var, ((BaseRequestDelegate) obj).m109unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m106equalsimpl0(v52 v52Var, v52 v52Var2) {
        return j42.c(v52Var, v52Var2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m107hashCodeimpl(v52 v52Var) {
        return v52Var.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m108toStringimpl(v52 v52Var) {
        return "BaseRequestDelegate(job=" + v52Var + ")";
    }

    @Override // coil3.request.RequestDelegate
    public final Object awaitStarted(fj0 fj0Var) {
        return wd5.a;
    }

    @Override // coil3.request.RequestDelegate
    public void dispose() {
        m104disposeimpl(this.job);
    }

    public boolean equals(Object obj) {
        return m105equalsimpl(this.job, obj);
    }

    public int hashCode() {
        return m107hashCodeimpl(this.job);
    }

    public String toString() {
        return m108toStringimpl(this.job);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ v52 m109unboximpl() {
        return this.job;
    }

    @Override // coil3.request.RequestDelegate
    public final void assertActive() {
    }

    @Override // coil3.request.RequestDelegate
    public final void complete() {
    }

    @Override // coil3.request.RequestDelegate
    public final void start() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static v52 m103constructorimpl(v52 v52Var) {
        return v52Var;
    }
}

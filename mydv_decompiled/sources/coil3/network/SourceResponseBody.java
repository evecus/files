package coil3.network;

import defpackage.fj0;
import defpackage.j42;
import defpackage.ke1;
import defpackage.lz;
import defpackage.mz;
import defpackage.ok3;
import defpackage.q04;
import defpackage.sv2;
import defpackage.wd5;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class SourceResponseBody implements NetworkResponseBody {
    private final mz source;

    private /* synthetic */ SourceResponseBody(mz mzVar) {
        this.source = mzVar;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SourceResponseBody m84boximpl(mz mzVar) {
        return new SourceResponseBody(mzVar);
    }

    /* renamed from: close-impl, reason: not valid java name */
    public static void m85closeimpl(mz mzVar) {
        mzVar.close();
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m87equalsimpl(mz mzVar, Object obj) {
        return (obj instanceof SourceResponseBody) && j42.c(mzVar, ((SourceResponseBody) obj).m93unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m88equalsimpl0(mz mzVar, mz mzVar2) {
        return j42.c(mzVar, mzVar2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m89hashCodeimpl(mz mzVar) {
        return mzVar.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m90toStringimpl(mz mzVar) {
        return "SourceResponseBody(source=" + mzVar + ")";
    }

    /* renamed from: writeTo-impl, reason: not valid java name */
    public static Object m91writeToimpl(mz mzVar, ke1 ke1Var, ok3 ok3Var, fj0 fj0Var) {
        q04 l = sv2.l(ke1Var.sink(ok3Var, false));
        try {
            new Long(mzVar.z(l));
            try {
                l.close();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                l.close();
            } catch (Throwable th3) {
                sv2.i(th, th3);
            }
        }
        if (th == null) {
            return wd5.a;
        }
        throw th;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        m85closeimpl(this.source);
    }

    public boolean equals(Object obj) {
        return m87equalsimpl(this.source, obj);
    }

    public int hashCode() {
        return m89hashCodeimpl(this.source);
    }

    public String toString() {
        return m90toStringimpl(this.source);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ mz m93unboximpl() {
        return this.source;
    }

    @Override // coil3.network.NetworkResponseBody
    public Object writeTo(lz lzVar, fj0 fj0Var) {
        return m92writeToimpl(this.source, lzVar, fj0Var);
    }

    @Override // coil3.network.NetworkResponseBody
    public Object writeTo(ke1 ke1Var, ok3 ok3Var, fj0 fj0Var) {
        return m91writeToimpl(this.source, ke1Var, ok3Var, fj0Var);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static mz m86constructorimpl(mz mzVar) {
        return mzVar;
    }

    /* renamed from: writeTo-impl, reason: not valid java name */
    public static Object m92writeToimpl(mz mzVar, lz lzVar, fj0 fj0Var) {
        mzVar.z(lzVar);
        return wd5.a;
    }
}

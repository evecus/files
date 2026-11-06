package coil3.network;

import defpackage.fj0;
import defpackage.h00;
import defpackage.j42;
import defpackage.lz;
import defpackage.wd5;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class ByteStringNetworkRequestBody implements NetworkRequestBody {
    private final h00 bytes;

    private /* synthetic */ ByteStringNetworkRequestBody(h00 h00Var) {
        this.bytes = h00Var;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ByteStringNetworkRequestBody m76boximpl(h00 h00Var) {
        return new ByteStringNetworkRequestBody(h00Var);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m78equalsimpl(h00 h00Var, Object obj) {
        return (obj instanceof ByteStringNetworkRequestBody) && j42.c(h00Var, ((ByteStringNetworkRequestBody) obj).m83unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m79equalsimpl0(h00 h00Var, h00 h00Var2) {
        return j42.c(h00Var, h00Var2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m80hashCodeimpl(h00 h00Var) {
        return h00Var.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m81toStringimpl(h00 h00Var) {
        return "ByteStringNetworkRequestBody(bytes=" + h00Var + ")";
    }

    /* renamed from: writeTo-impl, reason: not valid java name */
    public static Object m82writeToimpl(h00 h00Var, lz lzVar, fj0 fj0Var) {
        lzVar.S(h00Var);
        return wd5.a;
    }

    public boolean equals(Object obj) {
        return m78equalsimpl(this.bytes, obj);
    }

    public int hashCode() {
        return m80hashCodeimpl(this.bytes);
    }

    public String toString() {
        return m81toStringimpl(this.bytes);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ h00 m83unboximpl() {
        return this.bytes;
    }

    @Override // coil3.network.NetworkRequestBody
    public Object writeTo(lz lzVar, fj0 fj0Var) {
        return m82writeToimpl(this.bytes, lzVar, fj0Var);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static h00 m77constructorimpl(h00 h00Var) {
        return h00Var;
    }
}

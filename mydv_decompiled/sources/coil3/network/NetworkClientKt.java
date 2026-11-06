package coil3.network;

import defpackage.h00;
import defpackage.mz;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class NetworkClientKt {
    public static final NetworkRequestBody NetworkRequestBody(h00 h00Var) {
        return ByteStringNetworkRequestBody.m76boximpl(ByteStringNetworkRequestBody.m77constructorimpl(h00Var));
    }

    public static final NetworkResponseBody NetworkResponseBody(mz mzVar) {
        return SourceResponseBody.m84boximpl(SourceResponseBody.m86constructorimpl(mzVar));
    }
}

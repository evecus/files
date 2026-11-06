package okhttp3.internal.dns;

import defpackage.tm1;
import okhttp3.internal.dns.LookupDnsCall;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements tm1 {
    public final /* synthetic */ byte I;

    public /* synthetic */ a(byte b) {
        this.I = b;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        boolean enqueue$lambda$0;
        LookupDnsCall.State state = (LookupDnsCall.State) obj;
        switch (this.I) {
            case 0:
                enqueue$lambda$0 = LookupDnsCall.enqueue$lambda$0(state);
                break;
            case 1:
                enqueue$lambda$0 = LookupDnsCall.runOnce$lambda$0(state);
                break;
            case 2:
                enqueue$lambda$0 = LookupDnsCall.runOnce$lambda$2(state);
                break;
            default:
                enqueue$lambda$0 = LookupDnsCall.cancel$lambda$0(state);
                break;
        }
        return Boolean.valueOf(enqueue$lambda$0);
    }
}

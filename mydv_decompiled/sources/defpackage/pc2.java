package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class pc2 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Context J;
    public final /* synthetic */ String K;

    public /* synthetic */ pc2(Context context, String str, byte b) {
        this.I = b;
        this.J = context;
        this.K = str;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        String str = this.K;
        Context context = this.J;
        switch (b) {
            case 0:
                return d4.t(context, str);
            case 1:
                try {
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(268435456));
                } catch (Throwable unused) {
                }
                return wd5.a;
            default:
                return dq2.v0(context, str);
        }
    }
}

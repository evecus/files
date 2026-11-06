package coil3.network.okhttp.internal;

import defpackage.fj0;
import defpackage.i10;
import defpackage.in1;
import defpackage.k10;
import defpackage.mu0;
import defpackage.tk0;
import defpackage.tm1;
import defpackage.wd5;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class CallsKt {
    public static final Object await(final Call call, fj0 fj0Var) {
        final k10 k10Var = new k10(1, mu0.G(fj0Var));
        k10Var.t();
        k10Var.v(new tm1() { // from class: coil3.network.okhttp.internal.CallsKt$await$2$1
            @Override // defpackage.tm1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return wd5.a;
            }

            public final void invoke(Throwable th) {
                Call.this.cancel();
            }
        });
        call.enqueue(new Callback() { // from class: coil3.network.okhttp.internal.CallsKt$await$2$2
            @Override // okhttp3.Callback
            public void onFailure(Call call2, IOException iOException) {
                i10.this.resumeWith(mu0.o(iOException));
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call2, Response response) {
                i10.this.i(response, new in1() { // from class: coil3.network.okhttp.internal.CallsKt$await$2$2$onResponse$1
                    @Override // defpackage.in1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((Throwable) obj, (Response) obj2, (tk0) obj3);
                        return wd5.a;
                    }

                    public final void invoke(Throwable th, Response response2, tk0 tk0Var) {
                        UtilsKt.closeQuietly(response2);
                    }
                });
            }
        });
        return k10Var.r();
    }
}

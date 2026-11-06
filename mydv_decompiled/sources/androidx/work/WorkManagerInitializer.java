package androidx.work;

import android.content.Context;
import defpackage.fr2;
import defpackage.j02;
import defpackage.n84;
import defpackage.uf0;
import defpackage.ux5;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class WorkManagerInitializer implements j02 {
    public static final String a = fr2.h("WrkMgrInitializer");

    @Override // defpackage.j02
    public final Object create(Context context) {
        fr2.e().a(a, "Initializing WorkManager with default configuration.");
        uf0 uf0Var = new uf0(new n84((byte) 24));
        context.getClass();
        ux5.f(context, uf0Var);
        ux5 e = ux5.e(context);
        e.getClass();
        return e;
    }

    @Override // defpackage.j02
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}

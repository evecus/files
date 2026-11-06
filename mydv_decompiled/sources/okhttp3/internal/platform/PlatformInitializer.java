package okhttp3.internal.platform;

import android.content.Context;
import defpackage.j02;
import defpackage.o91;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class PlatformInitializer implements j02 {
    @Override // defpackage.j02
    public Platform create(Context context) {
        context.getClass();
        PlatformRegistry.INSTANCE.setApplicationContext(context);
        return Platform.Companion.get();
    }

    @Override // defpackage.j02
    public List<Class<j02>> dependencies() {
        return o91.I;
    }
}

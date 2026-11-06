package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.u23;
import defpackage.v23;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int I;
    public final LinkedHashMap J = new LinkedHashMap();
    public final v23 K = new v23(this);
    public final u23 L = new u23(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.L;
    }
}

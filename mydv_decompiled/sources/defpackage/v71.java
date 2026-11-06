package defpackage;

import androidx.media3.common.util.Log;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class v71 implements k71 {
    public int a;
    public final ArrayList b;

    public v71(int i) {
        this.a = (i & 1) != 0 ? Log.LOG_LEVEL_OFF : 50;
        this.b = new ArrayList();
    }

    public final String d() {
        return kx4.o(o70.Z0(this.b, ",\n", null, null, 0, null, 62), "  ");
    }
}

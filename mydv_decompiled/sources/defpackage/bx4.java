package defpackage;

import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class bx4 {
    public static final Set a = dq.p1(new SerialDescriptor[]{yc5.b, dd5.b, tc5.b, jd5.b});

    public static final boolean a(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return serialDescriptor.isInline() && a.contains(serialDescriptor);
    }
}

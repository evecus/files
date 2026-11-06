package kotlinx.serialization.descriptors;

import defpackage.qi4;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface SerialDescriptor {
    String a();

    boolean c();

    int d(String str);

    qi4 e();

    int f();

    String g(int i);

    List getAnnotations();

    List h(int i);

    SerialDescriptor i(int i);

    boolean isInline();

    boolean j(int i);
}

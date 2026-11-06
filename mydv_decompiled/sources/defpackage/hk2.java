package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hk2 extends x1 {
    public final KSerializer a;
    public final KSerializer b;
    public final gk2 c;

    public hk2(KSerializer kSerializer, KSerializer kSerializer2) {
        kSerializer.getClass();
        kSerializer2.getClass();
        this.a = kSerializer;
        this.b = kSerializer2;
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        SerialDescriptor descriptor2 = kSerializer2.getDescriptor();
        descriptor.getClass();
        descriptor2.getClass();
        this.c = new gk2("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
    }

    @Override // defpackage.x1
    public final Object a() {
        return new LinkedHashMap();
    }

    @Override // defpackage.x1
    public final int b(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        linkedHashMap.getClass();
        return linkedHashMap.size() * 2;
    }

    @Override // defpackage.x1
    public final Iterator c(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.entrySet().iterator();
    }

    @Override // defpackage.x1
    public final int d(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.size();
    }

    @Override // defpackage.x1
    public final void f(le0 le0Var, int i, Object obj) {
        Map map = (Map) obj;
        map.getClass();
        Object A = le0Var.A(getDescriptor(), i, this.a, null);
        int v = le0Var.v(getDescriptor());
        if (v != i + 1) {
            s83.h(r7.x(i, v, "Value must follow key in a map, index for key: ", ", returned index for value: "));
            return;
        }
        boolean containsKey = map.containsKey(A);
        KSerializer kSerializer = this.b;
        map.put(A, (!containsKey || (kSerializer.getDescriptor().e() instanceof it3)) ? le0Var.A(getDescriptor(), v, kSerializer, null) : le0Var.A(getDescriptor(), v, kSerializer, sv2.E(A, map)));
    }

    @Override // defpackage.x1
    public final Object g(Object obj) {
        throw null;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.c;
    }

    @Override // defpackage.x1
    public final Object h(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        linkedHashMap.getClass();
        return linkedHashMap;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d(obj);
        SerialDescriptor descriptor = getDescriptor();
        me0 s = ((ax4) encoder).s(descriptor);
        Iterator c = c(obj);
        int i = 0;
        while (c.hasNext()) {
            Map.Entry entry = (Map.Entry) c.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            ax4 ax4Var = (ax4) s;
            ax4Var.C(getDescriptor(), i, this.a, key);
            i += 2;
            ax4Var.C(getDescriptor(), i2, this.b, value);
        }
        s.a(descriptor);
    }
}

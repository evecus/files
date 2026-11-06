package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class x1 implements KSerializer {
    public Object a() {
        return new ArrayList();
    }

    public int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    public Iterator c(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.iterator();
    }

    public int d(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.size();
    }

    @Override // kotlinx.serialization.KSerializer
    public Object deserialize(Decoder decoder) {
        return e(decoder);
    }

    public final Object e(Decoder decoder) {
        Object a = a();
        int b = b(a);
        le0 c = decoder.c(getDescriptor());
        while (true) {
            int v = c.v(getDescriptor());
            if (v == -1) {
                c.a(getDescriptor());
                return h(a);
            }
            f(c, v + b, a);
        }
    }

    public abstract void f(le0 le0Var, int i, Object obj);

    public Object g(Object obj) {
        throw null;
    }

    public Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList;
    }
}

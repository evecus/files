package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class j72 extends u2 {
    public final c f;
    public final SerialDescriptor g;
    public int h;
    public boolean i;

    public j72(i62 i62Var, c cVar, String str, int i) {
        super(i62Var, (i & 4) != 0 ? null : str);
        this.f = cVar;
        this.g = null;
    }

    @Override // defpackage.u2
    public b F(String str) {
        str.getClass();
        return (b) sv2.E(str, T());
    }

    @Override // defpackage.u2
    public String R(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        i62 i62Var = this.c;
        qb.V(i62Var, serialDescriptor);
        String g = serialDescriptor.g(i);
        if (this.e.h && !T().I.keySet().contains(g)) {
            ep epVar = i62Var.c;
            jp jpVar = qb.j;
            k9 k9Var = new k9(serialDescriptor, i62Var, (byte) 7);
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) epVar.J;
            Map map = (Map) concurrentHashMap.get(serialDescriptor);
            Object obj = null;
            Object obj2 = map != null ? map.get(jpVar) : null;
            if (obj2 == null) {
                obj2 = null;
            }
            if (obj2 == null) {
                obj2 = k9Var.invoke();
                Object obj3 = concurrentHashMap.get(serialDescriptor);
                if (obj3 == null) {
                    obj3 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(serialDescriptor, obj3);
                }
                ((Map) obj3).put(jpVar, obj2);
            }
            Map map2 = (Map) obj2;
            Iterator it = T().I.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Integer num = (Integer) map2.get((String) next);
                if (num != null && num.intValue() == i) {
                    obj = next;
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return g;
    }

    @Override // defpackage.u2
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public c T() {
        return this.f;
    }

    public final boolean Z(SerialDescriptor serialDescriptor, int i) {
        boolean z = (this.c.a.d || serialDescriptor.j(i) || !serialDescriptor.i(i).c()) ? false : true;
        this.i = z;
        return z;
    }

    @Override // defpackage.u2, defpackage.le0
    public void a(SerialDescriptor serialDescriptor) {
        Set u;
        serialDescriptor.getClass();
        i62 i62Var = this.c;
        if (qb.Q(i62Var, serialDescriptor) || (serialDescriptor.e() instanceof eq3)) {
            return;
        }
        qb.V(i62Var, serialDescriptor);
        if (this.e.h) {
            Set v = qb.v(serialDescriptor);
            ep epVar = i62Var.c;
            jp jpVar = qb.j;
            Map map = (Map) ((ConcurrentHashMap) epVar.J).get(serialDescriptor);
            Object obj = map != null ? map.get(jpVar) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set keySet = map2 != null ? map2.keySet() : null;
            if (keySet == null) {
                keySet = t91.I;
            }
            u = zk4.u(v, keySet);
        } else {
            u = qb.v(serialDescriptor);
        }
        for (String str : T().I.keySet()) {
            if (!u.contains(str) && !j42.c(str, this.d)) {
                throw new q62(mu0.s(-1, hf1.t('\'', "Encountered an unknown key '", str), V(), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.", i62Var.a.j ? mu0.N(T().toString(), -1).toString() : null));
            }
        }
    }

    @Override // defpackage.u2, kotlinx.serialization.encoding.Decoder
    public final le0 c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        SerialDescriptor serialDescriptor2 = this.g;
        if (serialDescriptor != serialDescriptor2) {
            return super.c(serialDescriptor);
        }
        b G = G();
        String a = serialDescriptor2.a();
        boolean z = G instanceof c;
        i62 i62Var = this.c;
        if (z) {
            return new j72(i62Var, (c) G, this.d, serialDescriptor2);
        }
        throw new q62(mu0.s(-1, "Expected " + s24.a(c.class).c() + ", but had " + s24.a(G.getClass()).c() + " as the serialized body of " + a, V(), null, i62Var.a.j ? mu0.N(G.toString(), -1).toString() : null));
    }

    @Override // defpackage.u2, kotlinx.serialization.encoding.Decoder
    public final boolean u() {
        return !this.i && super.u();
    }

    @Override // defpackage.le0
    public int v(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        while (this.h < serialDescriptor.f()) {
            int i = this.h;
            this.h = i + 1;
            String S = S(serialDescriptor, i);
            int i2 = this.h - 1;
            this.i = false;
            if (T().containsKey(S) || Z(serialDescriptor, i2)) {
                if (this.e.f) {
                    boolean j = serialDescriptor.j(i2);
                    SerialDescriptor i3 = serialDescriptor.i(i2);
                    if (!j || i3.c() || !(((b) T().get(S)) instanceof JsonNull)) {
                        if (j42.c(i3.e(), xj4.d) && (!i3.c() || !(((b) T().get(S)) instanceof JsonNull))) {
                            b bVar = (b) T().get(S);
                            String str = null;
                            d dVar = bVar instanceof d ? (d) bVar : null;
                            if (dVar != null) {
                                m02 m02Var = r62.a;
                                if (!(dVar instanceof JsonNull)) {
                                    str = dVar.c();
                                }
                            }
                            if (str != null) {
                                i62 i62Var = this.c;
                                int J = qb.J(i3, i62Var, str);
                                boolean z = !i62Var.a.d && i3.c();
                                if (J == -3 && ((j || z) && !Z(serialDescriptor, i2))) {
                                }
                            }
                        }
                    }
                }
                return i2;
            }
        }
        return -1;
    }

    public j72(i62 i62Var, c cVar, String str, SerialDescriptor serialDescriptor) {
        super(i62Var, str);
        this.f = cVar;
        this.g = serialDescriptor;
    }
}

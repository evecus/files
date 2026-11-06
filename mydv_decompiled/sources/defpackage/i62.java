package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class i62 {
    public static final h62 d = new h62(new n62(false, false, false, true, "    ", false, "type", true, j60.K, true), qb.o);
    public final n62 a;
    public final o63 b;
    public final ep c = new ep((byte) 5);

    public i62(n62 n62Var, o63 o63Var) {
        this.a = n62Var;
        this.b = o63Var;
    }

    public final Object a(KSerializer kSerializer, b bVar) {
        Decoder h72Var;
        kSerializer.getClass();
        if (bVar instanceof c) {
            h72Var = new j72(this, (c) bVar, (String) null, 12);
        } else if (bVar instanceof a) {
            h72Var = new k72(this, (a) bVar);
        } else {
            if (!(bVar instanceof a72) && !bVar.equals(JsonNull.INSTANCE)) {
                s83.v();
                return null;
            }
            h72Var = new h72(this, (d) bVar);
        }
        return h72Var.s(kSerializer);
    }

    public final Object b(String str, KSerializer kSerializer) {
        kSerializer.getClass();
        str.getClass();
        c8 b = oh4.b(this, str);
        Object s = new zw4(this, pz5.K, b, kSerializer.getDescriptor()).s(kSerializer);
        if (b.g() == 10) {
            return s;
        }
        c8.s(b, "Expected EOF after parsing, but had " + ((String) b.g).charAt(b.b - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final String c(KSerializer kSerializer, Object obj) {
        kSerializer.getClass();
        yw0 yw0Var = new yw0((byte) 2);
        try {
            c21.q(this, yw0Var, kSerializer, obj);
            return yw0Var.toString();
        } finally {
            yw0Var.n();
        }
    }
}

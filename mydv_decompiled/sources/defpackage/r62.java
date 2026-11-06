package defpackage;

import kotlinx.serialization.json.b;
import kotlinx.serialization.json.d;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class r62 {
    public static final m02 a = mu0.c("kotlinx.serialization.json.JsonUnquotedLiteral", fx4.a);

    public static final d a(b bVar) {
        bVar.getClass();
        d dVar = bVar instanceof d ? (d) bVar : null;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Element " + s24.a(bVar.getClass()) + " is not a JsonPrimitive");
    }

    public static final long b(d dVar) {
        c8 b = oh4.b(i62.d, dVar.c());
        String str = (String) b.g;
        long j = b.j();
        if (b.g() == 10) {
            return j;
        }
        int i = b.b;
        int i2 = i > 0 ? i - 1 : i;
        c8.s(b, r7.C("Expected input to contain a single valid number, but got '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' after it"), i2, null, 4);
        throw null;
    }
}

package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.b;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class b72 implements KSerializer {
    public static final b72 a = new b72();
    public static final lt3 b = li4.a("kotlinx.serialization.json.JsonLiteral", it3.l);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        o62 p = e41.p(decoder);
        b k = p.k();
        if (k instanceof a72) {
            return (a72) k;
        }
        throw new q62(mu0.s(-1, "Unexpected JSON element, expected JsonLiteral, had " + s24.a(k.getClass()), null, null, p.w().a.j ? mu0.N(k.toString(), -1).toString() : null));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void serialize(kotlinx.serialization.encoding.Encoder r3, java.lang.Object r4) {
        /*
            r2 = this;
            a72 r4 = (defpackage.a72) r4
            r4.getClass()
            java.lang.String r2 = r4.J
            defpackage.e41.q(r3)
            boolean r4 = r4.I
            if (r4 == 0) goto L12
            r3.r(r2)
            return
        L12:
            java.lang.Long r4 = defpackage.qx4.B(r2)
            if (r4 == 0) goto L20
            long r0 = r4.longValue()
            r3.p(r0)
            return
        L20:
            zc5 r4 = defpackage.fb4.b0(r2)
            if (r4 == 0) goto L32
            long r0 = r4.I
            m02 r2 = defpackage.dd5.b
            kotlinx.serialization.encoding.Encoder r2 = r3.n(r2)
            r2.p(r0)
            return
        L32:
            r4 = 0
            boolean r0 = defpackage.px4.r(r2)     // Catch: java.lang.NumberFormatException -> L42
            if (r0 == 0) goto L42
            double r0 = java.lang.Double.parseDouble(r2)     // Catch: java.lang.NumberFormatException -> L42
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L42
            goto L43
        L42:
            r0 = r4
        L43:
            if (r0 == 0) goto L4d
            double r0 = r0.doubleValue()
            r3.e(r0)
            goto L6f
        L4d:
            java.lang.String r0 = "true"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L58
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            goto L62
        L58:
            java.lang.String r0 = "false"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L62
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
        L62:
            if (r4 == 0) goto L6c
            boolean r2 = r4.booleanValue()
            r3.h(r2)
            goto L6f
        L6c:
            r3.r(r2)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b72.serialize(kotlinx.serialization.encoding.Encoder, java.lang.Object):void");
    }
}

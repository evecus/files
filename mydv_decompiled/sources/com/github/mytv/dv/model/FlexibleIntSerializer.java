package com.github.mytv.dv.model;

import defpackage.it3;
import defpackage.li4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class FlexibleIntSerializer implements KSerializer {
    public static final int $stable = 0;
    public static final FlexibleIntSerializer INSTANCE = new FlexibleIntSerializer();
    private static final SerialDescriptor descriptor = li4.a("FlexibleInt", it3.i);

    private FlexibleIntSerializer() {
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0064 A[Catch: Exception -> 0x0073, TRY_ENTER, TryCatch #3 {Exception -> 0x0073, blocks: (B:14:0x0019, B:16:0x0021, B:18:0x002d, B:22:0x003f, B:24:0x0048, B:27:0x004d, B:30:0x0058, B:32:0x0064, B:34:0x006f), top: B:13:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f A[Catch: Exception -> 0x0073, TRY_LEAVE, TryCatch #3 {Exception -> 0x0073, blocks: (B:14:0x0019, B:16:0x0021, B:18:0x002d, B:22:0x003f, B:24:0x0048, B:27:0x004d, B:30:0x0058, B:32:0x0064, B:34:0x006f), top: B:13:0x0019 }] */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Integer deserialize(kotlinx.serialization.encoding.Decoder r7) {
        /*
            r6 = this;
            r7.getClass()
            boolean r6 = r7 instanceof defpackage.o62
            r0 = 0
            if (r6 == 0) goto Lc
            r6 = r7
            o62 r6 = (defpackage.o62) r6
            goto Ld
        Lc:
            r6 = r0
        Ld:
            r1 = 0
            if (r6 != 0) goto L19
            int r1 = r7.m()     // Catch: java.lang.Exception -> L14
        L14:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            return r6
        L19:
            kotlinx.serialization.json.b r6 = r6.k()     // Catch: java.lang.Exception -> L73
            kotlinx.serialization.json.d r6 = defpackage.r62.a(r6)     // Catch: java.lang.Exception -> L73
            long r2 = defpackage.r62.b(r6)     // Catch: defpackage.q62 -> L2a java.lang.Exception -> L73
            java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch: defpackage.q62 -> L2a java.lang.Exception -> L73
            goto L2b
        L2a:
            r7 = r0
        L2b:
            if (r7 == 0) goto L45
            long r2 = r7.longValue()     // Catch: java.lang.Exception -> L73
            r4 = -2147483648(0xffffffff80000000, double:NaN)
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 > 0) goto L45
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L45
            int r7 = (int) r2     // Catch: java.lang.Exception -> L73
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L73
            goto L46
        L45:
            r7 = r0
        L46:
            if (r7 == 0) goto L4d
        L48:
            int r1 = r7.intValue()     // Catch: java.lang.Exception -> L73
            goto L73
        L4d:
            java.lang.String r7 = r6.c()     // Catch: java.lang.Exception -> L73
            java.lang.Integer r7 = defpackage.qx4.A(r7)     // Catch: java.lang.Exception -> L73
            if (r7 == 0) goto L58
            goto L48
        L58:
            long r6 = defpackage.r62.b(r6)     // Catch: defpackage.q62 -> L61 java.lang.Exception -> L73
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: defpackage.q62 -> L61 java.lang.Exception -> L73
            goto L62
        L61:
            r6 = r0
        L62:
            if (r6 == 0) goto L6d
            long r6 = r6.longValue()     // Catch: java.lang.Exception -> L73
            int r6 = (int) r6     // Catch: java.lang.Exception -> L73
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L73
        L6d:
            if (r0 == 0) goto L73
            int r1 = r0.intValue()     // Catch: java.lang.Exception -> L73
        L73:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.model.FlexibleIntSerializer.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Integer");
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        serialize(encoder, ((Number) obj).intValue());
    }

    public void serialize(Encoder encoder, int i) {
        encoder.getClass();
        encoder.m(i);
    }
}

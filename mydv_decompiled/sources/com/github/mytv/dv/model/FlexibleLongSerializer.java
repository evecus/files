package com.github.mytv.dv.model;

import defpackage.it3;
import defpackage.li4;
import defpackage.o62;
import defpackage.q62;
import defpackage.qx4;
import defpackage.r62;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.d;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class FlexibleLongSerializer implements KSerializer {
    public static final int $stable = 0;
    public static final FlexibleLongSerializer INSTANCE = new FlexibleLongSerializer();
    private static final SerialDescriptor descriptor = li4.a("FlexibleLong", it3.j);

    private FlexibleLongSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer
    public Long deserialize(Decoder decoder) {
        decoder.getClass();
        Long l = null;
        o62 o62Var = decoder instanceof o62 ? (o62) decoder : null;
        long j = 0;
        if (o62Var == null) {
            try {
                j = decoder.q();
            } catch (Exception unused) {
            }
            return Long.valueOf(j);
        }
        try {
            d a = r62.a(o62Var.k());
            try {
                l = Long.valueOf(r62.b(a));
            } catch (q62 unused2) {
            }
            if (l != null) {
                j = l.longValue();
            } else {
                Long B = qx4.B(a.c());
                if (B != null) {
                    j = B.longValue();
                }
            }
        } catch (Exception unused3) {
        }
        return Long.valueOf(j);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        serialize(encoder, ((Number) obj).longValue());
    }

    public void serialize(Encoder encoder, long j) {
        encoder.getClass();
        encoder.p(j);
    }
}

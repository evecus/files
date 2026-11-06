package com.github.mytv.dv.model;

import defpackage.it3;
import defpackage.j42;
import defpackage.li4;
import defpackage.o62;
import defpackage.r62;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.d;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class FlexibleBooleanSerializer implements KSerializer {
    public static final int $stable = 0;
    public static final FlexibleBooleanSerializer INSTANCE = new FlexibleBooleanSerializer();
    private static final SerialDescriptor descriptor = li4.a("FlexibleBoolean", it3.d);

    private FlexibleBooleanSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer
    public Boolean deserialize(Decoder decoder) {
        decoder.getClass();
        o62 o62Var = decoder instanceof o62 ? (o62) decoder : null;
        boolean z = false;
        if (o62Var == null) {
            try {
                z = decoder.e();
            } catch (Exception unused) {
            }
            return Boolean.valueOf(z);
        }
        try {
            d a = r62.a(o62Var.k());
            if (!a.d() ? j42.c(a.c(), "true") || j42.c(a.c(), "1") : j42.c(a.c(), "true") || j42.c(a.c(), "1")) {
                z = true;
            }
        } catch (Exception unused2) {
        }
        return Boolean.valueOf(z);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        serialize(encoder, ((Boolean) obj).booleanValue());
    }

    public void serialize(Encoder encoder, boolean z) {
        encoder.getClass();
        encoder.h(z);
    }
}

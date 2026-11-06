package com.github.mytv.dv.model;

import defpackage.cp1;
import defpackage.fx4;
import defpackage.ip3;
import defpackage.le0;
import defpackage.me0;
import defpackage.o7;
import defpackage.su0;
import defpackage.x22;
import defpackage.y9;
import defpackage.yj4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@su0
/* loaded from: classes2.dex */
public final /* synthetic */ class CollectItem$$serializer implements cp1 {
    public static final int $stable = 0;
    public static final CollectItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CollectItem$$serializer collectItem$$serializer = new CollectItem$$serializer();
        INSTANCE = collectItem$$serializer;
        ip3 ip3Var = new ip3("com.github.mytv.dv.model.CollectItem", collectItem$$serializer, 3);
        ip3Var.k("collect_id", true);
        ip3Var.k("collect_name", true);
        ip3Var.k("collect_count", true);
        descriptor = ip3Var;
    }

    private CollectItem$$serializer() {
    }

    @Override // defpackage.cp1
    public final KSerializer[] childSerializers() {
        fx4 fx4Var = fx4.a;
        return new KSerializer[]{fx4Var, fx4Var, x22.a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final CollectItem deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        le0 c = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        while (z) {
            int v = c.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = c.t(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = c.t(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    y9.f(v);
                    return null;
                }
                i2 = c.o(serialDescriptor, 2);
                i |= 4;
            }
        }
        c.a(serialDescriptor);
        return new CollectItem(i, str, str2, i2, (yj4) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, CollectItem collectItem) {
        encoder.getClass();
        collectItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        me0 c = encoder.c(serialDescriptor);
        CollectItem.write$Self$app(collectItem, c, serialDescriptor);
        c.a(serialDescriptor);
    }

    @Override // defpackage.cp1
    public KSerializer[] typeParametersSerializers() {
        return o7.q;
    }
}

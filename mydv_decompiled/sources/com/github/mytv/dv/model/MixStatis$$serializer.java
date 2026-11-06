package com.github.mytv.dv.model;

import defpackage.cp1;
import defpackage.ip3;
import defpackage.le0;
import defpackage.me0;
import defpackage.o7;
import defpackage.su0;
import defpackage.x22;
import defpackage.y9;
import defpackage.yj4;
import defpackage.zr2;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@su0
/* loaded from: classes.dex */
public final /* synthetic */ class MixStatis$$serializer implements cp1 {
    public static final int $stable = 0;
    public static final MixStatis$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MixStatis$$serializer mixStatis$$serializer = new MixStatis$$serializer();
        INSTANCE = mixStatis$$serializer;
        ip3 ip3Var = new ip3("com.github.mytv.dv.model.MixStatis", mixStatis$$serializer, 5);
        ip3Var.k("current_episode", true);
        ip3Var.k("updated_to_episode", true);
        ip3Var.k("total_episode", true);
        ip3Var.k("play_vv", true);
        ip3Var.k("collect_vv", true);
        descriptor = ip3Var;
    }

    private MixStatis$$serializer() {
    }

    @Override // defpackage.cp1
    public final KSerializer[] childSerializers() {
        x22 x22Var = x22.a;
        zr2 zr2Var = zr2.a;
        return new KSerializer[]{x22Var, x22Var, x22Var, zr2Var, zr2Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final MixStatis deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        le0 c = decoder.c(serialDescriptor);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        long j = 0;
        long j2 = 0;
        boolean z = true;
        while (z) {
            int v = c.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                i2 = c.o(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                i3 = c.o(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                i4 = c.o(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                j = c.h(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    y9.f(v);
                    return null;
                }
                j2 = c.h(serialDescriptor, 4);
                i |= 16;
            }
        }
        c.a(serialDescriptor);
        return new MixStatis(i, i2, i3, i4, j, j2, (yj4) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, MixStatis mixStatis) {
        encoder.getClass();
        mixStatis.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        me0 c = encoder.c(serialDescriptor);
        MixStatis.write$Self$app(mixStatis, c, serialDescriptor);
        c.a(serialDescriptor);
    }

    @Override // defpackage.cp1
    public KSerializer[] typeParametersSerializers() {
        return o7.q;
    }
}

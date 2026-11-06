package com.github.mytv.dv.model;

import defpackage.cp1;
import defpackage.fx4;
import defpackage.ip3;
import defpackage.le0;
import defpackage.me0;
import defpackage.o7;
import defpackage.su0;
import defpackage.y9;
import defpackage.yj4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@su0
/* loaded from: classes.dex */
public final /* synthetic */ class MixInfo$$serializer implements cp1 {
    public static final int $stable = 0;
    public static final MixInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MixInfo$$serializer mixInfo$$serializer = new MixInfo$$serializer();
        INSTANCE = mixInfo$$serializer;
        ip3 ip3Var = new ip3("com.github.mytv.dv.model.MixInfo", mixInfo$$serializer, 5);
        ip3Var.k("mix_id", true);
        ip3Var.l(new Aweme$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0(new String[]{"series_id"}));
        ip3Var.k("mix_name", true);
        ip3Var.l(new Aweme$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0(new String[]{"series_name"}));
        ip3Var.k("desc", true);
        ip3Var.k("cover_url", true);
        ip3Var.k("statis", true);
        descriptor = ip3Var;
    }

    private MixInfo$$serializer() {
    }

    @Override // defpackage.cp1
    public final KSerializer[] childSerializers() {
        fx4 fx4Var = fx4.a;
        return new KSerializer[]{fx4Var, fx4Var, fx4Var, Cover$$serializer.INSTANCE, MixStatis$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer
    public final MixInfo deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        le0 c = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Cover cover = null;
        MixStatis mixStatis = null;
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
            } else if (v == 2) {
                str3 = c.t(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                cover = (Cover) c.A(serialDescriptor, 3, Cover$$serializer.INSTANCE, cover);
                i |= 8;
            } else {
                if (v != 4) {
                    y9.f(v);
                    return null;
                }
                mixStatis = (MixStatis) c.A(serialDescriptor, 4, MixStatis$$serializer.INSTANCE, mixStatis);
                i |= 16;
            }
        }
        c.a(serialDescriptor);
        return new MixInfo(i, str, str2, str3, cover, mixStatis, (yj4) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, MixInfo mixInfo) {
        encoder.getClass();
        mixInfo.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        me0 c = encoder.c(serialDescriptor);
        MixInfo.write$Self$app(mixInfo, c, serialDescriptor);
        c.a(serialDescriptor);
    }

    @Override // defpackage.cp1
    public KSerializer[] typeParametersSerializers() {
        return o7.q;
    }
}

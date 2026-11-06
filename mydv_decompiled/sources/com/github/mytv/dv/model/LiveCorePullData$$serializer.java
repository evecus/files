package com.github.mytv.dv.model;

import defpackage.cp1;
import defpackage.ip3;
import defpackage.le0;
import defpackage.me0;
import defpackage.o7;
import defpackage.qb;
import defpackage.su0;
import defpackage.u62;
import defpackage.y9;
import defpackage.yj4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@su0
/* loaded from: classes2.dex */
public final /* synthetic */ class LiveCorePullData$$serializer implements cp1 {
    public static final int $stable = 0;
    public static final LiveCorePullData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LiveCorePullData$$serializer liveCorePullData$$serializer = new LiveCorePullData$$serializer();
        INSTANCE = liveCorePullData$$serializer;
        ip3 ip3Var = new ip3("com.github.mytv.dv.model.LiveCorePullData", liveCorePullData$$serializer, 2);
        ip3Var.k("options", true);
        ip3Var.k("stream_data", true);
        descriptor = ip3Var;
    }

    private LiveCorePullData$$serializer() {
    }

    @Override // defpackage.cp1
    public final KSerializer[] childSerializers() {
        u62 u62Var = u62.a;
        return new KSerializer[]{qb.M(u62Var), qb.M(u62Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LiveCorePullData deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        le0 c = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        b bVar = null;
        b bVar2 = null;
        while (z) {
            int v = c.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                bVar = (b) c.x(serialDescriptor, 0, u62.a, bVar);
                i |= 1;
            } else {
                if (v != 1) {
                    y9.f(v);
                    return null;
                }
                bVar2 = (b) c.x(serialDescriptor, 1, u62.a, bVar2);
                i |= 2;
            }
        }
        c.a(serialDescriptor);
        return new LiveCorePullData(i, bVar, bVar2, (yj4) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LiveCorePullData liveCorePullData) {
        encoder.getClass();
        liveCorePullData.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        me0 c = encoder.c(serialDescriptor);
        LiveCorePullData.write$Self$app(liveCorePullData, c, serialDescriptor);
        c.a(serialDescriptor);
    }

    @Override // defpackage.cp1
    public KSerializer[] typeParametersSerializers() {
        return o7.q;
    }
}

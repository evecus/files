package com.github.mytv.dv.model;

import defpackage.cp1;
import defpackage.ip3;
import defpackage.le0;
import defpackage.me0;
import defpackage.o7;
import defpackage.qb;
import defpackage.su0;
import defpackage.uc2;
import defpackage.y9;
import defpackage.yj4;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@su0
/* loaded from: classes2.dex */
public final /* synthetic */ class StreamUrl$$serializer implements cp1 {
    public static final int $stable = 0;
    public static final StreamUrl$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        StreamUrl$$serializer streamUrl$$serializer = new StreamUrl$$serializer();
        INSTANCE = streamUrl$$serializer;
        ip3 ip3Var = new ip3("com.github.mytv.dv.model.StreamUrl", streamUrl$$serializer, 3);
        ip3Var.k("flv_pull_url", true);
        ip3Var.k("hls_pull_url_map", true);
        ip3Var.k("live_core_sdk_data", true);
        descriptor = ip3Var;
    }

    private StreamUrl$$serializer() {
    }

    @Override // defpackage.cp1
    public final KSerializer[] childSerializers() {
        uc2[] uc2VarArr;
        uc2VarArr = StreamUrl.$childSerializers;
        return new KSerializer[]{qb.M((KSerializer) uc2VarArr[0].getValue()), qb.M((KSerializer) uc2VarArr[1].getValue()), qb.M(LiveCoreSdkData$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final StreamUrl deserialize(Decoder decoder) {
        uc2[] uc2VarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        le0 c = decoder.c(serialDescriptor);
        uc2VarArr = StreamUrl.$childSerializers;
        boolean z = true;
        int i = 0;
        Map map = null;
        Map map2 = null;
        LiveCoreSdkData liveCoreSdkData = null;
        while (z) {
            int v = c.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                map = (Map) c.x(serialDescriptor, 0, (KSerializer) uc2VarArr[0].getValue(), map);
                i |= 1;
            } else if (v == 1) {
                map2 = (Map) c.x(serialDescriptor, 1, (KSerializer) uc2VarArr[1].getValue(), map2);
                i |= 2;
            } else {
                if (v != 2) {
                    y9.f(v);
                    return null;
                }
                liveCoreSdkData = (LiveCoreSdkData) c.x(serialDescriptor, 2, LiveCoreSdkData$$serializer.INSTANCE, liveCoreSdkData);
                i |= 4;
            }
        }
        c.a(serialDescriptor);
        return new StreamUrl(i, map, map2, liveCoreSdkData, (yj4) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, StreamUrl streamUrl) {
        encoder.getClass();
        streamUrl.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        me0 c = encoder.c(serialDescriptor);
        StreamUrl.write$Self$app(streamUrl, c, serialDescriptor);
        c.a(serialDescriptor);
    }

    @Override // defpackage.cp1
    public KSerializer[] typeParametersSerializers() {
        return o7.q;
    }
}

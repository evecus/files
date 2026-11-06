package com.github.mytv.dv.model;

import defpackage.cp1;
import defpackage.fx4;
import defpackage.ip3;
import defpackage.le0;
import defpackage.me0;
import defpackage.o7;
import defpackage.qb;
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
public final /* synthetic */ class CameraInfo$$serializer implements cp1 {
    public static final int $stable = 0;
    public static final CameraInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CameraInfo$$serializer cameraInfo$$serializer = new CameraInfo$$serializer();
        INSTANCE = cameraInfo$$serializer;
        ip3 ip3Var = new ip3("com.github.mytv.dv.model.CameraInfo", cameraInfo$$serializer, 4);
        ip3Var.k("camera_id_str", true);
        ip3Var.k("title", true);
        ip3Var.k("camera_type", true);
        ip3Var.k("stream_info", true);
        descriptor = ip3Var;
    }

    private CameraInfo$$serializer() {
    }

    @Override // defpackage.cp1
    public final KSerializer[] childSerializers() {
        KSerializer M = qb.M(StreamUrl$$serializer.INSTANCE);
        fx4 fx4Var = fx4.a;
        return new KSerializer[]{fx4Var, fx4Var, x22.a, M};
    }

    @Override // kotlinx.serialization.KSerializer
    public final CameraInfo deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        le0 c = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        StreamUrl streamUrl = null;
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
                i2 = c.o(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    y9.f(v);
                    return null;
                }
                streamUrl = (StreamUrl) c.x(serialDescriptor, 3, StreamUrl$$serializer.INSTANCE, streamUrl);
                i |= 8;
            }
        }
        c.a(serialDescriptor);
        return new CameraInfo(i, str, str2, i2, streamUrl, (yj4) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, CameraInfo cameraInfo) {
        encoder.getClass();
        cameraInfo.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        me0 c = encoder.c(serialDescriptor);
        CameraInfo.write$Self$app(cameraInfo, c, serialDescriptor);
        c.a(serialDescriptor);
    }

    @Override // defpackage.cp1
    public KSerializer[] typeParametersSerializers() {
        return o7.q;
    }
}

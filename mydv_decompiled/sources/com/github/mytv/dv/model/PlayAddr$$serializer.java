package com.github.mytv.dv.model;

import defpackage.cp1;
import defpackage.fx4;
import defpackage.ip3;
import defpackage.le0;
import defpackage.me0;
import defpackage.o7;
import defpackage.su0;
import defpackage.uc2;
import defpackage.x22;
import defpackage.y9;
import defpackage.yj4;
import defpackage.zr2;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@su0
/* loaded from: classes.dex */
public final /* synthetic */ class PlayAddr$$serializer implements cp1 {
    public static final int $stable = 0;
    public static final PlayAddr$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PlayAddr$$serializer playAddr$$serializer = new PlayAddr$$serializer();
        INSTANCE = playAddr$$serializer;
        ip3 ip3Var = new ip3("com.github.mytv.dv.model.PlayAddr", playAddr$$serializer, 5);
        ip3Var.k("url_list", true);
        ip3Var.k("uri", true);
        ip3Var.k("width", true);
        ip3Var.k("height", true);
        ip3Var.k("data_size", true);
        descriptor = ip3Var;
    }

    private PlayAddr$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cp1
    public final KSerializer[] childSerializers() {
        uc2[] uc2VarArr;
        uc2VarArr = PlayAddr.$childSerializers;
        x22 x22Var = x22.a;
        return new KSerializer[]{uc2VarArr[0].getValue(), fx4.a, x22Var, x22Var, zr2.a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final PlayAddr deserialize(Decoder decoder) {
        uc2[] uc2VarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        le0 c = decoder.c(serialDescriptor);
        uc2VarArr = PlayAddr.$childSerializers;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        List list = null;
        String str = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int v = c.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) c.A(serialDescriptor, 0, (KSerializer) uc2VarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                str = c.t(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                i2 = c.o(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                i3 = c.o(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    y9.f(v);
                    return null;
                }
                j = c.h(serialDescriptor, 4);
                i |= 16;
            }
        }
        c.a(serialDescriptor);
        return new PlayAddr(i, list, str, i2, i3, j, (yj4) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PlayAddr playAddr) {
        encoder.getClass();
        playAddr.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        me0 c = encoder.c(serialDescriptor);
        PlayAddr.write$Self$app(playAddr, c, serialDescriptor);
        c.a(serialDescriptor);
    }

    @Override // defpackage.cp1
    public KSerializer[] typeParametersSerializers() {
        return o7.q;
    }
}

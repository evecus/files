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
/* loaded from: classes.dex */
public final /* synthetic */ class BitRate$$serializer implements cp1 {
    public static final int $stable = 0;
    public static final BitRate$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        BitRate$$serializer bitRate$$serializer = new BitRate$$serializer();
        INSTANCE = bitRate$$serializer;
        ip3 ip3Var = new ip3("com.github.mytv.dv.model.BitRate", bitRate$$serializer, 8);
        ip3Var.k("gear_name", true);
        ip3Var.k("bit_rate", true);
        ip3Var.k("quality_type", true);
        ip3Var.k("is_h265", true);
        ip3Var.k("is_bytevc1", true);
        ip3Var.k("FPS", true);
        ip3Var.k("format", true);
        ip3Var.k("play_addr", true);
        descriptor = ip3Var;
    }

    private BitRate$$serializer() {
    }

    @Override // defpackage.cp1
    public final KSerializer[] childSerializers() {
        fx4 fx4Var = fx4.a;
        x22 x22Var = x22.a;
        return new KSerializer[]{fx4Var, x22Var, x22Var, x22Var, x22Var, x22Var, fx4Var, PlayAddr$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer
    public final BitRate deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        le0 c = decoder.c(serialDescriptor);
        BitRate bitRate = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        String str = null;
        String str2 = null;
        PlayAddr playAddr = null;
        while (z) {
            int v = c.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = c.t(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i2 = c.o(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    i3 = c.o(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    i4 = c.o(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    i5 = c.o(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    i6 = c.o(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str2 = c.t(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    playAddr = (PlayAddr) c.A(serialDescriptor, 7, PlayAddr$$serializer.INSTANCE, playAddr);
                    i |= 128;
                    break;
                default:
                    y9.f(v);
                    return bitRate;
            }
            bitRate = null;
        }
        c.a(serialDescriptor);
        return new BitRate(i, str, i2, i3, i4, i5, i6, str2, playAddr, (yj4) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, BitRate bitRate) {
        encoder.getClass();
        bitRate.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        me0 c = encoder.c(serialDescriptor);
        BitRate.write$Self$app(bitRate, c, serialDescriptor);
        c.a(serialDescriptor);
    }

    @Override // defpackage.cp1
    public KSerializer[] typeParametersSerializers() {
        return o7.q;
    }
}

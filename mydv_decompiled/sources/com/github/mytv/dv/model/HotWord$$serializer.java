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
import defpackage.zr2;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@su0
/* loaded from: classes2.dex */
public final /* synthetic */ class HotWord$$serializer implements cp1 {
    public static final int $stable = 0;
    public static final HotWord$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        HotWord$$serializer hotWord$$serializer = new HotWord$$serializer();
        INSTANCE = hotWord$$serializer;
        ip3 ip3Var = new ip3("com.github.mytv.dv.model.HotWord", hotWord$$serializer, 5);
        ip3Var.k("word", true);
        ip3Var.k("hot_value", true);
        ip3Var.k("position", true);
        ip3Var.k("sentence_id", true);
        ip3Var.k("label", true);
        descriptor = ip3Var;
    }

    private HotWord$$serializer() {
    }

    @Override // defpackage.cp1
    public final KSerializer[] childSerializers() {
        fx4 fx4Var = fx4.a;
        x22 x22Var = x22.a;
        return new KSerializer[]{fx4Var, zr2.a, x22Var, fx4Var, x22Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final HotWord deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        le0 c = decoder.c(serialDescriptor);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int v = c.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = c.t(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                j = c.h(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                i2 = c.o(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                str2 = c.t(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    y9.f(v);
                    return null;
                }
                i3 = c.o(serialDescriptor, 4);
                i |= 16;
            }
        }
        c.a(serialDescriptor);
        return new HotWord(i, str, j, i2, str2, i3, (yj4) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, HotWord hotWord) {
        encoder.getClass();
        hotWord.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        me0 c = encoder.c(serialDescriptor);
        HotWord.write$Self$app(hotWord, c, serialDescriptor);
        c.a(serialDescriptor);
    }

    @Override // defpackage.cp1
    public KSerializer[] typeParametersSerializers() {
        return o7.q;
    }
}

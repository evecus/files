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
/* loaded from: classes2.dex */
public final /* synthetic */ class SeoLink$$serializer implements cp1 {
    public static final int $stable = 0;
    public static final SeoLink$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SeoLink$$serializer seoLink$$serializer = new SeoLink$$serializer();
        INSTANCE = seoLink$$serializer;
        ip3 ip3Var = new ip3("com.github.mytv.dv.model.SeoLink", seoLink$$serializer, 2);
        ip3Var.k("link", true);
        ip3Var.k("title", true);
        descriptor = ip3Var;
    }

    private SeoLink$$serializer() {
    }

    @Override // defpackage.cp1
    public final KSerializer[] childSerializers() {
        fx4 fx4Var = fx4.a;
        return new KSerializer[]{fx4Var, fx4Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SeoLink deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        le0 c = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        while (z) {
            int v = c.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = c.t(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    y9.f(v);
                    return null;
                }
                str2 = c.t(serialDescriptor, 1);
                i |= 2;
            }
        }
        c.a(serialDescriptor);
        return new SeoLink(i, str, str2, (yj4) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SeoLink seoLink) {
        encoder.getClass();
        seoLink.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        me0 c = encoder.c(serialDescriptor);
        SeoLink.write$Self$app(seoLink, c, serialDescriptor);
        c.a(serialDescriptor);
    }

    @Override // defpackage.cp1
    public KSerializer[] typeParametersSerializers() {
        return o7.q;
    }
}

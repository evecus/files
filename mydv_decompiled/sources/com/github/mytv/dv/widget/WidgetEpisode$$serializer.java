package com.github.mytv.dv.widget;

import defpackage.cp1;
import defpackage.fx4;
import defpackage.ip3;
import defpackage.le0;
import defpackage.me0;
import defpackage.o7;
import defpackage.su0;
import defpackage.x22;
import defpackage.y9;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@su0
/* loaded from: classes2.dex */
public final /* synthetic */ class WidgetEpisode$$serializer implements cp1 {
    public static final int $stable = 0;
    public static final WidgetEpisode$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        WidgetEpisode$$serializer widgetEpisode$$serializer = new WidgetEpisode$$serializer();
        INSTANCE = widgetEpisode$$serializer;
        ip3 ip3Var = new ip3("com.github.mytv.dv.widget.WidgetEpisode", widgetEpisode$$serializer, 2);
        ip3Var.k("number", false);
        ip3Var.k("awemeId", false);
        descriptor = ip3Var;
    }

    private WidgetEpisode$$serializer() {
    }

    @Override // defpackage.cp1
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{x22.a, fx4.a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final WidgetEpisode deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        le0 c = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        String str = null;
        while (z) {
            int v = c.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                i2 = c.o(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    y9.f(v);
                    return null;
                }
                str = c.t(serialDescriptor, 1);
                i |= 2;
            }
        }
        c.a(serialDescriptor);
        return new WidgetEpisode(i, i2, str, null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, WidgetEpisode widgetEpisode) {
        encoder.getClass();
        widgetEpisode.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        me0 c = encoder.c(serialDescriptor);
        WidgetEpisode.write$Self$app(widgetEpisode, c, serialDescriptor);
        c.a(serialDescriptor);
    }

    @Override // defpackage.cp1
    public KSerializer[] typeParametersSerializers() {
        return o7.q;
    }
}

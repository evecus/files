package com.github.mytv.dv.widget;

import androidx.media3.extractor.text.ttml.TtmlNode;
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
public final /* synthetic */ class WidgetVideo$$serializer implements cp1 {
    public static final int $stable = 0;
    public static final WidgetVideo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        WidgetVideo$$serializer widgetVideo$$serializer = new WidgetVideo$$serializer();
        INSTANCE = widgetVideo$$serializer;
        ip3 ip3Var = new ip3("com.github.mytv.dv.widget.WidgetVideo", widgetVideo$$serializer, 7);
        ip3Var.k(TtmlNode.ATTR_ID, true);
        ip3Var.k("title", true);
        ip3Var.k("author", true);
        ip3Var.k("avatarUrl", true);
        ip3Var.k("coverUrl", true);
        ip3Var.k("duration", true);
        ip3Var.k("likes", true);
        descriptor = ip3Var;
    }

    private WidgetVideo$$serializer() {
    }

    @Override // defpackage.cp1
    public final KSerializer[] childSerializers() {
        fx4 fx4Var = fx4.a;
        return new KSerializer[]{fx4Var, fx4Var, fx4Var, fx4Var, fx4Var, fx4Var, fx4Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final WidgetVideo deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        le0 c = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (z) {
            int v = c.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = c.t(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = c.t(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = c.t(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str4 = c.t(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str5 = c.t(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str6 = c.t(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str7 = c.t(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    y9.f(v);
                    return null;
            }
        }
        c.a(serialDescriptor);
        return new WidgetVideo(i, str, str2, str3, str4, str5, str6, str7, (yj4) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, WidgetVideo widgetVideo) {
        encoder.getClass();
        widgetVideo.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        me0 c = encoder.c(serialDescriptor);
        WidgetVideo.write$Self$app(widgetVideo, c, serialDescriptor);
        c.a(serialDescriptor);
    }

    @Override // defpackage.cp1
    public KSerializer[] typeParametersSerializers() {
        return o7.q;
    }
}

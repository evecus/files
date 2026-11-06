package com.github.mytv.dv.widget;

import androidx.media3.extractor.text.ttml.TtmlNode;
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
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@su0
/* loaded from: classes2.dex */
public final /* synthetic */ class WidgetMixItem$$serializer implements cp1 {
    public static final int $stable = 0;
    public static final WidgetMixItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        WidgetMixItem$$serializer widgetMixItem$$serializer = new WidgetMixItem$$serializer();
        INSTANCE = widgetMixItem$$serializer;
        ip3 ip3Var = new ip3("com.github.mytv.dv.widget.WidgetMixItem", widgetMixItem$$serializer, 8);
        ip3Var.k(TtmlNode.ATTR_ID, true);
        ip3Var.k("name", true);
        ip3Var.k("author", true);
        ip3Var.k("coverUrl", true);
        ip3Var.k("episode", true);
        ip3Var.k("total", true);
        ip3Var.k("resumeAwemeId", true);
        ip3Var.k("nextEpisodes", true);
        descriptor = ip3Var;
    }

    private WidgetMixItem$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cp1
    public final KSerializer[] childSerializers() {
        uc2[] uc2VarArr;
        uc2VarArr = WidgetMixItem.$childSerializers;
        fx4 fx4Var = fx4.a;
        x22 x22Var = x22.a;
        return new KSerializer[]{fx4Var, fx4Var, fx4Var, fx4Var, x22Var, x22Var, fx4Var, uc2VarArr[7].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final WidgetMixItem deserialize(Decoder decoder) {
        uc2[] uc2VarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        le0 c = decoder.c(serialDescriptor);
        uc2VarArr = WidgetMixItem.$childSerializers;
        WidgetMixItem widgetMixItem = null;
        boolean z = true;
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
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
                    i2 = c.o(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    i3 = c.o(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str5 = c.t(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    list = (List) c.A(serialDescriptor, 7, (KSerializer) uc2VarArr[7].getValue(), list);
                    i |= 128;
                    break;
                default:
                    y9.f(v);
                    return widgetMixItem;
            }
            widgetMixItem = null;
        }
        c.a(serialDescriptor);
        return new WidgetMixItem(i, str, str2, str3, str4, i2, i3, str5, list, (yj4) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, WidgetMixItem widgetMixItem) {
        encoder.getClass();
        widgetMixItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        me0 c = encoder.c(serialDescriptor);
        WidgetMixItem.write$Self$app(widgetMixItem, c, serialDescriptor);
        c.a(serialDescriptor);
    }

    @Override // defpackage.cp1
    public KSerializer[] typeParametersSerializers() {
        return o7.q;
    }
}

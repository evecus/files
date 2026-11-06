package com.github.mytv.dv.model;

import defpackage.cp1;
import defpackage.ip3;
import defpackage.le0;
import defpackage.me0;
import defpackage.o7;
import defpackage.su0;
import defpackage.uc2;
import defpackage.y9;
import defpackage.yj4;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@su0
/* loaded from: classes.dex */
public final /* synthetic */ class VideoBigThumb$$serializer implements cp1 {
    public static final int $stable = 0;
    public static final VideoBigThumb$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        VideoBigThumb$$serializer videoBigThumb$$serializer = new VideoBigThumb$$serializer();
        INSTANCE = videoBigThumb$$serializer;
        ip3 ip3Var = new ip3("com.github.mytv.dv.model.VideoBigThumb", videoBigThumb$$serializer, 6);
        ip3Var.k("img_urls", true);
        ip3Var.k("img_x_size", true);
        ip3Var.k("img_y_size", true);
        ip3Var.k("img_x_len", true);
        ip3Var.k("img_y_len", true);
        ip3Var.k("img_num", true);
        descriptor = ip3Var;
    }

    private VideoBigThumb$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cp1
    public final KSerializer[] childSerializers() {
        uc2[] uc2VarArr;
        uc2VarArr = VideoBigThumb.$childSerializers;
        FlexibleIntSerializer flexibleIntSerializer = FlexibleIntSerializer.INSTANCE;
        return new KSerializer[]{uc2VarArr[0].getValue(), flexibleIntSerializer, flexibleIntSerializer, flexibleIntSerializer, flexibleIntSerializer, flexibleIntSerializer};
    }

    @Override // kotlinx.serialization.KSerializer
    public final VideoBigThumb deserialize(Decoder decoder) {
        uc2[] uc2VarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        le0 c = decoder.c(serialDescriptor);
        uc2VarArr = VideoBigThumb.$childSerializers;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        List list = null;
        while (z) {
            int v = c.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list = (List) c.A(serialDescriptor, 0, (KSerializer) uc2VarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    i2 = ((Number) c.A(serialDescriptor, 1, FlexibleIntSerializer.INSTANCE, Integer.valueOf(i2))).intValue();
                    i |= 2;
                    break;
                case 2:
                    i3 = ((Number) c.A(serialDescriptor, 2, FlexibleIntSerializer.INSTANCE, Integer.valueOf(i3))).intValue();
                    i |= 4;
                    break;
                case 3:
                    i4 = ((Number) c.A(serialDescriptor, 3, FlexibleIntSerializer.INSTANCE, Integer.valueOf(i4))).intValue();
                    i |= 8;
                    break;
                case 4:
                    i5 = ((Number) c.A(serialDescriptor, 4, FlexibleIntSerializer.INSTANCE, Integer.valueOf(i5))).intValue();
                    i |= 16;
                    break;
                case 5:
                    i6 = ((Number) c.A(serialDescriptor, 5, FlexibleIntSerializer.INSTANCE, Integer.valueOf(i6))).intValue();
                    i |= 32;
                    break;
                default:
                    y9.f(v);
                    return null;
            }
        }
        c.a(serialDescriptor);
        return new VideoBigThumb(i, list, i2, i3, i4, i5, i6, (yj4) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, VideoBigThumb videoBigThumb) {
        encoder.getClass();
        videoBigThumb.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        me0 c = encoder.c(serialDescriptor);
        VideoBigThumb.write$Self$app(videoBigThumb, c, serialDescriptor);
        c.a(serialDescriptor);
    }

    @Override // defpackage.cp1
    public KSerializer[] typeParametersSerializers() {
        return o7.q;
    }
}

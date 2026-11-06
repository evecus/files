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
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@su0
/* loaded from: classes.dex */
public final /* synthetic */ class Video$$serializer implements cp1 {
    public static final int $stable = 0;
    public static final Video$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Video$$serializer video$$serializer = new Video$$serializer();
        INSTANCE = video$$serializer;
        ip3 ip3Var = new ip3("com.github.mytv.dv.model.Video", video$$serializer, 13);
        ip3Var.k("bit_rate", true);
        ip3Var.k("play_addr", true);
        ip3Var.k("play_addr_265", true);
        ip3Var.k("download_addr", true);
        ip3Var.k("cover", true);
        ip3Var.k("dynamic_cover", true);
        ip3Var.k("origin_cover", true);
        ip3Var.k("big_thumbs", true);
        ip3Var.k("duration", true);
        ip3Var.k("width", true);
        ip3Var.k("height", true);
        ip3Var.k("ratio", true);
        ip3Var.k("authentication_token", true);
        descriptor = ip3Var;
    }

    private Video$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cp1
    public final KSerializer[] childSerializers() {
        uc2[] uc2VarArr;
        uc2VarArr = Video.$childSerializers;
        PlayAddr$$serializer playAddr$$serializer = PlayAddr$$serializer.INSTANCE;
        Cover$$serializer cover$$serializer = Cover$$serializer.INSTANCE;
        x22 x22Var = x22.a;
        fx4 fx4Var = fx4.a;
        return new KSerializer[]{uc2VarArr[0].getValue(), playAddr$$serializer, playAddr$$serializer, playAddr$$serializer, cover$$serializer, cover$$serializer, cover$$serializer, uc2VarArr[7].getValue(), x22Var, x22Var, x22Var, fx4Var, fx4Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Video deserialize(Decoder decoder) {
        uc2[] uc2VarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        le0 c = decoder.c(serialDescriptor);
        uc2VarArr = Video.$childSerializers;
        Video video = null;
        boolean z = true;
        List list = null;
        List list2 = null;
        PlayAddr playAddr = null;
        PlayAddr playAddr2 = null;
        PlayAddr playAddr3 = null;
        Cover cover = null;
        Cover cover2 = null;
        Cover cover3 = null;
        String str = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (z) {
            int v = c.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list2 = (List) c.A(serialDescriptor, 0, (KSerializer) uc2VarArr[0].getValue(), list2);
                    i |= 1;
                    break;
                case 1:
                    playAddr = (PlayAddr) c.A(serialDescriptor, 1, PlayAddr$$serializer.INSTANCE, playAddr);
                    i |= 2;
                    break;
                case 2:
                    playAddr2 = (PlayAddr) c.A(serialDescriptor, 2, PlayAddr$$serializer.INSTANCE, playAddr2);
                    i |= 4;
                    break;
                case 3:
                    playAddr3 = (PlayAddr) c.A(serialDescriptor, 3, PlayAddr$$serializer.INSTANCE, playAddr3);
                    i |= 8;
                    break;
                case 4:
                    cover = (Cover) c.A(serialDescriptor, 4, Cover$$serializer.INSTANCE, cover);
                    i |= 16;
                    break;
                case 5:
                    cover2 = (Cover) c.A(serialDescriptor, 5, Cover$$serializer.INSTANCE, cover2);
                    i |= 32;
                    break;
                case 6:
                    cover3 = (Cover) c.A(serialDescriptor, 6, Cover$$serializer.INSTANCE, cover3);
                    i |= 64;
                    break;
                case 7:
                    list = (List) c.A(serialDescriptor, 7, (KSerializer) uc2VarArr[7].getValue(), list);
                    i |= 128;
                    break;
                case 8:
                    i2 = c.o(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    i3 = c.o(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    i4 = c.o(serialDescriptor, 10);
                    i |= 1024;
                    break;
                case 11:
                    str = c.t(serialDescriptor, 11);
                    i |= 2048;
                    break;
                case 12:
                    str2 = c.t(serialDescriptor, 12);
                    i |= 4096;
                    break;
                default:
                    y9.f(v);
                    return video;
            }
            video = null;
        }
        c.a(serialDescriptor);
        return new Video(i, list2, playAddr, playAddr2, playAddr3, cover, cover2, cover3, list, i2, i3, i4, str, str2, (yj4) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Video video) {
        encoder.getClass();
        video.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        me0 c = encoder.c(serialDescriptor);
        Video.write$Self$app(video, c, serialDescriptor);
        c.a(serialDescriptor);
    }

    @Override // defpackage.cp1
    public KSerializer[] typeParametersSerializers() {
        return o7.q;
    }
}

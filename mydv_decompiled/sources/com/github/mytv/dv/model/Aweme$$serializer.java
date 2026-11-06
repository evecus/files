package com.github.mytv.dv.model;

import androidx.media3.common.MimeTypes;
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
import defpackage.zr2;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@su0
/* loaded from: classes.dex */
public final /* synthetic */ class Aweme$$serializer implements cp1 {
    public static final int $stable = 0;
    public static final Aweme$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Aweme$$serializer aweme$$serializer = new Aweme$$serializer();
        INSTANCE = aweme$$serializer;
        ip3 ip3Var = new ip3("com.github.mytv.dv.model.Aweme", aweme$$serializer, 12);
        ip3Var.k("aweme_id", true);
        ip3Var.k("desc", true);
        ip3Var.k(MimeTypes.BASE_TYPE_VIDEO, true);
        ip3Var.k("author", true);
        ip3Var.k("statistics", true);
        ip3Var.k("create_time", true);
        ip3Var.k("aweme_type", true);
        ip3Var.k("play_progress", true);
        ip3Var.k("user_digged", true);
        ip3Var.l(new Aweme$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0(new String[]{"user_digged", "is_digg", "digg_status"}));
        ip3Var.k("collect_stat", true);
        ip3Var.l(new Aweme$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0(new String[]{"collect_stat", "collect_status", "is_collect", "is_collected", "is_favorited"}));
        ip3Var.k("authentication_token", true);
        ip3Var.k("mix_info", true);
        descriptor = ip3Var;
    }

    private Aweme$$serializer() {
    }

    @Override // defpackage.cp1
    public final KSerializer[] childSerializers() {
        KSerializer M = qb.M(MixInfo$$serializer.INSTANCE);
        fx4 fx4Var = fx4.a;
        FlexibleLongSerializer flexibleLongSerializer = FlexibleLongSerializer.INSTANCE;
        return new KSerializer[]{fx4Var, fx4Var, Video$$serializer.INSTANCE, Author$$serializer.INSTANCE, Statistics$$serializer.INSTANCE, zr2.a, x22.a, PlayProgress$$serializer.INSTANCE, flexibleLongSerializer, flexibleLongSerializer, fx4Var, M};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Aweme deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        le0 c = decoder.c(serialDescriptor);
        Aweme aweme = null;
        MixInfo mixInfo = null;
        String str = null;
        String str2 = null;
        Video video = null;
        Author author = null;
        Statistics statistics = null;
        String str3 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        PlayProgress playProgress = null;
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
                    video = (Video) c.A(serialDescriptor, 2, Video$$serializer.INSTANCE, video);
                    i |= 4;
                    break;
                case 3:
                    author = (Author) c.A(serialDescriptor, 3, Author$$serializer.INSTANCE, author);
                    i |= 8;
                    break;
                case 4:
                    statistics = (Statistics) c.A(serialDescriptor, 4, Statistics$$serializer.INSTANCE, statistics);
                    i |= 16;
                    break;
                case 5:
                    j = c.h(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    i2 = c.o(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    playProgress = (PlayProgress) c.A(serialDescriptor, 7, PlayProgress$$serializer.INSTANCE, playProgress);
                    i |= 128;
                    break;
                case 8:
                    j2 = ((Number) c.A(serialDescriptor, 8, FlexibleLongSerializer.INSTANCE, Long.valueOf(j2))).longValue();
                    i |= 256;
                    break;
                case 9:
                    j3 = ((Number) c.A(serialDescriptor, 9, FlexibleLongSerializer.INSTANCE, Long.valueOf(j3))).longValue();
                    i |= 512;
                    break;
                case 10:
                    str3 = c.t(serialDescriptor, 10);
                    i |= 1024;
                    break;
                case 11:
                    mixInfo = (MixInfo) c.x(serialDescriptor, 11, MixInfo$$serializer.INSTANCE, mixInfo);
                    i |= 2048;
                    break;
                default:
                    y9.f(v);
                    return aweme;
            }
            aweme = null;
        }
        c.a(serialDescriptor);
        return new Aweme(i, str, str2, video, author, statistics, j, i2, playProgress, j2, j3, str3, mixInfo, (yj4) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Aweme aweme) {
        encoder.getClass();
        aweme.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        me0 c = encoder.c(serialDescriptor);
        Aweme.write$Self$app(aweme, c, serialDescriptor);
        c.a(serialDescriptor);
    }

    @Override // defpackage.cp1
    public KSerializer[] typeParametersSerializers() {
        return o7.q;
    }
}

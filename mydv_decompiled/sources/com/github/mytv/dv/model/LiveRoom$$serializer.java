package com.github.mytv.dv.model;

import defpackage.cp1;
import defpackage.fx4;
import defpackage.ip3;
import defpackage.le0;
import defpackage.me0;
import defpackage.o7;
import defpackage.qb;
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
public final /* synthetic */ class LiveRoom$$serializer implements cp1 {
    public static final int $stable = 0;
    public static final LiveRoom$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LiveRoom$$serializer liveRoom$$serializer = new LiveRoom$$serializer();
        INSTANCE = liveRoom$$serializer;
        ip3 ip3Var = new ip3("com.github.mytv.dv.model.LiveRoom", liveRoom$$serializer, 13);
        ip3Var.k("room_id", true);
        ip3Var.k("id_str", true);
        ip3Var.k("enter_room_id", true);
        ip3Var.k("web_rid", true);
        ip3Var.k("title", true);
        ip3Var.k("cover", true);
        ip3Var.k("user_count_str", true);
        ip3Var.k("room_view_stats", true);
        ip3Var.k("owner", true);
        ip3Var.k("stream_url", true);
        ip3Var.k("status", true);
        ip3Var.k("camera_infos", true);
        ip3Var.k("episode_extra", true);
        descriptor = ip3Var;
    }

    private LiveRoom$$serializer() {
    }

    @Override // defpackage.cp1
    public final KSerializer[] childSerializers() {
        uc2[] uc2VarArr;
        uc2VarArr = LiveRoom.$childSerializers;
        KSerializer M = qb.M(RoomViewStats$$serializer.INSTANCE);
        KSerializer M2 = qb.M(StreamUrl$$serializer.INSTANCE);
        KSerializer M3 = qb.M((KSerializer) uc2VarArr[11].getValue());
        KSerializer M4 = qb.M(EpisodeExtra$$serializer.INSTANCE);
        fx4 fx4Var = fx4.a;
        return new KSerializer[]{fx4Var, fx4Var, fx4Var, fx4Var, fx4Var, Cover$$serializer.INSTANCE, fx4Var, M, Author$$serializer.INSTANCE, M2, x22.a, M3, M4};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LiveRoom deserialize(Decoder decoder) {
        uc2[] uc2VarArr;
        String str;
        boolean z;
        boolean z2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        le0 c = decoder.c(serialDescriptor);
        uc2VarArr = LiveRoom.$childSerializers;
        EpisodeExtra episodeExtra = null;
        List list = null;
        StreamUrl streamUrl = null;
        Author author = null;
        boolean z3 = true;
        RoomViewStats roomViewStats = null;
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Cover cover = null;
        String str7 = null;
        int i2 = 0;
        while (z3) {
            int v = c.v(serialDescriptor);
            switch (v) {
                case -1:
                    str = str2;
                    z3 = false;
                    str2 = str;
                case 0:
                    z2 = z3;
                    i |= 1;
                    str2 = c.t(serialDescriptor, 0);
                    z3 = z2;
                case 1:
                    z2 = z3;
                    str3 = c.t(serialDescriptor, 1);
                    i |= 2;
                    z3 = z2;
                case 2:
                    z2 = z3;
                    str4 = c.t(serialDescriptor, 2);
                    i |= 4;
                    z3 = z2;
                case 3:
                    z2 = z3;
                    str5 = c.t(serialDescriptor, 3);
                    i |= 8;
                    z3 = z2;
                case 4:
                    z2 = z3;
                    str6 = c.t(serialDescriptor, 4);
                    i |= 16;
                    z3 = z2;
                case 5:
                    z = z3;
                    str = str2;
                    cover = (Cover) c.A(serialDescriptor, 5, Cover$$serializer.INSTANCE, cover);
                    i |= 32;
                    z3 = z;
                    str2 = str;
                case 6:
                    z2 = z3;
                    str7 = c.t(serialDescriptor, 6);
                    i |= 64;
                    z3 = z2;
                case 7:
                    z = z3;
                    str = str2;
                    roomViewStats = (RoomViewStats) c.x(serialDescriptor, 7, RoomViewStats$$serializer.INSTANCE, roomViewStats);
                    i |= 128;
                    z3 = z;
                    str2 = str;
                case 8:
                    z = z3;
                    str = str2;
                    author = (Author) c.A(serialDescriptor, 8, Author$$serializer.INSTANCE, author);
                    i |= 256;
                    z3 = z;
                    str2 = str;
                case 9:
                    z = z3;
                    str = str2;
                    streamUrl = (StreamUrl) c.x(serialDescriptor, 9, StreamUrl$$serializer.INSTANCE, streamUrl);
                    i |= 512;
                    z3 = z;
                    str2 = str;
                case 10:
                    z2 = z3;
                    i2 = c.o(serialDescriptor, 10);
                    i |= 1024;
                    z3 = z2;
                case 11:
                    z = z3;
                    str = str2;
                    list = (List) c.x(serialDescriptor, 11, (KSerializer) uc2VarArr[11].getValue(), list);
                    i |= 2048;
                    z3 = z;
                    str2 = str;
                case 12:
                    z = z3;
                    str = str2;
                    episodeExtra = (EpisodeExtra) c.x(serialDescriptor, 12, EpisodeExtra$$serializer.INSTANCE, episodeExtra);
                    i |= 4096;
                    z3 = z;
                    str2 = str;
                default:
                    y9.f(v);
                    return null;
            }
        }
        c.a(serialDescriptor);
        return new LiveRoom(i, str2, str3, str4, str5, str6, cover, str7, roomViewStats, author, streamUrl, i2, list, episodeExtra, (yj4) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LiveRoom liveRoom) {
        encoder.getClass();
        liveRoom.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        me0 c = encoder.c(serialDescriptor);
        LiveRoom.write$Self$app(liveRoom, c, serialDescriptor);
        c.a(serialDescriptor);
    }

    @Override // defpackage.cp1
    public KSerializer[] typeParametersSerializers() {
        return o7.q;
    }
}

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
/* loaded from: classes.dex */
public final /* synthetic */ class Author$$serializer implements cp1 {
    public static final int $stable = 0;
    public static final Author$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Author$$serializer author$$serializer = new Author$$serializer();
        INSTANCE = author$$serializer;
        ip3 ip3Var = new ip3("com.github.mytv.dv.model.Author", author$$serializer, 12);
        ip3Var.k("uid", true);
        ip3Var.k("nickname", true);
        ip3Var.k("avatar_thumb", true);
        ip3Var.k("avatar_medium", true);
        ip3Var.k("avatar_larger", true);
        ip3Var.k("sec_uid", true);
        ip3Var.k("signature", true);
        ip3Var.k("follower_count", true);
        ip3Var.k("following_count", true);
        ip3Var.k("total_favorited", true);
        ip3Var.k("aweme_count", true);
        ip3Var.k("favoriting_count", true);
        descriptor = ip3Var;
    }

    private Author$$serializer() {
    }

    @Override // defpackage.cp1
    public final KSerializer[] childSerializers() {
        fx4 fx4Var = fx4.a;
        Avatar$$serializer avatar$$serializer = Avatar$$serializer.INSTANCE;
        FlexibleLongSerializer flexibleLongSerializer = FlexibleLongSerializer.INSTANCE;
        return new KSerializer[]{fx4Var, fx4Var, avatar$$serializer, avatar$$serializer, avatar$$serializer, fx4Var, fx4Var, flexibleLongSerializer, flexibleLongSerializer, flexibleLongSerializer, flexibleLongSerializer, flexibleLongSerializer};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Author deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        le0 c = decoder.c(serialDescriptor);
        Author author = null;
        int i = 0;
        String str = null;
        String str2 = null;
        Avatar avatar = null;
        Avatar avatar2 = null;
        Avatar avatar3 = null;
        String str3 = null;
        String str4 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        boolean z = true;
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
                    avatar = (Avatar) c.A(serialDescriptor, 2, Avatar$$serializer.INSTANCE, avatar);
                    i |= 4;
                    break;
                case 3:
                    avatar2 = (Avatar) c.A(serialDescriptor, 3, Avatar$$serializer.INSTANCE, avatar2);
                    i |= 8;
                    break;
                case 4:
                    avatar3 = (Avatar) c.A(serialDescriptor, 4, Avatar$$serializer.INSTANCE, avatar3);
                    i |= 16;
                    break;
                case 5:
                    str3 = c.t(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str4 = c.t(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    j = ((Number) c.A(serialDescriptor, 7, FlexibleLongSerializer.INSTANCE, Long.valueOf(j))).longValue();
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
                    j4 = ((Number) c.A(serialDescriptor, 10, FlexibleLongSerializer.INSTANCE, Long.valueOf(j4))).longValue();
                    i |= 1024;
                    break;
                case 11:
                    j5 = ((Number) c.A(serialDescriptor, 11, FlexibleLongSerializer.INSTANCE, Long.valueOf(j5))).longValue();
                    i |= 2048;
                    break;
                default:
                    y9.f(v);
                    return author;
            }
            author = null;
        }
        c.a(serialDescriptor);
        return new Author(i, str, str2, avatar, avatar2, avatar3, str3, str4, j, j2, j3, j4, j5, (yj4) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Author author) {
        encoder.getClass();
        author.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        me0 c = encoder.c(serialDescriptor);
        Author.write$Self$app(author, c, serialDescriptor);
        c.a(serialDescriptor);
    }

    @Override // defpackage.cp1
    public KSerializer[] typeParametersSerializers() {
        return o7.q;
    }
}

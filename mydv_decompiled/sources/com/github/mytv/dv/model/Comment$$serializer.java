package com.github.mytv.dv.model;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;
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
import defpackage.zr2;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@su0
/* loaded from: classes2.dex */
public final /* synthetic */ class Comment$$serializer implements cp1 {
    public static final int $stable = 0;
    public static final Comment$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Comment$$serializer comment$$serializer = new Comment$$serializer();
        INSTANCE = comment$$serializer;
        ip3 ip3Var = new ip3("com.github.mytv.dv.model.Comment", comment$$serializer, 10);
        ip3Var.k(CmcdConfiguration.KEY_CONTENT_ID, true);
        ip3Var.k("text", true);
        ip3Var.k("user", true);
        ip3Var.k("digg_count", true);
        ip3Var.k("reply_comment_total", true);
        ip3Var.k("create_time", true);
        ip3Var.k("aweme_id", true);
        ip3Var.k("ip_label", true);
        ip3Var.k("reply_comment", true);
        ip3Var.k("is_user_digg", true);
        descriptor = ip3Var;
    }

    private Comment$$serializer() {
    }

    @Override // defpackage.cp1
    public final KSerializer[] childSerializers() {
        uc2[] uc2VarArr;
        uc2VarArr = Comment.$childSerializers;
        KSerializer M = qb.M((KSerializer) uc2VarArr[8].getValue());
        fx4 fx4Var = fx4.a;
        zr2 zr2Var = zr2.a;
        return new KSerializer[]{fx4Var, fx4Var, Author$$serializer.INSTANCE, zr2Var, zr2Var, zr2Var, fx4Var, fx4Var, M, x22.a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Comment deserialize(Decoder decoder) {
        uc2[] uc2VarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        le0 c = decoder.c(serialDescriptor);
        uc2VarArr = Comment.$childSerializers;
        Comment comment = null;
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        Author author = null;
        String str3 = null;
        String str4 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z = true;
        List list = null;
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
                    author = (Author) c.A(serialDescriptor, 2, Author$$serializer.INSTANCE, author);
                    i |= 4;
                    break;
                case 3:
                    j = c.h(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    j2 = c.h(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    j3 = c.h(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str3 = c.t(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str4 = c.t(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    list = (List) c.x(serialDescriptor, 8, (KSerializer) uc2VarArr[8].getValue(), list);
                    i |= 256;
                    break;
                case 9:
                    i2 = c.o(serialDescriptor, 9);
                    i |= 512;
                    continue;
                default:
                    y9.f(v);
                    return comment;
            }
            comment = null;
        }
        c.a(serialDescriptor);
        return new Comment(i, str, str2, author, j, j2, j3, str3, str4, list, i2, (yj4) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Comment comment) {
        encoder.getClass();
        comment.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        me0 c = encoder.c(serialDescriptor);
        Comment.write$Self$app(comment, c, serialDescriptor);
        c.a(serialDescriptor);
    }

    @Override // defpackage.cp1
    public KSerializer[] typeParametersSerializers() {
        return o7.q;
    }
}

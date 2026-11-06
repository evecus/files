package com.github.mytv.dv.model;

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
/* loaded from: classes2.dex */
public final /* synthetic */ class NoticeItem$$serializer implements cp1 {
    public static final int $stable = 0;
    public static final NoticeItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        NoticeItem$$serializer noticeItem$$serializer = new NoticeItem$$serializer();
        INSTANCE = noticeItem$$serializer;
        ip3 ip3Var = new ip3("com.github.mytv.dv.model.NoticeItem", noticeItem$$serializer, 6);
        ip3Var.k("notice_id", true);
        ip3Var.k("notice_type", true);
        ip3Var.k("content", true);
        ip3Var.k("create_time", true);
        ip3Var.k("user", true);
        ip3Var.k("aweme", true);
        descriptor = ip3Var;
    }

    private NoticeItem$$serializer() {
    }

    @Override // defpackage.cp1
    public final KSerializer[] childSerializers() {
        KSerializer M = qb.M(Aweme$$serializer.INSTANCE);
        fx4 fx4Var = fx4.a;
        return new KSerializer[]{fx4Var, x22.a, fx4Var, zr2.a, Author$$serializer.INSTANCE, M};
    }

    @Override // kotlinx.serialization.KSerializer
    public final NoticeItem deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        le0 c = decoder.c(serialDescriptor);
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        Author author = null;
        Aweme aweme = null;
        long j = 0;
        boolean z = true;
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
                    i2 = c.o(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = c.t(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    j = c.h(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    author = (Author) c.A(serialDescriptor, 4, Author$$serializer.INSTANCE, author);
                    i |= 16;
                    break;
                case 5:
                    aweme = (Aweme) c.x(serialDescriptor, 5, Aweme$$serializer.INSTANCE, aweme);
                    i |= 32;
                    break;
                default:
                    y9.f(v);
                    return null;
            }
        }
        c.a(serialDescriptor);
        return new NoticeItem(i, str, i2, str2, j, author, aweme, (yj4) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, NoticeItem noticeItem) {
        encoder.getClass();
        noticeItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        me0 c = encoder.c(serialDescriptor);
        NoticeItem.write$Self$app(noticeItem, c, serialDescriptor);
        c.a(serialDescriptor);
    }

    @Override // defpackage.cp1
    public KSerializer[] typeParametersSerializers() {
        return o7.q;
    }
}

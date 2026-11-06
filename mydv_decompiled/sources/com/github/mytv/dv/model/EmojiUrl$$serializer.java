package com.github.mytv.dv.model;

import defpackage.cp1;
import defpackage.fx4;
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
public final /* synthetic */ class EmojiUrl$$serializer implements cp1 {
    public static final int $stable = 0;
    public static final EmojiUrl$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        EmojiUrl$$serializer emojiUrl$$serializer = new EmojiUrl$$serializer();
        INSTANCE = emojiUrl$$serializer;
        ip3 ip3Var = new ip3("com.github.mytv.dv.model.EmojiUrl", emojiUrl$$serializer, 2);
        ip3Var.k("uri", true);
        ip3Var.k("url_list", true);
        descriptor = ip3Var;
    }

    private EmojiUrl$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cp1
    public final KSerializer[] childSerializers() {
        uc2[] uc2VarArr;
        uc2VarArr = EmojiUrl.$childSerializers;
        return new KSerializer[]{fx4.a, uc2VarArr[1].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final EmojiUrl deserialize(Decoder decoder) {
        uc2[] uc2VarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        le0 c = decoder.c(serialDescriptor);
        uc2VarArr = EmojiUrl.$childSerializers;
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        while (z) {
            int v = c.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = c.t(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    y9.f(v);
                    return null;
                }
                list = (List) c.A(serialDescriptor, 1, (KSerializer) uc2VarArr[1].getValue(), list);
                i |= 2;
            }
        }
        c.a(serialDescriptor);
        return new EmojiUrl(i, str, list, (yj4) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, EmojiUrl emojiUrl) {
        encoder.getClass();
        emojiUrl.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        me0 c = encoder.c(serialDescriptor);
        EmojiUrl.write$Self$app(emojiUrl, c, serialDescriptor);
        c.a(serialDescriptor);
    }

    @Override // defpackage.cp1
    public KSerializer[] typeParametersSerializers() {
        return o7.q;
    }
}

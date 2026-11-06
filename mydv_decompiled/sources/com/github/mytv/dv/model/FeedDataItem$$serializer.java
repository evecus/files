package com.github.mytv.dv.model;

import defpackage.cp1;
import defpackage.ip3;
import defpackage.le0;
import defpackage.me0;
import defpackage.o7;
import defpackage.qb;
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
public final /* synthetic */ class FeedDataItem$$serializer implements cp1 {
    public static final int $stable = 0;
    public static final FeedDataItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FeedDataItem$$serializer feedDataItem$$serializer = new FeedDataItem$$serializer();
        INSTANCE = feedDataItem$$serializer;
        ip3 ip3Var = new ip3("com.github.mytv.dv.model.FeedDataItem", feedDataItem$$serializer, 1);
        ip3Var.k("aweme", true);
        descriptor = ip3Var;
    }

    private FeedDataItem$$serializer() {
    }

    @Override // defpackage.cp1
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qb.M(Aweme$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final FeedDataItem deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        le0 c = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        Aweme aweme = null;
        while (z) {
            int v = c.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    y9.f(v);
                    return null;
                }
                aweme = (Aweme) c.x(serialDescriptor, 0, Aweme$$serializer.INSTANCE, aweme);
                i = 1;
            }
        }
        c.a(serialDescriptor);
        return new FeedDataItem(i, aweme, (yj4) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, FeedDataItem feedDataItem) {
        encoder.getClass();
        feedDataItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        me0 c = encoder.c(serialDescriptor);
        FeedDataItem.write$Self$app(feedDataItem, c, serialDescriptor);
        c.a(serialDescriptor);
    }

    @Override // defpackage.cp1
    public KSerializer[] typeParametersSerializers() {
        return o7.q;
    }
}

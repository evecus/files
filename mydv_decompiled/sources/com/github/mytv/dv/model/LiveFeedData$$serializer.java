package com.github.mytv.dv.model;

import defpackage.cp1;
import defpackage.ip3;
import defpackage.le0;
import defpackage.me0;
import defpackage.o7;
import defpackage.qb;
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
/* loaded from: classes2.dex */
public final /* synthetic */ class LiveFeedData$$serializer implements cp1 {
    public static final int $stable = 0;
    public static final LiveFeedData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LiveFeedData$$serializer liveFeedData$$serializer = new LiveFeedData$$serializer();
        INSTANCE = liveFeedData$$serializer;
        ip3 ip3Var = new ip3("com.github.mytv.dv.model.LiveFeedData", liveFeedData$$serializer, 1);
        ip3Var.k("data", true);
        descriptor = ip3Var;
    }

    private LiveFeedData$$serializer() {
    }

    @Override // defpackage.cp1
    public final KSerializer[] childSerializers() {
        uc2[] uc2VarArr;
        uc2VarArr = LiveFeedData.$childSerializers;
        return new KSerializer[]{qb.M((KSerializer) uc2VarArr[0].getValue())};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LiveFeedData deserialize(Decoder decoder) {
        uc2[] uc2VarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        le0 c = decoder.c(serialDescriptor);
        uc2VarArr = LiveFeedData.$childSerializers;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int v = c.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    y9.f(v);
                    return null;
                }
                list = (List) c.x(serialDescriptor, 0, (KSerializer) uc2VarArr[0].getValue(), list);
                i = 1;
            }
        }
        c.a(serialDescriptor);
        return new LiveFeedData(i, list, (yj4) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LiveFeedData liveFeedData) {
        encoder.getClass();
        liveFeedData.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        me0 c = encoder.c(serialDescriptor);
        LiveFeedData.write$Self$app(liveFeedData, c, serialDescriptor);
        c.a(serialDescriptor);
    }

    @Override // defpackage.cp1
    public KSerializer[] typeParametersSerializers() {
        return o7.q;
    }
}

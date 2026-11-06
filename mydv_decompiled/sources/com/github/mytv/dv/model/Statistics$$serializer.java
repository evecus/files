package com.github.mytv.dv.model;

import defpackage.cp1;
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
public final /* synthetic */ class Statistics$$serializer implements cp1 {
    public static final int $stable = 0;
    public static final Statistics$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Statistics$$serializer statistics$$serializer = new Statistics$$serializer();
        INSTANCE = statistics$$serializer;
        ip3 ip3Var = new ip3("com.github.mytv.dv.model.Statistics", statistics$$serializer, 5);
        ip3Var.k("digg_count", true);
        ip3Var.k("comment_count", true);
        ip3Var.k("share_count", true);
        ip3Var.k("collect_count", true);
        ip3Var.k("play_count", true);
        descriptor = ip3Var;
    }

    private Statistics$$serializer() {
    }

    @Override // defpackage.cp1
    public final KSerializer[] childSerializers() {
        FlexibleLongSerializer flexibleLongSerializer = FlexibleLongSerializer.INSTANCE;
        return new KSerializer[]{flexibleLongSerializer, flexibleLongSerializer, flexibleLongSerializer, flexibleLongSerializer, flexibleLongSerializer};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Statistics deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        le0 c = decoder.c(serialDescriptor);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        int i = 0;
        boolean z = true;
        while (z) {
            int v = c.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                j = ((Number) c.A(serialDescriptor, 0, FlexibleLongSerializer.INSTANCE, Long.valueOf(j))).longValue();
                i |= 1;
            } else if (v == 1) {
                j2 = ((Number) c.A(serialDescriptor, 1, FlexibleLongSerializer.INSTANCE, Long.valueOf(j2))).longValue();
                i |= 2;
            } else if (v == 2) {
                j3 = ((Number) c.A(serialDescriptor, 2, FlexibleLongSerializer.INSTANCE, Long.valueOf(j3))).longValue();
                i |= 4;
            } else if (v == 3) {
                j4 = ((Number) c.A(serialDescriptor, 3, FlexibleLongSerializer.INSTANCE, Long.valueOf(j4))).longValue();
                i |= 8;
            } else {
                if (v != 4) {
                    y9.f(v);
                    return null;
                }
                j5 = ((Number) c.A(serialDescriptor, 4, FlexibleLongSerializer.INSTANCE, Long.valueOf(j5))).longValue();
                i |= 16;
            }
        }
        c.a(serialDescriptor);
        return new Statistics(i, j, j2, j3, j4, j5, (yj4) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Statistics statistics) {
        encoder.getClass();
        statistics.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        me0 c = encoder.c(serialDescriptor);
        Statistics.write$Self$app(statistics, c, serialDescriptor);
        c.a(serialDescriptor);
    }

    @Override // defpackage.cp1
    public KSerializer[] typeParametersSerializers() {
        return o7.q;
    }
}

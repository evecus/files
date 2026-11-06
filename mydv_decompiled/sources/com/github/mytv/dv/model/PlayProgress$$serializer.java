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
import defpackage.zr2;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@su0
/* loaded from: classes.dex */
public final /* synthetic */ class PlayProgress$$serializer implements cp1 {
    public static final int $stable = 0;
    public static final PlayProgress$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PlayProgress$$serializer playProgress$$serializer = new PlayProgress$$serializer();
        INSTANCE = playProgress$$serializer;
        ip3 ip3Var = new ip3("com.github.mytv.dv.model.PlayProgress", playProgress$$serializer, 3);
        ip3Var.k("last_modified_time", true);
        ip3Var.k("play_progress", true);
        ip3Var.k("watch_times", true);
        descriptor = ip3Var;
    }

    private PlayProgress$$serializer() {
    }

    @Override // defpackage.cp1
    public final KSerializer[] childSerializers() {
        zr2 zr2Var = zr2.a;
        return new KSerializer[]{zr2Var, zr2Var, qb.M(zr2Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final PlayProgress deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        le0 c = decoder.c(serialDescriptor);
        int i = 0;
        long j = 0;
        long j2 = 0;
        Long l = null;
        boolean z = true;
        while (z) {
            int v = c.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                j = c.h(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                j2 = c.h(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    y9.f(v);
                    return null;
                }
                l = (Long) c.x(serialDescriptor, 2, zr2.a, l);
                i |= 4;
            }
        }
        c.a(serialDescriptor);
        return new PlayProgress(i, j, j2, l, (yj4) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PlayProgress playProgress) {
        encoder.getClass();
        playProgress.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        me0 c = encoder.c(serialDescriptor);
        PlayProgress.write$Self$app(playProgress, c, serialDescriptor);
        c.a(serialDescriptor);
    }

    @Override // defpackage.cp1
    public KSerializer[] typeParametersSerializers() {
        return o7.q;
    }
}

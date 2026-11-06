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
public final /* synthetic */ class EpisodeExtra$$serializer implements cp1 {
    public static final int $stable = 0;
    public static final EpisodeExtra$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        EpisodeExtra$$serializer episodeExtra$$serializer = new EpisodeExtra$$serializer();
        INSTANCE = episodeExtra$$serializer;
        ip3 ip3Var = new ip3("com.github.mytv.dv.model.EpisodeExtra", episodeExtra$$serializer, 3);
        ip3Var.k("camera_infos", true);
        ip3Var.k("default_camera_id_str", true);
        ip3Var.k("camera_infos_table_title", true);
        descriptor = ip3Var;
    }

    private EpisodeExtra$$serializer() {
    }

    @Override // defpackage.cp1
    public final KSerializer[] childSerializers() {
        uc2[] uc2VarArr;
        uc2VarArr = EpisodeExtra.$childSerializers;
        fx4 fx4Var = fx4.a;
        return new KSerializer[]{qb.M((KSerializer) uc2VarArr[0].getValue()), fx4Var, fx4Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final EpisodeExtra deserialize(Decoder decoder) {
        uc2[] uc2VarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        le0 c = decoder.c(serialDescriptor);
        uc2VarArr = EpisodeExtra.$childSerializers;
        boolean z = true;
        int i = 0;
        List list = null;
        String str = null;
        String str2 = null;
        while (z) {
            int v = c.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) c.x(serialDescriptor, 0, (KSerializer) uc2VarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                str = c.t(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    y9.f(v);
                    return null;
                }
                str2 = c.t(serialDescriptor, 2);
                i |= 4;
            }
        }
        c.a(serialDescriptor);
        return new EpisodeExtra(i, list, str, str2, (yj4) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, EpisodeExtra episodeExtra) {
        encoder.getClass();
        episodeExtra.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        me0 c = encoder.c(serialDescriptor);
        EpisodeExtra.write$Self$app(episodeExtra, c, serialDescriptor);
        c.a(serialDescriptor);
    }

    @Override // defpackage.cp1
    public KSerializer[] typeParametersSerializers() {
        return o7.q;
    }
}

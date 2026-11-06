package com.github.mytv.dv.model;

import defpackage.cp1;
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
public final /* synthetic */ class Cover$$serializer implements cp1 {
    public static final int $stable = 0;
    public static final Cover$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Cover$$serializer cover$$serializer = new Cover$$serializer();
        INSTANCE = cover$$serializer;
        ip3 ip3Var = new ip3("com.github.mytv.dv.model.Cover", cover$$serializer, 1);
        ip3Var.k("url_list", true);
        descriptor = ip3Var;
    }

    private Cover$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cp1
    public final KSerializer[] childSerializers() {
        uc2[] uc2VarArr;
        uc2VarArr = Cover.$childSerializers;
        return new KSerializer[]{uc2VarArr[0].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Cover deserialize(Decoder decoder) {
        uc2[] uc2VarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        le0 c = decoder.c(serialDescriptor);
        uc2VarArr = Cover.$childSerializers;
        yj4 yj4Var = null;
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
                list = (List) c.A(serialDescriptor, 0, (KSerializer) uc2VarArr[0].getValue(), list);
                i = 1;
            }
        }
        c.a(serialDescriptor);
        return new Cover(i, list, yj4Var);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Cover cover) {
        encoder.getClass();
        cover.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        me0 c = encoder.c(serialDescriptor);
        Cover.write$Self$app(cover, c, serialDescriptor);
        c.a(serialDescriptor);
    }

    @Override // defpackage.cp1
    public KSerializer[] typeParametersSerializers() {
        return o7.q;
    }
}

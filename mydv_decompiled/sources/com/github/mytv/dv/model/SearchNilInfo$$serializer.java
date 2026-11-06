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
/* loaded from: classes2.dex */
public final /* synthetic */ class SearchNilInfo$$serializer implements cp1 {
    public static final int $stable = 0;
    public static final SearchNilInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SearchNilInfo$$serializer searchNilInfo$$serializer = new SearchNilInfo$$serializer();
        INSTANCE = searchNilInfo$$serializer;
        ip3 ip3Var = new ip3("com.github.mytv.dv.model.SearchNilInfo", searchNilInfo$$serializer, 4);
        ip3Var.k("search_nil_type", true);
        ip3Var.k("is_load_more", true);
        ip3Var.k("search_nil_item", true);
        ip3Var.k("text_type", true);
        descriptor = ip3Var;
    }

    private SearchNilInfo$$serializer() {
    }

    @Override // defpackage.cp1
    public final KSerializer[] childSerializers() {
        fx4 fx4Var = fx4.a;
        return new KSerializer[]{fx4Var, fx4Var, fx4Var, fx4Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SearchNilInfo deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        le0 c = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int v = c.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = c.t(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = c.t(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str3 = c.t(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    y9.f(v);
                    return null;
                }
                str4 = c.t(serialDescriptor, 3);
                i |= 8;
            }
        }
        c.a(serialDescriptor);
        return new SearchNilInfo(i, str, str2, str3, str4, (yj4) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SearchNilInfo searchNilInfo) {
        encoder.getClass();
        searchNilInfo.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        me0 c = encoder.c(serialDescriptor);
        SearchNilInfo.write$Self$app(searchNilInfo, c, serialDescriptor);
        c.a(serialDescriptor);
    }

    @Override // defpackage.cp1
    public KSerializer[] typeParametersSerializers() {
        return o7.q;
    }
}

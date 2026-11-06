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
public final /* synthetic */ class SearchLiveLives$$serializer implements cp1 {
    public static final int $stable = 0;
    public static final SearchLiveLives$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SearchLiveLives$$serializer searchLiveLives$$serializer = new SearchLiveLives$$serializer();
        INSTANCE = searchLiveLives$$serializer;
        ip3 ip3Var = new ip3("com.github.mytv.dv.model.SearchLiveLives", searchLiveLives$$serializer, 3);
        ip3Var.k("aweme_id", true);
        ip3Var.k("author", true);
        ip3Var.k("rawdata", true);
        descriptor = ip3Var;
    }

    private SearchLiveLives$$serializer() {
    }

    @Override // defpackage.cp1
    public final KSerializer[] childSerializers() {
        fx4 fx4Var = fx4.a;
        return new KSerializer[]{fx4Var, Author$$serializer.INSTANCE, fx4Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SearchLiveLives deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        le0 c = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        Author author = null;
        String str2 = null;
        while (z) {
            int v = c.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = c.t(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                author = (Author) c.A(serialDescriptor, 1, Author$$serializer.INSTANCE, author);
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
        return new SearchLiveLives(i, str, author, str2, (yj4) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SearchLiveLives searchLiveLives) {
        encoder.getClass();
        searchLiveLives.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        me0 c = encoder.c(serialDescriptor);
        SearchLiveLives.write$Self$app(searchLiveLives, c, serialDescriptor);
        c.a(serialDescriptor);
    }

    @Override // defpackage.cp1
    public KSerializer[] typeParametersSerializers() {
        return o7.q;
    }
}

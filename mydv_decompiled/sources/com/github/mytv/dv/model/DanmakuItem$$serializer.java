package com.github.mytv.dv.model;

import defpackage.cp1;
import defpackage.fx4;
import defpackage.ip3;
import defpackage.le0;
import defpackage.me0;
import defpackage.o7;
import defpackage.su0;
import defpackage.tw;
import defpackage.x22;
import defpackage.xy0;
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
public final /* synthetic */ class DanmakuItem$$serializer implements cp1 {
    public static final int $stable = 0;
    public static final DanmakuItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DanmakuItem$$serializer danmakuItem$$serializer = new DanmakuItem$$serializer();
        INSTANCE = danmakuItem$$serializer;
        ip3 ip3Var = new ip3("com.github.mytv.dv.model.DanmakuItem", danmakuItem$$serializer, 17);
        ip3Var.k("danmaku_id", true);
        ip3Var.k("item_id", true);
        ip3Var.k("user_id", true);
        ip3Var.k("offset_time", true);
        ip3Var.k("text", true);
        ip3Var.k("status", true);
        ip3Var.k("digg_type", true);
        ip3Var.k("score", true);
        ip3Var.k("danmaku_type", true);
        ip3Var.k("digg_count", true);
        ip3Var.k("show_digg", true);
        ip3Var.k("show_copy", true);
        ip3Var.k("from_copy", true);
        ip3Var.k("danmaku_type_bits", true);
        ip3Var.k("has_emoji", true);
        ip3Var.k("dislike_type", true);
        ip3Var.k("is_ad", true);
        descriptor = ip3Var;
    }

    private DanmakuItem$$serializer() {
    }

    @Override // defpackage.cp1
    public final KSerializer[] childSerializers() {
        fx4 fx4Var = fx4.a;
        x22 x22Var = x22.a;
        tw twVar = tw.a;
        return new KSerializer[]{fx4Var, fx4Var, fx4Var, zr2.a, fx4Var, x22Var, x22Var, xy0.a, x22Var, x22Var, twVar, twVar, twVar, x22Var, twVar, x22Var, twVar};
    }

    @Override // kotlinx.serialization.KSerializer
    public final DanmakuItem deserialize(Decoder decoder) {
        int i;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        le0 c = decoder.c(serialDescriptor);
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i7 = 0;
        boolean z4 = false;
        int i8 = 0;
        boolean z5 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        long j = 0;
        double d = 0.0d;
        boolean z6 = true;
        while (z6) {
            int v = c.v(serialDescriptor);
            switch (v) {
                case -1:
                    z6 = false;
                    continue;
                case 0:
                    str = c.t(serialDescriptor, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    str2 = c.t(serialDescriptor, 1);
                    i2 |= 2;
                    continue;
                case 2:
                    str3 = c.t(serialDescriptor, 2);
                    i2 |= 4;
                    continue;
                case 3:
                    j = c.h(serialDescriptor, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    str4 = c.t(serialDescriptor, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    i3 = c.o(serialDescriptor, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    i4 = c.o(serialDescriptor, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    d = c.z(serialDescriptor, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    i5 = c.o(serialDescriptor, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    i6 = c.o(serialDescriptor, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    z = c.r(serialDescriptor, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    z2 = c.r(serialDescriptor, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    z3 = c.r(serialDescriptor, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    i7 = c.o(serialDescriptor, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    z4 = c.r(serialDescriptor, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    i8 = c.o(serialDescriptor, 15);
                    i = 32768;
                    break;
                case 16:
                    z5 = c.r(serialDescriptor, 16);
                    i = 65536;
                    break;
                default:
                    y9.f(v);
                    return null;
            }
            i2 |= i;
        }
        c.a(serialDescriptor);
        return new DanmakuItem(i2, str, str2, str3, j, str4, i3, i4, d, i5, i6, z, z2, z3, i7, z4, i8, z5, (yj4) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, DanmakuItem danmakuItem) {
        encoder.getClass();
        danmakuItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        me0 c = encoder.c(serialDescriptor);
        DanmakuItem.write$Self$app(danmakuItem, c, serialDescriptor);
        c.a(serialDescriptor);
    }

    @Override // defpackage.cp1
    public KSerializer[] typeParametersSerializers() {
        return o7.q;
    }
}

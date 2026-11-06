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
public final /* synthetic */ class RoomViewStats$$serializer implements cp1 {
    public static final int $stable = 0;
    public static final RoomViewStats$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RoomViewStats$$serializer roomViewStats$$serializer = new RoomViewStats$$serializer();
        INSTANCE = roomViewStats$$serializer;
        ip3 ip3Var = new ip3("com.github.mytv.dv.model.RoomViewStats", roomViewStats$$serializer, 11);
        ip3Var.k("is_hidden", true);
        ip3Var.k("display_short", true);
        ip3Var.k("display_middle", true);
        ip3Var.k("display_long", true);
        ip3Var.k("display_value", true);
        ip3Var.k("display_version", true);
        ip3Var.k("incremental", true);
        ip3Var.k("display_type", true);
        ip3Var.k("display_short_anchor", true);
        ip3Var.k("display_middle_anchor", true);
        ip3Var.k("display_long_anchor", true);
        descriptor = ip3Var;
    }

    private RoomViewStats$$serializer() {
    }

    @Override // defpackage.cp1
    public final KSerializer[] childSerializers() {
        FlexibleBooleanSerializer flexibleBooleanSerializer = FlexibleBooleanSerializer.INSTANCE;
        fx4 fx4Var = fx4.a;
        FlexibleLongSerializer flexibleLongSerializer = FlexibleLongSerializer.INSTANCE;
        return new KSerializer[]{flexibleBooleanSerializer, fx4Var, fx4Var, fx4Var, flexibleLongSerializer, flexibleLongSerializer, flexibleBooleanSerializer, FlexibleIntSerializer.INSTANCE, fx4Var, fx4Var, fx4Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final RoomViewStats deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        le0 c = decoder.c(serialDescriptor);
        RoomViewStats roomViewStats = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        long j = 0;
        long j2 = 0;
        boolean z3 = true;
        while (z3) {
            int v = c.v(serialDescriptor);
            switch (v) {
                case -1:
                    z3 = false;
                    continue;
                case 0:
                    z = ((Boolean) c.A(serialDescriptor, 0, FlexibleBooleanSerializer.INSTANCE, Boolean.valueOf(z))).booleanValue();
                    i |= 1;
                    break;
                case 1:
                    str = c.t(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = c.t(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = c.t(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    j = ((Number) c.A(serialDescriptor, 4, FlexibleLongSerializer.INSTANCE, Long.valueOf(j))).longValue();
                    i |= 16;
                    break;
                case 5:
                    j2 = ((Number) c.A(serialDescriptor, 5, FlexibleLongSerializer.INSTANCE, Long.valueOf(j2))).longValue();
                    i |= 32;
                    break;
                case 6:
                    z2 = ((Boolean) c.A(serialDescriptor, 6, FlexibleBooleanSerializer.INSTANCE, Boolean.valueOf(z2))).booleanValue();
                    i |= 64;
                    break;
                case 7:
                    i2 = ((Number) c.A(serialDescriptor, 7, FlexibleIntSerializer.INSTANCE, Integer.valueOf(i2))).intValue();
                    i |= 128;
                    break;
                case 8:
                    str4 = c.t(serialDescriptor, 8);
                    i |= 256;
                    continue;
                case 9:
                    str5 = c.t(serialDescriptor, 9);
                    i |= 512;
                    continue;
                case 10:
                    str6 = c.t(serialDescriptor, 10);
                    i |= 1024;
                    continue;
                default:
                    y9.f(v);
                    return roomViewStats;
            }
            roomViewStats = null;
        }
        c.a(serialDescriptor);
        return new RoomViewStats(i, z, str, str2, str3, j, j2, z2, i2, str4, str5, str6, (yj4) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, RoomViewStats roomViewStats) {
        encoder.getClass();
        roomViewStats.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        me0 c = encoder.c(serialDescriptor);
        RoomViewStats.write$Self$app(roomViewStats, c, serialDescriptor);
        c.a(serialDescriptor);
    }

    @Override // defpackage.cp1
    public KSerializer[] typeParametersSerializers() {
        return o7.q;
    }
}

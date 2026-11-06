package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.er0;
import defpackage.j42;
import defpackage.me0;
import defpackage.r7;
import defpackage.yj4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class LogPb {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String imprId;

    public /* synthetic */ LogPb(int i, String str, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.imprId = "";
        } else {
            this.imprId = str;
        }
    }

    public static /* synthetic */ LogPb copy$default(LogPb logPb, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = logPb.imprId;
        }
        return logPb.copy(str);
    }

    public static final /* synthetic */ void write$Self$app(LogPb logPb, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (!me0Var.q(serialDescriptor) && j42.c(logPb.imprId, "")) {
            return;
        }
        ((ax4) me0Var).E(serialDescriptor, 0, logPb.imprId);
    }

    public final String component1() {
        return this.imprId;
    }

    public final LogPb copy(String str) {
        str.getClass();
        return new LogPb(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LogPb) && j42.c(this.imprId, ((LogPb) obj).imprId);
    }

    public final String getImprId() {
        return this.imprId;
    }

    public int hashCode() {
        return this.imprId.hashCode();
    }

    public String toString() {
        return r7.C("LogPb(imprId=", this.imprId, ")");
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return LogPb$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LogPb() {
        this((String) null, 1, (er0) (0 == true ? 1 : 0));
    }

    public LogPb(String str) {
        str.getClass();
        this.imprId = str;
    }

    public /* synthetic */ LogPb(String str, int i, er0 er0Var) {
        this((i & 1) != 0 ? "" : str);
    }

    public static /* synthetic */ void getImprId$annotations() {
    }
}

package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.er0;
import defpackage.fx4;
import defpackage.hf1;
import defpackage.j42;
import defpackage.me0;
import defpackage.r7;
import defpackage.yj4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class LiveStreamQuality {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int level;
    private final String name;
    private final String resolution;
    private final String sdkKey;
    private final String vCodec;

    public /* synthetic */ LiveStreamQuality(int i, int i2, String str, String str2, String str3, String str4, yj4 yj4Var) {
        this.level = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.sdkKey = "";
        } else {
            this.sdkKey = str;
        }
        if ((i & 4) == 0) {
            this.vCodec = null;
        } else {
            this.vCodec = str2;
        }
        if ((i & 8) == 0) {
            this.name = "";
        } else {
            this.name = str3;
        }
        if ((i & 16) == 0) {
            this.resolution = "";
        } else {
            this.resolution = str4;
        }
    }

    public static /* synthetic */ LiveStreamQuality copy$default(LiveStreamQuality liveStreamQuality, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = liveStreamQuality.level;
        }
        if ((i2 & 2) != 0) {
            str = liveStreamQuality.sdkKey;
        }
        if ((i2 & 4) != 0) {
            str2 = liveStreamQuality.vCodec;
        }
        if ((i2 & 8) != 0) {
            str3 = liveStreamQuality.name;
        }
        if ((i2 & 16) != 0) {
            str4 = liveStreamQuality.resolution;
        }
        String str5 = str4;
        String str6 = str2;
        return liveStreamQuality.copy(i, str, str6, str3, str5);
    }

    public static final /* synthetic */ void write$Self$app(LiveStreamQuality liveStreamQuality, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || liveStreamQuality.level != 0) {
            ((ax4) me0Var).C(serialDescriptor, 0, FlexibleIntSerializer.INSTANCE, Integer.valueOf(liveStreamQuality.level));
        }
        if (me0Var.q(serialDescriptor) || !j42.c(liveStreamQuality.sdkKey, "")) {
            ((ax4) me0Var).E(serialDescriptor, 1, liveStreamQuality.sdkKey);
        }
        if (me0Var.q(serialDescriptor) || liveStreamQuality.vCodec != null) {
            me0Var.k(serialDescriptor, 2, fx4.a, liveStreamQuality.vCodec);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(liveStreamQuality.name, "")) {
            ((ax4) me0Var).E(serialDescriptor, 3, liveStreamQuality.name);
        }
        if (!me0Var.q(serialDescriptor) && j42.c(liveStreamQuality.resolution, "")) {
            return;
        }
        ((ax4) me0Var).E(serialDescriptor, 4, liveStreamQuality.resolution);
    }

    public final int component1() {
        return this.level;
    }

    public final String component2() {
        return this.sdkKey;
    }

    public final String component3() {
        return this.vCodec;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.resolution;
    }

    public final LiveStreamQuality copy(int i, String str, String str2, String str3, String str4) {
        str.getClass();
        str3.getClass();
        str4.getClass();
        return new LiveStreamQuality(i, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveStreamQuality)) {
            return false;
        }
        LiveStreamQuality liveStreamQuality = (LiveStreamQuality) obj;
        return this.level == liveStreamQuality.level && j42.c(this.sdkKey, liveStreamQuality.sdkKey) && j42.c(this.vCodec, liveStreamQuality.vCodec) && j42.c(this.name, liveStreamQuality.name) && j42.c(this.resolution, liveStreamQuality.resolution);
    }

    public final int getLevel() {
        return this.level;
    }

    public final String getName() {
        return this.name;
    }

    public final String getResolution() {
        return this.resolution;
    }

    public final String getSdkKey() {
        return this.sdkKey;
    }

    public final String getVCodec() {
        return this.vCodec;
    }

    public int hashCode() {
        int n = hf1.n(this.level * 31, 31, this.sdkKey);
        String str = this.vCodec;
        return this.resolution.hashCode() + hf1.n((n + (str == null ? 0 : str.hashCode())) * 31, 31, this.name);
    }

    public String toString() {
        int i = this.level;
        String str = this.sdkKey;
        String str2 = this.vCodec;
        String str3 = this.name;
        String str4 = this.resolution;
        StringBuilder sb = new StringBuilder("LiveStreamQuality(level=");
        sb.append(i);
        sb.append(", sdkKey=");
        sb.append(str);
        sb.append(", vCodec=");
        r7.N(sb, str2, ", name=", str3, ", resolution=");
        return hf1.z(sb, str4, ")");
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return LiveStreamQuality$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getLevel$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static /* synthetic */ void getResolution$annotations() {
    }

    public static /* synthetic */ void getSdkKey$annotations() {
    }

    public static /* synthetic */ void getVCodec$annotations() {
    }

    public LiveStreamQuality() {
        this(0, (String) null, (String) null, (String) null, (String) null, 31, (er0) null);
    }

    public LiveStreamQuality(int i, String str, String str2, String str3, String str4) {
        str.getClass();
        str3.getClass();
        str4.getClass();
        this.level = i;
        this.sdkKey = str;
        this.vCodec = str2;
        this.name = str3;
        this.resolution = str4;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ LiveStreamQuality(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7, defpackage.er0 r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L5
            r2 = 0
        L5:
            r8 = r7 & 2
            java.lang.String r0 = ""
            if (r8 == 0) goto Lc
            r3 = r0
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L11
            r4 = 0
        L11:
            r8 = r7 & 8
            if (r8 == 0) goto L16
            r5 = r0
        L16:
            r7 = r7 & 16
            if (r7 == 0) goto L21
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L27
        L21:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L27:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.model.LiveStreamQuality.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, er0):void");
    }
}

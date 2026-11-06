package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.er0;
import defpackage.hf1;
import defpackage.j42;
import defpackage.me0;
import defpackage.r7;
import defpackage.yj4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class CameraInfo {
    private final String cameraIdStr;
    private final int cameraType;
    private final StreamUrl streamInfo;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ CameraInfo(int i, String str, String str2, int i2, StreamUrl streamUrl, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.cameraIdStr = "";
        } else {
            this.cameraIdStr = str;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.cameraType = 0;
        } else {
            this.cameraType = i2;
        }
        if ((i & 8) == 0) {
            this.streamInfo = null;
        } else {
            this.streamInfo = streamUrl;
        }
    }

    public static /* synthetic */ CameraInfo copy$default(CameraInfo cameraInfo, String str, String str2, int i, StreamUrl streamUrl, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cameraInfo.cameraIdStr;
        }
        if ((i2 & 2) != 0) {
            str2 = cameraInfo.title;
        }
        if ((i2 & 4) != 0) {
            i = cameraInfo.cameraType;
        }
        if ((i2 & 8) != 0) {
            streamUrl = cameraInfo.streamInfo;
        }
        return cameraInfo.copy(str, str2, i, streamUrl);
    }

    public static final /* synthetic */ void write$Self$app(CameraInfo cameraInfo, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || !j42.c(cameraInfo.cameraIdStr, "")) {
            ((ax4) me0Var).E(serialDescriptor, 0, cameraInfo.cameraIdStr);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(cameraInfo.title, "")) {
            ((ax4) me0Var).E(serialDescriptor, 1, cameraInfo.title);
        }
        if (me0Var.q(serialDescriptor) || cameraInfo.cameraType != 0) {
            ((ax4) me0Var).A(serialDescriptor, 2, cameraInfo.cameraType);
        }
        if (!me0Var.q(serialDescriptor) && cameraInfo.streamInfo == null) {
            return;
        }
        me0Var.k(serialDescriptor, 3, StreamUrl$$serializer.INSTANCE, cameraInfo.streamInfo);
    }

    public final String component1() {
        return this.cameraIdStr;
    }

    public final String component2() {
        return this.title;
    }

    public final int component3() {
        return this.cameraType;
    }

    public final StreamUrl component4() {
        return this.streamInfo;
    }

    public final CameraInfo copy(String str, String str2, int i, StreamUrl streamUrl) {
        str.getClass();
        str2.getClass();
        return new CameraInfo(str, str2, i, streamUrl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraInfo)) {
            return false;
        }
        CameraInfo cameraInfo = (CameraInfo) obj;
        return j42.c(this.cameraIdStr, cameraInfo.cameraIdStr) && j42.c(this.title, cameraInfo.title) && this.cameraType == cameraInfo.cameraType && j42.c(this.streamInfo, cameraInfo.streamInfo);
    }

    public final String getCameraIdStr() {
        return this.cameraIdStr;
    }

    public final int getCameraType() {
        return this.cameraType;
    }

    public final StreamUrl getStreamInfo() {
        return this.streamInfo;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int n = (hf1.n(this.cameraIdStr.hashCode() * 31, 31, this.title) + this.cameraType) * 31;
        StreamUrl streamUrl = this.streamInfo;
        return n + (streamUrl == null ? 0 : streamUrl.hashCode());
    }

    public String toString() {
        String str = this.cameraIdStr;
        String str2 = this.title;
        int i = this.cameraType;
        StreamUrl streamUrl = this.streamInfo;
        StringBuilder F = r7.F("CameraInfo(cameraIdStr=", str, ", title=", str2, ", cameraType=");
        F.append(i);
        F.append(", streamInfo=");
        F.append(streamUrl);
        F.append(")");
        return F.toString();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return CameraInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getCameraIdStr$annotations() {
    }

    public static /* synthetic */ void getCameraType$annotations() {
    }

    public static /* synthetic */ void getStreamInfo$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public CameraInfo() {
        this((String) null, (String) null, 0, (StreamUrl) null, 15, (er0) null);
    }

    public CameraInfo(String str, String str2, int i, StreamUrl streamUrl) {
        str.getClass();
        str2.getClass();
        this.cameraIdStr = str;
        this.title = str2;
        this.cameraType = i;
        this.streamInfo = streamUrl;
    }

    public /* synthetic */ CameraInfo(String str, String str2, int i, StreamUrl streamUrl, int i2, er0 er0Var) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : streamUrl);
    }
}

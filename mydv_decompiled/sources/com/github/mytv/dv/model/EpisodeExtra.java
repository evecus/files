package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.dh2;
import defpackage.er0;
import defpackage.hf1;
import defpackage.j42;
import defpackage.me0;
import defpackage.sp;
import defpackage.u7;
import defpackage.uc2;
import defpackage.ut0;
import defpackage.yj4;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class EpisodeExtra {
    private final List<CameraInfo> cameraInfos;
    private final String cameraInfosTableTitle;
    private final String defaultCameraIdStr;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final uc2[] $childSerializers = {ut0.K(dh2.I, new u7((byte) 21)), null, null};

    public /* synthetic */ EpisodeExtra(int i, List list, String str, String str2, yj4 yj4Var) {
        this.cameraInfos = (i & 1) == 0 ? null : list;
        if ((i & 2) == 0) {
            this.defaultCameraIdStr = "";
        } else {
            this.defaultCameraIdStr = str;
        }
        if ((i & 4) == 0) {
            this.cameraInfosTableTitle = "";
        } else {
            this.cameraInfosTableTitle = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new sp(CameraInfo$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EpisodeExtra copy$default(EpisodeExtra episodeExtra, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = episodeExtra.cameraInfos;
        }
        if ((i & 2) != 0) {
            str = episodeExtra.defaultCameraIdStr;
        }
        if ((i & 4) != 0) {
            str2 = episodeExtra.cameraInfosTableTitle;
        }
        return episodeExtra.copy(list, str, str2);
    }

    public static final /* synthetic */ void write$Self$app(EpisodeExtra episodeExtra, me0 me0Var, SerialDescriptor serialDescriptor) {
        uc2[] uc2VarArr = $childSerializers;
        if (me0Var.q(serialDescriptor) || episodeExtra.cameraInfos != null) {
            me0Var.k(serialDescriptor, 0, (KSerializer) uc2VarArr[0].getValue(), episodeExtra.cameraInfos);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(episodeExtra.defaultCameraIdStr, "")) {
            ((ax4) me0Var).E(serialDescriptor, 1, episodeExtra.defaultCameraIdStr);
        }
        if (!me0Var.q(serialDescriptor) && j42.c(episodeExtra.cameraInfosTableTitle, "")) {
            return;
        }
        ((ax4) me0Var).E(serialDescriptor, 2, episodeExtra.cameraInfosTableTitle);
    }

    public final List<CameraInfo> component1() {
        return this.cameraInfos;
    }

    public final String component2() {
        return this.defaultCameraIdStr;
    }

    public final String component3() {
        return this.cameraInfosTableTitle;
    }

    public final EpisodeExtra copy(List<CameraInfo> list, String str, String str2) {
        str.getClass();
        str2.getClass();
        return new EpisodeExtra(list, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpisodeExtra)) {
            return false;
        }
        EpisodeExtra episodeExtra = (EpisodeExtra) obj;
        return j42.c(this.cameraInfos, episodeExtra.cameraInfos) && j42.c(this.defaultCameraIdStr, episodeExtra.defaultCameraIdStr) && j42.c(this.cameraInfosTableTitle, episodeExtra.cameraInfosTableTitle);
    }

    public final List<CameraInfo> getCameraInfos() {
        return this.cameraInfos;
    }

    public final String getCameraInfosTableTitle() {
        return this.cameraInfosTableTitle;
    }

    public final String getDefaultCameraIdStr() {
        return this.defaultCameraIdStr;
    }

    public int hashCode() {
        List<CameraInfo> list = this.cameraInfos;
        return this.cameraInfosTableTitle.hashCode() + hf1.n((list == null ? 0 : list.hashCode()) * 31, 31, this.defaultCameraIdStr);
    }

    public String toString() {
        List<CameraInfo> list = this.cameraInfos;
        String str = this.defaultCameraIdStr;
        String str2 = this.cameraInfosTableTitle;
        StringBuilder sb = new StringBuilder("EpisodeExtra(cameraInfos=");
        sb.append(list);
        sb.append(", defaultCameraIdStr=");
        sb.append(str);
        sb.append(", cameraInfosTableTitle=");
        return hf1.z(sb, str2, ")");
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return EpisodeExtra$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getCameraInfos$annotations() {
    }

    public static /* synthetic */ void getCameraInfosTableTitle$annotations() {
    }

    public static /* synthetic */ void getDefaultCameraIdStr$annotations() {
    }

    public EpisodeExtra() {
        this((List) null, (String) null, (String) null, 7, (er0) null);
    }

    public EpisodeExtra(List<CameraInfo> list, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.cameraInfos = list;
        this.defaultCameraIdStr = str;
        this.cameraInfosTableTitle = str2;
    }

    public /* synthetic */ EpisodeExtra(List list, String str, String str2, int i, er0 er0Var) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}

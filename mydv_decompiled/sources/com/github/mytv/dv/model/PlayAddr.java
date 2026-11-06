package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.dh2;
import defpackage.er0;
import defpackage.fx4;
import defpackage.gw2;
import defpackage.hf1;
import defpackage.i82;
import defpackage.j42;
import defpackage.me0;
import defpackage.o91;
import defpackage.r7;
import defpackage.sp;
import defpackage.uc2;
import defpackage.ut0;
import defpackage.yj4;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class PlayAddr {
    private final long dataSize;
    private final int height;
    private final String uri;
    private final List<String> urlList;
    private final int width;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final uc2[] $childSerializers = {ut0.K(dh2.I, new gw2(15)), null, null, null, null};

    public /* synthetic */ PlayAddr(int i, List list, String str, int i2, int i3, long j, yj4 yj4Var) {
        this.urlList = (i & 1) == 0 ? o91.I : list;
        if ((i & 2) == 0) {
            this.uri = "";
        } else {
            this.uri = str;
        }
        if ((i & 4) == 0) {
            this.width = 0;
        } else {
            this.width = i2;
        }
        if ((i & 8) == 0) {
            this.height = 0;
        } else {
            this.height = i3;
        }
        if ((i & 16) == 0) {
            this.dataSize = 0L;
        } else {
            this.dataSize = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new sp(fx4.a);
    }

    public static /* synthetic */ PlayAddr copy$default(PlayAddr playAddr, List list, String str, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = playAddr.urlList;
        }
        if ((i3 & 2) != 0) {
            str = playAddr.uri;
        }
        if ((i3 & 4) != 0) {
            i = playAddr.width;
        }
        if ((i3 & 8) != 0) {
            i2 = playAddr.height;
        }
        if ((i3 & 16) != 0) {
            j = playAddr.dataSize;
        }
        long j2 = j;
        return playAddr.copy(list, str, i, i2, j2);
    }

    public static final /* synthetic */ void write$Self$app(PlayAddr playAddr, me0 me0Var, SerialDescriptor serialDescriptor) {
        uc2[] uc2VarArr = $childSerializers;
        if (me0Var.q(serialDescriptor) || !j42.c(playAddr.urlList, o91.I)) {
            ((ax4) me0Var).C(serialDescriptor, 0, (KSerializer) uc2VarArr[0].getValue(), playAddr.urlList);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(playAddr.uri, "")) {
            ((ax4) me0Var).E(serialDescriptor, 1, playAddr.uri);
        }
        if (me0Var.q(serialDescriptor) || playAddr.width != 0) {
            ((ax4) me0Var).A(serialDescriptor, 2, playAddr.width);
        }
        if (me0Var.q(serialDescriptor) || playAddr.height != 0) {
            ((ax4) me0Var).A(serialDescriptor, 3, playAddr.height);
        }
        if (!me0Var.q(serialDescriptor) && playAddr.dataSize == 0) {
            return;
        }
        ((ax4) me0Var).B(serialDescriptor, 4, playAddr.dataSize);
    }

    public final List<String> component1() {
        return this.urlList;
    }

    public final String component2() {
        return this.uri;
    }

    public final int component3() {
        return this.width;
    }

    public final int component4() {
        return this.height;
    }

    public final long component5() {
        return this.dataSize;
    }

    public final PlayAddr copy(List<String> list, String str, int i, int i2, long j) {
        list.getClass();
        str.getClass();
        return new PlayAddr(list, str, i, i2, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayAddr)) {
            return false;
        }
        PlayAddr playAddr = (PlayAddr) obj;
        return j42.c(this.urlList, playAddr.urlList) && j42.c(this.uri, playAddr.uri) && this.width == playAddr.width && this.height == playAddr.height && this.dataSize == playAddr.dataSize;
    }

    public final long getDataSize() {
        return this.dataSize;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getUri() {
        return this.uri;
    }

    public final List<String> getUrlList() {
        return this.urlList;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return i82.Q(this.dataSize) + ((((hf1.n(this.urlList.hashCode() * 31, 31, this.uri) + this.width) * 31) + this.height) * 31);
    }

    public String toString() {
        List<String> list = this.urlList;
        String str = this.uri;
        int i = this.width;
        int i2 = this.height;
        long j = this.dataSize;
        StringBuilder sb = new StringBuilder("PlayAddr(urlList=");
        sb.append(list);
        sb.append(", uri=");
        sb.append(str);
        sb.append(", width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        sb.append(", dataSize=");
        return r7.D(sb, j, ")");
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return PlayAddr$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getDataSize$annotations() {
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getUri$annotations() {
    }

    public static /* synthetic */ void getUrlList$annotations() {
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    public PlayAddr() {
        this((List) null, (String) null, 0, 0, 0L, 31, (er0) null);
    }

    public PlayAddr(List<String> list, String str, int i, int i2, long j) {
        list.getClass();
        str.getClass();
        this.urlList = list;
        this.uri = str;
        this.width = i;
        this.height = i2;
        this.dataSize = j;
    }

    public /* synthetic */ PlayAddr(List list, String str, int i, int i2, long j, int i3, er0 er0Var) {
        this((i3 & 1) != 0 ? o91.I : list, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? 0L : j);
    }
}

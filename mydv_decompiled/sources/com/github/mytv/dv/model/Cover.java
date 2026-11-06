package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.df0;
import defpackage.dh2;
import defpackage.er0;
import defpackage.fx4;
import defpackage.j42;
import defpackage.me0;
import defpackage.o91;
import defpackage.sp;
import defpackage.uc2;
import defpackage.ut0;
import defpackage.yj4;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Cover {
    private final List<String> urlList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final uc2[] $childSerializers = {ut0.K(dh2.I, new df0(9))};

    public /* synthetic */ Cover(int i, List list, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.urlList = o91.I;
        } else {
            this.urlList = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new sp(fx4.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cover copy$default(Cover cover, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cover.urlList;
        }
        return cover.copy(list);
    }

    public static final /* synthetic */ void write$Self$app(Cover cover, me0 me0Var, SerialDescriptor serialDescriptor) {
        uc2[] uc2VarArr = $childSerializers;
        if (!me0Var.q(serialDescriptor) && j42.c(cover.urlList, o91.I)) {
            return;
        }
        ((ax4) me0Var).C(serialDescriptor, 0, (KSerializer) uc2VarArr[0].getValue(), cover.urlList);
    }

    public final List<String> component1() {
        return this.urlList;
    }

    public final Cover copy(List<String> list) {
        list.getClass();
        return new Cover(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Cover) && j42.c(this.urlList, ((Cover) obj).urlList);
    }

    public final List<String> getUrlList() {
        return this.urlList;
    }

    public int hashCode() {
        return this.urlList.hashCode();
    }

    public String toString() {
        return "Cover(urlList=" + this.urlList + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return Cover$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Cover() {
        this((List) null, 1, (er0) (0 == true ? 1 : 0));
    }

    public Cover(List<String> list) {
        list.getClass();
        this.urlList = list;
    }

    public /* synthetic */ Cover(List list, int i, er0 er0Var) {
        this((i & 1) != 0 ? o91.I : list);
    }

    public static /* synthetic */ void getUrlList$annotations() {
    }
}

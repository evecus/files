package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.dh2;
import defpackage.er0;
import defpackage.fx4;
import defpackage.j42;
import defpackage.me0;
import defpackage.o91;
import defpackage.sp;
import defpackage.tg5;
import defpackage.uc2;
import defpackage.ut0;
import defpackage.yj4;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class VideoBigThumb {
    private final int imgNum;
    private final List<String> imgUrls;
    private final int imgXLen;
    private final int imgXSize;
    private final int imgYLen;
    private final int imgYSize;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final uc2[] $childSerializers = {ut0.K(dh2.I, new tg5(4)), null, null, null, null, null};

    public /* synthetic */ VideoBigThumb(int i, List list, int i2, int i3, int i4, int i5, int i6, yj4 yj4Var) {
        this.imgUrls = (i & 1) == 0 ? o91.I : list;
        if ((i & 2) == 0) {
            this.imgXSize = 0;
        } else {
            this.imgXSize = i2;
        }
        if ((i & 4) == 0) {
            this.imgYSize = 0;
        } else {
            this.imgYSize = i3;
        }
        if ((i & 8) == 0) {
            this.imgXLen = 0;
        } else {
            this.imgXLen = i4;
        }
        if ((i & 16) == 0) {
            this.imgYLen = 0;
        } else {
            this.imgYLen = i5;
        }
        if ((i & 32) == 0) {
            this.imgNum = 0;
        } else {
            this.imgNum = i6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new sp(fx4.a);
    }

    public static /* synthetic */ VideoBigThumb copy$default(VideoBigThumb videoBigThumb, List list, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            list = videoBigThumb.imgUrls;
        }
        if ((i6 & 2) != 0) {
            i = videoBigThumb.imgXSize;
        }
        if ((i6 & 4) != 0) {
            i2 = videoBigThumb.imgYSize;
        }
        if ((i6 & 8) != 0) {
            i3 = videoBigThumb.imgXLen;
        }
        if ((i6 & 16) != 0) {
            i4 = videoBigThumb.imgYLen;
        }
        if ((i6 & 32) != 0) {
            i5 = videoBigThumb.imgNum;
        }
        int i7 = i4;
        int i8 = i5;
        return videoBigThumb.copy(list, i, i2, i3, i7, i8);
    }

    public static final /* synthetic */ void write$Self$app(VideoBigThumb videoBigThumb, me0 me0Var, SerialDescriptor serialDescriptor) {
        uc2[] uc2VarArr = $childSerializers;
        if (me0Var.q(serialDescriptor) || !j42.c(videoBigThumb.imgUrls, o91.I)) {
            ((ax4) me0Var).C(serialDescriptor, 0, (KSerializer) uc2VarArr[0].getValue(), videoBigThumb.imgUrls);
        }
        if (me0Var.q(serialDescriptor) || videoBigThumb.imgXSize != 0) {
            ((ax4) me0Var).C(serialDescriptor, 1, FlexibleIntSerializer.INSTANCE, Integer.valueOf(videoBigThumb.imgXSize));
        }
        if (me0Var.q(serialDescriptor) || videoBigThumb.imgYSize != 0) {
            ((ax4) me0Var).C(serialDescriptor, 2, FlexibleIntSerializer.INSTANCE, Integer.valueOf(videoBigThumb.imgYSize));
        }
        if (me0Var.q(serialDescriptor) || videoBigThumb.imgXLen != 0) {
            ((ax4) me0Var).C(serialDescriptor, 3, FlexibleIntSerializer.INSTANCE, Integer.valueOf(videoBigThumb.imgXLen));
        }
        if (me0Var.q(serialDescriptor) || videoBigThumb.imgYLen != 0) {
            ((ax4) me0Var).C(serialDescriptor, 4, FlexibleIntSerializer.INSTANCE, Integer.valueOf(videoBigThumb.imgYLen));
        }
        if (!me0Var.q(serialDescriptor) && videoBigThumb.imgNum == 0) {
            return;
        }
        ((ax4) me0Var).C(serialDescriptor, 5, FlexibleIntSerializer.INSTANCE, Integer.valueOf(videoBigThumb.imgNum));
    }

    public final List<String> component1() {
        return this.imgUrls;
    }

    public final int component2() {
        return this.imgXSize;
    }

    public final int component3() {
        return this.imgYSize;
    }

    public final int component4() {
        return this.imgXLen;
    }

    public final int component5() {
        return this.imgYLen;
    }

    public final int component6() {
        return this.imgNum;
    }

    public final VideoBigThumb copy(List<String> list, int i, int i2, int i3, int i4, int i5) {
        list.getClass();
        return new VideoBigThumb(list, i, i2, i3, i4, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoBigThumb)) {
            return false;
        }
        VideoBigThumb videoBigThumb = (VideoBigThumb) obj;
        return j42.c(this.imgUrls, videoBigThumb.imgUrls) && this.imgXSize == videoBigThumb.imgXSize && this.imgYSize == videoBigThumb.imgYSize && this.imgXLen == videoBigThumb.imgXLen && this.imgYLen == videoBigThumb.imgYLen && this.imgNum == videoBigThumb.imgNum;
    }

    public final int getImgNum() {
        return this.imgNum;
    }

    public final List<String> getImgUrls() {
        return this.imgUrls;
    }

    public final int getImgXLen() {
        return this.imgXLen;
    }

    public final int getImgXSize() {
        return this.imgXSize;
    }

    public final int getImgYLen() {
        return this.imgYLen;
    }

    public final int getImgYSize() {
        return this.imgYSize;
    }

    public int hashCode() {
        return (((((((((this.imgUrls.hashCode() * 31) + this.imgXSize) * 31) + this.imgYSize) * 31) + this.imgXLen) * 31) + this.imgYLen) * 31) + this.imgNum;
    }

    public final boolean isRenderable() {
        return !this.imgUrls.isEmpty() && this.imgNum > 0 && this.imgXLen > 0 && this.imgYLen > 0;
    }

    public String toString() {
        return "VideoBigThumb(imgUrls=" + this.imgUrls + ", imgXSize=" + this.imgXSize + ", imgYSize=" + this.imgYSize + ", imgXLen=" + this.imgXLen + ", imgYLen=" + this.imgYLen + ", imgNum=" + this.imgNum + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return VideoBigThumb$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getImgNum$annotations() {
    }

    public static /* synthetic */ void getImgUrls$annotations() {
    }

    public static /* synthetic */ void getImgXLen$annotations() {
    }

    public static /* synthetic */ void getImgXSize$annotations() {
    }

    public static /* synthetic */ void getImgYLen$annotations() {
    }

    public static /* synthetic */ void getImgYSize$annotations() {
    }

    public VideoBigThumb() {
        this((List) null, 0, 0, 0, 0, 0, 63, (er0) null);
    }

    public VideoBigThumb(List<String> list, int i, int i2, int i3, int i4, int i5) {
        list.getClass();
        this.imgUrls = list;
        this.imgXSize = i;
        this.imgYSize = i2;
        this.imgXLen = i3;
        this.imgYLen = i4;
        this.imgNum = i5;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ VideoBigThumb(java.util.List r2, int r3, int r4, int r5, int r6, int r7, int r8, defpackage.er0 r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            o91 r2 = defpackage.o91.I
        L6:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto Lc
            r3 = r0
        Lc:
            r9 = r8 & 4
            if (r9 == 0) goto L11
            r4 = r0
        L11:
            r9 = r8 & 8
            if (r9 == 0) goto L16
            r5 = r0
        L16:
            r9 = r8 & 16
            if (r9 == 0) goto L1b
            r6 = r0
        L1b:
            r8 = r8 & 32
            if (r8 == 0) goto L27
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2e
        L27:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2e:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.model.VideoBigThumb.<init>(java.util.List, int, int, int, int, int, int, er0):void");
    }
}

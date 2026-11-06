package com.github.mytv.dv.model;

import defpackage.an2;
import defpackage.er0;
import defpackage.j42;
import defpackage.jp0;
import defpackage.o91;
import defpackage.pt1;
import defpackage.ut0;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class LiveDanmakuSettings {
    public static final int $stable = 8;
    private final boolean blockEnabled;
    private final List<String> blockWords;
    private final int displayAreaPercent;
    private final boolean emojiEnabled;
    private final boolean enabled;
    private final boolean filterPackageComment;
    private final float fontSize;
    private final float horizontalSpacingScale;
    private final float opacity;
    private final float speed;
    private final an2 style;
    private final float verticalSpacingScale;

    public /* synthetic */ LiveDanmakuSettings(boolean z, boolean z2, an2 an2Var, float f, float f2, float f3, int i, float f4, float f5, boolean z3, boolean z4, List list, int i2, er0 er0Var) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? true : z2, (i2 & 4) != 0 ? an2.K : an2Var, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? 1.0f : f2, (i2 & 32) != 0 ? 0.8f : f3, (i2 & 64) != 0 ? 50 : i, (i2 & 128) != 0 ? 1.0f : f4, (i2 & 256) == 0 ? f5 : 1.0f, (i2 & 512) == 0 ? z3 : true, (i2 & 1024) != 0 ? false : z4, (i2 & 2048) != 0 ? o91.I : list);
    }

    public static /* synthetic */ LiveDanmakuSettings copy$default(LiveDanmakuSettings liveDanmakuSettings, boolean z, boolean z2, an2 an2Var, float f, float f2, float f3, int i, float f4, float f5, boolean z3, boolean z4, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = liveDanmakuSettings.enabled;
        }
        if ((i2 & 2) != 0) {
            z2 = liveDanmakuSettings.emojiEnabled;
        }
        if ((i2 & 4) != 0) {
            an2Var = liveDanmakuSettings.style;
        }
        if ((i2 & 8) != 0) {
            f = liveDanmakuSettings.speed;
        }
        if ((i2 & 16) != 0) {
            f2 = liveDanmakuSettings.fontSize;
        }
        if ((i2 & 32) != 0) {
            f3 = liveDanmakuSettings.opacity;
        }
        if ((i2 & 64) != 0) {
            i = liveDanmakuSettings.displayAreaPercent;
        }
        if ((i2 & 128) != 0) {
            f4 = liveDanmakuSettings.verticalSpacingScale;
        }
        if ((i2 & 256) != 0) {
            f5 = liveDanmakuSettings.horizontalSpacingScale;
        }
        if ((i2 & 512) != 0) {
            z3 = liveDanmakuSettings.filterPackageComment;
        }
        if ((i2 & 1024) != 0) {
            z4 = liveDanmakuSettings.blockEnabled;
        }
        if ((i2 & 2048) != 0) {
            list = liveDanmakuSettings.blockWords;
        }
        boolean z5 = z4;
        List list2 = list;
        float f6 = f5;
        boolean z6 = z3;
        int i3 = i;
        float f7 = f4;
        float f8 = f2;
        float f9 = f3;
        return liveDanmakuSettings.copy(z, z2, an2Var, f, f8, f9, i3, f7, f6, z6, z5, list2);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final boolean component10() {
        return this.filterPackageComment;
    }

    public final boolean component11() {
        return this.blockEnabled;
    }

    public final List<String> component12() {
        return this.blockWords;
    }

    public final boolean component2() {
        return this.emojiEnabled;
    }

    public final an2 component3() {
        return this.style;
    }

    public final float component4() {
        return this.speed;
    }

    public final float component5() {
        return this.fontSize;
    }

    public final float component6() {
        return this.opacity;
    }

    public final int component7() {
        return this.displayAreaPercent;
    }

    public final float component8() {
        return this.verticalSpacingScale;
    }

    public final float component9() {
        return this.horizontalSpacingScale;
    }

    public final LiveDanmakuSettings copy(boolean z, boolean z2, an2 an2Var, float f, float f2, float f3, int i, float f4, float f5, boolean z3, boolean z4, List<String> list) {
        an2Var.getClass();
        list.getClass();
        return new LiveDanmakuSettings(z, z2, an2Var, f, f2, f3, i, f4, f5, z3, z4, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveDanmakuSettings)) {
            return false;
        }
        LiveDanmakuSettings liveDanmakuSettings = (LiveDanmakuSettings) obj;
        return this.enabled == liveDanmakuSettings.enabled && this.emojiEnabled == liveDanmakuSettings.emojiEnabled && this.style == liveDanmakuSettings.style && Float.compare(this.speed, liveDanmakuSettings.speed) == 0 && Float.compare(this.fontSize, liveDanmakuSettings.fontSize) == 0 && Float.compare(this.opacity, liveDanmakuSettings.opacity) == 0 && this.displayAreaPercent == liveDanmakuSettings.displayAreaPercent && Float.compare(this.verticalSpacingScale, liveDanmakuSettings.verticalSpacingScale) == 0 && Float.compare(this.horizontalSpacingScale, liveDanmakuSettings.horizontalSpacingScale) == 0 && this.filterPackageComment == liveDanmakuSettings.filterPackageComment && this.blockEnabled == liveDanmakuSettings.blockEnabled && j42.c(this.blockWords, liveDanmakuSettings.blockWords);
    }

    public final boolean getBlockEnabled() {
        return this.blockEnabled;
    }

    public final List<String> getBlockWords() {
        return this.blockWords;
    }

    public final float getDisplayArea() {
        return ut0.r(this.displayAreaPercent, 1, 100) / 100.0f;
    }

    public final int getDisplayAreaPercent() {
        return this.displayAreaPercent;
    }

    public final boolean getEmojiEnabled() {
        return this.emojiEnabled;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getFilterPackageComment() {
        return this.filterPackageComment;
    }

    public final float getFontSize() {
        return this.fontSize;
    }

    public final float getHorizontalSpacingScale() {
        return this.horizontalSpacingScale;
    }

    public final float getOpacity() {
        return this.opacity;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public final an2 getStyle() {
        return this.style;
    }

    public final float getVerticalSpacingScale() {
        return this.verticalSpacingScale;
    }

    public int hashCode() {
        return this.blockWords.hashCode() + ((pt1.o(this.blockEnabled) + ((pt1.o(this.filterPackageComment) + jp0.o(this.horizontalSpacingScale, jp0.o(this.verticalSpacingScale, (jp0.o(this.opacity, jp0.o(this.fontSize, jp0.o(this.speed, (this.style.hashCode() + ((pt1.o(this.emojiEnabled) + (pt1.o(this.enabled) * 31)) * 31)) * 31, 31), 31), 31) + this.displayAreaPercent) * 31, 31), 31)) * 31)) * 31);
    }

    public String toString() {
        return "LiveDanmakuSettings(enabled=" + this.enabled + ", emojiEnabled=" + this.emojiEnabled + ", style=" + this.style + ", speed=" + this.speed + ", fontSize=" + this.fontSize + ", opacity=" + this.opacity + ", displayAreaPercent=" + this.displayAreaPercent + ", verticalSpacingScale=" + this.verticalSpacingScale + ", horizontalSpacingScale=" + this.horizontalSpacingScale + ", filterPackageComment=" + this.filterPackageComment + ", blockEnabled=" + this.blockEnabled + ", blockWords=" + this.blockWords + ")";
    }

    public LiveDanmakuSettings(boolean z, boolean z2, an2 an2Var, float f, float f2, float f3, int i, float f4, float f5, boolean z3, boolean z4, List<String> list) {
        an2Var.getClass();
        list.getClass();
        this.enabled = z;
        this.emojiEnabled = z2;
        this.style = an2Var;
        this.speed = f;
        this.fontSize = f2;
        this.opacity = f3;
        this.displayAreaPercent = i;
        this.verticalSpacingScale = f4;
        this.horizontalSpacingScale = f5;
        this.filterPackageComment = z3;
        this.blockEnabled = z4;
        this.blockWords = list;
    }

    public LiveDanmakuSettings() {
        this(false, false, null, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0.0f, false, false, null, 4095, null);
    }
}

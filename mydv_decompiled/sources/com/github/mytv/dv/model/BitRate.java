package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.er0;
import defpackage.hf1;
import defpackage.j42;
import defpackage.me0;
import defpackage.yj4;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class BitRate {
    private final int bitRateValue;
    private final String format;
    private final int fps;
    private final String gearName;
    private final int isBytevc1;
    private final int isH265;
    private final PlayAddr playAddr;
    private final int qualityType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ BitRate(String str, int i, int i2, int i3, int i4, int i5, String str2, PlayAddr playAddr, int i6, er0 er0Var) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? 0 : i, (i6 & 4) != 0 ? 0 : i2, (i6 & 8) != 0 ? 0 : i3, (i6 & 16) != 0 ? 0 : i4, (i6 & 32) == 0 ? i5 : 0, (i6 & 64) == 0 ? str2 : "", (i6 & 128) != 0 ? new PlayAddr((List) null, (String) null, 0, 0, 0L, 31, (er0) null) : playAddr);
    }

    public static /* synthetic */ BitRate copy$default(BitRate bitRate, String str, int i, int i2, int i3, int i4, int i5, String str2, PlayAddr playAddr, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = bitRate.gearName;
        }
        if ((i6 & 2) != 0) {
            i = bitRate.bitRateValue;
        }
        if ((i6 & 4) != 0) {
            i2 = bitRate.qualityType;
        }
        if ((i6 & 8) != 0) {
            i3 = bitRate.isH265;
        }
        if ((i6 & 16) != 0) {
            i4 = bitRate.isBytevc1;
        }
        if ((i6 & 32) != 0) {
            i5 = bitRate.fps;
        }
        if ((i6 & 64) != 0) {
            str2 = bitRate.format;
        }
        if ((i6 & 128) != 0) {
            playAddr = bitRate.playAddr;
        }
        String str3 = str2;
        PlayAddr playAddr2 = playAddr;
        int i7 = i4;
        int i8 = i5;
        return bitRate.copy(str, i, i2, i3, i7, i8, str3, playAddr2);
    }

    public static final /* synthetic */ void write$Self$app(BitRate bitRate, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || !j42.c(bitRate.gearName, "")) {
            ((ax4) me0Var).E(serialDescriptor, 0, bitRate.gearName);
        }
        if (me0Var.q(serialDescriptor) || bitRate.bitRateValue != 0) {
            ((ax4) me0Var).A(serialDescriptor, 1, bitRate.bitRateValue);
        }
        if (me0Var.q(serialDescriptor) || bitRate.qualityType != 0) {
            ((ax4) me0Var).A(serialDescriptor, 2, bitRate.qualityType);
        }
        if (me0Var.q(serialDescriptor) || bitRate.isH265 != 0) {
            ((ax4) me0Var).A(serialDescriptor, 3, bitRate.isH265);
        }
        if (me0Var.q(serialDescriptor) || bitRate.isBytevc1 != 0) {
            ((ax4) me0Var).A(serialDescriptor, 4, bitRate.isBytevc1);
        }
        if (me0Var.q(serialDescriptor) || bitRate.fps != 0) {
            ((ax4) me0Var).A(serialDescriptor, 5, bitRate.fps);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(bitRate.format, "")) {
            ((ax4) me0Var).E(serialDescriptor, 6, bitRate.format);
        }
        if (!me0Var.q(serialDescriptor)) {
            if (j42.c(bitRate.playAddr, new PlayAddr((List) null, (String) null, 0, 0, 0L, 31, (er0) null))) {
                return;
            }
        }
        ((ax4) me0Var).C(serialDescriptor, 7, PlayAddr$$serializer.INSTANCE, bitRate.playAddr);
    }

    public final String component1() {
        return this.gearName;
    }

    public final int component2() {
        return this.bitRateValue;
    }

    public final int component3() {
        return this.qualityType;
    }

    public final int component4() {
        return this.isH265;
    }

    public final int component5() {
        return this.isBytevc1;
    }

    public final int component6() {
        return this.fps;
    }

    public final String component7() {
        return this.format;
    }

    public final PlayAddr component8() {
        return this.playAddr;
    }

    public final BitRate copy(String str, int i, int i2, int i3, int i4, int i5, String str2, PlayAddr playAddr) {
        str.getClass();
        str2.getClass();
        playAddr.getClass();
        return new BitRate(str, i, i2, i3, i4, i5, str2, playAddr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitRate)) {
            return false;
        }
        BitRate bitRate = (BitRate) obj;
        return j42.c(this.gearName, bitRate.gearName) && this.bitRateValue == bitRate.bitRateValue && this.qualityType == bitRate.qualityType && this.isH265 == bitRate.isH265 && this.isBytevc1 == bitRate.isBytevc1 && this.fps == bitRate.fps && j42.c(this.format, bitRate.format) && j42.c(this.playAddr, bitRate.playAddr);
    }

    public final int getBitRateValue() {
        return this.bitRateValue;
    }

    public final String getFormat() {
        return this.format;
    }

    public final int getFps() {
        return this.fps;
    }

    public final String getGearName() {
        return this.gearName;
    }

    public final PlayAddr getPlayAddr() {
        return this.playAddr;
    }

    public final int getQualityType() {
        return this.qualityType;
    }

    public int hashCode() {
        return this.playAddr.hashCode() + hf1.n(((((((((((this.gearName.hashCode() * 31) + this.bitRateValue) * 31) + this.qualityType) * 31) + this.isH265) * 31) + this.isBytevc1) * 31) + this.fps) * 31, 31, this.format);
    }

    public final int isBytevc1() {
        return this.isBytevc1;
    }

    public final int isH265() {
        return this.isH265;
    }

    public String toString() {
        return "BitRate(gearName=" + this.gearName + ", bitRateValue=" + this.bitRateValue + ", qualityType=" + this.qualityType + ", isH265=" + this.isH265 + ", isBytevc1=" + this.isBytevc1 + ", fps=" + this.fps + ", format=" + this.format + ", playAddr=" + this.playAddr + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return BitRate$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getBitRateValue$annotations() {
    }

    public static /* synthetic */ void getFormat$annotations() {
    }

    public static /* synthetic */ void getFps$annotations() {
    }

    public static /* synthetic */ void getGearName$annotations() {
    }

    public static /* synthetic */ void getPlayAddr$annotations() {
    }

    public static /* synthetic */ void getQualityType$annotations() {
    }

    public static /* synthetic */ void isBytevc1$annotations() {
    }

    public static /* synthetic */ void isH265$annotations() {
    }

    public /* synthetic */ BitRate(int i, String str, int i2, int i3, int i4, int i5, int i6, String str2, PlayAddr playAddr, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.gearName = "";
        } else {
            this.gearName = str;
        }
        if ((i & 2) == 0) {
            this.bitRateValue = 0;
        } else {
            this.bitRateValue = i2;
        }
        if ((i & 4) == 0) {
            this.qualityType = 0;
        } else {
            this.qualityType = i3;
        }
        if ((i & 8) == 0) {
            this.isH265 = 0;
        } else {
            this.isH265 = i4;
        }
        if ((i & 16) == 0) {
            this.isBytevc1 = 0;
        } else {
            this.isBytevc1 = i5;
        }
        if ((i & 32) == 0) {
            this.fps = 0;
        } else {
            this.fps = i6;
        }
        if ((i & 64) == 0) {
            this.format = "";
        } else {
            this.format = str2;
        }
        if ((i & 128) != 0) {
            this.playAddr = playAddr;
            return;
        }
        this.playAddr = new PlayAddr((List) null, (String) null, 0, 0, 0L, 31, (er0) null);
    }

    public BitRate(String str, int i, int i2, int i3, int i4, int i5, String str2, PlayAddr playAddr) {
        str.getClass();
        str2.getClass();
        playAddr.getClass();
        this.gearName = str;
        this.bitRateValue = i;
        this.qualityType = i2;
        this.isH265 = i3;
        this.isBytevc1 = i4;
        this.fps = i5;
        this.format = str2;
        this.playAddr = playAddr;
    }

    public BitRate() {
        this((String) null, 0, 0, 0, 0, 0, (String) null, (PlayAddr) null, 255, (er0) null);
    }
}

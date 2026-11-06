package androidx.media3.common.audio;

import defpackage.hf1;
import defpackage.r7;
import defpackage.s83;
import defpackage.sp0;
import defpackage.zy;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ChannelMixingMatrix {
    private final float[] coefficients;
    private final int inputChannelCount;
    private final boolean isDiagonal;
    private final boolean isIdentity;
    private final boolean isZero;
    private final int outputChannelCount;

    public ChannelMixingMatrix(int i, int i2, float[] fArr) {
        boolean z = false;
        sp0.p(i > 0, "Input channel count must be positive.");
        sp0.p(i2 > 0, "Output channel count must be positive.");
        sp0.p(fArr.length == i * i2, "Coefficient array length is invalid.");
        this.inputChannelCount = i;
        this.outputChannelCount = i2;
        this.coefficients = checkCoefficientsValid(fArr);
        int i3 = 0;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        while (i3 < i) {
            int i4 = 0;
            while (i4 < i2) {
                float mixingCoefficient = getMixingCoefficient(i3, i4);
                boolean z5 = i3 == i4;
                if (mixingCoefficient != 1.0f && z5) {
                    z4 = false;
                }
                if (mixingCoefficient != 0.0f) {
                    z2 = false;
                    if (!z5) {
                        z3 = false;
                    }
                }
                i4++;
            }
            i3++;
        }
        this.isZero = z2;
        boolean z6 = isSquare() && z3;
        this.isDiagonal = z6;
        if (z6 && z4) {
            z = true;
        }
        this.isIdentity = z;
    }

    private static float[] checkCoefficientsValid(float[] fArr) {
        for (int i = 0; i < fArr.length; i++) {
            if (fArr[i] < 0.0f) {
                s83.t(r7.z("Coefficient at index ", i, " is negative."));
                return null;
            }
        }
        return fArr;
    }

    private static float[] createConstantGainMixingCoefficients(int i, int i2) {
        if (i == i2) {
            return initializeIdentityMatrix(i2);
        }
        if (i == 1 && i2 == 2) {
            return new float[]{1.0f, 1.0f};
        }
        if (i == 2 && i2 == 1) {
            return new float[]{0.5f, 0.5f};
        }
        zy.p(hf1.v("Default channel mixing coefficients for ", i, "->", i2, " are not yet implemented."));
        return null;
    }

    private static float[] createConstantPowerMixingCoefficients(int i, int i2) {
        if (i2 == 1) {
            return getConstantPowerCoefficientsToMono(i);
        }
        if (i2 == 2) {
            return getConstantPowerCoefficientsToStereo(i);
        }
        if (i == i2) {
            return initializeIdentityMatrix(i2);
        }
        zy.p(hf1.v("Default constant power channel mixing coefficients for ", i, "->", i2, " are not implemented."));
        return null;
    }

    public static ChannelMixingMatrix createForConstantGain(int i, int i2) {
        return new ChannelMixingMatrix(i, i2, createConstantGainMixingCoefficients(i, i2));
    }

    public static ChannelMixingMatrix createForConstantPower(int i, int i2) {
        return new ChannelMixingMatrix(i, i2, createConstantPowerMixingCoefficients(i, i2));
    }

    private static float[] getConstantPowerCoefficientsToMono(int i) {
        switch (i) {
            case 1:
                return new float[]{1.0f};
            case 2:
                return new float[]{0.7071f, 0.7071f};
            case 3:
                return new float[]{0.7071f, 0.7071f, 1.0f};
            case 4:
                return new float[]{0.7071f, 0.7071f, 0.5f, 0.5f};
            case 5:
                return new float[]{0.7071f, 0.7071f, 1.0f, 0.5f, 0.5f};
            case 6:
                return new float[]{0.7071f, 0.7071f, 1.0f, 0.7071f, 0.5f, 0.5f};
            default:
                zy.p(r7.z("Default constant power channel mixing coefficients for ", i, "->1 are not implemented."));
                return null;
        }
    }

    private static float[] getConstantPowerCoefficientsToStereo(int i) {
        switch (i) {
            case 1:
                return new float[]{0.7071f, 0.7071f};
            case 2:
                return new float[]{1.0f, 0.0f, 0.0f, 1.0f};
            case 3:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.0f, 1.0f, 0.7071f};
            case 4:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.0f, 0.7071f};
            case 5:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.7071f, 0.0f, 0.7071f};
            case 6:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.5f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.7071f, 0.5f, 0.0f, 0.7071f};
            default:
                zy.p(r7.z("Default constant power channel mixing coefficients for ", i, "->2 are not implemented."));
                return null;
        }
    }

    private static float[] initializeIdentityMatrix(int i) {
        float[] fArr = new float[i * i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[(i * i2) + i2] = 1.0f;
        }
        return fArr;
    }

    public int getInputChannelCount() {
        return this.inputChannelCount;
    }

    public float getMixingCoefficient(int i, int i2) {
        return this.coefficients[(i * this.outputChannelCount) + i2];
    }

    public int getOutputChannelCount() {
        return this.outputChannelCount;
    }

    public boolean isDiagonal() {
        return this.isDiagonal;
    }

    public boolean isIdentity() {
        return this.isIdentity;
    }

    public boolean isSquare() {
        return this.inputChannelCount == this.outputChannelCount;
    }

    public boolean isZero() {
        return this.isZero;
    }

    public ChannelMixingMatrix scaleBy(float f) {
        float[] fArr = new float[this.coefficients.length];
        int i = 0;
        while (true) {
            float[] fArr2 = this.coefficients;
            if (i >= fArr2.length) {
                return new ChannelMixingMatrix(this.inputChannelCount, this.outputChannelCount, fArr);
            }
            fArr[i] = fArr2[i] * f;
            i++;
        }
    }
}

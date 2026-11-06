package androidx.media3.common.audio;

import defpackage.sp0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class Sonic {
    private static final int AMDF_FREQUENCY = 4000;
    private static final int MAXIMUM_PITCH = 400;
    private static final int MINIMUM_PITCH = 65;
    private static final float MINIMUM_SLOWDOWN_RATE = 0.99999f;
    private static final float MINIMUM_SPEEDUP_RATE = 1.00001f;
    private double accumulatedSpeedAdjustmentError;
    private final int channelCount;
    private final SonicImpl<?> impl;
    private int inputFrameCount;
    private final int inputSampleRateHz;
    private final int maxPeriod;
    private final int maxRequiredFrameCount;
    private final int minPeriod;
    private int newRatePosition;
    private int oldRatePosition;
    private int outputFrameCount;
    private final float pitch;
    private int pitchFrameCount;
    private int prevPeriod;
    private final float rate;
    private int remainingInputToCopyFrameCount;
    private final float speed;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface SonicImpl<T> {
        int bytesPerSample();

        void copyBufferToInputBuffer(ByteBuffer byteBuffer, int i);

        void copyOutputToByteBuffer(ByteBuffer byteBuffer, int i);

        void downSampleInput(int i, int i2);

        void ensureAdditionalFramesInInputBuffer(int i);

        void ensureAdditionalFramesInOutputBuffer(int i);

        void ensureAdditionalFramesInPitchBuffer(int i);

        int findPitchPeriodInRangeWithDownsampleBuffer(int i, int i2, int i3);

        int findPitchPeriodInRangeWithInputBuffer(int i, int i2, int i3);

        void flush();

        T getInputBuffer();

        T getOutputBuffer();

        T getPitchBuffer();

        void interpolateFrame(int i, long j, long j2);

        boolean isPreviousPeriodBetter();

        void overlapAdd(int i, int i2, int i3, int i4, int i5);

        void updatePreviousMinDiff();

        void zeroInputBuffer(int i, int i2);
    }

    public Sonic(int i, int i2, float f, float f2, int i3, boolean z) {
        this.inputSampleRateHz = i;
        this.channelCount = i2;
        this.speed = f;
        this.pitch = f2;
        this.rate = i / i3;
        this.minPeriod = i / MAXIMUM_PITCH;
        int i4 = i / 65;
        this.maxPeriod = i4;
        this.maxRequiredFrameCount = i4 * 2;
        this.impl = z ? new SonicFloatImpl() : new SonicShortImpl();
    }

    private void adjustRate(float f, int i) {
        int i2;
        int i3;
        if (this.outputFrameCount == i) {
            return;
        }
        int i4 = this.inputSampleRateHz;
        long j = (long) (i4 / f);
        long j2 = i4;
        while (j != 0 && j2 != 0 && j % 2 == 0 && j2 % 2 == 0) {
            j /= 2;
            j2 /= 2;
        }
        moveNewSamplesToPitchBuffer(i);
        int i5 = 0;
        while (true) {
            int i6 = this.pitchFrameCount;
            if (i5 >= i6 - 1) {
                removePitchFrames(i6 - 1);
                return;
            }
            while (true) {
                i2 = this.oldRatePosition;
                long j3 = (i2 + 1) * j;
                i3 = this.newRatePosition;
                if (j3 <= i3 * j2) {
                    break;
                }
                this.impl.ensureAdditionalFramesInOutputBuffer(1);
                this.impl.interpolateFrame(i5, j2, j);
                this.newRatePosition++;
                this.outputFrameCount++;
            }
            int i7 = i2 + 1;
            this.oldRatePosition = i7;
            if (i7 == j2) {
                this.oldRatePosition = 0;
                sp0.z(((long) i3) == j);
                this.newRatePosition = 0;
            }
            i5++;
        }
    }

    public static long calculateAccumulatedTruncationErrorForResampling(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        RoundingMode roundingMode = RoundingMode.HALF_EVEN;
        BigDecimal divide = bigDecimal.divide(bigDecimal2, 20, roundingMode);
        BigDecimal divide2 = bigDecimal2.divide(bigDecimal3, 20, roundingMode);
        RoundingMode roundingMode2 = RoundingMode.FLOOR;
        return divide.multiply(divide2.subtract(divide2.setScale(0, roundingMode2))).setScale(0, roundingMode2).longValueExact();
    }

    private void changeSpeed(double d) {
        int insertPitchPeriod;
        int i = this.inputFrameCount;
        if (i < this.maxRequiredFrameCount) {
            return;
        }
        int i2 = 0;
        do {
            if (this.remainingInputToCopyFrameCount > 0) {
                insertPitchPeriod = copyInputToOutput(i2);
            } else {
                int findPitchPeriod = findPitchPeriod(i2);
                if (d > 1.0d) {
                    i2 = findPitchPeriod + skipPitchPeriod(i2, d, findPitchPeriod) + i2;
                } else {
                    insertPitchPeriod = insertPitchPeriod(i2, d, findPitchPeriod);
                }
            }
            i2 += insertPitchPeriod;
        } while (this.maxRequiredFrameCount + i2 <= i);
        removeProcessedInputFrames(i2);
    }

    private int copyInputToOutput(int i) {
        int min = Math.min(this.maxRequiredFrameCount, this.remainingInputToCopyFrameCount);
        copyToOutput(i, min);
        this.remainingInputToCopyFrameCount -= min;
        return min;
    }

    private void copyToOutput(int i, int i2) {
        this.impl.ensureAdditionalFramesInOutputBuffer(i2);
        Object inputBuffer = this.impl.getInputBuffer();
        int i3 = i * this.channelCount;
        Object outputBuffer = this.impl.getOutputBuffer();
        int i4 = this.outputFrameCount;
        int i5 = this.channelCount;
        System.arraycopy(inputBuffer, i3, outputBuffer, i4 * i5, i5 * i2);
        this.outputFrameCount += i2;
    }

    private int findPitchPeriod(int i) {
        int i2;
        int i3 = this.inputSampleRateHz;
        int i4 = i3 > AMDF_FREQUENCY ? i3 / AMDF_FREQUENCY : 1;
        if (this.channelCount == 1 && i4 == 1) {
            i2 = this.impl.findPitchPeriodInRangeWithInputBuffer(i, this.minPeriod, this.maxPeriod);
        } else {
            this.impl.downSampleInput(i, i4);
            int findPitchPeriodInRangeWithDownsampleBuffer = this.impl.findPitchPeriodInRangeWithDownsampleBuffer(0, this.minPeriod / i4, this.maxPeriod / i4);
            if (i4 != 1) {
                int i5 = findPitchPeriodInRangeWithDownsampleBuffer * i4;
                int i6 = i4 * 4;
                int i7 = i5 - i6;
                int i8 = i5 + i6;
                int i9 = this.minPeriod;
                if (i7 < i9) {
                    i7 = i9;
                }
                int i10 = this.maxPeriod;
                if (i8 > i10) {
                    i8 = i10;
                }
                int i11 = this.channelCount;
                SonicImpl<?> sonicImpl = this.impl;
                if (i11 == 1) {
                    i2 = sonicImpl.findPitchPeriodInRangeWithInputBuffer(i, i7, i8);
                } else {
                    sonicImpl.downSampleInput(i, 1);
                    i2 = this.impl.findPitchPeriodInRangeWithDownsampleBuffer(0, i7, i8);
                }
            } else {
                i2 = findPitchPeriodInRangeWithDownsampleBuffer;
            }
        }
        int i12 = this.impl.isPreviousPeriodBetter() ? this.prevPeriod : i2;
        this.impl.updatePreviousMinDiff();
        this.prevPeriod = i2;
        return i12;
    }

    public static long getExpectedFrameCountAfterProcessorApplied(int i, int i2, float f, float f2, long j) {
        float f3 = (i / i2) * f2;
        double d = f / f2;
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(f3));
        BigDecimal valueOf = BigDecimal.valueOf(j);
        if (d > 1.0000100135803223d || d < 0.9999899864196777d) {
            valueOf = valueOf.divide(BigDecimal.valueOf(d), RoundingMode.HALF_EVEN);
        }
        return f3 == 1.0f ? valueOf.longValueExact() : valueOf.divide(bigDecimal, RoundingMode.HALF_EVEN).longValueExact() - calculateAccumulatedTruncationErrorForResampling(valueOf, BigDecimal.valueOf(i), bigDecimal);
    }

    public static long getExpectedInputFrameCountForOutputFrameCount(int i, int i2, float f, float f2, long j) {
        long frameCountBeforeResamplingForOutputCount = getFrameCountBeforeResamplingForOutputCount(BigDecimal.valueOf(i), new BigDecimal(String.valueOf((i / i2) * f2)), BigDecimal.valueOf(j));
        double d = f / f2;
        return (d > 1.0000100135803223d || d < 0.9999899864196777d) ? BigDecimal.valueOf(frameCountBeforeResamplingForOutputCount).multiply(BigDecimal.valueOf(d)).setScale(0, RoundingMode.FLOOR).longValueExact() : frameCountBeforeResamplingForOutputCount;
    }

    private static long getFrameCountBeforeResamplingForOutputCount(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        RoundingMode roundingMode = RoundingMode.FLOOR;
        return bigDecimal.multiply(bigDecimal3).divide(bigDecimal.divide(bigDecimal2, 0, roundingMode), 0, roundingMode).longValueExact();
    }

    private int insertPitchPeriod(int i, double d, int i2) {
        int i3;
        double d2 = this.accumulatedSpeedAdjustmentError;
        if (d < 0.5d) {
            double d3 = ((i2 * d) / (1.0d - d)) + d2;
            int round = (int) Math.round(d3);
            this.accumulatedSpeedAdjustmentError = d3 - round;
            i3 = round;
        } else {
            double d4 = ((((2.0d * d) - 1.0d) * i2) / (1.0d - d)) + d2;
            int round2 = (int) Math.round(d4);
            this.remainingInputToCopyFrameCount = round2;
            this.accumulatedSpeedAdjustmentError = d4 - round2;
            i3 = i2;
        }
        int i4 = i2 + i3;
        this.impl.ensureAdditionalFramesInOutputBuffer(i4);
        Object inputBuffer = this.impl.getInputBuffer();
        int i5 = this.channelCount * i;
        Object outputBuffer = this.impl.getOutputBuffer();
        int i6 = this.outputFrameCount;
        int i7 = this.channelCount;
        System.arraycopy(inputBuffer, i5, outputBuffer, i6 * i7, i7 * i2);
        this.impl.overlapAdd(i3, this.channelCount, this.outputFrameCount + i2, i + i2, i);
        this.outputFrameCount += i4;
        return i3;
    }

    private void moveNewSamplesToPitchBuffer(int i) {
        int i2 = this.outputFrameCount - i;
        this.impl.ensureAdditionalFramesInPitchBuffer(i2);
        Object outputBuffer = this.impl.getOutputBuffer();
        int i3 = this.channelCount * i;
        Object pitchBuffer = this.impl.getPitchBuffer();
        int i4 = this.pitchFrameCount;
        int i5 = this.channelCount;
        System.arraycopy(outputBuffer, i3, pitchBuffer, i4 * i5, i5 * i2);
        this.outputFrameCount = i;
        this.pitchFrameCount += i2;
    }

    private void processStreamInput() {
        int i = this.outputFrameCount;
        float f = this.speed;
        float f2 = this.pitch;
        double d = f / f2;
        float f3 = this.rate * f2;
        if (d > 1.0000100135803223d || d < 0.9999899864196777d) {
            changeSpeed(d);
        } else {
            copyToOutput(0, this.inputFrameCount);
            this.inputFrameCount = 0;
        }
        if (f3 != 1.0f) {
            adjustRate(f3, i);
        }
    }

    private void removePitchFrames(int i) {
        if (i == 0) {
            return;
        }
        System.arraycopy(this.impl.getPitchBuffer(), this.channelCount * i, this.impl.getPitchBuffer(), 0, (this.pitchFrameCount - i) * this.channelCount);
        this.pitchFrameCount -= i;
    }

    private void removeProcessedInputFrames(int i) {
        int i2 = this.inputFrameCount - i;
        System.arraycopy(this.impl.getInputBuffer(), i * this.channelCount, this.impl.getInputBuffer(), 0, this.channelCount * i2);
        this.inputFrameCount = i2;
    }

    private int skipPitchPeriod(int i, double d, int i2) {
        int i3;
        double d2 = this.accumulatedSpeedAdjustmentError;
        if (d >= 2.0d) {
            double d3 = (i2 / (d - 1.0d)) + d2;
            int round = (int) Math.round(d3);
            this.accumulatedSpeedAdjustmentError = d3 - round;
            i3 = round;
        } else {
            double d4 = (((2.0d - d) * i2) / (d - 1.0d)) + d2;
            int round2 = (int) Math.round(d4);
            this.remainingInputToCopyFrameCount = round2;
            this.accumulatedSpeedAdjustmentError = d4 - round2;
            i3 = i2;
        }
        this.impl.ensureAdditionalFramesInOutputBuffer(i3);
        this.impl.overlapAdd(i3, this.channelCount, this.outputFrameCount, i, i + i2);
        this.outputFrameCount += i3;
        return i3;
    }

    public void flush() {
        this.inputFrameCount = 0;
        this.outputFrameCount = 0;
        this.pitchFrameCount = 0;
        this.oldRatePosition = 0;
        this.newRatePosition = 0;
        this.remainingInputToCopyFrameCount = 0;
        this.prevPeriod = 0;
        this.accumulatedSpeedAdjustmentError = 0.0d;
        this.impl.flush();
    }

    public void getOutput(ByteBuffer byteBuffer) {
        sp0.z(this.outputFrameCount >= 0);
        int min = Math.min(byteBuffer.remaining() / (this.channelCount * this.impl.bytesPerSample()), this.outputFrameCount);
        this.impl.copyOutputToByteBuffer(byteBuffer, min);
        this.outputFrameCount -= min;
        System.arraycopy(this.impl.getOutputBuffer(), min * this.channelCount, this.impl.getOutputBuffer(), 0, this.outputFrameCount * this.channelCount);
    }

    public int getOutputSize() {
        sp0.z(this.outputFrameCount >= 0);
        return this.outputFrameCount * this.channelCount * this.impl.bytesPerSample();
    }

    public int getPendingInputBytes() {
        return this.inputFrameCount * this.channelCount * this.impl.bytesPerSample();
    }

    public void queueEndOfStream() {
        int i = this.inputFrameCount;
        float f = this.speed;
        float f2 = this.pitch;
        double d = f / f2;
        int i2 = this.outputFrameCount + ((int) (((((((i - r5) / d) + this.remainingInputToCopyFrameCount) + this.accumulatedSpeedAdjustmentError) + this.pitchFrameCount) / (this.rate * f2)) + 0.5d));
        this.accumulatedSpeedAdjustmentError = 0.0d;
        this.impl.ensureAdditionalFramesInInputBuffer((this.maxRequiredFrameCount * 2) + i);
        this.impl.zeroInputBuffer(i * this.channelCount, this.maxRequiredFrameCount * 2);
        this.inputFrameCount = (this.maxRequiredFrameCount * 2) + this.inputFrameCount;
        processStreamInput();
        if (this.outputFrameCount > i2) {
            this.outputFrameCount = Math.max(i2, 0);
        }
        this.inputFrameCount = 0;
        this.remainingInputToCopyFrameCount = 0;
        this.pitchFrameCount = 0;
    }

    public void queueInput(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        int bytesPerSample = remaining / (this.channelCount * this.impl.bytesPerSample());
        this.impl.ensureAdditionalFramesInInputBuffer(bytesPerSample);
        this.impl.copyBufferToInputBuffer(byteBuffer, remaining);
        this.inputFrameCount += bytesPerSample;
        processStreamInput();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class SonicFloatImpl implements SonicImpl<float[]> {
        private final float[] downSampleBuffer;
        private float[] inputBuffer;
        private double maxDiff;
        private double minDiff;
        private float[] outputBuffer;
        private float[] pitchBuffer;
        private double prevMinDiff;

        public SonicFloatImpl() {
            this.downSampleBuffer = new float[Sonic.this.maxRequiredFrameCount];
            this.inputBuffer = new float[Sonic.this.maxRequiredFrameCount * Sonic.this.channelCount];
            this.outputBuffer = new float[Sonic.this.maxRequiredFrameCount * Sonic.this.channelCount];
            this.pitchBuffer = new float[Sonic.this.maxRequiredFrameCount * Sonic.this.channelCount];
        }

        private float[] ensureSpaceForAdditionalFrames(float[] fArr, int i, int i2) {
            int length = fArr.length / Sonic.this.channelCount;
            return i + i2 <= length ? fArr : Arrays.copyOf(fArr, (((length * 3) / 2) + i2) * Sonic.this.channelCount);
        }

        private int findPitchPeriodInRange(float[] fArr, int i, int i2, int i3) {
            int i4 = Sonic.this.channelCount * i;
            double d = 1.0d;
            int i5 = 0;
            double d2 = 0.0d;
            int i6 = 255;
            int i7 = i2;
            while (i7 <= i3) {
                double d3 = 0.0d;
                for (int i8 = 0; i8 < i7; i8++) {
                    d3 += Math.abs(fArr[i4 + i8] - fArr[(i4 + i7) + i8]);
                }
                int i9 = i4;
                double d4 = i7;
                if (i5 * d3 < d * d4) {
                    i5 = i7;
                    d = d3;
                }
                if (i6 * d3 > d4 * d2) {
                    i6 = i7;
                    d2 = d3;
                }
                i7++;
                i4 = i9;
            }
            this.minDiff = d / i5;
            this.maxDiff = d2 / i6;
            return i5;
        }

        private float interpolate(float[] fArr, int i, long j, long j2) {
            float f = fArr[i];
            long j3 = (Sonic.this.oldRatePosition + 1) * j2;
            long j4 = j3 - (Sonic.this.newRatePosition * j);
            return (((r3 - j4) * fArr[i + Sonic.this.channelCount]) + (j4 * f)) / (j3 - (Sonic.this.oldRatePosition * j2));
        }

        private void overlapAdd(int i, int i2, float[] fArr, int i3, float[] fArr2, int i4, float[] fArr3, int i5) {
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = (i3 * i2) + i6;
                int i8 = (i5 * i2) + i6;
                int i9 = (i4 * i2) + i6;
                for (int i10 = 0; i10 < i; i10++) {
                    fArr[i7] = ((fArr3[i8] * i10) + (fArr2[i9] * (i - i10))) / i;
                    i7 += i2;
                    i9 += i2;
                    i8 += i2;
                }
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public int bytesPerSample() {
            return 4;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void copyBufferToInputBuffer(ByteBuffer byteBuffer, int i) {
            byteBuffer.asFloatBuffer().get(this.inputBuffer, Sonic.this.inputFrameCount * Sonic.this.channelCount, i / bytesPerSample());
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void copyOutputToByteBuffer(ByteBuffer byteBuffer, int i) {
            byteBuffer.asFloatBuffer().put(this.outputBuffer, 0, Sonic.this.channelCount * i);
            byteBuffer.position((i * bytesPerSample() * Sonic.this.channelCount) + byteBuffer.position());
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void downSampleInput(int i, int i2) {
            int i3 = Sonic.this.maxRequiredFrameCount / i2;
            int i4 = Sonic.this.channelCount * i2;
            int i5 = i * Sonic.this.channelCount;
            for (int i6 = 0; i6 < i3; i6++) {
                double d = 0.0d;
                for (int i7 = 0; i7 < i4; i7++) {
                    d += this.inputBuffer[(i6 * i4) + i5 + i7];
                }
                this.downSampleBuffer[i6] = (float) (d / i4);
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void ensureAdditionalFramesInInputBuffer(int i) {
            this.inputBuffer = ensureSpaceForAdditionalFrames(this.inputBuffer, Sonic.this.inputFrameCount, i);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void ensureAdditionalFramesInOutputBuffer(int i) {
            this.outputBuffer = ensureSpaceForAdditionalFrames(this.outputBuffer, Sonic.this.outputFrameCount, i);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void ensureAdditionalFramesInPitchBuffer(int i) {
            this.pitchBuffer = ensureSpaceForAdditionalFrames(this.pitchBuffer, Sonic.this.pitchFrameCount, i);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public int findPitchPeriodInRangeWithDownsampleBuffer(int i, int i2, int i3) {
            return findPitchPeriodInRange(this.downSampleBuffer, i, i2, i3);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public int findPitchPeriodInRangeWithInputBuffer(int i, int i2, int i3) {
            return findPitchPeriodInRange(this.inputBuffer, i, i2, i3);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void flush() {
            this.prevMinDiff = 0.0d;
            this.minDiff = 0.0d;
            this.maxDiff = 0.0d;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void interpolateFrame(int i, long j, long j2) {
            int i2 = 0;
            while (i2 < Sonic.this.channelCount) {
                SonicFloatImpl sonicFloatImpl = this;
                this.outputBuffer[(Sonic.this.outputFrameCount * Sonic.this.channelCount) + i2] = sonicFloatImpl.interpolate(this.pitchBuffer, (Sonic.this.channelCount * i) + i2, j, j2);
                i2++;
                this = sonicFloatImpl;
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public boolean isPreviousPeriodBetter() {
            if (this.minDiff == 0.0d || Sonic.this.prevPeriod == 0) {
                return false;
            }
            double d = this.maxDiff;
            double d2 = this.minDiff;
            return d <= d2 * 3.0d && d2 * 2.0d > this.prevMinDiff * 3.0d;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void updatePreviousMinDiff() {
            this.prevMinDiff = this.minDiff;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void zeroInputBuffer(int i, int i2) {
            for (int i3 = 0; i3 < Sonic.this.channelCount * i2; i3++) {
                this.inputBuffer[i + i3] = 0.0f;
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public float[] getInputBuffer() {
            return this.inputBuffer;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public float[] getOutputBuffer() {
            return this.outputBuffer;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public float[] getPitchBuffer() {
            return this.pitchBuffer;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void overlapAdd(int i, int i2, int i3, int i4, int i5) {
            float[] fArr = this.outputBuffer;
            float[] fArr2 = this.inputBuffer;
            overlapAdd(i, i2, fArr, i3, fArr2, i4, fArr2, i5);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class SonicShortImpl implements SonicImpl<short[]> {
        private final short[] downSampleBuffer;
        private short[] inputBuffer;
        private int maxDiff;
        private int minDiff;
        private short[] outputBuffer;
        private short[] pitchBuffer;
        private int prevMinDiff;

        public SonicShortImpl() {
            this.downSampleBuffer = new short[Sonic.this.maxRequiredFrameCount];
            this.inputBuffer = new short[Sonic.this.maxRequiredFrameCount * Sonic.this.channelCount];
            this.outputBuffer = new short[Sonic.this.maxRequiredFrameCount * Sonic.this.channelCount];
            this.pitchBuffer = new short[Sonic.this.maxRequiredFrameCount * Sonic.this.channelCount];
        }

        private short[] ensureSpaceForAdditionalFrames(short[] sArr, int i, int i2) {
            int length = sArr.length / Sonic.this.channelCount;
            return i + i2 <= length ? sArr : Arrays.copyOf(sArr, (((length * 3) / 2) + i2) * Sonic.this.channelCount);
        }

        private int findPitchPeriodInRange(short[] sArr, int i, int i2, int i3) {
            int i4 = i * Sonic.this.channelCount;
            int i5 = 255;
            int i6 = 1;
            int i7 = 0;
            int i8 = 0;
            while (i2 <= i3) {
                int i9 = 0;
                for (int i10 = 0; i10 < i2; i10++) {
                    i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
                }
                if (i9 * i7 < i6 * i2) {
                    i7 = i2;
                    i6 = i9;
                }
                if (i9 * i5 > i8 * i2) {
                    i5 = i2;
                    i8 = i9;
                }
                i2++;
            }
            this.minDiff = i6 / i7;
            this.maxDiff = i8 / i5;
            return i7;
        }

        private short interpolate(short[] sArr, int i, long j, long j2) {
            short s = sArr[i];
            short s2 = sArr[i + Sonic.this.channelCount];
            long j3 = (Sonic.this.oldRatePosition + 1) * j2;
            long j4 = j3 - (Sonic.this.newRatePosition * j);
            long j5 = j3 - (Sonic.this.oldRatePosition * j2);
            return (short) ((((j5 - j4) * s2) + (s * j4)) / j5);
        }

        private void overlapAdd(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = (i3 * i2) + i6;
                int i8 = (i5 * i2) + i6;
                int i9 = (i4 * i2) + i6;
                for (int i10 = 0; i10 < i; i10++) {
                    sArr[i7] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                    i7 += i2;
                    i9 += i2;
                    i8 += i2;
                }
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public int bytesPerSample() {
            return 2;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void copyBufferToInputBuffer(ByteBuffer byteBuffer, int i) {
            byteBuffer.asShortBuffer().get(this.inputBuffer, Sonic.this.inputFrameCount * Sonic.this.channelCount, i / 2);
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void copyOutputToByteBuffer(ByteBuffer byteBuffer, int i) {
            byteBuffer.asShortBuffer().put(this.outputBuffer, 0, Sonic.this.channelCount * i);
            byteBuffer.position((i * bytesPerSample() * Sonic.this.channelCount) + byteBuffer.position());
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void downSampleInput(int i, int i2) {
            short[] sArr = this.inputBuffer;
            int i3 = Sonic.this.maxRequiredFrameCount / i2;
            int i4 = Sonic.this.channelCount * i2;
            int i5 = i * Sonic.this.channelCount;
            for (int i6 = 0; i6 < i3; i6++) {
                int i7 = 0;
                for (int i8 = 0; i8 < i4; i8++) {
                    i7 += sArr[(i6 * i4) + i5 + i8];
                }
                this.downSampleBuffer[i6] = (short) (i7 / i4);
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void ensureAdditionalFramesInInputBuffer(int i) {
            this.inputBuffer = ensureSpaceForAdditionalFrames(this.inputBuffer, Sonic.this.inputFrameCount, i);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void ensureAdditionalFramesInOutputBuffer(int i) {
            this.outputBuffer = ensureSpaceForAdditionalFrames(this.outputBuffer, Sonic.this.outputFrameCount, i);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void ensureAdditionalFramesInPitchBuffer(int i) {
            this.pitchBuffer = ensureSpaceForAdditionalFrames(this.pitchBuffer, Sonic.this.pitchFrameCount, i);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public int findPitchPeriodInRangeWithDownsampleBuffer(int i, int i2, int i3) {
            return findPitchPeriodInRange(this.downSampleBuffer, i, i2, i3);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public int findPitchPeriodInRangeWithInputBuffer(int i, int i2, int i3) {
            return findPitchPeriodInRange(this.inputBuffer, i, i2, i3);
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void flush() {
            this.prevMinDiff = 0;
            this.minDiff = 0;
            this.maxDiff = 0;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void interpolateFrame(int i, long j, long j2) {
            int i2 = 0;
            while (i2 < Sonic.this.channelCount) {
                SonicShortImpl sonicShortImpl = this;
                this.outputBuffer[(Sonic.this.outputFrameCount * Sonic.this.channelCount) + i2] = sonicShortImpl.interpolate(this.pitchBuffer, (Sonic.this.channelCount * i) + i2, j, j2);
                i2++;
                this = sonicShortImpl;
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public boolean isPreviousPeriodBetter() {
            if (this.minDiff == 0 || Sonic.this.prevPeriod == 0) {
                return false;
            }
            int i = this.maxDiff;
            int i2 = this.minDiff;
            return i <= i2 * 3 && i2 * 2 > this.prevMinDiff * 3;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void updatePreviousMinDiff() {
            this.prevMinDiff = this.minDiff;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void zeroInputBuffer(int i, int i2) {
            for (int i3 = 0; i3 < Sonic.this.channelCount * i2; i3++) {
                this.inputBuffer[i + i3] = 0;
            }
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public short[] getInputBuffer() {
            return this.inputBuffer;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public short[] getOutputBuffer() {
            return this.outputBuffer;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public short[] getPitchBuffer() {
            return this.pitchBuffer;
        }

        @Override // androidx.media3.common.audio.Sonic.SonicImpl
        public void overlapAdd(int i, int i2, int i3, int i4, int i5) {
            short[] sArr = this.outputBuffer;
            short[] sArr2 = this.inputBuffer;
            overlapAdd(i, i2, sArr, i3, sArr2, i4, sArr2, i5);
        }
    }
}

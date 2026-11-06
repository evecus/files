package androidx.media3.common.audio;

import android.util.Pair;
import androidx.media3.common.C;
import androidx.media3.common.audio.DefaultGainProvider;
import androidx.media3.common.audio.GainProcessor;
import androidx.media3.common.util.Util;
import defpackage.e3;
import defpackage.g04;
import defpackage.mm0;
import defpackage.or0;
import defpackage.pn1;
import defpackage.qa5;
import defpackage.rv2;
import defpackage.sp0;
import defpackage.xm0;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class DefaultGainProvider implements GainProcessor.GainProvider {
    private static final float GAIN_UNSET = -3.4028235E38f;
    private final float defaultGain;
    private final qa5 gainMap;
    public static final FadeProvider FADE_IN_LINEAR = new or0(0);
    public static final FadeProvider FADE_OUT_LINEAR = new or0(1);
    public static final FadeProvider FADE_IN_EQUAL_POWER = new or0(2);
    public static final FadeProvider FADE_OUT_EQUAL_POWER = new or0(3);

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private final float defaultGain;
        private final qa5 gainMap;

        public Builder(float f) {
            qa5 qa5Var = new qa5();
            this.gainMap = qa5Var;
            this.defaultGain = f;
            qa5Var.c(g04.K, new mm0((byte) 3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Float lambda$addFadeAt$1(long j, FadeProvider fadeProvider, long j2, Pair pair) {
            int intValue = ((Integer) pair.second).intValue();
            return Float.valueOf(fadeProvider.getGainFactorAt(((Long) pair.first).longValue() - Util.durationUsToSampleCount(j, intValue), Util.durationUsToSampleCount(j2, intValue)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Float lambda$new$0(Pair pair) {
            return Float.valueOf(-3.4028235E38f);
        }

        public Builder addFadeAt(final long j, final long j2, final FadeProvider fadeProvider) {
            sp0.o(j >= 0);
            sp0.o(j2 > 1);
            this.gainMap.c(new g04(new xm0(Long.valueOf(j), (byte) 2), new xm0(Long.valueOf(j + j2), (byte) 2)), new pn1() { // from class: pr0
                @Override // defpackage.pn1
                public final Object apply(Object obj) {
                    Float lambda$addFadeAt$1;
                    lambda$addFadeAt$1 = DefaultGainProvider.Builder.lambda$addFadeAt$1(j, fadeProvider, j2, (Pair) obj);
                    return lambda$addFadeAt$1;
                }
            });
            return this;
        }

        public DefaultGainProvider build() {
            return new DefaultGainProvider(this.gainMap, this.defaultGain);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface FadeProvider {
        float getGainFactorAt(long j, long j2);
    }

    private DefaultGainProvider(qa5 qa5Var, float f) {
        qa5 qa5Var2 = new qa5();
        this.gainMap = qa5Var2;
        rv2 rv2Var = (rv2) qa5Var.a();
        new e3(rv2Var, (byte) 1);
        Iterator b = rv2Var.b();
        while (b.hasNext()) {
            Map.Entry entry = (Map.Entry) b.next();
            qa5Var2.c((g04) entry.getKey(), entry.getValue());
        }
        this.defaultGain = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$static$0(long j, long j2) {
        return j / j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$static$1(long j, long j2) {
        return (j2 - j) / j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$static$2(long j, long j2) {
        return (float) Math.sin((j * 1.5707963267948966d) / j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$static$3(long j, long j2) {
        return (float) Math.cos((j * 1.5707963267948966d) / j2);
    }

    @Override // androidx.media3.common.audio.GainProcessor.GainProvider
    public float getGainFactorAtSamplePosition(long j, int i) {
        sp0.z(i > 0);
        sp0.o(j >= 0);
        Map.Entry b = this.gainMap.b(Long.valueOf(Util.sampleCountToDurationUs(j, i)));
        pn1 pn1Var = (pn1) (b == null ? null : b.getValue());
        pn1Var.getClass();
        float floatValue = ((Float) pn1Var.apply(Pair.create(Long.valueOf(j), Integer.valueOf(i)))).floatValue();
        return floatValue == -3.4028235E38f ? this.defaultGain : floatValue;
    }

    @Override // androidx.media3.common.audio.GainProcessor.GainProvider
    public long isUnityUntil(long j, int i) {
        sp0.z(i > 0);
        sp0.o(j >= 0);
        Map.Entry b = this.gainMap.b(Long.valueOf(Util.sampleCountToDurationUs(j, i)));
        b.getClass();
        float floatValue = ((Float) ((pn1) b.getValue()).apply(Pair.create(Long.valueOf(j), Integer.valueOf(i)))).floatValue();
        if (floatValue == 1.0f) {
            return j + 1;
        }
        if (this.defaultGain != 1.0f || floatValue != -3.4028235E38f) {
            return C.TIME_UNSET;
        }
        if (((g04) b.getKey()).J == xm0.K) {
            return Long.MIN_VALUE;
        }
        xm0 xm0Var = ((g04) b.getKey()).J;
        switch (xm0Var.J) {
            case 0:
                throw new IllegalStateException("range unbounded on this side");
            case 1:
                throw new IllegalStateException("range unbounded on this side");
            default:
                return Util.durationUsToSampleCount(((Long) xm0Var.I).longValue(), i);
        }
    }
}

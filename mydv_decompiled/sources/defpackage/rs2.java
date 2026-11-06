package defpackage;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.BaseAudioProcessor;
import androidx.media3.container.OpusUtil;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class rs2 extends BaseAudioProcessor {
    private static final os2 Companion = new os2();
    public volatile fr a;
    public volatile qs2 b;
    public int c;
    public int d;
    public int e;
    public ps2[] f;
    public double g;
    public double h;
    public long i;
    public Double j;
    public float k;

    public rs2(fr frVar) {
        frVar.getClass();
        this.a = frVar;
        Companion.getClass();
        this.b = os2.c(frVar);
        this.c = OpusUtil.SAMPLE_RATE;
        this.d = 2;
        this.e = 2;
        this.k = 1.0f;
        a();
    }

    public final void a() {
        this.g = 0.0d;
        this.h = 0.0d;
        this.i = 0L;
        this.j = null;
        this.k = this.a == fr.K ? 1.0f : this.b.i;
        int i = this.d;
        ps2[] ps2VarArr = new ps2[i];
        for (int i2 = 0; i2 < i; i2++) {
            ps2VarArr[i2] = new ps2(this.c);
        }
        this.f = ps2VarArr;
    }

    public final void b(fr frVar) {
        frVar.getClass();
        if (this.a == frVar) {
            return;
        }
        this.a = frVar;
        Companion.getClass();
        this.b = os2.c(frVar);
        a();
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) {
        audioFormat.getClass();
        int i = audioFormat.encoding;
        if (i != 2 && i != 4) {
            AudioProcessor.AudioFormat audioFormat2 = AudioProcessor.AudioFormat.NOT_SET;
            audioFormat2.getClass();
            return audioFormat2;
        }
        this.e = i;
        Integer valueOf = Integer.valueOf(audioFormat.sampleRate);
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        this.c = valueOf != null ? valueOf.intValue() : OpusUtil.SAMPLE_RATE;
        Integer valueOf2 = Integer.valueOf(audioFormat.channelCount);
        Integer num = valueOf2.intValue() > 0 ? valueOf2 : null;
        this.d = num != null ? num.intValue() : 2;
        a();
        return audioFormat;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void onFlush() {
        a();
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void onReset() {
        a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0251, code lost:
    
        if (r5 > Float.MAX_VALUE) goto L81;
     */
    @Override // androidx.media3.common.audio.AudioProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void queueInput(java.nio.ByteBuffer r36) {
        /*
            Method dump skipped, instructions count: 733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rs2.queueInput(java.nio.ByteBuffer):void");
    }
}

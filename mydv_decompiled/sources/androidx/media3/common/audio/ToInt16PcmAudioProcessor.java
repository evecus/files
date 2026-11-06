package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Util;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ToInt16PcmAudioProcessor extends BaseAudioProcessor {
    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) {
        int i = audioFormat.encoding;
        if (Util.isEncodingLinearPcm(i)) {
            return i != 2 ? new AudioProcessor.AudioFormat(audioFormat.sampleRate, audioFormat.channelCount, 2) : AudioProcessor.AudioFormat.NOT_SET;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0172 A[ADDED_TO_REGION, LOOP:9: B:60:0x0172->B:61:0x0174, LOOP_START, PHI: r2
      0x0172: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:17:0x004f, B:61:0x0174] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.media3.common.audio.AudioProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void queueInput(java.nio.ByteBuffer r18) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.audio.ToInt16PcmAudioProcessor.queueInput(java.nio.ByteBuffer):void");
    }
}

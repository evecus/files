package defpackage;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.BaseAudioProcessor;
import androidx.media3.common.video.Frame;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class rz5 extends BaseAudioProcessor {
    private static final qz5 Companion = new qz5();
    public volatile float a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int[] f;
    public short[] g;
    public long h;
    public long i;
    public long j;
    public short[] k;
    public boolean l;
    public boolean m;
    public short[] n;
    public int o;
    public long p;
    public long q;

    public final void a(int i) {
        boolean z = this.l;
        long j = this.h;
        if (z) {
            j = Math.max(j, this.j - this.e);
        }
        long j2 = this.h;
        if (j > j2) {
            long j3 = this.b;
            int i2 = (int) ((j - j2) * j3);
            int i3 = (int) ((this.i - j2) * j3);
            short[] sArr = this.g;
            sArr.getClass();
            System.arraycopy(sArr, i2, sArr, 0, i3 - i2);
            this.h = j;
        } else {
            j = j2;
        }
        int i4 = (int) (((this.i - j) + i) * this.b);
        short[] sArr2 = this.g;
        if (i4 > sArr2.length) {
            this.g = Arrays.copyOf(sArr2, Math.max(i4, sArr2.length * 2));
        }
    }

    public final long b(int i, int i2, long j) {
        short[] sArr = this.g;
        short[] sArr2 = this.k;
        int i3 = this.b;
        int i4 = (int) ((j - this.h) * i3);
        long j2 = 0;
        int i5 = 0;
        while (i5 < this.d) {
            int i6 = i4 + (i5 * i3);
            int i7 = 0;
            while (i7 < i) {
                j2 += sArr2[r9 + i7] * sArr[i6 + i7];
                i7++;
                i5 = i5;
            }
            i5 += i2;
        }
        return j2;
    }

    public final void c() {
        int i = this.o;
        if (i == 0) {
            return;
        }
        int i2 = i * this.b * 2;
        ByteBuffer order = replaceOutputBuffer(i2).order(ByteOrder.nativeOrder());
        ShortBuffer asShortBuffer = order.asShortBuffer();
        asShortBuffer.put(this.n, 0, this.o * this.b);
        order.position(asShortBuffer.position() * 2);
        order.flip();
        this.q += i2;
        this.o = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e A[EDGE_INSN: B:23:0x006e->B:24:0x006e BREAK  A[LOOP:1: B:15:0x0059->B:21:0x006b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(boolean r25) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz5.d(boolean):void");
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public final long getDurationAfterProcessorApplied(long j) {
        return (long) (j / this.a);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        return super.isActive() && Math.abs(this.a - 1.0f) >= 1.0E-4f;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) {
        audioFormat.getClass();
        if (audioFormat.encoding != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        this.b = audioFormat.channelCount;
        int i = ((audioFormat.sampleRate * 30) / 1000) & (-2);
        this.c = i;
        int i2 = i / 2;
        this.d = i2;
        this.e = i / 4;
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = (int) ((i3 * Frame.USAGE_VIDEO_ENCODE) / this.d);
        }
        this.f = iArr;
        int i4 = this.d;
        int i5 = (i4 * 8) + this.c + this.e + 4096;
        int i6 = this.b;
        this.g = new short[i5 * i6];
        this.n = new short[(i4 + 4096) * i6];
        return audioFormat;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void onFlush() {
        this.h = 0L;
        this.i = 0L;
        this.j = 0L;
        this.l = false;
        this.m = false;
        this.o = 0;
        this.p = 0L;
        this.q = 0L;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void onQueueEndOfStream() {
        if (this.m) {
            return;
        }
        long j = this.h + this.d;
        long j2 = this.e;
        long j3 = this.c;
        long max = Math.max(j + j2 + j3, this.i + j2 + j3);
        a((int) (max - this.i));
        short[] sArr = this.g;
        long j4 = this.i;
        long j5 = this.h;
        long j6 = this.b;
        sArr.getClass();
        Arrays.fill(sArr, (int) ((j4 - j5) * j6), (int) ((max - j5) * j6), (short) 0);
        d(true);
        c();
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void onReset() {
        this.a = 1.0f;
        this.h = 0L;
        this.i = 0L;
        this.j = 0L;
        this.l = false;
        this.m = false;
        this.o = 0;
        this.p = 0L;
        this.q = 0L;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (byteBuffer.hasRemaining()) {
            int remaining = byteBuffer.remaining();
            int i = remaining / (this.b * 2);
            if (i == 0) {
                byteBuffer.position(byteBuffer.limit());
                return;
            }
            this.p += remaining;
            a(i);
            byteBuffer.duplicate().order(ByteOrder.nativeOrder()).asShortBuffer().get(this.g, (int) ((this.i - this.h) * this.b), this.b * i);
            byteBuffer.position(byteBuffer.limit());
            this.i += i;
            d(false);
            c();
        }
    }
}

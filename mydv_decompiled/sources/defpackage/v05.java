package defpackage;

import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.AudioProcessorChain;
import androidx.media3.common.util.Util;
import java.util.ArrayList;
import okhttp3.internal.ws.RealWebSocket;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class v05 implements nh4, AudioProcessorChain {
    public Object a;
    public Object b;

    public v05(AudioProcessor[] audioProcessorArr) {
        rz5 rz5Var = new rz5();
        rz5Var.a = 1.0f;
        rz5Var.b = 2;
        rz5Var.f = new int[0];
        rz5Var.g = new short[0];
        rz5Var.k = new short[0];
        rz5Var.n = new short[0];
        this.a = rz5Var;
        d63 d63Var = new d63((byte) 3);
        d63Var.a(audioProcessorArr);
        ArrayList arrayList = d63Var.J;
        arrayList.add(rz5Var);
        this.b = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[arrayList.size()]);
    }

    @Override // defpackage.nh4
    public int a(int i) {
        CharSequence charSequence = (CharSequence) this.a;
        do {
            i = ((a1) this.b).m(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // androidx.media3.common.audio.AudioProcessorChain
    public PlaybackParameters applyPlaybackParameters(PlaybackParameters playbackParameters) {
        playbackParameters.getClass();
        ((rz5) this.a).a = playbackParameters.speed;
        return playbackParameters;
    }

    @Override // androidx.media3.common.audio.AudioProcessorChain
    public boolean applySkipSilenceEnabled(boolean z) {
        return false;
    }

    @Override // defpackage.nh4
    public int b(int i) {
        do {
            i = ((a1) this.b).n(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.a).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.nh4
    public int c(int i) {
        do {
            i = ((a1) this.b).n(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.a).charAt(i)));
        return i;
    }

    @Override // defpackage.nh4
    public int d(int i) {
        do {
            i = ((a1) this.b).m(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.a).charAt(i - 1)));
        return i;
    }

    public boolean e(nx5 nx5Var) {
        boolean containsKey;
        synchronized (this.b) {
            containsKey = ((cp0) this.a).a.containsKey(nx5Var);
        }
        return containsKey;
    }

    public wv4 f(nx5 nx5Var) {
        wv4 j;
        nx5Var.getClass();
        synchronized (this.b) {
            j = ((cp0) this.a).j(nx5Var);
        }
        return j;
    }

    public void g(wv4 wv4Var, x81 x81Var) {
        wv4Var.getClass();
        c25 c25Var = (c25) this.b;
        ((vj4) ((mc3) c25Var).a).execute(new of(this, wv4Var, x81Var, (byte) 11));
    }

    @Override // androidx.media3.common.audio.AudioProcessorChain
    public AudioProcessor[] getAudioProcessors() {
        return (AudioProcessor[]) this.b;
    }

    @Override // androidx.media3.common.audio.AudioProcessorChain
    public long getMediaDuration(long j) {
        if (!((rz5) this.a).isActive()) {
            return j;
        }
        rz5 rz5Var = (rz5) this.a;
        long j2 = rz5Var.q;
        if (j2 >= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            long j3 = rz5Var.p;
            long j4 = rz5Var.i - rz5Var.j;
            if (j4 < 0) {
                j4 = 0;
            }
            long j5 = j3 - ((j4 * rz5Var.b) * 2);
            if (j5 > 0) {
                return Util.scaleLargeTimestamp(j, j5, j2);
            }
        }
        return (long) (rz5Var.a * j);
    }

    @Override // androidx.media3.common.audio.AudioProcessorChain
    public long getSkippedOutputFrameCount() {
        return 0L;
    }

    public void h(wv4 wv4Var, int i) {
        wv4Var.getClass();
        c25 c25Var = (c25) this.b;
        ((vj4) ((mc3) c25Var).a).execute(new ww4((yt3) this.a, wv4Var, false, i));
    }

    public wv4 i(nx5 nx5Var) {
        wv4 n;
        synchronized (this.b) {
            n = ((cp0) this.a).n(nx5Var);
        }
        return n;
    }

    public /* synthetic */ v05(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public v05(yt3 yt3Var, c25 c25Var) {
        yt3Var.getClass();
        c25Var.getClass();
        this.a = yt3Var;
        this.b = c25Var;
    }
}

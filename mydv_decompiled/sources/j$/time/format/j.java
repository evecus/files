package j$.time.format;

import androidx.media3.common.C;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import okhttp3.internal.connection.RealConnection;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public class j implements f {
    public static final long[] f = {0, 10, 100, 1000, Renderer.DEFAULT_DURATION_TO_PROGRESS_US, SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, 1000000, 10000000, 100000000, C.NANOS_PER_SECOND, RealConnection.IDLE_CONNECTION_HEALTHY_NS};
    public final j$.time.temporal.p a;
    public final int b;
    public final int c;
    public final a0 d;
    public final int e;

    public j(j$.time.temporal.p pVar, int i, int i2, a0 a0Var) {
        this.a = pVar;
        this.b = i;
        this.c = i2;
        this.d = a0Var;
        this.e = 0;
    }

    public j b() {
        if (this.e == -1) {
            return this;
        }
        return new j(this.a, this.b, this.c, this.d, -1);
    }

    public j c(int i) {
        return new j(this.a, this.b, this.c, this.d, this.e + i);
    }

    @Override // j$.time.format.f
    public boolean d(u uVar, StringBuilder sb) {
        j$.time.temporal.p pVar = this.a;
        Long a = uVar.a(pVar);
        if (a == null) {
            return false;
        }
        long a2 = a(uVar, a.longValue());
        uVar.b.getClass();
        int i = y.a;
        String l = a2 == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(a2));
        int length = l.length();
        int i2 = this.c;
        if (length > i2) {
            throw new j$.time.c("Field " + pVar + " cannot be printed as the value " + a2 + " exceeds the maximum print width of " + i2);
        }
        int i3 = this.b;
        a0 a0Var = this.d;
        if (a2 >= 0) {
            int i4 = c.a[a0Var.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    sb.append('+');
                }
            } else if (i3 < 19 && a2 >= f[i3]) {
                sb.append('+');
            }
        } else {
            int i5 = c.a[a0Var.ordinal()];
            if (i5 == 1 || i5 == 2 || i5 == 3) {
                sb.append('-');
            } else if (i5 == 4) {
                throw new j$.time.c("Field " + pVar + " cannot be printed as the value " + a2 + " cannot be negative according to the SignStyle");
            }
        }
        for (int i6 = 0; i6 < i3 - l.length(); i6++) {
            sb.append('0');
        }
        sb.append(l);
        return true;
    }

    public String toString() {
        int i = this.c;
        j$.time.temporal.p pVar = this.a;
        a0 a0Var = this.d;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && a0Var == a0.NORMAL) {
            return "Value(" + pVar + ")";
        }
        if (i2 == i && a0Var == a0.NOT_NEGATIVE) {
            return "Value(" + pVar + "," + i2 + ")";
        }
        return "Value(" + pVar + "," + i2 + "," + i + "," + a0Var + ")";
    }

    public j(j$.time.temporal.p pVar, int i, int i2, a0 a0Var, int i3) {
        this.a = pVar;
        this.b = i;
        this.c = i2;
        this.d = a0Var;
        this.e = i3;
    }

    public long a(u uVar, long j) {
        return j;
    }
}

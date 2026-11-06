package defpackage;

import android.os.Bundle;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bc3 extends ac3 {
    public final Instant a;
    public final Long b;
    public final Duration c;
    public final boolean d;
    public final int e;

    public bc3(Instant instant, Long l, Duration duration, boolean z, int i) {
        sv2.p(((instant != null ? 1 : 0) + (l != null ? 1 : 0)) + (duration != null ? 1 : 0) == 1, "Exactly one of zeroTime, zeroElapsedRealtime, or pausedDuration must be present; received %s,%s,%s", instant, l, duration);
        sv2.p(i >= 1 && i <= 2, "Invalid format: %s", Integer.valueOf(i));
        this.a = instant;
        this.b = l;
        this.c = duration;
        this.d = z;
        this.e = i;
    }

    @Override // defpackage.ac3
    public final void a(Bundle bundle) {
        Instant instant = this.a;
        if (instant != null) {
            bundle.putLong("zeroTime", instant.toEpochMilli());
        } else {
            Long l = this.b;
            if (l != null) {
                bundle.putLong("zeroElapsedRealtime", l.longValue());
            } else {
                Duration duration = this.c;
                if (duration != null) {
                    bundle.putLong("pausedDuration", duration.toMillis());
                }
            }
        }
        bundle.putBoolean("countDown", this.d);
        bundle.putInt("format", this.e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bc3)) {
            return false;
        }
        bc3 bc3Var = (bc3) obj;
        if (this == bc3Var) {
            return true;
        }
        return Objects.equals(this.a, bc3Var.a) && Objects.equals(this.b, bc3Var.b) && Objects.equals(this.c, bc3Var.c) && this.d == bc3Var.d && this.e == bc3Var.e;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeDifference{");
        Instant instant = this.a;
        if (instant != null) {
            sb.append("mZeroTime=");
            sb.append(instant);
        } else {
            Long l = this.b;
            if (l != null) {
                sb.append("mZeroElapsedRealtime=");
                sb.append(l);
            } else {
                Duration duration = this.c;
                if (duration != null) {
                    sb.append("mPausedDuration=");
                    sb.append(duration);
                }
            }
        }
        sb.append(", mCountDown=");
        sb.append(this.d);
        sb.append(", mFormat=");
        return nt3.n(sb, this.e, "}");
    }
}

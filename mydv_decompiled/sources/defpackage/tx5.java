package defpackage;

import java.util.HashSet;
import java.util.UUID;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class tx5 {
    public final UUID a;
    public final sx5 b;
    public final HashSet c;
    public final dp0 d;
    public final dp0 e;
    public final int f;
    public final int g;
    public final ch0 h;
    public final long i;
    public final rx5 j;
    public final long k;
    public final int l;

    public tx5(UUID uuid, sx5 sx5Var, HashSet hashSet, dp0 dp0Var, dp0 dp0Var2, int i, int i2, ch0 ch0Var, long j, rx5 rx5Var, long j2, int i3) {
        dp0Var.getClass();
        dp0Var2.getClass();
        this.a = uuid;
        this.b = sx5Var;
        this.c = hashSet;
        this.d = dp0Var;
        this.e = dp0Var2;
        this.f = i;
        this.g = i2;
        this.h = ch0Var;
        this.i = j;
        this.j = rx5Var;
        this.k = j2;
        this.l = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !tx5.class.equals(obj.getClass())) {
            return false;
        }
        tx5 tx5Var = (tx5) obj;
        if (this.f == tx5Var.f && this.g == tx5Var.g && this.a.equals(tx5Var.a) && this.b == tx5Var.b && j42.c(this.d, tx5Var.d) && this.h.equals(tx5Var.h) && this.i == tx5Var.i && j42.c(this.j, tx5Var.j) && this.k == tx5Var.k && this.l == tx5Var.l && this.c.equals(tx5Var.c)) {
            return j42.c(this.e, tx5Var.e);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.h.hashCode() + ((((((this.e.hashCode() + ((this.c.hashCode() + ((this.d.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f) * 31) + this.g) * 31)) * 31;
        long j = this.i;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        rx5 rx5Var = this.j;
        int hashCode2 = (i + (rx5Var != null ? rx5Var.hashCode() : 0)) * 31;
        long j2 = this.k;
        return ((hashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.l;
    }

    public final String toString() {
        return "WorkInfo{id='" + this.a + "', state=" + this.b + ", outputData=" + this.d + ", tags=" + this.c + ", progress=" + this.e + ", runAttemptCount=" + this.f + ", generation=" + this.g + ", constraints=" + this.h + ", initialDelayMillis=" + this.i + ", periodicityInfo=" + this.j + ", nextScheduleTimeMillis=" + this.k + "}, stopReason=" + this.l;
    }
}

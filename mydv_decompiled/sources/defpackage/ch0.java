package defpackage;

import android.net.NetworkRequest;
import android.os.Build;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ch0 {
    public static final ch0 j = new ch0();
    public final x93 a;
    public final r93 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;

    public ch0(ch0 ch0Var) {
        ch0Var.getClass();
        this.c = ch0Var.c;
        this.d = ch0Var.d;
        this.b = ch0Var.b;
        this.a = ch0Var.a;
        this.e = ch0Var.e;
        this.f = ch0Var.f;
        this.i = ch0Var.i;
        this.g = ch0Var.g;
        this.h = ch0Var.h;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.a;
    }

    public final boolean b() {
        return Build.VERSION.SDK_INT < 24 || !this.i.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ch0.class.equals(obj.getClass())) {
            return false;
        }
        ch0 ch0Var = (ch0) obj;
        if (this.c == ch0Var.c && this.d == ch0Var.d && this.e == ch0Var.e && this.f == ch0Var.f && this.g == ch0Var.g && this.h == ch0Var.h && j42.c(a(), ch0Var.a()) && this.a == ch0Var.a) {
            return this.i.equals(ch0Var.i);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.a.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31;
        long j2 = this.g;
        int i = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.h;
        int hashCode2 = (this.i.hashCode() + ((i + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31;
        NetworkRequest a = a();
        return hashCode2 + (a != null ? a.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.a + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }

    public ch0(r93 r93Var, x93 x93Var, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, Set set) {
        this.b = r93Var;
        this.a = x93Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j2;
        this.h = j3;
        this.i = set;
    }

    public ch0() {
        this.b = new r93(null);
        this.a = x93.I;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = t91.I;
    }
}

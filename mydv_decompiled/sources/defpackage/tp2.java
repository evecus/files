package defpackage;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class tp2 {
    public final long a;
    public final String b;
    public final String c;
    public final byte[] d;
    public final LinkedHashMap e;

    public tp2(long j, String str, String str2, byte[] bArr, LinkedHashMap linkedHashMap) {
        bArr.getClass();
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = bArr;
        this.e = linkedHashMap;
    }

    public final Map a() {
        return this.e;
    }

    public final long b() {
        return this.a;
    }

    public final byte[] c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp2)) {
            return false;
        }
        tp2 tp2Var = (tp2) obj;
        return this.a == tp2Var.a && this.b.equals(tp2Var.b) && this.c.equals(tp2Var.c) && j42.c(this.d, tp2Var.d) && this.e.equals(tp2Var.e);
    }

    public final int hashCode() {
        long j = this.a;
        return this.e.hashCode() + ((Arrays.hashCode(this.d) + hf1.n(hf1.n(((int) (j ^ (j >>> 32))) * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.d);
        StringBuilder sb = new StringBuilder("PushFrame(logId=");
        sb.append(this.a);
        sb.append(", payloadEncoding=");
        sb.append(this.b);
        r7.N(sb, ", payloadType=", this.c, ", payload=", arrays);
        sb.append(", headers=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}

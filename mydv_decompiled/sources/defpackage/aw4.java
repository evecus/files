package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class aw4 implements sn4 {
    public final long I;
    public final long J;

    public aw4(long j, long j2) {
        this.I = j;
        this.J = j2;
        if (j < 0) {
            s83.m("stopTimeout(", j, " ms) cannot be negative");
            throw null;
        }
        if (j2 >= 0) {
            return;
        }
        s83.m("replayExpiration(", j2, " ms) cannot be negative");
        throw null;
    }

    @Override // defpackage.sn4
    public final zf1 a(az4 az4Var) {
        zv4 zv4Var = new zv4(this, null);
        int i = sg1.a;
        return o7.p(new ng1(new x40(zv4Var, az4Var, l91.I, -2, ez.I), new e14(2, null, (byte) 1)));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aw4)) {
            return false;
        }
        aw4 aw4Var = (aw4) obj;
        return this.I == aw4Var.I && this.J == aw4Var.J;
    }

    public final int hashCode() {
        return i82.Q(this.J) + (i82.Q(this.I) * 31);
    }

    public final String toString() {
        mk2 mk2Var = new mk2(2);
        long j = this.I;
        if (j > 0) {
            mk2Var.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.J;
        if (j2 < Long.MAX_VALUE) {
            mk2Var.add("replayExpiration=" + j2 + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + o70.Z0(p70.D(mk2Var), null, null, null, 0, null, 63) + ')';
    }
}

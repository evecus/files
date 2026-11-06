package j$.time.format;

import j$.time.LocalDate;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class m extends j {
    public static final LocalDate h = LocalDate.x(2000, 1, 1);
    public final j$.time.chrono.b g;

    public m(j$.time.temporal.p pVar, int i, int i2, j$.time.chrono.b bVar, int i3) {
        super(pVar, i, i2, a0.NOT_NEGATIVE, i3);
        this.g = bVar;
    }

    @Override // j$.time.format.j
    public final long a(u uVar, long j) {
        long abs = Math.abs(j);
        j$.time.chrono.b bVar = this.g;
        long d = bVar != null ? j$.time.a.R(uVar.a).e(bVar).d(this.a) : 0;
        long[] jArr = j.f;
        if (j >= d) {
            long j2 = jArr[this.b];
            if (j < d + j2) {
                return abs % j2;
            }
        }
        return abs % jArr[this.c];
    }

    @Override // j$.time.format.j
    public final j b() {
        if (this.e == -1) {
            return this;
        }
        return new m(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.j
    public final j c(int i) {
        return new m(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.j
    public final String toString() {
        Object obj = this.g;
        return "ReducedValue(" + this.a + "," + this.b + "," + this.c + "," + (obj != null ? obj : 0) + ")";
    }
}

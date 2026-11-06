package j$.time.format;

import j$.util.Objects;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class g extends j {
    public final boolean g;

    public g(j$.time.temporal.p pVar, int i, int i2, boolean z) {
        this(pVar, i, i2, z, 0);
        Objects.a(pVar, "field");
        j$.time.temporal.s range = pVar.range();
        if (range.a != range.b || range.c != range.d) {
            j$.time.h.c(j$.time.d.a("Field must have a fixed set of values: ", pVar));
            throw null;
        }
        if (i < 0 || i > 9) {
            j$.time.h.i("Minimum width must be from 0 to 9 inclusive but was ", i);
            throw null;
        }
        if (i2 < 1 || i2 > 9) {
            j$.time.h.i("Maximum width must be from 1 to 9 inclusive but was ", i2);
            throw null;
        }
        if (i2 >= i) {
            return;
        }
        throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
    }

    @Override // j$.time.format.j
    public final j b() {
        if (this.e == -1) {
            return this;
        }
        return new g(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.j
    public final j c(int i) {
        return new g(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.j, j$.time.format.f
    public final boolean d(u uVar, StringBuilder sb) {
        j$.time.temporal.p pVar = this.a;
        Long a = uVar.a(pVar);
        if (a == null) {
            return false;
        }
        uVar.b.getClass();
        int i = y.a;
        long longValue = a.longValue();
        j$.time.temporal.s range = pVar.range();
        range.b(longValue, pVar);
        BigDecimal valueOf = BigDecimal.valueOf(range.a);
        BigDecimal add = BigDecimal.valueOf(range.d).subtract(valueOf).add(BigDecimal.ONE);
        BigDecimal subtract = BigDecimal.valueOf(longValue).subtract(valueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal divide = subtract.divide(add, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (divide.compareTo(bigDecimal) != 0) {
            bigDecimal = divide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : divide.stripTrailingZeros();
        }
        int scale = bigDecimal.scale();
        boolean z = this.g;
        int i2 = this.b;
        if (scale != 0) {
            String substring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i2), this.c), roundingMode).toPlainString().substring(2);
            if (z) {
                sb.append('.');
            }
            sb.append(substring);
            return true;
        }
        if (i2 > 0) {
            if (z) {
                sb.append('.');
            }
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append('0');
            }
        }
        return true;
    }

    @Override // j$.time.format.j
    public final String toString() {
        return "Fraction(" + this.a + "," + this.b + "," + this.c + (this.g ? ",DecimalPoint" : "") + ")";
    }

    public g(j$.time.temporal.p pVar, int i, int i2, boolean z, int i3) {
        super(pVar, i, i2, a0.NOT_NEGATIVE, i3);
        this.g = z;
    }
}

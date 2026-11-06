package j$.time.format;

import j$.time.LocalDateTime;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class h implements f {
    @Override // j$.time.format.f
    public final boolean d(u uVar, StringBuilder sb) {
        Long a = uVar.a(j$.time.temporal.a.INSTANT_SECONDS);
        j$.time.temporal.m mVar = uVar.a;
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long valueOf = mVar.c(aVar) ? Long.valueOf(mVar.m(aVar)) : null;
        int i = 0;
        if (a == null) {
            return false;
        }
        long longValue = a.longValue();
        int a2 = aVar.b.a(valueOf != null ? valueOf.longValue() : 0L, aVar);
        if (longValue >= -62167219200L) {
            long j = longValue - 253402300800L;
            long V = j$.time.a.V(j, 315569520000L) + 1;
            LocalDateTime u = LocalDateTime.u(j$.time.a.U(j, 315569520000L) - 62167219200L, 0, j$.time.y.f);
            if (V > 0) {
                sb.append('+');
                sb.append(V);
            }
            sb.append(u);
            if (u.getSecond() == 0) {
                sb.append(":00");
            }
        } else {
            long j2 = longValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            LocalDateTime u2 = LocalDateTime.u(j4 - 62167219200L, 0, j$.time.y.f);
            int length = sb.length();
            sb.append(u2);
            if (u2.getSecond() == 0) {
                sb.append(":00");
            }
            if (j3 < 0) {
                if (u2.a.a == -10000) {
                    sb.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb.insert(length, j3);
                } else {
                    sb.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (a2 > 0) {
            sb.append('.');
            int i2 = 100000000;
            while (true) {
                if (a2 <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = a2 / i2;
                sb.append((char) (i3 + 48));
                a2 -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb.append('Z');
        return true;
    }

    public final String toString() {
        return "Instant()";
    }
}

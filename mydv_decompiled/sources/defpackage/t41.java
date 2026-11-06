package defpackage;

import androidx.media3.common.C;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.upstream.CmcdData;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class t41 implements Comparable {
    public static final jp J = new jp(18);
    public static final long K = sp0.G(4611686018427387903L);
    public static final long L = sp0.G(-4611686018427387903L);
    public static final long M = 9223372036854759646L;
    public final long I;

    public /* synthetic */ t41(long j) {
        this.I = j;
    }

    public static final long a(long j, long j2) {
        long j3 = j2 / 1000000;
        long h = sp0.h(j, j3);
        if (-4611686018426L > h || h >= 4611686018427L) {
            return sp0.G(h);
        }
        return sp0.H((h * 1000000) + (j2 - (j3 * 1000000)));
    }

    public static final void b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String P = jx4.P(i3, String.valueOf(i2));
            int i4 = -1;
            int length = P.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (P.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) P, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) P, 0, i6);
            }
        }
        sb.append(str);
    }

    public static int c(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return j42.n(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    public static final long d(long j) {
        return ((((int) j) & 1) != 1 || f(j)) ? h(j, x41.MILLISECONDS) : j >> 1;
    }

    public static final int e(long j) {
        if (f(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % C.NANOS_PER_SECOND);
    }

    public static final boolean f(long j) {
        return j == K || j == L;
    }

    public static final long g(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            return (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) ? sp0.G(j3 / 1000000) : sp0.H(j3);
        }
        long h = sp0.h(j >> 1, j2 >> 1);
        if (h != 9223372036854759646L) {
            return (h == 4611686018427387903L || h == -4611686018427387903L) ? sp0.G(h) : (-4611686018426L > h || h >= 4611686018427L) ? sp0.G(ut0.s(h, -4611686018427387903L, 4611686018427387903L)) : sp0.H(h * 1000000);
        }
        s83.t("Summing infinite durations of different signs yields an undefined result.");
        return 0L;
    }

    public static final long h(long j, x41 x41Var) {
        if (j == K) {
            return Long.MAX_VALUE;
        }
        if (j == L) {
            return Long.MIN_VALUE;
        }
        return x41Var.I.convert(j >> 1, ((((int) j) & 1) == 0 ? x41.NANOSECONDS : x41.MILLISECONDS).I);
    }

    public static String i(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == K) {
            return "Infinity";
        }
        if (j == L) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (j < 0) {
            j = j(j);
        }
        long h = h(j, x41.DAYS);
        int h2 = f(j) ? 0 : (int) (h(j, x41.HOURS) % 24);
        int h3 = f(j) ? 0 : (int) (h(j, x41.MINUTES) % 60);
        int h4 = f(j) ? 0 : (int) (h(j, x41.SECONDS) % 60);
        int e = e(j);
        boolean z2 = h != 0;
        boolean z3 = h2 != 0;
        boolean z4 = h3 != 0;
        boolean z5 = (h4 == 0 && e == 0) ? false : true;
        if (z2) {
            sb.append(h);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(h2);
            sb.append('h');
            i = i2;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(h3);
            sb.append('m');
            i = i3;
        }
        if (z5) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (h4 != 0 || z2 || z3 || z4) {
                b(sb, h4, e, 9, CmcdData.STREAMING_FORMAT_SS, false);
            } else if (e >= 1000000) {
                b(sb, e / PlaybackException.CUSTOM_ERROR_CODE_BASE, e % PlaybackException.CUSTOM_ERROR_CODE_BASE, 6, "ms", false);
            } else if (e >= 1000) {
                b(sb, e / 1000, e % 1000, 3, "us", false);
            } else {
                sb.append(e);
                sb.append("ns");
            }
            i = i4;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long j(long j) {
        long j2 = ((-(j >> 1)) << 1) + (((int) j) & 1);
        int i = v41.a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.I, ((t41) obj).I);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t41) {
            return this.I == ((t41) obj).I;
        }
        return false;
    }

    public final int hashCode() {
        return i82.Q(this.I);
    }

    public final String toString() {
        return i(this.I);
    }
}

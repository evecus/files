package j$.time.format;

import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class k implements f {
    public static final String[] d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};
    public static final k e = new k("+HH:MM:ss", "Z");
    public final String a;
    public final int b;
    public final int c;

    static {
        new k("+HH:MM:ss", "0");
    }

    public k(String str, String str2) {
        Objects.a(str, "pattern");
        for (int i = 0; i < 22; i++) {
            if (d[i].equals(str)) {
                this.b = i;
                this.c = i % 11;
                this.a = str2;
                return;
            }
        }
        j$.time.h.c("Invalid zone offset pattern: ".concat(str));
        throw null;
    }

    public static void a(boolean z, int i, StringBuilder sb) {
        sb.append(z ? ":" : "");
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    @Override // j$.time.format.f
    public final boolean d(u uVar, StringBuilder sb) {
        Long a = uVar.a(j$.time.temporal.a.OFFSET_SECONDS);
        boolean z = false;
        if (a == null) {
            return false;
        }
        long longValue = a.longValue();
        int i = (int) longValue;
        if (longValue != i) {
            throw new ArithmeticException();
        }
        String str = this.a;
        if (i == 0) {
            sb.append(str);
            return true;
        }
        int abs = Math.abs((i / 3600) % 100);
        int abs2 = Math.abs((i / 60) % 60);
        int abs3 = Math.abs(i % 60);
        int length = sb.length();
        sb.append(i < 0 ? "-" : "+");
        if (this.b >= 11 && abs < 10) {
            sb.append((char) (abs + 48));
        } else {
            a(false, abs, sb);
        }
        int i2 = this.c;
        if ((i2 >= 3 && i2 <= 8) || ((i2 >= 9 && abs3 > 0) || (i2 >= 1 && abs2 > 0))) {
            a(i2 > 0 && i2 % 2 == 0, abs2, sb);
            abs += abs2;
            if (i2 == 7 || i2 == 8 || (i2 >= 5 && abs3 > 0)) {
                if (i2 > 0 && i2 % 2 == 0) {
                    z = true;
                }
                a(z, abs3, sb);
                abs += abs3;
            }
        }
        if (abs == 0) {
            sb.setLength(length);
            sb.append(str);
        }
        return true;
    }

    public final String toString() {
        String replace = this.a.replace("'", "''");
        return "Offset(" + d[this.b] + ",'" + replace + "')";
    }
}

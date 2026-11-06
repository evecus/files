package j$.time.format;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class i implements f {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ i(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    public static void a(StringBuilder sb, int i) {
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    @Override // j$.time.format.f
    public final boolean d(u uVar, StringBuilder sb) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Long a = uVar.a(j$.time.temporal.a.OFFSET_SECONDS);
                if (a == null) {
                    return false;
                }
                sb.append("GMT");
                long longValue = a.longValue();
                int i = (int) longValue;
                if (longValue != i) {
                    throw new ArithmeticException();
                }
                if (i == 0) {
                    return true;
                }
                int abs = Math.abs((i / 3600) % 100);
                int abs2 = Math.abs((i / 60) % 60);
                int abs3 = Math.abs(i % 60);
                sb.append(i < 0 ? "-" : "+");
                if (((b0) obj) == b0.FULL) {
                    a(sb, abs);
                    sb.append(':');
                    a(sb, abs2);
                    if (abs3 == 0) {
                        return true;
                    }
                    sb.append(':');
                    a(sb, abs3);
                    return true;
                }
                if (abs >= 10) {
                    sb.append((char) ((abs / 10) + 48));
                }
                sb.append((char) ((abs % 10) + 48));
                if (abs2 == 0 && abs3 == 0) {
                    return true;
                }
                sb.append(':');
                a(sb, abs2);
                if (abs3 == 0) {
                    return true;
                }
                sb.append(':');
                a(sb, abs3);
                return true;
            default:
                sb.append((String) obj);
                return true;
        }
    }

    public final String toString() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return "LocalizedOffset(" + ((b0) obj) + ")";
            default:
                return "'" + ((String) obj).replace("'", "''") + "'";
        }
    }
}

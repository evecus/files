package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class pw extends f83 {
    public final /* synthetic */ byte e;

    public pw(byte b, boolean z) {
        this.e = b;
    }

    @Override // defpackage.f83
    public final Object a(Bundle bundle, String str) {
        switch (this.e) {
            case 0:
                bundle.getClass();
                if (!bundle.containsKey(str) || sp0.Y(bundle, str)) {
                    return null;
                }
                boolean z = bundle.getBoolean(str, false);
                if (z || !bundle.getBoolean(str, true)) {
                    return Boolean.valueOf(z);
                }
                jl2.W(str);
                throw null;
            case 1:
                bundle.getClass();
                return Integer.valueOf(sp0.R(bundle, str));
            case 2:
                bundle.getClass();
                long j = bundle.getLong(str, Long.MIN_VALUE);
                if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
                    return Long.valueOf(j);
                }
                jl2.W(str);
                throw null;
            default:
                bundle.getClass();
                if (!bundle.containsKey(str) || sp0.Y(bundle, str)) {
                    return null;
                }
                String string = bundle.getString(str);
                if (string != null) {
                    return string;
                }
                jl2.W(str);
                throw null;
        }
    }

    @Override // defpackage.f83
    public final String b() {
        switch (this.e) {
            case 0:
                return "boolean";
            case 1:
                return "integer";
            case 2:
                return "long";
            default:
                return "string";
        }
    }

    @Override // defpackage.f83
    public final Object d(String str) {
        int parseInt;
        long parseLong;
        boolean z = true;
        switch (this.e) {
            case 0:
                if (!str.equals("true")) {
                    if (!str.equals("false")) {
                        s83.t("A boolean NavType only accepts \"true\" or \"false\" values.");
                        return null;
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if (qx4.y(str, "0x", false)) {
                    String substring = str.substring(2);
                    o7.k(16);
                    parseInt = Integer.parseInt(substring, 16);
                } else {
                    parseInt = Integer.parseInt(str);
                }
                return Integer.valueOf(parseInt);
            case 2:
                String substring2 = qx4.s(str, "L", false) ? str.substring(0, str.length() - 1) : str;
                if (qx4.y(str, "0x", false)) {
                    String substring3 = substring2.substring(2);
                    o7.k(16);
                    parseLong = Long.parseLong(substring3, 16);
                } else {
                    parseLong = Long.parseLong(substring2);
                }
                return Long.valueOf(parseLong);
            default:
                if (str.equals("null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // defpackage.f83
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.e) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                str.getClass();
                bundle.putBoolean(str, booleanValue);
                break;
            case 1:
                int intValue = ((Number) obj).intValue();
                str.getClass();
                bundle.putInt(str, intValue);
                break;
            case 2:
                long longValue = ((Number) obj).longValue();
                str.getClass();
                bundle.putLong(str, longValue);
                break;
            default:
                String str2 = (String) obj;
                str.getClass();
                if (str2 == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putString(str, str2);
                    break;
                }
        }
    }
}

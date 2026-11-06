package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class dl4 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public dl4(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str9.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
    }

    public static dl4 a(dl4 dl4Var, String str, String str2, String str3, int i) {
        String str4 = (i & 1) != 0 ? dl4Var.a : "main";
        String str5 = dl4Var.b;
        String str6 = dl4Var.c;
        String str7 = dl4Var.d;
        String str8 = dl4Var.e;
        String str9 = dl4Var.f;
        if ((i & 64) != 0) {
            str = dl4Var.g;
        }
        String str10 = str;
        if ((i & 128) != 0) {
            str2 = dl4Var.h;
        }
        String str11 = str2;
        String str12 = (i & 256) != 0 ? dl4Var.i : str3;
        String str13 = dl4Var.j;
        dl4Var.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        str10.getClass();
        str11.getClass();
        str12.getClass();
        str13.getClass();
        return new dl4(str4, str5, str6, str7, str8, str9, str10, str11, str12, str13);
    }

    public final boolean b() {
        return (jx4.L(this.g) || jx4.L(this.h)) ? false : true;
    }

    public final String c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = jx4.X(this.b, new String[]{";"}, 6).iterator();
        while (it.hasNext()) {
            List X = jx4.X(jx4.g0((String) it.next()).toString(), new String[]{"="}, 2);
            if (X.size() == 2) {
                linkedHashMap.put(jx4.g0((String) X.get(0)).toString(), jx4.g0((String) X.get(1)).toString());
            }
        }
        String str = (String) linkedHashMap.get("uid_tt_ss");
        if (str != null) {
            return str;
        }
        String str2 = (String) linkedHashMap.get("uid_tt");
        return str2 == null ? "" : str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl4)) {
            return false;
        }
        dl4 dl4Var = (dl4) obj;
        return j42.c(this.a, dl4Var.a) && j42.c(this.b, dl4Var.b) && j42.c(this.c, dl4Var.c) && j42.c(this.d, dl4Var.d) && j42.c(this.e, dl4Var.e) && j42.c(this.f, dl4Var.f) && j42.c(this.g, dl4Var.g) && j42.c(this.h, dl4Var.h) && j42.c(this.i, dl4Var.i) && j42.c(this.j, dl4Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + hf1.n(hf1.n(hf1.n(hf1.n(hf1.n(hf1.n(hf1.n(hf1.n(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder F = r7.F("AccountInfo(id=", this.a, ", cookie=", this.b, ", interactionSecurityPayload=");
        r7.N(F, this.c, ", interactionTicket=", this.d, ", interactionTsSign=");
        r7.N(F, this.e, ", interactionPrivateKey=", this.f, ", pinHash=");
        r7.N(F, this.g, ", pinSalt=", this.h, ", userId=");
        F.append(this.i);
        F.append(", interactionServerCert=");
        F.append(this.j);
        F.append(")");
        return F.toString();
    }

    public /* synthetic */ dl4(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        this(str, str2, str3, str4, str5, str6, "", "", (i & 256) != 0 ? "" : str7, str8);
    }
}

package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class f73 {
    public static final v24 m = new v24("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final v24 n = new v24("\\{(.+?)\\}");
    public static final v24 o = new v24("http[s]?://");
    public static final v24 p = new v24(".*");
    public static final v24 q = new v24("([^/]*?|)");
    public static final v24 r = new v24("^[^?#]+\\?([^#]*).*");
    public final String a;
    public final ArrayList b;
    public final String c;
    public final u05 d;
    public final u05 e;
    public final uc2 f;
    public boolean g;
    public final uc2 h;
    public final uc2 i;
    public final uc2 j;
    public final u05 k;
    public final boolean l;

    public f73(String str) {
        this.a = str;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        boolean z = false;
        z = false;
        final byte b = z ? (byte) 1 : (byte) 0;
        this.d = new u05(new rm1(this) { // from class: d73
            public final /* synthetic */ f73 J;

            {
                this.J = this;
            }

            @Override // defpackage.rm1
            public final Object invoke() {
                List list;
                byte b2 = b;
                f73 f73Var = this.J;
                switch (b2) {
                    case 0:
                        String str2 = f73Var.c;
                        if (str2 != null) {
                            return new v24(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(f73.r.e(f73Var.a));
                    case 2:
                        String str3 = f73Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) f73Var.e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    s83.h(hf1.x("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) o70.U0(queryParameters);
                                if (str5 == null) {
                                    f73Var.g = true;
                                    str5 = str4;
                                }
                                e73 e73Var = new e73();
                                int i = 0;
                                for (zv2 a = v24.a(f73.n, str5); a != null; a = a.c()) {
                                    wv2 d = a.c.d(1);
                                    d.getClass();
                                    e73Var.a(d.a);
                                    if (a.b().I > i) {
                                        String quote = Pattern.quote(str5.substring(i, a.b().I));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i = a.b().J + 1;
                                }
                                if (i < str5.length()) {
                                    String quote2 = Pattern.quote(str5.substring(i));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                e73Var.d(f73.h(sb.toString()));
                                linkedHashMap.put(str4, e73Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = f73Var.a;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        f73.a(fragment, arrayList2, sb2);
                        return new uj3(arrayList2, sb2.toString());
                    case 4:
                        uj3 uj3Var = (uj3) f73Var.h.getValue();
                        return (uj3Var == null || (list = (List) uj3Var.I) == null) ? new ArrayList() : list;
                    case 5:
                        uj3 uj3Var2 = (uj3) f73Var.h.getValue();
                        if (uj3Var2 != null) {
                            return (String) uj3Var2.J;
                        }
                        return null;
                    default:
                        String str7 = (String) f73Var.j.getValue();
                        if (str7 != null) {
                            return new v24(str7, 0);
                        }
                        return null;
                }
            }
        });
        final byte b2 = 1;
        this.e = new u05(new rm1(this) { // from class: d73
            public final /* synthetic */ f73 J;

            {
                this.J = this;
            }

            @Override // defpackage.rm1
            public final Object invoke() {
                List list;
                byte b22 = b2;
                f73 f73Var = this.J;
                switch (b22) {
                    case 0:
                        String str2 = f73Var.c;
                        if (str2 != null) {
                            return new v24(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(f73.r.e(f73Var.a));
                    case 2:
                        String str3 = f73Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) f73Var.e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    s83.h(hf1.x("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) o70.U0(queryParameters);
                                if (str5 == null) {
                                    f73Var.g = true;
                                    str5 = str4;
                                }
                                e73 e73Var = new e73();
                                int i = 0;
                                for (zv2 a = v24.a(f73.n, str5); a != null; a = a.c()) {
                                    wv2 d = a.c.d(1);
                                    d.getClass();
                                    e73Var.a(d.a);
                                    if (a.b().I > i) {
                                        String quote = Pattern.quote(str5.substring(i, a.b().I));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i = a.b().J + 1;
                                }
                                if (i < str5.length()) {
                                    String quote2 = Pattern.quote(str5.substring(i));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                e73Var.d(f73.h(sb.toString()));
                                linkedHashMap.put(str4, e73Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = f73Var.a;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        f73.a(fragment, arrayList2, sb2);
                        return new uj3(arrayList2, sb2.toString());
                    case 4:
                        uj3 uj3Var = (uj3) f73Var.h.getValue();
                        return (uj3Var == null || (list = (List) uj3Var.I) == null) ? new ArrayList() : list;
                    case 5:
                        uj3 uj3Var2 = (uj3) f73Var.h.getValue();
                        if (uj3Var2 != null) {
                            return (String) uj3Var2.J;
                        }
                        return null;
                    default:
                        String str7 = (String) f73Var.j.getValue();
                        if (str7 != null) {
                            return new v24(str7, 0);
                        }
                        return null;
                }
            }
        });
        final byte b3 = 2;
        rm1 rm1Var = new rm1(this) { // from class: d73
            public final /* synthetic */ f73 J;

            {
                this.J = this;
            }

            @Override // defpackage.rm1
            public final Object invoke() {
                List list;
                byte b22 = b3;
                f73 f73Var = this.J;
                switch (b22) {
                    case 0:
                        String str2 = f73Var.c;
                        if (str2 != null) {
                            return new v24(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(f73.r.e(f73Var.a));
                    case 2:
                        String str3 = f73Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) f73Var.e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    s83.h(hf1.x("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) o70.U0(queryParameters);
                                if (str5 == null) {
                                    f73Var.g = true;
                                    str5 = str4;
                                }
                                e73 e73Var = new e73();
                                int i = 0;
                                for (zv2 a = v24.a(f73.n, str5); a != null; a = a.c()) {
                                    wv2 d = a.c.d(1);
                                    d.getClass();
                                    e73Var.a(d.a);
                                    if (a.b().I > i) {
                                        String quote = Pattern.quote(str5.substring(i, a.b().I));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i = a.b().J + 1;
                                }
                                if (i < str5.length()) {
                                    String quote2 = Pattern.quote(str5.substring(i));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                e73Var.d(f73.h(sb.toString()));
                                linkedHashMap.put(str4, e73Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = f73Var.a;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        f73.a(fragment, arrayList2, sb2);
                        return new uj3(arrayList2, sb2.toString());
                    case 4:
                        uj3 uj3Var = (uj3) f73Var.h.getValue();
                        return (uj3Var == null || (list = (List) uj3Var.I) == null) ? new ArrayList() : list;
                    case 5:
                        uj3 uj3Var2 = (uj3) f73Var.h.getValue();
                        if (uj3Var2 != null) {
                            return (String) uj3Var2.J;
                        }
                        return null;
                    default:
                        String str7 = (String) f73Var.j.getValue();
                        if (str7 != null) {
                            return new v24(str7, 0);
                        }
                        return null;
                }
            }
        };
        dh2 dh2Var = dh2.J;
        this.f = ut0.K(dh2Var, rm1Var);
        final byte b4 = 3;
        this.h = ut0.K(dh2Var, new rm1(this) { // from class: d73
            public final /* synthetic */ f73 J;

            {
                this.J = this;
            }

            @Override // defpackage.rm1
            public final Object invoke() {
                List list;
                byte b22 = b4;
                f73 f73Var = this.J;
                switch (b22) {
                    case 0:
                        String str2 = f73Var.c;
                        if (str2 != null) {
                            return new v24(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(f73.r.e(f73Var.a));
                    case 2:
                        String str3 = f73Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) f73Var.e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    s83.h(hf1.x("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) o70.U0(queryParameters);
                                if (str5 == null) {
                                    f73Var.g = true;
                                    str5 = str4;
                                }
                                e73 e73Var = new e73();
                                int i = 0;
                                for (zv2 a = v24.a(f73.n, str5); a != null; a = a.c()) {
                                    wv2 d = a.c.d(1);
                                    d.getClass();
                                    e73Var.a(d.a);
                                    if (a.b().I > i) {
                                        String quote = Pattern.quote(str5.substring(i, a.b().I));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i = a.b().J + 1;
                                }
                                if (i < str5.length()) {
                                    String quote2 = Pattern.quote(str5.substring(i));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                e73Var.d(f73.h(sb.toString()));
                                linkedHashMap.put(str4, e73Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = f73Var.a;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        f73.a(fragment, arrayList2, sb2);
                        return new uj3(arrayList2, sb2.toString());
                    case 4:
                        uj3 uj3Var = (uj3) f73Var.h.getValue();
                        return (uj3Var == null || (list = (List) uj3Var.I) == null) ? new ArrayList() : list;
                    case 5:
                        uj3 uj3Var2 = (uj3) f73Var.h.getValue();
                        if (uj3Var2 != null) {
                            return (String) uj3Var2.J;
                        }
                        return null;
                    default:
                        String str7 = (String) f73Var.j.getValue();
                        if (str7 != null) {
                            return new v24(str7, 0);
                        }
                        return null;
                }
            }
        });
        final byte b5 = 4;
        this.i = ut0.K(dh2Var, new rm1(this) { // from class: d73
            public final /* synthetic */ f73 J;

            {
                this.J = this;
            }

            @Override // defpackage.rm1
            public final Object invoke() {
                List list;
                byte b22 = b5;
                f73 f73Var = this.J;
                switch (b22) {
                    case 0:
                        String str2 = f73Var.c;
                        if (str2 != null) {
                            return new v24(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(f73.r.e(f73Var.a));
                    case 2:
                        String str3 = f73Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) f73Var.e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    s83.h(hf1.x("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) o70.U0(queryParameters);
                                if (str5 == null) {
                                    f73Var.g = true;
                                    str5 = str4;
                                }
                                e73 e73Var = new e73();
                                int i = 0;
                                for (zv2 a = v24.a(f73.n, str5); a != null; a = a.c()) {
                                    wv2 d = a.c.d(1);
                                    d.getClass();
                                    e73Var.a(d.a);
                                    if (a.b().I > i) {
                                        String quote = Pattern.quote(str5.substring(i, a.b().I));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i = a.b().J + 1;
                                }
                                if (i < str5.length()) {
                                    String quote2 = Pattern.quote(str5.substring(i));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                e73Var.d(f73.h(sb.toString()));
                                linkedHashMap.put(str4, e73Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = f73Var.a;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        f73.a(fragment, arrayList2, sb2);
                        return new uj3(arrayList2, sb2.toString());
                    case 4:
                        uj3 uj3Var = (uj3) f73Var.h.getValue();
                        return (uj3Var == null || (list = (List) uj3Var.I) == null) ? new ArrayList() : list;
                    case 5:
                        uj3 uj3Var2 = (uj3) f73Var.h.getValue();
                        if (uj3Var2 != null) {
                            return (String) uj3Var2.J;
                        }
                        return null;
                    default:
                        String str7 = (String) f73Var.j.getValue();
                        if (str7 != null) {
                            return new v24(str7, 0);
                        }
                        return null;
                }
            }
        });
        final byte b6 = 5;
        this.j = ut0.K(dh2Var, new rm1(this) { // from class: d73
            public final /* synthetic */ f73 J;

            {
                this.J = this;
            }

            @Override // defpackage.rm1
            public final Object invoke() {
                List list;
                byte b22 = b6;
                f73 f73Var = this.J;
                switch (b22) {
                    case 0:
                        String str2 = f73Var.c;
                        if (str2 != null) {
                            return new v24(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(f73.r.e(f73Var.a));
                    case 2:
                        String str3 = f73Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) f73Var.e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    s83.h(hf1.x("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) o70.U0(queryParameters);
                                if (str5 == null) {
                                    f73Var.g = true;
                                    str5 = str4;
                                }
                                e73 e73Var = new e73();
                                int i = 0;
                                for (zv2 a = v24.a(f73.n, str5); a != null; a = a.c()) {
                                    wv2 d = a.c.d(1);
                                    d.getClass();
                                    e73Var.a(d.a);
                                    if (a.b().I > i) {
                                        String quote = Pattern.quote(str5.substring(i, a.b().I));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i = a.b().J + 1;
                                }
                                if (i < str5.length()) {
                                    String quote2 = Pattern.quote(str5.substring(i));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                e73Var.d(f73.h(sb.toString()));
                                linkedHashMap.put(str4, e73Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = f73Var.a;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        f73.a(fragment, arrayList2, sb2);
                        return new uj3(arrayList2, sb2.toString());
                    case 4:
                        uj3 uj3Var = (uj3) f73Var.h.getValue();
                        return (uj3Var == null || (list = (List) uj3Var.I) == null) ? new ArrayList() : list;
                    case 5:
                        uj3 uj3Var2 = (uj3) f73Var.h.getValue();
                        if (uj3Var2 != null) {
                            return (String) uj3Var2.J;
                        }
                        return null;
                    default:
                        String str7 = (String) f73Var.j.getValue();
                        if (str7 != null) {
                            return new v24(str7, 0);
                        }
                        return null;
                }
            }
        });
        final byte b7 = 6;
        this.k = new u05(new rm1(this) { // from class: d73
            public final /* synthetic */ f73 J;

            {
                this.J = this;
            }

            @Override // defpackage.rm1
            public final Object invoke() {
                List list;
                byte b22 = b7;
                f73 f73Var = this.J;
                switch (b22) {
                    case 0:
                        String str2 = f73Var.c;
                        if (str2 != null) {
                            return new v24(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(f73.r.e(f73Var.a));
                    case 2:
                        String str3 = f73Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) f73Var.e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    s83.h(hf1.x("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) o70.U0(queryParameters);
                                if (str5 == null) {
                                    f73Var.g = true;
                                    str5 = str4;
                                }
                                e73 e73Var = new e73();
                                int i = 0;
                                for (zv2 a = v24.a(f73.n, str5); a != null; a = a.c()) {
                                    wv2 d = a.c.d(1);
                                    d.getClass();
                                    e73Var.a(d.a);
                                    if (a.b().I > i) {
                                        String quote = Pattern.quote(str5.substring(i, a.b().I));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i = a.b().J + 1;
                                }
                                if (i < str5.length()) {
                                    String quote2 = Pattern.quote(str5.substring(i));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                e73Var.d(f73.h(sb.toString()));
                                linkedHashMap.put(str4, e73Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = f73Var.a;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        f73.a(fragment, arrayList2, sb2);
                        return new uj3(arrayList2, sb2.toString());
                    case 4:
                        uj3 uj3Var = (uj3) f73Var.h.getValue();
                        return (uj3Var == null || (list = (List) uj3Var.I) == null) ? new ArrayList() : list;
                    case 5:
                        uj3 uj3Var2 = (uj3) f73Var.h.getValue();
                        if (uj3Var2 != null) {
                            return (String) uj3Var2.J;
                        }
                        return null;
                    default:
                        String str7 = (String) f73Var.j.getValue();
                        if (str7 != null) {
                            return new v24(str7, 0);
                        }
                        return null;
                }
            }
        });
        new u05(new gw2(this, b7));
        StringBuilder sb = new StringBuilder("^");
        if (!m.I.matcher(str).find()) {
            String pattern = o.I.pattern();
            pattern.getClass();
            sb.append(pattern);
        }
        Pattern compile = Pattern.compile("(\\?|#|$)");
        compile.getClass();
        Matcher matcher = compile.matcher(str);
        matcher.getClass();
        zv2 r2 = rt0.r(matcher, 0, str);
        if (r2 != null) {
            a(str.substring(0, r2.b().I), arrayList, sb);
            if (!p.I.matcher(sb).find() && !q.I.matcher(sb).find()) {
                z = true;
            }
            this.l = z;
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        this.c = h(sb.toString());
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        int i = 0;
        for (zv2 a = v24.a(n, str); a != null; a = a.c()) {
            wv2 d = a.c.d(1);
            d.getClass();
            arrayList.add(d.a);
            if (a.b().I > i) {
                String quote = Pattern.quote(str.substring(i, a.b().I));
                quote.getClass();
                sb.append(quote);
            }
            String pattern = q.I.pattern();
            pattern.getClass();
            sb.append(pattern);
            i = a.b().J + 1;
        }
        if (i < str.length()) {
            String quote2 = Pattern.quote(str.substring(i));
            quote2.getClass();
            sb.append(quote2);
        }
    }

    public static void g(Bundle bundle, String str, String str2, n63 n63Var) {
        if (n63Var == null) {
            str.getClass();
            bundle.putString(str, str2);
        } else {
            f83 f83Var = n63Var.a;
            str.getClass();
            jl2.c0(f83Var, bundle, str, str2);
        }
    }

    public static String h(String str) {
        return (jx4.D(str, "\\Q", false) && jx4.D(str, "\\E", false)) ? qx4.x(str, ".*", "\\E.*\\Q", false) : jx4.D(str, "\\.\\*", false) ? qx4.x(str, "\\.\\*", ".*", false) : str;
    }

    public final int b(Uri uri) {
        if (uri == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        Uri parse = Uri.parse(this.a);
        parse.getClass();
        List<String> pathSegments2 = parse.getPathSegments();
        pathSegments.getClass();
        pathSegments2.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : pathSegments) {
            if (pathSegments2.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet.size();
    }

    public final ArrayList c() {
        Collection values = ((Map) this.f.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            u70.I0(arrayList, ((e73) it.next()).b());
        }
        return o70.f1(o70.f1(this.b, arrayList), (List) this.i.getValue());
    }

    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        zv2 d;
        zv2 d2;
        String str;
        uri.getClass();
        v24 v24Var = (v24) this.d.getValue();
        if (v24Var != null && (d = v24Var.d(uri.toString())) != null) {
            int i = 0;
            Bundle b0 = i42.b0((uj3[]) Arrays.copyOf(new uj3[0], 0));
            if (e(d, b0, linkedHashMap) && (!((Boolean) this.e.getValue()).booleanValue() || f(uri, b0, linkedHashMap))) {
                String fragment = uri.getFragment();
                v24 v24Var2 = (v24) this.k.getValue();
                if (v24Var2 != null && (d2 = v24Var2.d(String.valueOf(fragment))) != null) {
                    List list = (List) this.i.getValue();
                    ArrayList arrayList = new ArrayList(p70.J(list, 10));
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            p70.A0();
                            throw null;
                        }
                        String str2 = (String) obj;
                        wv2 d3 = d2.c.d(i2);
                        if (d3 != null) {
                            str = Uri.decode(d3.a);
                            str.getClass();
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = "";
                        }
                        try {
                            g(b0, str2, str, (n63) linkedHashMap.get(str2));
                            arrayList.add(wd5.a);
                            i = i2;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (sv2.N(linkedHashMap, new i9(b0, (byte) 14)).isEmpty()) {
                    return b0;
                }
            }
        }
        return null;
    }

    public final boolean e(zv2 zv2Var, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(p70.J(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            String str = null;
            if (i < 0) {
                p70.A0();
                throw null;
            }
            String str2 = (String) obj;
            wv2 d = zv2Var.c.d(i3);
            if (d != null) {
                str = Uri.decode(d.a);
                str.getClass();
            }
            if (str == null) {
                str = "";
            }
            try {
                g(bundle, str2, str, (n63) linkedHashMap.get(str2));
                arrayList2.add(wd5.a);
                i = i3;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof f73)) {
            return false;
        }
        return this.a.equals(((f73) obj).a);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(android.net.Uri r20, android.os.Bundle r21, java.util.LinkedHashMap r22) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f73.f(android.net.Uri, android.os.Bundle, java.util.LinkedHashMap):boolean");
    }

    public final int hashCode() {
        return this.a.hashCode() * 961;
    }
}

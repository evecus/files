package okhttp3;

import defpackage.er0;
import defpackage.hf1;
import defpackage.j42;
import defpackage.o7;
import defpackage.qx4;
import defpackage.s83;
import defpackage.sp0;
import defpackage.su0;
import defpackage.v24;
import defpackage.wv2;
import defpackage.xv2;
import defpackage.yv2;
import defpackage.zl1;
import defpackage.zv2;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class MediaType {
    private static final String QUOTED = "\"([^\"]*)\"";
    private static final String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private final String mediaType;
    private final String[] parameterNamesAndValues;
    private final String subtype;
    private final String type;
    public static final Companion Companion = new Companion(null);
    private static final v24 TYPE_SUBTYPE = new v24("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final v24 PARAMETER = new v24(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public MediaType(String str, String str2, String str3, String[] strArr) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        strArr.getClass();
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.parameterNamesAndValues = strArr;
    }

    public static /* synthetic */ Charset charset$default(MediaType mediaType, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = null;
        }
        return mediaType.charset(charset);
    }

    public static final MediaType get(String str) {
        return Companion.get(str);
    }

    public static final MediaType parse(String str) {
        return Companion.parse(str);
    }

    @su0
    /* renamed from: -deprecated_subtype, reason: not valid java name */
    public final String m285deprecated_subtype() {
        return this.subtype;
    }

    @su0
    /* renamed from: -deprecated_type, reason: not valid java name */
    public final String m286deprecated_type() {
        return this.type;
    }

    public final Charset charset(Charset charset) {
        String parameter = parameter("charset");
        if (parameter == null) {
            return charset;
        }
        try {
            return Charset.forName(parameter);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof MediaType) && j42.c(((MediaType) obj).mediaType, this.mediaType);
    }

    public final String getMediaType$okhttp() {
        return this.mediaType;
    }

    public int hashCode() {
        return this.mediaType.hashCode();
    }

    public final String parameter(String str) {
        str.getClass();
        int i = 0;
        int U = sp0.U(0, this.parameterNamesAndValues.length - 1, 2);
        if (U < 0) {
            return null;
        }
        while (!qx4.t(this.parameterNamesAndValues[i], str, true)) {
            if (i == U) {
                return null;
            }
            i += 2;
        }
        return this.parameterNamesAndValues[i + 1];
    }

    public final String subtype() {
        return this.subtype;
    }

    public String toString() {
        return this.mediaType;
    }

    public final String type() {
        return this.type;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        @su0
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final MediaType m287deprecated_get(String str) {
            str.getClass();
            return get(str);
        }

        @su0
        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final MediaType m288deprecated_parse(String str) {
            str.getClass();
            return parse(str);
        }

        public final MediaType get(String str) {
            str.getClass();
            zv2 c = MediaType.TYPE_SUBTYPE.c(0, str);
            if (c == null) {
                s83.t(hf1.t('\"', "No subtype found for: \"", str));
                return null;
            }
            String str2 = (String) ((xv2) c.a()).get(1);
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            lowerCase.getClass();
            String lowerCase2 = ((String) ((xv2) c.a()).get(2)).toLowerCase(locale);
            lowerCase2.getClass();
            ArrayList arrayList = new ArrayList();
            int i = c.b().J;
            while (true) {
                int i2 = i + 1;
                if (i2 >= str.length()) {
                    return new MediaType(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
                }
                zv2 c2 = MediaType.PARAMETER.c(i2, str);
                if (c2 == null) {
                    zl1.h("Parameter is not formatted correctly: \"", str.substring(i2), "\" for: \"", str, 34);
                    return null;
                }
                yv2 yv2Var = c2.c;
                wv2 d = yv2Var.d(1);
                String str3 = d != null ? d.a : null;
                if (str3 == null) {
                    i = c2.b().J;
                } else {
                    wv2 d2 = yv2Var.d(2);
                    String str4 = d2 != null ? d2.a : null;
                    if (str4 == null) {
                        wv2 d3 = yv2Var.d(3);
                        d3.getClass();
                        str4 = d3.a;
                    } else if (str4.length() > 0 && o7.q(str4.charAt(0), '\'', false) && str4.length() > 0 && o7.q(str4.charAt(str4.length() - 1), '\'', false) && str4.length() > 2) {
                        str4 = str4.substring(1, str4.length() - 1);
                    }
                    arrayList.add(str3);
                    arrayList.add(str4);
                    i = c2.b().J;
                }
            }
        }

        public final MediaType parse(String str) {
            str.getClass();
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private Companion() {
        }
    }

    public final Charset charset() {
        return charset$default(this, null, 1, null);
    }
}

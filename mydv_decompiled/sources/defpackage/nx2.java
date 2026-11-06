package defpackage;

import androidx.media3.common.MimeTypes;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class nx2 {
    public static final ey1 f;
    public static final k50 g;
    public static final HashMap h;
    public static final nx2 i;
    public static final uu2 j;
    public final String a;
    public final String b;
    public final ey1 c;
    public String d;
    public int e;

    static {
        ey1 ey1Var;
        String j0 = j42.j0(StandardCharsets.UTF_8.name());
        j42.k("charset", j0);
        jb0 a = jb0.a();
        ux1 ux1Var = (ux1) a.get("charset");
        if (ux1Var == null) {
            ux1Var = dy1.o(4);
            a.put("charset", ux1Var);
        }
        ux1Var.a(j0);
        Collection entrySet = a.entrySet();
        if (((AbstractCollection) entrySet).isEmpty()) {
            ey1Var = m91.O;
        } else {
            hb0 hb0Var = (hb0) entrySet;
            hy1 hy1Var = new hy1(hb0Var.J.size());
            Iterator it = hb0Var.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                x24 f2 = ((zx1) entry.getValue()).f();
                hy1Var.b(key, f2);
                i2 += f2.L;
            }
            ey1Var = new ey1(hy1Var.a(true), i2);
        }
        f = ey1Var;
        l50 l50Var = l50.L;
        l50 l50Var2 = l50.M;
        l50Var2.getClass();
        s50 s50Var = new s50((u50) l50Var2);
        l50Var.getClass();
        g = new k50(new k50(new k50(l50Var, s50Var), new q50(' ')), u50.a("()<>@,;:\\\"/[]?=").c());
        u50.a("\"\\\r").c().getClass();
        u50.a(" \t\r\n");
        h = new HashMap();
        a("*", "*");
        a("text", "*");
        a("image", "*");
        a(MimeTypes.BASE_TYPE_AUDIO, "*");
        a(MimeTypes.BASE_TYPE_VIDEO, "*");
        a(MimeTypes.BASE_TYPE_APPLICATION, "*");
        a("font", "*");
        b("text", "cache-manifest");
        b("text", "css");
        b("text", "csv");
        b("text", "html");
        b("text", "calendar");
        b("text", "markdown");
        b("text", "plain");
        b("text", "javascript");
        b("text", "tab-separated-values");
        b("text", "vcard");
        b("text", "vnd.wap.wml");
        b("text", "xml");
        b("text", "vtt");
        a("image", "bmp");
        a("image", "x-canon-crw");
        a("image", "gif");
        a("image", "vnd.microsoft.icon");
        a("image", "jpeg");
        a("image", "png");
        a("image", "vnd.adobe.photoshop");
        b("image", "svg+xml");
        a("image", "tiff");
        a("image", "webp");
        a("image", "heif");
        a("image", "jp2");
        a(MimeTypes.BASE_TYPE_AUDIO, "mp4");
        a(MimeTypes.BASE_TYPE_AUDIO, "mpeg");
        a(MimeTypes.BASE_TYPE_AUDIO, "ogg");
        a(MimeTypes.BASE_TYPE_AUDIO, "webm");
        a(MimeTypes.BASE_TYPE_AUDIO, "l16");
        a(MimeTypes.BASE_TYPE_AUDIO, "l24");
        a(MimeTypes.BASE_TYPE_AUDIO, "basic");
        a(MimeTypes.BASE_TYPE_AUDIO, "aac");
        a(MimeTypes.BASE_TYPE_AUDIO, "vorbis");
        a(MimeTypes.BASE_TYPE_AUDIO, "x-ms-wma");
        a(MimeTypes.BASE_TYPE_AUDIO, "x-ms-wax");
        a(MimeTypes.BASE_TYPE_AUDIO, "vnd.rn-realaudio");
        a(MimeTypes.BASE_TYPE_AUDIO, "vnd.wave");
        a(MimeTypes.BASE_TYPE_VIDEO, "mp4");
        a(MimeTypes.BASE_TYPE_VIDEO, "mpeg");
        a(MimeTypes.BASE_TYPE_VIDEO, "ogg");
        a(MimeTypes.BASE_TYPE_VIDEO, "quicktime");
        a(MimeTypes.BASE_TYPE_VIDEO, "webm");
        a(MimeTypes.BASE_TYPE_VIDEO, "x-ms-wmv");
        a(MimeTypes.BASE_TYPE_VIDEO, "x-flv");
        a(MimeTypes.BASE_TYPE_VIDEO, "3gpp");
        a(MimeTypes.BASE_TYPE_VIDEO, "3gpp2");
        b(MimeTypes.BASE_TYPE_APPLICATION, "xml");
        b(MimeTypes.BASE_TYPE_APPLICATION, "atom+xml");
        a(MimeTypes.BASE_TYPE_APPLICATION, "x-bzip2");
        b(MimeTypes.BASE_TYPE_APPLICATION, "dart");
        a(MimeTypes.BASE_TYPE_APPLICATION, "vnd.apple.pkpass");
        a(MimeTypes.BASE_TYPE_APPLICATION, "vnd.ms-fontobject");
        a(MimeTypes.BASE_TYPE_APPLICATION, "epub+zip");
        a(MimeTypes.BASE_TYPE_APPLICATION, "x-www-form-urlencoded");
        a(MimeTypes.BASE_TYPE_APPLICATION, "pkcs12");
        a(MimeTypes.BASE_TYPE_APPLICATION, "binary");
        a(MimeTypes.BASE_TYPE_APPLICATION, "geo+json");
        a(MimeTypes.BASE_TYPE_APPLICATION, "x-gzip");
        a(MimeTypes.BASE_TYPE_APPLICATION, "hal+json");
        b(MimeTypes.BASE_TYPE_APPLICATION, "javascript");
        a(MimeTypes.BASE_TYPE_APPLICATION, "jose");
        a(MimeTypes.BASE_TYPE_APPLICATION, "jose+json");
        i = b(MimeTypes.BASE_TYPE_APPLICATION, "json");
        a(MimeTypes.BASE_TYPE_APPLICATION, "jwt");
        b(MimeTypes.BASE_TYPE_APPLICATION, "manifest+json");
        a(MimeTypes.BASE_TYPE_APPLICATION, "vnd.google-earth.kml+xml");
        a(MimeTypes.BASE_TYPE_APPLICATION, "vnd.google-earth.kmz");
        a(MimeTypes.BASE_TYPE_APPLICATION, "mbox");
        a(MimeTypes.BASE_TYPE_APPLICATION, "x-apple-aspen-config");
        a(MimeTypes.BASE_TYPE_APPLICATION, "vnd.ms-excel");
        a(MimeTypes.BASE_TYPE_APPLICATION, "vnd.ms-outlook");
        a(MimeTypes.BASE_TYPE_APPLICATION, "vnd.ms-powerpoint");
        a(MimeTypes.BASE_TYPE_APPLICATION, "msword");
        a(MimeTypes.BASE_TYPE_APPLICATION, "dash+xml");
        a(MimeTypes.BASE_TYPE_APPLICATION, "wasm");
        a(MimeTypes.BASE_TYPE_APPLICATION, "x-nacl");
        a(MimeTypes.BASE_TYPE_APPLICATION, "x-pnacl");
        a(MimeTypes.BASE_TYPE_APPLICATION, "octet-stream");
        a(MimeTypes.BASE_TYPE_APPLICATION, "ogg");
        a(MimeTypes.BASE_TYPE_APPLICATION, "vnd.openxmlformats-officedocument.wordprocessingml.document");
        a(MimeTypes.BASE_TYPE_APPLICATION, "vnd.openxmlformats-officedocument.presentationml.presentation");
        a(MimeTypes.BASE_TYPE_APPLICATION, "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        a(MimeTypes.BASE_TYPE_APPLICATION, "vnd.oasis.opendocument.graphics");
        a(MimeTypes.BASE_TYPE_APPLICATION, "vnd.oasis.opendocument.presentation");
        a(MimeTypes.BASE_TYPE_APPLICATION, "vnd.oasis.opendocument.spreadsheet");
        a(MimeTypes.BASE_TYPE_APPLICATION, "vnd.oasis.opendocument.text");
        b(MimeTypes.BASE_TYPE_APPLICATION, "opensearchdescription+xml");
        a(MimeTypes.BASE_TYPE_APPLICATION, "pdf");
        a(MimeTypes.BASE_TYPE_APPLICATION, "postscript");
        a(MimeTypes.BASE_TYPE_APPLICATION, "protobuf");
        b(MimeTypes.BASE_TYPE_APPLICATION, "rdf+xml");
        b(MimeTypes.BASE_TYPE_APPLICATION, "rtf");
        a(MimeTypes.BASE_TYPE_APPLICATION, "font-sfnt");
        a(MimeTypes.BASE_TYPE_APPLICATION, "x-shockwave-flash");
        a(MimeTypes.BASE_TYPE_APPLICATION, "vnd.sketchup.skp");
        b(MimeTypes.BASE_TYPE_APPLICATION, "soap+xml");
        a(MimeTypes.BASE_TYPE_APPLICATION, "x-tar");
        a(MimeTypes.BASE_TYPE_APPLICATION, "font-woff");
        a(MimeTypes.BASE_TYPE_APPLICATION, "font-woff2");
        b(MimeTypes.BASE_TYPE_APPLICATION, "xhtml+xml");
        b(MimeTypes.BASE_TYPE_APPLICATION, "xrd+xml");
        a(MimeTypes.BASE_TYPE_APPLICATION, "zip");
        a("font", "collection");
        a("font", "otf");
        a("font", "sfnt");
        a("font", "ttf");
        a("font", "woff");
        a("font", "woff2");
        j = new uu2(new g62("; "));
    }

    public nx2(String str, String str2, ey1 ey1Var) {
        this.a = str;
        this.b = str2;
        this.c = ey1Var;
    }

    public static void a(String str, String str2) {
        nx2 nx2Var = new nx2(str, str2, m91.O);
        h.put(nx2Var, nx2Var);
    }

    public static nx2 b(String str, String str2) {
        nx2 nx2Var = new nx2(str, str2, f);
        h.put(nx2Var, nx2Var);
        StandardCharsets.UTF_8.getClass();
        return nx2Var;
    }

    public final rv2 c() {
        return new rv2(this.c.b(), new uu2(new mm0((byte) 16)));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nx2)) {
            return false;
        }
        nx2 nx2Var = (nx2) obj;
        return this.a.equals(nx2Var.a) && this.b.equals(nx2Var.b) && c().equals(nx2Var.c());
    }

    public final int hashCode() {
        int i2 = this.e;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = Arrays.hashCode(new Object[]{this.a, this.b, c()});
        this.e = hashCode;
        return hashCode;
    }

    public final String toString() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('/');
        sb.append(this.b);
        ey1 ey1Var = this.c;
        if (!ey1Var.isEmpty()) {
            sb.append("; ");
            Collection a = new j33(ey1Var, new uu2(new mm0((byte) 15))).a();
            uu2 uu2Var = j;
            uu2Var.getClass();
            try {
                uu2Var.m(sb, a.iterator());
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
        String sb2 = sb.toString();
        this.d = sb2;
        return sb2;
    }
}

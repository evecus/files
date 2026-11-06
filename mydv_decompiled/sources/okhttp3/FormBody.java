package okhttp3;

import defpackage.cz;
import defpackage.er0;
import defpackage.lz;
import defpackage.su0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.url._UrlKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class FormBody extends RequestBody {
    private final List<String> encodedNames;
    private final List<String> encodedValues;
    public static final Companion Companion = new Companion(null);
    private static final MediaType CONTENT_TYPE = MediaType.Companion.get("application/x-www-form-urlencoded");

    public FormBody(List<String> list, List<String> list2) {
        list.getClass();
        list2.getClass();
        this.encodedNames = _UtilJvmKt.toImmutableList(list);
        this.encodedValues = _UtilJvmKt.toImmutableList(list2);
    }

    private final long writeOrCountBytes(lz lzVar, boolean z) {
        cz a;
        if (z) {
            a = new cz();
        } else {
            lzVar.getClass();
            a = lzVar.a();
        }
        int size = this.encodedNames.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                a.d0(38);
            }
            a.k0(this.encodedNames.get(i));
            a.d0(61);
            a.k0(this.encodedValues.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = a.J;
        a.e();
        return j;
    }

    @su0
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m251deprecated_size() {
        return size();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return writeOrCountBytes(null, true);
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return CONTENT_TYPE;
    }

    public final String encodedName(int i) {
        return this.encodedNames.get(i);
    }

    public final String encodedValue(int i) {
        return this.encodedValues.get(i);
    }

    public final String name(int i) {
        return _UrlKt.percentDecode$default(encodedName(i), 0, 0, true, 3, null);
    }

    public final int size() {
        return this.encodedNames.size();
    }

    public final String value(int i) {
        return _UrlKt.percentDecode$default(encodedValue(i), 0, 0, true, 3, null);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(lz lzVar) {
        lzVar.getClass();
        writeOrCountBytes(lzVar, false);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private final Charset charset;
        private final List<String> names;
        private final List<String> values;

        public Builder(Charset charset) {
            this.charset = charset;
            this.names = new ArrayList();
            this.values = new ArrayList();
        }

        public final Builder add(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.names.add(_UrlKt.canonicalizeWithCharset$default(str, 0, 0, _UrlKt.FORM_ENCODE_SET, false, false, false, false, this.charset, 91, null));
            this.values.add(_UrlKt.canonicalizeWithCharset$default(str2, 0, 0, _UrlKt.FORM_ENCODE_SET, false, false, false, false, this.charset, 91, null));
            return this;
        }

        public final Builder addEncoded(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.names.add(_UrlKt.canonicalizeWithCharset$default(str, 0, 0, _UrlKt.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
            this.values.add(_UrlKt.canonicalizeWithCharset$default(str2, 0, 0, _UrlKt.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
            return this;
        }

        public final FormBody build() {
            return new FormBody(this.names, this.values);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Builder(Charset charset, int i, er0 er0Var) {
            this((i & 1) != 0 ? null : charset);
        }
    }
}

package okhttp3;

import defpackage.hf1;
import defpackage.j42;
import defpackage.su0;
import defpackage.sv2;
import defpackage.z50;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class Challenge {
    private final Map<String, String> authParams;
    private final String scheme;

    public Challenge(String str, Map<String, String> map) {
        String str2;
        str.getClass();
        map.getClass();
        this.scheme = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale locale = Locale.US;
                locale.getClass();
                str2 = key.toLowerCase(locale);
                str2.getClass();
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, value);
        }
        Map<String, String> unmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        this.authParams = unmodifiableMap;
    }

    @su0
    /* renamed from: -deprecated_authParams, reason: not valid java name */
    public final Map<String, String> m232deprecated_authParams() {
        return this.authParams;
    }

    @su0
    /* renamed from: -deprecated_charset, reason: not valid java name */
    public final Charset m233deprecated_charset() {
        return charset();
    }

    @su0
    /* renamed from: -deprecated_realm, reason: not valid java name */
    public final String m234deprecated_realm() {
        return realm();
    }

    @su0
    /* renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m235deprecated_scheme() {
        return this.scheme;
    }

    public final Map<String, String> authParams() {
        return this.authParams;
    }

    public final Charset charset() {
        String str = this.authParams.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                forName.getClass();
                return forName;
            } catch (Exception unused) {
            }
        }
        return z50.d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Challenge)) {
            return false;
        }
        Challenge challenge = (Challenge) obj;
        return j42.c(challenge.scheme, this.scheme) && j42.c(challenge.authParams, this.authParams);
    }

    public int hashCode() {
        return this.authParams.hashCode() + hf1.n(899, 31, this.scheme);
    }

    public final String realm() {
        return this.authParams.get("realm");
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.scheme + " authParams=" + this.authParams;
    }

    public final Challenge withCharset(Charset charset) {
        charset.getClass();
        LinkedHashMap Y = sv2.Y(this.authParams);
        Y.put("charset", charset.name());
        return new Challenge(this.scheme, Y);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Challenge(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            r2.getClass()
            r3.getClass()
            java.lang.String r0 = "realm"
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            r3.getClass()
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.Challenge.<init>(java.lang.String, java.lang.String):void");
    }
}

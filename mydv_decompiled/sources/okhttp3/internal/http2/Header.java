package okhttp3.internal.http2;

import defpackage.er0;
import defpackage.h00;
import defpackage.j42;
import defpackage.jp;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class Header {
    public static final Companion Companion = new Companion(null);
    public static final h00 PSEUDO_PREFIX;
    public static final h00 RESPONSE_STATUS;
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final h00 TARGET_AUTHORITY;
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final h00 TARGET_METHOD;
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final h00 TARGET_PATH;
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final h00 TARGET_SCHEME;
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public final int hpackSize;
    public final h00 name;
    public final h00 value;

    static {
        h00 h00Var = h00.L;
        PSEUDO_PREFIX = jp.h(":");
        RESPONSE_STATUS = jp.h(RESPONSE_STATUS_UTF8);
        TARGET_METHOD = jp.h(TARGET_METHOD_UTF8);
        TARGET_PATH = jp.h(TARGET_PATH_UTF8);
        TARGET_SCHEME = jp.h(TARGET_SCHEME_UTF8);
        TARGET_AUTHORITY = jp.h(TARGET_AUTHORITY_UTF8);
    }

    public Header(h00 h00Var, h00 h00Var2) {
        h00Var.getClass();
        h00Var2.getClass();
        this.name = h00Var;
        this.value = h00Var2;
        this.hpackSize = h00Var2.d() + h00Var.d() + 32;
    }

    public static /* synthetic */ Header copy$default(Header header, h00 h00Var, h00 h00Var2, int i, Object obj) {
        if ((i & 1) != 0) {
            h00Var = header.name;
        }
        if ((i & 2) != 0) {
            h00Var2 = header.value;
        }
        return header.copy(h00Var, h00Var2);
    }

    public final h00 component1() {
        return this.name;
    }

    public final h00 component2() {
        return this.value;
    }

    public final Header copy(h00 h00Var, h00 h00Var2) {
        h00Var.getClass();
        h00Var2.getClass();
        return new Header(h00Var, h00Var2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return j42.c(this.name, header.name) && j42.c(this.value, header.value);
    }

    public int hashCode() {
        return this.value.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        return this.name.s() + ": " + this.value.s();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(String str, String str2) {
        this(jp.h(str), jp.h(str2));
        str.getClass();
        str2.getClass();
        h00 h00Var = h00.L;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(h00 h00Var, String str) {
        this(h00Var, jp.h(str));
        h00Var.getClass();
        str.getClass();
        h00 h00Var2 = h00.L;
    }
}

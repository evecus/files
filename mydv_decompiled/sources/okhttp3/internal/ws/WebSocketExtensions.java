package okhttp3.internal.ws;

import defpackage.er0;
import defpackage.j42;
import defpackage.jx4;
import defpackage.qx4;
import okhttp3.Headers;
import okhttp3.internal._UtilCommonKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class WebSocketExtensions {
    public static final Companion Companion = new Companion(null);
    private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";
    public final Integer clientMaxWindowBits;
    public final boolean clientNoContextTakeover;
    public final boolean perMessageDeflate;
    public final Integer serverMaxWindowBits;
    public final boolean serverNoContextTakeover;
    public final boolean unknownValues;

    public /* synthetic */ WebSocketExtensions(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4, int i, er0 er0Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4);
    }

    public static /* synthetic */ WebSocketExtensions copy$default(WebSocketExtensions webSocketExtensions, boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = webSocketExtensions.perMessageDeflate;
        }
        if ((i & 2) != 0) {
            num = webSocketExtensions.clientMaxWindowBits;
        }
        if ((i & 4) != 0) {
            z2 = webSocketExtensions.clientNoContextTakeover;
        }
        if ((i & 8) != 0) {
            num2 = webSocketExtensions.serverMaxWindowBits;
        }
        if ((i & 16) != 0) {
            z3 = webSocketExtensions.serverNoContextTakeover;
        }
        if ((i & 32) != 0) {
            z4 = webSocketExtensions.unknownValues;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        return webSocketExtensions.copy(z, num, z2, num2, z5, z6);
    }

    public final boolean component1() {
        return this.perMessageDeflate;
    }

    public final Integer component2() {
        return this.clientMaxWindowBits;
    }

    public final boolean component3() {
        return this.clientNoContextTakeover;
    }

    public final Integer component4() {
        return this.serverMaxWindowBits;
    }

    public final boolean component5() {
        return this.serverNoContextTakeover;
    }

    public final boolean component6() {
        return this.unknownValues;
    }

    public final WebSocketExtensions copy(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4) {
        return new WebSocketExtensions(z, num, z2, num2, z3, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.perMessageDeflate == webSocketExtensions.perMessageDeflate && j42.c(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && j42.c(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues;
    }

    public int hashCode() {
        int i = (this.perMessageDeflate ? 1231 : 1237) * 31;
        Integer num = this.clientMaxWindowBits;
        int hashCode = (((i + (num == null ? 0 : num.hashCode())) * 31) + (this.clientNoContextTakeover ? 1231 : 1237)) * 31;
        Integer num2 = this.serverMaxWindowBits;
        return ((((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31) + (this.serverNoContextTakeover ? 1231 : 1237)) * 31) + (this.unknownValues ? 1231 : 1237);
    }

    public final boolean noContextTakeover(boolean z) {
        return z ? this.clientNoContextTakeover : this.serverNoContextTakeover;
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.perMessageDeflate + ", clientMaxWindowBits=" + this.clientMaxWindowBits + ", clientNoContextTakeover=" + this.clientNoContextTakeover + ", serverMaxWindowBits=" + this.serverMaxWindowBits + ", serverNoContextTakeover=" + this.serverNoContextTakeover + ", unknownValues=" + this.unknownValues + ')';
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final WebSocketExtensions parse(Headers headers) {
            headers.getClass();
            int size = headers.size();
            boolean z = false;
            Integer num = null;
            boolean z2 = false;
            Integer num2 = null;
            boolean z3 = false;
            boolean z4 = false;
            for (int i = 0; i < size; i++) {
                if (qx4.t(headers.name(i), WebSocketExtensions.HEADER_WEB_SOCKET_EXTENSION, true)) {
                    String value = headers.value(i);
                    int i2 = 0;
                    while (i2 < value.length()) {
                        int i3 = i2;
                        int delimiterOffset$default = _UtilCommonKt.delimiterOffset$default(value, ',', i3, 0, 4, (Object) null);
                        int delimiterOffset = _UtilCommonKt.delimiterOffset(value, ';', i3, delimiterOffset$default);
                        String trimSubstring = _UtilCommonKt.trimSubstring(value, i3, delimiterOffset);
                        int i4 = delimiterOffset + 1;
                        if (qx4.t(trimSubstring, "permessage-deflate", true)) {
                            if (!z) {
                                z4 = true;
                                while (i4 < delimiterOffset$default) {
                                    int delimiterOffset2 = _UtilCommonKt.delimiterOffset(value, ';', i4, delimiterOffset$default);
                                    int delimiterOffset3 = _UtilCommonKt.delimiterOffset(value, '=', i4, delimiterOffset2);
                                    String trimSubstring2 = _UtilCommonKt.trimSubstring(value, i4, delimiterOffset3);
                                    String U = delimiterOffset3 < delimiterOffset2 ? jx4.U(_UtilCommonKt.trimSubstring(value, delimiterOffset3 + 1, delimiterOffset2)) : null;
                                    int i5 = delimiterOffset2 + 1;
                                    if (qx4.t(trimSubstring2, "client_max_window_bits", true)) {
                                        if (num != null) {
                                            z4 = true;
                                        }
                                        num = U != null ? qx4.A(U) : null;
                                        i4 = num == null ? i5 : i5;
                                    } else if (qx4.t(trimSubstring2, "client_no_context_takeover", true)) {
                                        if (z2) {
                                            z4 = true;
                                        }
                                        if (U != null) {
                                            z4 = true;
                                        }
                                        i4 = i5;
                                        z2 = true;
                                    } else if (qx4.t(trimSubstring2, "server_max_window_bits", true)) {
                                        if (num2 != null) {
                                            z4 = true;
                                        }
                                        num2 = U != null ? qx4.A(U) : null;
                                        if (num2 == null) {
                                        }
                                    } else if (qx4.t(trimSubstring2, "server_no_context_takeover", true)) {
                                        if (z3) {
                                            z4 = true;
                                        }
                                        if (U != null) {
                                            z4 = true;
                                        }
                                        i4 = i5;
                                        z3 = true;
                                    }
                                }
                                i2 = i4;
                                z = true;
                            }
                            z4 = true;
                        } else {
                            i2 = i4;
                            z4 = true;
                        }
                    }
                }
            }
            return new WebSocketExtensions(z, num, z2, num2, z3, z4);
        }

        private Companion() {
        }
    }

    public WebSocketExtensions(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4) {
        this.perMessageDeflate = z;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z2;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z3;
        this.unknownValues = z4;
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }
}

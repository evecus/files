package okhttp3.internal.http;

import defpackage.er0;
import defpackage.qx4;
import java.net.ProtocolException;
import okhttp3.Protocol;
import okhttp3.Response;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class StatusLine {
    public static final Companion Companion = new Companion(null);
    public final int code;
    public final String message;
    public final Protocol protocol;

    public StatusLine(Protocol protocol, int i, String str) {
        protocol.getClass();
        str.getClass();
        this.protocol = protocol;
        this.code = i;
        this.message = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.protocol == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.code);
        sb.append(' ');
        sb.append(this.message);
        return sb.toString();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final StatusLine get(Response response) {
            response.getClass();
            return new StatusLine(response.protocol(), response.code(), response.message());
        }

        public final StatusLine parse(String str) {
            Protocol protocol;
            int i;
            String str2;
            str.getClass();
            if (qx4.y(str, "HTTP/1.", false)) {
                i = 9;
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else {
                    if (charAt != 1) {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                    protocol = Protocol.HTTP_1_1;
                }
            } else if (qx4.y(str, "ICY ", false)) {
                protocol = Protocol.HTTP_1_0;
                i = 4;
            } else {
                if (!qx4.y(str, "SOURCETABLE ", false)) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                protocol = Protocol.HTTP_1_1;
                i = 12;
            }
            int i2 = i + 3;
            if (str.length() < i2) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            Integer A = qx4.A(str.substring(i, i2));
            if (A == null) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int intValue = A.intValue();
            if (str.length() <= i2) {
                str2 = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i + 4);
            }
            return new StatusLine(protocol, intValue, str2);
        }

        private Companion() {
        }
    }
}

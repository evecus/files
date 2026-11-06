package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class z42 extends IOException {
    public static z42 a() {
        return new z42("Protocol message had invalid UTF-8.");
    }

    public static w42 b() {
        return new w42("Protocol message tag had invalid wire type.");
    }

    public static z42 c() {
        return new z42("CodedInputStream encountered a malformed varint.");
    }

    public static z42 d() {
        return new z42("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static z42 e() {
        return new z42("Failed to parse the message.");
    }

    public static z42 f() {
        return new z42("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}

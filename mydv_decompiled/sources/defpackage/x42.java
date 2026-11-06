package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class x42 extends IOException {
    public boolean I;

    public static x42 a() {
        return new x42("Protocol message contained an invalid tag (zero).");
    }

    public static x42 b() {
        return new x42("Protocol message had invalid UTF-8.");
    }

    public static u42 c() {
        return new u42("Protocol message tag had invalid wire type.");
    }

    public static x42 d() {
        return new x42("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static x42 e() {
        return new x42("Failed to parse the message.");
    }

    public static x42 f() {
        return new x42("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}

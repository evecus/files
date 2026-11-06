package defpackage;

import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface lz extends eq4, WritableByteChannel {
    lz B(String str);

    lz G(long j);

    lz J(int i, int i2, String str);

    lz S(h00 h00Var);

    lz V(long j);

    cz a();

    @Override // defpackage.eq4, java.io.Flushable
    void flush();

    lz k(int i);

    long q(ut4 ut4Var);

    lz r();

    lz write(byte[] bArr);

    lz write(byte[] bArr, int i, int i2);

    lz writeByte(int i);

    lz writeInt(int i);

    lz writeShort(int i);
}

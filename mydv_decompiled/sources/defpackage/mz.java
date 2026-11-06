package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface mz extends ut4, ReadableByteChannel {
    void C(cz czVar, long j);

    String D(Charset charset);

    h00 I();

    String L();

    byte[] N(long j);

    int P(mg3 mg3Var);

    void U(long j);

    long X();

    InputStream Z();

    cz a();

    String f(long j);

    boolean h(long j, h00 h00Var);

    h00 i(long j);

    byte[] m();

    boolean p();

    s04 peek();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    boolean request(long j);

    long s();

    void skip(long j);

    long u(long j, h00 h00Var);

    String w(long j);

    long z(lz lzVar);
}

package okhttp3.internal.ws;

import defpackage.az;
import defpackage.cz;
import defpackage.h00;
import defpackage.ot0;
import defpackage.q04;
import defpackage.s83;
import java.io.Closeable;
import java.util.zip.Deflater;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class MessageDeflater implements Closeable {
    private final cz deflatedBytes;
    private final Deflater deflater;
    private final ot0 deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z) {
        this.noContextTakeover = z;
        cz czVar = new cz();
        this.deflatedBytes = czVar;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new ot0(new q04(czVar), deflater);
    }

    private final boolean endsWith(cz czVar, h00 h00Var) {
        return czVar.h(czVar.J - h00Var.d(), h00Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.deflaterSink.close();
    }

    public final void deflate(cz czVar) {
        h00 h00Var;
        czVar.getClass();
        if (this.deflatedBytes.J != 0) {
            s83.t("Failed requirement.");
            return;
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.write(czVar, czVar.J);
        this.deflaterSink.flush();
        cz czVar2 = this.deflatedBytes;
        h00Var = MessageDeflaterKt.EMPTY_DEFLATE_BLOCK;
        boolean endsWith = endsWith(czVar2, h00Var);
        cz czVar3 = this.deflatedBytes;
        if (endsWith) {
            long j = czVar3.J - 4;
            az azVar = new az();
            czVar3.K(azVar);
            try {
                azVar.e(j);
                azVar.close();
            } finally {
            }
        } else {
            czVar3.d0(0);
        }
        cz czVar4 = this.deflatedBytes;
        czVar.write(czVar4, czVar4.J);
    }
}

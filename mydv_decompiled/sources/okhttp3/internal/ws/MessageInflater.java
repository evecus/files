package okhttp3.internal.ws;

import defpackage.cz;
import defpackage.h02;
import defpackage.s83;
import java.io.Closeable;
import java.util.zip.Inflater;
import okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class MessageInflater implements Closeable {
    private final cz deflatedBytes = new cz();
    private Inflater inflater;
    private h02 inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean z) {
        this.noContextTakeover = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        h02 h02Var = this.inflaterSource;
        if (h02Var != null) {
            h02Var.close();
        }
        this.inflaterSource = null;
        this.inflater = null;
    }

    public final void inflate(cz czVar) {
        czVar.getClass();
        if (this.deflatedBytes.J != 0) {
            s83.t("Failed requirement.");
            return;
        }
        Inflater inflater = this.inflater;
        if (inflater == null) {
            inflater = new Inflater(true);
            this.inflater = inflater;
        }
        h02 h02Var = this.inflaterSource;
        if (h02Var == null) {
            h02Var = new h02(this.deflatedBytes, inflater);
            this.inflaterSource = h02Var;
        }
        if (this.noContextTakeover) {
            inflater.reset();
        }
        this.deflatedBytes.q(czVar);
        this.deflatedBytes.g0(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        long bytesRead = inflater.getBytesRead() + this.deflatedBytes.J;
        do {
            h02Var.e(czVar, Long.MAX_VALUE);
            if (inflater.getBytesRead() >= bytesRead) {
                break;
            }
        } while (!inflater.finished());
        if (inflater.getBytesRead() < bytesRead) {
            this.deflatedBytes.e();
            h02Var.close();
            this.inflaterSource = null;
            this.inflater = null;
        }
    }
}

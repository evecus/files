package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.logging.Level;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class j63 implements Runnable {
    public final /* synthetic */ byte I;
    public boolean J;
    public Object K;
    public final Object L;

    public j63(xi2 xi2Var, ji2 ji2Var) {
        this.I = (byte) 1;
        ji2Var.getClass();
        this.K = xi2Var;
        this.L = ji2Var;
    }

    public static /* synthetic */ IOException b(j63 j63Var) {
        return (IOException) j63Var.K;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.I) {
            case 0:
                try {
                    ((k63) this.L).b.bind(new InetSocketAddress(((k63) this.L).a));
                    this.J = true;
                    do {
                        try {
                            Socket accept = ((k63) this.L).b.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            k63 k63Var = (k63) this.L;
                            k63Var.d.d(new a63(k63Var, inputStream, accept));
                        } catch (IOException e) {
                            k63.e.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                        }
                    } while (!((k63) this.L).b.isClosed());
                } catch (IOException e2) {
                    this.K = e2;
                    return;
                }
            default:
                if (!this.J) {
                    ((xi2) this.K).e((ji2) this.L);
                    this.J = true;
                    break;
                }
                break;
        }
    }

    public j63(k63 k63Var) {
        this.I = (byte) 0;
        this.L = k63Var;
        this.J = false;
    }
}

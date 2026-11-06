package okhttp3.internal.connection;

import defpackage.lz;
import defpackage.mt4;
import defpackage.mz;
import defpackage.sv2;
import defpackage.ts0;
import java.net.Socket;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class BufferedSocketKt {
    public static final BufferedSocket asBufferedSocket(Socket socket) {
        socket.getClass();
        return asBufferedSocket(new ts0(socket));
    }

    public static final BufferedSocket asBufferedSocket(final mt4 mt4Var) {
        mt4Var.getClass();
        return new BufferedSocket(mt4Var) { // from class: okhttp3.internal.connection.BufferedSocketKt$asBufferedSocket$1
            private final mt4 delegate;
            private final lz sink;
            private final mz source;

            {
                this.delegate = mt4Var;
                this.source = sv2.m(mt4Var.getSource());
                this.sink = sv2.l(mt4Var.getSink());
            }

            @Override // okhttp3.internal.connection.BufferedSocket, defpackage.mt4
            public void cancel() {
                this.delegate.cancel();
            }

            @Override // okhttp3.internal.connection.BufferedSocket, defpackage.mt4
            public lz getSink() {
                return this.sink;
            }

            @Override // okhttp3.internal.connection.BufferedSocket, defpackage.mt4
            public mz getSource() {
                return this.source;
            }
        };
    }
}

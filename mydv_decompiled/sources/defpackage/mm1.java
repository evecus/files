package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class mm1 implements sz4 {
    public final Context I;
    public final String J;
    public final yw0 K;
    public final boolean L;
    public final boolean M;
    public final u05 N;
    public boolean O;

    public mm1(Context context, String str, yw0 yw0Var, boolean z, boolean z2) {
        yw0Var.getClass();
        this.I = context;
        this.J = str;
        this.K = yw0Var;
        this.L = z;
        this.M = z2;
        this.N = new u05(new ce(this, (byte) 15));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.N.J != q8.D0) {
            ((lm1) this.N.getValue()).close();
        }
    }

    @Override // defpackage.sz4
    public final String getDatabaseName() {
        return this.J;
    }

    @Override // defpackage.sz4
    public final hm1 getWritableDatabase() {
        return ((lm1) this.N.getValue()).e(true);
    }

    @Override // defpackage.sz4
    public final void setWriteAheadLoggingEnabled(boolean z) {
        if (this.N.J != q8.D0) {
            ((lm1) this.N.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.O = z;
    }
}

package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class eg0 implements o84, m53 {
    public final o84 I;
    public final m53 J;
    public tk0 K;
    public Throwable L;

    public eg0(o84 o84Var) {
        o53 o53Var = new o53();
        o84Var.getClass();
        this.I = o84Var;
        this.J = o53Var;
    }

    @Override // defpackage.o84
    public final q84 Y(String str) {
        str.getClass();
        return this.I.Y(str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.I.close();
    }

    @Override // defpackage.m53
    public final Object e(fj0 fj0Var) {
        return this.J.e(fj0Var);
    }

    @Override // defpackage.m53
    public final void g(Object obj) {
        this.J.g(null);
    }

    public final void n(StringBuilder sb) {
        if (this.K == null && this.L == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
            return;
        }
        sb.append("\t\tStatus: Acquired connection");
        sb.append('\n');
        tk0 tk0Var = this.K;
        if (tk0Var != null) {
            sb.append("\t\tCoroutine: " + tk0Var);
            sb.append('\n');
        }
        Throwable th = this.L;
        if (th != null) {
            sb.append("\t\tAcquired:");
            sb.append('\n');
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.flush();
            String stringWriter2 = stringWriter.toString();
            stringWriter2.getClass();
            Iterator it = o70.Q0(jx4.O(stringWriter2), 1).iterator();
            while (it.hasNext()) {
                sb.append("\t\t" + ((String) it.next()));
                sb.append('\n');
            }
        }
    }

    public final String toString() {
        return this.I.toString();
    }
}

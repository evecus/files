package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class x75 extends ya4 implements Runnable {
    public final long N;

    public x75(long j, gj0 gj0Var) {
        super(gj0Var, gj0Var.getContext());
        this.N = j;
    }

    @Override // defpackage.c2, defpackage.e62
    public final String U() {
        return super.U() + "(timeMillis=" + this.N + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        tk0 tk0Var = this.L;
        rt0.w(tk0Var);
        String str = ((zk0) tk0Var.get(zk0.I)) != null ? "Room Invalidation Tracker Refresh" : null;
        String str2 = "Timed out waiting for " + this.N + " ms";
        if (str != null) {
            StringBuilder E = r7.E("Coroutine \"", str, "\" ");
            if (str2.length() > 0) {
                str2 = Character.toLowerCase(str2.charAt(0)) + str2.substring(1);
            }
            E.append(str2);
            str2 = E.toString();
        }
        q(new v75(str2, this));
    }
}

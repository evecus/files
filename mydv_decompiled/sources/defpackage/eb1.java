package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class eb1 extends vk0 {
    public static final /* synthetic */ int L = 0;
    public long I;
    public boolean J;
    public pp K;

    public final void a0(boolean z) {
        long j = this.I - (z ? 4294967296L : 1L);
        this.I = j;
        if (j <= 0 && this.J) {
            shutdown();
        }
    }

    public final void b0(px0 px0Var) {
        pp ppVar = this.K;
        if (ppVar == null) {
            ppVar = new pp();
            this.K = ppVar;
        }
        ppVar.addLast(px0Var);
    }

    public final void c0(boolean z) {
        this.I = (z ? 4294967296L : 1L) + this.I;
        if (z) {
            return;
        }
        this.J = true;
    }

    public abstract long d0();

    public final boolean e0() {
        pp ppVar = this.K;
        if (ppVar == null) {
            return false;
        }
        px0 px0Var = (px0) (ppVar.isEmpty() ? null : ppVar.removeFirst());
        if (px0Var == null) {
            return false;
        }
        px0Var.run();
        return true;
    }

    @Override // defpackage.vk0
    public final vk0 limitedParallelism(int i, String str) {
        ut0.l(i);
        return str != null ? new x53(this, str) : this;
    }

    public abstract void shutdown();
}

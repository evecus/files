package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class td2 implements i34 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gc4 b;

    public /* synthetic */ td2(gc4 gc4Var, byte b) {
        this.a = b;
        this.b = gc4Var;
    }

    @Override // defpackage.i34
    public final void a(wa2 wa2Var) {
        byte b = this.a;
        gc4 gc4Var = this.b;
        switch (b) {
            case 0:
                ((wd2) gc4Var).j = wa2Var;
                break;
            case 1:
                ((ag2) gc4Var).l = wa2Var;
                break;
            default:
                ((zg2) gc4Var).h = wa2Var;
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // defpackage.l13
    public final boolean all(tm1 tm1Var) {
        switch (this.a) {
        }
        return ((Boolean) tm1Var.invoke(this)).booleanValue();
    }

    @Override // defpackage.l13
    public final Object foldIn(Object obj, hn1 hn1Var) {
        switch (this.a) {
        }
        return hn1Var.invoke(obj, this);
    }

    @Override // defpackage.l13
    public final /* synthetic */ l13 then(l13 l13Var) {
        byte b = this.a;
        return hf1.e(this, l13Var);
    }
}

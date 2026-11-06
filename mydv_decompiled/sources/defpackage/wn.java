package defpackage;

import androidx.media3.exoplayer.Renderer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wn implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ tm1 J;

    public /* synthetic */ wn(tm1 tm1Var, byte b) {
        this.I = b;
        this.J = tm1Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        tm1 tm1Var = this.J;
        switch (b) {
            case 0:
                tm1Var.invoke(Boolean.FALSE);
                break;
            case 1:
                tm1Var.invoke(Boolean.FALSE);
                break;
            case 2:
                tm1Var.invoke(Boolean.FALSE);
                break;
            case 3:
                tm1Var.invoke(Boolean.FALSE);
                break;
            case 4:
                tm1Var.invoke(Boolean.FALSE);
                break;
            case 5:
                tm1Var.invoke(ab4.P);
                break;
            case 6:
                tm1Var.invoke("");
                break;
            case 7:
                tm1Var.invoke(-10000L);
                break;
            case 8:
                tm1Var.invoke(Long.valueOf(Renderer.DEFAULT_DURATION_TO_PROGRESS_US));
                break;
            case 9:
                tm1Var.invoke(-10000L);
                break;
            default:
                tm1Var.invoke(Long.valueOf(Renderer.DEFAULT_DURATION_TO_PROGRESS_US));
                break;
        }
        return wd5Var;
    }
}

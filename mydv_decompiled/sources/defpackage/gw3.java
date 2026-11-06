package defpackage;

import com.github.mytv.dv.model.Author;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gw3 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ tm1 J;
    public final /* synthetic */ Author K;

    public /* synthetic */ gw3(tm1 tm1Var, Author author, byte b) {
        this.I = b;
        this.J = tm1Var;
        this.K = author;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Author author = this.K;
        tm1 tm1Var = this.J;
        switch (b) {
            case 0:
                tm1Var.invoke(author);
                break;
            case 1:
                tm1Var.invoke(author);
                break;
            default:
                tm1Var.invoke(author);
                break;
        }
        return wd5Var;
    }
}

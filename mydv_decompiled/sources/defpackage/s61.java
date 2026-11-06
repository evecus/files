package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import com.github.mytv.dv.MainActivity;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class s61 implements Runnable {
    public final /* synthetic */ b71 I;
    public final /* synthetic */ x05 J;
    public final /* synthetic */ x05 K;
    public final /* synthetic */ MainActivity L;
    public final /* synthetic */ View M;

    public /* synthetic */ s61(b71 b71Var, x05 x05Var, x05 x05Var2, MainActivity mainActivity, View view) {
        this.I = b71Var;
        this.J = x05Var;
        this.K = x05Var2;
        this.L = mainActivity;
        this.M = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Window window = this.L.getWindow();
        window.getClass();
        x05 x05Var = this.J;
        tm1 tm1Var = x05Var.c;
        View view = this.M;
        Resources resources = view.getResources();
        resources.getClass();
        boolean booleanValue = ((Boolean) tm1Var.invoke(resources)).booleanValue();
        x05 x05Var2 = this.K;
        tm1 tm1Var2 = x05Var2.c;
        Resources resources2 = view.getResources();
        resources2.getClass();
        this.I.b(x05Var, x05Var2, window, view, booleanValue, ((Boolean) tm1Var2.invoke(resources2)).booleanValue());
    }
}

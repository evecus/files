package defpackage;

import android.os.Build;
import android.view.Window;
import com.github.mytv.dv.MainActivity;
import com.github.mytv.dv.widget.WidgetPlaybackStore;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class mt2 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ MainActivity J;
    public boolean K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt2(MainActivity mainActivity, boolean z, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 1;
        this.J = mainActivity;
        this.K = z;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        MainActivity mainActivity = this.J;
        switch (b) {
            case 0:
                return new mt2(mainActivity, fj0Var, (byte) 0);
            case 1:
                return new mt2(mainActivity, this.K, fj0Var);
            default:
                return new mt2(mainActivity, fj0Var, (byte) 2);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
            case 0:
                return ((mt2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
            case 1:
                ((mt2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                return wd5Var;
            default:
                ((mt2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                return el0.I;
        }
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        el0 el0Var = el0.I;
        MainActivity mainActivity = this.J;
        switch (b) {
            case 0:
                boolean z = this.K;
                if (z) {
                    if (z) {
                        mu0.V(obj);
                        return wd5Var;
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                OkHttpClient okHttpClient = t34.a;
                this.K = true;
                fw4 fw4Var = t34.c;
                Boolean bool = Boolean.TRUE;
                fw4Var.getClass();
                fw4Var.i(null, bool);
                t34.d.h(null);
                os0 os0Var = sx0.a;
                return p70.D0(ur0.I, new s34(mainActivity, null), this) == el0Var ? el0Var : wd5Var;
            case 1:
                mu0.V(obj);
                lt2 lt2Var = MainActivity.Companion;
                mainActivity.v(((Boolean) mainActivity.i0.getValue()).booleanValue());
                Window window = mainActivity.getWindow();
                ep epVar = new ep(mainActivity.getWindow().getDecorView());
                int i = Build.VERSION.SDK_INT;
                (i >= 35 ? new cw5(window, epVar) : i >= 30 ? new bw5(window, epVar) : i >= 26 ? new aw5(window, epVar) : new zv5(window, epVar)).p(!this.K);
                return wd5Var;
            default:
                boolean z2 = this.K;
                if (!z2) {
                    mu0.V(obj);
                    dw4 state = WidgetPlaybackStore.INSTANCE.getState();
                    id idVar = new id(mainActivity, (byte) 4);
                    this.K = true;
                    if (state.collect(idVar, this) == el0Var) {
                        return el0Var;
                    }
                } else {
                    if (!z2) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                zy.n();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mt2(MainActivity mainActivity, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.J = mainActivity;
    }
}

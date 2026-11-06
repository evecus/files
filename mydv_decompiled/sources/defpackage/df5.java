package defpackage;

import android.content.Context;
import android.widget.Toast;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class df5 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Context J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ df5(Context context, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.J = context;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                return new df5(this.J, fj0Var, (byte) 0);
            case 1:
                return new df5(this.J, fj0Var, (byte) 1);
            case 2:
                return new df5(this.J, fj0Var, (byte) 2);
            default:
                return new df5(this.J, fj0Var, (byte) 3);
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
                ((df5) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 1:
                ((df5) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 2:
                ((df5) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            default:
                ((df5) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
        }
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Context context = this.J;
        switch (b) {
            case 0:
                mu0.V(obj);
                Toast.makeText(context, "正在下载更新中，请稍候...", 0).show();
                break;
            case 1:
                mu0.V(obj);
                Toast.makeText(context, "检查更新失败，请稍后重试", 0).show();
                break;
            case 2:
                mu0.V(obj);
                Toast.makeText(context, "当前已是最新版本", 0).show();
                break;
            default:
                mu0.V(obj);
                Toast.makeText(context, "未找到可用的更新文件", 0).show();
                break;
        }
        return wd5Var;
    }
}

package defpackage;

import android.content.Context;
import android.view.View;
import com.github.mytv.dv.R;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class bd implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ bd(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.I) {
            case 0:
                cd cdVar = (cd) this.J;
                Context context = view.getContext();
                if (!cdVar.d) {
                    context.getApplicationContext().registerComponentCallbacks(cdVar.f);
                    cdVar.d = true;
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 0:
                cd cdVar = (cd) obj;
                Context context = view.getContext();
                if (cdVar.d) {
                    context.getApplicationContext().unregisterComponentCallbacks(cdVar.f);
                    cdVar.d = false;
                }
                g12 g12Var = cdVar.e;
                if (g12Var != null) {
                    g12Var.n();
                }
                cdVar.e = null;
                break;
            case 1:
                a2 a2Var = (a2) obj;
                for (Object obj2 : kb4.w(a2Var)) {
                    if (obj2 instanceof View) {
                        View view2 = (View) obj2;
                        view2.getClass();
                        Object tag = view2.getTag(R.id.is_pooling_container_tag);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null ? bool.booleanValue() : false) {
                            break;
                        }
                    }
                }
                a2Var.e();
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((rv4) obj).e(null);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}

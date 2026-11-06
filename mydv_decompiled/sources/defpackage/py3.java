package defpackage;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class py3 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public /* synthetic */ Object J;
    public final /* synthetic */ od2 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ py3(od2 od2Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = od2Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        od2 od2Var = this.K;
        switch (b) {
            case 0:
                py3 py3Var = new py3(od2Var, fj0Var, (byte) 0);
                py3Var.J = obj;
                return py3Var;
            case 1:
                py3 py3Var2 = new py3(od2Var, fj0Var, (byte) 1);
                py3Var2.J = obj;
                return py3Var2;
            default:
                py3 py3Var3 = new py3(od2Var, fj0Var, (byte) 2);
                py3Var3.J = obj;
                return py3Var3;
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
                ((py3) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 1:
                ((py3) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            default:
                ((py3) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
        }
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        od2 od2Var = this.K;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                mu0.V(obj);
                if (!od2Var.d) {
                    try {
                        ((WebView) od2Var.c).goBack();
                        break;
                    } catch (Throwable unused) {
                        break;
                    }
                }
                break;
            case 1:
                mu0.V(obj);
                WebView webView = (WebView) od2Var.c;
                if (!od2Var.d) {
                    ViewParent parent = webView.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        try {
                            viewGroup.removeView(webView);
                            viewGroup.addView(webView, 0, new ViewGroup.LayoutParams(-1, -1));
                            webView.setFocusable(false);
                            break;
                        } catch (Throwable unused2) {
                            break;
                        }
                    }
                }
                break;
            default:
                mu0.V(obj);
                if (!od2Var.d) {
                    try {
                        WebView webView2 = (WebView) od2Var.c;
                        webView2.setFocusable(true);
                        webView2.setClickable(true);
                        webView2.bringToFront();
                        webView2.requestFocus();
                        break;
                    } catch (Throwable unused3) {
                        break;
                    }
                }
                break;
        }
        return wd5Var;
        return wd5Var;
        return wd5Var;
    }
}

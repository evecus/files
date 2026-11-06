package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class cd implements ir1 {
    public static boolean g = true;
    public final AndroidComposeView a;
    public final Object b = new Object();
    public pr5 c;
    public boolean d;
    public g12 e;
    public final ad f;

    public cd(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
        ad adVar = new ad(this);
        this.f = adVar;
        if (androidComposeView.isAttachedToWindow()) {
            Context context = androidComposeView.getContext();
            if (!this.d) {
                context.getApplicationContext().registerComponentCallbacks(adVar);
                this.d = true;
            }
        }
        androidComposeView.addOnAttachStateChangeListener(new bd(this, (byte) 0));
    }

    @Override // defpackage.ir1
    public final void a(jr1 jr1Var) {
        synchronized (this.b) {
            if (!jr1Var.s) {
                jr1Var.s = true;
                jr1Var.b();
            }
        }
    }

    @Override // defpackage.ir1
    public final g12 b() {
        g12 g12Var = this.e;
        if (g12Var != null) {
            return g12Var;
        }
        g12 e = d4.e();
        this.e = e;
        return e;
    }

    @Override // defpackage.ir1
    public final jr1 c() {
        lr1 rr1Var;
        lr1 lr1Var;
        jr1 jr1Var;
        synchronized (this.b) {
            try {
                AndroidComposeView androidComposeView = this.a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    z9.d(androidComposeView);
                }
                if (i >= 29) {
                    lr1Var = new pr1();
                } else {
                    if (g) {
                        try {
                            rr1Var = new or1(this.a);
                        } catch (Throwable unused) {
                            g = false;
                            AndroidComposeView androidComposeView2 = this.a;
                            pr5 pr5Var = this.c;
                            if (pr5Var == null) {
                                pr5 pr5Var2 = new pr5(androidComposeView2.getContext());
                                androidComposeView2.addView(pr5Var2);
                                this.c = pr5Var2;
                                pr5Var = pr5Var2;
                            }
                            rr1Var = new rr1(pr5Var);
                        }
                    } else {
                        AndroidComposeView androidComposeView3 = this.a;
                        pr5 pr5Var3 = this.c;
                        if (pr5Var3 == null) {
                            pr5 pr5Var4 = new pr5(androidComposeView3.getContext());
                            androidComposeView3.addView(pr5Var4);
                            this.c = pr5Var4;
                            pr5Var3 = pr5Var4;
                        }
                        rr1Var = new rr1(pr5Var3);
                    }
                    lr1Var = rr1Var;
                }
                jr1Var = new jr1(lr1Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return jr1Var;
    }
}

package defpackage;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.textclassifier.TextClassification;
import android.widget.Magnifier;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class rn3 implements pn3 {
    public static final rn3 a = new rn3();
    public static final rn3 b = new rn3();

    public static void d(yi0 yi0Var, Context context, j35 j35Var) {
        if (context == null) {
            return;
        }
        int i = j35Var.c;
        TextClassification textClassification = j35Var.b;
        Drawable drawable = j35Var.d;
        byte b2 = 1;
        if (i < 0) {
            yi0.b(yi0Var, new rd(textClassification, (byte) 17), drawable != null ? new tc0(-1123224187, new b35(drawable, (byte) 0), true) : null, new jt2((Object) context, (Object) textClassification, (byte) 28), 6);
        } else {
            RemoteAction remoteAction = textClassification.getActions().get(i);
            yi0.b(yi0Var, new rd(remoteAction, (byte) 18), drawable != null ? new tc0(1106162332, new b35(drawable, b2), true) : null, new iy3(remoteAction, (byte) 11), 6);
        }
    }

    public static final String e(TextClassification textClassification, fe0 fe0Var) {
        go1 go1Var = (go1) fe0Var;
        go1Var.d0(950061013);
        String valueOf = String.valueOf(textClassification.getLabel());
        go1Var.q(false);
        return valueOf;
    }

    public static final String f(RemoteAction remoteAction, fe0 fe0Var) {
        go1 go1Var = (go1) fe0Var;
        go1Var.d0(-1376593684);
        String obj = remoteAction.getTitle().toString();
        go1Var.q(false);
        return obj;
    }

    public static final void g(RemoteAction remoteAction) {
        PendingIntent actionIntent = remoteAction.getActionIntent();
        if (Build.VERSION.SDK_INT >= 34) {
            z4.o(actionIntent);
        } else {
            actionIntent.send();
        }
    }

    @Override // defpackage.pn3
    public boolean a() {
        return false;
    }

    @Override // defpackage.pn3
    public on3 b(View view, boolean z, long j, float f, float f2, boolean z2, iu0 iu0Var, float f3) {
        return new qn3(new Magnifier(view));
    }

    public void c(Drawable drawable, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(257732500);
        int i2 = (go1Var.i(drawable) ? 4 : 2) | i;
        if (go1Var.T(i2 & 1, (i2 & 3) != 2)) {
            l13 k = nq4.k(i13.a, zi0.e);
            boolean i3 = go1Var.i(drawable);
            Object Q = go1Var.Q();
            if (i3 || Q == de0.a) {
                Q = new tf2(drawable, (byte) 28);
                go1Var.o0(Q);
            }
            px.a(j42.t(k, (tm1) Q), go1Var, 0);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new bj1((byte) 23, i, this, drawable);
        }
    }
}

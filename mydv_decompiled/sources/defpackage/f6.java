package defpackage;

import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class f6 implements View.OnClickListener {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ f6(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        byte b = this.I;
        Message message4 = null;
        message4 = null;
        Object obj = this.J;
        switch (b) {
            case 0:
                ((y6) obj).a();
                break;
            case 1:
                m8 m8Var = (m8) obj;
                if (view == m8Var.h && (message3 = m8Var.j) != null) {
                    message4 = Message.obtain(message3);
                } else if (view == m8Var.k && (message2 = m8Var.m) != null) {
                    message4 = Message.obtain(message2);
                } else if (view == m8Var.n && (message = m8Var.p) != null) {
                    message4 = Message.obtain(message);
                }
                if (message4 != null) {
                    message4.sendToTarget();
                }
                m8Var.D.obtainMessage(1, m8Var.b).sendToTarget();
                break;
            default:
                r85 r85Var = ((Toolbar) obj).w0;
                ky2 ky2Var = r85Var != null ? r85Var.J : null;
                if (ky2Var != null) {
                    ky2Var.collapseActionView();
                    break;
                }
                break;
        }
    }
}

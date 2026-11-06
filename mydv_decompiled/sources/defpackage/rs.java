package defpackage;

import android.view.View;
import androidx.recyclerview.widget.g;

/* loaded from: classes2.dex */
public final class rs implements td3 {
    public int I;
    public int J;

    public rs(byte b) {
        switch (b) {
            case 1:
                break;
            default:
                this.I = 4096;
                break;
        }
    }

    public void a(g gVar) {
        View view = gVar.itemView;
        this.I = view.getLeft();
        this.J = view.getTop();
        view.getRight();
        view.getBottom();
    }

    @Override // defpackage.td3
    public int c(int i) {
        if (i >= 0 && i <= this.J) {
            wx5.W(i, this.I, i);
        }
        return i;
    }

    @Override // defpackage.td3
    public int k(int i) {
        if (i >= 0 && i <= this.I) {
            wx5.V(i, this.J, i);
        }
        return i;
    }

    public rs(int i, int i2) {
        this.I = i;
        this.J = i2;
    }
}

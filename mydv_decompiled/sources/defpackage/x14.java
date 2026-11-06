package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.e;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class x14 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e b;

    public /* synthetic */ x14(e eVar, byte b) {
        this.a = b;
        this.b = eVar;
    }

    public final int a(View view) {
        int right;
        int i;
        switch (this.a) {
            case 0:
                z14 z14Var = (z14) view.getLayoutParams();
                right = view.getRight() + ((z14) view.getLayoutParams()).b.right;
                i = ((ViewGroup.MarginLayoutParams) z14Var).rightMargin;
                break;
            default:
                z14 z14Var2 = (z14) view.getLayoutParams();
                right = view.getBottom() + ((z14) view.getLayoutParams()).b.bottom;
                i = ((ViewGroup.MarginLayoutParams) z14Var2).bottomMargin;
                break;
        }
        return right + i;
    }

    public final int b(View view) {
        int left;
        int i;
        switch (this.a) {
            case 0:
                z14 z14Var = (z14) view.getLayoutParams();
                left = view.getLeft() - ((z14) view.getLayoutParams()).b.left;
                i = ((ViewGroup.MarginLayoutParams) z14Var).leftMargin;
                break;
            default:
                z14 z14Var2 = (z14) view.getLayoutParams();
                left = view.getTop() - ((z14) view.getLayoutParams()).b.top;
                i = ((ViewGroup.MarginLayoutParams) z14Var2).topMargin;
                break;
        }
        return left - i;
    }

    public final int c() {
        int i;
        int z;
        byte b = this.a;
        e eVar = this.b;
        switch (b) {
            case 0:
                i = eVar.m;
                z = eVar.z();
                break;
            default:
                i = eVar.n;
                z = eVar.x();
                break;
        }
        return i - z;
    }

    public final int d() {
        byte b = this.a;
        e eVar = this.b;
        switch (b) {
            case 0:
                return eVar.y();
            default:
                return eVar.A();
        }
    }
}

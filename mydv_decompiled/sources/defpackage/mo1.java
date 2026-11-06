package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class mo1 {
    public int a;
    public int b;
    public int c;
    public Object d;

    public void a(int i, int i2) {
        if (i < 0) {
            s83.t("Layout positions must be non-negative");
            return;
        }
        if (i2 < 0) {
            s83.t("Pixel distance must be non-negative");
            return;
        }
        int i3 = this.c;
        int i4 = i3 * 2;
        int[] iArr = (int[]) this.d;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.d = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.d = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.d;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.c++;
    }

    public void b(RecyclerView recyclerView, boolean z) {
        this.c = 0;
        int[] iArr = (int[]) this.d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        e eVar = recyclerView.V;
        if (recyclerView.U == null || eVar == null || !eVar.h) {
            return;
        }
        if (z) {
            if (!recyclerView.M.x()) {
                eVar.h(recyclerView.U.getItemCount(), this);
            }
        } else if (!recyclerView.J()) {
            eVar.g(this.a, this.b, recyclerView.N0, this);
        }
        int i = this.c;
        if (i > eVar.i) {
            eVar.i = i;
            eVar.j = z;
            recyclerView.K.m();
        }
    }

    public int c(int i) {
        return ((lg3) this.d).f[this.b + i];
    }

    public Object d(int i) {
        return ((lg3) this.d).h[this.c + i];
    }
}

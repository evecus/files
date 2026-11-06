package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ax2 extends y2 {
    public final jp I;
    public final ArrayList J;
    public final List K;

    public ax2(jp jpVar, mk2 mk2Var, ArrayList arrayList, n33 n33Var) {
        if (n33Var.b != arrayList.size() + 1) {
            s83.t("Outline progress size is expected to be the cubics size + 1");
            throw null;
        }
        int i = n33Var.b;
        if (i == 0) {
            dq2.K0("FloatList is empty.");
            throw null;
        }
        float[] fArr = n33Var.a;
        int i2 = 0;
        float f = 0.0f;
        if (fArr[0] != 0.0f) {
            s83.t("First outline progress value is expected to be zero");
            throw null;
        }
        if (i == 0) {
            dq2.K0("FloatList is empty.");
            throw null;
        }
        if (fArr[i - 1] != 1.0f) {
            s83.t("Last outline progress value is expected to be one");
            throw null;
        }
        this.I = jpVar;
        this.K = mk2Var;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i2 < size) {
            int i3 = i2 + 1;
            if (n33Var.b(i3) - n33Var.b(i2) > 1.0E-4f) {
                arrayList2.add(new zw2(this, (km0) arrayList.get(i2), f, n33Var.b(i3)));
                f = n33Var.b(i3);
            }
            i2 = i3;
        }
        zw2 zw2Var = (zw2) r7.w(arrayList2, 1);
        float f2 = zw2Var.c;
        if (1.0f < f2) {
            s83.t("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
            throw null;
        }
        zw2Var.c = f2;
        zw2Var.d = 1.0f;
        this.J = arrayList2;
    }

    @Override // defpackage.w1
    public final int c() {
        return this.J.size();
    }

    @Override // defpackage.w1, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof zw2) {
            return super.contains((zw2) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return (zw2) this.J.get(i);
    }

    @Override // defpackage.y2, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof zw2) {
            return super.indexOf((zw2) obj);
        }
        return -1;
    }

    @Override // defpackage.y2, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof zw2) {
            return super.lastIndexOf((zw2) obj);
        }
        return -1;
    }
}

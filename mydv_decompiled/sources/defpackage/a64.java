package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.github.mytv.dv.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class a64 extends ViewGroup {
    public final byte I;
    public final ArrayList J;
    public final ArrayList K;
    public final g12 L;
    public int M;

    public a64(Context context) {
        super(context);
        this.I = (byte) 5;
        ArrayList arrayList = new ArrayList();
        this.J = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.K = arrayList2;
        this.L = new g12((byte) 26);
        setClipChildren(false);
        b64 b64Var = new b64(context);
        addView(b64Var);
        arrayList.add(b64Var);
        arrayList2.add(b64Var);
        this.M = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(ue ueVar) {
        ueVar.T = null;
        mu0.I(ueVar);
        g12 g12Var = this.L;
        b64 b64Var = (b64) ((LinkedHashMap) g12Var.J).get(ueVar);
        if (b64Var != null) {
            b64Var.c();
            LinkedHashMap linkedHashMap = (LinkedHashMap) g12Var.J;
            b64 b64Var2 = (b64) linkedHashMap.get(ueVar);
            if (b64Var2 != null) {
            }
            linkedHashMap.remove(ueVar);
            this.K.add(b64Var);
        }
    }

    public final b64 b(ue ueVar) {
        g12 g12Var = this.L;
        LinkedHashMap linkedHashMap = (LinkedHashMap) g12Var.J;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) g12Var.J;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) g12Var.K;
        b64 b64Var = (b64) linkedHashMap.get(ueVar);
        if (b64Var != null) {
            return b64Var;
        }
        ArrayList arrayList = this.K;
        arrayList.getClass();
        b64 b64Var2 = (b64) (arrayList.isEmpty() ? null : arrayList.remove(0));
        if (b64Var2 == null) {
            int i = this.M;
            ArrayList arrayList2 = this.J;
            if (i > p70.X(arrayList2)) {
                b64Var2 = new b64(getContext());
                addView(b64Var2);
                arrayList2.add(b64Var2);
            } else {
                b64Var2 = (b64) arrayList2.get(this.M);
                ue ueVar2 = (ue) linkedHashMap3.get(b64Var2);
                if (ueVar2 != null) {
                    ueVar2.T = null;
                    mu0.I(ueVar2);
                    b64 b64Var3 = (b64) linkedHashMap2.get(ueVar2);
                    if (b64Var3 != null) {
                    }
                    linkedHashMap2.remove(ueVar2);
                    b64Var2.c();
                }
            }
            int i2 = this.M;
            if (i2 < this.I - 1) {
                this.M = i2 + 1;
            } else {
                this.M = 0;
            }
        }
        linkedHashMap2.put(ueVar, b64Var2);
        linkedHashMap3.put(b64Var2, ueVar);
        return b64Var2;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}

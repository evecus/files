package defpackage;

import java.util.RandomAccess;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class mg3 extends y2 implements RandomAccess {
    public final h00[] I;
    public final int[] J;

    public mg3(h00[] h00VarArr, int[] iArr) {
        this.I = h00VarArr;
        this.J = iArr;
    }

    @Override // defpackage.w1
    public final int c() {
        return this.I.length;
    }

    @Override // defpackage.w1, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof h00) {
            return super.contains((h00) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.I[i];
    }

    @Override // defpackage.y2, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof h00) {
            return super.indexOf((h00) obj);
        }
        return -1;
    }

    @Override // defpackage.y2, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof h00) {
            return super.lastIndexOf((h00) obj);
        }
        return -1;
    }
}

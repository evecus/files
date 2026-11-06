package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class by1 extends dy1 {
    public final transient int K;
    public final transient int L;
    public final /* synthetic */ dy1 M;

    public by1(dy1 dy1Var, int i, int i2) {
        this.M = dy1Var;
        this.K = i;
        this.L = i2;
    }

    @Override // defpackage.vx1
    public final Object[] e() {
        return this.M.e();
    }

    @Override // defpackage.vx1
    public final int f() {
        return this.M.h() + this.K + this.L;
    }

    @Override // java.util.List
    public final Object get(int i) {
        sp0.u(i, this.L);
        return this.M.get(i + this.K);
    }

    @Override // defpackage.vx1
    public final int h() {
        return this.M.h() + this.K;
    }

    @Override // defpackage.dy1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.vx1
    public final boolean j() {
        return true;
    }

    @Override // defpackage.dy1, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.L;
    }

    @Override // defpackage.dy1, java.util.List
    /* renamed from: w */
    public final dy1 subList(int i, int i2) {
        sp0.y(i, i2, this.L);
        int i3 = this.K;
        return this.M.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.dy1, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}

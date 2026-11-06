package defpackage;

import android.view.View;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ir5 extends qg {
    public final View m0;
    public final d93 n0;
    public i94 o0;
    public tm1 p0;
    public tm1 q0;
    public tm1 r0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ir5(android.content.Context r8, defpackage.tm1 r9, defpackage.eo1 r10, defpackage.j94 r11, int r12, defpackage.qh3 r13) {
        /*
            r7 = this;
            java.lang.Object r9 = r9.invoke(r8)
            r5 = r9
            android.view.View r5 = (android.view.View) r5
            d93 r4 = new d93
            r4.<init>()
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0.m0 = r5
            r0.n0 = r4
            r7 = 0
            r0.setClipChildren(r7)
            java.lang.String r7 = java.lang.String.valueOf(r3)
            r8 = 0
            if (r11 == 0) goto L28
            java.lang.Object r9 = r11.e(r7)
            goto L29
        L28:
            r9 = r8
        L29:
            boolean r10 = r9 instanceof android.util.SparseArray
            if (r10 == 0) goto L30
            r8 = r9
            android.util.SparseArray r8 = (android.util.SparseArray) r8
        L30:
            if (r8 == 0) goto L35
            r5.restoreHierarchyState(r8)
        L35:
            if (r11 == 0) goto L44
            lg r8 = new lg
            r9 = 2
            r8.<init>(r0, r9)
            i94 r7 = r11.a(r7, r8)
            r0.setSavableRegistryEntry(r7)
        L44:
            q4 r7 = defpackage.mw2.a
            r0.p0 = r7
            r0.q0 = r7
            r0.r0 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir5.<init>(android.content.Context, tm1, eo1, j94, int, qh3):void");
    }

    public static final void p(ir5 ir5Var) {
        ir5Var.r0.invoke(ir5Var.m0);
        ir5Var.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(i94 i94Var) {
        i94 i94Var2 = this.o0;
        if (i94Var2 != null) {
            ((pn) i94Var2).Z();
        }
        this.o0 = i94Var;
    }

    public final d93 getDispatcher() {
        return this.n0;
    }

    public final tm1 getReleaseBlock() {
        return this.r0;
    }

    public final tm1 getResetBlock() {
        return this.q0;
    }

    public /* bridge */ /* synthetic */ a2 getSubCompositionView() {
        return null;
    }

    public final tm1 getUpdateBlock() {
        return this.p0;
    }

    public final void setReleaseBlock(tm1 tm1Var) {
        this.r0 = tm1Var;
        setRelease(new lg(this, (byte) 3));
    }

    public final void setResetBlock(tm1 tm1Var) {
        this.q0 = tm1Var;
        setReset(new iy3(this, (byte) 20));
    }

    public final void setUpdateBlock(tm1 tm1Var) {
        this.p0 = tm1Var;
        setUpdate(new lg(this, (byte) 4));
    }

    public View getViewRoot() {
        return this;
    }
}

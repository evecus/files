package defpackage;

import com.github.mytv.dv.model.Aweme;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class kq5 {
    public final n11 a;
    public final fl4 b;
    public int c = 1;
    public final LinkedHashMap d = new LinkedHashMap();
    public final ArrayList e = new ArrayList();
    public int f = 1;
    public final ArrayList g = new ArrayList();
    public final LinkedHashMap h = new LinkedHashMap();
    public final LinkedHashSet i = new LinkedHashSet();
    public final LinkedHashSet j = new LinkedHashSet();

    public kq5(n11 n11Var, fl4 fl4Var) {
        this.a = n11Var;
        this.b = fl4Var;
    }

    public static final List h(int i, HashSet hashSet, List list) {
        if (i <= 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Aweme aweme = (Aweme) obj;
            if (aweme.getAwemeId().length() <= 0 || !hashSet.contains(aweme.getAwemeId())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void i(kq5 kq5Var, int i, List list) {
        ArrayList arrayList = kq5Var.e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Aweme aweme = (Aweme) it.next();
            if (aweme.getAwemeId().length() > 0) {
                arrayList.remove(aweme.getAwemeId());
                arrayList.add(aweme.getAwemeId());
            }
        }
        if (arrayList.size() > i) {
            List m1 = o70.m1(i, arrayList);
            arrayList.clear();
            arrayList.addAll(m1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(java.lang.String r9, java.lang.String r10, long r11, defpackage.gj0 r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof defpackage.up5
            if (r0 == 0) goto L14
            r0 = r13
            up5 r0 = (defpackage.up5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.K = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            up5 r0 = new up5
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r7.I
            int r0 = r7.K
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2b
            defpackage.mu0.V(r13)
            h54 r13 = (defpackage.h54) r13
            java.lang.Object r8 = r13.I
            return r8
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r8)
            r8 = 0
            return r8
        L32:
            defpackage.mu0.V(r13)
            r7.K = r1
            zy0 r13 = defpackage.n11.Companion
            r6 = 20
            n11 r1 = r8.a
            r3 = r9
            r2 = r10
            r4 = r11
            java.lang.Object r8 = r1.g0(r2, r3, r4, r6, r7)
            el0 r9 = defpackage.el0.I
            if (r8 != r9) goto L49
            return r9
        L49:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.A(java.lang.String, java.lang.String, long, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(java.lang.String r8, long r9, defpackage.gj0 r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.vp5
            if (r0 == 0) goto L14
            r0 = r11
            vp5 r0 = (defpackage.vp5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.K = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            vp5 r0 = new vp5
            r0.<init>(r7, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.I
            int r0 = r6.K
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2b
            defpackage.mu0.V(r11)
            h54 r11 = (defpackage.h54) r11
            java.lang.Object r7 = r11.I
            return r7
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r7)
            r7 = 0
            return r7
        L32:
            defpackage.mu0.V(r11)
            r6.K = r1
            zy0 r11 = defpackage.n11.Companion
            r5 = 12
            n11 r1 = r7.a
            r2 = r8
            r3 = r9
            java.lang.Object r7 = r1.h0(r2, r3, r5, r6)
            el0 r8 = defpackage.el0.I
            if (r7 != r8) goto L48
            return r8
        L48:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.B(java.lang.String, long, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(java.lang.String r5, defpackage.gj0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.wp5
            if (r0 == 0) goto L13
            r0 = r6
            wp5 r0 = (defpackage.wp5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            wp5 r0 = new wp5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.I
            int r1 = r0.K
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            defpackage.mu0.V(r6)
            h54 r6 = (defpackage.h54) r6
            java.lang.Object r4 = r6.I
            goto L40
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L30:
            defpackage.mu0.V(r6)
            r0.K = r2
            n11 r4 = r4.a
            java.lang.Object r4 = r4.i0(r5, r0)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L40
            return r5
        L40:
            boolean r5 = r4 instanceof defpackage.g54
            if (r5 != 0) goto L4a
            com.github.mytv.dv.model.UserProfileResponse r4 = (com.github.mytv.dv.model.UserProfileResponse) r4
            com.github.mytv.dv.model.Author r4 = r4.getUser()
        L4a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.C(java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(java.lang.String r8, long r9, defpackage.gj0 r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.xp5
            if (r0 == 0) goto L14
            r0 = r11
            xp5 r0 = (defpackage.xp5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.K = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            xp5 r0 = new xp5
            r0.<init>(r7, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.I
            int r0 = r6.K
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2b
            defpackage.mu0.V(r11)
            h54 r11 = (defpackage.h54) r11
            java.lang.Object r7 = r11.I
            return r7
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r7)
            r7 = 0
            return r7
        L32:
            defpackage.mu0.V(r11)
            r6.K = r1
            zy0 r11 = defpackage.n11.Companion
            r5 = 18
            n11 r1 = r7.a
            r2 = r8
            r3 = r9
            java.lang.Object r7 = r1.k0(r2, r3, r5, r6)
            el0 r8 = defpackage.el0.I
            if (r7 != r8) goto L48
            return r8
        L48:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.D(java.lang.String, long, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(java.lang.String r5, defpackage.gj0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.yp5
            if (r0 == 0) goto L13
            r0 = r6
            yp5 r0 = (defpackage.yp5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            yp5 r0 = new yp5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.I
            int r1 = r0.K
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            defpackage.mu0.V(r6)
            h54 r6 = (defpackage.h54) r6
            java.lang.Object r4 = r6.I
            goto L40
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L30:
            defpackage.mu0.V(r6)
            r0.K = r2
            n11 r4 = r4.a
            java.lang.Object r4 = r4.l0(r5, r0)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L40
            return r5
        L40:
            boolean r5 = r4 instanceof defpackage.g54
            if (r5 != 0) goto L4e
            com.github.mytv.dv.model.WorkDetailResponse r4 = (com.github.mytv.dv.model.WorkDetailResponse) r4
            com.github.mytv.dv.model.Aweme r4 = r4.getAwemeDetail()
            com.github.mytv.dv.model.Aweme r4 = com.github.mytv.dv.model.DataModelKt.takeIfPrimaryAweme(r4)
        L4e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.E(java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(long r8, defpackage.gj0 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.zp5
            if (r0 == 0) goto L14
            r0 = r10
            zp5 r0 = (defpackage.zp5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.K = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            zp5 r0 = new zp5
            r0.<init>(r7, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.I
            int r0 = r6.K
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2b
            defpackage.mu0.V(r10)
            h54 r10 = (defpackage.h54) r10
            java.lang.Object r7 = r10.I
            return r7
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r7)
            r7 = 0
            return r7
        L32:
            defpackage.mu0.V(r10)
            r6.K = r1
            zy0 r10 = defpackage.n11.Companion
            r4 = 20
            r5 = -1
            n11 r1 = r7.a
            r2 = r8
            java.lang.Object r7 = r1.m0(r2, r4, r5, r6)
            el0 r8 = defpackage.el0.I
            if (r7 != r8) goto L48
            return r8
        L48:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.F(long, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(int r5, defpackage.gj0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.aq5
            if (r0 == 0) goto L13
            r0 = r6
            aq5 r0 = (defpackage.aq5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            aq5 r0 = new aq5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.I
            int r1 = r0.K
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            defpackage.mu0.V(r6)
            h54 r6 = (defpackage.h54) r6
            java.lang.Object r4 = r6.I
            goto L42
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L30:
            defpackage.mu0.V(r6)
            r0.K = r2
            zy0 r6 = defpackage.n11.Companion
            n11 r4 = r4.a
            java.lang.Object r4 = r4.n0(r5, r0)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L42
            return r5
        L42:
            boolean r5 = r4 instanceof defpackage.g54
            if (r5 != 0) goto L50
            com.github.mytv.dv.model.UserWorksResponse r4 = (com.github.mytv.dv.model.UserWorksResponse) r4
            java.util.List r4 = r4.getItems()
            java.util.List r4 = com.github.mytv.dv.model.DataModelKt.filterPrimaryPlayableAwemes(r4)
        L50:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.G(int, gj0):java.lang.Object");
    }

    public final boolean H() {
        return ((Boolean) this.b.s.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(int r5, defpackage.gj0 r6, java.lang.String r7) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.bq5
            if (r0 == 0) goto L13
            r0 = r6
            bq5 r0 = (defpackage.bq5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            bq5 r0 = new bq5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.I
            int r1 = r0.K
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            defpackage.mu0.V(r6)
            h54 r6 = (defpackage.h54) r6
            java.lang.Object r4 = r6.I
            return r4
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L30:
            defpackage.mu0.V(r6)
            boolean r6 = defpackage.jx4.L(r7)
            if (r6 != 0) goto L50
            java.util.LinkedHashSet r6 = r4.i
            boolean r6 = r6.add(r7)
            if (r6 != 0) goto L42
            goto L50
        L42:
            r0.K = r2
            n11 r4 = r4.a
            java.lang.Object r4 = r4.s0(r5, r0, r7)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L4f
            return r5
        L4f:
            return r4
        L50:
            wd5 r4 = defpackage.wd5.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.I(int, gj0, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(int r5, defpackage.gj0 r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cq5
            if (r0 == 0) goto L13
            r0 = r6
            cq5 r0 = (defpackage.cq5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            cq5 r0 = new cq5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.I
            int r1 = r0.K
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            defpackage.mu0.V(r6)
            h54 r6 = (defpackage.h54) r6
            java.lang.Object r4 = r6.I
            return r4
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L30:
            defpackage.mu0.V(r6)
            boolean r6 = defpackage.jx4.L(r7)
            if (r6 != 0) goto L58
            if (r5 <= 0) goto L58
            boolean r6 = defpackage.jx4.L(r8)
            if (r6 != 0) goto L58
            java.util.LinkedHashSet r6 = r4.j
            boolean r6 = r6.add(r8)
            if (r6 != 0) goto L4a
            goto L58
        L4a:
            r0.K = r2
            n11 r4 = r4.a
            java.lang.Object r4 = r4.t0(r5, r0, r7, r8)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L57
            return r5
        L57:
            return r4
        L58:
            wd5 r4 = defpackage.wd5.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.J(int, gj0, java.lang.String, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(int r5, defpackage.gj0 r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dq5
            if (r0 == 0) goto L13
            r0 = r6
            dq5 r0 = (defpackage.dq5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            dq5 r0 = new dq5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.I
            int r1 = r0.K
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            defpackage.mu0.V(r6)
            h54 r6 = (defpackage.h54) r6
            java.lang.Object r4 = r6.I
            return r4
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L30:
            defpackage.mu0.V(r6)
            r0.K = r2
            zy0 r6 = defpackage.n11.Companion
            n11 r4 = r4.a
            java.lang.Object r4 = r4.u0(r5, r0, r7, r8)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L42
            return r5
        L42:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.K(int, gj0, java.lang.String, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(int r10, defpackage.gj0 r11, java.lang.String r12, java.lang.String r13) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.eq5
            if (r0 == 0) goto L14
            r0 = r11
            eq5 r0 = (defpackage.eq5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.K = r1
        L12:
            r8 = r0
            goto L1a
        L14:
            eq5 r0 = new eq5
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r8.I
            int r0 = r8.K
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2b
            defpackage.mu0.V(r11)
            h54 r11 = (defpackage.h54) r11
            java.lang.Object r9 = r11.I
            return r9
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r9)
            r9 = 0
            return r9
        L32:
            defpackage.mu0.V(r11)
            r8.K = r1
            zy0 r11 = defpackage.n11.Companion
            java.lang.String r6 = ""
            r4 = 10
            n11 r1 = r9.a
            r7 = r6
            r3 = r10
            r2 = r12
            r5 = r13
            java.lang.Object r9 = r1.v0(r2, r3, r4, r5, r6, r7, r8)
            el0 r10 = defpackage.el0.I
            if (r9 != r10) goto L4c
            return r10
        L4c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.L(int, gj0, java.lang.String, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v3, types: [o91] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(int r10, defpackage.gj0 r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.M(int, gj0, java.lang.String, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(java.lang.String r5, defpackage.gj0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.gq5
            if (r0 == 0) goto L13
            r0 = r6
            gq5 r0 = (defpackage.gq5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            gq5 r0 = new gq5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.I
            int r1 = r0.K
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            defpackage.mu0.V(r6)
            h54 r6 = (defpackage.h54) r6
            java.lang.Object r4 = r6.I
            return r4
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L30:
            defpackage.mu0.V(r6)
            r0.K = r2
            n11 r4 = r4.a
            java.lang.Object r4 = r4.x0(r5, r0)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L40
            return r5
        L40:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.N(java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(java.lang.String r5, boolean r6, defpackage.gj0 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.hq5
            if (r0 == 0) goto L13
            r0 = r7
            hq5 r0 = (defpackage.hq5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            hq5 r0 = new hq5
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.I
            int r1 = r0.K
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            defpackage.mu0.V(r7)
            h54 r7 = (defpackage.h54) r7
            java.lang.Object r4 = r7.I
            return r4
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L30:
            defpackage.mu0.V(r7)
            r0.K = r2
            n11 r4 = r4.a
            java.lang.Object r4 = r4.y0(r5, r6, r0)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L40
            return r5
        L40:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.O(java.lang.String, boolean, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(java.lang.String r5, boolean r6, defpackage.gj0 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.iq5
            if (r0 == 0) goto L13
            r0 = r7
            iq5 r0 = (defpackage.iq5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            iq5 r0 = new iq5
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.I
            int r1 = r0.K
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            defpackage.mu0.V(r7)
            h54 r7 = (defpackage.h54) r7
            java.lang.Object r4 = r7.I
            return r4
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L30:
            defpackage.mu0.V(r7)
            r0.K = r2
            n11 r4 = r4.a
            java.lang.Object r4 = r4.z0(r5, r6, r0)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L40
            return r5
        L40:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.P(java.lang.String, boolean, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q(java.lang.String r5, java.lang.String r6, defpackage.gj0 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.jq5
            if (r0 == 0) goto L13
            r0 = r7
            jq5 r0 = (defpackage.jq5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            jq5 r0 = new jq5
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.I
            int r1 = r0.K
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            defpackage.mu0.V(r7)
            h54 r7 = (defpackage.h54) r7
            java.lang.Object r4 = r7.I
            return r4
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L30:
            defpackage.mu0.V(r7)
            r0.K = r2
            n11 r4 = r4.a
            java.lang.Object r4 = r4.A0(r5, r6, r0)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L40
            return r5
        L40:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.Q(java.lang.String, java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.gj0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.vo5
            if (r0 == 0) goto L13
            r0 = r5
            vo5 r0 = (defpackage.vo5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            vo5 r0 = new vo5
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.I
            int r1 = r0.K
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            defpackage.mu0.V(r5)
            h54 r5 = (defpackage.h54) r5
            java.lang.Object r4 = r5.I
            goto L40
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L30:
            defpackage.mu0.V(r5)
            r0.K = r2
            n11 r4 = r4.a
            java.lang.Object r4 = r4.G(r0)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L40
            return r5
        L40:
            boolean r5 = r4 instanceof defpackage.g54
            if (r5 != 0) goto L4e
            com.github.mytv.dv.model.ChannelSettingResponse r4 = (com.github.mytv.dv.model.ChannelSettingResponse) r4
            java.util.List r4 = r4.getData()
            if (r4 != 0) goto L4e
            o91 r4 = defpackage.o91.I
        L4e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.a(gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r5, defpackage.gj0 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.wo5
            if (r0 == 0) goto L13
            r0 = r7
            wo5 r0 = (defpackage.wo5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            wo5 r0 = new wo5
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.I
            int r1 = r0.K
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            defpackage.mu0.V(r7)
            h54 r7 = (defpackage.h54) r7
            java.lang.Object r4 = r7.I
            return r4
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L30:
            defpackage.mu0.V(r7)
            r0.K = r2
            zy0 r7 = defpackage.n11.Companion
            r7 = 12
            n11 r4 = r4.a
            java.lang.Object r4 = r4.H(r5, r7, r0)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L44
            return r5
        L44:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.b(long, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, java.lang.String r6, defpackage.gj0 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.xo5
            if (r0 == 0) goto L13
            r0 = r7
            xo5 r0 = (defpackage.xo5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            xo5 r0 = new xo5
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.I
            int r1 = r0.K
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            defpackage.mu0.V(r7)
            h54 r7 = (defpackage.h54) r7
            java.lang.Object r4 = r7.I
            return r4
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L30:
            defpackage.mu0.V(r7)
            r0.K = r2
            zy0 r7 = defpackage.n11.Companion
            r7 = 10
            n11 r4 = r4.a
            java.lang.Object r4 = r4.J(r7, r0, r5, r6)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L44
            return r5
        L44:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.c(java.lang.String, java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(int r5, defpackage.gj0 r6, java.lang.String r7) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.yo5
            if (r0 == 0) goto L13
            r0 = r6
            yo5 r0 = (defpackage.yo5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            yo5 r0 = new yo5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.I
            int r1 = r0.K
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            defpackage.mu0.V(r6)
            h54 r6 = (defpackage.h54) r6
            java.lang.Object r4 = r6.I
            return r4
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L30:
            defpackage.mu0.V(r6)
            r0.K = r2
            zy0 r6 = defpackage.n11.Companion
            r6 = 20
            n11 r4 = r4.a
            java.lang.Object r4 = r4.I(r7, r5, r6, r0)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L44
            return r5
        L44:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.d(int, gj0, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r16, java.lang.String r17, long r18, long r20, long r22, java.lang.String r24, defpackage.gj0 r25) {
        /*
            r15 = this;
            r0 = r25
            boolean r1 = r0 instanceof defpackage.zo5
            if (r1 == 0) goto L15
            r1 = r0
            zo5 r1 = (defpackage.zo5) r1
            int r2 = r1.K
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.K = r2
            goto L1a
        L15:
            zo5 r1 = new zo5
            r1.<init>(r15, r0)
        L1a:
            java.lang.Object r0 = r1.I
            int r2 = r1.K
            r14 = 1
            if (r2 == 0) goto L2e
            if (r2 != r14) goto L27
            defpackage.mu0.V(r0)
            goto L53
        L27:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r0)
            r0 = 0
            return r0
        L2e:
            defpackage.mu0.V(r0)
            os0 r0 = defpackage.sx0.a
            ur0 r0 = defpackage.ur0.I
            ap5 r2 = new ap5
            r13 = 0
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r8 = r20
            r10 = r22
            r12 = r24
            r2.<init>(r3, r4, r5, r6, r8, r10, r12, r13)
            r1.K = r14
            java.lang.Object r0 = defpackage.p70.D0(r0, r2, r1)
            el0 r1 = defpackage.el0.I
            if (r0 != r1) goto L53
            return r1
        L53:
            h54 r0 = (defpackage.h54) r0
            java.lang.Object r0 = r0.I
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.e(java.lang.String, java.lang.String, long, long, long, java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.gj0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.bp5
            if (r0 == 0) goto L13
            r0 = r5
            bp5 r0 = (defpackage.bp5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            bp5 r0 = new bp5
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.I
            int r1 = r0.K
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            defpackage.mu0.V(r5)
            h54 r5 = (defpackage.h54) r5
            java.lang.Object r4 = r5.I
            return r4
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L30:
            defpackage.mu0.V(r5)
            r0.K = r2
            n11 r4 = r4.a
            java.lang.Object r4 = r4.L(r0)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L40
            return r5
        L40:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.f(gj0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(int r14, defpackage.gj0 r15) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.g(int, gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        if (r9 != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(long r9, defpackage.gj0 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.dp5
            if (r0 == 0) goto L14
            r0 = r11
            dp5 r0 = (defpackage.dp5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.K = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            dp5 r0 = new dp5
            r0.<init>(r8, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.I
            int r0 = r6.K
            r7 = 0
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2c
            defpackage.mu0.V(r11)
            h54 r11 = (defpackage.h54) r11
            java.lang.Object r8 = r11.I
            goto L48
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r8)
            return r7
        L32:
            defpackage.mu0.V(r11)
            r6.K = r1
            zy0 r11 = defpackage.n11.Companion
            r4 = 20
            r5 = 1
            n11 r1 = r8.a
            r2 = r9
            java.lang.Object r8 = r1.N(r2, r4, r5, r6)
            el0 r9 = defpackage.el0.I
            if (r8 != r9) goto L48
            return r9
        L48:
            boolean r9 = r8 instanceof defpackage.g54
            if (r9 != 0) goto Lb1
            com.github.mytv.dv.model.FeedResponse r8 = (com.github.mytv.dv.model.FeedResponse) r8
            java.util.List r9 = r8.getData()
            if (r9 == 0) goto L73
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L5d:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L74
            java.lang.Object r11 = r9.next()
            com.github.mytv.dv.model.FeedDataItem r11 = (com.github.mytv.dv.model.FeedDataItem) r11
            com.github.mytv.dv.model.Aweme r11 = r11.getAweme()
            if (r11 == 0) goto L5d
            r10.add(r11)
            goto L5d
        L73:
            r10 = r7
        L74:
            if (r10 == 0) goto L7c
            boolean r9 = r10.isEmpty()
            if (r9 == 0) goto L7d
        L7c:
            r10 = r7
        L7d:
            if (r10 != 0) goto L87
            java.util.List r9 = r8.getAwemeList()
            java.util.List r10 = com.github.mytv.dv.model.DataModelKt.filterPrimaryPlayableAwemes(r9)
        L87:
            long r0 = r8.getCursor()
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r0)
            long r0 = r9.longValue()
            r2 = 0
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 <= 0) goto L9b
            r7 = r9
        L9b:
            if (r7 == 0) goto La2
            long r8 = r7.longValue()
            goto La6
        La2:
            long r8 = r8.getMaxCursor()
        La6:
            uj3 r11 = new uj3
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r8)
            r11.<init>(r10, r0)
            return r11
        Lb1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.j(long, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.gj0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ep5
            if (r0 == 0) goto L13
            r0 = r5
            ep5 r0 = (defpackage.ep5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            ep5 r0 = new ep5
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.I
            int r1 = r0.K
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            defpackage.mu0.V(r5)
            h54 r5 = (defpackage.h54) r5
            java.lang.Object r4 = r5.I
            goto L40
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L30:
            defpackage.mu0.V(r5)
            r0.K = r2
            n11 r4 = r4.a
            java.lang.Object r4 = r4.O(r0)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L40
            return r5
        L40:
            boolean r5 = r4 instanceof defpackage.g54
            if (r5 != 0) goto L56
            com.github.mytv.dv.model.HotSearchResponse r4 = (com.github.mytv.dv.model.HotSearchResponse) r4
            com.github.mytv.dv.model.HotSearchData r4 = r4.getData()
            if (r4 == 0) goto L54
            java.util.List r4 = r4.getWordList()
            if (r4 != 0) goto L53
            goto L54
        L53:
            return r4
        L54:
            o91 r4 = defpackage.o91.I
        L56:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.k(gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(boolean r5, defpackage.gj0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.fp5
            if (r0 == 0) goto L13
            r0 = r6
            fp5 r0 = (defpackage.fp5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            fp5 r0 = new fp5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.I
            int r1 = r0.K
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            defpackage.mu0.V(r6)
            h54 r6 = (defpackage.h54) r6
            java.lang.Object r4 = r6.I
            goto L40
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L30:
            defpackage.mu0.V(r6)
            r0.K = r2
            n11 r4 = r4.a
            java.lang.Object r4 = r4.P(r5, r0)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L40
            return r5
        L40:
            boolean r5 = r4 instanceof defpackage.g54
            if (r5 != 0) goto L6e
            com.github.mytv.dv.model.LiveFeedResponseHome r4 = (com.github.mytv.dv.model.LiveFeedResponseHome) r4
            java.util.List r4 = r4.getData()
            if (r4 == 0) goto L6c
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L55:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L6b
            java.lang.Object r6 = r4.next()
            com.github.mytv.dv.model.LiveFeedDataHome r6 = (com.github.mytv.dv.model.LiveFeedDataHome) r6
            com.github.mytv.dv.model.LiveRoom r6 = r6.getRoom()
            if (r6 == 0) goto L55
            r5.add(r6)
            goto L55
        L6b:
            return r5
        L6c:
            o91 r4 = defpackage.o91.I
        L6e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.l(boolean, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.gj0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.gp5
            if (r0 == 0) goto L13
            r0 = r5
            gp5 r0 = (defpackage.gp5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            gp5 r0 = new gp5
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.I
            int r1 = r0.K
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            defpackage.mu0.V(r5)
            h54 r5 = (defpackage.h54) r5
            java.lang.Object r4 = r5.I
            goto L44
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L30:
            defpackage.mu0.V(r5)
            r0.K = r2
            zy0 r5 = defpackage.n11.Companion
            java.lang.String r5 = "aweme_pc_follow_top"
            n11 r4 = r4.a
            java.lang.Object r4 = r4.Q(r5, r0)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L44
            return r5
        L44:
            boolean r5 = r4 instanceof defpackage.g54
            if (r5 != 0) goto L78
            com.github.mytv.dv.model.LiveFeedResponse r4 = (com.github.mytv.dv.model.LiveFeedResponse) r4
            com.github.mytv.dv.model.LiveFeedData r4 = r4.getData()
            if (r4 == 0) goto L76
            java.util.List r4 = r4.getData()
            if (r4 == 0) goto L76
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L5f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r0 = r4.next()
            com.github.mytv.dv.model.LiveRoomData r0 = (com.github.mytv.dv.model.LiveRoomData) r0
            com.github.mytv.dv.model.LiveRoom r0 = r0.getRoomWithWebRid()
            if (r0 == 0) goto L5f
            r5.add(r0)
            goto L5f
        L75:
            return r5
        L76:
            o91 r4 = defpackage.o91.I
        L78:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.m(gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(int r5, defpackage.gj0 r6, java.lang.String r7) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.hp5
            if (r0 == 0) goto L13
            r0 = r6
            hp5 r0 = (defpackage.hp5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            hp5 r0 = new hp5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.I
            int r1 = r0.K
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            defpackage.mu0.V(r6)
            h54 r6 = (defpackage.h54) r6
            java.lang.Object r4 = r6.I
            goto L44
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L30:
            defpackage.mu0.V(r6)
            r0.K = r2
            zy0 r6 = defpackage.n11.Companion
            java.lang.String r6 = "4"
            n11 r4 = r4.a
            java.lang.Object r4 = r4.R(r5, r0, r7, r6)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L44
            return r5
        L44:
            boolean r5 = r4 instanceof defpackage.g54
            if (r5 != 0) goto L78
            com.github.mytv.dv.model.LiveFeedResponse r4 = (com.github.mytv.dv.model.LiveFeedResponse) r4
            com.github.mytv.dv.model.LiveFeedData r4 = r4.getData()
            if (r4 == 0) goto L76
            java.util.List r4 = r4.getData()
            if (r4 == 0) goto L76
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L5f:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L75
            java.lang.Object r6 = r4.next()
            com.github.mytv.dv.model.LiveRoomData r6 = (com.github.mytv.dv.model.LiveRoomData) r6
            com.github.mytv.dv.model.LiveRoom r6 = r6.getRoomWithWebRid()
            if (r6 == 0) goto L5f
            r5.add(r6)
            goto L5f
        L75:
            return r5
        L76:
            o91 r4 = defpackage.o91.I
        L78:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.n(int, gj0, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.String r5, defpackage.gj0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ip5
            if (r0 == 0) goto L13
            r0 = r6
            ip5 r0 = (defpackage.ip5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            ip5 r0 = new ip5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.I
            int r1 = r0.K
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            defpackage.mu0.V(r6)
            h54 r6 = (defpackage.h54) r6
            java.lang.Object r4 = r6.I
            return r4
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L30:
            defpackage.mu0.V(r6)
            r0.K = r2
            n11 r4 = r4.a
            java.lang.Object r4 = r4.S(r5, r0)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L40
            return r5
        L40:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.o(java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.String r5, defpackage.gj0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.jp5
            if (r0 == 0) goto L13
            r0 = r6
            jp5 r0 = (defpackage.jp5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            jp5 r0 = new jp5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.I
            int r1 = r0.K
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            defpackage.mu0.V(r6)
            h54 r6 = (defpackage.h54) r6
            java.lang.Object r4 = r6.I
            goto L40
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L30:
            defpackage.mu0.V(r6)
            r0.K = r2
            n11 r4 = r4.a
            java.lang.Object r4 = r4.U(r5, r0)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L40
            return r5
        L40:
            boolean r5 = r4 instanceof defpackage.g54
            if (r5 != 0) goto L4a
            com.github.mytv.dv.model.MixDetailResponse r4 = (com.github.mytv.dv.model.MixDetailResponse) r4
            com.github.mytv.dv.model.MixInfo r4 = r4.getMixInfo()
        L4a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.p(java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.String r9, long r10, boolean r12, defpackage.gj0 r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof defpackage.kp5
            if (r0 == 0) goto L14
            r0 = r13
            kp5 r0 = (defpackage.kp5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.K = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            kp5 r0 = new kp5
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r7.I
            int r0 = r7.K
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2b
            defpackage.mu0.V(r13)
            h54 r13 = (defpackage.h54) r13
            java.lang.Object r8 = r13.I
            return r8
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r8)
            r8 = 0
            return r8
        L32:
            defpackage.mu0.V(r13)
            r7.K = r1
            zy0 r13 = defpackage.n11.Companion
            r5 = 20
            n11 r1 = r8.a
            r2 = r9
            r3 = r10
            r6 = r12
            java.lang.Object r8 = r1.T(r2, r3, r5, r6, r7)
            el0 r9 = defpackage.el0.I
            if (r8 != r9) goto L49
            return r9
        L49:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.q(java.lang.String, long, boolean, gj0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.Iterator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(defpackage.gj0 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.lp5
            if (r0 == 0) goto L13
            r0 = r9
            lp5 r0 = (defpackage.lp5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            lp5 r0 = new lp5
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.I
            int r1 = r0.K
            o91 r2 = defpackage.o91.I
            r3 = 0
            r4 = 1
            java.util.ArrayList r5 = r8.g
            if (r1 == 0) goto L35
            if (r1 != r4) goto L2e
            defpackage.mu0.V(r9)
            h54 r9 = (defpackage.h54) r9
            java.lang.Object r9 = r9.I
            goto L58
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r8)
            r8 = 0
            return r8
        L35:
            defpackage.mu0.V(r9)
            int r9 = r8.f
            if (r9 != r4) goto L3e
            r9 = r4
            goto L3f
        L3e:
            r9 = r3
        L3f:
            if (r9 == 0) goto L43
            r1 = r2
            goto L49
        L43:
            r1 = 10
            java.util.List r1 = defpackage.o70.m1(r1, r5)
        L49:
            int r6 = r8.f
            r0.K = r4
            n11 r7 = r8.a
            java.lang.Object r9 = r7.V(r6, r9, r1, r0)
            el0 r0 = defpackage.el0.I
            if (r9 != r0) goto L58
            return r0
        L58:
            boolean r0 = r9 instanceof defpackage.g54
            if (r0 != 0) goto Lcf
            com.github.mytv.dv.model.FeedResponse r9 = (com.github.mytv.dv.model.FeedResponse) r9
            int r0 = r8.f
            int r0 = r0 + r4
            r8.f = r0
            java.util.List r8 = r9.getAwemeList()
            if (r8 != 0) goto L6a
            goto L6b
        L6a:
            r2 = r8
        L6b:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r2.iterator()
        L74:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L95
            java.lang.Object r0 = r9.next()
            r1 = r0
            com.github.mytv.dv.model.Aweme r1 = (com.github.mytv.dv.model.Aweme) r1
            java.lang.String r2 = r1.getAwemeId()
            boolean r2 = defpackage.jx4.L(r2)
            if (r2 != 0) goto L74
            boolean r1 = com.github.mytv.dv.model.DataModelKt.isPrimaryAweme(r1)
            if (r1 == 0) goto L74
            r8.add(r0)
            goto L74
        L95:
            int r9 = r8.size()
        L99:
            if (r3 >= r9) goto Lbc
            java.lang.Object r0 = r8.get(r3)
            int r3 = r3 + 1
            com.github.mytv.dv.model.Aweme r0 = (com.github.mytv.dv.model.Aweme) r0
            java.lang.String r1 = r0.getAwemeId()
            int r1 = r1.length()
            if (r1 <= 0) goto L99
            java.lang.String r1 = r0.getAwemeId()
            r5.remove(r1)
            java.lang.String r0 = r0.getAwemeId()
            r5.add(r0)
            goto L99
        Lbc:
            int r9 = r5.size()
            r0 = 50
            if (r9 <= r0) goto Lce
            java.util.List r9 = defpackage.o70.m1(r0, r5)
            r5.clear()
            r5.addAll(r9)
        Lce:
            return r8
        Lcf:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.r(gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0104 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(int r22, defpackage.gj0 r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.s(int, gj0, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(int r8, defpackage.gj0 r9, java.lang.String r10, java.lang.String r11) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.np5
            if (r0 == 0) goto L14
            r0 = r9
            np5 r0 = (defpackage.np5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.K = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            np5 r0 = new np5
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.I
            int r0 = r6.K
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2b
            defpackage.mu0.V(r9)
            h54 r9 = (defpackage.h54) r9
            java.lang.Object r7 = r9.I
            goto L49
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r7)
            r7 = 0
            return r7
        L32:
            defpackage.mu0.V(r9)
            r6.K = r1
            zy0 r9 = defpackage.n11.Companion
            r3 = 20
            n11 r1 = r7.a
            r5 = r8
            r2 = r10
            r4 = r11
            java.lang.Object r7 = r1.Y(r2, r3, r4, r5, r6)
            el0 r8 = defpackage.el0.I
            if (r7 != r8) goto L49
            return r8
        L49:
            boolean r8 = r7 instanceof defpackage.g54
            if (r8 != 0) goto L67
            com.github.mytv.dv.model.FeedResponse r7 = (com.github.mytv.dv.model.FeedResponse) r7
            java.util.List r8 = r7.getAwemeList()
            java.util.List r8 = com.github.mytv.dv.model.DataModelKt.filterPrimaryPlayableAwemes(r8)
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L66
            java.util.List r7 = r7.getAwemeList()
            java.util.List r7 = com.github.mytv.dv.model.DataModelKt.filterPrimaryAwemes(r7)
            return r7
        L66:
            return r8
        L67:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.t(int, gj0, java.lang.String, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.String r5, defpackage.gj0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.op5
            if (r0 == 0) goto L13
            r0 = r6
            op5 r0 = (defpackage.op5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            op5 r0 = new op5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.I
            int r1 = r0.K
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            defpackage.mu0.V(r6)
            h54 r6 = (defpackage.h54) r6
            java.lang.Object r4 = r6.I
            goto L40
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L30:
            defpackage.mu0.V(r6)
            r0.K = r2
            n11 r4 = r4.a
            java.lang.Object r4 = r4.Z(r5, r0)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L40
            return r5
        L40:
            boolean r5 = r4 instanceof defpackage.g54
            if (r5 != 0) goto L91
            com.github.mytv.dv.model.SearchSugResponse r4 = (com.github.mytv.dv.model.SearchSugResponse) r4
            java.util.List r4 = r4.getSugList()
            if (r4 == 0) goto L8f
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = defpackage.p70.J(r4, r6)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L5b:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L6f
            java.lang.Object r6 = r4.next()
            com.github.mytv.dv.model.SearchSugItem r6 = (com.github.mytv.dv.model.SearchSugItem) r6
            java.lang.String r6 = r6.getContent()
            r5.add(r6)
            goto L5b
        L6f:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r6 = r5.size()
            r0 = 0
        L79:
            if (r0 >= r6) goto L8e
            java.lang.Object r1 = r5.get(r0)
            int r0 = r0 + 1
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = defpackage.jx4.L(r2)
            if (r2 != 0) goto L79
            r4.add(r1)
            goto L79
        L8e:
            return r4
        L8f:
            o91 r4 = defpackage.o91.I
        L91:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.u(java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(defpackage.gj0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.pp5
            if (r0 == 0) goto L13
            r0 = r5
            pp5 r0 = (defpackage.pp5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            pp5 r0 = new pp5
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.I
            int r1 = r0.K
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            defpackage.mu0.V(r5)
            h54 r5 = (defpackage.h54) r5
            java.lang.Object r4 = r5.I
            goto L40
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L30:
            defpackage.mu0.V(r5)
            r0.K = r2
            n11 r4 = r4.a
            java.lang.Object r4 = r4.j0(r0)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L40
            return r5
        L40:
            boolean r5 = r4 instanceof defpackage.g54
            if (r5 != 0) goto L4a
            com.github.mytv.dv.model.UserProfileResponse r4 = (com.github.mytv.dv.model.UserProfileResponse) r4
            com.github.mytv.dv.model.Author r4 = r4.getUser()
        L4a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.v(gj0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(java.lang.String r5, defpackage.gj0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.qp5
            if (r0 == 0) goto L13
            r0 = r6
            qp5 r0 = (defpackage.qp5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            qp5 r0 = new qp5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.I
            int r1 = r0.K
            r2 = 10
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2b
            defpackage.mu0.V(r6)
            h54 r6 = (defpackage.h54) r6
            java.lang.Object r4 = r6.I
            goto L46
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L32:
            defpackage.mu0.V(r6)
            r0.K = r3
            zy0 r6 = defpackage.n11.Companion
            java.lang.String r6 = ""
            n11 r4 = r4.a
            java.lang.Object r4 = r4.a0(r2, r0, r5, r6)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L46
            return r5
        L46:
            boolean r5 = r4 instanceof defpackage.g54
            if (r5 != 0) goto L97
            com.github.mytv.dv.model.SuggestWordsResponse r4 = (com.github.mytv.dv.model.SuggestWordsResponse) r4
            java.util.List r4 = r4.getData()
            o91 r5 = defpackage.o91.I
            if (r4 == 0) goto L96
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        L5d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L95
            java.lang.Object r0 = r4.next()
            com.github.mytv.dv.model.SuggestWordGroup r0 = (com.github.mytv.dv.model.SuggestWordGroup) r0
            java.util.List r0 = r0.getWords()
            if (r0 == 0) goto L90
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = defpackage.p70.J(r0, r2)
            r1.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L7c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L91
            java.lang.Object r3 = r0.next()
            com.github.mytv.dv.model.SuggestWord r3 = (com.github.mytv.dv.model.SuggestWord) r3
            java.lang.String r3 = r3.getWord()
            r1.add(r3)
            goto L7c
        L90:
            r1 = r5
        L91:
            defpackage.u70.I0(r6, r1)
            goto L5d
        L95:
            return r6
        L96:
            return r5
        L97:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.w(java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(long r5, defpackage.gj0 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.rp5
            if (r0 == 0) goto L13
            r0 = r7
            rp5 r0 = (defpackage.rp5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            rp5 r0 = new rp5
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.I
            int r1 = r0.K
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            defpackage.mu0.V(r7)
            h54 r7 = (defpackage.h54) r7
            java.lang.Object r4 = r7.I
            return r4
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L30:
            defpackage.mu0.V(r7)
            r0.K = r2
            zy0 r7 = defpackage.n11.Companion
            r7 = 10
            n11 r4 = r4.a
            java.lang.Object r4 = r4.d0(r5, r7, r0)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L44
            return r5
        L44:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.x(long, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(java.lang.String r8, long r9, defpackage.gj0 r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.sp5
            if (r0 == 0) goto L14
            r0 = r11
            sp5 r0 = (defpackage.sp5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.K = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            sp5 r0 = new sp5
            r0.<init>(r7, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.I
            int r0 = r6.K
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2b
            defpackage.mu0.V(r11)
            h54 r11 = (defpackage.h54) r11
            java.lang.Object r7 = r11.I
            return r7
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r7)
            r7 = 0
            return r7
        L32:
            defpackage.mu0.V(r11)
            r6.K = r1
            zy0 r11 = defpackage.n11.Companion
            r5 = 18
            n11 r1 = r7.a
            r2 = r8
            r3 = r9
            java.lang.Object r7 = r1.e0(r2, r3, r5, r6)
            el0 r8 = defpackage.el0.I
            if (r7 != r8) goto L48
            return r8
        L48:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.y(java.lang.String, long, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(java.lang.String r9, java.lang.String r10, long r11, defpackage.gj0 r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof defpackage.tp5
            if (r0 == 0) goto L14
            r0 = r13
            tp5 r0 = (defpackage.tp5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.K = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            tp5 r0 = new tp5
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r7.I
            int r0 = r7.K
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2b
            defpackage.mu0.V(r13)
            h54 r13 = (defpackage.h54) r13
            java.lang.Object r8 = r13.I
            return r8
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r8)
            r8 = 0
            return r8
        L32:
            defpackage.mu0.V(r13)
            r7.K = r1
            zy0 r13 = defpackage.n11.Companion
            r6 = 20
            n11 r1 = r8.a
            r3 = r9
            r2 = r10
            r4 = r11
            java.lang.Object r8 = r1.f0(r2, r3, r4, r6, r7)
            el0 r9 = defpackage.el0.I
            if (r8 != r9) goto L49
            return r9
        L49:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.z(java.lang.String, java.lang.String, long, gj0):java.lang.Object");
    }
}

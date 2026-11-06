package defpackage;

import com.github.mytv.dv.model.Aweme;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ij1 extends qr5 implements zd1, to3 {
    public final kq5 b;
    public final wm4 c;
    public final fw4 d;
    public final p04 e;
    public final fw4 f;
    public final p04 g;
    public final fw4 h;
    public final p04 i;
    public final fw4 j;
    public final p04 k;
    public long l;
    public final LinkedHashSet m;
    public final fw4 n;
    public final p04 o;
    public final LinkedHashMap p;

    public ij1(kq5 kq5Var, wm4 wm4Var) {
        this.b = kq5Var;
        this.c = wm4Var;
        fw4 c = o7.c(o91.I);
        this.d = c;
        this.e = sv2.j(c);
        fw4 c2 = o7.c(0);
        this.f = c2;
        this.g = sv2.j(c2);
        fw4 c3 = o7.c(Boolean.FALSE);
        this.h = c3;
        this.i = sv2.j(c3);
        fw4 c4 = o7.c(null);
        this.j = c4;
        this.k = sv2.j(c4);
        this.m = new LinkedHashSet();
        fw4 c5 = o7.c(p91.I);
        this.n = c5;
        this.o = sv2.j(c5);
        this.p = new LinkedHashMap();
    }

    @Override // defpackage.zd1
    public final p04 a() {
        return this.i;
    }

    @Override // defpackage.zd1
    public final void b(String str) {
        str.getClass();
        fw4 fw4Var = this.d;
        List list = (List) fw4Var.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!j42.c(((Aweme) obj).getAwemeId(), str)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != list.size()) {
            fw4Var.i(null, arrayList);
            fw4 fw4Var2 = this.n;
            fw4Var2.i(null, sv2.M(str, (Map) fw4Var2.getValue()));
            LinkedHashMap linkedHashMap = this.p;
            v52 v52Var = (v52) linkedHashMap.get(str);
            if (v52Var != null) {
                v52Var.e(null);
            }
            linkedHashMap.remove(str);
        }
    }

    @Override // defpackage.zd1
    public final void d(int i) {
        if (i < ((List) this.d.getValue()).size() - 3 || ((Boolean) this.h.getValue()).booleanValue()) {
            return;
        }
        f();
    }

    @Override // defpackage.zd1
    public final p04 e() {
        return this.e;
    }

    @Override // defpackage.zd1
    public final void f() {
        if (((Boolean) this.h.getValue()).booleanValue()) {
            return;
        }
        p70.g0(o7.B(this), null, null, new hj1(this, null), 3);
    }

    @Override // defpackage.to3
    public final p04 g() {
        return this.o;
    }

    @Override // defpackage.zd1
    public final p04 getError() {
        return this.k;
    }

    @Override // defpackage.to3
    public final Object h(int i, int i2, k05 k05Var) {
        fw4 fw4Var;
        LinkedHashMap linkedHashMap;
        v52 v52Var;
        Object W;
        if (this.b.H()) {
            List list = (List) this.d.getValue();
            if (!list.isEmpty()) {
                int i3 = i + 1;
                int i4 = i3 < 0 ? 0 : i3;
                int i5 = i2 + i4;
                int size = list.size();
                if (i5 > size) {
                    i5 = size;
                }
                String awemeId = ((Aweme) list.get(ut0.r(i3, 0, list.size() - 1))).getAwemeId();
                while (true) {
                    fw4Var = this.n;
                    linkedHashMap = this.p;
                    if (i4 >= i5) {
                        break;
                    }
                    String awemeId2 = ((Aweme) list.get(i4)).getAwemeId();
                    if (!jx4.L(awemeId2) && !((Map) fw4Var.getValue()).containsKey(awemeId2) && !linkedHashMap.containsKey(awemeId2)) {
                        linkedHashMap.put(awemeId2, p70.g0(o7.B(this), null, null, new r((Object) this, (Object) awemeId2, (fj0) null, (byte) 17), 3));
                    }
                    i4++;
                }
                if (!jx4.L(awemeId) && !((Map) fw4Var.getValue()).containsKey(awemeId) && (v52Var = (v52) linkedHashMap.get(awemeId)) != null && (W = v52Var.W(k05Var)) == el0.I) {
                    return W;
                }
            }
        }
        return wd5.a;
    }

    @Override // defpackage.zd1
    public final void i(int i) {
        int X = p70.X((List) this.d.getValue());
        if (X < 0) {
            X = 0;
        }
        this.f.i(null, Integer.valueOf(ut0.r(i, 0, X)));
    }

    @Override // defpackage.zd1
    public final /* bridge */ long j(String str) {
        jp0.d(str);
        return 0L;
    }

    @Override // defpackage.zd1
    public final p04 k() {
        return this.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:11:0x0026, B:12:0x0049, B:14:0x004d, B:16:0x0051, B:18:0x0063, B:20:0x0071, B:23:0x0078, B:24:0x007c, B:26:0x0082, B:31:0x0096, B:33:0x00a7, B:34:0x00b8, B:35:0x00af, B:36:0x00bc, B:43:0x003a), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.String r6, defpackage.gj0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.gj1
            if (r0 == 0) goto L13
            r0 = r7
            gj1 r0 = (defpackage.gj1) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.L = r1
            goto L18
        L13:
            gj1 r0 = new gj1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.J
            int r1 = r0.L
            r2 = 0
            java.util.LinkedHashMap r3 = r5.p
            r4 = 1
            if (r1 == 0) goto L37
            if (r1 != r4) goto L31
            java.lang.String r6 = r0.I
            defpackage.mu0.V(r7)     // Catch: java.lang.Throwable -> L2e
            h54 r7 = (defpackage.h54) r7     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r7 = r7.I     // Catch: java.lang.Throwable -> L2e
            goto L49
        L2e:
            r5 = move-exception
            goto Lc5
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r5)
            return r2
        L37:
            defpackage.mu0.V(r7)
            kq5 r7 = r5.b     // Catch: java.lang.Throwable -> L2e
            r0.I = r6     // Catch: java.lang.Throwable -> L2e
            r0.L = r4     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r7 = r7.E(r6, r0)     // Catch: java.lang.Throwable -> L2e
            el0 r0 = defpackage.el0.I
            if (r7 != r0) goto L49
            return r0
        L49:
            boolean r0 = r7 instanceof defpackage.g54     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto Lbf
            com.github.mytv.dv.model.Aweme r7 = (com.github.mytv.dv.model.Aweme) r7     // Catch: java.lang.Throwable -> L2e
            if (r7 == 0) goto Lbc
            com.github.mytv.dv.model.Video r0 = r7.getVideo()     // Catch: java.lang.Throwable -> L2e
            com.github.mytv.dv.model.PlayAddr r0 = r0.getPlayAddr()     // Catch: java.lang.Throwable -> L2e
            java.util.List r0 = r0.getUrlList()     // Catch: java.lang.Throwable -> L2e
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L96
            com.github.mytv.dv.model.Video r0 = r7.getVideo()     // Catch: java.lang.Throwable -> L2e
            java.util.List r0 = r0.getBitRate()     // Catch: java.lang.Throwable -> L2e
            boolean r1 = defpackage.nt3.r(r0)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L78
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L78
            goto Lbf
        L78:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2e
        L7c:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto Lbf
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2e
            com.github.mytv.dv.model.BitRate r1 = (com.github.mytv.dv.model.BitRate) r1     // Catch: java.lang.Throwable -> L2e
            com.github.mytv.dv.model.PlayAddr r1 = r1.getPlayAddr()     // Catch: java.lang.Throwable -> L2e
            java.util.List r1 = r1.getUrlList()     // Catch: java.lang.Throwable -> L2e
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L7c
        L96:
            fw4 r5 = r5.n     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = r5.getValue()     // Catch: java.lang.Throwable -> L2e
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L2e
            r0.getClass()     // Catch: java.lang.Throwable -> L2e
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto Laf
            java.util.Map r7 = java.util.Collections.singletonMap(r6, r7)     // Catch: java.lang.Throwable -> L2e
            r7.getClass()     // Catch: java.lang.Throwable -> L2e
            goto Lb8
        Laf:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L2e
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2e
            r1.put(r6, r7)     // Catch: java.lang.Throwable -> L2e
            r7 = r1
        Lb8:
            r5.i(r2, r7)     // Catch: java.lang.Throwable -> L2e
            goto Lbf
        Lbc:
            r5.b(r6)     // Catch: java.lang.Throwable -> L2e
        Lbf:
            r3.remove(r6)
            wd5 r5 = defpackage.wd5.a
            return r5
        Lc5:
            r3.remove(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij1.p(java.lang.String, gj0):java.lang.Object");
    }

    @Override // defpackage.zd1
    public final /* bridge */ void c(String str, long j) {
    }
}

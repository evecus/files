package defpackage;

import android.util.Log;
import com.github.mytv.dv.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class yd1 extends qr5 implements zd1, to3 {
    public static final td1 Companion = new td1();
    public final kq5 b;
    public final wm4 c;
    public final boolean d;
    public final fw4 e;
    public final p04 f;
    public final fw4 g;
    public final p04 h;
    public final fw4 i;
    public final p04 j;
    public final fw4 k;
    public final p04 l;
    public final LinkedHashMap m;
    public final fw4 n;
    public final p04 o;
    public final LinkedHashMap p;

    public yd1(kq5 kq5Var, wm4 wm4Var, boolean z) {
        this.b = kq5Var;
        this.c = wm4Var;
        this.d = z;
        fw4 c = o7.c(o91.I);
        this.e = c;
        this.f = sv2.j(c);
        fw4 c2 = o7.c(0);
        this.g = c2;
        this.h = sv2.j(c2);
        fw4 c3 = o7.c(Boolean.FALSE);
        this.i = c3;
        this.j = sv2.j(c3);
        fw4 c4 = o7.c(null);
        this.k = c4;
        this.l = sv2.j(c4);
        this.m = new LinkedHashMap();
        fw4 c5 = o7.c(p91.I);
        this.n = c5;
        this.o = sv2.j(c5);
        this.p = new LinkedHashMap();
    }

    @Override // defpackage.zd1
    public final p04 a() {
        return this.j;
    }

    @Override // defpackage.zd1
    public final void b(String str) {
        str.getClass();
        fw4 fw4Var = this.e;
        List list = (List) fw4Var.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!j42.c(((Aweme) obj).getAwemeId(), str)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != list.size()) {
            this.m.remove(str);
            fw4Var.i(null, arrayList);
            fw4 fw4Var2 = this.n;
            fw4Var2.i(null, sv2.M(str, (Map) fw4Var2.getValue()));
            LinkedHashMap linkedHashMap = this.p;
            v52 v52Var = (v52) linkedHashMap.get(str);
            if (v52Var != null) {
                v52Var.e(null);
            }
            linkedHashMap.remove(str);
            d(((Number) this.g.getValue()).intValue());
        }
    }

    @Override // defpackage.zd1
    public final void c(String str, long j) {
        if (jx4.L(str)) {
            return;
        }
        if (j < 0) {
            j = 0;
        }
        LinkedHashMap linkedHashMap = this.m;
        if (j == 0) {
            linkedHashMap.remove(str);
        } else {
            linkedHashMap.put(str, Long.valueOf(j));
        }
    }

    @Override // defpackage.zd1
    public final void d(int i) {
        if (((List) this.e.getValue()).size() - i > (this.d ? 6 : 3) || ((Boolean) this.i.getValue()).booleanValue()) {
            return;
        }
        f();
    }

    @Override // defpackage.zd1
    public final p04 e() {
        return this.f;
    }

    @Override // defpackage.zd1
    public final void f() {
        if (((Boolean) this.i.getValue()).booleanValue()) {
            return;
        }
        p70.g0(o7.B(this), null, null, new xd1(this, null), 3);
    }

    @Override // defpackage.to3
    public final p04 g() {
        return this.o;
    }

    @Override // defpackage.zd1
    public final p04 getError() {
        return this.l;
    }

    @Override // defpackage.to3
    public final Object h(int i, int i2, k05 k05Var) {
        fw4 fw4Var;
        LinkedHashMap linkedHashMap;
        v52 v52Var;
        Object W;
        boolean H = this.b.H();
        wd5 wd5Var = wd5.a;
        if (!H) {
            Log.d("FeedViewModel", "skip detail 预取: separateVideoFetch=false");
            return wd5Var;
        }
        List list = (List) this.e.getValue();
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
                    linkedHashMap.put(awemeId2, p70.g0(o7.B(this), null, null, new ky(this, awemeId2, null, (byte) 4), 3));
                }
                i4++;
            }
            if (!jx4.L(awemeId) && !((Map) fw4Var.getValue()).containsKey(awemeId) && (v52Var = (v52) linkedHashMap.get(awemeId)) != null && (W = v52Var.W(k05Var)) == el0.I) {
                return W;
            }
        }
        return wd5Var;
    }

    @Override // defpackage.zd1
    public final void i(int i) {
        int X = p70.X((List) this.e.getValue());
        if (X < 0) {
            X = 0;
        }
        this.g.i(null, Integer.valueOf(ut0.r(i, 0, X)));
    }

    @Override // defpackage.zd1
    public final long j(String str) {
        str.getClass();
        Long l = (Long) this.m.get(str);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    @Override // defpackage.zd1
    public final p04 k() {
        return this.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065 A[Catch: all -> 0x003a, TRY_ENTER, TryCatch #0 {all -> 0x003a, blocks: (B:11:0x0032, B:12:0x005b, B:15:0x0065, B:17:0x0087, B:19:0x0099, B:23:0x00a8, B:26:0x00af, B:27:0x00b3, B:29:0x00b9, B:35:0x00cd, B:37:0x00de, B:38:0x00ef, B:39:0x00e6, B:40:0x00f3, B:41:0x0105, B:43:0x010b, B:51:0x004a), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010b A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #0 {all -> 0x003a, blocks: (B:11:0x0032, B:12:0x005b, B:15:0x0065, B:17:0x0087, B:19:0x0099, B:23:0x00a8, B:26:0x00af, B:27:0x00b3, B:29:0x00b9, B:35:0x00cd, B:37:0x00de, B:38:0x00ef, B:39:0x00e6, B:40:0x00f3, B:41:0x0105, B:43:0x010b, B:51:0x004a), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.String r17, defpackage.gj0 r18) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yd1.p(java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.gj0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.vd1
            if (r0 == 0) goto L13
            r0 = r5
            vd1 r0 = (defpackage.vd1) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            vd1 r0 = new vd1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.I
            int r1 = r0.K
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2c
            defpackage.mu0.V(r5)
            h54 r5 = (defpackage.h54) r5
            java.lang.Object r4 = r5.I
            return r4
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L33:
            defpackage.mu0.V(r5)
            h54 r5 = (defpackage.h54) r5
            java.lang.Object r4 = r5.I
            return r4
        L3b:
            defpackage.mu0.V(r5)
            el0 r5 = defpackage.el0.I
            boolean r1 = r4.d
            kq5 r4 = r4.b
            if (r1 == 0) goto L50
            r0.K = r3
            java.lang.Object r4 = r4.r(r0)
            if (r4 != r5) goto L4f
            goto L5a
        L4f:
            return r4
        L50:
            r0.K = r2
            r1 = 15
            java.lang.Object r4 = r4.g(r1, r0)
            if (r4 != r5) goto L5b
        L5a:
            return r5
        L5b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yd1.q(gj0):java.lang.Object");
    }

    public final void r() {
        this.g.i(null, 0);
        if (this.d) {
            kq5 kq5Var = this.b;
            kq5Var.f = 1;
            kq5Var.g.clear();
        }
        this.m.clear();
        this.n.i(null, p91.I);
        LinkedHashMap linkedHashMap = this.p;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((v52) it.next()).e(null);
        }
        linkedHashMap.clear();
        this.e.i(null, o91.I);
        f();
    }
}

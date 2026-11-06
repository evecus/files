package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class dz5 {
    public final ky5 a;
    public final Context b;
    public final String c;
    public final x81 d;
    public final mc3 e;
    public final uf0 f;
    public final yt3 g;
    public final WorkDatabase h;
    public final oy5 i;
    public final ru0 j;
    public final ArrayList k;
    public final String l;
    public final x52 m;

    public dz5(ie2 ie2Var) {
        ky5 ky5Var = (ky5) ie2Var.f;
        this.a = ky5Var;
        this.b = (Context) ie2Var.g;
        String str = ky5Var.a;
        this.c = str;
        this.d = (x81) ie2Var.h;
        this.e = (mc3) ie2Var.c;
        this.f = (uf0) ie2Var.b;
        this.g = (yt3) ie2Var.d;
        WorkDatabase workDatabase = (WorkDatabase) ie2Var.e;
        this.h = workDatabase;
        this.i = workDatabase.w();
        this.j = workDatabase.r();
        ArrayList arrayList = ie2Var.a;
        this.k = arrayList;
        this.l = hf1.z(r7.E("Work [ id=", str, ", tags={ "), o70.Z0(arrayList, ",", null, null, 0, null, 62), " } ]");
        this.m = vt0.b();
    }

    public final void a(int i) {
        oy5 oy5Var = this.i;
        sx5 sx5Var = sx5.I;
        String str = this.c;
        oy5Var.j(sx5Var, str);
        oy5Var.i(str, System.currentTimeMillis());
        oy5Var.h(this.a.v, str);
        oy5Var.g(str, -1L);
        oy5Var.k(str, i);
    }

    public final void b() {
        long currentTimeMillis = System.currentTimeMillis();
        oy5 oy5Var = this.i;
        String str = this.c;
        oy5Var.i(str, currentTimeMillis);
        oy5Var.j(sx5.I, str);
        a74 a74Var = oy5Var.a;
        ((Number) g4.V(a74Var, false, true, new pu0(str, (byte) 16))).intValue();
        oy5Var.h(this.a.v, str);
        g4.V(a74Var, false, true, new pu0(str, (byte) 17));
        oy5Var.g(str, -1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.gj0 r20) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz5.c(gj0):java.lang.Object");
    }

    public final void d(nl2 nl2Var) {
        String str = this.c;
        ArrayList n0 = p70.n0(str);
        while (true) {
            boolean isEmpty = n0.isEmpty();
            oy5 oy5Var = this.i;
            if (isEmpty) {
                dp0 dp0Var = ((kl2) nl2Var).a;
                dp0Var.getClass();
                oy5Var.h(this.a.v, str);
                g4.V(oy5Var.a, false, true, new ap3((Object) dp0Var, (Object) str, (byte) 24));
                return;
            }
            String str2 = (String) u70.L0(n0);
            if (oy5Var.d(str2) != sx5.N) {
                oy5Var.j(sx5.L, str2);
            }
            n0.addAll(this.j.a(str2));
        }
    }
}

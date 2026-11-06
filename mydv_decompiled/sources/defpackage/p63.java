package defpackage;

import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class p63 implements vi2, wr5, ws1, w94 {
    public final yc I;
    public i73 J;
    public final Bundle K;
    public ki2 L;
    public final b73 M;
    public final String N;
    public final Bundle O;
    public final r63 P = new r63(this);

    public p63(yc ycVar, i73 i73Var, Bundle bundle, ki2 ki2Var, b73 b73Var, String str, Bundle bundle2) {
        this.I = ycVar;
        this.J = i73Var;
        this.K = bundle;
        this.L = ki2Var;
        this.M = b73Var;
        this.N = str;
        this.O = bundle2;
        new u05(new eq(this, (byte) 17));
    }

    public final void a(ki2 ki2Var) {
        r63 r63Var = this.P;
        r63Var.getClass();
        r63Var.k = ki2Var;
        r63Var.b();
    }

    @Override // defpackage.ws1
    public final ur5 c() {
        return this.P.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    @Override // defpackage.ws1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.l33 d() {
        /*
            r5 = this;
            r63 r0 = r5.P
            r0.getClass()
            l33 r1 = new l33
            r1.<init>()
            o63 r2 = defpackage.qb.l
            p63 r3 = r0.a
            java.util.LinkedHashMap r4 = r1.a
            r4.put(r2, r3)
            o63 r2 = defpackage.qb.m
            r4.put(r2, r3)
            android.os.Bundle r0 = r0.a()
            if (r0 == 0) goto L23
            o63 r2 = defpackage.qb.n
            r4.put(r2, r0)
        L23:
            r0 = 0
            yc r5 = r5.I
            if (r5 == 0) goto L39
            android.content.Context r5 = r5.a
            if (r5 == 0) goto L31
            android.content.Context r5 = r5.getApplicationContext()
            goto L32
        L31:
            r5 = r0
        L32:
            boolean r2 = r5 instanceof android.app.Application
            if (r2 == 0) goto L39
            android.app.Application r5 = (android.app.Application) r5
            goto L3a
        L39:
            r5 = r0
        L3a:
            if (r5 == 0) goto L3d
            r0 = r5
        L3d:
            if (r0 == 0) goto L44
            o63 r5 = defpackage.tr5.e
            r4.put(r5, r0)
        L44:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p63.d():l33");
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (obj != null && (obj instanceof p63)) {
            p63 p63Var = (p63) obj;
            Bundle bundle = p63Var.K;
            if (!this.N.equals(p63Var.N) || !j42.c(this.J, p63Var.J) || this.P.j != p63Var.P.j || g() != p63Var.g()) {
                return false;
            }
            Bundle bundle2 = this.K;
            if (j42.c(bundle2, bundle)) {
                return true;
            }
            if (bundle2 != null && (keySet = bundle2.keySet()) != null) {
                Set<String> set = keySet;
                if ((set instanceof Collection) && set.isEmpty()) {
                    return true;
                }
                for (String str : set) {
                    if (!j42.c(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wr5
    public final vr5 f() {
        r63 r63Var = this.P;
        if (!r63Var.i) {
            zy.i("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        }
        if (r63Var.j.i == ki2.I) {
            zy.i("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        b73 b73Var = r63Var.e;
        if (b73Var == null) {
            zy.i("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            return null;
        }
        String str = r63Var.f;
        LinkedHashMap linkedHashMap = b73Var.b;
        vr5 vr5Var = (vr5) linkedHashMap.get(str);
        if (vr5Var != null) {
            return vr5Var;
        }
        vr5 vr5Var2 = new vr5();
        linkedHashMap.put(str, vr5Var2);
        return vr5Var2;
    }

    @Override // defpackage.w94
    public final da g() {
        return (da) this.P.h.K;
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = this.J.hashCode() + (this.N.hashCode() * 31);
        Bundle bundle = this.K;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                hashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return g().hashCode() + ((this.P.j.hashCode() + (hashCode * 31)) * 31);
    }

    @Override // defpackage.vi2
    public final li2 k() {
        return this.P.j;
    }

    public final String toString() {
        return this.P.toString();
    }
}

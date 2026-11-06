package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class o72 {
    public final c8 a;
    public final boolean b;
    public int c;

    public o72(n62 n62Var, c8 c8Var) {
        this.a = c8Var;
        this.b = n62Var.c;
    }

    public final b a() {
        b cVar;
        c8 c8Var = this.a;
        byte E = c8Var.E();
        if (E == 1) {
            return d(true);
        }
        if (E == 0) {
            return d(false);
        }
        if (E != 6) {
            if (E == 8) {
                return b();
            }
            c8.s(c8Var, "Cannot read Json element because of unexpected ".concat(mw2.X(E)), 0, null, 6);
            throw null;
        }
        int i = this.c + 1;
        this.c = i;
        if (i == 200) {
            cVar = (b) qg5.Z(new uu2(new m72(this, null)));
        } else {
            byte h = c8Var.h((byte) 6);
            if (c8Var.E() == 4) {
                c8.s(c8Var, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!c8Var.c()) {
                    break;
                }
                String m = this.b ? c8Var.m() : c8Var.l();
                c8Var.h((byte) 5);
                linkedHashMap.put(m, a());
                h = c8Var.g();
                if (h != 4) {
                    if (h != 7) {
                        c8.s(c8Var, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (h == 6) {
                c8Var.h((byte) 7);
            } else if (h == 4) {
                mu0.H(c8Var, "object");
                throw null;
            }
            cVar = new c(linkedHashMap);
        }
        this.c--;
        return cVar;
    }

    public final a b() {
        c8 c8Var = this.a;
        byte g = c8Var.g();
        if (c8Var.E() == 4) {
            c8.s(c8Var, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (c8Var.c()) {
            arrayList.add(a());
            g = c8Var.g();
            if (g != 4) {
                boolean z = g == 9;
                int i = c8Var.b;
                if (!z) {
                    c8.s(c8Var, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (g == 8) {
            c8Var.h((byte) 9);
        } else if (g == 4) {
            mu0.H(c8Var, "array");
            throw null;
        }
        return new a(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.xp0 r11, defpackage.fu r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.n72
            if (r0 == 0) goto L13
            r0 = r12
            n72 r0 = (defpackage.n72) r0
            int r1 = r0.P
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.P = r1
            goto L18
        L13:
            n72 r0 = new n72
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.N
            int r1 = r0.P
            r2 = 0
            r3 = 6
            r4 = 0
            r5 = 7
            r6 = 4
            r7 = 1
            if (r1 == 0) goto L54
            if (r1 != r7) goto L4e
            int r10 = r0.M
            java.lang.String r11 = r0.L
            java.util.LinkedHashMap r1 = r0.K
            o72 r8 = r0.J
            xp0 r9 = r0.I
            defpackage.mu0.V(r12)
            kotlinx.serialization.json.b r12 = (kotlinx.serialization.json.b) r12
            r1.put(r11, r12)
            c8 r11 = r8.a
            byte r11 = r11.g()
            if (r11 == r6) goto L4b
            if (r11 != r5) goto L43
            goto L97
        L43:
            c8 r10 = r8.a
            java.lang.String r11 = "Expected end of the object or comma"
            defpackage.c8.s(r10, r11, r4, r2, r3)
            throw r2
        L4b:
            r4 = r10
            r10 = r8
            goto L6b
        L4e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r10)
            return r2
        L54:
            defpackage.mu0.V(r12)
            c8 r12 = r10.a
            byte r1 = r12.h(r3)
            byte r8 = r12.E()
            if (r8 == r6) goto Lad
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
            r9 = r11
            r11 = r1
            r1 = r12
        L6b:
            c8 r12 = r10.a
            boolean r8 = r12.c()
            if (r8 == 0) goto L96
            boolean r11 = r10.b
            if (r11 == 0) goto L7c
            java.lang.String r11 = r12.m()
            goto L80
        L7c:
            java.lang.String r11 = r12.l()
        L80:
            r2 = 5
            r12.h(r2)
            r0.I = r9
            r0.J = r10
            r0.K = r1
            r0.L = r11
            r0.M = r4
            r0.P = r7
            r9.b(r0)
            el0 r10 = defpackage.el0.I
            return r10
        L96:
            r8 = r10
        L97:
            c8 r10 = r8.a
            if (r11 != r3) goto L9f
            r10.h(r5)
            goto La1
        L9f:
            if (r11 == r6) goto La7
        La1:
            kotlinx.serialization.json.c r10 = new kotlinx.serialization.json.c
            r10.<init>(r1)
            return r10
        La7:
            java.lang.String r11 = "object"
            defpackage.mu0.H(r10, r11)
            throw r2
        Lad:
            java.lang.String r10 = "Unexpected leading comma"
            defpackage.c8.s(r12, r10, r4, r2, r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o72.c(xp0, fu):java.lang.Object");
    }

    public final d d(boolean z) {
        boolean z2 = this.b;
        c8 c8Var = this.a;
        String m = (z2 || !z) ? c8Var.m() : c8Var.l();
        return (z || !j42.c(m, "null")) ? new a72(m, z) : JsonNull.INSTANCE;
    }
}

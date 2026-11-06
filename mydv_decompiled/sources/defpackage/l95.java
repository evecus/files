package defpackage;

import androidx.glance.appwidget.UnmanagedSessionReceiver;
import java.util.Enumeration;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class l95 implements sk0, zh5 {
    public static l95 I;

    public l95(byte[] bArr) {
        k0 k0Var = new k0(bArr);
        u0 n = k0Var.n();
        if (n == null) {
            zl1.g("no certificate found in trusted certificate block");
            throw null;
        }
        new vz5(n.l());
        u0 n2 = k0Var.n();
        if (n2 != null) {
            Enumeration z = x0.x(n2.l()).z();
            while (z.hasMoreElements()) {
                e0 e0Var = (e0) z.nextElement();
                if (e0Var instanceof x0) {
                    x0.x(e0Var);
                } else if (e0Var instanceof ct) {
                    ct ctVar = (ct) e0Var;
                    wx5.f(ctVar);
                    y yVar = x0.J;
                    u0 v = ctVar.v(false, yVar);
                    yVar.c(v);
                } else if (e0Var instanceof sn0) {
                    ((sn0) e0Var).e();
                }
            }
        }
    }

    public static void b(q84 q84Var, Object obj) {
        int i;
        ky5 ky5Var = (ky5) obj;
        q84Var.getClass();
        String str = ky5Var.a;
        int i2 = 1;
        q84Var.v(1, str);
        q84Var.b(2, ry5.k(ky5Var.b));
        q84Var.v(3, ky5Var.c);
        q84Var.v(4, ky5Var.d);
        dp0 dp0Var = dp0.b;
        q84Var.c(5, c5.j0(ky5Var.e));
        q84Var.c(6, c5.j0(ky5Var.f));
        q84Var.b(7, ky5Var.g);
        q84Var.b(8, ky5Var.h);
        q84Var.b(9, ky5Var.i);
        q84Var.b(10, ky5Var.k);
        ut utVar = ky5Var.l;
        utVar.getClass();
        int ordinal = utVar.ordinal();
        if (ordinal == 0) {
            i = 0;
        } else {
            if (ordinal != 1) {
                s83.v();
                return;
            }
            i = 1;
        }
        q84Var.b(11, i);
        q84Var.b(12, ky5Var.m);
        q84Var.b(13, ky5Var.n);
        q84Var.b(14, ky5Var.o);
        q84Var.b(15, ky5Var.p);
        q84Var.b(16, ky5Var.q ? 1L : 0L);
        ug3 ug3Var = ky5Var.r;
        ug3Var.getClass();
        int ordinal2 = ug3Var.ordinal();
        if (ordinal2 == 0) {
            i2 = 0;
        } else if (ordinal2 != 1) {
            s83.v();
            return;
        }
        q84Var.b(17, i2);
        q84Var.b(18, ky5Var.s);
        q84Var.b(19, ky5Var.t);
        q84Var.b(20, ky5Var.u);
        q84Var.b(21, ky5Var.v);
        q84Var.b(22, ky5Var.w);
        String str2 = ky5Var.x;
        if (str2 == null) {
            q84Var.d(23);
        } else {
            q84Var.v(23, str2);
        }
        Boolean bool = ky5Var.y;
        if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
            q84Var.d(24);
        } else {
            q84Var.b(24, r1.intValue());
        }
        ch0 ch0Var = ky5Var.j;
        q84Var.b(25, ry5.h(ch0Var.a));
        q84Var.c(26, ry5.c(ch0Var.b));
        q84Var.b(27, ch0Var.c ? 1L : 0L);
        q84Var.b(28, ch0Var.d ? 1L : 0L);
        q84Var.b(29, ch0Var.e ? 1L : 0L);
        q84Var.b(30, ch0Var.f ? 1L : 0L);
        q84Var.b(31, ch0Var.g);
        q84Var.b(32, ch0Var.h);
        q84Var.c(33, ry5.j(ch0Var.i));
        q84Var.v(34, str);
    }

    public static void c(int i) {
        synchronized (UnmanagedSessionReceiver.a) {
            if (UnmanagedSessionReceiver.b.get(Integer.valueOf(i)) != null) {
                throw new ClassCastException();
            }
        }
    }

    @Override // defpackage.xh5
    public boolean a() {
        return false;
    }

    public boolean e(CharSequence charSequence) {
        return false;
    }

    @Override // defpackage.zh5
    public int f() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(android.content.Context r5, java.lang.String r6, defpackage.gj0 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.xx5
            if (r0 == 0) goto L13
            r0 = r7
            xx5 r0 = (defpackage.xx5) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            xx5 r0 = new xx5
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r4 = r0.I
            int r7 = r0.K
            r1 = 1
            if (r7 == 0) goto L2c
            if (r7 != r1) goto L25
            defpackage.mu0.V(r4)
            goto L6d
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.mu0.V(r4)
            r5.getClass()
            ux5 r4 = defpackage.ux5.e(r5)
            r4.getClass()
            androidx.work.impl.WorkDatabase r5 = r4.c
            c25 r4 = r4.d
            r5.getClass()
            r4.getClass()
            r6.getClass()
            pu0 r7 = new pu0
            r2 = 6
            r7.<init>(r6, r2)
            mc3 r4 = (defpackage.mc3) r4
            java.lang.Object r4 = r4.a
            vj4 r4 = (defpackage.vj4) r4
            r4.getClass()
            jt2 r6 = new jt2
            r2 = 27
            r6.<init>(r7, r5, r2)
            java.lang.String r5 = "loadStatusFuture"
            y00 r4 = defpackage.il2.x(r4, r5, r6)
            r0.K = r1
            java.lang.Object r4 = defpackage.jl2.l(r4, r0)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L6d
            return r5
        L6d:
            java.util.List r4 = (java.util.List) r4
            int r5 = r4.size()
            r6 = 0
            r7 = r6
        L75:
            if (r7 >= r5) goto L98
            java.lang.Object r0 = r4.get(r7)
            tx5 r0 = (defpackage.tx5) r0
            r2 = 2
            sx5[] r2 = new defpackage.sx5[r2]
            sx5 r3 = defpackage.sx5.J
            r2[r6] = r3
            sx5 r3 = defpackage.sx5.I
            r2[r1] = r3
            java.util.List r2 = defpackage.p70.k0(r2)
            sx5 r0 = r0.b
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L95
            goto L99
        L95:
            int r7 = r7 + 1
            goto L75
        L98:
            r1 = r6
        L99:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l95.g(android.content.Context, java.lang.String, gj0):java.lang.Object");
    }

    @Override // defpackage.zh5
    public int h() {
        return 0;
    }

    @Override // defpackage.xh5
    public hj i(long j, hj hjVar, hj hjVar2, hj hjVar3) {
        return j < 0 ? hjVar : hjVar2;
    }

    @Override // defpackage.xh5
    public long k(hj hjVar, hj hjVar2, hj hjVar3) {
        return 0L;
    }

    @Override // defpackage.xh5
    public hj j(hj hjVar, hj hjVar2, hj hjVar3) {
        return hjVar3;
    }

    @Override // defpackage.xh5
    public hj d(long j, hj hjVar, hj hjVar2, hj hjVar3) {
        return hjVar3;
    }
}

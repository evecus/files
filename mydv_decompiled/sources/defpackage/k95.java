package defpackage;

import androidx.media3.common.util.Log;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class k95 extends wa3 {
    public final iz f;
    public rv4 g;

    public k95(oc4 oc4Var, cc4 cc4Var, iu0 iu0Var) {
        super(oc4Var, cc4Var, iu0Var);
        this.f = qb.g(Log.LOG_LEVEL_OFF, 6, null);
    }

    public static i95 h(iz izVar) {
        i95 i95Var = null;
        pj4 n = oh4.n(new d(new k23(izVar, (byte) 1), null));
        while (n.hasNext()) {
            i95 i95Var2 = (i95) n.next();
            if (i95Var != null) {
                i95Var2 = i95Var.a(i95Var2);
            }
            i95Var = i95Var2;
        }
        return i95Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d9, code lost:
    
        if (r18.b.invoke(r4, r3) != r9) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00db, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b2, code lost:
    
        if (c(r1, r3) == r9) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.oc4 r19, defpackage.i95 r20, defpackage.gj0 r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            boolean r3 = r2 instanceof defpackage.j95
            if (r3 == 0) goto L19
            r3 = r2
            j95 r3 = (defpackage.j95) r3
            int r4 = r3.K
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.K = r4
            goto L1e
        L19:
            j95 r3 = new j95
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.I
            int r4 = r3.K
            r5 = 0
            g12 r6 = r0.e
            r7 = 2
            r8 = 1
            el0 r9 = defpackage.el0.I
            if (r4 == 0) goto L3f
            if (r4 == r8) goto L3a
            if (r4 != r7) goto L34
            defpackage.mu0.V(r2)
            goto Ldc
        L34:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r0)
            return r5
        L3a:
            defpackage.mu0.V(r2)
            goto Lb5
        L3f:
            defpackage.mu0.V(r2)
            r24 r2 = new r24
            r2.<init>()
            r2.I = r1
            long r10 = r1.b
            long r12 = r1.a
            java.lang.Object r1 = r6.J
            li5 r1 = (defpackage.li5) r1
            r4 = 32
            long r14 = r12 >> r4
            int r14 = (int) r14
            float r14 = java.lang.Float.intBitsToFloat(r14)
            r1.a(r10, r14)
            java.lang.Object r1 = r6.K
            li5 r1 = (defpackage.li5) r1
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r12 = r12 & r14
            int r12 = (int) r12
            float r12 = java.lang.Float.intBitsToFloat(r12)
            r1.a(r10, r12)
            iz r1 = r0.f
            i95 r1 = h(r1)
            if (r1 == 0) goto La5
            long r10 = r1.b
            long r12 = r1.a
            r20 = r4
            java.lang.Object r4 = r6.J
            li5 r4 = (defpackage.li5) r4
            r16 = r14
            long r14 = r12 >> r20
            int r14 = (int) r14
            float r14 = java.lang.Float.intBitsToFloat(r14)
            r4.a(r10, r14)
            java.lang.Object r4 = r6.K
            li5 r4 = (defpackage.li5) r4
            long r12 = r12 & r16
            int r12 = (int) r12
            float r12 = java.lang.Float.intBitsToFloat(r12)
            r4.a(r10, r12)
            java.lang.Object r4 = r2.I
            i95 r4 = (defpackage.i95) r4
            i95 r1 = r4.a(r1)
            r2.I = r1
        La5:
            ld r1 = new ld
            r4 = r19
            r1.<init>(r0, r4, r2, r5)
            r3.K = r8
            java.lang.Object r1 = r0.c(r1, r3)
            if (r1 != r9) goto Lb5
            goto Ldb
        Lb5:
            java.lang.Object r1 = r6.J
            li5 r1 = (defpackage.li5) r1
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            float r1 = r1.c(r2)
            java.lang.Object r4 = r6.K
            li5 r4 = (defpackage.li5) r4
            float r2 = r4.c(r2)
            long r1 = defpackage.eg5.e(r1, r2)
            ji5 r4 = new ji5
            r4.<init>(r1)
            r3.K = r7
            hn1 r0 = r0.b
            java.lang.Object r0 = r0.invoke(r4, r3)
            if (r0 != r9) goto Ldc
        Ldb:
            return r9
        Ldc:
            wd5 r0 = defpackage.wd5.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k95.d(oc4, i95, gj0):java.lang.Object");
    }

    public final boolean e(kp3 kp3Var) {
        boolean z;
        boolean z2;
        boolean z3;
        iz izVar;
        oc4 oc4Var;
        rp3 rp3Var = (rp3) o70.U0(kp3Var.a);
        if (rp3Var != null) {
            List c = rp3Var.c();
            int size = c.size();
            int i = 0;
            z3 = false;
            while (true) {
                izVar = this.f;
                oc4Var = this.a;
                if (i >= size) {
                    break;
                }
                gt1 gt1Var = (gt1) c.get(i);
                long j = gt1Var.d ^ (-9223372034707292160L);
                if (!(oc4Var.j(oc4Var.f(j)) == 0.0f)) {
                    z3 = !(izVar.d(new i95(j, gt1Var.a, false)) instanceof z40) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = rp3Var.l ^ (-9223372034707292160L);
            boolean z4 = kp3Var.f == 12;
            if (!(oc4Var.j(oc4Var.f(j2)) == 0.0f) || z4) {
                if (!(izVar.d(new i95(j2, rp3Var.b, z4)) instanceof z40) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || this.d) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }

    public final void f(kp3 kp3Var, lp3 lp3Var, long j) {
        int i = kp3Var.f;
        if (i == 10 || i == 11 || i == 12) {
            List list = kp3Var.a;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((rp3) list.get(i2)).l()) {
                    return;
                }
            }
            if (lp3Var == lp3.I && this.d) {
                e(kp3Var);
                wa3.a(kp3Var);
            }
            if (lp3Var == lp3.J && !this.d && e(kp3Var)) {
                wa3.a(kp3Var);
            }
        }
    }

    public final void g(dl0 dl0Var) {
        if (this.g == null) {
            this.g = p70.g0(dl0Var, null, null, new f31((Object) this, (fj0) null, (byte) 4), 3);
        }
    }
}

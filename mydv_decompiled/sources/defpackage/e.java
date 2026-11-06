package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class e extends f54 implements hn1 {
    public pp J;
    public Iterator K;
    public boolean L;
    public /* synthetic */ Object M;
    public final /* synthetic */ ok3 N;
    public final /* synthetic */ ke1 O;
    public final /* synthetic */ boolean P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ok3 ok3Var, ke1 ke1Var, boolean z, fj0 fj0Var) {
        super(2, fj0Var);
        this.N = ok3Var;
        this.O = ke1Var;
        this.P = z;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        e eVar = new e(this.N, this.O, this.P, fj0Var);
        eVar.M = obj;
        return eVar;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((pj4) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0042  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x005b -> B:5:0x005e). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            boolean r0 = r9.L
            ke1 r2 = r9.O
            r8 = 1
            if (r0 == 0) goto L20
            if (r0 != r8) goto L19
            java.util.Iterator r0 = r9.K
            pp r1 = r9.J
            java.lang.Object r3 = r9.M
            pj4 r3 = (defpackage.pj4) r3
            defpackage.mu0.V(r10)
            r7 = r3
            r3 = r1
            r1 = r7
            r7 = r9
            goto L5e
        L19:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r9)
            r9 = 0
            return r9
        L20:
            defpackage.mu0.V(r10)
            java.lang.Object r10 = r9.M
            pj4 r10 = (defpackage.pj4) r10
            pp r0 = new pp
            r0.<init>()
            ok3 r1 = r9.N
            r0.addLast(r1)
            java.util.List r1 = r2.list(r1)
            java.util.Iterator r1 = r1.iterator()
            r3 = r0
            r0 = r1
            r1 = r10
        L3c:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L60
            java.lang.Object r10 = r0.next()
            r4 = r10
            ok3 r4 = (defpackage.ok3) r4
            r9.M = r1
            r9.J = r3
            r9.K = r0
            r9.L = r8
            boolean r5 = r9.P
            r6 = 0
            r7 = r9
            java.lang.Object r9 = defpackage.qb.x(r1, r2, r3, r4, r5, r6, r7)
            el0 r10 = defpackage.el0.I
            if (r9 != r10) goto L5e
            return r10
        L5e:
            r9 = r7
            goto L3c
        L60:
            wd5 r9 = defpackage.wd5.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

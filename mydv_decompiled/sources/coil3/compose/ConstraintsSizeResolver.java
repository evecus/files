package coil3.compose;

import coil3.compose.internal.UtilsKt;
import coil3.size.SizeResolver;
import defpackage.a42;
import defpackage.an3;
import defpackage.b2;
import defpackage.b42;
import defpackage.bn3;
import defpackage.dh0;
import defpackage.fj0;
import defpackage.hf1;
import defpackage.hn1;
import defpackage.i82;
import defpackage.l13;
import defpackage.la2;
import defpackage.p91;
import defpackage.pw2;
import defpackage.tm1;
import defpackage.vw2;
import defpackage.wd5;
import defpackage.ww2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ConstraintsSizeResolver implements SizeResolver, la2 {
    public static final int $stable = 0;
    private long latestConstraints = UtilsKt.getZeroConstraints();
    private List<fj0> continuations = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 measure_3p2s80s$lambda$0(bn3 bn3Var, an3 an3Var) {
        an3.g(an3Var, bn3Var, 0, 0);
        return wd5.a;
    }

    @Override // defpackage.l13
    public /* bridge */ /* synthetic */ boolean all(tm1 tm1Var) {
        return hf1.a(this, tm1Var);
    }

    public boolean any(tm1 tm1Var) {
        return ((Boolean) tm1Var.invoke(this)).booleanValue();
    }

    @Override // defpackage.l13
    public Object foldIn(Object obj, hn1 hn1Var) {
        return hn1Var.invoke(obj, this);
    }

    public Object foldOut(Object obj, hn1 hn1Var) {
        return hn1Var.invoke(this, obj);
    }

    @Override // defpackage.la2
    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return i82.h(this, b42Var, a42Var, i);
    }

    @Override // defpackage.la2
    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return i82.k(this, b42Var, a42Var, i);
    }

    @Override // defpackage.la2
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public vw2 mo48measure3p2s80s(ww2 ww2Var, pw2 pw2Var, long j) {
        m49setConstraintsBRTryo0(j);
        bn3 u = pw2Var.u(j);
        return ww2Var.A(u.I, u.J, p91.I, new b2(u, (byte) 1));
    }

    @Override // defpackage.la2
    public /* bridge */ /* synthetic */ int minIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return i82.n(this, b42Var, a42Var, i);
    }

    @Override // defpackage.la2
    public /* bridge */ /* synthetic */ int minIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return i82.q(this, b42Var, a42Var, i);
    }

    /* renamed from: setConstraints-BRTryo0, reason: not valid java name */
    public final void m49setConstraintsBRTryo0(long j) {
        this.latestConstraints = j;
        if (dh0.k(j)) {
            return;
        }
        List<fj0> list = this.continuations;
        if (list.isEmpty()) {
            return;
        }
        this.continuations = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((fj0) it.next()).resumeWith(wd5.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // coil3.size.SizeResolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object size(defpackage.fj0 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof coil3.compose.ConstraintsSizeResolver$size$1
            if (r0 == 0) goto L13
            r0 = r7
            coil3.compose.ConstraintsSizeResolver$size$1 r0 = (coil3.compose.ConstraintsSizeResolver$size$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil3.compose.ConstraintsSizeResolver$size$1 r0 = new coil3.compose.ConstraintsSizeResolver$size$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            java.lang.Object r0 = r0.L$0
            r24 r0 = (defpackage.r24) r0
            defpackage.mu0.V(r7)     // Catch: java.lang.Throwable -> L29
            goto L65
        L29:
            r7 = move-exception
            goto L75
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r6)
            r6 = 0
            return r6
        L32:
            defpackage.mu0.V(r7)
            long r3 = r6.latestConstraints
            boolean r7 = defpackage.dh0.k(r3)
            if (r7 == 0) goto L81
            r24 r7 = new r24
            r7.<init>()
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L71
            r0.label = r2     // Catch: java.lang.Throwable -> L71
            k10 r1 = new k10     // Catch: java.lang.Throwable -> L71
            fj0 r0 = defpackage.mu0.G(r0)     // Catch: java.lang.Throwable -> L71
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L71
            r1.t()     // Catch: java.lang.Throwable -> L71
            r7.I = r1     // Catch: java.lang.Throwable -> L71
            java.util.List r0 = access$getContinuations$p(r6)     // Catch: java.lang.Throwable -> L71
            r0.add(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r1.r()     // Catch: java.lang.Throwable -> L71
            el0 r1 = defpackage.el0.I
            if (r0 != r1) goto L64
            return r1
        L64:
            r0 = r7
        L65:
            java.util.List<fj0> r7 = r6.continuations
            java.lang.Object r0 = r0.I
            java.util.Collection r7 = defpackage.p70.v(r7)
            r7.remove(r0)
            goto L81
        L71:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L75:
            java.util.List<fj0> r6 = r6.continuations
            java.lang.Object r0 = r0.I
            java.util.Collection r6 = defpackage.p70.v(r6)
            r6.remove(r0)
            throw r7
        L81:
            long r6 = r6.latestConstraints
            coil3.size.Size r6 = coil3.compose.internal.UtilsKt.m73toSizeBRTryo0(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.compose.ConstraintsSizeResolver.size(fj0):java.lang.Object");
    }

    @Override // defpackage.l13
    public /* bridge */ /* synthetic */ l13 then(l13 l13Var) {
        return hf1.e(this, l13Var);
    }
}

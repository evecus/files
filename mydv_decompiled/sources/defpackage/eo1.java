package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class eo1 extends re0 {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final jf0 d;
    public HashSet e;
    public final o43 f;
    public final jk3 g;
    public final /* synthetic */ go1 h;

    public eo1(go1 go1Var, long j, boolean z, boolean z2, jf0 jf0Var) {
        this.h = go1Var;
        this.a = j;
        this.b = z;
        this.c = z2;
        this.d = jf0Var;
        o43 o43Var = ka4.a;
        this.f = new o43();
        this.g = new jk3(zl3.L, q8.y0);
    }

    public final void a() {
        o43 o43Var = this.f;
        if (o43Var.c()) {
            HashSet hashSet = this.e;
            if (hashSet != null) {
                Object[] objArr = o43Var.b;
                long[] jArr = o43Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    go1 go1Var = (go1) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(go1Var.z());
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            o43Var.e();
        }
    }

    @Override // defpackage.re0
    public final void composeInitial$runtime(oj0 oj0Var, hn1 hn1Var) {
        this.h.b.composeInitial$runtime(oj0Var, hn1Var);
    }

    @Override // defpackage.re0
    public final ja4 composeInitialPaused$runtime(oj0 oj0Var, wn4 wn4Var, hn1 hn1Var) {
        return this.h.b.composeInitialPaused$runtime(oj0Var, wn4Var, hn1Var);
    }

    @Override // defpackage.re0
    public final void doneComposing$runtime() {
        go1 go1Var = this.h;
        go1Var.A--;
    }

    @Override // defpackage.re0
    public final boolean getCollectingCallByInformation$runtime() {
        return this.h.b.getCollectingCallByInformation$runtime();
    }

    @Override // defpackage.re0
    public final boolean getCollectingParameterInformation$runtime() {
        return this.b;
    }

    @Override // defpackage.re0
    public final boolean getCollectingSourceInformation$runtime() {
        return this.c;
    }

    @Override // defpackage.re0
    public final long getCompositeKeyHashCode$runtime() {
        return this.a;
    }

    @Override // defpackage.re0
    public final qe0 getComposition$runtime() {
        return this.h.h;
    }

    @Override // defpackage.re0
    public final am3 getCompositionLocalScope$runtime() {
        return (am3) this.g.getValue();
    }

    @Override // defpackage.re0
    public final tk0 getEffectCoroutineContext() {
        return this.h.b.getEffectCoroutineContext();
    }

    @Override // defpackage.re0
    public final jf0 getObserverHolder$runtime() {
        return this.d;
    }

    @Override // defpackage.re0
    public final boolean getStackTraceEnabled$runtime() {
        return this.h.b.getStackTraceEnabled$runtime();
    }

    @Override // defpackage.re0
    public final void invalidate$runtime(oj0 oj0Var) {
        go1 go1Var = this.h;
        re0 re0Var = go1Var.b;
        re0Var.invalidate$runtime(go1Var.h);
        re0Var.invalidate$runtime(oj0Var);
    }

    @Override // defpackage.re0
    public final q23 movableContentStateResolve$runtime(r23 r23Var) {
        return this.h.b.movableContentStateResolve$runtime(r23Var);
    }

    @Override // defpackage.re0
    public final ja4 recomposePaused$runtime(oj0 oj0Var, wn4 wn4Var, ja4 ja4Var) {
        return this.h.b.recomposePaused$runtime(oj0Var, wn4Var, ja4Var);
    }

    @Override // defpackage.re0
    public final void recordInspectionTable$runtime(Set set) {
        HashSet hashSet = this.e;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.e = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.re0
    public final void registerComposer$runtime(fe0 fe0Var) {
        fe0Var.getClass();
        super.registerComposer$runtime((go1) fe0Var);
        this.f.d(fe0Var);
    }

    @Override // defpackage.re0
    public final void reportPausedScope$runtime(x04 x04Var) {
        this.h.b.reportPausedScope$runtime(x04Var);
    }

    @Override // defpackage.re0
    public final void reportRemovedComposition$runtime(oj0 oj0Var) {
        this.h.b.reportRemovedComposition$runtime(oj0Var);
    }

    @Override // defpackage.re0
    public final l10 scheduleFrameEndCallback(rm1 rm1Var) {
        return this.h.b.scheduleFrameEndCallback(rm1Var);
    }

    @Override // defpackage.re0
    public final void startComposing$runtime() {
        this.h.A++;
    }

    @Override // defpackage.re0
    public final void unregisterComposer$runtime(fe0 fe0Var) {
        HashSet hashSet = this.e;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                fe0Var.getClass();
                set.remove(((go1) fe0Var).z());
            }
        }
        if (fe0Var instanceof go1) {
            this.f.l(fe0Var);
        }
    }

    @Override // defpackage.re0
    public final void unregisterComposition$runtime(oj0 oj0Var) {
        this.h.b.unregisterComposition$runtime(oj0Var);
    }
}

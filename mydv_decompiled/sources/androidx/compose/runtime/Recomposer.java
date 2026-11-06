package androidx.compose.runtime;

import defpackage.a14;
import defpackage.ap;
import defpackage.ap3;
import defpackage.b14;
import defpackage.b53;
import defpackage.c14;
import defpackage.ca3;
import defpackage.d14;
import defpackage.d33;
import defpackage.d62;
import defpackage.da3;
import defpackage.dw4;
import defpackage.e14;
import defpackage.e41;
import defpackage.e43;
import defpackage.e62;
import defpackage.ed3;
import defpackage.eg5;
import defpackage.el0;
import defpackage.fj0;
import defpackage.fq;
import defpackage.fw4;
import defpackage.g14;
import defpackage.go1;
import defpackage.h14;
import defpackage.hn1;
import defpackage.i10;
import defpackage.i9;
import defpackage.ia5;
import defpackage.if0;
import defpackage.ig1;
import defpackage.in1;
import defpackage.j34;
import defpackage.j81;
import defpackage.ja4;
import defpackage.ja5;
import defpackage.k10;
import defpackage.ka4;
import defpackage.ke0;
import defpackage.kf0;
import defpackage.l10;
import defpackage.la4;
import defpackage.lt4;
import defpackage.m;
import defpackage.m1;
import defpackage.mu0;
import defpackage.n43;
import defpackage.ns4;
import defpackage.o43;
import defpackage.o7;
import defpackage.o91;
import defpackage.oj0;
import defpackage.p70;
import defpackage.pj4;
import defpackage.pm3;
import defpackage.ps4;
import defpackage.q23;
import defpackage.q8;
import defpackage.qe0;
import defpackage.r23;
import defpackage.r7;
import defpackage.rb0;
import defpackage.rd0;
import defpackage.re0;
import defpackage.rm1;
import defpackage.ry3;
import defpackage.s43;
import defpackage.sp0;
import defpackage.su0;
import defpackage.sv2;
import defpackage.te0;
import defpackage.tk0;
import defpackage.tm1;
import defpackage.ty;
import defpackage.u70;
import defpackage.uj3;
import defpackage.ut0;
import defpackage.v52;
import defpackage.w43;
import defpackage.w83;
import defpackage.wd5;
import defpackage.we0;
import defpackage.wn4;
import defpackage.wr4;
import defpackage.ws4;
import defpackage.x04;
import defpackage.x52;
import defpackage.xa3;
import defpackage.xq;
import defpackage.y1;
import defpackage.z04;
import defpackage.zf1;
import defpackage.zl1;
import defpackage.zy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Recomposer extends re0 {
    public static final int $stable = 8;
    private final List<oj0> _knownCompositions;
    private List<? extends oj0> _knownCompositionsCache;
    private final w43 _state;
    private final ty broadcastFrameClock;
    private long changeCount;
    private Throwable closeCause;
    private final b53 compositionInvalidations;
    private final List<oj0> compositionsAwaitingApply;
    private o43 compositionsRemoved;
    private int concurrentCompositionsOutstanding;
    private final tk0 effectCoroutineContext;
    private final rb0 effectJob;
    private w43 errorState;
    private List<oj0> failedCompositions;
    private boolean frameClockPaused;
    private boolean isClosed;
    private final List<r23> movableContentAwaitingInsert;
    private final n43 movableContentNestedExtractionsPending;
    private final w83 movableContentNestedStatesAvailable;
    private final n43 movableContentRemoved;
    private final n43 movableContentStatesAvailable;
    private final da3 nextFrameEndCallbackQueue;
    private final lt4 pausedScopes;
    private final c14 recomposerInfo;
    private e43 registrationObservers;
    private v52 runnerJob;
    private o43 snapshotInvalidations;
    private final Object stateLock;
    private i10 workContinuation;
    public static final a14 Companion = new a14();
    private static final w43 _runningRecomposers = o7.c(pm3.L);
    private static final AtomicReference<Boolean> _hotReloadEnabled = new AtomicReference<>(Boolean.FALSE);

    public Recomposer(tk0 tk0Var) {
        ty tyVar = new ty(new z04(this, (byte) 0));
        this.broadcastFrameClock = tyVar;
        this.nextFrameEndCallbackQueue = new da3(new z04(this, (byte) 1));
        this.stateLock = new Object();
        this._knownCompositions = new ArrayList();
        this.snapshotInvalidations = new o43();
        this.compositionInvalidations = new b53(new oj0[16]);
        this.compositionsAwaitingApply = new ArrayList();
        this.movableContentAwaitingInsert = new ArrayList();
        this.movableContentRemoved = new n43();
        this.movableContentNestedStatesAvailable = new w83();
        this.movableContentStatesAvailable = new n43();
        this.movableContentNestedExtractionsPending = new n43();
        this.errorState = o7.c(null);
        this._state = o7.c(d14.K);
        this.pausedScopes = new lt4();
        x52 x52Var = new x52((v52) tk0Var.get(q8.r0));
        x52Var.Q(new i9(this, (byte) 19));
        this.effectJob = x52Var;
        this.effectCoroutineContext = tk0Var.plus(tyVar).plus(x52Var);
        this.recomposerInfo = new c14();
    }

    private final void addKnownCompositionLocked(oj0 oj0Var) {
        this._knownCompositions.add(oj0Var);
        this._knownCompositionsCache = null;
    }

    private final void applyAndCheck(s43 s43Var) {
        try {
            if (s43Var.w() instanceof ps4) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            s43Var.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitWorkAvailable(fj0 fj0Var) {
        k10 k10Var;
        if (getHasSchedulingWork()) {
            return wd5.a;
        }
        k10 k10Var2 = new k10(1, mu0.G(fj0Var));
        k10Var2.t();
        synchronized (this.stateLock) {
            if (getHasSchedulingWork()) {
                k10Var = k10Var2;
            } else {
                this.workContinuation = k10Var2;
                k10Var = null;
            }
        }
        if (k10Var != null) {
            k10Var.resumeWith(wd5.a);
        }
        Object r = k10Var2.r();
        return r == el0.I ? r : wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 broadcastFrameClock$lambda$0(Recomposer recomposer) {
        recomposer.onNewFrameAwaiter();
        return wd5.a;
    }

    private final void clearKnownCompositionsLocked() {
        List<oj0> knownCompositionsLocked = knownCompositionsLocked();
        int size = knownCompositionsLocked.size();
        for (int i = 0; i < size; i++) {
            unregisterCompositionLocked(knownCompositionsLocked.get(i));
        }
        this._knownCompositions.clear();
        this._knownCompositionsCache = o91.I;
    }

    private final <T> T composing(oj0 oj0Var, o43 o43Var, rm1 rm1Var) {
        s43 D;
        tm1 readObserverOf = readObserverOf(oj0Var);
        tm1 writeObserverOf = writeObserverOf(oj0Var, o43Var);
        ns4 h = ws4.h();
        s43 s43Var = h instanceof s43 ? (s43) h : null;
        if (s43Var == null || (D = s43Var.D(readObserverOf, writeObserverOf)) == null) {
            zy.i("Cannot create a mutable snapshot of an read-only snapshot");
            return null;
        }
        try {
            ns4 j = D.j();
            try {
                return (T) rm1Var.invoke();
            } finally {
                ns4.q(j);
            }
        } finally {
            applyAndCheck(D);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i10 deriveStateLocked() {
        if (((d14) ((fw4) this._state).getValue()).compareTo(d14.J) <= 0) {
            clearKnownCompositionsLocked();
            this.snapshotInvalidations = new o43();
            this.compositionInvalidations.h();
            this.compositionsAwaitingApply.clear();
            this.movableContentAwaitingInsert.clear();
            this.failedCompositions = null;
            i10 i10Var = this.workContinuation;
            if (i10Var != null) {
                i10Var.j(null);
            }
            this.workContinuation = null;
            ((fw4) this.errorState).h(null);
            return null;
        }
        Object value = ((fw4) this.errorState).getValue();
        d14 d14Var = d14.N;
        d14 d14Var2 = d14.K;
        if (value == null) {
            if (this.runnerJob == null) {
                this.snapshotInvalidations = new o43();
                this.compositionInvalidations.h();
                if (getHasBroadcastFrameClockAwaitersLocked() || getHasNextFrameEndAwaitersLocked()) {
                    d14Var2 = d14.L;
                }
            } else {
                d14Var2 = (this.compositionInvalidations.K == 0 && !this.snapshotInvalidations.c() && this.compositionsAwaitingApply.isEmpty() && this.movableContentAwaitingInsert.isEmpty() && this.concurrentCompositionsOutstanding <= 0 && !getHasBroadcastFrameClockAwaitersLocked() && !getHasNextFrameEndAwaitersLocked() && !this.movableContentRemoved.j()) ? d14.M : d14Var;
            }
        }
        fw4 fw4Var = (fw4) this._state;
        fw4Var.getClass();
        fw4Var.i(null, d14Var2);
        if (d14Var2 != d14Var) {
            return null;
        }
        i10 i10Var2 = this.workContinuation;
        this.workContinuation = null;
        return i10Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void discardUnusedMovableContentState() {
        e43 e43Var;
        synchronized (this.stateLock) {
            try {
                if (this.movableContentRemoved.j()) {
                    e43 c = d33.c(this.movableContentRemoved);
                    this.movableContentRemoved.a();
                    w83 w83Var = this.movableContentNestedStatesAvailable;
                    w83Var.a.a();
                    w83Var.b.a();
                    this.movableContentNestedExtractionsPending.a();
                    e43Var = new e43(c.b);
                    Object[] objArr = c.a;
                    int i = c.b;
                    for (int i2 = 0; i2 < i; i2++) {
                        r23 r23Var = (r23) objArr[i2];
                        e43Var.a(new uj3(r23Var, this.movableContentStatesAvailable.g(r23Var)));
                    }
                    this.movableContentStatesAvailable.a();
                } else {
                    e43Var = ed3.b;
                    e43Var.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object[] objArr2 = e43Var.a;
        int i3 = e43Var.b;
        for (int i4 = 0; i4 < i3; i4++) {
            uj3 uj3Var = (uj3) objArr2[i4];
            r23 r23Var2 = (r23) uj3Var.I;
            q23 q23Var = (q23) uj3Var.J;
            if (q23Var != null) {
                we0 we0Var = (we0) r23Var2.b();
                j34 j34Var = we0Var.c0;
                try {
                    j34Var.g(we0Var.M, we0Var.d0.D());
                    wr4 j = q23Var.a().j();
                    try {
                        j.m(j.t, new y1(j34Var, (byte) 5));
                        j.I();
                        j.e(true);
                        j34Var.c();
                    } finally {
                    }
                } finally {
                    j34Var.a();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 effectJob$lambda$0$0(Recomposer recomposer, Throwable th) {
        i10 i10Var;
        i10 i10Var2;
        CancellationException a = e41.a("Recomposer effect job completed", th);
        synchronized (recomposer.stateLock) {
            try {
                v52 v52Var = recomposer.runnerJob;
                i10Var = null;
                if (v52Var != null) {
                    w43 w43Var = recomposer._state;
                    d14 d14Var = d14.J;
                    fw4 fw4Var = (fw4) w43Var;
                    fw4Var.getClass();
                    fw4Var.i(null, d14Var);
                    if (recomposer.isClosed) {
                        i10Var2 = recomposer.workContinuation;
                        if (i10Var2 != null) {
                            recomposer.workContinuation = null;
                            v52Var.Q(new ap3((Object) recomposer, (Object) th, (byte) 3));
                            i10Var = i10Var2;
                        }
                    } else {
                        v52Var.e(a);
                    }
                    i10Var2 = null;
                    recomposer.workContinuation = null;
                    v52Var.Q(new ap3((Object) recomposer, (Object) th, (byte) 3));
                    i10Var = i10Var2;
                } else {
                    recomposer.closeCause = a;
                    w43 w43Var2 = recomposer._state;
                    d14 d14Var2 = d14.I;
                    fw4 fw4Var2 = (fw4) w43Var2;
                    fw4Var2.getClass();
                    fw4Var2.i(null, d14Var2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i10Var != null) {
            i10Var.resumeWith(wd5.a);
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 effectJob$lambda$0$0$0$0(Recomposer recomposer, Throwable th, Throwable th2) {
        synchronized (recomposer.stateLock) {
            if (th == null) {
                th = null;
            } else if (th2 != null) {
                try {
                    if (th2 instanceof CancellationException) {
                        th2 = null;
                    }
                    if (th2 != null) {
                        sv2.i(th, th2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            recomposer.closeCause = th;
            w43 w43Var = recomposer._state;
            d14 d14Var = d14.I;
            fw4 fw4Var = (fw4) w43Var;
            fw4Var.getClass();
            fw4Var.i(null, d14Var);
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasBroadcastFrameClockAwaiters() {
        boolean hasBroadcastFrameClockAwaitersLocked;
        synchronized (this.stateLock) {
            hasBroadcastFrameClockAwaitersLocked = getHasBroadcastFrameClockAwaitersLocked();
        }
        return hasBroadcastFrameClockAwaitersLocked;
    }

    private final boolean getHasBroadcastFrameClockAwaitersLocked() {
        return !this.frameClockPaused && (((xq) this.broadcastFrameClock.J.c).get() & 134217727) > 0;
    }

    private final boolean getHasFrameWorkLocked() {
        return this.compositionInvalidations.K != 0 || getHasBroadcastFrameClockAwaitersLocked() || getHasNextFrameEndAwaitersLocked() || this.movableContentRemoved.j();
    }

    private final boolean getHasNextFrameEndAwaitersLocked() {
        return !this.frameClockPaused && (((xq) this.nextFrameEndCallbackQueue.b.c).get() & 134217727) > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasSchedulingWork() {
        boolean z;
        synchronized (this.stateLock) {
            if (!this.snapshotInvalidations.c() && this.compositionInvalidations.K == 0 && !getHasBroadcastFrameClockAwaitersLocked()) {
                z = getHasNextFrameEndAwaitersLocked();
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldKeepRecomposing() {
        boolean z;
        pj4 pj4Var;
        synchronized (this.stateLock) {
            z = this.isClosed;
        }
        byte b = 1;
        if (z) {
            e62 e62Var = (e62) this.effectJob;
            e62Var.getClass();
            Iterator it = new fq(new d62(null, e62Var), b).iterator();
            do {
                pj4Var = (pj4) it;
                if (!pj4Var.hasNext()) {
                    return false;
                }
            } while (!((v52) pj4Var.next()).isActive());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<oj0> knownCompositions() {
        List<oj0> knownCompositionsLocked;
        synchronized (this.stateLock) {
            knownCompositionsLocked = knownCompositionsLocked();
        }
        return knownCompositionsLocked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<oj0> knownCompositionsLocked() {
        List list = this._knownCompositionsCache;
        if (list != null) {
            return list;
        }
        List<oj0> list2 = this._knownCompositions;
        List<oj0> arrayList = list2.isEmpty() ? o91.I : new ArrayList(list2);
        this._knownCompositionsCache = arrayList;
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 nextFrameEndCallbackQueue$lambda$0(Recomposer recomposer) {
        recomposer.onNewFrameAwaiter();
        return wd5.a;
    }

    private final void onNewFrameAwaiter() {
        i10 deriveStateLocked;
        synchronized (this.stateLock) {
            deriveStateLocked = deriveStateLocked();
            if (((d14) ((fw4) this._state).getValue()).compareTo(d14.J) <= 0) {
                throw e41.a("Recomposer shutdown; frame clock awaiter will never resume", this.closeCause);
            }
        }
        if (deriveStateLocked != null) {
            deriveStateLocked.resumeWith(wd5.a);
        }
    }

    private final void performInitialMovableContentInserts(oj0 oj0Var) {
        synchronized (this.stateLock) {
            List<r23> list = this.movableContentAwaitingInsert;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).b().equals(oj0Var)) {
                    ArrayList arrayList = new ArrayList();
                    performInitialMovableContentInserts$fillToInsert(arrayList, this, oj0Var);
                    while (!arrayList.isEmpty()) {
                        performInsertValues(arrayList, null);
                        performInitialMovableContentInserts$fillToInsert(arrayList, this, oj0Var);
                    }
                    return;
                }
            }
        }
    }

    private static final void performInitialMovableContentInserts$fillToInsert(List<r23> list, Recomposer recomposer, oj0 oj0Var) {
        list.clear();
        synchronized (recomposer.stateLock) {
            Iterator<r23> it = recomposer.movableContentAwaitingInsert.iterator();
            while (it.hasNext()) {
                r23 next = it.next();
                if (next.b().equals(oj0Var)) {
                    list.add(next);
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0131, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0136, code lost:
    
        if (r4 >= r3) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0140, code lost:
    
        if (((defpackage.uj3) r10.get(r4)).J == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0142, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0145, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0153, code lost:
    
        if (r9 >= r4) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0155, code lost:
    
        r11 = (defpackage.uj3) r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015d, code lost:
    
        if (r11.J != null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015f, code lost:
    
        r11 = (defpackage.r23) r11.I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0166, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0169, code lost:
    
        r4 = r17.stateLock;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016b, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016c, code lost:
    
        defpackage.u70.I0(r17.movableContentAwaitingInsert, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0171, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0172, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0180, code lost:
    
        if (r9 >= r4) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0182, code lost:
    
        r11 = r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018b, code lost:
    
        if (((defpackage.uj3) r11).J == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018d, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0190, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0193, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<defpackage.oj0> performInsertValues(java.util.List<defpackage.r23> r18, defpackage.o43 r19) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.performInsertValues(java.util.List, o43):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oj0 performRecompose(oj0 oj0Var, o43 o43Var) {
        s43 D;
        we0 we0Var = (we0) oj0Var;
        if (we0Var.d0.F || we0Var.e0 == 3) {
            return null;
        }
        o43 o43Var2 = this.compositionsRemoved;
        if (o43Var2 == null || !o43Var2.a(we0Var)) {
            tm1 readObserverOf = readObserverOf(we0Var);
            tm1 writeObserverOf = writeObserverOf(we0Var, o43Var);
            ns4 h = ws4.h();
            s43 s43Var = h instanceof s43 ? (s43) h : null;
            if (s43Var == null || (D = s43Var.D(readObserverOf, writeObserverOf)) == null) {
                zy.i("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    ns4 j = D.j();
                    if (o43Var != null) {
                        try {
                            if (o43Var.c()) {
                                go1 go1Var = we0Var.d0;
                                if (go1Var.F) {
                                    ke0.a("Preparing a composition while composing is not supported");
                                }
                                go1Var.F = true;
                                try {
                                    performRecompose$lambda$0$0(o43Var, we0Var);
                                    go1Var.F = false;
                                } catch (Throwable th) {
                                    go1Var.F = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            ns4.q(j);
                            throw th2;
                        }
                    }
                    boolean y = we0Var.y();
                    ns4.q(j);
                    if (y) {
                        return we0Var;
                    }
                } finally {
                    applyAndCheck(D);
                }
            }
        }
        return null;
    }

    private static final wd5 performRecompose$lambda$0$0(o43 o43Var, oj0 oj0Var) {
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
                            ((we0) oj0Var).A(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return wd5.a;
    }

    private final void processCompositionError(Throwable th, oj0 oj0Var, boolean z) {
        if (!_hotReloadEnabled.get().booleanValue() || (th instanceof rd0)) {
            synchronized (this.stateLock) {
                eg5.y("Error was captured in composition.", th);
                b14 b14Var = (b14) ((fw4) this.errorState).getValue();
                if (b14Var != null) {
                    throw b14Var.a();
                }
                w43 w43Var = this.errorState;
                b14 b14Var2 = new b14(th);
                fw4 fw4Var = (fw4) w43Var;
                fw4Var.getClass();
                fw4Var.i(null, b14Var2);
            }
            throw th;
        }
        synchronized (this.stateLock) {
            try {
                eg5.y("Error was captured in composition while live edit was enabled.", th);
                this.compositionsAwaitingApply.clear();
                this.compositionInvalidations.h();
                this.snapshotInvalidations = new o43();
                this.movableContentAwaitingInsert.clear();
                this.movableContentRemoved.a();
                this.movableContentStatesAvailable.a();
                w43 w43Var2 = this.errorState;
                b14 b14Var3 = new b14(th);
                fw4 fw4Var2 = (fw4) w43Var2;
                fw4Var2.getClass();
                fw4Var2.i(null, b14Var3);
                if (oj0Var != null) {
                    recordFailedCompositionLocked(oj0Var);
                }
                if (deriveStateLocked() != null) {
                    ke0.a("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void processCompositionError$default(Recomposer recomposer, Throwable th, oj0 oj0Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            oj0Var = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        recomposer.processCompositionError(th, oj0Var, z);
    }

    private final tm1 readObserverOf(oj0 oj0Var) {
        return new i9(oj0Var, (byte) 18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 readObserverOf$lambda$0(oj0 oj0Var, Object obj) {
        ((we0) oj0Var).b(obj);
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object recompositionRunner(in1 in1Var, fj0 fj0Var) {
        Object D0 = p70.D0(this.broadcastFrameClock, new m(this, in1Var, ut0.E(fj0Var.getContext()), null), fj0Var);
        return D0 == el0.I ? D0 : wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean recordComposerModifications() {
        boolean hasFrameWorkLocked;
        synchronized (this.stateLock) {
            if (this.snapshotInvalidations.b()) {
                return getHasFrameWorkLocked();
            }
            List<oj0> knownCompositionsLocked = knownCompositionsLocked();
            la4 la4Var = new la4(this.snapshotInvalidations);
            this.snapshotInvalidations = new o43();
            try {
                int size = knownCompositionsLocked.size();
                for (int i = 0; i < size; i++) {
                    ((we0) knownCompositionsLocked.get(i)).z(la4Var);
                    if (((d14) ((fw4) this._state).getValue()).compareTo(d14.J) <= 0) {
                        break;
                    }
                }
                synchronized (this.stateLock) {
                    if (deriveStateLocked() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    hasFrameWorkLocked = getHasFrameWorkLocked();
                }
                return hasFrameWorkLocked;
            } catch (Throwable th) {
                synchronized (this.stateLock) {
                    o43 o43Var = this.snapshotInvalidations;
                    int i2 = o43Var.d;
                    Iterator<E> it = la4Var.iterator();
                    while (it.hasNext()) {
                        o43Var.k(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordFailedCompositionLocked(oj0 oj0Var) {
        List list = this.failedCompositions;
        if (list == null) {
            list = new ArrayList();
            this.failedCompositions = list;
        }
        if (!list.contains(oj0Var)) {
            list.add(oj0Var);
        }
        removeKnownCompositionLocked(oj0Var);
    }

    private final void registerCompositionLocked(oj0 oj0Var) {
        e43 e43Var = this.registrationObservers;
        if (e43Var != null) {
            Object[] objArr = e43Var.a;
            int i = e43Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                if (objArr[i2] != null) {
                    zl1.c();
                    return;
                } else {
                    if (oj0Var instanceof we0) {
                        throw null;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerRunnerJob(v52 v52Var) {
        synchronized (this.stateLock) {
            Throwable th = this.closeCause;
            if (th != null) {
                throw th;
            }
            if (((d14) ((fw4) this._state).getValue()).compareTo(d14.J) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (this.runnerJob != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            this.runnerJob = v52Var;
            if (deriveStateLocked() != null) {
                ke0.a("called outside of runRecomposeAndApplyChanges");
            }
        }
    }

    private final void removeKnownCompositionLocked(oj0 oj0Var) {
        if (this._knownCompositions.remove(oj0Var)) {
            this._knownCompositionsCache = null;
            unregisterCompositionLocked(oj0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b14 resetErrorState() {
        Object value;
        i10 i10Var;
        synchronized (this.stateLock) {
            value = ((fw4) this.errorState).getValue();
            i10Var = null;
            if (value != null) {
                ((fw4) this.errorState).h(null);
                i10Var = deriveStateLocked();
            }
        }
        if (i10Var != null) {
            i10Var.resumeWith(wd5.a);
        }
        return (b14) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retryFailedCompositions() {
        List<oj0> list;
        int i;
        synchronized (this.stateLock) {
            list = this.failedCompositions;
            this.failedCompositions = null;
        }
        if (list == null) {
            return;
        }
        while (true) {
            i = 0;
            try {
                if (list.isEmpty()) {
                    break;
                }
                oj0 oj0Var = (oj0) u70.L0(list);
                if (oj0Var instanceof we0) {
                    ((we0) oj0Var).u();
                    ((we0) oj0Var).B(((we0) oj0Var).f0);
                    if (((fw4) this.errorState).getValue() != null) {
                        break;
                    }
                }
            } catch (Throwable th) {
                if (!list.isEmpty()) {
                    synchronized (this.stateLock) {
                        int size = list.size();
                        while (i < size) {
                            recordFailedCompositionLocked(list.get(i));
                            i++;
                        }
                    }
                }
                throw th;
            }
        }
        if (list.isEmpty()) {
            return;
        }
        synchronized (this.stateLock) {
            int size2 = list.size();
            while (i < size2) {
                recordFailedCompositionLocked(list.get(i));
                i++;
            }
        }
    }

    private final void unregisterCompositionLocked(oj0 oj0Var) {
        e43 e43Var = this.registrationObservers;
        if (e43Var != null) {
            Object[] objArr = e43Var.a;
            int i = e43Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                r7.K(objArr[i2]);
                if (oj0Var instanceof we0) {
                    throw null;
                }
            }
        }
    }

    private final void withTransparentSnapshot(rm1 rm1Var) {
        ns4 h = ws4.h();
        ns4 ia5Var = h instanceof s43 ? new ia5((s43) h, null, null, true, false) : new ja5(h, null, true, false);
        try {
            ns4 j = ia5Var.j();
            try {
                rm1Var.invoke();
                ns4.q(j);
                ia5Var.c();
            } catch (Throwable th) {
                ns4.q(j);
                throw th;
            }
        } catch (Throwable th2) {
            ia5Var.c();
            throw th2;
        }
    }

    private final tm1 writeObserverOf(oj0 oj0Var, o43 o43Var) {
        return new m1(oj0Var, o43Var, (byte) 17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 writeObserverOf$lambda$0(oj0 oj0Var, o43 o43Var, Object obj) {
        ((we0) oj0Var).A(obj);
        if (o43Var != null) {
            o43Var.d(obj);
        }
        return wd5.a;
    }

    public final if0 addCompositionRegistrationObserver$runtime(kf0 kf0Var) {
        synchronized (this.stateLock) {
            try {
                e43 e43Var = this.registrationObservers;
                if (e43Var == null) {
                    e43Var = new e43();
                    this.registrationObservers = e43Var;
                }
                e43Var.a(kf0Var);
                List<oj0> list = this._knownCompositions;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (list.get(i) instanceof we0) {
                        kf0Var.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return new j81((byte) 23);
    }

    public final h14 asRecomposerInfo() {
        return this.recomposerInfo;
    }

    public final Object awaitIdle(fj0 fj0Var) {
        Object collect = new ig1(getCurrentState(), new ry3(), (byte) 2).collect(xa3.I, fj0Var);
        wd5 wd5Var = wd5.a;
        el0 el0Var = el0.I;
        if (collect != el0Var) {
            collect = wd5Var;
        }
        return collect == el0Var ? collect : wd5Var;
    }

    public final void cancel() {
        synchronized (this.stateLock) {
            if (((d14) ((fw4) this._state).getValue()).compareTo(d14.M) >= 0) {
                w43 w43Var = this._state;
                d14 d14Var = d14.J;
                fw4 fw4Var = (fw4) w43Var;
                fw4Var.getClass();
                fw4Var.i(null, d14Var);
            }
        }
        ((e62) this.effectJob).e(null);
    }

    public final void close() {
        if (((x52) this.effectJob).S(wd5.a)) {
            synchronized (this.stateLock) {
                this.isClosed = true;
            }
        }
    }

    @Override // defpackage.re0
    public void composeInitial$runtime(oj0 oj0Var, hn1 hn1Var) {
        d14 d14Var;
        boolean z;
        s43 D;
        we0 we0Var = (we0) oj0Var;
        boolean z2 = we0Var.d0.F;
        synchronized (this.stateLock) {
            d14 d14Var2 = (d14) ((fw4) this._state).getValue();
            d14Var = d14.J;
            if (d14Var2.compareTo(d14Var) > 0) {
                boolean contains = knownCompositionsLocked().contains(we0Var);
                z = !contains;
                if (!contains) {
                    registerCompositionLocked(we0Var);
                }
            } else {
                z = true;
            }
        }
        try {
            tm1 readObserverOf = readObserverOf(we0Var);
            tm1 writeObserverOf = writeObserverOf(we0Var, null);
            ns4 h = ws4.h();
            s43 s43Var = h instanceof s43 ? (s43) h : null;
            if (s43Var == null || (D = s43Var.D(readObserverOf, writeObserverOf)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                ns4 j = D.j();
                try {
                    we0Var.m(hn1Var);
                    ns4.q(j);
                    applyAndCheck(D);
                    synchronized (this.stateLock) {
                        try {
                            if (((d14) ((fw4) this._state).getValue()).compareTo(d14Var) <= 0) {
                                unregisterCompositionLocked(we0Var);
                            } else if (!knownCompositionsLocked().contains(we0Var)) {
                                addKnownCompositionLocked(we0Var);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (!z2) {
                        ws4.h().m();
                    }
                    try {
                        performInitialMovableContentInserts(we0Var);
                        try {
                            we0Var.g();
                            we0Var.i();
                            if (z2) {
                                return;
                            }
                            ws4.h().m();
                        } catch (Throwable th2) {
                            processCompositionError$default(this, th2, null, false, 6, null);
                        }
                    } catch (Throwable th3) {
                        processCompositionError(th3, we0Var, true);
                    }
                } catch (Throwable th4) {
                    ns4.q(j);
                    throw th4;
                }
            } catch (Throwable th5) {
                applyAndCheck(D);
                throw th5;
            }
        } catch (Throwable th6) {
            if (z) {
                synchronized (this.stateLock) {
                    unregisterCompositionLocked(we0Var);
                }
            }
            processCompositionError(th6, we0Var, true);
        }
    }

    @Override // defpackage.re0
    public ja4 composeInitialPaused$runtime(oj0 oj0Var, wn4 wn4Var, hn1 hn1Var) {
        try {
            we0 we0Var = (we0) oj0Var;
            wn4 wn4Var2 = we0Var.X;
            we0Var.X = wn4Var;
            try {
                composeInitial$runtime(oj0Var, hn1Var);
                o43 o43Var = (o43) this.pausedScopes.a();
                if (o43Var == null) {
                    o43Var = ka4.a;
                    o43Var.getClass();
                }
                return o43Var;
            } finally {
                ((we0) oj0Var).X = wn4Var2;
            }
        } finally {
            this.pausedScopes.b(null);
        }
    }

    public void deletedMovableContent$runtime(r23 r23Var) {
        i10 deriveStateLocked;
        synchronized (this.stateLock) {
            n43 n43Var = this.movableContentRemoved;
            r23Var.getClass();
            d33.a(n43Var, null, r23Var);
            deriveStateLocked = deriveStateLocked();
        }
        if (deriveStateLocked != null) {
            deriveStateLocked.resumeWith(wd5.a);
        }
    }

    public final long getChangeCount() {
        return this.changeCount;
    }

    @Override // defpackage.re0
    public boolean getCollectingCallByInformation$runtime() {
        return _hotReloadEnabled.get().booleanValue();
    }

    @Override // defpackage.re0
    public boolean getCollectingParameterInformation$runtime() {
        return false;
    }

    @Override // defpackage.re0
    public boolean getCollectingSourceInformation$runtime() {
        return false;
    }

    @Override // defpackage.re0
    public long getCompositeKeyHashCode$runtime() {
        return 1000L;
    }

    @Override // defpackage.re0
    public qe0 getComposition$runtime() {
        return null;
    }

    public final dw4 getCurrentState() {
        return this._state;
    }

    @Override // defpackage.re0
    public tk0 getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    public final boolean getHasPendingWork() {
        boolean z;
        synchronized (this.stateLock) {
            if (!this.snapshotInvalidations.c() && this.compositionInvalidations.K == 0 && this.concurrentCompositionsOutstanding <= 0 && this.compositionsAwaitingApply.isEmpty() && !getHasBroadcastFrameClockAwaitersLocked() && !getHasNextFrameEndAwaitersLocked()) {
                z = this.movableContentRemoved.j();
            }
        }
        return z;
    }

    @Override // defpackage.re0
    public boolean getStackTraceEnabled$runtime() {
        return false;
    }

    public final zf1 getState() {
        return getCurrentState();
    }

    public void insertMovableContent$runtime(r23 r23Var) {
        i10 deriveStateLocked;
        synchronized (this.stateLock) {
            this.movableContentAwaitingInsert.add(r23Var);
            deriveStateLocked = deriveStateLocked();
        }
        if (deriveStateLocked != null) {
            deriveStateLocked.resumeWith(wd5.a);
        }
    }

    @Override // defpackage.re0
    public void invalidate$runtime(oj0 oj0Var) {
        i10 i10Var;
        synchronized (this.stateLock) {
            if (this.compositionInvalidations.i(oj0Var)) {
                i10Var = null;
            } else {
                this.compositionInvalidations.c(oj0Var);
                i10Var = deriveStateLocked();
            }
        }
        if (i10Var != null) {
            i10Var.resumeWith(wd5.a);
        }
    }

    public void invalidateScope$runtime(x04 x04Var) {
        i10 deriveStateLocked;
        synchronized (this.stateLock) {
            this.snapshotInvalidations.d(x04Var);
            deriveStateLocked = deriveStateLocked();
        }
        if (deriveStateLocked != null) {
            deriveStateLocked.resumeWith(wd5.a);
        }
    }

    public final Object join(fj0 fj0Var) {
        Object L = sp0.L(getCurrentState(), new e14(2, null, (byte) 0), fj0Var);
        return L == el0.I ? L : wd5.a;
    }

    public void movableContentStateReleased$runtime(r23 r23Var, q23 q23Var, ap apVar) {
        e43 e43Var;
        synchronized (this.stateLock) {
            this.movableContentStatesAvailable.m(r23Var, q23Var);
            Object g = this.movableContentNestedExtractionsPending.g(r23Var);
            if (g == null) {
                e43Var = ed3.b;
                e43Var.getClass();
            } else if (g instanceof e43) {
                e43Var = (e43) g;
            } else {
                Object[] objArr = ed3.a;
                e43 e43Var2 = new e43(1);
                e43Var2.a(g);
                e43Var = e43Var2;
            }
            if (e43Var.j()) {
                n43 e = q23Var.a().e(apVar, e43Var);
                Object[] objArr2 = e.b;
                Object[] objArr3 = e.c;
                long[] jArr = e.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj = objArr2[i4];
                                    this.movableContentStatesAvailable.m((r23) obj, (q23) objArr3[i4]);
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
        }
    }

    @Override // defpackage.re0
    public q23 movableContentStateResolve$runtime(r23 r23Var) {
        q23 q23Var;
        synchronized (this.stateLock) {
            q23Var = (q23) this.movableContentStatesAvailable.k(r23Var);
        }
        return q23Var;
    }

    public final void pauseCompositionFrameClock() {
        synchronized (this.stateLock) {
            this.frameClockPaused = true;
        }
    }

    @Override // defpackage.re0
    public ja4 recomposePaused$runtime(oj0 oj0Var, wn4 wn4Var, ja4 ja4Var) {
        try {
            recordComposerModifications();
            we0 we0Var = (we0) oj0Var;
            we0Var.z(new la4(ja4Var));
            wn4 wn4Var2 = we0Var.X;
            we0Var.X = wn4Var;
            try {
                oj0 performRecompose = performRecompose(we0Var, null);
                if (performRecompose != null) {
                    performInitialMovableContentInserts(we0Var);
                    we0 we0Var2 = (we0) performRecompose;
                    we0Var2.g();
                    we0Var2.i();
                }
                o43 o43Var = (o43) this.pausedScopes.a();
                if (o43Var == null) {
                    o43Var = ka4.a;
                    o43Var.getClass();
                }
                return o43Var;
            } finally {
                we0Var.X = wn4Var2;
            }
        } finally {
            this.pausedScopes.b(null);
        }
    }

    @Override // defpackage.re0
    public void reportPausedScope$runtime(x04 x04Var) {
        o43 o43Var = (o43) this.pausedScopes.a();
        if (o43Var == null) {
            o43 o43Var2 = ka4.a;
            o43Var = new o43();
            this.pausedScopes.b(o43Var);
        }
        o43Var.d(x04Var);
    }

    @Override // defpackage.re0
    public void reportRemovedComposition$runtime(oj0 oj0Var) {
        synchronized (this.stateLock) {
            try {
                o43 o43Var = this.compositionsRemoved;
                if (o43Var == null) {
                    o43 o43Var2 = ka4.a;
                    o43Var = new o43();
                    this.compositionsRemoved = o43Var;
                }
                o43Var.d(oj0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void resumeCompositionFrameClock() {
        i10 i10Var;
        synchronized (this.stateLock) {
            if (this.frameClockPaused) {
                this.frameClockPaused = false;
                i10Var = deriveStateLocked();
            } else {
                i10Var = null;
            }
        }
        if (i10Var != null) {
            i10Var.resumeWith(wd5.a);
        }
    }

    public final Object runRecomposeAndApplyChanges(fj0 fj0Var) {
        Object recompositionRunner = recompositionRunner(new g14(this, null), fj0Var);
        return recompositionRunner == el0.I ? recompositionRunner : wd5.a;
    }

    @Override // defpackage.re0
    public l10 scheduleFrameEndCallback(rm1 rm1Var) {
        da3 da3Var = this.nextFrameEndCallbackQueue;
        return da3Var.b.a(new ca3(rm1Var), da3Var.c);
    }

    @Override // defpackage.re0
    public void unregisterComposition$runtime(oj0 oj0Var) {
        synchronized (this.stateLock) {
            removeKnownCompositionLocked(oj0Var);
            this.compositionInvalidations.k(oj0Var);
            this.compositionsAwaitingApply.remove(oj0Var);
        }
    }

    private static /* synthetic */ void getRegistrationObservers$annotations() {
    }

    @su0
    public static /* synthetic */ void getState$annotations() {
    }

    @Override // defpackage.re0
    public void recordInspectionTable$runtime(Set<te0> set) {
    }

    public void registerComposition$runtime(oj0 oj0Var) {
    }
}

package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class re0 {
    public static final int $stable = 0;

    public abstract void composeInitial$runtime(oj0 oj0Var, hn1 hn1Var);

    public abstract ja4 composeInitialPaused$runtime(oj0 oj0Var, wn4 wn4Var, hn1 hn1Var);

    public abstract boolean getCollectingCallByInformation$runtime();

    public abstract boolean getCollectingParameterInformation$runtime();

    public abstract boolean getCollectingSourceInformation$runtime();

    public abstract long getCompositeKeyHashCode$runtime();

    public abstract qe0 getComposition$runtime();

    public am3 getCompositionLocalScope$runtime() {
        return se0.a;
    }

    public abstract tk0 getEffectCoroutineContext();

    public jf0 getObserverHolder$runtime() {
        return null;
    }

    public abstract boolean getStackTraceEnabled$runtime();

    public abstract void invalidate$runtime(oj0 oj0Var);

    public abstract q23 movableContentStateResolve$runtime(r23 r23Var);

    public abstract ja4 recomposePaused$runtime(oj0 oj0Var, wn4 wn4Var, ja4 ja4Var);

    public abstract void recordInspectionTable$runtime(Set set);

    public abstract void reportPausedScope$runtime(x04 x04Var);

    public abstract void reportRemovedComposition$runtime(oj0 oj0Var);

    public abstract l10 scheduleFrameEndCallback(rm1 rm1Var);

    public abstract void unregisterComposition$runtime(oj0 oj0Var);

    public void doneComposing$runtime() {
    }

    public void startComposing$runtime() {
    }

    public void registerComposer$runtime(fe0 fe0Var) {
    }

    public void unregisterComposer$runtime(fe0 fe0Var) {
    }
}

package defpackage;

import android.view.View;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface qh3 extends ar3 {
    /* renamed from: calculateLocalPosition-MK-Hz9U */
    long mo16calculateLocalPositionMKHz9U(long j);

    /* renamed from: calculatePositionInWindow-MK-Hz9U */
    long mo17calculatePositionInWindowMKHz9U(long j);

    oh3 createLayer(hn1 hn1Var, rm1 rm1Var, jr1 jr1Var);

    /* renamed from: dispatchOnScrollChanged-k-4lQ0M */
    void mo18dispatchOnScrollChangedk4lQ0M(long j);

    void forceMeasureTheSubtree(wa2 wa2Var, boolean z);

    h5 getAccessibilityManager();

    yr getAutofill();

    ds getAutofillManager();

    es getAutofillTree();

    v60 getClipboard();

    w60 getClipboardManager();

    tk0 getCoroutineContext();

    iu0 getDensity();

    y11 getDragAndDropManager();

    bi1 getFocusOwner();

    kj1 getFontFamilyResolver();

    jj1 getFontLoader();

    ir1 getGraphicsContext();

    ts1 getHapticFeedBack();

    j12 getInputModeManager();

    da2 getLayoutDirection();

    tq2 getLocaleList();

    m13 getModifierLocalManager();

    tg3 getOutOfFrameExecutor();

    an3 getPlacementScope();

    qp3 getPointerIconService();

    o14 getRectManager();

    l54 getRetainedValuesStore();

    wa2 getRoot();

    xi4 getSemanticsOwner();

    ya2 getSharedDrawScope();

    boolean getShowLayoutBounds();

    sh3 getSnapshotObserver();

    ot4 getSoftwareKeyboardController();

    j55 getTextInputService();

    n65 getTextToolbar();

    gr5 getViewConfiguration();

    ru5 getWindowInfo();

    void invalidateRootLayer();

    void measureAndLayout(boolean z);

    /* renamed from: measureAndLayout-0kLqBqw */
    void mo22measureAndLayout0kLqBqw(wa2 wa2Var, long j);

    void onDetach(wa2 wa2Var);

    void onEndApplyChanges();

    void onInteropViewLayoutChange(View view);

    void onLayoutChange(wa2 wa2Var);

    void onLayoutNodeDeactivated(wa2 wa2Var);

    void onPostAttach(wa2 wa2Var);

    void onPostLayoutNodeReused(wa2 wa2Var, int i);

    void onPreAttach(wa2 wa2Var);

    void onPreLayoutNodeReused(wa2 wa2Var, int i);

    void onRequestMeasure(wa2 wa2Var, boolean z, boolean z2, boolean z3);

    void onRequestRelayout(wa2 wa2Var, boolean z, boolean z2);

    void onSemanticsChange();

    void registerOnEndApplyChangesListener(rm1 rm1Var);

    void requestAutofill(wa2 wa2Var);

    void requestOnPositionedCallback(wa2 wa2Var);

    void setShowLayoutBounds(boolean z);

    Object textInputSession(hn1 hn1Var, fj0 fj0Var);

    void voteFrameRate(float f);
}

package androidx.compose.ui.platform;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.media3.common.util.Log;
import com.github.mytv.dv.R;
import defpackage.a5;
import defpackage.ad4;
import defpackage.b53;
import defpackage.bb4;
import defpackage.bj4;
import defpackage.bq;
import defpackage.c5;
import defpackage.cu4;
import defpackage.d4;
import defpackage.d5;
import defpackage.d65;
import defpackage.da2;
import defpackage.db;
import defpackage.dj4;
import defpackage.dk2;
import defpackage.dl2;
import defpackage.dn4;
import defpackage.dq;
import defpackage.dq2;
import defpackage.e43;
import defpackage.e5;
import defpackage.eb;
import defpackage.ed0;
import defpackage.ed5;
import defpackage.ek2;
import defpackage.f5;
import defpackage.f55;
import defpackage.fb;
import defpackage.fb4;
import defpackage.g4;
import defpackage.g5;
import defpackage.g55;
import defpackage.h55;
import defpackage.h74;
import defpackage.hb;
import defpackage.i5;
import defpackage.ii4;
import defpackage.in1;
import defpackage.iu0;
import defpackage.j22;
import defpackage.j42;
import defpackage.ja3;
import defpackage.k13;
import defpackage.k20;
import defpackage.ka;
import defpackage.ki2;
import defpackage.ki4;
import defpackage.kt1;
import defpackage.li4;
import defpackage.lk1;
import defpackage.m14;
import defpackage.m22;
import defpackage.m35;
import defpackage.mf5;
import defpackage.mu0;
import defpackage.mw2;
import defpackage.n22;
import defpackage.n43;
import defpackage.na3;
import defpackage.nj;
import defpackage.o33;
import defpackage.o70;
import defpackage.o91;
import defpackage.oi5;
import defpackage.oj;
import defpackage.p22;
import defpackage.p33;
import defpackage.p5;
import defpackage.p70;
import defpackage.pd3;
import defpackage.pi4;
import defpackage.pj;
import defpackage.q02;
import defpackage.q22;
import defpackage.q33;
import defpackage.q4;
import defpackage.qb;
import defpackage.qb4;
import defpackage.qk1;
import defpackage.r33;
import defpackage.rm1;
import defpackage.s5;
import defpackage.s83;
import defpackage.sh3;
import defpackage.si4;
import defpackage.t90;
import defpackage.ti4;
import defpackage.tm1;
import defpackage.tq2;
import defpackage.u55;
import defpackage.u73;
import defpackage.ui4;
import defpackage.ut0;
import defpackage.v1;
import defpackage.v22;
import defpackage.v4;
import defpackage.vg3;
import defpackage.vi4;
import defpackage.wa2;
import defpackage.wd5;
import defpackage.wg3;
import defpackage.wi4;
import defpackage.wt0;
import defpackage.x02;
import defpackage.x70;
import defpackage.xg3;
import defpackage.xi2;
import defpackage.y22;
import defpackage.y4;
import defpackage.yd;
import defpackage.yg3;
import defpackage.yt4;
import defpackage.z1;
import defpackage.zc5;
import defpackage.zi4;
import defpackage.zy;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat extends y4 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final int $stable = 8;
    private static final m22 AccessibilityActionsResourceIds;
    public static final int AccessibilityCursorPositionUndefined = -1;
    public static final int AccessibilitySliderStepsCount = 20;
    public static final int CONTENT_CHANGE_TYPE_CHECKED = 8192;
    public static final String ClassName = "android.view.View";
    public static final db Companion = new db();
    public static final String ExtraDataIdKey = "androidx.compose.ui.semantics.id";
    public static final String ExtraDataShapeRectCornersKey = "androidx.compose.ui.semantics.shapeCorners";
    public static final String ExtraDataShapeRectKey = "androidx.compose.ui.semantics.shapeRect";
    public static final String ExtraDataShapeRegionKey = "androidx.compose.ui.semantics.shapeRegion";
    public static final int ExtraDataShapeTypeGeneric = 2;
    public static final String ExtraDataShapeTypeKey = "androidx.compose.ui.semantics.shapeType";
    public static final int ExtraDataShapeTypeRectangle = 0;
    public static final int ExtraDataShapeTypeRounded = 1;
    public static final String ExtraDataTestTagKey = "androidx.compose.ui.semantics.testTag";
    public static final int InvalidId = Integer.MIN_VALUE;
    public static final String LogTag = "AccessibilityDelegate";
    public static final int ParcelSafeTextLength = 100000;
    public static final String TextClassName = "android.widget.TextView";
    public static final String TextFieldClassName = "android.widget.EditText";
    public static final long TextTraversedEventTimeoutMillis = 1000;
    private final String ExtraDataTestTraversalAfterVal;
    private final String ExtraDataTestTraversalBeforeVal;
    private long SendRecurringAccessibilityEventsIntervalMillis;
    private List<? extends AccessibilityServiceInfo> _enabledServices;
    private int accessibilityCursorPosition;
    private int accessibilityFocusedVirtualViewId;
    private boolean accessibilityForceEnabledForTesting;
    private final AccessibilityManager accessibilityManager;
    private cu4 actionIdToLabel;
    private final k20 boundsUpdateChannel;
    private boolean checkingForSemanticsChanges;
    private p22 currentSemanticsNodes;
    private boolean currentSemanticsNodesInvalidated;
    private p5 currentlyAccessibilityFocusedANI;
    private p5 currentlyFocusedANI;
    private final o33 drawingOrder;
    private int focusedVirtualViewId;
    private int hoveredVirtualViewId = Integer.MIN_VALUE;
    private o33 idToAfterMap;
    private o33 idToBeforeMap;
    private cu4 labelToActionId;
    private final Handler legacyMainHandler;
    private eb nodeProvider;
    private tm1 onSendAccessibilityEvent;
    private r33 paneDisplayed;
    private final q33 pendingHorizontalScrollEvents;
    private fb pendingTextTraversedEvent;
    private final q33 pendingVerticalScrollEvents;
    private q33 previousSemanticsNodes;
    private ti4 previousSemanticsRoot;
    private Integer previousTraversedNode;
    private Boolean requestFromAccessibilityToolForTesting;
    private final tm1 scheduleScrollEventIfNeededLambda;
    private final List<qb4> scrollObservationScopes;
    private final Runnable semanticsChangeChecker;
    private boolean sendingFocusAffectingEvent;
    private final bq subtreeChangedLayoutNodes;
    private final ed5 urlSpanCache;
    private final AndroidComposeView view;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        p33 p33Var = n22.a;
        p33 p33Var2 = new p33(32);
        int i = p33Var2.b;
        if (i < 0) {
            dq2.J0("");
            throw null;
        }
        int i2 = i + 32;
        p33Var2.d(i2);
        int[] iArr2 = p33Var2.a;
        int i3 = p33Var2.b;
        if (i != i3) {
            dq.O0(i2, i, i3, iArr2, iArr2);
        }
        dq.S0(i, 0, 12, iArr, iArr2);
        p33Var2.b += 32;
        AccessibilityActionsResourceIds = p33Var2;
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        this.view = androidComposeView;
        final byte b = 0;
        this.onSendAccessibilityEvent = new tm1(this) { // from class: bb
            public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat J;

            {
                this.J = this;
            }

            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                boolean onSendAccessibilityEvent$lambda$0;
                wd5 scheduleScrollEventIfNeededLambda$lambda$0;
                byte b2 = b;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.J;
                switch (b2) {
                    case 0:
                        onSendAccessibilityEvent$lambda$0 = AndroidComposeViewAccessibilityDelegateCompat.onSendAccessibilityEvent$lambda$0(androidComposeViewAccessibilityDelegateCompat, (AccessibilityEvent) obj);
                        return Boolean.valueOf(onSendAccessibilityEvent$lambda$0);
                    default:
                        scheduleScrollEventIfNeededLambda$lambda$0 = AndroidComposeViewAccessibilityDelegateCompat.scheduleScrollEventIfNeededLambda$lambda$0(androidComposeViewAccessibilityDelegateCompat, (qb4) obj);
                        return scheduleScrollEventIfNeededLambda$lambda$0;
                }
            }
        };
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.accessibilityManager = (AccessibilityManager) systemService;
        this.SendRecurringAccessibilityEventsIntervalMillis = 100L;
        this.legacyMainHandler = new Handler(Looper.getMainLooper());
        this.nodeProvider = new eb(this);
        this.accessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.pendingHorizontalScrollEvents = new q33();
        this.pendingVerticalScrollEvents = new q33();
        this.actionIdToLabel = new cu4(0);
        this.labelToActionId = new cu4(0);
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new bq(0);
        final byte b2 = 1;
        this.boundsUpdateChannel = qb.g(1, 6, null);
        this.currentSemanticsNodesInvalidated = true;
        q33 q33Var = q22.a;
        q33Var.getClass();
        this.currentSemanticsNodes = q33Var;
        this.paneDisplayed = new r33();
        this.idToBeforeMap = new o33();
        this.idToAfterMap = new o33();
        this.ExtraDataTestTraversalBeforeVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.ExtraDataTestTraversalAfterVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.urlSpanCache = new ed5();
        this.previousSemanticsNodes = new q33();
        this.previousSemanticsRoot = new ti4(androidComposeView.getSemanticsOwner().a(), q33Var);
        int i = j22.a;
        this.drawingOrder = new o33();
        androidComposeView.addOnAttachStateChangeListener(this);
        this.semanticsChangeChecker = new z1(this, b2);
        this.scrollObservationScopes = new ArrayList();
        this.scheduleScrollEventIfNeededLambda = new tm1(this) { // from class: bb
            public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat J;

            {
                this.J = this;
            }

            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                boolean onSendAccessibilityEvent$lambda$0;
                wd5 scheduleScrollEventIfNeededLambda$lambda$0;
                byte b22 = b2;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.J;
                switch (b22) {
                    case 0:
                        onSendAccessibilityEvent$lambda$0 = AndroidComposeViewAccessibilityDelegateCompat.onSendAccessibilityEvent$lambda$0(androidComposeViewAccessibilityDelegateCompat, (AccessibilityEvent) obj);
                        return Boolean.valueOf(onSendAccessibilityEvent$lambda$0);
                    default:
                        scheduleScrollEventIfNeededLambda$lambda$0 = AndroidComposeViewAccessibilityDelegateCompat.scheduleScrollEventIfNeededLambda$lambda$0(androidComposeViewAccessibilityDelegateCompat, (qb4) obj);
                        return scheduleScrollEventIfNeededLambda$lambda$0;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int i, p5 p5Var, String str, Bundle bundle) {
        si4 si4Var;
        float[] cornerArray;
        vi4 vi4Var = (vi4) getCurrentSemanticsNodes().b(i);
        if (vi4Var == null || (si4Var = vi4Var.a) == null) {
            return;
        }
        wa2 wa2Var = si4Var.c;
        n43 n43Var = si4Var.d.I;
        String iterableTextForAccessibility = getIterableTextForAccessibility(si4Var);
        if (j42.c(str, this.ExtraDataTestTraversalBeforeVal)) {
            int d = this.idToBeforeMap.d(i);
            if (d != -1) {
                p5Var.a.getExtras().putInt(str, d);
                return;
            }
            return;
        }
        if (j42.c(str, this.ExtraDataTestTraversalAfterVal)) {
            int d2 = this.idToAfterMap.d(i);
            if (d2 != -1) {
                p5Var.a.getExtras().putInt(str, d2);
                return;
            }
            return;
        }
        if (n43Var.c(ii4.a) && bundle != null && j42.c(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i2 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i3 > 0 && i2 >= 0) {
                if (i2 < (iterableTextForAccessibility != null ? iterableTextForAccessibility.length() : Log.LOG_LEVEL_OFF)) {
                    RectF[] boundingBoxes = getBoundingBoxes(si4Var, i2, i3);
                    if (boundingBoxes == null) {
                        return;
                    }
                    p5Var.a.getExtras().putParcelableArray(str, boundingBoxes);
                    return;
                }
            }
            android.util.Log.e(LogTag, "Invalid arguments for accessibility character locations");
            return;
        }
        bj4 bj4Var = zi4.A;
        if (n43Var.c(bj4Var) && bundle != null && j42.c(str, ExtraDataTestTagKey)) {
            Object g = n43Var.g(bj4Var);
            String str2 = (String) (g != null ? g : null);
            if (str2 != null) {
                p5Var.a.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (j42.c(str, ExtraDataIdKey)) {
            p5Var.a.getExtras().putInt(str, si4Var.f);
            return;
        }
        if (j42.c(str, ExtraDataShapeTypeKey)) {
            Object g2 = n43Var.g(zi4.S);
            dn4 dn4Var = (dn4) (g2 != null ? g2 : null);
            if (dn4Var != null) {
                m14 shapeBounds = getShapeBounds(si4Var, getBoundsInScreen(p5Var), dn4Var);
                long c = shapeBounds.c();
                float f = shapeBounds.b;
                float f2 = shapeBounds.a;
                yg3 m31createOutline12SF9DM = m31createOutline12SF9DM(dn4Var, c, wa2Var.h0);
                if (m31createOutline12SF9DM instanceof wg3) {
                    p5Var.a.getExtras().putInt(ExtraDataShapeTypeKey, 0);
                    p5Var.a.getExtras().putParcelable(ExtraDataShapeRectKey, toAndroidRect(m31createOutline12SF9DM, f2, f));
                    return;
                }
                if (m31createOutline12SF9DM instanceof xg3) {
                    AccessibilityNodeInfo accessibilityNodeInfo = p5Var.a;
                    accessibilityNodeInfo.getExtras().putInt(ExtraDataShapeTypeKey, 1);
                    accessibilityNodeInfo.getExtras().putParcelable(ExtraDataShapeRectKey, toAndroidRect(m31createOutline12SF9DM, f2, f));
                    accessibilityNodeInfo.getExtras().putFloatArray(ExtraDataShapeRectCornersKey, toCornerArray(m31createOutline12SF9DM));
                    return;
                }
                if (!(m31createOutline12SF9DM instanceof vg3)) {
                    s83.v();
                    return;
                } else {
                    p5Var.a.getExtras().putInt(ExtraDataShapeTypeKey, 2);
                    p5Var.a.getExtras().putParcelable(ExtraDataShapeRegionKey, toRegion(m31createOutline12SF9DM, f2, f));
                    return;
                }
            }
            return;
        }
        if (j42.c(str, ExtraDataShapeRectKey)) {
            Object g3 = n43Var.g(zi4.S);
            dn4 dn4Var2 = (dn4) (g3 != null ? g3 : null);
            if (dn4Var2 != null) {
                m14 shapeBounds2 = getShapeBounds(si4Var, getBoundsInScreen(p5Var), dn4Var2);
                Rect androidRect = toAndroidRect(m31createOutline12SF9DM(dn4Var2, shapeBounds2.c(), wa2Var.h0), shapeBounds2.a, shapeBounds2.b);
                if (androidRect != null) {
                    p5Var.a.getExtras().putParcelable(ExtraDataShapeRectKey, androidRect);
                    return;
                }
                return;
            }
            return;
        }
        if (j42.c(str, ExtraDataShapeRectCornersKey)) {
            Object g4 = n43Var.g(zi4.S);
            dn4 dn4Var3 = (dn4) (g4 != null ? g4 : null);
            if (dn4Var3 == null || (cornerArray = toCornerArray(m31createOutline12SF9DM(dn4Var3, getShapeBounds(si4Var, getBoundsInScreen(p5Var), dn4Var3).c(), wa2Var.h0))) == null) {
                return;
            }
            p5Var.a.getExtras().putFloatArray(ExtraDataShapeRectCornersKey, cornerArray);
            return;
        }
        if (j42.c(str, ExtraDataShapeRegionKey)) {
            Object g5 = n43Var.g(zi4.S);
            dn4 dn4Var4 = (dn4) (g5 != null ? g5 : null);
            if (dn4Var4 != null) {
                m14 shapeBounds3 = getShapeBounds(si4Var, getBoundsInScreen(p5Var), dn4Var4);
                Region region = toRegion(m31createOutline12SF9DM(dn4Var4, shapeBounds3.c(), wa2Var.h0), shapeBounds3.a, shapeBounds3.b);
                if (region != null) {
                    p5Var.a.getExtras().putParcelable(ExtraDataShapeRegionKey, region);
                }
            }
        }
    }

    /* renamed from: adjustForReversedScrollingAndRtl-RE3cj74, reason: not valid java name */
    private final long m29adjustForReversedScrollingAndRtlRE3cj74(si4 si4Var, si4 si4Var2, long j) {
        if (pd3.c(j, 0L)) {
            return j;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        Object g = si4Var2.d.I.g(zi4.v);
        if (g == null) {
            g = null;
        }
        if (si4Var.c.h0 == da2.J) {
            intBitsToFloat = -intBitsToFloat;
        }
        Object g2 = si4Var2.d.I.g(zi4.w);
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    private final Rect boundsInScreen(vi4 vi4Var) {
        v22 v22Var = vi4Var.b;
        return toBoundsInScreen(v22Var.a, v22Var.b, v22Var.c, v22Var.d);
    }

    /* renamed from: canScroll-moWRBKg, reason: not valid java name */
    private final boolean m30canScrollmoWRBKg(p22 p22Var, boolean z, int i, long j) {
        bj4 bj4Var;
        long[] jArr;
        long[] jArr2;
        int i2;
        if (!pd3.c(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
            if (z) {
                bj4Var = zi4.w;
            } else {
                if (z) {
                    s83.v();
                    return false;
                }
                bj4Var = zi4.v;
            }
            Object[] objArr = p22Var.c;
            long[] jArr3 = p22Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i3 = 0;
                boolean z2 = false;
                while (true) {
                    long j2 = jArr3[i3];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((255 & j2) < 128) {
                                vi4 vi4Var = (vi4) objArr[(i3 << 3) + i6];
                                v22 v22Var = vi4Var.b;
                                float f = v22Var.a;
                                i2 = i4;
                                float f2 = v22Var.b;
                                jArr2 = jArr3;
                                float f3 = v22Var.c;
                                float f4 = v22Var.d;
                                float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                if ((intBitsToFloat < f3) & (intBitsToFloat >= f) & (intBitsToFloat2 >= f2) & (intBitsToFloat2 < f4)) {
                                    Object g = vi4Var.a.d.I.g(bj4Var);
                                    if (g == null) {
                                        g = null;
                                    }
                                    bb4 bb4Var = (bb4) g;
                                    if (bb4Var != null) {
                                        rm1 rm1Var = bb4Var.a;
                                        if (i < 0) {
                                            if (((Number) rm1Var.invoke()).floatValue() <= 0.0f) {
                                            }
                                            z2 = true;
                                        } else {
                                            if (((Number) rm1Var.invoke()).floatValue() >= ((Number) bb4Var.b.invoke()).floatValue()) {
                                            }
                                            z2 = true;
                                        }
                                    }
                                }
                            } else {
                                jArr2 = jArr3;
                                i2 = i4;
                            }
                            j2 >>= i2;
                            i6++;
                            i4 = i2;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i5 != i4) {
                            return z2;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i3 == length) {
                        return z2;
                    }
                    i3++;
                    jArr3 = jArr;
                }
            }
        }
        return false;
    }

    private final void checkForSemanticsChanges() {
        Trace.beginSection("Compose:semantics:sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (isEnabled$ui()) {
                sendAccessibilitySemanticsStructureChangeEvents(this.view.getSemanticsOwner().a(), this.previousSemanticsRoot);
            }
            Trace.endSection();
            Trace.beginSection("Compose:semantics:sendSemanticsPropertyChangeEvents");
            try {
                sendSemanticsPropertyChangeEvents(getCurrentSemanticsNodes());
                Trace.endSection();
                Trace.beginSection("Compose:semantics:updateSemanticsNodesCopyAndPanes");
                try {
                    updateSemanticsNodesCopyAndPanes();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    private final boolean clearAccessibilityFocus(int i) {
        if (!isAccessibilityFocused(i)) {
            return false;
        }
        this.accessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.currentlyAccessibilityFocusedANI = null;
        this.view.invalidate();
        sendEventForVirtualView$default(this, i, 65536, null, null, 12, null);
        return true;
    }

    private final AccessibilityEvent createEvent(int i, int i2) {
        vi4 vi4Var;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName(ClassName);
        obtain.setPackageName(this.view.getContext().getPackageName());
        obtain.setSource(this.view, i);
        if (isEnabled$ui() && (vi4Var = (vi4) getCurrentSemanticsNodes().b(i)) != null) {
            si4 si4Var = vi4Var.a;
            obtain.setPassword(si4Var.d.I.c(zi4.N));
            Object g = si4Var.d.I.g(zi4.o);
            if (g == null) {
                g = null;
            }
            a5.T(obtain, j42.c(g, Boolean.TRUE));
        }
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p5 createNodeInfo(int i) {
        if (((xi2) this.view.getComposeViewContext().d().k()).i == ki2.I) {
            return emptyNodeInfoOrNull();
        }
        vi4 vi4Var = (vi4) getCurrentSemanticsNodes().b(i);
        if (vi4Var == null) {
            return emptyNodeInfoOrNull();
        }
        si4 si4Var = vi4Var.a;
        Object g = si4Var.k().I.g(zi4.o);
        if (g == null) {
            g = null;
        }
        boolean c = j42.c(g, Boolean.TRUE);
        if (c && !isRequestFromAccessibilityTool()) {
            return null;
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        p5 p5Var = new p5(obtain);
        if (Build.VERSION.SDK_INT >= 34) {
            i5.f(obtain, c);
        } else {
            p5Var.h(64, c);
        }
        if (i == -1) {
            Object parentForAccessibility = this.view.getParentForAccessibility();
            View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
            p5Var.b = -1;
            obtain.setParent(view);
        } else {
            si4 l = si4Var.l();
            Integer valueOf = l != null ? Integer.valueOf(l.f) : null;
            if (valueOf == null) {
                q02.c("semanticsNode " + i + " has null parent");
                zy.n();
                return null;
            }
            int intValue = valueOf.intValue();
            int i2 = intValue != this.view.getSemanticsOwner().a().f ? intValue : -1;
            AndroidComposeView androidComposeView = this.view;
            p5Var.b = i2;
            obtain.setParent(androidComposeView, i2);
        }
        AndroidComposeView androidComposeView2 = this.view;
        p5Var.c = i;
        obtain.setSource(androidComposeView2, i);
        obtain.setBoundsInScreen(boundsInScreen(vi4Var));
        populateAccessibilityNodeInfoProperties(i, p5Var, si4Var);
        return p5Var;
    }

    /* renamed from: createOutline-12SF9DM, reason: not valid java name */
    private final yg3 m31createOutline12SF9DM(dn4 dn4Var, long j, da2 da2Var) {
        return dn4Var.a(j, da2Var, this.view.getDensity());
    }

    private final AccessibilityEvent createTextSelectionChangedEvent(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent createEvent = createEvent(i, 8192);
        if (num != null) {
            createEvent.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            createEvent.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            createEvent.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            createEvent.getText().add(charSequence);
        }
        return createEvent;
    }

    private final p5 emptyNodeInfoOrNull() {
        if (this.accessibilityManager.isEnabled()) {
            return null;
        }
        return new p5(AccessibilityNodeInfo.obtain());
    }

    private final int getAccessibilitySelectionEnd(si4 si4Var) {
        ki4 ki4Var = si4Var.d;
        if (!ki4Var.I.c(zi4.a)) {
            bj4 bj4Var = zi4.H;
            if (ki4Var.I.c(bj4Var)) {
                return (int) (((d65) ki4Var.e(bj4Var)).a & 4294967295L);
            }
        }
        return this.accessibilityCursorPosition;
    }

    private final int getAccessibilitySelectionStart(si4 si4Var) {
        ki4 ki4Var = si4Var.d;
        if (!ki4Var.I.c(zi4.a)) {
            bj4 bj4Var = zi4.H;
            if (ki4Var.I.c(bj4Var)) {
                return (int) (((d65) ki4Var.e(bj4Var)).a >> 32);
            }
        }
        return this.accessibilityCursorPosition;
    }

    private final RectF[] getBoundingBoxes(si4 si4Var, int i, int i2) {
        long j;
        u55 u = ad4.u(si4Var.d);
        if (u == null) {
            return null;
        }
        x02 x02Var = si4Var.c.n0.c;
        if (!x02Var.h()) {
            x02Var = null;
        }
        if (x02Var == null) {
            return null;
        }
        long M = x02Var.M(0L);
        m14 g = si4Var.g();
        RectF[] rectFArr = new RectF[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i + i3;
            if (i4 < u.e().c().J.length()) {
                m14 i5 = u.b(i4).i(M);
                m14 e = i5.g(g) ? i5.e(g) : null;
                if (e != null) {
                    AndroidComposeView androidComposeView = this.view;
                    float f = e.a;
                    long mo21localToScreenMKHz9U = androidComposeView.mo21localToScreenMKHz9U((Float.floatToRawIntBits(e.b) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    AndroidComposeView androidComposeView2 = this.view;
                    float f2 = e.c;
                    j = M;
                    long mo21localToScreenMKHz9U2 = androidComposeView2.mo21localToScreenMKHz9U((Float.floatToRawIntBits(e.d) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    int i6 = (int) (mo21localToScreenMKHz9U >> 32);
                    int i7 = (int) (mo21localToScreenMKHz9U2 >> 32);
                    int i8 = (int) (mo21localToScreenMKHz9U & 4294967295L);
                    int i9 = (int) (mo21localToScreenMKHz9U2 & 4294967295L);
                    rectFArr[i3] = new RectF(Math.min(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7)), Math.min(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), Math.max(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7)), Math.max(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)));
                    i3++;
                    M = j;
                }
            }
            j = M;
            i3++;
            M = j;
        }
        return rectFArr;
    }

    private final Rect getBoundsInScreen(p5 p5Var) {
        Rect rect = new Rect();
        p5Var.a.getBoundsInScreen(rect);
        return rect;
    }

    private final p22 getCurrentSemanticsNodes() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = mw2.C(this.view.getSemanticsOwner(), new q4((byte) 2));
            if (isEnabled$ui()) {
                p22 p22Var = this.currentSemanticsNodes;
                o33 o33Var = this.idToBeforeMap;
                o33 o33Var2 = this.idToAfterMap;
                Resources resources = this.view.getContext().getResources();
                o33Var.a();
                o33Var2.a();
                vi4 vi4Var = (vi4) p22Var.b(-1);
                si4 si4Var = vi4Var != null ? vi4Var.a : null;
                si4Var.getClass();
                ArrayList b = dj4.b(si4Var, new v1((Object) p22Var, (byte) 6), new v1((Object) resources, (byte) 7), p70.j0(si4Var));
                int i = 1;
                int size = b.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((si4) b.get(i - 1)).f;
                        int i3 = ((si4) b.get(i)).f;
                        o33Var.f(i2, i3);
                        o33Var2.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.currentSemanticsNodes;
    }

    private final List<AccessibilityServiceInfo> getEnabledServices() {
        List list = this._enabledServices;
        if (list != null) {
            return list;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this._enabledServices = enabledAccessibilityServiceList;
        return enabledAccessibilityServiceList;
    }

    private final Handler getHandler() {
        return this.view.getHandler();
    }

    private final String getIterableTextForAccessibility(si4 si4Var) {
        oj ojVar;
        if (si4Var != null) {
            ki4 ki4Var = si4Var.d;
            n43 n43Var = ki4Var.I;
            bj4 bj4Var = zi4.a;
            if (n43Var.c(bj4Var)) {
                return dl2.a((List) ki4Var.e(bj4Var), ",", null, 62);
            }
            if (n43Var.c(zi4.G)) {
                oj textForTextField = getTextForTextField(ki4Var);
                if (textForTextField != null) {
                    return textForTextField.J;
                }
            } else {
                Object g = n43Var.g(zi4.C);
                if (g == null) {
                    g = null;
                }
                List list = (List) g;
                if (list != null && (ojVar = (oj) o70.U0(list)) != null) {
                    return ojVar.J;
                }
            }
        }
        return null;
    }

    private final g5 getIteratorForGranularity(si4 si4Var, int i) {
        u55 u;
        if (si4Var == null) {
            return null;
        }
        ki4 ki4Var = si4Var.d;
        String iterableTextForAccessibility = getIterableTextForAccessibility(si4Var);
        if (iterableTextForAccessibility == null || iterableTextForAccessibility.length() == 0) {
            return null;
        }
        if (i == 1) {
            d5 N = c5.N(this.view.getContext().getResources().getConfiguration().locale);
            N.j(iterableTextForAccessibility);
            return N;
        }
        if (i == 2) {
            d5 O = c5.O(this.view.getContext().getResources().getConfiguration().locale);
            O.j(iterableTextForAccessibility);
            return O;
        }
        if (i != 4) {
            if (i == 8) {
                f5 L = a5.L();
                L.j(iterableTextForAccessibility);
                return L;
            }
            if (i != 16) {
                return null;
            }
        }
        if (!ki4Var.I.c(ii4.a) || (u = ad4.u(ki4Var)) == null) {
            return null;
        }
        if (i == 4) {
            d5 z = d4.z();
            z.n(iterableTextForAccessibility, u);
            return z;
        }
        e5 I = g4.I();
        I.n(iterableTextForAccessibility, u, si4Var);
        return I;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [k13] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [k13] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [b53] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [b53] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    private final m14 getShapeBounds(si4 si4Var, Rect rect, dn4 dn4Var) {
        k13 node;
        hb hbVar = new hb(dn4Var);
        wa2 wa2Var = si4Var.c;
        ja3 ja3Var = wa2Var.n0;
        pi4 pi4Var = null;
        if ((ja3Var.f.getAggregateChildKindSet$ui() & 8) != 0) {
            k13 k13Var = ja3Var.f;
            loop0: while (true) {
                if (k13Var != null) {
                    if ((k13Var.getKindSet$ui() & 8) != 0) {
                        wt0 wt0Var = k13Var;
                        ?? r5 = 0;
                        while (wt0Var != 0) {
                            if (wt0Var instanceof pi4) {
                                wt0Var.applySemantics(hbVar);
                                if (hbVar.a()) {
                                    pi4Var = wt0Var;
                                    break loop0;
                                }
                            } else if ((wt0Var.getKindSet$ui() & 8) != 0 && (wt0Var instanceof wt0)) {
                                k13 k13Var2 = wt0Var.J;
                                int i = 0;
                                wt0Var = wt0Var;
                                r5 = r5;
                                while (k13Var2 != null) {
                                    if ((k13Var2.getKindSet$ui() & 8) != 0) {
                                        i++;
                                        r5 = r5;
                                        if (i == 1) {
                                            wt0Var = k13Var2;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new b53(new k13[16]);
                                            }
                                            if (wt0Var != 0) {
                                                r5.c(wt0Var);
                                                wt0Var = 0;
                                            }
                                            r5.c(k13Var2);
                                        }
                                    }
                                    k13Var2 = k13Var2.getChild$ui();
                                    wt0Var = wt0Var;
                                    r5 = r5;
                                }
                                if (i == 1) {
                                }
                            }
                            wt0Var = ut0.M(r5);
                        }
                    }
                    if ((k13Var.getAggregateChildKindSet$ui() & 8) == 0) {
                        break;
                    }
                    k13Var = k13Var.getChild$ui();
                } else {
                    break;
                }
            }
        }
        pi4 pi4Var2 = pi4Var;
        if (pi4Var2 == null || (node = pi4Var2.getNode()) == null || !node.isAttached()) {
            return mu0.i(wa2Var.n0.d, false);
        }
        na3 T = ut0.T(pi4Var2);
        m14 J = mu0.q(T).J(T, false);
        return toBoundsRelativeToNodeBounds(toBoundsInScreen(J.a, J.b, J.c, J.d), rect);
    }

    private final oj getTextForTextField(ki4 ki4Var) {
        bj4 bj4Var = zi4.a;
        return (oj) li4.f(ki4Var, zi4.G);
    }

    private final boolean isAccessibilityFocused(int i) {
        return this.accessibilityFocusedVirtualViewId == i;
    }

    private final boolean isAccessibilitySelectionExtendable(si4 si4Var) {
        if (si4Var.d.I.c(zi4.a)) {
            return false;
        }
        return si4Var.d.I.c(zi4.G);
    }

    private final boolean isRequestFromAccessibilityTool() {
        Boolean bool = this.requestFromAccessibilityToolForTesting;
        if (j42.c(bool, Boolean.TRUE)) {
            return true;
        }
        if (j42.c(bool, Boolean.FALSE)) {
            return false;
        }
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (Build.VERSION.SDK_INT >= 34) {
            return i5.e(accessibilityManager);
        }
        return true;
    }

    private final boolean isTouchExplorationEnabled() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled();
    }

    private final void notifySubtreeAccessibilityStateChangedIfNeeded(wa2 wa2Var) {
        if (this.subtreeChangedLayoutNodes.add(wa2Var)) {
            this.boundsUpdateChannel.d(wd5.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSendAccessibilityEvent$lambda$0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, AccessibilityEvent accessibilityEvent) {
        return androidComposeViewAccessibilityDelegateCompat.view.getParent().requestSendAccessibilityEvent(androidComposeViewAccessibilityDelegateCompat.view, accessibilityEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0245  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performActionHelper(int r18, int r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 1416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.performActionHelper(int, int, android.os.Bundle):boolean");
    }

    private static final boolean performActionHelper$canScroll(bb4 bb4Var, float f) {
        if (f >= 0.0f || ((Number) bb4Var.a.invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) bb4Var.a.invoke()).floatValue() < ((Number) bb4Var.b.invoke()).floatValue();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r14.isEmpty() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x045b, code lost:
    
        if (defpackage.j42.c(r9, r12) == false) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x049b, code lost:
    
        if (r9 == false) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01af, code lost:
    
        if (r10.isEmpty() != false) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void populateAccessibilityNodeInfoProperties(int r24, defpackage.p5 r25, defpackage.si4 r26) {
        /*
            Method dump skipped, instructions count: 2555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.populateAccessibilityNodeInfoProperties(int, p5, si4):void");
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollBackward(bb4 bb4Var) {
        if (((Number) bb4Var.a.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) bb4Var.a.invoke()).floatValue();
        ((Number) bb4Var.b.invoke()).floatValue();
        return false;
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollForward(bb4 bb4Var) {
        if (((Number) bb4Var.a.invoke()).floatValue() < ((Number) bb4Var.b.invoke()).floatValue()) {
            return true;
        }
        ((Number) bb4Var.a.invoke()).floatValue();
        return false;
    }

    private final boolean registerScrollingId(int i, List<qb4> list) {
        boolean z;
        qb4 o = ad4.o(i, list);
        if (o != null) {
            z = false;
        } else {
            o = new qb4(i, this.scrollObservationScopes);
            z = true;
        }
        this.scrollObservationScopes.add(o);
        return z;
    }

    private final boolean requestAccessibilityFocus(int i) {
        if (!isTouchExplorationEnabled() || isAccessibilityFocused(i)) {
            return false;
        }
        int i2 = this.accessibilityFocusedVirtualViewId;
        if (i2 != Integer.MIN_VALUE) {
            sendEventForVirtualView$default(this, i2, 65536, null, null, 12, null);
        }
        this.accessibilityFocusedVirtualViewId = i;
        this.view.invalidate();
        sendEventForVirtualView$default(this, i, 32768, null, null, 12, null);
        return true;
    }

    private final void resetEnabledAccessibilityServiceList() {
        this._enabledServices = null;
    }

    private final void scheduleScrollEventIfNeeded(qb4 qb4Var) {
        if (qb4Var.l()) {
            sh3 snapshotObserver = this.view.getSnapshotObserver();
            snapshotObserver.a.d(qb4Var, this.scheduleScrollEventIfNeededLambda, new ka(qb4Var, this, (byte) 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 scheduleScrollEventIfNeeded$lambda$0(qb4 qb4Var, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        si4 si4Var;
        wa2 wa2Var;
        bb4 a = qb4Var.a();
        bb4 e = qb4Var.e();
        Float b = qb4Var.b();
        Float c = qb4Var.c();
        float floatValue = (a == null || b == null) ? 0.0f : ((Number) a.a.invoke()).floatValue() - b.floatValue();
        float floatValue2 = (e == null || c == null) ? 0.0f : ((Number) e.a.invoke()).floatValue() - c.floatValue();
        if (floatValue != 0.0f || floatValue2 != 0.0f) {
            int semanticsNodeIdToAccessibilityVirtualNodeId = androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(qb4Var.d());
            vi4 vi4Var = (vi4) androidComposeViewAccessibilityDelegateCompat.getCurrentSemanticsNodes().b(androidComposeViewAccessibilityDelegateCompat.accessibilityFocusedVirtualViewId);
            if (vi4Var != null) {
                try {
                    p5 p5Var = androidComposeViewAccessibilityDelegateCompat.currentlyAccessibilityFocusedANI;
                    if (p5Var != null) {
                        p5Var.a.setBoundsInScreen(androidComposeViewAccessibilityDelegateCompat.boundsInScreen(vi4Var));
                    }
                } catch (IllegalStateException unused) {
                }
            }
            vi4 vi4Var2 = (vi4) androidComposeViewAccessibilityDelegateCompat.getCurrentSemanticsNodes().b(androidComposeViewAccessibilityDelegateCompat.focusedVirtualViewId);
            if (vi4Var2 != null) {
                try {
                    p5 p5Var2 = androidComposeViewAccessibilityDelegateCompat.currentlyFocusedANI;
                    if (p5Var2 != null) {
                        p5Var2.a.setBoundsInScreen(androidComposeViewAccessibilityDelegateCompat.boundsInScreen(vi4Var2));
                    }
                } catch (IllegalStateException unused2) {
                }
            }
            androidComposeViewAccessibilityDelegateCompat.view.invalidate();
            vi4 vi4Var3 = (vi4) androidComposeViewAccessibilityDelegateCompat.getCurrentSemanticsNodes().b(semanticsNodeIdToAccessibilityVirtualNodeId);
            if (vi4Var3 != null && (si4Var = vi4Var3.a) != null && (wa2Var = si4Var.c) != null) {
                if (a != null) {
                    androidComposeViewAccessibilityDelegateCompat.pendingHorizontalScrollEvents.i(semanticsNodeIdToAccessibilityVirtualNodeId, a);
                }
                if (e != null) {
                    androidComposeViewAccessibilityDelegateCompat.pendingVerticalScrollEvents.i(semanticsNodeIdToAccessibilityVirtualNodeId, e);
                }
                androidComposeViewAccessibilityDelegateCompat.notifySubtreeAccessibilityStateChangedIfNeeded(wa2Var);
            }
        }
        if (a != null) {
            qb4Var.g((Float) a.a.invoke());
        }
        if (e != null) {
            qb4Var.h((Float) e.a.invoke());
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 scheduleScrollEventIfNeededLambda$lambda$0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, qb4 qb4Var) {
        androidComposeViewAccessibilityDelegateCompat.scheduleScrollEventIfNeeded(qb4Var);
        return wd5.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* renamed from: scrollDxDyForNodeVisible-RE3cj74, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long m32scrollDxDyForNodeVisibleRE3cj74(defpackage.si4 r5, defpackage.si4 r6, long r7) {
        /*
            r4 = this;
            wa2 r4 = r6.c
            ja3 r4 = r4.n0
            x02 r4 = r4.c
            m14 r4 = defpackage.mu0.h(r4)
            wa2 r6 = r6.c
            ja3 r6 = r6.n0
            x02 r6 = r6.c
            ca2 r6 = r6.C()
            r0 = 0
            if (r6 == 0) goto L1f
            na3 r6 = (defpackage.na3) r6
            long r2 = r6.M(r0)
            goto L20
        L1f:
            r2 = r0
        L20:
            m14 r4 = r4.i(r2)
            na3 r6 = r5.d()
            if (r6 == 0) goto L39
            boolean r2 = r6.h()
            if (r2 == 0) goto L31
            goto L32
        L31:
            r6 = 0
        L32:
            if (r6 == 0) goto L39
            long r2 = r6.M(r0)
            goto L3a
        L39:
            r2 = r0
        L3a:
            long r6 = defpackage.pd3.f(r2, r7)
            na3 r5 = r5.d()
            if (r5 == 0) goto L46
            long r0 = r5.K
        L46:
            long r0 = defpackage.ut0.b0(r0)
            m14 r5 = defpackage.sv2.g(r6, r0)
            float r6 = r5.a
            float r7 = r4.a
            float r6 = r6 - r7
            float r7 = r5.c
            float r8 = r4.c
            float r7 = r7 - r8
            float r6 = scrollDxDyForNodeVisible_RE3cj74$scrollDelta(r6, r7)
            float r7 = r5.b
            float r8 = r4.b
            float r7 = r7 - r8
            float r5 = r5.d
            float r4 = r4.d
            float r5 = r5 - r4
            float r4 = scrollDxDyForNodeVisible_RE3cj74$scrollDelta(r7, r5)
            int r5 = java.lang.Float.floatToRawIntBits(r6)
            long r5 = (long) r5
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r7 = (long) r4
            r4 = 32
            long r4 = r5 << r4
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r0
            long r4 = r4 | r7
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m32scrollDxDyForNodeVisibleRE3cj74(si4, si4, long):long");
    }

    private static final float scrollDxDyForNodeVisible_RE3cj74$scrollDelta(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            return Math.abs(f) < Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x001c, code lost:
    
        r4 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean scrollOntoScreen(defpackage.si4 r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            si4 r2 = r1.l()
            r3 = 0
            if (r2 == 0) goto L1b
            ki4 r4 = r2.d
            bj4 r5 = defpackage.ii4.d
            n43 r4 = r4.I
            java.lang.Object r4 = r4.g(r5)
            if (r4 != 0) goto L18
            r4 = r3
        L18:
            v4 r4 = (defpackage.v4) r4
            goto L1c
        L1b:
            r4 = r3
        L1c:
            if (r4 != 0) goto L36
            if (r2 == 0) goto L36
            si4 r2 = r2.l()
            if (r2 == 0) goto L1b
            ki4 r4 = r2.d
            bj4 r5 = defpackage.ii4.d
            n43 r4 = r4.I
            java.lang.Object r4 = r4.g(r5)
            if (r4 != 0) goto L33
            r4 = r3
        L33:
            v4 r4 = (defpackage.v4) r4
            goto L1c
        L36:
            if (r2 != 0) goto L72
            m14 r1 = r1.g()
            android.graphics.Rect r2 = new android.graphics.Rect
            float r3 = r1.a
            double r3 = (double) r3
            double r3 = java.lang.Math.floor(r3)
            float r3 = (float) r3
            int r3 = (int) r3
            float r4 = r1.b
            double r4 = (double) r4
            double r4 = java.lang.Math.floor(r4)
            float r4 = (float) r4
            int r4 = (int) r4
            float r5 = r1.c
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            float r5 = (float) r5
            int r5 = defpackage.mw2.P(r5)
            float r1 = r1.d
            double r6 = (double) r1
            double r6 = java.lang.Math.ceil(r6)
            float r1 = (float) r6
            int r1 = defpackage.mw2.P(r1)
            r2.<init>(r3, r4, r5, r1)
            androidx.compose.ui.platform.AndroidComposeView r0 = r0.view
            boolean r0 = r0.requestRectangleOnScreen(r2)
            return r0
        L72:
            r4 = 0
            r5 = 0
            r7 = r4
        L76:
            if (r2 == 0) goto Lcf
            ki4 r8 = r2.d
            bj4 r9 = defpackage.ii4.d
            n43 r8 = r8.I
            java.lang.Object r8 = r8.g(r9)
            if (r8 != 0) goto L85
            r8 = r3
        L85:
            v4 r8 = (defpackage.v4) r8
            if (r8 == 0) goto Lca
            long r9 = r0.m32scrollDxDyForNodeVisibleRE3cj74(r1, r2, r5)
            long r11 = r0.m29adjustForReversedScrollingAndRtlRE3cj74(r1, r2, r9)
            dn1 r8 = r8.b
            hn1 r8 = (defpackage.hn1) r8
            r13 = 1
            if (r8 == 0) goto Lc1
            r14 = 32
            long r14 = r11 >> r14
            int r14 = (int) r14
            float r14 = java.lang.Float.intBitsToFloat(r14)
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            r15 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r11 = r11 & r15
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            java.lang.Object r8 = r8.invoke(r14, r11)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != r13) goto Lc1
            goto Lc3
        Lc1:
            if (r7 == 0) goto Lc5
        Lc3:
            r7 = r13
            goto Lc6
        Lc5:
            r7 = r4
        Lc6:
            long r5 = defpackage.pd3.e(r5, r9)
        Lca:
            si4 r2 = r2.l()
            goto L76
        Lcf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.scrollOntoScreen(si4):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void semanticsChangeChecker$lambda$0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        Trace.beginSection("Compose:semantics:measureAndLayout");
        try {
            androidComposeViewAccessibilityDelegateCompat.view.measureAndLayout(true);
            Trace.endSection();
            Trace.beginSection("Compose:semantics:checkForSemanticsChanges");
            try {
                androidComposeViewAccessibilityDelegateCompat.checkForSemanticsChanges();
                Trace.endSection();
                androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges = false;
            } finally {
            }
        } finally {
        }
    }

    private final int semanticsNodeIdToAccessibilityVirtualNodeId(int i) {
        if (i == this.view.getSemanticsOwner().a().f) {
            return -1;
        }
        return i;
    }

    private final void sendAccessibilitySemanticsStructureChangeEvents(si4 si4Var, ti4 ti4Var) {
        List i;
        List i2;
        int[] iArr = y22.a;
        r33 r33Var = new r33();
        si4Var.getClass();
        i = si4Var.i((r4 & 1) != 0 ? !si4Var.b : false, (r4 & 2) == 0);
        wa2 wa2Var = si4Var.c;
        int size = i.size();
        for (int i3 = 0; i3 < size; i3++) {
            si4 si4Var2 = (si4) i.get(i3);
            p22 currentSemanticsNodes = getCurrentSemanticsNodes();
            int i4 = si4Var2.f;
            if (currentSemanticsNodes.a(i4)) {
                if (!ti4Var.b.c(i4)) {
                    notifySubtreeAccessibilityStateChangedIfNeeded(wa2Var);
                    return;
                }
                r33Var.a(i4);
            }
        }
        r33 r33Var2 = ti4Var.b;
        int[] iArr2 = r33Var2.b;
        long[] jArr = r33Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j = jArr[i5];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j) < 128 && !r33Var.c(iArr2[(i5 << 3) + i7])) {
                            notifySubtreeAccessibilityStateChangedIfNeeded(wa2Var);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i5 == length) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        i2 = si4Var.i((r4 & 1) != 0 ? !si4Var.b : false, (r4 & 2) == 0);
        int size2 = i2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            si4 si4Var3 = (si4) i2.get(i8);
            ti4 ti4Var2 = (ti4) this.previousSemanticsNodes.b(si4Var3.f);
            if (ti4Var2 != null && getCurrentSemanticsNodes().a(si4Var3.f)) {
                sendAccessibilitySemanticsStructureChangeEvents(si4Var3, ti4Var2);
            }
        }
    }

    private final boolean sendEvent(AccessibilityEvent accessibilityEvent) {
        if (!isEnabled$ui()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.sendingFocusAffectingEvent = true;
        }
        try {
            return ((Boolean) this.onSendAccessibilityEvent.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.sendingFocusAffectingEvent = false;
        }
    }

    private final boolean sendEventForVirtualView(int i, int i2, Integer num, List<String> list) {
        if (i == Integer.MIN_VALUE || !isEnabled$ui()) {
            return false;
        }
        AccessibilityEvent createEvent = createEvent(i, i2);
        if (num != null) {
            createEvent.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            createEvent.setContentDescription(dl2.a(list, ",", null, 62));
        }
        return sendEvent(createEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean sendEventForVirtualView$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i, int i2, Integer num, List list, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        if ((i3 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(i, i2, num, list);
    }

    private final void sendPaneChangeEvents(int i, int i2, String str) {
        AccessibilityEvent createEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(i), 32);
        createEvent.setContentChangeTypes(i2);
        if (str != null) {
            createEvent.getText().add(str);
        }
        sendEvent(createEvent);
    }

    private final void sendPendingTextTraversedAtGranularityEvent(int i) {
        fb fbVar = this.pendingTextTraversedEvent;
        if (fbVar != null) {
            if (i != fbVar.d().f) {
                return;
            }
            if (SystemClock.uptimeMillis() - fbVar.f() <= 1000) {
                AccessibilityEvent createEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(fbVar.d().f), 131072);
                createEvent.setFromIndex(fbVar.b());
                createEvent.setToIndex(fbVar.e());
                createEvent.setAction(fbVar.a());
                createEvent.setMovementGranularity(fbVar.c());
                createEvent.getText().add(getIterableTextForAccessibility(fbVar.d()));
                sendEvent(createEvent);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:207:0x0508, code lost:
    
        if (r2.isEmpty() != false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x053e, code lost:
    
        if (r5 != null) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0543, code lost:
    
        if (r5 == null) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010c, code lost:
    
        if (defpackage.j42.c(r4, r3) != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void sendSemanticsPropertyChangeEvents(defpackage.p22 r57) {
        /*
            Method dump skipped, instructions count: 1810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSemanticsPropertyChangeEvents(p22):void");
    }

    private final void sendSubtreeChangeAccessibilityEvents(wa2 wa2Var, r33 r33Var) {
        ki4 x;
        if (wa2Var.K() && !this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(wa2Var)) {
            wa2 wa2Var2 = null;
            if (!wa2Var.n0.c(8)) {
                wa2Var = wa2Var.v();
                while (true) {
                    if (wa2Var == null) {
                        wa2Var = null;
                        break;
                    } else if (wa2Var.n0.c(8)) {
                        break;
                    } else {
                        wa2Var = wa2Var.v();
                    }
                }
            }
            if (wa2Var == null || (x = wa2Var.x()) == null) {
                return;
            }
            if (!x.K) {
                wa2 v = wa2Var.v();
                while (true) {
                    if (v != null) {
                        ki4 x2 = v.x();
                        if (x2 != null && x2.K) {
                            wa2Var2 = v;
                            break;
                        }
                        v = v.v();
                    } else {
                        break;
                    }
                }
                if (wa2Var2 != null) {
                    wa2Var = wa2Var2;
                }
            }
            int i = wa2Var.J;
            if (r33Var.a(i)) {
                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(i), 2048, 1, null, 8, null);
            }
        }
    }

    private final void sendTypeViewScrolledAccessibilityEvent(wa2 wa2Var) {
        if (wa2Var.K() && !this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(wa2Var)) {
            int i = wa2Var.J;
            bb4 bb4Var = (bb4) this.pendingHorizontalScrollEvents.b(i);
            bb4 bb4Var2 = (bb4) this.pendingVerticalScrollEvents.b(i);
            if (bb4Var == null && bb4Var2 == null) {
                return;
            }
            AccessibilityEvent createEvent = createEvent(i, 4096);
            if (bb4Var != null) {
                createEvent.setScrollX((int) ((Number) bb4Var.a.invoke()).floatValue());
                createEvent.setMaxScrollX((int) ((Number) bb4Var.b.invoke()).floatValue());
            }
            if (bb4Var2 != null) {
                createEvent.setScrollY((int) ((Number) bb4Var2.a.invoke()).floatValue());
                createEvent.setMaxScrollY((int) ((Number) bb4Var2.b.invoke()).floatValue());
            }
            sendEvent(createEvent);
        }
    }

    private final boolean setAccessibilitySelection(si4 si4Var, int i, int i2, boolean z) {
        String iterableTextForAccessibility;
        ki4 ki4Var = si4Var.d;
        int i3 = si4Var.f;
        bj4 bj4Var = ii4.j;
        if (ki4Var.I.c(bj4Var) && p70.N(si4Var)) {
            in1 in1Var = (in1) ((v4) si4Var.d.e(bj4Var)).b;
            if (in1Var != null) {
                return ((Boolean) in1Var.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.accessibilityCursorPosition) && (iterableTextForAccessibility = getIterableTextForAccessibility(si4Var)) != null) {
            if (i < 0 || i != i2 || i2 > iterableTextForAccessibility.length()) {
                i = -1;
            }
            this.accessibilityCursorPosition = i;
            boolean z2 = iterableTextForAccessibility.length() > 0;
            sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(i3), z2 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z2 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z2 ? Integer.valueOf(iterableTextForAccessibility.length()) : null, iterableTextForAccessibility));
            sendPendingTextTraversedAtGranularityEvent(i3);
            return true;
        }
        return false;
    }

    private final void setContentInvalid(si4 si4Var, p5 p5Var) {
        ki4 ki4Var = si4Var.d;
        bj4 bj4Var = zi4.O;
        if (ki4Var.I.c(bj4Var)) {
            p5Var.a.setContentInvalid(true);
            Object g = si4Var.d.I.g(bj4Var);
            if (g == null) {
                g = null;
            }
            p5Var.a.setError((CharSequence) g);
        }
    }

    private final void setInvisibleIfEmptyBounds(p5 p5Var, si4 si4Var) {
        if (si4Var.m().f()) {
            p5Var.a.setVisibleToUser(false);
        }
    }

    private final void setText(si4 si4Var, p5 p5Var) {
        oj V = p70.V(si4Var);
        p5Var.a.setText(V != null ? toSpannableString(V) : null);
    }

    private final Rect toAndroidRect(m14 m14Var, float f, float f2) {
        return new Rect((int) (m14Var.a + f), (int) (m14Var.b + f2), (int) (m14Var.c + f), (int) (m14Var.d + f2));
    }

    public static /* synthetic */ Rect toAndroidRect$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, m14 m14Var, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return androidComposeViewAccessibilityDelegateCompat.toAndroidRect(m14Var, f, f2);
    }

    private final Rect toBoundsInScreen(float f, float f2, float f3, float f4) {
        long mo21localToScreenMKHz9U = this.view.mo21localToScreenMKHz9U((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        long mo21localToScreenMKHz9U2 = this.view.mo21localToScreenMKHz9U((Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (mo21localToScreenMKHz9U >> 32);
        int i2 = (int) (mo21localToScreenMKHz9U2 >> 32);
        int i3 = (int) (mo21localToScreenMKHz9U & 4294967295L);
        int i4 = (int) (mo21localToScreenMKHz9U2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    private final m14 toBoundsRelativeToNodeBounds(Rect rect, Rect rect2) {
        float f = rect.left - rect2.left;
        float f2 = rect.top - rect2.top;
        return new m14(f, f2, rect.width() + f, rect.height() + f2);
    }

    private final float[] toCornerArray(yg3 yg3Var) {
        if (!(yg3Var instanceof xg3)) {
            return null;
        }
        h74 h74Var = ((xg3) yg3Var).a;
        long j = h74Var.h;
        long j2 = h74Var.g;
        long j3 = h74Var.f;
        long j4 = h74Var.e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    private final Region toRegion(yg3 yg3Var, float f, float f2) {
        if (yg3Var instanceof vg3) {
            vg3 vg3Var = (vg3) yg3Var;
            Region region = new Region(toAndroidRect$default(this, vg3Var.a().h(f, f2), 0.0f, 0.0f, 3, null));
            Region region2 = new Region();
            yd ydVar = vg3Var.a;
            if (ydVar instanceof yd) {
                Path path = ydVar.a;
                path.offset(f, f2);
                region2.setPath(path, region);
                return region2;
            }
            zy.p("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [o91] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    private final SpannableString toSpannableString(oj ojVar) {
        ArrayList arrayList;
        int i;
        this.view.getFontFamilyResolver();
        iu0 density = this.view.getDensity();
        ed5 ed5Var = this.urlSpanCache;
        String str = ojVar.J;
        List list = ojVar.I;
        SpannableString spannableString = new SpannableString(str);
        ArrayList arrayList2 = ojVar.K;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                nj njVar = (nj) arrayList2.get(i2);
                yt4 yt4Var = (yt4) njVar.a();
                int b = njVar.b();
                int c = njVar.c();
                int i3 = size;
                long a = yt4Var.a.a();
                long j = yt4Var.b;
                qk1 qk1Var = yt4Var.c;
                lk1 lk1Var = yt4Var.d;
                String str2 = str;
                h55 h55Var = yt4Var.j;
                ArrayList arrayList3 = arrayList2;
                tq2 tq2Var = yt4Var.k;
                long j2 = yt4Var.l;
                m35 m35Var = yt4Var.m;
                g55 g55Var = yt4Var.a;
                long a2 = g55Var.a();
                int i4 = x70.h;
                li4.l(spannableString, (zc5.a(a, a2) ? g55Var : a != 16 ? new t90(a) : f55.a).a(), b, c);
                li4.n(spannableString, j, density, b, c);
                if (qk1Var == null && lk1Var == null) {
                    i = 33;
                } else {
                    StyleSpan styleSpan = new StyleSpan(a5.D(lk1Var != null ? lk1Var.a : 0, qk1Var == null ? qk1.M : qk1Var));
                    i = 33;
                    spannableString.setSpan(styleSpan, b, c, 33);
                }
                if (m35Var != null) {
                    int i5 = m35Var.a;
                    if ((i5 | 1) == i5) {
                        spannableString.setSpan(new UnderlineSpan(), b, c, i);
                    }
                    if ((i5 | 2) == i5) {
                        spannableString.setSpan(new StrikethroughSpan(), b, c, i);
                    }
                }
                if (h55Var != null) {
                    spannableString.setSpan(new ScaleXSpan(h55Var.a), b, c, i);
                }
                li4.o(spannableString, tq2Var, b, c);
                if (j2 != 16) {
                    spannableString.setSpan(new BackgroundColorSpan(qb.i0(j2)), b, c, i);
                }
                i2++;
                size = i3;
                str = str2;
                arrayList2 = arrayList3;
            }
        }
        String str3 = str;
        int length = str3.length();
        ?? r5 = o91.I;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size2 = list.size();
            for (int i6 = 0; i6 < size2; i6++) {
                Object obj = list.get(i6);
                nj njVar2 = (nj) obj;
                if ((njVar2.f() instanceof oi5) && pj.c(0, length, njVar2.g(), njVar2.e())) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = r5;
        }
        int size3 = arrayList.size();
        for (int i7 = 0; i7 < size3; i7++) {
            nj njVar3 = (nj) arrayList.get(i7);
            spannableString.setSpan(fb4.Y((oi5) njVar3.a()), njVar3.b(), njVar3.c(), 33);
        }
        int length2 = str3.length();
        if (list != null) {
            r5 = new ArrayList(list.size());
            int size4 = list.size();
            for (int i8 = 0; i8 < size4; i8++) {
                Object obj2 = list.get(i8);
                nj njVar4 = (nj) obj2;
                if ((njVar4.f() instanceof mf5) && pj.c(0, length2, njVar4.g(), njVar4.e())) {
                    r5.add(obj2);
                }
            }
        }
        int size5 = r5.size();
        for (int i9 = 0; i9 < size5; i9++) {
            nj njVar5 = (nj) r5.get(i9);
            mf5 mf5Var = (mf5) njVar5.a();
            int b2 = njVar5.b();
            int c2 = njVar5.c();
            WeakHashMap weakHashMap = ed5Var.a;
            Object obj3 = weakHashMap.get(mf5Var);
            if (obj3 == null) {
                obj3 = new URLSpan(mf5Var.a());
                weakHashMap.put(mf5Var, obj3);
            }
            spannableString.setSpan((URLSpan) obj3, b2, c2, 33);
        }
        List a3 = ojVar.a(str3.length());
        int size6 = a3.size();
        for (int i10 = 0; i10 < size6; i10++) {
            nj njVar6 = (nj) a3.get(i10);
            if (njVar6.g() != njVar6.e()) {
                if (((ek2) njVar6.f()) instanceof dk2) {
                    Object f = njVar6.f();
                    f.getClass();
                    nj njVar7 = new nj(njVar6.g(), njVar6.e(), (dk2) f);
                    WeakHashMap weakHashMap2 = ed5Var.b;
                    Object obj4 = weakHashMap2.get(njVar7);
                    if (obj4 == null) {
                        obj4 = new URLSpan(((dk2) njVar7.f()).b());
                        weakHashMap2.put(njVar7, obj4);
                    }
                    spannableString.setSpan((URLSpan) obj4, njVar6.g(), njVar6.e(), 33);
                } else {
                    WeakHashMap weakHashMap3 = ed5Var.c;
                    Object obj5 = weakHashMap3.get(njVar6);
                    if (obj5 == null) {
                        obj5 = new ed0((ek2) njVar6.f());
                        weakHashMap3.put(njVar6, obj5);
                    }
                    spannableString.setSpan((ClickableSpan) obj5, njVar6.g(), njVar6.e(), 33);
                }
            }
        }
        return (SpannableString) trimToSize(spannableString, 100000);
    }

    private final boolean traverseAtGranularity(si4 si4Var, int i, boolean z, boolean z2) {
        g5 iteratorForGranularity;
        int i2;
        int i3;
        int i4 = si4Var.f;
        Integer num = this.previousTraversedNode;
        if (num == null || i4 != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = Integer.valueOf(si4Var.f);
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(si4Var);
        boolean z3 = false;
        if (iterableTextForAccessibility != null && iterableTextForAccessibility.length() != 0 && (iteratorForGranularity = getIteratorForGranularity(si4Var, i)) != null) {
            int accessibilitySelectionEnd = getAccessibilitySelectionEnd(si4Var);
            if (accessibilitySelectionEnd == -1) {
                accessibilitySelectionEnd = z ? 0 : iterableTextForAccessibility.length();
            }
            int[] b = z ? iteratorForGranularity.b(accessibilitySelectionEnd) : iteratorForGranularity.d(accessibilitySelectionEnd);
            if (b != null) {
                int i5 = b[0];
                z3 = true;
                int i6 = b[1];
                if (z2 && isAccessibilitySelectionExtendable(si4Var)) {
                    i2 = getAccessibilitySelectionStart(si4Var);
                    if (i2 == -1) {
                        i2 = z ? i5 : i6;
                    }
                    i3 = z ? i6 : i5;
                } else {
                    i2 = z ? i6 : i5;
                    i3 = i2;
                }
                this.pendingTextTraversedEvent = new fb(si4Var, z ? 256 : 512, i, i5, i6, SystemClock.uptimeMillis());
                setAccessibilitySelection(si4Var, i2, i3, true);
            }
        }
        return z3;
    }

    private final <T extends CharSequence> T trimToSize(T t, int i) {
        if (i <= 0) {
            s83.t("size should be greater than 0");
            return null;
        }
        if (t == null || t.length() == 0) {
            return t;
        }
        if (t.length() <= i) {
            return t;
        }
        int i2 = i - 1;
        if (Character.isHighSurrogate(t.charAt(i2)) && Character.isLowSurrogate(t.charAt(i))) {
            i = i2;
        }
        T t2 = (T) t.subSequence(0, i);
        t2.getClass();
        return t2;
    }

    private final void updateHoveredVirtualView(int i) {
        int i2 = this.hoveredVirtualViewId;
        if (i2 == i) {
            return;
        }
        this.hoveredVirtualViewId = i;
        sendEventForVirtualView$default(this, i, 128, null, null, 12, null);
        sendEventForVirtualView$default(this, i2, 256, null, null, 12, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0147, code lost:
    
        r26 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0151, code lost:
    
        if (((r6 & ((~r6) << 6)) & r21) == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0153, code lost:
    
        r16 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateSemanticsNodesCopyAndPanes() {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.updateSemanticsNodesCopyAndPanes():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c7, code lost:
    
        if (defpackage.rt0.n(r6, r0) == r4) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068 A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, blocks: (B:12:0x002a, B:14:0x004f, B:20:0x0060, B:22:0x0068, B:24:0x0071, B:31:0x0093, B:34:0x00a0, B:38:0x00a8, B:39:0x00ab, B:41:0x00ac, B:48:0x003d, B:50:0x0044, B:26:0x0076, B:28:0x007d, B:30:0x0090), top: B:7:0x0020, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00c7 -> B:13:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object boundsUpdatesEventLoop$ui(defpackage.fj0 r10) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.boundsUpdatesEventLoop$ui(fj0):java.lang.Object");
    }

    /* renamed from: canScroll-0AR0LA0$ui, reason: not valid java name */
    public final boolean m33canScroll0AR0LA0$ui(boolean z, int i, long j) {
        if (j42.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return m30canScrollmoWRBKg(getCurrentSemanticsNodes(), z, i, j);
        }
        return false;
    }

    public final boolean dispatchHoverEvent$ui(MotionEvent motionEvent) {
        if (!isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int hitTestSemanticsAt$ui = hitTestSemanticsAt$ui(motionEvent.getX(), motionEvent.getY());
            boolean dispatchGenericMotionEvent = this.view.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
            updateHoveredVirtualView(hitTestSemanticsAt$ui);
            if (hitTestSemanticsAt$ui == Integer.MIN_VALUE) {
                return dispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.hoveredVirtualViewId == Integer.MIN_VALUE) {
            return this.view.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
        }
        updateHoveredVirtualView(Integer.MIN_VALUE);
        return true;
    }

    public final boolean getAccessibilityForceEnabledForTesting$ui() {
        return this.accessibilityForceEnabledForTesting;
    }

    @Override // defpackage.y4
    public s5 getAccessibilityNodeProvider(View view) {
        return this.nodeProvider;
    }

    public final String getExtraDataTestTraversalAfterVal$ui() {
        return this.ExtraDataTestTraversalAfterVal;
    }

    public final String getExtraDataTestTraversalBeforeVal$ui() {
        return this.ExtraDataTestTraversalBeforeVal;
    }

    public final int getHoveredVirtualViewId$ui() {
        return this.hoveredVirtualViewId;
    }

    public final o33 getIdToAfterMap$ui() {
        return this.idToAfterMap;
    }

    public final o33 getIdToBeforeMap$ui() {
        return this.idToBeforeMap;
    }

    public final tm1 getOnSendAccessibilityEvent$ui() {
        return this.onSendAccessibilityEvent;
    }

    public final Boolean getRequestFromAccessibilityToolForTesting$ui() {
        return this.requestFromAccessibilityToolForTesting;
    }

    public final long getSendRecurringAccessibilityEventsIntervalMillis$ui() {
        return this.SendRecurringAccessibilityEventsIntervalMillis;
    }

    public final AndroidComposeView getView() {
        return this.view;
    }

    public final int hitTestSemanticsAt$ui(float f, float f2) {
        this.view.measureAndLayout(true);
        kt1 kt1Var = new kt1();
        wa2 root = this.view.getRoot();
        long floatToRawIntBits = (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        ja3 ja3Var = root.n0;
        na3 na3Var = ja3Var.d;
        u73 u73Var = na3.C0;
        ja3Var.d.Q0(na3.I0, na3Var.H0(floatToRawIntBits), kt1Var, 1, true);
        e43 e43Var = kt1Var.I;
        for (int i = e43Var.b - 1; -1 < i; i--) {
            Object g = e43Var.g(i);
            g.getClass();
            wa2 U = ut0.U((k13) g);
            if (this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(U) != null) {
                return Integer.MIN_VALUE;
            }
            if (U.n0.c(8)) {
                int semanticsNodeIdToAccessibilityVirtualNodeId = semanticsNodeIdToAccessibilityVirtualNodeId(U.J);
                si4 a = ui4.a(U, false);
                if (mw2.I(a) && !wi4.p(a)) {
                    return semanticsNodeIdToAccessibilityVirtualNodeId;
                }
            }
        }
        return Integer.MIN_VALUE;
    }

    public final boolean isEnabled$ui() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && !getEnabledServices().isEmpty();
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z) {
        resetEnabledAccessibilityServiceList();
    }

    public final void onLayoutChange$ui(wa2 wa2Var) {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui()) {
            notifySubtreeAccessibilityStateChangedIfNeeded(wa2Var);
        }
    }

    public final void onSemanticsChange$ui() {
        this.currentSemanticsNodesInvalidated = true;
        Handler handler = getHandler();
        if (!isEnabled$ui() || this.checkingForSemanticsChanges || handler == null) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        handler.post(this.semanticsChangeChecker);
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean z) {
        resetEnabledAccessibilityServiceList();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        if (this.accessibilityManager.isEnabled()) {
            resetEnabledAccessibilityServiceList();
        }
        this.accessibilityManager.addAccessibilityStateChangeListener(this);
        this.accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Handler handler = getHandler();
        handler.getClass();
        handler.removeCallbacks(this.semanticsChangeChecker);
        this.accessibilityManager.removeAccessibilityStateChangeListener(this);
        this.accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final void setAccessibilityForceEnabledForTesting$ui(boolean z) {
        this.accessibilityForceEnabledForTesting = z;
        this.currentSemanticsNodesInvalidated = true;
    }

    public final void setHoveredVirtualViewId$ui(int i) {
        this.hoveredVirtualViewId = i;
    }

    public final void setIdToAfterMap$ui(o33 o33Var) {
        this.idToAfterMap = o33Var;
    }

    public final void setIdToBeforeMap$ui(o33 o33Var) {
        this.idToBeforeMap = o33Var;
    }

    public final void setOnSendAccessibilityEvent$ui(tm1 tm1Var) {
        this.onSendAccessibilityEvent = tm1Var;
    }

    public final void setRequestFromAccessibilityToolForTesting$ui(Boolean bool) {
        this.requestFromAccessibilityToolForTesting = bool;
    }

    public final void setSendRecurringAccessibilityEventsIntervalMillis$ui(long j) {
        this.SendRecurringAccessibilityEventsIntervalMillis = j;
    }

    private final Rect toAndroidRect(yg3 yg3Var, float f, float f2) {
        if ((yg3Var instanceof wg3) || (yg3Var instanceof xg3)) {
            return toAndroidRect(yg3Var.a(), f, f2);
        }
        return null;
    }

    private static /* synthetic */ void getHandler$annotations() {
    }

    public static /* synthetic */ void getHoveredVirtualViewId$ui$annotations() {
    }

    public static /* synthetic */ void getOnSendAccessibilityEvent$ui$annotations() {
    }
}

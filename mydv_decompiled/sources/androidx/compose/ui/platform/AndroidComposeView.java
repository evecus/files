package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.media3.common.util.Log;
import androidx.media3.extractor.ts.TsExtractor;
import com.github.mytv.dv.R;
import defpackage.a52;
import defpackage.a53;
import defpackage.aa;
import defpackage.ab2;
import defpackage.ad4;
import defpackage.ai1;
import defpackage.aj2;
import defpackage.an3;
import defpackage.b02;
import defpackage.b23;
import defpackage.b53;
import defpackage.be0;
import defpackage.bi1;
import defpackage.bq3;
import defpackage.bs2;
import defpackage.c21;
import defpackage.c23;
import defpackage.c5;
import defpackage.cd;
import defpackage.cn3;
import defpackage.cw4;
import defpackage.d21;
import defpackage.d23;
import defpackage.d4;
import defpackage.d74;
import defpackage.da;
import defpackage.da2;
import defpackage.db4;
import defpackage.df0;
import defpackage.dh0;
import defpackage.di1;
import defpackage.dl;
import defpackage.dl0;
import defpackage.dr5;
import defpackage.dt4;
import defpackage.dy0;
import defpackage.e43;
import defpackage.e74;
import defpackage.ea;
import defpackage.ed;
import defpackage.ed3;
import defpackage.el0;
import defpackage.ep;
import defpackage.eq;
import defpackage.es;
import defpackage.es0;
import defpackage.ey0;
import defpackage.f74;
import defpackage.fa;
import defpackage.fb4;
import defpackage.fd;
import defpackage.fd0;
import defpackage.fe;
import defpackage.fh2;
import defpackage.fj0;
import defpackage.fk;
import defpackage.fy0;
import defpackage.g12;
import defpackage.g73;
import defpackage.ga;
import defpackage.gi1;
import defpackage.gr5;
import defpackage.h12;
import defpackage.h5;
import defpackage.hc4;
import defpackage.hf1;
import defpackage.hn1;
import defpackage.hr5;
import defpackage.i12;
import defpackage.i14;
import defpackage.i51;
import defpackage.ia;
import defpackage.ib;
import defpackage.ii4;
import defpackage.il2;
import defpackage.in3;
import defpackage.ir1;
import defpackage.ir5;
import defpackage.is2;
import defpackage.iu0;
import defpackage.j42;
import defpackage.j55;
import defpackage.ja;
import defpackage.ja3;
import defpackage.jb;
import defpackage.jj1;
import defpackage.jk3;
import defpackage.jn3;
import defpackage.jp0;
import defpackage.jr1;
import defpackage.jt4;
import defpackage.k12;
import defpackage.k13;
import defpackage.k60;
import defpackage.k94;
import defpackage.ka;
import defpackage.ka4;
import defpackage.kb;
import defpackage.ki2;
import defpackage.ki4;
import defpackage.kj1;
import defpackage.kk;
import defpackage.kk4;
import defpackage.kr3;
import defpackage.kt4;
import defpackage.l10;
import defpackage.l54;
import defpackage.l55;
import defpackage.l94;
import defpackage.la;
import defpackage.lb;
import defpackage.li2;
import defpackage.lp3;
import defpackage.lq2;
import defpackage.lu0;
import defpackage.m13;
import defpackage.m14;
import defpackage.mb1;
import defpackage.mr1;
import defpackage.mu0;
import defpackage.mz5;
import defpackage.n24;
import defpackage.n43;
import defpackage.n65;
import defpackage.na;
import defpackage.na3;
import defpackage.nb;
import defpackage.nr5;
import defpackage.ns4;
import defpackage.nw2;
import defpackage.o14;
import defpackage.o43;
import defpackage.o63;
import defpackage.o7;
import defpackage.o90;
import defpackage.oa;
import defpackage.ob;
import defpackage.oc;
import defpackage.oh1;
import defpackage.oh3;
import defpackage.oi1;
import defpackage.ot4;
import defpackage.ow2;
import defpackage.p70;
import defpackage.pa;
import defpackage.pb;
import defpackage.ph3;
import defpackage.pn;
import defpackage.pp;
import defpackage.pp3;
import defpackage.pz1;
import defpackage.q00;
import defpackage.q02;
import defpackage.q12;
import defpackage.q13;
import defpackage.q22;
import defpackage.q33;
import defpackage.q8;
import defpackage.qb;
import defpackage.qg;
import defpackage.qh3;
import defpackage.qp3;
import defpackage.qw2;
import defpackage.qz1;
import defpackage.r24;
import defpackage.r33;
import defpackage.r7;
import defpackage.r91;
import defpackage.r95;
import defpackage.ra;
import defpackage.rm1;
import defpackage.ru2;
import defpackage.ru5;
import defpackage.rw2;
import defpackage.rz1;
import defpackage.s10;
import defpackage.s24;
import defpackage.s83;
import defpackage.sh3;
import defpackage.si1;
import defpackage.sp0;
import defpackage.sq2;
import defpackage.sr;
import defpackage.su0;
import defpackage.su5;
import defpackage.sv2;
import defpackage.t31;
import defpackage.t43;
import defpackage.t5;
import defpackage.ta;
import defpackage.tg3;
import defpackage.tk0;
import defpackage.tl;
import defpackage.tm1;
import defpackage.tp3;
import defpackage.tq2;
import defpackage.ts0;
import defpackage.ts1;
import defpackage.tw2;
import defpackage.u73;
import defpackage.ua;
import defpackage.ua2;
import defpackage.ub;
import defpackage.ui1;
import defpackage.ul0;
import defpackage.up3;
import defpackage.uq2;
import defpackage.ut0;
import defpackage.v60;
import defpackage.v9;
import defpackage.va;
import defpackage.vg;
import defpackage.vi2;
import defpackage.vl1;
import defpackage.vr;
import defpackage.vr5;
import defpackage.vt0;
import defpackage.w60;
import defpackage.w9;
import defpackage.w94;
import defpackage.wa2;
import defpackage.wb;
import defpackage.wd5;
import defpackage.wi4;
import defpackage.wq2;
import defpackage.wr5;
import defpackage.ws4;
import defpackage.wt0;
import defpackage.x9;
import defpackage.xa;
import defpackage.xf;
import defpackage.xi2;
import defpackage.xi4;
import defpackage.xq2;
import defpackage.ya;
import defpackage.ya2;
import defpackage.yh1;
import defpackage.yi2;
import defpackage.ys5;
import defpackage.yt0;
import defpackage.z12;
import defpackage.za;
import defpackage.zi2;
import defpackage.zi4;
import defpackage.zy;
import defpackage.zz1;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements qh3, jn3, e74, ow2, es0, tg3, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, ai1, mb1 {
    public static final int $stable = 8;
    private static Method addChangeCallbackMethod;
    private static Method dispatchOnScrollChangedMethod;
    private static Method findViewByAccessibilityIdTraversalMethod;
    private static Method getAccessibilityViewIdMethod;
    private static Method getBooleanMethod;
    private static Runnable systemPropertiesChangedRunnable;
    private static Class<?> systemPropertiesClass;
    private vg _androidViewsHandler;
    private final t43 _composeViewContext$delegate;
    private k12 _inputModeManager;
    private l55 _legacyTextInputServiceAndroid;
    private View _rootView;
    private dy0 _savedStateRegistry;
    private ot4 _softwareKeyboardController;
    private j55 _textInputService;
    private n65 _textToolbar;
    private final v9 autofill;
    private final w9 autofillManager;
    private final es autofillTree;
    private final AndroidComposeViewAccessibilityDelegateCompat composeAccessibilityDelegate;
    private boolean composeViewContextIncrementedDuringInit;
    private final t43 configuration$delegate;
    private wb contentCaptureManager;
    private tk0 coroutineContext;
    private float currentFrameRate;
    private float currentFrameRateCategory;
    private final t43 density$delegate;
    private final cw4 derivedIsAttached$delegate;
    private final e43 dirtyLayers;
    private final oc dragAndDropManager;
    private final e43 endApplyChangesListeners;
    private final bi1 focusOwner;
    private final t43 fontFamilyResolver$delegate;
    private boolean forceUseMatrixCache;
    private yi2 frameEndScheduler;
    private View frameRateCategoryView;
    private long globalPosition;
    private final ir1 graphicsContext;
    private boolean hoverExitReceived;
    private final b02 indirectPointerNavigationGestureDetector;
    private final q12 insetsListener;
    private final t43 isAttached$delegate;
    private boolean isDispatchingAutofillStructure;
    private boolean isDrawingContent;
    private boolean isPendingInteropViewLayoutChangeDispatch;
    private boolean isRenderNodeCompatible;
    private int keepScreenOnCount;
    private boolean keyboardModifiersRequireUpdate;
    private long lastDownPointerPosition;
    private long lastMatrixRecalculationAnimationTime;
    private float lastSetFrameRate;
    private float lastSetFrameRateCategory;
    private final ys5 layerCache;
    private final rm1 layoutChildViewsIfNeeded;
    private final t43 layoutDirection$delegate;
    private final q33 layoutNodes;
    private zi2 lifecycleRetainedValuesStoreOwnerEntry;
    private final cw4 localeList$delegate;
    private final rw2 measureAndLayoutDelegate;
    private final m13 modifierLocalManager;
    private final c23 motionEventAdapter;
    private boolean observationClearRequested;
    private dh0 onMeasureConstraints;
    private tm1 onReadyForComposition;
    private final pp outOfFrameQueue;
    private final Runnable outOfFrameRunnable;
    private hn1 playNavigationSoundEffect;
    private final qp3 pointerIconService;
    private final up3 pointerInputEventProcessor;
    private e43 postponedDirtyLayers;
    private MotionEvent previousMotionEvent;
    private qz1 primaryDirectionalMotionAxisOverride;
    private boolean processingRequestFocusForNextNonChildView;
    private final o14 rectManager;
    private long relayoutTime;
    private final rm1 resendMotionEventOnLayout;
    private final za resendMotionEventRunnable;
    private l54 retainedValuesStore;
    private final wa2 root;
    private final db4 scrollCapture;
    private final xi4 semanticsOwner;
    private final Runnable sendHoverExitEvent;
    private int sensitiveComponentCount;
    private boolean showLayoutBounds;
    private final sh3 snapshotObserver;
    private boolean superclassInitComplete;
    private final AtomicReference<kk4> textInputSessionMutex;
    private final Matrix tmpAndroidMatrix;
    private final float[] tmpMatrix;
    private final int[] tmpPositionArray;
    private d74 uncaughtExceptionHandler;
    private t31 viewLayersContainer;
    private final float[] viewToWindowMatrix;
    private boolean wasMeasuredWithMultipleConstraints;
    private long windowPosition;
    private final float[] windowToViewMatrix;
    public static final ra Companion = new ra();
    private static final e43 composeViews = new e43();

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class a extends q13 {
        public a() {
        }

        @Override // defpackage.q13
        public final k13 create() {
            return new ta(AndroidComposeView.this);
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return AndroidComposeView.this.hashCode();
        }

        @Override // defpackage.q13
        public final void inspectableProperties(z12 z12Var) {
            z12Var.d("rootModifier");
        }

        @Override // defpackage.q13
        public final void update(k13 k13Var) {
        }
    }

    public AndroidComposeView(Context context, be0 be0Var) {
        super(context);
        this._composeViewContext$delegate = ad4.w(be0Var);
        this.lastDownPointerPosition = 9205357640488583168L;
        final byte b = 1;
        this.superclassInitComplete = true;
        this.retainedValuesStore = q8.p0;
        this.outOfFrameQueue = new pp();
        final byte b2 = 0;
        this.outOfFrameRunnable = new Runnable(this) { // from class: ma
            public final /* synthetic */ AndroidComposeView J;

            {
                this.J = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b2;
                AndroidComposeView androidComposeView = this.J;
                switch (b3) {
                    case 0:
                        AndroidComposeView.outOfFrameRunnable$lambda$0(androidComposeView);
                        break;
                    default:
                        AndroidComposeView.sendHoverExitEvent$lambda$0(androidComposeView);
                        break;
                }
            }
        };
        this.density$delegate = new jk3(qb.m(context), q8.y0);
        this.focusOwner = new di1(this, this);
        this.coroutineContext = be0Var.c().getEffectCoroutineContext();
        this.dragAndDropManager = new oc();
        this.isAttached$delegate = ad4.w(Boolean.FALSE);
        this.derivedIsAttached$delegate = dt4.b(new la(this, b));
        this.insetsListener = new q12();
        byte b3 = 3;
        wa2 wa2Var = new wa2(3);
        wa2Var.f0(f74.c);
        wa2Var.c0(getDensity());
        wa2Var.h0(getViewConfiguration());
        wa2Var.g0(hf1.e(new a(), ((di1) getFocusOwner()).e).then(getDragAndDropManager().c));
        this.root = wa2Var;
        q33 q33Var = q22.a;
        this.layoutNodes = new q33();
        this.rectManager = new o14(getLayoutNodes(), this);
        this.semanticsOwner = new xi4(getRoot(), new r91(), getLayoutNodes());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.composeAccessibilityDelegate = androidComposeViewAccessibilityDelegateCompat;
        this.contentCaptureManager = new wb(this, new va(0, this, qb.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, (byte) 0));
        this.graphicsContext = new cd(this);
        this.autofillTree = new es();
        this.dirtyLayers = new e43();
        this.motionEventAdapter = new c23();
        this.pointerInputEventProcessor = new up3(getRoot());
        this.configuration$delegate = ad4.w(new Configuration(context.getResources().getConfiguration()));
        this.localeList$delegate = dt4.b(new la(this, (byte) 2));
        this.autofill = autofillSupported() ? new v9(this, getAutofillTree()) : null;
        this.autofillManager = autofillSupported() ? new w9(new in3(context), getSemanticsOwner(), this, getRectManager(), context.getPackageName()) : null;
        this.snapshotObserver = new sh3(new na(this, b2));
        this.measureAndLayoutDelegate = new rw2(getRoot());
        this.globalPosition = 9223372034707292159L;
        this.tmpPositionArray = new int[]{0, 0};
        this.tmpMatrix = nw2.a();
        this.tmpAndroidMatrix = new Matrix();
        this.viewToWindowMatrix = nw2.a();
        this.windowToViewMatrix = nw2.a();
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.windowPosition = 9187343241974906880L;
        this.isRenderNodeCompatible = true;
        this.textInputSessionMutex = new AtomicReference<>(null);
        this.fontFamilyResolver$delegate = be0Var.p;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = yh1.a;
        da2 da2Var = da2.I;
        da2 da2Var2 = layoutDirection != 0 ? layoutDirection != 1 ? null : da2.J : da2Var;
        this.layoutDirection$delegate = ad4.w(da2Var2 != null ? da2Var2 : da2Var);
        this.modifierLocalManager = new m13(this);
        this.layerCache = new ys5();
        this.endApplyChangesListeners = new e43();
        this.currentFrameRate = Float.NaN;
        this.currentFrameRateCategory = Float.NaN;
        this.lastSetFrameRate = Float.NaN;
        this.lastSetFrameRateCategory = Float.NaN;
        this.resendMotionEventRunnable = new za(this);
        this.sendHoverExitEvent = new Runnable(this) { // from class: ma
            public final /* synthetic */ AndroidComposeView J;

            {
                this.J = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b;
                AndroidComposeView androidComposeView = this.J;
                switch (b32) {
                    case 0:
                        AndroidComposeView.outOfFrameRunnable$lambda$0(androidComposeView);
                        break;
                    default:
                        AndroidComposeView.sendHoverExitEvent$lambda$0(androidComposeView);
                        break;
                }
            }
        };
        this.playNavigationSoundEffect = new oa(this);
        this.indirectPointerNavigationGestureDetector = new b02(context, new na(this, b));
        this.resendMotionEventOnLayout = new la(this, b3);
        this.layoutChildViewsIfNeeded = new la(this, (byte) 4);
        addOnAttachStateChangeListener(this.contentCaptureManager);
        setWillNotDraw(false);
        setFocusable(true);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            pb.a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        dr5.h(this, androidComposeViewAccessibilityDelegateCompat);
        setOnDragListener(getDragAndDropManager());
        if (i >= 29) {
            jb.a.a(this);
        }
        if (isArrEnabled$ui()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.frameRateCategoryView = view;
            addView(view);
        }
        this.scrollCapture = i >= 31 ? new db4() : null;
        this.pointerIconService = new ya(this);
    }

    private static final void _get_legacyTextInputServiceAndroid_$lambda$0(AndroidComposeView androidComposeView, Runnable runnable) {
        AndroidComposeView outOfFrameExecutor = androidComposeView.getOutOfFrameExecutor();
        if (outOfFrameExecutor != null) {
            outOfFrameExecutor.schedule(new xa(runnable));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int d;
        boolean c = j42.c(str, this.composeAccessibilityDelegate.getExtraDataTestTraversalBeforeVal$ui());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.composeAccessibilityDelegate;
        if (c) {
            int d2 = androidComposeViewAccessibilityDelegateCompat.getIdToBeforeMap$ui().d(i);
            if (d2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, d2);
                return;
            }
            return;
        }
        if (!j42.c(str, androidComposeViewAccessibilityDelegateCompat.getExtraDataTestTraversalAfterVal$ui()) || (d = this.composeAccessibilityDelegate.getIdToAfterMap$ui().d(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, d);
    }

    private final boolean autofillSupported() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* renamed from: calculateMatrixToWindow-58bKbWc, reason: not valid java name */
    private final void m3calculateMatrixToWindow58bKbWc(float[] fArr) {
        if (Build.VERSION.SDK_INT < 29) {
            d4.i(this, fArr, this.tmpMatrix, this.tmpPositionArray);
            return;
        }
        q00.a.a(this, fArr, this.tmpAndroidMatrix, this.tmpPositionArray);
    }

    private final boolean childSizeCanAffectParentSize(wa2 wa2Var) {
        if (this.wasMeasuredWithMultipleConstraints) {
            return true;
        }
        wa2 v = wa2Var.v();
        if (v == null) {
            return false;
        }
        long j = v.n0.c.L;
        return (dh0.f(j) && dh0.e(j)) ? false : true;
    }

    private final void clearChildInvalidObservations(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).onEndApplyChanges();
            } else if (childAt instanceof ViewGroup) {
                clearChildInvalidObservations((ViewGroup) childAt);
            }
        }
    }

    /* renamed from: component1-VKZWuLQ, reason: not valid java name */
    private final int m4component1VKZWuLQ(long j) {
        return (int) (j >>> 32);
    }

    /* renamed from: component2-VKZWuLQ, reason: not valid java name */
    private final int m5component2VKZWuLQ(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: convertMeasureSpec-I7RO_PI, reason: not valid java name */
    private final long m6convertMeasureSpecI7RO_PI(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return m13packZIaKswc(0, size);
        }
        if (mode == 0) {
            return m13packZIaKswc(0, Log.LOG_LEVEL_OFF);
        }
        if (mode == 1073741824) {
            return m13packZIaKswc(size, size);
        }
        s83.r();
        return 0L;
    }

    private final void dispatchConfigurationChangeIfNeeded() {
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        updateConfiguration(getResources().getConfiguration());
    }

    private final void dispatchPendingInteropLayoutCallbacks() {
        if (this.isPendingInteropViewLayoutChangeDispatch) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.isPendingInteropViewLayoutChangeDispatch = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View findNextNonChildView(int i) {
        FocusFinder focusFinder = FocusFinder.getInstance();
        View view = this;
        while (view != null) {
            View rootView = getRootView();
            rootView.getClass();
            view = focusFinder.findNextFocus((ViewGroup) rootView, view, i);
            if (view != null && !qb.B(this, view)) {
                return view;
            }
        }
        return null;
    }

    /* renamed from: findNextViewInEmbeddedView-3ESFkO8, reason: not valid java name */
    private final View m7findNextViewInEmbeddedView3ESFkO8(int i) {
        ui1 g = ((di1) getFocusOwner()).g();
        if (g == null) {
            zy.i("findNextViewInEmbeddedView called when owner does not have anything focused.");
            return null;
        }
        Integer c = yh1.c(i);
        if (c == null) {
            throw r7.t("Invalid focus direction");
        }
        int intValue = c.intValue();
        ir5 ir5Var = ut0.U(g).W;
        View interopView = ir5Var != null ? ir5Var.getInteropView() : null;
        View findFocus = findFocus();
        FocusFinder focusFinder = FocusFinder.getInstance();
        View rootView = getRootView();
        rootView.getClass();
        View findNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, findFocus, intValue);
        if (findNextFocus == null || interopView == null || !qb.B(interopView, findNextFocus)) {
            return null;
        }
        return findNextFocus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean focusSearch$lambda$1(r24 r24Var, ui1 ui1Var) {
        r24Var.I = ui1Var;
        return true;
    }

    private final s10 getCanvasHolder() {
        return getComposeViewContext().u;
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.derivedIsAttached$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getFocusedRect$lambda$0(ui1 ui1Var) {
        return true;
    }

    private final l55 getLegacyTextInputServiceAndroid() {
        l55 l55Var = this._legacyTextInputServiceAndroid;
        if (l55Var != null) {
            return l55Var;
        }
        l55 l55Var2 = new l55(getView(), this, new ja(this, (byte) 0));
        this._legacyTextInputServiceAndroid = l55Var2;
        return l55Var2;
    }

    private final be0 get_composeViewContext() {
        return (be0) this._composeViewContext$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [k13] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [k13] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [b53] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [b53] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    private final boolean handleIndirectPointerEvent(pz1 pz1Var) {
        zz1 zz1Var;
        boolean z;
        int size;
        int size2;
        ja3 ja3Var;
        boolean z2;
        wt0 wt0Var;
        ja3 ja3Var2;
        di1 di1Var = (di1) getFocusOwner();
        if (di1Var.d.e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated.");
        } else {
            ui1 g = di1Var.g();
            if (g != null) {
                if (!g.getNode().isAttached()) {
                    q02.b("visitAncestors called on an unattached node");
                }
                k13 node = g.getNode();
                wa2 U = ut0.U(g);
                loop0: while (true) {
                    if (U == null) {
                        wt0Var = 0;
                        break;
                    }
                    if ((U.n0.f.getAggregateChildKindSet$ui() & 2097152) != 0) {
                        while (node != null) {
                            if ((node.getKindSet$ui() & 2097152) != 0) {
                                ?? r9 = 0;
                                wt0Var = node;
                                while (wt0Var != 0) {
                                    if (wt0Var instanceof zz1) {
                                        break loop0;
                                    }
                                    if ((wt0Var.getKindSet$ui() & 2097152) != 0 && (wt0Var instanceof wt0)) {
                                        k13 k13Var = wt0Var.J;
                                        int i = 0;
                                        wt0Var = wt0Var;
                                        r9 = r9;
                                        while (k13Var != null) {
                                            if ((k13Var.getKindSet$ui() & 2097152) != 0) {
                                                i++;
                                                r9 = r9;
                                                if (i == 1) {
                                                    wt0Var = k13Var;
                                                } else {
                                                    if (r9 == 0) {
                                                        r9 = new b53(new k13[16]);
                                                    }
                                                    if (wt0Var != 0) {
                                                        r9.c(wt0Var);
                                                        wt0Var = 0;
                                                    }
                                                    r9.c(k13Var);
                                                }
                                            }
                                            k13Var = k13Var.getChild$ui();
                                            wt0Var = wt0Var;
                                            r9 = r9;
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    wt0Var = ut0.M(r9);
                                }
                            }
                            node = node.getParent$ui();
                        }
                    }
                    U = U.v();
                    node = (U == null || (ja3Var2 = U.n0) == null) ? null : ja3Var2.e;
                }
                zz1Var = (zz1) wt0Var;
            } else {
                zz1Var = null;
            }
            if (zz1Var != null) {
                k13 k13Var2 = (k13) zz1Var;
                if (!k13Var2.getNode().isAttached()) {
                    q02.b("visitAncestors called on an unattached node");
                }
                k13 parent$ui = k13Var2.getNode().getParent$ui();
                wa2 U2 = ut0.U(zz1Var);
                ArrayList arrayList = null;
                while (U2 != null) {
                    if ((U2.n0.f.getAggregateChildKindSet$ui() & 2097152) != 0) {
                        while (parent$ui != null) {
                            if ((parent$ui.getKindSet$ui() & 2097152) != 0) {
                                k13 k13Var3 = parent$ui;
                                b53 b53Var = null;
                                while (k13Var3 != null) {
                                    if (k13Var3 instanceof zz1) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(k13Var3);
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    if (z2 && (k13Var3.getKindSet$ui() & 2097152) != 0 && (k13Var3 instanceof wt0)) {
                                        int i2 = 0;
                                        for (k13 k13Var4 = ((wt0) k13Var3).J; k13Var4 != null; k13Var4 = k13Var4.getChild$ui()) {
                                            if ((k13Var4.getKindSet$ui() & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    k13Var3 = k13Var4;
                                                } else {
                                                    if (b53Var == null) {
                                                        b53Var = new b53(new k13[16]);
                                                    }
                                                    if (k13Var3 != null) {
                                                        b53Var.c(k13Var3);
                                                        k13Var3 = null;
                                                    }
                                                    b53Var.c(k13Var4);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    k13Var3 = ut0.M(b53Var);
                                }
                            }
                            parent$ui = parent$ui.getParent$ui();
                        }
                    }
                    U2 = U2.v();
                    parent$ui = (U2 == null || (ja3Var = U2.n0) == null) ? null : ja3Var.e;
                }
                lp3 lp3Var = lp3.I;
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i3 = size2 - 1;
                        ((zz1) arrayList.get(size2)).z(pz1Var, lp3Var);
                        if (i3 < 0) {
                            break;
                        }
                        size2 = i3;
                    }
                }
                zz1Var.z(pz1Var, lp3Var);
                lp3 lp3Var2 = lp3.J;
                zz1Var.z(pz1Var, lp3Var2);
                if (arrayList != null) {
                    int size3 = arrayList.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        ((zz1) arrayList.get(i4)).z(pz1Var, lp3Var2);
                    }
                }
                lp3 lp3Var3 = lp3.K;
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i5 = size - 1;
                        ((zz1) arrayList.get(size)).z(pz1Var, lp3Var3);
                        if (i5 < 0) {
                            break;
                        }
                        size = i5;
                    }
                }
                zz1Var.z(pz1Var, lp3Var3);
            }
            ArrayList arrayList2 = (ArrayList) ((fd) pz1Var).a();
            int size4 = arrayList2.size();
            for (int i6 = 0; i6 < size4; i6++) {
                if (((rz1) arrayList2.get(i6)).i) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        b02 b02Var = this.indirectPointerNavigationGestureDetector;
        b02Var.getClass();
        MotionEvent P = c5.P(pz1Var);
        int action = P.getAction();
        if (action == 0) {
            b02Var.b = ((fd) pz1Var).b();
            b02Var.c = false;
        } else if ((action == 1 || action == 2) && z) {
            b02Var.b = 0;
            b02Var.c = true;
        }
        b02Var.d.onTouchEvent(P);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x018d A[Catch: all -> 0x01a4, TryCatch #0 {all -> 0x01a4, blocks: (B:3:0x000a, B:89:0x0178, B:96:0x0182, B:98:0x018a, B:99:0x0194, B:100:0x018d, B:107:0x01a9, B:108:0x01ac), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:116:0x003e, B:118:0x0044, B:25:0x0098, B:26:0x009f, B:33:0x00b0, B:37:0x00bd, B:38:0x00c0, B:40:0x00c4, B:42:0x00ca, B:44:0x00ce, B:45:0x00d4, B:47:0x00da, B:50:0x00e2, B:51:0x00f0, B:53:0x00f6, B:55:0x00fc, B:57:0x0102, B:58:0x0108, B:60:0x010c, B:61:0x0110, B:66:0x0123, B:68:0x0127, B:69:0x012e, B:75:0x013f, B:76:0x014b, B:78:0x0153, B:79:0x0156, B:85:0x015d, B:87:0x0165, B:88:0x0174), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ce A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:116:0x003e, B:118:0x0044, B:25:0x0098, B:26:0x009f, B:33:0x00b0, B:37:0x00bd, B:38:0x00c0, B:40:0x00c4, B:42:0x00ca, B:44:0x00ce, B:45:0x00d4, B:47:0x00da, B:50:0x00e2, B:51:0x00f0, B:53:0x00f6, B:55:0x00fc, B:57:0x0102, B:58:0x0108, B:60:0x010c, B:61:0x0110, B:66:0x0123, B:68:0x0127, B:69:0x012e, B:75:0x013f, B:76:0x014b, B:78:0x0153, B:79:0x0156, B:85:0x015d, B:87:0x0165, B:88:0x0174), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:116:0x003e, B:118:0x0044, B:25:0x0098, B:26:0x009f, B:33:0x00b0, B:37:0x00bd, B:38:0x00c0, B:40:0x00c4, B:42:0x00ca, B:44:0x00ce, B:45:0x00d4, B:47:0x00da, B:50:0x00e2, B:51:0x00f0, B:53:0x00f6, B:55:0x00fc, B:57:0x0102, B:58:0x0108, B:60:0x010c, B:61:0x0110, B:66:0x0123, B:68:0x0127, B:69:0x012e, B:75:0x013f, B:76:0x014b, B:78:0x0153, B:79:0x0156, B:85:0x015d, B:87:0x0165, B:88:0x0174), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010c A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:116:0x003e, B:118:0x0044, B:25:0x0098, B:26:0x009f, B:33:0x00b0, B:37:0x00bd, B:38:0x00c0, B:40:0x00c4, B:42:0x00ca, B:44:0x00ce, B:45:0x00d4, B:47:0x00da, B:50:0x00e2, B:51:0x00f0, B:53:0x00f6, B:55:0x00fc, B:57:0x0102, B:58:0x0108, B:60:0x010c, B:61:0x0110, B:66:0x0123, B:68:0x0127, B:69:0x012e, B:75:0x013f, B:76:0x014b, B:78:0x0153, B:79:0x0156, B:85:0x015d, B:87:0x0165, B:88:0x0174), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0127 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:116:0x003e, B:118:0x0044, B:25:0x0098, B:26:0x009f, B:33:0x00b0, B:37:0x00bd, B:38:0x00c0, B:40:0x00c4, B:42:0x00ca, B:44:0x00ce, B:45:0x00d4, B:47:0x00da, B:50:0x00e2, B:51:0x00f0, B:53:0x00f6, B:55:0x00fc, B:57:0x0102, B:58:0x0108, B:60:0x010c, B:61:0x0110, B:66:0x0123, B:68:0x0127, B:69:0x012e, B:75:0x013f, B:76:0x014b, B:78:0x0153, B:79:0x0156, B:85:0x015d, B:87:0x0165, B:88:0x0174), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013f A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:116:0x003e, B:118:0x0044, B:25:0x0098, B:26:0x009f, B:33:0x00b0, B:37:0x00bd, B:38:0x00c0, B:40:0x00c4, B:42:0x00ca, B:44:0x00ce, B:45:0x00d4, B:47:0x00da, B:50:0x00e2, B:51:0x00f0, B:53:0x00f6, B:55:0x00fc, B:57:0x0102, B:58:0x0108, B:60:0x010c, B:61:0x0110, B:66:0x0123, B:68:0x0127, B:69:0x012e, B:75:0x013f, B:76:0x014b, B:78:0x0153, B:79:0x0156, B:85:0x015d, B:87:0x0165, B:88:0x0174), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0153 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:116:0x003e, B:118:0x0044, B:25:0x0098, B:26:0x009f, B:33:0x00b0, B:37:0x00bd, B:38:0x00c0, B:40:0x00c4, B:42:0x00ca, B:44:0x00ce, B:45:0x00d4, B:47:0x00da, B:50:0x00e2, B:51:0x00f0, B:53:0x00f6, B:55:0x00fc, B:57:0x0102, B:58:0x0108, B:60:0x010c, B:61:0x0110, B:66:0x0123, B:68:0x0127, B:69:0x012e, B:75:0x013f, B:76:0x014b, B:78:0x0153, B:79:0x0156, B:85:0x015d, B:87:0x0165, B:88:0x0174), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0156 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:116:0x003e, B:118:0x0044, B:25:0x0098, B:26:0x009f, B:33:0x00b0, B:37:0x00bd, B:38:0x00c0, B:40:0x00c4, B:42:0x00ca, B:44:0x00ce, B:45:0x00d4, B:47:0x00da, B:50:0x00e2, B:51:0x00f0, B:53:0x00f6, B:55:0x00fc, B:57:0x0102, B:58:0x0108, B:60:0x010c, B:61:0x0110, B:66:0x0123, B:68:0x0127, B:69:0x012e, B:75:0x013f, B:76:0x014b, B:78:0x0153, B:79:0x0156, B:85:0x015d, B:87:0x0165, B:88:0x0174), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0165 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:116:0x003e, B:118:0x0044, B:25:0x0098, B:26:0x009f, B:33:0x00b0, B:37:0x00bd, B:38:0x00c0, B:40:0x00c4, B:42:0x00ca, B:44:0x00ce, B:45:0x00d4, B:47:0x00da, B:50:0x00e2, B:51:0x00f0, B:53:0x00f6, B:55:0x00fc, B:57:0x0102, B:58:0x0108, B:60:0x010c, B:61:0x0110, B:66:0x0123, B:68:0x0127, B:69:0x012e, B:75:0x013f, B:76:0x014b, B:78:0x0153, B:79:0x0156, B:85:0x015d, B:87:0x0165, B:88:0x0174), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018a A[Catch: all -> 0x01a4, TryCatch #0 {all -> 0x01a4, blocks: (B:3:0x000a, B:89:0x0178, B:96:0x0182, B:98:0x018a, B:99:0x0194, B:100:0x018d, B:107:0x01a9, B:108:0x01ac), top: B:2:0x000a }] */
    /* renamed from: handleMotionEvent-8iAsVTc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int m9handleMotionEvent8iAsVTc(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.m9handleMotionEvent8iAsVTc(android.view.MotionEvent):int");
    }

    private final boolean handleRotaryEvent(MotionEvent motionEvent) {
        ta taVar;
        int size;
        ja3 ja3Var;
        boolean z;
        k13 k13Var;
        ja3 ja3Var2;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        motionEvent.getAxisValue(26);
        Context context = getContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            Method method = hr5.a;
            ed.e(viewConfiguration);
        } else {
            hr5.a(viewConfiguration, context);
        }
        Context context2 = getContext();
        if (i >= 26) {
            ed.d(viewConfiguration);
        } else {
            hr5.a(viewConfiguration, context2);
        }
        motionEvent.getEventTime();
        motionEvent.getDeviceId();
        bi1 focusOwner = getFocusOwner();
        ka kaVar = new ka(this, motionEvent, (byte) 1);
        di1 di1Var = (di1) focusOwner;
        if (di1Var.d.e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        ui1 p = mu0.p(di1Var.c);
        if (p != null) {
            if (!p.getNode().isAttached()) {
                q02.b("visitAncestors called on an unattached node");
            }
            k13 node = p.getNode();
            wa2 U = ut0.U(p);
            loop0: while (true) {
                if (U == null) {
                    k13Var = null;
                    break;
                }
                if ((U.n0.f.getAggregateChildKindSet$ui() & 16384) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui() & 16384) != 0) {
                            b53 b53Var = null;
                            k13Var = node;
                            while (k13Var != null) {
                                if (k13Var instanceof ta) {
                                    break loop0;
                                }
                                if ((k13Var.getKindSet$ui() & 16384) != 0 && (k13Var instanceof wt0)) {
                                    int i2 = 0;
                                    for (k13 k13Var2 = ((wt0) k13Var).J; k13Var2 != null; k13Var2 = k13Var2.getChild$ui()) {
                                        if ((k13Var2.getKindSet$ui() & 16384) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                k13Var = k13Var2;
                                            } else {
                                                if (b53Var == null) {
                                                    b53Var = new b53(new k13[16]);
                                                }
                                                if (k13Var != null) {
                                                    b53Var.c(k13Var);
                                                    k13Var = null;
                                                }
                                                b53Var.c(k13Var2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                k13Var = ut0.M(b53Var);
                            }
                        }
                        node = node.getParent$ui();
                    }
                }
                U = U.v();
                node = (U == null || (ja3Var2 = U.n0) == null) ? null : ja3Var2.e;
            }
            taVar = (ta) k13Var;
        } else {
            taVar = null;
        }
        if (taVar != null) {
            if (!taVar.getNode().isAttached()) {
                q02.b("visitAncestors called on an unattached node");
            }
            k13 parent$ui = taVar.getNode().getParent$ui();
            wa2 U2 = ut0.U(taVar);
            ArrayList arrayList = null;
            while (U2 != null) {
                if ((U2.n0.f.getAggregateChildKindSet$ui() & 16384) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & 16384) != 0) {
                            k13 k13Var3 = parent$ui;
                            b53 b53Var2 = null;
                            while (k13Var3 != null) {
                                if (k13Var3 instanceof ta) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(k13Var3);
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z && (k13Var3.getKindSet$ui() & 16384) != 0 && (k13Var3 instanceof wt0)) {
                                    int i3 = 0;
                                    for (k13 k13Var4 = ((wt0) k13Var3).J; k13Var4 != null; k13Var4 = k13Var4.getChild$ui()) {
                                        if ((k13Var4.getKindSet$ui() & 16384) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                k13Var3 = k13Var4;
                                            } else {
                                                if (b53Var2 == null) {
                                                    b53Var2 = new b53(new k13[16]);
                                                }
                                                if (k13Var3 != null) {
                                                    b53Var2.c(k13Var3);
                                                    k13Var3 = null;
                                                }
                                                b53Var2.c(k13Var4);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                k13Var3 = ut0.M(b53Var2);
                            }
                        }
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                U2 = U2.v();
                parent$ui = (U2 == null || (ja3Var = U2.n0) == null) ? null : ja3Var.e;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i4 = size - 1;
                    ((ta) arrayList.get(size)).getClass();
                    if (i4 < 0) {
                        break;
                    }
                    size = i4;
                }
            }
            k13 node2 = taVar.getNode();
            b53 b53Var3 = null;
            while (node2 != null) {
                if (!(node2 instanceof ta) && (node2.getKindSet$ui() & 16384) != 0 && (node2 instanceof wt0)) {
                    int i5 = 0;
                    for (k13 k13Var5 = ((wt0) node2).J; k13Var5 != null; k13Var5 = k13Var5.getChild$ui()) {
                        if ((k13Var5.getKindSet$ui() & 16384) != 0) {
                            i5++;
                            if (i5 == 1) {
                                node2 = k13Var5;
                            } else {
                                if (b53Var3 == null) {
                                    b53Var3 = new b53(new k13[16]);
                                }
                                if (node2 != null) {
                                    b53Var3.c(node2);
                                    node2 = null;
                                }
                                b53Var3.c(k13Var5);
                            }
                        }
                    }
                    if (i5 == 1) {
                    }
                }
                node2 = ut0.M(b53Var3);
            }
            if (((Boolean) kaVar.invoke()).booleanValue()) {
                return true;
            }
            k13 node3 = taVar.getNode();
            b53 b53Var4 = null;
            while (node3 != null) {
                if (!(node3 instanceof ta) && (node3.getKindSet$ui() & 16384) != 0 && (node3 instanceof wt0)) {
                    int i6 = 0;
                    for (k13 k13Var6 = ((wt0) node3).J; k13Var6 != null; k13Var6 = k13Var6.getChild$ui()) {
                        if ((k13Var6.getKindSet$ui() & 16384) != 0) {
                            i6++;
                            if (i6 == 1) {
                                node3 = k13Var6;
                            } else {
                                if (b53Var4 == null) {
                                    b53Var4 = new b53(new k13[16]);
                                }
                                if (node3 != null) {
                                    b53Var4.c(node3);
                                    node3 = null;
                                }
                                b53Var4.c(k13Var6);
                            }
                        }
                    }
                    if (i6 == 1) {
                    }
                }
                node3 = ut0.M(b53Var4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    ((ta) arrayList.get(i7)).getClass();
                }
            }
        }
        return false;
    }

    private final boolean hasChangedDevices(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 indirectPointerNavigationGestureDetector$lambda$0(AndroidComposeView androidComposeView, oh1 oh1Var) {
        ((di1) androidComposeView.getFocusOwner()).h(oh1Var.a, false);
        return wd5.a;
    }

    private final l54 installLocalRetainedValuesStore(vi2 vi2Var, wr5 wr5Var) {
        yi2 yi2Var = this.frameEndScheduler;
        Object obj = null;
        if (vi2Var != null && wr5Var != null && yi2Var != null) {
            vr5 f = wr5Var.f();
            vl1 vl1Var = new vl1((byte) 2);
            ul0 ul0Var = ul0.b;
            ul0Var.getClass();
            ts0 ts0Var = new ts0(f, vl1Var, ul0Var);
            k60 a2 = s24.a(aj2.class);
            String b = a2.b();
            if (b != null) {
                aj2 aj2Var = (aj2) ts0Var.p(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
                Object parent = getParent();
                parent.getClass();
                int id = ((View) parent).getId();
                q33 q33Var = aj2Var.b;
                Object b2 = q33Var.b(id);
                if (b2 == null) {
                    b2 = new e43(1);
                    q33Var.i(id, b2);
                }
                e43 e43Var = (e43) b2;
                Object[] objArr = e43Var.a;
                int i = e43Var.b;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        break;
                    }
                    Object obj2 = objArr[i2];
                    if (!((zi2) obj2).c) {
                        obj = obj2;
                        break;
                    }
                    i2++;
                }
                zi2 zi2Var = (zi2) obj;
                if (zi2Var == null) {
                    zi2Var = new zi2();
                    e43Var.a(zi2Var);
                }
                zi2Var.c = true;
                this.lifecycleRetainedValuesStoreOwnerEntry = zi2Var;
                return zi2Var.b;
            }
            s83.t("Local and anonymous classes can not be ViewModels");
        }
        return null;
    }

    private final void invalidateLayers(wa2 wa2Var) {
        wa2Var.F();
        b53 A = wa2Var.A();
        Object[] objArr = A.I;
        int i = A.K;
        for (int i2 = 0; i2 < i; i2++) {
            invalidateLayers((wa2) objArr[i2]);
        }
    }

    private final void invalidateLayoutNodeMeasurement(wa2 wa2Var) {
        this.measureAndLayoutDelegate.r(wa2Var, false);
        b53 A = wa2Var.A();
        Object[] objArr = A.I;
        int i = A.K;
        for (int i2 = 0; i2 < i; i2++) {
            invalidateLayoutNodeMeasurement((wa2) objArr[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAttached() {
        return ((Boolean) this.isAttached$delegate.getValue()).booleanValue();
    }

    private final boolean isBadMotionEvent(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Log.LOG_LEVEL_OFF) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Log.LOG_LEVEL_OFF) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Log.LOG_LEVEL_OFF) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Log.LOG_LEVEL_OFF) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Log.LOG_LEVEL_OFF) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Log.LOG_LEVEL_OFF) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !d23.a.a(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final boolean isDevicePressEvent(MotionEvent motionEvent) {
        int actionMasked;
        return motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    private final boolean isInBounds(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    private final boolean isPositionChanged(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.previousMotionEvent) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 layoutChildViewsIfNeeded$lambda$0(AndroidComposeView androidComposeView) {
        vg vgVar = androidComposeView._androidViewsHandler;
        if (vgVar != null) {
            int childCount = vgVar.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = vgVar.getChildAt(i);
                qg qgVar = childAt instanceof qg ? (qg) childAt : null;
                if (qgVar != null && qgVar.isLayoutRequested()) {
                    qgVar.layout(qgVar.getLeft(), qgVar.getTop(), qgVar.getRight(), qgVar.getBottom());
                }
            }
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tq2 localeList_delegate$lambda$0(AndroidComposeView androidComposeView) {
        uq2 L = qb.L(androidComposeView.getConfiguration());
        if (L.a.isEmpty()) {
            L = Build.VERSION.SDK_INT >= 24 ? new uq2(new xq2(dl.c())) : uq2.a(Locale.getDefault());
        }
        wq2 wq2Var = L.a;
        int size = wq2Var.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            Locale locale = wq2Var.get(i);
            locale.getClass();
            arrayList.add(new sq2(locale));
        }
        return new tq2(arrayList);
    }

    /* renamed from: moveFocusInChildrenBypassUnfocusableComposeView-3ESFkO8, reason: not valid java name */
    private final boolean m10moveFocusInChildrenBypassUnfocusableComposeView3ESFkO8(int i) {
        if (i == 7 || i == 8) {
            return false;
        }
        Integer c = yh1.c(i);
        if (c == null) {
            throw r7.t("Invalid focus direction");
        }
        int intValue = c.intValue();
        View m7findNextViewInEmbeddedView3ESFkO8 = m7findNextViewInEmbeddedView3ESFkO8(i);
        if (m7findNextViewInEmbeddedView3ESFkO8 != null) {
            return yh1.b(m7findNextViewInEmbeddedView3ESFkO8, Integer.valueOf(intValue), null);
        }
        return false;
    }

    /* renamed from: moveFocusInChildrenCurrent-3ESFkO8, reason: not valid java name */
    private final boolean m11moveFocusInChildrenCurrent3ESFkO8(int i) {
        if (i == 7 || i == 8) {
            return false;
        }
        Integer c = yh1.c(i);
        if (c == null) {
            throw r7.t("Invalid focus direction");
        }
        int intValue = c.intValue();
        m14 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        Rect h0 = embeddedViewFocusRect != null ? sp0.h0(embeddedViewFocusRect) : null;
        FocusFinder focusFinder = FocusFinder.getInstance();
        View findNextFocus = h0 == null ? focusFinder.findNextFocus(this, findFocus(), intValue) : focusFinder.findNextFocusFromRect(this, h0, intValue);
        if (findNextFocus != null) {
            return yh1.b(findNextFocus, Integer.valueOf(intValue), h0);
        }
        return false;
    }

    /* renamed from: moveFocusInChildrenViewFocusFix-3ESFkO8, reason: not valid java name */
    private final boolean m12moveFocusInChildrenViewFocusFix3ESFkO8(int i) {
        vg vgVar;
        if (i == 7 || i == 8 || !hasFocus() || (vgVar = this._androidViewsHandler) == null) {
            return false;
        }
        Integer c = yh1.c(i);
        if (c == null) {
            throw r7.t("Invalid focus direction");
        }
        int intValue = c.intValue();
        View rootView = getRootView();
        rootView.getClass();
        ViewGroup viewGroup = (ViewGroup) rootView;
        View findFocus = viewGroup.findFocus();
        if (findFocus == null) {
            zy.i("view hasFocus but root can't find it");
            return false;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, findFocus, intValue);
        if (!c21.B(i) || !vgVar.hasFocus()) {
            m14 embeddedViewFocusRect = getEmbeddedViewFocusRect();
            r6 = embeddedViewFocusRect != null ? sp0.h0(embeddedViewFocusRect) : null;
            if (findNextFocus != null && r6 != null) {
                viewGroup.offsetDescendantRectToMyCoords(this, r6);
                viewGroup.offsetRectIntoDescendantCoords(findNextFocus, r6);
            }
        }
        if (findNextFocus == null || findNextFocus == findFocus) {
            return false;
        }
        View focusedChild = vgVar.getFocusedChild();
        ViewParent parent = findNextFocus.getParent();
        while (parent != null && parent != focusedChild) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return false;
        }
        return yh1.b(findNextFocus, Integer.valueOf(intValue), r6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 onAttachedToWindow$lambda$0(AndroidComposeView androidComposeView) {
        Companion.getClass();
        if (Build.VERSION.SDK_INT > 28 && androidComposeView.isAttachedToWindow()) {
            if (systemPropertiesChangedRunnable == null) {
                pa paVar = new pa((byte) 0);
                systemPropertiesChangedRunnable = paVar;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (systemPropertiesClass == null) {
                        systemPropertiesClass = Class.forName("android.os.SystemProperties");
                    }
                    if (addChangeCallbackMethod == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = systemPropertiesClass;
                        addChangeCallbackMethod = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = addChangeCallbackMethod;
                    if (method != null) {
                        method.invoke(null, paVar);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            synchronized (composeViews) {
                composeViews.a(androidComposeView);
            }
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void outOfFrameRunnable$lambda$0(AndroidComposeView androidComposeView) {
        Trace.beginSection("AndroidOwner:outOfFrameExecutor");
        while (!androidComposeView.outOfFrameQueue.isEmpty()) {
            try {
                ((rm1) androidComposeView.outOfFrameQueue.removeLast()).invoke();
            } finally {
                Trace.endSection();
            }
        }
    }

    /* renamed from: pack-ZIaKswc, reason: not valid java name */
    private final long m13packZIaKswc(int i, int i2) {
        return (i << 32) | i2;
    }

    private final void populateAutofillVirtualStructure(ViewStructure viewStructure) {
        w9 autofillManager = getAutofillManager();
        if (autofillManager != null) {
            wa2 wa2Var = autofillManager.J.a;
            AutofillId autofillId = autofillManager.O;
            String str = autofillManager.M;
            o14 o14Var = autofillManager.L;
            lq2.d0(viewStructure, wa2Var, autofillId, str, o14Var);
            Object[] objArr = ed3.a;
            e43 e43Var = new e43(2);
            e43Var.a(wa2Var);
            e43Var.a(viewStructure);
            while (e43Var.j()) {
                Object l = e43Var.l(e43Var.b - 1);
                l.getClass();
                ViewStructure viewStructure2 = (ViewStructure) l;
                Object l2 = e43Var.l(e43Var.b - 1);
                l2.getClass();
                a53 a53Var = (a53) ((wa2) l2).o();
                int i = a53Var.I.K;
                for (int i2 = 0; i2 < i; i2++) {
                    wa2 wa2Var2 = (wa2) a53Var.get(i2);
                    if (!wa2Var2.y0 && wa2Var2.K() && wa2Var2.L()) {
                        ki4 x = wa2Var2.x();
                        if (x != null) {
                            n43 n43Var = x.I;
                            if (n43Var.b(ii4.g) || n43Var.b(ii4.h) || n43Var.b(zi4.r) || n43Var.b(zi4.s) || (Build.VERSION.SDK_INT >= 34 && n43Var.b(p70.D))) {
                                ViewStructure q = x9.q(viewStructure2, x9.a(viewStructure2));
                                lq2.d0(q, wa2Var2, autofillManager.O, str, o14Var);
                                e43Var.a(wa2Var2);
                                e43Var.a(q);
                            }
                        }
                        e43Var.a(wa2Var2);
                        e43Var.a(viewStructure2);
                    }
                }
            }
        }
        v9 autofill = getAutofill();
        if (autofill != null) {
            x9.t(autofill, viewStructure);
        }
    }

    private final void recalculateWindowPosition() {
        if (this.forceUseMatrixCache) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = currentAnimationTimeMillis;
            recalculateWindowViewTransforms();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.tmpPositionArray);
            int[] iArr = this.tmpPositionArray;
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            float f3 = this.tmpPositionArray[0];
            float f4 = f2 - r0[1];
            this.windowPosition = (Float.floatToRawIntBits(f - f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
        }
    }

    private final void recalculateWindowViewTransforms() {
        m3calculateMatrixToWindow58bKbWc(this.viewToWindowMatrix);
        sv2.F(this.viewToWindowMatrix, this.windowToViewMatrix);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean requestFocusBypassUnfocusableComposeView$lambda$0(int i, ui1 ui1Var) {
        return ui1Var.r0(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean requestFocusBypassUnfocusableComposeView$lambda$1(int i, ui1 ui1Var) {
        return ui1Var.r0(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean requestFocusCurrent$lambda$0(int i, ui1 ui1Var) {
        return ui1Var.r0(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean requestFocusViewFocusFix$lambda$0(n24 n24Var, int i, ui1 ui1Var) {
        n24Var.I = true;
        return ui1Var.r0(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean requestFocusViewFocusFix$lambda$1(int i, ui1 ui1Var) {
        return ui1Var.r0(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 resendMotionEventOnLayout$lambda$0(AndroidComposeView androidComposeView) {
        MotionEvent motionEvent = androidComposeView.previousMotionEvent;
        if (motionEvent != null) {
            boolean z = false;
            boolean contains = p70.k0(9, 7, 8).contains(Integer.valueOf(motionEvent.getActionMasked()));
            MotionEvent motionEvent2 = androidComposeView.previousMotionEvent;
            if (motionEvent2 != null && motionEvent2.getButtonState() == 0) {
                z = true;
            }
            if (contains && z) {
                androidComposeView.relayoutTime = SystemClock.uptimeMillis();
                androidComposeView.post(androidComposeView.resendMotionEventRunnable);
            }
        }
        androidComposeView.layoutChildViewsIfNeeded.invoke();
        return wd5.a;
    }

    private final void scheduleMeasureAndLayout(wa2 wa2Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (wa2Var != null) {
            while (wa2Var != null && wa2Var.s() == ua2.I && childSizeCanAffectParentSize(wa2Var)) {
                wa2Var = wa2Var.v();
            }
            if (wa2Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public static /* synthetic */ void scheduleMeasureAndLayout$default(AndroidComposeView androidComposeView, wa2 wa2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            wa2Var = null;
        }
        androidComposeView.scheduleMeasureAndLayout(wa2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendHoverExitEvent$lambda$0(AndroidComposeView androidComposeView) {
        androidComposeView.hoverExitReceived = false;
        MotionEvent motionEvent = androidComposeView.previousMotionEvent;
        motionEvent.getClass();
        if (motionEvent.getActionMasked() == 10) {
            androidComposeView.m14sendMotionEvent8iAsVTc(motionEvent);
        } else {
            zy.i("The ACTION_HOVER_EXIT event was not cleared.");
        }
    }

    /* renamed from: sendMotionEvent-8iAsVTc, reason: not valid java name */
    private final int m14sendMotionEvent8iAsVTc(MotionEvent motionEvent) {
        Object obj;
        if (this.keyboardModifiersRequireUpdate) {
            this.keyboardModifiersRequireUpdate = false;
            fh2 fh2Var = getComposeViewContext().t;
            int metaState = motionEvent.getMetaState();
            jk3 jk3Var = su5.a;
            hc4.F().setValue(new bq3(metaState));
        }
        g12 c = this.motionEventAdapter.c(this, motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (c == null) {
            up3 up3Var = this.pointerInputEventProcessor;
            if (!up3Var.e) {
                ((bs2) up3Var.c.J).b();
                up3Var.b.c();
            }
            return il2.b(false, false, false);
        }
        ArrayList arrayList = (ArrayList) c.w();
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                obj = arrayList.get(size);
                if (((tp3) obj).b() && (actionMasked == 0 || actionMasked == 5)) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        obj = null;
        tp3 tp3Var = (tp3) obj;
        if (tp3Var != null) {
            this.lastDownPointerPosition = tp3Var.g();
        }
        int a2 = this.pointerInputEventProcessor.a(c, this, isInBounds(motionEvent));
        c.T();
        if ((actionMasked != 0 && actionMasked != 5) || (a2 & 1) != 0) {
            return a2;
        }
        c23 c23Var = this.motionEventAdapter;
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        c23Var.c.delete(pointerId);
        c23Var.b.delete(pointerId);
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendSimulatedEvent(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int i2 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i2 = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            i2 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i2 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i4 = 0; i4 < pointerCount; i4++) {
            pointerCoordsArr[i4] = new MotionEvent.PointerCoords();
        }
        int i5 = 0;
        while (i5 < pointerCount) {
            int i6 = ((i2 < 0 || i2 > i5) ? 0 : 1) + i5;
            motionEvent.getPointerProperties(i6, pointerPropertiesArr[i5]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i5];
            motionEvent.getPointerCoords(i6, pointerCoords);
            float f = pointerCoords.x;
            long mo21localToScreenMKHz9U = mo21localToScreenMKHz9U((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (mo21localToScreenMKHz9U >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (mo21localToScreenMKHz9U & 4294967295L));
            i5++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        g12 c = this.motionEventAdapter.c(this, obtain);
        c.getClass();
        this.pointerInputEventProcessor.a(c, this, true);
        obtain.recycle();
    }

    public static /* synthetic */ void sendSimulatedEvent$default(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i, long j, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        androidComposeView.sendSimulatedEvent(motionEvent, i, j, z);
    }

    private final void setAttached(boolean z) {
        this.isAttached$delegate.setValue(Boolean.valueOf(z));
    }

    private void setDensity(iu0 iu0Var) {
        this.density$delegate.setValue(iu0Var);
    }

    private void setLayoutDirection(da2 da2Var) {
        this.layoutDirection$delegate.setValue(da2Var);
    }

    private final void set_composeViewContext(be0 be0Var) {
        this._composeViewContext$delegate.setValue(be0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 snapshotObserver$lambda$0(AndroidComposeView androidComposeView, rm1 rm1Var) {
        androidComposeView.getClass();
        Handler handler = androidComposeView.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            rm1Var.invoke();
        } else {
            Handler handler2 = androidComposeView.getHandler();
            if (handler2 != null) {
                handler2.post(new fa(rm1Var, (byte) 0));
            }
        }
        return wd5.a;
    }

    private static final wd5 snapshotObserver$lambda$0$0(rm1 rm1Var, d74 d74Var) {
        try {
            rm1Var.invoke();
        } catch (Exception unused) {
            d74Var.a();
        }
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startDrag-12SF9DM, reason: not valid java name */
    public final boolean m15startDrag12SF9DM(d21 d21Var, long j, tm1 tm1Var) {
        Resources resources = getContext().getResources();
        fd0 fd0Var = new fd0(new lu0(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), j, tm1Var);
        if (Build.VERSION.SDK_INT >= 24) {
            return lb.a.a(this, d21Var, fd0Var);
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fe textInputSession$lambda$0(AndroidComposeView androidComposeView, dl0 dl0Var) {
        return new fe(androidComposeView, androidComposeView.getTextInputService(), dl0Var);
    }

    private final void updateConfiguration(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (j42.c(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale == configuration.fontScale && configuration2.densityDpi == configuration.densityDpi) {
            return;
        }
        setDensity(qb.m(getContext()));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updatePositionCacheAndDispatch() {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.updatePositionCacheAndDispatch():void");
    }

    public final void addAndroidView(qg qgVar, wa2 wa2Var) {
        getAndroidViewsHandler$ui().getHolderToLayoutNode().put(qgVar, wa2Var);
        getAndroidViewsHandler$ui().addView(qgVar);
        getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(wa2Var, qgVar);
        qgVar.setImportantForAccessibility(1);
        dr5.h(qgVar, new ua(this, wa2Var, this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        ui1 ui1Var = ((di1) getFocusOwner()).c;
        if (!ui1Var.isAttached()) {
            return;
        }
        if (!ui1Var.getNode().isAttached()) {
            q02.b("visitSubtreeIf called on an unattached node");
        }
        b53 b53Var = new b53(new k13[16]);
        k13 child$ui = ui1Var.getNode().getChild$ui();
        if (child$ui == null) {
            ut0.h(b53Var, ui1Var.getNode());
        } else {
            b53Var.c(child$ui);
        }
        while (true) {
            int i3 = b53Var.K;
            if (i3 == 0) {
                return;
            }
            k13 k13Var = (k13) b53Var.l(i3 - 1);
            if ((k13Var.getAggregateChildKindSet$ui() & 1024) != 0) {
                for (k13 k13Var2 = k13Var; k13Var2 != null && k13Var2.isAttached(); k13Var2 = k13Var2.getChild$ui()) {
                    if ((k13Var2.getKindSet$ui() & 1024) != 0) {
                        k13 k13Var3 = k13Var2;
                        b53 b53Var2 = null;
                        while (k13Var3 != null) {
                            int i4 = 0;
                            if (k13Var3 instanceof ui1) {
                                ui1 ui1Var2 = (ui1) k13Var3;
                                if (ui1Var2.isAttached() && ui1Var2.l0().a) {
                                    super.addFocusables(arrayList, i, i2);
                                    ui1 ui1Var3 = ((di1) getFocusOwner()).c;
                                    if (ui1Var3.isAttached()) {
                                        if (!ui1Var3.getNode().isAttached()) {
                                            q02.b("visitSubtreeIf called on an unattached node");
                                        }
                                        b53 b53Var3 = new b53(new k13[16]);
                                        k13 child$ui2 = ui1Var3.getNode().getChild$ui();
                                        if (child$ui2 == null) {
                                            ut0.h(b53Var3, ui1Var3.getNode());
                                        } else {
                                            b53Var3.c(child$ui2);
                                        }
                                        while (true) {
                                            int i5 = b53Var3.K;
                                            if (i5 == 0) {
                                                break;
                                            }
                                            k13 k13Var4 = (k13) b53Var3.l(i5 - 1);
                                            if ((k13Var4.getAggregateChildKindSet$ui() & 1024) != 0) {
                                                for (k13 k13Var5 = k13Var4; k13Var5 != null && k13Var5.isAttached(); k13Var5 = k13Var5.getChild$ui()) {
                                                    if ((k13Var5.getKindSet$ui() & 1024) != 0) {
                                                        k13 k13Var6 = k13Var5;
                                                        b53 b53Var4 = null;
                                                        while (k13Var6 != null) {
                                                            if (k13Var6 instanceof ui1) {
                                                                ui1 ui1Var4 = (ui1) k13Var6;
                                                                if (ui1Var4.isAttached()) {
                                                                    gi1 l0 = ui1Var4.l0();
                                                                    if (ui1Var4.isAttached() && !ui1Var4.I && l0.a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((k13Var6.getKindSet$ui() & 1024) != 0 && (k13Var6 instanceof wt0)) {
                                                                int i6 = 0;
                                                                for (k13 k13Var7 = ((wt0) k13Var6).J; k13Var7 != null; k13Var7 = k13Var7.getChild$ui()) {
                                                                    if ((k13Var7.getKindSet$ui() & 1024) != 0) {
                                                                        i6++;
                                                                        if (i6 == 1) {
                                                                            k13Var6 = k13Var7;
                                                                        } else {
                                                                            if (b53Var4 == null) {
                                                                                b53Var4 = new b53(new k13[16]);
                                                                            }
                                                                            if (k13Var6 != null) {
                                                                                b53Var4.c(k13Var6);
                                                                                k13Var6 = null;
                                                                            }
                                                                            b53Var4.c(k13Var7);
                                                                        }
                                                                    }
                                                                }
                                                                if (i6 == 1) {
                                                                }
                                                            }
                                                            k13Var6 = ut0.M(b53Var4);
                                                        }
                                                    }
                                                }
                                            }
                                            ut0.h(b53Var3, k13Var4);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((k13Var3.getKindSet$ui() & 1024) != 0 && (k13Var3 instanceof wt0)) {
                                for (k13 k13Var8 = ((wt0) k13Var3).J; k13Var8 != null; k13Var8 = k13Var8.getChild$ui()) {
                                    if ((k13Var8.getKindSet$ui() & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            k13Var3 = k13Var8;
                                        } else {
                                            if (b53Var2 == null) {
                                                b53Var2 = new b53(new k13[16]);
                                            }
                                            if (k13Var3 != null) {
                                                b53Var2.c(k13Var3);
                                                k13Var3 = null;
                                            }
                                            b53Var2.c(k13Var8);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            k13Var3 = ut0.M(b53Var2);
                        }
                    }
                }
            }
            ut0.h(b53Var, k13Var);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(view, i, layoutParams);
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        if (autofillSupported()) {
            w9 autofillManager = getAutofillManager();
            if (autofillManager != null) {
                autofillManager.a(sparseArray);
            }
            v9 autofill = getAutofill();
            if (autofill != null) {
                x9.s(autofill, sparseArray);
            }
        }
    }

    public final Object boundsUpdatesAccessibilityEventLoop(fj0 fj0Var) {
        Object boundsUpdatesEventLoop$ui = this.composeAccessibilityDelegate.boundsUpdatesEventLoop$ui(fj0Var);
        return boundsUpdatesEventLoop$ui == el0.I ? boundsUpdatesEventLoop$ui : wd5.a;
    }

    public final Object boundsUpdatesContentCaptureEventLoop(fj0 fj0Var) {
        Object a2 = this.contentCaptureManager.a(fj0Var);
        return a2 == el0.I ? a2 : wd5.a;
    }

    @Override // defpackage.qh3
    /* renamed from: calculateLocalPosition-MK-Hz9U, reason: not valid java name */
    public long mo16calculateLocalPositionMKHz9U(long j) {
        recalculateWindowPosition();
        return nw2.b(j, this.windowToViewMatrix);
    }

    @Override // defpackage.qh3
    /* renamed from: calculatePositionInWindow-MK-Hz9U, reason: not valid java name */
    public long mo17calculatePositionInWindowMKHz9U(long j) {
        recalculateWindowPosition();
        return nw2.b(j, this.viewToWindowMatrix);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return this.composeAccessibilityDelegate.m33canScroll0AR0LA0$ui(false, i, this.lastDownPointerPosition);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.composeAccessibilityDelegate.m33canScroll0AR0LA0$ui(true, i, this.lastDownPointerPosition);
    }

    @Override // defpackage.jn3
    public void clearOwnerFocus() {
        if (isFocused() || hasFocus()) {
            clearFocus();
        } else if (hasFocus()) {
            View findFocus = findFocus();
            if (findFocus != null) {
                findFocus.clearFocus();
            }
            clearFocus();
        }
    }

    @Override // defpackage.qh3
    public oh3 createLayer(hn1 hn1Var, rm1 rm1Var, jr1 jr1Var) {
        b53 b53Var;
        Reference poll;
        Object obj;
        if (jr1Var != null) {
            return new mr1(jr1Var, null, this, hn1Var, rm1Var);
        }
        ys5 ys5Var = this.layerCache;
        do {
            ReferenceQueue referenceQueue = ys5Var.b;
            b53Var = ys5Var.a;
            poll = referenceQueue.poll();
            if (poll != null) {
                b53Var.k(poll);
            }
        } while (poll != null);
        while (true) {
            int i = b53Var.K;
            if (i == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) b53Var.l(i - 1)).get();
            if (obj != null) {
                break;
            }
        }
        oh3 oh3Var = (oh3) obj;
        if (oh3Var == null) {
            return new mr1(getGraphicsContext().c(), getGraphicsContext(), this, hn1Var, rm1Var);
        }
        mr1 mr1Var = (mr1) oh3Var;
        ir1 ir1Var = mr1Var.J;
        if (ir1Var == null) {
            throw r7.t("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!mr1Var.I.s) {
            q02.a("layer should have been released before reuse");
        }
        mr1Var.I = ir1Var.c();
        mr1Var.O = false;
        mr1Var.L = hn1Var;
        mr1Var.M = rm1Var;
        mr1Var.Y = false;
        mr1Var.Z = false;
        mr1Var.a0 = true;
        nw2.d(mr1Var.P);
        float[] fArr = mr1Var.Q;
        if (fArr != null) {
            nw2.d(fArr);
        }
        mr1Var.W = r95.b;
        mr1Var.b0 = false;
        mr1Var.N = 9223372034707292159L;
        mr1Var.X = null;
        mr1Var.V = 0;
        return oh3Var;
    }

    public void decrementKeepScreenOnCount() {
        this.keepScreenOnCount--;
        getView().setKeepScreenOn(this.keepScreenOnCount > 0);
    }

    public void decrementSensitiveComponentCount() {
        if (Build.VERSION.SDK_INT >= 35) {
            if (this.sensitiveComponentCount == 1) {
                kb.a.a(getView(), false);
            }
            this.sensitiveComponentCount--;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            invalidateLayers(getRoot());
        }
        measureAndLayout(true);
        ws4.h().m();
        this.isDrawingContent = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            s10 canvasHolder = getCanvasHolder();
            aa aaVar = canvasHolder.a;
            Canvas canvas2 = aaVar.a;
            aaVar.a = canvas;
            wa2 root = getRoot();
            root.getClass();
            try {
                root.n0.d.D0(aaVar, null);
                canvasHolder.a.a = canvas2;
                if (this.dirtyLayers.j()) {
                    int i = this.dirtyLayers.b;
                    for (int i2 = 0; i2 < i; i2++) {
                        ((mr1) ((oh3) this.dirtyLayers.g(i2))).f();
                    }
                }
                int i3 = nr5.I;
                this.dirtyLayers.d();
                this.isDrawingContent = false;
                Trace.endSection();
                e43 e43Var = this.postponedDirtyLayers;
                if (e43Var != null) {
                    this.dirtyLayers.b(e43Var);
                    e43Var.d();
                }
                if (isArrEnabled$ui()) {
                    if (Float.compare(this.currentFrameRate, this.lastSetFrameRate) != 0) {
                        float f = this.currentFrameRate;
                        this.lastSetFrameRate = f;
                        kk.a(this, f);
                    }
                    View view = this.frameRateCategoryView;
                    if (view != null) {
                        if (Float.compare(this.currentFrameRateCategory, this.lastSetFrameRateCategory) != 0) {
                            float f2 = this.currentFrameRateCategory;
                            this.lastSetFrameRateCategory = f2;
                            kk.a(view, f2);
                        }
                        if (!Float.isNaN(this.currentFrameRateCategory)) {
                            view.invalidate();
                            drawChild(canvas, view, getDrawingTime());
                        }
                    }
                    this.currentFrameRate = Float.NaN;
                    this.currentFrameRateCategory = Float.NaN;
                }
            } catch (Throwable th) {
                root.b0(th);
                throw null;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean z;
        fd fdVar;
        boolean z2;
        long j;
        SparseLongArray sparseLongArray;
        boolean z3;
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            if (motionEvent.getActionMasked() == 8) {
                this.hoverExitReceived = false;
            } else {
                this.sendHoverExitEvent.run();
            }
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        boolean z4 = true;
        if (motionEvent.getActionMasked() == 8) {
            return motionEvent.isFromSource(4194304) ? handleRotaryEvent(motionEvent) : (m9handleMotionEvent8iAsVTc(motionEvent) & 4) != 0;
        }
        if (motionEvent.isFromSource(2097152)) {
            c23 c23Var = this.motionEventAdapter;
            qz1 qz1Var = this.primaryDirectionalMotionAxisOverride;
            bs2 bs2Var = c23Var.e;
            SparseLongArray sparseLongArray2 = c23Var.b;
            int actionMasked = motionEvent.getActionMasked();
            c23Var.b(motionEvent);
            if (actionMasked == 3) {
                sparseLongArray2.clear();
                c23Var.c.clear();
                fdVar = null;
                z = true;
            } else {
                c23Var.a(motionEvent);
                int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
                boolean z5 = actionMasked == 0 || actionMasked == 2 || actionMasked == 5;
                int pointerCount = motionEvent.getPointerCount();
                ArrayList arrayList = new ArrayList(pointerCount);
                int i = 0;
                while (i < pointerCount) {
                    int pointerId = motionEvent.getPointerId(i);
                    int indexOfKey = sparseLongArray2.indexOfKey(pointerId);
                    if (indexOfKey >= 0) {
                        j = sparseLongArray2.valueAt(indexOfKey);
                        z2 = z4;
                    } else {
                        long j2 = c23Var.a;
                        z2 = z4;
                        c23Var.a = j2 + 1;
                        sparseLongArray2.put(pointerId, j2);
                        j = j2;
                    }
                    long floatToRawIntBits = (Float.floatToRawIntBits(motionEvent.getY(i)) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getX(i)) << 32);
                    boolean z6 = i != actionIndex ? z2 : false;
                    b23 b23Var = (b23) bs2Var.d(j);
                    if (i == actionIndex) {
                        bs2Var.h(j);
                        sparseLongArray = sparseLongArray2;
                        z3 = z5;
                    } else {
                        sparseLongArray = sparseLongArray2;
                        z3 = z5;
                        if (z5) {
                            bs2Var.g(j, b23.a(b23.b(motionEvent.getEventTime(), floatToRawIntBits)));
                        }
                    }
                    arrayList.add(new rz1(j, motionEvent.getEventTime(), floatToRawIntBits, z6, motionEvent.getPressure(i), b23Var != null ? b23.e(b23Var.f()) : motionEvent.getEventTime(), b23Var != null ? b23.d(b23Var.f()) : floatToRawIntBits, b23Var != null ? b23.c(b23Var.f()) : false));
                    i++;
                    sparseLongArray2 = sparseLongArray;
                    z5 = z3;
                    z4 = z2;
                }
                z = z4;
                c23Var.e(motionEvent);
                fdVar = new fd(arrayList, qz1Var != null ? qz1Var.a : c5.S(motionEvent), motionEvent);
            }
            if (fdVar == null) {
                ((di1) getFocusOwner()).c();
                b02 b02Var = this.indirectPointerNavigationGestureDetector;
                b02Var.b = 0;
                boolean z7 = z;
                b02Var.c = z7;
                return z7;
            }
            if (handleIndirectPointerEvent(fdVar)) {
                return z;
            }
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
    
        if (isPositionChanged(r6) == false) goto L29;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchHoverEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.hoverExitReceived
            if (r0 == 0) goto Le
            java.lang.Runnable r0 = r5.sendHoverExitEvent
            r5.removeCallbacks(r0)
            java.lang.Runnable r0 = r5.sendHoverExitEvent
            r0.run()
        Le:
            boolean r0 = r5.isBadMotionEvent(r6)
            r1 = 0
            if (r0 != 0) goto L6c
            boolean r0 = r5.isAttachedToWindow()
            if (r0 != 0) goto L1c
            goto L6c
        L1c:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r0 = r5.composeAccessibilityDelegate
            boolean r0 = r0.dispatchHoverEvent$ui(r6)
            int r2 = r6.getActionMasked()
            r3 = 7
            r4 = 1
            if (r2 == r3) goto L5a
            r3 = 10
            if (r2 == r3) goto L2f
            goto L61
        L2f:
            boolean r2 = r5.isInBounds(r6)
            if (r2 == 0) goto L61
            int r1 = r6.getToolType(r1)
            r2 = 3
            if (r1 != r2) goto L43
            int r1 = r6.getButtonState()
            if (r1 == 0) goto L43
            goto L60
        L43:
            android.view.MotionEvent r1 = r5.previousMotionEvent
            if (r1 == 0) goto L4a
            r1.recycle()
        L4a:
            android.view.MotionEvent r6 = android.view.MotionEvent.obtainNoHistory(r6)
            r5.previousMotionEvent = r6
            r5.hoverExitReceived = r4
            java.lang.Runnable r6 = r5.sendHoverExitEvent
            r1 = 8
            r5.postDelayed(r6, r1)
            return r0
        L5a:
            boolean r2 = r5.isPositionChanged(r6)
            if (r2 != 0) goto L61
        L60:
            return r0
        L61:
            int r5 = r5.m9handleMotionEvent8iAsVTc(r6)
            r5 = r5 & r4
            if (r5 == 0) goto L69
            goto L6b
        L69:
            if (r0 == 0) goto L6c
        L6b:
            return r4
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean e;
        byte b = 0;
        if (!isFocused()) {
            return ((di1) getFocusOwner()).e(keyEvent, new ka(this, keyEvent, b));
        }
        fh2 fh2Var = getComposeViewContext().t;
        int metaState = keyEvent.getMetaState();
        jk3 jk3Var = su5.a;
        hc4.F().setValue(new bq3(metaState));
        e = ((di1) getFocusOwner()).e(keyEvent, new df0((byte) 29));
        return e || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (isFocused()) {
            ((di1) getFocusOwner()).d();
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // defpackage.qh3
    /* renamed from: dispatchOnScrollChanged-k-4lQ0M, reason: not valid java name */
    public void mo18dispatchOnScrollChangedk4lQ0M(long j) {
        ra raVar = Companion;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        raVar.getClass();
        try {
            if (dispatchOnScrollChangedMethod == null) {
                Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                declaredMethod.setAccessible(true);
                dispatchOnScrollChangedMethod = declaredMethod;
            }
            Method method = dispatchOnScrollChangedMethod;
            if (method != null) {
                method.invoke(viewTreeObserver, null);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        if (autofillSupported()) {
            this.isDispatchingAutofillStructure = true;
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                this.isDispatchingAutofillStructure = false;
                populateAutofillVirtualStructure(viewStructure);
            } catch (Throwable th) {
                this.isDispatchingAutofillStructure = false;
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            ib.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object a2;
        ui1 g;
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            MotionEvent motionEvent2 = this.previousMotionEvent;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() != 0 || hasChangedDevices(motionEvent, motionEvent2)) {
                this.sendHoverExitEvent.run();
            } else {
                this.hoverExitReceived = false;
            }
        }
        if (!isBadMotionEvent(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || isPositionChanged(motionEvent))) {
            int m9handleMotionEvent8iAsVTc = m9handleMotionEvent8iAsVTc(motionEvent);
            if ((m9handleMotionEvent8iAsVTc & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (a2 = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    a2 = vr.a(1);
                }
                if (a2.equals(vr.a(1)) && (g = ((di1) getFocusOwner()).g()) != null) {
                    na3 T = ut0.T(g);
                    if (!mu0.q(T).J(T, true).a((Float.floatToRawIntBits(motionEvent.getX()) << 32) | (Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L))) {
                        jp0.l(getFocusOwner());
                    }
                }
            }
            if ((m9handleMotionEvent8iAsVTc & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void disposeSavedStateRegistry$ui() {
        dy0 dy0Var = this._savedStateRegistry;
        if (dy0Var != null) {
            dy0Var.J.invoke();
        }
        this._savedStateRegistry = null;
    }

    public final void drawAndroidView(qg qgVar, Canvas canvas) {
        getAndroidViewsHandler$ui().getClass();
        qgVar.draw(canvas);
    }

    @Override // defpackage.mb1
    public Object executeDelayed(long j, rm1 rm1Var) {
        fa faVar = new fa(rm1Var, (byte) 1);
        postDelayed(faVar, j);
        return faVar;
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        Companion.getClass();
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return ra.a(i, this);
            }
            Method method = findViewByAccessibilityIdTraversalMethod;
            if (method == null) {
                method = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            }
            method.setAccessible(true);
            Object invoke = method.invoke(this, Integer.valueOf(i));
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        m14 a2;
        if (view == null || this.measureAndLayoutDelegate.c) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View findNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (findNextFocus == null || !qb.B(this, findNextFocus)) {
            findNextFocus = null;
        }
        if (view == this) {
            ui1 p = mu0.p(((di1) getFocusOwner()).c);
            a2 = p != null ? mu0.r(p) : null;
            if (a2 == null) {
                a2 = yh1.a(view, this);
            }
        } else {
            a2 = yh1.a(view, this);
        }
        oh1 d = yh1.d(i);
        int i2 = d != null ? d.a : 6;
        r24 r24Var = new r24();
        if (((di1) getFocusOwner()).f(i2, a2, new ga(r24Var, (byte) 0)) == null) {
            return view;
        }
        if (r24Var.I == null) {
            if (findNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (findNextFocus == null || c21.B(i2) || wi4.q(mu0.r((ui1) r24Var.I), yh1.a(findNextFocus, this), a2, i2)) {
            return this;
        }
        return findNextFocus;
    }

    public void focusTargetAvailable() {
        if (((di1) getFocusOwner()).c.o0().a()) {
            return;
        }
        focusableViewAvailable(this);
    }

    public void forceAccessibilityForTesting(boolean z) {
        this.composeAccessibilityDelegate.setAccessibilityForceEnabledForTesting$ui(z);
    }

    @Override // defpackage.qh3
    public void forceMeasureTheSubtree(wa2 wa2Var, boolean z) {
        this.measureAndLayoutDelegate.f(wa2Var, z);
    }

    @Override // defpackage.qh3
    public h5 getAccessibilityManager() {
        return getComposeViewContext().k;
    }

    public final vg getAndroidViewsHandler$ui() {
        if (this._androidViewsHandler == null) {
            vg vgVar = new vg(getContext());
            this._androidViewsHandler = vgVar;
            addView(vgVar);
            requestLayout();
        }
        vg vgVar2 = this._androidViewsHandler;
        vgVar2.getClass();
        return vgVar2;
    }

    @Override // defpackage.qh3
    public es getAutofillTree() {
        return this.autofillTree;
    }

    @Override // defpackage.qh3
    public v60 getClipboard() {
        return getComposeViewContext().n;
    }

    @Override // defpackage.qh3
    public w60 getClipboardManager() {
        return getComposeViewContext().m;
    }

    public final be0 getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.composeViewContextIncrementedDuringInit;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.configuration$delegate.getValue();
    }

    public final wb getContentCaptureManager$ui() {
        return this.contentCaptureManager;
    }

    @Override // defpackage.qh3
    public tk0 getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // defpackage.qh3
    public iu0 getDensity() {
        return (iu0) this.density$delegate.getValue();
    }

    @Override // defpackage.jn3
    public m14 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            ui1 p = mu0.p(((di1) getFocusOwner()).c);
            if (p != null) {
                return mu0.r(p);
            }
            return null;
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return yh1.a(findFocus, this);
        }
        return null;
    }

    @Override // defpackage.qh3
    public bi1 getFocusOwner() {
        return this.focusOwner;
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        m14 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (j42.c(((di1) getFocusOwner()).f(6, null, new t5((byte) 2)), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @Override // defpackage.qh3
    public kj1 getFontFamilyResolver() {
        return (kj1) this.fontFamilyResolver$delegate.getValue();
    }

    @Override // defpackage.qh3
    public jj1 getFontLoader() {
        return getComposeViewContext().o;
    }

    public final yi2 getFrameEndScheduler$ui() {
        return this.frameEndScheduler;
    }

    @Override // defpackage.qh3
    public ir1 getGraphicsContext() {
        return this.graphicsContext;
    }

    @Override // defpackage.qh3
    public ts1 getHapticFeedBack() {
        return getComposeViewContext().q;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.measureAndLayoutDelegate.b.M() || !this.outOfFrameQueue.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // defpackage.qh3
    public k12 getInputModeManager() {
        k12 k12Var = this._inputModeManager;
        if (k12Var == null) {
            k12Var = new k12(isInTouchMode() ? 1 : 2);
            this._inputModeManager = k12Var;
        }
        return k12Var;
    }

    public final q12 getInsetsListener() {
        return this.insetsListener;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    @Override // android.view.View, android.view.ViewParent, defpackage.qh3
    public da2 getLayoutDirection() {
        return (da2) this.layoutDirection$delegate.getValue();
    }

    @Override // defpackage.qh3
    public tq2 getLocaleList() {
        return (tq2) this.localeList$delegate.getValue();
    }

    public long getMeasureIteration() {
        if (this.measureAndLayoutDelegate.c) {
            return 1L;
        }
        q02.a("measureIteration should be only used during the measure/layout pass");
        return 1L;
    }

    @Override // defpackage.qh3
    public m13 getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // defpackage.qh3
    public AndroidComposeView getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // defpackage.qh3
    public an3 getPlacementScope() {
        u73 u73Var = cn3.a;
        return new is2(this, (byte) 1);
    }

    public final hn1 getPlayNavigationSoundEffect$ui() {
        return this.playNavigationSoundEffect;
    }

    @Override // defpackage.qh3
    public qp3 getPointerIconService() {
        return this.pointerIconService;
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final qz1 m19getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.primaryDirectionalMotionAxisOverride;
    }

    @Override // defpackage.qh3
    public o14 getRectManager() {
        return this.rectManager;
    }

    @Override // defpackage.qh3
    public l54 getRetainedValuesStore() {
        return this.retainedValuesStore;
    }

    @Override // defpackage.qh3
    public wa2 getRoot() {
        return this.root;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final dy0 getSavedStateRegistry() {
        dy0 dy0Var = this._savedStateRegistry;
        if (dy0Var != null) {
            return dy0Var;
        }
        be0 composeViewContext = getComposeViewContext();
        composeViewContext.g();
        w94 w94Var = composeViewContext.e;
        w94Var.getClass();
        ViewParent parent = getParent();
        parent.getClass();
        View view = (View) parent;
        Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
        LinkedHashMap linkedHashMap = null;
        String str = tag instanceof String ? (String) tag : null;
        if (str == null) {
            str = String.valueOf(view.getId());
        }
        String w = hf1.w("SaveableStateRegistry:", str);
        da g = w94Var.g();
        Bundle f = g.f(w);
        if (f != null) {
            linkedHashMap = new LinkedHashMap();
            for (String str2 : f.keySet()) {
                ArrayList parcelableArrayList = f.getParcelableArrayList(str2);
                parcelableArrayList.getClass();
                linkedHashMap.put(str2, parcelableArrayList);
            }
        }
        o90 o90Var = new o90((byte) 28);
        i51 i51Var = l94.a;
        k94 k94Var = new k94(linkedHashMap, o90Var);
        boolean z = false;
        z = false;
        if (g.n(w) == null) {
            try {
                g.s(w, new ey0(k94Var, z ? (byte) 1 : (byte) 0));
                z = true;
            } catch (IllegalArgumentException unused) {
            }
        }
        dy0 dy0Var2 = new dy0(k94Var, new fy0(z, g, w));
        this._savedStateRegistry = dy0Var2;
        return dy0Var2;
    }

    public final boolean getScrollCaptureInProgress() {
        db4 db4Var;
        if (Build.VERSION.SDK_INT >= 31 && (db4Var = this.scrollCapture) != null && ((Boolean) db4Var.a.getValue()).booleanValue()) {
            return true;
        }
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof AndroidComposeView) {
                return ((AndroidComposeView) parent).getScrollCaptureInProgress();
            }
        }
        return false;
    }

    @Override // defpackage.qh3
    public xi4 getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // defpackage.qh3
    public ya2 getSharedDrawScope() {
        return getComposeViewContext().s;
    }

    @Override // defpackage.qh3
    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? fk.a.a(this) : this.showLayoutBounds;
    }

    @Override // defpackage.qh3
    public sh3 getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // defpackage.qh3
    public ot4 getSoftwareKeyboardController() {
        ot4 ot4Var = this._softwareKeyboardController;
        if (ot4Var != null) {
            return ot4Var;
        }
        yt0 yt0Var = new yt0(getTextInputService());
        this._softwareKeyboardController = yt0Var;
        return yt0Var;
    }

    @Override // defpackage.qh3
    public j55 getTextInputService() {
        j55 j55Var = this._textInputService;
        if (j55Var != null) {
            return j55Var;
        }
        j55 j55Var2 = new j55(getLegacyTextInputServiceAndroid());
        this._textInputService = j55Var2;
        return j55Var2;
    }

    @Override // defpackage.qh3
    public n65 getTextToolbar() {
        n65 n65Var = this._textToolbar;
        if (n65Var != null) {
            return n65Var;
        }
        xf xfVar = new xf(this);
        this._textToolbar = xfVar;
        return xfVar;
    }

    public final d74 getUncaughtExceptionHandler$ui() {
        return null;
    }

    @Override // defpackage.qh3
    public gr5 getViewConfiguration() {
        return getComposeViewContext().r;
    }

    @Override // defpackage.qh3
    public ru5 getWindowInfo() {
        return getComposeViewContext().t;
    }

    public void incrementKeepScreenOnCount() {
        this.keepScreenOnCount++;
        getView().setKeepScreenOn(this.keepScreenOnCount > 0);
    }

    public void incrementSensitiveComponentCount() {
        if (Build.VERSION.SDK_INT >= 35) {
            if (this.sensitiveComponentCount == 0) {
                kb.a.a(getView(), true);
            }
            this.sensitiveComponentCount++;
        }
    }

    public void invalidateDescendants() {
        invalidateLayers(getRoot());
    }

    @Override // defpackage.qh3
    public void invalidateRootLayer() {
        invalidate();
    }

    public final boolean isArrEnabled$ui() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public boolean isLifecycleInResumedState() {
        return ((xi2) getComposeViewContext().d().k()).i == ki2.M;
    }

    @Override // defpackage.ow2
    /* renamed from: localToScreen-58bKbWc, reason: not valid java name */
    public void mo20localToScreen58bKbWc(float[] fArr) {
        recalculateWindowPosition();
        nw2.h(fArr, this.viewToWindowMatrix);
        qb.Z(fArr, Float.intBitsToFloat((int) (this.windowPosition >> 32)), Float.intBitsToFloat((int) (this.windowPosition & 4294967295L)), this.tmpMatrix);
    }

    @Override // defpackage.ar3
    /* renamed from: localToScreen-MK-Hz9U, reason: not valid java name */
    public long mo21localToScreenMKHz9U(long j) {
        recalculateWindowPosition();
        long b = nw2.b(j, this.viewToWindowMatrix);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.windowPosition >> 32)) + Float.intBitsToFloat((int) (b >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.windowPosition & 4294967295L)) + Float.intBitsToFloat((int) (b & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    @Override // defpackage.qh3
    public void measureAndLayout(boolean z) {
        if (this.measureAndLayoutDelegate.b.M() || ((b53) this.measureAndLayoutDelegate.e.J).K != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            try {
                if (this.measureAndLayoutDelegate.k(z ? this.resendMotionEventOnLayout : this.layoutChildViewsIfNeeded)) {
                    requestLayout();
                }
                this.measureAndLayoutDelegate.a(false);
                getRectManager().a();
                dispatchPendingInteropLayoutCallbacks();
            } finally {
                Trace.endSection();
            }
        }
    }

    @Override // defpackage.qh3
    /* renamed from: measureAndLayout-0kLqBqw, reason: not valid java name */
    public void mo22measureAndLayout0kLqBqw(wa2 wa2Var, long j) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.measureAndLayoutDelegate.l(wa2Var, j);
            if (!this.measureAndLayoutDelegate.b.M()) {
                this.measureAndLayoutDelegate.a(false);
                getRectManager().a();
                this.layoutChildViewsIfNeeded.invoke();
                dispatchPendingInteropLayoutCallbacks();
            }
        } finally {
            Trace.endSection();
        }
    }

    public void measureAndLayoutForTest() {
        measureAndLayout(true);
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.outOfFrameRunnable);
        }
        this.outOfFrameRunnable.run();
    }

    @Override // defpackage.jn3
    /* renamed from: moveFocusInChildren-3ESFkO8, reason: not valid java name */
    public boolean mo23moveFocusInChildren3ESFkO8(int i) {
        return m10moveFocusInChildrenBypassUnfocusableComposeView3ESFkO8(i);
    }

    public final void notifyLayerIsDirty$ui(oh3 oh3Var, boolean z) {
        boolean z2 = this.isDrawingContent;
        if (!z) {
            if (z2) {
                return;
            }
            this.dirtyLayers.k(oh3Var);
            e43 e43Var = this.postponedDirtyLayers;
            if (e43Var != null) {
                e43Var.k(oh3Var);
                return;
            }
            return;
        }
        if (!z2) {
            this.dirtyLayers.a(oh3Var);
            return;
        }
        e43 e43Var2 = this.postponedDirtyLayers;
        if (e43Var2 == null) {
            e43Var2 = new e43();
            this.postponedDirtyLayers = e43Var2;
        }
        e43Var2.a(oh3Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!getRoot().K()) {
            getRoot().c(this);
        }
        setAttached(true);
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            Companion.getClass();
            setShowLayoutBounds(ra.b());
        }
        this.insetsListener.onViewAttachedToWindow(this);
        if (!this.composeViewContextIncrementedDuringInit) {
            getComposeViewContext().e();
        }
        byte b = 0;
        this.composeViewContextIncrementedDuringInit = false;
        invalidateLayoutNodeMeasurement(getRoot());
        invalidateLayers(getRoot());
        getSnapshotObserver().a.e();
        AndroidComposeView outOfFrameExecutor = getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            zy.i("Expected the view to be attached to window.");
            return;
        }
        outOfFrameExecutor.schedule(new la(this, b));
        vi2 d = getComposeViewContext().d();
        be0 composeViewContext = getComposeViewContext();
        composeViewContext.g();
        l54 installLocalRetainedValuesStore = installLocalRetainedValuesStore(d, composeViewContext.f);
        if (installLocalRetainedValuesStore == null) {
            installLocalRetainedValuesStore = q8.p0;
        }
        this.retainedValuesStore = installLocalRetainedValuesStore;
        tm1 tm1Var = this.onReadyForComposition;
        if (tm1Var != null) {
            tm1Var.invoke(getComposeViewContext());
            this.onReadyForComposition = null;
        }
        li2 k = getComposeViewContext().d().k();
        k.a(this);
        k.a(this.contentCaptureManager);
        getInputModeManager().a.setValue(new i12(isInTouchMode() ? 1 : 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (i >= 31) {
            nb.a.b(this);
        }
        w9 autofillManager = getAutofillManager();
        if (autofillManager != null) {
            ((di1) getFocusOwner()).g.a(autofillManager);
            getSemanticsOwner().d.a(autofillManager);
        }
        ((di1) getFocusOwner()).g.a(this);
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        kk4 kk4Var = this.textInputSessionMutex.get();
        fe feVar = (fe) (kk4Var != null ? kk4Var.b : null);
        if (feVar == null) {
            return getLegacyTextInputServiceAndroid().d;
        }
        kk4 kk4Var2 = (kk4) feVar.L.get();
        h12 h12Var = (h12) (kk4Var2 != null ? kk4Var2.b : null);
        return h12Var != null && h12Var.b();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        updateConfiguration(configuration);
    }

    @Override // defpackage.es0
    public void onCreate(vi2 vi2Var) {
        vi2Var.getClass();
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        kk4 kk4Var = this.textInputSessionMutex.get();
        fe feVar = (fe) (kk4Var != null ? kk4Var.b : null);
        if (feVar == null) {
            l55 legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
            if (legacyTextInputServiceAndroid.d) {
                fb4.c0(editorInfo, legacyTextInputServiceAndroid.h, legacyTextInputServiceAndroid.g);
                fb4.d(editorInfo);
                i14 i14Var = new i14(legacyTextInputServiceAndroid.g, new g73((Object) legacyTextInputServiceAndroid, (byte) 13), legacyTextInputServiceAndroid.h.c);
                legacyTextInputServiceAndroid.i.add(new WeakReference(i14Var));
                return i14Var;
            }
        } else {
            kk4 kk4Var2 = (kk4) feVar.L.get();
            h12 h12Var = (h12) (kk4Var2 != null ? kk4Var2.b : null);
            if (h12Var != null) {
                return h12Var.a(editorInfo);
            }
        }
        return null;
    }

    @Override // android.view.View
    public void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        wb wbVar = this.contentCaptureManager;
        wbVar.getClass();
        ub.o(wbVar, jArr, consumer);
    }

    @Override // defpackage.es0
    public void onDestroy(vi2 vi2Var) {
        vi2Var.getClass();
    }

    @Override // defpackage.qh3
    public void onDetach(wa2 wa2Var) {
        w9 autofillManager;
        getLayoutNodes().g(wa2Var.J);
        rw2 rw2Var = this.measureAndLayoutDelegate;
        pn pnVar = rw2Var.b;
        ((ep) pnVar.b).E(wa2Var);
        ((ep) pnVar.c).E(wa2Var);
        ((ep) pnVar.d).E(wa2Var);
        ((b53) rw2Var.e.J).k(wa2Var);
        requestClearInvalidObservations();
        if (autofillSupported() && (autofillManager = getAutofillManager()) != null && autofillManager.P.g(wa2Var.J)) {
            autofillManager.I.f(autofillManager.K, wa2Var.J, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.insetsListener.onViewDetachedFromWindow(this);
        View view = this.frameRateCategoryView;
        if (isArrEnabled$ui() && view != null) {
            removeView(view);
        }
        Companion.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            synchronized (composeViews) {
                composeViews.k(this);
            }
        }
        getComposeViewContext().b();
        kt4 kt4Var = getSnapshotObserver().a;
        sr srVar = kt4Var.h;
        if (srVar != null) {
            srVar.a();
        }
        kt4Var.a();
        li2 k = getComposeViewContext().d().k();
        k.b(this.contentCaptureManager);
        k.b(this);
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        zi2 zi2Var = this.lifecycleRetainedValuesStoreOwnerEntry;
        if (zi2Var != null) {
            zi2Var.c = false;
        }
        this.lifecycleRetainedValuesStoreOwnerEntry = null;
        if (i >= 31) {
            nb.a.a(this);
        }
        w9 autofillManager = getAutofillManager();
        if (autofillManager != null) {
            getSemanticsOwner().d.k(autofillManager);
            ((di1) getFocusOwner()).g.k(autofillManager);
        }
        o14 rectManager = getRectManager();
        rectManager.g = rectManager.d.b(0L, 0L, null, 0, 0);
        getRectManager().a();
        o14 rectManager2 = getRectManager();
        Object obj = rectManager2.i;
        if (obj != null) {
            rectManager2.b.removeDelayedExecution(obj);
            rectManager2.i = null;
        }
        ((di1) getFocusOwner()).g.k(this);
    }

    @Override // defpackage.qh3
    public void onEndApplyChanges() {
        e43 e43Var;
        w9 autofillManager;
        Object[] objArr;
        if (this.observationClearRequested) {
            kt4 kt4Var = getSnapshotObserver().a;
            u73 u73Var = new u73((byte) 13);
            synchronized (kt4Var.g) {
                try {
                    b53 b53Var = kt4Var.f;
                    int i = b53Var.K;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = b53Var.I;
                        if (i2 >= i) {
                            break;
                        }
                        jt4 jt4Var = (jt4) objArr[i2];
                        jt4Var.d(u73Var);
                        if (!jt4Var.f.j()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = b53Var.I;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    b53Var.K = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.observationClearRequested = false;
        }
        vg vgVar = this._androidViewsHandler;
        if (vgVar != null) {
            clearChildInvalidObservations(vgVar);
        }
        if (autofillSupported() && (autofillManager = getAutofillManager()) != null) {
            r33 r33Var = autofillManager.P;
            if (r33Var.d == 0 && autofillManager.Q) {
                autofillManager.I.a();
                autofillManager.Q = false;
            }
            if (r33Var.d != 0) {
                autofillManager.Q = true;
            }
        }
        while (this.endApplyChangesListeners.j() && this.endApplyChangesListeners.g(0) != null) {
            int i5 = this.endApplyChangesListeners.b;
            int i6 = 0;
            while (true) {
                e43Var = this.endApplyChangesListeners;
                if (i6 < i5) {
                    rm1 rm1Var = (rm1) e43Var.g(i6);
                    this.endApplyChangesListeners.o(i6, null);
                    if (rm1Var != null) {
                        rm1Var.invoke();
                    }
                    i6++;
                }
            }
            e43Var.m(0, i5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ai1
    public void onFocusChanged(si1 si1Var, si1 si1Var2) {
        ja3 ja3Var;
        boolean z;
        ja3 ja3Var2;
        boolean z2;
        if (si1Var != 0) {
            k13 k13Var = (k13) si1Var;
            if (!k13Var.getNode().isAttached()) {
                q02.b("visitAncestors called on an unattached node");
            }
            k13 node = k13Var.getNode();
            wa2 U = ut0.U(si1Var);
            o43 o43Var = null;
            ArrayList arrayList = null;
            while (U != null) {
                if ((U.n0.f.getAggregateChildKindSet$ui() & 2097152) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui() & 2097152) != 0) {
                            k13 k13Var2 = node;
                            b53 b53Var = null;
                            while (k13Var2 != null) {
                                if (k13Var2 instanceof zz1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(k13Var2);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (k13Var2.getKindSet$ui() & 2097152) != 0 && (k13Var2 instanceof wt0)) {
                                    int i = 0;
                                    for (k13 k13Var3 = ((wt0) k13Var2).J; k13Var3 != null; k13Var3 = k13Var3.getChild$ui()) {
                                        if ((k13Var3.getKindSet$ui() & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                k13Var2 = k13Var3;
                                            } else {
                                                if (b53Var == null) {
                                                    b53Var = new b53(new k13[16]);
                                                }
                                                if (k13Var2 != null) {
                                                    b53Var.c(k13Var2);
                                                    k13Var2 = null;
                                                }
                                                b53Var.c(k13Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                k13Var2 = ut0.M(b53Var);
                            }
                        }
                        node = node.getParent$ui();
                    }
                }
                U = U.v();
                node = (U == null || (ja3Var2 = U.n0) == null) ? null : ja3Var2.e;
            }
            if (arrayList == null) {
                return;
            }
            if (si1Var2 != 0) {
                k13 k13Var4 = (k13) si1Var2;
                if (!k13Var4.getNode().isAttached()) {
                    q02.b("visitAncestors called on an unattached node");
                }
                k13 node2 = k13Var4.getNode();
                wa2 U2 = ut0.U(si1Var2);
                o43 o43Var2 = null;
                while (U2 != null) {
                    if ((U2.n0.f.getAggregateChildKindSet$ui() & 2097152) != 0) {
                        while (node2 != null) {
                            if ((node2.getKindSet$ui() & 2097152) != 0) {
                                k13 k13Var5 = node2;
                                b53 b53Var2 = null;
                                while (k13Var5 != null) {
                                    if (k13Var5 instanceof zz1) {
                                        if (o43Var2 == null) {
                                            o43 o43Var3 = ka4.a;
                                            o43Var2 = new o43();
                                        }
                                        o43Var2.d(k13Var5);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (k13Var5.getKindSet$ui() & 2097152) != 0 && (k13Var5 instanceof wt0)) {
                                        int i2 = 0;
                                        for (k13 k13Var6 = ((wt0) k13Var5).J; k13Var6 != null; k13Var6 = k13Var6.getChild$ui()) {
                                            if ((k13Var6.getKindSet$ui() & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    k13Var5 = k13Var6;
                                                } else {
                                                    if (b53Var2 == null) {
                                                        b53Var2 = new b53(new k13[16]);
                                                    }
                                                    if (k13Var5 != null) {
                                                        b53Var2.c(k13Var5);
                                                        k13Var5 = null;
                                                    }
                                                    b53Var2.c(k13Var6);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    k13Var5 = ut0.M(b53Var2);
                                }
                            }
                            node2 = node2.getParent$ui();
                        }
                    }
                    U2 = U2.v();
                    node2 = (U2 == null || (ja3Var = U2.n0) == null) ? null : ja3Var.e;
                }
                o43Var = o43Var2;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                zz1 zz1Var = (zz1) arrayList.get(i3);
                if (!(o43Var != null ? o43Var.a(zz1Var) : false)) {
                    zz1Var.R();
                }
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.lastMatrixRecalculationAnimationTime = 0L;
        updatePositionCacheAndDispatch();
        dispatchConfigurationChangeIfNeeded();
    }

    @Override // defpackage.qh3
    public void onInteropViewLayoutChange(View view) {
        this.isPendingInteropViewLayoutChangeDispatch = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.lastMatrixRecalculationAnimationTime = 0L;
            this.measureAndLayoutDelegate.k(this.resendMotionEventOnLayout);
            this.onMeasureConstraints = null;
            updatePositionCacheAndDispatch();
            if (this._androidViewsHandler != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
                Trace.endSection();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.qh3
    public void onLayoutChange(wa2 wa2Var) {
        this.composeAccessibilityDelegate.onLayoutChange$ui(wa2Var);
        wb wbVar = this.contentCaptureManager;
        wbVar.N = true;
        if (wbVar.d()) {
            wbVar.O.d(wd5.a);
        }
    }

    @Override // defpackage.qh3
    public void onLayoutNodeDeactivated(wa2 wa2Var) {
        w9 autofillManager;
        if (autofillSupported() && (autofillManager = getAutofillManager()) != null && autofillManager.P.g(wa2Var.J)) {
            autofillManager.I.f(autofillManager.K, wa2Var.J, false);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!getRoot().K()) {
                getRoot().c(this);
            }
            if (!isAttachedToWindow()) {
                invalidateLayoutNodeMeasurement(getRoot());
            }
            long m6convertMeasureSpecI7RO_PI = m6convertMeasureSpecI7RO_PI(i);
            long m6convertMeasureSpecI7RO_PI2 = m6convertMeasureSpecI7RO_PI(i2);
            long u = o7.u((int) (m6convertMeasureSpecI7RO_PI >>> 32), (int) (m6convertMeasureSpecI7RO_PI & 4294967295L), (int) (m6convertMeasureSpecI7RO_PI2 >>> 32), (int) (4294967295L & m6convertMeasureSpecI7RO_PI2));
            dh0 dh0Var = this.onMeasureConstraints;
            if (dh0Var == null) {
                this.onMeasureConstraints = new dh0(u);
                this.wasMeasuredWithMultipleConstraints = false;
            } else if (!dh0.b(dh0Var.a, u)) {
                this.wasMeasuredWithMultipleConstraints = true;
            }
            this.measureAndLayoutDelegate.s(u);
            this.measureAndLayoutDelegate.m();
            setMeasuredDimension(getRoot().o0.p.I, getRoot().o0.p.J);
            if (this._androidViewsHandler != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().o0.p.I, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().o0.p.J, 1073741824));
                Trace.endSection();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.es0
    public void onPause(vi2 vi2Var) {
        vi2Var.getClass();
    }

    @Override // defpackage.qh3
    public void onPostAttach(wa2 wa2Var) {
        w9 autofillManager;
        ki4 x;
        if (!autofillSupported() || (autofillManager = getAutofillManager()) == null || (x = wa2Var.x()) == null || !x.I.b(zi4.r)) {
            return;
        }
        autofillManager.P.a(wa2Var.J);
        autofillManager.I.f(autofillManager.K, wa2Var.J, true);
    }

    @Override // defpackage.qh3
    public void onPostLayoutNodeReused(wa2 wa2Var, int i) {
        w9 autofillManager;
        if (!autofillSupported() || (autofillManager = getAutofillManager()) == null) {
            return;
        }
        AndroidComposeView androidComposeView = autofillManager.K;
        in3 in3Var = autofillManager.I;
        r33 r33Var = autofillManager.P;
        if (r33Var.g(i)) {
            in3Var.f(androidComposeView, i, false);
        }
        ki4 x = wa2Var.x();
        if (x == null || !x.I.b(zi4.r)) {
            return;
        }
        r33Var.a(wa2Var.J);
        in3Var.f(androidComposeView, wa2Var.J, true);
    }

    @Override // defpackage.qh3
    public void onPreAttach(wa2 wa2Var) {
        getLayoutNodes().i(wa2Var.J, wa2Var);
    }

    @Override // defpackage.qh3
    public void onPreLayoutNodeReused(wa2 wa2Var, int i) {
        getLayoutNodes().g(i);
        getLayoutNodes().i(wa2Var.J, wa2Var);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (!autofillSupported() || viewStructure == null || this.isDispatchingAutofillStructure) {
            return;
        }
        populateAutofillVirtualStructure(viewStructure);
    }

    @Override // defpackage.qh3
    public void onRequestMeasure(wa2 wa2Var, boolean z, boolean z2, boolean z3) {
        wa2 v;
        wa2 v2;
        rw2 rw2Var = this.measureAndLayoutDelegate;
        if (!z) {
            if (rw2Var.r(wa2Var, z2) && z3) {
                scheduleMeasureAndLayout(wa2Var);
                return;
            }
            return;
        }
        pn pnVar = rw2Var.b;
        wa2 wa2Var2 = wa2Var.P;
        ab2 ab2Var = wa2Var.o0;
        if (wa2Var2 == null) {
            q02.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int ordinal = ab2Var.d.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal != 4) {
                    s83.v();
                    return;
                }
                if (!ab2Var.e || z2) {
                    ab2Var.e = true;
                    ab2Var.p.c0 = true;
                    if (wa2Var.y0) {
                        return;
                    }
                    if ((j42.c(wa2Var.M(), Boolean.TRUE) || rw2.h(wa2Var)) && ((v = wa2Var.v()) == null || !v.o0.e)) {
                        pnVar.j(wa2Var, a52.I);
                    } else if ((wa2Var.L() || rw2.i(wa2Var)) && ((v2 = wa2Var.v()) == null || !v2.r())) {
                        pnVar.j(wa2Var, a52.K);
                    }
                    if (rw2Var.d || !z3) {
                        return;
                    }
                    scheduleMeasureAndLayout(wa2Var);
                    return;
                }
                return;
            }
        }
        rw2Var.g.c(new qw2(wa2Var, true, z2));
    }

    @Override // defpackage.qh3
    public void onRequestRelayout(wa2 wa2Var, boolean z, boolean z2) {
        rw2 rw2Var = this.measureAndLayoutDelegate;
        a52 a52Var = a52.L;
        if (!z) {
            rw2Var.getClass();
            ab2 ab2Var = wa2Var.o0;
            ab2 ab2Var2 = wa2Var.o0;
            int ordinal = ab2Var.d.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                return;
            }
            if (ordinal != 4) {
                s83.v();
                return;
            }
            wa2 v = wa2Var.v();
            boolean z3 = v == null || v.L();
            if (!z2) {
                if (wa2Var.r()) {
                    return;
                }
                if (wa2Var.q() && wa2Var.L() == z3 && wa2Var.L() == ab2Var2.p.b0) {
                    return;
                }
            }
            tw2 tw2Var = ab2Var2.p;
            tw2Var.d0 = true;
            tw2Var.e0 = true;
            if (!wa2Var.y0 && tw2Var.b0 && z3) {
                if ((v == null || !v.q()) && (v == null || !v.r())) {
                    rw2Var.b.j(wa2Var, a52Var);
                }
                if (rw2Var.d) {
                    return;
                }
                scheduleMeasureAndLayout$default(this, null, 1, null);
                return;
            }
            return;
        }
        pn pnVar = rw2Var.b;
        int ordinal2 = wa2Var.o0.d.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                return;
            }
            if (ordinal2 != 2) {
                if (ordinal2 == 3) {
                    return;
                }
                if (ordinal2 != 4) {
                    s83.v();
                    return;
                }
            }
        }
        ab2 ab2Var3 = wa2Var.o0;
        if ((ab2Var3.e || ab2Var3.f) && !z2) {
            return;
        }
        ab2Var3.f = true;
        ab2Var3.g = true;
        tw2 tw2Var2 = ab2Var3.p;
        tw2Var2.d0 = true;
        tw2Var2.e0 = true;
        if (wa2Var.y0) {
            return;
        }
        wa2 v2 = wa2Var.v();
        if (j42.c(wa2Var.M(), Boolean.TRUE) && ((v2 == null || !v2.o0.e) && (v2 == null || !v2.o0.f))) {
            pnVar.j(wa2Var, a52.J);
        } else if (wa2Var.L() && ((v2 == null || !v2.q()) && (v2 == null || !v2.r()))) {
            pnVar.j(wa2Var, a52Var);
        }
        if (rw2Var.d) {
            return;
        }
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        pp3 pp3Var;
        int toolType = motionEvent.getToolType(i);
        return (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || !(toolType == 2 || toolType == 4) || (pp3Var = ((ya) getPointerIconService()).a) == null) ? super.onResolvePointerIcon(motionEvent, i) : ob.b(getContext(), pp3Var);
    }

    @Override // defpackage.es0
    public void onResume(vi2 vi2Var) {
        l10 l10Var;
        if (Build.VERSION.SDK_INT < 30) {
            Companion.getClass();
            setShowLayoutBounds(ra.b());
        }
        zi2 zi2Var = this.lifecycleRetainedValuesStoreOwnerEntry;
        if (zi2Var != null) {
            yi2 yi2Var = this.frameEndScheduler;
            yi2Var.getClass();
            ru2 ru2Var = (ru2) zi2Var.a.J;
            if (!ru2Var.I || ru2Var.K) {
                return;
            }
            try {
                l10Var = ((mz5) yi2Var).I.scheduleFrameEndCallback(new eq(zi2Var, (byte) 15));
            } catch (CancellationException unused) {
                if (!ru2Var.J) {
                    if (ru2Var.K) {
                        kr3.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    ru2Var.a();
                    ru2Var.K = true;
                }
                l10Var = null;
            }
            l10 l10Var2 = zi2Var.d;
            if (l10Var2 != null) {
                l10Var2.cancel();
            }
            zi2Var.d = l10Var;
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (this.superclassInitComplete) {
            int[] iArr = yh1.a;
            da2 da2Var = da2.I;
            da2 da2Var2 = i != 0 ? i != 1 ? null : da2.J : da2Var;
            if (da2Var2 != null) {
                da2Var = da2Var2;
            }
            setLayoutDirection(da2Var);
        }
    }

    @Override // android.view.View
    public void onScrollCaptureSearch(Rect rect, Point point, Consumer<ScrollCaptureTarget> consumer) {
        db4 db4Var;
        if (Build.VERSION.SDK_INT < 31 || (db4Var = this.scrollCapture) == null) {
            return;
        }
        db4Var.a(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        updatePositionCacheAndDispatch();
    }

    @Override // defpackage.qh3
    public void onSemanticsChange() {
        this.composeAccessibilityDelegate.onSemanticsChange$ui();
        wb wbVar = this.contentCaptureManager;
        wbVar.N = true;
        Handler handler = wbVar.I.getHandler();
        if (!wbVar.d() || wbVar.T || handler == null) {
            return;
        }
        wbVar.T = true;
        handler.post(wbVar.U);
    }

    @Override // defpackage.es0
    public void onStart(vi2 vi2Var) {
        vi2Var.getClass();
    }

    @Override // defpackage.es0
    public void onStop(vi2 vi2Var) {
        zi2 zi2Var = this.lifecycleRetainedValuesStoreOwnerEntry;
        if (zi2Var != null) {
            ru2 ru2Var = (ru2) zi2Var.a.J;
            if (ru2Var.I && !ru2Var.K) {
                l10 l10Var = zi2Var.d;
                if (l10Var != null) {
                    l10Var.cancel();
                }
                zi2Var.d = null;
                return;
            }
            if (ru2Var.J) {
                return;
            }
            if (!ru2Var.K) {
                kr3.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!ru2Var.L.i()) {
                kr3.a("Attempted to start retaining exited values with pending exited values");
            }
            ru2Var.K = false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public void onTouchModeChanged(boolean z) {
        getInputModeManager().a.setValue(new i12(z ? 1 : 2));
    }

    @Override // android.view.View
    public void onVirtualViewTranslationResponses(LongSparseArray<ViewTranslationResponse> longSparseArray) {
        wb wbVar = this.contentCaptureManager;
        wbVar.getClass();
        ub.q(wbVar, longSparseArray);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        this.keyboardModifiersRequireUpdate = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30) {
            return;
        }
        Companion.getClass();
        boolean b = ra.b();
        if (getShowLayoutBounds() != b) {
            setShowLayoutBounds(b);
            invalidateDescendants();
        }
    }

    public final boolean recycle$ui(oh3 oh3Var) {
        b53 b53Var;
        Reference poll;
        ys5 ys5Var = this.layerCache;
        do {
            ReferenceQueue referenceQueue = ys5Var.b;
            b53Var = ys5Var.a;
            poll = referenceQueue.poll();
            if (poll != null) {
                b53Var.k(poll);
            }
        } while (poll != null);
        b53Var.c(new WeakReference(oh3Var, ys5Var.b));
        this.dirtyLayers.k(oh3Var);
        return true;
    }

    @Override // defpackage.qh3
    public void registerOnEndApplyChangesListener(rm1 rm1Var) {
        if (this.endApplyChangesListeners.e(rm1Var)) {
            return;
        }
        this.endApplyChangesListeners.a(rm1Var);
    }

    public void registerOnLayoutCompletedListener(ph3 ph3Var) {
        this.measureAndLayoutDelegate.f.c(ph3Var);
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    public final void removeAndroidView(qg qgVar) {
        getAndroidViewsHandler$ui().removeViewInLayout(qgVar);
        HashMap<wa2, qg> layoutNodeToHolder = getAndroidViewsHandler$ui().getLayoutNodeToHolder();
        p70.x(layoutNodeToHolder).remove(getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(qgVar));
        qgVar.setImportantForAccessibility(0);
    }

    public final void removeConnectionToComposeViewContext() {
        if (this.composeViewContextIncrementedDuringInit) {
            getComposeViewContext().b();
            this.composeViewContextIncrementedDuringInit = false;
        }
    }

    @Override // defpackage.mb1
    public void removeDelayedExecution(Object obj) {
        Runnable runnable = obj instanceof Runnable ? (Runnable) obj : null;
        if (runnable == null) {
            return;
        }
        removeCallbacks(runnable);
    }

    @Override // defpackage.qh3
    public void requestAutofill(wa2 wa2Var) {
        w9 autofillManager;
        if (!autofillSupported() || (autofillManager = getAutofillManager()) == null) {
            return;
        }
        Rect rect = autofillManager.N;
        o14 o14Var = autofillManager.L;
        wa2 wa2Var2 = (wa2) o14Var.a.b(wa2Var.J);
        if (wa2Var2 == null || wa2Var2.O == -4) {
            return;
        }
        tl tlVar = o14Var.c;
        int d = o14Var.d(wa2Var2);
        long[] jArr = (long[]) tlVar.b;
        long j = jArr[d];
        long j2 = jArr[d + 1];
        rect.set((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
        autofillManager.I.g(autofillManager.K, wa2Var.J, rect);
    }

    public final void requestClearInvalidObservations() {
        this.observationClearRequested = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        return requestFocusBypassUnfocusableComposeView(i, rect);
    }

    public final boolean requestFocusBypassUnfocusableComposeView(int i, Rect rect) {
        byte b = 1;
        if (!isFocused()) {
            oh1 d = yh1.d(i);
            int i2 = d != null ? d.a : 7;
            Boolean f = ((di1) getFocusOwner()).f(i2, rect != null ? sp0.l0(rect) : null, new ea((byte) 0, i2));
            Boolean bool = Boolean.TRUE;
            if (!j42.c(f, bool)) {
                if (!j42.c(((di1) getFocusOwner()).f(i2, null, new ea(b, i2)), bool)) {
                    if (hasFocus() && c21.B(i2)) {
                        return ((di1) getFocusOwner()).i(i2);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean requestFocusCurrent(int i, Rect rect) {
        byte b = 1;
        if (isFocused()) {
            return true;
        }
        if (((di1) getFocusOwner()).c.o0().a()) {
            return super.requestFocus(i, rect);
        }
        oh1 d = yh1.d(i);
        int i2 = d != null ? d.a : 7;
        return j42.c(((di1) getFocusOwner()).f(i2, rect != null ? sp0.l0(rect) : null, new ia(b, i2)), Boolean.TRUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        if (defpackage.j42.c(((defpackage.di1) getFocusOwner()).f(r0, null, new defpackage.ia(r2, r0)), java.lang.Boolean.TRUE) != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestFocusViewFocusFix(int r9, android.graphics.Rect r10) {
        /*
            r8 = this;
            boolean r0 = r8.isFocused()
            r1 = 1
            if (r0 == 0) goto L9
            goto L84
        L9:
            boolean r0 = r8.processingRequestFocusForNextNonChildView
            r2 = 0
            if (r0 == 0) goto Lf
            goto L51
        Lf:
            oh1 r0 = defpackage.yh1.d(r9)
            if (r0 == 0) goto L18
            int r0 = r0.a
            goto L19
        L18:
            r0 = 7
        L19:
            boolean r3 = r8.hasFocus()
            if (r3 == 0) goto L26
            boolean r3 = r8.mo23moveFocusInChildren3ESFkO8(r0)
            if (r3 == 0) goto L26
            goto L84
        L26:
            n24 r3 = new n24
            r3.<init>()
            bi1 r4 = r8.getFocusOwner()
            r5 = 0
            if (r10 == 0) goto L37
            m14 r6 = defpackage.sp0.l0(r10)
            goto L38
        L37:
            r6 = r5
        L38:
            ha r7 = new ha
            r7.<init>(r3, r0, r2)
            di1 r4 = (defpackage.di1) r4
            java.lang.Boolean r4 = r4.f(r0, r6, r7)
            if (r4 != 0) goto L46
            goto L51
        L46:
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L4d
            goto L84
        L4d:
            boolean r3 = r3.I
            if (r3 == 0) goto L52
        L51:
            return r2
        L52:
            if (r10 == 0) goto L72
            boolean r10 = r8.hasFocus()
            if (r10 != 0) goto L72
            bi1 r10 = r8.getFocusOwner()
            ia r3 = new ia
            r3.<init>(r2, r0)
            di1 r10 = (defpackage.di1) r10
            java.lang.Boolean r10 = r10.f(r0, r5, r3)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r10 = defpackage.j42.c(r10, r0)
            if (r10 == 0) goto L72
            goto L84
        L72:
            android.view.View r10 = r8.findNextNonChildView(r9)
            if (r10 == 0) goto L84
            if (r10 != r8) goto L7b
            goto L84
        L7b:
            r8.processingRequestFocusForNextNonChildView = r1
            boolean r9 = r10.requestFocus(r9)
            r8.processingRequestFocusForNextNonChildView = r2
            return r9
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.requestFocusViewFocusFix(int, android.graphics.Rect):boolean");
    }

    @Override // defpackage.qh3
    public void requestOnPositionedCallback(wa2 wa2Var) {
        da daVar = this.measureAndLayoutDelegate.e;
        if (wa2Var.x0 > 0) {
            ((b53) daVar.J).c(wa2Var);
            wa2Var.w0 = true;
        }
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    @Override // defpackage.jn3
    /* renamed from: requestOwnerFocus-7o62pno, reason: not valid java name */
    public boolean mo24requestOwnerFocus7o62pno(oh1 oh1Var, m14 m14Var) {
        Integer c;
        if (isFocused()) {
            return true;
        }
        return super.requestFocus((oh1Var == null || (c = yh1.c(oh1Var.a)) == null) ? TsExtractor.TS_STREAM_TYPE_HDMV_DTS : c.intValue(), m14Var != null ? sp0.h0(m14Var) : null);
    }

    @Override // defpackage.tg3
    public void schedule(rm1 rm1Var) {
        boolean isEmpty = this.outOfFrameQueue.isEmpty();
        this.outOfFrameQueue.addLast(rm1Var);
        if (isEmpty) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(this.outOfFrameRunnable);
            } else {
                s83.t("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    @Override // defpackage.ar3
    /* renamed from: screenToLocal-MK-Hz9U, reason: not valid java name */
    public long mo25screenToLocalMKHz9U(long j) {
        recalculateWindowPosition();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.windowPosition >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.windowPosition & 4294967295L));
        return nw2.b((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), this.windowToViewMatrix);
    }

    public boolean sendIndirectPointerEvent(pz1 pz1Var) {
        if (c5.P(pz1Var).getActionMasked() != 3) {
            return handleIndirectPointerEvent(pz1Var);
        }
        ((di1) getFocusOwner()).c();
        return true;
    }

    /* renamed from: sendKeyEvent-ZmokQxo, reason: not valid java name */
    public boolean m26sendKeyEventZmokQxo(KeyEvent keyEvent) {
        boolean e;
        ((di1) getFocusOwner()).d();
        e = ((di1) getFocusOwner()).e(keyEvent, new df0((byte) 29));
        return e;
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.composeAccessibilityDelegate.setSendRecurringAccessibilityEventsIntervalMillis$ui(j);
    }

    public final void setComposeViewContext(be0 be0Var) {
        if (getCoroutineContext() != be0Var.c().getEffectCoroutineContext() && !((a53) getRoot().o()).isEmpty()) {
            q02.a("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        ns4 i = o63.i();
        tm1 e = i != null ? i.e() : null;
        ns4 j = o63.j(i);
        try {
            be0 be0Var2 = get_composeViewContext();
            if (be0Var != be0Var2) {
                if (isAttachedToWindow()) {
                    be0Var2.b();
                    be0Var.e();
                }
                set_composeViewContext(be0Var);
                setCoroutineContext(be0Var.c().getEffectCoroutineContext());
            }
        } finally {
            o63.o(i, j, e);
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.composeViewContextIncrementedDuringInit = z;
    }

    public final void setConfiguration(Configuration configuration) {
        this.configuration$delegate.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(wb wbVar) {
        this.contentCaptureManager = wbVar;
    }

    public void setCoroutineContext(tk0 tk0Var) {
        this.coroutineContext = tk0Var;
    }

    public final void setFrameEndScheduler$ui(yi2 yi2Var) {
        this.frameEndScheduler = yi2Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.lastMatrixRecalculationAnimationTime = j;
    }

    public final void setOnReadyForComposition(tm1 tm1Var) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.composeViewContextIncrementedDuringInit) {
            tm1Var.invoke(getComposeViewContext());
        } else {
            this.onReadyForComposition = tm1Var;
        }
    }

    public final void setPlayNavigationSoundEffect$ui(hn1 hn1Var) {
        this.playNavigationSoundEffect = hn1Var;
    }

    /* renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m27setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(qz1 qz1Var) {
        this.primaryDirectionalMotionAxisOverride = qz1Var;
    }

    @Override // defpackage.qh3
    public void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
    }

    public void setUncaughtExceptionHandler(d74 d74Var) {
        this.measureAndLayoutDelegate.getClass();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // defpackage.qh3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object textInputSession(defpackage.hn1 r10, defpackage.fj0 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.ab
            if (r0 == 0) goto L13
            r0 = r11
            ab r0 = (defpackage.ab) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            ab r0 = new ab
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.I
            int r1 = r0.K
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 == r3) goto L28
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r9)
            return r2
        L28:
            defpackage.mu0.V(r11)
            goto L4a
        L2c:
            defpackage.mu0.V(r11)
            java.util.concurrent.atomic.AtomicReference<kk4> r5 = r9.textInputSessionMutex
            v1 r4 = new v1
            r11 = 4
            r4.<init>(r9, r11)
            r0.K = r3
            f31 r3 = new f31
            r7 = 0
            r8 = 3
            r6 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r9 = defpackage.i42.o0(r3, r0)
            el0 r10 = defpackage.el0.I
            if (r9 != r10) goto L4a
            return r10
        L4a:
            defpackage.zy.n()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.textInputSession(hn1, fj0):java.lang.Object");
    }

    @Override // defpackage.qh3
    public void voteFrameRate(float f) {
        if (isArrEnabled$ui()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.currentFrameRate) || f > this.currentFrameRate) {
                    this.currentFrameRate = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.currentFrameRateCategory) || f < this.currentFrameRateCategory) {
                    this.currentFrameRateCategory = f;
                }
            }
        }
    }

    @Override // defpackage.qh3
    public v9 getAutofill() {
        return this.autofill;
    }

    @Override // defpackage.qh3
    public w9 getAutofillManager() {
        return this.autofillManager;
    }

    @Override // defpackage.qh3
    public oc getDragAndDropManager() {
        return this.dragAndDropManager;
    }

    public q33 getLayoutNodes() {
        return this.layoutNodes;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i;
        generateDefaultLayoutParams.height = i2;
        addView(view, -1, generateDefaultLayoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @su0
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    public static /* synthetic */ void getPlayNavigationSoundEffect$ui$annotations() {
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m8getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    @su0
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    public e74 getRootForTest() {
        return this;
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui(d74 d74Var) {
    }

    private final void recalculateWindowPosition(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        recalculateWindowViewTransforms();
        float[] fArr = this.viewToWindowMatrix;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long b = nw2.b((Float.floatToRawIntBits(y) & 4294967295L) | (Float.floatToRawIntBits(x) << 32), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (b >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (b & 4294967295L));
        this.windowPosition = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        di1 di1Var = (di1) getFocusOwner();
        vt0.R(di1Var.c, true);
        if (di1Var.g() != null) {
            ui1 g = di1Var.g();
            di1Var.j(null);
            if (g != null) {
                g.k0(oi1.I, oi1.K);
            }
        }
    }
}

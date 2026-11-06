package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import androidx.media3.common.C;
import com.github.mytv.dv.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class a95 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static a95 S;
    public static a95 T;
    public final View I;
    public final CharSequence J;
    public final int K;
    public final z85 L;
    public final z85 M;
    public int N;
    public int O;
    public b95 P;
    public boolean Q;
    public boolean R;

    /* JADX WARN: Type inference failed for: r0v0, types: [z85] */
    /* JADX WARN: Type inference failed for: r0v1, types: [z85] */
    public a95(View view, CharSequence charSequence) {
        final byte b = 0;
        this.L = new Runnable(this) { // from class: z85
            public final /* synthetic */ a95 J;

            {
                this.J = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                a95 a95Var = this.J;
                switch (b2) {
                    case 0:
                        a95Var.c(false);
                        break;
                    default:
                        a95Var.a();
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.M = new Runnable(this) { // from class: z85
            public final /* synthetic */ a95 J;

            {
                this.J = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                a95 a95Var = this.J;
                switch (b22) {
                    case 0:
                        a95Var.c(false);
                        break;
                    default:
                        a95Var.a();
                        break;
                }
            }
        };
        this.I = view;
        this.J = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = hr5.a;
        this.K = Build.VERSION.SDK_INT >= 28 ? ck.x(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.R = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(a95 a95Var) {
        a95 a95Var2 = S;
        if (a95Var2 != null) {
            a95Var2.I.removeCallbacks(a95Var2.L);
        }
        S = a95Var;
        if (a95Var != null) {
            a95Var.I.postDelayed(a95Var.L, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        a95 a95Var = T;
        View view = this.I;
        if (a95Var == this) {
            T = null;
            b95 b95Var = this.P;
            if (b95Var != null) {
                View view2 = b95Var.b;
                if (view2.getParent() != null) {
                    ((WindowManager) b95Var.a.getSystemService("window")).removeView(view2);
                }
                this.P = null;
                this.R = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (S == this) {
            b(null);
        }
        view.removeCallbacks(this.M);
    }

    public final void c(boolean z) {
        int height;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long longPressTimeout;
        long j;
        long j2;
        View view = this.I;
        if (view.isAttachedToWindow()) {
            b(null);
            a95 a95Var = T;
            if (a95Var != null) {
                a95Var.a();
            }
            T = this;
            this.Q = z;
            b95 b95Var = new b95(view.getContext());
            this.P = b95Var;
            int i6 = this.N;
            int i7 = this.O;
            boolean z2 = this.Q;
            View view2 = b95Var.b;
            ViewParent parent = view2.getParent();
            Context context = b95Var.a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            b95Var.c.setText(this.J);
            IBinder applicationWindowToken = view.getApplicationWindowToken();
            WindowManager.LayoutParams layoutParams = b95Var.d;
            layoutParams.token = applicationWindowToken;
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i6 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i7 + dimensionPixelOffset2;
                i = i7 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i5 = 1;
            } else {
                Rect rect = b95Var.e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i2 = i6;
                    i3 = i;
                    i4 = 0;
                    i5 = 1;
                } else {
                    Resources resources = context.getResources();
                    i5 = 1;
                    i2 = i6;
                    i3 = i;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i4 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = b95Var.g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = b95Var.f;
                view.getLocationOnScreen(iArr2);
                int i8 = iArr2[i4] - iArr[i4];
                iArr2[i4] = i8;
                iArr2[i5] = iArr2[i5] - iArr[i5];
                layoutParams.x = (i8 + i2) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, i4);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i9 = iArr2[i5];
                int i10 = ((i9 + i3) - dimensionPixelOffset3) - measuredHeight;
                int i11 = i9 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i10 >= 0) {
                        layoutParams.y = i10;
                    } else {
                        layoutParams.y = i11;
                    }
                } else if (measuredHeight + i11 <= rect.height()) {
                    layoutParams.y = i11;
                } else {
                    layoutParams.y = i10;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.Q) {
                j2 = 2500;
            } else {
                WeakHashMap weakHashMap = dr5.a;
                if ((view.getWindowSystemUiVisibility() & 1) == i5) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            z85 z85Var = this.M;
            view.removeCallbacks(z85Var);
            view.postDelayed(z85Var, j2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (java.lang.Math.abs(r5 - r3.O) <= r2) goto L30;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            b95 r4 = r3.P
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.Q
            if (r4 == 0) goto La
            goto L6f
        La:
            android.view.View r4 = r3.I
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            goto L6f
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.R = r4
            r3.a()
            return r0
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            b95 r4 = r3.P
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.R
            if (r1 != 0) goto L66
            int r1 = r3.N
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.K
            if (r1 > r2) goto L66
            int r1 = r3.O
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.N = r4
            r3.O = r5
            r3.R = r0
            b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a95.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.N = view.getWidth() / 2;
        this.O = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}

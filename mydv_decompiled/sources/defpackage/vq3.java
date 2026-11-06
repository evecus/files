package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.github.mytv.dv.R;
import java.util.UUID;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class vq3 extends a2 {
    public static final do2 o0 = new do2((byte) 26);
    public rm1 R;
    public zq3 S;
    public String T;
    public final View U;
    public final boolean V;
    public final j81 W;
    public final WindowManager a0;
    public final WindowManager.LayoutParams b0;
    public yq3 c0;
    public da2 d0;
    public final jk3 e0;
    public final jk3 f0;
    public v22 g0;
    public final wu0 h0;
    public final Rect i0;
    public final kt4 j0;
    public hk k0;
    public final jk3 l0;
    public boolean m0;
    public final int[] n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq3(rm1 rm1Var, zq3 zq3Var, String str, View view, iu0 iu0Var, yq3 yq3Var, UUID uuid, boolean z) {
        super(view.getContext());
        int i = Build.VERSION.SDK_INT;
        byte b = 29;
        byte b2 = 21;
        j81 xq3Var = i >= 30 ? new xq3(b2) : i >= 29 ? new wq3(b2) : new j81(b2);
        this.R = rm1Var;
        this.S = zq3Var;
        this.T = str;
        this.U = view;
        this.V = z;
        this.W = xq3Var;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.a0 = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        zq3 zq3Var2 = this.S;
        boolean c = pe.c(view);
        boolean z2 = zq3Var2.b;
        int i2 = zq3Var2.a;
        if (z2 && c) {
            i2 |= 8192;
        } else if (z2 && !c) {
            i2 &= -8193;
        }
        layoutParams.flags = i2;
        layoutParams.type = this.S.f;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.b0 = layoutParams;
        this.c0 = yq3Var;
        this.d0 = da2.I;
        this.e0 = ad4.w(null);
        this.f0 = ad4.w(null);
        this.h0 = dt4.b(new ce(this, b));
        this.i0 = new Rect();
        this.j0 = new kt4(new ie(this, (byte) 2));
        setId(android.R.id.content);
        ViewTreeLifecycleOwner.set(this, ViewTreeLifecycleOwner.get(view));
        ViewTreeViewModelStoreOwner.set(this, ViewTreeViewModelStoreOwner.get(view));
        ViewTreeSavedStateRegistryOwner.set(this, ViewTreeSavedStateRegistryOwner.get(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(iu0Var.P(8.0f));
        setOutlineProvider(new uw0((byte) 1));
        this.l0 = ad4.w(wx5.f);
        this.n0 = new int[2];
    }

    private final hn1 getContent() {
        return (hn1) this.l0.getValue();
    }

    private final v22 getDisplayBounds() {
        int i = this.S.a & 512;
        View view = this.U;
        Rect rect = this.i0;
        j81 j81Var = this.W;
        if (i == 0) {
            j81Var.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            j81Var.m(rect, view);
        }
        return new v22(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final ca2 getParentLayoutCoordinates() {
        return (ca2) this.f0.getValue();
    }

    public static final boolean m(vq3 vq3Var) {
        ca2 parentLayoutCoordinates = vq3Var.getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null || !parentLayoutCoordinates.h()) {
            parentLayoutCoordinates = null;
        }
        return (parentLayoutCoordinates == null || vq3Var.m369getPopupContentSizebOM6tXw() == null) ? false : true;
    }

    private final void setContent(hn1 hn1Var) {
        this.l0.setValue(hn1Var);
    }

    private final void setParentLayoutCoordinates(ca2 ca2Var) {
        this.f0.setValue(ca2Var);
    }

    @Override // defpackage.a2
    public final void a(fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-857613600);
        int i2 = (go1Var.i(this) ? 4 : 2) | i;
        if (go1Var.T(i2 & 1, (i2 & 3) != 2)) {
            getContent().invoke(go1Var, 0);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new rd(this, i, (byte) 11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.S.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                rm1 rm1Var = this.R;
                if (rm1Var != null) {
                    rm1Var.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.a2
    public final void g(int i, int i2, int i3, int i4, boolean z) {
        super.g(i, i2, i3, i4, z);
        this.S.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.b0;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.W.getClass();
        this.a0.updateViewLayout(this, layoutParams);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.h0.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.b0;
    }

    public final da2 getParentLayoutDirection() {
        return this.d0;
    }

    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final z22 m369getPopupContentSizebOM6tXw() {
        return (z22) this.e0.getValue();
    }

    public final yq3 getPositionProvider() {
        return this.c0;
    }

    @Override // defpackage.a2
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.m0;
    }

    public final String getTestTag() {
        return this.T;
    }

    public View getViewRoot() {
        return null;
    }

    @Override // defpackage.a2
    public final void h(int i, int i2) {
        this.S.getClass();
        v22 displayBounds = getDisplayBounds();
        super.h(View.MeasureSpec.makeMeasureSpec(displayBounds.c(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.a(), Integer.MIN_VALUE));
    }

    public final void n(re0 re0Var, hn1 hn1Var) {
        setParentCompositionContext(re0Var);
        setContent(hn1Var);
        this.m0 = true;
    }

    public final void o(rm1 rm1Var, zq3 zq3Var, String str, da2 da2Var) {
        int i;
        this.R = rm1Var;
        this.T = str;
        if (!j42.c(this.S, zq3Var)) {
            zq3Var.getClass();
            this.S = zq3Var;
            boolean c = pe.c(this.U);
            boolean z = zq3Var.b;
            int i2 = zq3Var.a;
            if (z && c) {
                i2 |= 8192;
            } else if (z && !c) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.b0;
            layoutParams.flags = i2;
            this.W.getClass();
            this.a0.updateViewLayout(this, layoutParams);
        }
        int ordinal = da2Var.ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                s83.v();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    @Override // defpackage.a2, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.j0.e();
        if (!this.S.c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        hk hkVar = this.k0;
        if (hkVar == null) {
            hk hkVar2 = new hk(this.R, (byte) 0);
            this.k0 = hkVar2;
            hkVar = hkVar2;
        }
        l5.i(this, hkVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kt4 kt4Var = this.j0;
        sr srVar = kt4Var.h;
        if (srVar != null) {
            srVar.a();
        }
        kt4Var.a();
        if (Build.VERSION.SDK_INT >= 33) {
            l5.j(this, this.k0);
        }
        this.k0 = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.S.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            rm1 rm1Var = this.R;
            if (rm1Var != null) {
                rm1Var.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            rm1 rm1Var2 = this.R;
            if (rm1Var2 != null) {
                rm1Var2.invoke();
            }
        }
        return true;
    }

    public final void p() {
        ca2 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.h()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long o = parentLayoutCoordinates.o();
            long mo36localToScreenMKHz9U = this.V ? parentLayoutCoordinates.mo36localToScreenMKHz9U(0L) : parentLayoutCoordinates.d(0L);
            long round = (Math.round(Float.intBitsToFloat((int) (mo36localToScreenMKHz9U >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (mo36localToScreenMKHz9U & 4294967295L))) & 4294967295L);
            int i = (int) (round >> 32);
            int i2 = (int) (round & 4294967295L);
            v22 v22Var = new v22(i, i2, ((int) (o >> 32)) + i, ((int) (o & 4294967295L)) + i2);
            if (v22Var.equals(this.g0)) {
                return;
            }
            this.g0 = v22Var;
            r();
        }
    }

    public final void q(ca2 ca2Var) {
        setParentLayoutCoordinates(ca2Var);
        p();
    }

    public final void r() {
        z22 m369getPopupContentSizebOM6tXw;
        final v22 v22Var = this.g0;
        if (v22Var == null || (m369getPopupContentSizebOM6tXw = m369getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        final long j = m369getPopupContentSizebOM6tXw.a;
        v22 displayBounds = getDisplayBounds();
        final long a = (displayBounds.a() & 4294967295L) | (displayBounds.c() << 32);
        final q24 q24Var = new q24();
        q24Var.I = 0L;
        this.j0.d(this, o0, new rm1() { // from class: uq3
            @Override // defpackage.rm1
            public final Object invoke() {
                vq3 vq3Var = this;
                q24.this.I = vq3Var.c0.e(v22Var, a, vq3Var.d0, j);
                return wd5.a;
            }
        });
        long j2 = q24Var.I;
        WindowManager.LayoutParams layoutParams = this.b0;
        layoutParams.x = (int) (j2 >> 32);
        layoutParams.y = (int) (j2 & 4294967295L);
        boolean z = this.S.e;
        j81 j81Var = this.W;
        if (z) {
            j81Var.q(this, (int) (a >> 32), (int) (a & 4294967295L));
        }
        j81Var.getClass();
        this.a0.updateViewLayout(this, layoutParams);
    }

    public final void setParentLayoutDirection(da2 da2Var) {
        this.d0 = da2Var;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m370setPopupContentSizefhxjrPA(z22 z22Var) {
        this.e0.setValue(z22Var);
    }

    public final void setPositionProvider(yq3 yq3Var) {
        this.c0 = yq3Var;
    }

    public final void setTestTag(String str) {
        this.T = str;
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public a2 getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}

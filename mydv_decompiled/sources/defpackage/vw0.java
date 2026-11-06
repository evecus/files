package defpackage;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.github.mytv.dv.R;
import java.util.UUID;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class vw0 extends lc0 {
    public rm1 M;
    public tw0 N;
    public final View O;
    public final qw0 P;
    public boolean Q;

    public vw0(rm1 rm1Var, tw0 tw0Var, View view, da2 da2Var, iu0 iu0Var, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), tw0Var.e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.M = rm1Var;
        this.N = tw0Var;
        this.O = view;
        Window window = getWindow();
        if (window == null) {
            zy.i("Dialog has no window");
            throw null;
        }
        tw0 tw0Var2 = this.N;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.type = tw0Var2.g;
            window2.setAttributes(attributes);
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        li4.m(window, this.N.e);
        window.setGravity(17);
        if (!this.N.e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                dk.a.a(attributes2);
            }
            if (i >= 30) {
                ek ekVar = ek.a;
                ekVar.b(attributes2, 0);
                ekVar.c(attributes2, 0);
            }
            window.setAttributes(attributes2);
        }
        qw0 qw0Var = new qw0(getContext(), window);
        setTitle(this.N.f);
        qw0Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        qw0Var.setClipChildren(false);
        qw0Var.setElevation(iu0Var.P(8.0f));
        qw0Var.setOutlineProvider(new uw0((byte) 0));
        this.P = qw0Var;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            f(viewGroup);
        }
        setContentView(qw0Var);
        ViewTreeLifecycleOwner.set(qw0Var, ViewTreeLifecycleOwner.get(view));
        ViewTreeViewModelStoreOwner.set(qw0Var, ViewTreeViewModelStoreOwner.get(view));
        ViewTreeSavedStateRegistryOwner.set(qw0Var, ViewTreeSavedStateRegistryOwner.get(view));
        h(this.M, this.N, da2Var);
        je3 b = b();
        gc gcVar = new gc(this, (byte) 1);
        b.getClass();
        b.a(this, new ke3(gcVar));
    }

    public static final void f(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof qw0) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                f(viewGroup2);
            }
        }
    }

    public final void h(rm1 rm1Var, tw0 tw0Var, da2 da2Var) {
        int i;
        this.M = rm1Var;
        this.N = tw0Var;
        yg4 yg4Var = tw0Var.c;
        boolean c = pe.c(this.O);
        int ordinal = yg4Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                c = true;
            } else {
                if (ordinal != 2) {
                    s83.v();
                    return;
                }
                c = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(c ? 8192 : -8193, 8192);
        int ordinal2 = da2Var.ordinal();
        if (ordinal2 == 0) {
            i = 0;
        } else {
            if (ordinal2 != 1) {
                s83.v();
                return;
            }
            i = 1;
        }
        qw0 qw0Var = this.P;
        qw0Var.setLayoutDirection(i);
        boolean z = tw0Var.e;
        boolean z2 = tw0Var.d;
        Window window2 = qw0Var.R;
        boolean z3 = (qw0Var.V && z2 == qw0Var.T && z == qw0Var.U) ? false : true;
        qw0Var.T = z2;
        qw0Var.U = z;
        if (z3) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i2 = z2 ? -2 : -1;
            if (i2 != attributes.width || !qw0Var.V) {
                window2.setLayout(i2, -2);
                qw0Var.V = true;
            }
        }
        setCanceledOnTouchOutside(tw0Var.b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.N.a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.M.invoke();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        if (r5 <= r1) goto L31;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = super.onTouchEvent(r10)
            tw0 r1 = r9.N
            boolean r1 = r1.b
            r2 = 3
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L86
            qw0 r1 = r9.P
            r1.getClass()
            float r5 = r10.getX()
            float r5 = java.lang.Math.abs(r5)
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L69
            float r5 = r10.getY()
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L69
            android.view.View r5 = r1.getChildAt(r3)
            if (r5 != 0) goto L34
            goto L69
        L34:
            int r6 = r1.getLeft()
            int r7 = r5.getLeft()
            int r7 = r7 + r6
            int r6 = r5.getWidth()
            int r6 = r6 + r7
            int r1 = r1.getTop()
            int r8 = r5.getTop()
            int r8 = r8 + r1
            int r1 = r5.getHeight()
            int r1 = r1 + r8
            float r5 = r10.getX()
            int r5 = defpackage.mw2.P(r5)
            if (r7 > r5) goto L69
            if (r5 > r6) goto L69
            float r5 = r10.getY()
            int r5 = defpackage.mw2.P(r5)
            if (r8 > r5) goto L69
            if (r5 > r1) goto L69
            goto L86
        L69:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L83
            if (r10 == r4) goto L77
            if (r10 == r2) goto L74
            goto L90
        L74:
            r9.Q = r3
            return r0
        L77:
            boolean r10 = r9.Q
            if (r10 == 0) goto L90
            rm1 r10 = r9.M
            r10.invoke()
            r9.Q = r3
            return r4
        L83:
            r9.Q = r4
            return r4
        L86:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L91
            if (r10 == r4) goto L91
            if (r10 == r2) goto L91
        L90:
            return r0
        L91:
            r9.Q = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vw0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}

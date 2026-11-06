package coil3.size;

import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.fj0;
import defpackage.j42;
import defpackage.k10;
import defpackage.mu0;
import defpackage.nt3;
import defpackage.tm1;
import defpackage.wd5;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class RealViewSizeResolver<T extends View> implements ViewSizeResolver<T> {
    private final boolean subtractPadding;
    private final T view;

    public RealViewSizeResolver(T t, boolean z) {
        this.view = t;
        this.subtractPadding = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealViewSizeResolver)) {
            return false;
        }
        RealViewSizeResolver realViewSizeResolver = (RealViewSizeResolver) obj;
        return j42.c(this.view, realViewSizeResolver.view) && this.subtractPadding == realViewSizeResolver.subtractPadding;
    }

    @Override // coil3.size.ViewSizeResolver
    public boolean getSubtractPadding() {
        return this.subtractPadding;
    }

    @Override // coil3.size.ViewSizeResolver
    public T getView() {
        return this.view;
    }

    public int hashCode() {
        return (this.view.hashCode() * 31) + (this.subtractPadding ? 1231 : 1237);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewTreeObserver$OnPreDrawListener, coil3.size.ViewSizeResolver$size$3$preDrawListener$1] */
    @Override // coil3.size.ViewSizeResolver, coil3.size.SizeResolver
    public final Object size(fj0 fj0Var) {
        Size f = nt3.f(this);
        if (f != null) {
            return f;
        }
        final k10 k10Var = new k10(1, mu0.G(fj0Var));
        k10Var.t();
        final ViewTreeObserver viewTreeObserver = getView().getViewTreeObserver();
        final ?? r1 = new ViewTreeObserver.OnPreDrawListener() { // from class: coil3.size.ViewSizeResolver$size$3$preDrawListener$1
            private boolean isResumed;

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                Size f2 = nt3.f(this);
                if (f2 != null) {
                    ViewSizeResolver<View> viewSizeResolver = this;
                    ViewTreeObserver viewTreeObserver2 = viewTreeObserver;
                    if (viewTreeObserver2.isAlive()) {
                        viewTreeObserver2.removeOnPreDrawListener(this);
                    } else {
                        viewSizeResolver.getView().getViewTreeObserver().removeOnPreDrawListener(this);
                    }
                    if (!this.isResumed) {
                        this.isResumed = true;
                        k10Var.resumeWith(f2);
                    }
                }
                return true;
            }
        };
        viewTreeObserver.addOnPreDrawListener(r1);
        k10Var.v(new tm1() { // from class: coil3.size.ViewSizeResolver$size$3$1
            public final void invoke(Throwable th) {
                ViewSizeResolver<View> viewSizeResolver = this;
                ViewTreeObserver viewTreeObserver2 = viewTreeObserver;
                ViewSizeResolver$size$3$preDrawListener$1 viewSizeResolver$size$3$preDrawListener$1 = r1;
                if (viewTreeObserver2.isAlive()) {
                    viewTreeObserver2.removeOnPreDrawListener(viewSizeResolver$size$3$preDrawListener$1);
                } else {
                    viewSizeResolver.getView().getViewTreeObserver().removeOnPreDrawListener(viewSizeResolver$size$3$preDrawListener$1);
                }
            }

            @Override // defpackage.tm1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return wd5.a;
            }
        });
        return k10Var.r();
    }

    public String toString() {
        return "RealViewSizeResolver(view=" + this.view + ", subtractPadding=" + this.subtractPadding + ")";
    }
}

package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class jz4 extends ActionMode {
    public final Context a;
    public final y6 b;

    public jz4(Context context, y6 y6Var) {
        this.a = context;
        this.b = y6Var;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.b.c();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new zy2(this.a, this.b.d());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.b.e();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.b.f();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.b.I;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.b.J;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.b.I = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.b.p(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.b.l(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.b.n(i);
    }
}

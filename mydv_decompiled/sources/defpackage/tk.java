package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class tk extends CheckedTextView implements f85 {
    public final uk I;
    public final c8 J;
    public final qm K;
    public rl L;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0083 A[Catch: all -> 0x0062, TryCatch #1 {all -> 0x0062, blocks: (B:3:0x0049, B:5:0x0050, B:8:0x0056, B:9:0x007c, B:11:0x0083, B:12:0x008a, B:14:0x0091, B:21:0x0065, B:23:0x006b, B:25:0x0071), top: B:2:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0091 A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #1 {all -> 0x0062, blocks: (B:3:0x0049, B:5:0x0050, B:8:0x0056, B:9:0x007c, B:11:0x0083, B:12:0x008a, B:14:0x0091, B:21:0x0065, B:23:0x006b, B:25:0x0071), top: B:2:0x0049 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public tk(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            r5 = 2130968665(0x7f040059, float:1.754599E38)
            r7.<init>(r8, r9, r5)
            android.content.Context r8 = r7.getContext()
            defpackage.u65.a(r7, r8)
            qm r8 = new qm
            r8.<init>(r7)
            r7.K = r8
            r8.h(r9, r5)
            r8.b()
            c8 r8 = new c8
            r8.<init>(r7)
            r7.J = r8
            r8.y(r9, r5)
            uk r8 = new uk
            r8.<init>(r7)
            r7.I = r8
            android.content.Context r8 = r7.getContext()
            int[] r2 = defpackage.qz3.l
            pn r8 = defpackage.pn.N(r8, r9, r2, r5)
            java.lang.Object r0 = r8.b
            r6 = r0
            android.content.res.TypedArray r6 = (android.content.res.TypedArray) r6
            android.content.Context r1 = r7.getContext()
            java.lang.Object r0 = r8.b
            r4 = r0
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r0 = r7
            r3 = r9
            defpackage.dr5.g(r0, r1, r2, r3, r4, r5)
            r7 = 1
            boolean r9 = r6.hasValue(r7)     // Catch: java.lang.Throwable -> L62
            r1 = 0
            if (r9 == 0) goto L65
            int r7 = r6.getResourceId(r7, r1)     // Catch: java.lang.Throwable -> L62
            if (r7 == 0) goto L65
            android.content.Context r9 = r0.getContext()     // Catch: java.lang.Throwable -> L62 android.content.res.Resources.NotFoundException -> L65
            android.graphics.drawable.Drawable r7 = defpackage.j42.C(r9, r7)     // Catch: java.lang.Throwable -> L62 android.content.res.Resources.NotFoundException -> L65
            r0.setCheckMarkDrawable(r7)     // Catch: java.lang.Throwable -> L62 android.content.res.Resources.NotFoundException -> L65
            goto L7c
        L62:
            r0 = move-exception
            r7 = r0
            goto La9
        L65:
            boolean r7 = r6.hasValue(r1)     // Catch: java.lang.Throwable -> L62
            if (r7 == 0) goto L7c
            int r7 = r6.getResourceId(r1, r1)     // Catch: java.lang.Throwable -> L62
            if (r7 == 0) goto L7c
            android.content.Context r9 = r0.getContext()     // Catch: java.lang.Throwable -> L62
            android.graphics.drawable.Drawable r7 = defpackage.j42.C(r9, r7)     // Catch: java.lang.Throwable -> L62
            r0.setCheckMarkDrawable(r7)     // Catch: java.lang.Throwable -> L62
        L7c:
            r7 = 2
            boolean r9 = r6.hasValue(r7)     // Catch: java.lang.Throwable -> L62
            if (r9 == 0) goto L8a
            android.content.res.ColorStateList r7 = r8.t(r7)     // Catch: java.lang.Throwable -> L62
            r0.setCheckMarkTintList(r7)     // Catch: java.lang.Throwable -> L62
        L8a:
            r7 = 3
            boolean r9 = r6.hasValue(r7)     // Catch: java.lang.Throwable -> L62
            if (r9 == 0) goto L9e
            r9 = -1
            int r7 = r6.getInt(r7, r9)     // Catch: java.lang.Throwable -> L62
            r9 = 0
            android.graphics.PorterDuff$Mode r7 = defpackage.h41.b(r7, r9)     // Catch: java.lang.Throwable -> L62
            r0.setCheckMarkTintMode(r7)     // Catch: java.lang.Throwable -> L62
        L9e:
            r8.T()
            rl r7 = r0.getEmojiTextViewHelper()
            r7.a(r3, r5)
            return
        La9:
            r8.T()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tk.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private rl getEmojiTextViewHelper() {
        rl rlVar = this.L;
        if (rlVar != null) {
            return rlVar;
        }
        rl rlVar2 = new rl(this);
        this.L = rlVar2;
        return rlVar2;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        qm qmVar = this.K;
        if (qmVar != null) {
            qmVar.b();
        }
        c8 c8Var = this.J;
        if (c8Var != null) {
            c8Var.b();
        }
        uk ukVar = this.I;
        if (ukVar != null) {
            ukVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return kb4.j0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        c8 c8Var = this.J;
        if (c8Var != null) {
            return c8Var.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        c8 c8Var = this.J;
        if (c8Var != null) {
            return c8Var.w();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        uk ukVar = this.I;
        if (ukVar != null) {
            return ukVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        uk ukVar = this.I;
        if (ukVar != null) {
            return ukVar.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.K.f();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.K.g();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        d4.E(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        c8 c8Var = this.J;
        if (c8Var != null) {
            c8Var.B();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        c8 c8Var = this.J;
        if (c8Var != null) {
            c8Var.C(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        uk ukVar = this.I;
        if (ukVar != null) {
            if (ukVar.e) {
                ukVar.e = false;
            } else {
                ukVar.e = true;
                ukVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        qm qmVar = this.K;
        if (qmVar != null) {
            qmVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        qm qmVar = this.K;
        if (qmVar != null) {
            qmVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(kb4.o0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        c8 c8Var = this.J;
        if (c8Var != null) {
            c8Var.M(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        c8 c8Var = this.J;
        if (c8Var != null) {
            c8Var.N(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        uk ukVar = this.I;
        if (ukVar != null) {
            ukVar.a = colorStateList;
            ukVar.c = true;
            ukVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        uk ukVar = this.I;
        if (ukVar != null) {
            ukVar.b = mode;
            ukVar.d = true;
            ukVar.b();
        }
    }

    @Override // defpackage.f85
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        qm qmVar = this.K;
        qmVar.m(colorStateList);
        qmVar.b();
    }

    @Override // defpackage.f85
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        qm qmVar = this.K;
        qmVar.n(mode);
        qmVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        qm qmVar = this.K;
        if (qmVar != null) {
            qmVar.i(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(j42.C(getContext(), i));
    }
}

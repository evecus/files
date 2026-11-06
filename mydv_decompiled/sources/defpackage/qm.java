package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class qm {
    public final TextView a;
    public e85 b;
    public e85 c;
    public e85 d;
    public e85 e;
    public e85 f;
    public e85 g;
    public e85 h;
    public final xm i;
    public Typeface l;
    public boolean n;
    public int j = 0;
    public int k = -1;
    public String m = null;

    public qm(TextView textView) {
        this.a = textView;
        this.i = new xm(textView);
    }

    public static void d(TextView textView, Typeface typeface, int i) {
        int i2 = Build.VERSION.SDK_INT;
        String str = null;
        if (i2 >= 26) {
            String c = om.c(textView);
            if (!TextUtils.isEmpty(c)) {
                om.f(textView, null);
            }
            str = c;
        }
        textView.setTypeface(typeface, i);
        if (i2 < 26 || TextUtils.isEmpty(str)) {
            return;
        }
        om.f(textView, str);
    }

    public static e85 e(Context context, nl nlVar, int i) {
        ColorStateList i2;
        synchronized (nlVar) {
            i2 = nlVar.a.i(context, i);
        }
        if (i2 == null) {
            return null;
        }
        e85 e85Var = new e85();
        e85Var.d = true;
        e85Var.a = i2;
        return e85Var;
    }

    public final void a(Drawable drawable, e85 e85Var) {
        if (drawable == null || e85Var == null) {
            return;
        }
        int[] drawableState = this.a.getDrawableState();
        PorterDuff.Mode mode = nl.b;
        z44.o(drawable, e85Var, drawableState);
    }

    public final void b() {
        e85 e85Var = this.b;
        TextView textView = this.a;
        if (e85Var != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final void c(boolean z) {
        Typeface typeface = this.l;
        TextView textView = this.a;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        } else if (z) {
            textView.setTypeface(null);
        }
        String str = this.m;
        if (str == null || Build.VERSION.SDK_INT < 26) {
            return;
        }
        om.f(textView, str);
    }

    public final ColorStateList f() {
        e85 e85Var = this.h;
        if (e85Var != null) {
            return e85Var.a;
        }
        return null;
    }

    public final PorterDuff.Mode g() {
        e85 e85Var = this.h;
        if (e85Var != null) {
            return e85Var.b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instructions count: 913
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qm.h(android.util.AttributeSet, int):void");
    }

    public final void i(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, qz3.v);
        pn pnVar = new pn(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        boolean o = o(context, pnVar);
        pnVar.T();
        c(o);
    }

    public final void j(int i, int i2, int i3, int i4) {
        xm xmVar = this.i;
        if (xmVar.j()) {
            DisplayMetrics displayMetrics = xmVar.j.getResources().getDisplayMetrics();
            xmVar.k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (xmVar.h()) {
                xmVar.a();
            }
        }
    }

    public final void k(int[] iArr, int i) {
        xm xmVar = this.i;
        if (xmVar.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = xmVar.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                xmVar.f = xm.b(iArr2);
                if (!xmVar.i()) {
                    j0.l(Arrays.toString(iArr), "None of the preset sizes is valid: ");
                    return;
                }
            } else {
                xmVar.g = false;
            }
            if (xmVar.h()) {
                xmVar.a();
            }
        }
    }

    public final void l(int i) {
        xm xmVar = this.i;
        if (xmVar.j()) {
            if (i == 0) {
                xmVar.a = 0;
                xmVar.d = -1.0f;
                xmVar.e = -1.0f;
                xmVar.c = -1.0f;
                xmVar.f = new int[0];
                xmVar.b = false;
                return;
            }
            if (i != 1) {
                s83.t(hf1.u(i, "Unknown auto-size text type: "));
                return;
            }
            DisplayMetrics displayMetrics = xmVar.j.getResources().getDisplayMetrics();
            xmVar.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (xmVar.h()) {
                xmVar.a();
            }
        }
    }

    public final void m(ColorStateList colorStateList) {
        e85 e85Var = this.h;
        if (e85Var == null) {
            e85Var = new e85();
            this.h = e85Var;
        }
        e85 e85Var2 = e85Var;
        e85Var.a = colorStateList;
        e85Var.d = colorStateList != null;
        this.b = e85Var2;
        this.c = e85Var2;
        this.d = e85Var2;
        this.e = e85Var2;
        this.f = e85Var2;
        this.g = e85Var2;
    }

    public final void n(PorterDuff.Mode mode) {
        e85 e85Var = this.h;
        if (e85Var == null) {
            e85Var = new e85();
            this.h = e85Var;
        }
        e85 e85Var2 = e85Var;
        e85Var.b = mode;
        e85Var.c = mode != null;
        this.b = e85Var2;
        this.c = e85Var2;
        this.d = e85Var2;
        this.e = e85Var2;
        this.f = e85Var2;
        this.g = e85Var2;
    }

    public final boolean o(Context context, pn pnVar) {
        String string;
        int i;
        Typeface typeface;
        int i2 = this.j;
        TypedArray typedArray = (TypedArray) pnVar.b;
        this.j = typedArray.getInt(2, i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int i4 = typedArray.getInt(11, -1);
            this.k = i4;
            if (i4 != -1) {
                this.j &= 2;
            }
        }
        if (i3 >= 26 && typedArray.hasValue(13)) {
            this.m = typedArray.getString(13);
        }
        if (typedArray.hasValue(10) || typedArray.hasValue(12)) {
            this.l = null;
            int i5 = typedArray.hasValue(12) ? 12 : 10;
            int i6 = this.k;
            int i7 = this.j;
            if (!context.isRestricted()) {
                try {
                    Typeface y = pnVar.y(i5, this.j, new lm(this, i6, i7, new WeakReference(this.a)));
                    if (y != null) {
                        if (i3 < 28 || this.k == -1) {
                            this.l = y;
                        } else {
                            this.l = ck.e(Typeface.create(y, 0), this.k, (this.j & 2) != 0);
                        }
                    }
                    this.n = this.l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.l == null && (string = typedArray.getString(i5)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
                    this.l = Typeface.create(string, this.j);
                } else {
                    this.l = ck.e(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
                }
            }
        } else {
            if (!typedArray.hasValue(1)) {
                if (i3 < 28 || (i = this.k) == -1 || (typeface = this.l) == null) {
                    return false;
                }
                this.l = ck.e(typeface, i, (this.j & 2) != 0);
                return true;
            }
            this.n = false;
            int i8 = typedArray.getInt(1, 1);
            if (i8 == 1) {
                this.l = Typeface.SANS_SERIF;
                return true;
            }
            if (i8 == 2) {
                this.l = Typeface.SERIF;
                return true;
            }
            if (i8 == 3) {
                this.l = Typeface.MONOSPACE;
                return true;
            }
        }
        return true;
    }
}

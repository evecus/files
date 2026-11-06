package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.StateSet;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class di extends Drawable.ConstantState {
    public boolean A;
    public ColorFilter B;
    public boolean C;
    public ColorStateList D;
    public PorterDuff.Mode E;
    public boolean F;
    public boolean G;
    public int[][] H;
    public bs2 I;
    public cu4 J;
    public final gi a;
    public Resources b;
    public int c;
    public int d;
    public int e;
    public SparseArray f;
    public Drawable[] g;
    public int h;
    public boolean i;
    public boolean j;
    public Rect k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public int z;

    public di(di diVar, gi giVar, Resources resources) {
        this.i = false;
        this.l = false;
        this.w = true;
        this.y = 0;
        this.z = 0;
        this.a = giVar;
        Object obj = null;
        this.b = resources != null ? resources : diVar != null ? diVar.b : null;
        int i = diVar != null ? diVar.c : 0;
        int i2 = gi.b0;
        i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
        i = i == 0 ? 160 : i;
        this.c = i;
        if (diVar != null) {
            this.d = diVar.d;
            this.e = diVar.e;
            this.u = true;
            this.v = true;
            this.i = diVar.i;
            this.l = diVar.l;
            this.w = diVar.w;
            this.x = diVar.x;
            this.y = diVar.y;
            this.z = diVar.z;
            this.A = diVar.A;
            this.B = diVar.B;
            this.C = diVar.C;
            this.D = diVar.D;
            this.E = diVar.E;
            this.F = diVar.F;
            this.G = diVar.G;
            if (diVar.c == i) {
                if (diVar.j) {
                    this.k = diVar.k != null ? new Rect(diVar.k) : null;
                    this.j = true;
                }
                if (diVar.m) {
                    this.n = diVar.n;
                    this.o = diVar.o;
                    this.p = diVar.p;
                    this.q = diVar.q;
                    this.m = true;
                }
            }
            if (diVar.r) {
                this.s = diVar.s;
                this.r = true;
            }
            if (diVar.t) {
                this.t = true;
            }
            Drawable[] drawableArr = diVar.g;
            this.g = new Drawable[drawableArr.length];
            this.h = diVar.h;
            SparseArray sparseArray = diVar.f;
            if (sparseArray != null) {
                this.f = sparseArray.clone();
            } else {
                this.f = new SparseArray(this.h);
            }
            int i3 = this.h;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f.put(i4, constantState);
                    } else {
                        this.g[i4] = drawableArr[i4];
                    }
                }
            }
        } else {
            this.g = new Drawable[10];
            this.h = 0;
        }
        if (diVar != null) {
            this.H = diVar.H;
        } else {
            this.H = new int[this.g.length][];
        }
        if (diVar != null) {
            this.I = diVar.I;
            this.J = diVar.J;
        } else {
            this.I = new bs2(obj);
            this.J = new cu4(0);
        }
    }

    public final int a(Drawable drawable) {
        int i = this.h;
        if (i >= this.g.length) {
            int i2 = i + 10;
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.g = drawableArr;
            int[][] iArr = new int[i2][];
            System.arraycopy(this.H, 0, iArr, 0, i);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.a);
        this.g[i] = drawable;
        this.h++;
        this.e = drawable.getChangingConfigurations() | this.e;
        this.r = false;
        this.t = false;
        this.k = null;
        this.j = false;
        this.m = false;
        this.u = false;
        return i;
    }

    public final void b() {
        this.m = true;
        c();
        int i = this.h;
        Drawable[] drawableArr = this.g;
        this.o = -1;
        this.n = -1;
        this.q = 0;
        this.p = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.n) {
                this.n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.o) {
                this.o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.p) {
                this.p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.q) {
                this.q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = this.f.keyAt(i);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f.valueAt(i);
                Drawable[] drawableArr = this.g;
                Drawable newDrawable = constantState.newDrawable(this.b);
                newDrawable.setLayoutDirection(this.x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.a);
                drawableArr[keyAt] = mutate;
            }
            this.f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i = this.h;
        Drawable[] drawableArr = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f.get(i2);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (drawable.canApplyTheme()) {
                return true;
            }
        }
        return false;
    }

    public final Drawable d(int i) {
        int indexOfKey;
        Drawable drawable = this.g[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f.valueAt(indexOfKey)).newDrawable(this.b);
        newDrawable.setLayoutDirection(this.x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.a);
        this.g[i] = mutate;
        this.f.removeAt(indexOfKey);
        if (this.f.size() == 0) {
            this.f = null;
        }
        return mutate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final int e(int i) {
        ?? r3;
        if (i < 0) {
            return 0;
        }
        cu4 cu4Var = this.J;
        int i2 = 0;
        cu4Var.getClass();
        int g = o7.g(cu4Var.L, i, cu4Var.J);
        if (g >= 0 && (r3 = cu4Var.K[g]) != qb.p) {
            i2 = r3;
        }
        return i2.intValue();
    }

    public final int f(int[] iArr) {
        int[][] iArr2 = this.H;
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.e | this.d;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new gi(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new gi(this, resources);
    }
}

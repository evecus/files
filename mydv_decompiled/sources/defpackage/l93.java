package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class l93 {
    public ViewParent a;
    public ViewParent b;
    public final ViewGroup c;
    public boolean d;
    public int[] e;

    public l93(ViewGroup viewGroup) {
        this.c = viewGroup;
    }

    public final boolean a(float f, float f2) {
        ViewParent d;
        if (!this.d || (d = d(0)) == null) {
            return false;
        }
        return eg5.E(d, this.c, f, f2);
    }

    public final boolean b(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent d;
        int i4;
        int i5;
        if (this.d && (d = d(i3)) != null) {
            if (i != 0 || i2 != 0) {
                ViewGroup viewGroup = this.c;
                if (iArr2 != null) {
                    viewGroup.getLocationInWindow(iArr2);
                    i4 = iArr2[0];
                    i5 = iArr2[1];
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                if (iArr == null && (iArr = this.e) == null) {
                    iArr = new int[2];
                    this.e = iArr;
                }
                int[] iArr3 = iArr;
                iArr3[0] = 0;
                iArr3[1] = 0;
                eg5.F(d, viewGroup, i, i2, iArr3, i3);
                if (iArr2 != null) {
                    viewGroup.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i4;
                    iArr2[1] = iArr2[1] - i5;
                }
                if (iArr3[0] != 0 || iArr3[1] != 0) {
                    return true;
                }
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final boolean c(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent d;
        int i6;
        int i7;
        int[] iArr3;
        int i8;
        int i9;
        int i10;
        int i11;
        if (this.d && (d = d(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                ViewGroup viewGroup = this.c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    int[] iArr4 = this.e;
                    if (iArr4 == null) {
                        iArr4 = new int[2];
                        this.e = iArr4;
                    }
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                    i9 = i2;
                    i10 = i3;
                    i11 = i4;
                    i8 = i;
                } else {
                    iArr3 = iArr2;
                    i8 = i;
                    i9 = i2;
                    i10 = i3;
                    i11 = i4;
                }
                eg5.G(d, viewGroup, i8, i9, i10, i11, i5, iArr3);
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent d(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return null;
        }
        return this.b;
    }

    public final boolean e(int i) {
        return d(i) != null;
    }

    public final boolean f(int i, int i2) {
        if (e(i2)) {
            return true;
        }
        if (!this.d) {
            return false;
        }
        ViewGroup viewGroup = this.c;
        View view = viewGroup;
        for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
            if (eg5.I(parent, view, viewGroup, i, i2)) {
                if (i2 == 0) {
                    this.a = parent;
                } else if (i2 == 1) {
                    this.b = parent;
                }
                eg5.H(parent, view, viewGroup, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }
}

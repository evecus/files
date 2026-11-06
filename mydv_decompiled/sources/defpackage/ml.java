package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.github.mytv.dv.R;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ml {
    public int[] a;
    public int[] b;
    public int[] c;
    public int[] d;
    public Object e;
    public Object f;

    public static boolean a(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList b(Context context, int i) {
        int c = u65.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{u65.b, u65.d, u65.c, u65.f}, new int[]{u65.b(context, R.attr.colorButtonNormal), w90.b(c, i), w90.b(c, i), i});
    }

    public static LayerDrawable c(z44 z44Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable f = z44Var.f(context, R.drawable.abc_star_black_48dp);
        Drawable f2 = z44Var.f(context, R.drawable.abc_star_half_black_48dp);
        if ((f instanceof BitmapDrawable) && f.getIntrinsicWidth() == dimensionPixelSize && f.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) f;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            f.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((f2 instanceof BitmapDrawable) && f2.getIntrinsicWidth() == dimensionPixelSize && f2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) f2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            f2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void f(Drawable drawable, int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter h;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = nl.b;
        }
        PorterDuff.Mode mode2 = nl.b;
        synchronized (nl.class) {
            h = z44.h(i, mode);
        }
        mutate.setColorFilter(h);
    }

    public ColorStateList d(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return z9.b(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return z9.b(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, u65.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return b(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return b(context, u65.c(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return z9.b(context, R.color.abc_tint_spinner);
            }
            if (a(i, this.b)) {
                return u65.d(context, R.attr.colorControlNormal);
            }
            if (a(i, (int[]) this.e)) {
                return z9.b(context, R.color.abc_tint_default);
            }
            if (a(i, (int[]) this.f)) {
                return z9.b(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return z9.b(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d = u65.d(context, R.attr.colorSwitchThumbNormal);
        if (d == null || !d.isStateful()) {
            iArr[0] = u65.b;
            iArr2[0] = u65.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = u65.e;
            iArr2[1] = u65.c(context, R.attr.colorControlActivated);
            iArr[2] = u65.f;
            iArr2[2] = u65.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = u65.b;
            iArr[0] = iArr3;
            iArr2[0] = d.getColorForState(iArr3, 0);
            iArr[1] = u65.e;
            iArr2[1] = u65.c(context, R.attr.colorControlActivated);
            iArr[2] = u65.f;
            iArr2[2] = d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public jz3 e(hz3 hz3Var, iz3 iz3Var, int i, int i2, int i3, int i4, int i5, int i6) {
        ml mlVar = this;
        hz3 hz3Var2 = hz3Var;
        int[] iArr = mlVar.b;
        if (iArr == null) {
            j42.g0("momentsR");
            throw null;
        }
        int k = sv2.k(hz3Var2, iz3Var, iArr);
        int[] iArr2 = mlVar.c;
        if (iArr2 == null) {
            j42.g0("momentsG");
            throw null;
        }
        int k2 = sv2.k(hz3Var2, iz3Var, iArr2);
        int[] iArr3 = mlVar.d;
        if (iArr3 == null) {
            j42.g0("momentsB");
            throw null;
        }
        int k3 = sv2.k(hz3Var2, iz3Var, iArr3);
        int[] iArr4 = mlVar.a;
        if (iArr4 == null) {
            j42.g0("weights");
            throw null;
        }
        int k4 = sv2.k(hz3Var2, iz3Var, iArr4);
        int i7 = -1;
        double d = 0.0d;
        int i8 = i;
        while (i8 < i2) {
            int i9 = k;
            int[] iArr5 = mlVar.b;
            if (iArr5 == null) {
                j42.g0("momentsR");
                throw null;
            }
            int Z = sv2.Z(hz3Var2, iz3Var, i8, iArr5) + i9;
            int[] iArr6 = mlVar.c;
            if (iArr6 == null) {
                j42.g0("momentsG");
                throw null;
            }
            int Z2 = sv2.Z(hz3Var2, iz3Var, i8, iArr6) + k2;
            int[] iArr7 = mlVar.d;
            if (iArr7 == null) {
                j42.g0("momentsB");
                throw null;
            }
            int Z3 = sv2.Z(hz3Var2, iz3Var, i8, iArr7) + k3;
            int[] iArr8 = mlVar.a;
            if (iArr8 == null) {
                j42.g0("weights");
                throw null;
            }
            int Z4 = sv2.Z(hz3Var2, iz3Var, i8, iArr8) + k4;
            if (Z4 != 0) {
                double d2 = ((Z3 * Z3) + ((Z2 * Z2) + (Z * Z))) / Z4;
                int i10 = i3 - Z;
                int i11 = i4 - Z2;
                int i12 = i5 - Z3;
                int i13 = i6 - Z4;
                if (i13 != 0) {
                    int i14 = i12 * i12;
                    double d3 = ((i14 + ((i11 * i11) + (i10 * i10))) / i13) + d2;
                    if (d3 > d) {
                        d = d3;
                        i7 = i8;
                    }
                }
            }
            i8++;
            mlVar = this;
            hz3Var2 = hz3Var;
            k = i9;
        }
        jz3 jz3Var = new jz3();
        jz3Var.a = i7;
        jz3Var.b = d;
        return jz3Var;
    }

    public double g(hz3 hz3Var) {
        int[] iArr = this.b;
        if (iArr == null) {
            j42.g0("momentsR");
            throw null;
        }
        int c0 = sv2.c0(hz3Var, iArr);
        int[] iArr2 = this.c;
        if (iArr2 == null) {
            j42.g0("momentsG");
            throw null;
        }
        int c02 = sv2.c0(hz3Var, iArr2);
        int[] iArr3 = this.d;
        if (iArr3 == null) {
            j42.g0("momentsB");
            throw null;
        }
        int c03 = sv2.c0(hz3Var, iArr3);
        double[] dArr = (double[]) this.e;
        if (dArr == null) {
            j42.g0("moments");
            throw null;
        }
        double d = dArr[sv2.A(hz3Var.b, hz3Var.d, hz3Var.f)];
        double[] dArr2 = (double[]) this.e;
        if (dArr2 == null) {
            j42.g0("moments");
            throw null;
        }
        double d2 = d - dArr2[sv2.A(hz3Var.b, hz3Var.d, hz3Var.e)];
        double[] dArr3 = (double[]) this.e;
        if (dArr3 == null) {
            j42.g0("moments");
            throw null;
        }
        double d3 = d2 - dArr3[sv2.A(hz3Var.b, hz3Var.c, hz3Var.f)];
        double[] dArr4 = (double[]) this.e;
        if (dArr4 == null) {
            j42.g0("moments");
            throw null;
        }
        double d4 = d3 + dArr4[sv2.A(hz3Var.b, hz3Var.c, hz3Var.e)];
        double[] dArr5 = (double[]) this.e;
        if (dArr5 == null) {
            j42.g0("moments");
            throw null;
        }
        double d5 = d4 - dArr5[sv2.A(hz3Var.a, hz3Var.d, hz3Var.f)];
        double[] dArr6 = (double[]) this.e;
        if (dArr6 == null) {
            j42.g0("moments");
            throw null;
        }
        double d6 = d5 + dArr6[sv2.A(hz3Var.a, hz3Var.d, hz3Var.e)];
        double[] dArr7 = (double[]) this.e;
        if (dArr7 == null) {
            j42.g0("moments");
            throw null;
        }
        double d7 = d6 + dArr7[sv2.A(hz3Var.a, hz3Var.c, hz3Var.f)];
        double[] dArr8 = (double[]) this.e;
        if (dArr8 == null) {
            j42.g0("moments");
            throw null;
        }
        double d8 = d7 - dArr8[sv2.A(hz3Var.a, hz3Var.c, hz3Var.e)];
        int i = (c03 * c03) + (c02 * c02) + (c0 * c0);
        if (this.a != null) {
            return d8 - (i / sv2.c0(hz3Var, r11));
        }
        j42.g0("weights");
        throw null;
    }
}

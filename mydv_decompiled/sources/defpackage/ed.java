package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import android.text.StaticLayout;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.autofill.AutofillId;
import androidx.compose.ui.platform.AndroidComposeView;
import j$.util.function.DoubleUnaryOperator$CC;
import java.util.Arrays;
import java.util.function.DoubleUnaryOperator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class ed {
    public static final Bitmap a(tw1 tw1Var) {
        if (tw1Var instanceof dd) {
            return ((dd) tw1Var).a;
        }
        zy.p("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    public static final Bitmap b(int i, int i2, int i3, v80 v80Var) {
        Bitmap.Config config;
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        ColorSpace.Rgb.TransferParameters transferParameters;
        ColorSpace f;
        ColorSpace k;
        ColorSpace colorSpace3;
        Bitmap.Config i4 = i(i3);
        if (j42.c(v80Var, z80.e)) {
            colorSpace3 = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (j42.c(v80Var, z80.q)) {
            colorSpace3 = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (j42.c(v80Var, z80.r)) {
            colorSpace3 = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (j42.c(v80Var, z80.o)) {
            colorSpace3 = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (j42.c(v80Var, z80.j)) {
            colorSpace3 = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (j42.c(v80Var, z80.i)) {
            colorSpace3 = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (j42.c(v80Var, z80.t)) {
            colorSpace3 = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (j42.c(v80Var, z80.s)) {
            colorSpace3 = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (j42.c(v80Var, z80.k)) {
            colorSpace3 = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (j42.c(v80Var, z80.l)) {
            colorSpace3 = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (j42.c(v80Var, z80.g)) {
            colorSpace3 = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (j42.c(v80Var, z80.h)) {
            colorSpace3 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (j42.c(v80Var, z80.f)) {
            colorSpace3 = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (j42.c(v80Var, z80.m)) {
            colorSpace3 = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (j42.c(v80Var, z80.p)) {
            colorSpace3 = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!j42.c(v80Var, z80.n)) {
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 34 && (k = z4.k(v80Var)) != null) {
                    colorSpace2 = k;
                } else {
                    if (i5 < 36 || (f = m5.f(v80Var)) == null) {
                        if (v80Var instanceof v54) {
                            String str = v80Var.a;
                            v54 v54Var = (v54) v80Var;
                            float[] a = v54Var.d.a();
                            q95 q95Var = v54Var.g;
                            if (q95Var != null) {
                                config = i4;
                                transferParameters = new ColorSpace.Rgb.TransferParameters(q95Var.b, q95Var.c, q95Var.d, q95Var.e, q95Var.f, q95Var.g, q95Var.a);
                            } else {
                                config = i4;
                                transferParameters = null;
                            }
                            float[] fArr = v54Var.i;
                            final byte b = 0;
                            if (transferParameters != null) {
                                x80.a();
                                ColorSpace.Rgb rgb = new ColorSpace.Rgb(str, v54Var.h, a, transferParameters);
                                if (Float.isNaN(fArr[0]) || Arrays.equals(rgb.getTransform(), fArr)) {
                                    colorSpace2 = rgb;
                                } else {
                                    x80.a();
                                    colorSpace = new ColorSpace.Rgb(str, fArr, transferParameters);
                                }
                            } else {
                                x80.a();
                                float[] fArr2 = v54Var.h;
                                final u54 u54Var = v54Var.l;
                                DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: y80
                                    public /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator2) {
                                        byte b2 = b;
                                        return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator2);
                                    }

                                    @Override // java.util.function.DoubleUnaryOperator
                                    public final double applyAsDouble(double d) {
                                        byte b2 = b;
                                        tm1 tm1Var = u54Var;
                                        switch (b2) {
                                        }
                                        return ((Number) tm1Var.invoke(Double.valueOf(d))).doubleValue();
                                    }

                                    public /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator2) {
                                        byte b2 = b;
                                        return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator2);
                                    }
                                };
                                final u54 u54Var2 = v54Var.o;
                                final byte b2 = 1;
                                colorSpace2 = new ColorSpace.Rgb(str, fArr2, a, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: y80
                                    public /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator2) {
                                        byte b22 = b2;
                                        return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator2);
                                    }

                                    @Override // java.util.function.DoubleUnaryOperator
                                    public final double applyAsDouble(double d) {
                                        byte b22 = b2;
                                        tm1 tm1Var = u54Var2;
                                        switch (b22) {
                                        }
                                        return ((Number) tm1Var.invoke(Double.valueOf(d))).doubleValue();
                                    }

                                    public /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator2) {
                                        byte b22 = b2;
                                        return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator2);
                                    }
                                }, v54Var.e, v54Var.f);
                            }
                            return Bitmap.createBitmap((DisplayMetrics) null, i, i2, config, true, colorSpace2);
                        }
                        config = i4;
                        colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                        colorSpace2 = colorSpace;
                        return Bitmap.createBitmap((DisplayMetrics) null, i, i2, config, true, colorSpace2);
                    }
                    colorSpace2 = f;
                }
                config = i4;
                return Bitmap.createBitmap((DisplayMetrics) null, i, i2, config, true, colorSpace2);
            }
            colorSpace3 = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        colorSpace2 = colorSpace3;
        config = i4;
        return Bitmap.createBitmap((DisplayMetrics) null, i, i2, config, true, colorSpace2);
    }

    public static AutofillId c(View view) {
        return view.getAutofillId();
    }

    public static float d(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float e(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static void f(AndroidComposeView androidComposeView) {
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }

    public static Intent g(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, i);
    }

    public static final void h(StaticLayout.Builder builder, int i) {
        builder.setJustificationMode(i);
    }

    public static final Bitmap.Config i(int i) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (i == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && i == 3) {
            config2 = Bitmap.Config.RGBA_F16;
            return config2;
        }
        if (i2 < 26 || i != 4) {
            return Bitmap.Config.ARGB_8888;
        }
        config = Bitmap.Config.HARDWARE;
        return config;
    }

    public static final int j(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3;
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            config3 = Bitmap.Config.RGBA_F16;
            if (config == config3) {
                return 3;
            }
        }
        if (i < 26) {
            return 0;
        }
        config2 = Bitmap.Config.HARDWARE;
        return config == config2 ? 4 : 0;
    }
}

package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class cc5 extends ad4 {
    public static Font I(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int L = L(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int L2 = L(fontStyle, font2.getStyle());
            if (L2 < L) {
                font = font2;
                L = L2;
            }
        }
        return font;
    }

    public static int L(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final FontFamily J(sk1[] sk1VarArr, ContentResolver contentResolver) {
        Font font;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (sk1 sk1Var : sk1VarArr) {
            if (sk1Var.g()) {
                font = K(sk1Var);
            } else {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(sk1Var.c(), "r", null);
                } catch (IOException e) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(sk1Var.e()).setSlant(sk1Var.f() ? 1 : 0).setTtcIndex(sk1Var.b());
                        if (!TextUtils.isEmpty(sk1Var.d())) {
                            ttcIndex.setFontVariationSettings(sk1Var.d());
                        }
                        font = ttcIndex.build();
                        openFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            if (font != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(font);
                } else {
                    builder.addFont(font);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font K(sk1 sk1Var) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // defpackage.ad4
    public final Typeface g(Context context, fk1 fk1Var, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (gk1 gk1Var : fk1Var.a()) {
                try {
                    Font build = new Font.Builder(resources, gk1Var.a()).setWeight(gk1Var.d()).setSlant(gk1Var.e() ? 1 : 0).setTtcIndex(gk1Var.b()).setFontVariationSettings(gk1Var.c()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(I(build2, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.ad4
    public final Typeface h(Context context, sk1[] sk1VarArr, int i) {
        try {
            FontFamily J = J(sk1VarArr, context.getContentResolver());
            if (J == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(J).setStyle(I(J, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.ad4
    public final Typeface i(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily J = J((sk1[]) list.get(0), contentResolver);
            if (J == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(J);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily J2 = J((sk1[]) list.get(i2), contentResolver);
                if (J2 != null) {
                    customFallbackBuilder.addCustomFallback(J2);
                }
            }
            return customFallbackBuilder.setStyle(I(J, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.ad4
    public final Typeface j(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }
}

package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.github.mytv.dv.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class z44 {
    public static z44 i;
    public WeakHashMap a;
    public oo4 b;
    public cu4 c;
    public final WeakHashMap d = new WeakHashMap(0);
    public TypedValue e;
    public boolean f;
    public ml g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static final x44 j = new x44(6);

    public static synchronized z44 d() {
        z44 z44Var;
        synchronized (z44.class) {
            try {
                if (i == null) {
                    z44 z44Var2 = new z44();
                    i = z44Var2;
                    j(z44Var2);
                }
                z44Var = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z44Var;
    }

    public static synchronized PorterDuffColorFilter h(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (z44.class) {
            x44 x44Var = j;
            x44Var.getClass();
            int i3 = (31 + i2) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) x44Var.a(Integer.valueOf(mode.hashCode() + i3));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public static void j(z44 z44Var) {
        if (Build.VERSION.SDK_INT < 24) {
            z44Var.a("vector", new y44((byte) 3));
            z44Var.a("animated-vector", new y44((byte) 2));
            z44Var.a("animated-selector", new y44((byte) 1));
            z44Var.a("drawable", new y44((byte) 0));
        }
    }

    public static void o(Drawable drawable, e85 e85Var, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = e85Var.d;
        if (z || e85Var.c) {
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = z ? e85Var.a : null;
            PorterDuff.Mode mode = e85Var.c ? e85Var.b : h;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = h(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT == 23) {
            drawable.invalidateSelf();
        }
    }

    public final void a(String str, y44 y44Var) {
        oo4 oo4Var = this.b;
        if (oo4Var == null) {
            oo4Var = new oo4(0);
            this.b = oo4Var;
        }
        oo4Var.put(str, y44Var);
    }

    public final synchronized void b(Context context, long j2, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                bs2 bs2Var = (bs2) this.d.get(context);
                if (bs2Var == null) {
                    bs2Var = new bs2((Object) null);
                    this.d.put(context, bs2Var);
                }
                bs2Var.g(j2, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable c(Context context, int i2) {
        TypedValue typedValue = this.e;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.e = typedValue;
        }
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e = e(context, j2);
        if (e != null) {
            return e;
        }
        LayerDrawable layerDrawable = null;
        if (this.g != null) {
            if (i2 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i2 == R.drawable.abc_ratingbar_material) {
                layerDrawable = ml.c(this, context, R.dimen.abc_star_big);
            } else if (i2 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = ml.c(this, context, R.dimen.abc_star_medium);
            } else if (i2 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = ml.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j2, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j2) {
        bs2 bs2Var = (bs2) this.d.get(context);
        if (bs2Var == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) bs2Var.d(j2);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            bs2Var.h(j2);
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i2) {
        return g(context, i2, false);
    }

    public final synchronized Drawable g(Context context, int i2, boolean z) {
        Drawable k;
        try {
            if (!this.f) {
                this.f = true;
                Drawable f = f(context, R.drawable.abc_vector_test);
                if (f == null || (!(f instanceof rh5) && !"android.graphics.drawable.VectorDrawable".equals(f.getClass().getName()))) {
                    this.f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            k = k(context, i2);
            if (k == null) {
                k = c(context, i2);
            }
            if (k == null) {
                k = context.getDrawable(i2);
            }
            if (k != null) {
                k = n(context, i2, z, k);
            }
            if (k != null) {
                h41.a(k);
            }
        } catch (Throwable th) {
            throw th;
        }
        return k;
    }

    public final synchronized ColorStateList i(Context context, int i2) {
        ColorStateList colorStateList;
        cu4 cu4Var;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (cu4Var = (cu4) weakHashMap.get(context)) == null) ? null : (ColorStateList) qb.y(cu4Var, i2);
        if (colorStateList == null) {
            ml mlVar = this.g;
            if (mlVar != null) {
                colorStateList2 = mlVar.d(context, i2);
            }
            if (colorStateList2 != null) {
                WeakHashMap weakHashMap2 = this.a;
                if (weakHashMap2 == null) {
                    weakHashMap2 = new WeakHashMap();
                    this.a = weakHashMap2;
                }
                cu4 cu4Var2 = (cu4) weakHashMap2.get(context);
                if (cu4Var2 == null) {
                    cu4Var2 = new cu4(0);
                    this.a.put(context, cu4Var2);
                }
                cu4Var2.a(i2, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i2) {
        int next;
        oo4 oo4Var = this.b;
        if (oo4Var == null || oo4Var.isEmpty()) {
            return null;
        }
        cu4 cu4Var = this.c;
        if (cu4Var != null) {
            String str = (String) qb.y(cu4Var, i2);
            if ("appcompat_skip_skip".equals(str)) {
                return null;
            }
            if (str != null && this.b.get(str) == null) {
                return null;
            }
        } else {
            this.c = new cu4(0);
        }
        TypedValue typedValue = this.e;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.e = typedValue;
        }
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e = e(context, j2);
        if (e != null) {
            return e;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.c.a(i2, name);
                y44 y44Var = (y44) this.b.get(name);
                if (y44Var != null) {
                    e = y44Var.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (e != null) {
                    e.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, j2, e);
                }
            } catch (Exception e2) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e2);
            }
        }
        if (e == null) {
            this.c.a(i2, "appcompat_skip_skip");
        }
        return e;
    }

    public final synchronized void l(Context context) {
        bs2 bs2Var = (bs2) this.d.get(context);
        if (bs2Var != null) {
            bs2Var.b();
        }
    }

    public final synchronized void m(ml mlVar) {
        this.g = mlVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable n(android.content.Context r8, int r9, boolean r10, android.graphics.drawable.Drawable r11) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z44.n(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}

package coil3.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import defpackage.d54;
import defpackage.hf1;
import defpackage.j42;
import defpackage.ki;
import defpackage.li2;
import defpackage.rh5;
import defpackage.vi2;
import defpackage.zy;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ContextsKt {
    private static final int DEFAULT_MEMORY_CLASS_MEGABYTES = 256;
    private static final double LOW_MEMORY_MULTIPLIER = 0.15d;
    private static final double STANDARD_MEMORY_MULTIPLIER = 0.2d;

    public static final double defaultMemoryCacheSizePercent(Context context) {
        try {
            Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
            systemService.getClass();
            return ((ActivityManager) systemService).isLowRamDevice() ? LOW_MEMORY_MULTIPLIER : STANDARD_MEMORY_MULTIPLIER;
        } catch (Exception unused) {
            return STANDARD_MEMORY_MULTIPLIER;
        }
    }

    public static final Context getApplication(Context context) {
        return context.getApplicationContext();
    }

    public static final Drawable getDrawableCompat(Resources resources, int i, Resources.Theme theme) {
        ThreadLocal threadLocal = d54.a;
        Drawable drawable = resources.getDrawable(i, theme);
        if (drawable != null) {
            return drawable;
        }
        zy.e(hf1.u(i, "Invalid resource ID: "));
        return null;
    }

    public static final li2 getLifecycle(Context context) {
        Object obj = context;
        while (!(obj instanceof vi2)) {
            if (!(obj instanceof ContextWrapper)) {
                return null;
            }
            obj = ((ContextWrapper) obj).getBaseContext();
        }
        return ((vi2) obj).k();
    }

    public static final Drawable getXmlDrawableCompat(Context context, Resources resources, int i) {
        XmlResourceParser xml = resources.getXml(i);
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next != 2) {
            throw new XmlPullParserException("No start tag found.");
        }
        if (Build.VERSION.SDK_INT < 24) {
            String name = xml.getName();
            if (j42.c(name, "vector")) {
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                Resources.Theme theme = context.getTheme();
                rh5 rh5Var = new rh5();
                rh5Var.inflate(resources, xml, asAttributeSet, theme);
                return rh5Var;
            }
            if (j42.c(name, "animated-vector")) {
                return ki.a(context, resources, xml, Xml.asAttributeSet(xml), context.getTheme());
            }
        }
        return getDrawableCompat(resources, i, context.getTheme());
    }

    public static final long totalAvailableMemoryBytes(Context context) {
        int i;
        try {
            Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
            systemService.getClass();
            ActivityManager activityManager = (ActivityManager) systemService;
            i = (context.getApplicationInfo().flags & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            i = 256;
        }
        return i * 1048576;
    }

    public static final Drawable getDrawableCompat(Context context, int i) {
        Drawable C = j42.C(context, i);
        if (C != null) {
            return C;
        }
        zy.e(hf1.u(i, "Invalid resource ID: "));
        return null;
    }
}

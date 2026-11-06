package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.RemoteViews;
import android.widget.TextView;
import androidx.media3.common.C;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import okhttp3.internal.ws.WebSocketProtocol;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class a5 {
    public static hx1 a;
    public static hx1 b;
    public static hx1 c;
    public static hx1 d;
    public static hx1 e;
    public static hx1 f;
    public static hx1 g;

    public static b10 A(float f2, float f3, float f4) {
        float f5 = bm1.k.i * f3;
        Math.sqrt(((f3 / ((float) Math.sqrt(f2 / 100.0d))) * r0.e) / (r0.b + 4.0f));
        float f6 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float log = ((float) Math.log((f5 * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f4) / 180.0f;
        return new b10(f4, f3, f2, f6, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    public static tu0 B(nu0 nu0Var) {
        return new tu0(0L, r7.c(ut0.b0(0L), nu0Var));
    }

    public static final hx1 C() {
        hx1 hx1Var = a;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        epVar.z(19.0f, 13.0f);
        epVar.v(-6.0f);
        epVar.M(6.0f);
        epVar.v(-2.0f);
        epVar.M(-6.0f);
        epVar.u(5.0f);
        epVar.M(-2.0f);
        epVar.v(6.0f);
        epVar.L(5.0f);
        epVar.v(2.0f);
        epVar.M(6.0f);
        epVar.v(6.0f);
        epVar.M(2.0f);
        epVar.p();
        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
        hx1 b2 = gx1Var.b();
        a = b2;
        return b2;
    }

    public static final int D(int i, qk1 qk1Var) {
        boolean z = qk1Var.compareTo(qk1.L) >= 0;
        boolean z2 = i == 1;
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    public static final hx1 E() {
        hx1 hx1Var = b;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        epVar.z(20.0f, 11.0f);
        epVar.u(7.83f);
        epVar.y(5.59f, -5.59f);
        epVar.x(12.0f, 4.0f);
        epVar.y(-8.0f, 8.0f);
        epVar.y(8.0f, 8.0f);
        epVar.y(1.41f, -1.41f);
        epVar.x(7.83f, 13.0f);
        epVar.u(20.0f);
        epVar.M(-2.0f);
        epVar.p();
        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
        hx1 b2 = gx1Var.b();
        b = b2;
        return b2;
    }

    public static final hx1 F() {
        hx1 hx1Var = c;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.Backspace", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep p = hf1.p(22.0f, 3.0f, 7.0f, 3.0f);
        p.r(-0.69f, 0.0f, -1.23f, 0.35f, -1.59f, 0.88f);
        p.x(0.0f, 12.0f);
        p.y(5.41f, 8.11f);
        p.r(0.36f, 0.53f, 0.9f, 0.89f, 1.59f, 0.89f);
        p.v(15.0f);
        p.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        p.x(24.0f, 5.0f);
        p.r(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        p.p();
        p.z(19.0f, 15.59f);
        p.x(17.59f, 17.0f);
        p.x(14.0f, 13.41f);
        p.x(10.41f, 17.0f);
        p.x(9.0f, 15.59f);
        p.x(12.59f, 12.0f);
        p.x(9.0f, 8.41f);
        p.x(10.41f, 7.0f);
        p.x(14.0f, 10.59f);
        p.x(17.59f, 7.0f);
        p.x(19.0f, 8.41f);
        p.x(15.41f, 12.0f);
        p.x(19.0f, 15.59f);
        p.p();
        gx1.a(gx1Var, (ArrayList) p.J, rt4Var);
        hx1 b2 = gx1Var.b();
        c = b2;
        return b2;
    }

    public static final hx1 G() {
        hx1 hx1Var = d;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.Block", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep r = r7.r(12.0f, 2.0f);
        r.q(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        r.D(4.48f, 10.0f, 10.0f, 10.0f);
        r.D(10.0f, -4.48f, 10.0f, -10.0f);
        r.C(17.52f, 2.0f, 12.0f, 2.0f);
        r.p();
        r.z(4.0f, 12.0f);
        r.r(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f);
        r.r(1.85f, 0.0f, 3.55f, 0.63f, 4.9f, 1.69f);
        r.x(5.69f, 16.9f);
        r.q(4.63f, 15.55f, 4.0f, 13.85f, 4.0f, 12.0f);
        r.p();
        r.z(12.0f, 20.0f);
        r.r(-1.85f, 0.0f, -3.55f, -0.63f, -4.9f, -1.69f);
        r.x(18.31f, 7.1f);
        r.q(19.37f, 8.45f, 20.0f, 10.15f, 20.0f, 12.0f);
        r.r(0.0f, 4.42f, -3.58f, 8.0f, -8.0f, 8.0f);
        r.p();
        gx1.a(gx1Var, (ArrayList) r.J, rt4Var);
        hx1 b2 = gx1Var.b();
        d = b2;
        return b2;
    }

    public static final t72 H(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (!(serialDescriptor instanceof wi0) && (serialDescriptor instanceof tj4)) {
            return H(((tj4) serialDescriptor).a);
        }
        return null;
    }

    public static int I(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static final void J(o63 o63Var, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        H(serialDescriptor);
    }

    public static final hx1 K() {
        hx1 hx1Var = f;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.Cookie", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep r = r7.r(21.95f, 10.99f);
        r.r(-1.79f, -0.03f, -3.7f, -1.95f, -2.68f, -4.22f);
        r.r(-2.98f, 1.0f, -5.77f, -1.59f, -5.19f, -4.56f);
        r.q(6.95f, 0.71f, 2.0f, 6.58f, 2.0f, 12.0f);
        r.r(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        r.q(17.89f, 22.0f, 22.54f, 16.92f, 21.95f, 10.99f);
        r.p();
        r.z(8.5f, 15.0f);
        r.q(7.67f, 15.0f, 7.0f, 14.33f, 7.0f, 13.5f);
        r.C(7.67f, 12.0f, 8.5f, 12.0f);
        r.D(1.5f, 0.67f, 1.5f, 1.5f);
        r.C(9.33f, 15.0f, 8.5f, 15.0f);
        r.p();
        r.z(10.5f, 10.0f);
        r.q(9.67f, 10.0f, 9.0f, 9.33f, 9.0f, 8.5f);
        r.C(9.67f, 7.0f, 10.5f, 7.0f);
        r.C(12.0f, 7.67f, 12.0f, 8.5f);
        r.C(11.33f, 10.0f, 10.5f, 10.0f);
        r.p();
        r.z(15.0f, 16.0f);
        r.r(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        r.r(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        r.D(1.0f, 0.45f, 1.0f, 1.0f);
        r.q(16.0f, 15.55f, 15.55f, 16.0f, 15.0f, 16.0f);
        r.p();
        gx1.a(gx1Var, (ArrayList) r.J, rt4Var);
        hx1 b2 = gx1Var.b();
        f = b2;
        return b2;
    }

    public static f5 L() {
        f5 f5Var = f5.c;
        if (f5Var != null) {
            return f5Var;
        }
        f5 f5Var2 = new f5();
        f5.c = f5Var2;
        return f5Var2;
    }

    public static PropertyValuesHolder M(TypedArray typedArray, int i, int i2, int i3, String str) {
        PropertyValuesHolder ofFloat;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i4 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i5 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((z && O(i4)) || (z2 && O(i5))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            kl3[] r = il2.r(string);
            kl3[] r2 = il2.r(string2);
            if (r != null || r2 != null) {
                if (r != null) {
                    jj jjVar = new jj();
                    if (r2 == null) {
                        return PropertyValuesHolder.ofObject(str, jjVar, r);
                    }
                    if (il2.l(r, r2)) {
                        return PropertyValuesHolder.ofObject(str, jjVar, r, r2);
                    }
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                if (r2 != null) {
                    return PropertyValuesHolder.ofObject(str, new jj(), r2);
                }
            }
            return null;
        }
        hp hpVar = i == 3 ? hp.a : null;
        if (z3) {
            if (z) {
                float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                if (z2) {
                    ofFloat = PropertyValuesHolder.ofFloat(str, dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                ofFloat = PropertyValuesHolder.ofFloat(str, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
            }
            propertyValuesHolder = ofFloat;
        } else if (z) {
            int dimension2 = i4 == 5 ? (int) typedArray.getDimension(i2, 0.0f) : O(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
            if (z2) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : O(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
            }
        } else if (z2) {
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : O(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
        }
        if (propertyValuesHolder != null && hpVar != null) {
            propertyValuesHolder.setEvaluator(hpVar);
        }
        return propertyValuesHolder;
    }

    public static final StackTraceElement N(fu fuVar) {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        rp0 rp0Var = (rp0) fuVar.getClass().getAnnotation(rp0.class);
        String str2 = null;
        if (rp0Var == null || rp0Var.v() < 1) {
            return null;
        }
        try {
            Field declaredField = fuVar.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(fuVar);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i = -1;
        }
        int i2 = i >= 0 ? rp0Var.l()[i] : -1;
        x81 x81Var = eu5.p;
        x81 x81Var2 = eu5.q;
        if (x81Var2 == null) {
            try {
                x81 x81Var3 = new x81((Object) Class.class.getDeclaredMethod("getModule", null), (Object) fuVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), (Object) fuVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), (byte) 4);
                eu5.q = x81Var3;
                x81Var2 = x81Var3;
            } catch (Exception unused2) {
                eu5.q = x81Var;
                x81Var2 = x81Var;
            }
        }
        if (x81Var2 != x81Var && (method = (Method) x81Var2.b) != null && (invoke = method.invoke(fuVar.getClass(), null)) != null && (method2 = (Method) x81Var2.c) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = (Method) x81Var2.d;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = rp0Var.c();
        } else {
            str = str2 + '/' + rp0Var.c();
        }
        return new StackTraceElement(str, rp0Var.m(), rp0Var.f(), i2);
    }

    public static boolean O(int i) {
        return i >= 28 && i <= 31;
    }

    public static final boolean P(ex0 ex0Var) {
        if (ex0Var instanceof ax0) {
            return true;
        }
        if (!j42.c(ex0Var, bx0.a) && !j42.c(ex0Var, cx0.a) && !j42.c(ex0Var, dx0.a) && ex0Var != null) {
            s83.v();
        }
        return false;
    }

    public static ValueAnimator Q(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlPullParser xmlPullParser) {
        int i;
        TypedArray a0 = hc4.a0(resources, theme, attributeSet, j16.g);
        TypedArray a02 = hc4.a0(resources, theme, attributeSet, j16.k);
        ValueAnimator valueAnimator = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long K = hc4.K(a0, xmlPullParser, "duration", 1, 300);
        long j = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startOffset") != null ? a0.getInt(2, 0) : 0;
        int i2 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null ? a0.getInt(7, 4) : 4;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null && xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
            if (i2 == 4) {
                TypedValue peekValue = a0.peekValue(5);
                boolean z = peekValue != null;
                int i3 = z ? peekValue.type : 0;
                TypedValue peekValue2 = a0.peekValue(6);
                boolean z2 = peekValue2 != null;
                i2 = ((z && O(i3)) || (z2 && O(z2 ? peekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder M = M(a0, i2, 5, 6, "");
            if (M != null) {
                valueAnimator.setValues(M);
            }
        }
        valueAnimator.setDuration(K);
        valueAnimator.setStartDelay(j);
        valueAnimator.setRepeatCount(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatCount") != null ? a0.getInt(3, 0) : 0);
        valueAnimator.setRepeatMode(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatMode") != null ? a0.getInt(4, 1) : 1);
        if (a02 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator;
            String L = hc4.L(a02, xmlPullParser, "pathData", 1);
            if (L != null) {
                String L2 = hc4.L(a02, xmlPullParser, "propertyXName", 2);
                String L3 = hc4.L(a02, xmlPullParser, "propertyYName", 3);
                if (i2 != 2) {
                }
                if (L2 == null && L3 == null) {
                    throw new InflateException(a02.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path path = new Path();
                try {
                    il2.T(il2.r(L), path);
                    PathMeasure pathMeasure = new PathMeasure(path, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Float.valueOf(0.0f));
                    float f2 = 0.0f;
                    do {
                        f2 = pathMeasure.getLength() + f2;
                        arrayList.add(Float.valueOf(f2));
                    } while (pathMeasure.nextContour());
                    PathMeasure pathMeasure2 = new PathMeasure(path, false);
                    int min = Math.min(100, ((int) (f2 / 0.5f)) + 1);
                    float[] fArr = new float[min];
                    float[] fArr2 = new float[min];
                    float[] fArr3 = new float[2];
                    float f3 = f2 / (min - 1);
                    int i4 = 0;
                    float f4 = 0.0f;
                    int i5 = 0;
                    while (i4 < min) {
                        int i6 = min;
                        int i7 = i4;
                        pathMeasure2.getPosTan(f4 - ((Float) arrayList.get(i5)).floatValue(), fArr3, null);
                        fArr[i7] = fArr3[0];
                        fArr2[i7] = fArr3[1];
                        int i8 = i5 + 1;
                        f4 += f3;
                        if (i8 < arrayList.size() && f4 > ((Float) arrayList.get(i8)).floatValue()) {
                            pathMeasure2.nextContour();
                            i5 = i8;
                        }
                        i4 = i7 + 1;
                        min = i6;
                    }
                    PropertyValuesHolder ofFloat = L2 != null ? PropertyValuesHolder.ofFloat(L2, fArr) : null;
                    PropertyValuesHolder ofFloat2 = L3 != null ? PropertyValuesHolder.ofFloat(L3, fArr2) : null;
                    if (ofFloat == null) {
                        objectAnimator2.setValues(ofFloat2);
                    } else if (ofFloat2 == null) {
                        objectAnimator2.setValues(ofFloat);
                    } else {
                        objectAnimator2.setValues(ofFloat, ofFloat2);
                    }
                    i = 0;
                } catch (RuntimeException e2) {
                    s83.p("Error in parsing ".concat(L), e2);
                    return null;
                }
            } else {
                i = 0;
                objectAnimator2.setPropertyName(hc4.L(a02, xmlPullParser, "propertyName", 0));
            }
        } else {
            i = 0;
        }
        int resourceId = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? a0.getResourceId(i, i) : i;
        if (resourceId > 0) {
            valueAnimator.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        a0.recycle();
        if (a02 != null) {
            a02.recycle();
        }
        return valueAnimator;
    }

    public static final k33 R(b7... b7VarArr) {
        ArrayList arrayList = new ArrayList(b7VarArr.length);
        for (b7 b7Var : b7VarArr) {
            arrayList.add(new uj3(b7Var.a, b7Var.b));
        }
        uj3[] uj3VarArr = (uj3[]) arrayList.toArray(new uj3[0]);
        return new k33(sv2.O((uj3[]) Arrays.copyOf(uj3VarArr, uj3VarArr.length)));
    }

    public static final uu2 S(fc4 fc4Var) {
        return new uu2(ViewConfiguration.get(vt0.T(fc4Var).getContext()));
    }

    public static void T(AccessibilityEvent accessibilityEvent, boolean z) {
        if (Build.VERSION.SDK_INT >= 34) {
            z4.p(accessibilityEvent, z);
        }
    }

    public static final void U(TextPaint textPaint, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f2 * 255.0f));
    }

    public static void V(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }

    public static final u60 W(oj ojVar) {
        SpannableString spannableString;
        List list = ojVar.K;
        List list2 = o91.I;
        List list3 = list == null ? list2 : list;
        CharSequence charSequence = ojVar.J;
        if (!list3.isEmpty()) {
            SpannableString spannableString2 = new SpannableString(charSequence);
            uu2 uu2Var = new uu2();
            uu2Var.I = Parcel.obtain();
            if (list == null) {
                list = list2;
            }
            int size = list.size();
            int i = 0;
            SpannableString spannableString3 = spannableString2;
            while (i < size) {
                nj njVar = (nj) list.get(i);
                yt4 yt4Var = (yt4) njVar.a;
                int i2 = njVar.b;
                int i3 = njVar.c;
                ((Parcel) uu2Var.I).recycle();
                uu2Var.I = Parcel.obtain();
                g55 g55Var = yt4Var.a;
                long j = yt4Var.l;
                long j2 = yt4Var.h;
                int i4 = i;
                long j3 = yt4Var.b;
                List list4 = list;
                int i5 = size;
                long a2 = g55Var.a();
                long j4 = x70.g;
                if (zc5.a(a2, j4)) {
                    spannableString = spannableString3;
                } else {
                    uu2Var.o((byte) 1);
                    spannableString = spannableString3;
                    ((Parcel) uu2Var.I).writeLong(yt4Var.a.a());
                }
                long j5 = p65.c;
                byte b2 = 2;
                if (!p65.a(j3, j5)) {
                    uu2Var.o((byte) 2);
                    uu2Var.q(j3);
                }
                qk1 qk1Var = yt4Var.c;
                if (qk1Var != null) {
                    uu2Var.o((byte) 3);
                    ((Parcel) uu2Var.I).writeInt(qk1Var.I);
                }
                lk1 lk1Var = yt4Var.d;
                if (lk1Var != null) {
                    int i6 = lk1Var.a;
                    uu2Var.o((byte) 4);
                    uu2Var.o((i6 != 0 && i6 == 1) ? (byte) 1 : (byte) 0);
                }
                mk1 mk1Var = yt4Var.e;
                if (mk1Var != null) {
                    int i7 = mk1Var.a;
                    uu2Var.o((byte) 5);
                    if (i7 != 0) {
                        if (i7 == 65535) {
                            b2 = 1;
                        } else if (i7 != 1) {
                            if (i7 == 2) {
                                b2 = 3;
                            }
                        }
                        uu2Var.o(b2);
                    }
                    b2 = 0;
                    uu2Var.o(b2);
                }
                String str = yt4Var.g;
                if (str != null) {
                    uu2Var.o((byte) 6);
                    ((Parcel) uu2Var.I).writeString(str);
                }
                if (!p65.a(j2, j5)) {
                    uu2Var.o((byte) 7);
                    uu2Var.q(j2);
                }
                wu wuVar = yt4Var.i;
                if (wuVar != null) {
                    float f2 = wuVar.a;
                    uu2Var.o((byte) 8);
                    uu2Var.p(f2);
                }
                h55 h55Var = yt4Var.j;
                if (h55Var != null) {
                    uu2Var.o((byte) 9);
                    uu2Var.p(h55Var.a);
                    uu2Var.p(h55Var.b);
                }
                if (!zc5.a(j, j4)) {
                    uu2Var.o((byte) 10);
                    ((Parcel) uu2Var.I).writeLong(j);
                }
                m35 m35Var = yt4Var.m;
                if (m35Var != null) {
                    uu2Var.o((byte) 11);
                    ((Parcel) uu2Var.I).writeInt(m35Var.a);
                }
                an4 an4Var = yt4Var.n;
                if (an4Var != null) {
                    uu2Var.o((byte) 12);
                    ((Parcel) uu2Var.I).writeLong(an4Var.a);
                    long j6 = an4Var.b;
                    uu2Var.p(Float.intBitsToFloat((int) (j6 >> 32)));
                    uu2Var.p(Float.intBitsToFloat((int) (j6 & 4294967295L)));
                    uu2Var.p(an4Var.c);
                }
                SpannableString spannableString4 = spannableString;
                spannableString4.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) uu2Var.I).marshall(), 0)), i2, i3, 33);
                i = i4 + 1;
                spannableString3 = spannableString4;
                list = list4;
                size = i5;
            }
            charSequence = spannableString3;
        }
        return new u60(ClipData.newPlainText("plain text", charSequence));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [d1, m04] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList X(sr4 sr4Var, int i, Integer num) {
        ?? m04Var = new m04(sr4Var);
        int q = sr4Var.q(i);
        bo1 a2 = sr4Var.a(i);
        while (i >= 0) {
            m04Var.m(sr4Var.i(i), sr4Var.k(i) ? sr4Var.p(i, sr4Var.b) : de0.a, sr4Var.a.m(i), num);
            if (q >= 0) {
                bo1 bo1Var = a2;
                a2 = sr4Var.a(q);
                i = q;
                q = sr4Var.q(q);
                num = bo1Var;
            } else {
                i = q;
                num = a2;
            }
        }
        return (ArrayList) m04Var.b;
    }

    public static final void a(final l13 l13Var, u8 u8Var, boolean z, final tc0 tc0Var, fe0 fe0Var, final int i, final int i2) {
        int i3;
        final boolean z2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(380139498);
        if ((i & 6) == 0) {
            i3 = (go1Var.g(l13Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= go1Var.g(u8Var) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= go1Var.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= go1Var.i(tc0Var) ? 2048 : 1024;
        }
        if (go1Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            if (i4 != 0) {
                u8Var = q8.J;
            }
            boolean z3 = i5 != 0 ? false : z;
            uw2 c2 = px.c(u8Var, z3);
            boolean g2 = go1Var.g(c2) | ((i3 & 7168) == 2048);
            Object Q = go1Var.Q();
            if (g2 || Q == de0.a) {
                Q = new bj1(c2, tc0Var, (byte) 5);
                go1Var.o0(Q);
            }
            i42.Y(l13Var, (hn1) Q, go1Var, i3 & 14);
            z2 = z3;
        } else {
            go1Var.W();
            z2 = z;
        }
        final u8 u8Var2 = u8Var;
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: vx
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a5.a(l13.this, u8Var2, z2, tc0Var, (fe0) obj, mu0.X(i | 1), i2);
                    return wd5.a;
                }
            };
        }
    }

    public static final void b(String str, d6 d6Var, lq1 lq1Var, boolean z, l65 l65Var, rz rzVar, int i, fe0 fe0Var, int i2) {
        int i3;
        boolean z2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(81945084);
        if ((i2 & 6) == 0) {
            i3 = (go1Var.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? go1Var.g(d6Var) : go1Var.i(d6Var) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= go1Var.g(lq1Var) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        if ((i2 & 24576) == 0) {
            i4 |= go1Var.g(l65Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= (262144 & i2) == 0 ? go1Var.g(rzVar) : go1Var.i(rzVar) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= go1Var.e(i) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((599187 & i4) == 599186 && go1Var.F()) {
            go1Var.W();
            z2 = z;
        } else {
            go1Var.Y();
            if ((i2 & 1) == 0 || go1Var.C()) {
                z = true;
            } else {
                go1Var.W();
            }
            boolean z3 = z;
            go1Var.r();
            c(str, d6Var, lq1Var, z3, l65Var, rzVar, i, go1Var, i4 & 4194302);
            z2 = z3;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new tz(str, d6Var, lq1Var, z2, l65Var, rzVar, i, i2, (byte) 0);
        }
    }

    public static final void c(String str, d6 d6Var, lq1 lq1Var, boolean z, l65 l65Var, rz rzVar, int i, fe0 fe0Var, int i2) {
        int i3;
        int i4;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(507525656);
        byte b2 = 4;
        if ((i2 & 6) == 0) {
            i3 = (go1Var.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? go1Var.g(d6Var) : go1Var.i(d6Var) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= go1Var.g(lq1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= go1Var.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= go1Var.g(l65Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= (262144 & i2) == 0 ? go1Var.g(rzVar) : go1Var.i(rzVar) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 = i;
            i3 |= go1Var.e(i4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            i4 = i;
        }
        if ((i3 & 599187) == 599186 && go1Var.F()) {
            go1Var.W();
        } else {
            go1Var.Y();
            if ((i2 & 1) != 0 && !go1Var.C()) {
                go1Var.W();
            }
            go1Var.r();
            lq1 a2 = (z ? g4.r(lq1Var, d6Var) : lq1Var).a(new qt(rzVar.a));
            i80 i80Var = rzVar.b;
            l65 l65Var2 = l65Var != null ? new l65(i80Var, l65Var.b, l65Var.c, l65Var.d) : new l65(i80Var, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            go1Var.e0(1849434622);
            Object Q = go1Var.Q();
            if (Q == de0.a) {
                Q = uz.I;
                go1Var.o0(Q);
            }
            byte b3 = 0;
            go1Var.q(false);
            rm1 rm1Var = (rm1) ((v72) Q);
            go1Var.e0(-1115894518);
            go1Var.e0(1886828752);
            if (!(go1Var.a instanceof zo)) {
                qb.S();
                throw null;
            }
            go1Var.b0();
            if (go1Var.S) {
                go1Var.l(new mq1(rm1Var, b3));
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, new bd0((byte) 3), str);
            qi4.k(go1Var, new bd0(b2), a2);
            qi4.k(go1Var, new bd0((byte) 5), l65Var2);
            qi4.k(go1Var, new bd0((byte) 6), rzVar);
            qi4.k(go1Var, new bd0((byte) 7), Boolean.valueOf(z));
            bd0 bd0Var = new bd0((byte) 8);
            if (go1Var.S || !j42.c(go1Var.Q(), Integer.valueOf(i4))) {
                go1Var.o0(Integer.valueOf(i4));
                go1Var.b(Integer.valueOf(i4), bd0Var);
            }
            r7.J(go1Var, true, false, false);
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new tz(str, d6Var, lq1Var, z, l65Var, rzVar, i4, i2, (byte) 1);
        }
    }

    public static final void d(u45 u45Var, tc0 tc0Var, fe0 fe0Var, int i) {
        int i2;
        l13 t0;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1533506138);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = (go1Var.i(u45Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.i(tc0Var) ? 32 : 16;
        }
        byte b3 = 0;
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            go1Var.d0(-885604480);
            if (u45Var.i()) {
                fj0 fj0Var = null;
                t0 = eu5.t0(wx5.H(new n45(u45Var, fj0Var, b3)), u45Var.x, new o45(u45Var, null), new p45(u45Var, fj0Var, b3), new ck0(u45Var, b2));
            } else {
                t0 = i13.a;
            }
            lq2.k(t0, tc0Var, go1Var, i2 & 112);
            go1Var.q(false);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new fb0(u45Var, tc0Var, i, b3);
        }
    }

    public static final void e(String str, rm1 rm1Var, l13 l13Var, fe0 fe0Var, int i) {
        go1 go1Var;
        l13 l13Var2;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(1609775238);
        int i2 = i | (go1Var2.g(str) ? 4 : 2) | (go1Var2.i(rm1Var) ? 32 : 16) | RendererCapabilities.DECODER_SUPPORT_MASK;
        if (go1Var2.T(i2 & 1, (i2 & 147) != 146)) {
            i13 i13Var = i13.a;
            l13 E0 = i42.E0(nq4.e(i13Var, 1.0f), 0.0f, 2.0f, 1);
            u74 a2 = t74.a(i42.b, q8.T, go1Var2, 48);
            long j = go1Var2.T;
            int i3 = (int) (j ^ (j >>> 32));
            am3 m = go1Var2.m();
            l13 x0 = i42.x0(go1Var2, E0);
            xd0.c.getClass();
            go1Var2.h0();
            if (go1Var2.S) {
                go1Var2.l(wa2.A0);
            } else {
                go1Var2.r0();
            }
            qi4.k(go1Var2, q8.c0, a2);
            qi4.k(go1Var2, q8.b0, m);
            qi4.k(go1Var2, q8.d0, Integer.valueOf(i3));
            qi4.j(go1Var2);
            qi4.k(go1Var2, q8.a0, x0);
            i51 i51Var = lw2.b;
            l13Var2 = i13Var;
            r55.b(str, new sc2(1.0f, true), ((fw2) go1Var2.k(i51Var)).a.q, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((fw2) go1Var2.k(i51Var)).b.k, go1Var2, i2 & 14, 24960, 110584);
            go1Var = go1Var2;
            oh4.a(go1Var, nq4.n(l13Var2, 8.0f));
            f(rm1Var, null, go1Var, (i2 >> 3) & 14);
            go1Var.q(true);
        } else {
            go1Var = go1Var2;
            go1Var.W();
            l13Var2 = l13Var;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new tf((Object) str, (Object) rm1Var, l13Var2, i, (byte) 2);
        }
    }

    public static final void f(rm1 rm1Var, l13 l13Var, fe0 fe0Var, int i) {
        int i2;
        rm1 rm1Var2;
        byte b2;
        l13 l13Var2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1239227056);
        if ((i & 6) == 0) {
            i2 = i | (go1Var.i(rm1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (go1Var.T(i3 & 1, (i3 & 19) != 18)) {
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = ad4.w(Boolean.FALSE);
                go1Var.o0(Q);
            }
            t43 t43Var = (t43) Q;
            Object Q2 = go1Var.Q();
            if (Q2 == jpVar) {
                Q2 = r7.v(go1Var);
            }
            t33 t33Var = (t33) Q2;
            t43 w = ut0.w(t33Var, go1Var);
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            cw4 t0 = p70.t0(((Boolean) t43Var.getValue()).booleanValue(), ((fw2) go1Var.k(i51Var)).a.H, k80Var.w, ((Boolean) w.getValue()).booleanValue(), "danmaku_block_delete_bg", go1Var, 24576, 0);
            cw4 s0 = p70.s0(((Boolean) t43Var.getValue()).booleanValue(), k80Var.q, k80Var.x, "danmaku_block_delete_fg", go1Var, 3072);
            i13 i13Var = i13.a;
            l13 g2 = nq4.g(i13Var, 36.0f);
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                Q3 = new uf(t43Var, (byte) 11);
                go1Var.o0(Q3);
            }
            l13 d2 = r13.d(r7.u(10.0f, i42.A0(g2, (tm1) Q3), t0), null, null, null, null, rm1Var, null, null, null, null, null, null, t33Var, 130815);
            rm1Var2 = rm1Var;
            l13 E0 = i42.E0(mw2.B(d2, false, t33Var, 1), 12.0f, 0.0f, 2);
            go1Var = go1Var;
            u74 a2 = t74.a(i42.e, q8.T, go1Var, 54);
            long j = go1Var.T;
            int i4 = (int) (j ^ (j >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, E0);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, a2);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i4));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            ow1.a(d4.y(), null, p70.G(nq4.k(i13Var, 16.0f), s0, k80Var.q, false, null, 12), k80Var.q, go1Var, 48);
            oh4.a(go1Var, nq4.n(i13Var, 6.0f));
            b2 = 0;
            r55.b("删除", p70.G(i13Var, s0, k80Var.q, false, null, 12), k80Var.q, oh4.j(13), qk1.N, 0L, null, 0L, 0, false, 0, 0, null, go1Var, 1597446, 0, 262056);
            go1Var.q(true);
            l13Var2 = i13Var;
        } else {
            rm1Var2 = rm1Var;
            b2 = 0;
            go1Var.W();
            l13Var2 = l13Var;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new jo0(rm1Var2, l13Var2, i, b2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(boolean r18, java.util.List r19, defpackage.tm1 r20, defpackage.tm1 r21, defpackage.tm1 r22, defpackage.rm1 r23, defpackage.fe0 r24, int r25) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a5.g(boolean, java.util.List, tm1, tm1, tm1, rm1, fe0, int):void");
    }

    public static final void h(String str, hx1 hx1Var, boolean z, rm1 rm1Var, l13 l13Var, fe0 fe0Var, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        l13 l13Var2;
        boolean z3;
        t33 t33Var;
        long j;
        go1 go1Var;
        boolean z4;
        rm1 rm1Var2;
        boolean z5;
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(176658456);
        if ((i & 6) == 0) {
            i3 = i | (go1Var2.g(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i3 | (go1Var2.g(hx1Var) ? 32 : 16);
        int i6 = i2 & 4;
        if (i6 != 0) {
            i4 = i5 | RendererCapabilities.DECODER_SUPPORT_MASK;
            z2 = z;
        } else {
            z2 = z;
            i4 = i5 | (go1Var2.h(z2) ? 256 : 128);
        }
        int i7 = i4 | (go1Var2.i(rm1Var) ? 2048 : 1024) | 24576;
        if (go1Var2.T(i7 & 1, (i7 & 9363) != 9362)) {
            if (i6 != 0) {
                z2 = true;
            }
            Object Q = go1Var2.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = ad4.w(Boolean.FALSE);
                go1Var2.o0(Q);
            }
            t43 t43Var = (t43) Q;
            Object Q2 = go1Var2.Q();
            if (Q2 == jpVar) {
                Q2 = r7.v(go1Var2);
            }
            t33 t33Var2 = (t33) Q2;
            t43 w = ut0.w(t33Var2, go1Var2);
            k80 k80Var = ((fw2) go1Var2.k(lw2.b)).a;
            if (z2) {
                t33Var = t33Var2;
                j = k80Var.d;
            } else {
                t33Var = t33Var2;
                j = k80Var.s;
            }
            long j2 = j;
            boolean booleanValue = ((Boolean) t43Var.getValue()).booleanValue();
            long j3 = z2 ? k80Var.c : k80Var.H;
            long j4 = k80Var.u;
            if (((Boolean) w.getValue()).booleanValue() && z2) {
                go1Var = go1Var2;
                z4 = true;
            } else {
                go1Var = go1Var2;
                z4 = false;
            }
            boolean z6 = z2;
            cw4 t0 = p70.t0(booleanValue, j3, j4, z4, "danmaku_block_btn_bg", go1Var, 24576, 0);
            go1 go1Var3 = go1Var;
            cw4 s0 = p70.s0(((Boolean) t43Var.getValue()).booleanValue(), j2, k80Var.v, "danmaku_block_btn_fg", go1Var3, 3072);
            i13 i13Var = i13.a;
            l13 g2 = nq4.g(i13Var, 44.0f);
            Object Q3 = go1Var3.Q();
            byte b2 = 13;
            if (Q3 == jpVar) {
                Q3 = new uf(t43Var, b2);
                go1Var3.o0(Q3);
            }
            l13 u = r7.u(12.0f, i42.A0(g2, (tm1) Q3), t0);
            if (z6) {
                go1Var3.d0(1498493469);
                boolean z7 = (i7 & 7168) == 2048;
                Object Q4 = go1Var3.Q();
                if (z7 || Q4 == jpVar) {
                    z5 = false;
                    Q4 = new mo0(rm1Var, (byte) 0);
                    go1Var3.o0(Q4);
                } else {
                    z5 = false;
                }
                rm1Var2 = (rm1) Q4;
                go1Var3.q(z5);
            } else {
                go1Var3.d0(1498513029);
                go1Var3.q(false);
                rm1Var2 = null;
            }
            l13 E0 = i42.E0(mw2.A(r13.d(u, null, null, null, null, rm1Var2, null, null, null, null, null, null, t33Var, 130815), z6, t33Var), 16.0f, 0.0f, 2);
            uw2 c2 = px.c(q8.N, false);
            long j5 = go1Var3.T;
            int i8 = (int) (j5 ^ (j5 >>> 32));
            am3 m = go1Var3.m();
            l13 x0 = i42.x0(go1Var3, E0);
            xd0.c.getClass();
            go1Var3.h0();
            boolean z8 = go1Var3.S;
            df0 df0Var = wa2.A0;
            if (z8) {
                go1Var3.l(df0Var);
            } else {
                go1Var3.r0();
            }
            sg sgVar = q8.c0;
            qi4.k(go1Var3, sgVar, c2);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var3, sgVar2, m);
            Integer valueOf = Integer.valueOf(i8);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var3, sgVar3, valueOf);
            qi4.j(go1Var3);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var3, sgVar4, x0);
            u74 a2 = t74.a(i42.b, q8.T, go1Var3, 48);
            long j6 = go1Var3.T;
            int i9 = (int) (j6 ^ (j6 >>> 32));
            am3 m2 = go1Var3.m();
            l13 x02 = i42.x0(go1Var3, i13Var);
            go1Var3.h0();
            if (go1Var3.S) {
                go1Var3.l(df0Var);
            } else {
                go1Var3.r0();
            }
            qi4.k(go1Var3, sgVar, a2);
            qi4.k(go1Var3, sgVar2, m2);
            r7.G(i9, go1Var3, sgVar3, go1Var3);
            qi4.k(go1Var3, sgVar4, x02);
            ow1.a(hx1Var, null, p70.G(nq4.k(i13Var, 18.0f), s0, j2, false, null, 12), j2, go1Var3, ((i7 >> 3) & 14) | 48);
            oh4.a(go1Var3, nq4.n(i13Var, 6.0f));
            r55.b(str, p70.G(i13Var, s0, j2, false, null, 12), j2, oh4.j(13), qk1.N, 0L, null, 0L, 0, false, 0, 0, null, go1Var3, (i7 & 14) | 1597440, 0, 262056);
            go1Var2 = go1Var3;
            go1Var2.q(true);
            go1Var2.q(true);
            z3 = z6;
            l13Var2 = i13Var;
        } else {
            go1Var2.W();
            l13Var2 = l13Var;
            z3 = z2;
        }
        x04 u2 = go1Var2.u();
        if (u2 != null) {
            u2.d = new no0(str, hx1Var, z3, rm1Var, l13Var2, i, i2);
        }
    }

    public static final void i(l13 l13Var, float f2, long j, fe0 fe0Var, int i, int i2) {
        int i3;
        l13 l13Var2;
        float f3;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(75144485);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (go1Var.g(l13Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i3 | 48 | (go1Var.f(j) ? 256 : 128);
        boolean z = true;
        if (go1Var.T(i5 & 1, (i5 & 147) != 146)) {
            go1Var.Y();
            if ((i & 1) == 0 || go1Var.C()) {
                l13Var2 = i4 != 0 ? i13.a : l13Var;
                f3 = ny0.a;
            } else {
                go1Var.W();
                l13Var2 = l13Var;
                f3 = f2;
            }
            go1Var.r();
            l13 g2 = nq4.g(nq4.e(l13Var2, 1.0f), f3);
            if ((((i5 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) <= 256 || !go1Var.f(j)) && (i5 & RendererCapabilities.DECODER_SUPPORT_MASK) != 256) {
                z = false;
            }
            Object Q = go1Var.Q();
            if (z || Q == de0.a) {
                Q = new oy0(f3, j, (byte) 0);
                go1Var.o0(Q);
            }
            p70.j(0, go1Var, (tm1) Q, g2);
        } else {
            go1Var.W();
            l13Var2 = l13Var;
            f3 = f2;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new kn(l13Var2, f3, j, i, i2, (byte) 1);
        }
    }

    public static final void j(final l13 l13Var, float f2, final long j, fe0 fe0Var, final int i) {
        final float f3;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1534852205);
        int i2 = i | 48 | (go1Var.f(j) ? 256 : 128);
        if (go1Var.T(i2 & 1, (i2 & 147) != 146)) {
            go1Var.Y();
            if ((i & 1) == 0 || go1Var.C()) {
                f3 = ny0.a;
            } else {
                go1Var.W();
                f3 = f2;
            }
            go1Var.r();
            l13 n = nq4.n(nq4.b(l13Var, 1.0f), f3);
            boolean z = (((i2 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && go1Var.f(j)) || (i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256;
            Object Q = go1Var.Q();
            if (z || Q == de0.a) {
                Q = new oy0(f3, j, (byte) 1);
                go1Var.o0(Q);
            }
            p70.j(0, go1Var, (tm1) Q, n);
        } else {
            go1Var.W();
            f3 = f2;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1(f3, j, i) { // from class: py0
                public final /* synthetic */ float J;
                public final /* synthetic */ long K;

                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X = mu0.X(7);
                    a5.j(l13.this, this.J, this.K, (fe0) obj, X);
                    return wd5.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0282  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x017e -> B:17:0x018f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final defpackage.ha5 r22, final android.widget.RemoteViews r23, defpackage.lq1 r24, final defpackage.n12 r25) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a5.k(ha5, android.widget.RemoteViews, lq1, n12):void");
    }

    public static final void l(RemoteViews remoteViews, dt1 dt1Var, int i) {
        ex0 ex0Var = dt1Var.a;
        int i2 = Build.VERSION.SDK_INT;
        bx0 bx0Var = bx0.a;
        dx0 dx0Var = dx0.a;
        if (i2 >= 31) {
            if (i2 >= 33 || !p70.k0(dx0Var, bx0Var).contains(ex0Var)) {
                ub.u(remoteViews, i, ex0Var);
                return;
            }
            return;
        }
        List k0 = p70.k0(dx0Var, cx0.a, bx0Var);
        Map map = mc2.a;
        if (k0.contains(ex0Var)) {
            return;
        }
        hn3.h(ex0Var, " requires a complex layout before API 31", "Using a height of ");
    }

    public static final void m(RemoteViews remoteViews, yt5 yt5Var, int i) {
        ex0 ex0Var = yt5Var.a;
        int i2 = Build.VERSION.SDK_INT;
        bx0 bx0Var = bx0.a;
        dx0 dx0Var = dx0.a;
        if (i2 >= 31) {
            if (i2 >= 33 || !p70.k0(dx0Var, bx0Var).contains(ex0Var)) {
                ub.v(remoteViews, i, ex0Var);
                return;
            }
            return;
        }
        List k0 = p70.k0(dx0Var, cx0.a, bx0Var);
        Map map = mc2.a;
        if (k0.contains(ex0Var)) {
            return;
        }
        hn3.h(ex0Var, " requires a complex layout before API 31", "Using a width of ");
    }

    public static final List n(sr4 sr4Var) {
        boolean z = sr4Var.f;
        int[] iArr = sr4Var.b;
        if (z || sr4Var.c == 0) {
            return o91.I;
        }
        m04 m04Var = new m04(sr4Var);
        int i = sr4Var.i;
        Object valueOf = Integer.valueOf(sr4Var.l - vr4.d(i, iArr));
        while (i >= 0) {
            m04Var.m(sr4Var.i(i), sr4Var.k(i) ? sr4Var.p(i, iArr) : de0.a, sr4Var.a.m(i), valueOf);
            valueOf = sr4Var.a(i);
            i = sr4Var.q(i);
        }
        return (ArrayList) m04Var.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [d1, m04] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [bo1] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List o(wr4 wr4Var, Integer num, int i, Integer num2) {
        int i2;
        int r;
        e43 e43Var;
        if (wr4Var.w || wr4Var.o() == 0) {
            return o91.I;
        }
        ?? m04Var = new m04(wr4Var);
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = wr4Var.v;
            if (i2 < 0) {
                i2 = wr4Var.F(i, wr4Var.b);
            }
        }
        if (num == 0) {
            int O = wr4Var.i - wr4Var.O(wr4Var.q(i), wr4Var.b);
            q33 q33Var = wr4Var.s;
            num = Integer.valueOf(O + ((q33Var == null || (e43Var = (e43) q33Var.b(i)) == null) ? 0 : e43Var.b));
        }
        int q = wr4Var.q(i) * 5;
        int[] iArr = wr4Var.b;
        if (q < iArr.length) {
            r = wr4Var.r(i);
        } else {
            int F = i2 >= 0 ? wr4Var.F(i2, iArr) : i2;
            r = wr4Var.r(i2);
            int i3 = i2;
            i2 = F;
            i = i3;
        }
        while (i >= 0) {
            m04Var.m(r, (wr4Var.b[(wr4Var.q(i) * 5) + 1] & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? wr4Var.s(i) : de0.a, wr4Var.P(i), num);
            num = wr4Var.b(i);
            if (i2 >= 0) {
                int F2 = wr4Var.F(i2, wr4Var.b);
                r = wr4Var.r(i2);
                int i4 = i2;
                i2 = F2;
                i = i4;
            } else {
                i = i2;
            }
        }
        return (ArrayList) m04Var.b;
    }

    public static List p(wr4 wr4Var) {
        return o(wr4Var, null, wr4Var.t, null);
    }

    public static char q(long j) {
        char c2 = (char) j;
        sp0.q(((long) c2) == j, "Out of range: %s", j);
        return c2;
    }

    public static boolean r(char[] cArr, char c2) {
        for (char c3 : cArr) {
            if (c3 == c2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x03aa, code lost:
    
        r1 = new android.animation.Animator[r10.size()];
        r2 = r10.size();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x03b5, code lost:
    
        if (r8 >= r2) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x03b7, code lost:
    
        r3 = r10.get(r8);
        r8 = r8 + 1;
        r1[r11] = (android.animation.Animator) r3;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x03c5, code lost:
    
        if (r32 != 0) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x03c7, code lost:
    
        r31.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x03ca, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x03cb, code lost:
    
        r31.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x03ce, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x03a6, code lost:
    
        if (r31 == null) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x03a8, code lost:
    
        if (r10 == null) goto L213;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x037e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0382  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.Animator s(android.content.Context r26, android.content.res.Resources r27, android.content.res.Resources.Theme r28, org.xmlpull.v1.XmlPullParser r29, android.util.AttributeSet r30, android.animation.AnimatorSet r31, int r32) {
        /*
            Method dump skipped, instructions count: 975
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a5.s(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public static StaticLayout t(CharSequence charSequence, Layout.Alignment alignment, int i, int i2, TextView textView, TextPaint textPaint, wm wmVar) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Log.LOG_LEVEL_OFF;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            wmVar.a(obtain, textView);
        } catch (ClassCastException unused) {
            android.util.Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    public static boolean u(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            z = u(file2) && z;
        }
        return z;
    }

    public static void v(Context context, ep epVar) {
        int i = Build.VERSION.SDK_INT;
        if (u(i >= 34 ? g7.d(context).getCacheDir() : i >= 24 ? g7.d(context).getCodeCacheDir() : i == 23 ? context.getCodeCacheDir() : context.getCacheDir())) {
            epVar.e(14, null);
        } else {
            epVar.e(15, null);
        }
    }

    public static final Integer w(tr4 tr4Var, re0 re0Var) {
        sr4 h = tr4Var.h();
        try {
            return x(h, re0Var, 0, h.c);
        } finally {
            h.c();
        }
    }

    public static final Integer x(sr4 sr4Var, re0 re0Var, int i, int i2) {
        Integer x;
        int[] iArr = sr4Var.b;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (sr4Var.j(i) && sr4Var.i(i) == 206 && j42.c(sr4Var.p(i, iArr), ke0.e)) {
                Object h = sr4Var.h(i, 0);
                lo1 lo1Var = h instanceof lo1 ? (lo1) h : null;
                Object obj = lo1Var != null ? lo1Var.a : null;
                do1 do1Var = obj instanceof do1 ? (do1) obj : null;
                if (do1Var != null && do1Var.I == re0Var) {
                    return Integer.valueOf(i);
                }
            }
            if (sr4Var.d(i) && (x = x(sr4Var, re0Var, i + 1, i3)) != null) {
                return Integer.valueOf(x.intValue());
            }
            i = i3;
        }
    }

    public static char y(byte b2, byte b3) {
        return (char) ((b2 << 8) | (b3 & 255));
    }

    public static b10 z(int i) {
        bm1 bm1Var = bm1.k;
        float J = j16.J((i >> 16) & 255);
        float J2 = j16.J((i >> 8) & 255);
        float J3 = j16.J(i & 255);
        double[][] dArr = j16.r;
        double d2 = J;
        double[] dArr2 = dArr[0];
        double d3 = J2;
        double d4 = J3;
        double d5 = (dArr2[2] * d4) + (dArr2[1] * d3) + (dArr2[0] * d2);
        double[] dArr3 = dArr[1];
        double d6 = (dArr3[2] * d4) + (dArr3[1] * d3) + (dArr3[0] * d2);
        double[] dArr4 = dArr[2];
        float[] fArr = {(float) d5, (float) d6, (float) ((d4 * dArr4[2]) + (d3 * dArr4[1]) + (d2 * dArr4[0]))};
        float[][] fArr2 = j16.o;
        float f2 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f3 = fArr3[0] * f2;
        float f4 = fArr[1];
        float f5 = (fArr3[1] * f4) + f3;
        float f6 = fArr[2];
        float f7 = (fArr3[2] * f6) + f5;
        float[] fArr4 = fArr2[1];
        float f8 = (fArr4[2] * f6) + (fArr4[1] * f4) + (fArr4[0] * f2);
        float[] fArr5 = fArr2[2];
        float f9 = (f6 * fArr5[2]) + (f4 * fArr5[1]) + (f2 * fArr5[0]);
        float[] fArr6 = bm1Var.g;
        float f10 = bm1Var.e;
        float f11 = bm1Var.b;
        float f12 = fArr6[0] * f7;
        float f13 = fArr6[1] * f8;
        float f14 = fArr6[2] * f9;
        float f15 = bm1Var.h;
        float pow = (float) Math.pow((Math.abs(f12) * f15) / 100.0f, 0.41999998688697815d);
        float pow2 = (float) Math.pow((Math.abs(f13) * f15) / 100.0f, 0.41999998688697815d);
        float pow3 = (float) Math.pow((Math.abs(f14) * f15) / 100.0f, 0.41999998688697815d);
        float signum = ((Math.signum(f12) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f13) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f14) * 400.0f) * pow3) / (pow3 + 27.13f);
        float f16 = ((((-12.0f) * signum2) + (signum * 11.0f)) + signum3) / 11.0f;
        float f17 = ((signum + signum2) - (signum3 * 2.0f)) / 9.0f;
        float f18 = signum2 * 20.0f;
        float f19 = ((21.0f * signum3) + ((signum * 20.0f) + f18)) / 20.0f;
        float f20 = (((signum * 40.0f) + f18) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f17, f16)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f21 = atan2;
        float f22 = (f21 * 3.1415927f) / 180.0f;
        float pow4 = ((float) Math.pow((f20 * bm1Var.c) / f11, bm1Var.j * f10)) * 100.0f;
        float pow5 = ((float) Math.pow(((((((((float) Math.cos((((((double) f21) < 20.14d ? 360.0f + f21 : f21) * 3.1415927f) / 180.0f) + 2.0f)) + 3.8f) * 0.25f) * 3846.1538f) * bm1Var.f) * bm1Var.d) * ((float) Math.sqrt((f17 * f17) + (f16 * f16)))) / (f19 + 0.305f), 0.8999999761581421d)) * ((float) Math.pow(1.64f - ((float) Math.pow(0.28999999165534973d, bm1Var.a)), 0.7300000190734863d)) * ((float) Math.sqrt(pow4 / 100.0f));
        float f23 = bm1Var.i * pow5;
        Math.sqrt((r2 * f10) / (f11 + 4.0f));
        float f24 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f23 * 0.0228f) + 1.0f)) * 43.85965f;
        double d7 = f22;
        return new b10(f21, pow5, pow4, f24, log * ((float) Math.cos(d7)), log * ((float) Math.sin(d7)));
    }
}

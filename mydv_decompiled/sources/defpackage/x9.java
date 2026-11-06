package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.media.tv.TvContract;
import android.os.Build;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.Window;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.media3.extractor.ts.TsExtractor;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class x9 {
    public static void A(ViewStructure viewStructure, int i) {
        viewStructure.setAutofillType(i);
    }

    public static void B(ViewStructure viewStructure, AutofillValue autofillValue) {
        viewStructure.setAutofillValue(autofillValue);
    }

    public static void C(Notification.Builder builder, int i) {
        builder.setBadgeIconType(i);
    }

    public static void D(Notification.Builder builder, boolean z) {
        builder.setColorized(z);
    }

    public static void E(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void F(ViewStructure viewStructure, boolean z) {
        viewStructure.setDataIsSensitive(z);
    }

    public static void G(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static void H(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void I(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void J(ViewStructure viewStructure) {
        viewStructure.setInputType(TsExtractor.TS_STREAM_TYPE_AC3);
    }

    public static void K(MenuItem menuItem, char c, int i) {
        menuItem.setNumericShortcut(c, i);
    }

    public static void L(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void M(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static void N(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    public static void O(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    public static void P(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }

    public static void Q(Context context, Intent intent) {
        context.startForegroundService(intent);
    }

    public static void R(Context context, Intent intent) {
        context.startForegroundService(intent);
    }

    public static CharSequence S(AutofillValue autofillValue) {
        return autofillValue.getTextValue();
    }

    public static int a(ViewStructure viewStructure) {
        return viewStructure.addChildCount(1);
    }

    public static boolean b(Canvas canvas, Path path) {
        return canvas.clipOutPath(path);
    }

    public static boolean c(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.clipOutRect(f, f2, f3, f4);
    }

    public static boolean d(Canvas canvas, int i, int i2, int i3, int i4) {
        return canvas.clipOutRect(i, i2, i3, i4);
    }

    public static boolean e(Canvas canvas, Rect rect) {
        return canvas.clipOutRect(rect);
    }

    public static boolean f(Canvas canvas, RectF rectF) {
        return canvas.clipOutRect(rectF);
    }

    public static Notification.Builder g(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static final vc h(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new vc(AutofillValue.forText(g4.d0(charSequence)));
        }
        return null;
    }

    public static Icon i(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static void j(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        i = configuration.colorMode;
        int i7 = i & 3;
        i2 = configuration2.colorMode;
        int i8 = i2 & 3;
        if (i7 != i8) {
            i6 = configuration3.colorMode;
            configuration3.colorMode = i6 | i8;
        }
        i3 = configuration.colorMode;
        int i9 = i3 & 12;
        i4 = configuration2.colorMode;
        int i10 = i4 & 12;
        if (i9 != i10) {
            i5 = configuration3.colorMode;
            configuration3.colorMode = i5 | i10;
        }
    }

    public static AutofillValue k(String str) {
        return AutofillValue.forText(g4.d0(str));
    }

    public static AutofillValue l(boolean z) {
        return AutofillValue.forToggle(z);
    }

    public static float[] m(ColorMatrixColorFilter colorMatrixColorFilter) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrixColorFilter.getColorMatrix(colorMatrix);
        return colorMatrix.getArray();
    }

    public static float n(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static TextClassifier o(TextView textView) {
        TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public static float p(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static ViewStructure q(ViewStructure viewStructure, int i) {
        return viewStructure.newChild(i);
    }

    public static void r(Window.Callback callback, boolean z) {
        callback.onPointerCaptureChanged(z);
    }

    public static final void s(v9 v9Var, SparseArray sparseArray) {
        es esVar = v9Var.b;
        if (esVar.a.isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            AutofillValue e = j0.e(sparseArray.get(keyAt));
            if (e.isText()) {
                e.getTextValue().toString();
                if (esVar.a.get(Integer.valueOf(keyAt)) != null) {
                    zl1.c();
                    return;
                }
            } else {
                if (e.isDate()) {
                    throw new ab3("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (e.isList()) {
                    throw new ab3("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (e.isToggle()) {
                    throw new ab3("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static final void t(v9 v9Var, ViewStructure viewStructure) {
        es esVar = v9Var.b;
        if (esVar.a.isEmpty()) {
            return;
        }
        int addChildCount = viewStructure.addChildCount(esVar.a.size());
        Iterator it = esVar.a.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int intValue = ((Number) entry.getKey()).intValue();
            if (entry.getValue() != null) {
                zl1.c();
                return;
            }
            ViewStructure newChild = viewStructure.newChild(addChildCount);
            z(newChild, v9Var.c, intValue);
            newChild.setId(intValue, v9Var.a.getContext().getPackageName(), null, null);
            A(newChild, 1);
            throw null;
        }
    }

    public static Intent u(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        return (i & 4) != 0 ? context.registerReceiver(broadcastReceiver, intentFilter, z9.e(context), null) : context.registerReceiver(broadcastReceiver, intentFilter, null, null, 0);
    }

    public static void v(Context context, long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            TvContract.requestChannelBrowsable(context, j);
        }
    }

    public static void w(Context context, TextClassification textClassification) {
        String text = textClassification.getText();
        PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
        if (Build.VERSION.SDK_INT >= 34) {
            z4.o(activity);
        } else {
            activity.send();
        }
    }

    public static void x(MenuItem menuItem, char c, int i) {
        menuItem.setAlphabeticShortcut(c, i);
    }

    public static void y(ViewStructure viewStructure, String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    public static void z(ViewStructure viewStructure, AutofillId autofillId, int i) {
        viewStructure.setAutofillId(autofillId, i);
    }
}

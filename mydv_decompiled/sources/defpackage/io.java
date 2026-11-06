package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;
import android.os.Trace;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.widget.PopupWindow;
import androidx.work.impl.foreground.SystemForegroundService;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class io {
    public static void a() {
        Trace.beginAsyncSection("GlanceAppWidget::update", 0);
    }

    public static void b(View view, Rect rect, Rect rect2) {
        Insets systemWindowInsets = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
        rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
    }

    public static void c(Canvas canvas) {
        canvas.disableZ();
    }

    public static void d(Canvas canvas, int i, BlendMode blendMode) {
        canvas.drawColor(i, blendMode);
    }

    public static void e(Canvas canvas, long j) {
        canvas.drawColor(j);
    }

    public static void f(Canvas canvas, long j, BlendMode blendMode) {
        canvas.drawColor(j, blendMode);
    }

    public static void g(Canvas canvas, RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
    }

    public static void h(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public static void i(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public static void j(Canvas canvas, MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        canvas.drawTextRun(measuredText, i, i2, i3, i4, f, f2, z, paint);
    }

    public static void k(Canvas canvas) {
        canvas.enableZ();
    }

    public static void l(Canvas canvas, boolean z) {
        if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }

    public static void m() {
        Trace.endAsyncSection("GlanceAppWidget::update", 0);
    }

    public static String n(Context context) {
        return context.getOpPackageName();
    }

    public static final void o(Paint paint, CharSequence charSequence, int i, int i2, Rect rect) {
        paint.getTextBounds(charSequence, i, i2, rect);
    }

    public static void p(Resources.Theme theme) {
        theme.rebase();
    }

    public static void q(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static void r(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void s(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    public static void t(wl wlVar, Rect rect) {
        wlVar.setEpicenterBounds(rect);
    }

    public static void u(wl wlVar) {
        wlVar.setIsClippedToScreen(true);
    }

    public static void v(PopupWindow popupWindow) {
        popupWindow.setTouchModal(false);
    }

    public static void w(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        systemForegroundService.startForeground(i, notification, i2);
    }

    public static void x(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        try {
            systemForegroundService.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            fr2 e2 = fr2.e();
            String str = SystemForegroundService.M;
            if (e2.b <= 5) {
                Log.w(str, "Unable to start foreground service", e);
            }
        } catch (SecurityException e3) {
            fr2 e4 = fr2.e();
            String str2 = SystemForegroundService.M;
            if (e4.b <= 5) {
                Log.w(str2, "Unable to start foreground service", e3);
            }
        }
    }

    public static long y(MotionEvent motionEvent, int i) {
        float rawX = motionEvent.getRawX(i);
        float rawY = motionEvent.getRawY(i);
        return (Float.floatToRawIntBits(rawY) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32);
    }
}

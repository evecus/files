package defpackage;

import android.app.Notification;
import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.fonts.Font;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Looper;
import android.os.StrictMode;
import android.util.LongSparseArray;
import android.util.SizeF;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.RoundedCorner;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.widget.EdgeEffect;
import android.widget.RemoteViews;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class ub {
    public static void a(RemoteViews remoteViews, int i, RemoteViews remoteViews2, int i2) {
        remoteViews.addStableView(i, remoteViews2, i2);
    }

    public static void b(RemoteViews remoteViews, int i, ex0 ex0Var) {
        if (Build.VERSION.SDK_INT < 31) {
            s83.h("setClipToOutline is only available on SDK 31 and higher");
            return;
        }
        remoteViews.setBoolean(i, "setClipToOutline", true);
        if (ex0Var instanceof ax0) {
            remoteViews.setViewOutlinePreferredRadius(i, ((ax0) ex0Var).a, 1);
        } else {
            s83.x(ex0Var.getClass().getCanonicalName(), "Rounded corners should not be ");
        }
    }

    public static int[] c(NetworkRequest networkRequest) {
        networkRequest.getClass();
        int[] capabilities = networkRequest.getCapabilities();
        capabilities.getClass();
        return capabilities;
    }

    public static EdgeEffect d(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static RemoteViews e(Map map) {
        return new RemoteViews((Map<SizeF, RemoteViews>) map);
    }

    public static void f(wb wbVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        vi4 vi4Var;
        si4 si4Var;
        tm1 tm1Var;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long keyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(keyAt);
            if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (vi4Var = (vi4) wbVar.c().b((int) keyAt)) != null && (si4Var = vi4Var.a) != null) {
                Object g = si4Var.d.I.g(ii4.l);
                if (g == null) {
                    g = null;
                }
                v4 v4Var = (v4) g;
                if (v4Var != null && (tm1Var = (tm1) v4Var.b) != null) {
                }
            }
        }
    }

    public static void g(Canvas canvas, int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
    }

    public static void h(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public static void i(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }

    public static Path j(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    public static float k(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static Shader.TileMode l() {
        return Shader.TileMode.DECAL;
    }

    public static j74 m(Display display, int i) {
        RoundedCorner roundedCorner;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        s83.t(hf1.u(position, "Invalid position: "));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new j74(i2, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    public static int n(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        String str = SystemJobService.M;
        switch (stopReason) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return stopReason;
            default:
                return -512;
        }
    }

    public static void o(wb wbVar, long[] jArr, Consumer consumer) {
        si4 si4Var;
        for (long j : jArr) {
            vi4 vi4Var = (vi4) wbVar.c().b((int) j);
            if (vi4Var != null && (si4Var = vi4Var.a) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(wbVar.I.getAutofillId(), si4Var.f);
                Object g = si4Var.d.I.g(zi4.C);
                if (g == null) {
                    g = null;
                }
                List list = (List) g;
                if (list != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new oj(dl2.a(list, "\n", null, 62))));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    public static float p(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static void q(wb wbVar, LongSparseArray longSparseArray) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (j42.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            f(wbVar, longSparseArray);
        } else {
            wbVar.I.post(new h8(wbVar, longSparseArray, (byte) 1));
        }
    }

    public static StrictMode.VmPolicy.Builder r(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }

    public static RemoteViews s(int i, int i2, String str) {
        return new RemoteViews(str, i, i2);
    }

    public static void t(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    public static void u(RemoteViews remoteViews, int i, ex0 ex0Var) {
        if (ex0Var instanceof dx0) {
            remoteViews.setViewLayoutHeight(i, -2.0f, 0);
            return;
        }
        if (ex0Var instanceof bx0) {
            remoteViews.setViewLayoutHeight(i, 0.0f, 0);
            return;
        }
        if (ex0Var instanceof ax0) {
            remoteViews.setViewLayoutHeight(i, ((ax0) ex0Var).a, 1);
        } else if (ex0Var.equals(cx0.a)) {
            remoteViews.setViewLayoutHeight(i, -1.0f, 0);
        } else {
            s83.v();
        }
    }

    public static void v(RemoteViews remoteViews, int i, ex0 ex0Var) {
        if (ex0Var instanceof dx0) {
            remoteViews.setViewLayoutWidth(i, -2.0f, 0);
            return;
        }
        if (ex0Var instanceof bx0) {
            remoteViews.setViewLayoutWidth(i, 0.0f, 0);
            return;
        }
        if (ex0Var instanceof ax0) {
            remoteViews.setViewLayoutWidth(i, ((ax0) ex0Var).a, 1);
        } else if (ex0Var.equals(cx0.a)) {
            remoteViews.setViewLayoutWidth(i, -1.0f, 0);
        } else {
            s83.v();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String w(defpackage.ok1 r5, android.content.Context r6) {
        /*
            java.util.List r5 = r5.a
            nu0 r0 = defpackage.qb.m(r6)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r3 = 31
            if (r1 < r3) goto L1e
            android.content.res.Resources r1 = r6.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = defpackage.y9.a(r1)
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r4) goto L20
        L1e:
            r6 = r2
            goto L2c
        L20:
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = defpackage.y9.a(r6)
        L2c:
            r1 = 0
            if (r6 != 0) goto L39
            do2 r6 = new do2
            r6.<init>(r0)
            java.lang.String r5 = defpackage.dl2.a(r5, r1, r6, r3)
            return r5
        L39:
            int r0 = r5.size()
            if (r0 > 0) goto L6b
            r0 = 1137180672(0x43c80000, float:400.0)
            float r6 = (float) r6
            float r6 = r6 + r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r6 = defpackage.ut0.q(r6, r0, r1)
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L54
            java.lang.String r5 = ","
            goto L56
        L54:
            java.lang.String r5 = ""
        L56:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = "'wght' "
            r0.append(r5)
            r0.append(r6)
            java.lang.String r5 = r0.toString()
            return r5
        L6b:
            java.lang.Object r5 = r5.get(r2)
            r5.getClass()
            defpackage.zl1.c()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ub.w(ok1, android.content.Context):java.lang.String");
    }

    public static int[] x(NetworkRequest networkRequest) {
        networkRequest.getClass();
        int[] transportTypes = networkRequest.getTransportTypes();
        transportTypes.getClass();
        return transportTypes;
    }
}

package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.graphics.ColorSpace;
import android.graphics.RectF;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import android.util.Log;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import android.widget.TextView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class z4 {
    public static final void a(CursorAnchorInfo.Builder builder, u55 u55Var, m14 m14Var) {
        if (m14Var.f()) {
            return;
        }
        w23 w23Var = u55Var.b;
        int i = w23Var.f - 1;
        if (i < 0) {
            i = 0;
        }
        int r = ut0.r(w23Var.e(m14Var.b), 0, i);
        int r2 = ut0.r(w23Var.e(m14Var.d), 0, i);
        if (r > r2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(u55Var.f(r), w23Var.f(r), u55Var.g(r), w23Var.b(r));
            if (r == r2) {
                return;
            } else {
                r++;
            }
        }
    }

    public static final void b(CursorAnchorInfo.Builder builder, u55 u55Var, m14 m14Var) {
        if (m14Var.f()) {
            return;
        }
        w23 w23Var = u55Var.b;
        int i = w23Var.f - 1;
        if (i < 0) {
            i = 0;
        }
        int r = ut0.r(w23Var.e(m14Var.b), 0, i);
        int r2 = ut0.r(w23Var.e(m14Var.d), 0, i);
        if (r > r2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(u55Var.f(r), w23Var.f(r), u55Var.g(r), w23Var.b(r));
            if (r == r2) {
                return;
            } else {
                r++;
            }
        }
    }

    public static int c(HandwritingGesture handwritingGesture, tf2 tf2Var) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        tf2Var.invoke(new eb0(fallbackText, 1));
        return 5;
    }

    public static JobScheduler d(JobScheduler jobScheduler) {
        JobScheduler forNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        forNamespace.getClass();
        return forNamespace;
    }

    public static float e(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    public static int[] f(s55 s55Var, RectF rectF, int i, final rd rdVar) {
        return s55Var.f.getRangeForRect(rectF, i == 1 ? new jk(new v05(s55Var.f.getText(), s55Var.l())) : new GraphemeClusterSegmentFinder(s55Var.f.getText(), s55Var.a), new Layout.TextInclusionStrategy() { // from class: hd
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) rd.this.invoke(rectF2, rectF3)).booleanValue();
            }
        });
    }

    public static float g(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingGestureLineMargin();
    }

    public static float h(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingSlop();
    }

    public static int i(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
    }

    public static int j(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
    }

    public static final ColorSpace k(v80 v80Var) {
        if (j42.c(v80Var, z80.v)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (j42.c(v80Var, z80.w)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }

    public static void l(long j, oj ojVar, boolean z, tf2 tf2Var) {
        if (z) {
            int i = d65.c;
            int i2 = (int) (j >> 32);
            int i3 = (int) (j & 4294967295L);
            int codePointBefore = i2 > 0 ? Character.codePointBefore(ojVar, i2) : 10;
            int codePointAt = i3 < ojVar.J.length() ? Character.codePointAt(ojVar, i3) : 10;
            if (e21.J(codePointBefore) && (e21.I(codePointAt) || e21.G(codePointAt))) {
                do {
                    i2 -= Character.charCount(codePointBefore);
                    if (i2 == 0) {
                        break;
                    } else {
                        codePointBefore = Character.codePointBefore(ojVar, i2);
                    }
                } while (e21.J(codePointBefore));
                j = ui4.c(i2, i3);
            } else if (e21.J(codePointAt) && (e21.I(codePointBefore) || e21.G(codePointBefore))) {
                do {
                    i3 += Character.charCount(codePointAt);
                    if (i3 == ojVar.J.length()) {
                        break;
                    } else {
                        codePointAt = Character.codePointAt(ojVar, i3);
                    }
                } while (e21.J(codePointAt));
                j = ui4.c(i2, i3);
            }
        }
        int i4 = (int) (4294967295L & j);
        tf2Var.invoke(new ss1(new c71[]{new uk4(i4, i4), new du0(d65.d(j), 0)}));
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m(defpackage.oh2 r16, android.view.inputmethod.HandwritingGesture r17, defpackage.u45 r18, defpackage.gr5 r19, defpackage.tf2 r20) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z4.m(oh2, android.view.inputmethod.HandwritingGesture, u45, gr5, tf2):int");
    }

    public static boolean n(oh2 oh2Var, PreviewableHandwritingGesture previewableHandwritingGesture, u45 u45Var, CancellationSignal cancellationSignal) {
        t55 t55Var;
        oj ojVar = oh2Var.j;
        if (ojVar != null) {
            v55 d = oh2Var.d();
            if (ojVar.equals((d == null || (t55Var = d.a.a) == null) ? null : t55Var.a)) {
                boolean z = previewableHandwritingGesture instanceof SelectGesture;
                ks1 ks1Var = ks1.I;
                byte b = 1;
                if (z) {
                    SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
                    if (u45Var != null) {
                        long A = e21.A(oh2Var, sp0.m0(selectGesture.getSelectionArea()), selectGesture.getGranularity() != 1 ? 0 : 1);
                        oh2 oh2Var2 = u45Var.d;
                        if (oh2Var2 != null) {
                            oh2Var2.f(A);
                        }
                        oh2 oh2Var3 = u45Var.d;
                        if (oh2Var3 != null) {
                            oh2Var3.e(d65.b);
                        }
                        if (!d65.c(A)) {
                            u45Var.u(false);
                            u45Var.r(ks1Var);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteGesture) {
                    DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
                    if (u45Var != null) {
                        long A2 = e21.A(oh2Var, sp0.m0(deleteGesture.getDeletionArea()), deleteGesture.getGranularity() != 1 ? 0 : 1);
                        oh2 oh2Var4 = u45Var.d;
                        if (oh2Var4 != null) {
                            oh2Var4.e(A2);
                        }
                        oh2 oh2Var5 = u45Var.d;
                        if (oh2Var5 != null) {
                            oh2Var5.f(d65.b);
                        }
                        if (!d65.c(A2)) {
                            u45Var.u(false);
                            u45Var.r(ks1Var);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
                    SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
                    if (u45Var != null) {
                        long B = e21.B(oh2Var, sp0.m0(selectRangeGesture.getSelectionStartArea()), sp0.m0(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() != 1 ? 0 : 1);
                        oh2 oh2Var6 = u45Var.d;
                        if (oh2Var6 != null) {
                            oh2Var6.f(B);
                        }
                        oh2 oh2Var7 = u45Var.d;
                        if (oh2Var7 != null) {
                            oh2Var7.e(d65.b);
                        }
                        if (!d65.c(B)) {
                            u45Var.u(false);
                            u45Var.r(ks1Var);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
                    if (u45Var != null) {
                        long B2 = e21.B(oh2Var, sp0.m0(deleteRangeGesture.getDeletionStartArea()), sp0.m0(deleteRangeGesture.getDeletionEndArea()), deleteRangeGesture.getGranularity() != 1 ? 0 : 1);
                        oh2 oh2Var8 = u45Var.d;
                        if (oh2Var8 != null) {
                            oh2Var8.e(B2);
                        }
                        oh2 oh2Var9 = u45Var.d;
                        if (oh2Var9 != null) {
                            oh2Var9.f(d65.b);
                        }
                        if (!d65.c(B2)) {
                            u45Var.u(false);
                            u45Var.r(ks1Var);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new ud0(u45Var, b));
                }
                return true;
            }
        }
        return false;
    }

    public static void o(PendingIntent pendingIntent) {
        try {
            ActivityOptions makeBasic = ActivityOptions.makeBasic();
            if (Build.VERSION.SDK_INT >= 36) {
                makeBasic.setPendingIntentBackgroundActivityStartMode(4);
            } else {
                makeBasic.setPendingIntentBackgroundActivityStartMode(1);
            }
            pendingIntent.send(makeBasic.toBundle());
        } catch (PendingIntent.CanceledException e) {
            Log.e("TextClassification", "error sending pendingIntent: " + pendingIntent + " error: " + e);
        }
    }

    public static void p(AccessibilityEvent accessibilityEvent, boolean z) {
        accessibilityEvent.setAccessibilityDataSensitive(z);
    }

    public static void q(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(p70.k0(SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class, JoinOrSplitGesture.class, InsertGesture.class, RemoveSpaceGesture.class));
        editorInfo.setSupportedHandwritingGesturePreviews(dq.p1(new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class}));
    }

    public static void r(TextView textView, int i, float f) {
        textView.setLineHeight(i, f);
    }
}

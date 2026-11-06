package defpackage;

import android.app.Notification;
import android.graphics.drawable.Icon;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class gc3 {
    public static void a(Notification.ProgressStyle progressStyle, int i) {
        progressStyle.setProgress(i);
    }

    public static void b(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressEndIcon(icon);
    }

    public static void c(Notification.ProgressStyle progressStyle, boolean z) {
        progressStyle.setProgressIndeterminate(z);
    }

    public static void d(Notification.ProgressStyle progressStyle, List<ic3> list) {
        Iterator<ic3> it = list.iterator();
        while (it.hasNext()) {
            progressStyle.addProgressPoint(i(it.next()));
        }
    }

    public static void e(Notification.ProgressStyle progressStyle, List<jc3> list) {
        Iterator<jc3> it = list.iterator();
        while (it.hasNext()) {
            progressStyle.addProgressSegment(j(it.next()));
        }
    }

    public static void f(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressStartIcon(icon);
    }

    public static void g(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressTrackerIcon(icon);
    }

    public static void h(Notification.ProgressStyle progressStyle, boolean z) {
        progressStyle.setStyledByProgress(z);
    }

    public static Notification.ProgressStyle.Point i(ic3 ic3Var) {
        return new Notification.ProgressStyle.Point(ic3Var.a).setColor(ic3Var.c).setId(ic3Var.b);
    }

    public static Notification.ProgressStyle.Segment j(jc3 jc3Var) {
        return new Notification.ProgressStyle.Segment(jc3Var.a).setColor(jc3Var.c).setId(jc3Var.b);
    }
}

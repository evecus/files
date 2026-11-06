package defpackage;

import android.app.Notification;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class hc3 {
    public static void a(Notification.ProgressStyle progressStyle, List<ic3> list) {
        Iterator<ic3> it = list.iterator();
        while (it.hasNext()) {
            progressStyle.addProgressPoint(c(it.next()));
        }
    }

    public static void b(Notification.ProgressStyle progressStyle, List<jc3> list) {
        Iterator<jc3> it = list.iterator();
        while (it.hasNext()) {
            progressStyle.addProgressSegment(d(it.next()));
        }
    }

    public static Notification.ProgressStyle.Point c(ic3 ic3Var) {
        return gc3.i(ic3Var).setSemanticStyle(ic3Var.d);
    }

    public static Notification.ProgressStyle.Segment d(jc3 jc3Var) {
        return gc3.j(jc3Var).setSemanticStyle(jc3Var.d);
    }
}

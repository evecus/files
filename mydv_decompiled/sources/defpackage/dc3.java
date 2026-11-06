package defpackage;

import android.app.Notification;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.TimeConversions;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class dc3 {
    private static Notification.Metric b(cc3 cc3Var) {
        return new Notification.Metric(c(cc3Var.a), cc3Var.b, cc3Var.c);
    }

    private static Notification.Metric.MetricValue c(ac3 ac3Var) {
        Notification.Metric.MetricValue forPausedStopwatch;
        Notification.Metric.MetricValue forPausedTimer;
        Notification.Metric.MetricValue forStopwatch;
        Notification.Metric.MetricValue forTimer;
        if (!(ac3Var instanceof bc3)) {
            if (ac3Var instanceof vb3) {
                vb3 vb3Var = (vb3) ac3Var;
                return new Notification.Metric.FixedDate(TimeConversions.convert(vb3Var.a), vb3Var.b);
            }
            if (ac3Var instanceof wb3) {
                wb3 wb3Var = (wb3) ac3Var;
                return new Notification.Metric.FixedFloat(wb3Var.a, wb3Var.b, wb3Var.c, wb3Var.d);
            }
            if (ac3Var instanceof xb3) {
                xb3 xb3Var = (xb3) ac3Var;
                return new Notification.Metric.FixedInt(xb3Var.a, xb3Var.b);
            }
            if (ac3Var instanceof yb3) {
                yb3 yb3Var = (yb3) ac3Var;
                return new Notification.Metric.FixedText(yb3Var.a, yb3Var.b);
            }
            if (ac3Var instanceof zb3) {
                return new Notification.Metric.FixedTime(TimeConversions.convert(((zb3) ac3Var).a));
            }
            hn3.i(ac3Var, "Unexpected MetricValue: ");
            return null;
        }
        bc3 bc3Var = (bc3) ac3Var;
        boolean z = bc3Var.d;
        int i = bc3Var.e;
        Instant instant = bc3Var.a;
        if (instant != null) {
            if (z) {
                forTimer = Notification.Metric.TimeDifference.forTimer(TimeConversions.convert(instant), i);
                return forTimer;
            }
            forStopwatch = Notification.Metric.TimeDifference.forStopwatch(TimeConversions.convert(instant), i);
            return forStopwatch;
        }
        Long l = bc3Var.b;
        if (l != null) {
            return z ? Notification.Metric.TimeDifference.forTimer(l.longValue(), i) : Notification.Metric.TimeDifference.forStopwatch(l.longValue(), i);
        }
        Duration duration = bc3Var.c;
        if (duration == null) {
            hn3.i(bc3Var, "Unexpected TimeDifference: ");
            return null;
        }
        if (z) {
            forPausedTimer = Notification.Metric.TimeDifference.forPausedTimer(TimeConversions.convert(duration), i);
            return forPausedTimer;
        }
        forPausedStopwatch = Notification.Metric.TimeDifference.forPausedStopwatch(TimeConversions.convert(duration), i);
        return forPausedStopwatch;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Notification.Style d(ec3 ec3Var) {
        Notification.Style metricStyle = new Notification.MetricStyle();
        ArrayList arrayList = ec3Var.a;
        Iterator it = DesugarCollections.unmodifiableList(arrayList).iterator();
        while (it.hasNext()) {
            metricStyle.addMetric(b((cc3) it.next()));
        }
        List unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        int i = ec3Var.b;
        metricStyle.setCriticalMetric(unmodifiableList.indexOf((i < 0 || i >= arrayList.size()) ? null : (cc3) arrayList.get(ec3Var.b)));
        return metricStyle;
    }
}

package defpackage;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ec3 extends lc3 {
    public final ArrayList a = new ArrayList();
    public int b = 0;

    @Override // defpackage.lc3
    public final void addCompatExtras(Bundle bundle) {
        super.addCompatExtras(bundle);
        if (Build.VERSION.SDK_INT >= 37) {
            return;
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            cc3 cc3Var = (cc3) obj;
            Bundle bundle2 = new Bundle();
            ac3 ac3Var = cc3Var.a;
            Bundle bundle3 = new Bundle();
            if (ac3Var instanceof bc3) {
                bundle3.putInt("_type", 1);
            } else if (ac3Var instanceof vb3) {
                bundle3.putInt("_type", 2);
            } else if (ac3Var instanceof zb3) {
                bundle3.putInt("_type", 3);
            } else if (ac3Var instanceof xb3) {
                bundle3.putInt("_type", 4);
            } else if (ac3Var instanceof wb3) {
                bundle3.putInt("_type", 5);
            } else {
                if (!(ac3Var instanceof yb3)) {
                    throw new AssertionError("Impossible MetricValue subclass: " + ac3Var);
                }
                bundle3.putInt("_type", 6);
            }
            ac3Var.a(bundle3);
            bundle2.putBundle("value", bundle3);
            bundle2.putString("label", cc3Var.b);
            bundle2.putInt("semanticStyle", cc3Var.c);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList("android.metrics", arrayList);
        bundle.putInt("android.metrics.criticalIndex", this.b);
    }

    @Override // defpackage.lc3
    public final void apply(db3 db3Var) {
        Notification.Style d;
        if (this.a.isEmpty()) {
            s83.t("A MetricStyle must have at least one Metric");
        } else if (Build.VERSION.SDK_INT >= 37) {
            Notification.Builder builder = (Notification.Builder) ((mc3) db3Var).b;
            d = dc3.d(this);
            builder.setStyle(d);
        }
    }

    @Override // defpackage.lc3
    public final void clearCompatExtraKeys(Bundle bundle) {
        super.clearCompatExtraKeys(bundle);
        bundle.remove("android.metrics");
        bundle.remove("android.metrics.criticalIndex");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ec3)) {
            return false;
        }
        ec3 ec3Var = (ec3) obj;
        if (this == ec3Var) {
            return true;
        }
        return this.a.equals(ec3Var.a) && this.b == ec3Var.b;
    }

    @Override // defpackage.lc3
    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$MetricStyle";
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.lc3
    public final void restoreFromCompatExtras(Bundle bundle) {
        ac3 bc3Var;
        super.restoreFromCompatExtras(bundle);
        ArrayList arrayList = this.a;
        arrayList.clear();
        ArrayList A = o7.A(bundle, "android.metrics", Bundle.class);
        if (A != null) {
            int size = A.size();
            int i = 0;
            while (i < size) {
                Object obj = A.get(i);
                i++;
                Bundle bundle2 = (Bundle) obj;
                if (bundle2 != null) {
                    Bundle bundle3 = bundle2.getBundle("value");
                    cc3 cc3Var = null;
                    if (bundle3 != null) {
                        switch (bundle3.getInt("_type")) {
                            case 1:
                                Instant ofEpochMilli = bundle3.containsKey("zeroTime") ? Instant.ofEpochMilli(bundle3.getLong("zeroTime")) : null;
                                Long valueOf = bundle3.containsKey("zeroElapsedRealtime") ? Long.valueOf(bundle3.getLong("zeroElapsedRealtime")) : null;
                                Duration ofMillis = bundle3.containsKey("pausedDuration") ? Duration.ofMillis(bundle3.getLong("pausedDuration")) : null;
                                if (ofEpochMilli != null || valueOf != null || ofMillis != null) {
                                    bc3Var = new bc3(ofEpochMilli, valueOf, ofMillis, bundle3.getBoolean("countDown"), bundle3.getInt("format"));
                                    break;
                                }
                                bc3Var = null;
                                break;
                            case 2:
                                LocalDate ofEpochDay = bundle3.containsKey("value") ? LocalDate.ofEpochDay(bundle3.getLong("value")) : null;
                                if (ofEpochDay != null) {
                                    bc3Var = new vb3(ofEpochDay, bundle3.getInt("format", 0));
                                    break;
                                }
                                bc3Var = null;
                                break;
                            case 3:
                                LocalTime ofSecondOfDay = bundle3.containsKey("value") ? LocalTime.ofSecondOfDay(bundle3.getLong("value")) : null;
                                if (ofSecondOfDay != null) {
                                    bc3Var = new zb3(ofSecondOfDay);
                                    break;
                                }
                                bc3Var = null;
                                break;
                            case 4:
                                bc3Var = new xb3(bundle3.getInt("value"), bundle3.getString("unit"));
                                break;
                            case 5:
                                bc3Var = new wb3(bundle3.getFloat("value"), bundle3.getInt("minDigits", 0), bundle3.getInt("maxDigits", 2), bundle3.getString("unit"));
                                break;
                            case 6:
                                bc3Var = new yb3(bundle3.getString("value", ""), bundle3.getString("unit"));
                                break;
                            default:
                                bc3Var = null;
                                break;
                        }
                        if (bc3Var != null) {
                            cc3Var = new cc3(bc3Var, bundle2.getString("label"), bundle2.getInt("semanticStyle", 0));
                        }
                    }
                    if (cc3Var != null) {
                        arrayList.add(cc3Var);
                    }
                }
            }
        }
        this.b = bundle.getInt("android.metrics.criticalIndex", 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetricStyle{mMetrics=");
        sb.append(this.a);
        sb.append(", mCriticalMetric=");
        return nt3.n(sb, this.b, "}");
    }
}

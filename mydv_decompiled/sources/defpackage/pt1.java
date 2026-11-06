package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import androidx.media3.common.Format;
import androidx.media3.exoplayer.audio.AudioOutputProvider;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class pt1 implements w00 {
    public static final /* synthetic */ int[] I = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32};

    public static /* synthetic */ boolean A(iz izVar, Object obj, ep epVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = iz.R;
        while (!atomicReferenceFieldUpdater.compareAndSet(izVar, obj, epVar)) {
            if (atomicReferenceFieldUpdater.get(izVar) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean B(iz izVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = iz.R;
        while (!atomicReferenceFieldUpdater.compareAndSet(izVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(izVar) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean C(iz izVar, Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = iz.Q;
        while (!atomicReferenceFieldUpdater.compareAndSet(izVar, obj, th)) {
            if (atomicReferenceFieldUpdater.get(izVar) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean D(sf0 sf0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sf0.a;
        ep epVar = qb.d;
        while (!atomicReferenceFieldUpdater.compareAndSet(sf0Var, null, epVar)) {
            if (atomicReferenceFieldUpdater.get(sf0Var) != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean E(sf0 sf0Var, Object obj, sf0 sf0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sf0.b;
        while (!atomicReferenceFieldUpdater.compareAndSet(sf0Var, obj, sf0Var2)) {
            if (atomicReferenceFieldUpdater.get(sf0Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ int F(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static l13 G(ea0 ea0Var, l13 l13Var, float f) {
        if (f <= 0.0d) {
            o02.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return l13Var.then(new sc2(f, true));
    }

    public static l13 b(vi viVar, l13 l13Var, ta1 ta1Var, bc1 bc1Var, String str) {
        return l13Var.then(new ce0(new ti(viVar, ta1Var, bc1Var, str)));
    }

    public static boolean c(AudioOutputProvider.OutputConfig outputConfig, AudioOutputProvider.OutputConfig outputConfig2) {
        return outputConfig2.equals(outputConfig);
    }

    public static void d(o10 o10Var, m14 m14Var) {
        o10Var.l(m14Var.a, m14Var.b, m14Var.c, m14Var.d, 1);
    }

    public static void e(DefaultAudioSink defaultAudioSink, Format format, int i, int[] iArr) {
        defaultAudioSink.configure(new AudioSink.AudioSinkConfig.Builder(format).setPreferredBufferSizeOverride(i).setOutputChannelMapping(iArr == null ? null : yx1.a(iArr)).build());
    }

    public static void f(n84 n84Var, o84 o84Var) {
        o84Var.getClass();
        if (o84Var instanceof oz4) {
            hm1 hm1Var = ((oz4) o84Var).I;
            byte b = n84Var.I;
            hm1Var.getClass();
            switch (b) {
                case 17:
                    hm1Var.y("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
                    int i = 0;
                    Object[] objArr = new Object[0];
                    if (contentValues.size() == 0) {
                        s83.t("Empty values");
                        return;
                    }
                    int size = contentValues.size();
                    int length = objArr.length + size;
                    Object[] objArr2 = new Object[length];
                    StringBuilder sb = new StringBuilder("UPDATE ");
                    sb.append(hm1.J[3]);
                    sb.append("WorkSpec SET ");
                    int i2 = 0;
                    for (String str : contentValues.keySet()) {
                        sb.append(i2 > 0 ? "," : "");
                        sb.append(str);
                        objArr2[i2] = contentValues.get(str);
                        sb.append("=?");
                        i2++;
                    }
                    for (int i3 = size; i3 < length; i3++) {
                        objArr2[i3] = objArr[i3 - size];
                    }
                    if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
                        sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
                    }
                    om1 n = hm1Var.n(sb.toString());
                    while (i < length) {
                        Object obj = objArr2[i];
                        i++;
                        if (obj == null) {
                            n.d(i);
                        } else if (obj instanceof byte[]) {
                            n.I.bindBlob(i, (byte[]) obj);
                        } else if (obj instanceof Float) {
                            n.l(i, ((Number) obj).floatValue());
                        } else if (obj instanceof Double) {
                            n.l(i, ((Number) obj).doubleValue());
                        } else if (obj instanceof Long) {
                            n.b(i, ((Number) obj).longValue());
                        } else if (obj instanceof Integer) {
                            n.b(i, ((Number) obj).intValue());
                        } else if (obj instanceof Short) {
                            n.b(i, ((Number) obj).shortValue());
                        } else if (obj instanceof Byte) {
                            n.b(i, ((Number) obj).byteValue());
                        } else if (obj instanceof String) {
                            n.I.bindString(i, (String) obj);
                        } else {
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                            }
                            n.b(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
                        }
                    }
                    n.J.executeUpdateDelete();
                    return;
                default:
                    hm1Var.y("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
                    return;
            }
        }
    }

    public static void i(o10 o10Var, yd ydVar) {
        o10Var.k(ydVar);
    }

    public static void j(o10 o10Var, float f, float f2) {
        o10Var.l(0.0f, 0.0f, f, f2, 1);
    }

    public static void k(o10 o10Var, m14 m14Var) {
        o10Var.q(m14Var);
    }

    public static int l(int i, int i2, long j) {
        return (i82.Q(j) + i) * i2;
    }

    public static /* synthetic */ int m(long j) {
        return (int) (j ^ 3);
    }

    public static int n(i80 i80Var, int i, int i2) {
        return (i80Var.hashCode() + i) * i2;
    }

    public static /* synthetic */ int o(boolean z) {
        return z ? 1231 : 1237;
    }

    public static q0 p(q0 q0Var, String str, String str2, String str3, String str4) {
        q0 v = q0Var.v(str);
        v.v(str2);
        v.v(str3);
        v.v(str4);
        return v;
    }

    public static q0 q(String str) {
        return new q0(str).A();
    }

    public static ki1 r(go1 go1Var) {
        ki1 ki1Var = new ki1();
        go1Var.o0(ki1Var);
        return ki1Var;
    }

    public static Object s(go1 go1Var, int i, ea5 ea5Var) {
        go1Var.d0(i);
        go1Var.q(false);
        return ea5Var.a.d();
    }

    public static String t(int i, String str) {
        return i + str;
    }

    public static void u(int i, HashMap hashMap, String str, int i2, String str2) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i2));
    }

    public static void v(q0 q0Var, String str, String str2, String str3, String str4) {
        q0Var.v(str);
        q0Var.v(str2);
        q0Var.v(str3);
        q0Var.v(str4);
    }

    public static /* synthetic */ void w(AtomicReference atomicReference, RuntimeException runtimeException) {
        while (!atomicReference.compareAndSet(null, runtimeException) && atomicReference.get() == null) {
        }
    }

    public static /* synthetic */ boolean x(iz izVar, oe oeVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = iz.R;
        while (!atomicReferenceFieldUpdater.compareAndSet(izVar, null, oeVar)) {
            if (atomicReferenceFieldUpdater.get(izVar) != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean y(iz izVar, lh4 lh4Var, c50 c50Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = iz.P;
        while (!atomicReferenceFieldUpdater.compareAndSet(izVar, lh4Var, c50Var)) {
            if (atomicReferenceFieldUpdater.get(izVar) != lh4Var) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean z(iz izVar, lh4 lh4Var, lh4 lh4Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = iz.P;
        while (!atomicReferenceFieldUpdater.compareAndSet(izVar, lh4Var, lh4Var2)) {
            if (atomicReferenceFieldUpdater.get(izVar) != lh4Var) {
                return false;
            }
        }
        return true;
    }
}

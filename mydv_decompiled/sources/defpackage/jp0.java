package defpackage;

import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class jp0 {
    public static /* synthetic */ boolean A(jb1 jb1Var, Object obj, dr2 dr2Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = jb1.M;
        while (!atomicReferenceFieldUpdater.compareAndSet(jb1Var, obj, dr2Var)) {
            if (atomicReferenceFieldUpdater.get(jb1Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ void B() {
    }

    public static void C(int i, String str, HashMap hashMap, String str2) {
        hashMap.put(str2, new jt0(i, str));
    }

    public static boolean D(si1 si1Var) {
        return ((ui1) si1Var).r0(7);
    }

    public static Extractor[] a(ExtractorsFactory extractorsFactory) {
        return extractorsFactory.createExtractors();
    }

    public static Object b(i42 i42Var, KSerializer kSerializer) {
        kSerializer.getClass();
        return kSerializer.deserialize(i42Var);
    }

    public static float c(wf1 wf1Var, float f, float f2, float f3) {
        return wf1Var.b(wf1Var.c(f, f2, f3), f, f2, f3);
    }

    public static void d(String str) {
        str.getClass();
    }

    public static void e() {
        Map map = Collections.EMPTY_MAP;
    }

    public static x24 f() {
        ay1 ay1Var = dy1.J;
        return x24.M;
    }

    public static cy0 g(long j, Runnable runnable, tk0 tk0Var) {
        return jr0.a.y(j, runnable, tk0Var);
    }

    public static cy1 h(a4 a4Var, int i, int i2) {
        return new cy1(a4Var, i, i2);
    }

    public static lq1 i(lq1 lq1Var, lq1 lq1Var2) {
        return lq1Var2 == jq1.a ? lq1Var : new oa0(lq1Var, lq1Var2);
    }

    public static ts0 j(nf1 nf1Var) {
        return new ts0(nf1Var);
    }

    public static void l(bi1 bi1Var) {
        ((di1) bi1Var).b(8, false, true);
    }

    public static void m(ep epVar, yd ydVar) {
        ((pn) epVar.J).q().k(ydVar);
    }

    public static int o(float f, int i, int i2) {
        return (Float.floatToIntBits(f) + i) * i2;
    }

    public static e41 p(e41 e41Var, e41 e41Var2, e41 e41Var3) {
        return e41Var.q0().k(e41Var2).k(e41Var3);
    }

    public static uj3 q(int i, lx lxVar) {
        return new uj3(lxVar, new ia2(i));
    }

    public static uj3 r(int i, oh0 oh0Var) {
        return new uj3(oh0Var, new nh0(i));
    }

    public static uj3 s(int i, o74 o74Var) {
        return new uj3(o74Var, new ia2(i));
    }

    public static uj3 t(nc2 nc2Var, nc2 nc2Var2, Integer num) {
        return new uj3(new tq4(nc2Var, nc2Var2), num);
    }

    public static /* synthetic */ String u(String str) {
        int length = str.length();
        while (length > 0) {
            int codePointBefore = Character.codePointBefore(str, length);
            if (!Character.isWhitespace(codePointBefore)) {
                break;
            }
            length -= Character.charCount(codePointBefore);
        }
        return str.substring(0, length);
    }

    public static /* synthetic */ void v() {
    }

    public static void w(int i, String str, HashMap hashMap, String str2) {
        hashMap.put(str2, new it0(i, str));
    }

    public static /* synthetic */ void x(e62 e62Var, Object obj, wy1 wy1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e62.I;
        while (!atomicReferenceFieldUpdater.compareAndSet(e62Var, obj, wy1Var) && atomicReferenceFieldUpdater.get(e62Var) == obj) {
        }
    }

    public static /* synthetic */ boolean y(ap apVar) {
        return apVar != null;
    }

    public static /* synthetic */ boolean z(jb1 jb1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = jb1.M;
        ep epVar = qb.h;
        while (!atomicReferenceFieldUpdater.compareAndSet(jb1Var, null, epVar)) {
            if (atomicReferenceFieldUpdater.get(jb1Var) != null) {
                return false;
            }
        }
        return true;
    }
}

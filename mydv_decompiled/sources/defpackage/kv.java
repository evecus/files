package defpackage;

import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kv implements Runnable {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ List J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;

    public /* synthetic */ kv(m65 m65Var, da2 da2Var, List list, oj ojVar, iu0 iu0Var, kj1 kj1Var, boolean z) {
        this.L = m65Var;
        this.M = da2Var;
        this.J = list;
        this.N = ojVar;
        this.O = iu0Var;
        this.P = kj1Var;
        this.K = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s43 D;
        byte b = this.I;
        Object obj = this.P;
        Object obj2 = this.O;
        List list = this.J;
        Object obj3 = this.N;
        Object obj4 = this.M;
        Object obj5 = this.L;
        switch (b) {
            case 0:
                m65 m65Var = (m65) obj5;
                da2 da2Var = (da2) obj4;
                oj ojVar = (oj) obj3;
                iu0 iu0Var = (iu0) obj2;
                kj1 kj1Var = (kj1) obj;
                boolean z = this.K;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    ns4 h = ws4.h();
                    s43 s43Var = h instanceof s43 ? (s43) h : null;
                    if (s43Var == null || (D = s43Var.D(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        ns4 j = D.j();
                        try {
                            m65 z2 = ad4.z(m65Var, da2Var);
                            if (list == null) {
                                list = o91.I;
                            }
                            zw zwVar = new zw(ojVar, iu0Var, kj1Var, z2, list, z);
                            zwVar.c();
                            zwVar.b();
                            ns4.q(j);
                            D.w().d();
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            ns4.q(j);
                            throw th;
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            default:
                WorkDatabase workDatabase = (WorkDatabase) obj5;
                ky5 ky5Var = (ky5) obj4;
                ky5 ky5Var2 = (ky5) obj3;
                String str = (String) obj2;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                oy5 w = workDatabase.w();
                qy5 x = workDatabase.x();
                ky5 b2 = ky5.b(ky5Var2, null, ky5Var.b, null, null, ky5Var.k, ky5Var.n, ky5Var.s, ky5Var.t + 1, ky5Var.u, ky5Var.v, 29613053);
                if (ky5Var2.v == 1) {
                    b2.u = ky5Var2.u;
                    b2.v++;
                }
                ky5 A0 = e41.A0(list, b2);
                w.getClass();
                g4.V(w.a, false, true, new e35(w, A0));
                x.getClass();
                str.getClass();
                g4.V(x.a, false, true, new pu0(str, (byte) 23));
                x.a(str, linkedHashSet);
                if (this.K) {
                    return;
                }
                w.g(str, -1L);
                cy5 v = workDatabase.v();
                v.getClass();
                g4.V(v.a, false, true, new pu0(str, (byte) 11));
                return;
        }
    }

    public /* synthetic */ kv(WorkDatabase workDatabase, ky5 ky5Var, ky5 ky5Var2, List list, String str, LinkedHashSet linkedHashSet, boolean z) {
        this.L = workDatabase;
        this.M = ky5Var;
        this.N = ky5Var2;
        this.J = list;
        this.O = str;
        this.P = linkedHashSet;
        this.K = z;
    }
}

package defpackage;

import androidx.media3.common.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class tr4 implements te0, Iterable, w72 {
    public int J;
    public int L;
    public int M;
    public boolean O;
    public int P;
    public HashMap R;
    public q33 S;
    public int[] I = new int[0];
    public Object[] K = new Object[0];
    public final Object N = new Object();
    public ArrayList Q = new ArrayList();

    public static final void f(wr4 wr4Var, int i) {
        while (wr4Var.v >= 0 && wr4Var.u <= i) {
            wr4Var.N();
            wr4Var.i();
        }
    }

    public final int c(bo1 bo1Var) {
        if (this.O) {
            ke0.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!bo1Var.a()) {
            jr3.a("Anchor refers to a group that was removed");
        }
        return bo1Var.a;
    }

    public final void d() {
        this.R = new HashMap();
    }

    public final n43 e(ap apVar, e43 e43Var) {
        int i;
        Object[] objArr = e43Var.a;
        int i2 = e43Var.b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            if (l(ut0.i(((r23) objArr[i3]).a()))) {
                i3++;
            } else {
                e43 e43Var2 = new e43();
                Object[] objArr2 = e43Var.a;
                int i4 = e43Var.b;
                for (int i5 = 0; i5 < i4; i5++) {
                    Object obj = objArr2[i5];
                    if (l(ut0.i(((r23) obj).a()))) {
                        e43Var2.a(obj);
                    }
                }
                e43Var = e43Var2;
            }
        }
        e43 o0 = e41.o0(e43Var, new tf2(this, (byte) 26));
        if (o0.i()) {
            n43 n43Var = ia4.b;
            n43Var.getClass();
            return n43Var;
        }
        long[] jArr = ia4.a;
        n43 n43Var2 = new n43();
        wr4 j = j();
        try {
            Object[] objArr3 = o0.a;
            int i6 = o0.b;
            for (int i7 = 0; i7 < i6; i7++) {
                r23 r23Var = (r23) objArr3[i7];
                int c = j.c(ut0.i(r23Var.a()));
                int F = j.F(c, j.b);
                f(j, F);
                f(j, F);
                while (true) {
                    i = j.t;
                    if (i == F || i == j.u) {
                        break;
                    }
                    if (F < j.t(i) + i) {
                        j.Q();
                    } else {
                        j.M();
                    }
                }
                if (i != F) {
                    ke0.a("Unexpected slot table structure");
                }
                j.Q();
                j.a(c - j.t);
                n43Var2.m(r23Var, ke0.c(r23Var.b(), r23Var, j, apVar));
            }
            f(j, Log.LOG_LEVEL_OFF);
            j.e(true);
            return n43Var2;
        } catch (Throwable th) {
            j.e(false);
            throw th;
        }
    }

    public final sr4 h() {
        if (this.O) {
            zy.i("Cannot read while a writer is pending");
            return null;
        }
        this.M++;
        return new sr4(this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new as1(this, 0, this.J);
    }

    public final wr4 j() {
        if (this.O) {
            ke0.a("Cannot start a writer when another writer is pending");
        }
        if (this.M > 0) {
            ke0.a("Cannot start a writer when a reader is pending");
        }
        this.O = true;
        this.P++;
        return new wr4(this);
    }

    public final boolean l(bo1 bo1Var) {
        int c;
        return bo1Var.a() && (c = vr4.c(this.Q, bo1Var.a, this.J)) >= 0 && j42.c(this.Q.get(c), bo1Var);
    }

    public final io1 m(int i) {
        int i2;
        ArrayList arrayList;
        int c;
        HashMap hashMap = this.R;
        if (hashMap != null) {
            if (this.O) {
                ke0.a("use active SlotWriter to crate an anchor for location instead");
            }
            bo1 bo1Var = (i < 0 || i >= (i2 = this.J) || (c = vr4.c((arrayList = this.Q), i, i2)) < 0) ? null : (bo1) arrayList.get(c);
            if (bo1Var != null) {
                return (io1) hashMap.get(bo1Var);
            }
        }
        return null;
    }
}

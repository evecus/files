package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class aq1 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;

    public /* synthetic */ aq1(zi5 zi5Var, bn3 bn3Var, int i) {
        this.I = (byte) 3;
        this.J = zi5Var;
        this.L = bn3Var;
        this.K = i;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = this.K;
        Object obj2 = this.L;
        Object obj3 = this.J;
        switch (b) {
            case 0:
                mb2 mb2Var = (mb2) obj;
                pb2 q = qb2.q();
                String canonicalName = ((gq1) obj3).getClass().getCanonicalName();
                q.d();
                ((qb2) q.J).t(canonicalName);
                q.d();
                ((qb2) q.J).s(i);
                q.d();
                ((qb2) q.J).r((String) obj2);
                qb2 qb2Var = (qb2) q.b();
                mb2Var.d();
                ((zb2) mb2Var.J).A(qb2Var);
                break;
            case 1:
                mb2 mb2Var2 = (mb2) obj;
                tb2 q2 = ub2.q();
                String canonicalName2 = ((gq1) obj3).getClass().getCanonicalName();
                q2.d();
                ((ub2) q2.J).t(canonicalName2);
                q2.d();
                ((ub2) q2.J).r(i);
                Parcel obtain = Parcel.obtain();
                ((Bundle) obj2).writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                e00 e = g00.e(marshall, 0, marshall.length);
                q2.d();
                ((ub2) q2.J).s(e);
                ub2 ub2Var = (ub2) q2.b();
                mb2Var2.d();
                ((zb2) mb2Var2.J).C(ub2Var);
                break;
            case 2:
                pb4 pb4Var = (pb4) obj3;
                bn3 bn3Var = (bn3) obj2;
                an3 an3Var = (an3) obj;
                int h = pb4Var.I.a.h();
                if (h < 0) {
                    h = 0;
                }
                if (h <= i) {
                    i = h;
                }
                int i2 = -i;
                boolean z = pb4Var.J;
                int i3 = z ? 0 : i2;
                int i4 = z ? i2 : 0;
                an3Var.I = true;
                an3.j(an3Var, bn3Var, i3, i4, null, 12);
                an3Var.I = false;
                break;
            default:
                zi5 zi5Var = (zi5) obj3;
                bn3 bn3Var2 = (bn3) obj2;
                an3 an3Var2 = (an3) obj;
                int i5 = zi5Var.b;
                l45 l45Var = zi5Var.a;
                u95 u95Var = zi5Var.c;
                v55 v55Var = (v55) zi5Var.d.invoke();
                l45Var.a(pg3.I, hc4.D(an3Var2, i5, u95Var, v55Var != null ? v55Var.a : null, false, bn3Var2.I), i, bn3Var2.J);
                an3.i(an3Var2, bn3Var2, 0, Math.round(-l45Var.a.h()));
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ aq1(byte b, int i, Object obj, Object obj2) {
        this.I = b;
        this.J = obj;
        this.K = i;
        this.L = obj2;
    }
}

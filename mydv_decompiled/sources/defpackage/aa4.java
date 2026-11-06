package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class aa4 implements hn1 {
    public final /* synthetic */ byte I;

    public /* synthetic */ aa4(byte b) {
        this.I = b;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        sj sjVar;
        Object a;
        int i = 0;
        switch (this.I) {
            case 0:
                h55 h55Var = (h55) obj2;
                return p70.u(Float.valueOf(h55Var.a), Float.valueOf(h55Var.b));
            case 1:
                f94 f94Var = (f94) obj;
                i55 i55Var = (i55) obj2;
                p65 p65Var = new p65(i55Var.a);
                da4 da4Var = ea4.v;
                return p70.u(ea4.a(p65Var, da4Var, f94Var), ea4.a(new p65(i55Var.b), da4Var, f94Var));
            case 2:
                return Integer.valueOf(((qk1) obj2).I);
            case 3:
                dk2 dk2Var = (dk2) obj2;
                return p70.u(dk2Var.b(), ea4.a(dk2Var.a(), ea4.i, (f94) obj));
            case 4:
                return Float.valueOf(((wu) obj2).a);
            case 5:
                f94 f94Var2 = (f94) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                while (i < size) {
                    arrayList.add(ea4.a((nj) list.get(i), ea4.b, f94Var2));
                    i++;
                }
                return arrayList;
            case 6:
                d65 d65Var = (d65) obj2;
                return p70.u(Integer.valueOf((int) (d65Var.a >> 32)), Integer.valueOf((int) (4294967295L & d65Var.a)));
            case 7:
                f94 f94Var3 = (f94) obj;
                an4 an4Var = (an4) obj2;
                return p70.u(ea4.a(new x70(an4Var.a), ea4.p, f94Var3), ea4.a(new pd3(an4Var.b), ea4.x, f94Var3), Float.valueOf(an4Var.c));
            case 8:
                return Integer.valueOf(((k25) obj2).a);
            case 9:
                return Integer.valueOf(((q35) obj2).a);
            case 10:
                return Integer.valueOf(((cw1) obj2).a);
            case 11:
                return Integer.valueOf(((lk1) obj2).a);
            case 12:
                return Integer.valueOf(((mk1) obj2).a);
            case 13:
                p65 p65Var2 = (p65) obj2;
                return p65Var2 == null ? false : p65.a(p65Var2.a, p65.c) ? Boolean.FALSE : p70.u(Float.valueOf(p65.c(p65Var2.a)), ea4.a(new q65(p65.b(p65Var2.a)), ea4.w, (f94) obj));
            case 14:
                ck2 ck2Var = (ck2) obj2;
                return p70.u(ck2Var.b(), ea4.a(ck2Var.a(), ea4.i, (f94) obj));
            case 15:
                long j = ((q65) obj2).a;
                if (q65.a(j, 8589934592L)) {
                    return 0;
                }
                if (q65.a(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 16:
                pd3 pd3Var = (pd3) obj2;
                return pd3Var == null ? false : pd3.c(pd3Var.a, 9205357640488583168L) ? Boolean.FALSE : p70.u(Float.valueOf(Float.intBitsToFloat((int) (pd3Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (4294967295L & pd3Var.a))));
            case 17:
                f94 f94Var4 = (f94) obj;
                nj njVar = (nj) obj2;
                Object f = njVar.f();
                if (f instanceof ck3) {
                    sjVar = sj.I;
                } else if (f instanceof yt4) {
                    sjVar = sj.J;
                } else if (f instanceof oi5) {
                    sjVar = sj.K;
                } else if (f instanceof mf5) {
                    sjVar = sj.L;
                } else if (f instanceof dk2) {
                    sjVar = sj.M;
                } else if (f instanceof ck2) {
                    sjVar = sj.N;
                } else {
                    if (!(f instanceof dx4)) {
                        e1.a();
                        return null;
                    }
                    sjVar = sj.O;
                }
                switch (sjVar.ordinal()) {
                    case 0:
                        Object f2 = njVar.f();
                        f2.getClass();
                        a = ea4.a((ck3) f2, ea4.g, f94Var4);
                        break;
                    case 1:
                        Object f3 = njVar.f();
                        f3.getClass();
                        a = ea4.a((yt4) f3, ea4.h, f94Var4);
                        break;
                    case 2:
                        Object f4 = njVar.f();
                        f4.getClass();
                        a = ea4.a((oi5) f4, ea4.c, f94Var4);
                        break;
                    case 3:
                        Object f5 = njVar.f();
                        f5.getClass();
                        a = ea4.a((mf5) f5, ea4.d, f94Var4);
                        break;
                    case 4:
                        Object f6 = njVar.f();
                        f6.getClass();
                        a = ea4.a((dk2) f6, ea4.e, f94Var4);
                        break;
                    case 5:
                        Object f7 = njVar.f();
                        f7.getClass();
                        a = ea4.a((ck2) f7, ea4.f, f94Var4);
                        break;
                    case 6:
                        Object f8 = njVar.f();
                        f8.getClass();
                        a = ((dx4) f8).b();
                        break;
                    default:
                        s83.v();
                        return null;
                }
                return p70.u(sjVar, a, Integer.valueOf(njVar.g()), Integer.valueOf(njVar.e()), njVar.h());
            case 18:
                f94 f94Var5 = (f94) obj;
                List list2 = ((tq2) obj2).I;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                while (i < size2) {
                    arrayList2.add(ea4.a((sq2) list2.get(i), ea4.z, f94Var5));
                    i++;
                }
                return arrayList2;
            case 19:
                return ((sq2) obj2).a.toLanguageTag();
            case 20:
                f94 f94Var6 = (f94) obj;
                pj2 pj2Var = (pj2) obj2;
                return p70.u(ea4.a(new mj2(pj2Var.a), ea4.B, f94Var6), ea4.a(new oj2(pj2Var.b), ea4.C, f94Var6), ea4.a(new nj2(pj2Var.c), ea4.D, f94Var6));
            case 21:
                return Float.valueOf(((mj2) obj2).a);
            case 22:
                return Integer.valueOf(((oj2) obj2).a);
            case 23:
                return Integer.valueOf(((nj2) obj2).a);
            case 24:
                return ((oi5) obj2).a();
            case 25:
                f94 f94Var7 = (f94) obj;
                ck3 ck3Var = (ck3) obj2;
                Object a2 = ea4.a(new k25(ck3Var.a), ea4.q, f94Var7);
                Object a3 = ea4.a(new q35(ck3Var.b), ea4.r, f94Var7);
                Object a4 = ea4.a(new p65(ck3Var.c), ea4.v, f94Var7);
                i55 i55Var2 = ck3Var.d;
                i55 i55Var3 = i55.c;
                Object a5 = ea4.a(i55Var2, ea4.l, f94Var7);
                Object a6 = ea4.a(ck3Var.e, eu5.z, f94Var7);
                pj2 pj2Var2 = ck3Var.f;
                pj2 pj2Var3 = pj2.d;
                return p70.u(a2, a3, a4, a5, a6, ea4.a(pj2Var2, ea4.A, f94Var7), ea4.a(new kj2(ck3Var.g), eu5.B, f94Var7), ea4.a(new cw1(ck3Var.h), ea4.s, f94Var7), ea4.a(ck3Var.i, eu5.C, f94Var7));
            case 26:
                return ((mf5) obj2).a();
            case 27:
                f94 f94Var8 = (f94) obj;
                yt4 yt4Var = (yt4) obj2;
                x70 x70Var = new x70(yt4Var.a.a());
                da4 da4Var2 = ea4.p;
                Object a7 = ea4.a(x70Var, da4Var2, f94Var8);
                p65 p65Var3 = new p65(yt4Var.b);
                da4 da4Var3 = ea4.v;
                Object a8 = ea4.a(p65Var3, da4Var3, f94Var8);
                qk1 qk1Var = yt4Var.c;
                qk1 qk1Var2 = qk1.J;
                Object a9 = ea4.a(qk1Var, ea4.m, f94Var8);
                Object a10 = ea4.a(yt4Var.d, ea4.t, f94Var8);
                Object a11 = ea4.a(yt4Var.e, ea4.u, f94Var8);
                String str = yt4Var.g;
                Object a12 = ea4.a(new p65(yt4Var.h), da4Var3, f94Var8);
                Object a13 = ea4.a(yt4Var.i, ea4.n, f94Var8);
                Object a14 = ea4.a(yt4Var.j, ea4.k, f94Var8);
                tq2 tq2Var = yt4Var.k;
                tq2 tq2Var2 = tq2.K;
                Object a15 = ea4.a(tq2Var, ea4.y, f94Var8);
                Object a16 = ea4.a(new x70(yt4Var.l), da4Var2, f94Var8);
                Object a17 = ea4.a(yt4Var.m, ea4.j, f94Var8);
                an4 an4Var2 = yt4Var.n;
                an4 an4Var3 = an4.d;
                return p70.u(a7, a8, a9, a10, a11, -1, str, a12, a13, a14, a15, a16, a17, ea4.a(an4Var2, ea4.o, f94Var8));
            case 28:
                f94 f94Var9 = (f94) obj;
                z55 z55Var = (z55) obj2;
                yt4 d = z55Var.d();
                da daVar = ea4.h;
                return p70.u(ea4.a(d, daVar, f94Var9), ea4.a(z55Var.a(), daVar, f94Var9), ea4.a(z55Var.b(), daVar, f94Var9), ea4.a(z55Var.c(), daVar, f94Var9));
            default:
                Collection collection = (List) obj;
                List list3 = (List) obj2;
                if (collection == null) {
                    collection = o91.I;
                }
                return o70.f1(collection, list3);
        }
    }
}

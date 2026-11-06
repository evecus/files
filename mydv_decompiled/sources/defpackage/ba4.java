package defpackage;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class ba4 implements tm1 {
    public final /* synthetic */ byte I;

    public /* synthetic */ ba4(byte b) {
        this.I = b;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        nj njVar;
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        b65 b65Var;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i5 = 0;
        switch (b) {
            case 0:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                int i6 = x70.h;
                Boolean bool = Boolean.FALSE;
                j42.c(obj2, bool);
                x70 x70Var = obj2 != null ? j42.c(obj2, Boolean.FALSE) ? new x70(x70.g) : new x70(qb.i(((Integer) obj2).intValue())) : null;
                x70Var.getClass();
                long j2 = x70Var.a;
                Object obj3 = list.get(1);
                da4 da4Var = ea4.x;
                j42.c(obj3, bool);
                pd3 pd3Var = obj3 != null ? (pd3) da4Var.J.invoke(obj3) : null;
                pd3Var.getClass();
                long j3 = pd3Var.a;
                Object obj4 = list.get(2);
                Float f = obj4 != null ? (Float) obj4 : null;
                f.getClass();
                return new an4(j2, j3, f.floatValue());
            case 1:
                obj.getClass();
                return new k25(((Integer) obj).intValue());
            case 2:
                obj.getClass();
                List list2 = (List) obj;
                Object obj5 = list2.get(0);
                String str = obj5 != null ? (String) obj5 : null;
                str.getClass();
                Object obj6 = list2.get(1);
                return new dk2(str, (j42.c(obj6, Boolean.FALSE) || obj6 == null) ? null : (z55) ((tm1) ea4.i.K).invoke(obj6), i5);
            case 3:
                obj.getClass();
                return new q35(((Integer) obj).intValue());
            case 4:
                obj.getClass();
                return new cw1(((Integer) obj).intValue());
            case 5:
                obj.getClass();
                List list3 = (List) obj;
                ArrayList arrayList = new ArrayList(list3.size());
                int size = list3.size();
                while (i5 < size) {
                    Object obj7 = list3.get(i5);
                    nj njVar2 = (j42.c(obj7, Boolean.FALSE) || obj7 == null) ? null : (nj) ((tm1) ea4.b.K).invoke(obj7);
                    njVar2.getClass();
                    arrayList.add(njVar2);
                    i5++;
                }
                return arrayList;
            case 6:
                obj.getClass();
                return new lk1(((Integer) obj).intValue());
            case 7:
                obj.getClass();
                return new mk1(((Integer) obj).intValue());
            case 8:
                Boolean bool2 = Boolean.FALSE;
                if (j42.c(obj, bool2)) {
                    return new p65(p65.c);
                }
                obj.getClass();
                List list4 = (List) obj;
                Object obj8 = list4.get(0);
                Float f2 = obj8 != null ? (Float) obj8 : null;
                f2.getClass();
                float floatValue = f2.floatValue();
                Object obj9 = list4.get(1);
                da4 da4Var2 = ea4.w;
                j42.c(obj9, bool2);
                q65 q65Var = obj9 != null ? (q65) da4Var2.J.invoke(obj9) : null;
                q65Var.getClass();
                return new p65(oh4.p(q65Var.a, floatValue));
            case 9:
                return j42.c(obj, 0) ? new q65(8589934592L) : j42.c(obj, 1) ? new q65(4294967296L) : new q65(0L);
            case 10:
                if (j42.c(obj, Boolean.FALSE)) {
                    return new pd3(9205357640488583168L);
                }
                obj.getClass();
                List list5 = (List) obj;
                Object obj10 = list5.get(0);
                Float f3 = obj10 != null ? (Float) obj10 : null;
                f3.getClass();
                float floatValue2 = f3.floatValue();
                Object obj11 = list5.get(1);
                (obj11 != null ? (Float) obj11 : null).getClass();
                return new pd3((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r13.floatValue()) & 4294967295L));
            case 11:
                obj.getClass();
                List list6 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list6.size());
                int size2 = list6.size();
                while (i5 < size2) {
                    Object obj12 = list6.get(i5);
                    sq2 sq2Var = (j42.c(obj12, Boolean.FALSE) || obj12 == null) ? null : (sq2) ((tm1) ea4.z.K).invoke(obj12);
                    sq2Var.getClass();
                    arrayList2.add(sq2Var);
                    i5++;
                }
                return new tq2(arrayList2);
            case 12:
                obj.getClass();
                return new sq2(jl2.d((String) obj));
            case 13:
                obj.getClass();
                List list7 = (List) obj;
                Object obj13 = list7.get(0);
                String str2 = obj13 != null ? (String) obj13 : null;
                str2.getClass();
                Object obj14 = list7.get(1);
                return new ck2(str2, (j42.c(obj14, Boolean.FALSE) || obj14 == null) ? null : (z55) ((tm1) ea4.i.K).invoke(obj14));
            case 14:
                obj.getClass();
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                float f4 = mj2.b;
                da4 da4Var3 = ea4.B;
                Boolean bool3 = Boolean.FALSE;
                j42.c(obj15, bool3);
                mj2 mj2Var = obj15 != null ? (mj2) da4Var3.J.invoke(obj15) : null;
                mj2Var.getClass();
                float f5 = mj2Var.a;
                Object obj16 = list8.get(1);
                da4 da4Var4 = ea4.C;
                j42.c(obj16, bool3);
                oj2 oj2Var = obj16 != null ? (oj2) da4Var4.J.invoke(obj16) : null;
                oj2Var.getClass();
                int i7 = oj2Var.a;
                Object obj17 = list8.get(2);
                da4 da4Var5 = ea4.D;
                j42.c(obj17, bool3);
                nj2 nj2Var = obj17 != null ? (nj2) da4Var5.J.invoke(obj17) : null;
                nj2Var.getClass();
                return new pj2(f5, i7, nj2Var.a);
            case 15:
                obj.getClass();
                float floatValue3 = ((Float) obj).floatValue();
                mj2.a(floatValue3);
                return new mj2(floatValue3);
            case 16:
                obj.getClass();
                return new oj2(((Integer) obj).intValue());
            case 17:
                obj.getClass();
                List list9 = (List) obj;
                Object obj18 = list9.get(0);
                sj sjVar = obj18 != null ? (sj) obj18 : null;
                sjVar.getClass();
                Object obj19 = list9.get(2);
                Integer num = obj19 != null ? (Integer) obj19 : null;
                num.getClass();
                int intValue = num.intValue();
                Object obj20 = list9.get(3);
                Integer num2 = obj20 != null ? (Integer) obj20 : null;
                num2.getClass();
                int intValue2 = num2.intValue();
                Object obj21 = list9.get(4);
                String str3 = obj21 != null ? (String) obj21 : null;
                str3.getClass();
                switch (sjVar.ordinal()) {
                    case 0:
                        Object obj22 = list9.get(1);
                        ck3 ck3Var = (j42.c(obj22, Boolean.FALSE) || obj22 == null) ? null : (ck3) ((tm1) ea4.g.K).invoke(obj22);
                        ck3Var.getClass();
                        njVar = new nj(str3, intValue, intValue2, ck3Var);
                        break;
                    case 1:
                        Object obj23 = list9.get(1);
                        yt4 yt4Var = (j42.c(obj23, Boolean.FALSE) || obj23 == null) ? null : (yt4) ((tm1) ea4.h.K).invoke(obj23);
                        yt4Var.getClass();
                        njVar = new nj(str3, intValue, intValue2, yt4Var);
                        break;
                    case 2:
                        Object obj24 = list9.get(1);
                        oi5 oi5Var = (j42.c(obj24, Boolean.FALSE) || obj24 == null) ? null : (oi5) ((tm1) ea4.c.K).invoke(obj24);
                        oi5Var.getClass();
                        njVar = new nj(str3, intValue, intValue2, oi5Var);
                        break;
                    case 3:
                        Object obj25 = list9.get(1);
                        mf5 mf5Var = (j42.c(obj25, Boolean.FALSE) || obj25 == null) ? null : (mf5) ((tm1) ea4.d.K).invoke(obj25);
                        mf5Var.getClass();
                        njVar = new nj(str3, intValue, intValue2, mf5Var);
                        break;
                    case 4:
                        Object obj26 = list9.get(1);
                        dk2 dk2Var = (j42.c(obj26, Boolean.FALSE) || obj26 == null) ? null : (dk2) ((tm1) ea4.e.K).invoke(obj26);
                        dk2Var.getClass();
                        njVar = new nj(str3, intValue, intValue2, dk2Var);
                        break;
                    case 5:
                        Object obj27 = list9.get(1);
                        ck2 ck2Var = (j42.c(obj27, Boolean.FALSE) || obj27 == null) ? null : (ck2) ((tm1) ea4.f.K).invoke(obj27);
                        ck2Var.getClass();
                        njVar = new nj(str3, intValue, intValue2, ck2Var);
                        break;
                    case 6:
                        Object obj28 = list9.get(1);
                        String str4 = obj28 != null ? (String) obj28 : null;
                        str4.getClass();
                        njVar = new nj(str3, intValue, intValue2, dx4.a(str4));
                        break;
                    default:
                        s83.v();
                        return null;
                }
                return njVar;
            case 18:
                obj.getClass();
                return new nj2(((Integer) obj).intValue());
            case 19:
                String str5 = obj != null ? (String) obj : null;
                str5.getClass();
                return new oi5(str5);
            case 20:
                String str6 = obj != null ? (String) obj : null;
                str6.getClass();
                return new mf5(str6);
            case 21:
                obj.getClass();
                List list10 = (List) obj;
                Object obj29 = list10.get(0);
                da4 da4Var6 = ea4.q;
                Boolean bool4 = Boolean.FALSE;
                j42.c(obj29, bool4);
                k25 k25Var = obj29 != null ? (k25) da4Var6.J.invoke(obj29) : null;
                k25Var.getClass();
                int i8 = k25Var.a;
                Object obj30 = list10.get(1);
                da4 da4Var7 = ea4.r;
                j42.c(obj30, bool4);
                q35 q35Var = obj30 != null ? (q35) da4Var7.J.invoke(obj30) : null;
                q35Var.getClass();
                int i9 = q35Var.a;
                Object obj31 = list10.get(2);
                q65[] q65VarArr = p65.b;
                da4 da4Var8 = ea4.v;
                j42.c(obj31, bool4);
                p65 p65Var = obj31 != null ? (p65) da4Var8.J.invoke(obj31) : null;
                p65Var.getClass();
                long j4 = p65Var.a;
                Object obj32 = list10.get(3);
                i55 i55Var = i55.c;
                i55 i55Var2 = (j42.c(obj32, bool4) || obj32 == null) ? null : (i55) ((tm1) ea4.l.K).invoke(obj32);
                Object obj33 = list10.get(4);
                vn3 vn3Var = (j42.c(obj33, bool4) || obj33 == null) ? null : (vn3) ((tm1) eu5.z.K).invoke(obj33);
                Object obj34 = list10.get(5);
                pj2 pj2Var = pj2.d;
                pj2 pj2Var2 = (j42.c(obj34, bool4) || obj34 == null) ? null : (pj2) ((tm1) ea4.A.K).invoke(obj34);
                Object obj35 = list10.get(6);
                kj2 kj2Var = (j42.c(obj35, bool4) || obj35 == null) ? null : (kj2) ((tm1) eu5.B.K).invoke(obj35);
                kj2Var.getClass();
                int i10 = kj2Var.a;
                Object obj36 = list10.get(7);
                da4 da4Var9 = ea4.s;
                j42.c(obj36, bool4);
                cw1 cw1Var = obj36 != null ? (cw1) da4Var9.J.invoke(obj36) : null;
                cw1Var.getClass();
                int i11 = cw1Var.a;
                Object obj37 = list10.get(8);
                da daVar = eu5.C;
                if (j42.c(obj37, bool4) || obj37 == null) {
                    i = i8;
                    i2 = i11;
                    i3 = i10;
                    i4 = i9;
                    j = j4;
                    b65Var = null;
                } else {
                    i = i8;
                    i2 = i11;
                    i3 = i10;
                    i4 = i9;
                    j = j4;
                    b65Var = (b65) ((tm1) daVar.K).invoke(obj37);
                }
                return new ck3(i, i4, j, i55Var2, vn3Var, pj2Var2, i3, i2, b65Var);
            case 22:
                obj.getClass();
                List list11 = (List) obj;
                Object obj38 = list11.get(0);
                int i12 = x70.h;
                Boolean bool5 = Boolean.FALSE;
                j42.c(obj38, bool5);
                x70 x70Var2 = obj38 != null ? j42.c(obj38, Boolean.FALSE) ? new x70(x70.g) : new x70(qb.i(((Integer) obj38).intValue())) : null;
                x70Var2.getClass();
                long j5 = x70Var2.a;
                Object obj39 = list11.get(1);
                q65[] q65VarArr2 = p65.b;
                tm1 tm1Var = ea4.v.J;
                j42.c(obj39, bool5);
                p65 p65Var2 = obj39 != null ? (p65) tm1Var.invoke(obj39) : null;
                p65Var2.getClass();
                long j6 = p65Var2.a;
                Object obj40 = list11.get(2);
                qk1 qk1Var = qk1.J;
                qk1 qk1Var2 = (j42.c(obj40, bool5) || obj40 == null) ? null : (qk1) ((tm1) ea4.m.K).invoke(obj40);
                Object obj41 = list11.get(3);
                lk1 lk1Var = (j42.c(obj41, bool5) || obj41 == null) ? null : (lk1) ((tm1) ea4.t.K).invoke(obj41);
                Object obj42 = list11.get(4);
                mk1 mk1Var = (j42.c(obj42, bool5) || obj42 == null) ? null : (mk1) ((tm1) ea4.u.K).invoke(obj42);
                Object obj43 = list11.get(6);
                String str7 = obj43 != null ? (String) obj43 : null;
                Object obj44 = list11.get(7);
                j42.c(obj44, bool5);
                p65 p65Var3 = obj44 != null ? (p65) tm1Var.invoke(obj44) : null;
                p65Var3.getClass();
                long j7 = p65Var3.a;
                Object obj45 = list11.get(8);
                wu wuVar = (j42.c(obj45, bool5) || obj45 == null) ? null : (wu) ((tm1) ea4.n.K).invoke(obj45);
                Object obj46 = list11.get(9);
                h55 h55Var = (j42.c(obj46, bool5) || obj46 == null) ? null : (h55) ((tm1) ea4.k.K).invoke(obj46);
                Object obj47 = list11.get(10);
                tq2 tq2Var = tq2.K;
                tq2 tq2Var2 = (j42.c(obj47, bool5) || obj47 == null) ? null : (tq2) ((tm1) ea4.y.K).invoke(obj47);
                Object obj48 = list11.get(11);
                j42.c(obj48, bool5);
                x70 x70Var3 = obj48 != null ? j42.c(obj48, Boolean.FALSE) ? new x70(x70.g) : new x70(qb.i(((Integer) obj48).intValue())) : null;
                x70Var3.getClass();
                long j8 = x70Var3.a;
                Object obj49 = list11.get(12);
                m35 m35Var = (j42.c(obj49, bool5) || obj49 == null) ? null : (m35) ((tm1) ea4.j.K).invoke(obj49);
                Object obj50 = list11.get(13);
                an4 an4Var = an4.d;
                return new yt4(j5, j6, qk1Var2, lk1Var, mk1Var, null, str7, j7, wuVar, h55Var, tq2Var2, j8, m35Var, (j42.c(obj50, bool5) || obj50 == null) ? null : (an4) ((tm1) ea4.o.K).invoke(obj50), 49184);
            case 23:
                return wd5Var;
            case 24:
                return wd5Var;
            case 25:
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 26:
                return wd5Var;
            case 27:
                return wd5Var;
            case 28:
                jh4 jh4Var = (jh4) obj;
                long j9 = jh4Var.f;
                kt4 kt4Var = jh4Var.h;
                if (kt4Var != null) {
                    kt4Var.d(jh4Var, mw2.m, jh4Var.g);
                }
                long j10 = jh4Var.f;
                if (j9 != j10) {
                    ch4 ch4Var = jh4Var.o;
                    if (ch4Var != null) {
                        long e = ch4Var.e();
                        long j11 = jh4Var.f;
                        if (e > j11) {
                            jh4Var.k();
                        } else {
                            ch4Var.k(j11);
                            if (ch4Var.a() == null) {
                                ch4Var.i(mw2.Q((1.0d - ch4Var.f().a(0)) * jh4Var.f));
                            }
                        }
                    } else if (j10 != 0) {
                        jh4Var.p();
                    }
                }
                return wd5Var;
            default:
                return (Comparable) ((uj3) obj).J;
        }
    }
}

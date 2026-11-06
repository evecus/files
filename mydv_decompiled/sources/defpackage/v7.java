package defpackage;

import android.graphics.Paint;
import android.os.Bundle;
import android.os.SystemClock;
import com.github.mytv.dv.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class v7 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    public /* synthetic */ v7(tm1 tm1Var, tm1 tm1Var2, dl0 dl0Var, t43 t43Var, ki1 ki1Var) {
        this.I = (byte) 11;
        this.J = tm1Var;
        this.K = tm1Var2;
        this.L = dl0Var;
        this.N = t43Var;
        this.M = ki1Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        List list;
        int i;
        int i2;
        byte b = this.I;
        int i3 = 0;
        wd5 wd5Var = wd5.a;
        Object obj2 = this.M;
        Object obj3 = this.N;
        Object obj4 = this.L;
        Object obj5 = this.K;
        Object obj6 = this.J;
        switch (b) {
            case 0:
                p7 p7Var = (p7) obj6;
                p7Var.a = ((gc0) obj5).c((String) obj4, (o7) obj2, new w7((t43) obj3, (byte) 0));
                break;
            case 1:
                ph2 ph2Var = (ph2) obj;
                hh2 hh2Var = ((md) obj5).a;
                ph2Var.h = (d55) obj6;
                ph2Var.i = (mx1) obj4;
                ph2Var.c = (m6) obj2;
                ph2Var.d = (tm1) obj3;
                ph2Var.e = hh2Var != null ? hh2Var.J : null;
                ph2Var.f = hh2Var != null ? hh2Var.K : null;
                ph2Var.g = hh2Var != null ? (gr5) j42.r(hh2Var, hf0.t) : null;
                break;
            case 2:
                vq3 vq3Var = (vq3) obj6;
                vq3Var.a0.addView(vq3Var, vq3Var.b0);
                vq3Var.o((rm1) obj5, (zq3) obj2, (String) obj4, (da2) obj3);
                break;
            case 3:
                List list2 = (List) obj6;
                of2 of2Var = (of2) obj;
                of2Var.getClass();
                of2Var.a0(list2.size(), new ee(new bd0((byte) 24), list2, (byte) 8), new v30(list2, (byte) 5), new tc0(2039820996, new zu1(list2, (ab4) obj5, (List) obj4, (tm1) obj2, (rm1) obj3), true));
                break;
            case 4:
                t43 t43Var = (t43) obj6;
                t43 t43Var2 = (t43) obj5;
                hk3 hk3Var = (hk3) obj4;
                t43 t43Var3 = (t43) obj2;
                if (j42.c(obj, (String) ((t43) obj3).getValue())) {
                    t43Var.setValue(Boolean.FALSE);
                    if (!((Boolean) t43Var2.getValue()).booleanValue()) {
                        hk3Var.i(SystemClock.elapsedRealtime());
                    }
                    t43Var3.setValue(null);
                    t43Var2.setValue(Boolean.TRUE);
                    break;
                }
                break;
            case 5:
                p23 p23Var = (p23) obj6;
                r24 r24Var = (r24) obj5;
                o24 o24Var = (o24) obj4;
                oc4 oc4Var = (oc4) obj2;
                n24 n24Var = (n24) obj3;
                float floatValue = ((Float) obj).floatValue();
                l23 j = p23.j(p23Var.g);
                if (j != null) {
                    g12 g12Var = p23Var.e;
                    long j2 = j.b;
                    long j3 = j.a;
                    ((li5) g12Var.J).a(j2, Float.intBitsToFloat((int) (j3 >> 32)));
                    ((li5) g12Var.K).a(j2, Float.intBitsToFloat((int) (j3 & 4294967295L)));
                    l23 a = ((l23) r24Var.I).a(j);
                    r24Var.I = a;
                    o24Var.I = oc4Var.j(oc4Var.f(a.a));
                    n24Var.I = !jl2.O(r0 - floatValue);
                }
                break;
            case 6:
                ArrayList arrayList = (ArrayList) obj5;
                p24 p24Var = (p24) obj4;
                a73 a73Var = (a73) obj2;
                Bundle bundle = (Bundle) obj3;
                p63 p63Var = (p63) obj;
                p63Var.getClass();
                ((n24) obj6).I = true;
                int indexOf = arrayList.indexOf(p63Var);
                if (indexOf != -1) {
                    int i4 = indexOf + 1;
                    list = arrayList.subList(p24Var.I, i4);
                    p24Var.I = i4;
                } else {
                    list = o91.I;
                }
                a73Var.a(p63Var.J, bundle, p63Var, list);
                break;
            case 7:
                tm1 tm1Var = (tm1) obj6;
                t43 t43Var4 = (t43) obj3;
                t43 t43Var5 = (t43) obj5;
                t43 t43Var6 = (t43) obj4;
                t43 t43Var7 = (t43) obj2;
                int intValue = ((Integer) obj).intValue();
                String str = (String) t43Var4.getValue();
                if (!j42.c(str, "input")) {
                    if (j42.c(str, "confirm") && ((String) t43Var7.getValue()).length() < 4) {
                        t43Var7.setValue(((String) t43Var7.getValue()) + intValue);
                        t43Var6.setValue(Boolean.FALSE);
                        if (((String) t43Var7.getValue()).length() == 4) {
                            if (!j42.c((String) t43Var7.getValue(), (String) t43Var5.getValue())) {
                                t43Var7.setValue("");
                                t43Var6.setValue(Boolean.TRUE);
                                break;
                            } else {
                                tm1Var.invoke((String) t43Var5.getValue());
                                break;
                            }
                        }
                    }
                } else if (((String) t43Var5.getValue()).length() < 4) {
                    t43Var5.setValue(((String) t43Var5.getValue()) + intValue);
                    t43Var6.setValue(Boolean.FALSE);
                    if (((String) t43Var5.getValue()).length() == 4) {
                        t43Var4.setValue("confirm");
                        break;
                    }
                }
                break;
            case 8:
                td3 td3Var = (td3) obj5;
                d55 d55Var = (d55) obj4;
                oh2 oh2Var = (oh2) obj2;
                rt4 rt4Var = (rt4) obj3;
                ya2 ya2Var = (ya2) ((zh0) obj);
                ya2Var.a();
                r10 r10Var = ya2Var.I;
                float h = ((pm0) obj6).c.h();
                if (h != 0.0f) {
                    long j4 = d55Var.b;
                    int i5 = d65.c;
                    int k = td3Var.k((int) (j4 >> 32));
                    v55 d = oh2Var.d();
                    m14 c = d != null ? d.a.c(k) : new m14(0.0f, 0.0f, 0.0f, 0.0f);
                    float floor = (float) Math.floor(ya2Var.P(2.0f));
                    if (floor < 1.0f) {
                        floor = 1.0f;
                    }
                    float f = floor / 2.0f;
                    float f2 = c.a + f;
                    float intBitsToFloat = Float.intBitsToFloat((int) (r10Var.J.H() >> 32)) - f;
                    if (f2 > intBitsToFloat) {
                        f2 = intBitsToFloat;
                    }
                    if (f2 >= f) {
                        f = f2;
                    }
                    float floor2 = ((int) floor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
                    long floatToRawIntBits = (Float.floatToRawIntBits(floor2) << 32) | (Float.floatToRawIntBits(c.b) & 4294967295L);
                    long floatToRawIntBits2 = (Float.floatToRawIntBits(floor2) << 32) | (Float.floatToRawIntBits(c.d) & 4294967295L);
                    o10 o10Var = r10Var.I.c;
                    pd pdVar = r10Var.L;
                    if (pdVar == null) {
                        pdVar = i42.U();
                        pdVar.m(1);
                        r10Var.L = pdVar;
                    }
                    Paint paint = pdVar.a;
                    rt4Var.a(h, r10Var.J.H(), pdVar);
                    if (!j42.c(pdVar.d, null)) {
                        pdVar.g(null);
                    }
                    if (pdVar.b != 3) {
                        pdVar.e(3);
                    }
                    if (paint.getStrokeWidth() != floor) {
                        pdVar.l(floor);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (pdVar.b() == 0) {
                        i = 0;
                    } else {
                        i = 0;
                        pdVar.j(0);
                    }
                    if (pdVar.c() != 0) {
                        pdVar.k(i);
                    }
                    if (!paint.isFilterBitmap()) {
                        pdVar.h(1);
                    }
                    o10Var.a(floatToRawIntBits, floatToRawIntBits2, pdVar);
                    break;
                } else {
                    break;
                }
            case 9:
                List list3 = (List) obj6;
                dl0 dl0Var = (dl0) obj5;
                tm1 tm1Var2 = (tm1) obj4;
                hu2 hu2Var = (hu2) obj2;
                t43 t43Var8 = (t43) obj3;
                String str2 = (String) obj;
                str2.getClass();
                Iterator it = list3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                    } else if (j42.c(((Aweme) it.next()).getAwemeId(), str2)) {
                        i2 = i3;
                    } else {
                        i3++;
                    }
                }
                if (i2 >= 0) {
                    if (i2 >= list3.size() - 1) {
                        if (tm1Var2 != null) {
                            t43Var8.setValue(str2);
                            tm1Var2.invoke(Integer.valueOf(i2));
                            break;
                        }
                    } else {
                        p70.g0(dl0Var, null, null, new dq1(hu2Var, list3, i2, null, (byte) 3), 3);
                        break;
                    }
                }
                break;
            case 10:
                String str3 = (String) obj;
                str3.getClass();
                p70.g0((dl0) obj6, null, null, new lj5((is0) obj5, (zd1) obj4, str3, (hu2) obj2, (t43) obj3, null), 3);
                break;
            default:
                tm1 tm1Var3 = (tm1) obj6;
                Aweme aweme = (Aweme) obj;
                aweme.getClass();
                on5.L((tm1) obj5, (dl0) obj4, (t43) obj3, (ki1) obj2, false);
                if (tm1Var3 != null) {
                    tm1Var3.invoke(aweme);
                    break;
                }
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ v7(tm1 tm1Var, t43 t43Var, t43 t43Var2, t43 t43Var3, t43 t43Var4) {
        this.I = (byte) 7;
        this.J = tm1Var;
        this.N = t43Var;
        this.K = t43Var2;
        this.L = t43Var3;
        this.M = t43Var4;
    }

    public /* synthetic */ v7(t43 t43Var, t43 t43Var2, t43 t43Var3, hk3 hk3Var, t43 t43Var4) {
        this.I = (byte) 4;
        this.N = t43Var;
        this.J = t43Var2;
        this.K = t43Var3;
        this.L = hk3Var;
        this.M = t43Var4;
    }

    public /* synthetic */ v7(vq3 vq3Var, rm1 rm1Var, zq3 zq3Var, String str, da2 da2Var) {
        this.I = (byte) 2;
        this.J = vq3Var;
        this.K = rm1Var;
        this.M = zq3Var;
        this.L = str;
        this.N = da2Var;
    }

    public /* synthetic */ v7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
        this.L = obj3;
        this.M = obj4;
        this.N = obj5;
    }
}

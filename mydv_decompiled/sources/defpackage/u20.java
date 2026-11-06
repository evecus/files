package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import com.github.mytv.dv.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class u20 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ u20(t43 t43Var, hk3 hk3Var, t43 t43Var2, hk3 hk3Var2) {
        this.I = (byte) 11;
        this.J = t43Var;
        this.L = hk3Var;
        this.K = t43Var2;
        this.M = hk3Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wm3 wm3Var = wm3.J;
        wm3 wm3Var2 = wm3.I;
        byte b2 = 3;
        byte b3 = 0;
        int i = 0;
        fj0 fj0Var = null;
        wd5 wd5Var = wd5.a;
        byte b4 = 1;
        Object obj2 = this.M;
        Object obj3 = this.K;
        Object obj4 = this.L;
        Object obj5 = this.J;
        switch (b) {
            case 0:
                String str = (String) obj;
                str.getClass();
                Boolean bool = Boolean.FALSE;
                ((t43) obj5).setValue(bool);
                qg5.p((t43) obj3, true);
                ((t43) obj4).setValue(bool);
                ((t43) obj2).setValue(str);
                return wd5Var;
            case 1:
                oh2 oh2Var = (oh2) obj5;
                j55 j55Var = (j55) obj3;
                d55 d55Var = (d55) obj4;
                mx1 mx1Var = (mx1) obj2;
                if (oh2Var.b()) {
                    g12 g12Var = oh2Var.d;
                    xj0 xj0Var = oh2Var.v;
                    xj0 xj0Var2 = oh2Var.w;
                    r24 r24Var = new r24();
                    m6 m6Var = new m6((Object) g12Var, (Object) xj0Var, (Object) r24Var, (byte) 26);
                    jo3 jo3Var = j55Var.a;
                    jo3Var.e(d55Var, mx1Var, m6Var, xj0Var2);
                    m55 m55Var = new m55(j55Var, jo3Var);
                    j55Var.b.set(m55Var);
                    r24Var.I = m55Var;
                    oh2Var.e = m55Var;
                }
                return new me((byte) 1);
            case 2:
                hu2 hu2Var = (hu2) obj4;
                t43 t43Var = (t43) obj5;
                t43 t43Var2 = (t43) obj3;
                String str2 = (String) obj;
                str2.getClass();
                wm4 wm4Var = hu2Var.h;
                String str3 = ((dl4) obj2).a;
                if (!wm4Var.B(str3, str2)) {
                    return wm3Var;
                }
                hu2Var.H(str3);
                t43Var.setValue(null);
                t43Var2.setValue(Boolean.FALSE);
                return wm3Var2;
            case 3:
                g02 g02Var = (g02) obj3;
                o24 o24Var = (o24) obj4;
                dl0 dl0Var = (dl0) obj2;
                long longValue = ((Long) obj).longValue();
                cw4 cw4Var = (cw4) ((t43) obj5).getValue();
                long longValue2 = cw4Var != null ? ((Number) cw4Var.getValue()).longValue() : longValue;
                long j = g02Var.c;
                b53 b53Var = g02Var.a;
                if (j == Long.MIN_VALUE || o24Var.I != ad4.r(dl0Var.getCoroutineContext())) {
                    g02Var.c = longValue;
                    Object[] objArr = b53Var.I;
                    int i2 = b53Var.K;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((e02) objArr[i3]).N = true;
                    }
                    o24Var.I = ad4.r(dl0Var.getCoroutineContext());
                }
                float f = o24Var.I;
                if (f == 0.0f) {
                    Object[] objArr2 = b53Var.I;
                    int i4 = b53Var.K;
                    while (b3 < i4) {
                        e02 e02Var = (e02) objArr2[b3];
                        e02Var.K.setValue(e02Var.L.c);
                        e02Var.N = true;
                        b3++;
                    }
                } else {
                    long j2 = (long) ((longValue2 - g02Var.c) / f);
                    Object[] objArr3 = b53Var.I;
                    int i5 = b53Var.K;
                    boolean z = true;
                    for (int i6 = 0; i6 < i5; i6++) {
                        e02 e02Var2 = (e02) objArr3[i6];
                        boolean z2 = e02Var2.M;
                        if (!z2) {
                            e02Var2.P.b.setValue(Boolean.FALSE);
                            if (e02Var2.N) {
                                e02Var2.N = false;
                                e02Var2.O = j2;
                            }
                            long j3 = j2 - e02Var2.O;
                            e02Var2.K.setValue(e02Var2.L.f(j3));
                            z2 = r7.a(e02Var2.L, j3);
                            e02Var2.M = z2;
                        }
                        if (!z2) {
                            z = false;
                        }
                    }
                    g02Var.d.setValue(Boolean.valueOf(!z));
                }
                return wd5Var;
            case 4:
                List list = (List) obj5;
                p24 p24Var = (p24) obj3;
                List list2 = (List) obj4;
                ld2 ld2Var = (ld2) obj2;
                ms3 ms3Var = (ms3) obj;
                uy4 uy4Var = ms3Var.e;
                int c = uy4Var != null ? uy4Var.c() : 0;
                int i7 = 0;
                for (int i8 = 0; i8 < c; i8++) {
                    pg3 pg3Var = ld2Var.r;
                    uy4 uy4Var2 = ms3Var.e;
                    i7 += (int) (pg3Var == pg3.I ? (uy4Var2 != null ? uy4Var2.b(i8) : 0L) & 4294967295L : (uy4Var2 != null ? uy4Var2.b(i8) : 0L) >> 32);
                }
                if (list != null) {
                    list.add(Integer.valueOf(i7));
                }
                if (p24Var.I != list2.size()) {
                    p24Var.I++;
                }
                return wd5Var;
            case 5:
                o24 o24Var2 = (o24) obj5;
                p23 p23Var = (p23) obj3;
                mc4 mc4Var = (mc4) obj4;
                v7 v7Var = (v7) obj2;
                aj ajVar = (aj) obj;
                float floatValue = ((Number) ajVar.e.getValue()).floatValue() - o24Var2.I;
                if (!jl2.O(floatValue)) {
                    if (!jl2.O(floatValue - p23Var.d(mc4Var, floatValue))) {
                        ajVar.a();
                        return wd5Var;
                    }
                    o24Var2.I += floatValue;
                }
                if (((Boolean) v7Var.invoke(Float.valueOf(o24Var2.I))).booleanValue()) {
                    ajVar.a();
                }
                return wd5Var;
            case 6:
                hu2 hu2Var2 = (hu2) obj3;
                rm1 rm1Var = (rm1) obj2;
                t43 t43Var3 = (t43) obj5;
                String str4 = (String) obj;
                str4.getClass();
                wm4 wm4Var2 = hu2Var2.h;
                String str5 = ((dl4) obj4).a;
                if (!wm4Var2.B(str5, str4)) {
                    return wm3Var;
                }
                hu2Var2.H(str5);
                t43Var3.setValue(null);
                rm1Var.invoke();
                return wm3Var2;
            case 7:
                cw4 cw4Var2 = (cw4) obj5;
                hu2 hu2Var3 = (hu2) obj3;
                cw4 cw4Var3 = (cw4) obj4;
                cw4 cw4Var4 = (cw4) obj2;
                of2 of2Var = (of2) obj;
                of2Var.getClass();
                if (!((List) cw4Var2.getValue()).isEmpty()) {
                    of2Var.Z("history", "history", new tc0(1649847690, new ie4(hu2Var3, cw4Var2, b3), true));
                }
                if (!((List) cw4Var3.getValue()).isEmpty()) {
                    of2Var.Z("hot-search", "hot-search", new tc0(-1340776845, new ie4(hu2Var3, cw4Var3, b4), true));
                }
                if (!((List) cw4Var4.getValue()).isEmpty()) {
                    of2Var.Z("suggest-words", "suggest-words", new tc0(-1768046574, new ie4(hu2Var3, cw4Var4, (byte) 2), true));
                }
                if (((List) cw4Var3.getValue()).isEmpty() && ((List) cw4Var4.getValue()).isEmpty()) {
                    of2Var.Z("fallback-tags", "fallback-tags", new tc0(2099650993, new co(hu2Var3, b4), true));
                }
                return wd5Var;
            case 8:
                is0 is0Var = (is0) obj5;
                String str6 = (String) obj;
                str6.getClass();
                p70.g0((dl0) obj3, null, null, new ag5((hu2) obj4, str6, is0Var.d.b.h() + 1, (List) obj2, is0Var, null), 3);
                return wd5Var;
            case 9:
                dl0 dl0Var2 = (dl0) obj4;
                zd1 zd1Var = (zd1) obj2;
                t43 t43Var4 = (t43) obj5;
                t43 t43Var5 = (t43) obj3;
                String str7 = (String) obj;
                str7.getClass();
                Iterator it = ((List) t43Var4.getValue()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                    } else if (!j42.c(((Aweme) it.next()).getAwemeId(), str7)) {
                        i++;
                    }
                }
                if (i >= 0) {
                    if (i < p70.X((List) t43Var4.getValue())) {
                        p70.g0(dl0Var2, null, null, new ou(zd1Var, i, fj0Var, b2), 3);
                    } else {
                        t43Var5.setValue(str7);
                        zd1Var.d(i);
                    }
                }
                return wd5Var;
            case 10:
                ((ay0) obj).getClass();
                return new hn5((hk3) obj3, (hn1) obj4, (Aweme) obj2, (t43) obj5);
            default:
                hk3 hk3Var = (hk3) obj4;
                t43 t43Var6 = (t43) obj3;
                hk3 hk3Var2 = (hk3) obj2;
                long longValue3 = ((Long) obj).longValue();
                ExoPlayer exoPlayer = (ExoPlayer) ((t43) obj5).getValue();
                if (exoPlayer != null) {
                    exoPlayer.seekTo(longValue3);
                }
                on5.R(hk3Var, longValue3);
                t43Var6.setValue(null);
                on5.T(hk3Var2, 0L);
                return wd5Var;
        }
    }

    public /* synthetic */ u20(byte b, t43 t43Var, Object obj, Object obj2, Object obj3) {
        this.I = b;
        this.K = obj;
        this.L = obj2;
        this.M = obj3;
        this.J = t43Var;
    }

    public /* synthetic */ u20(Object obj, Object obj2, t43 t43Var, t43 t43Var2, byte b) {
        this.I = b;
        this.L = obj;
        this.M = obj2;
        this.J = t43Var;
        this.K = t43Var2;
    }

    public /* synthetic */ u20(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
        this.L = obj3;
        this.M = obj4;
    }

    public /* synthetic */ u20(ArrayList arrayList, p24 p24Var, List list, int i, ld2 ld2Var) {
        this.I = (byte) 4;
        this.J = arrayList;
        this.K = p24Var;
        this.L = list;
        this.M = ld2Var;
    }
}

package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gn2 implements tm1 {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ t43 J;
    public final /* synthetic */ t43 K;
    public final /* synthetic */ t43 L;
    public final /* synthetic */ t43 M;
    public final /* synthetic */ t43 N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ gn2(hu2 hu2Var, dl4 dl4Var, fl4 fl4Var, t43 t43Var, t43 t43Var2, t43 t43Var3, t43 t43Var4, t43 t43Var5) {
        this.O = hu2Var;
        this.P = dl4Var;
        this.Q = fl4Var;
        this.J = t43Var;
        this.K = t43Var2;
        this.L = t43Var3;
        this.M = t43Var4;
        this.N = t43Var5;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        Object obj2;
        String str;
        String str2;
        String str3;
        long duration;
        long j;
        Long valueOf;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.M;
        t43 t43Var2 = this.L;
        t43 t43Var3 = this.N;
        t43 t43Var4 = this.K;
        t43 t43Var5 = this.J;
        Object obj3 = this.Q;
        Object obj4 = this.P;
        Object obj5 = this.O;
        switch (b) {
            case 0:
                String str4 = (String) obj;
                str4.getClass();
                un2.g((List) obj5, this.J, (s33) obj3, this.K, this.L, this.M, this.N, (t43) obj4, ho2.K, str4);
                return wd5Var;
            case 1:
                hu2 hu2Var = (hu2) obj5;
                fl4 fl4Var = (fl4) obj3;
                String str5 = (String) obj;
                str5.getClass();
                wm4 wm4Var = hu2Var.h;
                String str6 = ((dl4) obj4).a;
                if (!wm4Var.B(str6, str5)) {
                    return wm3.J;
                }
                hu2Var.H(str6);
                Iterator it = ((Iterable) ((fw4) fl4Var.h0.I).getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (j42.c(((dl4) obj2).a, str6)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                dl4 dl4Var = (dl4) obj2;
                String str7 = "";
                if (dl4Var == null || (str = dl4Var.b) == null) {
                    str = "";
                }
                t43Var5.setValue(str);
                if (dl4Var == null || (str2 = dl4Var.c) == null) {
                    str2 = "";
                }
                t43Var4.setValue(str2);
                if (dl4Var != null && (str3 = dl4Var.f) != null) {
                    str7 = str3;
                }
                t43Var2.setValue(str7);
                qm4.m(t43Var, true);
                t43Var3.setValue(null);
                return wm3.I;
            default:
                hk3 hk3Var = (hk3) obj5;
                fk3 fk3Var = (fk3) t43Var3;
                hk3 hk3Var2 = (hk3) obj4;
                hk3 hk3Var3 = (hk3) obj3;
                long longValue = ((Long) obj).longValue();
                ExoPlayer exoPlayer = (ExoPlayer) t43Var5.getValue();
                if (exoPlayer != null) {
                    Long l = (Long) t43Var4.getValue();
                    long longValue2 = l != null ? l.longValue() : exoPlayer.getCurrentPosition();
                    if (hk3Var.h() > 0) {
                        duration = hk3Var.h();
                    } else {
                        duration = exoPlayer.getDuration();
                        if (duration < 0) {
                            duration = 0;
                        }
                    }
                    if (longValue <= 0 || duration <= 0) {
                        j = longValue2 + longValue;
                        if (j < 0) {
                            j = 0;
                        }
                    } else {
                        j = longValue2 + longValue;
                        if (j > duration) {
                            j = duration;
                        }
                    }
                    if (duration > 0) {
                        if (j > duration) {
                            j = duration;
                        }
                        valueOf = Long.valueOf(j);
                    } else {
                        valueOf = Long.valueOf(j);
                    }
                    t43Var4.setValue(valueOf);
                    if (duration > 0) {
                        ((Long) t43Var4.getValue()).getClass();
                        fk3Var.i(r6.longValue() / duration);
                    }
                    hk3Var2.i(System.currentTimeMillis());
                    t43Var2.setValue(Boolean.TRUE);
                    on5.T(hk3Var3, hk3Var3.h() + longValue);
                    long h = hk3Var3.h() / 1000;
                    StringBuilder sb = h > 0 ? new StringBuilder("+") : new StringBuilder();
                    sb.append(h);
                    sb.append(CmcdData.STREAMING_FORMAT_SS);
                    t43Var.setValue(sb.toString());
                }
                return wd5Var;
        }
    }

    public /* synthetic */ gn2(t43 t43Var, t43 t43Var2, hk3 hk3Var, fk3 fk3Var, hk3 hk3Var2, t43 t43Var3, hk3 hk3Var3, t43 t43Var4) {
        this.J = t43Var;
        this.K = t43Var2;
        this.O = hk3Var;
        this.N = fk3Var;
        this.P = hk3Var2;
        this.L = t43Var3;
        this.Q = hk3Var3;
        this.M = t43Var4;
    }

    public /* synthetic */ gn2(List list, t43 t43Var, s33 s33Var, t43 t43Var2, t43 t43Var3, t43 t43Var4, t43 t43Var5, t43 t43Var6) {
        this.O = list;
        this.J = t43Var;
        this.Q = s33Var;
        this.K = t43Var2;
        this.L = t43Var3;
        this.M = t43Var4;
        this.N = t43Var5;
        this.P = t43Var6;
    }
}

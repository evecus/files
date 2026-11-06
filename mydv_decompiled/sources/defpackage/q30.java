package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import com.github.mytv.dv.MainActivity;
import com.github.mytv.dv.model.MixInfo;
import com.whl.quickjs.wrapper.QuickJSContext;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class q30 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q30(byte b, fj0 fj0Var, Object obj, Object obj2, Object obj3, boolean z) {
        super(2, fj0Var);
        this.I = b;
        this.K = obj;
        this.J = obj2;
        this.L = obj3;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.K;
        Object obj3 = this.L;
        switch (b) {
            case 0:
                return new q30(this.J, (t43) obj2, obj3, fj0Var, (byte) 0);
            case 1:
                return new q30(this.J, obj3, obj2, fj0Var, (byte) 1);
            case 2:
                q30 q30Var = new q30((String) obj3, (String) obj2, fj0Var);
                q30Var.J = obj;
                return q30Var;
            case 3:
                q30 q30Var2 = new q30((t33) obj2, (q82) obj3, fj0Var, (byte) 3);
                q30Var2.J = obj;
                return q30Var2;
            case 4:
                return new q30(this.J, obj3, obj2, fj0Var, (byte) 4);
            case 5:
                q30 q30Var3 = new q30((cq2) obj2, (h00) obj3, fj0Var, (byte) 5);
                q30Var3.J = obj;
                return q30Var3;
            case 6:
                q30 q30Var4 = new q30((xp3) obj2, (s35) obj3, fj0Var, (byte) 6);
                q30Var4.J = obj;
                return q30Var4;
            case 7:
                return new q30(this.J, (t43) obj2, obj3, fj0Var, (byte) 7);
            case 8:
                return new q30((byte) 8, fj0Var, (t43) obj2, (t43) this.J, (t43) obj3, false);
            case 9:
                return new q30(this.J, (t43) obj2, obj3, fj0Var, (byte) 9);
            case 10:
                return new q30((byte) 10, fj0Var, (List) obj2, (hu2) this.J, (ow3) obj3, false);
            default:
                return new q30(this.J, obj3, obj2, fj0Var, (byte) 11);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                ((q30) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                return wd5Var;
            case 1:
                ((q30) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                return wd5Var;
            case 2:
                return ((q30) create((j43) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 3:
                ((q30) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                return wd5Var;
            case 4:
                ((q30) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                return wd5Var;
            case 5:
                ((q30) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                return wd5Var;
            case 6:
                return ((q30) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 7:
                ((q30) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                return wd5Var;
            case 8:
                ((q30) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                return wd5Var;
            case 9:
                ((q30) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                return wd5Var;
            case 10:
                ((q30) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                return wd5Var;
            default:
                return ((q30) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
        }
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object g54Var;
        int i = 0;
        int i2 = 0;
        r3 = false;
        boolean z = false;
        byte b = 1;
        fj0 fj0Var = null;
        switch (this.I) {
            case 0:
                wd5 wd5Var = wd5.a;
                mu0.V(obj);
                t43 t43Var = (t43) this.K;
                List list = (List) t43Var.getValue();
                String str = (String) this.L;
                Iterator it = list.iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                    } else if (!j42.c(((b50) it.next()).b, str)) {
                        i3++;
                    }
                }
                if (i3 >= 0) {
                    while (i < 3 && i3 < ((List) t43Var.getValue()).size()) {
                        b50 b50Var = (b50) ((List) t43Var.getValue()).get(i3);
                        if (!b50Var.f || !b50Var.c.isEmpty()) {
                            ((hu2) this.J).m.u(i3);
                            i++;
                        }
                        i3++;
                    }
                }
                return wd5Var;
            case 1:
                mu0.V(obj);
                gk3 gk3Var = (gk3) ((s33) this.L);
                int min = Math.min(gk3Var.h() + 3, ((List) ((t43) this.K).getValue()).size());
                for (int h = gk3Var.h(); h < min; h++) {
                    ((hu2) this.J).m.u(h);
                }
                return wd5.a;
            case 2:
                mu0.V(obj);
                j43 j43Var = (j43) this.J;
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(j43Var.a);
                unmodifiableMap.getClass();
                j43 j43Var2 = new j43(new LinkedHashMap(unmodifiableMap), false);
                String str2 = (String) this.L;
                String str3 = (String) this.K;
                bs3 bs3Var = yp1.g;
                bs3Var.getClass();
                Set set = (Set) j43Var.a.get(bs3Var);
                if (set == null) {
                    set = t91.I;
                }
                j43Var2.a(bs3Var, zk4.v(set, str2));
                up1 up1Var = yp1.d;
                d82[] d82VarArr = up1.a;
                up1Var.getClass();
                j43Var2.a(up1.c(str2), str3);
                return j43Var2.b();
            case 3:
                dl0 dl0Var = (dl0) this.J;
                mu0.V(obj);
                t33 t33Var = (t33) this.K;
                q82 q82Var = (q82) this.L;
                p70.g0(dl0Var, null, null, new p82(t33Var, q82Var, fj0Var, i == true ? (byte) 1 : (byte) 0), 3);
                p70.g0(dl0Var, null, null, new p82(t33Var, q82Var, fj0Var, b), 3);
                return wd5.a;
            case 4:
                mu0.V(obj);
                if (((Map) ((cw4) this.L).getValue()).isEmpty() && !((Boolean) ((t43) this.K).getValue()).booleanValue()) {
                    ((op2) this.J).s();
                }
                return wd5.a;
            case 5:
                wd5 wd5Var2 = wd5.a;
                mu0.V(obj);
                try {
                    ((cq2) this.K).d(((h00) this.L).r());
                    g54Var = wd5Var2;
                } catch (Throwable th) {
                    g54Var = new g54(th);
                }
                Throwable a = h54.a(g54Var);
                if (a != null) {
                    Log.e("LiveWebSocket", "Failed to decode live message", a);
                }
                return wd5Var2;
            case 6:
                mu0.V(obj);
                dl0 dl0Var2 = (dl0) this.J;
                gl0 gl0Var = gl0.L;
                xp3 xp3Var = (xp3) this.K;
                s35 s35Var = (s35) this.L;
                p70.g0(dl0Var2, null, gl0Var, new gk0(xp3Var, s35Var, fj0Var, b), 1);
                return p70.g0(dl0Var2, null, gl0Var, new gk0(xp3Var, s35Var, fj0Var, (byte) 2), 1);
            case 7:
                mu0.V(obj);
                t43 t43Var2 = (t43) this.K;
                lt2 lt2Var = MainActivity.Companion;
                on onVar = (on) t43Var2.getValue();
                t43 t43Var3 = (t43) this.L;
                if (onVar != ((on) t43Var3.getValue())) {
                    t43Var3.setValue((on) t43Var2.getValue());
                    ((MainActivity) this.J).recreate();
                }
                return wd5.a;
            case 8:
                t43 t43Var4 = (t43) this.L;
                mu0.V(obj);
                t43 t43Var5 = (t43) this.K;
                lt2 lt2Var2 = MainActivity.Companion;
                if (((r34) t43Var5.getValue()) != null && ((Boolean) ((t43) this.J).getValue()).booleanValue()) {
                    r34 r34Var = (r34) t43Var5.getValue();
                    r34Var.getClass();
                    p34 p34Var = r34Var.b;
                    if (p34Var != null) {
                        if (p34Var.i) {
                            t43Var4.setValue(Boolean.TRUE);
                        } else {
                            OkHttpClient okHttpClient = t34.a;
                            String str4 = p34Var.a;
                            SharedPreferences sharedPreferences = t34.i;
                            if (sharedPreferences == null) {
                                j42.g0("prefs");
                                throw null;
                            }
                            if (!j42.c(sharedPreferences.getString("last_announcement_id", ""), str4)) {
                                t43Var4.setValue(Boolean.TRUE);
                            }
                        }
                    }
                }
                return wd5.a;
            case 9:
                mu0.V(obj);
                t43 t43Var6 = (t43) this.K;
                k74 k74Var = w03.a;
                if (!((List) t43Var6.getValue()).isEmpty()) {
                    gx3 gx3Var = ((hu2) this.J).p;
                    boolean z2 = ((y03) ((t43) this.L).getValue()) == y03.K;
                    fw4 fw4Var = gx3Var.J0;
                    MixInfo mixInfo = (MixInfo) gx3Var.H0.getValue();
                    if (mixInfo != null && !((List) fw4Var.getValue()).isEmpty()) {
                        int max = Math.max(mixInfo.getStatis().getTotalEpisode(), Math.max(mixInfo.getStatis().getUpdatedToEpisode(), mixInfo.getStatis().getCurrentEpisode()));
                        if (z2 && max > 20) {
                            z = true;
                        }
                        if (z != gx3Var.R0) {
                            fw4Var.i(null, o91.I);
                            gx3Var.N0.i(null, p91.I);
                            gx3Var.P0 = 0L;
                            gx3Var.Q0 = true;
                            gx3.D(gx3Var, z2, 1);
                        }
                    }
                }
                return wd5.a;
            case 10:
                mu0.V(obj);
                List list2 = (List) this.K;
                ow3 ow3Var = (ow3) this.L;
                if (!list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (((ow3) it2.next()) == ow3Var) {
                            return wd5.a;
                        }
                    }
                }
                ((hu2) this.J).p.d.c("works", "profile.currentTab");
                return wd5.a;
            default:
                mu0.V(obj);
                QuickJSContext quickJSContext = ((no4) this.J).e;
                if (quickJSContext == null) {
                    zy.i("QuickJSContext is null");
                    return null;
                }
                no4 no4Var = (no4) this.J;
                String str5 = (String) this.L;
                no4Var.getClass();
                String x = qx4.x(qx4.x(str5, "\\", "\\\\", false), "'", "\\'", false);
                no4 no4Var2 = (no4) this.J;
                String str6 = (String) this.K;
                no4Var2.getClass();
                String x2 = hf1.x("getMSSDKSignature('", x, "', '", qx4.x(qx4.x(str6, "\\", "\\\\", false), "'", "\\'", false), "')");
                Object evaluate = quickJSContext.evaluate(x2);
                String str7 = evaluate instanceof String ? (String) evaluate : null;
                if (str7 == null) {
                    str7 = "";
                }
                while (true) {
                    if (!jx4.E(str7, '-') && !jx4.E(str7, '=')) {
                        if (jx4.L(str7)) {
                            zy.i("Failed to generate Douyin signature");
                            return null;
                        }
                        Log.d("SignJs", "Generated live signature: length=" + str7.length() + ", retries=" + i2);
                        return str7;
                    }
                    i2++;
                    Object evaluate2 = quickJSContext.evaluate(x2);
                    str7 = evaluate2 instanceof String ? (String) evaluate2 : null;
                    if (str7 == null) {
                        str7 = "";
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q30(Object obj, t43 t43Var, Object obj2, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.J = obj;
        this.K = t43Var;
        this.L = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q30(Object obj, Object obj2, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = obj;
        this.L = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q30(Object obj, Object obj2, Object obj3, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.J = obj;
        this.L = obj2;
        this.K = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q30(String str, String str2, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 2;
        this.L = str;
        this.K = str2;
    }
}

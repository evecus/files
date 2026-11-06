package defpackage;

import android.content.Context;
import android.os.SystemClock;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zt1 implements tm1 {
    public final /* synthetic */ byte I = 0;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;

    public /* synthetic */ zt1(dl0 dl0Var, t43 t43Var, List list, hu2 hu2Var, tm1 tm1Var, t43 t43Var2, t43 t43Var3) {
        this.K = dl0Var;
        this.J = t43Var;
        this.M = list;
        this.L = hu2Var;
        this.P = tm1Var;
        this.N = t43Var2;
        this.O = t43Var3;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        byte b2 = 7;
        byte b3 = 1;
        wd5 wd5Var = wd5.a;
        Object obj2 = this.O;
        Object obj3 = this.M;
        Object obj4 = this.N;
        Object obj5 = this.L;
        Object obj6 = this.J;
        Object obj7 = this.P;
        Object obj8 = this.K;
        switch (b) {
            case 0:
                ab4 ab4Var = (ab4) obj8;
                hu2 hu2Var = (hu2) obj5;
                Context context = (Context) obj3;
                t43 t43Var = (t43) obj6;
                t43 t43Var2 = (t43) obj4;
                hk3 hk3Var = (hk3) obj7;
                t43 t43Var3 = (t43) obj2;
                ab4 ab4Var2 = (ab4) obj;
                if (ab4Var2 != null) {
                    int ordinal = ab4Var2.ordinal();
                    ab4 ab4Var3 = ab4.P;
                    boolean z = ordinal == 5 ? ab4Var == ab4.N || ab4Var == ab4.O : ordinal == 7 ? ab4Var == ab4Var3 || ab4Var == ab4.R || ab4Var == ab4.S : ab4Var == ab4Var2;
                    if (ab4Var2 == ab4Var3) {
                        hu2Var.y();
                    }
                    i42.K(ab4Var, hu2Var, t43Var, t43Var2, hk3Var, t43Var3, z, 128);
                    i42.P(ab4Var, hu2Var, t43Var3, ab4Var2);
                    break;
                } else {
                    i42.L(context);
                    break;
                }
                break;
            case 1:
                pq5 pq5Var = (pq5) obj8;
                xp3 xp3Var = (xp3) obj5;
                rm1 rm1Var = (rm1) obj3;
                rm1 rm1Var2 = (rm1) obj4;
                rm1 rm1Var3 = (rm1) obj2;
                t43 t43Var4 = (t43) obj6;
                rm1 rm1Var4 = (rm1) obj7;
                pd3 pd3Var = (pd3) obj;
                pq5Var.getClass();
                if (SystemClock.uptimeMillis() >= pq5Var.c) {
                    float f = (int) (((r05) xp3Var).S >> 32);
                    if (f > 0.0f) {
                        if (Float.intBitsToFloat((int) (pd3Var.a >> 32)) < f / 3.0f && rm1Var2 != null) {
                            rm1Var2.invoke();
                            break;
                        } else if (Float.intBitsToFloat((int) (pd3Var.a >> 32)) > (f * 2.0f) / 3.0f && rm1Var3 != null) {
                            rm1Var3.invoke();
                            break;
                        } else if (((String) t43Var4.getValue()) == null) {
                            if (rm1Var != null) {
                                rm1Var.invoke();
                                break;
                            }
                        } else if (rm1Var4 != null) {
                            rm1Var4.invoke();
                            break;
                        }
                    } else if (((String) t43Var4.getValue()) == null) {
                        if (rm1Var != null) {
                            rm1Var.invoke();
                            break;
                        }
                    } else if (rm1Var4 != null) {
                        rm1Var4.invoke();
                        break;
                    }
                }
                break;
            case 2:
                dl0 dl0Var = (dl0) obj8;
                t43 t43Var5 = (t43) obj6;
                List list = (List) obj3;
                hu2 hu2Var2 = (hu2) obj5;
                tm1 tm1Var = (tm1) obj7;
                t43 t43Var6 = (t43) obj4;
                t43 t43Var7 = (t43) obj2;
                int intValue = ((Integer) obj).intValue();
                if (!((Boolean) t43Var5.getValue()).booleanValue()) {
                    p70.g0(dl0Var, null, null, new v03(list, hu2Var2, intValue, tm1Var, t43Var5, t43Var6, t43Var7, null), 3);
                    break;
                }
                break;
            case 3:
                of2 of2Var = (of2) obj;
                of2Var.getClass();
                List list2 = (List) ((t43) obj6).getValue();
                of2Var.a0(list2.size(), new ee(new zw1((byte) 21), list2, (byte) 16), new v30(list2, (byte) 10), new tc0(2039820996, new mu3(list2, (ki1) obj8, (hu2) obj5, (rm1) obj3, (cw4) obj7, (t43) obj4), true));
                i82.M(of2Var, "add_config", new tc0(303989572, new j10(obj2, (byte) 8), true), 2);
                break;
            case 4:
                List list3 = (List) obj8;
                gu3 gu3Var = (gu3) obj5;
                ki1 ki1Var = (ki1) obj3;
                ki1 ki1Var2 = (ki1) obj6;
                List list4 = (List) obj4;
                tm1 tm1Var2 = (tm1) obj2;
                rm1 rm1Var5 = (rm1) obj7;
                of2 of2Var2 = (of2) obj;
                of2Var2.getClass();
                if (list3.isEmpty()) {
                    of2Var2.Z("empty", "empty", new tc0(190517203, new a91(ki1Var, ki1Var2, b2), true));
                } else {
                    of2Var2.a0(list3.size(), new ee(new ka2(list4, b3), list3, (byte) 18), new v30(list3, (byte) 12), new tc0(2039820996, new hw3(list3, tm1Var2, ki1Var2, ki1Var), true));
                }
                if (gu3Var.a || gu3Var.b) {
                    of2Var2.Z("listPagingFooter", "paging", new tc0(67098044, new pv0(list3, gu3Var, rm1Var5, (byte) 4), true));
                    break;
                }
                break;
            default:
                hk3 hk3Var2 = (hk3) obj5;
                t43 t43Var8 = (t43) obj4;
                hk3 hk3Var3 = (hk3) obj3;
                t43 t43Var9 = (t43) obj2;
                float floatValue = ((Float) obj).floatValue();
                ((fk3) obj8).i(floatValue);
                long h = (long) (floatValue * ((hk3) obj7).h());
                ExoPlayer exoPlayer = (ExoPlayer) ((t43) obj6).getValue();
                if (exoPlayer != null) {
                    exoPlayer.seekTo(h);
                }
                on5.R(hk3Var2, h);
                t43Var8.setValue(null);
                on5.T(hk3Var3, 0L);
                t43Var9.setValue(Boolean.FALSE);
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ zt1(t43 t43Var, ki1 ki1Var, hu2 hu2Var, rm1 rm1Var, t43 t43Var2, t43 t43Var3, t43 t43Var4) {
        this.J = t43Var;
        this.K = ki1Var;
        this.L = hu2Var;
        this.M = rm1Var;
        this.P = t43Var2;
        this.N = t43Var3;
        this.O = t43Var4;
    }

    public /* synthetic */ zt1(fk3 fk3Var, hk3 hk3Var, t43 t43Var, hk3 hk3Var2, t43 t43Var2, hk3 hk3Var3, t43 t43Var3) {
        this.K = fk3Var;
        this.P = hk3Var;
        this.J = t43Var;
        this.L = hk3Var2;
        this.N = t43Var2;
        this.M = hk3Var3;
        this.O = t43Var3;
    }

    public /* synthetic */ zt1(ab4 ab4Var, hu2 hu2Var, Context context, t43 t43Var, t43 t43Var2, hk3 hk3Var, t43 t43Var3) {
        this.K = ab4Var;
        this.L = hu2Var;
        this.M = context;
        this.J = t43Var;
        this.N = t43Var2;
        this.P = hk3Var;
        this.O = t43Var3;
    }

    public /* synthetic */ zt1(pq5 pq5Var, xp3 xp3Var, rm1 rm1Var, rm1 rm1Var2, rm1 rm1Var3, t43 t43Var, rm1 rm1Var4) {
        this.K = pq5Var;
        this.L = xp3Var;
        this.M = rm1Var;
        this.N = rm1Var2;
        this.O = rm1Var3;
        this.J = t43Var;
        this.P = rm1Var4;
    }

    public /* synthetic */ zt1(List list, gu3 gu3Var, ki1 ki1Var, ki1 ki1Var2, List list2, tm1 tm1Var, rm1 rm1Var) {
        this.K = list;
        this.L = gu3Var;
        this.M = ki1Var;
        this.J = ki1Var2;
        this.N = list2;
        this.O = tm1Var;
        this.P = rm1Var;
    }
}

package defpackage;

import android.view.Choreographer;
import android.view.InputDevice;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ee implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ ee(Object obj, Object obj2, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
    }

    private final Object a(Object obj) {
        u92 u92Var = (u92) this.J;
        Object obj2 = u92Var.b;
        k10 k10Var = (k10) this.K;
        synchronized (obj2) {
            ((ArrayList) u92Var.c).remove(k10Var);
        }
        return wd5.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        j14 j14Var;
        r3 = false;
        r3 = false;
        r3 = false;
        r3 = false;
        r3 = false;
        boolean z = false;
        r3 = false;
        r3 = false;
        boolean z2 = false;
        switch (this.I) {
            case 0:
                h12 h12Var = (h12) this.J;
                synchronized (h12Var.c) {
                    try {
                        h12Var.e = true;
                        b53 b53Var = h12Var.d;
                        Object[] objArr = b53Var.I;
                        int i = b53Var.K;
                        for (int i2 = 0; i2 < i; i2++) {
                            sc3 sc3Var = (sc3) ((zs5) objArr[i2]).get();
                            if (sc3Var != null && (j14Var = sc3Var.b) != null) {
                                sc3Var.a(j14Var);
                                sc3Var.b = null;
                            }
                        }
                        h12Var.d.h();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                j55 j55Var = ((fe) this.K).J;
                j55Var.b.set(null);
                j55Var.a.d();
                return wd5.a;
            case 1:
                ((Choreographer) ((eg) this.J).J).removeFrameCallback((dg) this.K);
                return wd5.a;
            case 2:
                int intValue = ((Number) obj).intValue();
                return ((bd0) this.J).invoke(Integer.valueOf(intValue), ((List) this.K).get(intValue));
            case 3:
                int intValue2 = ((Number) obj).intValue();
                return ((bd0) this.J).invoke(Integer.valueOf(intValue2), ((List) this.K).get(intValue2));
            case 4:
                return ((t5) this.J).invoke(((List) this.K).get(((Number) obj).intValue()));
            case 5:
                int intValue3 = ((Number) obj).intValue();
                return ((bd0) this.J).invoke(Integer.valueOf(intValue3), ((List) this.K).get(intValue3));
            case 6:
                KeyEvent keyEvent = ((l82) obj).a;
                if (((oh2) this.J).a() == ks1.J && keyEvent.getKeyCode() == 4 && e21.C(keyEvent) == 1) {
                    ((u45) this.K).d(null);
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 7:
                ((m90) this.J).invoke(((List) this.K).get(((Number) obj).intValue()));
                return "word";
            case 8:
                int intValue4 = ((Number) obj).intValue();
                return ((bd0) this.J).invoke(Integer.valueOf(intValue4), ((List) this.K).get(intValue4));
            case 9:
                return a(obj);
            case 10:
                int intValue5 = ((Number) obj).intValue();
                return ((zw1) this.J).invoke(Integer.valueOf(intValue5), ((List) this.K).get(intValue5));
            case 11:
                int intValue6 = ((Number) obj).intValue();
                return ((zw1) this.J).invoke(Integer.valueOf(intValue6), ((List) this.K).get(intValue6));
            case 12:
                int intValue7 = ((Number) obj).intValue();
                return ((zw1) this.J).invoke(Integer.valueOf(intValue7), ((List) this.K).get(intValue7));
            case 13:
                return ((c22) this.J).invoke(((List) this.K).get(((Number) obj).intValue()));
            case 14:
                ((c22) this.J).invoke(((List) this.K).get(((Number) obj).intValue()));
                return "message";
            case 15:
                int intValue8 = ((Number) obj).intValue();
                return ((zw1) this.J).invoke(Integer.valueOf(intValue8), ((List) this.K).get(intValue8));
            case 16:
                int intValue9 = ((Number) obj).intValue();
                return ((zw1) this.J).invoke(Integer.valueOf(intValue9), ((List) this.K).get(intValue9));
            case 17:
                int intValue10 = ((Number) obj).intValue();
                return ((zw1) this.J).invoke(Integer.valueOf(intValue10), ((List) this.K).get(intValue10));
            case 18:
                int intValue11 = ((Number) obj).intValue();
                return ((ka2) this.J).invoke(Integer.valueOf(intValue11), ((List) this.K).get(intValue11));
            case 19:
                int intValue12 = ((Number) obj).intValue();
                return ((fa4) this.J).invoke(Integer.valueOf(intValue12), ((List) this.K).get(intValue12));
            case 20:
                int intValue13 = ((Number) obj).intValue();
                return ((fa4) this.J).invoke(Integer.valueOf(intValue13), ((List) this.K).get(intValue13));
            case 21:
                int intValue14 = ((Number) obj).intValue();
                return ((fa4) this.J).invoke(Integer.valueOf(intValue14), ((List) this.K).get(intValue14));
            case 22:
                int intValue15 = ((Number) obj).intValue();
                return ((fa4) this.J).invoke(Integer.valueOf(intValue15), ((List) this.K).get(intValue15));
            case 23:
                int intValue16 = ((Number) obj).intValue();
                return ((fa4) this.J).invoke(Integer.valueOf(intValue16), ((List) this.K).get(intValue16));
            case 24:
                int intValue17 = ((Number) obj).intValue();
                return ((fa4) this.J).invoke(Integer.valueOf(intValue17), ((List) this.K).get(intValue17));
            case 25:
                int intValue18 = ((Number) obj).intValue();
                return ((fa4) this.J).invoke(Integer.valueOf(intValue18), ((List) this.K).get(intValue18));
            case 26:
                ((yv3) this.J).invoke(((List) this.K).get(((Number) obj).intValue()));
                return "suggestion";
            case 27:
                return ((ol4) this.J).invoke(((za1) this.K).get(((Number) obj).intValue()));
            case 28:
                ((ol4) this.J).invoke(((za1) this.K).get(((Number) obj).intValue()));
                return "category";
            default:
                KeyEvent keyEvent2 = ((l82) obj).a;
                bi1 bi1Var = (bi1) this.J;
                InputDevice device = keyEvent2.getDevice();
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent2.getSource() == 33554433) && e21.C(keyEvent2) == 2 && keyEvent2.getSource() != 257)) {
                    if (fb4.H(19, keyEvent2)) {
                        z = ((di1) bi1Var).h(5, true);
                    } else if (fb4.H(20, keyEvent2)) {
                        z = ((di1) bi1Var).h(6, true);
                    } else if (fb4.H(21, keyEvent2)) {
                        z = ((di1) bi1Var).h(3, true);
                    } else if (fb4.H(22, keyEvent2)) {
                        z = ((di1) bi1Var).h(4, true);
                    } else if (fb4.H(23, keyEvent2)) {
                        ot4 ot4Var = ((oh2) this.K).c;
                        if (ot4Var != null) {
                            ((yt0) ot4Var).b();
                        }
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}

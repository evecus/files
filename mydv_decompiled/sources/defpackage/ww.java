package defpackage;

import android.os.SystemClock;
import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.model.Comment;
import com.github.mytv.dv.model.LiveRoom;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ww implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;

    public /* synthetic */ ww(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
        this.L = obj3;
        this.M = obj4;
        this.N = obj5;
        this.O = obj6;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj2 = this.O;
        Object obj3 = this.N;
        Object obj4 = this.M;
        Object obj5 = this.L;
        Object obj6 = this.K;
        Object obj7 = this.J;
        switch (b) {
            case 0:
                h74 h74Var = (h74) obj6;
                o24 o24Var = (o24) obj5;
                r24 r24Var = (r24) obj4;
                yd ydVar = (yd) obj3;
                wy wyVar = (wy) obj2;
                y31 y31Var = (y31) obj;
                by4 by4Var = (by4) ((zw) obj7).b;
                by4Var.getClass();
                float floatValue = Float.valueOf(by4Var.I).floatValue();
                if (floatValue < 0.0f) {
                    floatValue = 0.0f;
                }
                boolean z = 2.0f * floatValue > Math.min(Math.abs(h74Var.b()), Math.abs(h74Var.a()));
                if (o24Var.I != floatValue) {
                    ydVar.d();
                    hf1.j(ydVar, h74Var);
                    if (!z) {
                        yd a = ae.a();
                        hf1.j(a, new h74(h74Var.a + floatValue, h74Var.b + floatValue, h74Var.c - floatValue, h74Var.d - floatValue, c5.f0(h74Var.e, floatValue), c5.f0(h74Var.f, floatValue), c5.f0(h74Var.g, floatValue), c5.f0(h74Var.h, floatValue)));
                        ydVar = ydVar;
                        ydVar.c(ydVar, a, 0);
                    }
                    r24Var.I = ydVar;
                    o24Var.I = floatValue;
                }
                Object obj8 = r24Var.I;
                obj8.getClass();
                r7.j(y31Var, (yd) obj8, wyVar, 0.0f, null, null, 60);
                break;
            case 1:
                pq5 pq5Var = (pq5) obj7;
                rm1 rm1Var = (rm1) obj6;
                tm1 tm1Var = (tm1) obj5;
                LiveRoom liveRoom = (LiveRoom) obj4;
                t43 t43Var = (t43) obj3;
                rm1 rm1Var2 = (rm1) obj2;
                pq5Var.getClass();
                if (SystemClock.uptimeMillis() >= pq5Var.c) {
                    if (((String) t43Var.getValue()) == null) {
                        if (rm1Var == null) {
                            if (tm1Var != null) {
                                tm1Var.invoke(liveRoom.getOwner());
                                break;
                            }
                        } else {
                            rm1Var.invoke();
                            break;
                        }
                    } else if (rm1Var2 != null) {
                        rm1Var2.invoke();
                        break;
                    }
                }
                break;
            case 2:
                kq5 kq5Var = (kq5) obj7;
                dl0 dl0Var = (dl0) obj6;
                t43 t43Var2 = (t43) obj5;
                t43 t43Var3 = (t43) obj4;
                Aweme aweme = (Aweme) obj3;
                t43 t43Var4 = (t43) obj2;
                Comment comment = (Comment) obj;
                comment.getClass();
                if (kq5Var != null && !jx4.L(comment.getCid()) && !((Set) t43Var2.getValue()).contains(comment.getCid())) {
                    t43Var2.setValue(zk4.v((Set) t43Var2.getValue(), comment.getCid()));
                    t43Var3.setValue(zk4.t((Set) t43Var3.getValue(), comment.getCid()));
                    p70.g0(dl0Var, null, null, new tg0(kq5Var, aweme, comment, t43Var4, t43Var3, t43Var2, null, (byte) 5), 3);
                    break;
                }
                break;
            default:
                String str = (String) obj;
                str.getClass();
                Boolean bool = Boolean.FALSE;
                ((t43) obj7).setValue(bool);
                on5.l0((t43) obj6, true);
                ((t43) obj5).setValue(bool);
                ((t43) obj4).setValue(str);
                on5.I((Aweme) obj3, (t43) obj2, "error");
                break;
        }
        return wd5Var;
    }
}

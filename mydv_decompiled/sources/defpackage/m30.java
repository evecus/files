package defpackage;

import androidx.media3.exoplayer.RendererCapabilities;
import com.github.mytv.dv.model.Comment;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class m30 implements jn1 {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ List J;
    public final /* synthetic */ ki1 K;
    public final /* synthetic */ tm1 L;
    public final /* synthetic */ cw4 M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ cw4 R;

    public /* synthetic */ m30(List list, ki1 ki1Var, hu2 hu2Var, tm1 tm1Var, OkHttpClient okHttpClient, t43 t43Var, t43 t43Var2, t43 t43Var3, t43 t43Var4) {
        this.J = list;
        this.K = ki1Var;
        this.N = hu2Var;
        this.L = tm1Var;
        this.O = okHttpClient;
        this.M = t43Var;
        this.P = t43Var2;
        this.Q = t43Var3;
        this.R = t43Var4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v5, types: [l13] */
    /* JADX WARN: Type inference failed for: r7v2, types: [fe0, go1] */
    @Override // defpackage.jn1
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        Comment comment;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj5 = de0.a;
        cw4 cw4Var = this.R;
        cw4 cw4Var2 = this.M;
        ki1 ki1Var = this.K;
        Object obj6 = this.Q;
        Object obj7 = this.P;
        Object obj8 = this.O;
        Object obj9 = this.N;
        List list = this.J;
        switch (b) {
            case 0:
                hu2 hu2Var = (hu2) obj9;
                OkHttpClient okHttpClient = (OkHttpClient) obj8;
                cw4 cw4Var3 = (cw4) obj7;
                cw4 cw4Var4 = (cw4) obj6;
                int intValue = ((Integer) obj2).intValue();
                fe0 fe0Var = (fe0) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((aj3) obj).getClass();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= ((go1) fe0Var).e(intValue) ? 32 : 16;
                }
                int i = intValue2;
                ?? r7 = (go1) fe0Var;
                if (!r7.T(i & 1, (i & 145) != 144)) {
                    r7.W();
                    break;
                } else {
                    b50 b50Var = (b50) list.get(intValue);
                    if (!b50Var.c.isEmpty()) {
                        r7.d0(1621658144);
                        List list2 = b50Var.c;
                        String str = b50Var.a;
                        boolean z = b50Var.d;
                        int size = list.size();
                        ki1 ki1Var2 = intValue == 0 ? ki1Var : null;
                        boolean i2 = r7.i(hu2Var) | r7.i(b50Var);
                        Object Q = r7.Q();
                        if (i2 || Q == obj5) {
                            Q = new o20(hu2Var, b50Var, (byte) 1);
                            r7.o0(Q);
                        }
                        tm1 tm1Var = (tm1) Q;
                        boolean i3 = r7.i(hu2Var) | r7.i(b50Var);
                        Object Q2 = r7.Q();
                        if (i3 || Q2 == obj5) {
                            Q2 = new o20(hu2Var, b50Var, (byte) 2);
                            r7.o0(Q2);
                        }
                        qg5.m(list2, str, z, intValue, size, ki1Var2, tm1Var, (tm1) Q2, this.L, ((Boolean) cw4Var2.getValue()).booleanValue(), (so3) cw4Var3.getValue(), (dp3) cw4Var4.getValue(), ((qn5) cw4Var.getValue()).J, okHttpClient, nq4.c, r7, (i << 6) & 7168);
                        r7.q(false);
                        break;
                    } else if (!b50Var.d) {
                        r7.d0(1623103023);
                        r7.q(false);
                        break;
                    } else {
                        r7.d0(1622979457);
                        qg5.d(b50Var.a, null, r7, 0);
                        r7.q(false);
                        break;
                    }
                }
            default:
                hk3 hk3Var = (hk3) obj9;
                SimpleDateFormat simpleDateFormat = (SimpleDateFormat) obj8;
                Set set = (Set) obj7;
                Set set2 = (Set) obj6;
                t43 t43Var = (t43) cw4Var;
                int intValue3 = ((Integer) obj2).intValue();
                fe0 fe0Var2 = (fe0) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                ((zd2) obj).getClass();
                if ((intValue4 & 48) == 0) {
                    intValue4 |= ((go1) fe0Var2).e(intValue3) ? 32 : 16;
                }
                go1 go1Var = (go1) fe0Var2;
                if (!go1Var.T(intValue4 & 1, (intValue4 & 145) != 144)) {
                    go1Var.W();
                    break;
                } else {
                    db0 db0Var = (db0) list.get(intValue3);
                    Comment comment2 = db0Var.b;
                    boolean z2 = db0Var.c;
                    i13 i13Var = i13.a;
                    if (!z2) {
                        go1Var.d0(-149803134);
                        Map map = (Map) cw4Var2.getValue();
                        boolean c = j42.c((String) t43Var.getValue(), db0Var.a);
                        boolean contains = set.contains(comment2.getCid());
                        boolean contains2 = set2.contains(comment2.getCid());
                        l13 G0 = i42.G0(i13Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                        i13 i13Var2 = i13Var;
                        if (intValue3 == 0) {
                            i13Var2 = j42.x(i13Var2, ki1Var);
                        }
                        l13 then = G0.then(i13Var2);
                        boolean i4 = go1Var.i(comment2) | go1Var.i(db0Var) | go1Var.i(set);
                        tm1 tm1Var2 = this.L;
                        boolean g = i4 | go1Var.g(tm1Var2);
                        Object Q3 = go1Var.Q();
                        if (g || Q3 == obj5) {
                            Q3 = new ke(comment2, db0Var, set, tm1Var2, t43Var, (byte) 1);
                            comment = comment2;
                            go1Var.o0(Q3);
                        } else {
                            comment = comment2;
                        }
                        cb0.c(comment, map, hk3Var, simpleDateFormat, c, contains, contains2, (rm1) Q3, then, go1Var, Comment.$stable | RendererCapabilities.DECODER_SUPPORT_MASK);
                        go1Var.q(false);
                        break;
                    } else {
                        go1Var.d0(-150377099);
                        cb0.e(comment2, (Map) cw4Var2.getValue(), hk3Var, simpleDateFormat, i42.G0(i13Var, cb0.a, 6.0f, 0.0f, 0.0f, 12), go1Var, Comment.$stable | 24960);
                        go1Var.q(false);
                        break;
                    }
                }
        }
        return wd5Var;
    }

    public /* synthetic */ m30(List list, hk3 hk3Var, SimpleDateFormat simpleDateFormat, Set set, Set set2, ki1 ki1Var, tm1 tm1Var, cw4 cw4Var, t43 t43Var) {
        this.J = list;
        this.N = hk3Var;
        this.O = simpleDateFormat;
        this.P = set;
        this.Q = set2;
        this.K = ki1Var;
        this.L = tm1Var;
        this.M = cw4Var;
        this.R = t43Var;
    }
}

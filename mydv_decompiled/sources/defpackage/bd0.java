package defpackage;

import com.github.mytv.dv.R;
import com.github.mytv.dv.model.Aweme;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bd0 implements hn1 {
    public final /* synthetic */ byte I;

    public /* synthetic */ bd0(int i) {
        this.I = (byte) 25;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                fe0 fe0Var = (fe0) obj;
                int intValue = ((Integer) obj2).intValue();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 3) != 2)) {
                    go1Var.W();
                    break;
                } else {
                    l13 m = o7.m(nq4.k(i13.a, 28.0f), l74.a);
                    uw2 c = px.c(q8.J, false);
                    long j = go1Var.T;
                    int i = (int) (j ^ (j >>> 32));
                    am3 m2 = go1Var.m();
                    l13 x0 = i42.x0(go1Var, m);
                    xd0.c.getClass();
                    go1Var.h0();
                    if (go1Var.S) {
                        go1Var.l(wa2.A0);
                    } else {
                        go1Var.r0();
                    }
                    qi4.k(go1Var, q8.c0, c);
                    qi4.k(go1Var, q8.b0, m2);
                    qi4.k(go1Var, q8.d0, Integer.valueOf(i));
                    qi4.j(go1Var);
                    qi4.k(go1Var, q8.a0, x0);
                    rj3 M = vt0.M(go1Var, R.mipmap.ic_launcher_background);
                    ne1 ne1Var = nq4.c;
                    int i2 = rj3.$stable | 25008;
                    jp jpVar = li0.a;
                    ut0.a(M, null, ne1Var, null, jpVar, 0.0f, null, go1Var, i2, 104);
                    ut0.a(vt0.M(go1Var, R.mipmap.ic_launcher_foreground), null, ne1Var, null, jpVar, 0.0f, null, go1Var, i2, 104);
                    go1Var.q(true);
                    break;
                }
            case 1:
                ((l71) obj).c = (lq1) obj2;
                break;
            case 2:
                ((l71) obj).d = (t8) obj2;
                break;
            case 3:
                ((m71) obj).a = (String) obj2;
                break;
            case 4:
                ((m71) obj).d = (lq1) obj2;
                break;
            case 5:
                ((m71) obj).b = (l65) obj2;
                break;
            case 6:
                ((m71) obj).e = (rz) obj2;
                break;
            case 7:
                ((m71) obj).f = ((Boolean) obj2).booleanValue();
                break;
            case 8:
                ((m71) obj).c = ((Integer) obj2).intValue();
                break;
            case 9:
                ((Integer) obj).intValue();
                b50 b50Var = (b50) obj2;
                b50Var.getClass();
                break;
            case 10:
                ((Integer) obj).intValue();
                b50 b50Var2 = (b50) obj2;
                b50Var2.getClass();
                break;
            case 11:
                ((Integer) obj).intValue();
                Aweme aweme = (Aweme) obj2;
                aweme.getClass();
                break;
            case 12:
                ((n71) obj).c = (lq1) obj2;
                break;
            case 13:
                ((n71) obj).e = ((r8) obj2).a;
                break;
            case 14:
                ((n71) obj).d = ((s8) obj2).a;
                break;
            case 15:
                String str = (String) obj;
                rk0 rk0Var = (rk0) obj2;
                str.getClass();
                rk0Var.getClass();
                if (str.length() != 0) {
                    break;
                } else {
                    break;
                }
            case 16:
                String str2 = (String) obj;
                kq1 kq1Var = (kq1) obj2;
                if (str2.length() != 0) {
                    break;
                } else {
                    break;
                }
            case 17:
                StringBuilder sb = (StringBuilder) obj;
                j13 j13Var = (j13) obj2;
                if (sb.length() > 1) {
                    sb.append(", ");
                }
                sb.append(j13Var);
                break;
            case 18:
                fe0 fe0Var2 = (fe0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                go1 go1Var2 = (go1) fe0Var2;
                if (!go1Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    go1Var2.W();
                    break;
                }
                break;
            case 19:
                fe0 fe0Var3 = (fe0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                go1 go1Var3 = (go1) fe0Var3;
                if (!go1Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    go1Var3.W();
                    break;
                }
                break;
            case 20:
                fe0 fe0Var4 = (fe0) obj;
                int intValue4 = ((Integer) obj2).intValue();
                go1 go1Var4 = (go1) fe0Var4;
                if (!go1Var4.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    go1Var4.W();
                    break;
                } else {
                    mu0.b("↑↓", "切换视频", go1Var4, 54);
                    mu0.b("←", "相关视频推荐", go1Var4, 54);
                    mu0.b("→", "调整进度", go1Var4, 54);
                    mu0.b("OK", "暂停/继续播放", go1Var4, 54);
                    mu0.b("↩", "使用导航栏，连续点击多次可退出应用", go1Var4, 54);
                    break;
                }
            case 21:
                fe0 fe0Var5 = (fe0) obj;
                int intValue5 = ((Integer) obj2).intValue();
                go1 go1Var5 = (go1) fe0Var5;
                if (!go1Var5.T(intValue5 & 1, (intValue5 & 3) != 2)) {
                    go1Var5.W();
                    break;
                } else {
                    r55.b("粘贴浏览器Cookie...", null, ((fw2) go1Var5.k(lw2.b)).a.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, go1Var5, 6, 0, 262138);
                    break;
                }
            case 22:
                fe0 fe0Var6 = (fe0) obj;
                int intValue6 = ((Integer) obj2).intValue();
                go1 go1Var6 = (go1) fe0Var6;
                if (!go1Var6.T(intValue6 & 1, (intValue6 & 3) != 2)) {
                    go1Var6.W();
                    break;
                } else {
                    r55.b("粘贴 security-sdk / web_protect JSON，或 ticket 与 ts_sign 文本...", null, ((fw2) go1Var6.k(lw2.b)).a.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, go1Var6, 6, 0, 262138);
                    break;
                }
            case 23:
                fe0 fe0Var7 = (fe0) obj;
                int intValue7 = ((Integer) obj2).intValue();
                go1 go1Var7 = (go1) fe0Var7;
                if (!go1Var7.T(intValue7 & 1, (intValue7 & 3) != 2)) {
                    go1Var7.W();
                    break;
                } else {
                    r55.b("粘贴 private key，支持 PEM 或 Base64...", null, ((fw2) go1Var7.k(lw2.b)).a.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, go1Var7, 6, 0, 262138);
                    break;
                }
            case 24:
                ((Integer) obj).getClass();
                b83 b83Var = (b83) obj2;
                b83Var.getClass();
                ab4 ab4Var = b83Var.b;
                if (ab4Var == null || (r1 = ab4Var.name()) == null) {
                    break;
                }
                break;
            case 25:
                ((Integer) obj2).getClass();
                e41.f((fe0) obj, mu0.X(1));
                break;
            case 26:
                ((p71) obj).b = (ex1) obj2;
                break;
            case 27:
                ((p71) obj).a = (lq1) obj2;
                break;
            case 28:
                ((p71) obj).e = ((mi0) obj2).a;
                break;
            default:
                b80 b80Var = (b80) obj2;
                ((p71) obj).c = b80Var != null ? b80Var.a : null;
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ bd0(byte b) {
        this.I = b;
    }
}

package defpackage;

import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.model.MixPlaylistPagination;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class co implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ hu2 J;

    public /* synthetic */ co(hu2 hu2Var, byte b) {
        this.I = b;
        this.J = hu2Var;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.I;
        jp jpVar = de0.a;
        hu2 hu2Var = this.J;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                List list = (List) obj;
                Aweme aweme = (Aweme) obj2;
                MixPlaylistPagination mixPlaylistPagination = (MixPlaylistPagination) obj3;
                list.getClass();
                aweme.getClass();
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                        } else if (!j42.c(((Aweme) it.next()).getAwemeId(), aweme.getAwemeId())) {
                            i++;
                        }
                    }
                    Integer valueOf = Integer.valueOf(i);
                    if (i < 0) {
                        valueOf = null;
                    }
                    hu2Var.p.U(list, valueOf != null ? valueOf.intValue() : 0, "profile", null, mixPlaylistPagination);
                    hu2Var.C(aweme);
                    break;
                }
                break;
            case 1:
                fe0 fe0Var = (fe0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 17) != 16)) {
                    go1Var.W();
                    break;
                } else {
                    boolean i2 = go1Var.i(hu2Var);
                    Object Q = go1Var.Q();
                    if (i2 || Q == jpVar) {
                        Q = new bo(hu2Var, (byte) 18);
                        go1Var.o0(Q);
                    }
                    qe4.a((tm1) Q, go1Var, 0);
                    break;
                }
            case 2:
                fe0 fe0Var2 = (fe0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var2 = (go1) fe0Var2;
                if (!go1Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    go1Var2.W();
                    break;
                } else {
                    t43 g = wi4.g(hu2Var.h.e, go1Var2);
                    hx1 L = e41.L();
                    Enum[] enumArr = (Enum[]) fr.M.toArray(new fr[0]);
                    fr frVar = (fr) g.getValue();
                    boolean i3 = go1Var2.i(hu2Var);
                    Object Q2 = go1Var2.Q();
                    if (i3 || Q2 == jpVar) {
                        Q2 = new ll4(hu2Var, (byte) 2);
                        go1Var2.o0(Q2);
                    }
                    tm1 tm1Var = (tm1) Q2;
                    Object Q3 = go1Var2.Q();
                    if (Q3 == jpVar) {
                        Q3 = new yv3((byte) 21);
                        go1Var2.o0(Q3);
                    }
                    qm4.j("音量均衡", L, enumArr, frVar, tm1Var, (tm1) Q3, null, false, null, go1Var2, 196614, 448);
                    break;
                }
            case 3:
                fe0 fe0Var3 = (fe0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var3 = (go1) fe0Var3;
                if (!go1Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    go1Var3.W();
                    break;
                } else {
                    t43 g2 = wi4.g(hu2Var.h.k, go1Var3);
                    String str = ((Boolean) g2.getValue()).booleanValue() ? "已开启，播放时后台预下载下一条视频开头，翻页秒播" : "关闭，翻页时才加载下一条视频";
                    boolean booleanValue = ((Boolean) g2.getValue()).booleanValue();
                    boolean i4 = go1Var3.i(hu2Var);
                    Object Q4 = go1Var3.Q();
                    if (i4 || Q4 == jpVar) {
                        Q4 = new ll4(hu2Var, (byte) 23);
                        go1Var3.o0(Q4);
                    }
                    qm4.r("预缓存下一条视频", str, booleanValue, (tm1) Q4, null, go1Var3, 6);
                    break;
                }
            case 4:
                fe0 fe0Var4 = (fe0) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var4 = (go1) fe0Var4;
                if (!go1Var4.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                    go1Var4.W();
                    break;
                } else {
                    boolean booleanValue2 = ((Boolean) wi4.g(hu2Var.h.l, go1Var4).getValue()).booleanValue();
                    boolean i5 = go1Var4.i(hu2Var);
                    Object Q5 = go1Var4.Q();
                    if (i5 || Q5 == jpVar) {
                        Q5 = new fm4(hu2Var, (byte) 0);
                        go1Var4.o0(Q5);
                    }
                    qm4.r("合集类视频支持展示合集列表（点击左键唤起列表）", "开启后，当前视频为合集类视频时，左侧“相关视频列表”改为合集列表", booleanValue2, (tm1) Q5, null, go1Var4, 54);
                    break;
                }
            case 5:
                fe0 fe0Var5 = (fe0) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var5 = (go1) fe0Var5;
                if (!go1Var5.T(intValue5 & 1, (intValue5 & 17) != 16)) {
                    go1Var5.W();
                    break;
                } else {
                    t43 g3 = wi4.g(hu2Var.h.v0, go1Var5);
                    String str2 = ((Boolean) g3.getValue()).booleanValue() ? "已开启，选择海报停留3秒后自动播放" : "关闭，不会自动播放视频";
                    boolean booleanValue3 = ((Boolean) g3.getValue()).booleanValue();
                    boolean i6 = go1Var5.i(hu2Var);
                    Object Q6 = go1Var5.Q();
                    if (i6 || Q6 == jpVar) {
                        Q6 = new fm4(hu2Var, (byte) 2);
                        go1Var5.o0(Q6);
                    }
                    qm4.r("精选页面自动播放", str2, booleanValue3, (tm1) Q6, null, go1Var5, 6);
                    break;
                }
            case 6:
                fe0 fe0Var6 = (fe0) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var6 = (go1) fe0Var6;
                if (!go1Var6.T(intValue6 & 1, (intValue6 & 17) != 16)) {
                    go1Var6.W();
                    break;
                } else {
                    t43 g4 = wi4.g(hu2Var.h.E0, go1Var6);
                    hx1 I = k21.I();
                    Enum[] enumArr2 = (Enum[]) sd1.M.toArray(new sd1[0]);
                    sd1 sd1Var = (sd1) g4.getValue();
                    boolean i7 = go1Var6.i(hu2Var);
                    Object Q7 = go1Var6.Q();
                    if (i7 || Q7 == jpVar) {
                        Q7 = new ll4(hu2Var, (byte) 22);
                        go1Var6.o0(Q7);
                    }
                    tm1 tm1Var2 = (tm1) Q7;
                    Object Q8 = go1Var6.Q();
                    if (Q8 == jpVar) {
                        Q8 = new ol4((byte) 7);
                        go1Var6.o0(Q8);
                    }
                    qm4.j("推荐去重记录数", I, enumArr2, sd1Var, tm1Var2, (tm1) Q8, null, false, null, go1Var6, 196614, 448);
                    break;
                }
            case 7:
                fe0 fe0Var7 = (fe0) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var7 = (go1) fe0Var7;
                if (!go1Var7.T(intValue7 & 1, (intValue7 & 17) != 16)) {
                    go1Var7.W();
                    break;
                } else {
                    t43 g5 = wi4.g(hu2Var.h.i0, go1Var7);
                    String str3 = ((Boolean) g5.getValue()).booleanValue() ? "已开启，按 HOME 键时视频缩小为小窗继续播放" : "关闭，按 HOME 键时暂停视频";
                    boolean booleanValue4 = ((Boolean) g5.getValue()).booleanValue();
                    boolean i8 = go1Var7.i(hu2Var);
                    Object Q9 = go1Var7.Q();
                    if (i8 || Q9 == jpVar) {
                        Q9 = new bo(hu2Var, (byte) 29);
                        go1Var7.o0(Q9);
                    }
                    qm4.r("画中画模式", str3, booleanValue4, (tm1) Q9, null, go1Var7, 6);
                    break;
                }
            case 8:
                fe0 fe0Var8 = (fe0) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var8 = (go1) fe0Var8;
                if (!go1Var8.T(intValue8 & 1, (intValue8 & 17) != 16)) {
                    go1Var8.W();
                    break;
                } else {
                    t43 g6 = wi4.g(hu2Var.h.k0, go1Var8);
                    String str4 = ((Boolean) g6.getValue()).booleanValue() ? "已开启，按上键切换下一个视频" : "关闭，按下键切换下一个视频";
                    boolean booleanValue5 = ((Boolean) g6.getValue()).booleanValue();
                    boolean i9 = go1Var8.i(hu2Var);
                    Object Q10 = go1Var8.Q();
                    if (i9 || Q10 == jpVar) {
                        Q10 = new ll4(hu2Var, (byte) 26);
                        go1Var8.o0(Q10);
                    }
                    qm4.r("反转导航", str4, booleanValue5, (tm1) Q10, null, go1Var8, 6);
                    break;
                }
            case 9:
                fe0 fe0Var9 = (fe0) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var9 = (go1) fe0Var9;
                if (!go1Var9.T(intValue9 & 1, (intValue9 & 17) != 16)) {
                    go1Var9.W();
                    break;
                } else {
                    t43 g7 = wi4.g(hu2Var.h.m0, go1Var9);
                    String str5 = ((Boolean) g7.getValue()).booleanValue() ? "已开启，自动播放下一个时按时间正序（从旧到新）" : "关闭，自动播放下一个时按时间倒序（从新到旧）";
                    boolean booleanValue6 = ((Boolean) g7.getValue()).booleanValue();
                    boolean i10 = go1Var9.i(hu2Var);
                    Object Q11 = go1Var9.Q();
                    if (i10 || Q11 == jpVar) {
                        Q11 = new ll4(hu2Var, (byte) 1);
                        go1Var9.o0(Q11);
                    }
                    qm4.r("用户主页反序播放", str5, booleanValue6, (tm1) Q11, null, go1Var9, 6);
                    break;
                }
            case 10:
                fe0 fe0Var10 = (fe0) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var10 = (go1) fe0Var10;
                if (!go1Var10.T(intValue10 & 1, (intValue10 & 17) != 16)) {
                    go1Var10.W();
                    break;
                } else {
                    boolean booleanValue7 = ((Boolean) wi4.g(hu2Var.h.m, go1Var10).getValue()).booleanValue();
                    boolean i11 = go1Var10.i(hu2Var);
                    Object Q12 = go1Var10.Q();
                    if (i11 || Q12 == jpVar) {
                        Q12 = new ll4(hu2Var, (byte) 29);
                        go1Var10.o0(Q12);
                    }
                    qm4.r("进入个人主页显示历史", "开启后，从侧边栏进入自己的主页时直接显示“历史”Tab", booleanValue7, (tm1) Q12, null, go1Var10, 54);
                    break;
                }
            case 11:
                fe0 fe0Var11 = (fe0) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var11 = (go1) fe0Var11;
                if (!go1Var11.T(intValue11 & 1, (intValue11 & 17) != 16)) {
                    go1Var11.W();
                    break;
                } else {
                    t43 g8 = wi4.g(hu2Var.h.o0, go1Var11);
                    String str6 = ((Boolean) g8.getValue()).booleanValue() ? "已开启，仅能通过返回键移动到最下面的“退出”来退出应用" : "关闭，连续按两次返回键可退出应用";
                    boolean booleanValue8 = ((Boolean) g8.getValue()).booleanValue();
                    boolean i12 = go1Var11.i(hu2Var);
                    Object Q13 = go1Var11.Q();
                    if (i12 || Q13 == jpVar) {
                        Q13 = new ll4(hu2Var, (byte) 4);
                        go1Var11.o0(Q13);
                    }
                    qm4.r("禁用双击返回退出", str6, booleanValue8, (tm1) Q13, null, go1Var11, 6);
                    break;
                }
            case 12:
                fe0 fe0Var12 = (fe0) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var12 = (go1) fe0Var12;
                if (!go1Var12.T(intValue12 & 1, (intValue12 & 17) != 16)) {
                    go1Var12.W();
                    break;
                } else {
                    t43 g9 = wi4.g(hu2Var.h.s0, go1Var12);
                    String str7 = ((Boolean) g9.getValue()).booleanValue() ? "已开启，视频播放时显示详情" : "关闭，视频播放时隐藏详情";
                    boolean booleanValue9 = ((Boolean) g9.getValue()).booleanValue();
                    boolean i13 = go1Var12.i(hu2Var);
                    Object Q14 = go1Var12.Q();
                    if (i13 || Q14 == jpVar) {
                        Q14 = new ll4(hu2Var, (byte) 27);
                        go1Var12.o0(Q14);
                    }
                    qm4.r("播放时显示详情", str7, booleanValue9, (tm1) Q14, null, go1Var12, 6);
                    break;
                }
            case 13:
                fe0 fe0Var13 = (fe0) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var13 = (go1) fe0Var13;
                if (!go1Var13.T(intValue13 & 1, (intValue13 & 17) != 16)) {
                    go1Var13.W();
                    break;
                } else {
                    t43 g10 = wi4.g(hu2Var.h.B0, go1Var13);
                    String str8 = ((Boolean) g10.getValue()).booleanValue() ? "已开启，视频播放时底部显示白色进度条" : "关闭，视频播放时不显示进度条";
                    boolean booleanValue10 = ((Boolean) g10.getValue()).booleanValue();
                    boolean i14 = go1Var13.i(hu2Var);
                    Object Q15 = go1Var13.Q();
                    if (i14 || Q15 == jpVar) {
                        Q15 = new ll4(hu2Var, (byte) 24);
                        go1Var13.o0(Q15);
                    }
                    qm4.r("播放时显示进度条", str8, booleanValue10, (tm1) Q15, null, go1Var13, 6);
                    break;
                }
            case 14:
                fe0 fe0Var14 = (fe0) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var14 = (go1) fe0Var14;
                if (!go1Var14.T(intValue14 & 1, (intValue14 & 17) != 16)) {
                    go1Var14.W();
                    break;
                } else {
                    t43 g11 = wi4.g(hu2Var.h.n, go1Var14);
                    String str9 = ((Boolean) g11.getValue()).booleanValue() ? "已开启，暂停时隐藏暂停图标和详情等遮挡浮层" : "关闭，暂停时正常显示暂停图标和详情";
                    boolean booleanValue11 = ((Boolean) g11.getValue()).booleanValue();
                    boolean i15 = go1Var14.i(hu2Var);
                    Object Q16 = go1Var14.Q();
                    if (i15 || Q16 == jpVar) {
                        Q16 = new ll4(hu2Var, (byte) 25);
                        go1Var14.o0(Q16);
                    }
                    qm4.r("暂停时隐藏遮挡", str9, booleanValue11, (tm1) Q16, null, go1Var14, 6);
                    break;
                }
            case 15:
                fe0 fe0Var15 = (fe0) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((zd2) obj).getClass();
                go1 go1Var15 = (go1) fe0Var15;
                if (!go1Var15.T(intValue15 & 1, (intValue15 & 17) != 16)) {
                    go1Var15.W();
                    break;
                } else {
                    t43 g12 = wi4.g(hu2Var.h.g, go1Var15);
                    String str10 = ((Boolean) g12.getValue()).booleanValue() ? "已开启，SurfaceView 缓冲宽度按 64 对齐；画面比例不变，缓冲占用略增" : "关闭，保持原始缓冲尺寸；电视播 1080p/4K 时右侧出现绿条可尝试开启";
                    boolean booleanValue12 = ((Boolean) g12.getValue()).booleanValue();
                    boolean i16 = go1Var15.i(hu2Var);
                    Object Q17 = go1Var15.Q();
                    if (i16 || Q17 == jpVar) {
                        Q17 = new ll4(hu2Var, (byte) 7);
                        go1Var15.o0(Q17);
                    }
                    qm4.r("画面边缘绿条修复", str10, booleanValue12, (tm1) Q17, null, go1Var15, 6);
                    break;
                }
            default:
                List list2 = (List) obj;
                Aweme aweme2 = (Aweme) obj2;
                list2.getClass();
                aweme2.getClass();
                hu2.B(this.J, list2, aweme2, null, (MixPlaylistPagination) obj3, 4);
                break;
        }
        return wd5Var;
    }
}

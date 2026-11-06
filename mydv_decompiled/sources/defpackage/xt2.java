package defpackage;

import com.github.mytv.dv.model.Author;
import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.model.LiveRoom;
import com.github.mytv.dv.model.LiveRoomData;
import com.github.mytv.dv.model.LiveRoomResponse;
import com.github.mytv.dv.model.MixInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xt2 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ hu2 K;
    public final /* synthetic */ String L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xt2(hu2 hu2Var, String str, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = hu2Var;
        this.L = str;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        String str = this.L;
        hu2 hu2Var = this.K;
        switch (b) {
            case 0:
                return new xt2(hu2Var, str, fj0Var, (byte) 0);
            case 1:
                return new xt2(hu2Var, str, fj0Var, (byte) 1);
            case 2:
                return new xt2(hu2Var, str, fj0Var, (byte) 2);
            default:
                return new xt2(hu2Var, str, fj0Var, (byte) 3);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
        }
        return ((xt2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object K;
        Map map;
        Object E;
        Object o;
        Map map2;
        Object p;
        byte b = this.I;
        hu2 hu2Var = this.K;
        wd5 wd5Var = wd5.a;
        String str = this.L;
        el0 el0Var = el0.I;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    xg0 xg0Var = new xg0(hu2Var.p.f, (byte) 2);
                    this.J = true;
                    K = sp0.K(xg0Var, this);
                    if (K == el0Var) {
                        break;
                    }
                } else if (!z) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    K = obj;
                }
                Author author = (Author) K;
                if (hu2Var.d.i().equals(str)) {
                    fw4 fw4Var = hu2Var.x;
                    Map map3 = (Map) fw4Var.getValue();
                    map3.getClass();
                    if (map3.isEmpty()) {
                        map = Collections.singletonMap(str, author);
                        map.getClass();
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map3);
                        linkedHashMap.put(str, author);
                        map = linkedHashMap;
                    }
                    fw4Var.getClass();
                    fw4Var.i(null, map);
                    break;
                }
                break;
            case 1:
                hu2 hu2Var2 = this.K;
                fw4 fw4Var2 = hu2Var2.D;
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    fw4Var2.h(null);
                    kq5 kq5Var = hu2Var2.g;
                    this.J = true;
                    E = kq5Var.E(str, this);
                    if (E == el0Var) {
                        break;
                    }
                } else if (!z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    E = ((h54) obj).I;
                }
                if (!(E instanceof g54)) {
                    Aweme aweme = (Aweme) E;
                    if (aweme == null) {
                        fw4 fw4Var3 = hu2Var2.D;
                        fw4Var3.getClass();
                        fw4Var3.i(null, "未找到该视频或视频暂不可播放");
                    } else {
                        hu2.B(hu2Var2, p70.j0(aweme), aweme, null, null, 28);
                    }
                }
                Throwable a = h54.a(E);
                if (a != null) {
                    String message = a.getMessage();
                    if (message == null) {
                        message = "视频详情加载失败";
                    }
                    fw4Var2.getClass();
                    fw4Var2.i(null, message);
                    break;
                }
                break;
            case 2:
                fw4 fw4Var4 = hu2Var.D;
                boolean z3 = this.J;
                if (!z3) {
                    mu0.V(obj);
                    kq5 kq5Var2 = hu2Var.g;
                    this.J = true;
                    o = kq5Var2.o(str, this);
                    if (o == el0Var) {
                        break;
                    }
                } else if (!z3) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    o = ((h54) obj).I;
                }
                if (!(o instanceof g54)) {
                    LiveRoomData data = ((LiveRoomResponse) o).getData();
                    LiveRoom roomWithWebRid = data != null ? data.getRoomWithWebRid() : null;
                    if (roomWithWebRid == null) {
                        fw4Var4.getClass();
                        fw4Var4.i(null, "直播间不存在或主播已下播");
                    } else {
                        op2 op2Var = hu2Var.n;
                        fw4 fw4Var5 = op2Var.i;
                        fw4 fw4Var6 = op2Var.t;
                        if (!jx4.L(roomWithWebRid.getResolvedRoomId())) {
                            List j0 = p70.j0(roomWithWebRid);
                            Iterable iterable = (Iterable) fw4Var6.getValue();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : iterable) {
                                if (!j42.c(((LiveRoom) obj2).getResolvedRoomId(), roomWithWebRid.getResolvedRoomId())) {
                                    arrayList.add(obj2);
                                }
                            }
                            ArrayList f1 = o70.f1(j0, arrayList);
                            fw4Var6.i(null, f1);
                            fw4 fw4Var7 = op2Var.f;
                            fw4Var7.getClass();
                            fw4Var7.i(null, 0);
                            go2 go2Var = (go2) o70.T0(op2Var.e);
                            dn2 dn2Var = (dn2) ((Map) fw4Var5.getValue()).get(go2Var.a);
                            if (dn2Var == null) {
                                dn2Var = new dn2(go2Var);
                            }
                            dn2 dn2Var2 = dn2Var;
                            Map map4 = (Map) fw4Var5.getValue();
                            String str2 = go2Var.a;
                            dn2 a2 = dn2.a(dn2Var2, f1, false, false, 0, false, 57);
                            map4.getClass();
                            if (map4.isEmpty()) {
                                map2 = Collections.singletonMap(str2, a2);
                                map2.getClass();
                            } else {
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap(map4);
                                linkedHashMap2.put(str2, a2);
                                map2 = linkedHashMap2;
                            }
                            fw4Var5.i(null, map2);
                            op2Var.D(roomWithWebRid, 0);
                        }
                        hu2Var.v(ab4.M);
                    }
                }
                Throwable a3 = h54.a(o);
                if (a3 != null) {
                    String message2 = a3.getMessage();
                    if (message2 == null) {
                        message2 = "直播间加载失败";
                    }
                    fw4Var4.getClass();
                    fw4Var4.i(null, message2);
                    break;
                }
                break;
            default:
                fw4 fw4Var8 = hu2Var.D;
                boolean z4 = this.J;
                if (!z4) {
                    mu0.V(obj);
                    kq5 kq5Var3 = hu2Var.g;
                    this.J = true;
                    p = kq5Var3.p(str, this);
                    if (p == el0Var) {
                        break;
                    }
                } else if (!z4) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    p = ((h54) obj).I;
                }
                if (!(p instanceof g54)) {
                    MixInfo mixInfo = (MixInfo) p;
                    if (mixInfo == null) {
                        fw4Var8.getClass();
                        fw4Var8.i(null, "合集不存在或已不可见");
                    } else {
                        hu2Var.x(mixInfo);
                    }
                }
                Throwable a4 = h54.a(p);
                if (a4 != null) {
                    String message3 = a4.getMessage();
                    if (message3 == null) {
                        message3 = "合集加载失败";
                    }
                    fw4Var8.getClass();
                    fw4Var8.i(null, message3);
                    break;
                }
                break;
        }
        return wd5Var;
    }
}

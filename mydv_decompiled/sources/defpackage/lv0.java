package defpackage;

import android.content.Context;
import com.github.mytv.dv.widget.DesktopWidgetsKt;
import com.github.mytv.dv.widget.WidgetPlayback;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lv0 implements in1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ lv0(t33 t33Var, yq4 yq4Var, boolean z) {
        this.I = (byte) 2;
        this.K = t33Var;
        this.L = yq4Var;
        this.J = z;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        wd5 NowPlayingContent$lambda$0$1;
        boolean z;
        byte b = this.I;
        boolean z2 = this.J;
        wd5 wd5Var = wd5.a;
        Object obj4 = this.L;
        Object obj5 = this.K;
        switch (b) {
            case 0:
                NowPlayingContent$lambda$0$1 = DesktopWidgetsKt.NowPlayingContent$lambda$0$1((Context) obj5, this.J, (WidgetPlayback) obj4, (v74) obj, (fe0) obj2, ((Integer) obj3).intValue());
                return NowPlayingContent$lambda$0$1;
            case 1:
                ox5 ox5Var = (ox5) obj5;
                String str = (String) obj4;
                fe0 fe0Var = (fe0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((mg2) obj).getClass();
                go1 go1Var = (go1) fe0Var;
                if (go1Var.T(intValue & 1, (intValue & 17) != 16)) {
                    mw3.w(ox5Var.a, ox5Var.b, this.J, str, go1Var, 0);
                } else {
                    go1Var.W();
                }
                return wd5Var;
            case 2:
                ((Integer) obj3).getClass();
                fr4.a.a((t33) obj5, null, (yq4) obj4, this.J, 0L, (fe0) obj2, 196608);
                return wd5Var;
            case 3:
                l45 l45Var = (l45) obj5;
                jk3 jk3Var = l45Var.f;
                t33 t33Var = (t33) obj4;
                ((Integer) obj3).getClass();
                go1 go1Var2 = (go1) ((fe0) obj2);
                go1Var2.d0(-2137546592);
                boolean z3 = ((pg3) jk3Var.getValue()) == pg3.I || !(go1Var2.k(hf0.n) == da2.J);
                boolean g = go1Var2.g(l45Var);
                Object Q = go1Var2.Q();
                jp jpVar = de0.a;
                if (g || Q == jpVar) {
                    Q = new e35((Object) l45Var, (byte) 2);
                    go1Var2.o0(Q);
                }
                t43 x = ad4.x((tm1) Q, go1Var2);
                Object Q2 = go1Var2.Q();
                if (Q2 == jpVar) {
                    qs0 qs0Var = new qs0(new xx2(x, (byte) 23));
                    go1Var2.o0(qs0Var);
                    Q2 = qs0Var;
                }
                gc4 gc4Var = (gc4) Q2;
                boolean g2 = go1Var2.g(gc4Var) | go1Var2.g(l45Var);
                Object Q3 = go1Var2.Q();
                if (g2 || Q3 == jpVar) {
                    Q3 = new k45(gc4Var, l45Var);
                    go1Var2.o0(Q3);
                }
                l13 a0 = j42.a0((k45) Q3, (pg3) jk3Var.getValue(), z2 && l45Var.b.h() != 0.0f, z3, t33Var);
                go1Var2.q(false);
                return a0;
            default:
                rm1 rm1Var = (rm1) obj5;
                hk3 hk3Var = (hk3) obj4;
                fe0 fe0Var2 = (fe0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ui) obj).getClass();
                go1 go1Var3 = (go1) fe0Var2;
                if (go1Var3.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    long h = hk3Var.h();
                    if (r13.e(go1Var3)) {
                        go1Var3.d0(-183027131);
                        boolean z4 = ((bw0) go1Var3.k(cw0.a)).a == ww5.I;
                        go1Var3.q(false);
                        z = z4;
                    } else {
                        go1Var3.d0(-1378872528);
                        go1Var3.q(false);
                        z = false;
                    }
                    on5.t(rm1Var, h, null, z, !z2, go1Var3, 6, 4);
                } else {
                    go1Var3.W();
                }
                return wd5Var;
        }
    }

    public /* synthetic */ lv0(byte b, Object obj, Object obj2, boolean z) {
        this.I = b;
        this.K = obj;
        this.J = z;
        this.L = obj2;
    }
}

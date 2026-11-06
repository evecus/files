package defpackage;

import com.github.mytv.dv.model.Author;
import com.github.mytv.dv.model.HotWord;
import com.github.mytv.dv.model.LiveRoom;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fa4 implements hn1 {
    public final /* synthetic */ byte I;

    public /* synthetic */ fa4(byte b) {
        this.I = b;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                vn3 vn3Var = (vn3) obj2;
                Boolean valueOf = Boolean.valueOf(vn3Var.a);
                da daVar = ea4.a;
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                b65 b65Var = (b65) obj2;
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                int intValue = ((Integer) obj).intValue();
                String str = (String) obj2;
                str.getClass();
                break;
            case 7:
                int intValue2 = ((Integer) obj).intValue();
                HotWord hotWord = (HotWord) obj2;
                hotWord.getClass();
                break;
            case 8:
                int intValue3 = ((Integer) obj).intValue();
                Author author = (Author) obj2;
                author.getClass();
                break;
            case 9:
                int intValue4 = ((Integer) obj).intValue();
                Author author2 = (Author) obj2;
                author2.getClass();
                break;
            case 10:
                ((Integer) obj).getClass();
                cd4 cd4Var = (cd4) obj2;
                cd4Var.getClass();
                break;
            case 11:
                int intValue5 = ((Integer) obj).intValue();
                LiveRoom liveRoom = (LiveRoom) obj2;
                liveRoom.getClass();
                break;
            case 12:
                ((Integer) obj).getClass();
                List list = (List) obj2;
                list.getClass();
                break;
            case 13:
                ((Integer) obj2).getClass();
                he4.h((fe0) obj, mu0.X(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                qe4.k((fe0) obj, mu0.X(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                qe4.o((fe0) obj, mu0.X(1));
                break;
            case 16:
                si4 si4Var = (si4) obj2;
                Object valueOf2 = Float.valueOf(0.0f);
                ki4 ki4Var = ((si4) obj).d;
                bj4 bj4Var = zi4.u;
                Object g = ki4Var.I.g(bj4Var);
                if (g == null) {
                    g = valueOf2;
                }
                float floatValue = ((Number) g).floatValue();
                Object g2 = si4Var.d.I.g(bj4Var);
                if (g2 != null) {
                    valueOf2 = g2;
                }
                break;
            case 17:
                ((ik4) obj).getClass();
                uj3[] uj3VarArr = {new uj3("KEY", ((vo) obj2).a)};
                cp0 cp0Var = new cp0((byte) 0);
                uj3 uj3Var = uj3VarArr[0];
                cp0Var.h(uj3Var.J, (String) uj3Var.I);
                break;
            case 18:
                int intValue6 = ((Integer) obj).intValue();
                ((Boolean) obj2).booleanValue();
                if (intValue6 == 0) {
                }
                break;
            case 19:
                ((s71) obj).c = ((v11) obj2).a;
                break;
            case 20:
                ((s71) obj).d = (rq4) obj2;
                break;
            case 21:
                ((t71) obj).a = (lq1) obj2;
                break;
            case 22:
                ((Integer) obj2).getClass();
                fv4.g((fe0) obj, mu0.X(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                fv4.c((fe0) obj, mu0.X(1));
                break;
            case 24:
                l45 l45Var = (l45) obj2;
                break;
            case 25:
                ((u71) obj).a = (String) obj2;
                break;
            case 26:
                ((u71) obj).d = (lq1) obj2;
                break;
            case 27:
                ((u71) obj).b = (l65) obj2;
                break;
            case 28:
                ((u71) obj).c = ((Integer) obj2).intValue();
                break;
            default:
                ((Integer) obj2).getClass();
                on5.p((fe0) obj, mu0.X(1));
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ fa4(byte b, int i) {
        this.I = b;
    }
}

package defpackage;

import android.app.RemoteAction;
import android.graphics.RectF;
import android.view.textclassifier.TextClassification;
import com.github.mytv.dv.model.CameraInfo;
import com.github.mytv.dv.widget.DesktopWidgetsKt;
import com.github.mytv.dv.widget.WidgetPalette;
import com.github.mytv.dv.widget.WidgetUiKt;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rd implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ rd(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        boolean g;
        wd5 HotWordRow$lambda$0$0;
        String title;
        wd5 WidgetCover$lambda$0$0;
        switch (this.I) {
            case 0:
                hn3 hn3Var = (hn3) this.J;
                m14 m0 = sp0.m0((RectF) obj);
                m14 m02 = sp0.m0((RectF) obj2);
                switch (hn3Var.a) {
                    case 12:
                        g = m0.g(m02);
                        break;
                    default:
                        g = m02.a(m0.b());
                        break;
                }
                return Boolean.valueOf(g);
            case 1:
                ((Integer) obj2).getClass();
                c5.l((u45) this.J, (fe0) obj, mu0.X(1));
                return wd5.a;
            case 2:
                c35 c35Var = (c35) this.J;
                ((Integer) obj2).getClass();
                go1 go1Var = (go1) ((fe0) obj);
                go1Var.d0(666084174);
                String str = c35Var.b;
                go1Var.q(false);
                return str;
            case 3:
                HotWordRow$lambda$0$0 = DesktopWidgetsKt.HotWordRow$lambda$0$0((gb5) this.J, (fe0) obj, ((Integer) obj2).intValue());
                return HotWordRow$lambda$0$0;
            case 4:
                ((Integer) obj2).getClass();
                ((qw0) this.J).a((fe0) obj, mu0.X(1));
                return wd5.a;
            case 5:
                fe0 fe0Var = (fe0) obj;
                int intValue = ((Integer) obj2).intValue();
                go1 go1Var2 = (go1) fe0Var;
                if (go1Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    throw null;
                }
                go1Var2.W();
                return wd5.a;
            case 6:
                ((Integer) obj2).getClass();
                ((g02) this.J).a((fe0) obj, mu0.X(1));
                return wd5.a;
            case 7:
                ((Integer) obj2).getClass();
                ci2.k((hx1) this.J, (fe0) obj, mu0.X(1));
                return wd5.a;
            case 8:
                cw4 cw4Var = (cw4) this.J;
                int intValue2 = ((Integer) obj).intValue();
                ((Boolean) obj2).getClass();
                if (intValue2 == -1) {
                    return "主画面";
                }
                CameraInfo cameraInfo = (CameraInfo) o70.V0(intValue2, (List) cw4Var.getValue());
                if (cameraInfo != null && (title = cameraInfo.getTitle()) != null) {
                    String str2 = jx4.L(title) ? null : title;
                    if (str2 != null) {
                        return str2;
                    }
                }
                return hf1.u(intValue2 + 1, "机位 ");
            case 9:
                ((s35) this.J).e(((pd3) obj2).a);
                return wd5.a;
            case 10:
                c33 c33Var = (c33) this.J;
                Set set = (Set) obj;
                r24 r24Var = new r24();
                synchronized (c33Var.a) {
                    n43 n43Var = c33Var.b;
                    m6 m6Var = new m6((Object) set, (Object) c33Var, (Object) r24Var, (byte) 16);
                    p70.A(1, m6Var);
                    Object[] objArr = n43Var.b;
                    long[] jArr = n43Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128) {
                                        m6Var.invoke(objArr[(i << 3) + i3]);
                                    }
                                    j >>= 8;
                                }
                                if (i2 != 8) {
                                }
                            }
                            if (i != length) {
                                i++;
                            }
                        }
                    }
                    List list = (List) r24Var.I;
                    if (list != null) {
                        int size = list.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            ((mj4) list.get(i4)).d(wd5.a);
                        }
                    }
                }
                return wd5.a;
            case 11:
                ((Integer) obj2).getClass();
                ((vq3) this.J).a((fe0) obj, mu0.X(1));
                return wd5.a;
            case 12:
                return (ve1) this.J;
            case 13:
                ((Integer) obj2).getClass();
                qe4.j((bd4) this.J, (fe0) obj, mu0.X(1));
                return wd5.a;
            case 14:
                q24 q24Var = (q24) this.J;
                ((rp3) obj).a();
                q24Var.I = ((pd3) obj2).a;
                return wd5.a;
            case 15:
                ((Integer) obj2).getClass();
                eg5.c((lq1) this.J, (fe0) obj, mu0.X(1));
                return wd5.a;
            case 16:
                char[] cArr = (char[]) this.J;
                CharSequence charSequence = (CharSequence) obj;
                int intValue3 = ((Integer) obj2).intValue();
                charSequence.getClass();
                int K = jx4.K(charSequence, cArr, intValue3, false);
                if (K < 0) {
                    return null;
                }
                return new uj3(Integer.valueOf(K), 1);
            case 17:
                ((Integer) obj2).getClass();
                return rn3.e((TextClassification) this.J, (fe0) obj);
            case 18:
                ((Integer) obj2).getClass();
                return rn3.f((RemoteAction) this.J, (fe0) obj);
            case 19:
                ((Integer) obj2).getClass();
                ((y55) this.J).a((fe0) obj, mu0.X(1));
                return wd5.a;
            case 20:
                HashMap hashMap = (HashMap) this.J;
                String str3 = (String) obj;
                Long l = (Long) obj2;
                l.longValue();
                str3.getClass();
                hashMap.put(str3, l);
                return wd5.a;
            case 21:
                zd1 zd1Var = (zd1) this.J;
                String str4 = (String) obj;
                long longValue = ((Long) obj2).longValue();
                str4.getClass();
                zd1Var.c(str4, longValue);
                return wd5.a;
            default:
                WidgetCover$lambda$0$0 = WidgetUiKt.WidgetCover$lambda$0$0((WidgetPalette) this.J, (fe0) obj, ((Integer) obj2).intValue());
                return WidgetCover$lambda$0$0;
        }
    }

    public /* synthetic */ rd(Object obj, int i, byte b) {
        this.I = b;
        this.J = obj;
    }
}

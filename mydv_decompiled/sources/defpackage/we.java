package defpackage;

import android.os.Build;
import android.os.Trace;
import androidx.media3.exoplayer.ExoPlayer;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class we implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ we(List list, boolean z, k80 k80Var, rm1 rm1Var) {
        this.I = (byte) 2;
        this.L = list;
        this.J = z;
        this.M = k80Var;
        this.K = rm1Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        byte b2 = 0;
        wd5 wd5Var = wd5.a;
        byte b3 = 3;
        Object obj2 = this.M;
        Object obj3 = this.L;
        boolean z = this.J;
        Object obj4 = this.K;
        byte b4 = 1;
        switch (b) {
            case 0:
                tw1 tw1Var = (tw1) obj3;
                hw hwVar = (hw) obj2;
                ya2 ya2Var = (ya2) ((zh0) obj);
                ya2Var.a();
                r10 r10Var = ya2Var.I;
                if (((Boolean) ((rm1) obj4).invoke()).booleanValue()) {
                    if (z) {
                        long Y = r10Var.Y();
                        pn pnVar = r10Var.J;
                        long H = pnVar.H();
                        pnVar.q().f();
                        try {
                            ((ep) pnVar.b).H(-1.0f, 1.0f, Y);
                            r7.i(ya2Var, tw1Var, 0L, 0.0f, hwVar, 46);
                        } finally {
                            r7.H(pnVar, H);
                        }
                    } else {
                        r7.i(ya2Var, tw1Var, 0L, 0.0f, hwVar, 46);
                    }
                }
                return wd5Var;
            case 1:
                of2 of2Var = (of2) obj;
                of2Var.getClass();
                List list = (List) ((t43) obj4).getValue();
                of2Var.a0(list.size(), new ee(new bd0((byte) 9), list, b3), new v30(list, b4), new tc0(2039820996, new x30(list, z, (tm1) obj3, (s33) obj2), true));
                return wd5Var;
            case 2:
                List list2 = (List) obj3;
                k80 k80Var = (k80) obj2;
                rm1 rm1Var = (rm1) obj4;
                of2 of2Var2 = (of2) obj;
                of2Var2.getClass();
                of2Var2.a0(list2.size(), new jm5(new m45((byte) 10), list2, b2), new v30(list2, (byte) 21), new tc0(802480018, new km5(list2), true));
                if (z) {
                    i82.M(of2Var2, "loading", j42.d, 2);
                } else if (list2.isEmpty()) {
                    i82.M(of2Var2, "empty", new tc0(-1310326547, new h30(k80Var, (byte) 7), true), 2);
                } else {
                    i82.M(of2Var2, "more", new tc0(627555469, new po2(rm1Var, b3), true), 2);
                }
                return wd5Var;
            case 3:
                fp3 fp3Var = (fp3) obj4;
                ExoPlayer exoPlayer = (ExoPlayer) obj3;
                t43 t43Var = (t43) obj2;
                ((ay0) obj).getClass();
                if (!z) {
                    wi4.b++;
                }
                return new oo5(z, fp3Var, exoPlayer, t43Var);
            default:
                ol2 ol2Var = (ol2) obj4;
                String str = (String) obj3;
                dz5 dz5Var = (dz5) obj2;
                Throwable th = (Throwable) obj;
                if (th instanceof vy5) {
                    ol2Var.stop(((vy5) th).I);
                }
                if (z && str != null) {
                    int hashCode = dz5Var.a.hashCode();
                    if (Build.VERSION.SDK_INT >= 29) {
                        e95.b(hashCode, ui4.s(str));
                    } else {
                        String s = ui4.s(str);
                        try {
                            Method method = ui4.f;
                            if (method == null) {
                                method = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                                ui4.f = method;
                            }
                            method.invoke(null, Long.valueOf(ui4.c), s, Integer.valueOf(hashCode));
                        } catch (Exception e) {
                            ui4.j("asyncTraceEnd", e);
                        }
                    }
                }
                return wd5Var;
        }
    }

    public /* synthetic */ we(Object obj, boolean z, Object obj2, Object obj3, byte b) {
        this.I = b;
        this.K = obj;
        this.J = z;
        this.L = obj2;
        this.M = obj3;
    }

    public /* synthetic */ we(boolean z, fp3 fp3Var, ExoPlayer exoPlayer, t43 t43Var) {
        this.I = (byte) 3;
        this.J = z;
        this.K = fp3Var;
        this.L = exoPlayer;
        this.M = t43Var;
    }
}

package defpackage;

import android.net.ConnectivityManager;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import okhttp3.CertificatePinner;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yj implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ yj(go1 go1Var, h20 h20Var, sr4 sr4Var, r23 r23Var) {
        this.I = (byte) 6;
        this.J = go1Var;
        this.K = h20Var;
        this.L = sr4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rm1
    public final Object invoke() {
        List check$lambda$0;
        ei0 ei0Var;
        m14 m14Var;
        boolean l0;
        od2 od2Var;
        byte b = this.I;
        byte b2 = 5;
        boolean z = false;
        z = false;
        byte b3 = 1;
        wd5 wd5Var = wd5.a;
        Integer num = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object obj = this.L;
        Object obj2 = this.K;
        Object obj3 = this.J;
        switch (b) {
            case 0:
                sb4 sb4Var = (sb4) obj3;
                dl0 dl0Var = (dl0) obj2;
                ki1 ki1Var = (ki1) obj;
                if (il2.C(sb4Var)) {
                    try {
                        ki1.a(ki1Var);
                    } catch (Throwable unused) {
                    }
                } else {
                    p70.g0(dl0Var, null, null, new ak(sb4Var, objArr == true ? 1 : 0, b3), 3);
                }
                return wd5Var;
            case 1:
                hu2 hu2Var = (hu2) obj2;
                q73 q73Var = (q73) obj;
                if (((tw3) obj3) == null) {
                    hu2Var.p.q();
                    q73Var.b();
                }
                return wd5Var;
            case 2:
                check$lambda$0 = CertificatePinner.check$lambda$0((CertificatePinner) obj3, (List) obj2, (String) obj);
                return check$lambda$0;
            case 3:
                t43 t43Var = (t43) obj2;
                t43 t43Var2 = (t43) obj;
                if (((so3) obj3) == so3.M) {
                    ExoPlayer exoPlayer = (ExoPlayer) t43Var.getValue();
                    if (exoPlayer != null) {
                        exoPlayer.seekTo(0L);
                    }
                    ExoPlayer exoPlayer2 = (ExoPlayer) t43Var.getValue();
                    if (exoPlayer2 != null) {
                        exoPlayer2.setPlayWhenReady(true);
                    }
                    ExoPlayer exoPlayer3 = (ExoPlayer) t43Var.getValue();
                    if (exoPlayer3 != null) {
                        exoPlayer3.play();
                    }
                    t43Var2.setValue(Boolean.TRUE);
                } else {
                    t43Var2.setValue(Boolean.FALSE);
                }
                return wd5Var;
            case 4:
                t43 t43Var3 = (t43) obj2;
                t43 t43Var4 = (t43) obj;
                Iterator it = ((ag2) obj3).h().l.iterator();
                if (it.hasNext()) {
                    vf2 vf2Var = (vf2) it.next();
                    float f = cb0.a;
                    db0 db0Var = (db0) o70.V0(vf2Var.a - 1, (List) t43Var3.getValue());
                    Integer valueOf = Integer.valueOf(db0Var != null ? db0Var.d : -1);
                    while (true) {
                        num = valueOf;
                        while (it.hasNext()) {
                            db0 db0Var2 = (db0) o70.V0(((vf2) it.next()).a - 1, (List) t43Var3.getValue());
                            valueOf = Integer.valueOf(db0Var2 != null ? db0Var2.d : -1);
                            if (num.compareTo(valueOf) < 0) {
                                break;
                            }
                        }
                    }
                }
                int intValue = num != null ? num.intValue() : -1;
                float f2 = cb0.a;
                if (((Number) t43Var4.getValue()).intValue() > 0) {
                    int intValue2 = ((Number) t43Var4.getValue()).intValue() - 3;
                    if (intValue2 < 0) {
                        intValue2 = 0;
                    }
                    if (intValue >= intValue2) {
                        z = true;
                    }
                }
                return new uj3(Boolean.valueOf(z), Integer.valueOf(((Number) t43Var4.getValue()).intValue()));
            case 5:
                ei0 ei0Var2 = (ei0) obj3;
                bf5 bf5Var = (bf5) obj2;
                oy oyVar = (oy) obj;
                cy cyVar = ei0Var2.N;
                while (true) {
                    b53 b53Var = cyVar.a;
                    int i = b53Var.K;
                    if (i == 0) {
                        ei0Var = ei0Var2;
                    } else {
                        if (i == 0) {
                            s83.l("MutableVector is empty.");
                            return null;
                        }
                        m14 m14Var2 = (m14) ((bi0) b53Var.I[i - 1]).a.invoke();
                        if (m14Var2 == null) {
                            ei0Var = ei0Var2;
                            l0 = true;
                        } else {
                            ei0Var = ei0Var2;
                            l0 = ei0.l0(ei0Var, m14Var2, 0L, 0L, 3);
                        }
                        if (l0) {
                            b53 b53Var2 = cyVar.a;
                            ((bi0) b53Var2.l(b53Var2.K - 1)).b.resumeWith(wd5Var);
                            ei0Var2 = ei0Var;
                        }
                    }
                }
                if (ei0Var.O && (m14Var = (m14) ei0Var.M.invoke()) != null) {
                    ei0 ei0Var3 = ei0Var;
                    ei0Var = ei0Var3;
                    if (ei0.l0(ei0Var3, m14Var, 0L, 0L, 3)) {
                        ei0Var.O = false;
                    }
                }
                bf5Var.e = ei0Var.j0(oyVar, 0L);
                return wd5Var;
            case 6:
                go1 go1Var = (go1) obj3;
                h20 h20Var = (h20) obj2;
                sr4 sr4Var = (sr4) obj;
                ge0 ge0Var = go1Var.M;
                h20 h20Var2 = ge0Var.b;
                try {
                    ge0Var.b = h20Var;
                    sr4 sr4Var2 = go1Var.G;
                    int[] iArr = go1Var.o;
                    q33 q33Var = go1Var.v;
                    go1Var.o = null;
                    go1Var.v = null;
                    try {
                        go1Var.G = sr4Var;
                        boolean z2 = ge0Var.e;
                        try {
                            ge0Var.e = false;
                            go1Var.H(null, null);
                            return wd5Var;
                        } finally {
                            ge0Var.e = z2;
                        }
                    } finally {
                        go1Var.G = sr4Var2;
                        go1Var.o = iArr;
                        go1Var.v = q33Var;
                    }
                } finally {
                    ge0Var.b = h20Var2;
                }
            case 7:
                ConnectivityManager connectivityManager = (ConnectivityManager) obj2;
                c02 c02Var = (c02) obj;
                if (((n24) obj3).I) {
                    fr2.e().a(fx5.a, "NetworkRequestConstraintController unregister callback");
                    connectivityManager.unregisterNetworkCallback(c02Var);
                }
                return wd5Var;
            case 8:
                ag2 ag2Var = (ag2) obj2;
                of2 of2Var = (of2) ((wu0) obj3).getValue();
                return new pf2(ag2Var, of2Var, (zd2) obj, new tl((u22) ((re2) ag2Var.e.f).getValue(), of2Var));
            case 9:
                qg5.x((hu2) obj3, (hk3) obj2);
                ((t43) obj).setValue(Boolean.valueOf(!((Boolean) r10.getValue()).booleanValue()));
                return wd5Var;
            case 10:
                hn1 hn1Var = (hn1) obj3;
                Object obj4 = (gv1) obj;
                hs2 hs2Var = (hs2) ((r24) obj2).I;
                n43 n43Var = hs2Var.U;
                if (n43Var == null) {
                    long[] jArr = ia4.a;
                    n43Var = new n43();
                    hs2Var.U = n43Var;
                }
                Object g = n43Var.g(obj4);
                if (g == null) {
                    g = new fs2(hs2Var);
                    n43Var.m(obj4, g);
                }
                fs2 fs2Var = (fs2) g;
                fs2Var.I = false;
                hn1Var.invoke(fs2Var, obj4);
                return wd5Var;
            case 11:
                bo1 bo1Var = (bo1) obj3;
                wr4 wr4Var = (wr4) obj2;
                kg3 kg3Var = (kg3) obj;
                if (bo1Var != null) {
                    wr4Var.a(wr4Var.c(bo1Var) - wr4Var.t);
                }
                List o = a5.o(wr4Var, null, wr4Var.t, null);
                wd0 wd0Var = (wd0) o70.b1(o);
                Integer num2 = wd0Var != null ? wd0Var.b : null;
                List d = kg3Var.d(num2);
                if (num2 != null && !d.isEmpty()) {
                    d = o70.f1(p70.j0(new wd0(((wd0) o70.T0(d)).a, null, num2)), o70.Q0(d, 1));
                }
                return new vd0(o70.f1(o, d), kg3Var.f());
            case 12:
                ez3 ez3Var = (ez3) obj3;
                t43 t43Var5 = (t43) obj2;
                String str = (String) t43Var5.getValue();
                t43Var5.setValue("");
                ((t43) obj).setValue(Boolean.TRUE);
                ez3Var.getClass();
                str.getClass();
                if (!ez3Var.g) {
                    StringBuilder sb = new StringBuilder();
                    int length = str.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        char charAt = str.charAt(i2);
                        if (Character.isDigit(charAt)) {
                            sb.append(charAt);
                        }
                    }
                    String f0 = jx4.f0(6, sb.toString());
                    if (f0.length() != 0 && (od2Var = ez3Var.i) != null) {
                        p70.g0(ez3Var.d, null, null, new eg1(od2Var, f0, objArr2 == true ? 1 : 0, b2), 3);
                    }
                }
                return wd5Var;
            case 13:
                ConnectivityManager connectivityManager2 = (ConnectivityManager) obj2;
                c02 c02Var2 = (c02) obj;
                if (((n24) obj3).I && connectivityManager2 != null) {
                    connectivityManager2.unregisterNetworkCallback(c02Var2);
                }
                return wd5Var;
            case 14:
                ((tm1) obj3).invoke(((String) obj2) + ((String) obj));
                return wd5Var;
            case 15:
                sb4 sb4Var2 = (sb4) obj3;
                dl0 dl0Var2 = (dl0) obj2;
                rm1 rm1Var = (rm1) obj;
                if (sb4Var2.a.h() > 0) {
                    p70.g0(dl0Var2, null, null, new ak(sb4Var2, objArr3 == true ? 1 : 0, b2), 3);
                } else {
                    rm1Var.invoke();
                }
                return wd5Var;
            case 16:
                boolean z3 = ro5.a;
                Boolean bool = (Boolean) ((t43) obj3).getValue();
                bool.getClass();
                Boolean bool2 = (Boolean) ((t43) obj2).getValue();
                bool2.booleanValue();
                Boolean bool3 = (Boolean) ((t43) obj).getValue();
                bool3.getClass();
                return new gb5(bool, bool2, bool3);
            case 17:
                ku5.f((lu5) obj3, (iu5) obj2, (ju5) obj);
                return wd5Var;
            case 18:
                dy5 dy5Var = (dy5) obj3;
                UUID uuid = (UUID) obj2;
                dp0 dp0Var = (dp0) obj;
                dy5Var.getClass();
                String uuid2 = uuid.toString();
                fr2 e = fr2.e();
                String str2 = dy5.c;
                e.a(str2, "Updating progress for " + uuid + " (" + dp0Var + ")");
                WorkDatabase workDatabase = dy5Var.a;
                workDatabase.b();
                try {
                    ky5 e2 = workDatabase.w().e(uuid2);
                    if (e2 == null) {
                        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    if (e2.b == sx5.J) {
                        by5 by5Var = new by5(uuid2, dp0Var);
                        cy5 v = workDatabase.v();
                        v.getClass();
                        g4.V(v.a, false, true, new ap3((Object) v, (Object) by5Var, (byte) 20));
                    } else {
                        fr2.e().i(str2, "Ignoring setProgressAsync(...). WorkSpec (" + uuid2 + ") is not in a RUNNING state.");
                    }
                    workDatabase.p();
                    return null;
                } catch (Throwable th) {
                    try {
                        fr2.e().d(str2, "Error updating Worker progress", th);
                        throw th;
                    } finally {
                        workDatabase.l();
                    }
                }
            default:
                ux5 ux5Var = (ux5) obj3;
                String str3 = (String) obj2;
                xl3 xl3Var = (xl3) obj;
                WorkDatabase workDatabase2 = ux5Var.c;
                oy5 w = workDatabase2.w();
                List f3 = w.f(str3);
                if (f3.size() <= 1) {
                    iy5 iy5Var = (iy5) o70.U0(f3);
                    ac1 ac1Var = ac1.J;
                    if (iy5Var == null) {
                        z91.a(new gx5(ux5Var, str3, ac1Var, p70.j0(xl3Var), 0));
                        return wd5Var;
                    }
                    String str4 = iy5Var.a;
                    ky5 e3 = w.e(str4);
                    if (e3 == null) {
                        zy.i(hf1.x("WorkSpec with ", str4, ", that matches a name \"", str3, "\", wasn't found"));
                    } else if (!e3.c()) {
                        zy.p("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                    } else {
                        if (iy5Var.b == sx5.N) {
                            w.c(str4);
                            z91.a(new gx5(ux5Var, str3, ac1Var, p70.j0(xl3Var), 0));
                            return wd5Var;
                        }
                        ky5 b4 = ky5.b(xl3Var.b, iy5Var.a, null, null, null, 0, 0L, 0, 0, 0L, 0, 33554430);
                        yt3 yt3Var = ux5Var.f;
                        yt3Var.getClass();
                        workDatabase2.getClass();
                        uf0 uf0Var = ux5Var.b;
                        uf0Var.getClass();
                        List list = ux5Var.e;
                        list.getClass();
                        LinkedHashSet linkedHashSet = xl3Var.c;
                        String str5 = b4.a;
                        ky5 e4 = workDatabase2.w().e(str5);
                        if (e4 != null) {
                            if (e4.b.a()) {
                                return wd5Var;
                            }
                            if (e4.c() ^ b4.c()) {
                                StringBuilder sb2 = new StringBuilder("Can't update ");
                                sb2.append(e4.c() ? "Periodic" : "OneTime");
                                sb2.append(" Worker to ");
                                throw new UnsupportedOperationException(hf1.z(sb2, b4.c() ? "Periodic" : "OneTime", " Worker. Update operation must preserve worker's type."));
                            }
                            boolean f4 = yt3Var.f(str5);
                            if (!f4) {
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    ((na4) it2.next()).d(str5);
                                }
                            }
                            workDatabase2.o(new kv(workDatabase2, e4, b4, list, str5, linkedHashSet, f4));
                            if (f4) {
                                return wd5Var;
                            }
                            pa4.b(uf0Var, workDatabase2, list);
                            return wd5Var;
                        }
                        s83.t(r7.C("Worker with ", str5, " doesn't exist"));
                    }
                } else {
                    zy.p("Can't apply UPDATE policy to the chains of work.");
                }
                return null;
        }
    }

    public /* synthetic */ yj(Object obj, Object obj2, Object obj3, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
        this.L = obj3;
    }
}

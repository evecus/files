package defpackage;

import androidx.media3.exoplayer.offline.DownloadService;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.work.impl.WorkDatabase;
import com.github.mytv.dv.model.VideoPlayUrlResolver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class pu0 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ String J;

    public /* synthetic */ pu0(String str, byte b) {
        this.I = b;
        this.J = str;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        q84 Y;
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        dp0 dp0Var;
        int i;
        rx5 rx5Var;
        HashSet hashSet;
        sx5 sx5Var;
        long j;
        long j2;
        List selectCandidateUrls$lambda$6;
        ky5 ky5Var;
        sx5 sx5Var2;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        String str = this.J;
        switch (b) {
            case 0:
                o84 o84Var = (o84) obj;
                o84Var.getClass();
                Y = o84Var.Y("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                try {
                    Y.v(1, str);
                    if (Y.T()) {
                        z = false;
                        if (((int) Y.getLong(0)) != 0) {
                            z2 = true;
                            Y.close();
                            return Boolean.valueOf(z2);
                        }
                    } else {
                        z = false;
                    }
                    z2 = z;
                    Y.close();
                    return Boolean.valueOf(z2);
                } finally {
                }
            case 1:
                o84 o84Var2 = (o84) obj;
                o84Var2.getClass();
                Y = o84Var2.Y("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
                try {
                    Y.v(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (Y.T()) {
                        arrayList2.add(Y.H(0));
                    }
                    return arrayList2;
                } finally {
                }
            case 2:
                o84 o84Var3 = (o84) obj;
                o84Var3.getClass();
                Y = o84Var3.Y("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                try {
                    Y.v(1, str);
                    if (Y.T()) {
                        if (((int) Y.getLong(0)) != 0) {
                            z3 = true;
                            Y.close();
                            return Boolean.valueOf(z3);
                        }
                    }
                    z3 = false;
                    Y.close();
                    return Boolean.valueOf(z3);
                } finally {
                }
            case 3:
                ((ji4) obj).a.put(j16.r0, p70.j0(str));
                return wd5Var;
            case 4:
                ((Integer) obj).getClass();
                return str;
            case 5:
                o84 o84Var4 = (o84) obj;
                o84Var4.getClass();
                Y = o84Var4.Y("SELECT long_value FROM Preference where `key`=?");
                try {
                    Y.v(1, str);
                    return (!Y.T() || Y.isNull(0)) ? null : Long.valueOf(Y.getLong(0));
                } finally {
                }
            case 6:
                WorkDatabase workDatabase = (WorkDatabase) obj;
                workDatabase.getClass();
                s83 s83Var = ky5.A;
                oy5 w = workDatabase.w();
                w.getClass();
                str.getClass();
                List<jy5> list = (List) g4.V(w.a, true, true, new ap3((Object) str, (Object) w, (byte) 22));
                s83Var.getClass();
                if (list != null) {
                    ArrayList arrayList3 = new ArrayList(p70.J(list, 10));
                    for (jy5 jy5Var : list) {
                        List list2 = jy5Var.q;
                        sx5 sx5Var3 = jy5Var.b;
                        dp0 dp0Var2 = !list2.isEmpty() ? (dp0) list2.get(0) : dp0.b;
                        UUID fromString = UUID.fromString(jy5Var.a);
                        fromString.getClass();
                        HashSet hashSet2 = new HashSet(jy5Var.p);
                        dp0 dp0Var3 = jy5Var.c;
                        int i2 = jy5Var.h;
                        int i3 = jy5Var.m;
                        ch0 ch0Var = jy5Var.g;
                        long j3 = jy5Var.d;
                        long j4 = jy5Var.e;
                        if (j4 != 0) {
                            dp0Var = dp0Var3;
                            i = i2;
                            rx5Var = new rx5(j4, jy5Var.f);
                        } else {
                            dp0Var = dp0Var3;
                            i = i2;
                            rx5Var = null;
                        }
                        sx5 sx5Var4 = sx5.I;
                        if (sx5Var3 == sx5Var4) {
                            String str2 = ky5.z;
                            hashSet = hashSet2;
                            sx5Var = sx5Var3;
                            j = j3;
                            j2 = kb4.j(sx5Var3 == sx5Var4 && i > 0, i, jy5Var.i, jy5Var.j, jy5Var.k, jy5Var.l, j4 != 0, j, jy5Var.f, j4, jy5Var.n);
                        } else {
                            hashSet = hashSet2;
                            sx5Var = sx5Var3;
                            j = j3;
                            j2 = Long.MAX_VALUE;
                        }
                        arrayList3.add(new tx5(fromString, sx5Var, hashSet, dp0Var, dp0Var2, i, i3, ch0Var, j, rx5Var, j2, jy5Var.o));
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                arrayList.getClass();
                return arrayList;
            case 7:
                String str3 = (String) obj;
                str3.getClass();
                return jx4.L(str3) ? str3.length() < str.length() ? str : str3 : str.concat(str3);
            case 8:
                o84 o84Var5 = (o84) obj;
                o84Var5.getClass();
                Y = o84Var5.Y("DELETE FROM SystemIdInfo where work_spec_id=?");
                try {
                    Y.v(1, str);
                    Y.T();
                    return wd5Var;
                } finally {
                }
            case 9:
                selectCandidateUrls$lambda$6 = VideoPlayUrlResolver.selectCandidateUrls$lambda$6(str, (List) obj);
                return selectCandidateUrls$lambda$6;
            case 10:
                o84 o84Var6 = (o84) obj;
                o84Var6.getClass();
                Y = o84Var6.Y("SELECT name FROM workname WHERE work_spec_id=?");
                try {
                    Y.v(1, str);
                    ArrayList arrayList4 = new ArrayList();
                    while (Y.T()) {
                        arrayList4.add(Y.H(0));
                    }
                    return arrayList4;
                } finally {
                }
            case 11:
                o84 o84Var7 = (o84) obj;
                o84Var7.getClass();
                Y = o84Var7.Y("DELETE from WorkProgress where work_spec_id=?");
                try {
                    Y.v(1, str);
                    Y.T();
                    return wd5Var;
                } finally {
                }
            case 12:
                o84 o84Var8 = (o84) obj;
                o84Var8.getClass();
                Y = o84Var8.Y("SELECT * FROM workspec WHERE id=?");
                try {
                    Y.v(1, str);
                    int F = jl2.F(Y, TtmlNode.ATTR_ID);
                    int F2 = jl2.F(Y, "state");
                    int F3 = jl2.F(Y, "worker_class_name");
                    int F4 = jl2.F(Y, "input_merger_class_name");
                    int F5 = jl2.F(Y, "input");
                    int F6 = jl2.F(Y, "output");
                    int F7 = jl2.F(Y, "initial_delay");
                    int F8 = jl2.F(Y, "interval_duration");
                    int F9 = jl2.F(Y, "flex_duration");
                    int F10 = jl2.F(Y, "run_attempt_count");
                    int F11 = jl2.F(Y, "backoff_policy");
                    int F12 = jl2.F(Y, "backoff_delay_duration");
                    int F13 = jl2.F(Y, "last_enqueue_time");
                    int F14 = jl2.F(Y, "minimum_retention_duration");
                    int F15 = jl2.F(Y, "schedule_requested_at");
                    int F16 = jl2.F(Y, "run_in_foreground");
                    int F17 = jl2.F(Y, "out_of_quota_policy");
                    int F18 = jl2.F(Y, "period_count");
                    int F19 = jl2.F(Y, "generation");
                    int F20 = jl2.F(Y, "next_schedule_time_override");
                    int F21 = jl2.F(Y, "next_schedule_time_override_generation");
                    int F22 = jl2.F(Y, DownloadService.KEY_STOP_REASON);
                    int F23 = jl2.F(Y, "trace_tag");
                    int F24 = jl2.F(Y, "backoff_on_system_interruptions");
                    int F25 = jl2.F(Y, "required_network_type");
                    int F26 = jl2.F(Y, "required_network_request");
                    int F27 = jl2.F(Y, "requires_charging");
                    int F28 = jl2.F(Y, "requires_device_idle");
                    int F29 = jl2.F(Y, "requires_battery_not_low");
                    int F30 = jl2.F(Y, "requires_storage_not_low");
                    int F31 = jl2.F(Y, "trigger_content_update_delay");
                    int F32 = jl2.F(Y, "trigger_max_content_delay");
                    int F33 = jl2.F(Y, "content_uri_triggers");
                    if (Y.T()) {
                        String H = Y.H(F);
                        sx5 g = ry5.g((int) Y.getLong(F2));
                        String H2 = Y.H(F3);
                        String H3 = Y.H(F4);
                        byte[] blob = Y.getBlob(F5);
                        dp0 dp0Var4 = dp0.b;
                        dp0 G = c5.G(blob);
                        dp0 G2 = c5.G(Y.getBlob(F6));
                        long j5 = Y.getLong(F7);
                        long j6 = Y.getLong(F8);
                        long j7 = Y.getLong(F9);
                        int i4 = (int) Y.getLong(F10);
                        ut d = ry5.d((int) Y.getLong(F11));
                        long j8 = Y.getLong(F12);
                        long j9 = Y.getLong(F13);
                        long j10 = Y.getLong(F14);
                        long j11 = Y.getLong(F15);
                        boolean z4 = ((int) Y.getLong(F16)) != 0;
                        ug3 f = ry5.f((int) Y.getLong(F17));
                        int i5 = (int) Y.getLong(F18);
                        int i6 = (int) Y.getLong(F19);
                        long j12 = Y.getLong(F20);
                        int i7 = (int) Y.getLong(F21);
                        int i8 = (int) Y.getLong(F22);
                        String H4 = Y.isNull(F23) ? null : Y.H(F23);
                        Integer valueOf = Y.isNull(F24) ? null : Integer.valueOf((int) Y.getLong(F24));
                        ky5Var = new ky5(H, g, H2, H3, G, G2, j5, j6, j7, new ch0(ry5.l(Y.getBlob(F26)), ry5.e((int) Y.getLong(F25)), ((int) Y.getLong(F27)) != 0, ((int) Y.getLong(F28)) != 0, ((int) Y.getLong(F29)) != 0, ((int) Y.getLong(F30)) != 0, Y.getLong(F31), Y.getLong(F32), ry5.a(Y.getBlob(F33))), i4, d, j8, j9, j10, j11, z4, f, i5, i6, j12, i7, i8, H4, valueOf != null ? Boolean.valueOf(valueOf.intValue() != 0) : null);
                    } else {
                        ky5Var = null;
                    }
                    return ky5Var;
                } finally {
                }
            case 13:
                o84 o84Var9 = (o84) obj;
                o84Var9.getClass();
                Y = o84Var9.Y("SELECT state FROM workspec WHERE id=?");
                try {
                    Y.v(1, str);
                    if (Y.T()) {
                        Integer valueOf2 = Y.isNull(0) ? null : Integer.valueOf((int) Y.getLong(0));
                        if (valueOf2 != null) {
                            sx5Var2 = ry5.g(valueOf2.intValue());
                            return sx5Var2;
                        }
                    }
                    sx5Var2 = null;
                    return sx5Var2;
                } finally {
                }
            case 14:
                o84 o84Var10 = (o84) obj;
                o84Var10.getClass();
                Y = o84Var10.Y("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    Y.v(1, str);
                    ArrayList arrayList5 = new ArrayList();
                    while (Y.T()) {
                        arrayList5.add(Y.H(0));
                    }
                    return arrayList5;
                } finally {
                }
            case 15:
                o84 o84Var11 = (o84) obj;
                o84Var11.getClass();
                Y = o84Var11.Y("UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?");
                try {
                    Y.v(1, str);
                    Y.T();
                    int I = il2.I(o84Var11);
                    Y.close();
                    return Integer.valueOf(I);
                } finally {
                }
            case 16:
                o84 o84Var12 = (o84) obj;
                o84Var12.getClass();
                Y = o84Var12.Y("UPDATE workspec SET run_attempt_count=0 WHERE id=?");
                try {
                    Y.v(1, str);
                    Y.T();
                    int I2 = il2.I(o84Var12);
                    Y.close();
                    return Integer.valueOf(I2);
                } finally {
                }
            case 17:
                o84 o84Var13 = (o84) obj;
                o84Var13.getClass();
                Y = o84Var13.Y("UPDATE workspec SET period_count=period_count+1 WHERE id=?");
                try {
                    Y.v(1, str);
                    Y.T();
                    return wd5Var;
                } finally {
                }
            case 18:
                o84 o84Var14 = (o84) obj;
                o84Var14.getClass();
                Y = o84Var14.Y("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                try {
                    Y.v(1, str);
                    ArrayList arrayList6 = new ArrayList();
                    while (Y.T()) {
                        byte[] blob2 = Y.getBlob(0);
                        dp0 dp0Var5 = dp0.b;
                        arrayList6.add(c5.G(blob2));
                    }
                    return arrayList6;
                } finally {
                }
            case 19:
                o84 o84Var15 = (o84) obj;
                o84Var15.getClass();
                Y = o84Var15.Y("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?");
                try {
                    Y.v(1, str);
                    Y.T();
                    int I3 = il2.I(o84Var15);
                    Y.close();
                    return Integer.valueOf(I3);
                } finally {
                }
            case 20:
                o84 o84Var16 = (o84) obj;
                o84Var16.getClass();
                Y = o84Var16.Y("DELETE FROM workspec WHERE id=?");
                try {
                    Y.v(1, str);
                    Y.T();
                    return wd5Var;
                } finally {
                }
            case 21:
                o84 o84Var17 = (o84) obj;
                o84Var17.getClass();
                Y = o84Var17.Y("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    Y.v(1, str);
                    ArrayList arrayList7 = new ArrayList();
                    while (Y.T()) {
                        String H5 = Y.H(0);
                        sx5 g2 = ry5.g((int) Y.getLong(1));
                        H5.getClass();
                        iy5 iy5Var = new iy5();
                        iy5Var.a = H5;
                        iy5Var.b = g2;
                        arrayList7.add(iy5Var);
                    }
                    return arrayList7;
                } finally {
                }
            case 22:
                o84 o84Var18 = (o84) obj;
                o84Var18.getClass();
                Y = o84Var18.Y("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
                try {
                    Y.v(1, str);
                    ArrayList arrayList8 = new ArrayList();
                    while (Y.T()) {
                        arrayList8.add(Y.H(0));
                    }
                    return arrayList8;
                } finally {
                }
            default:
                o84 o84Var19 = (o84) obj;
                o84Var19.getClass();
                Y = o84Var19.Y("DELETE FROM worktag WHERE work_spec_id=?");
                try {
                    Y.v(1, str);
                    Y.T();
                    return wd5Var;
                } finally {
                }
        }
    }
}

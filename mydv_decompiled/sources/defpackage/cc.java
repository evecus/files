package defpackage;

import androidx.media3.exoplayer.offline.DownloadService;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cc implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ long J;

    public /* synthetic */ cc(long j, byte b) {
        this.I = b;
        this.J = j;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        q84 q84Var;
        int i;
        int i2;
        Integer valueOf;
        byte b = this.I;
        long j = this.J;
        switch (b) {
            case 0:
                m00 m00Var = (m00) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (m00Var.I.c() >> 32)) / 2.0f;
                return m00Var.a(new dc(intBitsToFloat, c5.s(m00Var, intBitsToFloat), new hw(j, 5), (byte) 0));
            case 1:
                ((cj4) obj).c(fi4.a, new ei4(is1.I, this.J, di4.J, true));
                return wd5.a;
            case 2:
                uo0 uo0Var = (uo0) obj;
                uo0Var.getClass();
                return Boolean.valueOf(uo0Var.f < j);
            default:
                o84 o84Var = (o84) obj;
                o84Var.getClass();
                q84 Y = o84Var.Y("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                try {
                    Y.b(1, j);
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
                    ArrayList arrayList = new ArrayList();
                    while (Y.T()) {
                        String H = Y.H(F);
                        int i3 = F14;
                        ArrayList arrayList2 = arrayList;
                        sx5 g = ry5.g((int) Y.getLong(F2));
                        String H2 = Y.H(F3);
                        String H3 = Y.H(F4);
                        byte[] blob = Y.getBlob(F5);
                        dp0 dp0Var = dp0.b;
                        dp0 G = c5.G(blob);
                        dp0 G2 = c5.G(Y.getBlob(F6));
                        long j2 = Y.getLong(F7);
                        long j3 = Y.getLong(F8);
                        long j4 = Y.getLong(F9);
                        int i4 = (int) Y.getLong(F10);
                        ut d = ry5.d((int) Y.getLong(F11));
                        long j5 = Y.getLong(F12);
                        long j6 = Y.getLong(F13);
                        long j7 = Y.getLong(i3);
                        int i5 = F15;
                        long j8 = Y.getLong(i5);
                        int i6 = F;
                        int i7 = F16;
                        boolean z = ((int) Y.getLong(i7)) != 0;
                        int i8 = F17;
                        int i9 = F2;
                        ug3 f = ry5.f((int) Y.getLong(i8));
                        int i10 = F18;
                        int i11 = F3;
                        int i12 = (int) Y.getLong(i10);
                        int i13 = F19;
                        int i14 = (int) Y.getLong(i13);
                        int i15 = F20;
                        long j9 = Y.getLong(i15);
                        int i16 = F21;
                        int i17 = (int) Y.getLong(i16);
                        int i18 = F22;
                        int i19 = (int) Y.getLong(i18);
                        int i20 = F23;
                        Boolean bool = null;
                        String H4 = Y.isNull(i20) ? null : Y.H(i20);
                        int i21 = F24;
                        if (Y.isNull(i21)) {
                            i = i17;
                            i2 = i18;
                            valueOf = null;
                        } else {
                            i = i17;
                            i2 = i18;
                            valueOf = Integer.valueOf((int) Y.getLong(i21));
                        }
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        }
                        int i22 = F25;
                        Boolean bool2 = bool;
                        x93 e = ry5.e((int) Y.getLong(i22));
                        int i23 = F26;
                        r93 l = ry5.l(Y.getBlob(i23));
                        F25 = i22;
                        F26 = i23;
                        int i24 = F27;
                        boolean z2 = ((int) Y.getLong(i24)) != 0;
                        F27 = i24;
                        int i25 = F28;
                        boolean z3 = ((int) Y.getLong(i25)) != 0;
                        int i26 = F29;
                        boolean z4 = ((int) Y.getLong(i26)) != 0;
                        F29 = i26;
                        int i27 = F30;
                        int i28 = F31;
                        int i29 = F32;
                        int i30 = F33;
                        F33 = i30;
                        q84Var = Y;
                        try {
                            arrayList2.add(new ky5(H, g, H2, H3, G, G2, j2, j3, j4, new ch0(l, e, z2, z3, z4, ((int) Y.getLong(i27)) != 0, Y.getLong(i28), Y.getLong(i29), ry5.a(Y.getBlob(i30))), i4, d, j5, j6, j7, j8, z, f, i12, i14, j9, i, i19, H4, bool2));
                            F30 = i27;
                            F2 = i9;
                            F17 = i8;
                            F19 = i13;
                            F22 = i2;
                            F24 = i21;
                            F = i6;
                            F15 = i5;
                            F32 = i29;
                            F16 = i7;
                            F20 = i15;
                            F21 = i16;
                            F23 = i20;
                            arrayList = arrayList2;
                            F28 = i25;
                            F3 = i11;
                            Y = q84Var;
                            F18 = i10;
                            F31 = i28;
                            F14 = i3;
                        } catch (Throwable th) {
                            th = th;
                            q84Var.close();
                            throw th;
                        }
                    }
                    q84 q84Var2 = Y;
                    ArrayList arrayList3 = arrayList;
                    q84Var2.close();
                    return arrayList3;
                } catch (Throwable th2) {
                    th = th2;
                    q84Var = Y;
                }
        }
    }
}

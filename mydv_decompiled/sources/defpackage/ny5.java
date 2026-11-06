package defpackage;

import androidx.media3.exoplayer.offline.DownloadService;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ny5 implements tm1 {
    public final /* synthetic */ byte I;

    public /* synthetic */ ny5(byte b) {
        this.I = b;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        q84 Y;
        boolean z;
        int i;
        int i2;
        Integer valueOf;
        switch (this.I) {
            case 0:
                o84 o84Var = (o84) obj;
                o84Var.getClass();
                Y = o84Var.Y("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
                try {
                    if (Y.T()) {
                        z = false;
                        if (((int) Y.getLong(0)) != 0) {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                    boolean z2 = z;
                    Y.close();
                    return Boolean.valueOf(z2);
                } finally {
                }
            case 1:
                o84 o84Var2 = (o84) obj;
                o84Var2.getClass();
                Y = o84Var2.Y("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
                try {
                    Y.b(1, 200L);
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
                        int i3 = F;
                        int i4 = F14;
                        sx5 g = ry5.g((int) Y.getLong(F2));
                        String H2 = Y.H(F3);
                        String H3 = Y.H(F4);
                        byte[] blob = Y.getBlob(F5);
                        dp0 dp0Var = dp0.b;
                        dp0 G = c5.G(blob);
                        dp0 G2 = c5.G(Y.getBlob(F6));
                        long j = Y.getLong(F7);
                        long j2 = Y.getLong(F8);
                        long j3 = Y.getLong(F9);
                        int i5 = (int) Y.getLong(F10);
                        ut d = ry5.d((int) Y.getLong(F11));
                        long j4 = Y.getLong(F12);
                        long j5 = Y.getLong(F13);
                        long j6 = Y.getLong(i4);
                        int i6 = F15;
                        long j7 = Y.getLong(i6);
                        int i7 = F2;
                        int i8 = F16;
                        int i9 = F3;
                        boolean z3 = ((int) Y.getLong(i8)) != 0;
                        int i10 = F17;
                        ug3 f = ry5.f((int) Y.getLong(i10));
                        int i11 = F18;
                        int i12 = (int) Y.getLong(i11);
                        int i13 = F19;
                        int i14 = (int) Y.getLong(i13);
                        int i15 = F20;
                        long j8 = Y.getLong(i15);
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
                        F24 = i21;
                        int i22 = F25;
                        Boolean bool2 = bool;
                        x93 e = ry5.e((int) Y.getLong(i22));
                        int i23 = F26;
                        r93 l = ry5.l(Y.getBlob(i23));
                        F25 = i22;
                        int i24 = F27;
                        boolean z4 = ((int) Y.getLong(i24)) != 0;
                        F27 = i24;
                        int i25 = F28;
                        boolean z5 = ((int) Y.getLong(i25)) != 0;
                        F28 = i25;
                        int i26 = F29;
                        boolean z6 = ((int) Y.getLong(i26)) != 0;
                        F29 = i26;
                        int i27 = F30;
                        int i28 = F31;
                        int i29 = F32;
                        F31 = i28;
                        int i30 = F33;
                        F33 = i30;
                        arrayList.add(new ky5(H, g, H2, H3, G, G2, j, j2, j3, new ch0(l, e, z4, z5, z6, ((int) Y.getLong(i27)) != 0, Y.getLong(i28), Y.getLong(i29), ry5.a(Y.getBlob(i30))), i5, d, j4, j5, j6, j7, z3, f, i12, i14, j8, i, i19, H4, bool2));
                        F32 = i29;
                        F30 = i27;
                        F = i3;
                        F14 = i4;
                        F2 = i7;
                        F15 = i6;
                        F18 = i11;
                        F19 = i13;
                        F20 = i15;
                        F21 = i16;
                        F22 = i2;
                        F23 = i20;
                        F26 = i23;
                        F3 = i9;
                        F16 = i8;
                        F17 = i10;
                    }
                    return arrayList;
                } catch (Throwable th) {
                    throw th;
                }
            case 2:
                o84 o84Var3 = (o84) obj;
                o84Var3.getClass();
                Y = o84Var3.Y("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
                try {
                    Y.T();
                    int I = il2.I(o84Var3);
                    Y.close();
                    return Integer.valueOf(I);
                } finally {
                }
            default:
                ((e16) obj).getClass();
                return Boolean.TRUE;
        }
    }
}

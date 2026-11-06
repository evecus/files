package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.media3.exoplayer.offline.DownloadService;
import androidx.media3.extractor.text.ttml.TtmlNode;
import coil3.Image;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ia implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ int J;

    public /* synthetic */ ia(ag2 ag2Var, int i) {
        this.I = (byte) 7;
        this.J = i;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        boolean requestFocusViewFocusFix$lambda$1;
        boolean requestFocusCurrent$lambda$0;
        Image fallback$lambda$0;
        Image error$lambda$0;
        Image placeholder$lambda$0;
        q84 q84Var;
        int i;
        int i2;
        Integer valueOf;
        byte b = this.I;
        int i3 = this.J;
        switch (b) {
            case 0:
                requestFocusViewFocusFix$lambda$1 = AndroidComposeView.requestFocusViewFocusFix$lambda$1(i3, (ui1) obj);
                return Boolean.valueOf(requestFocusViewFocusFix$lambda$1);
            case 1:
                requestFocusCurrent$lambda$0 = AndroidComposeView.requestFocusCurrent$lambda$0(i3, (ui1) obj);
                return Boolean.valueOf(requestFocusCurrent$lambda$0);
            case 2:
                return Boolean.valueOf(((ui1) obj).r0(i3));
            case 3:
                return Boolean.valueOf(((ui1) obj).r0(i3));
            case 4:
                fallback$lambda$0 = ImageRequests_androidKt.fallback$lambda$0(i3, (ImageRequest) obj);
                return fallback$lambda$0;
            case 5:
                error$lambda$0 = ImageRequests_androidKt.error$lambda$0(i3, (ImageRequest) obj);
                return error$lambda$0;
            case 6:
                placeholder$lambda$0 = ImageRequests_androidKt.placeholder$lambda$0(i3, (ImageRequest) obj);
                return placeholder$lambda$0;
            case 7:
                ze2 ze2Var = (ze2) obj;
                ns4 i4 = o63.i();
                o63.o(i4, o63.j(i4), i4 != null ? i4.e() : null);
                int i5 = ze2Var.a;
                if (i5 == -1) {
                    i5 = 2;
                }
                for (int i6 = 0; i6 < i5; i6++) {
                    ze2Var.a(i3 + i6);
                }
                return wd5.a;
            case 8:
                ((rd2) obj).getClass();
                return new vr1(e21.a(i3));
            case 9:
                ((rd2) obj).getClass();
                return new vr1(e21.a(i3));
            default:
                o84 o84Var = (o84) obj;
                o84Var.getClass();
                q84 Y = o84Var.Y("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
                try {
                    Y.b(1, i3);
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
                        ArrayList arrayList2 = arrayList;
                        int i7 = F;
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
                        int i8 = (int) Y.getLong(F10);
                        ut d = ry5.d((int) Y.getLong(F11));
                        long j4 = Y.getLong(F12);
                        long j5 = Y.getLong(F13);
                        long j6 = Y.getLong(F14);
                        int i9 = F15;
                        long j7 = Y.getLong(i9);
                        int i10 = F14;
                        int i11 = F16;
                        boolean z = ((int) Y.getLong(i11)) != 0;
                        int i12 = F17;
                        ug3 f = ry5.f((int) Y.getLong(i12));
                        int i13 = F18;
                        int i14 = F2;
                        int i15 = (int) Y.getLong(i13);
                        int i16 = F19;
                        int i17 = (int) Y.getLong(i16);
                        int i18 = F20;
                        long j8 = Y.getLong(i18);
                        int i19 = F13;
                        int i20 = F21;
                        int i21 = (int) Y.getLong(i20);
                        int i22 = F22;
                        int i23 = (int) Y.getLong(i22);
                        int i24 = F23;
                        String H4 = Y.isNull(i24) ? null : Y.H(i24);
                        int i25 = F24;
                        if (Y.isNull(i25)) {
                            i = i21;
                            i2 = i22;
                            valueOf = null;
                        } else {
                            i = i21;
                            i2 = i22;
                            valueOf = Integer.valueOf((int) Y.getLong(i25));
                        }
                        Boolean valueOf2 = valueOf != null ? Boolean.valueOf(valueOf.intValue() != 0) : null;
                        int i26 = F25;
                        x93 e = ry5.e((int) Y.getLong(i26));
                        int i27 = F26;
                        r93 l = ry5.l(Y.getBlob(i27));
                        F25 = i26;
                        F26 = i27;
                        int i28 = F27;
                        boolean z2 = ((int) Y.getLong(i28)) != 0;
                        F27 = i28;
                        int i29 = F28;
                        boolean z3 = ((int) Y.getLong(i29)) != 0;
                        int i30 = F29;
                        boolean z4 = ((int) Y.getLong(i30)) != 0;
                        F29 = i30;
                        int i31 = F30;
                        int i32 = F31;
                        int i33 = F32;
                        int i34 = F33;
                        F33 = i34;
                        q84Var = Y;
                        try {
                            arrayList2.add(new ky5(H, g, H2, H3, G, G2, j, j2, j3, new ch0(l, e, z2, z3, z4, ((int) Y.getLong(i31)) != 0, Y.getLong(i32), Y.getLong(i33), ry5.a(Y.getBlob(i34))), i8, d, j4, j5, j6, j7, z, f, i15, i17, j8, i, i23, H4, valueOf2));
                            F32 = i33;
                            F13 = i19;
                            F20 = i18;
                            F21 = i20;
                            F23 = i24;
                            arrayList = arrayList2;
                            F28 = i29;
                            F2 = i14;
                            Y = q84Var;
                            F18 = i13;
                            F31 = i32;
                            F14 = i10;
                            F15 = i9;
                            F16 = i11;
                            F17 = i12;
                            F19 = i16;
                            F22 = i2;
                            F24 = i25;
                            F30 = i31;
                            F = i7;
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

    public /* synthetic */ ia(byte b, int i) {
        this.I = b;
        this.J = i;
    }
}

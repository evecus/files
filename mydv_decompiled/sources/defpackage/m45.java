package defpackage;

import android.content.pm.Signature;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.offline.DownloadService;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.github.mytv.dv.model.Comment;
import com.github.mytv.dv.widget.WidgetStore;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Locale;
import okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class m45 implements tm1 {
    public final /* synthetic */ byte I;

    public /* synthetic */ m45(byte b) {
        this.I = b;
    }

    private final Object a(Object obj) {
        int i;
        int i2;
        Integer valueOf;
        o84 o84Var = (o84) obj;
        o84Var.getClass();
        q84 Y = o84Var.Y("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        try {
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
                long j = Y.getLong(F7);
                long j2 = Y.getLong(F8);
                long j3 = Y.getLong(F9);
                int i4 = (int) Y.getLong(F10);
                int i5 = F2;
                int i6 = F3;
                ut d = ry5.d((int) Y.getLong(F11));
                long j4 = Y.getLong(F12);
                long j5 = Y.getLong(F13);
                long j6 = Y.getLong(i3);
                int i7 = F15;
                long j7 = Y.getLong(i7);
                int i8 = F;
                int i9 = F16;
                boolean z = ((int) Y.getLong(i9)) != 0;
                int i10 = F17;
                int i11 = F4;
                ug3 f = ry5.f((int) Y.getLong(i10));
                int i12 = F18;
                int i13 = F5;
                int i14 = (int) Y.getLong(i12);
                int i15 = F19;
                int i16 = (int) Y.getLong(i15);
                int i17 = F20;
                long j8 = Y.getLong(i17);
                int i18 = F21;
                int i19 = (int) Y.getLong(i18);
                int i20 = F22;
                int i21 = (int) Y.getLong(i20);
                int i22 = F23;
                Boolean bool = null;
                String H4 = Y.isNull(i22) ? null : Y.H(i22);
                int i23 = F24;
                if (Y.isNull(i23)) {
                    i = i19;
                    i2 = i20;
                    valueOf = null;
                } else {
                    i = i19;
                    i2 = i20;
                    valueOf = Integer.valueOf((int) Y.getLong(i23));
                }
                if (valueOf != null) {
                    bool = Boolean.valueOf(valueOf.intValue() != 0);
                }
                int i24 = F25;
                Boolean bool2 = bool;
                x93 e = ry5.e((int) Y.getLong(i24));
                int i25 = F26;
                r93 l = ry5.l(Y.getBlob(i25));
                F25 = i24;
                F26 = i25;
                int i26 = F27;
                boolean z2 = ((int) Y.getLong(i26)) != 0;
                F27 = i26;
                int i27 = F28;
                boolean z3 = ((int) Y.getLong(i27)) != 0;
                int i28 = F29;
                boolean z4 = ((int) Y.getLong(i28)) != 0;
                F29 = i28;
                int i29 = F30;
                int i30 = F31;
                int i31 = F32;
                int i32 = F33;
                F33 = i32;
                arrayList2.add(new ky5(H, g, H2, H3, G, G2, j, j2, j3, new ch0(l, e, z2, z3, z4, ((int) Y.getLong(i29)) != 0, Y.getLong(i30), Y.getLong(i31), ry5.a(Y.getBlob(i32))), i4, d, j4, j5, j6, j7, z, f, i14, i16, j8, i, i21, H4, bool2));
                F30 = i29;
                F4 = i11;
                F17 = i10;
                F19 = i15;
                F22 = i2;
                F24 = i23;
                F31 = i30;
                F32 = i31;
                F2 = i5;
                F14 = i3;
                F3 = i6;
                arrayList = arrayList2;
                F = i8;
                F15 = i7;
                F16 = i9;
                F20 = i17;
                F21 = i18;
                F23 = i22;
                F28 = i27;
                F5 = i13;
                F18 = i12;
            }
            ArrayList arrayList3 = arrayList;
            Y.close();
            return arrayList3;
        } catch (Throwable th) {
            Y.close();
            throw th;
        }
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        z55 a;
        yt4 yt4Var;
        wd5 json$lambda$0;
        q84 Y;
        Integer valueOf;
        Boolean bool;
        Integer valueOf2;
        Boolean bool2;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                return wd5Var;
            case 1:
                return wd5Var;
            case 2:
                return wd5Var;
            case 3:
                return wd5Var;
            case 4:
                nj njVar = (nj) obj;
                Object obj2 = njVar.a;
                if (!(obj2 instanceof ek2) || (a = ((ek2) obj2).a()) == null || (a.a == null && a.b == null && a.c == null && a.d == null)) {
                    return p70.u(njVar);
                }
                Object obj3 = njVar.a;
                obj3.getClass();
                z55 a2 = ((ek2) obj3).a();
                if (a2 == null || (yt4Var = a2.a) == null) {
                    yt4Var = new yt4(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                }
                return p70.u(njVar, new nj(njVar.b, njVar.c, yt4Var));
            case 5:
                ((cj4) obj).c(zi4.B, wd5Var);
                return wd5Var;
            case 6:
                q84 q84Var = (q84) obj;
                q84Var.getClass();
                return Boolean.valueOf(q84Var.T());
            case 7:
                q84 q84Var2 = (q84) obj;
                q84Var2.getClass();
                rk4 rk4Var = new rk4();
                while (q84Var2.T()) {
                    rk4Var.add(Integer.valueOf((int) q84Var2.getLong(0)));
                }
                return rk4Var.d();
            case 8:
                Signature signature = (Signature) obj;
                signature.getClass();
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                byte[] byteArray = signature.toByteArray();
                byteArray.getClass();
                Certificate generateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(byteArray));
                generateCertificate.getClass();
                boolean z = lf5.a;
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(((X509Certificate) generateCertificate).getPublicKey().getEncoded());
                digest.getClass();
                return dq.g1(digest, new m45((byte) 9));
            case 9:
                int byteValue = ((Byte) obj).byteValue() & 255;
                o7.k(16);
                String num = Integer.toString(byteValue, 16);
                num.getClass();
                return jx4.P(2, num);
            case 10:
                Comment comment = (Comment) obj;
                comment.getClass();
                return comment.getCid();
            case 11:
                ((Float) obj).getClass();
                return Float.valueOf(0.7f);
            case 12:
                zv2 zv2Var = (zv2) obj;
                zv2Var.getClass();
                String group = zv2Var.a.group();
                group.getClass();
                return group;
            case 13:
                ((Integer) obj).getClass();
                return MimeTypes.BASE_TYPE_VIDEO;
            case 14:
                vo0 vo0Var = (vo0) obj;
                vo0Var.getClass();
                return vo0Var.I;
            case 15:
                so0 so0Var = (so0) obj;
                so0Var.getClass();
                return so0Var.I;
            case 16:
                return wd5Var;
            case 17:
                float floatValue = ((Float) obj).floatValue();
                return Float.valueOf((floatValue <= 0.1f || floatValue >= 0.95f) ? 0.0f : 1.0f);
            case 18:
                uj3 uj3Var = (uj3) obj;
                uj3Var.getClass();
                String str = (String) uj3Var.I;
                int i0 = qb.i0(((x70) uj3Var.J).a) & 16777215;
                o7.k(16);
                String num2 = Integer.toString(i0, 16);
                num2.getClass();
                String upperCase = jx4.P(6, num2).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                return hf1.x("--", str, ":", "#".concat(upperCase), ";");
            case 19:
                json$lambda$0 = WidgetStore.json$lambda$0((l62) obj);
                return json$lambda$0;
            case 20:
                return ((dw5) obj).g;
            case 21:
                return ((dw5) obj).c;
            case 22:
                return ((dw5) obj).e;
            case 23:
                lw5 lw5Var = (lw5) obj;
                lw5Var.getClass();
                return lw5Var;
            case 24:
                og0 og0Var = (og0) obj;
                og0Var.getClass();
                return og0Var.getClass().getSimpleName();
            case 25:
                o84 o84Var = (o84) obj;
                o84Var.getClass();
                try {
                    o84Var.Y("DELETE FROM WorkProgress").T();
                    return wd5Var;
                } finally {
                }
            case 26:
                o84 o84Var2 = (o84) obj;
                o84Var2.getClass();
                Y = o84Var2.Y("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                try {
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
                        int i = F14;
                        int i2 = F13;
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
                        int i3 = (int) Y.getLong(F10);
                        int i4 = F4;
                        int i5 = F3;
                        ut d = ry5.d((int) Y.getLong(F11));
                        long j4 = Y.getLong(F12);
                        long j5 = Y.getLong(i2);
                        long j6 = Y.getLong(i);
                        int i6 = F15;
                        long j7 = Y.getLong(i6);
                        F15 = i6;
                        int i7 = F16;
                        int i8 = F2;
                        boolean z2 = ((int) Y.getLong(i7)) != 0;
                        int i9 = F17;
                        int i10 = F;
                        ug3 f = ry5.f((int) Y.getLong(i9));
                        int i11 = F18;
                        int i12 = (int) Y.getLong(i11);
                        int i13 = F19;
                        int i14 = (int) Y.getLong(i13);
                        int i15 = F20;
                        long j8 = Y.getLong(i15);
                        int i16 = F21;
                        int i17 = (int) Y.getLong(i16);
                        F21 = i16;
                        int i18 = F22;
                        int i19 = (int) Y.getLong(i18);
                        int i20 = F23;
                        String H4 = Y.isNull(i20) ? null : Y.H(i20);
                        int i21 = F24;
                        if (Y.isNull(i21)) {
                            F23 = i20;
                            F22 = i18;
                            valueOf = null;
                        } else {
                            F23 = i20;
                            F22 = i18;
                            valueOf = Integer.valueOf((int) Y.getLong(i21));
                        }
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        } else {
                            bool = null;
                        }
                        int i22 = F25;
                        x93 e = ry5.e((int) Y.getLong(i22));
                        int i23 = F26;
                        r93 l = ry5.l(Y.getBlob(i23));
                        int i24 = F27;
                        boolean z3 = ((int) Y.getLong(i24)) != 0;
                        int i25 = F28;
                        boolean z4 = ((int) Y.getLong(i25)) != 0;
                        int i26 = F29;
                        boolean z5 = ((int) Y.getLong(i26)) != 0;
                        F29 = i26;
                        int i27 = F30;
                        int i28 = F31;
                        int i29 = F32;
                        F31 = i28;
                        int i30 = F33;
                        arrayList.add(new ky5(H, g, H2, H3, G, G2, j, j2, j3, new ch0(l, e, z3, z4, z5, ((int) Y.getLong(i27)) != 0, Y.getLong(i28), Y.getLong(i29), ry5.a(Y.getBlob(i30))), i3, d, j4, j5, j6, j7, z2, f, i12, i14, j8, i17, i19, H4, bool));
                        F28 = i25;
                        F = i10;
                        F17 = i9;
                        F18 = i11;
                        F19 = i13;
                        F20 = i15;
                        F24 = i21;
                        F25 = i22;
                        F26 = i23;
                        F27 = i24;
                        F33 = i30;
                        F32 = i29;
                        F30 = i27;
                        F3 = i5;
                        F13 = i2;
                        F14 = i;
                        F4 = i4;
                        F2 = i8;
                        F16 = i7;
                    }
                    return arrayList;
                } finally {
                }
            case 27:
                o84 o84Var3 = (o84) obj;
                o84Var3.getClass();
                Y = o84Var3.Y("SELECT * FROM workspec WHERE state=1");
                try {
                    int F34 = jl2.F(Y, TtmlNode.ATTR_ID);
                    int F35 = jl2.F(Y, "state");
                    int F36 = jl2.F(Y, "worker_class_name");
                    int F37 = jl2.F(Y, "input_merger_class_name");
                    int F38 = jl2.F(Y, "input");
                    int F39 = jl2.F(Y, "output");
                    int F40 = jl2.F(Y, "initial_delay");
                    int F41 = jl2.F(Y, "interval_duration");
                    int F42 = jl2.F(Y, "flex_duration");
                    int F43 = jl2.F(Y, "run_attempt_count");
                    int F44 = jl2.F(Y, "backoff_policy");
                    int F45 = jl2.F(Y, "backoff_delay_duration");
                    int F46 = jl2.F(Y, "last_enqueue_time");
                    int F47 = jl2.F(Y, "minimum_retention_duration");
                    int F48 = jl2.F(Y, "schedule_requested_at");
                    int F49 = jl2.F(Y, "run_in_foreground");
                    int F50 = jl2.F(Y, "out_of_quota_policy");
                    int F51 = jl2.F(Y, "period_count");
                    int F52 = jl2.F(Y, "generation");
                    int F53 = jl2.F(Y, "next_schedule_time_override");
                    int F54 = jl2.F(Y, "next_schedule_time_override_generation");
                    int F55 = jl2.F(Y, DownloadService.KEY_STOP_REASON);
                    int F56 = jl2.F(Y, "trace_tag");
                    int F57 = jl2.F(Y, "backoff_on_system_interruptions");
                    int F58 = jl2.F(Y, "required_network_type");
                    int F59 = jl2.F(Y, "required_network_request");
                    int F60 = jl2.F(Y, "requires_charging");
                    int F61 = jl2.F(Y, "requires_device_idle");
                    int F62 = jl2.F(Y, "requires_battery_not_low");
                    int F63 = jl2.F(Y, "requires_storage_not_low");
                    int F64 = jl2.F(Y, "trigger_content_update_delay");
                    int F65 = jl2.F(Y, "trigger_max_content_delay");
                    int F66 = jl2.F(Y, "content_uri_triggers");
                    ArrayList arrayList2 = new ArrayList();
                    while (Y.T()) {
                        String H5 = Y.H(F34);
                        int i31 = F47;
                        int i32 = F46;
                        sx5 g2 = ry5.g((int) Y.getLong(F35));
                        String H6 = Y.H(F36);
                        String H7 = Y.H(F37);
                        byte[] blob2 = Y.getBlob(F38);
                        dp0 dp0Var2 = dp0.b;
                        dp0 G3 = c5.G(blob2);
                        dp0 G4 = c5.G(Y.getBlob(F39));
                        long j9 = Y.getLong(F40);
                        long j10 = Y.getLong(F41);
                        long j11 = Y.getLong(F42);
                        int i33 = (int) Y.getLong(F43);
                        int i34 = F37;
                        int i35 = F36;
                        ut d2 = ry5.d((int) Y.getLong(F44));
                        long j12 = Y.getLong(F45);
                        long j13 = Y.getLong(i32);
                        long j14 = Y.getLong(i31);
                        int i36 = F48;
                        long j15 = Y.getLong(i36);
                        int i37 = F35;
                        int i38 = F49;
                        boolean z6 = ((int) Y.getLong(i38)) != 0;
                        int i39 = F34;
                        int i40 = F50;
                        ug3 f2 = ry5.f((int) Y.getLong(i40));
                        F50 = i40;
                        int i41 = F51;
                        int i42 = (int) Y.getLong(i41);
                        F51 = i41;
                        int i43 = F52;
                        int i44 = (int) Y.getLong(i43);
                        int i45 = F53;
                        long j16 = Y.getLong(i45);
                        int i46 = F54;
                        int i47 = (int) Y.getLong(i46);
                        F54 = i46;
                        int i48 = F55;
                        int i49 = (int) Y.getLong(i48);
                        int i50 = F56;
                        String H8 = Y.isNull(i50) ? null : Y.H(i50);
                        int i51 = F57;
                        if (Y.isNull(i51)) {
                            F56 = i50;
                            F55 = i48;
                            valueOf2 = null;
                        } else {
                            F56 = i50;
                            F55 = i48;
                            valueOf2 = Integer.valueOf((int) Y.getLong(i51));
                        }
                        if (valueOf2 != null) {
                            bool2 = Boolean.valueOf(valueOf2.intValue() != 0);
                        } else {
                            bool2 = null;
                        }
                        int i52 = F58;
                        x93 e2 = ry5.e((int) Y.getLong(i52));
                        int i53 = F59;
                        r93 l2 = ry5.l(Y.getBlob(i53));
                        int i54 = F60;
                        boolean z7 = ((int) Y.getLong(i54)) != 0;
                        int i55 = F61;
                        boolean z8 = ((int) Y.getLong(i55)) != 0;
                        int i56 = F62;
                        boolean z9 = ((int) Y.getLong(i56)) != 0;
                        F62 = i56;
                        int i57 = F63;
                        int i58 = F64;
                        int i59 = F65;
                        F64 = i58;
                        int i60 = F66;
                        arrayList2.add(new ky5(H5, g2, H6, H7, G3, G4, j9, j10, j11, new ch0(l2, e2, z7, z8, z9, ((int) Y.getLong(i57)) != 0, Y.getLong(i58), Y.getLong(i59), ry5.a(Y.getBlob(i60))), i33, d2, j12, j13, j14, j15, z6, f2, i42, i44, j16, i47, i49, H8, bool2));
                        F34 = i39;
                        F49 = i38;
                        F52 = i43;
                        F53 = i45;
                        F57 = i51;
                        F58 = i52;
                        F59 = i53;
                        F60 = i54;
                        F61 = i55;
                        F66 = i60;
                        F65 = i59;
                        F63 = i57;
                        F47 = i31;
                        F36 = i35;
                        F37 = i34;
                        F35 = i37;
                        F48 = i36;
                        F46 = i32;
                    }
                    return arrayList2;
                } finally {
                }
            case 28:
                return a(obj);
            default:
                o84 o84Var4 = (o84) obj;
                o84Var4.getClass();
                Y = o84Var4.Y("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                try {
                    int i61 = Y.T() ? (int) Y.getLong(0) : 0;
                    Y.close();
                    return Integer.valueOf(i61);
                } finally {
                }
        }
    }
}

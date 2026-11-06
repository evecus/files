package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class e35 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ e35(tf2 tf2Var, sd sdVar) {
        this.I = (byte) 0;
        this.J = tf2Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj2 = this.J;
        switch (b) {
            case 0:
                tf2 tf2Var = (tf2) obj2;
                la5 la5Var = (la5) obj;
                if (la5Var instanceof d8) {
                    tf2Var.invoke(((d8) la5Var).I);
                    return Boolean.TRUE;
                }
                zy.i("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
            case 1:
                CharSequence charSequence = (CharSequence) obj2;
                cj4 cj4Var = (cj4) obj;
                oj ojVar = charSequence instanceof oj ? (oj) charSequence : null;
                if (ojVar == null) {
                    ojVar = new oj(charSequence.toString());
                }
                d82[] d82VarArr = aj4.a;
                cj4Var.c(zi4.C, p70.j0(ojVar));
                return wd5Var;
            case 2:
                l45 l45Var = (l45) obj2;
                float floatValue = ((Float) obj).floatValue();
                fk3 fk3Var = l45Var.a;
                float h = fk3Var.h() + floatValue;
                fk3 fk3Var2 = l45Var.b;
                if (h > fk3Var2.h()) {
                    floatValue = fk3Var2.h() - fk3Var.h();
                } else if (h < 0.0f) {
                    floatValue = -fk3Var.h();
                }
                fk3Var.i(fk3Var.h() + floatValue);
                return Float.valueOf(floatValue);
            case 3:
                z55 z55Var = (z55) obj2;
                nj njVar = (nj) obj;
                kj kjVar = (kj) njVar.a;
                if (kjVar instanceof dk2) {
                    dk2 dk2Var = (dk2) kjVar;
                    if (dk2Var.b == null) {
                        return nj.d(njVar, new dk2(dk2Var.a, z55Var), 0, 14);
                    }
                }
                if (!(kjVar instanceof ck2)) {
                    return njVar;
                }
                ck2 ck2Var = (ck2) kjVar;
                return ck2Var.b == null ? nj.d(njVar, new ck2(ck2Var.a, z55Var), 0, 14) : njVar;
            case 4:
                ((ay0) obj).getClass();
                return new x7((r41) obj2, (byte) 6);
            case 5:
                fk3 fk3Var3 = (fk3) obj2;
                y31 y31Var = (y31) obj;
                y31Var.getClass();
                r7.m(y31Var, hx2.d, 0L, y31Var.c(), 0.0f, 122);
                if (fk3Var3.h() > 0.0f) {
                    r7.m(y31Var, hx2.c, 0L, (Float.floatToRawIntBits(fk3Var3.h() * Float.intBitsToFloat((int) (y31Var.c() >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (y31Var.c() & 4294967295L))) & 4294967295L), 0.0f, 122);
                }
                return wd5Var;
            case 6:
                zv2 zv2Var = (zv2) obj;
                zv2Var.getClass();
                String str = (String) ((HashMap) obj2).get(((xv2) zv2Var.a()).get(1));
                if (str != null) {
                    return str;
                }
                String group = zv2Var.a.group();
                group.getClass();
                return group;
            default:
                ky5 ky5Var = (ky5) obj2;
                o84 o84Var = (o84) obj;
                o84Var.getClass();
                q84 Y = o84Var.Y("UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?");
                try {
                    l95.b(Y, ky5Var);
                    Y.T();
                    mw2.v(Y, null);
                    il2.I(o84Var);
                    return wd5Var;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        mw2.v(Y, th);
                        throw th2;
                    }
                }
        }
    }

    public /* synthetic */ e35(oy5 oy5Var, ky5 ky5Var) {
        this.I = (byte) 7;
        this.J = ky5Var;
    }

    public /* synthetic */ e35(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }
}

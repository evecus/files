package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qu0 extends c21 {
    public final /* synthetic */ byte f;

    public /* synthetic */ qu0(byte b) {
        this.f = b;
    }

    @Override // defpackage.c21
    public final void l(q84 q84Var, Object obj) {
        int i;
        int i2 = 1;
        switch (this.f) {
            case 0:
                ou0 ou0Var = (ou0) obj;
                q84Var.getClass();
                ou0Var.getClass();
                q84Var.v(1, ou0Var.a);
                q84Var.v(2, ou0Var.b);
                break;
            case 1:
                wr3 wr3Var = (wr3) obj;
                q84Var.getClass();
                wr3Var.getClass();
                q84Var.v(1, wr3Var.a);
                q84Var.b(2, wr3Var.b.longValue());
                break;
            case 2:
                a15 a15Var = (a15) obj;
                q84Var.getClass();
                a15Var.getClass();
                q84Var.v(1, a15Var.a);
                q84Var.b(2, a15Var.b);
                q84Var.b(3, a15Var.c);
                break;
            case 3:
                zx5 zx5Var = (zx5) obj;
                q84Var.getClass();
                zx5Var.getClass();
                q84Var.v(1, zx5Var.a);
                q84Var.v(2, zx5Var.b);
                break;
            case 4:
                by5 by5Var = (by5) obj;
                q84Var.getClass();
                by5Var.getClass();
                q84Var.v(1, by5Var.a);
                dp0 dp0Var = dp0.b;
                q84Var.c(2, c5.j0(by5Var.b));
                break;
            case 5:
                ky5 ky5Var = (ky5) obj;
                q84Var.getClass();
                ky5Var.getClass();
                q84Var.v(1, ky5Var.a);
                q84Var.b(2, ry5.k(ky5Var.b));
                q84Var.v(3, ky5Var.c);
                q84Var.v(4, ky5Var.d);
                dp0 dp0Var2 = dp0.b;
                q84Var.c(5, c5.j0(ky5Var.e));
                q84Var.c(6, c5.j0(ky5Var.f));
                q84Var.b(7, ky5Var.g);
                q84Var.b(8, ky5Var.h);
                q84Var.b(9, ky5Var.i);
                q84Var.b(10, ky5Var.k);
                ut utVar = ky5Var.l;
                utVar.getClass();
                int ordinal = utVar.ordinal();
                if (ordinal == 0) {
                    i = 0;
                } else if (ordinal != 1) {
                    s83.v();
                    break;
                } else {
                    i = 1;
                }
                q84Var.b(11, i);
                q84Var.b(12, ky5Var.m);
                q84Var.b(13, ky5Var.n);
                q84Var.b(14, ky5Var.o);
                q84Var.b(15, ky5Var.p);
                q84Var.b(16, ky5Var.q ? 1L : 0L);
                ug3 ug3Var = ky5Var.r;
                ug3Var.getClass();
                int ordinal2 = ug3Var.ordinal();
                if (ordinal2 == 0) {
                    i2 = 0;
                } else if (ordinal2 != 1) {
                    s83.v();
                    break;
                }
                q84Var.b(17, i2);
                q84Var.b(18, ky5Var.s);
                q84Var.b(19, ky5Var.t);
                q84Var.b(20, ky5Var.u);
                q84Var.b(21, ky5Var.v);
                q84Var.b(22, ky5Var.w);
                String str = ky5Var.x;
                if (str == null) {
                    q84Var.d(23);
                } else {
                    q84Var.v(23, str);
                }
                Boolean bool = ky5Var.y;
                if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
                    q84Var.d(24);
                } else {
                    q84Var.b(24, r5.intValue());
                }
                ch0 ch0Var = ky5Var.j;
                q84Var.b(25, ry5.h(ch0Var.a));
                q84Var.c(26, ry5.c(ch0Var.b));
                q84Var.b(27, ch0Var.c ? 1L : 0L);
                q84Var.b(28, ch0Var.d ? 1L : 0L);
                q84Var.b(29, ch0Var.e ? 1L : 0L);
                q84Var.b(30, ch0Var.f ? 1L : 0L);
                q84Var.b(31, ch0Var.g);
                q84Var.b(32, ch0Var.h);
                q84Var.c(33, ry5.j(ch0Var.i));
                break;
            default:
                py5 py5Var = (py5) obj;
                q84Var.getClass();
                py5Var.getClass();
                q84Var.v(1, py5Var.a);
                q84Var.v(2, py5Var.b);
                break;
        }
    }

    @Override // defpackage.c21
    public final String o() {
        switch (this.f) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }
}

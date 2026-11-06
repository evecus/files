package defpackage;

import androidx.media3.exoplayer.offline.DownloadService;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class kx5 extends b74 {
    public final /* synthetic */ WorkDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx5(WorkDatabase_Impl workDatabase_Impl) {
        super("08b926448d86528e697981ddd30459f7", 24, "149fd8ad55885d3fe3549a37a0163243");
        this.d = workDatabase_Impl;
    }

    @Override // defpackage.b74
    public final void a(o84 o84Var) {
        o84Var.getClass();
        lq2.D(o84Var, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        lq2.D(o84Var, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        lq2.D(o84Var, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        lq2.D(o84Var, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        lq2.D(o84Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        lq2.D(o84Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        lq2.D(o84Var, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        lq2.D(o84Var, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        lq2.D(o84Var, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        lq2.D(o84Var, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        lq2.D(o84Var, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        lq2.D(o84Var, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        lq2.D(o84Var, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        lq2.D(o84Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        lq2.D(o84Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
    }

    @Override // defpackage.b74
    public final void b(o84 o84Var) {
        o84Var.getClass();
        lq2.D(o84Var, "DROP TABLE IF EXISTS `Dependency`");
        lq2.D(o84Var, "DROP TABLE IF EXISTS `WorkSpec`");
        lq2.D(o84Var, "DROP TABLE IF EXISTS `WorkTag`");
        lq2.D(o84Var, "DROP TABLE IF EXISTS `SystemIdInfo`");
        lq2.D(o84Var, "DROP TABLE IF EXISTS `WorkName`");
        lq2.D(o84Var, "DROP TABLE IF EXISTS `WorkProgress`");
        lq2.D(o84Var, "DROP TABLE IF EXISTS `Preference`");
    }

    @Override // defpackage.b74
    public final void c(o84 o84Var) {
        o84Var.getClass();
    }

    @Override // defpackage.b74
    public final void d(o84 o84Var) {
        o84Var.getClass();
        lq2.D(o84Var, "PRAGMA foreign_keys = ON");
        e52 f = this.d.f();
        fb5 fb5Var = f.b;
        fb5Var.getClass();
        q84 Y = o84Var.Y("PRAGMA query_only");
        try {
            Y.T();
            boolean x = Y.x();
            mw2.v(Y, null);
            if (!x) {
                lq2.D(o84Var, "PRAGMA temp_store = MEMORY");
                lq2.D(o84Var, "PRAGMA recursive_triggers = 1");
                lq2.D(o84Var, "DROP TABLE IF EXISTS room_table_modification_log");
                if (fb5Var.d) {
                    lq2.D(o84Var, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    lq2.D(o84Var, qx4.x("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", "", false));
                }
                id3 id3Var = fb5Var.h;
                ReentrantLock reentrantLock = id3Var.a;
                reentrantLock.lock();
                try {
                    id3Var.d = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (f.g) {
            }
        } finally {
        }
    }

    @Override // defpackage.b74
    public final void e(o84 o84Var) {
        o84Var.getClass();
    }

    @Override // defpackage.b74
    public final void f(o84 o84Var) {
        o84Var.getClass();
        mk2 K = p70.K();
        q84 Y = o84Var.Y("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (Y.T()) {
            try {
                K.add(Y.H(0));
            } finally {
            }
        }
        mw2.v(Y, null);
        ListIterator listIterator = p70.D(K).listIterator(0);
        while (true) {
            lk2 lk2Var = (lk2) listIterator;
            if (!lk2Var.hasNext()) {
                return;
            }
            String str = (String) lk2Var.next();
            if (qx4.y(str, "room_fts_content_sync_", false)) {
                lq2.D(o84Var, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    @Override // defpackage.b74
    public final ee0 g(o84 o84Var) {
        o84Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("work_spec_id", new l15(1, "work_spec_id", "TEXT", null, true, 1));
        linkedHashMap.put("prerequisite_id", new l15(2, "prerequisite_id", "TEXT", null, true, 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new m15("WorkSpec", "CASCADE", "CASCADE", p70.j0("work_spec_id"), p70.j0(TtmlNode.ATTR_ID)));
        linkedHashSet.add(new m15("WorkSpec", "CASCADE", "CASCADE", p70.j0("prerequisite_id"), p70.j0(TtmlNode.ATTR_ID)));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new n15("index_Dependency_work_spec_id", false, p70.j0("work_spec_id"), p70.j0("ASC")));
        linkedHashSet2.add(new n15("index_Dependency_prerequisite_id", false, p70.j0("prerequisite_id"), p70.j0("ASC")));
        o15 o15Var = new o15("Dependency", linkedHashMap, linkedHashSet, linkedHashSet2);
        o15 U = kb4.U(o84Var, "Dependency");
        if (!o15Var.equals(U)) {
            return new ee0(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + o15Var + "\n Found:\n" + U);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(TtmlNode.ATTR_ID, new l15(1, TtmlNode.ATTR_ID, "TEXT", null, true, 1));
        linkedHashMap2.put("state", new l15(0, "state", "INTEGER", null, true, 1));
        linkedHashMap2.put("worker_class_name", new l15(0, "worker_class_name", "TEXT", null, true, 1));
        linkedHashMap2.put("input_merger_class_name", new l15(0, "input_merger_class_name", "TEXT", null, true, 1));
        linkedHashMap2.put("input", new l15(0, "input", "BLOB", null, true, 1));
        linkedHashMap2.put("output", new l15(0, "output", "BLOB", null, true, 1));
        linkedHashMap2.put("initial_delay", new l15(0, "initial_delay", "INTEGER", null, true, 1));
        linkedHashMap2.put("interval_duration", new l15(0, "interval_duration", "INTEGER", null, true, 1));
        linkedHashMap2.put("flex_duration", new l15(0, "flex_duration", "INTEGER", null, true, 1));
        linkedHashMap2.put("run_attempt_count", new l15(0, "run_attempt_count", "INTEGER", null, true, 1));
        linkedHashMap2.put("backoff_policy", new l15(0, "backoff_policy", "INTEGER", null, true, 1));
        linkedHashMap2.put("backoff_delay_duration", new l15(0, "backoff_delay_duration", "INTEGER", null, true, 1));
        linkedHashMap2.put("last_enqueue_time", new l15(0, "last_enqueue_time", "INTEGER", "-1", true, 1));
        linkedHashMap2.put("minimum_retention_duration", new l15(0, "minimum_retention_duration", "INTEGER", null, true, 1));
        linkedHashMap2.put("schedule_requested_at", new l15(0, "schedule_requested_at", "INTEGER", null, true, 1));
        linkedHashMap2.put("run_in_foreground", new l15(0, "run_in_foreground", "INTEGER", null, true, 1));
        linkedHashMap2.put("out_of_quota_policy", new l15(0, "out_of_quota_policy", "INTEGER", null, true, 1));
        linkedHashMap2.put("period_count", new l15(0, "period_count", "INTEGER", "0", true, 1));
        linkedHashMap2.put("generation", new l15(0, "generation", "INTEGER", "0", true, 1));
        linkedHashMap2.put("next_schedule_time_override", new l15(0, "next_schedule_time_override", "INTEGER", "9223372036854775807", true, 1));
        linkedHashMap2.put("next_schedule_time_override_generation", new l15(0, "next_schedule_time_override_generation", "INTEGER", "0", true, 1));
        linkedHashMap2.put(DownloadService.KEY_STOP_REASON, new l15(0, DownloadService.KEY_STOP_REASON, "INTEGER", "-256", true, 1));
        linkedHashMap2.put("trace_tag", new l15(0, "trace_tag", "TEXT", null, false, 1));
        linkedHashMap2.put("backoff_on_system_interruptions", new l15(0, "backoff_on_system_interruptions", "INTEGER", null, false, 1));
        linkedHashMap2.put("required_network_type", new l15(0, "required_network_type", "INTEGER", null, true, 1));
        linkedHashMap2.put("required_network_request", new l15(0, "required_network_request", "BLOB", "x''", true, 1));
        linkedHashMap2.put("requires_charging", new l15(0, "requires_charging", "INTEGER", null, true, 1));
        linkedHashMap2.put("requires_device_idle", new l15(0, "requires_device_idle", "INTEGER", null, true, 1));
        linkedHashMap2.put("requires_battery_not_low", new l15(0, "requires_battery_not_low", "INTEGER", null, true, 1));
        linkedHashMap2.put("requires_storage_not_low", new l15(0, "requires_storage_not_low", "INTEGER", null, true, 1));
        linkedHashMap2.put("trigger_content_update_delay", new l15(0, "trigger_content_update_delay", "INTEGER", null, true, 1));
        linkedHashMap2.put("trigger_max_content_delay", new l15(0, "trigger_max_content_delay", "INTEGER", null, true, 1));
        linkedHashMap2.put("content_uri_triggers", new l15(0, "content_uri_triggers", "BLOB", null, true, 1));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new n15("index_WorkSpec_schedule_requested_at", false, p70.j0("schedule_requested_at"), p70.j0("ASC")));
        linkedHashSet4.add(new n15("index_WorkSpec_last_enqueue_time", false, p70.j0("last_enqueue_time"), p70.j0("ASC")));
        o15 o15Var2 = new o15("WorkSpec", linkedHashMap2, linkedHashSet3, linkedHashSet4);
        o15 U2 = kb4.U(o84Var, "WorkSpec");
        if (!o15Var2.equals(U2)) {
            return new ee0(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + o15Var2 + "\n Found:\n" + U2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("tag", new l15(1, "tag", "TEXT", null, true, 1));
        linkedHashMap3.put("work_spec_id", new l15(2, "work_spec_id", "TEXT", null, true, 1));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        linkedHashSet5.add(new m15("WorkSpec", "CASCADE", "CASCADE", p70.j0("work_spec_id"), p70.j0(TtmlNode.ATTR_ID)));
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        linkedHashSet6.add(new n15("index_WorkTag_work_spec_id", false, p70.j0("work_spec_id"), p70.j0("ASC")));
        o15 o15Var3 = new o15("WorkTag", linkedHashMap3, linkedHashSet5, linkedHashSet6);
        o15 U3 = kb4.U(o84Var, "WorkTag");
        if (!o15Var3.equals(U3)) {
            return new ee0(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + o15Var3 + "\n Found:\n" + U3);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("work_spec_id", new l15(1, "work_spec_id", "TEXT", null, true, 1));
        linkedHashMap4.put("generation", new l15(2, "generation", "INTEGER", "0", true, 1));
        linkedHashMap4.put("system_id", new l15(0, "system_id", "INTEGER", null, true, 1));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        linkedHashSet7.add(new m15("WorkSpec", "CASCADE", "CASCADE", p70.j0("work_spec_id"), p70.j0(TtmlNode.ATTR_ID)));
        o15 o15Var4 = new o15("SystemIdInfo", linkedHashMap4, linkedHashSet7, new LinkedHashSet());
        o15 U4 = kb4.U(o84Var, "SystemIdInfo");
        if (!o15Var4.equals(U4)) {
            return new ee0(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + o15Var4 + "\n Found:\n" + U4);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("name", new l15(1, "name", "TEXT", null, true, 1));
        linkedHashMap5.put("work_spec_id", new l15(2, "work_spec_id", "TEXT", null, true, 1));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        linkedHashSet8.add(new m15("WorkSpec", "CASCADE", "CASCADE", p70.j0("work_spec_id"), p70.j0(TtmlNode.ATTR_ID)));
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        linkedHashSet9.add(new n15("index_WorkName_work_spec_id", false, p70.j0("work_spec_id"), p70.j0("ASC")));
        o15 o15Var5 = new o15("WorkName", linkedHashMap5, linkedHashSet8, linkedHashSet9);
        o15 U5 = kb4.U(o84Var, "WorkName");
        if (!o15Var5.equals(U5)) {
            return new ee0(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + o15Var5 + "\n Found:\n" + U5);
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("work_spec_id", new l15(1, "work_spec_id", "TEXT", null, true, 1));
        linkedHashMap6.put("progress", new l15(0, "progress", "BLOB", null, true, 1));
        LinkedHashSet linkedHashSet10 = new LinkedHashSet();
        linkedHashSet10.add(new m15("WorkSpec", "CASCADE", "CASCADE", p70.j0("work_spec_id"), p70.j0(TtmlNode.ATTR_ID)));
        o15 o15Var6 = new o15("WorkProgress", linkedHashMap6, linkedHashSet10, new LinkedHashSet());
        o15 U6 = kb4.U(o84Var, "WorkProgress");
        if (!o15Var6.equals(U6)) {
            return new ee0(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + o15Var6 + "\n Found:\n" + U6);
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("key", new l15(1, "key", "TEXT", null, true, 1));
        linkedHashMap7.put("long_value", new l15(0, "long_value", "INTEGER", null, false, 1));
        o15 o15Var7 = new o15("Preference", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
        o15 U7 = kb4.U(o84Var, "Preference");
        if (o15Var7.equals(U7)) {
            return new ee0(true, (String) null);
        }
        return new ee0(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + o15Var7 + "\n Found:\n" + U7);
    }
}

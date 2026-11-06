package coil3.disk;

import coil3.util.Collections_jvmCommonKt;
import coil3.util.Coroutines_nonJsCommonKt;
import coil3.util.FileSystemsKt;
import defpackage.dl0;
import defpackage.er0;
import defpackage.i42;
import defpackage.i9;
import defpackage.j42;
import defpackage.jx4;
import defpackage.ke1;
import defpackage.lz;
import defpackage.ok3;
import defpackage.p70;
import defpackage.q04;
import defpackage.qx4;
import defpackage.r7;
import defpackage.s83;
import defpackage.sv2;
import defpackage.tk0;
import defpackage.ui4;
import defpackage.v24;
import defpackage.vk0;
import defpackage.wd5;
import defpackage.zl1;
import defpackage.zy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class DiskLruCache implements AutoCloseable {
    private static final String CLEAN = "CLEAN";
    private static final String DIRTY = "DIRTY";
    public static final String JOURNAL_FILE = "journal";
    public static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    public static final String JOURNAL_FILE_TMP = "journal.tmp";
    public static final String MAGIC = "libcore.io.DiskLruCache";
    private static final String READ = "READ";
    private static final String REMOVE = "REMOVE";
    public static final String VERSION = "1";
    private final int appVersion;
    private final dl0 cleanupScope;
    private boolean closed;
    private final ok3 directory;
    private final DiskLruCache$fileSystem$1 fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final ok3 journalFile;
    private final ok3 journalFileBackup;
    private final ok3 journalFileTmp;
    private lz journalWriter;
    private final Object lock;
    private final Map<String, Entry> lruEntries;
    private final long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private int operationsSinceRewrite;
    private long size;
    private final int valueCount;
    public static final Companion Companion = new Companion(null);
    private static final v24 LEGAL_KEY_PATTERN = new v24("[a-z0-9_-]{1,120}");

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class Editor {
        private boolean closed;
        private final Entry entry;
        private final boolean[] written;

        public Editor(Entry entry) {
            this.entry = entry;
            this.written = new boolean[DiskLruCache.this.valueCount];
        }

        private final void complete(boolean z) {
            Object obj = DiskLruCache.this.lock;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (obj) {
                try {
                    if (this.closed) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (j42.c(this.entry.getCurrentEditor(), this)) {
                        diskLruCache.completeEdit(this, z);
                    }
                    this.closed = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void abort() {
            complete(false);
        }

        public final void commit() {
            complete(true);
        }

        public final Snapshot commitAndGet() {
            Snapshot snapshot;
            Object obj = DiskLruCache.this.lock;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (obj) {
                commit();
                snapshot = diskLruCache.get(this.entry.getKey());
            }
            return snapshot;
        }

        public final void detach() {
            if (j42.c(this.entry.getCurrentEditor(), this)) {
                this.entry.setZombie(true);
            }
        }

        public final ok3 file(int i) {
            ok3 ok3Var;
            Object obj = DiskLruCache.this.lock;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (obj) {
                if (this.closed) {
                    throw new IllegalStateException("editor is closed");
                }
                this.written[i] = true;
                ok3 ok3Var2 = this.entry.getDirtyFiles().get(i);
                FileSystemsKt.createFile$default(diskLruCache.fileSystem, ok3Var2, false, 2, null);
                ok3Var = ok3Var2;
            }
            return ok3Var;
        }

        public final Entry getEntry() {
            return this.entry;
        }

        public final boolean[] getWritten() {
            return this.written;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class Entry {
        private final ArrayList<ok3> cleanFiles;
        private Editor currentEditor;
        private final ArrayList<ok3> dirtyFiles;
        private final String key;
        private final long[] lengths;
        private int lockingSnapshotCount;
        private boolean readable;
        private boolean zombie;

        public Entry(String str) {
            this.key = str;
            this.lengths = new long[DiskLruCache.this.valueCount];
            this.cleanFiles = new ArrayList<>(DiskLruCache.this.valueCount);
            this.dirtyFiles = new ArrayList<>(DiskLruCache.this.valueCount);
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int i = DiskLruCache.this.valueCount;
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(i2);
                this.cleanFiles.add(DiskLruCache.this.directory.f(sb.toString()));
                sb.append(".tmp");
                this.dirtyFiles.add(DiskLruCache.this.directory.f(sb.toString()));
                sb.setLength(length);
            }
        }

        public final ArrayList<ok3> getCleanFiles() {
            return this.cleanFiles;
        }

        public final Editor getCurrentEditor() {
            return this.currentEditor;
        }

        public final ArrayList<ok3> getDirtyFiles() {
            return this.dirtyFiles;
        }

        public final String getKey() {
            return this.key;
        }

        public final long[] getLengths() {
            return this.lengths;
        }

        public final int getLockingSnapshotCount() {
            return this.lockingSnapshotCount;
        }

        public final boolean getReadable() {
            return this.readable;
        }

        public final boolean getZombie() {
            return this.zombie;
        }

        public final void setCurrentEditor(Editor editor) {
            this.currentEditor = editor;
        }

        public final void setLengths(List<String> list) {
            if (list.size() != DiskLruCache.this.valueCount) {
                throw new IOException("unexpected journal line: " + list);
            }
            try {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    this.lengths[i] = Long.parseLong(list.get(i));
                }
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + list);
            }
        }

        public final void setLockingSnapshotCount(int i) {
            this.lockingSnapshotCount = i;
        }

        public final void setReadable(boolean z) {
            this.readable = z;
        }

        public final void setZombie(boolean z) {
            this.zombie = z;
        }

        public final Snapshot snapshot() {
            if (!this.readable || this.currentEditor != null || this.zombie) {
                return null;
            }
            ArrayList<ok3> arrayList = this.cleanFiles;
            DiskLruCache diskLruCache = DiskLruCache.this;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (!diskLruCache.fileSystem.exists(arrayList.get(i))) {
                    try {
                        diskLruCache.removeEntry(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
            }
            this.lockingSnapshotCount++;
            return DiskLruCache.this.new Snapshot(this);
        }

        public final void writeLengths(lz lzVar) {
            for (long j : this.lengths) {
                lzVar.writeByte(32).V(j);
            }
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class Snapshot implements AutoCloseable {
        private boolean closed;
        private final Entry entry;

        public Snapshot(Entry entry) {
            this.entry = entry;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Object obj = DiskLruCache.this.lock;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (obj) {
                this.entry.setLockingSnapshotCount(r2.getLockingSnapshotCount() - 1);
                if (this.entry.getLockingSnapshotCount() == 0 && this.entry.getZombie()) {
                    diskLruCache.removeEntry(this.entry);
                }
            }
        }

        public final Editor closeAndEdit() {
            Editor edit;
            Object obj = DiskLruCache.this.lock;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (obj) {
                close();
                edit = diskLruCache.edit(this.entry.getKey());
            }
            return edit;
        }

        public final ok3 file(int i) {
            if (!this.closed) {
                return this.entry.getCleanFiles().get(i);
            }
            zy.i("snapshot is closed");
            return null;
        }

        public final Entry getEntry() {
            return this.entry;
        }
    }

    public DiskLruCache(ke1 ke1Var, ok3 ok3Var, tk0 tk0Var, long j, int i, int i2) {
        this.directory = ok3Var;
        this.maxSize = j;
        this.appVersion = i;
        this.valueCount = i2;
        if (j <= 0) {
            s83.t("maxSize <= 0");
            throw null;
        }
        if (i2 <= 0) {
            s83.t("valueCount <= 0");
            throw null;
        }
        this.journalFile = ok3Var.f(JOURNAL_FILE);
        this.journalFileTmp = ok3Var.f(JOURNAL_FILE_TMP);
        this.journalFileBackup = ok3Var.f(JOURNAL_FILE_BACKUP);
        this.lruEntries = Collections_jvmCommonKt.LruMutableMap$default(0, 0.0f, 3, null);
        tk0 plus = tk0Var.plus(ui4.b());
        vk0 dispatcher = coil3.util.UtilsKt.getDispatcher(tk0Var);
        this.cleanupScope = i42.H(plus.plus(vk0.limitedParallelism$default(dispatcher == null ? Coroutines_nonJsCommonKt.ioCoroutineDispatcher() : dispatcher, 1, null, 2, null)));
        this.lock = new Object();
        this.fileSystem = new DiskLruCache$fileSystem$1(ke1Var);
    }

    private final void checkNotClosed() {
        if (this.closed) {
            zy.i("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void completeEdit(Editor editor, boolean z) {
        synchronized (this.lock) {
            Entry entry = editor.getEntry();
            if (!j42.c(entry.getCurrentEditor(), editor)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z || entry.getZombie()) {
                int i = this.valueCount;
                for (int i2 = 0; i2 < i; i2++) {
                    this.fileSystem.delete(entry.getDirtyFiles().get(i2));
                }
            } else {
                int i3 = this.valueCount;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (editor.getWritten()[i4] && !this.fileSystem.exists(entry.getDirtyFiles().get(i4))) {
                        editor.abort();
                        return;
                    }
                }
                int i5 = this.valueCount;
                for (int i6 = 0; i6 < i5; i6++) {
                    ok3 ok3Var = entry.getDirtyFiles().get(i6);
                    ok3 ok3Var2 = entry.getCleanFiles().get(i6);
                    boolean exists = this.fileSystem.exists(ok3Var);
                    DiskLruCache$fileSystem$1 diskLruCache$fileSystem$1 = this.fileSystem;
                    if (exists) {
                        diskLruCache$fileSystem$1.atomicMove(ok3Var, ok3Var2);
                    } else {
                        FileSystemsKt.createFile$default(diskLruCache$fileSystem$1, entry.getCleanFiles().get(i6), false, 2, null);
                    }
                    long j = entry.getLengths()[i6];
                    Long l = this.fileSystem.metadata(ok3Var2).d;
                    long longValue = l != null ? l.longValue() : 0L;
                    entry.getLengths()[i6] = longValue;
                    this.size = (this.size - j) + longValue;
                }
            }
            entry.setCurrentEditor(null);
            if (entry.getZombie()) {
                removeEntry(entry);
                return;
            }
            this.operationsSinceRewrite++;
            lz lzVar = this.journalWriter;
            lzVar.getClass();
            if (!z && !entry.getReadable()) {
                this.lruEntries.remove(entry.getKey());
                lzVar.B(REMOVE);
                lzVar.writeByte(32);
                lzVar.B(entry.getKey());
                lzVar.writeByte(10);
                lzVar.flush();
                if (this.size <= this.maxSize || journalRewriteRequired()) {
                    launchCleanup();
                }
            }
            entry.setReadable(true);
            lzVar.B(CLEAN);
            lzVar.writeByte(32);
            lzVar.B(entry.getKey());
            entry.writeLengths(lzVar);
            lzVar.writeByte(10);
            lzVar.flush();
            if (this.size <= this.maxSize) {
            }
            launchCleanup();
        }
    }

    private final void delete() {
        close();
        FileSystemsKt.deleteContents(this.fileSystem, this.directory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean journalRewriteRequired() {
        return this.operationsSinceRewrite >= 2000;
    }

    private final void launchCleanup() {
        p70.g0(this.cleanupScope, null, null, new DiskLruCache$launchCleanup$1(this, null), 3);
    }

    private final lz newJournalWriter() {
        return new q04(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), new i9(this, (byte) 6)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 newJournalWriter$lambda$0(DiskLruCache diskLruCache, IOException iOException) {
        diskLruCache.hasJournalErrors = true;
        return wd5.a;
    }

    private final void processJournal() {
        Iterator<Entry> it = this.lruEntries.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            Entry next = it.next();
            int i = 0;
            if (next.getCurrentEditor() == null) {
                int i2 = this.valueCount;
                while (i < i2) {
                    j += next.getLengths()[i];
                    i++;
                }
            } else {
                next.setCurrentEditor(null);
                int i3 = this.valueCount;
                while (i < i3) {
                    this.fileSystem.delete(next.getCleanFiles().get(i));
                    this.fileSystem.delete(next.getDirtyFiles().get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.size = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void readJournal() {
        /*
            r11 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            coil3.disk.DiskLruCache$fileSystem$1 r2 = r11.fileSystem
            ok3 r3 = r11.journalFile
            ut4 r2 = r2.source(r3)
            s04 r2 = defpackage.sv2.m(r2)
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r5 = r2.w(r3)     // Catch: java.lang.Throwable -> L62
            java.lang.String r6 = r2.w(r3)     // Catch: java.lang.Throwable -> L62
            java.lang.String r7 = r2.w(r3)     // Catch: java.lang.Throwable -> L62
            java.lang.String r8 = r2.w(r3)     // Catch: java.lang.Throwable -> L62
            java.lang.String r9 = r2.w(r3)     // Catch: java.lang.Throwable -> L62
            java.lang.String r10 = "libcore.io.DiskLruCache"
            boolean r10 = r10.equals(r5)     // Catch: java.lang.Throwable -> L62
            if (r10 == 0) goto L84
            java.lang.String r10 = "1"
            boolean r10 = r10.equals(r6)     // Catch: java.lang.Throwable -> L62
            if (r10 == 0) goto L84
            int r10 = r11.appVersion     // Catch: java.lang.Throwable -> L62
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L62
            boolean r10 = defpackage.j42.c(r10, r7)     // Catch: java.lang.Throwable -> L62
            if (r10 == 0) goto L84
            int r10 = r11.valueCount     // Catch: java.lang.Throwable -> L62
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L62
            boolean r10 = defpackage.j42.c(r10, r8)     // Catch: java.lang.Throwable -> L62
            if (r10 == 0) goto L84
            int r10 = r9.length()     // Catch: java.lang.Throwable -> L62
            if (r10 > 0) goto L84
            r0 = 0
        L58:
            java.lang.String r1 = r2.w(r3)     // Catch: java.lang.Throwable -> L62 java.io.EOFException -> L64
            r11.readJournalLine(r1)     // Catch: java.lang.Throwable -> L62 java.io.EOFException -> L64
            int r0 = r0 + 1
            goto L58
        L62:
            r11 = move-exception
            goto Lb3
        L64:
            java.util.Map<java.lang.String, coil3.disk.DiskLruCache$Entry> r1 = r11.lruEntries     // Catch: java.lang.Throwable -> L62
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L62
            int r0 = r0 - r1
            r11.operationsSinceRewrite = r0     // Catch: java.lang.Throwable -> L62
            boolean r0 = r2.p()     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L77
            r11.writeJournal()     // Catch: java.lang.Throwable -> L62
            goto L7d
        L77:
            lz r0 = r11.newJournalWriter()     // Catch: java.lang.Throwable -> L62
            r11.journalWriter = r0     // Catch: java.lang.Throwable -> L62
        L7d:
            r2.close()     // Catch: java.lang.Throwable -> L82
            r11 = 0
            goto Lbb
        L82:
            r11 = move-exception
            goto Lbb
        L84:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L62
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L62
            r3.append(r5)     // Catch: java.lang.Throwable -> L62
            r3.append(r0)     // Catch: java.lang.Throwable -> L62
            r3.append(r6)     // Catch: java.lang.Throwable -> L62
            r3.append(r0)     // Catch: java.lang.Throwable -> L62
            r3.append(r7)     // Catch: java.lang.Throwable -> L62
            r3.append(r0)     // Catch: java.lang.Throwable -> L62
            r3.append(r8)     // Catch: java.lang.Throwable -> L62
            r3.append(r0)     // Catch: java.lang.Throwable -> L62
            r3.append(r9)     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = "]"
            r3.append(r0)     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L62
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L62
            throw r11     // Catch: java.lang.Throwable -> L62
        Lb3:
            r2.close()     // Catch: java.lang.Throwable -> Lb7
            goto Lbb
        Lb7:
            r0 = move-exception
            defpackage.sv2.i(r11, r0)
        Lbb:
            if (r11 != 0) goto Lbe
            return
        Lbe:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.disk.DiskLruCache.readJournal():void");
    }

    private final void readJournalLine(String str) {
        String substring;
        int I = jx4.I(str, ' ', 0, 6);
        if (I == -1) {
            zl1.g("unexpected journal line: ".concat(str));
            return;
        }
        int i = I + 1;
        int I2 = jx4.I(str, ' ', i, 4);
        if (I2 == -1) {
            substring = str.substring(i);
            if (I == 6 && qx4.y(str, REMOVE, false)) {
                this.lruEntries.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, I2);
        }
        Map<String, Entry> map = this.lruEntries;
        Entry entry = map.get(substring);
        if (entry == null) {
            entry = new Entry(substring);
            map.put(substring, entry);
        }
        Entry entry2 = entry;
        if (I2 != -1 && I == 5 && qx4.y(str, CLEAN, false)) {
            List<String> Y = jx4.Y(str.substring(I2 + 1), new char[]{' '});
            entry2.setReadable(true);
            entry2.setCurrentEditor(null);
            entry2.setLengths(Y);
            return;
        }
        if (I2 == -1 && I == 5 && qx4.y(str, DIRTY, false)) {
            entry2.setCurrentEditor(new Editor(entry2));
        } else {
            if (I2 == -1 && I == 4 && qx4.y(str, READ, false)) {
                return;
            }
            zl1.g("unexpected journal line: ".concat(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeEntry(Entry entry) {
        lz lzVar;
        if (entry.getLockingSnapshotCount() > 0 && (lzVar = this.journalWriter) != null) {
            lzVar.B(DIRTY);
            lzVar.writeByte(32);
            lzVar.B(entry.getKey());
            lzVar.writeByte(10);
            lzVar.flush();
        }
        if (entry.getLockingSnapshotCount() > 0 || entry.getCurrentEditor() != null) {
            entry.setZombie(true);
            return;
        }
        int i = this.valueCount;
        for (int i2 = 0; i2 < i; i2++) {
            this.fileSystem.delete(entry.getCleanFiles().get(i2));
            this.size -= entry.getLengths()[i2];
            entry.getLengths()[i2] = 0;
        }
        this.operationsSinceRewrite++;
        lz lzVar2 = this.journalWriter;
        if (lzVar2 != null) {
            lzVar2.B(REMOVE);
            lzVar2.writeByte(32);
            lzVar2.B(entry.getKey());
            lzVar2.writeByte(10);
            lzVar2.flush();
        }
        this.lruEntries.remove(entry.getKey());
        if (journalRewriteRequired()) {
            launchCleanup();
        }
    }

    private final boolean removeOldestEntry() {
        for (Entry entry : this.lruEntries.values()) {
            if (!entry.getZombie()) {
                removeEntry(entry);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trimToSize() {
        while (this.size > this.maxSize) {
            if (!removeOldestEntry()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    private final void validateKey(String str) {
        if (LEGAL_KEY_PATTERN.e(str)) {
            return;
        }
        s83.h(r7.C("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeJournal() {
        Throwable th;
        synchronized (this.lock) {
            try {
                lz lzVar = this.journalWriter;
                if (lzVar != null) {
                    lzVar.close();
                }
                q04 l = sv2.l(this.fileSystem.sink(this.journalFileTmp, false));
                try {
                    l.B(MAGIC);
                    l.writeByte(10);
                    l.B("1");
                    l.writeByte(10);
                    l.V(this.appVersion);
                    l.writeByte(10);
                    l.V(this.valueCount);
                    l.writeByte(10);
                    l.writeByte(10);
                    for (Entry entry : this.lruEntries.values()) {
                        if (entry.getCurrentEditor() != null) {
                            l.B(DIRTY);
                            l.writeByte(32);
                            l.B(entry.getKey());
                            l.writeByte(10);
                        } else {
                            l.B(CLEAN);
                            l.writeByte(32);
                            l.B(entry.getKey());
                            entry.writeLengths(l);
                            l.writeByte(10);
                        }
                    }
                    try {
                        l.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        l.close();
                    } catch (Throwable th4) {
                        sv2.i(th3, th4);
                    }
                    th = th3;
                }
                if (th != null) {
                    throw th;
                }
                boolean exists = this.fileSystem.exists(this.journalFile);
                DiskLruCache$fileSystem$1 diskLruCache$fileSystem$1 = this.fileSystem;
                if (exists) {
                    diskLruCache$fileSystem$1.atomicMove(this.journalFile, this.journalFileBackup);
                    this.fileSystem.atomicMove(this.journalFileTmp, this.journalFile);
                    this.fileSystem.delete(this.journalFileBackup);
                } else {
                    diskLruCache$fileSystem$1.atomicMove(this.journalFileTmp, this.journalFile);
                }
                this.journalWriter = newJournalWriter();
                this.operationsSinceRewrite = 0;
                this.hasJournalErrors = false;
                this.mostRecentRebuildFailed = false;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            try {
                if (this.initialized && !this.closed) {
                    for (Entry entry : (Entry[]) this.lruEntries.values().toArray(new Entry[0])) {
                        Editor currentEditor = entry.getCurrentEditor();
                        if (currentEditor != null) {
                            currentEditor.detach();
                        }
                    }
                    trimToSize();
                    i42.e0(this.cleanupScope, null);
                    lz lzVar = this.journalWriter;
                    lzVar.getClass();
                    lzVar.close();
                    this.journalWriter = null;
                    this.closed = true;
                    return;
                }
                this.closed = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Editor edit(String str) {
        synchronized (this.lock) {
            checkNotClosed();
            validateKey(str);
            initialize();
            Entry entry = this.lruEntries.get(str);
            if ((entry != null ? entry.getCurrentEditor() : null) != null) {
                return null;
            }
            if (entry != null && entry.getLockingSnapshotCount() != 0) {
                return null;
            }
            if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
                lz lzVar = this.journalWriter;
                lzVar.getClass();
                lzVar.B(DIRTY);
                lzVar.writeByte(32);
                lzVar.B(str);
                lzVar.writeByte(10);
                lzVar.flush();
                if (this.hasJournalErrors) {
                    return null;
                }
                if (entry == null) {
                    entry = new Entry(str);
                    this.lruEntries.put(str, entry);
                }
                Editor editor = new Editor(entry);
                entry.setCurrentEditor(editor);
                return editor;
            }
            launchCleanup();
            return null;
        }
    }

    public final void evictAll() {
        synchronized (this.lock) {
            try {
                initialize();
                for (Entry entry : (Entry[]) this.lruEntries.values().toArray(new Entry[0])) {
                    removeEntry(entry);
                }
                this.mostRecentTrimFailed = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void flush() {
        synchronized (this.lock) {
            if (this.initialized) {
                checkNotClosed();
                trimToSize();
                lz lzVar = this.journalWriter;
                lzVar.getClass();
                lzVar.flush();
            }
        }
    }

    public final Snapshot get(String str) {
        Snapshot snapshot;
        synchronized (this.lock) {
            checkNotClosed();
            validateKey(str);
            initialize();
            Entry entry = this.lruEntries.get(str);
            if (entry != null && (snapshot = entry.snapshot()) != null) {
                this.operationsSinceRewrite++;
                lz lzVar = this.journalWriter;
                lzVar.getClass();
                lzVar.B(READ);
                lzVar.writeByte(32);
                lzVar.B(str);
                lzVar.writeByte(10);
                lzVar.flush();
                if (journalRewriteRequired()) {
                    launchCleanup();
                }
                return snapshot;
            }
            return null;
        }
    }

    public final void initialize() {
        synchronized (this.lock) {
            try {
                if (this.initialized) {
                    return;
                }
                this.fileSystem.delete(this.journalFileTmp);
                if (this.fileSystem.exists(this.journalFileBackup)) {
                    boolean exists = this.fileSystem.exists(this.journalFile);
                    DiskLruCache$fileSystem$1 diskLruCache$fileSystem$1 = this.fileSystem;
                    if (exists) {
                        diskLruCache$fileSystem$1.delete(this.journalFileBackup);
                    } else {
                        diskLruCache$fileSystem$1.atomicMove(this.journalFileBackup, this.journalFile);
                    }
                }
                if (this.fileSystem.exists(this.journalFile)) {
                    try {
                        readJournal();
                        processJournal();
                        this.initialized = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            delete();
                            this.closed = false;
                        } catch (Throwable th) {
                            this.closed = false;
                            throw th;
                        }
                    }
                }
                writeJournal();
                this.initialized = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean remove(String str) {
        synchronized (this.lock) {
            checkNotClosed();
            validateKey(str);
            initialize();
            Entry entry = this.lruEntries.get(str);
            if (entry == null) {
                return false;
            }
            removeEntry(entry);
            if (this.size <= this.maxSize) {
                this.mostRecentTrimFailed = false;
            }
            return true;
        }
    }

    public final long size() {
        long j;
        synchronized (this.lock) {
            initialize();
            j = this.size;
        }
        return j;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void getJOURNAL_FILE$io_coil_kt_coil3_coil_core$annotations() {
        }

        public static /* synthetic */ void getJOURNAL_FILE_BACKUP$io_coil_kt_coil3_coil_core$annotations() {
        }

        public static /* synthetic */ void getJOURNAL_FILE_TMP$io_coil_kt_coil3_coil_core$annotations() {
        }

        public static /* synthetic */ void getMAGIC$io_coil_kt_coil3_coil_core$annotations() {
        }

        public static /* synthetic */ void getVERSION$io_coil_kt_coil3_coil_core$annotations() {
        }
    }
}

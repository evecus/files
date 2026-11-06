package okhttp3.internal.cache;

import defpackage.al1;
import defpackage.av5;
import defpackage.be;
import defpackage.eq4;
import defpackage.er0;
import defpackage.ew;
import defpackage.hf1;
import defpackage.hl1;
import defpackage.j42;
import defpackage.jx4;
import defpackage.ke1;
import defpackage.lz;
import defpackage.ok3;
import defpackage.q04;
import defpackage.qx4;
import defpackage.s83;
import defpackage.sv2;
import defpackage.ut4;
import defpackage.v1;
import defpackage.v24;
import defpackage.wd5;
import defpackage.zl1;
import defpackage.zy;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.platform.Platform;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class DiskLruCache implements Closeable, Flushable, Lockable {
    private final int appVersion;
    private boolean civilizedFileSystem;
    private final TaskQueue cleanupQueue;
    private final DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;
    private final ok3 directory;
    private final ke1 fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final ok3 journalFile;
    private final ok3 journalFileBackup;
    private final ok3 journalFileTmp;
    private lz journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries;
    private long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;
    public static final Companion Companion = new Companion(null);
    public static final String JOURNAL_FILE = coil3.disk.DiskLruCache.JOURNAL_FILE;
    public static final String JOURNAL_FILE_TEMP = coil3.disk.DiskLruCache.JOURNAL_FILE_TMP;
    public static final String JOURNAL_FILE_BACKUP = coil3.disk.DiskLruCache.JOURNAL_FILE_BACKUP;
    public static final String MAGIC = coil3.disk.DiskLruCache.MAGIC;
    public static final String VERSION_1 = "1";
    public static final long ANY_SEQUENCE_NUMBER = -1;
    public static final v24 LEGAL_KEY_PATTERN = new v24("[a-z0-9_-]{1,120}");
    public static final String CLEAN = "CLEAN";
    public static final String DIRTY = "DIRTY";
    public static final String REMOVE = "REMOVE";
    public static final String READ = "READ";

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class Editor {
        private boolean done;
        private final Entry entry;
        final /* synthetic */ DiskLruCache this$0;
        private final boolean[] written;

        public Editor(DiskLruCache diskLruCache, Entry entry) {
            entry.getClass();
            this.this$0 = diskLruCache;
            this.entry = entry;
            this.written = entry.getReadable$okhttp() ? null : new boolean[diskLruCache.getValueCount$okhttp()];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wd5 newSink$lambda$0$0(DiskLruCache diskLruCache, Editor editor, IOException iOException) {
            iOException.getClass();
            synchronized (diskLruCache) {
                editor.detach$okhttp();
            }
            return wd5.a;
        }

        public final void abort() {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                try {
                    if (this.done) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (j42.c(this.entry.getCurrentEditor$okhttp(), this)) {
                        diskLruCache.completeEdit$okhttp(this, false);
                    }
                    this.done = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void commit() {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                try {
                    if (this.done) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (j42.c(this.entry.getCurrentEditor$okhttp(), this)) {
                        diskLruCache.completeEdit$okhttp(this, true);
                    }
                    this.done = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void detach$okhttp() {
            if (j42.c(this.entry.getCurrentEditor$okhttp(), this)) {
                if (this.this$0.civilizedFileSystem) {
                    this.this$0.completeEdit$okhttp(this, false);
                } else {
                    this.entry.setZombie$okhttp(true);
                }
            }
        }

        public final Entry getEntry$okhttp() {
            return this.entry;
        }

        public final boolean[] getWritten$okhttp() {
            return this.written;
        }

        public final eq4 newSink(int i) {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                try {
                    if (this.done) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!j42.c(this.entry.getCurrentEditor$okhttp(), this)) {
                        return new ew();
                    }
                    if (!this.entry.getReadable$okhttp()) {
                        boolean[] zArr = this.written;
                        zArr.getClass();
                        zArr[i] = true;
                    }
                    try {
                        return new FaultHidingSink(diskLruCache.getFileSystem$okhttp().sink(this.entry.getDirtyFiles$okhttp().get(i)), new be(diskLruCache, this, (byte) 11));
                    } catch (FileNotFoundException unused) {
                        return new ew();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final ut4 newSource(int i) {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (this.done) {
                    throw new IllegalStateException("Check failed.");
                }
                ut4 ut4Var = null;
                if (!this.entry.getReadable$okhttp() || !j42.c(this.entry.getCurrentEditor$okhttp(), this) || this.entry.getZombie$okhttp()) {
                    return null;
                }
                try {
                    ut4Var = diskLruCache.getFileSystem$okhttp().source(this.entry.getCleanFiles$okhttp().get(i));
                } catch (FileNotFoundException unused) {
                }
                return ut4Var;
            }
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class Entry {
        private final List<ok3> cleanFiles;
        private Editor currentEditor;
        private final List<ok3> dirtyFiles;
        private final String key;
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        final /* synthetic */ DiskLruCache this$0;
        private boolean zombie;

        public Entry(DiskLruCache diskLruCache, String str) {
            str.getClass();
            this.this$0 = diskLruCache;
            this.key = str;
            this.lengths = new long[diskLruCache.getValueCount$okhttp()];
            this.cleanFiles = new ArrayList();
            this.dirtyFiles = new ArrayList();
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int valueCount$okhttp = diskLruCache.getValueCount$okhttp();
            for (int i = 0; i < valueCount$okhttp; i++) {
                sb.append(i);
                this.cleanFiles.add(this.this$0.getDirectory().f(sb.toString()));
                sb.append(".tmp");
                this.dirtyFiles.add(this.this$0.getDirectory().f(sb.toString()));
                sb.setLength(length);
            }
        }

        private final Void invalidLengths(List<String> list) {
            throw new IOException("unexpected journal line: " + list);
        }

        private final ut4 newSource(int i) {
            final ut4 source = this.this$0.getFileSystem$okhttp().source(this.cleanFiles.get(i));
            if (this.this$0.civilizedFileSystem) {
                return source;
            }
            this.lockingSourceCount++;
            final DiskLruCache diskLruCache = this.this$0;
            return new hl1(source) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
                private boolean closed;

                @Override // defpackage.hl1, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    super.close();
                    if (this.closed) {
                        return;
                    }
                    this.closed = true;
                    DiskLruCache diskLruCache2 = diskLruCache;
                    DiskLruCache.Entry entry = this;
                    synchronized (diskLruCache2) {
                        entry.setLockingSourceCount$okhttp(entry.getLockingSourceCount$okhttp() - 1);
                        if (entry.getLockingSourceCount$okhttp() == 0 && entry.getZombie$okhttp()) {
                            diskLruCache2.removeEntry$okhttp(entry);
                        }
                    }
                }
            };
        }

        public final List<ok3> getCleanFiles$okhttp() {
            return this.cleanFiles;
        }

        public final Editor getCurrentEditor$okhttp() {
            return this.currentEditor;
        }

        public final List<ok3> getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }

        public final String getKey$okhttp() {
            return this.key;
        }

        public final long[] getLengths$okhttp() {
            return this.lengths;
        }

        public final int getLockingSourceCount$okhttp() {
            return this.lockingSourceCount;
        }

        public final boolean getReadable$okhttp() {
            return this.readable;
        }

        public final long getSequenceNumber$okhttp() {
            return this.sequenceNumber;
        }

        public final boolean getZombie$okhttp() {
            return this.zombie;
        }

        public final void setCurrentEditor$okhttp(Editor editor) {
            this.currentEditor = editor;
        }

        public final void setLengths$okhttp(List<String> list) {
            list.getClass();
            if (list.size() != this.this$0.getValueCount$okhttp()) {
                invalidLengths(list);
                zy.n();
                return;
            }
            try {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    this.lengths[i] = Long.parseLong(list.get(i));
                }
            } catch (NumberFormatException unused) {
                invalidLengths(list);
                zy.n();
            }
        }

        public final void setLockingSourceCount$okhttp(int i) {
            this.lockingSourceCount = i;
        }

        public final void setReadable$okhttp(boolean z) {
            this.readable = z;
        }

        public final void setSequenceNumber$okhttp(long j) {
            this.sequenceNumber = j;
        }

        public final void setZombie$okhttp(boolean z) {
            this.zombie = z;
        }

        public final Snapshot snapshot$okhttp() {
            DiskLruCache diskLruCache = this.this$0;
            if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(diskLruCache)) {
                av5.b(Thread.currentThread().getName(), " MUST hold lock on ", diskLruCache);
                return null;
            }
            if (!this.readable) {
                return null;
            }
            if (!this.this$0.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.lengths.clone();
            int i = 0;
            try {
                int valueCount$okhttp = this.this$0.getValueCount$okhttp();
                for (int i2 = 0; i2 < valueCount$okhttp; i2++) {
                    arrayList.add(newSource(i2));
                }
                return new Snapshot(this.this$0, this.key, this.sequenceNumber, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    _UtilCommonKt.closeQuietly((ut4) obj);
                }
                try {
                    this.this$0.removeEntry$okhttp(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void writeLengths$okhttp(lz lzVar) {
            lzVar.getClass();
            for (long j : this.lengths) {
                lzVar.writeByte(32).V(j);
            }
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class Snapshot implements Closeable {
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final List<ut4> sources;
        final /* synthetic */ DiskLruCache this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public Snapshot(DiskLruCache diskLruCache, String str, long j, List<? extends ut4> list, long[] jArr) {
            str.getClass();
            list.getClass();
            jArr.getClass();
            this.this$0 = diskLruCache;
            this.key = str;
            this.sequenceNumber = j;
            this.sources = list;
            this.lengths = jArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator<ut4> it = this.sources.iterator();
            while (it.hasNext()) {
                _UtilCommonKt.closeQuietly(it.next());
            }
        }

        public final Editor edit() {
            return this.this$0.edit(this.key, this.sequenceNumber);
        }

        public final long getLength(int i) {
            return this.lengths[i];
        }

        public final ut4 getSource(int i) {
            return this.sources.get(i);
        }

        public final String key() {
            return this.key;
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [okhttp3.internal.cache.DiskLruCache$cleanupTask$1] */
    public DiskLruCache(final ke1 ke1Var, ok3 ok3Var, int i, int i2, long j, TaskRunner taskRunner) {
        ke1Var.getClass();
        ok3Var.getClass();
        taskRunner.getClass();
        this.directory = ok3Var;
        this.appVersion = i;
        this.valueCount = i2;
        this.fileSystem = new al1(ke1Var) { // from class: okhttp3.internal.cache.DiskLruCache$fileSystem$1
            @Override // defpackage.al1, defpackage.ke1
            public eq4 sink(ok3 ok3Var2, boolean z) {
                ok3Var2.getClass();
                ok3 c = ok3Var2.c();
                if (c != null) {
                    createDirectories(c);
                }
                return super.sink(ok3Var2, z);
            }
        };
        this.maxSize = j;
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.cleanupQueue = taskRunner.newQueue();
        final String z = hf1.z(new StringBuilder(), _UtilJvmKt.okHttpName, " Cache");
        this.cleanupTask = new Task(z) { // from class: okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                boolean z2;
                lz lzVar;
                boolean journalRebuildRequired;
                DiskLruCache diskLruCache = DiskLruCache.this;
                synchronized (diskLruCache) {
                    z2 = diskLruCache.initialized;
                    if (!z2 || diskLruCache.getClosed$okhttp()) {
                        return -1L;
                    }
                    try {
                        diskLruCache.trimToSize();
                    } catch (IOException unused) {
                        diskLruCache.mostRecentTrimFailed = true;
                    }
                    try {
                        journalRebuildRequired = diskLruCache.journalRebuildRequired();
                        if (journalRebuildRequired) {
                            diskLruCache.rebuildJournal$okhttp();
                            diskLruCache.redundantOpCount = 0;
                        }
                    } catch (IOException unused2) {
                        diskLruCache.mostRecentRebuildFailed = true;
                        lzVar = diskLruCache.journalWriter;
                        if (lzVar != null) {
                            _UtilCommonKt.closeQuietly(lzVar);
                        }
                        diskLruCache.journalWriter = new q04(new ew());
                    }
                    return -1L;
                }
            }
        };
        if (j <= 0) {
            s83.t("maxSize <= 0");
            throw null;
        }
        if (i2 <= 0) {
            s83.t("valueCount <= 0");
            throw null;
        }
        this.journalFile = ok3Var.f(JOURNAL_FILE);
        this.journalFileTmp = ok3Var.f(JOURNAL_FILE_TEMP);
        this.journalFileBackup = ok3Var.f(JOURNAL_FILE_BACKUP);
    }

    private final synchronized void checkNotClosed() {
        if (this.closed) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache.edit(str, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        return i >= 2000 && i >= this.lruEntries.size();
    }

    private final lz newJournalWriter() {
        return new q04(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), new v1((Object) this, (byte) 15)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 newJournalWriter$lambda$0(DiskLruCache diskLruCache, IOException iOException) {
        iOException.getClass();
        if (!_UtilJvmKt.assertionsEnabled || Thread.holdsLock(diskLruCache)) {
            diskLruCache.hasJournalErrors = true;
            return wd5.a;
        }
        av5.b(Thread.currentThread().getName(), " MUST hold lock on ", diskLruCache);
        return null;
    }

    private final void processJournal() {
        _UtilCommonKt.deleteIfExists(this.fileSystem, this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            next.getClass();
            Entry entry = next;
            int i = 0;
            if (entry.getCurrentEditor$okhttp() == null) {
                int i2 = this.valueCount;
                while (i < i2) {
                    this.size += entry.getLengths$okhttp()[i];
                    i++;
                }
            } else {
                entry.setCurrentEditor$okhttp(null);
                int i3 = this.valueCount;
                while (i < i3) {
                    _UtilCommonKt.deleteIfExists(this.fileSystem, entry.getCleanFiles$okhttp().get(i));
                    _UtilCommonKt.deleteIfExists(this.fileSystem, entry.getDirtyFiles$okhttp().get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void readJournal() {
        /*
            r11 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            ke1 r2 = r11.fileSystem
            ok3 r3 = r11.journalFile
            ut4 r2 = r2.source(r3)
            s04 r2 = defpackage.sv2.m(r2)
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r5 = r2.w(r3)     // Catch: java.lang.Throwable -> L62
            java.lang.String r6 = r2.w(r3)     // Catch: java.lang.Throwable -> L62
            java.lang.String r7 = r2.w(r3)     // Catch: java.lang.Throwable -> L62
            java.lang.String r8 = r2.w(r3)     // Catch: java.lang.Throwable -> L62
            java.lang.String r9 = r2.w(r3)     // Catch: java.lang.Throwable -> L62
            java.lang.String r10 = okhttp3.internal.cache.DiskLruCache.MAGIC     // Catch: java.lang.Throwable -> L62
            boolean r10 = defpackage.j42.c(r10, r5)     // Catch: java.lang.Throwable -> L62
            if (r10 == 0) goto L8b
            java.lang.String r10 = okhttp3.internal.cache.DiskLruCache.VERSION_1     // Catch: java.lang.Throwable -> L62
            boolean r10 = defpackage.j42.c(r10, r6)     // Catch: java.lang.Throwable -> L62
            if (r10 == 0) goto L8b
            int r10 = r11.appVersion     // Catch: java.lang.Throwable -> L62
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L62
            boolean r7 = defpackage.j42.c(r10, r7)     // Catch: java.lang.Throwable -> L62
            if (r7 == 0) goto L8b
            int r7 = r11.valueCount     // Catch: java.lang.Throwable -> L62
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L62
            boolean r7 = defpackage.j42.c(r7, r8)     // Catch: java.lang.Throwable -> L62
            if (r7 == 0) goto L8b
            int r7 = r9.length()     // Catch: java.lang.Throwable -> L62
            if (r7 > 0) goto L8b
            r0 = 0
        L58:
            java.lang.String r1 = r2.w(r3)     // Catch: java.lang.Throwable -> L62 java.io.EOFException -> L64
            r11.readJournalLine(r1)     // Catch: java.lang.Throwable -> L62 java.io.EOFException -> L64
            int r0 = r0 + 1
            goto L58
        L62:
            r11 = move-exception
            goto Lb4
        L64:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r1 = r11.lruEntries     // Catch: java.lang.Throwable -> L62
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L62
            int r0 = r0 - r1
            r11.redundantOpCount = r0     // Catch: java.lang.Throwable -> L62
            boolean r0 = r2.p()     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L77
            r11.rebuildJournal$okhttp()     // Catch: java.lang.Throwable -> L62
            goto L84
        L77:
            lz r0 = r11.journalWriter     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L7e
            okhttp3.internal._UtilCommonKt.closeQuietly(r0)     // Catch: java.lang.Throwable -> L62
        L7e:
            lz r0 = r11.newJournalWriter()     // Catch: java.lang.Throwable -> L62
            r11.journalWriter = r0     // Catch: java.lang.Throwable -> L62
        L84:
            r2.close()     // Catch: java.lang.Throwable -> L89
            r11 = 0
            goto Lbc
        L89:
            r11 = move-exception
            goto Lbc
        L8b:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L62
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L62
            r3.append(r5)     // Catch: java.lang.Throwable -> L62
            r3.append(r0)     // Catch: java.lang.Throwable -> L62
            r3.append(r6)     // Catch: java.lang.Throwable -> L62
            r3.append(r0)     // Catch: java.lang.Throwable -> L62
            r3.append(r8)     // Catch: java.lang.Throwable -> L62
            r3.append(r0)     // Catch: java.lang.Throwable -> L62
            r3.append(r9)     // Catch: java.lang.Throwable -> L62
            r0 = 93
            r3.append(r0)     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L62
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L62
            throw r11     // Catch: java.lang.Throwable -> L62
        Lb4:
            r2.close()     // Catch: java.lang.Throwable -> Lb8
            goto Lbc
        Lb8:
            r0 = move-exception
            defpackage.sv2.i(r11, r0)
        Lbc:
            if (r11 != 0) goto Lbf
            return
        Lbf:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.readJournal():void");
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
            String str2 = REMOVE;
            if (I == str2.length() && qx4.y(str, str2, false)) {
                this.lruEntries.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, I2);
        }
        Entry entry = this.lruEntries.get(substring);
        if (entry == null) {
            entry = new Entry(this, substring);
            this.lruEntries.put(substring, entry);
        }
        if (I2 != -1) {
            String str3 = CLEAN;
            if (I == str3.length() && qx4.y(str, str3, false)) {
                List<String> Y = jx4.Y(str.substring(I2 + 1), new char[]{' '});
                entry.setReadable$okhttp(true);
                entry.setCurrentEditor$okhttp(null);
                entry.setLengths$okhttp(Y);
                return;
            }
        }
        if (I2 == -1) {
            String str4 = DIRTY;
            if (I == str4.length() && qx4.y(str, str4, false)) {
                entry.setCurrentEditor$okhttp(new Editor(this, entry));
                return;
            }
        }
        if (I2 == -1) {
            String str5 = READ;
            if (I == str5.length() && qx4.y(str, str5, false)) {
                return;
            }
        }
        zl1.g("unexpected journal line: ".concat(str));
    }

    private final boolean removeOldestEntry() {
        for (Entry entry : this.lruEntries.values()) {
            entry.getClass();
            Entry entry2 = entry;
            if (!entry2.getZombie$okhttp()) {
                removeEntry$okhttp(entry2);
                return true;
            }
        }
        return false;
    }

    private final void validateKey(String str) {
        if (LEGAL_KEY_PATTERN.e(str)) {
            return;
        }
        s83.h(hf1.t('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        Editor currentEditor$okhttp;
        try {
            if (this.initialized && !this.closed) {
                Collection<Entry> values = this.lruEntries.values();
                values.getClass();
                for (Entry entry : (Entry[]) values.toArray(new Entry[0])) {
                    entry.getClass();
                    if (entry.getCurrentEditor$okhttp() != null && (currentEditor$okhttp = entry.getCurrentEditor$okhttp()) != null) {
                        currentEditor$okhttp.detach$okhttp();
                    }
                }
                trimToSize();
                lz lzVar = this.journalWriter;
                if (lzVar != null) {
                    _UtilCommonKt.closeQuietly(lzVar);
                }
                this.journalWriter = null;
                this.closed = true;
                return;
            }
            this.closed = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void completeEdit$okhttp(Editor editor, boolean z) {
        editor.getClass();
        Entry entry$okhttp = editor.getEntry$okhttp();
        if (!j42.c(entry$okhttp.getCurrentEditor$okhttp(), editor)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z && !entry$okhttp.getReadable$okhttp()) {
            int i = this.valueCount;
            for (int i2 = 0; i2 < i; i2++) {
                boolean[] written$okhttp = editor.getWritten$okhttp();
                written$okhttp.getClass();
                if (!written$okhttp[i2]) {
                    editor.abort();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                }
                if (!this.fileSystem.exists(entry$okhttp.getDirtyFiles$okhttp().get(i2))) {
                    editor.abort();
                    return;
                }
            }
        }
        int i3 = this.valueCount;
        for (int i4 = 0; i4 < i3; i4++) {
            ok3 ok3Var = entry$okhttp.getDirtyFiles$okhttp().get(i4);
            if (!z || entry$okhttp.getZombie$okhttp()) {
                _UtilCommonKt.deleteIfExists(this.fileSystem, ok3Var);
            } else if (this.fileSystem.exists(ok3Var)) {
                ok3 ok3Var2 = entry$okhttp.getCleanFiles$okhttp().get(i4);
                this.fileSystem.atomicMove(ok3Var, ok3Var2);
                long j = entry$okhttp.getLengths$okhttp()[i4];
                Long l = this.fileSystem.metadata(ok3Var2).d;
                long longValue = l != null ? l.longValue() : 0L;
                entry$okhttp.getLengths$okhttp()[i4] = longValue;
                this.size = (this.size - j) + longValue;
            }
        }
        entry$okhttp.setCurrentEditor$okhttp(null);
        if (entry$okhttp.getZombie$okhttp()) {
            removeEntry$okhttp(entry$okhttp);
            return;
        }
        this.redundantOpCount++;
        lz lzVar = this.journalWriter;
        lzVar.getClass();
        if (!entry$okhttp.getReadable$okhttp() && !z) {
            this.lruEntries.remove(entry$okhttp.getKey$okhttp());
            lzVar.B(REMOVE).writeByte(32);
            lzVar.B(entry$okhttp.getKey$okhttp());
            lzVar.writeByte(10);
            lzVar.flush();
            if (this.size <= this.maxSize || journalRebuildRequired()) {
                TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            }
        }
        entry$okhttp.setReadable$okhttp(true);
        lzVar.B(CLEAN).writeByte(32);
        lzVar.B(entry$okhttp.getKey$okhttp());
        entry$okhttp.writeLengths$okhttp(lzVar);
        lzVar.writeByte(10);
        if (z) {
            long j2 = this.nextSequenceNumber;
            this.nextSequenceNumber = 1 + j2;
            entry$okhttp.setSequenceNumber$okhttp(j2);
        }
        lzVar.flush();
        if (this.size <= this.maxSize) {
        }
        TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
    }

    public final void delete() {
        close();
        _UtilCommonKt.deleteContents(this.fileSystem, this.directory);
    }

    public final synchronized Editor edit(String str, long j) {
        str.getClass();
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (j != ANY_SEQUENCE_NUMBER && (entry == null || entry.getSequenceNumber$okhttp() != j)) {
            return null;
        }
        if ((entry != null ? entry.getCurrentEditor$okhttp() : null) != null) {
            return null;
        }
        if (entry != null && entry.getLockingSourceCount$okhttp() != 0) {
            return null;
        }
        if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
            lz lzVar = this.journalWriter;
            lzVar.getClass();
            lzVar.B(DIRTY).writeByte(32).B(str).writeByte(10);
            lzVar.flush();
            if (this.hasJournalErrors) {
                return null;
            }
            if (entry == null) {
                entry = new Entry(this, str);
                this.lruEntries.put(str, entry);
            }
            Editor editor = new Editor(this, entry);
            entry.setCurrentEditor$okhttp(editor);
            return editor;
        }
        TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        return null;
    }

    public final synchronized void evictAll() {
        try {
            initialize();
            Collection<Entry> values = this.lruEntries.values();
            values.getClass();
            for (Entry entry : (Entry[]) values.toArray(new Entry[0])) {
                entry.getClass();
                removeEntry$okhttp(entry);
            }
            this.mostRecentTrimFailed = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.initialized) {
            checkNotClosed();
            trimToSize();
            lz lzVar = this.journalWriter;
            lzVar.getClass();
            lzVar.flush();
        }
    }

    public final synchronized Snapshot get(String str) {
        str.getClass();
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (entry == null) {
            return null;
        }
        Snapshot snapshot$okhttp = entry.snapshot$okhttp();
        if (snapshot$okhttp == null) {
            return null;
        }
        this.redundantOpCount++;
        lz lzVar = this.journalWriter;
        lzVar.getClass();
        lzVar.B(READ).writeByte(32).B(str).writeByte(10);
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return snapshot$okhttp;
    }

    public final boolean getClosed$okhttp() {
        return this.closed;
    }

    public final ok3 getDirectory() {
        return this.directory;
    }

    public final ke1 getFileSystem$okhttp() {
        return this.fileSystem;
    }

    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
        return this.lruEntries;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    public final int getValueCount$okhttp() {
        return this.valueCount;
    }

    public final synchronized void initialize() {
        try {
            if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
            }
            if (this.initialized) {
                return;
            }
            if (this.fileSystem.exists(this.journalFileBackup)) {
                boolean exists = this.fileSystem.exists(this.journalFile);
                ke1 ke1Var = this.fileSystem;
                if (exists) {
                    ke1Var.delete(this.journalFileBackup);
                } else {
                    ke1Var.atomicMove(this.journalFileBackup, this.journalFile);
                }
            }
            this.civilizedFileSystem = _UtilCommonKt.isCivilized(this.fileSystem, this.journalFileBackup);
            if (this.fileSystem.exists(this.journalFile)) {
                try {
                    readJournal();
                    processJournal();
                    this.initialized = true;
                    return;
                } catch (IOException e) {
                    Platform.Companion.get().log("DiskLruCache " + this.directory + " is corrupt: " + e.getMessage() + ", removing", 5, e);
                    try {
                        delete();
                        this.closed = false;
                    } catch (Throwable th) {
                        this.closed = false;
                        throw th;
                    }
                }
            }
            rebuildJournal$okhttp();
            this.initialized = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean isClosed() {
        return this.closed;
    }

    public final synchronized void rebuildJournal$okhttp() {
        Throwable th;
        try {
            lz lzVar = this.journalWriter;
            if (lzVar != null) {
                lzVar.close();
            }
            q04 l = sv2.l(this.fileSystem.sink(this.journalFileTmp, false));
            try {
                l.B(MAGIC);
                l.writeByte(10);
                l.B(VERSION_1);
                l.writeByte(10);
                l.V(this.appVersion);
                l.writeByte(10);
                l.V(this.valueCount);
                l.writeByte(10);
                l.writeByte(10);
                for (Entry entry : this.lruEntries.values()) {
                    entry.getClass();
                    Entry entry2 = entry;
                    if (entry2.getCurrentEditor$okhttp() != null) {
                        l.B(DIRTY);
                        l.writeByte(32);
                        l.B(entry2.getKey$okhttp());
                        l.writeByte(10);
                    } else {
                        l.B(CLEAN);
                        l.writeByte(32);
                        l.B(entry2.getKey$okhttp());
                        entry2.writeLengths$okhttp(l);
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
            ke1 ke1Var = this.fileSystem;
            if (exists) {
                ke1Var.atomicMove(this.journalFile, this.journalFileBackup);
                this.fileSystem.atomicMove(this.journalFileTmp, this.journalFile);
                _UtilCommonKt.deleteIfExists(this.fileSystem, this.journalFileBackup);
            } else {
                ke1Var.atomicMove(this.journalFileTmp, this.journalFile);
            }
            lz lzVar2 = this.journalWriter;
            if (lzVar2 != null) {
                _UtilCommonKt.closeQuietly(lzVar2);
            }
            this.journalWriter = newJournalWriter();
            this.hasJournalErrors = false;
            this.mostRecentRebuildFailed = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final synchronized boolean remove(String str) {
        str.getClass();
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (entry == null) {
            return false;
        }
        boolean removeEntry$okhttp = removeEntry$okhttp(entry);
        if (removeEntry$okhttp && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        return removeEntry$okhttp;
    }

    public final boolean removeEntry$okhttp(Entry entry) {
        lz lzVar;
        entry.getClass();
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount$okhttp() > 0 && (lzVar = this.journalWriter) != null) {
                lzVar.B(DIRTY);
                lzVar.writeByte(32);
                lzVar.B(entry.getKey$okhttp());
                lzVar.writeByte(10);
                lzVar.flush();
            }
            if (entry.getLockingSourceCount$okhttp() > 0 || entry.getCurrentEditor$okhttp() != null) {
                entry.setZombie$okhttp(true);
                return true;
            }
        }
        Editor currentEditor$okhttp = entry.getCurrentEditor$okhttp();
        if (currentEditor$okhttp != null) {
            currentEditor$okhttp.detach$okhttp();
        }
        int i = this.valueCount;
        for (int i2 = 0; i2 < i; i2++) {
            _UtilCommonKt.deleteIfExists(this.fileSystem, entry.getCleanFiles$okhttp().get(i2));
            this.size -= entry.getLengths$okhttp()[i2];
            entry.getLengths$okhttp()[i2] = 0;
        }
        this.redundantOpCount++;
        lz lzVar2 = this.journalWriter;
        if (lzVar2 != null) {
            lzVar2.B(REMOVE);
            lzVar2.writeByte(32);
            lzVar2.B(entry.getKey$okhttp());
            lzVar2.writeByte(10);
        }
        this.lruEntries.remove(entry.getKey$okhttp());
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return true;
    }

    public final void setClosed$okhttp(boolean z) {
        this.closed = z;
    }

    public final synchronized void setMaxSize(long j) {
        this.maxSize = j;
        if (this.initialized) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    public final synchronized long size() {
        initialize();
        return this.size;
    }

    public final synchronized Iterator<Snapshot> snapshots() {
        initialize();
        return new DiskLruCache$snapshots$1(this);
    }

    public final void trimToSize() {
        while (this.size > this.maxSize) {
            if (!removeOldestEntry()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        private Companion() {
        }
    }

    public final Editor edit(String str) {
        str.getClass();
        return edit$default(this, str, 0L, 2, null);
    }
}

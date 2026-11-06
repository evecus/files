package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.nio.file.FileSystem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class ke1 implements Closeable {
    public static final je1 Companion = new je1();
    public static final ke1 RESOURCES;
    public static final ke1 SYSTEM;
    public static final ok3 SYSTEM_TEMPORARY_DIRECTORY;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, tm1] */
    /* renamed from: -write$default, reason: not valid java name */
    public static Object m204write$default(ke1 ke1Var, ok3 ok3Var, boolean z, tm1 tm1Var, int i, Object obj) {
        ?? r3;
        Object th = null;
        if (obj != null) {
            zy.p("Super calls with default arguments not supported in this target, function: write");
            return null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        ok3Var.getClass();
        tm1Var.getClass();
        q04 l = sv2.l(ke1Var.sink(ok3Var, z));
        try {
            Object invoke = tm1Var.invoke(l);
            try {
                l.close();
            } catch (Throwable th2) {
                th = th2;
            }
            Object obj2 = th;
            th = invoke;
            r3 = obj2;
        } catch (Throwable th3) {
            try {
                l.close();
                r3 = th3;
            } catch (Throwable th4) {
                sv2.i(th3, th4);
                r3 = th3;
            }
        }
        if (r3 == 0) {
            return th;
        }
        throw r3;
    }

    static {
        ke1 q72Var;
        try {
            Class.forName("java.nio.file.Files");
            q72Var = new fa3();
        } catch (ClassNotFoundException unused) {
            q72Var = new q72();
        }
        SYSTEM = q72Var;
        String str = ok3.J;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        SYSTEM_TEMPORARY_DIRECTORY = o63.f(property);
        ClassLoader classLoader = u44.class.getClassLoader();
        classLoader.getClass();
        RESOURCES = new u44(classLoader);
    }

    public static /* synthetic */ eq4 appendingSink$default(ke1 ke1Var, ok3 ok3Var, boolean z, int i, Object obj) {
        if (obj != null) {
            zy.p("Super calls with default arguments not supported in this target, function: appendingSink");
            return null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return ke1Var.appendingSink(ok3Var, z);
    }

    public static /* synthetic */ void createDirectories$default(ke1 ke1Var, ok3 ok3Var, boolean z, int i, Object obj) {
        if (obj != null) {
            zy.p("Super calls with default arguments not supported in this target, function: createDirectories");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        ke1Var.createDirectories(ok3Var, z);
    }

    public static /* synthetic */ void createDirectory$default(ke1 ke1Var, ok3 ok3Var, boolean z, int i, Object obj) {
        if (obj != null) {
            zy.p("Super calls with default arguments not supported in this target, function: createDirectory");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        ke1Var.createDirectory(ok3Var, z);
    }

    public static /* synthetic */ void delete$default(ke1 ke1Var, ok3 ok3Var, boolean z, int i, Object obj) {
        if (obj != null) {
            zy.p("Super calls with default arguments not supported in this target, function: delete");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        ke1Var.delete(ok3Var, z);
    }

    public static /* synthetic */ void deleteRecursively$default(ke1 ke1Var, ok3 ok3Var, boolean z, int i, Object obj) {
        if (obj != null) {
            zy.p("Super calls with default arguments not supported in this target, function: deleteRecursively");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        ke1Var.deleteRecursively(ok3Var, z);
    }

    public static final ke1 get(FileSystem fileSystem) {
        Companion.getClass();
        fileSystem.getClass();
        return new ea3(fileSystem);
    }

    public static /* synthetic */ oj4 listRecursively$default(ke1 ke1Var, ok3 ok3Var, boolean z, int i, Object obj) {
        if (obj != null) {
            zy.p("Super calls with default arguments not supported in this target, function: listRecursively");
            return null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return ke1Var.listRecursively(ok3Var, z);
    }

    public static /* synthetic */ ge1 openReadWrite$default(ke1 ke1Var, ok3 ok3Var, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            zy.p("Super calls with default arguments not supported in this target, function: openReadWrite");
            return null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return ke1Var.openReadWrite(ok3Var, z, z2);
    }

    public static /* synthetic */ eq4 sink$default(ke1 ke1Var, ok3 ok3Var, boolean z, int i, Object obj) {
        if (obj != null) {
            zy.p("Super calls with default arguments not supported in this target, function: sink");
            return null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return ke1Var.sink(ok3Var, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, tm1] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* renamed from: -read, reason: not valid java name */
    public final <T> T m205read(ok3 ok3Var, tm1 tm1Var) {
        ?? r3;
        ok3Var.getClass();
        tm1Var.getClass();
        s04 m = sv2.m(source(ok3Var));
        T th = null;
        try {
            ?? invoke = tm1Var.invoke(m);
            try {
                m.close();
            } catch (Throwable th2) {
                th = th2;
            }
            r3 = th;
            th = invoke;
        } catch (Throwable th3) {
            try {
                m.close();
                r3 = th3;
            } catch (Throwable th4) {
                sv2.i(th3, th4);
                r3 = th3;
            }
        }
        if (r3 == 0) {
            return th;
        }
        throw r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, tm1] */
    /* renamed from: -write, reason: not valid java name */
    public final <T> T m206write(ok3 ok3Var, boolean z, tm1 tm1Var) {
        ?? r3;
        ok3Var.getClass();
        tm1Var.getClass();
        q04 l = sv2.l(sink(ok3Var, z));
        T th = null;
        try {
            ?? invoke = tm1Var.invoke(l);
            try {
                l.close();
            } catch (Throwable th2) {
                th = th2;
            }
            r3 = th;
            th = invoke;
        } catch (Throwable th3) {
            try {
                l.close();
                r3 = th3;
            } catch (Throwable th4) {
                sv2.i(th3, th4);
                r3 = th3;
            }
        }
        if (r3 == 0) {
            return th;
        }
        throw r3;
    }

    public eq4 appendingSink(ok3 ok3Var, boolean z) {
        ok3Var.getClass();
        if (!z || exists(ok3Var)) {
            return new ih3(new FileOutputStream(ok3Var.toFile(), true), new u75());
        }
        zy.f(ok3Var, " doesn't exist.");
        return null;
    }

    public void atomicMove(ok3 ok3Var, ok3 ok3Var2) {
        ok3Var.getClass();
        ok3Var2.getClass();
        if (ok3Var.toFile().renameTo(ok3Var2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + ok3Var + " to " + ok3Var2);
    }

    public ok3 canonicalize(ok3 ok3Var) {
        ok3Var.getClass();
        File canonicalFile = ok3Var.toFile().getCanonicalFile();
        if (!canonicalFile.exists()) {
            throw new FileNotFoundException("no such file");
        }
        String str = ok3.J;
        return o63.g(canonicalFile);
    }

    public void copy(ok3 ok3Var, ok3 ok3Var2) {
        Throwable th;
        Long l;
        ok3Var.getClass();
        ok3Var2.getClass();
        ut4 source = source(ok3Var);
        Throwable th2 = null;
        try {
            q04 l2 = sv2.l(sink$default(this, ok3Var2, false, 2, null));
            try {
                l = Long.valueOf(l2.q(source));
                try {
                    l2.close();
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                try {
                    l2.close();
                } catch (Throwable th5) {
                    sv2.i(th4, th5);
                }
                th = th4;
                l = null;
            }
        } catch (Throwable th6) {
            th2 = th6;
            if (source != null) {
                try {
                    source.close();
                } catch (Throwable th7) {
                    sv2.i(th2, th7);
                }
            }
        }
        if (th != null) {
            throw th;
        }
        l.getClass();
        if (source != null) {
            try {
                source.close();
            } catch (Throwable th8) {
                th2 = th8;
            }
        }
        if (th2 != null) {
            throw th2;
        }
    }

    public final void createDirectories(ok3 ok3Var, boolean z) {
        ok3Var.getClass();
        pp ppVar = new pp();
        for (ok3 ok3Var2 = ok3Var; ok3Var2 != null && !exists(ok3Var2); ok3Var2 = ok3Var2.c()) {
            ppVar.addFirst(ok3Var2);
        }
        if (z && ppVar.isEmpty()) {
            zy.f(ok3Var, " already exists.");
            return;
        }
        Iterator<E> it = ppVar.iterator();
        while (it.hasNext()) {
            createDirectory$default(this, (ok3) it.next(), false, 2, null);
        }
    }

    public void createDirectory(ok3 ok3Var, boolean z) {
        ok3Var.getClass();
        throw new IOException(this + " is read-only");
    }

    public void createSymlink(ok3 ok3Var, ok3 ok3Var2) {
        ok3Var.getClass();
        ok3Var2.getClass();
        throw new IOException("unsupported");
    }

    public void delete(ok3 ok3Var, boolean z) {
        ok3Var.getClass();
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = ok3Var.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            zl1.g(r7.y(ok3Var, "failed to delete "));
        } else if (z) {
            throw new FileNotFoundException(r7.y(ok3Var, "no such file: "));
        }
    }

    public void deleteRecursively(ok3 ok3Var, boolean z) {
        ok3Var.getClass();
        Iterator it = new fq(new d(this, ok3Var, null), (byte) 1).iterator();
        while (true) {
            pj4 pj4Var = (pj4) it;
            if (!pj4Var.hasNext()) {
                return;
            } else {
                delete((ok3) pj4Var.next(), z && !pj4Var.hasNext());
            }
        }
    }

    public final boolean exists(ok3 ok3Var) {
        ok3Var.getClass();
        return metadataOrNull(ok3Var) != null;
    }

    public List list(ok3 ok3Var) {
        ok3Var.getClass();
        ArrayList e = q72.e(ok3Var, true);
        e.getClass();
        return e;
    }

    public List listOrNull(ok3 ok3Var) {
        ok3Var.getClass();
        return q72.e(ok3Var, false);
    }

    public oj4 listRecursively(ok3 ok3Var, boolean z) {
        ok3Var.getClass();
        return new fq(new e(ok3Var, this, z, null), (byte) 1);
    }

    public final he1 metadata(ok3 ok3Var) {
        ok3Var.getClass();
        he1 metadataOrNull = metadataOrNull(ok3Var);
        if (metadataOrNull != null) {
            return metadataOrNull;
        }
        throw new FileNotFoundException(r7.y(ok3Var, "no such file: "));
    }

    public he1 metadataOrNull(ok3 ok3Var) {
        ok3Var.getClass();
        File file = ok3Var.toFile();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        long lastModified = file.lastModified();
        long length = file.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new he1(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null);
    }

    public ge1 openReadOnly(ok3 ok3Var) {
        ok3Var.getClass();
        return new p72(new RandomAccessFile(ok3Var.toFile(), "r"), (byte) 0);
    }

    public ge1 openReadWrite(ok3 ok3Var, boolean z, boolean z2) {
        ok3Var.getClass();
        if (z && z2) {
            s83.t("Cannot require mustCreate and mustExist at the same time.");
            return null;
        }
        if (z && exists(ok3Var)) {
            zy.f(ok3Var, " already exists.");
            return null;
        }
        if (!z2 || exists(ok3Var)) {
            return new p72(new RandomAccessFile(ok3Var.toFile(), "rw"), (byte) 0);
        }
        zy.f(ok3Var, " doesn't exist.");
        return null;
    }

    public eq4 sink(ok3 ok3Var, boolean z) {
        ok3Var.getClass();
        if (!z || !exists(ok3Var)) {
            return new ih3(new FileOutputStream(ok3Var.toFile(), false), new u75());
        }
        zy.f(ok3Var, " already exists.");
        return null;
    }

    public ut4 source(ok3 ok3Var) {
        ok3Var.getClass();
        return new m12(new FileInputStream(ok3Var.toFile()), u75.NONE);
    }

    public final oj4 listRecursively(ok3 ok3Var) {
        ok3Var.getClass();
        return listRecursively(ok3Var, false);
    }

    public final void createDirectory(ok3 ok3Var) {
        ok3Var.getClass();
        createDirectory(ok3Var, false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final eq4 appendingSink(ok3 ok3Var) {
        ok3Var.getClass();
        return appendingSink(ok3Var, false);
    }

    public final eq4 sink(ok3 ok3Var) {
        ok3Var.getClass();
        return sink(ok3Var, false);
    }

    public final void deleteRecursively(ok3 ok3Var) {
        ok3Var.getClass();
        deleteRecursively(ok3Var, false);
    }

    public final void delete(ok3 ok3Var) {
        ok3Var.getClass();
        delete(ok3Var, false);
    }

    public final ge1 openReadWrite(ok3 ok3Var) {
        ok3Var.getClass();
        return openReadWrite(ok3Var, false, false);
    }

    public final void createDirectories(ok3 ok3Var) {
        ok3Var.getClass();
        createDirectories(ok3Var, false);
    }
}

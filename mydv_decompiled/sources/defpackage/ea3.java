package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ea3 extends fa3 {
    public final FileSystem I;

    public ea3(FileSystem fileSystem) {
        this.I = fileSystem;
    }

    @Override // defpackage.ke1
    public final eq4 appendingSink(ok3 ok3Var, boolean z) {
        StandardOpenOption standardOpenOption;
        ok3Var.getClass();
        mk2 K = p70.K();
        K.add(StandardOpenOption.APPEND);
        if (!z) {
            standardOpenOption = StandardOpenOption.CREATE;
            K.add(standardOpenOption);
        }
        mk2 D = p70.D(K);
        Path y = y(ok3Var);
        StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) D.toArray(new StandardOpenOption[0]);
        OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
        OutputStream newOutputStream = Files.newOutputStream(y, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        newOutputStream.getClass();
        return new ih3(newOutputStream, new u75());
    }

    @Override // defpackage.fa3, defpackage.ke1
    public final void atomicMove(ok3 ok3Var, ok3 ok3Var2) {
        StandardCopyOption standardCopyOption;
        StandardCopyOption standardCopyOption2;
        ok3Var.getClass();
        ok3Var2.getClass();
        try {
            Path y = y(ok3Var);
            Path y2 = y(ok3Var2);
            standardCopyOption = StandardCopyOption.ATOMIC_MOVE;
            standardCopyOption2 = StandardCopyOption.REPLACE_EXISTING;
            Files.move(y, y2, (CopyOption[]) Arrays.copyOf(new CopyOption[]{standardCopyOption, standardCopyOption2}, 2)).getClass();
        } catch (UnsupportedOperationException unused) {
            zl1.g("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // defpackage.ke1
    public final ok3 canonicalize(ok3 ok3Var) {
        ok3Var.getClass();
        try {
            String str = ok3.J;
            Path realPath = y(ok3Var).toRealPath(new LinkOption[0]);
            realPath.getClass();
            return o63.h(realPath);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(r7.y(ok3Var, "no such file: "));
        }
    }

    @Override // defpackage.ke1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.I.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0.b == true) goto L8;
     */
    @Override // defpackage.q72, defpackage.ke1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void createDirectory(defpackage.ok3 r4, boolean r5) {
        /*
            r3 = this;
            r4.getClass()
            java.nio.file.Path r0 = r3.y(r4)
            he1 r0 = defpackage.fa3.g(r0)
            r1 = 0
            if (r0 == 0) goto L14
            boolean r0 = r0.b
            r2 = 1
            if (r0 != r2) goto L14
            goto L15
        L14:
            r2 = r1
        L15:
            if (r2 == 0) goto L20
            if (r5 != 0) goto L1a
            goto L20
        L1a:
            java.lang.String r3 = " already exists."
            defpackage.zy.f(r4, r3)
            return
        L20:
            java.nio.file.Path r3 = r3.y(r4)     // Catch: java.io.IOException -> L34
            java.nio.file.attribute.FileAttribute[] r5 = new java.nio.file.attribute.FileAttribute[r1]     // Catch: java.io.IOException -> L34
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r1)     // Catch: java.io.IOException -> L34
            java.nio.file.attribute.FileAttribute[] r5 = (java.nio.file.attribute.FileAttribute[]) r5     // Catch: java.io.IOException -> L34
            java.nio.file.Path r3 = java.nio.file.Files.createDirectory(r3, r5)     // Catch: java.io.IOException -> L34
            r3.getClass()     // Catch: java.io.IOException -> L34
            return
        L34:
            r3 = move-exception
            if (r2 == 0) goto L38
            return
        L38:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r0 = "failed to create directory: "
            java.lang.String r4 = defpackage.r7.y(r4, r0)
            r5.<init>(r4, r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ea3.createDirectory(ok3, boolean):void");
    }

    @Override // defpackage.fa3, defpackage.ke1
    public final void createSymlink(ok3 ok3Var, ok3 ok3Var2) {
        ok3Var.getClass();
        ok3Var2.getClass();
        Files.createSymbolicLink(y(ok3Var), y(ok3Var2), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0)).getClass();
    }

    @Override // defpackage.ke1
    public final void delete(ok3 ok3Var, boolean z) {
        ok3Var.getClass();
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        Path y = y(ok3Var);
        try {
            Files.delete(y);
        } catch (NoSuchFileException unused) {
            if (z) {
                throw new FileNotFoundException(r7.y(ok3Var, "no such file: "));
            }
        } catch (IOException unused2) {
            if (Files.exists(y, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                zl1.g(r7.y(ok3Var, "failed to delete "));
            }
        }
    }

    @Override // defpackage.ke1
    public final List list(ok3 ok3Var) {
        ok3Var.getClass();
        ArrayList t = t(ok3Var, true);
        t.getClass();
        return t;
    }

    @Override // defpackage.ke1
    public final List listOrNull(ok3 ok3Var) {
        ok3Var.getClass();
        return t(ok3Var, false);
    }

    @Override // defpackage.fa3, defpackage.ke1
    public final he1 metadataOrNull(ok3 ok3Var) {
        ok3Var.getClass();
        return fa3.g(y(ok3Var));
    }

    @Override // defpackage.ke1
    public final ge1 openReadOnly(ok3 ok3Var) {
        StandardOpenOption standardOpenOption;
        ok3Var.getClass();
        try {
            Path y = y(ok3Var);
            standardOpenOption = StandardOpenOption.READ;
            FileChannel open = FileChannel.open(y, standardOpenOption);
            open.getClass();
            return new p72(open, (byte) 1);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(r7.y(ok3Var, "no such file: "));
        }
    }

    @Override // defpackage.ke1
    public final ge1 openReadWrite(ok3 ok3Var, boolean z, boolean z2) {
        StandardOpenOption standardOpenOption;
        StandardOpenOption standardOpenOption2;
        StandardOpenOption standardOpenOption3;
        ok3Var.getClass();
        if (z && z2) {
            s83.t("Cannot require mustCreate and mustExist at the same time.");
            return null;
        }
        mk2 K = p70.K();
        standardOpenOption = StandardOpenOption.READ;
        K.add(standardOpenOption);
        K.add(StandardOpenOption.WRITE);
        if (z) {
            standardOpenOption3 = StandardOpenOption.CREATE_NEW;
            K.add(standardOpenOption3);
        } else if (!z2) {
            standardOpenOption2 = StandardOpenOption.CREATE;
            K.add(standardOpenOption2);
        }
        mk2 D = p70.D(K);
        try {
            Path y = y(ok3Var);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) D.toArray(new StandardOpenOption[0]);
            FileChannel open = FileChannel.open(y, (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length));
            open.getClass();
            return new p72(open, (byte) 1);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(r7.y(ok3Var, "no such file: "));
        }
    }

    @Override // defpackage.ke1
    public final eq4 sink(ok3 ok3Var, boolean z) {
        StandardOpenOption standardOpenOption;
        ok3Var.getClass();
        mk2 K = p70.K();
        if (z) {
            standardOpenOption = StandardOpenOption.CREATE_NEW;
            K.add(standardOpenOption);
        }
        mk2 D = p70.D(K);
        try {
            Path y = y(ok3Var);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) D.toArray(new StandardOpenOption[0]);
            OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
            OutputStream newOutputStream = Files.newOutputStream(y, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
            newOutputStream.getClass();
            return new ih3(newOutputStream, new u75());
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(r7.y(ok3Var, "no such file: "));
        }
    }

    @Override // defpackage.ke1
    public final ut4 source(ok3 ok3Var) {
        ok3Var.getClass();
        try {
            InputStream newInputStream = Files.newInputStream(y(ok3Var), (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0));
            newInputStream.getClass();
            return sp0.e0(newInputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(r7.y(ok3Var, "no such file: "));
        }
    }

    public final ArrayList t(ok3 ok3Var, boolean z) {
        Path y = y(ok3Var);
        try {
            DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(y, "*");
            try {
                newDirectoryStream.getClass();
                List<Path> r1 = o70.r1(newDirectoryStream);
                newDirectoryStream.close();
                ArrayList arrayList = new ArrayList();
                for (Path path : r1) {
                    String str = ok3.J;
                    arrayList.add(o63.h(path));
                }
                t70.G0(arrayList);
                return arrayList;
            } finally {
            }
        } catch (Exception unused) {
            if (!z) {
                return null;
            }
            if (!Files.exists(y, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                throw new FileNotFoundException(r7.y(ok3Var, "no such file: "));
            }
            zl1.g(r7.y(ok3Var, "failed to list "));
            return null;
        }
    }

    @Override // defpackage.fa3, defpackage.q72
    public final String toString() {
        String c = s24.a(this.I.getClass()).c();
        c.getClass();
        return c;
    }

    public final Path y(ok3 ok3Var) {
        Path path = this.I.getPath(ok3Var.I.s(), new String[0]);
        path.getClass();
        return path;
    }
}

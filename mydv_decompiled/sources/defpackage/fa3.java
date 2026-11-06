package defpackage;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class fa3 extends q72 {
    public static he1 g(Path path) {
        ok3 ok3Var;
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path readSymbolicLink = readAttributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (readSymbolicLink != null) {
                String str = ok3.J;
                ok3Var = o63.h(readSymbolicLink);
            } else {
                ok3Var = null;
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            Long n = creationTime != null ? n(creationTime) : null;
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            Long n2 = lastModifiedTime != null ? n(lastModifiedTime) : null;
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            return new he1(isRegularFile, isDirectory, ok3Var, valueOf, n, n2, lastAccessTime != null ? n(lastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    public static Long n(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (millis != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // defpackage.ke1
    public void atomicMove(ok3 ok3Var, ok3 ok3Var2) {
        StandardCopyOption standardCopyOption;
        StandardCopyOption standardCopyOption2;
        ok3Var.getClass();
        ok3Var2.getClass();
        try {
            Path g = ok3Var.g();
            Path g2 = ok3Var2.g();
            standardCopyOption = StandardCopyOption.ATOMIC_MOVE;
            standardCopyOption2 = StandardCopyOption.REPLACE_EXISTING;
            Files.move(g, g2, standardCopyOption, standardCopyOption2);
        } catch (UnsupportedOperationException unused) {
            zl1.g("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // defpackage.ke1
    public void createSymlink(ok3 ok3Var, ok3 ok3Var2) {
        ok3Var.getClass();
        ok3Var2.getClass();
        Files.createSymbolicLink(ok3Var.g(), ok3Var2.g(), new FileAttribute[0]);
    }

    @Override // defpackage.ke1
    public he1 metadataOrNull(ok3 ok3Var) {
        ok3Var.getClass();
        return g(ok3Var.g());
    }

    @Override // defpackage.q72
    public String toString() {
        return "NioSystemFileSystem";
    }
}

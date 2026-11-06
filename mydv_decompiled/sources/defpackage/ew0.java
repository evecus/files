package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ew0 {
    public final AssetManager a;
    public final Executor b;
    public final du3 c;
    public final byte[] d;
    public final File e;
    public final String f;
    public boolean g = false;
    public fw0[] h;
    public byte[] i;

    public ew0(AssetManager assetManager, Executor executor, du3 du3Var, String str, File file) {
        this.a = assetManager;
        this.b = executor;
        this.c = du3Var;
        this.f = str;
        this.e = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i >= 24) {
            if (i < 31) {
                switch (i) {
                    case 24:
                    case 25:
                        bArr = eu5.w;
                        break;
                    case 26:
                        bArr = eu5.v;
                        break;
                    case 27:
                        bArr = eu5.u;
                        break;
                    case 28:
                    case 29:
                    case 30:
                        bArr = eu5.t;
                        break;
                }
            } else {
                bArr = eu5.s;
            }
        }
        this.d = bArr;
    }

    public final boolean a() {
        if (this.d == null) {
            d(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        File file = this.e;
        if (!file.exists()) {
            try {
                if (!file.createNewFile()) {
                    d(4, null);
                    return false;
                }
            } catch (IOException unused) {
                d(4, null);
                return false;
            }
        } else if (!file.canWrite()) {
            d(4, null);
            return false;
        }
        this.g = true;
        return true;
    }

    public final FileInputStream b(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.c.c();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ew0 c() {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ew0.c():ew0");
    }

    public final void d(int i, Serializable serializable) {
        this.b.execute(new dw0((byte) 0, i, this, serializable));
    }

    public final void e() {
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream;
        du3 du3Var = this.c;
        fw0[] fw0VarArr = this.h;
        if (fw0VarArr == null || (bArr = this.d) == null) {
            return;
        }
        if (!this.g) {
            zy.i("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
            return;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(qg5.s);
                byteArrayOutputStream.write(bArr);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            du3Var.e(7, e);
        } catch (IllegalStateException e2) {
            du3Var.e(8, e2);
        }
        if (qg5.R0(byteArrayOutputStream, bArr, fw0VarArr)) {
            this.i = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.h = null;
        } else {
            du3Var.e(5, null);
            this.h = null;
            byteArrayOutputStream.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f() {
        byte[] bArr = this.i;
        if (bArr != null) {
            if (!this.g) {
                zy.i("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                return false;
            }
            try {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(this.e);
                        try {
                            FileChannel channel = fileOutputStream.getChannel();
                            try {
                                FileLock tryLock = channel.tryLock();
                                if (tryLock != null) {
                                    try {
                                        if (tryLock.isValid()) {
                                            byte[] bArr2 = new byte[512];
                                            while (true) {
                                                int read = byteArrayInputStream.read(bArr2);
                                                if (read <= 0) {
                                                    d(1, null);
                                                    tryLock.close();
                                                    channel.close();
                                                    fileOutputStream.close();
                                                    byteArrayInputStream.close();
                                                    return true;
                                                }
                                                fileOutputStream.write(bArr2, 0, read);
                                            }
                                        }
                                    } finally {
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            byteArrayInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (FileNotFoundException e) {
                    d(6, e);
                    return false;
                } catch (IOException e2) {
                    d(7, e2);
                    return false;
                }
            } finally {
                this.i = null;
                this.h = null;
            }
        }
        return false;
    }
}

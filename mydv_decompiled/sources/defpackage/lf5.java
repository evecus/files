package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class lf5 {
    public static boolean a;
    public static kf5 b;
    public static final fw4 c = o7.c(Float.valueOf(-1.0f));
    public static final fw4 d = o7.c(null);
    public static final List e = p70.k0("https://gh-proxy.org/", "https://gh-proxy.com/", "https://ghproxy.net/", "https://gh.cc/", "https://mirror.ghproxy.com/", "https://github.moeyy.xyz/", "https://ghproxy.cn/", "https://gh.api.99988866.xyz/", "https://gh-proxy.ygxz.in/", "");
    public static long f;
    public static List g;
    public static long h;
    public static List i;

    public static Object a(Context context, boolean z, k05 k05Var) {
        boolean z2 = a;
        el0 el0Var = el0.I;
        fj0 fj0Var = null;
        if (!z2) {
            os0 os0Var = sx0.a;
            Object D0 = p70.D0(ur0.I, new ff5(context, z, null), k05Var);
            if (D0 == el0Var) {
                return D0;
            }
        } else if (!z) {
            os0 os0Var2 = sx0.a;
            Object D02 = p70.D0(ju2.a, new df5(context, fj0Var, (byte) 0), k05Var);
            if (D02 == el0Var) {
                return D02;
            }
        }
        return wd5.a;
    }

    public static void b(Context context) {
        File[] listFiles;
        try {
            File file = new File(context.getFilesDir(), "updates");
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    String name = file2.getName();
                    name.getClass();
                    if (qx4.s(name, ".apk", false)) {
                        file2.delete();
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static Intent c(Intent intent) {
        return Build.VERSION.SDK_INT >= 33 ? (Intent) intent.getParcelableExtra("android.intent.extra.INTENT", Intent.class) : (Intent) intent.getParcelableExtra("android.intent.extra.INTENT");
    }

    public static String d(Context context) {
        PackageInfo packageInfo;
        Signature[] signatureArr;
        try {
            PackageManager packageManager = context.getPackageManager();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 33) {
                packageInfo = packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(i2 >= 28 ? 134217728 : 64));
                packageInfo.getClass();
            } else {
                packageInfo = packageManager.getPackageInfo(context.getPackageName(), i2 >= 28 ? 134217728 : 64);
                packageInfo.getClass();
            }
            if (i2 >= 28) {
                SigningInfo signingInfo = packageInfo.signingInfo;
                signatureArr = signingInfo != null ? signingInfo.getApkContentsSigners() : null;
            } else {
                signatureArr = packageInfo.signatures;
            }
            return f(signatureArr);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String e(File file) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[65536];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        fileInputStream.close();
                        byte[] digest = messageDigest.digest();
                        digest.getClass();
                        return dq.g1(digest, new m45((byte) 9));
                    }
                    messageDigest.update(bArr, 0, read);
                }
            } finally {
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String f(Signature[] signatureArr) {
        if (signatureArr != null) {
            try {
                if (signatureArr.length != 0) {
                    return dq.h1(signatureArr, ",", new m45((byte) 8), 30);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public static boolean g(Context context, String str, Uri uri) {
        try {
            Intent intent = new Intent(str);
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setDataAndType(uri, "application/vnd.android.package-archive");
            intent.addFlags(268435456);
            intent.addFlags(1);
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e2) {
            Log.w("UpdateManager", str.concat(" 没有可响应的系统安装器"), e2);
            return false;
        } catch (Exception e3) {
            Log.w("UpdateManager", str.concat(" 唤起安装器失败"), e3);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String h(android.content.Context r6, java.io.File r7, java.lang.String r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L67
            int r1 = r8.length()
            if (r1 != 0) goto La
            goto L67
        La:
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: java.lang.Exception -> L2b
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L2b
            r2 = 33
            r3 = 64
            r4 = 134217728(0x8000000, float:3.85186E-34)
            r5 = 28
            if (r1 < r2) goto L2d
            java.lang.String r7 = r7.getAbsolutePath()     // Catch: java.lang.Exception -> L2b
            if (r1 < r5) goto L21
            r3 = r4
        L21:
            long r2 = (long) r3     // Catch: java.lang.Exception -> L2b
            android.content.pm.PackageManager$PackageInfoFlags r2 = android.content.pm.PackageManager.PackageInfoFlags.of(r2)     // Catch: java.lang.Exception -> L2b
            android.content.pm.PackageInfo r6 = r6.getPackageArchiveInfo(r7, r2)     // Catch: java.lang.Exception -> L2b
            goto L38
        L2b:
            r6 = move-exception
            goto L50
        L2d:
            java.lang.String r7 = r7.getAbsolutePath()     // Catch: java.lang.Exception -> L2b
            if (r1 < r5) goto L34
            r3 = r4
        L34:
            android.content.pm.PackageInfo r6 = r6.getPackageArchiveInfo(r7, r3)     // Catch: java.lang.Exception -> L2b
        L38:
            if (r6 == 0) goto L4e
            if (r1 < r5) goto L47
            android.content.pm.SigningInfo r6 = r6.signingInfo     // Catch: java.lang.Exception -> L2b
            if (r6 == 0) goto L45
            android.content.pm.Signature[] r6 = r6.getApkContentsSigners()     // Catch: java.lang.Exception -> L2b
            goto L49
        L45:
            r6 = r0
            goto L49
        L47:
            android.content.pm.Signature[] r6 = r6.signatures     // Catch: java.lang.Exception -> L2b
        L49:
            java.lang.String r6 = f(r6)     // Catch: java.lang.Exception -> L2b
            goto L54
        L4e:
            r6 = r0
            goto L54
        L50:
            r6.printStackTrace()
            goto L4e
        L54:
            if (r6 != 0) goto L5e
            java.lang.String r6 = "UpdateManager"
            java.lang.String r7 = "无法读取更新包签名，跳过安装前校验"
            android.util.Log.w(r6, r7)
            return r0
        L5e:
            boolean r6 = r6.equalsIgnoreCase(r8)
            if (r6 != 0) goto L67
            java.lang.String r6 = "更新包签名与本机应用不一致"
            return r6
        L67:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lf5.h(android.content.Context, java.io.File, java.lang.String):java.lang.String");
    }
}

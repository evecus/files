package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.pm.PackageInstaller;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;
import androidx.media3.common.C;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gf5 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Context J;
    public final /* synthetic */ File K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gf5(Context context, File file, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.J = context;
        this.K = file;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        File file = this.K;
        Context context = this.J;
        switch (b) {
            case 0:
                return new gf5(context, file, fj0Var, (byte) 0);
            case 1:
                return new gf5(context, file, fj0Var, (byte) 1);
            default:
                return new gf5(context, file, fj0Var, (byte) 2);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
            case 0:
                ((gf5) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
        }
        return ((gf5) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        PackageInstaller.Session openSession;
        FileInputStream fileInputStream;
        OutputStream openWrite;
        byte b = this.I;
        boolean z = false;
        fj0 fj0Var = null;
        File file = this.K;
        Context context = this.J;
        switch (b) {
            case 0:
                mu0.V(obj);
                fw4 fw4Var = lf5.c;
                Float f = new Float(-1.0f);
                fw4Var.getClass();
                fw4Var.i(null, f);
                lf5.a = false;
                Toast.makeText(context, "下载完成", 0).show();
                Context applicationContext = context.getApplicationContext();
                os0 os0Var = sx0.a;
                p70.g0(xq1.I, ju2.a, null, new jd(applicationContext, file, fj0Var, (byte) 11), 2);
                return wd5.a;
            case 1:
                mu0.V(obj);
                boolean z2 = lf5.a;
                context.getClass();
                PackageInstaller packageInstaller = context.getPackageManager().getPackageInstaller();
                packageInstaller.getClass();
                int i = -1;
                try {
                    i = packageInstaller.createSession(new PackageInstaller.SessionParams(1));
                    openSession = packageInstaller.openSession(i);
                    try {
                        fileInputStream = new FileInputStream(file);
                        try {
                            openWrite = openSession.openWrite("myDV.apk", 0L, file.length());
                        } finally {
                        }
                    } finally {
                    }
                } catch (Exception e) {
                    Log.w("UpdateManager", "PackageInstaller 会话安装失败", e);
                    if (i >= 0) {
                        try {
                            packageInstaller.abandonSession(i);
                        } catch (Exception unused) {
                        }
                    }
                }
                try {
                    openWrite.getClass();
                    c5.r(fileInputStream, openWrite);
                    openWrite.flush();
                    openWrite.close();
                    fileInputStream.close();
                    if (lf5.b == null) {
                        Context applicationContext2 = context.getApplicationContext();
                        kf5 kf5Var = new kf5();
                        lf5.b = kf5Var;
                        z9.h(applicationContext2, kf5Var, new IntentFilter("com.github.mytv.dv.action.INSTALL_RESULT"), 4);
                    }
                    Intent intent = new Intent("com.github.mytv.dv.action.INSTALL_RESULT").setPackage(context.getPackageName());
                    intent.getClass();
                    IntentSender intentSender = PendingIntent.getBroadcast(context, i, intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : C.BUFFER_FLAG_FIRST_SAMPLE).getIntentSender();
                    intentSender.getClass();
                    openSession.commit(intentSender);
                    openSession.close();
                    z = true;
                    return Boolean.valueOf(z);
                } finally {
                }
            default:
                mu0.V(obj);
                boolean z3 = lf5.a;
                context.getClass();
                try {
                    File externalFilesDir = context.getExternalFilesDir(null);
                    if (externalFilesDir == null) {
                        externalFilesDir = context.getFilesDir();
                    }
                    File file2 = new File(externalFilesDir, file.getName());
                    le1.M(file, file2);
                    return file2.getAbsolutePath();
                } catch (Exception e2) {
                    Log.w("UpdateManager", "导出更新包失败", e2);
                    return null;
                }
        }
    }
}

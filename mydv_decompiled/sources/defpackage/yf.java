package defpackage;

import android.os.Environment;
import java.io.File;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class yf extends k05 implements hn1 {
    public final /* synthetic */ byte I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf() {
        super(2, null);
        this.I = (byte) 0;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                return new yf(2, fj0Var, (byte) 0);
            case 1:
                return new yf(2, fj0Var, (byte) 1);
            default:
                return new yf(2, fj0Var, (byte) 2);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                return ((yf) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 1:
                return ((yf) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            default:
                ((yf) create((rb4) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                return wd5Var;
        }
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                mu0.V(obj);
                break;
            case 1:
                mu0.V(obj);
                try {
                    File[] listFiles = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).listFiles(new nt2());
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            file.delete();
                        }
                        break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return wd5Var;
                }
                break;
            default:
                mu0.V(obj);
                break;
        }
        return wd5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yf(int i, fj0 fj0Var, byte b) {
        super(i, fj0Var);
        this.I = b;
    }
}

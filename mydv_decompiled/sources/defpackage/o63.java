package defpackage;

import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import java.io.File;
import java.nio.file.Path;
import java.util.UUID;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class o63 implements du3, sn4 {
    public final /* synthetic */ byte I;

    public o63(ue ueVar) {
        this.I = (byte) 7;
    }

    public static p63 b(yc ycVar, i73 i73Var, Bundle bundle, ki2 ki2Var, b73 b73Var) {
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        i73Var.getClass();
        ki2Var.getClass();
        return new p63(ycVar, i73Var, bundle, ki2Var, b73Var, uuid, null);
    }

    public static ok3 f(String str) {
        str.getClass();
        h00 h00Var = f.a;
        cz czVar = new cz();
        czVar.k0(str);
        return f.d(czVar, false);
    }

    public static ok3 g(File file) {
        String str = ok3.J;
        file.getClass();
        String file2 = file.toString();
        file2.getClass();
        return f(file2);
    }

    public static ok3 h(Path path) {
        String str = ok3.J;
        path.getClass();
        return f(path.toString());
    }

    public static ns4 i() {
        return (ns4) ws4.b.a();
    }

    public static ns4 j(ns4 ns4Var) {
        if (ns4Var instanceof ia5) {
            ia5 ia5Var = (ia5) ns4Var;
            if (ia5Var.t == li4.e()) {
                ia5Var.r = null;
                return ns4Var;
            }
        }
        if (ns4Var instanceof ja5) {
            ja5 ja5Var = (ja5) ns4Var;
            if (ja5Var.i == li4.e()) {
                ja5Var.h = null;
                return ns4Var;
            }
        }
        ns4 e = ws4.e(ns4Var, null, false);
        e.j();
        return e;
    }

    public static Object k(uu0 uu0Var, rm1 rm1Var) {
        ns4 ia5Var;
        ns4 ns4Var = (ns4) ws4.b.a();
        if (ns4Var instanceof ia5) {
            ia5 ia5Var2 = (ia5) ns4Var;
            if (ia5Var2.t == li4.e()) {
                tm1 tm1Var = ia5Var2.r;
                tm1 tm1Var2 = ia5Var2.s;
                try {
                    ((ia5) ns4Var).r = ws4.i(uu0Var, tm1Var, true);
                    ((ia5) ns4Var).s = tm1Var2;
                    return rm1Var.invoke();
                } finally {
                    ia5Var2.r = tm1Var;
                    ia5Var2.s = tm1Var2;
                }
            }
        }
        if (ns4Var == null || (ns4Var instanceof s43)) {
            ia5Var = new ia5(ns4Var instanceof s43 ? (s43) ns4Var : null, uu0Var, null, true, false);
        } else {
            ia5Var = ns4Var.u(uu0Var);
        }
        try {
            ns4 j = ia5Var.j();
            try {
                Object invoke = rm1Var.invoke();
                ns4.q(j);
                ia5Var.c();
                return invoke;
            } catch (Throwable th) {
                ns4.q(j);
                throw th;
            }
        } catch (Throwable th2) {
            ia5Var.c();
            throw th2;
        }
    }

    public static sr n(y1 y1Var) {
        ws4.b(ws4.a);
        synchronized (ws4.c) {
            ws4.h = o70.g1(ws4.h, y1Var);
        }
        return new sr(y1Var, (byte) 6);
    }

    public static void o(ns4 ns4Var, ns4 ns4Var2, tm1 tm1Var) {
        if (ns4Var != ns4Var2) {
            ns4Var2.getClass();
            ns4.q(ns4Var);
            ns4Var2.c();
        } else if (ns4Var instanceof ia5) {
            ((ia5) ns4Var).r = tm1Var;
        } else if (ns4Var instanceof ja5) {
            ((ja5) ns4Var).h = tm1Var;
        } else {
            zy.h(ns4Var, "Non-transparent snapshot was reused: ");
        }
    }

    public static void p() {
        boolean z;
        synchronized (ws4.c) {
            o43 o43Var = ws4.j.h;
            z = false;
            if (o43Var != null) {
                if (o43Var.c()) {
                    z = true;
                }
            }
        }
        if (z) {
            ws4.c();
        }
    }

    @Override // defpackage.sn4
    public zf1 a(az4 az4Var) {
        switch (this.I) {
            case 14:
                return new xg0(qn4.I, (byte) 1);
            default:
                return new xg0(az4Var, (byte) 3);
        }
    }

    @Override // defpackage.du3
    public void c() {
        switch (this.I) {
            case 4:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    public int d() {
        switch (this.I) {
            case 1:
                return 16;
            default:
                return 8;
        }
    }

    @Override // defpackage.du3
    public void e(int i, Object obj) {
        String str;
        switch (this.I) {
            case 4:
                break;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i != 6 && i != 7 && i != 8) {
                    Log.d("ProfileInstaller", str);
                    break;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                    break;
                }
                break;
        }
    }

    public boolean q(k13 k13Var) {
        switch (this.I) {
            case 1:
                return true;
            default:
                return mw2.I(ui4.a(ut0.U(k13Var), false));
        }
    }

    public String toString() {
        switch (this.I) {
            case 9:
                int hashCode = hashCode();
                o7.k(16);
                String num = Integer.toString(hashCode, 16);
                num.getClass();
                return hf1.x("CreationExtras.Key@", num, "<", s24.a(w94.class).c(), ">");
            case 10:
                int hashCode2 = hashCode();
                o7.k(16);
                String num2 = Integer.toString(hashCode2, 16);
                num2.getClass();
                return hf1.x("CreationExtras.Key@", num2, "<", s24.a(wr5.class).c(), ">");
            case 11:
                int hashCode3 = hashCode();
                o7.k(16);
                String num3 = Integer.toString(hashCode3, 16);
                num3.getClass();
                return hf1.x("CreationExtras.Key@", num3, "<", s24.a(Bundle.class).c(), ">");
            case 12:
            case 13:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                return super.toString();
            case 14:
                return "SharingStarted.Eagerly";
            case 15:
                return "SharingStarted.Lazily";
            case 16:
                return "ReusedSlotId";
            case 21:
                int hashCode4 = hashCode();
                o7.k(16);
                String num4 = Integer.toString(hashCode4, 16);
                num4.getClass();
                return hf1.x("CreationExtras.Key@", num4, "<", s24.a(Application.class).c(), ">");
            case 22:
                int hashCode5 = hashCode();
                o7.k(16);
                String num5 = Integer.toString(hashCode5, 16);
                num5.getClass();
                return hf1.x("CreationExtras.Key@", num5, "<", s24.a(String.class).c(), ">");
        }
    }

    public /* synthetic */ o63(byte b) {
        this.I = b;
    }

    private final void l() {
    }

    private final void m(int i, Object obj) {
    }
}

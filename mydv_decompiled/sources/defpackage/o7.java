package defpackage;

import android.content.Intent;
import android.graphics.Matrix;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.WavUtil;
import com.github.mytv.dv.R;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class o7 {
    public static final ep c;
    public static final ep s;
    public static final ep t;
    public static final ep u;
    public final /* synthetic */ byte a;
    public static final q4 b = new q4(0);
    public static final tc0 d = new tc0(641200809, new sg(9), false);
    public static final int[] e = new int[0];
    public static final long[] f = new long[0];
    public static final Object[] g = new Object[0];
    public static final Class[] h = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static final double[][] i = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};
    public static final double[][] j = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};
    public static final double[] k = {0.2126d, 0.7152d, 0.0722d};
    public static final double[] l = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};
    public static final float m = 38.0f;
    public static final float n = 48.0f;
    public static final fn4 o = fn4.J;
    public static final float p = 48.0f;
    public static final KSerializer[] q = new KSerializer[0];
    public static final da r = new da((Object) new sg(27), (Object) new u73(21), (byte) 10);
    public static final o63 v = new o63((byte) 17);

    static {
        byte b2 = 25;
        c = new ep("RESUME_TOKEN", b2);
        s = new ep("NO_VALUE", b2);
        t = new ep("NONE", b2);
        u = new ep("PENDING", b2);
    }

    public /* synthetic */ o7(byte b2) {
        this.a = b2;
    }

    public static ArrayList A(Bundle bundle, String str, Class cls) {
        return Build.VERSION.SDK_INT >= 34 ? el.d(bundle, str, cls) : bundle.getParcelableArrayList(str);
    }

    public static final y60 B(qr5 qr5Var) {
        y60 y60Var;
        qr5Var.getClass();
        synchronized (v) {
            y60Var = (y60) qr5Var.n("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (y60Var == null) {
                tk0 tk0Var = l91.I;
                try {
                    os0 os0Var = sx0.a;
                    tk0Var = ju2.a.L;
                } catch (ab3 | IllegalStateException unused) {
                }
                y60 y60Var2 = new y60(tk0Var.plus(ui4.b()));
                qr5Var.l("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", y60Var2);
                y60Var = y60Var2;
            }
        }
        return y60Var;
    }

    public static final void C(tk0 tk0Var, Throwable th) {
        if (th instanceof mx0) {
            th = ((mx0) th).I;
        }
        try {
            xk0 xk0Var = (xk0) tk0Var.get(wk0.I);
            if (xk0Var != null) {
                xk0Var.handleException(tk0Var, th);
            } else {
                g4.L(tk0Var, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                sv2.i(runtimeException, th);
                th = runtimeException;
            }
            g4.L(tk0Var, th);
        }
    }

    public static double D(double[] dArr) {
        dArr.getClass();
        double[] M = mu0.M(dArr, i);
        double l2 = l(M[0]);
        double l3 = l(M[1]);
        double l4 = l(M[2]);
        return Math.atan2(r7.p(l4, 2.0d, l2 + l3, 9.0d), ((((-12.0d) * l3) + (l2 * 11.0d)) + l4) / 11.0d);
    }

    public static final int E(bq bqVar, Object obj, int i2) {
        int i3 = bqVar.K;
        if (i3 == 0) {
            return -1;
        }
        try {
            int g2 = g(i3, i2, bqVar.I);
            if (g2 < 0 || j42.c(obj, bqVar.J[g2])) {
                return g2;
            }
            int i4 = g2 + 1;
            while (i4 < i3 && bqVar.I[i4] == i2) {
                if (j42.c(obj, bqVar.J[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = g2 - 1; i5 >= 0 && bqVar.I[i5] == i2; i5--) {
                if (j42.c(obj, bqVar.J[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            y9.e();
            return 0;
        }
    }

    public static double F(double d2) {
        double abs = Math.abs(d2);
        return Math.pow(Math.max(0.0d, (27.13d * abs) / (400.0d - abs)), 2.380952380952381d) * (d2 < 0.0d ? -1 : d2 == 0.0d ? 0 : 1);
    }

    public static boolean G(double d2) {
        return 0.0d <= d2 && d2 <= 100.0d;
    }

    public static boolean H(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static final l13 I(l13 l13Var, tm1 tm1Var) {
        return l13Var.then(new s82(tm1Var, null));
    }

    public static final l13 J(l13 l13Var, tm1 tm1Var) {
        return l13Var.then(new s82(null, tm1Var));
    }

    public static final l13 K(l13 l13Var, tm1 tm1Var) {
        return l13Var.then(new te3(tm1Var));
    }

    public static final int M(int i2) {
        return ((i2 & 255) << 24) | (((-16777216) & i2) >>> 24) | ((16711680 & i2) >>> 8) | ((65280 & i2) << 8);
    }

    public static final void N(Object[] objArr, long j2, Object obj) {
        objArr[((int) j2) & (objArr.length - 1)] = obj;
    }

    public static final void O(Matrix matrix, float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[12];
        float f12 = fArr[13];
        float f13 = fArr[15];
        fArr[0] = f2;
        fArr[1] = f6;
        fArr[2] = f11;
        fArr[3] = f3;
        fArr[4] = f7;
        fArr[5] = f12;
        fArr[6] = f5;
        fArr[7] = f9;
        fArr[8] = f13;
        matrix.setValues(fArr);
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        fArr[6] = f8;
        fArr[7] = f9;
        fArr[8] = f10;
    }

    public static final void P(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = 0.0f;
        fArr[3] = f8;
        fArr[4] = f3;
        fArr[5] = f6;
        fArr[6] = 0.0f;
        fArr[7] = f9;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f4;
        fArr[13] = f7;
        fArr[14] = 0.0f;
        fArr[15] = f10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x01c9, code lost:
    
        if (r0[1] > 100.01d) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01cf, code lost:
    
        if (r0[2] <= 100.01d) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01d2, code lost:
    
        r0 = defpackage.p70.s(defpackage.p70.M(r4), defpackage.p70.M(r0[1]), defpackage.p70.M(r0[2]));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01ba, code lost:
    
        r4 = r0[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01c3, code lost:
    
        if (r4 > 100.01d) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int Q(double r52, double r54, double r56) {
        /*
            Method dump skipped, instructions count: 1021
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o7.Q(double, double, double):int");
    }

    public static final String R(fj0 fj0Var) {
        Object g54Var;
        if (fj0Var instanceof nx0) {
            return ((nx0) fj0Var).toString();
        }
        try {
            g54Var = fj0Var + '@' + y(fj0Var);
        } catch (Throwable th) {
            g54Var = new g54(th);
        }
        if (h54.a(g54Var) != null) {
            g54Var = fj0Var.getClass().getName() + '@' + y(fj0Var);
        }
        return (String) g54Var;
    }

    public static final String S(byte b2) {
        char[] cArr = qb.a;
        return new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]});
    }

    public static final String T(int i2) {
        if (i2 == 0) {
            return "0";
        }
        char[] cArr = qb.a;
        int i3 = 0;
        char[] cArr2 = {cArr[(i2 >> 28) & 15], cArr[(i2 >> 24) & 15], cArr[(i2 >> 20) & 15], cArr[(i2 >> 16) & 15], cArr[(i2 >> 12) & 15], cArr[(i2 >> 8) & 15], cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
        while (i3 < 8 && cArr2[i3] == '0') {
            i3++;
        }
        p70.E(i3, 8, 8);
        return new String(cArr2, i3, 8 - i3);
    }

    public static double U(double d2) {
        double d3 = d2 / 100.0d;
        return (d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }

    public static final int V(float f2, float[] fArr, int i2) {
        float f3 = f2 >= 0.0f ? f2 : 0.0f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i2] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }

    public static cj a(float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return new cj(p70.F, Float.valueOf(f2), new dj(f3), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static mn4 b(int i2, int i3, ez ezVar) {
        int i4 = (i3 & 1) != 0 ? 0 : 1;
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        int i5 = i3 & 4;
        ez ezVar2 = ez.I;
        if (i5 != 0) {
            ezVar = ezVar2;
        }
        if (i2 < 0) {
            s83.h(hf1.u(i2, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        if (i4 <= 0 && i2 <= 0 && ezVar != ezVar2) {
            s83.s(ezVar, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
            return null;
        }
        int i6 = i2 + i4;
        if (i6 < 0) {
            i6 = Log.LOG_LEVEL_OFF;
        }
        return new mn4(i4, i6, ezVar);
    }

    public static final fw4 c(Object obj) {
        if (obj == null) {
            obj = p70.x;
        }
        return new fw4(obj);
    }

    public static l13 d(qb5 qb5Var) {
        return n(i13.a).then(new gq4(qb5Var));
    }

    public static boolean e(double d2, double d3, double d4) {
        return ((d3 - d2) + 25.132741228718345d) % 6.283185307179586d < ((d4 - d2) + 25.132741228718345d) % 6.283185307179586d;
    }

    public static final boolean f(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        bArr.getClass();
        bArr2.getClass();
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static final int g(int i2, int i3, int[] iArr) {
        iArr.getClass();
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int h(long[] jArr, int i2, long j2) {
        jArr.getClass();
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final boolean i(Object obj) {
        if (obj instanceof bt4) {
            bt4 bt4Var = (bt4) obj;
            if (bt4Var.b() == q8.v0 || bt4Var.b() == q8.B0 || bt4Var.b() == q8.y0) {
                Object value = bt4Var.getValue();
                if (value == null) {
                    return true;
                }
                return i(value);
            }
        } else if (!(obj instanceof dn1) || !(obj instanceof Serializable)) {
            for (int i2 = 0; i2 < 7; i2++) {
                if (h[i2].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void j(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            StringBuilder A = hf1.A(j2, "size=", " offset=");
            A.append(j3);
            A.append(" byteCount=");
            A.append(j4);
            throw new ArrayIndexOutOfBoundsException(A.toString());
        }
    }

    public static void k(int i2) {
        if (2 > i2 || i2 >= 37) {
            zy.j(hf1.C("radix ", i2, " was not in valid range "), new u22(2, 36, 1));
        }
    }

    public static double l(double d2) {
        double pow = Math.pow(Math.abs(d2), 0.42d);
        return (((d2 < 0.0d ? -1 : d2 == 0.0d ? 0 : 1) * 400.0d) * pow) / (pow + 27.13d);
    }

    public static final l13 m(l13 l13Var, dn4 dn4Var) {
        return qb.P(l13Var, 0.0f, 0.0f, dn4Var, true, 1042431);
    }

    public static final l13 n(l13 l13Var) {
        return qb.P(l13Var, 0.0f, 0.0f, null, true, 1044479);
    }

    public static cj o(cj cjVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = ((Number) cjVar.J.getValue()).floatValue();
        }
        if ((i2 & 2) != 0) {
            f3 = ((dj) cjVar.K).a;
        }
        return new cj(cjVar.I, Float.valueOf(f2), new dj(f3), cjVar.L, cjVar.M, cjVar.N);
    }

    public static final zf1 p(zf1 zf1Var) {
        return zf1Var instanceof dw4 ? zf1Var : zf1Var instanceof ky0 ? zf1Var : new ky0(zf1Var);
    }

    public static final boolean q(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final boolean r(long j2, long j3) {
        return j2 == j3;
    }

    public static final int s(int i2, View view) {
        int i3 = 0;
        int i4 = Log.LOG_LEVEL_OFF;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i2);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i4 = i3;
            }
            i3++;
            Object f2 = oh4.f(view);
            view = f2 instanceof View ? (View) f2 : null;
        }
        return i4;
    }

    public static final View t(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int min = Math.min(s(R.id.view_tree_lifecycle_owner, view), s(R.id.view_tree_saved_state_registry_owner, view));
        View view2 = view;
        int i2 = 0;
        View view3 = view2;
        while (view != null) {
            if (i2 == min) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (x(view) == null) {
                i2++;
                Object f2 = oh4.f(view);
                View view4 = view2;
                view2 = view;
                view = f2 instanceof View ? (View) f2 : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public static long u(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int min = Math.min(i4, 262142);
        int i7 = Log.LOG_LEVEL_OFF;
        int min2 = i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i5, 262142);
        int i8 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i8 >= 8191) {
            if (i8 < 32767) {
                i6 = WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE;
            } else if (i8 < 65535) {
                i6 = 32766;
            } else {
                if (i8 >= 262143) {
                    eh0.l(i8);
                    zy.n();
                    return 0L;
                }
                i6 = 8190;
            }
        }
        if (i3 != Integer.MAX_VALUE) {
            i7 = Math.min(i6, i3);
        }
        return eh0.a(Math.min(i6, i2), i7, min, min2);
    }

    public static long v(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int min = Math.min(i2, 262142);
        int i7 = Log.LOG_LEVEL_OFF;
        int min2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i3, 262142);
        int i8 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i8 >= 8191) {
            if (i8 < 32767) {
                i6 = WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE;
            } else if (i8 < 65535) {
                i6 = 32766;
            } else {
                if (i8 >= 262143) {
                    eh0.l(i8);
                    zy.n();
                    return 0L;
                }
                i6 = 8190;
            }
        }
        if (i5 != Integer.MAX_VALUE) {
            i7 = Math.min(i6, i5);
        }
        return eh0.a(min, min2, Math.min(i6, i4), i7);
    }

    public static final zf1 w(jn4 jn4Var, tk0 tk0Var, int i2, ez ezVar) {
        return ((i2 == 0 || i2 == -3) && ezVar == ez.I) ? jn4Var : new t40(jn4Var, tk0Var, i2, ezVar);
    }

    public static final be0 x(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (be0) weakReference.get();
        }
        return null;
    }

    public static final String y(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static Object z(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return el.c(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public final Object L(Intent intent, int i2) {
        switch (this.a) {
            case 0:
                if (i2 == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i3 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i3 == 0));
                        }
                        ArrayList b1 = dq.b1(stringArrayExtra);
                        Iterator it = b1.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(p70.J(b1, 10), p70.J(arrayList, 10)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new uj3(it.next(), it2.next()));
                        }
                        break;
                    }
                }
                break;
        }
        return new m7(intent, i2);
    }
}

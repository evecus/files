package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.view.MenuItem;
import android.view.textclassifier.TextClassifier;
import androidx.appcompat.widget.ActionMenuView;
import java.io.OutputStream;
import java.lang.reflect.Proxy;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class uu2 implements uy2, qx2, rm, jy2, yq3, cp, qv2 {
    public static final uo1 J;
    public static final vo1 K;
    public static final dg3 L;
    public static final dg3 M = new dg3(0);
    public Object I;

    static {
        byte b = 1;
        J = new uo1(b);
        K = new vo1(b);
        L = new dg3(b);
    }

    public uu2(byte b) {
        bz2 bz2Var;
        az2 az2Var;
        switch (b) {
            case 1:
                try {
                    bz2Var = (bz2) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    bz2Var = K;
                }
                bz2[] bz2VarArr = {vo1.b, bz2Var};
                tu2 tu2Var = new tu2();
                tu2Var.a = bz2VarArr;
                Charset charset = r32.a;
                this.I = tu2Var;
                break;
            case 15:
                this.I = rt0.j(Looper.getMainLooper());
                break;
            case 19:
                this.I = null;
                break;
            default:
                sx3 sx3Var = sx3.c;
                try {
                    az2Var = (az2) Class.forName("androidx.glance.appwidget.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused2) {
                    az2Var = J;
                }
                az2[] az2VarArr = {uo1.b, az2Var};
                su2 su2Var = new su2();
                su2Var.a = az2VarArr;
                Charset charset2 = p32.a;
                this.I = su2Var;
                break;
        }
    }

    public static int A(int i) {
        if (i < 31) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 7;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    public static int E(g73 g73Var, int i, int i2, byte[] bArr, int i3) {
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int i6 = i5 + 3;
            if (i6 > i3) {
                break;
            }
            short s = (short) (bArr[i5] & 255);
            short s2 = (short) (bArr[i5 + 1] & 255);
            short s3 = (short) ((s | (s2 << 8)) & 4095);
            short s4 = (short) (((((short) (bArr[i5 + 2] & 255)) << 4) | (s2 >> 4)) & 4095);
            if (s3 < 3329) {
                ((short[]) g73Var.J)[i + i4] = s3;
                i4++;
            }
            if (i4 < i2 && s4 < 3329) {
                ((short[]) g73Var.J)[i + i4] = s4;
                i4++;
            }
            i5 = i6;
        }
        return i4;
    }

    public static int y(int i) {
        if (i < 128) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 8;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    public static int z(int i, boolean z) {
        return y(i) + (z ? 1 : 0) + i;
    }

    public TextClassifier B() {
        TextClassifier textClassifier;
        textClassifier = super/*android.widget.TextView*/.getTextClassifier();
        return textClassifier;
    }

    public boolean C(int i) {
        if (i < 0) {
            return false;
        }
        tl tlVar = (tl) this.I;
        if (i >= tlVar.a) {
            return false;
        }
        x32 c = tlVar.c(i);
        tm1 tm1Var = ((jg2) c.c).c;
        return tm1Var != null && tm1Var.invoke(Integer.valueOf(i - c.a)) == n84.O0;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0182 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.k82 D(android.view.KeyEvent r12) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uu2.D(android.view.KeyEvent):k82");
    }

    public ArrayList F(int i) {
        ArrayList arrayList = new ArrayList();
        wd2 wd2Var = (wd2) this.I;
        ns4 i2 = o63.i();
        tm1 e = i2 != null ? i2.e() : null;
        ns4 j = o63.j(i2);
        try {
            ld2 ld2Var = wd2Var.b ? wd2Var.c : (ld2) wd2Var.e.getValue();
            if (ld2Var != null) {
                p24 p24Var = new p24();
                p24Var.I = 1;
                List list = (List) ld2Var.k.invoke(Integer.valueOf(i));
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    uj3 uj3Var = (uj3) list.get(i3);
                    bf2 bf2Var = wd2Var.o;
                    int intValue = ((Number) uj3Var.I).intValue();
                    long j2 = ((dh0) uj3Var.J).a;
                    da daVar = wd2.w;
                    p24Var = p24Var;
                    arrayList.add(bf2Var.a(intValue, j2, false, new u20((ArrayList) null, p24Var, list, i, ld2Var)));
                }
            }
            o63.o(i2, j, e);
            return arrayList;
        } catch (Throwable th) {
            o63.o(i2, j, e);
            throw th;
        }
    }

    public void G(int i, int i2, int i3, int i4) {
        super/*android.widget.TextView*/.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    public void H(int[] iArr, int i) {
        super/*android.widget.TextView*/.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public void I(int i) {
        super/*android.widget.TextView*/.setAutoSizeTextTypeWithDefaults(i);
    }

    public void J(TextClassifier textClassifier) {
        super/*android.widget.TextView*/.setTextClassifier(textClassifier);
    }

    public void K(int i) {
        ((OutputStream) this.I).write(i);
    }

    public void L(byte[] bArr, int i, int i2) {
        ((OutputStream) this.I).write(bArr, i, i2);
    }

    public void M(int i, f00 f00Var) {
        ((i70) this.I).u(i, f00Var);
    }

    public void N(int i) {
        OutputStream outputStream = (OutputStream) this.I;
        if (i < 128) {
            outputStream.write(i);
            return;
        }
        int i2 = 5;
        byte[] bArr = new byte[5];
        while (true) {
            int i3 = i2 - 1;
            bArr[i3] = (byte) i;
            i >>>= 8;
            if (i == 0) {
                int i4 = i2 - 2;
                bArr[i4] = (byte) ((5 - i3) | 128);
                outputStream.write(bArr, i4, 6 - i3);
                return;
            }
            i2 = i3;
        }
    }

    public void O(e0[] e0VarArr) {
        for (e0 e0Var : e0VarArr) {
            e0Var.d().n(this, true);
        }
    }

    public void P(byte[] bArr, int i, boolean z) {
        U(i, z);
        N(bArr.length);
        L(bArr, 0, bArr.length);
    }

    public void Q(boolean z, int i, e0[] e0VarArr) {
        U(i, z);
        K(128);
        O(e0VarArr);
        K(0);
        K(0);
    }

    public void R(int i, Object obj, qa4 qa4Var) {
        j70 j70Var = (j70) this.I;
        j70Var.u(i, 3);
        qa4Var.h(j70Var.a, (r3) obj);
        j70Var.u(i, 4);
    }

    public void S(int i, Object obj, ra4 ra4Var) {
        i70 i70Var = (i70) this.I;
        i70Var.G(i, 3);
        ra4Var.i(i70Var.a, (s3) obj);
        i70Var.G(i, 4);
    }

    public void T(int i, int i2) {
        OutputStream outputStream = (OutputStream) this.I;
        if (i2 < 31) {
            outputStream.write(i | i2);
            return;
        }
        byte[] bArr = new byte[6];
        int i3 = 5;
        bArr[5] = (byte) (i2 & 127);
        while (i2 > 127) {
            i2 >>>= 7;
            i3--;
            bArr[i3] = (byte) ((i2 & 127) | 128);
        }
        int i4 = i3 - 1;
        bArr[i4] = (byte) (i | 31);
        outputStream.write(bArr, i4, 6 - i4);
    }

    public void U(int i, boolean z) {
        if (z) {
            K(i);
        }
    }

    public void V(u0 u0Var) {
        u0Var.n(this, true);
    }

    public void W(u0[] u0VarArr) {
        for (u0 u0Var : u0VarArr) {
            u0Var.n(this, true);
        }
    }

    @Override // defpackage.uy2
    public void a(sx2 sx2Var, boolean z) {
        if (sx2Var instanceof oy4) {
            ((oy4) sx2Var).z.l().d(false);
        }
        uy2 uy2Var = ((u6) this.I).M;
        if (uy2Var != null) {
            uy2Var.a(sx2Var, z);
        }
    }

    @Override // defpackage.qx2
    public boolean b(sx2 sx2Var, MenuItem menuItem) {
        x6 x6Var = ((ActionMenuView) this.I).k0;
        if (x6Var == null) {
            return false;
        }
        ((q85) x6Var).I.r0.P();
        return false;
    }

    @Override // defpackage.qv2
    public Object c(Object obj, Object obj2) {
        return ((pn1) this.I).apply(obj2);
    }

    @Override // defpackage.jy2
    public void d(sx2 sx2Var, MenuItem menuItem) {
        ((b20) this.I).N.removeCallbacksAndMessages(sx2Var);
    }

    @Override // defpackage.yq3
    public long e(v22 v22Var, long j, da2 da2Var, long j2) {
        return (c5.m(v22Var.b + ((int) (r0 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true) & 4294967295L) | (c5.m(v22Var.a + ((int) (((r22) ((rm1) this.I).invoke()).a >> 32)), (int) (j2 >> 32), (int) (j >> 32), da2Var == da2.I) << 32);
    }

    @Override // defpackage.qx2
    public void g(sx2 sx2Var) {
        q85 q85Var = ((ActionMenuView) this.I).f0;
        if (q85Var != null) {
            q85Var.g(sx2Var);
        }
    }

    @Override // defpackage.cp
    public Object j(rb4 rb4Var, Float f, Float f2, tm1 tm1Var, hs4 hs4Var) {
        Object d = ui4.d(rb4Var, f.floatValue(), o7.a(0.0f, f2.floatValue(), 28), (up0) this.I, tm1Var, hs4Var);
        return d == el0.I ? d : (yi) d;
    }

    @Override // defpackage.uy2
    public boolean k(sx2 sx2Var) {
        u6 u6Var = (u6) this.I;
        if (sx2Var == u6Var.K) {
            return false;
        }
        ky2 ky2Var = ((oy4) sx2Var).A;
        uy2 uy2Var = u6Var.M;
        if (uy2Var != null) {
            return uy2Var.k(sx2Var);
        }
        return false;
    }

    @Override // defpackage.jy2
    public void l(sx2 sx2Var, ky2 ky2Var) {
        b20 b20Var = (b20) this.I;
        Handler handler = b20Var.N;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = b20Var.P;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (sx2Var == ((a20) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new z10(this, i2 < arrayList.size() ? (a20) arrayList.get(i2) : null, ky2Var, sx2Var), sx2Var, SystemClock.uptimeMillis() + 200);
    }

    public void m(StringBuilder sb, Iterator it) {
        g62 g62Var = (g62) this.I;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(g62.f(entry.getKey()));
            sb.append("=");
            sb.append(g62.f(entry.getValue()));
            while (it.hasNext()) {
                sb.append((CharSequence) g62Var.a);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(g62.f(entry2.getKey()));
                sb.append("=");
                sb.append(g62.f(entry2.getValue()));
            }
        }
    }

    public mh0 n(Object obj, k60 k60Var, Activity activity, sc1 sc1Var) {
        lh0 lh0Var = new lh0(k60Var, sc1Var);
        ClassLoader classLoader = (ClassLoader) this.I;
        Class<?> loadClass = classLoader.loadClass("java.util.function.Consumer");
        loadClass.getClass();
        Object newProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{loadClass}, lh0Var);
        newProxyInstance.getClass();
        Class<?> cls = obj.getClass();
        Class<?> loadClass2 = classLoader.loadClass("java.util.function.Consumer");
        loadClass2.getClass();
        cls.getMethod("addWindowLayoutInfoListener", Activity.class, loadClass2).invoke(obj, activity, newProxyInstance);
        Class<?> cls2 = obj.getClass();
        Class<?> loadClass3 = classLoader.loadClass("java.util.function.Consumer");
        loadClass3.getClass();
        return new mh0(cls2.getMethod("removeWindowLayoutInfoListener", loadClass3), obj, newProxyInstance);
    }

    public void o(byte b) {
        ((Parcel) this.I).writeByte(b);
    }

    public void p(float f) {
        ((Parcel) this.I).writeFloat(f);
    }

    public void q(long j) {
        long b = p65.b(j);
        byte b2 = 0;
        if (!q65.a(b, 0L)) {
            if (q65.a(b, 4294967296L)) {
                b2 = 1;
            } else if (q65.a(b, 8589934592L)) {
                b2 = 2;
            }
        }
        o(b2);
        if (q65.a(p65.b(j), 0L)) {
            return;
        }
        p(p65.c(j));
    }

    public int r() {
        int autoSizeMaxTextSize;
        autoSizeMaxTextSize = super/*android.widget.TextView*/.getAutoSizeMaxTextSize();
        return autoSizeMaxTextSize;
    }

    public int s() {
        int autoSizeMinTextSize;
        autoSizeMinTextSize = super/*android.widget.TextView*/.getAutoSizeMinTextSize();
        return autoSizeMinTextSize;
    }

    public int t() {
        int autoSizeStepGranularity;
        autoSizeStepGranularity = super/*android.widget.TextView*/.getAutoSizeStepGranularity();
        return autoSizeStepGranularity;
    }

    public int[] u() {
        int[] autoSizeTextAvailableSizes;
        autoSizeTextAvailableSizes = super/*android.widget.TextView*/.getAutoSizeTextAvailableSizes();
        return autoSizeTextAvailableSizes;
    }

    public int v() {
        int autoSizeTextType;
        autoSizeTextType = super/*android.widget.TextView*/.getAutoSizeTextType();
        return autoSizeTextType;
    }

    public nn0 w() {
        return new nn0((OutputStream) this.I);
    }

    public co0 x() {
        return new co0((OutputStream) this.I);
    }

    public void f(int i) {
    }

    public void h(int i) {
    }

    public void i(int i, float f) {
    }

    public uu2(ClassLoader classLoader) {
        classLoader.getClass();
        this.I = classLoader;
    }

    public /* synthetic */ uu2(Object obj) {
        this.I = obj;
    }
}

package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.DragEvent;
import android.view.View;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.ts.TsExtractor;
import j$.util.Base64;
import j$.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.LockSupport;
import java.util.regex.Pattern;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class g4 {
    public static hx1 a;
    public static Method b;
    public static Method c;
    public static boolean d;
    public static hx1 e;
    public static hx1 f;
    public static hx1 g;
    public static hx1 h;

    /* JADX WARN: Code restructure failed: missing block: B:108:0x01b9, code lost:
    
        if (r0.compareTo(r2.b) < 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x054f, code lost:
    
        if (r13.size() > 1) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0551, code lost:
    
        r5.J = defpackage.q0.z(r13.y(1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0579, code lost:
    
        if (r13.size() > 1) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x08a8, code lost:
    
        if (r4 == 0) goto L343;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x09aa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x09b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0a68  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x09ad  */
    /* JADX WARN: Type inference failed for: r10v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r11v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A(java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 2921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g4.A(java.lang.String):java.lang.String");
    }

    public static final hx1 B() {
        hx1 hx1Var = e;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new vk3(9.0f, 16.17f));
        arrayList.add(new uk3(4.83f, 12.0f));
        arrayList.add(new cl3(-1.42f, 1.41f));
        arrayList.add(new uk3(9.0f, 19.0f));
        arrayList.add(new uk3(21.0f, 7.0f));
        arrayList.add(new cl3(-1.41f, -1.41f));
        arrayList.add(rk3.c);
        gx1.a(gx1Var, arrayList, rt4Var);
        hx1 b2 = gx1Var.b();
        e = b2;
        return b2;
    }

    public static final String[] C(ui0 ui0Var) {
        ui0Var.getClass();
        return (String[]) ((yb) ui0Var).b.toArray(new String[0]);
    }

    public static final tk0 D(a74 a74Var, gj0 gj0Var) {
        if (!a74Var.j()) {
            dj0 dj0Var = a74Var.a;
            if (dj0Var != null) {
                return dj0Var.I;
            }
            j42.g0("coroutineScope");
            throw null;
        }
        if (gj0Var.getContext().get(m95.I) != null) {
            zl1.c();
            return null;
        }
        dj0 dj0Var2 = a74Var.a;
        if (dj0Var2 != null) {
            return dj0Var2.I;
        }
        j42.g0("coroutineScope");
        throw null;
    }

    public static final hx1 E() {
        hx1 hx1Var = g;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.DateRange", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        epVar.z(9.0f, 11.0f);
        epVar.x(7.0f, 11.0f);
        epVar.M(2.0f);
        epVar.v(2.0f);
        epVar.M(-2.0f);
        epVar.p();
        epVar.z(13.0f, 11.0f);
        epVar.v(-2.0f);
        epVar.M(2.0f);
        epVar.v(2.0f);
        epVar.M(-2.0f);
        epVar.p();
        epVar.z(17.0f, 11.0f);
        epVar.v(-2.0f);
        epVar.M(2.0f);
        epVar.v(2.0f);
        epVar.M(-2.0f);
        epVar.p();
        epVar.z(19.0f, 4.0f);
        epVar.v(-1.0f);
        epVar.x(18.0f, 2.0f);
        epVar.v(-2.0f);
        epVar.M(2.0f);
        epVar.x(8.0f, 4.0f);
        epVar.x(8.0f, 2.0f);
        epVar.x(6.0f, 2.0f);
        epVar.M(2.0f);
        epVar.x(5.0f, 4.0f);
        epVar.r(-1.11f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        epVar.x(3.0f, 20.0f);
        epVar.r(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        epVar.v(14.0f);
        epVar.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        epVar.x(21.0f, 6.0f);
        epVar.r(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        epVar.p();
        epVar.z(19.0f, 20.0f);
        epVar.x(5.0f, 20.0f);
        epVar.x(5.0f, 9.0f);
        epVar.v(14.0f);
        epVar.M(11.0f);
        epVar.p();
        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
        hx1 b2 = gx1Var.b();
        g = b2;
        return b2;
    }

    public static final float F(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final Intent G(d6 d6Var, ha5 ha5Var, int i, t5 t5Var) {
        if (d6Var instanceof tv4) {
            tv4 tv4Var = (tv4) d6Var;
            Intent K = K(tv4Var, tv4Var.b);
            if (K.getData() == null) {
                K.setData(c5.u(ha5Var, i, d7.J, String.valueOf(K.getFlags())));
            }
            return K;
        }
        if (d6Var instanceof lj4) {
            lj4 lj4Var = (lj4) d6Var;
            if (lj4Var instanceof lj4) {
                return c5.o(lj4Var.a, ha5Var, i);
            }
            s83.v();
            return null;
        }
        if (d6Var instanceof a84) {
            int i2 = ActionCallbackBroadcastReceiver.a;
            return c5.o(d4.r(ha5Var, ((a84) d6Var).a), ha5Var, i);
        }
        if (!(d6Var instanceof s92)) {
            zy.h(d6Var, "Cannot create fill-in Intent for action type: ");
            return null;
        }
        ComponentName componentName = ha5Var.n;
        if (componentName != null) {
            return c5.o(new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", ha5Var.b), ha5Var, i);
        }
        s83.t("In order to use LambdaAction, actionBroadcastReceiver must be provided");
        return null;
    }

    public static y00 H(w00 w00Var) {
        v00 v00Var = new v00();
        v00Var.c = new p44();
        y00 y00Var = new y00(v00Var);
        v00Var.b = y00Var;
        v00Var.a = w00Var.getClass();
        try {
            Object a2 = w00Var.a(v00Var);
            if (a2 == null) {
                return y00Var;
            }
            v00Var.a = a2;
            return y00Var;
        } catch (Exception e2) {
            y00Var.J.i(e2);
            return y00Var;
        }
    }

    public static e5 I() {
        e5 e5Var = e5.e;
        if (e5Var != null) {
            return e5Var;
        }
        e5 e5Var2 = new e5();
        new Rect();
        e5.e = e5Var2;
        return e5Var2;
    }

    public static final PendingIntent J(d6 d6Var, ha5 ha5Var, int i, t5 t5Var) {
        Context context = ha5Var.a;
        boolean z = d6Var instanceof tv4;
        d7 d7Var = d7.J;
        if (z) {
            tv4 tv4Var = (tv4) d6Var;
            Intent K = K(tv4Var, tv4Var.b);
            if (K.getData() == null) {
                K.setData(c5.u(ha5Var, i, d7Var, String.valueOf(K.getFlags())));
            }
            return PendingIntent.getActivity(context, 0, K, 201326592, null);
        }
        if (d6Var instanceof lj4) {
            lj4 lj4Var = (lj4) d6Var;
            if (!(lj4Var instanceof lj4)) {
                s83.v();
                return null;
            }
            Intent intent = lj4Var.a;
            if (intent.getData() == null) {
                intent.setData(c5.u(ha5Var, i, d7Var, String.valueOf(intent.getFlags())));
            }
            return PendingIntent.getBroadcast(context, 0, intent, 201326592);
        }
        if (d6Var instanceof a84) {
            int i2 = ActionCallbackBroadcastReceiver.a;
            Intent r = d4.r(ha5Var, ((a84) d6Var).a);
            r.setData(c5.u(ha5Var, i, d7Var, ""));
            return PendingIntent.getBroadcast(context, 0, r, 201326592);
        }
        if (!(d6Var instanceof s92)) {
            zy.h(d6Var, "Cannot create PendingIntent for action type: ");
            return null;
        }
        ComponentName componentName = ha5Var.n;
        if (componentName == null) {
            s83.t("In order to use LambdaAction, actionBroadcastReceiver must be provided");
            return null;
        }
        Intent putExtra = new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", ha5Var.b);
        putExtra.setData(c5.u(ha5Var, i, d7Var, null));
        return PendingIntent.getBroadcast(context, 0, putExtra, 201326592);
    }

    public static final Intent K(tv4 tv4Var, c7 c7Var) {
        if (!(tv4Var instanceof tv4)) {
            zy.h(tv4Var, "Action type not defined in app widget package: ");
            return null;
        }
        Intent intent = tv4Var.a;
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(((k33) c7Var).a);
        ArrayList arrayList = new ArrayList(unmodifiableMap.size());
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            a7 a7Var = (a7) entry.getKey();
            arrayList.add(new uj3(a7Var.a, entry.getValue()));
        }
        uj3[] uj3VarArr = (uj3[]) arrayList.toArray(new uj3[0]);
        intent.putExtras(i42.b0((uj3[]) Arrays.copyOf(uj3VarArr, uj3VarArr.length)));
        return intent;
    }

    public static final void L(tk0 tk0Var, Throwable th) {
        Throwable runtimeException;
        Iterator it = yk0.a.iterator();
        while (it.hasNext()) {
            try {
                ((xk0) it.next()).handleException(tk0Var, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    sv2.i(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                try {
                    currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
                } catch (Throwable unused) {
                }
            }
        }
        try {
            sv2.i(th, new hw0(tk0Var));
        } catch (Throwable unused2) {
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
        } catch (Throwable unused3) {
        }
    }

    public static int M(int i, int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int i2 = i + 1;
        while (true) {
            i--;
            if (i < 0) {
                return i2;
            }
            i2 = (i2 * TsExtractor.TS_STREAM_TYPE_AIT) ^ iArr[i];
        }
    }

    public static int N(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * TsExtractor.TS_STREAM_TYPE_AIT) ^ bArr[length];
        }
    }

    public static int O(long[] jArr, int i) {
        if (jArr == null) {
            return 0;
        }
        int i2 = i + 1;
        while (true) {
            i--;
            if (i < 0) {
                return i2;
            }
            long j = jArr[i];
            i2 = (((i2 * TsExtractor.TS_STREAM_TYPE_AIT) ^ ((int) j)) * TsExtractor.TS_STREAM_TYPE_AIT) ^ ((int) (j >>> 32));
        }
    }

    public static String P(String str, String str2, String str3) {
        ByteArrayInputStream byteArrayInputStream;
        Mac mac = Mac.getInstance("HmacSHA256");
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        String obj = jx4.g0(str3).toString();
        if (jx4.D(obj, "BEGIN CERTIFICATE", false)) {
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            byte[] bytes = obj.getBytes(charset);
            bytes.getClass();
            byteArrayInputStream = new ByteArrayInputStream(bytes);
        } else {
            Pattern compile = Pattern.compile("\\s+");
            compile.getClass();
            String replaceAll = compile.matcher(obj).replaceAll("");
            replaceAll.getClass();
            StringBuilder sb = new StringBuilder("-----BEGIN CERTIFICATE-----\n");
            ArrayList C = jx4.C(replaceAll);
            int size = C.size();
            int i = 0;
            while (i < size) {
                Object obj2 = C.get(i);
                i++;
                sb.append((String) obj2);
                sb.append('\n');
            }
            sb.append("-----END CERTIFICATE-----");
            String sb2 = sb.toString();
            Charset charset2 = StandardCharsets.UTF_8;
            charset2.getClass();
            byte[] bytes2 = sb2.getBytes(charset2);
            bytes2.getClass();
            byteArrayInputStream = new ByteArrayInputStream(bytes2);
        }
        PublicKey publicKey = certificateFactory.generateCertificate(byteArrayInputStream).getPublicKey();
        KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
        keyAgreement.init(U(str2));
        keyAgreement.doPhase(publicKey, true);
        byte[] generateSecret = keyAgreement.generateSecret();
        byte[] bArr = new byte[32];
        int max = Math.max(0, generateSecret.length - 32);
        dq.R0(generateSecret, 32 - (generateSecret.length - max), max, bArr, generateSecret.length);
        byte[] bArr2 = new byte[0];
        Mac mac2 = Mac.getInstance("HmacSHA256");
        mac2.init(new SecretKeySpec(new byte[32], "HmacSHA256"));
        mac2.init(new SecretKeySpec(mac2.doFinal(bArr), "HmacSHA256"));
        byte[] bArr3 = new byte[32];
        byte[] bArr4 = new byte[0];
        int i2 = 1;
        int i3 = 0;
        while (i3 < 32) {
            mac2.update(bArr4);
            mac2.update(bArr2);
            mac2.update((byte) i2);
            bArr4 = mac2.doFinal();
            bArr4.getClass();
            int min = Math.min(bArr4.length, 32 - i3);
            dq.R0(bArr4, i3, 0, bArr3, min);
            i3 += min;
            i2++;
        }
        mac.init(new SecretKeySpec(bArr3, "HmacSHA256"));
        Base64.Encoder encoder = Base64.getEncoder();
        Charset charset3 = StandardCharsets.UTF_8;
        charset3.getClass();
        byte[] bytes3 = str.getBytes(charset3);
        bytes3.getClass();
        String encodeToString = encoder.encodeToString(mac.doFinal(bytes3));
        encodeToString.getClass();
        return encodeToString;
    }

    public static final boolean Q(long j) {
        return (j & 2) != 0;
    }

    public static final boolean R(long j) {
        return (j & 1) != 0;
    }

    public static boolean S(ql qlVar, DragEvent dragEvent) {
        Activity activity;
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && dr5.d(qlVar) != null) {
            Context context = qlVar.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + qlVar);
                return false;
            }
            if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                g7.o(dragEvent, qlVar, activity);
                return true;
            }
        }
        return false;
    }

    public static boolean T(ql qlVar, int i) {
        hi0 hi0Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || dr5.d(qlVar) == null || !(i == 16908322 || i == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) qlVar.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                hi0Var = new gi0(primaryClip, 1);
            } else {
                ii0 ii0Var = new ii0();
                ii0Var.b = primaryClip;
                ii0Var.c = (byte) 1;
                hi0Var = ii0Var;
            }
            hi0Var.c(i != 16908322 ? 1 : 0);
            dr5.f(qlVar, hi0Var.build());
        }
        return true;
    }

    public static PrivateKey U(String str) {
        PrivateKey c2;
        String obj = jx4.g0(str).toString();
        if (!qx4.y(obj, "-----BEGIN", false)) {
            Pattern compile = Pattern.compile("\\s+");
            compile.getClass();
            String replaceAll = compile.matcher(obj).replaceAll("");
            replaceAll.getClass();
            PrivateKey generatePrivate = KeyFactory.getInstance("EC").generatePrivate(new PKCS8EncodedKeySpec(Base64.getDecoder().decode(replaceAll)));
            generatePrivate.getClass();
            return generatePrivate;
        }
        wh3 wh3Var = new wh3(new StringReader(obj));
        try {
            Object readObject = wh3Var.readObject();
            u52 u52Var = new u52();
            if (readObject instanceof th3) {
                c2 = u52Var.b((th3) readObject).getPrivate();
                c2.getClass();
            } else {
                if (!(readObject instanceof qt3)) {
                    throw new IllegalArgumentException("unsupported private key format");
                }
                c2 = u52Var.c((qt3) readObject);
                c2.getClass();
            }
            wh3Var.close();
            return c2;
        } finally {
        }
    }

    public static final Object V(a74 a74Var, boolean z, boolean z2, tm1 tm1Var) {
        a74Var.getClass();
        a74Var.a();
        if (!a74Var.j() || a74Var.k() || a74Var.h.get() == null) {
            return jl2.h0(new s30(null, tm1Var, a74Var, z, z2));
        }
        zy.i("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        if (r10 == r6) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object W(defpackage.a74 r7, boolean r8, defpackage.ny5 r9, defpackage.gj0 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.an0
            if (r0 == 0) goto L13
            r0 = r10
            an0 r0 = (defpackage.an0) r0
            int r1 = r0.M
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.M = r1
            goto L18
        L13:
            an0 r0 = new an0
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.L
            int r1 = r0.M
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            el0 r6 = defpackage.el0.I
            if (r1 == 0) goto L42
            if (r1 == r5) goto L3e
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2e
            defpackage.mu0.V(r10)
            return r10
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r7)
            return r2
        L34:
            boolean r8 = r0.K
            ny5 r9 = r0.J
            a74 r7 = r0.I
            defpackage.mu0.V(r10)
            goto L75
        L3e:
            defpackage.mu0.V(r10)
            return r10
        L42:
            defpackage.mu0.V(r10)
            boolean r10 = r7.j()
            if (r10 == 0) goto L66
            boolean r10 = r7.m()
            if (r10 == 0) goto L66
            boolean r10 = r7.k()
            if (r10 == 0) goto L66
            bn0 r10 = new bn0
            r10.<init>(r2, r9, r7, r8)
            r0.M = r5
            java.lang.Object r7 = r7.q(r8, r10, r0)
            if (r7 != r6) goto L65
            goto L88
        L65:
            return r7
        L66:
            r0.I = r7
            r0.J = r9
            r0.K = r8
            r0.M = r4
            tk0 r10 = D(r7, r0)
            if (r10 != r6) goto L75
            goto L88
        L75:
            tk0 r10 = (defpackage.tk0) r10
            a40 r1 = new a40
            r1.<init>(r2, r9, r7, r8)
            r0.I = r2
            r0.J = r2
            r0.M = r3
            java.lang.Object r7 = defpackage.p70.D0(r10, r1, r0)
            if (r7 != r6) goto L89
        L88:
            return r6
        L89:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g4.W(a74, boolean, ny5, gj0):java.lang.Object");
    }

    public static final qf X(rm1 rm1Var, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        View view = (View) go1Var.k(rb.f);
        boolean g2 = go1Var.g(view);
        Object Q = go1Var.Q();
        jp jpVar = de0.a;
        if (g2 || Q == jpVar) {
            Q = new qf(view, null, rm1Var);
            go1Var.o0(Q);
        }
        qf qfVar = (qf) Q;
        boolean i2 = go1Var.i(qfVar);
        Object Q2 = go1Var.Q();
        if (i2 || Q2 == jpVar) {
            Q2 = new hf(qfVar, (byte) 3);
            go1Var.o0(Q2);
        }
        mw2.e(qfVar, (tm1) Q2, go1Var);
        return qfVar;
    }

    public static final void a(final lq1 lq1Var, t8 t8Var, final tc0 tc0Var, fe0 fe0Var, final int i, final int i2) {
        int i3;
        final t8 t8Var2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(227045628);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i3 = (go1Var.g(lq1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= go1Var.g(t8Var) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= go1Var.i(tc0Var) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && go1Var.F()) {
            go1Var.W();
            t8Var2 = t8Var;
        } else {
            t8 t8Var3 = i4 != 0 ? t8.c : t8Var;
            go1Var.e0(1849434622);
            Object Q = go1Var.Q();
            if (Q == de0.a) {
                Q = nx.I;
                go1Var.o0(Q);
            }
            go1Var.q(false);
            rm1 rm1Var = (rm1) ((v72) Q);
            go1Var.e0(-683746039);
            int i5 = (((i3 & 896) | 6) & 896) | 6;
            go1Var.e0(-548224868);
            if (!(go1Var.a instanceof zo)) {
                qb.S();
                throw null;
            }
            go1Var.b0();
            if (go1Var.S) {
                go1Var.l(rm1Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, new bd0((byte) 1), lq1Var);
            qi4.k(go1Var, new bd0(b2), t8Var3);
            tc0Var.invoke(go1Var, Integer.valueOf((i5 >> 6) & 14));
            go1Var.q(true);
            go1Var.q(false);
            go1Var.q(false);
            t8Var2 = t8Var3;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: mx
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    g4.a(lq1.this, t8Var2, tc0Var, (fe0) obj, mu0.X(i | 1), i2);
                    return wd5.a;
                }
            };
        }
    }

    public static final qu2 a0(o7 o7Var, tm1 tm1Var, fe0 fe0Var, int i) {
        Object obj;
        ad4.x(o7Var, fe0Var);
        Object x = ad4.x(tm1Var, fe0Var);
        byte b2 = 0;
        Object[] objArr = new Object[0];
        go1 go1Var = (go1) fe0Var;
        Object Q = go1Var.Q();
        Object obj2 = de0.a;
        if (Q == obj2) {
            Q = new u7(b2);
            go1Var.o0(Q);
        }
        Object obj3 = (String) ut0.N(objArr, (rm1) Q, go1Var);
        y7 y7Var = (y7) go1Var.k(kq2.a);
        if (y7Var == null) {
            go1Var.d0(1213380307);
            Object obj4 = (Context) go1Var.k(rb.b);
            while (true) {
                if (!(obj4 instanceof ContextWrapper)) {
                    obj4 = null;
                    break;
                }
                if (obj4 instanceof y7) {
                    break;
                }
                obj4 = ((ContextWrapper) obj4).getBaseContext();
            }
            y7Var = (y7) obj4;
        } else {
            go1Var.d0(1213379439);
        }
        go1Var.q(false);
        if (y7Var == null) {
            zy.i("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            return null;
        }
        Object e2 = y7Var.e();
        Object Q2 = go1Var.Q();
        if (Q2 == obj2) {
            Q2 = new p7();
            go1Var.o0(Q2);
        }
        p7 p7Var = (p7) Q2;
        Object Q3 = go1Var.Q();
        if (Q3 == obj2) {
            Q3 = new qu2(p7Var);
            go1Var.o0(Q3);
        }
        qu2 qu2Var = (qu2) Q3;
        boolean i2 = go1Var.i(p7Var) | go1Var.i(e2) | go1Var.g(obj3) | go1Var.i(o7Var) | go1Var.g(x);
        Object Q4 = go1Var.Q();
        if (i2 || Q4 == obj2) {
            obj = o7Var;
            Q4 = new v7(p7Var, e2, obj3, obj, x, (byte) 0);
            go1Var.o0(Q4);
        } else {
            obj = o7Var;
        }
        tm1 tm1Var2 = (tm1) Q4;
        boolean g2 = go1Var.g(e2) | go1Var.g(obj3) | go1Var.g(obj);
        Object Q5 = go1Var.Q();
        if (g2 || Q5 == obj2) {
            Q5 = new yx0(tm1Var2);
            go1Var.o0(Q5);
        }
        return qu2Var;
    }

    public static final void b(lq1 lq1Var, int i, int i2, final in1 in1Var, fe0 fe0Var, final int i3, final int i4) {
        int i5;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-474572032);
        int i6 = i4 & 1;
        if (i6 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (go1Var.g(lq1Var) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i7 = i4 & 2;
        if (i7 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= go1Var.e(i) ? 32 : 16;
        }
        int i8 = i4 & 4;
        if (i8 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= go1Var.e(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= go1Var.i(in1Var) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && go1Var.F()) {
            go1Var.W();
        } else {
            if (i6 != 0) {
                lq1Var = jq1.a;
            }
            if (i7 != 0) {
                i = 0;
            }
            if (i8 != 0) {
                i2 = 0;
            }
            go1Var.e0(1849434622);
            Object Q = go1Var.Q();
            if (Q == de0.a) {
                Q = y90.I;
                go1Var.o0(Q);
            }
            go1Var.q(false);
            rm1 rm1Var = (rm1) ((v72) Q);
            go1Var.e0(-683746039);
            go1Var.e0(-548224868);
            if (!(go1Var.a instanceof zo)) {
                qb.S();
                throw null;
            }
            go1Var.b0();
            if (go1Var.S) {
                go1Var.l(rm1Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, new bd0((byte) 12), lq1Var);
            qi4.k(go1Var, new bd0((byte) 13), new r8(i2));
            qi4.k(go1Var, new bd0((byte) 14), new s8(i));
            in1Var.invoke(da0.a, go1Var, Integer.valueOf(((i5 >> 6) & 112) | 6));
            go1Var.q(true);
            go1Var.q(false);
            go1Var.q(false);
        }
        final lq1 lq1Var2 = lq1Var;
        final int i9 = i;
        final int i10 = i2;
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: x90
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X = mu0.X(i3 | 1);
                    lq1 lq1Var3 = lq1.this;
                    boolean z = i9;
                    byte b2 = i10;
                    in1 in1Var2 = in1Var;
                    g4.b(lq1Var3, z ? 1 : 0, b2, in1Var2, (fe0) obj, X, i4);
                    return wd5.a;
                }
            };
        }
    }

    public static final Object b0(tk0 tk0Var, hn1 hn1Var) {
        eb1 eb1Var;
        tk0 G;
        long d0;
        sk0 sk0Var = q8.i0;
        vk0 vk0Var = (vk0) tk0Var.get(sk0Var);
        l91 l91Var = l91.I;
        if (vk0Var == null) {
            eb1Var = x65.a();
            G = qb.G(l91Var, tk0Var.plus(eb1Var), true);
            os0 os0Var = sx0.a;
            if (G != os0Var && G.get(sk0Var) == null) {
                G = G.plus(os0Var);
            }
        } else {
            eb1Var = (eb1) x65.a.get();
            G = qb.G(l91Var, tk0Var, true);
            os0 os0Var2 = sx0.a;
            if (G != os0Var2 && G.get(sk0Var) == null) {
                G = G.plus(os0Var2);
            }
        }
        mw mwVar = new mw(G, Thread.currentThread(), eb1Var);
        mwVar.h0(gl0.I, mwVar, hn1Var);
        eb1 eb1Var2 = mwVar.N;
        if (eb1Var2 != null) {
            int i = eb1.L;
            eb1Var2.c0(false);
        }
        while (true) {
            if (eb1Var2 != null) {
                try {
                    d0 = eb1Var2.d0();
                } catch (Throwable th) {
                    if (eb1Var2 != null) {
                        int i2 = eb1.L;
                        eb1Var2.a0(false);
                    }
                    throw th;
                }
            } else {
                d0 = Long.MAX_VALUE;
            }
            if (mwVar.N()) {
                break;
            }
            LockSupport.parkNanos(mwVar, d0);
            if (Thread.interrupted()) {
                mwVar.q(new InterruptedException());
            }
        }
        if (eb1Var2 != null) {
            int i3 = eb1.L;
            eb1Var2.a0(false);
        }
        Object B0 = p70.B0(mwVar.H());
        ub0 ub0Var = B0 instanceof ub0 ? (ub0) B0 : null;
        if (ub0Var == null) {
            return B0;
        }
        throw ub0Var.a;
    }

    public static qb0 c() {
        qb0 qb0Var = new qb0(true);
        qb0Var.K(null);
        return qb0Var;
    }

    public static String c0(String str) {
        Object g54Var;
        Object g54Var2;
        if (!jx4.L(str)) {
            try {
                byte[] decode = Base64.getDecoder().decode(qx4.x(qx4.x(qx4.x(str, "%2F", "/", true), "%2B", "+", true), "%3D", "=", true));
                decode.getClass();
                Charset charset = StandardCharsets.UTF_8;
                charset.getClass();
                g54Var = new String(decode, charset);
            } catch (Throwable th) {
                g54Var = new g54(th);
            }
            if (g54Var instanceof g54) {
                g54Var = null;
            }
            String str2 = (String) g54Var;
            if (str2 != null) {
                try {
                    g54Var2 = new JSONObject(str2).optString("bd-ticket-guard-tree-public-key");
                } catch (Throwable th2) {
                    g54Var2 = new g54(th2);
                }
                return (String) (g54Var2 instanceof g54 ? "" : g54Var2);
            }
        }
        return "";
    }

    public static final yb d(String str) {
        Set singleton = Collections.singleton(str);
        singleton.getClass();
        return new yb(singleton);
    }

    public static final CharSequence d0(CharSequence charSequence) {
        return charSequence.length() <= 5000 ? charSequence : (Character.isHighSurrogate(charSequence.charAt(4999)) && Character.isLowSurrogate(charSequence.charAt(5000))) ? jx4.e0(charSequence, 4999) : jx4.e0(charSequence, 5000);
    }

    public static final zd e() {
        return new zd(new PathMeasure());
    }

    public static final void f(l13 l13Var, tc0 tc0Var, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(2064964257);
        if ((i & 6) == 0) {
            i2 = (go1Var.g(l13Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.i(tc0Var) ? 32 : 16;
        }
        byte b2 = 0;
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            g(l13Var, tc0Var, go1Var, ((i2 << 3) & 896) | (i2 & 14) | 48);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new rf(l13Var, tc0Var, i, b2);
        }
    }

    public static final void g(l13 l13Var, tc0 tc0Var, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(771959668);
        if ((i & 6) == 0) {
            i2 = (go1Var.g(l13Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.i(null) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.i(tc0Var) ? 256 : 128;
        }
        byte b2 = 0;
        byte b3 = 1;
        if (go1Var.T(i2 & 1, (i2 & 147) != 146)) {
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                jk3 jk3Var = new jk3(null, q8.v0);
                go1Var.o0(jk3Var);
                Q = jk3Var;
            }
            t43 t43Var = (t43) Q;
            Object Q2 = go1Var.Q();
            if (Q2 == jpVar) {
                Q2 = new sf(t43Var, b2);
                go1Var.o0(Q2);
            }
            mw2.b(g35.b.a(X((rm1) Q2, go1Var, 0)), p70.u0(-291176396, new tf(l13Var, t43Var, tc0Var, b2), go1Var), go1Var, 56);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new rf(l13Var, tc0Var, i, b3);
        }
    }

    public static final Typeface h(v44 v44Var, Context context) {
        int i = v44Var.a;
        ThreadLocal threadLocal = d54.a;
        Typeface b2 = context.isRestricted() ? null : d54.b(context, i, new TypedValue(), 0, null, false);
        b2.getClass();
        return b2;
    }

    public static boolean i(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i == i3 - i2) {
            for (int i4 = 0; i4 < i; i4++) {
                if (bArr[i4] == bArr2[i2 + i4]) {
                }
            }
            return true;
        }
        return false;
    }

    public static int j(int i, int i2, int i3) {
        int i4 = i2 & ((i >>> i3) ^ i);
        return i ^ (i4 ^ (i4 << i3));
    }

    public static long k(int i, long j, long j2) {
        long j3 = j2 & ((j >>> i) ^ j);
        return j ^ (j3 ^ (j3 << i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r2 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String l(java.lang.String r6, defpackage.d32 r7) {
        /*
            r6.getClass()
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            java.lang.String r2 = r7.b
            java.lang.String r3 = "&path="
            java.lang.String r4 = "&timestamp="
            java.lang.String r5 = "ticket="
            java.lang.StringBuilder r6 = defpackage.r7.F(r5, r2, r3, r6, r4)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r2 = r7.e
            java.lang.String r3 = r7.d
            boolean r4 = defpackage.jx4.L(r2)
            if (r4 != 0) goto L3e
            java.lang.String r2 = P(r6, r3, r2)     // Catch: java.lang.Throwable -> L2c
            goto L33
        L2c:
            r2 = move-exception
            g54 r4 = new g54
            r4.<init>(r2)
            r2 = r4
        L33:
            boolean r4 = r2 instanceof defpackage.g54
            if (r4 == 0) goto L39
            r2 = 0
        L39:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L3e
            goto L6c
        L3e:
            r3.getClass()
            java.lang.String r2 = "SHA256withECDSA"
            java.security.Signature r2 = java.security.Signature.getInstance(r2)
            java.security.PrivateKey r3 = U(r3)
            r2.initSign(r3)
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            r3.getClass()
            byte[] r6 = r6.getBytes(r3)
            r6.getClass()
            r2.update(r6)
            j$.util.Base64$Encoder r6 = j$.util.Base64.getEncoder()
            byte[] r2 = r2.sign()
            java.lang.String r2 = r6.encodeToString(r2)
            r2.getClass()
        L6c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r3 = "{\"ts_sign\":\""
            r6.<init>(r3)
            java.lang.String r7 = r7.c
            java.lang.String r7 = z(r7)
            r6.append(r7)
            java.lang.String r7 = "\",\"req_content\":\"ticket,path,timestamp\",\"req_sign\":\""
            r6.append(r7)
            java.lang.String r7 = z(r2)
            r6.append(r7)
            java.lang.String r7 = "\",\"timestamp\":"
            r6.append(r7)
            java.lang.String r7 = ",\"t_trust\":1}"
            java.lang.String r6 = defpackage.r7.D(r6, r0, r7)
            j$.util.Base64$Encoder r7 = j$.util.Base64.getEncoder()
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            r0.getClass()
            byte[] r6 = r6.getBytes(r0)
            r6.getClass()
            java.lang.String r6 = r7.encodeToString(r6)
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g4.l(java.lang.String, d32):java.lang.String");
    }

    public static final void m(k20 k20Var, Throwable th) {
        if (th != null) {
            r0 = th instanceof CancellationException ? (CancellationException) th : null;
            if (r0 == null) {
                r0 = e41.a("Channel was consumed, consumer had failed", th);
            }
        }
        k20Var.e(r0);
    }

    public static void q(byte[] bArr) {
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    public static final lq1 r(lq1 lq1Var, d6 d6Var) {
        return lq1Var.a(new z6(d6Var));
    }

    public static byte[] s(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static final int t(long j, long j2) {
        boolean R = R(j);
        if (R != R(j2)) {
            return R ? -1 : 1;
        }
        return (Math.min(F(j), F(j2)) >= 0.0f && Q(j) != Q(j2)) ? Q(j) ? -1 : 1 : (int) Math.signum(F(j) - F(j2));
    }

    public static Object[] u(Object[] objArr, Object[]... objArr2) {
        int length = objArr.length;
        for (Object[] objArr3 : objArr2) {
            length += objArr3.length;
        }
        Object[] copyOf = Arrays.copyOf(objArr, length);
        int length2 = objArr.length;
        for (Object[] objArr4 : objArr2) {
            System.arraycopy(objArr4, 0, copyOf, length2, objArr4.length);
            length2 += objArr4.length;
        }
        return copyOf;
    }

    public static byte[] v(byte[][] bArr) {
        int i = 0;
        for (int i2 = 0; i2 != bArr.length; i2++) {
            i += bArr[i2].length;
        }
        byte[] bArr2 = new byte[i];
        int i3 = 0;
        for (int i4 = 0; i4 != bArr.length; i4++) {
            byte[] bArr3 = bArr[i4];
            System.arraycopy(bArr3, 0, bArr2, i3, bArr3.length);
            i3 += bArr[i4].length;
        }
        return bArr2;
    }

    public static boolean w(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null) {
            if (bArr == bArr2) {
                return true;
            }
            int length = bArr.length < bArr2.length ? bArr.length : bArr2.length;
            int length2 = bArr.length ^ bArr2.length;
            for (int i = 0; i != length; i++) {
                length2 |= bArr[i] ^ bArr2[i];
            }
            while (length < bArr2.length) {
                byte b2 = bArr2[length];
                length2 |= b2 ^ (~b2);
                length++;
            }
            if (length2 == 0) {
                return true;
            }
        }
        return false;
    }

    public static byte[] x(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        if (i3 >= 0) {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i, bArr2, 0, Math.min(bArr.length - i, i3));
            return bArr2;
        }
        throw new IllegalArgumentException(i + " > " + i2);
    }

    public static void y(Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            io.l(canvas, z);
            return;
        }
        if (!d) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            d = true;
        }
        if (z) {
            try {
                Method method4 = b;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = c) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static String z(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '\t') {
                sb.append("\\t");
            } else if (charAt == '\n') {
                sb.append("\\n");
            } else if (charAt == '\r') {
                sb.append("\\r");
            } else if (charAt == '\"') {
                sb.append("\\\"");
            } else if (charAt != '\\') {
                sb.append(charAt);
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public void Y(m4 m4Var, m4 m4Var2) {
        m4Var.b = m4Var2;
    }

    public void Z(m4 m4Var, Thread thread) {
        m4Var.a = thread;
    }

    public boolean n(n4 n4Var, j4 j4Var, j4 j4Var2) {
        synchronized (n4Var) {
            try {
                if (n4Var.J != j4Var) {
                    return false;
                }
                n4Var.J = j4Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean o(n4 n4Var, Object obj, Object obj2) {
        synchronized (n4Var) {
            try {
                if (n4Var.I != obj) {
                    return false;
                }
                n4Var.I = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean p(n4 n4Var, m4 m4Var, m4 m4Var2) {
        synchronized (n4Var) {
            try {
                if (n4Var.K != m4Var) {
                    return false;
                }
                n4Var.K = m4Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.StrictMode;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class c5 {
    public static hx1 a;
    public static hx1 b;
    public static hx1 c;
    public static hx1 d;
    public static hx1 e;
    public static hx1 f;

    public static int A(int i, byte[] bArr, int i2, op opVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            opVar.b = i3 | (b2 << 7);
            return i4;
        }
        int i5 = i3 | ((b2 & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            opVar.b = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            opVar.b = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            opVar.b = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                opVar.b = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int B(byte[] bArr, int i, op opVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return A(b2, bArr, i2, opVar);
        }
        opVar.b = b2;
        return i2;
    }

    public static int C(int i, byte[] bArr, int i2, int i3, n32 n32Var, op opVar) {
        h22 h22Var = (h22) n32Var;
        int B = B(bArr, i2, opVar);
        h22Var.d(opVar.b);
        while (B < i3) {
            int B2 = B(bArr, B, opVar);
            if (i != opVar.b) {
                break;
            }
            B = B(bArr, B2, opVar);
            h22Var.d(opVar.b);
        }
        return B;
    }

    public static int D(byte[] bArr, int i, op opVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            opVar.a = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        opVar.a = j2;
        return i3;
    }

    public static final void E(oh2 oh2Var) {
        m55 m55Var = oh2Var.e;
        if (m55Var != null) {
            oh2Var.v.invoke(d55.a((d55) oh2Var.d.J, null, 0L, 3));
            j55 j55Var = m55Var.a;
            AtomicReference atomicReference = j55Var.b;
            while (true) {
                if (atomicReference.compareAndSet(m55Var, null)) {
                    j55Var.a.d();
                    break;
                } else if (atomicReference.get() != m55Var) {
                    break;
                }
            }
        }
        oh2Var.e = null;
    }

    public static final boolean F(int i, int i2) {
        return i == i2;
    }

    public static dp0 G(byte[] bArr) {
        bArr.getClass();
        if (bArr.length > 10240) {
            zy.i("Data cannot occupy more than 10240 bytes when serialized");
            return null;
        }
        if (bArr.length == 0) {
            return dp0.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            int i = 0;
            boolean z = bArr2[0] == -84 && bArr2[1] == -19;
            byteArrayInputStream.reset();
            if (z) {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int readInt = objectInputStream.readInt();
                    while (i < readInt) {
                        linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        i++;
                    }
                    objectInputStream.close();
                } finally {
                }
            } else {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    short readShort = dataInputStream.readShort();
                    if (readShort == -21521) {
                        short readShort2 = dataInputStream.readShort();
                        if (readShort2 != 1) {
                            zy.e(hf1.u(readShort2, "Unsupported version number: "));
                        }
                    } else {
                        zy.e(hf1.u(readShort, "Magic number doesn't match: "));
                    }
                    int readInt2 = dataInputStream.readInt();
                    while (i < readInt2) {
                        linkedHashMap.put(dataInputStream.readUTF(), H(dataInputStream, dataInputStream.readByte()));
                        i++;
                    }
                    dataInputStream.close();
                } finally {
                }
            }
        } catch (IOException e2) {
            fr2.e().d(np0.a, "Error in Data#fromByteArray: ", e2);
        } catch (ClassNotFoundException e3) {
            fr2.e().d(np0.a, "Error in Data#fromByteArray: ", e3);
        }
        return new dp0(linkedHashMap);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    public static final Serializable H(DataInputStream dataInputStream, byte b2) {
        if (b2 == 0) {
            return null;
        }
        if (b2 == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b2 == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b2 == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b2 == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b2 == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b2 == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b2 == 7) {
            return dataInputStream.readUTF();
        }
        int i = 0;
        if (b2 == 8) {
            int readInt = dataInputStream.readInt();
            ?? r0 = new Boolean[readInt];
            while (i < readInt) {
                r0[i] = Boolean.valueOf(dataInputStream.readBoolean());
                i++;
            }
            return r0;
        }
        if (b2 == 9) {
            int readInt2 = dataInputStream.readInt();
            ?? r02 = new Byte[readInt2];
            while (i < readInt2) {
                r02[i] = Byte.valueOf(dataInputStream.readByte());
                i++;
            }
            return r02;
        }
        if (b2 == 10) {
            int readInt3 = dataInputStream.readInt();
            ?? r03 = new Integer[readInt3];
            while (i < readInt3) {
                r03[i] = Integer.valueOf(dataInputStream.readInt());
                i++;
            }
            return r03;
        }
        if (b2 == 11) {
            int readInt4 = dataInputStream.readInt();
            ?? r04 = new Long[readInt4];
            while (i < readInt4) {
                r04[i] = Long.valueOf(dataInputStream.readLong());
                i++;
            }
            return r04;
        }
        if (b2 == 12) {
            int readInt5 = dataInputStream.readInt();
            ?? r05 = new Float[readInt5];
            while (i < readInt5) {
                r05[i] = Float.valueOf(dataInputStream.readFloat());
                i++;
            }
            return r05;
        }
        if (b2 == 13) {
            int readInt6 = dataInputStream.readInt();
            ?? r06 = new Double[readInt6];
            while (i < readInt6) {
                r06[i] = Double.valueOf(dataInputStream.readDouble());
                i++;
            }
            return r06;
        }
        if (b2 != 14) {
            zy.i(hf1.u(b2, "Unsupported type "));
            return null;
        }
        int readInt7 = dataInputStream.readInt();
        ?? r1 = new String[readInt7];
        while (i < readInt7) {
            String readUTF = dataInputStream.readUTF();
            if (j42.c(readUTF, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                readUTF = null;
            }
            r1[i] = readUTF;
            i++;
        }
        return r1;
    }

    public static final hx1 I() {
        hx1 hx1Var = a;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("AutoMirrored.Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        epVar.z(20.0f, 11.0f);
        epVar.u(7.83f);
        epVar.y(5.59f, -5.59f);
        epVar.x(12.0f, 4.0f);
        epVar.y(-8.0f, 8.0f);
        epVar.y(8.0f, 8.0f);
        epVar.y(1.41f, -1.41f);
        epVar.x(7.83f, 13.0f);
        epVar.u(20.0f);
        epVar.M(-2.0f);
        epVar.p();
        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
        hx1 b2 = gx1Var.b();
        a = b2;
        return b2;
    }

    public static final hx1 J() {
        hx1 hx1Var = e;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep p = hf1.p(19.0f, 6.41f, 17.59f, 5.0f);
        p.x(12.0f, 10.59f);
        p.x(6.41f, 5.0f);
        p.x(5.0f, 6.41f);
        p.x(10.59f, 12.0f);
        p.x(5.0f, 17.59f);
        p.x(6.41f, 19.0f);
        p.x(12.0f, 13.41f);
        p.x(17.59f, 19.0f);
        p.x(19.0f, 17.59f);
        p.x(13.41f, 12.0f);
        p.p();
        gx1.a(gx1Var, (ArrayList) p.J, rt4Var);
        hx1 b2 = gx1Var.b();
        e = b2;
        return b2;
    }

    public static long K(fe0 fe0Var) {
        return ((fw2) ((go1) fe0Var).k(lw2.b)).a.G;
    }

    public static final hx1 L() {
        hx1 hx1Var = f;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.Devices", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        epVar.z(4.0f, 6.0f);
        epVar.v(18.0f);
        epVar.x(22.0f, 4.0f);
        epVar.x(4.0f, 4.0f);
        epVar.r(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        epVar.M(11.0f);
        epVar.x(0.0f, 17.0f);
        epVar.M(3.0f);
        epVar.v(14.0f);
        epVar.M(-3.0f);
        epVar.x(4.0f, 17.0f);
        epVar.x(4.0f, 6.0f);
        epVar.p();
        epVar.z(23.0f, 8.0f);
        epVar.v(-6.0f);
        epVar.r(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        epVar.M(10.0f);
        epVar.r(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        epVar.v(6.0f);
        epVar.r(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        epVar.x(24.0f, 9.0f);
        epVar.r(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        epVar.p();
        epVar.z(22.0f, 17.0f);
        epVar.v(-4.0f);
        epVar.M(-7.0f);
        epVar.v(4.0f);
        epVar.M(7.0f);
        epVar.p();
        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
        hx1 b2 = gx1Var.b();
        f = b2;
        return b2;
    }

    public static long M(fe0 fe0Var) {
        return ((fw2) ((go1) fe0Var).k(lw2.b)).a.H;
    }

    public static d5 N(Locale locale) {
        d5 d5Var = d5.e;
        if (d5Var != null) {
            return d5Var;
        }
        d5 d5Var2 = new d5((byte) 0);
        d5Var2.d = BreakIterator.getCharacterInstance(locale);
        d5.e = d5Var2;
        return d5Var2;
    }

    public static d5 O(Locale locale) {
        d5 d5Var = d5.f;
        if (d5Var != null) {
            return d5Var;
        }
        d5 d5Var2 = new d5((byte) 1);
        d5Var2.d = BreakIterator.getWordInstance(locale);
        d5.f = d5Var2;
        return d5Var2;
    }

    public static final MotionEvent P(pz1 pz1Var) {
        pz1Var.getClass();
        return ((fd) pz1Var).c;
    }

    public static k74 Q() {
        return jo.f;
    }

    public static long R(double d2) {
        sp0.p(T(d2), "not a normal value");
        int exponent = Math.getExponent(d2);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d2) & 4503599627370495L;
        return exponent == -1023 ? doubleToRawLongBits << 1 : doubleToRawLongBits | 4503599627370496L;
    }

    public static final int S(MotionEvent motionEvent) {
        if (!motionEvent.isFromSource(2097152)) {
            s83.t("MotionEvent must be a touch navigation source");
            return 0;
        }
        InputDevice device = motionEvent.getDevice();
        if (device != null) {
            InputDevice.MotionRange motionRange = device.getMotionRange(0);
            InputDevice.MotionRange motionRange2 = device.getMotionRange(1);
            if (motionRange == null || motionRange2 != null) {
                if (motionRange2 != null && motionRange == null) {
                    return 2;
                }
                if (motionRange != null && motionRange2 != null) {
                    float range = motionRange.getRange();
                    float range2 = motionRange2.getRange();
                    if (range <= range2 || (range2 != 0.0f && range / range2 < 5.0f)) {
                        if (range2 > range && (range == 0.0f || range2 / range >= 5.0f)) {
                            return 2;
                        }
                    }
                }
            }
            return 1;
        }
        return 0;
    }

    public static boolean T(double d2) {
        return Math.getExponent(d2) <= 1023;
    }

    public static final void U(Activity activity, Intent intent) {
        Parcelable parcelableExtra = intent.getParcelableExtra("ACTION_INTENT");
        if (parcelableExtra == null) {
            s83.t("List adapter activity trampoline invoked without specifying target intent.");
            return;
        }
        Intent intent2 = (Intent) parcelableExtra;
        if (intent.hasExtra("android.widget.extra.CHECKED")) {
            intent2.putExtra("android.widget.extra.CHECKED", intent.getBooleanExtra("android.widget.extra.CHECKED", false));
        }
        String stringExtra = intent.getStringExtra("ACTION_TYPE");
        if (stringExtra == null) {
            s83.t("List adapter activity trampoline invoked without trampoline type");
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("ACTIVITY_OPTIONS");
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(Build.VERSION.SDK_INT >= 31 ? ub.r(new StrictMode.VmPolicy.Builder(vmPolicy)).build() : new StrictMode.VmPolicy.Builder().build());
        int ordinal = d7.valueOf(stringExtra).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    activity.startService(intent2);
                } else if (ordinal != 3) {
                    if (ordinal != 4) {
                        s83.v();
                        return;
                    }
                } else if (Build.VERSION.SDK_INT >= 26) {
                    x9.R(activity, intent2);
                } else {
                    activity.startService(intent2);
                }
            }
            activity.sendBroadcast(intent2);
        } else {
            activity.startActivity(intent2, bundleExtra);
        }
        StrictMode.setVmPolicy(vmPolicy);
        activity.finish();
    }

    public static final ArrayList V(List list, List list2, float f2) {
        int max = Math.max(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(max);
        for (int i = 0; i < max; i++) {
            arrayList.add(new x70(qb.T(((x70) list.get(Math.min(i, list.size() - 1))).a, ((x70) list2.get(Math.min(i, list2.size() - 1))).a, f2)));
        }
        return arrayList;
    }

    public static final ArrayList W(List list, List list2, float f2) {
        if (list2 == null || list == null) {
            return null;
        }
        int max = Math.max(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(max);
        for (int i = 0; i < max; i++) {
            arrayList.add(Float.valueOf(vt0.G(((Number) list.get(Math.min(i, list.size() - 1))).floatValue(), ((Number) list2.get(Math.min(i, list2.size() - 1))).floatValue(), f2)));
        }
        return arrayList;
    }

    public static final long X(long j, long j2, float f2) {
        return (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0 && (((9187343241974906880L ^ (j2 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) == 0) ? dq2.i0(j, j2, f2) : f2 < 0.5f ? j : j2;
    }

    public static int Y(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static int Z(Object obj, qa4 qa4Var, byte[] bArr, int i, int i2, int i3, op opVar) {
        dz2 dz2Var = (dz2) qa4Var;
        int i4 = opVar.c + 1;
        opVar.c = i4;
        if (i4 >= 100) {
            throw new x42("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int D = dz2Var.D(obj, bArr, i, i2, i3, opVar);
        opVar.c--;
        opVar.d = obj;
        return D;
    }

    public static final void a(p34 p34Var, rm1 rm1Var, fe0 fe0Var, int i) {
        rm1Var.getClass();
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1714709767);
        byte b2 = 4;
        int i2 = (go1Var.g(p34Var) ? 4 : 2) | i | (go1Var.i(rm1Var) ? 32 : 16);
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            boolean z = p34Var.d;
            boolean h = go1Var.h(z) | ((i2 & 112) == 32);
            Object Q = go1Var.Q();
            if (h || Q == de0.a) {
                Q = new tj(z, rm1Var, (byte) 0);
                go1Var.o0(Q);
            }
            boolean z2 = !z;
            d4.b((rm1) Q, new tw0(z2, z2, false), p70.u0(-1454458736, new uj(p34Var, z, rm1Var), go1Var), go1Var, RendererCapabilities.DECODER_SUPPORT_MASK);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new bj1(b2, i, p34Var, rm1Var);
        }
    }

    public static int a0(Object obj, qa4 qa4Var, byte[] bArr, int i, int i2, op opVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = A(i4, bArr, i3, opVar);
            i4 = opVar.b;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw x42.f();
        }
        int i6 = opVar.c + 1;
        opVar.c = i6;
        if (i6 >= 100) {
            throw new x42("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i7 = i5 + i4;
        qa4Var.g(obj, bArr, i5, i7, opVar);
        opVar.c--;
        opVar.d = obj;
        return i7;
    }

    public static final void b(String str, boolean z, fe0 fe0Var, int i) {
        byte b2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1724947947);
        int i2 = i | (go1Var.g(str) ? 4 : 2) | (go1Var.h(z) ? 32 : 16);
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            u74 a2 = t74.a(new kp(12.0f, true, new y9()), q8.T, go1Var, 54);
            long j = go1Var.T;
            int i3 = (int) (j ^ (j >>> 32));
            am3 m = go1Var.m();
            i13 i13Var = i13.a;
            l13 x0 = i42.x0(go1Var, i13Var);
            xd0.c.getClass();
            go1Var.h0();
            boolean z2 = go1Var.S;
            df0 df0Var = wa2.A0;
            if (z2) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            sg sgVar = q8.c0;
            qi4.k(go1Var, sgVar, a2);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var, sgVar2, m);
            Integer valueOf = Integer.valueOf(i3);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var, sgVar3, valueOf);
            qi4.j(go1Var);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var, sgVar4, x0);
            l13 k = nq4.k(i13Var, 44.0f);
            jp jpVar = dw2.a;
            l13 m2 = o7.m(k, rt0.L(jp.m(), go1Var));
            long j2 = k80Var.l;
            aj5 aj5Var = mw2.j;
            l13 p = mw2.p(m2, j2, aj5Var);
            uw2 c2 = px.c(q8.N, false);
            long j3 = go1Var.T;
            int i4 = (int) (j3 ^ (j3 >>> 32));
            am3 m3 = go1Var.m();
            l13 x02 = i42.x0(go1Var, p);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar, c2);
            qi4.k(go1Var, sgVar2, m3);
            r7.G(i4, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar4, x02);
            hx1 hx1Var = c;
            if (hx1Var == null) {
                gx1 gx1Var = new gx1("Filled.Campaign", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i5 = th5.a;
                rt4 rt4Var = new rt4(x70.b);
                ep epVar = new ep((byte) 13);
                epVar.z(18.0f, 11.0f);
                epVar.M(2.0f);
                epVar.v(4.0f);
                epVar.M(-2.0f);
                epVar.v(-4.0f);
                epVar.p();
                epVar.z(16.0f, 17.61f);
                epVar.r(0.96f, 0.71f, 2.21f, 1.65f, 3.2f, 2.39f);
                epVar.r(0.4f, -0.53f, 0.8f, -1.07f, 1.2f, -1.6f);
                epVar.r(-0.99f, -0.74f, -2.24f, -1.68f, -3.2f, -2.4f);
                epVar.r(-0.4f, 0.54f, -0.8f, 1.08f, -1.2f, 1.61f);
                epVar.p();
                epVar.z(20.4f, 5.6f);
                epVar.r(-0.4f, -0.53f, -0.8f, -1.07f, -1.2f, -1.6f);
                epVar.r(-0.99f, 0.74f, -2.24f, 1.68f, -3.2f, 2.4f);
                epVar.r(0.4f, 0.53f, 0.8f, 1.07f, 1.2f, 1.6f);
                epVar.r(0.96f, -0.72f, 2.21f, -1.65f, 3.2f, -2.4f);
                epVar.p();
                epVar.z(4.0f, 9.0f);
                epVar.r(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                epVar.M(2.0f);
                epVar.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                epVar.v(1.0f);
                epVar.M(4.0f);
                epVar.v(2.0f);
                epVar.M(-4.0f);
                epVar.v(1.0f);
                epVar.y(5.0f, 3.0f);
                epVar.x(13.0f, 6.0f);
                epVar.x(8.0f, 9.0f);
                epVar.x(4.0f, 9.0f);
                epVar.p();
                epVar.z(15.5f, 12.0f);
                epVar.r(0.0f, -1.33f, -0.58f, -2.53f, -1.5f, -3.35f);
                epVar.M(6.69f);
                epVar.r(0.92f, -0.81f, 1.5f, -2.01f, 1.5f, -3.34f);
                epVar.p();
                gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
                hx1Var = gx1Var.b();
                c = hx1Var;
            }
            ow1.a(hx1Var, null, nq4.k(i13Var, 24.0f), k80Var.m, go1Var, 432);
            go1Var.q(true);
            long j4 = k80Var.q;
            m65 m65Var = ((fw2) go1Var.k(i51Var)).b.g;
            qk1 qk1Var = qk1.P;
            r55.b(str, new sc2(1.0f, true), j4, 0L, qk1Var, 0L, null, 0L, 0, false, 0, 0, m65Var, go1Var, (i2 & 14) | 1572864, 0, 131000);
            go1Var = go1Var;
            if (z) {
                go1Var.d0(195671567);
                r55.b("必读", i42.D0(mw2.p(o7.m(i13Var, l74.a(8.0f)), k80Var.c, aj5Var), 9.0f, 4.0f), k80Var.d, 0L, qk1Var, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var)).b.n, go1Var, 1572870, 0, 131000);
                go1Var = go1Var;
                go1Var.q(false);
            } else {
                go1Var.d0(196092795);
                go1Var.q(false);
            }
            b2 = 1;
            go1Var.q(true);
        } else {
            b2 = 1;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new bc(str, z, i, b2);
        }
    }

    public static final void b0(oh2 oh2Var, d55 d55Var, td3 td3Var) {
        ns4 i = o63.i();
        tm1 e2 = i != null ? i.e() : null;
        ns4 j = o63.j(i);
        try {
            v55 d2 = oh2Var.d();
            if (d2 == null) {
                return;
            }
            m55 m55Var = oh2Var.e;
            if (m55Var == null) {
                return;
            }
            ca2 c2 = oh2Var.c();
            if (c2 == null) {
                return;
            }
            eg5.C(d55Var, oh2Var.a, d2.a, c2, m55Var, oh2Var.b(), td3Var);
        } finally {
            o63.o(i, j, e2);
        }
    }

    public static final void c(l13 l13Var, dn4 dn4Var, u10 u10Var, w10 w10Var, tc0 tc0Var, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1359693790);
        int i2 = i | (go1Var.g(dn4Var) ? 32 : 16) | (go1Var.g(u10Var) ? 256 : 128) | (go1Var.g(w10Var) ? 2048 : 1024) | 24576;
        byte b2 = 0;
        if (go1Var.T(i2 & 1, (74899 & i2) != 74898)) {
            go1Var.Y();
            if ((i & 1) != 0 && !go1Var.C()) {
                go1Var.W();
            }
            go1Var.r();
            long j = u10Var.a;
            long j2 = u10Var.b;
            float f2 = w10Var.a;
            go1Var.d0(-1763481333);
            go1Var.d0(167726411);
            Object Q = go1Var.Q();
            if (Q == de0.a) {
                Q = ad4.w(new r11(f2));
                go1Var.o0(Q);
            }
            go1Var.q(false);
            go1Var.q(false);
            f05.a(l13Var, dn4Var, j, j2, ((r11) ((t43) Q).getValue()).I, p70.u0(-97109725, new x10(tc0Var, b2), go1Var), go1Var, (i2 & 112) | 14155782, 16);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new in2(l13Var, dn4Var, u10Var, w10Var, tc0Var, i);
        }
    }

    public static final byte[] c0(GZIPInputStream gZIPInputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, gZIPInputStream.available()));
        r(gZIPInputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x04be, code lost:
    
        if (r15 > ((r0 != null ? r0.longValue() : 0) + 5000)) goto L241;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x061e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x06bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x078c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0818 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0850 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0895 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x08bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x08f2  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0909 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0985  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x09aa  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x044f  */
    /* JADX WARN: Type inference failed for: r0v79, types: [l13] */
    /* JADX WARN: Type inference failed for: r2v53, types: [l13] */
    /* JADX WARN: Type inference failed for: r33v11, types: [l13] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.d55 r63, final defpackage.tm1 r64, final defpackage.l13 r65, final defpackage.m65 r66, final defpackage.hn3 r67, final defpackage.tm1 r68, final defpackage.t33 r69, final defpackage.rt4 r70, final boolean r71, final int r72, final int r73, final defpackage.mx1 r74, final defpackage.x82 r75, final boolean r76, final defpackage.tc0 r77, defpackage.fe0 r78, final int r79, final int r80) {
        /*
            Method dump skipped, instructions count: 2617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c5.d(d55, tm1, l13, m65, hn3, tm1, t33, rt4, boolean, int, int, mx1, x82, boolean, tc0, fe0, int, int):void");
    }

    public static final Object d0(Object obj, fe0 fe0Var) {
        go1 go1Var = (go1) fe0Var;
        Object Q = go1Var.Q();
        jp jpVar = de0.a;
        if (Q == jpVar) {
            Q = ad4.w(Boolean.FALSE);
            go1Var.o0(Q);
        }
        t43 t43Var = (t43) Q;
        Object Q2 = go1Var.Q();
        fj0 fj0Var = null;
        if (Q2 == jpVar) {
            Q2 = new mt0(t43Var, fj0Var, (byte) 0);
            go1Var.o0(Q2);
        }
        mw2.h(go1Var, (hn1) Q2, wd5.a);
        if (((Boolean) t43Var.getValue()).booleanValue()) {
            return obj;
        }
        return null;
    }

    public static final void e(l13 l13Var, u45 u45Var, tc0 tc0Var, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(2036174316);
        int i2 = (go1Var.g(l13Var) ? 4 : 2) | i | (go1Var.i(u45Var) ? 32 : 16);
        if (go1Var.T(i2 & 1, (i2 & 147) != 146)) {
            uw2 c2 = px.c(q8.J, true);
            long j = go1Var.T;
            int i3 = (int) ((j >>> 32) ^ j);
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, l13Var);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, c2);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i3));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            d4.a(u45Var, tc0Var, go1Var, (i2 >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new tf((Object) l13Var, (Object) u45Var, (Object) tc0Var, i, (byte) 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r5 != (-1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        i0(r1, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r13[r5] = Y(r13[r5], r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int e0(java.lang.Object r9, java.lang.Object r10, int r11, java.lang.Object r12, int[] r13, java.lang.Object[] r14, java.lang.Object[] r15) {
        /*
            int r0 = defpackage.ut0.Y(r9)
            r1 = r0 & r11
            int r2 = h0(r1, r12)
            r3 = -1
            if (r2 != 0) goto Le
            goto L40
        Le:
            int r4 = ~r11
            r0 = r0 & r4
            r5 = r3
        L11:
            int r2 = r2 + (-1)
            r6 = r13[r2]
            r7 = r6 & r4
            if (r7 != r0) goto L3c
            r7 = r14[r2]
            boolean r7 = defpackage.jl2.z(r9, r7)
            if (r7 == 0) goto L3c
            if (r15 == 0) goto L2b
            r7 = r15[r2]
            boolean r7 = defpackage.jl2.z(r10, r7)
            if (r7 == 0) goto L3c
        L2b:
            r9 = r6 & r11
            if (r5 != r3) goto L33
            i0(r1, r9, r12)
            return r2
        L33:
            r10 = r13[r5]
            int r9 = Y(r10, r9, r11)
            r13[r5] = r9
            return r2
        L3c:
            r5 = r6 & r11
            if (r5 != 0) goto L41
        L40:
            return r3
        L41:
            r8 = r5
            r5 = r2
            r2 = r8
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c5.e0(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static final void f(ea5 ea5Var, l13 l13Var, ve1 ve1Var, tm1 tm1Var, fe0 fe0Var, int i) {
        tm1 tm1Var2;
        ss4 ss4Var = ea5Var.a;
        tc0 tc0Var = j16.t;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1877370462);
        int i2 = (i & 6) == 0 ? (go1Var.g(ea5Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= go1Var.g(l13Var) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.i(ve1Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= go1Var.i(tc0Var) ? 16384 : 8192;
        }
        byte b2 = 0;
        if (go1Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = fh.N;
                go1Var.o0(Q);
            }
            tm1Var2 = (tm1) Q;
            Object Q2 = go1Var.Q();
            Object obj = Q2;
            if (Q2 == jpVar) {
                gt4 gt4Var = new gt4();
                gt4Var.add(ss4Var.d());
                go1Var.o0(gt4Var);
                obj = gt4Var;
            }
            gt4 gt4Var2 = (gt4) obj;
            Object Q3 = go1Var.Q();
            if (Q3 == jpVar) {
                long[] jArr = ia4.a;
                Q3 = new n43();
                go1Var.o0(Q3);
            }
            n43 n43Var = (n43) Q3;
            jk3 jk3Var = ea5Var.d;
            if (j42.c(ss4Var.d(), jk3Var.getValue())) {
                go1Var.d0(321145192);
                if (gt4Var2.size() == 1 && j42.c(gt4Var2.get(0), jk3Var.getValue())) {
                    go1Var.d0(321469824);
                    go1Var.q(false);
                } else {
                    go1Var.d0(321279546);
                    boolean z = (i3 & 14) == 4;
                    Object Q4 = go1Var.Q();
                    if (z || Q4 == jpVar) {
                        Q4 = new am0(ea5Var, b2);
                        go1Var.o0(Q4);
                    }
                    u70.J0(gt4Var2, (tm1) Q4);
                    n43Var.a();
                    go1Var.q(false);
                }
                go1Var.q(false);
            } else {
                go1Var.d0(321475776);
                go1Var.q(false);
            }
            if (n43Var.b(jk3Var.getValue())) {
                go1Var.d0(322279296);
                go1Var.q(false);
            } else {
                go1Var.d0(321536443);
                ListIterator listIterator = gt4Var2.listIterator();
                int i4 = 0;
                while (true) {
                    lk2 lk2Var = (lk2) listIterator;
                    if (!lk2Var.hasNext()) {
                        i4 = -1;
                        break;
                    } else if (j42.c(tm1Var2.invoke(lk2Var.next()), tm1Var2.invoke(jk3Var.getValue()))) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 == -1) {
                    gt4Var2.add(jk3Var.getValue());
                } else {
                    gt4Var2.set(i4, jk3Var.getValue());
                }
                n43Var.a();
                int size = gt4Var2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    Object obj2 = gt4Var2.get(i5);
                    n43Var.m(obj2, p70.u0(-934471669, new bm0(ea5Var, ve1Var, obj2), go1Var));
                }
                go1Var.q(false);
            }
            uw2 c2 = px.c(q8.J, false);
            long j = go1Var.T;
            int i6 = (int) (j ^ (j >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, l13Var);
            xd0.c.getClass();
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, c2);
            qi4.k(go1Var, q8.b0, m);
            qi4.i(go1Var, Integer.valueOf(i6));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            go1Var.d0(-1312707512);
            int size2 = gt4Var2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                Object obj3 = gt4Var2.get(i7);
                go1Var.a0(1171574969, tm1Var2.invoke(obj3));
                hn1 hn1Var = (hn1) n43Var.g(obj3);
                if (hn1Var == null) {
                    go1Var.d0(1959122128);
                } else {
                    go1Var.d0(1171576145);
                    hn1Var.invoke(go1Var, 0);
                }
                go1Var.q(false);
                go1Var.q(false);
            }
            go1Var.q(false);
            go1Var.q(true);
        } else {
            go1Var.W();
            tm1Var2 = tm1Var;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new cm0(ea5Var, l13Var, ve1Var, tm1Var2, i);
        }
    }

    public static final long f0(long j, float f2) {
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f2);
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f2);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public static final void g(Object obj, l13 l13Var, ve1 ve1Var, String str, fe0 fe0Var, int i) {
        ve1 ve1Var2;
        l13 l13Var2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-513216493);
        int i2 = (go1Var.g(obj) ? 4 : 2) | i | 48 | (go1Var.i(ve1Var) ? 256 : 128);
        if (go1Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            i13 i13Var = i13.a;
            ve1Var2 = ve1Var;
            f(mw2.Z(obj, str, go1Var, (i2 & 14) | 48), i13Var, ve1Var2, null, go1Var, i2 & 58352);
            l13Var2 = i13Var;
        } else {
            ve1Var2 = ve1Var;
            go1Var.W();
            l13Var2 = l13Var;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new zl0(obj, l13Var2, ve1Var2, str, i);
        }
    }

    public static final void g0(j55 j55Var, oh2 oh2Var, d55 d55Var, mx1 mx1Var, td3 td3Var) {
        g12 g12Var = oh2Var.d;
        xj0 xj0Var = oh2Var.v;
        xj0 xj0Var2 = oh2Var.w;
        r24 r24Var = new r24();
        m6 m6Var = new m6((Object) g12Var, (Object) xj0Var, (Object) r24Var, (byte) 26);
        jo3 jo3Var = j55Var.a;
        jo3Var.e(d55Var, mx1Var, m6Var, xj0Var2);
        m55 m55Var = new m55(j55Var, jo3Var);
        j55Var.b.set(m55Var);
        r24Var.I = m55Var;
        oh2Var.e = m55Var;
        b0(oh2Var, d55Var, td3Var);
    }

    public static final void h(vd3 vd3Var, u8 u8Var, tc0 tc0Var, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1090171650);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go1Var.g(vd3Var) : go1Var.i(vd3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.g(u8Var) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.i(tc0Var) ? 256 : 128;
        }
        boolean z = true;
        if (go1Var.T(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32;
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !go1Var.g(vd3Var))) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object Q = go1Var.Q();
            if (z3 || Q == de0.a) {
                Q = new js1(u8Var, vd3Var);
                go1Var.o0(Q);
            }
            pe.a((js1) Q, null, new zq3(false, yg4.I, false), tc0Var, go1Var, ((i2 << 3) & 7168) | RendererCapabilities.DECODER_SUPPORT_MASK, 2);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new ve(vd3Var, u8Var, tc0Var, i, (byte) 0);
        }
    }

    public static int h0(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    public static final void i(final vd3 vd3Var, final boolean z, final s44 s44Var, final boolean z2, long j, final float f2, final l05 l05Var, fe0 fe0Var, final int i) {
        int i2;
        final long j2;
        int i3;
        long j3;
        final boolean z3;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-466280168);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go1Var.g(vd3Var) : go1Var.i(vd3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.h(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.e(s44Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go1Var.h(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((1572864 & i) == 0) {
            i2 |= go1Var.g(l05Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (go1Var.T(i2 & 1, (533651 & i2) != 533650)) {
            go1Var.Y();
            if ((i & 1) == 0 || go1Var.C()) {
                i3 = i2 & (-57345);
                j3 = 9205357640488583168L;
            } else {
                go1Var.W();
                i3 = i2 & (-57345);
                j3 = j;
            }
            go1Var.r();
            s44 s44Var2 = s44.J;
            s44 s44Var3 = s44.I;
            if (z) {
                bj4 bj4Var = fi4.a;
                z3 = (s44Var == s44Var3 && !z2) || (s44Var == s44Var2 && z2);
            } else {
                bj4 bj4Var2 = fi4.a;
                z3 = (s44Var != s44Var3 || z2) && !(s44Var == s44Var2 && z2);
            }
            sv svVar = z3 ? qg5.d : qg5.c;
            int i4 = i3 & 14;
            boolean h = ((i3 & 112) == 32) | (i4 == 4 || ((i3 & 8) != 0 && go1Var.i(vd3Var))) | go1Var.h(z3);
            Object Q = go1Var.Q();
            if (h || Q == de0.a) {
                Q = new xe(vd3Var, z, z3);
                go1Var.o0(Q);
            }
            final l13 a2 = oi4.a(l05Var, false, (tm1) Q);
            final gr5 gr5Var = (gr5) go1Var.k(hf0.t);
            long j4 = j3;
            sv svVar2 = svVar;
            j2 = j4;
            h(vd3Var, svVar2, p70.u0(1365123137, new hn1() { // from class: ye
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    fe0 fe0Var2 = (fe0) obj;
                    int intValue = ((Integer) obj2).intValue();
                    go1 go1Var2 = (go1) fe0Var2;
                    if (go1Var2.T(intValue & 1, (intValue & 3) != 2)) {
                        ay3 a3 = hf0.t.a(gr5.this);
                        final long j5 = j2;
                        final boolean z4 = z3;
                        final l13 l13Var = a2;
                        final vd3 vd3Var2 = vd3Var;
                        mw2.b(a3, p70.u0(1260045569, new hn1() { // from class: af
                            @Override // defpackage.hn1
                            public final Object invoke(Object obj3, Object obj4) {
                                fe0 fe0Var3 = (fe0) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                final byte b2 = 1;
                                final byte b3 = 0;
                                go1 go1Var3 = (go1) fe0Var3;
                                if (go1Var3.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    long j6 = j5;
                                    boolean z5 = z4;
                                    l13 l13Var2 = l13Var;
                                    final vd3 vd3Var3 = vd3Var2;
                                    jp jpVar = de0.a;
                                    if (j6 != 9205357640488583168L) {
                                        go1Var3.d0(3458246);
                                        n84 n84Var = z5 ? j16.m : j16.l;
                                        l13 j7 = nq4.j(l13Var2, v11.b(j6), v11.a(j6), 0.0f, 0.0f, 12);
                                        u74 a4 = t74.a(n84Var, q8.S, go1Var3, 0);
                                        long j8 = go1Var3.T;
                                        int i5 = (int) (j8 ^ (j8 >>> 32));
                                        am3 m = go1Var3.m();
                                        l13 x0 = i42.x0(go1Var3, j7);
                                        xd0.c.getClass();
                                        go1Var3.h0();
                                        if (go1Var3.S) {
                                            go1Var3.l(wa2.A0);
                                        } else {
                                            go1Var3.r0();
                                        }
                                        qi4.k(go1Var3, q8.c0, a4);
                                        qi4.k(go1Var3, q8.b0, m);
                                        qi4.k(go1Var3, q8.d0, Integer.valueOf(i5));
                                        qi4.j(go1Var3);
                                        qi4.k(go1Var3, q8.a0, x0);
                                        boolean i6 = go1Var3.i(vd3Var3);
                                        Object Q2 = go1Var3.Q();
                                        if (i6 || Q2 == jpVar) {
                                            Q2 = new rm1() { // from class: bf
                                                @Override // defpackage.rm1
                                                public final Object invoke() {
                                                    byte b4 = b3;
                                                    vd3 vd3Var4 = vd3Var3;
                                                    switch (b4) {
                                                        case 0:
                                                            return Boolean.valueOf((9223372034707292159L & vd3Var4.a()) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((9223372034707292159L & vd3Var4.a()) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            go1Var3.o0(Q2);
                                        }
                                        c5.j(6, go1Var3, (rm1) Q2, i13.a, z5);
                                        go1Var3.q(true);
                                        go1Var3.q(false);
                                    } else {
                                        go1Var3.d0(4389176);
                                        boolean i7 = go1Var3.i(vd3Var3);
                                        Object Q3 = go1Var3.Q();
                                        if (i7 || Q3 == jpVar) {
                                            Q3 = new rm1() { // from class: bf
                                                @Override // defpackage.rm1
                                                public final Object invoke() {
                                                    byte b4 = b2;
                                                    vd3 vd3Var4 = vd3Var3;
                                                    switch (b4) {
                                                        case 0:
                                                            return Boolean.valueOf((9223372034707292159L & vd3Var4.a()) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((9223372034707292159L & vd3Var4.a()) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            go1Var3.o0(Q3);
                                        }
                                        c5.j(0, go1Var3, (rm1) Q3, l13Var2, z5);
                                        go1Var3.q(false);
                                    }
                                } else {
                                    go1Var3.W();
                                }
                                return wd5.a;
                            }
                        }, go1Var2), go1Var2, 56);
                    } else {
                        go1Var2.W();
                    }
                    return wd5.a;
                }
            }, go1Var), go1Var, i4 | RendererCapabilities.DECODER_SUPPORT_MASK);
        } else {
            go1Var.W();
            j2 = j;
        }
        x04 u = go1Var.u();
        if (u != null) {
            final long j5 = j2;
            u.d = new hn1() { // from class: ze
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c5.i(vd3.this, z, s44Var, z2, j5, f2, l05Var, (fe0) obj, mu0.X(i | 1));
                    return wd5.a;
                }
            };
        }
    }

    public static void i0(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static final void j(final int i, fe0 fe0Var, final rm1 rm1Var, final l13 l13Var, final boolean z) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(2111672474);
        if ((i & 6) == 0) {
            i2 = (go1Var.g(l13Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (go1Var.i(rm1Var) ? 32 : 16) | (go1Var.h(z) ? 256 : 128);
        if (go1Var.T(i3 & 1, (i3 & 147) != 146)) {
            bj4 bj4Var = fi4.a;
            oh4.a(go1Var, i42.k0(nq4.l(l13Var, 25.0f, 25.0f), new df(rm1Var, z)));
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: cf
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c5.j(mu0.X(i | 1), (fe0) obj, rm1Var, l13.this, z);
                    return wd5.a;
                }
            };
        }
    }

    public static byte[] j0(dp0 dp0Var) {
        dp0Var.getClass();
        HashMap hashMap = dp0Var.a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(hashMap.size());
                for (Map.Entry entry : hashMap.entrySet()) {
                    k0(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } catch (IOException e2) {
            fr2.e().d(np0.a, "Error in Data#toByteArray: ", e2);
            return new byte[0];
        }
    }

    public static final void k(u45 u45Var, boolean z, fe0 fe0Var, int i) {
        v55 d2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(626339208);
        byte b2 = 2;
        int i2 = (go1Var.i(u45Var) ? 4 : 2) | i | (go1Var.h(z) ? 32 : 16);
        if (!go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            go1Var.W();
        } else if (z) {
            go1Var.d0(1530097388);
            oh2 oh2Var = u45Var.d;
            u55 u55Var = null;
            if (oh2Var != null && (d2 = oh2Var.d()) != null) {
                u55 u55Var2 = d2.a;
                oh2 oh2Var2 = u45Var.d;
                if (!(oh2Var2 != null ? oh2Var2.p : true)) {
                    u55Var = u55Var2;
                }
            }
            if (u55Var == null) {
                go1Var.d0(1530097387);
                go1Var.q(false);
            } else {
                go1Var.d0(1530097388);
                if (d65.c(u45Var.l().b)) {
                    go1Var.d0(2110860558);
                    go1Var.q(false);
                } else {
                    go1Var.d0(2109807302);
                    int k = u45Var.b.k((int) (u45Var.l().b >> 32));
                    int k2 = u45Var.b.k((int) (u45Var.l().b & 4294967295L));
                    s44 a2 = u55Var.a(k);
                    s44 a3 = u55Var.a(Math.max(k2 - 1, 0));
                    oh2 oh2Var3 = u45Var.d;
                    if (oh2Var3 == null || !((Boolean) oh2Var3.m.getValue()).booleanValue()) {
                        go1Var.d0(2110490542);
                        go1Var.q(false);
                    } else {
                        go1Var.d0(2110225306);
                        eg5.d(true, a2, u45Var, go1Var, ((i2 << 6) & 896) | 6);
                        go1Var.q(false);
                    }
                    oh2 oh2Var4 = u45Var.d;
                    if (oh2Var4 == null || !((Boolean) oh2Var4.n.getValue()).booleanValue()) {
                        go1Var.d0(2110838734);
                        go1Var.q(false);
                    } else {
                        go1Var.d0(2110574459);
                        eg5.d(false, a3, u45Var, go1Var, ((i2 << 6) & 896) | 6);
                        go1Var.q(false);
                    }
                    go1Var.q(false);
                }
                oh2 oh2Var5 = u45Var.d;
                if (oh2Var5 != null) {
                    jk3 jk3Var = oh2Var5.l;
                    if (!j42.c(u45Var.t.a.J, u45Var.l().a.J)) {
                        jk3Var.setValue(Boolean.FALSE);
                    }
                    if (oh2Var5.b()) {
                        if (((Boolean) jk3Var.getValue()).booleanValue()) {
                            u45Var.s();
                        } else {
                            u45Var.m();
                        }
                    }
                }
                go1Var.q(false);
            }
            go1Var.q(false);
        } else {
            go1Var.d0(1989076778);
            go1Var.q(false);
            u45Var.m();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new bc(u45Var, z, i, b2);
        }
    }

    public static final void k0(DataOutputStream dataOutputStream, String str, Object obj) {
        int i;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                j0.l(s24.a(obj.getClass()).c(), "Unsupported value type ");
                return;
            }
            Object[] objArr = (Object[]) obj;
            k60 a2 = s24.a(objArr.getClass());
            if (a2.equals(s24.a(Boolean[].class))) {
                i = 8;
            } else if (a2.equals(s24.a(Byte[].class))) {
                i = 9;
            } else if (a2.equals(s24.a(Integer[].class))) {
                i = 10;
            } else if (a2.equals(s24.a(Long[].class))) {
                i = 11;
            } else if (a2.equals(s24.a(Float[].class))) {
                i = 12;
            } else if (a2.equals(s24.a(Double[].class))) {
                i = 13;
            } else {
                if (!a2.equals(s24.a(String[].class))) {
                    j0.l(s24.a(objArr.getClass()).b(), "Unsupported value type ");
                    return;
                }
                i = 14;
            }
            dataOutputStream.writeByte(i);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i == 9) {
                    Byte b2 = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b2 != null ? b2.byteValue() : (byte) 0);
                } else if (i == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i == 11) {
                    Long l = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                } else if (i == 12) {
                    Float f2 = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f2 != null ? f2.floatValue() : 0.0f);
                } else if (i == 13) {
                    Double d2 = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d2 != null ? d2.doubleValue() : 0.0d);
                } else if (i == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }

    public static final void l(u45 u45Var, fe0 fe0Var, int i) {
        oj k;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1436003720);
        int i2 = (go1Var.i(u45Var) ? 4 : 2) | i;
        byte b2 = 1;
        byte b3 = 0;
        if (go1Var.T(i2 & 1, (i2 & 3) != 2)) {
            oh2 oh2Var = u45Var.d;
            if (oh2Var == null || !((Boolean) oh2Var.o.getValue()).booleanValue() || (k = u45Var.k()) == null || k.J.length() <= 0) {
                go1Var.d0(-2111042550);
                go1Var.q(false);
            } else {
                go1Var.d0(-2112351432);
                boolean g = go1Var.g(u45Var);
                Object Q = go1Var.Q();
                jp jpVar = de0.a;
                if (g || Q == jpVar) {
                    Q = new q45(u45Var);
                    go1Var.o0(Q);
                }
                s35 s35Var = (s35) Q;
                iu0 iu0Var = (iu0) go1Var.k(hf0.h);
                td3 td3Var = u45Var.b;
                long j = u45Var.l().b;
                int i3 = d65.c;
                int k2 = td3Var.k((int) (j >> 32));
                oh2 oh2Var2 = u45Var.d;
                v55 d2 = oh2Var2 != null ? oh2Var2.d() : null;
                d2.getClass();
                u55 u55Var = d2.a;
                m14 c2 = u55Var.c(ut0.r(k2, 0, u55Var.a.a.J.length()));
                long floatToRawIntBits = (Float.floatToRawIntBits(c2.d) & 4294967295L) | (Float.floatToRawIntBits((iu0Var.P(2.0f) / 2.0f) + c2.a) << 32);
                boolean f2 = go1Var.f(floatToRawIntBits);
                Object Q2 = go1Var.Q();
                if (f2 || Q2 == jpVar) {
                    Q2 = new fk0(floatToRawIntBits);
                    go1Var.o0(Q2);
                }
                vd3 vd3Var = (vd3) Q2;
                boolean i4 = go1Var.i(s35Var) | go1Var.i(u45Var);
                Object Q3 = go1Var.Q();
                if (i4 || Q3 == jpVar) {
                    Q3 = new ik0(s35Var, u45Var, b3);
                    go1Var.o0(Q3);
                }
                l05 l05Var = new l05(s35Var, null, null, (PointerInputEventHandler) Q3, 6);
                boolean f3 = go1Var.f(floatToRawIntBits);
                Object Q4 = go1Var.Q();
                if (f3 || Q4 == jpVar) {
                    Q4 = new cc(floatToRawIntBits, b2);
                    go1Var.o0(Q4);
                }
                ec.a(vd3Var, oi4.a(l05Var, false, (tm1) Q4), 0L, go1Var, 0);
                go1Var.q(false);
            }
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new rd(u45Var, i, b2);
        }
    }

    public static final w70 l0(long j) {
        v80 f2 = x70.f(j);
        v54 v54Var = z80.e;
        if (j42.c(f2, v54Var)) {
            return r84.J.g(x70.h(j), x70.g(j), x70.e(j), x70.d(j));
        }
        if (j42.c(f2, z80.q)) {
            xz3 xz3Var = yz3.c;
            float h = x70.h(j);
            float g = x70.g(j);
            float e2 = x70.e(j);
            float d2 = x70.d(j);
            xz3Var.getClass();
            return new tz3(h, g, e2, d2, xz3Var);
        }
        if (j42.c(f2, z80.r)) {
            xz3 xz3Var2 = yz3.d;
            float h2 = x70.h(j);
            float g2 = x70.g(j);
            float e3 = x70.e(j);
            float d3 = x70.d(j);
            xz3Var2.getClass();
            return new tz3(h2, g2, e3, d3, xz3Var2);
        }
        if (j42.c(f2, z80.o)) {
            xz3 xz3Var3 = yz3.e;
            float h3 = x70.h(j);
            float g3 = x70.g(j);
            float e4 = x70.e(j);
            float d4 = x70.d(j);
            xz3Var3.getClass();
            return new tz3(h3, g3, e4, d4, xz3Var3);
        }
        if (j42.c(f2, z80.j)) {
            xz3 xz3Var4 = yz3.f;
            float h4 = x70.h(j);
            float g4 = x70.g(j);
            float e5 = x70.e(j);
            float d5 = x70.d(j);
            xz3Var4.getClass();
            return new tz3(h4, g4, e5, d5, xz3Var4);
        }
        if (j42.c(f2, z80.i)) {
            xz3 xz3Var5 = yz3.g;
            float h5 = x70.h(j);
            float g5 = x70.g(j);
            float e6 = x70.e(j);
            float d6 = x70.d(j);
            xz3Var5.getClass();
            return new tz3(h5, g5, e6, d6, xz3Var5);
        }
        if (j42.c(f2, z80.t)) {
            f92 f92Var = g92.a;
            float h6 = x70.h(j);
            float g6 = x70.g(j);
            float e7 = x70.e(j);
            float d7 = x70.d(j);
            f92Var.getClass();
            return new e92(h6, g6, e7, d7, f92Var);
        }
        if (j42.c(f2, z80.s)) {
            y06 y06Var = z06.b;
            float h7 = x70.h(j);
            float g7 = x70.g(j);
            float e8 = x70.e(j);
            float d8 = x70.d(j);
            y06Var.getClass();
            return new x06(h7, g7, e8, d8, y06Var);
        }
        if (j42.c(f2, z80.k)) {
            xz3 xz3Var6 = yz3.h;
            float h8 = x70.h(j);
            float g8 = x70.g(j);
            float e9 = x70.e(j);
            float d9 = x70.d(j);
            xz3Var6.getClass();
            return new tz3(h8, g8, e9, d9, xz3Var6);
        }
        if (j42.c(f2, z80.l)) {
            xz3 xz3Var7 = yz3.i;
            float h9 = x70.h(j);
            float g9 = x70.g(j);
            float e10 = x70.e(j);
            float d10 = x70.d(j);
            xz3Var7.getClass();
            return new tz3(h9, g9, e10, d10, xz3Var7);
        }
        if (j42.c(f2, z80.f)) {
            xz3 xz3Var8 = yz3.b;
            float h10 = x70.h(j);
            float g10 = x70.g(j);
            float e11 = x70.e(j);
            float d11 = x70.d(j);
            xz3Var8.getClass();
            return new tz3(h10, g10, e11, d11, xz3Var8);
        }
        if (!j42.c(f2, z80.p)) {
            long b2 = x70.b(j, v54Var);
            return r84.J.g(x70.h(b2), x70.g(b2), x70.e(b2), x70.d(b2));
        }
        xz3 xz3Var9 = yz3.j;
        float h11 = x70.h(j);
        float g11 = x70.g(j);
        float e12 = x70.e(j);
        float d12 = x70.d(j);
        xz3Var9.getClass();
        return new tz3(h11, g11, e12, d12, xz3Var9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int m(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L8
            if (r5 == 0) goto L6
            return r0
        L6:
            int r4 = r4 - r3
            return r4
        L8:
            if (r5 != 0) goto Ld
            if (r3 > r2) goto L16
            goto L11
        Ld:
            int r1 = r4 - r3
            if (r1 <= r2) goto L16
        L11:
            if (r5 == 0) goto L14
            goto L21
        L14:
            int r2 = r2 - r3
            return r2
        L16:
            if (r5 == 0) goto L1b
            if (r3 > r2) goto L24
            goto L1f
        L1b:
            int r1 = r4 - r3
            if (r1 <= r2) goto L24
        L1f:
            if (r5 != 0) goto L22
        L21:
            return r2
        L22:
            int r2 = r2 - r3
            return r2
        L24:
            if (r5 != 0) goto L27
            return r0
        L27:
            int r4 = r4 - r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c5.m(int, int, int, boolean):int");
    }

    public static final boolean m0(Throwable th, rm1 rm1Var) {
        List asList;
        Object invoke;
        th.getClass();
        Integer num = q52.a;
        gw0 gw0Var = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            asList = Arrays.asList(suppressed);
            asList.getClass();
        } else {
            Method method = ln3.b;
            if (method == null || (invoke = method.invoke(th, null)) == null) {
                asList = o91.I;
            } else {
                asList = Arrays.asList((Throwable[]) invoke);
                asList.getClass();
            }
        }
        int size = asList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) asList.get(i)) instanceof gw0) {
                return false;
            }
        }
        try {
            vd0 vd0Var = (vd0) rm1Var.invoke();
            if (vd0Var != null) {
                boolean z2 = vd0Var.b;
                List list = vd0Var.a;
                if (z2) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((wd0) list.get(i2)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                vd0Var.getClass();
                gw0Var = new gw0(vd0Var);
            }
        } catch (Throwable th2) {
            gw0Var = th2;
        }
        if (gw0Var != null) {
            sv2.i(th, gw0Var);
        }
        return z;
    }

    public static final l13 n(l13 l13Var, float f2) {
        return f2 == 1.0f ? l13Var : qb.P(l13Var, f2, 0.0f, null, true, 1044475);
    }

    public static Intent o(Intent intent, ha5 ha5Var, int i) {
        Intent intent2 = new Intent();
        intent2.setComponent(ha5Var.o.a);
        intent2.setData(u(ha5Var, i, d7.I, ""));
        intent2.putExtra("ACTION_TYPE", "BROADCAST");
        intent2.putExtra("ACTION_INTENT", intent);
        return intent2;
    }

    public static final void p(Throwable th, rm1 rm1Var) {
        m0(th, rm1Var);
    }

    public static final tu0 q(View view) {
        Context context = view.getContext();
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            if ((context2 instanceof Activity) || (context2 instanceof InputMethodService) || (context2 instanceof Application)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) context2;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            context2 = contextWrapper.getBaseContext();
        }
        context2 = null;
        if (context2 == null) {
            Configuration configuration = context.getResources().getConfiguration();
            nu0 m = qb.m(context);
            long a2 = vt0.a(configuration.screenWidthDp, configuration.screenHeightDp);
            long e2 = r7.e(a2, m);
            return new tu0((4294967295L & ((int) Float.intBitsToFloat((int) (e2 & 4294967295L)))) | (((int) Float.intBitsToFloat((int) (e2 >> 32))) << 32), a2);
        }
        lw5.a.getClass();
        kw5 kw5Var = kw5.a;
        mw5 mw5Var = kw5.b;
        mw5Var.getClass();
        ContextWrapper contextWrapper2 = (ContextWrapper) context2;
        int i = Build.VERSION.SDK_INT;
        fx fxVar = (i >= 34 ? ku0.J : i >= 30 ? ix.J : n84.V0).f(contextWrapper2, mw5Var.b).a;
        long height = (4294967295L & fxVar.c().height()) | (fxVar.c().width() << 32);
        return new tu0(height, r7.c(ut0.b0(height), qb.m(context2)));
    }

    public static final long r(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r1 <= r6.getHeight()) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.tw1 s(defpackage.m00 r28, float r29) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c5.s(m00, float):tw1");
    }

    public static Object t(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
        }
        s83.t(hf1.u(i, "must be power of 2 between 2^1 and 2^30: "));
        return null;
    }

    public static final Uri u(ha5 ha5Var, int i, d7 d7Var, String str) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("glance-action");
        builder.path(d7Var.name());
        builder.appendQueryParameter("appWidgetId", String.valueOf(ha5Var.b));
        builder.appendQueryParameter("viewId", String.valueOf(i));
        builder.appendQueryParameter("viewSize", v11.c(ha5Var.j));
        builder.appendQueryParameter("extraData", str);
        if (ha5Var.f) {
            builder.appendQueryParameter("lazyCollection", String.valueOf(ha5Var.k));
            builder.appendQueryParameter("lazeViewItem", String.valueOf(-1));
        }
        return builder.build();
    }

    public static int v(byte[] bArr, int i, op opVar) {
        int B = B(bArr, i, opVar);
        int i2 = opVar.b;
        if (i2 < 0) {
            throw x42.d();
        }
        if (i2 > bArr.length - B) {
            throw x42.f();
        }
        if (i2 == 0) {
            opVar.d = g00.J;
            return B;
        }
        opVar.d = g00.e(bArr, B, i2);
        return B + i2;
    }

    public static int w(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long x(int i, byte[] bArr) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int y(qa4 qa4Var, int i, byte[] bArr, int i2, int i3, n32 n32Var, op opVar) {
        ap1 c2 = qa4Var.c();
        qa4 qa4Var2 = qa4Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        op opVar2 = opVar;
        int a0 = a0(c2, qa4Var2, bArr2, i2, i4, opVar2);
        qa4Var2.a(c2);
        opVar2.d = c2;
        n32Var.add(c2);
        while (a0 < i4) {
            op opVar3 = opVar2;
            int i5 = i4;
            int B = B(bArr2, a0, opVar3);
            if (i != opVar3.b) {
                break;
            }
            byte[] bArr3 = bArr2;
            qa4 qa4Var3 = qa4Var2;
            ap1 c3 = qa4Var3.c();
            a0 = a0(c3, qa4Var3, bArr3, B, i5, opVar3);
            qa4Var2 = qa4Var3;
            bArr2 = bArr3;
            i4 = i5;
            opVar2 = opVar3;
            qa4Var2.a(c3);
            opVar2.d = c3;
            n32Var.add(c3);
        }
        return a0;
    }

    public static int z(int i, byte[] bArr, int i2, int i3, zd5 zd5Var, op opVar) {
        if ((i >>> 3) == 0) {
            throw x42.a();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int D = D(bArr, i2, opVar);
            zd5Var.d(i, Long.valueOf(opVar.a));
            return D;
        }
        if (i4 == 1) {
            zd5Var.d(i, Long.valueOf(x(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int B = B(bArr, i2, opVar);
            int i5 = opVar.b;
            if (i5 < 0) {
                throw x42.d();
            }
            if (i5 > bArr.length - B) {
                throw x42.f();
            }
            if (i5 == 0) {
                zd5Var.d(i, g00.J);
            } else {
                zd5Var.d(i, g00.e(bArr, B, i5));
            }
            return B + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw x42.a();
            }
            zd5Var.d(i, Integer.valueOf(w(i2, bArr)));
            return i2 + 4;
        }
        zd5 c2 = zd5.c();
        int i6 = (i & (-8)) | 4;
        int i7 = opVar.c + 1;
        opVar.c = i7;
        if (i7 >= 100) {
            throw new x42("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int B2 = B(bArr, i2, opVar);
            i8 = opVar.b;
            if (i8 == i6) {
                i2 = B2;
                break;
            }
            i2 = z(i8, bArr, B2, i3, c2, opVar);
        }
        opVar.c--;
        if (i2 > i3 || i8 != i6) {
            throw x42.e();
        }
        zd5Var.d(i, c2);
        return i2;
    }
}

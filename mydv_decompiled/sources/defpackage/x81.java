package defpackage;

import android.app.Activity;
import android.content.ClipDescription;
import android.content.Context;
import android.graphics.Typeface;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.view.KeyEvent;
import androidx.media3.common.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class x81 implements e12 {
    public static x81 e;
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;

    public x81(qz2 qz2Var, si5 si5Var, oz2 oz2Var) {
        h13 h13Var;
        int i;
        int i2;
        int i3 = 3;
        this.a = (byte) 3;
        this.d = qz2Var;
        this.b = new ArrayList();
        oz2 oz2Var2 = oz2Var;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            h13Var = h13.ECI;
            if (oz2Var2 == null) {
                break;
            }
            int i6 = oz2Var2.c;
            int i7 = i4 + oz2Var2.d;
            oz2 oz2Var3 = oz2Var2.e;
            int i8 = i5;
            h13 h13Var2 = oz2Var2.a;
            boolean z = (h13Var2 == h13.BYTE && oz2Var3 == null && i6 != 0) || !(oz2Var3 == null || i6 == oz2Var3.c);
            i = z ? 1 : i8;
            if (oz2Var3 == null || oz2Var3.a != h13Var2 || z) {
                ((ArrayList) this.b).add(0, new pz2(this, h13Var2, oz2Var2.b, i6, i7));
                i2 = 0;
            } else {
                i2 = i7;
            }
            if (z) {
                ((ArrayList) this.b).add(0, new pz2(this, h13Var, oz2Var2.b, oz2Var2.c, 0));
            }
            i5 = i;
            oz2Var2 = oz2Var3;
            i4 = i2;
        }
        int i9 = i5;
        boolean z2 = qz2Var.a;
        int i10 = qz2Var.b;
        if (z2) {
            pz2 pz2Var = (pz2) ((ArrayList) this.b).get(0);
            if (pz2Var != null && pz2Var.a != h13Var && i9 != 0) {
                ((ArrayList) this.b).add(0, new pz2(this, h13Var, 0, 0, 0));
            }
            ((ArrayList) this.b).add(((pz2) ((ArrayList) this.b).get(0)).a == h13Var ? 1 : 0, new pz2(this, h13.FNC1_FIRST_POSITION, 0, 0, 0));
        }
        int i11 = si5Var.a;
        int i12 = 26;
        if (i11 <= 9) {
            i3 = 1;
        } else if (i11 <= 26) {
            i3 = 2;
        }
        int F = pt1.F(i3);
        if (F == 0) {
            i12 = 9;
        } else if (F != 1) {
            i = 27;
            i12 = 40;
        } else {
            i = 10;
        }
        int i13 = i(si5Var);
        while (i11 < i12 && !x91.c(i13, si5.a(i11), i10)) {
            i11++;
        }
        while (i11 > i && x91.c(i13, si5.a(i11 - 1), i10)) {
            i11--;
        }
        this.c = si5.a(i11);
    }

    public static boolean f(Editable editable, KeyEvent keyEvent, boolean z) {
        fc5[] fc5VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (fc5VarArr = (fc5[]) editable.getSpans(selectionStart, selectionEnd, fc5.class)) != null && fc5VarArr.length > 0) {
                for (fc5 fc5Var : fc5VarArr) {
                    int spanStart = editable.getSpanStart(fc5Var);
                    int spanEnd = editable.getSpanEnd(fc5Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static x81 h(Context context) {
        x81 x81Var = e;
        if (x81Var != null) {
            return x81Var;
        }
        Context applicationContext = context.getApplicationContext();
        x81 x81Var2 = new x81(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        e = x81Var2;
        return x81Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean k(defpackage.k81 r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x81.k(k81, android.text.Editable, int, int, boolean):boolean");
    }

    public static int t(x81 x81Var, int i, int i2, byte[] bArr, int i3, int i4) {
        int[] iArr = (int[]) x81Var.b;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i2 && i6 < i3) {
            byte b = bArr[i6];
            int i7 = b & 15;
            i6++;
            int i8 = (b & 255) >> 4;
            if (i4 == 2) {
                if (i7 < 15) {
                    iArr[i + i5] = 2 - (i7 - (((i7 * 205) >> 10) * 5));
                    i5++;
                }
                if (i8 < 15 && i5 < i2) {
                    iArr[i + i5] = 2 - (i8 - (((i8 * 205) >> 10) * 5));
                    i5++;
                }
            } else if (i4 == 4) {
                if (i7 < 9) {
                    iArr[i + i5] = 4 - i7;
                    i5++;
                }
                if (i8 < 9 && i5 < i2) {
                    iArr[i + i5] = 4 - i8;
                    i5++;
                }
            }
        }
        return i5;
    }

    public static int u(x81 x81Var, int i, int i2, byte[] bArr, int i3) {
        int[] iArr = (int[]) x81Var.b;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int i6 = i5 + 3;
            if (i6 > i3) {
                break;
            }
            int i7 = (((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255)) & 8388607;
            if (i7 < 8380417) {
                iArr[i + i4] = i7;
                i4++;
            }
            i5 = i6;
        }
        return i4;
    }

    @Override // defpackage.e12
    public Uri a() {
        return (Uri) this.b;
    }

    @Override // defpackage.e12
    public Uri c() {
        return (Uri) this.d;
    }

    @Override // defpackage.e12
    public ClipDescription d() {
        return (ClipDescription) this.c;
    }

    @Override // defpackage.e12
    public Object e() {
        return null;
    }

    public int g(CharSequence charSequence, int i) {
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            fc5[] fc5VarArr = (fc5[]) spanned.getSpans(i, i + 1, fc5.class);
            if (fc5VarArr.length > 0) {
                return spanned.getSpanStart(fc5VarArr[0]);
            }
        }
        return ((v81) s(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Log.LOG_LEVEL_OFF, true, new v81(i))).J;
    }

    public int i(si5 si5Var) {
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            pz2 pz2Var = (pz2) obj;
            int i3 = pz2Var.d;
            h13 h13Var = pz2Var.a;
            int a = h13Var.a(si5Var);
            int i4 = a + 4;
            int ordinal = h13Var.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i4 = ((i3 / 2) * 11) + i4 + (i3 % 2 != 1 ? 0 : 6);
                } else if (ordinal == 4) {
                    i4 += pz2Var.a() * 8;
                } else if (ordinal == 5) {
                    i4 = a + 12;
                } else if (ordinal == 6) {
                    i4 += i3 * 13;
                }
            } else {
                int i5 = ((i3 / 3) * 10) + i4;
                int i6 = i3 % 3;
                i4 = i5 + (i6 != 1 ? i6 == 2 ? 7 : 0 : 4);
            }
            i += i4;
        }
        return i;
    }

    public Typeface j() {
        Object obj = this.d;
        obj.getClass();
        return (Typeface) obj;
    }

    public boolean l(CharSequence charSequence, int i, int i2, ec5 ec5Var) {
        if ((ec5Var.c & 3) == 0) {
            qr0 qr0Var = (qr0) this.d;
            hz2 b = ec5Var.b();
            int a = b.a(8);
            if (a != 0) {
                b.b.getShort(a + b.a);
            }
            qr0Var.getClass();
            ThreadLocal threadLocal = qr0.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean hasGlyph = qr0Var.a.hasGlyph(sb.toString());
            int i3 = ec5Var.c & 4;
            ec5Var.c = hasGlyph ? i3 | 2 : i3 | 1;
        }
        return (ec5Var.c & 3) == 2;
    }

    public boolean m() {
        if (((cw4) this.b).getValue() != this.d) {
            return true;
        }
        x81 x81Var = (x81) this.c;
        return x81Var != null && x81Var.m();
    }

    public void n(Activity activity, iw5 iw5Var) {
        WeakHashMap weakHashMap = (WeakHashMap) this.d;
        activity.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) this.c;
        reentrantLock.lock();
        try {
            if (iw5Var.equals((iw5) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((jo4) ((g73) this.b).J).b.iterator();
            it.getClass();
            while (it.hasNext()) {
                io4 io4Var = (io4) it.next();
                if (io4Var.a.equals(activity)) {
                    io4Var.d = iw5Var;
                    io4Var.b.execute(new h8(io4Var, iw5Var, (byte) 25));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void o(int i, byte[] bArr) {
        int[] iArr = (int[]) this.b;
        byte b = ((us2) this.c).e;
        byte[] bArr2 = new byte[8];
        if (b != 2) {
            if (b != 4) {
                throw new RuntimeException("Eta needs to be 2 or 4!");
            }
            for (int i2 = 0; i2 < 128; i2++) {
                int i3 = i2 * 2;
                byte b2 = (byte) (b - iArr[i3]);
                bArr2[0] = b2;
                byte b3 = (byte) (b - iArr[i3 + 1]);
                bArr2[1] = b3;
                bArr[i + i2] = (byte) ((b3 << 4) | b2);
            }
            return;
        }
        for (int i4 = 0; i4 < 32; i4++) {
            int i5 = i4 * 8;
            byte b4 = (byte) (b - iArr[i5]);
            bArr2[0] = b4;
            byte b5 = (byte) (b - iArr[i5 + 1]);
            bArr2[1] = b5;
            byte b6 = (byte) (b - iArr[i5 + 2]);
            bArr2[2] = b6;
            bArr2[3] = (byte) (b - iArr[i5 + 3]);
            bArr2[4] = (byte) (b - iArr[i5 + 4]);
            bArr2[5] = (byte) (b - iArr[i5 + 5]);
            bArr2[6] = (byte) (b - iArr[i5 + 6]);
            bArr2[7] = (byte) (b - iArr[i5 + 7]);
            int i6 = (i4 * 3) + i;
            bArr[i6] = (byte) (b4 | (b5 << 3) | (b6 << 6));
            bArr[i6 + 1] = (byte) ((bArr2[2] >> 2) | (bArr2[3] << 1) | (bArr2[4] << 4) | (bArr2[5] << 7));
            bArr[i6 + 2] = (byte) ((bArr2[5] >> 1) | (bArr2[6] << 2) | (bArr2[7] << 5));
        }
    }

    public void p(int i, byte[] bArr) {
        int[] iArr = (int[]) this.b;
        byte b = ((us2) this.c).e;
        int i2 = 0;
        if (b != 2) {
            if (b == 4) {
                while (i2 < 128) {
                    int i3 = i2 * 2;
                    byte b2 = bArr[i + i2];
                    iArr[i3] = b2 & 15;
                    int i4 = i3 + 1;
                    iArr[i4] = (b2 & 255) >> 4;
                    iArr[i3] = b - iArr[i3];
                    iArr[i4] = b - iArr[i4];
                    i2++;
                }
                return;
            }
            return;
        }
        while (i2 < 32) {
            int i5 = (i2 * 3) + i;
            int i6 = i2 * 8;
            byte b3 = bArr[i5];
            iArr[i6] = b3 & 7;
            int i7 = i6 + 1;
            int i8 = b3 & 255;
            iArr[i7] = (i8 >> 3) & 7;
            int i9 = i6 + 2;
            int i10 = bArr[i5 + 1] & 255;
            iArr[i9] = (i8 >> 6) | ((i10 << 2) & 7);
            int i11 = i6 + 3;
            iArr[i11] = (i10 >> 1) & 7;
            int i12 = i6 + 4;
            iArr[i12] = (i10 >> 4) & 7;
            int i13 = i6 + 5;
            int i14 = bArr[i5 + 2] & 255;
            iArr[i13] = (i10 >> 7) | ((i14 << 1) & 7);
            int i15 = i6 + 6;
            iArr[i15] = (i14 >> 2) & 7;
            int i16 = i6 + 7;
            iArr[i16] = (i14 >> 5) & 7;
            iArr[i6] = b - iArr[i6];
            iArr[i7] = b - iArr[i7];
            iArr[i9] = b - iArr[i9];
            iArr[i11] = b - iArr[i11];
            iArr[i12] = b - iArr[i12];
            iArr[i13] = b - iArr[i13];
            iArr[i15] = b - iArr[i15];
            iArr[i16] = b - iArr[i16];
            i2++;
        }
    }

    public void q(ji2 ji2Var) {
        j63 j63Var = (j63) this.d;
        if (j63Var != null) {
            j63Var.run();
        }
        j63 j63Var2 = new j63((xi2) this.b, ji2Var);
        this.d = j63Var2;
        ((Handler) this.c).postAtFrontOfQueue(j63Var2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056 A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:58:0x000f, B:61:0x0014, B:63:0x0018, B:65:0x0025, B:9:0x0046, B:11:0x0050, B:13:0x0053, B:15:0x0056, B:17:0x0066, B:18:0x0069), top: B:57:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.CharSequence r(java.lang.CharSequence r10, int r11, int r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x81.r(java.lang.CharSequence, int, int, boolean):java.lang.CharSequence");
    }

    public Object s(CharSequence charSequence, int i, int i2, int i3, boolean z, u81 u81Var) {
        int i4;
        char c;
        w81 w81Var = new w81((jz2) ((mc3) this.c).c);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z2) {
                jz2 jz2Var = (jz2) w81Var.c.a.get(codePointAt);
                if (w81Var.a == 2) {
                    if (jz2Var != null) {
                        w81Var.c = jz2Var;
                        w81Var.f++;
                    } else {
                        if (codePointAt == 65038) {
                            w81Var.a();
                        } else if (codePointAt != 65039) {
                            jz2 jz2Var2 = w81Var.c;
                            if (jz2Var2.b != null) {
                                if (w81Var.f != 1) {
                                    w81Var.d = jz2Var2;
                                    w81Var.a();
                                } else if (w81Var.b()) {
                                    w81Var.d = w81Var.c;
                                    w81Var.a();
                                } else {
                                    w81Var.a();
                                }
                                c = 3;
                            } else {
                                w81Var.a();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (jz2Var == null) {
                    w81Var.a();
                    c = 1;
                } else {
                    w81Var.a = (byte) 2;
                    w81Var.c = jz2Var;
                    w81Var.f = 1;
                    c = 2;
                }
                w81Var.e = codePointAt;
                if (c == 1) {
                    i6 = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (i6 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i6);
                    }
                } else if (c == 2) {
                    int charCount = Character.charCount(codePointAt) + i6;
                    if (charCount < i2) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i6 = charCount;
                } else if (c == 3) {
                    if (z || !l(charSequence, i4, i6, w81Var.d.b)) {
                        z2 = u81Var.h(charSequence, i4, i6, w81Var.d.b);
                        i5++;
                    }
                }
            }
        }
        if (w81Var.a == 2 && w81Var.c.b != null && ((w81Var.f > 1 || w81Var.b()) && i5 < i3 && z2 && (z || !l(charSequence, i4, i6, w81Var.c.b)))) {
            u81Var.h(charSequence, i4, i6, w81Var.c.b);
        }
        return u81Var.b();
    }

    public String toString() {
        int i = 0;
        switch (this.a) {
            case 3:
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                pz2 pz2Var = null;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    pz2 pz2Var2 = (pz2) obj;
                    if (pz2Var != null) {
                        sb.append(",");
                    }
                    sb.append(pz2Var2.toString());
                    pz2Var = pz2Var2;
                }
                return sb.toString();
            case 4:
            default:
                return super.toString();
            case 5:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.b);
                sb2.append('{');
                g12 g12Var = (g12) ((g12) this.c).K;
                String str = "";
                while (g12Var != null) {
                    Object obj2 = g12Var.J;
                    sb2.append(str);
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb2.append(obj2);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj2});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    g12Var = (g12) g12Var.K;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 6:
                int[] iArr = (int[]) this.b;
                StringBuilder sb3 = new StringBuilder("[");
                while (i < iArr.length) {
                    sb3.append(iArr[i]);
                    if (i != iArr.length - 1) {
                        sb3.append(", ");
                    }
                    i++;
                }
                sb3.append("]");
                return sb3.toString();
        }
    }

    @Override // defpackage.e12
    public void b() {
    }

    public /* synthetic */ x81(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public x81(SystemForegroundService systemForegroundService) {
        this.a = (byte) 7;
        this.b = new xi2(systemForegroundService, true);
        this.c = new Handler(Looper.getMainLooper());
    }

    public x81(Context context, LocationManager locationManager) {
        this.a = (byte) 9;
        this.d = new sb5();
        this.b = context;
        this.c = locationManager;
    }

    public x81(mc3 mc3Var, jp jpVar, qr0 qr0Var, Set set) {
        this.a = (byte) 0;
        this.b = jpVar;
        this.c = mc3Var;
        this.d = qr0Var;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            s(str, 0, str.length(), 1, true, new ej1(str, (byte) 5));
        }
    }

    public x81(String str) {
        this.a = (byte) 5;
        g12 g12Var = new g12((byte) 21, false);
        this.c = g12Var;
        this.d = g12Var;
        this.b = str;
    }

    public x81() {
        this.a = (byte) 11;
        List list = Collections.EMPTY_LIST;
        this.b = list;
        this.c = list;
    }

    public x81(jc5 jc5Var, x81 x81Var) {
        this.a = (byte) 10;
        this.b = jc5Var;
        this.c = x81Var;
        this.d = jc5Var.getValue();
    }

    public x81(g73 g73Var) {
        this.a = (byte) 8;
        this.b = g73Var;
        this.c = new ReentrantLock();
        this.d = new WeakHashMap();
    }

    public x81(us2 us2Var) {
        this.a = (byte) 6;
        this.b = new int[256];
        this.c = us2Var;
        this.d = us2Var.g;
    }
}

package defpackage;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.tv.TvContract;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewStructure;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.media3.extractor.ts.TsExtractor;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class g73 implements p84, cp, ij, uu5 {
    public final /* synthetic */ byte I;
    public Object J;

    public g73(byte b, int i) {
        this.I = b;
        switch (b) {
            case 6:
                this.J = new g73[i];
                for (int i2 = 0; i2 < i; i2++) {
                    ((g73[]) this.J)[i2] = new g73((byte) 4);
                }
                break;
            default:
                this.J = o7.c(new int[i]);
                break;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static java.util.ArrayList p(defpackage.g73 r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g73.p(g73, java.lang.String):java.util.ArrayList");
    }

    public void A(int i, String str) {
        ((ViewStructure) this.J).setId(i, null, null, str);
    }

    public void B(CharSequence charSequence) {
        ((ViewStructure) this.J).setText(charSequence);
    }

    public void C(float f) {
        ((ViewStructure) this.J).setTextStyle(f, 0, 0, 0);
    }

    public void D(byte[] bArr) {
        int i = 0;
        while (true) {
            g73[] g73VarArr = (g73[]) this.J;
            if (i >= g73VarArr.length) {
                return;
            }
            g73 g73Var = g73VarArr[i];
            int i2 = i * RendererCapabilities.DECODER_SUPPORT_MASK;
            short[] sArr = (short[]) g73Var.J;
            for (int i3 = 0; i3 < 256; i3++) {
                short s = (short) (sArr[i3] - 3329);
                sArr[i3] = (short) (s + ((s >> 15) & 3329));
            }
            for (int i4 = 0; i4 < 128; i4++) {
                int i5 = i4 * 2;
                short s2 = sArr[i5];
                short s3 = sArr[i5 + 1];
                int i6 = (i4 * 3) + i2;
                bArr[i6] = (byte) s2;
                bArr[i6 + 1] = (byte) ((s2 >> 8) | (s3 << 4));
                bArr[i6 + 2] = (byte) (s3 >> 4);
            }
            i++;
        }
    }

    public ViewStructure E() {
        return (ViewStructure) this.J;
    }

    public void F(byte[] bArr, short s) {
        int i;
        int i2 = 0;
        while (true) {
            x81[] x81VarArr = (x81[]) this.J;
            if (i2 >= x81VarArr.length) {
                return;
            }
            x81 x81Var = x81VarArr[i2];
            short s2 = (short) (s + 1);
            i84 i84Var = (i84) ((g12) x81Var.d).K;
            byte b = ((us2) x81Var.c).e;
            if (b == 2) {
                i = 1;
            } else {
                if (b != 4) {
                    throw new RuntimeException("Wrong Dilithium Eta!");
                }
                i = 2;
            }
            int i3 = i * TsExtractor.TS_STREAM_TYPE_DTS_HD;
            byte[] bArr2 = new byte[i3];
            i84Var.i(i84Var.e);
            i84Var.update(bArr, 0, bArr.length);
            i84Var.update(new byte[]{(byte) s, (byte) (s >> 8)}, 0, 2);
            i84Var.k(bArr2, 0, i3);
            for (int t = x81.t(x81Var, 0, 256, bArr2, i3, b); t < 256; t += x81.t(x81Var, t, 256 - t, bArr2, TsExtractor.TS_STREAM_TYPE_DTS_HD, b)) {
                i84Var.k(bArr2, 0, TsExtractor.TS_STREAM_TYPE_DTS_HD);
            }
            i2++;
            s = s2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void G(long r10, defpackage.at3 r12) {
        /*
            r9 = this;
            java.lang.Object r9 = r9.J
            android.content.Context r9 = (android.content.Context) r9
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r2 = 0
            if (r0 >= r1) goto Ld
            r0 = r2
            goto L3e
        Ld:
            android.net.Uri r0 = defpackage.ob5.a
            android.net.Uri r4 = android.content.ContentUris.withAppendedId(r0, r10)
            android.content.ContentResolver r3 = r9.getContentResolver()
            r7 = 0
            r8 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8)
            if (r1 == 0) goto L38
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L38
            at3 r0 = defpackage.at3.a(r1)     // Catch: java.lang.Throwable -> L2c
            goto L39
        L2c:
            r0 = move-exception
            r9 = r0
            r1.close()     // Catch: java.lang.Throwable -> L32
            goto L37
        L32:
            r0 = move-exception
            r10 = r0
            r9.addSuppressed(r10)
        L37:
            throw r9
        L38:
            r0 = r2
        L39:
            if (r1 == 0) goto L3e
            r1.close()
        L3e:
            if (r0 == 0) goto L79
            android.content.ContentValues r1 = r12.a
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L4a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L79
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            android.content.ContentValues r4 = r12.a
            java.lang.Object r4 = r4.get(r3)
            android.content.ContentValues r5 = r0.a
            java.lang.Object r3 = r5.get(r3)
            boolean r3 = j$.util.Objects.deepEquals(r4, r3)
            if (r3 != 0) goto L4a
            android.content.ContentResolver r9 = r9.getContentResolver()
            android.net.Uri r0 = defpackage.ob5.a
            android.net.Uri r10 = android.content.ContentUris.withAppendedId(r0, r10)
            android.content.ContentValues r11 = r12.b()
            r9.update(r10, r11, r2, r2)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g73.G(long, at3):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(long r9, defpackage.ys3 r11) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g73.a(long, ys3):boolean");
    }

    public void b(g73 g73Var) {
        int i = 0;
        while (true) {
            x81[] x81VarArr = (x81[]) this.J;
            if (i >= x81VarArr.length) {
                return;
            }
            x81 x81Var = x81VarArr[i];
            x81 x81Var2 = ((x81[]) g73Var.J)[i];
            int[] iArr = (int[]) x81Var.b;
            int[] iArr2 = (int[]) x81Var2.b;
            for (int i2 = 0; i2 < 256; i2++) {
                iArr[i2] = iArr[i2] + iArr2[i2];
            }
            i++;
        }
    }

    @Override // defpackage.p84
    public o84 c(String str) {
        str.getClass();
        return new oz4(((sz4) this.J).getWritableDatabase());
    }

    public pn d() {
        String str = null;
        return new pn((Uri) this.J, str, str, (byte) 8);
    }

    public long e(long j) {
        ts2 ts2Var = (ts2) this.J;
        if (ji5.d(j) <= 0.0f || ji5.e(j) <= 0.0f) {
            q02.b("maximumVelocity should be a positive value. You specified=".concat(ji5.i(j)));
        }
        return eg5.e(ts2Var.a.c(ji5.d(j)), ts2Var.b.c(ji5.e(j)));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(defpackage.dk0 r5, defpackage.gj0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.jd3
            if (r0 == 0) goto L13
            r0 = r6
            jd3 r0 = (defpackage.jd3) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            jd3 r0 = new jd3
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.I
            int r1 = r0.K
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return
        L27:
            d92 r4 = defpackage.r7.s(r6)
            throw r4
        L2c:
            defpackage.mu0.V(r6)
            java.lang.Object r4 = r4.J
            fw4 r4 = (defpackage.fw4) r4
            r0.K = r2
            r4.collect(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g73.f(dk0, gj0):void");
    }

    public void g() {
        int i = 0;
        while (true) {
            x81[] x81VarArr = (x81[]) this.J;
            if (i >= x81VarArr.length) {
                return;
            }
            int[] iArr = (int[]) x81VarArr[i].b;
            for (int i2 = 0; i2 < 256; i2++) {
                int i3 = iArr[i2];
                iArr[i2] = i3 + ((i3 >> 31) & 8380417);
            }
            i++;
        }
    }

    @Override // defpackage.ij
    public nf1 get(int i) {
        return (vf1) this.J;
    }

    public Bitmap h(Uri uri) {
        URLConnection uRLConnection;
        InputStream inputStream = null;
        try {
            uRLConnection = new URL(uri.toString()).openConnection();
        } catch (Throwable th) {
            th = th;
            uRLConnection = null;
        }
        try {
            uRLConnection.setConnectTimeout(3000);
            uRLConnection.setReadTimeout(10000);
            inputStream = uRLConnection.getInputStream();
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            if (uRLConnection instanceof HttpURLConnection) {
                ((HttpURLConnection) uRLConnection).disconnect();
            }
            return decodeStream;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            if (!(uRLConnection instanceof HttpURLConnection)) {
                throw th;
            }
            ((HttpURLConnection) uRLConnection).disconnect();
            throw th;
        }
    }

    public void i(byte[] bArr) {
        int i = 0;
        while (true) {
            g73[] g73VarArr = (g73[]) this.J;
            if (i >= g73VarArr.length) {
                return;
            }
            g73 g73Var = g73VarArr[i];
            int i2 = i << 8;
            int i3 = 0;
            while (true) {
                x81[] x81VarArr = (x81[]) g73Var.J;
                if (i3 < x81VarArr.length) {
                    x81 x81Var = x81VarArr[i3];
                    short s = (short) (i2 + i3);
                    i84 i84Var = (i84) ((g12) x81Var.d).J;
                    byte[] bArr2 = new byte[842];
                    i84Var.i(i84Var.e);
                    i84Var.update(bArr, 0, bArr.length);
                    i84Var.update(new byte[]{(byte) s, (byte) (s >> 8)}, 0, 2);
                    int i4 = 840;
                    i84Var.k(bArr2, 0, 840);
                    int u = x81.u(x81Var, 0, 256, bArr2, 840);
                    while (u < 256) {
                        int i5 = i4 % 3;
                        for (int i6 = 0; i6 < i5; i6++) {
                            bArr2[i6] = bArr2[(i4 - i5) + i6];
                        }
                        i84Var.k(bArr2, i5, 168);
                        i4 = 168 + i5;
                        u += x81.u(x81Var, u, 256 - u, bArr2, i4);
                    }
                    i3++;
                }
            }
            i++;
        }
    }

    @Override // defpackage.cp
    public Object j(rb4 rb4Var, Float f, Float f2, tm1 tm1Var, hs4 hs4Var) {
        float floatValue = f.floatValue();
        float floatValue2 = f2.floatValue();
        Object f3 = ui4.f(rb4Var, Math.signum(floatValue2) * Math.abs(floatValue), floatValue, o7.a(0.0f, floatValue2, 28), (ku4) this.J, tm1Var, hs4Var);
        return f3 == el0.I ? f3 : (yi) f3;
    }

    public List k() {
        if (Build.VERSION.SDK_INT < 26) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Cursor query = ((Context) this.J).getContentResolver().query(nb5.a, eu5.r, null, null, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    do {
                        ys3 a = ys3.a(query);
                        if (a != null) {
                            arrayList.add(a);
                        }
                    } while (query.moveToNext());
                }
            } finally {
            }
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }

    public Bundle l() {
        return ((ViewStructure) this.J).getExtras();
    }

    public void m(i84 i84Var, byte[] bArr, byte b) {
        byte[] bArr2 = new byte[128];
        i84Var.update(bArr, 32, 32);
        i84Var.b(b);
        i84Var.k(bArr2, 0, 128);
        i84Var.i(i84Var.e);
        for (int i = 0; i < 32; i++) {
            int k0 = dq2.k0(i * 4, bArr2);
            int i2 = (k0 & 1431655765) + ((k0 >>> 1) & 1431655765);
            for (int i3 = 0; i3 < 8; i3++) {
                int i4 = i3 * 4;
                ((short[]) this.J)[(i * 8) + i3] = (short) (((short) ((i2 >>> i4) & 3)) - ((short) ((i2 >>> (i4 + 2)) & 3)));
            }
        }
    }

    public void n(i84 i84Var, byte[] bArr, byte b) {
        byte[] bArr2 = new byte[PsExtractor.AUDIO_STREAM];
        i84Var.update(bArr, 32, 32);
        i84Var.b(b);
        i84Var.k(bArr2, 0, PsExtractor.AUDIO_STREAM);
        i84Var.i(i84Var.e);
        for (int i = 0; i < 64; i++) {
            int i2 = i * 3;
            int i3 = ((bArr2[i2 + 2] & 255) << 16) | (bArr2[i2] & 255) | ((bArr2[i2 + 1] & 255) << 8);
            int i4 = (i3 & 2396745) + ((i3 >>> 1) & 2396745) + ((i3 >>> 2) & 2396745);
            for (int i5 = 0; i5 < 4; i5++) {
                int i6 = i5 * 6;
                ((short[]) this.J)[(i * 4) + i5] = (short) (((short) ((i4 >>> i6) & 7)) - ((short) ((i4 >>> (i6 + 3)) & 7)));
            }
        }
    }

    public void o() {
        int i;
        int i2 = 0;
        while (true) {
            x81[] x81VarArr = (x81[]) this.J;
            if (i2 >= x81VarArr.length) {
                return;
            }
            int[] iArr = (int[]) x81VarArr[i2].b;
            int i3 = 256;
            for (int i4 = 1; i4 < 256; i4 <<= 1) {
                for (int i5 = 0; i5 < 256; i5 = i + i4) {
                    i3--;
                    int i6 = j16.d0[i3] * (-1);
                    i = i5;
                    while (i < i5 + i4) {
                        int i7 = iArr[i];
                        int i8 = i + i4;
                        iArr[i] = iArr[i8] + i7;
                        int i9 = i7 - iArr[i8];
                        iArr[i8] = i9;
                        iArr[i8] = dq2.o0(i6 * i9);
                        i++;
                    }
                }
            }
            for (int i10 = 0; i10 < 256; i10++) {
                iArr[i10] = dq2.o0(iArr[i10] * 41978);
            }
            i2++;
        }
    }

    public void q(g73 g73Var, g73 g73Var2) {
        int i;
        x81[] x81VarArr = (x81[]) g73Var2.J;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            g73[] g73VarArr = (g73[]) this.J;
            if (i3 >= g73VarArr.length) {
                return;
            }
            x81 x81Var = ((x81[]) g73Var.J)[i3];
            g73 g73Var3 = g73VarArr[i3];
            int[] iArr = (int[]) x81Var.b;
            byte b = ((us2) x81Var.c).d;
            int[] iArr2 = (int[]) ((x81[]) g73Var3.J)[i2].b;
            int[] iArr3 = (int[]) x81VarArr[i2].b;
            int i4 = i2;
            while (true) {
                i = 256;
                if (i4 >= 256) {
                    break;
                }
                iArr[i4] = dq2.o0(iArr2[i4] * iArr3[i4]);
                i4++;
            }
            int i5 = 1;
            while (i5 < b) {
                int[] iArr4 = (int[]) ((x81[]) g73Var3.J)[i5].b;
                int[] iArr5 = (int[]) x81VarArr[i5].b;
                int i6 = i2;
                while (i6 < i) {
                    int i7 = i6;
                    iArr[i7] = dq2.o0(iArr4[i6] * iArr5[i6]) + iArr[i6];
                    i6 = i7 + 1;
                    i = 256;
                }
                i5++;
                i2 = 0;
                i = 256;
            }
            i3++;
            i2 = 0;
        }
    }

    public void r() {
        int i;
        switch (this.I) {
            case 5:
                int i2 = 0;
                while (true) {
                    x81[] x81VarArr = (x81[]) this.J;
                    if (i2 >= x81VarArr.length) {
                        break;
                    } else {
                        int[] iArr = (int[]) x81VarArr[i2].b;
                        int i3 = 0;
                        for (int i4 = 128; i4 > 0; i4 >>>= 1) {
                            for (int i5 = 0; i5 < 256; i5 = i + i4) {
                                i3++;
                                int i6 = j16.d0[i3];
                                i = i5;
                                while (i < i5 + i4) {
                                    int o0 = dq2.o0(i6 * iArr[r12]);
                                    iArr[i + i4] = iArr[i] - o0;
                                    iArr[i] = iArr[i] + o0;
                                    i++;
                                }
                            }
                        }
                        i2++;
                    }
                }
            default:
                int i7 = 0;
                while (true) {
                    g73[] g73VarArr = (g73[]) this.J;
                    if (i7 >= g73VarArr.length) {
                        break;
                    } else {
                        g73 g73Var = g73VarArr[i7];
                        short[] sArr = (short[]) g73Var.J;
                        int i8 = 1;
                        for (int i9 = 128; i9 >= 2; i9 >>= 1) {
                            int i10 = 0;
                            while (i10 < 256) {
                                int i11 = i8 + 1;
                                short s = qg5.q[i8];
                                int i12 = i10;
                                while (i12 < i10 + i9) {
                                    short s2 = sArr[i12];
                                    int i13 = i12 + i9;
                                    short U = lq2.U(sArr[i13] * s);
                                    sArr[i13] = (short) (s2 - U);
                                    sArr[i12] = (short) (s2 + U);
                                    i12++;
                                }
                                i10 = i12 + i9;
                                i8 = i11;
                            }
                        }
                        g73Var.v();
                        i7++;
                    }
                }
        }
    }

    public void s(g73 g73Var) {
        int i = 0;
        while (true) {
            x81[] x81VarArr = (x81[]) this.J;
            if (i >= x81VarArr.length) {
                return;
            }
            x81 x81Var = x81VarArr[i];
            x81 x81Var2 = ((x81[]) g73Var.J)[i];
            int[] iArr = (int[]) x81Var.b;
            int[] iArr2 = (int[]) x81Var2.b;
            for (int i2 = 0; i2 < 256; i2++) {
                int i3 = iArr[i2];
                int i4 = i3 + 4095;
                iArr[i2] = i4 >> 13;
                iArr2[i2] = i3 - (i4 & (-8192));
            }
            i++;
        }
    }

    public long t(ys3 ys3Var) {
        Context context = (Context) this.J;
        if (Build.VERSION.SDK_INT < 26) {
            return -1L;
        }
        try {
            Uri insert = context.getContentResolver().insert(nb5.a, new ContentValues(ys3Var.a));
            if (insert == null || insert.equals(Uri.EMPTY)) {
                throw new NullPointerException("Channel insertion failed");
            }
            long parseId = ContentUris.parseId(insert);
            if (a(parseId, ys3Var)) {
                return parseId;
            }
            context.getContentResolver().delete(TvContract.buildChannelUri(parseId), null, null);
            throw new IOException("Failed to add logo, so channel (ID=" + parseId + ") was not created");
        } catch (SecurityException e) {
            Log.e("PreviewChannelHelper", "Your app's ability to insert data into the TvProvider may have been revoked.", e);
            return -1L;
        }
    }

    public long u(at3 at3Var) {
        if (Build.VERSION.SDK_INT < 26) {
            return -1L;
        }
        try {
            return ContentUris.parseId(((Context) this.J).getContentResolver().insert(ob5.a, at3Var.b()));
        } catch (SecurityException e) {
            Log.e("PreviewChannelHelper", "Your app's ability to insert data into the TvProvider may have been revoked.", e);
            return -1L;
        }
    }

    public void v() {
        switch (this.I) {
            case 4:
                break;
            default:
                int i = 0;
                while (true) {
                    x81[] x81VarArr = (x81[]) this.J;
                    if (i >= x81VarArr.length) {
                        return;
                    }
                    int[] iArr = (int[]) x81VarArr[i].b;
                    for (int i2 = 0; i2 < 256; i2++) {
                        int i3 = iArr[i2];
                        iArr[i2] = i3 - (((4194304 + i3) >> 23) * 8380417);
                    }
                    i++;
                }
        }
        for (int i4 = 0; i4 < 256; i4++) {
            short[] sArr = (short[]) this.J;
            short s = sArr[i4];
            sArr[i4] = (short) (s - ((short) (((short) ((s * 20159) >> 26)) * 3329)));
        }
    }

    public void w() {
        ts2 ts2Var = (ts2) this.J;
        ts2Var.a.d();
        ts2Var.b.d();
        ts2Var.c = 0L;
    }

    public void x(String str) {
        ((ViewStructure) this.J).setClassName(str);
    }

    public void y(String str) {
        ((ViewStructure) this.J).setContentDescription(str);
    }

    public void z(int i, int i2, int i3, int i4) {
        ((ViewStructure) this.J).setDimens(i, i2, 0, 0, i3, i4);
    }

    public /* synthetic */ g73(byte b, boolean z) {
        this.I = b;
    }

    public g73(us2 us2Var) {
        this.I = (byte) 7;
        int i = us2Var.c;
        byte b = us2Var.d;
        this.J = new g73[i];
        for (int i2 = 0; i2 < i; i2++) {
            ((g73[]) this.J)[i2] = new g73(us2Var, (int) b);
        }
    }

    public g73(us2 us2Var, int i) {
        this.I = (byte) 5;
        this.J = new x81[i];
        for (int i2 = 0; i2 < i; i2++) {
            ((x81[]) this.J)[i2] = new x81(us2Var);
        }
    }

    public /* synthetic */ g73(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    public g73(sz4 sz4Var) {
        this.I = (byte) 10;
        sz4Var.getClass();
        this.J = sz4Var;
    }

    public g73(mw5 mw5Var, nu5 nu5Var, l95 l95Var) {
        this.I = (byte) 20;
        this.J = nu5Var;
    }

    public g73(byte b) {
        this.I = b;
        switch (b) {
            case 16:
                this.J = new ts2();
                break;
            default:
                this.J = new short[256];
                break;
        }
    }

    public g73(float f, float f2) {
        this.I = (byte) 15;
        this.J = new vf1(f, f2);
    }
}

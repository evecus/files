package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.b;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class zw4 extends i42 implements o62 {
    public final i62 s;
    public final pz5 t;
    public final c8 u;
    public final o63 v;
    public int w;
    public final n62 x;
    public final t62 y;

    public zw4(i62 i62Var, pz5 pz5Var, c8 c8Var, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        this.s = i62Var;
        this.t = pz5Var;
        this.u = c8Var;
        this.v = i62Var.b;
        this.w = -1;
        n62 n62Var = i62Var.a;
        this.x = n62Var;
        this.y = n62Var.d ? null : new t62(serialDescriptor);
    }

    @Override // defpackage.i42, defpackage.le0
    public final Object A(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        g72 g72Var = (g72) this.u.d;
        serialDescriptor.getClass();
        kSerializer.getClass();
        boolean z = this.t == pz5.M && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) g72Var.e;
            int i2 = g72Var.b;
            if (iArr[i2] == -2) {
                ((Object[]) g72Var.d)[i2] = k04.W;
            }
        }
        Object s = s(kSerializer);
        if (z) {
            int[] iArr2 = (int[]) g72Var.e;
            int i3 = g72Var.b;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                g72Var.b = i4;
                if (i4 == ((Object[]) g72Var.d).length) {
                    g72Var.b();
                }
            }
            Object[] objArr = (Object[]) g72Var.d;
            int i5 = g72Var.b;
            objArr[i5] = ((n62) g72Var.c).j ? s : k04.V;
            ((int[]) g72Var.e)[i5] = -2;
        }
        return s;
    }

    @Override // defpackage.i42, kotlinx.serialization.encoding.Decoder
    public final byte B() {
        c8 c8Var = this.u;
        long j = c8Var.j();
        byte b = (byte) j;
        if (j == b) {
            return b;
        }
        c8.s(c8Var, "Failed to parse byte for input '" + j + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.i42, kotlinx.serialization.encoding.Decoder
    public final short C() {
        c8 c8Var = this.u;
        long j = c8Var.j();
        short s = (short) j;
        if (j == s) {
            return s;
        }
        c8.s(c8Var, "Failed to parse short for input '" + j + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.i42, kotlinx.serialization.encoding.Decoder
    public final float D() {
        c8 c8Var = this.u;
        String m = c8Var.m();
        try {
            float parseFloat = Float.parseFloat(m);
            if (Math.abs(parseFloat) <= Float.MAX_VALUE) {
                return parseFloat;
            }
            c8.s(c8Var, mu0.O(Float.valueOf(parseFloat), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            c8.s(c8Var, hf1.t('\'', "Failed to parse type 'float' for input '", m), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.i42, kotlinx.serialization.encoding.Decoder
    public final double E() {
        c8 c8Var = this.u;
        String m = c8Var.m();
        try {
            double parseDouble = Double.parseDouble(m);
            if (Math.abs(parseDouble) <= Double.MAX_VALUE) {
                return parseDouble;
            }
            c8.s(c8Var, mu0.O(Double.valueOf(parseDouble), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            c8.s(c8Var, hf1.t('\'', "Failed to parse type 'double' for input '", m), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.i42, defpackage.le0
    public final void a(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor.f() == 0 && qb.Q(this.s, serialDescriptor)) {
            while (v(serialDescriptor) != -1) {
            }
        }
        c8 c8Var = this.u;
        if (c8Var.P()) {
            mu0.H(c8Var, "");
            throw null;
        }
        c8Var.i(this.t.J);
        g72 g72Var = (g72) c8Var.d;
        int i = g72Var.b;
        int[] iArr = (int[]) g72Var.e;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            i--;
            g72Var.b = i;
        }
        if (i != -1) {
            g72Var.b = i - 1;
        }
    }

    @Override // defpackage.le0
    public final o63 b() {
        return this.v;
    }

    @Override // defpackage.i42, kotlinx.serialization.encoding.Decoder
    public final le0 c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        i62 i62Var = this.s;
        pz5 p = li4.p(i62Var, serialDescriptor);
        c8 c8Var = this.u;
        g72 g72Var = (g72) c8Var.d;
        int i = g72Var.b + 1;
        g72Var.b = i;
        if (i == ((Object[]) g72Var.d).length) {
            g72Var.b();
        }
        ((Object[]) g72Var.d)[i] = serialDescriptor;
        c8Var.i(p.I);
        if (c8Var.E() != 4) {
            int ordinal = p.ordinal();
            return (ordinal == 1 || ordinal == 2 || ordinal == 3) ? new zw4(i62Var, p, c8Var, serialDescriptor) : (this.t == p && i62Var.a.d) ? this : new zw4(i62Var, p, c8Var, serialDescriptor);
        }
        c8.s(c8Var, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // defpackage.i42, kotlinx.serialization.encoding.Decoder
    public final boolean e() {
        boolean z;
        boolean z2;
        c8 c8Var = this.u;
        int O = c8Var.O();
        String str = (String) c8Var.g;
        if (O == str.length()) {
            c8.s(c8Var, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(O) == '\"') {
            O++;
            z = true;
        } else {
            z = false;
        }
        int I = c8Var.I(O);
        if (I >= str.length() || I == -1) {
            c8.s(c8Var, "EOF", 0, null, 6);
            throw null;
        }
        int i = I + 1;
        int charAt = str.charAt(I) | ' ';
        if (charAt == 102) {
            c8Var.e(i, "alse");
            z2 = false;
        } else {
            if (charAt != 116) {
                c8.s(c8Var, "Expected valid boolean literal prefix, but had '" + c8Var.m() + '\'', 0, null, 6);
                throw null;
            }
            c8Var.e(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (c8Var.b == str.length()) {
            c8.s(c8Var, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(c8Var.b) == '\"') {
            c8Var.b++;
            return z2;
        }
        c8.s(c8Var, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // defpackage.i42, kotlinx.serialization.encoding.Decoder
    public final char f() {
        c8 c8Var = this.u;
        String m = c8Var.m();
        if (m.length() == 1) {
            return m.charAt(0);
        }
        c8.s(c8Var, hf1.t('\'', "Expected single char, but got '", m), 0, null, 6);
        throw null;
    }

    @Override // defpackage.i42, kotlinx.serialization.encoding.Decoder
    public final int g(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return qb.K(serialDescriptor, this.s, p(), " at path ".concat(((g72) this.u.d).a()));
    }

    @Override // defpackage.o62
    public final b k() {
        return new o72(this.s.a, this.u).a();
    }

    @Override // defpackage.i42, kotlinx.serialization.encoding.Decoder
    public final int m() {
        c8 c8Var = this.u;
        long j = c8Var.j();
        int i = (int) j;
        if (j == i) {
            return i;
        }
        c8.s(c8Var, "Failed to parse int for input '" + j + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.i42, kotlinx.serialization.encoding.Decoder
    public final String p() {
        boolean z = this.x.c;
        c8 c8Var = this.u;
        return z ? c8Var.n() : c8Var.l();
    }

    @Override // defpackage.i42, kotlinx.serialization.encoding.Decoder
    public final long q() {
        return this.u.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    @Override // defpackage.i42, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(kotlinx.serialization.KSerializer r11) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zw4.s(kotlinx.serialization.KSerializer):java.lang.Object");
    }

    @Override // defpackage.i42, kotlinx.serialization.encoding.Decoder
    public final boolean u() {
        t62 t62Var = this.y;
        return ((t62Var != null ? t62Var.b : false) || this.u.Q(true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x011a, code lost:
    
        r14.a.a(r8);
     */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.String, java.lang.Throwable] */
    @Override // defpackage.le0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int v(kotlinx.serialization.descriptors.SerialDescriptor r20) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zw4.v(kotlinx.serialization.descriptors.SerialDescriptor):int");
    }

    @Override // defpackage.o62
    public final i62 w() {
        return this.s;
    }

    @Override // defpackage.i42, kotlinx.serialization.encoding.Decoder
    public final Decoder y(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return bx4.a(serialDescriptor) ? new p62(this.u, this.s) : this;
    }
}

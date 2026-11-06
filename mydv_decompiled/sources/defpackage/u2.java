package defpackage;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class u2 implements o62, Decoder, le0 {
    public final ArrayList a = new ArrayList();
    public boolean b;
    public final i62 c;
    public final String d;
    public final n62 e;

    public u2(i62 i62Var, String str) {
        this.c = i62Var;
        this.d = str;
        this.e = i62Var.a;
    }

    @Override // defpackage.le0
    public final Object A(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        this.a.add(S(serialDescriptor, i));
        kSerializer.getClass();
        Object s = s(kSerializer);
        if (!this.b) {
            U();
        }
        this.b = false;
        return s;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final byte B() {
        return I(U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final short C() {
        return P(U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final float D() {
        return L(U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final double E() {
        return K(U());
    }

    public abstract b F(String str);

    public final b G() {
        b F;
        String str = (String) o70.b1(this.a);
        return (str == null || (F = F(str)) == null) ? T() : F;
    }

    public final boolean H(Object obj) {
        String str = (String) obj;
        str.getClass();
        b F = F(str);
        if (!(F instanceof d)) {
            throw new q62(mu0.s(-1, "Expected " + s24.a(d.class).c() + ", but had " + s24.a(F.getClass()).c() + " as the serialized body of boolean", W(str), null, this.c.a.j ? mu0.N(F.toString(), -1).toString() : null));
        }
        d dVar = (d) F;
        try {
            m02 m02Var = r62.a;
            String c = dVar.c();
            String[] strArr = ex4.a;
            c.getClass();
            Boolean bool = c.equalsIgnoreCase("true") ? Boolean.TRUE : c.equalsIgnoreCase("false") ? Boolean.FALSE : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            X(dVar, "boolean", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(dVar, "boolean", str);
            throw null;
        }
    }

    public final byte I(Object obj) {
        String str = (String) obj;
        str.getClass();
        b F = F(str);
        if (!(F instanceof d)) {
            throw new q62(mu0.s(-1, "Expected " + s24.a(d.class).c() + ", but had " + s24.a(F.getClass()).c() + " as the serialized body of byte", W(str), null, this.c.a.j ? mu0.N(F.toString(), -1).toString() : null));
        }
        d dVar = (d) F;
        try {
            long b = r62.b(dVar);
            Byte valueOf = (-128 > b || b > 127) ? null : Byte.valueOf((byte) b);
            if (valueOf != null) {
                return valueOf.byteValue();
            }
            X(dVar, "byte", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(dVar, "byte", str);
            throw null;
        }
    }

    public final char J(Object obj) {
        String str = (String) obj;
        str.getClass();
        b F = F(str);
        if (!(F instanceof d)) {
            throw new q62(mu0.s(-1, "Expected " + s24.a(d.class).c() + ", but had " + s24.a(F.getClass()).c() + " as the serialized body of char", W(str), null, this.c.a.j ? mu0.N(F.toString(), -1).toString() : null));
        }
        d dVar = (d) F;
        try {
            String c = dVar.c();
            c.getClass();
            int length = c.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return c.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            X(dVar, "char", str);
            throw null;
        }
    }

    public final double K(Object obj) {
        String str = (String) obj;
        str.getClass();
        b F = F(str);
        boolean z = F instanceof d;
        i62 i62Var = this.c;
        if (!z) {
            throw new q62(mu0.s(-1, "Expected " + s24.a(d.class).c() + ", but had " + s24.a(F.getClass()).c() + " as the serialized body of double", W(str), null, i62Var.a.j ? mu0.N(F.toString(), -1).toString() : null));
        }
        d dVar = (d) F;
        try {
            m02 m02Var = r62.a;
            double parseDouble = Double.parseDouble(dVar.c());
            if (Math.abs(parseDouble) <= Double.MAX_VALUE) {
                return parseDouble;
            }
            throw new q62(mu0.s(-1, mu0.O(Double.valueOf(parseDouble), str), null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", i62Var.a.j ? mu0.N(G().toString(), -1).toString() : null));
        } catch (IllegalArgumentException unused) {
            X(dVar, "double", str);
            throw null;
        }
    }

    public final float L(Object obj) {
        String str = (String) obj;
        str.getClass();
        b F = F(str);
        boolean z = F instanceof d;
        i62 i62Var = this.c;
        if (!z) {
            throw new q62(mu0.s(-1, "Expected " + s24.a(d.class).c() + ", but had " + s24.a(F.getClass()).c() + " as the serialized body of float", W(str), null, i62Var.a.j ? mu0.N(F.toString(), -1).toString() : null));
        }
        d dVar = (d) F;
        try {
            m02 m02Var = r62.a;
            float parseFloat = Float.parseFloat(dVar.c());
            if (Math.abs(parseFloat) <= Float.MAX_VALUE) {
                return parseFloat;
            }
            throw new q62(mu0.s(-1, mu0.O(Float.valueOf(parseFloat), str), null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", i62Var.a.j ? mu0.N(G().toString(), -1).toString() : null));
        } catch (IllegalArgumentException unused) {
            X(dVar, "float", str);
            throw null;
        }
    }

    public final Decoder M(Object obj, SerialDescriptor serialDescriptor) {
        String str = (String) obj;
        str.getClass();
        serialDescriptor.getClass();
        if (!bx4.a(serialDescriptor)) {
            this.a.add(str);
            return this;
        }
        b F = F(str);
        String a = serialDescriptor.a();
        boolean z = F instanceof d;
        i62 i62Var = this.c;
        if (z) {
            return new p62(oh4.b(i62Var, ((d) F).c()), i62Var);
        }
        throw new q62(mu0.s(-1, "Expected " + s24.a(d.class).c() + ", but had " + s24.a(F.getClass()).c() + " as the serialized body of " + a, W(str), null, i62Var.a.j ? mu0.N(F.toString(), -1).toString() : null));
    }

    public final int N(Object obj) {
        String str = (String) obj;
        str.getClass();
        b F = F(str);
        if (!(F instanceof d)) {
            throw new q62(mu0.s(-1, "Expected " + s24.a(d.class).c() + ", but had " + s24.a(F.getClass()).c() + " as the serialized body of int", W(str), null, this.c.a.j ? mu0.N(F.toString(), -1).toString() : null));
        }
        d dVar = (d) F;
        try {
            long b = r62.b(dVar);
            Integer valueOf = (-2147483648L > b || b > 2147483647L) ? null : Integer.valueOf((int) b);
            if (valueOf != null) {
                return valueOf.intValue();
            }
            X(dVar, "int", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(dVar, "int", str);
            throw null;
        }
    }

    public final long O(Object obj) {
        String str = (String) obj;
        str.getClass();
        b F = F(str);
        if (F instanceof d) {
            d dVar = (d) F;
            try {
                return r62.b(dVar);
            } catch (IllegalArgumentException unused) {
                this.X(dVar, "long", str);
                throw null;
            }
        }
        throw new q62(mu0.s(-1, "Expected " + s24.a(d.class).c() + ", but had " + s24.a(F.getClass()).c() + " as the serialized body of long", W(str), null, this.c.a.j ? mu0.N(F.toString(), -1).toString() : null));
    }

    public final short P(Object obj) {
        String str = (String) obj;
        str.getClass();
        b F = F(str);
        if (!(F instanceof d)) {
            throw new q62(mu0.s(-1, "Expected " + s24.a(d.class).c() + ", but had " + s24.a(F.getClass()).c() + " as the serialized body of short", W(str), null, this.c.a.j ? mu0.N(F.toString(), -1).toString() : null));
        }
        d dVar = (d) F;
        try {
            long b = r62.b(dVar);
            Short valueOf = (-32768 > b || b > 32767) ? null : Short.valueOf((short) b);
            if (valueOf != null) {
                return valueOf.shortValue();
            }
            X(dVar, "short", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(dVar, "short", str);
            throw null;
        }
    }

    public final String Q(Object obj) {
        String str = (String) obj;
        str.getClass();
        b F = F(str);
        boolean z = F instanceof d;
        i62 i62Var = this.c;
        if (!z) {
            throw new q62(mu0.s(-1, "Expected " + s24.a(d.class).c() + ", but had " + s24.a(F.getClass()).c() + " as the serialized body of string", W(str), null, i62Var.a.j ? mu0.N(F.toString(), -1).toString() : null));
        }
        d dVar = (d) F;
        if (!(dVar instanceof a72)) {
            throw new q62(mu0.s(-1, r7.C("Expected string value for a non-null key '", str, "', got null literal instead"), W(str), "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.", i62Var.a.j ? mu0.N(G().toString(), -1).toString() : null));
        }
        a72 a72Var = (a72) dVar;
        if (a72Var.I || i62Var.a.c) {
            return a72Var.J;
        }
        throw new q62(mu0.s(-1, r7.C("String literal for value of key '", str, "' should be quoted"), W(str), "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", i62Var.a.j ? mu0.N(G().toString(), -1).toString() : null));
    }

    public String R(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return serialDescriptor.g(i);
    }

    public final String S(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        String R = R(serialDescriptor, i);
        R.getClass();
        return R;
    }

    public abstract b T();

    public final Object U() {
        ArrayList arrayList = this.a;
        Object remove = arrayList.remove(arrayList.size() - 1);
        this.b = true;
        return remove;
    }

    public final String V() {
        ArrayList arrayList = this.a;
        return arrayList.isEmpty() ? "$" : o70.Z0(arrayList, ".", "$.", null, 0, null, 60);
    }

    public final String W(String str) {
        str.getClass();
        return V() + '.' + str;
    }

    public final void X(d dVar, String str, String str2) {
        throw new q62(mu0.s(-1, "Failed to parse literal '" + dVar + "' as " + (qx4.y(str, CmcdData.OBJECT_TYPE_INIT_SEGMENT, false) ? "an " : "a ").concat(str) + " value", W(str2), null, this.c.a.j ? mu0.N(G().toString(), -1).toString() : null));
    }

    public void a(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
    }

    @Override // defpackage.le0
    public final o63 b() {
        return this.c.b;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public le0 c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        b G = G();
        qi4 e = serialDescriptor.e();
        boolean c = j42.c(e, sx4.e);
        i62 i62Var = this.c;
        if (c || (e instanceof eq3)) {
            String a = serialDescriptor.a();
            if (G instanceof a) {
                return new k72(i62Var, (a) G);
            }
            throw new q62(mu0.s(-1, "Expected " + s24.a(a.class).c() + ", but had " + s24.a(G.getClass()).c() + " as the serialized body of " + a, V(), null, i62Var.a.j ? mu0.N(G.toString(), -1).toString() : null));
        }
        if (!j42.c(e, sx4.f)) {
            String a2 = serialDescriptor.a();
            if (G instanceof c) {
                return new j72(i62Var, (c) G, this.d, 8);
            }
            throw new q62(mu0.s(-1, "Expected " + s24.a(c.class).c() + ", but had " + s24.a(G.getClass()).c() + " as the serialized body of " + a2, V(), null, i62Var.a.j ? mu0.N(G.toString(), -1).toString() : null));
        }
        SerialDescriptor c2 = li4.c(i62Var.b, serialDescriptor.i(0));
        qi4 e2 = c2.e();
        if (!(e2 instanceof it3) && !j42.c(e2, xj4.d)) {
            throw mu0.d(c2);
        }
        String a3 = serialDescriptor.a();
        if (G instanceof c) {
            return new l72(i62Var, (c) G);
        }
        throw new q62(mu0.s(-1, "Expected " + s24.a(c.class).c() + ", but had " + s24.a(G.getClass()).c() + " as the serialized body of " + a3, V(), null, i62Var.a.j ? mu0.N(G.toString(), -1).toString() : null));
    }

    @Override // defpackage.le0
    public final Decoder d(gt3 gt3Var, int i) {
        return M(S(gt3Var, i), gt3Var.i(i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean e() {
        return H(U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final char f() {
        return J(U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int g(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        String str = (String) U();
        str.getClass();
        b F = F(str);
        String a = serialDescriptor.a();
        boolean z = F instanceof d;
        i62 i62Var = this.c;
        if (z) {
            return qb.K(serialDescriptor, i62Var, ((d) F).c(), "");
        }
        throw new q62(mu0.s(-1, "Expected " + s24.a(d.class).c() + ", but had " + s24.a(F.getClass()).c() + " as the serialized body of " + a, W(str), null, i62Var.a.j ? mu0.N(F.toString(), -1).toString() : null));
    }

    @Override // defpackage.le0
    public final long h(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return O(S(serialDescriptor, i));
    }

    @Override // defpackage.le0
    public final char i(gt3 gt3Var, int i) {
        return J(S(gt3Var, i));
    }

    @Override // defpackage.le0
    public final float j(gt3 gt3Var, int i) {
        return L(S(gt3Var, i));
    }

    @Override // defpackage.o62
    public final b k() {
        return G();
    }

    @Override // defpackage.le0
    public final byte l(gt3 gt3Var, int i) {
        return I(S(gt3Var, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int m() {
        return N(U());
    }

    @Override // defpackage.le0
    public final short n(gt3 gt3Var, int i) {
        return P(S(gt3Var, i));
    }

    @Override // defpackage.le0
    public final int o(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return N(S(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final String p() {
        return Q(U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final long q() {
        return O(U());
    }

    @Override // defpackage.le0
    public final boolean r(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return H(S(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Object s(KSerializer kSerializer) {
        String str;
        kSerializer.getClass();
        if (!(kSerializer instanceof c4)) {
            return kSerializer.deserialize(this);
        }
        fq3 fq3Var = (fq3) ((c4) kSerializer);
        SerialDescriptor descriptor = fq3Var.getDescriptor();
        i62 i62Var = this.c;
        String n = ut0.n(i62Var, descriptor);
        b G = G();
        String a = fq3Var.getDescriptor().a();
        if (!(G instanceof c)) {
            throw new q62(mu0.s(-1, "Expected " + s24.a(c.class).c() + ", but had " + s24.a(G.getClass()).c() + " as the serialized body of " + a, V(), null, i62Var.a.j ? mu0.N(G.toString(), -1).toString() : null));
        }
        c cVar = (c) G;
        b bVar = (b) cVar.get(n);
        try {
            if (bVar != null) {
                d a2 = r62.a(bVar);
                if (!(a2 instanceof JsonNull)) {
                    str = a2.c();
                    vt0.r((c4) kSerializer, this, str);
                    throw null;
                }
            }
            vt0.r((c4) kSerializer, this, str);
            throw null;
        } catch (zj4 e) {
            String message = e.getMessage();
            message.getClass();
            throw new q62(mu0.s(-1, message, null, null, i62Var.a.j ? mu0.N(cVar.toString(), -1).toString() : null));
        }
        str = null;
    }

    @Override // defpackage.le0
    public final String t(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return Q(S(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean u() {
        return !(G() instanceof JsonNull);
    }

    @Override // defpackage.o62
    public final i62 w() {
        return this.c;
    }

    @Override // defpackage.le0
    public final Object x(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        this.a.add(S(serialDescriptor, i));
        Object s = (kSerializer.getDescriptor().c() || u()) ? s(kSerializer) : null;
        if (!this.b) {
            U();
        }
        this.b = false;
        return s;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Decoder y(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (o70.b1(this.a) != null) {
            return M(U(), serialDescriptor);
        }
        return new h72(this.c, T(), this.d).y(serialDescriptor);
    }

    @Override // defpackage.le0
    public final double z(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return K(S(serialDescriptor, i));
    }
}

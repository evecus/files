package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public abstract class v3 implements e8 {
    public static final y2 a = new y2();
    public static final w2 b = new w2();
    public static final x2 c = new x2();
    public static final v2 d = new v2();
    public static final int[] e = new int[0];
    public static final long[] f = new long[0];
    public static final double[] g = new double[0];

    public static f2 A(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long G = aVar.G(spliterator);
        if (G < 0 || !spliterator.hasCharacteristics(16384)) {
            l0 l0Var = new l0();
            l0Var.a = intFunction;
            f2 f2Var = (f2) new l2(aVar, spliterator, l0Var, new g2((byte) 7), (byte) 3).invoke();
            return z ? I(f2Var, intFunction) : f2Var;
        }
        if (G >= 2147483639) {
            j$.time.h.c("Stream size exceeds max array size");
            return null;
        }
        Object[] objArr = (Object[]) intFunction.apply((int) G);
        new q3(spliterator, aVar, objArr).invoke();
        return new j2(objArr);
    }

    public static z1 B(a aVar, Spliterator spliterator, boolean z) {
        long G = aVar.G(spliterator);
        if (G < 0 || !spliterator.hasCharacteristics(16384)) {
            z1 z1Var = (z1) new l2(aVar, spliterator, new g2((byte) 1), new g2((byte) 2), (byte) 0).invoke();
            return z ? J(z1Var) : z1Var;
        }
        if (G >= 2147483639) {
            j$.time.h.c("Stream size exceeds max array size");
            return null;
        }
        double[] dArr = new double[(int) G];
        new n3(spliterator, aVar, dArr).invoke();
        return new s2(dArr);
    }

    public static b2 C(a aVar, Spliterator spliterator, boolean z) {
        long G = aVar.G(spliterator);
        if (G < 0 || !spliterator.hasCharacteristics(16384)) {
            b2 b2Var = (b2) new l2(aVar, spliterator, new g2((byte) 3), new g2((byte) 4), (byte) 1).invoke();
            return z ? K(b2Var) : b2Var;
        }
        if (G >= 2147483639) {
            j$.time.h.c("Stream size exceeds max array size");
            return null;
        }
        int[] iArr = new int[(int) G];
        new o3(spliterator, aVar, iArr).invoke();
        return new b3(iArr);
    }

    public static d2 D(a aVar, Spliterator spliterator, boolean z) {
        long G = aVar.G(spliterator);
        if (G < 0 || !spliterator.hasCharacteristics(16384)) {
            d2 d2Var = (d2) new l2(aVar, spliterator, new g2((byte) 5), new g2((byte) 6), (byte) 2).invoke();
            return z ? L(d2Var) : d2Var;
        }
        if (G >= 2147483639) {
            j$.time.h.c("Stream size exceeds max array size");
            return null;
        }
        long[] jArr = new long[(int) G];
        new p3(spliterator, aVar, jArr).invoke();
        return new k3(jArr);
    }

    public static i2 E(z6 z6Var, f2 f2Var, f2 f2Var2) {
        int i = h2.a[z6Var.ordinal()];
        if (i == 1) {
            return new r2(f2Var, f2Var2);
        }
        if (i == 2) {
            return new o2((b2) f2Var, (b2) f2Var2);
        }
        if (i == 3) {
            return new p2((d2) f2Var, (d2) f2Var2);
        }
        if (i == 4) {
            return new n2((z1) f2Var, (z1) f2Var2);
        }
        throw new IllegalStateException("Unknown shape " + z6Var);
    }

    public static u1 F(long j) {
        return (j < 0 || j >= 2147483639) ? new u2() : new t2(j);
    }

    public static z2 G(z6 z6Var) {
        int i = h2.a[z6Var.ordinal()];
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            return b;
        }
        if (i == 3) {
            return c;
        }
        if (i == 4) {
            return d;
        }
        throw new IllegalStateException("Unknown shape " + z6Var);
    }

    public static int H(long j) {
        return (j != -1 ? y6.u : 0) | y6.t;
    }

    public static f2 I(f2 f2Var, IntFunction intFunction) {
        if (f2Var.o() <= 0) {
            return f2Var;
        }
        long count = f2Var.count();
        if (count >= 2147483639) {
            j$.time.h.c("Stream size exceeds max array size");
            return null;
        }
        Object[] objArr = (Object[]) intFunction.apply((int) count);
        new u3(f2Var, objArr, (byte) 1).invoke();
        return new j2(objArr);
    }

    public static z1 J(z1 z1Var) {
        if (z1Var.o() <= 0) {
            return z1Var;
        }
        long count = z1Var.count();
        if (count >= 2147483639) {
            j$.time.h.c("Stream size exceeds max array size");
            return null;
        }
        double[] dArr = new double[(int) count];
        new t3(z1Var, dArr, (byte) 0).invoke();
        return new s2(dArr);
    }

    public static b2 K(b2 b2Var) {
        if (b2Var.o() <= 0) {
            return b2Var;
        }
        long count = b2Var.count();
        if (count >= 2147483639) {
            j$.time.h.c("Stream size exceeds max array size");
            return null;
        }
        int[] iArr = new int[(int) count];
        new t3(b2Var, iArr, (byte) 0).invoke();
        return new b3(iArr);
    }

    public static d2 L(d2 d2Var) {
        if (d2Var.o() <= 0) {
            return d2Var;
        }
        long count = d2Var.count();
        if (count >= 2147483639) {
            j$.time.h.c("Stream size exceeds max array size");
            return null;
        }
        long[] jArr = new long[(int) count];
        new t3(d2Var, jArr, (byte) 0).invoke();
        return new k3(jArr);
    }

    public static j$.util.p M(Function function) {
        j$.util.p pVar = new j$.util.p((byte) 5);
        pVar.b = function;
        return pVar;
    }

    public static v1 N(long j) {
        return (j < 0 || j >= 2147483639) ? new d3() : new c3(j);
    }

    public static w1 O(long j) {
        return (j < 0 || j >= 2147483639) ? new m3() : new l3(j);
    }

    public static j$.util.concurrent.r P(s1 s1Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(s1Var);
        return new j$.util.concurrent.r(z6.DOUBLE_VALUE, s1Var, new m1(s1Var, (byte) 2));
    }

    public static t5 Q(z zVar, long j, long j2) {
        if (j >= 0) {
            return new t5(zVar, H(j2), j, j2);
        }
        j$.time.h.a(j);
        return null;
    }

    public static j$.util.concurrent.r R(s1 s1Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(s1Var);
        return new j$.util.concurrent.r(z6.INT_VALUE, s1Var, new m1(s1Var, (byte) 1));
    }

    public static p5 S(a1 a1Var, long j, long j2) {
        if (j >= 0) {
            return new p5(a1Var, H(j2), j, j2);
        }
        j$.time.h.a(j);
        return null;
    }

    public static j$.util.concurrent.r T(s1 s1Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(s1Var);
        return new j$.util.concurrent.r(z6.LONG_VALUE, s1Var, new m1(s1Var, (byte) 0));
    }

    public static r5 U(i1 i1Var, long j, long j2) {
        if (j >= 0) {
            return new r5(i1Var, H(j2), j, j2);
        }
        j$.time.h.a(j);
        return null;
    }

    public static j$.util.concurrent.r V(s1 s1Var, Predicate predicate) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(s1Var);
        return new j$.util.concurrent.r(z6.REFERENCE, s1Var, new j$.util.concurrent.r((Object) s1Var, (Object) predicate, (byte) 5));
    }

    public static n5 W(d5 d5Var, long j, long j2) {
        if (j >= 0) {
            return new n5(d5Var, H(j2), j, j2);
        }
        j$.time.h.a(j);
        return null;
    }

    public static Spliterator Y(z6 z6Var, Spliterator spliterator, long j, long j2) {
        long z = z(j, j2);
        int i = u5.a[z6Var.ordinal()];
        if (i == 1) {
            return new s7(spliterator, j, z);
        }
        if (i == 2) {
            return new p7((j$.util.x0) spliterator, j, z);
        }
        if (i == 3) {
            return new q7((j$.util.a1) spliterator, j, z);
        }
        if (i == 4) {
            return new o7((j$.util.u0) spliterator, j, z);
        }
        throw new IllegalStateException("Unknown shape " + z6Var);
    }

    public static a5 Z(Spliterator spliterator, boolean z) {
        Objects.requireNonNull(spliterator);
        return new a5(spliterator, y6.f(spliterator), z);
    }

    public static void c() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void d(i5 i5Var, Double d2) {
        if (g8.a) {
            g8.a(i5Var.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        i5Var.accept(d2.doubleValue());
    }

    public static void g(j5 j5Var, Integer num) {
        if (g8.a) {
            g8.a(j5Var.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        j5Var.accept(num.intValue());
    }

    public static void i(k5 k5Var, Long l) {
        if (g8.a) {
            g8.a(k5Var.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        k5Var.accept(l.longValue());
    }

    public static void k() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void l() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static Object[] m(e2 e2Var, IntFunction intFunction) {
        if (g8.a) {
            g8.a(e2Var.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (e2Var.count() >= 2147483639) {
            j$.time.h.c("Stream size exceeds max array size");
            return null;
        }
        Object[] objArr = (Object[]) intFunction.apply((int) e2Var.count());
        e2Var.k(objArr, 0);
        return objArr;
    }

    public static void n(z1 z1Var, Double[] dArr, int i) {
        if (g8.a) {
            g8.a(z1Var.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) z1Var.b();
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            dArr[i + i2] = Double.valueOf(dArr2[i2]);
        }
    }

    public static void o(b2 b2Var, Integer[] numArr, int i) {
        if (g8.a) {
            g8.a(b2Var.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) b2Var.b();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = Integer.valueOf(iArr[i2]);
        }
    }

    public static void p(d2 d2Var, Long[] lArr, int i) {
        if (g8.a) {
            g8.a(d2Var.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) d2Var.b();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i + i2] = Long.valueOf(jArr[i2]);
        }
    }

    public static void q(z1 z1Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            z1Var.g((DoubleConsumer) consumer);
        } else {
            if (g8.a) {
                g8.a(z1Var.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.u0) z1Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void r(b2 b2Var, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            b2Var.g((IntConsumer) consumer);
        } else {
            if (g8.a) {
                g8.a(b2Var.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.x0) b2Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void s(d2 d2Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            d2Var.g((LongConsumer) consumer);
        } else {
            if (g8.a) {
                g8.a(d2Var.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.a1) d2Var.spliterator()).forEachRemaining(consumer);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static z1 t(z1 z1Var, long j, long j2) {
        if (j == 0 && j2 == z1Var.count()) {
            return z1Var;
        }
        long j3 = j2 - j;
        j$.util.u0 u0Var = (j$.util.u0) z1Var.spliterator();
        u1 F = F(j3);
        F.c(j3);
        Object[] objArr = 0;
        for (int i = 0; i < j && u0Var.tryAdvance(new y1(objArr == true ? 1 : 0)); i++) {
        }
        if (j2 == z1Var.count()) {
            u0Var.forEachRemaining((DoubleConsumer) F);
        } else {
            for (int i2 = 0; i2 < j3 && u0Var.tryAdvance((DoubleConsumer) F); i2++) {
            }
        }
        F.end();
        return F.build();
    }

    public static b2 u(b2 b2Var, long j, long j2) {
        if (j == 0 && j2 == b2Var.count()) {
            return b2Var;
        }
        long j3 = j2 - j;
        j$.util.x0 x0Var = (j$.util.x0) b2Var.spliterator();
        v1 N = N(j3);
        N.c(j3);
        for (int i = 0; i < j && x0Var.tryAdvance((IntConsumer) new a2((byte) 0)); i++) {
        }
        if (j2 == b2Var.count()) {
            x0Var.forEachRemaining((IntConsumer) N);
        } else {
            for (int i2 = 0; i2 < j3 && x0Var.tryAdvance((IntConsumer) N); i2++) {
            }
        }
        N.end();
        return N.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static d2 v(d2 d2Var, long j, long j2) {
        if (j == 0 && j2 == d2Var.count()) {
            return d2Var;
        }
        long j3 = j2 - j;
        j$.util.a1 a1Var = (j$.util.a1) d2Var.spliterator();
        w1 O = O(j3);
        O.c(j3);
        Object[] objArr = 0;
        for (int i = 0; i < j && a1Var.tryAdvance(new c2(objArr == true ? 1 : 0)); i++) {
        }
        if (j2 == d2Var.count()) {
            a1Var.forEachRemaining((LongConsumer) O);
        } else {
            for (int i2 = 0; i2 < j3 && a1Var.tryAdvance((LongConsumer) O); i2++) {
            }
        }
        O.end();
        return O.build();
    }

    public static f2 w(f2 f2Var, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == f2Var.count()) {
            return f2Var;
        }
        Spliterator spliterator = f2Var.spliterator();
        long j3 = j2 - j;
        x1 x = x(j3, intFunction);
        x.c(j3);
        for (int i = 0; i < j && spliterator.tryAdvance(new f0((byte) 29)); i++) {
        }
        if (j2 == f2Var.count()) {
            spliterator.forEachRemaining(x);
        } else {
            for (int i2 = 0; i2 < j3 && spliterator.tryAdvance(x); i2++) {
            }
        }
        x.end();
        return x.build();
    }

    public static x1 x(long j, IntFunction intFunction) {
        return (j < 0 || j >= 2147483639) ? new s3() : new a3(j, intFunction);
    }

    public static long y(long j, long j2, long j3) {
        if (j >= 0) {
            return Math.max(-1L, Math.min(j - j2, j3));
        }
        return -1L;
    }

    public static long z(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        if (j3 >= 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    public abstract q4 X();

    @Override // j$.util.stream.e8
    public Object a(a aVar, Spliterator spliterator) {
        q4 X = X();
        aVar.R(spliterator, X);
        return X.get();
    }

    @Override // j$.util.stream.e8
    public Object b(a aVar, Spliterator spliterator) {
        return ((q4) new x4(this, aVar, spliterator).invoke()).get();
    }

    @Override // j$.util.stream.e8
    public int f() {
        return 0;
    }
}

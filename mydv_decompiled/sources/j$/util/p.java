package j$.util;

import j$.util.function.Function$CC;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import j$.util.stream.c8;
import j$.util.stream.j7;
import j$.util.stream.l5;
import j$.util.stream.l7;
import j$.util.stream.n7;
import j$.util.stream.w6;
import j$.util.stream.x6;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Consumer, Predicate, Supplier, DoubleFunction, Function, LongFunction, BooleanSupplier {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ p(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    public void a(x6 x6Var) {
        ((EnumMap) ((java.util.Map) this.b)).put((EnumMap) x6Var, (x6) 1);
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((Consumer) this.b).accept(new q((Map.Entry) obj));
                break;
            case 7:
                ((l5) this.b).accept((l5) obj);
                break;
            default:
                ((ArrayList) ((java.util.List) this.b)).add(obj);
                break;
        }
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return j$.time.a.b(this, predicate);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 0:
                break;
            case 7:
                break;
        }
        return j$.time.a.e(this, consumer);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Object apply = ((Function) this.b).apply(obj);
        if (apply == null) {
            return null;
        }
        if (apply instanceof Stream) {
            return Stream.Wrapper.convert((Stream) apply);
        }
        if (apply instanceof java.util.stream.Stream) {
            return w6.h((java.util.stream.Stream) apply);
        }
        if (apply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) apply);
        }
        if (apply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) apply);
        }
        if (apply instanceof j$.util.stream.c0) {
            return j$.util.stream.b0.h((j$.util.stream.c0) apply);
        }
        if (apply instanceof DoubleStream) {
            return j$.util.stream.a0.h((DoubleStream) apply);
        }
        if (apply instanceof j$.util.stream.l1) {
            return j$.util.stream.k1.h((j$.util.stream.l1) apply);
        }
        if (apply instanceof LongStream) {
            return j$.util.stream.j1.h((LongStream) apply);
        }
        f.a(apply.getClass(), "java.util.stream.*Stream");
        throw null;
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 2:
                return ((j$.util.stream.a) this.b).O(0);
            default:
                return (Spliterator) this.b;
        }
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 10:
                j7 j7Var = (j7) obj;
                return j7Var.d.tryAdvance(j7Var.e);
            case 11:
                l7 l7Var = (l7) obj;
                return l7Var.d.tryAdvance(l7Var.e);
            case 12:
                n7 n7Var = (n7) obj;
                return n7Var.d.tryAdvance(n7Var.e);
            default:
                c8 c8Var = (c8) obj;
                return c8Var.d.tryAdvance(c8Var.e);
        }
    }

    public Predicate negate() {
        return new p((byte) 1, this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return j$.time.a.v(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((Predicate) this.b).test(obj);
    }

    public /* synthetic */ p(byte b) {
        this.a = b;
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        Object apply = ((DoubleFunction) this.b).apply(d);
        if (apply == null) {
            return null;
        }
        if (apply instanceof j$.util.stream.c0) {
            return j$.util.stream.b0.h((j$.util.stream.c0) apply);
        }
        if (apply instanceof DoubleStream) {
            return j$.util.stream.a0.h((DoubleStream) apply);
        }
        f.a(apply.getClass(), "java.util.stream.DoubleStream");
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        Object apply = ((LongFunction) this.b).apply(j);
        if (apply == null) {
            return null;
        }
        if (apply instanceof j$.util.stream.l1) {
            return j$.util.stream.k1.h((j$.util.stream.l1) apply);
        }
        if (apply instanceof LongStream) {
            return j$.util.stream.j1.h((LongStream) apply);
        }
        f.a(apply.getClass(), "java.util.stream.LongStream");
        throw null;
    }
}

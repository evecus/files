package j$.util.concurrent;

import j$.util.Spliterator;
import j$.util.stream.e8;
import j$.util.stream.h7;
import j$.util.stream.n1;
import j$.util.stream.r1;
import j$.util.stream.s1;
import j$.util.stream.t1;
import j$.util.stream.y6;
import j$.util.stream.z6;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements BiConsumer, BiFunction, Consumer, Supplier, e8 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ r(BiFunction biFunction, Function function) {
        this.a = (byte) 2;
        this.c = biFunction;
        this.b = function;
    }

    @Override // j$.util.stream.e8
    public Object a(j$.util.stream.a aVar, Spliterator spliterator) {
        r1 r1Var = (r1) ((Supplier) this.c).get();
        aVar.R(spliterator, r1Var);
        return Boolean.valueOf(r1Var.b);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public void n(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 3:
                ((Consumer) obj3).n(obj);
                ((Consumer) obj2).n(obj);
                break;
            case 4:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj2;
                if (obj != null) {
                    concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
                    break;
                } else {
                    atomicBoolean.set(true);
                    break;
                }
            case 5:
            case 6:
            default:
                Consumer consumer = (Consumer) obj2;
                if (((h7) obj3).b.putIfAbsent(obj != null ? obj : h7.d, Boolean.TRUE) == null) {
                    consumer.n(obj);
                    break;
                }
                break;
            case 7:
                ((BiConsumer) obj3).accept(obj2, obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return j$.time.a.e(this, consumer);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((Function) this.b).apply(((BiFunction) this.c).apply(obj, obj2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.e8
    public Object b(j$.util.stream.a aVar, Spliterator spliterator) {
        return (Boolean) new t1(this, aVar, spliterator).invoke();
    }

    @Override // j$.util.stream.e8
    public int f() {
        return y6.u | y6.r;
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new n1((s1) this.b, (Predicate) this.c);
    }

    public /* synthetic */ r(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public r(z6 z6Var, s1 s1Var, Supplier supplier) {
        this.a = (byte) 6;
        this.b = s1Var;
        this.c = supplier;
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return j$.time.a.d(this, function);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
        }
        return j$.time.a.c(this, biConsumer);
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ConcurrentMap concurrentMap = (ConcurrentMap) obj4;
                BiFunction biFunction = (BiFunction) obj3;
                while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
                }
            default:
                ((BiConsumer) obj4).accept(obj, obj2);
                ((BiConsumer) obj3).accept(obj, obj2);
                break;
        }
    }
}

package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements Predicate, Supplier, IntFunction, IntBinaryOperator, ObjIntConsumer, BiConsumer, ToIntFunction, ObjLongConsumer, LongFunction, LongBinaryOperator, ToLongFunction, Consumer {
    public final /* synthetic */ byte a;

    public /* synthetic */ f0(byte b) {
        this.a = b;
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 10:
                ((j$.util.x) obj).a((j$.util.x) obj2);
                break;
            case 15:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                break;
            case 19:
                ((j$.util.z) obj).a((j$.util.z) obj2);
                break;
            default:
                long[] jArr3 = (long[]) obj;
                long[] jArr4 = (long[]) obj2;
                jArr3[0] = jArr3[0] + jArr4[0];
                jArr3[1] = jArr3[1] + jArr4[1];
                break;
        }
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
        }
        return j$.time.a.b(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 10:
                break;
            case 15:
                break;
            case 19:
                break;
        }
        return j$.time.a.c(this, biConsumer);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 6:
                return new Object[i];
            case 7:
                return new Integer[i];
            case 17:
                return Integer.valueOf(i);
            default:
                return new Long[i];
        }
    }

    @Override // java.util.function.IntBinaryOperator
    public int applyAsInt(int i, int i2) {
        switch (this.a) {
            case 8:
                return Math.min(i, i2);
            case 11:
                return i + i2;
            default:
                return Math.max(i, i2);
        }
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j, long j2) {
        switch (this.a) {
            case 25:
                return Math.max(j, j2);
            case 26:
                return j + j2;
            default:
                return Math.min(j, j2);
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 1:
                return new g0();
            case 3:
                return new h0();
            case 5:
                return new i0();
            case 13:
                return new long[2];
            default:
                return new long[2];
        }
    }

    public Predicate negate() {
        switch (this.a) {
        }
        return new j$.util.p((byte) 1, this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
        }
        return j$.time.a.v(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((j$.util.c0) obj).a;
            case 1:
            default:
                return ((j$.util.a0) obj).a != null;
            case 2:
                return ((j$.util.d0) obj).a;
        }
    }

    @Override // java.util.function.ToIntFunction
    public int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // java.util.function.ToLongFunction
    public long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        return Long.valueOf(j);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.time.a.e(this, consumer);
    }

    @Override // java.util.function.ObjLongConsumer
    public void accept(Object obj, long j) {
        switch (this.a) {
            case 18:
                ((j$.util.z) obj).accept(j);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + j;
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public void n(Object obj) {
    }

    @Override // java.util.function.ObjIntConsumer
    public void accept(Object obj, int i) {
        switch (this.a) {
            case 9:
                ((j$.util.x) obj).accept(i);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + i;
                break;
        }
    }
}

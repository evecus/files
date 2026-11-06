package j$.time.format;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.TemporalUnit;
import j$.util.stream.e0;
import java.util.LinkedHashSet;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements IntFunction, Supplier, BiConsumer, DoubleFunction, ToDoubleFunction, DoubleBinaryOperator, ObjDoubleConsumer, Predicate {
    public final /* synthetic */ byte a;

    public /* synthetic */ a(byte b) {
        this.a = b;
    }

    public Object a(j$.time.temporal.m mVar) {
        byte b = this.a;
        a aVar = j$.time.temporal.q.a;
        switch (b) {
            case 0:
                j$.time.x xVar = (j$.time.x) mVar.i(aVar);
                if (xVar == null || (xVar instanceof j$.time.y)) {
                    return null;
                }
                return xVar;
            case 1:
                return (j$.time.x) mVar.i(aVar);
            case 2:
                return (j$.time.chrono.a) mVar.i(j$.time.temporal.q.b);
            case 3:
                return (TemporalUnit) mVar.i(j$.time.temporal.q.c);
            case 4:
                j$.time.temporal.a aVar2 = j$.time.temporal.a.OFFSET_SECONDS;
                if (mVar.c(aVar2)) {
                    return j$.time.y.x(mVar.d(aVar2));
                }
                return null;
            case 5:
                j$.time.x xVar2 = (j$.time.x) mVar.i(aVar);
                return xVar2 != null ? xVar2 : (j$.time.x) mVar.i(j$.time.temporal.q.d);
            case 6:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.EPOCH_DAY;
                if (mVar.c(aVar3)) {
                    return LocalDate.ofEpochDay(mVar.m(aVar3));
                }
                return null;
            default:
                j$.time.temporal.a aVar4 = j$.time.temporal.a.NANO_OF_DAY;
                if (mVar.c(aVar4)) {
                    return LocalTime.u(mVar.m(aVar4));
                }
                return null;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 13:
                ((LinkedHashSet) obj).add(obj2);
                break;
            case 14:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                break;
            case 15:
                ((j$.util.w) obj).a((j$.util.w) obj2);
                break;
            case 22:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                j$.util.stream.j.a(dArr, dArr2[0]);
                j$.util.stream.j.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
            default:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                j$.util.stream.j.a(dArr3, dArr4[0]);
                j$.util.stream.j.a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                break;
        }
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return j$.time.a.b(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 22:
                break;
        }
        return j$.time.a.c(this, biConsumer);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 8:
                return new Object[i];
            default:
                return new Double[i];
        }
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d, double d2) {
        switch (this.a) {
            case 19:
                return Math.max(d, d2);
            default:
                return Math.min(d, d2);
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 9:
                return new j$.util.w();
            case 10:
                return new j$.util.x();
            case 11:
                return new j$.util.z();
            case 12:
                return new LinkedHashSet();
            case 20:
                return new double[3];
            case 24:
                return new double[4];
            default:
                return new e0();
        }
    }

    public Predicate negate() {
        return new j$.util.p((byte) 1, this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return j$.time.a.v(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return ((j$.util.b0) obj).a;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "ZoneId";
            case 2:
                return "Chronology";
            case 3:
                return "Precision";
            case 4:
                return "ZoneOffset";
            case 5:
                return "Zone";
            case 6:
                return "LocalDate";
            case 7:
                return "LocalTime";
            default:
                return super.toString();
        }
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        return Double.valueOf(d);
    }

    @Override // java.util.function.ToDoubleFunction
    public double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d) {
        switch (this.a) {
            case 21:
                double[] dArr = (double[]) obj;
                j$.util.stream.j.a(dArr, d);
                dArr[2] = dArr[2] + d;
                break;
            case 25:
                double[] dArr2 = (double[]) obj;
                dArr2[2] = dArr2[2] + 1.0d;
                j$.util.stream.j.a(dArr2, d);
                dArr2[3] = dArr2[3] + d;
                break;
            default:
                ((j$.util.w) obj).accept(d);
                break;
        }
    }
}

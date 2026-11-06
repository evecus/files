package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class c8 extends a7 {
    @Override // j$.util.stream.a7
    public final void d() {
        v6 v6Var = new v6();
        this.h = v6Var;
        Objects.requireNonNull(v6Var);
        this.e = this.b.S(new b8(v6Var, (byte) 0));
        this.f = new j$.util.p((byte) 13, this);
    }

    @Override // j$.util.stream.a7
    public final a7 e(Spliterator spliterator) {
        return new c8(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(consumer)) {
            }
            return;
        }
        Objects.requireNonNull(consumer);
        c();
        Objects.requireNonNull(consumer);
        b8 b8Var = new b8(consumer, (byte) 1);
        this.b.R(this.d, b8Var);
        this.i = true;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean a = a();
        if (!a) {
            return a;
        }
        v6 v6Var = (v6) this.h;
        long j = this.g;
        if (v6Var.c != 0) {
            if (j >= v6Var.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            for (int i = 0; i <= v6Var.c; i++) {
                long j2 = v6Var.d[i];
                Object[] objArr = v6Var.f[i];
                if (j < objArr.length + j2) {
                    obj = objArr[(int) (j - j2)];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j >= v6Var.b) {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        obj = v6Var.e[(int) j];
        consumer.n(obj);
        return a;
    }
}

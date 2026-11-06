package j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class a3 extends j2 implements x1 {
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i >= objArr.length) {
            j$.time.h.g("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(objArr.length)});
        } else {
            this.b = i + 1;
            objArr[i] = obj;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.time.a.e(this, consumer);
    }

    @Override // j$.util.stream.x1
    public final f2 build() {
        int i = this.b;
        Object[] objArr = this.a;
        if (i >= objArr.length) {
            return this;
        }
        j$.time.h.g("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(i), Integer.valueOf(objArr.length)});
        return null;
    }

    @Override // j$.util.stream.l5
    public final void c(long j) {
        Object[] objArr = this.a;
        if (j == objArr.length) {
            this.b = 0;
        } else {
            j$.time.h.g("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j), Integer.valueOf(objArr.length)});
        }
    }

    @Override // j$.util.stream.l5
    public final boolean e() {
        return false;
    }

    @Override // j$.util.stream.l5
    public final void end() {
        int i = this.b;
        Object[] objArr = this.a;
        if (i >= objArr.length) {
            return;
        }
        j$.time.h.g("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(i), Integer.valueOf(objArr.length)});
    }

    @Override // j$.util.stream.j2
    public final String toString() {
        Object[] objArr = this.a;
        return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(objArr.length - this.b), Arrays.toString(objArr));
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(int i) {
        v3.k();
        throw null;
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(long j) {
        v3.l();
        throw null;
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(double d) {
        v3.c();
        throw null;
    }
}

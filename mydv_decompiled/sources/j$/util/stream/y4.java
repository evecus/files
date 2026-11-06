package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class y4 extends h5 {
    public final /* synthetic */ byte b = 0;
    public boolean c;
    public final Object d;
    public final /* synthetic */ a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(q qVar, l5 l5Var) {
        super(l5Var);
        this.e = qVar;
        l5 l5Var2 = this.a;
        Objects.requireNonNull(l5Var2);
        this.d = new j$.util.e0(l5Var2, (byte) 1);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        byte b = this.b;
        l5 l5Var = this.a;
        a aVar = this.e;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                j$.util.m0 m0Var = (j$.util.m0) obj2;
                l1 l1Var = (l1) ((j$.util.p) ((e1) aVar).m).apply((j$.util.p) obj);
                if (l1Var != null) {
                    try {
                        if (this.c) {
                            j$.util.a1 spliterator = l1Var.sequential().spliterator();
                            while (!l5Var.e() && spliterator.tryAdvance((LongConsumer) m0Var)) {
                            }
                        } else {
                            l1Var.sequential().forEach(m0Var);
                        }
                    } catch (Throwable th) {
                        try {
                            l1Var.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (l1Var != null) {
                    l1Var.close();
                    return;
                }
                return;
            case 1:
                j$.util.i0 i0Var = (j$.util.i0) obj2;
                IntStream intStream = (IntStream) ((j$.util.p) ((u0) aVar).m).apply((j$.util.p) obj);
                if (intStream != null) {
                    try {
                        if (this.c) {
                            j$.util.x0 spliterator2 = intStream.sequential().spliterator();
                            while (!l5Var.e() && spliterator2.tryAdvance((IntConsumer) i0Var)) {
                            }
                        } else {
                            intStream.sequential().forEach(i0Var);
                        }
                    } catch (Throwable th3) {
                        try {
                            intStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                j$.util.e0 e0Var = (j$.util.e0) obj2;
                c0 c0Var = (c0) ((j$.util.p) ((q) aVar).m).apply((j$.util.p) obj);
                if (c0Var != null) {
                    try {
                        if (this.c) {
                            j$.util.u0 spliterator3 = c0Var.sequential().spliterator();
                            while (!l5Var.e() && spliterator3.tryAdvance((DoubleConsumer) e0Var)) {
                            }
                        } else {
                            c0Var.sequential().forEach(e0Var);
                        }
                    } catch (Throwable th5) {
                        try {
                            c0Var.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                }
                if (c0Var != null) {
                    c0Var.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public final void c(long j) {
        switch (this.b) {
            case 0:
                this.a.c(-1L);
                break;
            case 1:
                this.a.c(-1L);
                break;
            default:
                this.a.c(-1L);
                break;
        }
    }

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public final boolean e() {
        switch (this.b) {
            case 0:
                this.c = true;
                break;
            case 1:
                this.c = true;
                break;
            default:
                this.c = true;
                break;
        }
        return this.a.e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(u0 u0Var, l5 l5Var) {
        super(l5Var);
        this.e = u0Var;
        l5 l5Var2 = this.a;
        Objects.requireNonNull(l5Var2);
        this.d = new j$.util.i0(l5Var2, (byte) 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(e1 e1Var, l5 l5Var) {
        super(l5Var);
        this.e = e1Var;
        l5 l5Var2 = this.a;
        Objects.requireNonNull(l5Var2);
        this.d = new j$.util.m0(l5Var2, (byte) 1);
    }
}

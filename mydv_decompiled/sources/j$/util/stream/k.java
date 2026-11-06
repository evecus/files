package j$.util.stream;

import j$.util.Spliterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class k extends h5 {
    public final /* synthetic */ byte b = 2;
    public boolean c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h8 h8Var, l5 l5Var) {
        super(l5Var);
        this.d = h8Var;
        this.c = true;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        byte b = this.b;
        l5 l5Var = this.a;
        switch (b) {
            case 0:
                if (obj == null) {
                    if (this.c) {
                        return;
                    }
                    this.c = true;
                    this.d = null;
                    l5Var.n((l5) null);
                    return;
                }
                Object obj2 = this.d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.d = obj;
                    l5Var.n((l5) obj);
                    return;
                }
                return;
            case 1:
                Stream stream = (Stream) ((j$.util.p) ((p) this.d).m).apply((j$.util.p) obj);
                if (stream != null) {
                    try {
                        if (this.c) {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!l5Var.e() && spliterator.tryAdvance(l5Var)) {
                            }
                        } else {
                            ((Stream) stream.sequential()).forEach(l5Var);
                        }
                    } catch (Throwable th) {
                        try {
                            stream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.c) {
                    boolean test = ((h8) this.d).m.test(obj);
                    this.c = test;
                    if (test) {
                        l5Var.n((l5) obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public final void c(long j) {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
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
    public boolean e() {
        switch (this.b) {
            case 1:
                this.c = true;
                return this.a.e();
            case 2:
                return !this.c || this.a.e();
            default:
                return super.e();
        }
    }

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public void end() {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                this.a.end();
                break;
            default:
                super.end();
                break;
        }
    }

    public /* synthetic */ k(l5 l5Var) {
        super(l5Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p pVar, l5 l5Var) {
        super(l5Var);
        this.d = pVar;
    }
}

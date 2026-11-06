package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public class u3 extends CountedCompleter {
    public final f2 a;
    public final int b;
    public final /* synthetic */ byte c;
    public final Object d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u3(u3 u3Var, f2 f2Var, int i) {
        this(u3Var, f2Var, i, (byte) 0);
        this.c = (byte) 1;
        this.d = (Object[]) u3Var.d;
    }

    public final u3 a(int i, int i2) {
        switch (this.c) {
            case 0:
                return new u3(this, ((e2) this.a).a(i), i2);
            default:
                return new u3(this, this.a.a(i), i2);
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        int i;
        while (this.a.o() != 0) {
            this.setPendingCount(this.a.o() - 1);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int o = this.a.o() - 1;
                i = this.b;
                if (i2 < o) {
                    u3 a = this.a(i2, i + i3);
                    i3 = (int) (a.a.count() + i3);
                    a.fork();
                    i2++;
                }
            }
            this = this.a(i2, i + i3);
        }
        switch (this.c) {
            case 0:
                ((e2) this.a).f(this.b, this.d);
                break;
            default:
                this.a.k((Object[]) this.d, this.b);
                break;
        }
        this.propagateCompletion();
    }

    public u3(u3 u3Var, f2 f2Var, int i, byte b) {
        super(u3Var);
        this.a = f2Var;
        this.b = i;
    }

    public u3(f2 f2Var, Object obj, byte b) {
        this.c = b;
        this.a = f2Var;
        this.b = 0;
        this.d = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u3(u3 u3Var, e2 e2Var, int i) {
        this(u3Var, e2Var, i, (byte) 0);
        this.c = (byte) 0;
        this.d = u3Var.d;
    }
}

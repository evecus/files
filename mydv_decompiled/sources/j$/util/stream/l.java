package j$.util.stream;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class l extends h5 {
    public final /* synthetic */ byte b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(a aVar, l5 l5Var, byte b) {
        super(l5Var);
        this.b = b;
        this.c = aVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        byte b = this.b;
        l5 l5Var = this.a;
        switch (b) {
            case 0:
                if (!((Set) this.c).contains(obj)) {
                    ((Set) this.c).add(obj);
                    l5Var.accept((l5) obj);
                    break;
                }
                break;
            case 1:
                ((Consumer) ((p) this.c).m).accept(obj);
                l5Var.accept((l5) obj);
                break;
            case 2:
                if (((Predicate) ((p) this.c).m).test(obj)) {
                    l5Var.accept((l5) obj);
                    break;
                }
                break;
            case 3:
                l5Var.accept((l5) ((Function) ((p) this.c).m).apply(obj));
                break;
            case 4:
                l5Var.accept(((ToIntFunction) ((u0) this.c).m).applyAsInt(obj));
                break;
            case 5:
                l5Var.accept(((ToLongFunction) ((e1) this.c).m).applyAsLong(obj));
                break;
            default:
                l5Var.accept(((ToDoubleFunction) ((q) this.c).m).applyAsDouble(obj));
                break;
        }
    }

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public void c(long j) {
        switch (this.b) {
            case 0:
                this.c = new HashSet();
                this.a.c(-1L);
                break;
            case 1:
            default:
                super.c(j);
                break;
            case 2:
                this.a.c(-1L);
                break;
        }
    }

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public void end() {
        switch (this.b) {
            case 0:
                this.c = null;
                this.a.end();
                break;
            default:
                super.end();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(l5 l5Var) {
        super(l5Var);
        this.b = (byte) 0;
    }
}

package defpackage;

import coil3.decode.BitmapFactoryDecoder;
import coil3.decode.DecodeResult;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class u32 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u32(hu2 hu2Var, ab4 ab4Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 2;
        this.J = hu2Var;
        this.K = ab4Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.K;
        switch (b) {
            case 0:
                u32 u32Var = new u32(obj2, fj0Var, (byte) 0);
                u32Var.J = obj;
                return u32Var;
            case 1:
                u32 u32Var2 = new u32(obj2, fj0Var, (byte) 1);
                u32Var2.J = obj;
                return u32Var2;
            default:
                return new u32((hu2) this.J, (ab4) obj2, fj0Var);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                ((u32) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            default:
                ((u32) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
        }
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Unsafe unsafe;
        long j;
        int intVolatile;
        DecodeResult decode$lambda$0$0;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj2 = this.K;
        switch (b) {
            case 0:
                dl0 dl0Var = (dl0) this.J;
                mu0.V(obj);
                tk0 coroutineContext = dl0Var.getCoroutineContext();
                eq eqVar = (eq) obj2;
                try {
                    c75 c75Var = new c75();
                    c75Var.N = vt0.D(vt0.x(coroutineContext), c75Var);
                    try {
                        do {
                            unsafe = gq.a;
                            j = c75.O;
                            intVolatile = unsafe.getIntVolatile(c75Var, j);
                            if (intVolatile != 0) {
                                if (intVolatile != 2 && intVolatile != 3) {
                                    c75.n(intVolatile);
                                    throw null;
                                }
                            }
                            decode$lambda$0$0 = BitmapFactoryDecoder.decode$lambda$0$0((BitmapFactoryDecoder) eqVar.J);
                            return decode$lambda$0$0;
                        } while (!unsafe.compareAndSwapInt(c75Var, j, intVolatile, 0));
                        decode$lambda$0$0 = BitmapFactoryDecoder.decode$lambda$0$0((BitmapFactoryDecoder) eqVar.J);
                        return decode$lambda$0$0;
                    } finally {
                        c75Var.m();
                    }
                } catch (InterruptedException e) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
                }
            case 1:
                mu0.V(obj);
                dl0 dl0Var2 = (dl0) this.J;
                mi2 mi2Var = (mi2) obj2;
                li2 li2Var = mi2Var.I;
                if (((xi2) li2Var).i.compareTo(ki2.J) >= 0) {
                    li2Var.a(mi2Var);
                } else {
                    vt0.j(dl0Var2.getCoroutineContext(), null);
                }
                return wd5Var;
            default:
                mu0.V(obj);
                ((hu2) this.J).F((ab4) obj2);
                return wd5Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u32(Object obj, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = obj;
    }
}

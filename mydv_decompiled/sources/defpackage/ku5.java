package defpackage;

import androidx.window.extensions.area.ExtensionWindowAreaStatus;
import androidx.window.reflection.Consumer2;
import java.util.Collection;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ku5 extends k05 implements hn1 {
    public boolean I;
    public /* synthetic */ Object J;
    public final /* synthetic */ lu5 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku5(lu5 lu5Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = lu5Var;
    }

    public static final void f(lu5 lu5Var, iu5 iu5Var, ju5 ju5Var) {
        lu5Var.d.removeRearDisplayStatusListener(iu5Var);
        lu5Var.d.removeRearDisplayPresentationStatusListener(ju5Var);
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        ku5 ku5Var = new ku5(this.K, fj0Var);
        ku5Var.J = obj;
        return ku5Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((ku5) create((bu3) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        boolean z = this.I;
        if (!z) {
            mu0.V(obj);
            final bu3 bu3Var = (bu3) this.J;
            final lu5 lu5Var = this.K;
            Consumer2 consumer2 = new Consumer2() { // from class: iu5
                /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
                
                    if (r7 != 3) goto L17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
                
                    if (r7 != 3) goto L17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
                
                    r7 = defpackage.bu5.f;
                 */
                @Override // androidx.window.reflection.Consumer2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void accept(java.lang.Object r7) {
                    /*
                        r6 = this;
                        lu5 r0 = defpackage.lu5.this
                        bu3 r6 = r2
                        java.lang.Integer r7 = (java.lang.Integer) r7
                        int r7 = r7.intValue()
                        java.lang.String r1 = defpackage.lu5.h
                        androidx.window.extensions.area.WindowAreaComponent r1 = r0.d
                        jw5 r1 = defpackage.lu5.c(r1)
                        int r2 = defpackage.zc1.a()
                        r3 = 2
                        r4 = 1
                        r5 = 3
                        if (r2 > r5) goto L24
                        if (r7 == 0) goto L36
                        if (r7 == r4) goto L33
                        if (r7 == r3) goto L30
                        if (r7 == r5) goto L2d
                        goto L36
                    L24:
                        if (r7 == 0) goto L36
                        if (r7 == r4) goto L33
                        if (r7 == r3) goto L30
                        if (r7 == r5) goto L2d
                        goto L36
                    L2d:
                        bu5 r7 = defpackage.bu5.f
                        goto L38
                    L30:
                        bu5 r7 = defpackage.bu5.e
                        goto L38
                    L33:
                        bu5 r7 = defpackage.bu5.d
                        goto L38
                    L36:
                        bu5 r7 = defpackage.bu5.c
                    L38:
                        ej1 r2 = defpackage.ej1.S
                        r0.f(r2, r7, r1)
                        r6.getClass()
                        java.util.HashMap r7 = r0.g
                        java.util.Collection r7 = r7.values()
                        r7.getClass()
                        java.lang.Iterable r7 = (java.lang.Iterable) r7
                        java.util.List r7 = defpackage.o70.r1(r7)
                        r6.d(r7)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.iu5.accept(java.lang.Object):void");
                }
            };
            Consumer2 consumer22 = new Consumer2() { // from class: ju5
                @Override // androidx.window.reflection.Consumer2
                public final void accept(Object obj2) {
                    lu5 lu5Var2 = lu5.this;
                    bu3 bu3Var2 = bu3Var;
                    String str = lu5.h;
                    lu5Var2.e((ExtensionWindowAreaStatus) obj2);
                    bu3Var2.getClass();
                    Collection values = lu5Var2.g.values();
                    values.getClass();
                    bu3Var2.d(o70.r1(values));
                }
            };
            lu5Var.d.addRearDisplayStatusListener(consumer2);
            lu5Var.d.addRearDisplayPresentationStatusListener(consumer22);
            yj yjVar = new yj((Object) lu5Var, (Object) consumer2, (Object) consumer22, (byte) 17);
            this.I = true;
            Object g = mu0.g(bu3Var, yjVar, this);
            el0 el0Var = el0.I;
            if (g == el0Var) {
                return el0Var;
            }
        } else {
            if (!z) {
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mu0.V(obj);
        }
        return wd5.a;
    }
}

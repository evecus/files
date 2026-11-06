package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class jq2 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 0;
    public /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ cw4 N;
    public final /* synthetic */ Object O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq2(ea5 ea5Var, q73 q73Var, p63 p63Var, z33 z33Var, cw4 cw4Var, jd0 jd0Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = ea5Var;
        this.K = q73Var;
        this.L = p63Var;
        this.M = z33Var;
        this.N = cw4Var;
        this.O = jd0Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.O;
        Object obj3 = this.M;
        Object obj4 = this.L;
        Object obj5 = this.K;
        switch (b) {
            case 0:
                jq2 jq2Var = new jq2((bh) obj5, (List) obj3, (s33) this.N, (fk3) obj2, (bh) obj4, fj0Var);
                jq2Var.J = obj;
                return jq2Var;
            default:
                return new jq2((ea5) this.J, (q73) obj5, (p63) obj4, (z33) obj3, this.N, (jd0) obj2, fj0Var);
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
                ((jq2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            default:
                ((jq2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
        }
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        char c;
        char c2;
        char c3;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        byte b2 = 2;
        Object obj2 = this.M;
        Object obj3 = this.O;
        cw4 cw4Var = this.N;
        Object obj4 = this.L;
        Object obj5 = this.K;
        char c4 = 3;
        switch (b) {
            case 0:
                fj0 fj0Var = null;
                mu0.V(obj);
                dl0 dl0Var = (dl0) this.J;
                bh bhVar = (bh) obj5;
                List list = (List) obj2;
                s33 s33Var = (s33) cw4Var;
                fk3 fk3Var = (fk3) obj3;
                bh bhVar2 = (bh) obj4;
                if (dl0Var.getCoroutineContext().get(q8.q0) != null) {
                    zl1.c();
                    return null;
                }
                p70.g0(dl0Var, null, null, new iq2(bhVar, list, s33Var, fk3Var, null), 3);
                p70.g0(dl0Var, null, null, new p(bhVar2, fj0Var, b2), 3);
                return wd5Var;
            default:
                mu0.V(obj);
                ea5 ea5Var = (ea5) this.J;
                Object d = ea5Var.a.d();
                jk3 jk3Var = ea5Var.d;
                if (j42.c(d, jk3Var.getValue()) && (((p63) ((q73) obj5).b.f.l()) == null || j42.c(jk3Var.getValue(), (p63) obj4))) {
                    jd0 jd0Var = (jd0) obj3;
                    Iterator it = ((List) cw4Var.getValue()).iterator();
                    while (it.hasNext()) {
                        jd0Var.b().c((p63) it.next());
                    }
                    z33 z33Var = (z33) obj2;
                    long[] jArr = z33Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            char c5 = 7;
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                int i3 = 0;
                                while (i3 < i2) {
                                    if ((j & 255) < 128) {
                                        int i4 = (i << 3) + i3;
                                        Object obj6 = z33Var.b[i4];
                                        c3 = c5;
                                        float f = z33Var.c[i4];
                                        if (j42.c((String) obj6, ((p63) jk3Var.getValue()).N)) {
                                            c2 = c4;
                                        } else {
                                            z33Var.e--;
                                            long[] jArr2 = z33Var.a;
                                            int i5 = z33Var.d;
                                            int i6 = i4 >> 3;
                                            int i7 = (i4 & 7) << 3;
                                            c2 = c4;
                                            long j2 = (jArr2[i6] & (~(255 << i7))) | (254 << i7);
                                            jArr2[i6] = j2;
                                            jArr2[(((i4 - 7) & i5) + (i5 & 7)) >> 3] = j2;
                                            z33Var.b[i4] = null;
                                            j >>= 8;
                                            i3++;
                                            c5 = c3;
                                            c4 = c2;
                                        }
                                    } else {
                                        c2 = c4;
                                        c3 = c5;
                                    }
                                    j >>= 8;
                                    i3++;
                                    c5 = c3;
                                    c4 = c2;
                                }
                                c = c4;
                                if (i2 != 8) {
                                }
                            } else {
                                c = c4;
                            }
                            if (i != length) {
                                i++;
                                c4 = c;
                            }
                        }
                    }
                }
                return wd5Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq2(bh bhVar, List list, s33 s33Var, fk3 fk3Var, bh bhVar2, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = bhVar;
        this.M = list;
        this.N = s33Var;
        this.O = fk3Var;
        this.L = bhVar2;
    }
}

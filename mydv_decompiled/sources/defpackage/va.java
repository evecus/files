package defpackage;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class va extends tn1 implements rm1 {
    public final /* synthetic */ byte I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ va(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.I = b;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        ContentCaptureSession c;
        ja3 ja3Var;
        switch (this.I) {
            case 0:
                View view = (View) this.receiver;
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    k5.d(view);
                }
                if (i < 29 || (c = z9.c(view)) == null) {
                    return null;
                }
                return sh0.g(c, view);
            case 1:
                zh1 zh1Var = (zh1) this.receiver;
                o43 o43Var = zh1Var.c;
                o43 o43Var2 = zh1Var.d;
                di1 di1Var = zh1Var.a;
                ui1 g = di1Var.g();
                oi1 oi1Var = oi1.K;
                if (g == null) {
                    Object[] objArr = o43Var2.b;
                    long[] jArr = o43Var2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((j & 255) < 128) {
                                        ((ph1) objArr[(i2 << 3) + i4]).u(oi1Var);
                                    }
                                    j >>= 8;
                                }
                                if (i3 != 8) {
                                }
                            }
                            if (i2 != length) {
                                i2++;
                            }
                        }
                    }
                } else if (g.isAttached()) {
                    if (o43Var.a(g)) {
                        g.p0();
                    }
                    oi1 o0 = g.o0();
                    if (!g.getNode().isAttached()) {
                        q02.b("visitAncestors called on an unattached node");
                    }
                    k13 node = g.getNode();
                    wa2 U = ut0.U(g);
                    int i5 = 0;
                    while (U != null) {
                        if ((U.n0.f.getAggregateChildKindSet$ui() & 5120) != 0) {
                            while (node != null) {
                                if ((node.getKindSet$ui() & 5120) != 0) {
                                    if ((node.getKindSet$ui() & 1024) != 0) {
                                        i5++;
                                    }
                                    if ((node instanceof ph1) && o43Var2.a(node)) {
                                        if (i5 <= 1) {
                                            ((ph1) node).u(o0);
                                        } else {
                                            ((ph1) node).u(oi1.J);
                                        }
                                        o43Var2.l(node);
                                    }
                                }
                                node = node.getParent$ui();
                            }
                        }
                        U = U.v();
                        node = (U == null || (ja3Var = U.n0) == null) ? null : ja3Var.e;
                    }
                    Object[] objArr2 = o43Var2.b;
                    long[] jArr2 = o43Var2.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j2 = jArr2[i6];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                for (int i8 = 0; i8 < i7; i8++) {
                                    if ((j2 & 255) < 128) {
                                        ((ph1) objArr2[(i6 << 3) + i8]).u(oi1Var);
                                    }
                                    j2 >>= 8;
                                }
                                if (i7 != 8) {
                                }
                            }
                            if (i6 != length2) {
                                i6++;
                            }
                        }
                    }
                }
                if (di1Var.g() == null || di1Var.c.o0() == oi1Var) {
                    di1Var.a.clearOwnerFocus();
                }
                o43Var.e();
                o43Var2.e();
                zh1Var.e = false;
                return wd5.a;
            default:
                return Boolean.valueOf(jp0.D(((zi1) this.receiver).P));
        }
    }
}

package defpackage;

import androidx.compose.runtime.Recomposer;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class g14 extends k05 implements in1 {
    public List I;
    public List J;
    public List K;
    public o43 L;
    public o43 M;
    public o43 N;
    public Set O;
    public o43 P;
    public byte Q;
    public /* synthetic */ s13 R;
    public final /* synthetic */ Recomposer S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g14(Recomposer recomposer, fj0 fj0Var) {
        super(3, fj0Var);
        this.S = recomposer;
    }

    public static final void f(Recomposer recomposer, List list, List list2, List list3, o43 o43Var, o43 o43Var2, o43 o43Var3, o43 o43Var4) {
        char c;
        long j;
        long j2;
        synchronized (recomposer.stateLock) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    we0 we0Var = (we0) ((oj0) list3.get(i));
                    we0Var.d();
                    recomposer.recordFailedCompositionLocked(we0Var);
                }
                list3.clear();
                Object[] objArr = o43Var.b;
                long[] jArr = o43Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    we0 we0Var2 = (we0) ((oj0) objArr[(i2 << 3) + i4]);
                                    we0Var2.d();
                                    recomposer.recordFailedCompositionLocked(we0Var2);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                o43Var.e();
                Object[] objArr2 = o43Var2.b;
                long[] jArr2 = o43Var2.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((we0) ((oj0) objArr2[(i5 << 3) + i7])).j();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length2) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                o43Var2.e();
                o43Var3.e();
                Object[] objArr3 = o43Var4.b;
                long[] jArr3 = o43Var4.a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    we0 we0Var3 = (we0) ((oj0) objArr3[(i8 << 3) + i10]);
                                    we0Var3.d();
                                    recomposer.recordFailedCompositionLocked(we0Var3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length3) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                o43Var4.e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void g(List list, Recomposer recomposer) {
        List list2;
        List list3;
        list.clear();
        synchronized (recomposer.stateLock) {
            try {
                list2 = recomposer.movableContentAwaitingInsert;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    list.add((r23) list2.get(i));
                }
                list3 = recomposer.movableContentAwaitingInsert;
                list3.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        g14 g14Var = new g14(this.S, (fj0) obj3);
        g14Var.R = (s13) obj2;
        return g14Var.invokeSuspend(wd5.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00e7 -> B:6:0x00f0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0109 -> B:7:0x0096). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g14.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

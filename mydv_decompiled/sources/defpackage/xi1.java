package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.model.DanmakuItem;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xi1 implements Comparator {
    public static final xi1 J = new xi1(0);
    public static final xi1 K = new xi1(1);
    public static final xi1 L = new xi1(2);
    public static final xi1 M = new xi1(3);
    public final /* synthetic */ byte I;

    public /* synthetic */ xi1(byte b) {
        this.I = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.lang.Object[]] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.I) {
            case 0:
                ui1 ui1Var = (ui1) obj;
                ui1 ui1Var2 = (ui1) obj2;
                if (mu0.L(ui1Var) && mu0.L(ui1Var2)) {
                    wa2 U = ut0.U(ui1Var);
                    wa2 U2 = ut0.U(ui1Var2);
                    if (!j42.c(U, U2)) {
                        wa2[] wa2VarArr = new wa2[16];
                        int i = 0;
                        while (U != null) {
                            int i2 = i + 1;
                            if (wa2VarArr.length < i2) {
                                int length = wa2VarArr.length;
                                ?? r4 = new Object[Math.max(i2, length * 2)];
                                System.arraycopy(wa2VarArr, 0, r4, 0, length);
                                wa2VarArr = r4;
                            }
                            if (i != 0) {
                                System.arraycopy(wa2VarArr, 0, wa2VarArr, 0 + 1, i + 0);
                            }
                            wa2VarArr[0] = U;
                            i++;
                            U = U.v();
                        }
                        wa2[] wa2VarArr2 = new wa2[16];
                        int i3 = 0;
                        while (U2 != null) {
                            int i4 = i3 + 1;
                            if (wa2VarArr2.length < i4) {
                                int length2 = wa2VarArr2.length;
                                ?? r42 = new Object[Math.max(i4, length2 * 2)];
                                System.arraycopy(wa2VarArr2, 0, r42, 0, length2);
                                wa2VarArr2 = r42;
                            }
                            if (i3 != 0) {
                                System.arraycopy(wa2VarArr2, 0, wa2VarArr2, 0 + 1, i3 + 0);
                            }
                            wa2VarArr2[0] = U2;
                            i3++;
                            U2 = U2.v();
                        }
                        int min = Math.min(i - 1, i3 - 1);
                        if (min >= 0) {
                            int i5 = 0;
                            while (j42.c(wa2VarArr[i5], wa2VarArr2[i5])) {
                                if (i5 != min) {
                                    i5++;
                                }
                            }
                            return j42.m(wa2VarArr[i5].w(), wa2VarArr2[i5].w());
                        }
                        zy.i("Could not find a common ancestor between the two FocusModifiers.");
                    }
                } else {
                    if (mu0.L(ui1Var)) {
                        return -1;
                    }
                    if (mu0.L(ui1Var2)) {
                        return 1;
                    }
                }
                return 0;
            case 1:
                m14 h = ((si4) obj).h();
                m14 h2 = ((si4) obj2).h();
                int compare = Float.compare(h.a, h2.a);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = Float.compare(h.b, h2.b);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = Float.compare(h.d, h2.d);
                return compare3 != 0 ? compare3 : Float.compare(h.c, h2.c);
            case 2:
                m14 h3 = ((si4) obj).h();
                m14 h4 = ((si4) obj2).h();
                int compare4 = Float.compare(h4.c, h3.c);
                if (compare4 != 0) {
                    return compare4;
                }
                int compare5 = Float.compare(h3.b, h4.b);
                if (compare5 != 0) {
                    return compare5;
                }
                int compare6 = Float.compare(h3.d, h4.d);
                return compare6 != 0 ? compare6 : Float.compare(h4.a, h3.a);
            case 3:
                uj3 uj3Var = (uj3) obj;
                uj3 uj3Var2 = (uj3) obj2;
                int compare7 = Float.compare(((m14) uj3Var.I).b, ((m14) uj3Var2.I).b);
                return compare7 != 0 ? compare7 : Float.compare(((m14) uj3Var.I).d, ((m14) uj3Var2.I).d);
            case 4:
                byte[] bArr = ((y0) obj).b;
                byte[] bArr2 = ((y0) obj2).b;
                int i6 = bArr[0] & 223;
                int i7 = bArr2[0] & 223;
                if (i6 == i7) {
                    int min2 = Math.min(bArr.length, bArr2.length) - 1;
                    int i8 = 1;
                    while (true) {
                        if (i8 >= min2) {
                            int i9 = bArr[min2] & 255;
                            int i10 = bArr2[min2] & 255;
                            if (i9 >= i10) {
                                return i9 > i10 ? 1 : 0;
                            }
                        } else {
                            byte b = bArr[i8];
                            byte b2 = bArr2[i8];
                            if (b == b2) {
                                i8++;
                            } else if ((b & 255) >= (b2 & 255)) {
                                return 1;
                            }
                        }
                    }
                } else if (i6 >= i7) {
                    return 1;
                }
                return -1;
            case 5:
                return j42.p(((Field) obj).getName(), ((Field) obj2).getName());
            case 6:
                return Integer.valueOf(((nj) obj).b).compareTo(Integer.valueOf(((nj) obj2).b));
            case 7:
                return Integer.valueOf(((nj) obj).b).compareTo(Integer.valueOf(((nj) obj2).b));
            case 8:
                return Long.valueOf(((DanmakuItem) obj).getOffsetTime()).compareTo(Long.valueOf(((DanmakuItem) obj2).getOffsetTime()));
            case 9:
                no1 no1Var = (no1) obj;
                no1 no1Var2 = (no1) obj2;
                RecyclerView recyclerView = no1Var.d;
                if ((recyclerView == null) == (no1Var2.d == null)) {
                    boolean z = no1Var.a;
                    if (z == no1Var2.a) {
                        int i11 = no1Var2.b - no1Var.b;
                        if (i11 != 0) {
                            return i11;
                        }
                        int i12 = no1Var.c - no1Var2.c;
                        if (i12 != 0) {
                            return i12;
                        }
                        return 0;
                    }
                    if (!z) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            case 10:
                return Long.valueOf(((DanmakuItem) obj).getOffsetTime()).compareTo(Long.valueOf(((DanmakuItem) obj2).getOffsetTime()));
            case 11:
                return Integer.valueOf(((x03) obj).b).compareTo(Integer.valueOf(((x03) obj2).b));
            case 12:
                return Integer.valueOf(((x03) obj2).b).compareTo(Integer.valueOf(((x03) obj).b));
            case 13:
                return Long.valueOf(((Aweme) obj).getCreateTime()).compareTo(Long.valueOf(((Aweme) obj2).getCreateTime()));
            case 14:
                return Long.valueOf(((Aweme) obj2).getCreateTime()).compareTo(Long.valueOf(((Aweme) obj).getCreateTime()));
            case 15:
                return j42.p((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 16:
                return j42.p((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 17:
                return j42.p(((l15) obj).a, ((l15) obj2).a);
            case 18:
                return j42.p(((n15) obj).a, ((n15) obj2).a);
            default:
                return j42.p(((e16) obj).a, ((e16) obj2).a);
        }
    }
}

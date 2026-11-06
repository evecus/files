package okhttp3.internal.publicsuffix;

import defpackage.er0;
import defpackage.h00;
import defpackage.j42;
import defpackage.jp;
import defpackage.jx4;
import defpackage.o41;
import defpackage.o70;
import defpackage.o91;
import defpackage.oj4;
import defpackage.p70;
import defpackage.q41;
import defpackage.qj4;
import defpackage.r7;
import defpackage.s83;
import defpackage.v70;
import defpackage.z50;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import okhttp3.internal._UtilCommonKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class PublicSuffixDatabase {
    public static final Companion Companion = new Companion(null);
    private static final char EXCEPTION_MARKER = '!';
    private static final List<String> PREVAILING_RULE;
    private static final h00 WILDCARD_LABEL;
    private static PublicSuffixDatabase instance;
    private final PublicSuffixList publicSuffixList;

    static {
        h00 h00Var = h00.L;
        WILDCARD_LABEL = new h00(Arrays.copyOf(new byte[]{42}, 1));
        PREVAILING_RULE = p70.j0("*");
        instance = new PublicSuffixDatabase(PublicSuffixList_androidKt.getDefault(PublicSuffixList.Companion));
    }

    public PublicSuffixDatabase(PublicSuffixList publicSuffixList) {
        publicSuffixList.getClass();
        this.publicSuffixList = publicSuffixList;
    }

    private final List<String> findMatchingRule(List<String> list) {
        String str;
        String str2;
        String str3;
        this.publicSuffixList.ensureLoaded();
        int size = list.size();
        h00[] h00VarArr = new h00[size];
        for (int i = 0; i < size; i++) {
            h00 h00Var = h00.L;
            h00VarArr[i] = jp.h(list.get(i));
        }
        int i2 = 0;
        while (true) {
            str = null;
            if (i2 >= size) {
                str2 = null;
                break;
            }
            str2 = Companion.binarySearch(this.publicSuffixList.getBytes(), h00VarArr, i2);
            if (str2 != null) {
                break;
            }
            i2++;
        }
        if (size > 1) {
            h00[] h00VarArr2 = (h00[]) h00VarArr.clone();
            int length = h00VarArr2.length - 1;
            for (int i3 = 0; i3 < length; i3++) {
                h00VarArr2[i3] = WILDCARD_LABEL;
                str3 = Companion.binarySearch(this.publicSuffixList.getBytes(), h00VarArr2, i3);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            int i4 = size - 1;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                String binarySearch = Companion.binarySearch(this.publicSuffixList.getExceptionBytes(), h00VarArr, i5);
                if (binarySearch != null) {
                    str = binarySearch;
                    break;
                }
                i5++;
            }
        }
        if (str != null) {
            return jx4.Y("!".concat(str), new char[]{'.'});
        }
        if (str2 == null && str3 == null) {
            return PREVAILING_RULE;
        }
        List<String> list2 = o91.I;
        List<String> Y = str2 != null ? jx4.Y(str2, new char[]{'.'}) : list2;
        if (str3 != null) {
            list2 = jx4.Y(str3, new char[]{'.'});
        }
        return Y.size() > list2.size() ? Y : list2;
    }

    private final List<String> splitDomain(String str) {
        List<String> Y = jx4.Y(str, new char[]{'.'});
        return j42.c(o70.a1(Y), "") ? o70.R0(Y) : Y;
    }

    public final String getEffectiveTldPlusOne(String str) {
        int size;
        int size2;
        str.getClass();
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List<String> splitDomain = splitDomain(unicode);
        List<String> findMatchingRule = findMatchingRule(splitDomain);
        if (splitDomain.size() == findMatchingRule.size() && findMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (findMatchingRule.get(0).charAt(0) == '!') {
            size = splitDomain.size();
            size2 = findMatchingRule.size();
        } else {
            size = splitDomain.size();
            size2 = findMatchingRule.size() + 1;
        }
        int i = size - size2;
        List<String> splitDomain2 = splitDomain(str);
        splitDomain2.getClass();
        oj4 v70Var = new v70(splitDomain2, (byte) 0);
        if (i < 0) {
            s83.h(r7.z("Requested element count ", i, " is less than zero."));
            return null;
        }
        if (i != 0) {
            v70Var = v70Var instanceof q41 ? ((q41) v70Var).a(i) : new o41(v70Var, i);
        }
        return qj4.y(v70Var, ".");
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(h00 h00Var, h00[] h00VarArr, int i) {
            int i2;
            int and;
            boolean z;
            int and2;
            int d = h00Var.d();
            int i3 = 0;
            while (i3 < d) {
                int i4 = (i3 + d) / 2;
                while (i4 > -1 && h00Var.i(i4) != 10) {
                    i4--;
                }
                int i5 = i4 + 1;
                int i6 = 1;
                while (true) {
                    i2 = i5 + i6;
                    if (h00Var.i(i2) == 10) {
                        break;
                    }
                    i6++;
                }
                int i7 = i2 - i5;
                int i8 = i;
                boolean z2 = false;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (z2) {
                        and = 46;
                        z = false;
                    } else {
                        boolean z3 = z2;
                        and = _UtilCommonKt.and(h00VarArr[i8].i(i9), 255);
                        z = z3;
                    }
                    and2 = and - _UtilCommonKt.and(h00Var.i(i5 + i10), 255);
                    if (and2 != 0) {
                        break;
                    }
                    i10++;
                    i9++;
                    if (i10 == i7) {
                        break;
                    }
                    if (h00VarArr[i8].d() != i9) {
                        z2 = z;
                    } else {
                        if (i8 == h00VarArr.length - 1) {
                            break;
                        }
                        i8++;
                        z2 = true;
                        i9 = -1;
                    }
                }
                if (and2 >= 0) {
                    if (and2 <= 0) {
                        int i11 = i7 - i10;
                        int d2 = h00VarArr[i8].d() - i9;
                        int length = h00VarArr.length;
                        for (int i12 = i8 + 1; i12 < length; i12++) {
                            d2 += h00VarArr[i12].d();
                        }
                        if (d2 >= i11) {
                            if (d2 <= i11) {
                                return h00Var.o(i5, i7 + i5).n(z50.a);
                            }
                        }
                    }
                    i3 = i2 + 1;
                }
                d = i4;
            }
            return null;
        }

        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }

        public final void resetForTests$okhttp() {
            PublicSuffixDatabase.instance = new PublicSuffixDatabase(PublicSuffixList_androidKt.getDefault(PublicSuffixList.Companion));
        }

        private Companion() {
        }
    }
}

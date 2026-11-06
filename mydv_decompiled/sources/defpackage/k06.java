package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class k06 {
    public static final Map d;
    public final q06 a;
    public final int b;
    public final int c;

    static {
        HashMap hashMap = new HashMap();
        q0 q0Var = u53.a;
        hashMap.put(1, new k06(20, 2, -1, q0Var));
        hashMap.put(2, new k06(20, 4, -1, q0Var));
        hashMap.put(3, new k06(40, 2, -1, q0Var));
        hashMap.put(4, new k06(40, 4, -1, q0Var));
        hashMap.put(5, new k06(40, 8, -1, q0Var));
        hashMap.put(6, new k06(60, 3, -1, q0Var));
        hashMap.put(7, new k06(60, 6, -1, q0Var));
        hashMap.put(8, new k06(60, 12, -1, q0Var));
        q0 q0Var2 = u53.b;
        hashMap.put(9, new k06(20, 2, -1, q0Var2));
        hashMap.put(10, new k06(20, 4, -1, q0Var2));
        hashMap.put(11, new k06(40, 2, -1, q0Var2));
        hashMap.put(12, new k06(40, 4, -1, q0Var2));
        hashMap.put(13, new k06(40, 8, -1, q0Var2));
        hashMap.put(14, new k06(60, 3, -1, q0Var2));
        hashMap.put(15, new k06(60, 6, -1, q0Var2));
        hashMap.put(16, new k06(60, 12, -1, q0Var2));
        q0 q0Var3 = u53.c;
        hashMap.put(17, new k06(20, 2, -1, q0Var3));
        hashMap.put(18, new k06(20, 4, -1, q0Var3));
        hashMap.put(19, new k06(40, 2, -1, q0Var3));
        hashMap.put(20, new k06(40, 4, -1, q0Var3));
        hashMap.put(21, new k06(40, 8, -1, q0Var3));
        hashMap.put(22, new k06(60, 3, -1, q0Var3));
        hashMap.put(23, new k06(60, 6, -1, q0Var3));
        hashMap.put(24, new k06(60, 12, -1, q0Var3));
        q0 q0Var4 = u53.d;
        hashMap.put(25, new k06(20, 2, -1, q0Var4));
        hashMap.put(26, new k06(20, 4, -1, q0Var4));
        hashMap.put(27, new k06(40, 2, -1, q0Var4));
        hashMap.put(28, new k06(40, 4, -1, q0Var4));
        hashMap.put(29, new k06(40, 8, -1, q0Var4));
        hashMap.put(30, new k06(60, 3, -1, q0Var4));
        hashMap.put(31, new k06(60, 6, -1, q0Var4));
        hashMap.put(32, new k06(60, 12, -1, q0Var4));
        hashMap.put(33, new k06(20, 2, 24, q0Var));
        hashMap.put(34, new k06(20, 4, 24, q0Var));
        hashMap.put(35, new k06(40, 2, 24, q0Var));
        hashMap.put(36, new k06(40, 4, 24, q0Var));
        hashMap.put(37, new k06(40, 8, 24, q0Var));
        hashMap.put(38, new k06(60, 3, 24, q0Var));
        hashMap.put(39, new k06(60, 6, 24, q0Var));
        hashMap.put(40, new k06(60, 12, 24, q0Var));
        q0 q0Var5 = u53.e;
        hashMap.put(41, new k06(20, 2, 32, q0Var5));
        hashMap.put(42, new k06(20, 4, 32, q0Var5));
        hashMap.put(43, new k06(40, 2, 32, q0Var5));
        hashMap.put(44, new k06(40, 4, 32, q0Var5));
        hashMap.put(45, new k06(40, 8, 32, q0Var5));
        hashMap.put(46, new k06(60, 3, 32, q0Var5));
        hashMap.put(47, new k06(60, 6, 32, q0Var5));
        hashMap.put(48, new k06(60, 12, 32, q0Var5));
        hashMap.put(49, new k06(20, 2, 24, q0Var5));
        hashMap.put(50, new k06(20, 4, 24, q0Var5));
        hashMap.put(51, new k06(40, 2, 24, q0Var5));
        hashMap.put(52, new k06(40, 4, 24, q0Var5));
        hashMap.put(53, new k06(40, 8, 24, q0Var5));
        hashMap.put(54, new k06(60, 3, 24, q0Var5));
        hashMap.put(55, new k06(60, 6, 24, q0Var5));
        hashMap.put(56, new k06(60, 12, 24, q0Var5));
        d = DesugarCollections.unmodifiableMap(hashMap);
    }

    public k06(int i, int i2, int i3, q0 q0Var) {
        this.b = i;
        this.c = i2;
        if (i < 2) {
            s83.t("totalHeight must be > 1");
            throw null;
        }
        if (i > 62) {
            s83.t("totalHeight must be <= 62");
            throw null;
        }
        if (i2 < 1) {
            s83.t("layers must be >= 1");
            throw null;
        }
        if (i % i2 != 0) {
            s83.t("layers must divide totalHeight without remainder");
            throw null;
        }
        int i4 = i / i2;
        if (i4 == 1) {
            s83.t("height / layers must be greater than 1");
            throw null;
        }
        q06 q06Var = new q06(i4, q0Var, i3);
        this.a = q06Var;
        String str = q06Var.d;
        if (str != null) {
        } else {
            Map map = it0.c;
            zy.m("algorithmName == null");
            throw null;
        }
    }
}

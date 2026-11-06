package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class q06 {
    public static final Map g;
    public final int a;
    public final int b;
    public final q0 c;
    public final String d;
    public final int e;
    public final int f;

    static {
        HashMap hashMap = new HashMap();
        q0 q0Var = u53.a;
        hashMap.put(1, new q06(10, q0Var, -1));
        hashMap.put(2, new q06(16, q0Var, -1));
        hashMap.put(3, new q06(20, q0Var, -1));
        q0 q0Var2 = u53.b;
        hashMap.put(4, new q06(10, q0Var2, -1));
        hashMap.put(5, new q06(16, q0Var2, -1));
        hashMap.put(6, new q06(20, q0Var2, -1));
        q0 q0Var3 = u53.c;
        hashMap.put(7, new q06(10, q0Var3, -1));
        hashMap.put(8, new q06(16, q0Var3, -1));
        hashMap.put(9, new q06(20, q0Var3, -1));
        q0 q0Var4 = u53.d;
        hashMap.put(10, new q06(10, q0Var4, -1));
        hashMap.put(11, new q06(16, q0Var4, -1));
        hashMap.put(12, new q06(20, q0Var4, -1));
        hashMap.put(13, new q06(10, q0Var, 24));
        hashMap.put(14, new q06(16, q0Var, 24));
        hashMap.put(15, new q06(20, q0Var, 24));
        q0 q0Var5 = u53.e;
        hashMap.put(16, new q06(10, q0Var5, 32));
        hashMap.put(17, new q06(16, q0Var5, 32));
        hashMap.put(18, new q06(20, q0Var5, 32));
        hashMap.put(19, new q06(10, q0Var5, 24));
        hashMap.put(20, new q06(16, q0Var5, 24));
        hashMap.put(21, new q06(20, q0Var5, 24));
        g = DesugarCollections.unmodifiableMap(hashMap);
    }

    public q06(int i, q0 q0Var, int i2) {
        if (i < 2) {
            s83.t("height must be >= 2");
            throw null;
        }
        if (i > 30) {
            s83.t("height must be <= 30");
            throw null;
        }
        if (q0Var == null) {
            zy.m("digest == null");
            throw null;
        }
        this.a = i;
        int i3 = 2;
        while (true) {
            int i4 = this.a;
            if (i3 > i4) {
                zy.i("should never happen...");
                throw null;
            }
            if ((i4 - i3) % 2 == 0) {
                this.b = i3;
                String b = zw0.b(q0Var);
                this.d = b;
                this.c = q0Var;
                i2 = i2 <= 0 ? zw0.a(q0Var).d() : i2;
                this.e = i2;
                int i5 = new yz(q0Var, i2).c;
                this.f = i5;
                return;
            }
            i3++;
        }
    }
}

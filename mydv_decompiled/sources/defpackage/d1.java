package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public abstract class d1 implements rs1 {
    public final /* synthetic */ byte a;
    public final Object b;

    public d1(byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.b = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                break;
            case 3:
                q33 q33Var = q22.a;
                this.b = new q33();
                break;
            default:
                this.b = new ArrayList();
                break;
        }
    }

    public static String d(int i, int i2, String str) {
        return str + "-" + i + "-16-" + i2;
    }

    public static String e(int i, String str, int i2, int i3, int i4) {
        return f(str, i, i2, i3) + "-" + i4;
    }

    public static String f(String str, int i, int i2, int i3) {
        return d(i, i2, str) + "-" + i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003a, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(int r8, defpackage.io1 r9, java.lang.Object r10) {
        /*
            r7 = this;
            java.util.ArrayList r0 = r9.a
            r1 = 1
            if (r0 != 0) goto La
            r10 = 0
            r7.b(r8, r9, r10)
            return r1
        La:
            int r2 = r0.size()
            r3 = 0
            r4 = r3
        L10:
            if (r4 >= r2) goto L3a
            java.lang.Object r5 = r0.get(r4)
            boolean r6 = r5 instanceof defpackage.bo1
            if (r6 == 0) goto L21
            if (r5 == r10) goto L1d
            goto L32
        L1d:
            r7.b(r3, r9, r5)
            return r1
        L21:
            boolean r6 = r5 instanceof defpackage.io1
            if (r6 == 0) goto L35
            r6 = r5
            io1 r6 = (defpackage.io1) r6
            boolean r6 = r7.a(r8, r6, r10)
            if (r6 == 0) goto L32
            r7.b(r3, r9, r5)
            return r1
        L32:
            int r4 = r4 + 1
            goto L10
        L35:
            java.lang.String r7 = "Unexpected child source info "
            defpackage.zy.h(r5, r7)
        L3a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d1.a(int, io1, java.lang.Object):boolean");
    }

    public void b(int i, io1 io1Var, Object obj) {
        ((ArrayList) this.b).add(new wd0(i, null, null));
    }

    public void c(u0 u0Var) {
        if (((Class) this.b).isInstance(u0Var)) {
            return;
        }
        s83.t("unexpected object: ".concat(il2.E(u0Var)));
    }

    public boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                return this == obj;
            default:
                return super.equals(obj);
        }
    }

    public u0 g(byte[] bArr) {
        u0 s = u0.s(bArr);
        c(s);
        return s;
    }

    public u0 h(x0 x0Var) {
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }

    public u0 i(mn0 mn0Var) {
        throw new IllegalStateException("unexpected implicit primitive encoding");
    }

    public u0 j(ct ctVar, boolean z) {
        wx5.f(ctVar);
        u0 v = ctVar.v(z, this);
        c(v);
        return v;
    }

    public String k(String str) {
        String str2 = (String) ((TreeMap) this.b).get(str);
        return str2 == null ? "" : str2;
    }

    public List l(pe2 pe2Var, int i, long j) {
        q33 q33Var = (q33) this.b;
        List list = (List) q33Var.b(i);
        if (list != null) {
            return list;
        }
        List a = pe2Var.a(i);
        int size = a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((pw2) a.get(i2)).u(j));
        }
        q33Var.i(i, arrayList);
        return arrayList;
    }

    public void m(int i, Object obj, io1 io1Var, Object obj2) {
        if (j42.c(obj, de0.a)) {
            b(i, io1Var, null);
        }
    }

    public void n(String str, String str2) {
        ((TreeMap) this.b).put(str, str2);
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return (String) this.b;
            default:
                return super.toString();
        }
    }

    public d1(Class cls) {
        this.a = (byte) 0;
        this.b = cls;
    }

    public d1(int i, String str) {
        this.a = (byte) 4;
        this.b = str;
    }
}

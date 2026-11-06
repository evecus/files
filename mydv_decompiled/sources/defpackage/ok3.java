package defpackage;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ok3 implements Comparable {
    public static final String J;
    public final h00 I;

    static {
        String str = File.separator;
        str.getClass();
        J = str;
    }

    public ok3(h00 h00Var) {
        h00Var.getClass();
        this.I = h00Var;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int c = f.c(this);
        h00 h00Var = this.I;
        if (c == -1) {
            c = 0;
        } else if (c < h00Var.d() && h00Var.i(c) == 92) {
            c++;
        }
        int d = h00Var.d();
        int i = c;
        while (c < d) {
            if (h00Var.i(c) == 47 || h00Var.i(c) == 92) {
                arrayList.add(h00Var.o(i, c));
                i = c + 1;
            }
            c++;
        }
        if (i < h00Var.d()) {
            arrayList.add(h00Var.o(i, h00Var.d()));
        }
        return arrayList;
    }

    public final String b() {
        h00 h00Var = f.a;
        h00 h00Var2 = this.I;
        int k = h00.k(h00Var2, h00Var);
        if (k == -1) {
            k = h00.k(h00Var2, f.b);
        }
        if (k != -1) {
            h00Var2 = h00.p(h00Var2, k + 1, 0, 2);
        } else if (h() != null && h00Var2.d() == 2) {
            h00Var2 = h00.L;
        }
        return h00Var2.s();
    }

    public final ok3 c() {
        h00 h00Var = f.d;
        h00 h00Var2 = this.I;
        if (j42.c(h00Var2, h00Var)) {
            return null;
        }
        h00 h00Var3 = f.a;
        if (j42.c(h00Var2, h00Var3)) {
            return null;
        }
        h00 h00Var4 = f.b;
        if (j42.c(h00Var2, h00Var4)) {
            return null;
        }
        h00 h00Var5 = f.e;
        h00Var2.getClass();
        h00Var5.getClass();
        int d = h00Var2.d();
        byte[] bArr = h00Var5.I;
        if (h00Var2.m(d - bArr.length, h00Var5, bArr.length) && (h00Var2.d() == 2 || h00Var2.m(h00Var2.d() - 3, h00Var3, 1) || h00Var2.m(h00Var2.d() - 3, h00Var4, 1))) {
            return null;
        }
        int k = h00.k(h00Var2, h00Var3);
        if (k == -1) {
            k = h00.k(h00Var2, h00Var4);
        }
        if (k == 2 && h() != null) {
            if (h00Var2.d() == 3) {
                return null;
            }
            return new ok3(h00.p(h00Var2, 0, 3, 1));
        }
        if (k == 1) {
            h00Var4.getClass();
            if (h00Var2.m(0, h00Var4, h00Var4.d())) {
                return null;
            }
        }
        if (k != -1 || h() == null) {
            return k == -1 ? new ok3(h00Var) : k == 0 ? new ok3(h00.p(h00Var2, 0, 1, 1)) : new ok3(h00.p(h00Var2, 0, k, 1));
        }
        if (h00Var2.d() == 2) {
            return null;
        }
        return new ok3(h00.p(h00Var2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ok3 ok3Var = (ok3) obj;
        ok3Var.getClass();
        return this.I.compareTo(ok3Var.I);
    }

    public final ok3 d(ok3 ok3Var) {
        ok3Var.getClass();
        h00 h00Var = ok3Var.I;
        int c = f.c(this);
        h00 h00Var2 = this.I;
        ok3 ok3Var2 = c == -1 ? null : new ok3(h00Var2.o(0, c));
        int c2 = f.c(ok3Var);
        if (!j42.c(ok3Var2, c2 == -1 ? null : new ok3(h00Var.o(0, c2)))) {
            s83.u("Paths of different roots cannot be relative to each other: ", this, " and ", ok3Var);
            return null;
        }
        ArrayList a = a();
        ArrayList a2 = ok3Var.a();
        int min = Math.min(a.size(), a2.size());
        int i = 0;
        while (i < min && j42.c(a.get(i), a2.get(i))) {
            i++;
        }
        if (i == min && h00Var2.d() == h00Var.d()) {
            return o63.f(".");
        }
        if (a2.subList(i, a2.size()).indexOf(f.e) != -1) {
            s83.u("Impossible relative path to resolve: ", this, " and ", ok3Var);
            return null;
        }
        if (j42.c(h00Var, f.d)) {
            return this;
        }
        cz czVar = new cz();
        h00 b = f.b(ok3Var);
        if (b == null && (b = f.b(this)) == null) {
            b = f.f(J);
        }
        int size = a2.size();
        for (int i2 = i; i2 < size; i2++) {
            czVar.c0(f.e);
            czVar.c0(b);
        }
        int size2 = a.size();
        while (i < size2) {
            czVar.c0((h00) a.get(i));
            czVar.c0(b);
            i++;
        }
        return f.d(czVar, false);
    }

    public final ok3 e(ok3 ok3Var, boolean z) {
        ok3Var.getClass();
        return f.a(this, ok3Var, z);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ok3) && j42.c(((ok3) obj).I, this.I);
    }

    public final ok3 f(String str) {
        str.getClass();
        cz czVar = new cz();
        czVar.k0(str);
        return f.a(this, f.d(czVar, false), false);
    }

    public final Path g() {
        Path path = Paths.get(this.I.s(), new String[0]);
        path.getClass();
        return path;
    }

    public final Character h() {
        h00 h00Var = f.a;
        h00 h00Var2 = this.I;
        if (h00.g(h00Var2, h00Var) != -1 || h00Var2.d() < 2 || h00Var2.i(1) != 58) {
            return null;
        }
        char i = (char) h00Var2.i(0);
        if (('a' > i || i >= '{') && ('A' > i || i >= '[')) {
            return null;
        }
        return Character.valueOf(i);
    }

    public final int hashCode() {
        return this.I.hashCode();
    }

    public final File toFile() {
        return new File(this.I.s());
    }

    public final String toString() {
        return this.I.s();
    }
}

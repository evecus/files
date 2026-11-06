package defpackage;

/* loaded from: classes2.dex */
public final class f0 {
    public static final e0[] d = new e0[0];
    public e0[] a;
    public int b;
    public boolean c;

    public f0(int i) {
        if (i < 0) {
            s83.t("'initialCapacity' must not be negative");
            throw null;
        }
        this.a = i == 0 ? d : new e0[i];
        this.b = 0;
        this.c = false;
    }

    public static e0[] b(e0[] e0VarArr) {
        return e0VarArr.length < 1 ? d : (e0[]) e0VarArr.clone();
    }

    public final void a(e0 e0Var) {
        if (e0Var == null) {
            zy.m("'element' cannot be null");
            return;
        }
        e0[] e0VarArr = this.a;
        int length = e0VarArr.length;
        int i = this.b + 1;
        if (this.c | (i > length)) {
            e0VarArr = new e0[Math.max(e0VarArr.length, (i >> 1) + i)];
            System.arraycopy(this.a, 0, e0VarArr, 0, this.b);
            this.a = e0VarArr;
            this.c = false;
        }
        e0VarArr[this.b] = e0Var;
        this.b = i;
    }

    public final e0 c(int i) {
        if (i < this.b) {
            return this.a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i + " >= " + this.b);
    }

    public final e0[] d() {
        int i = this.b;
        if (i == 0) {
            return d;
        }
        e0[] e0VarArr = this.a;
        if (e0VarArr.length == i) {
            this.c = true;
            return e0VarArr;
        }
        e0[] e0VarArr2 = new e0[i];
        System.arraycopy(e0VarArr, 0, e0VarArr2, 0, i);
        return e0VarArr2;
    }

    public f0() {
        this(10);
    }
}

package defpackage;

import java.util.Enumeration;

/* loaded from: classes2.dex */
public final class w0 implements Enumeration {
    public int a = 0;
    public final /* synthetic */ x0 b;

    public w0(x0 x0Var) {
        this.b = x0Var;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.a < this.b.I.length;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        int i = this.a;
        e0[] e0VarArr = this.b.I;
        if (i < e0VarArr.length) {
            this.a = i + 1;
            return e0VarArr[i];
        }
        zy.k();
        return null;
    }
}

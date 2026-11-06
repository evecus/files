package defpackage;

/* loaded from: classes2.dex */
public final class r51 {
    public final byte a;
    public j81 b;
    public final /* synthetic */ v51 c;

    /* JADX WARN: Multi-variable type inference failed */
    public r51(v51 v51Var, int i, j81 j81Var) {
        this.c = v51Var;
        this.a = i;
        this.b = j81Var;
    }

    public final v51 a() {
        String str;
        if (this.c.p(this.a)) {
            v51 a = this.c.a();
            if (a != this.c) {
                synchronized (a) {
                    a.f = this.a;
                    a.g = this.b;
                }
                return a;
            }
            str = "implementation returned current curve";
        } else {
            str = "unsupported coordinate system";
        }
        zy.i(str);
        return null;
    }
}

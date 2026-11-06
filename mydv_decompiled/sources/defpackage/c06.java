package defpackage;

/* loaded from: classes2.dex */
public abstract class c06 {
    public v51 a;
    public b06 b;

    public abstract v51 a();

    public abstract b06 b();

    public final synchronized v51 c() {
        v51 v51Var;
        v51Var = this.a;
        if (v51Var == null) {
            v51Var = a();
            this.a = v51Var;
        }
        return v51Var;
    }

    public final synchronized b06 d() {
        b06 b06Var;
        b06Var = this.b;
        if (b06Var == null) {
            b06Var = b();
            this.b = b06Var;
        }
        return b06Var;
    }
}

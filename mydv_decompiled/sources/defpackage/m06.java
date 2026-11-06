package defpackage;

/* loaded from: classes2.dex */
public final class m06 {
    public final k06 a;
    public long b = 0;
    public long c = -1;
    public byte[] d = null;
    public byte[] e = null;
    public byte[] f = null;
    public byte[] g = null;
    public ss h = null;
    public byte[] i = null;

    public m06(k06 k06Var) {
        this.a = k06Var;
    }

    public final void a(ss ssVar) {
        long j = ssVar.J;
        k06 k06Var = this.a;
        if (j < 0) {
            j = (1 << k06Var.b) - 1;
        }
        q06 q06Var = k06Var.a;
        this.h = ssVar.h(j, q06Var.c, q06Var.e);
    }
}

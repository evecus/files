package defpackage;

import java.security.MessageDigest;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xs1 extends gl1 {
    public final MessageDigest I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs1(ew ewVar) {
        super(ewVar);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.getClass();
        this.I = messageDigest;
    }

    public final h00 e() {
        byte[] digest = this.I.digest();
        digest.getClass();
        return new h00(digest);
    }

    @Override // defpackage.gl1, defpackage.eq4
    public final void write(cz czVar, long j) {
        czVar.getClass();
        o7.j(czVar.J, 0L, j);
        kh4 kh4Var = czVar.I;
        kh4Var.getClass();
        long j2 = 0;
        while (j2 < j) {
            int min = (int) Math.min(j - j2, kh4Var.c - kh4Var.b);
            this.I.update(kh4Var.a, kh4Var.b, min);
            j2 += min;
            kh4Var = kh4Var.f;
            kh4Var.getClass();
        }
        super.write(czVar, j);
    }
}

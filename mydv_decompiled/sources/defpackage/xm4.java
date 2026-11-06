package defpackage;

import android.graphics.Shader;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class xm4 extends wy {
    public ep a;
    public long b = 9205357640488583168L;

    @Override // defpackage.wy
    public final void a(float f, long j, qj3 qj3Var) {
        ep epVar = this.a;
        if (epVar == null || !fq4.a(this.b, j)) {
            if (fq4.c(j)) {
                this.a = null;
                this.b = 9205357640488583168L;
                epVar = null;
            } else {
                epVar = this.a;
                if (epVar == null) {
                    epVar = new ep((byte) 26, false);
                    this.a = epVar;
                }
                epVar.J = c(j);
                this.a = epVar;
                this.b = j;
            }
        }
        pd pdVar = (pd) qj3Var;
        long a = pdVar.a();
        long j2 = x70.b;
        if (!zc5.a(a, j2)) {
            pdVar.f(j2);
        }
        if (!j42.c(pdVar.c, epVar != null ? (Shader) epVar.J : null)) {
            pdVar.i(epVar != null ? (Shader) epVar.J : null);
        }
        if (pdVar.a.getAlpha() / 255.0f == f) {
            return;
        }
        pdVar.d(f);
    }

    public abstract Shader c(long j);
}

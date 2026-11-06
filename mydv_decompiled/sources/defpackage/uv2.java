package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class uv2 extends q13 {
    public final short a;
    public final or0 b;
    public final float c;

    /* JADX WARN: Multi-variable type inference failed */
    public uv2(int i, or0 or0Var, float f) {
        this.a = i;
        this.b = or0Var;
        this.c = f;
    }

    @Override // defpackage.q13
    public final k13 create() {
        return new vv2(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv2)) {
            return false;
        }
        uv2 uv2Var = (uv2) obj;
        return this.a == uv2Var.a && j42.c(this.b, uv2Var.b) && r11.c(this.c, uv2Var.c);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.c) + ((this.b.hashCode() + ((126573 + this.a) * 31)) * 31);
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.a = "basicMarquee";
        fq fqVar = z12Var.c;
        fqVar.b(3, "iterations");
        fqVar.b(new tv2(), "animationMode");
        fqVar.b(1200, "delayMillis");
        fqVar.b(Integer.valueOf(this.a), "initialDelayMillis");
        fqVar.b(this.b, "spacing");
        fqVar.b(new r11(this.c), "velocity");
    }

    public final String toString() {
        String d = r11.d(this.c);
        StringBuilder sb = new StringBuilder("MarqueeModifierElement(iterations=3, animationMode=Immediately, delayMillis=1200, initialDelayMillis=");
        sb.append((int) this.a);
        sb.append(", spacing=");
        sb.append(this.b);
        sb.append(", velocity=");
        return hf1.z(sb, d, ")");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        vv2 vv2Var = (vv2) k13Var;
        vv2Var.R.setValue(this.b);
        vv2Var.S.setValue(new tv2());
        byte b = vv2Var.I;
        short s = this.a;
        float f = this.c;
        if (b == 3 && vv2Var.J == 1200 && vv2Var.K == s && r11.c(vv2Var.L, f)) {
            return;
        }
        vv2Var.I = (byte) 3;
        vv2Var.J = (short) 1200;
        vv2Var.K = s;
        vv2Var.L = f;
        vv2Var.k0();
    }
}

package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class nh5 extends mh5 {
    public kl3[] a;
    public String b;
    public int c;

    public nh5(nh5 nh5Var) {
        this.a = null;
        this.c = 0;
        this.b = nh5Var.b;
        this.a = il2.s(nh5Var.a);
    }

    public kl3[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(kl3[] kl3VarArr) {
        if (!il2.l(this.a, kl3VarArr)) {
            this.a = il2.s(kl3VarArr);
            return;
        }
        kl3[] kl3VarArr2 = this.a;
        for (int i = 0; i < kl3VarArr.length; i++) {
            kl3VarArr2[i].a = kl3VarArr[i].a;
            int i2 = 0;
            while (true) {
                float[] fArr = kl3VarArr[i].b;
                if (i2 < fArr.length) {
                    kl3VarArr2[i].b[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public nh5() {
        this.a = null;
        this.c = 0;
    }
}

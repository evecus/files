package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class fq2 {
    public static final float a;
    public static final float b;
    public static final List c;
    public static final float d;

    static {
        long j;
        char c2;
        char c3;
        char c4;
        char c5;
        float f = o7.p;
        a = f;
        float f2 = o7.n;
        b = f2;
        float f3 = o7.m;
        jp jpVar = dw2.a;
        n74 q = jpVar.q();
        n74 m = jp.m();
        n74 n74Var = dw2.i;
        if (n74Var == null) {
            j = 4294967295L;
            c2 = ' ';
            c3 = 0;
            n74Var = jp.f(jpVar, p70.k0(new cw2((Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(-0.009f) & 4294967295L), new ok0(0.172f, 2)), new cw2((Float.floatToRawIntBits(0.365f) & 4294967295L) | (Float.floatToRawIntBits(1.03f) << 32), new ok0(0.164f, 2)), new cw2((Float.floatToRawIntBits(0.97f) & 4294967295L) | (Float.floatToRawIntBits(0.828f) << 32), new ok0(0.169f, 2))), 1, 4).b();
            dw2.i = n74Var;
        } else {
            j = 4294967295L;
            c2 = ' ';
            c3 = 0;
        }
        n74 n74Var2 = dw2.h;
        if (n74Var2 == null) {
            cw2 cw2Var = new cw2((Float.floatToRawIntBits(0.039f) & j) | (Float.floatToRawIntBits(0.961f) << c2), new ok0(0.426f, 2));
            cw2 cw2Var2 = new cw2((Float.floatToRawIntBits(1.001f) << c2) | (Float.floatToRawIntBits(0.428f) & j));
            cw2 cw2Var3 = new cw2((Float.floatToRawIntBits(1.0f) << c2) | (Float.floatToRawIntBits(0.609f) & j), new ok0(1.0f, 2));
            cw2[] cw2VarArr = new cw2[3];
            cw2VarArr[c3] = cw2Var;
            cw2VarArr[1] = cw2Var2;
            cw2VarArr[2] = cw2Var3;
            n74Var2 = jp.f(jpVar, p70.k0(cw2VarArr), 2, 4).b();
            dw2.h = n74Var2;
        }
        n74 r = jp.r();
        n74 l = jpVar.l();
        n74 n74Var3 = dw2.g;
        if (n74Var3 == null) {
            float[] a2 = nw2.a();
            nw2.g(a2, 1.0f, 0.64f, 4);
            c4 = 4;
            c5 = 1;
            n74Var3 = qi4.c(15).c(new z7(a2, (byte) 1)).c(new z7(dw2.d, (byte) 1)).b();
            dw2.g = n74Var3;
        } else {
            c4 = 4;
            c5 = 1;
        }
        n74[] n74VarArr = new n74[7];
        n74VarArr[c3] = q;
        n74VarArr[c5] = m;
        n74VarArr[2] = n74Var;
        n74VarArr[3] = n74Var2;
        n74VarArr[c4] = r;
        n74VarArr[5] = l;
        n74VarArr[6] = n74Var3;
        c = p70.k0(n74VarArr);
        n74 n74Var4 = dw2.f;
        if (n74Var4 == null) {
            n74Var4 = qi4.c(14).b();
            dw2.f = n74Var4;
        }
        float[] a3 = nw2.a();
        nw2.e(a3, 18.0f);
        n74 c6 = n74Var4.c(new z7(a3, (byte) 1));
        n74 q2 = jpVar.q();
        n74[] n74VarArr2 = new n74[2];
        n74VarArr2[c3] = c6;
        n74VarArr2[1] = q2;
        p70.k0(n74VarArr2);
        d = f3 / Math.min(f, f2);
    }
}

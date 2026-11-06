package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class y02 {
    public final /* synthetic */ byte a;
    public final gv1 b;
    public final gv1 c;
    public final gv1 d;
    public final gv1 e;
    public final Serializable f;

    /* JADX WARN: Multi-variable type inference failed */
    public y02(y02[] y02VarArr) {
        final byte b = 0;
        this.a = (byte) 0;
        this.f = y02VarArr;
        int length = y02VarArr.length;
        final gv1[] gv1VarArr = new gv1[length];
        for (int i = 0; i < length; i++) {
            gv1VarArr[i] = ((y02[]) this.f)[i].b();
        }
        final byte b2 = 1;
        this.b = new gv1(new hn1() { // from class: yi5
            @Override // defpackage.hn1
            public final Object invoke(Object obj, Object obj2) {
                float e;
                byte b3 = b2;
                gv1[] gv1VarArr2 = gv1VarArr;
                an3 an3Var = (an3) obj;
                float floatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        e = il2.e(an3Var, false, gv1VarArr2, floatValue);
                        break;
                    default:
                        e = il2.e(an3Var, true, gv1VarArr2, floatValue);
                        break;
                }
                return Float.valueOf(e);
            }
        }, (byte) 1);
        int length2 = ((y02[]) this.f).length;
        final gv1[] gv1VarArr2 = new gv1[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            gv1VarArr2[i2] = ((y02[]) this.f)[i2].d();
        }
        this.c = new gv1(new hn1() { // from class: fv1
            @Override // defpackage.hn1
            public final Object invoke(Object obj, Object obj2) {
                float e;
                byte b3 = b2;
                gv1[] gv1VarArr3 = gv1VarArr2;
                an3 an3Var = (an3) obj;
                float floatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        e = il2.e(an3Var, false, gv1VarArr3, floatValue);
                        break;
                    default:
                        e = il2.e(an3Var, true, gv1VarArr3, floatValue);
                        break;
                }
                return Float.valueOf(e);
            }
        }, (byte) 0);
        int length3 = ((y02[]) this.f).length;
        final gv1[] gv1VarArr3 = new gv1[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            gv1VarArr3[i3] = ((y02[]) this.f)[i3].c();
        }
        this.d = new gv1(new hn1() { // from class: yi5
            @Override // defpackage.hn1
            public final Object invoke(Object obj, Object obj2) {
                float e;
                byte b3 = b;
                gv1[] gv1VarArr22 = gv1VarArr3;
                an3 an3Var = (an3) obj;
                float floatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        e = il2.e(an3Var, false, gv1VarArr22, floatValue);
                        break;
                    default:
                        e = il2.e(an3Var, true, gv1VarArr22, floatValue);
                        break;
                }
                return Float.valueOf(e);
            }
        }, (byte) 1);
        int length4 = ((y02[]) this.f).length;
        final gv1[] gv1VarArr4 = new gv1[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            gv1VarArr4[i4] = ((y02[]) this.f)[i4].a();
        }
        this.e = new gv1(new hn1() { // from class: fv1
            @Override // defpackage.hn1
            public final Object invoke(Object obj, Object obj2) {
                float e;
                byte b3 = b;
                gv1[] gv1VarArr32 = gv1VarArr4;
                an3 an3Var = (an3) obj;
                float floatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        e = il2.e(an3Var, false, gv1VarArr32, floatValue);
                        break;
                    default:
                        e = il2.e(an3Var, true, gv1VarArr32, floatValue);
                        break;
                }
                return Float.valueOf(e);
            }
        }, (byte) 0);
    }

    public final gv1 a() {
        byte b = this.a;
        return this.e;
    }

    public final gv1 b() {
        byte b = this.a;
        return this.b;
    }

    public final gv1 c() {
        byte b = this.a;
        return this.d;
    }

    public final gv1 d() {
        byte b = this.a;
        return this.c;
    }

    public final String toString() {
        byte b = this.a;
        Object obj = this.f;
        switch (b) {
            case 0:
                return dq.h1((y02[]) obj, null, null, 57);
            default:
                return r7.C("RectRulers(", (String) obj, ")");
        }
    }

    public y02(String str) {
        this.a = (byte) 1;
        this.f = str;
        this.b = new gv1(null, (byte) 1);
        this.c = new gv1(null, (byte) 0);
        this.d = new gv1(null, (byte) 1);
        this.e = new gv1(null, (byte) 0);
    }
}

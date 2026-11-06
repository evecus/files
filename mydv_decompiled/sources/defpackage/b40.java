package defpackage;

import androidx.media3.extractor.ts.PsExtractor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b40 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ rm1 J;

    public /* synthetic */ b40(rm1 rm1Var, byte b) {
        this.I = b;
        this.J = rm1Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        rm1 rm1Var = this.J;
        switch (b) {
            case 0:
                rm1Var.invoke();
                break;
            case 1:
                ei1 ei1Var = (ei1) obj;
                ei1Var.getClass();
                ei1Var.c(new b40(rm1Var, (byte) 2));
                break;
            case 2:
                int i = ((oh1) obj).a;
                if (i != 4 && i != 3) {
                    break;
                } else {
                    rm1Var.invoke();
                    break;
                }
            case 3:
                rm1Var.invoke();
                break;
            case 4:
                if (rm1Var != null) {
                    rm1Var.invoke();
                    break;
                }
                break;
            case 5:
                ei1 ei1Var2 = (ei1) obj;
                ei1Var2.getClass();
                ei1Var2.c(new b40(rm1Var, (byte) 6));
                break;
            case 6:
                if (!((Boolean) rm1Var.invoke()).booleanValue()) {
                    break;
                } else {
                    break;
                }
            case 7:
                rm1Var.invoke();
                break;
            case 8:
                ei1 ei1Var3 = (ei1) obj;
                ei1Var3.getClass();
                ei1Var3.c(new b40(rm1Var, (byte) 9));
                break;
            case 9:
                if (!((Boolean) rm1Var.invoke()).booleanValue()) {
                    break;
                } else {
                    break;
                }
            case 10:
                n54 n54Var = (n54) obj;
                n54Var.getClass();
                n54Var.b(1.0f - ((Number) rm1Var.invoke()).floatValue());
                break;
            case 11:
                rm1Var.invoke();
                break;
            case 12:
                ((w82) obj).getClass();
                rm1Var.invoke();
                break;
            case 13:
                ((w82) obj).getClass();
                rm1Var.invoke();
                break;
            case 14:
                break;
            case 15:
                zh0 zh0Var = (zh0) obj;
                zh0Var.getClass();
                ya2 ya2Var = (ya2) zh0Var;
                ya2Var.a();
                float P = ya2Var.P(4.0f);
                float floatValue = ((Number) rm1Var.invoke()).floatValue() * Float.intBitsToFloat((int) (ya2Var.I.J.H() >> 32));
                float f = P / 2.0f;
                r7.o(zh0Var, hx2.c, (Float.floatToRawIntBits(floatValue - f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r1.H() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(P) << 32), (Float.floatToRawIntBits(f) << 32) | (4294967295L & Float.floatToRawIntBits(f)), 0.0f, PsExtractor.VIDEO_STREAM_MASK);
                break;
            case 16:
                ei1 ei1Var4 = (ei1) obj;
                ei1Var4.getClass();
                ei1Var4.c(new b40(rm1Var, (byte) 17));
                break;
            case 17:
                if (!((Boolean) rm1Var.invoke()).booleanValue()) {
                    break;
                } else {
                    break;
                }
            case 18:
                ((Boolean) obj).booleanValue();
                rm1Var.invoke();
                break;
            case 19:
                n54 n54Var2 = (n54) obj;
                n54Var2.getClass();
                float floatValue2 = ((Number) rm1Var.invoke()).floatValue();
                n54Var2.b(1.0f - floatValue2);
                n54Var2.y(Float.intBitsToFloat((int) (4294967295L & n54Var2.Y)) * 0.5f * floatValue2);
                break;
            case 20:
                rm1Var.invoke();
                break;
            case 21:
                rm1Var.invoke();
                break;
            case 22:
                rm1Var.invoke();
                break;
            case 23:
                rm1Var.invoke();
                break;
            case 24:
                if (rm1Var != null) {
                    rm1Var.invoke();
                    break;
                }
                break;
            case 25:
                rm1Var.invoke();
                break;
            case 26:
                rm1Var.invoke();
                break;
            default:
                cj4 cj4Var = (cj4) obj;
                Object invoke = rm1Var.invoke();
                if (Float.isNaN(((Number) invoke).floatValue())) {
                    invoke = null;
                }
                Float f2 = (Float) invoke;
                float floatValue3 = f2 != null ? f2.floatValue() : 0.0f;
                if (floatValue3 < 0.0f) {
                    floatValue3 = 0.0f;
                }
                if (floatValue3 > 1.0f) {
                    floatValue3 = 1.0f;
                }
                hx3 hx3Var = new hx3(floatValue3, 0, new z60(0.0f, 1.0f));
                d82[] d82VarArr = aj4.a;
                bj4 bj4Var = zi4.c;
                d82 d82Var = aj4.a[1];
                bj4Var.getClass();
                cj4Var.c(bj4Var, hx3Var);
                break;
        }
        return wd5Var;
    }
}

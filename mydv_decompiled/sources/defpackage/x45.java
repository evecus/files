package defpackage;

import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class x45 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ x45(y55 y55Var, nj njVar, fg fgVar) {
        this.I = (byte) 1;
        this.J = njVar;
        this.K = fgVar;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        long j;
        v55 d;
        oh2 oh2Var;
        oj ojVar;
        so3 so3Var;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj = this.K;
        Object obj2 = this.J;
        switch (b) {
            case 0:
                u45 u45Var = (u45) obj2;
                long j2 = ((z22) ((t43) obj).getValue()).a;
                pd3 g = u45Var.g();
                long j3 = 9205357640488583168L;
                if (g != null) {
                    long j4 = g.a;
                    oj k = u45Var.k();
                    if (k != null && k.J.length() != 0) {
                        is1 is1Var = (is1) u45Var.q.getValue();
                        int i = is1Var == null ? -1 : w45.a[is1Var.ordinal()];
                        if (i != -1) {
                            if (i != 1 && i != 2) {
                                if (i != 3) {
                                    s83.v();
                                    break;
                                } else {
                                    long j5 = u45Var.l().b;
                                    int i2 = d65.c;
                                    j = j5 & 4294967295L;
                                }
                            } else {
                                long j6 = u45Var.l().b;
                                int i3 = d65.c;
                                j = j6 >> 32;
                            }
                            int i4 = (int) j;
                            oh2 oh2Var2 = u45Var.d;
                            if (oh2Var2 != null && (d = oh2Var2.d()) != null && (oh2Var = u45Var.d) != null && (ojVar = oh2Var.a.a) != null) {
                                int r = ut0.r(u45Var.b.k(i4), 0, ojVar.J.length());
                                float intBitsToFloat = Float.intBitsToFloat((int) (d.d(j4) >> 32));
                                u55 u55Var = d.a;
                                w23 w23Var = u55Var.b;
                                int d2 = w23Var.d(r);
                                float f = u55Var.f(d2);
                                float g2 = u55Var.g(d2);
                                float q = ut0.q(intBitsToFloat, Math.min(f, g2), Math.max(f, g2));
                                if (z22.b(j2, 0L) || Math.abs(intBitsToFloat - q) <= ((int) (j2 >> 32)) / 2) {
                                    float f2 = w23Var.f(d2);
                                    j3 = (Float.floatToRawIntBits(q) << 32) | (Float.floatToRawIntBits(((w23Var.b(d2) - f2) / 2.0f) + f2) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                break;
            case 1:
                fg fgVar = (fg) obj;
                ek2 ek2Var = (ek2) ((nj) obj2).a;
                if (ek2Var instanceof dk2) {
                    try {
                        fgVar.a(((dk2) ek2Var).a);
                        break;
                    } catch (IllegalArgumentException unused) {
                        break;
                    }
                }
                break;
            case 2:
                tm1 tm1Var = (tm1) obj;
                int ordinal = ((so3) obj2).ordinal();
                if (ordinal == 0) {
                    so3Var = so3.L;
                } else if (ordinal == 1) {
                    so3Var = so3.M;
                } else if (ordinal != 2) {
                    s83.v();
                    break;
                } else {
                    so3Var = so3.K;
                }
                tm1Var.invoke(so3Var);
                break;
            case 3:
                tm1 tm1Var2 = (tm1) obj2;
                t43 t43Var = (t43) obj;
                if (tm1Var2 != null) {
                    Boolean bool = (Boolean) t43Var.getValue();
                    bool.booleanValue();
                    tm1Var2.invoke(bool);
                    break;
                }
                break;
            case 4:
                rm1 rm1Var = (rm1) obj2;
                Long l = (Long) ((t43) obj).getValue();
                break;
            case 5:
                tm1 tm1Var3 = (tm1) obj2;
                ExoPlayer exoPlayer = (ExoPlayer) obj;
                if (tm1Var3 != null) {
                    tm1Var3.invoke(exoPlayer);
                    break;
                }
                break;
            default:
                ((nu5) ((g73) obj2).J).a((ol) obj);
                break;
        }
        return wd5Var;
        return wd5Var;
    }

    public /* synthetic */ x45(Object obj, Object obj2, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
    }
}

package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yv3 implements tm1 {
    public final /* synthetic */ byte I;

    public /* synthetic */ yv3(a74 a74Var) {
        this.I = (byte) 5;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        y81 y81Var = null;
        y81Var = null;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                ((Long) obj).getClass();
                return wd5Var;
            case 1:
                ((Long) obj).getClass();
                return wd5Var;
            case 2:
                uj3 uj3Var = (uj3) obj;
                uj3Var.getClass();
                return ((String) uj3Var.I) + "=" + ((String) uj3Var.J);
            case 3:
                return false;
            case 4:
                e16 e16Var = (e16) obj;
                e16Var.getClass();
                ok3 ok3Var = u44.L;
                return Boolean.valueOf(vt0.F(e16Var.a));
            case 5:
                ((op0) obj).getClass();
                throw new ab3(0);
            case 6:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                Boolean bool = obj2 != null ? (Boolean) obj2 : null;
                bool.getClass();
                boolean booleanValue = bool.booleanValue();
                Object obj3 = list.get(1);
                da daVar = eu5.A;
                if (!j42.c(obj3, Boolean.FALSE) && obj3 != null) {
                    y81Var = (y81) ((tm1) daVar.K).invoke(obj3);
                }
                y81Var.getClass();
                return new vn3(y81Var.a, booleanValue);
            case 7:
                obj.getClass();
                return new y81(((Integer) obj).intValue());
            case 8:
                obj.getClass();
                return new kj2(((Integer) obj).intValue());
            case 9:
                obj.getClass();
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                a65 a65Var = (j42.c(obj4, Boolean.FALSE) || obj4 == null) ? null : (a65) ((tm1) eu5.D.K).invoke(obj4);
                a65Var.getClass();
                int i = a65Var.a;
                Object obj5 = list2.get(1);
                Boolean bool2 = obj5 != null ? (Boolean) obj5 : null;
                bool2.getClass();
                return new b65(i, bool2.booleanValue());
            case 10:
                obj.getClass();
                return new a65(((Integer) obj).intValue());
            case 11:
                return Integer.valueOf(((eb4) obj).b);
            case 12:
                return Integer.valueOf(((eb4) obj).c.a());
            case 13:
                return new sb4(((Integer) obj).intValue());
            case 14:
                String str = (String) obj;
                str.getClass();
                return str;
            case 15:
                ((String) obj).getClass();
                return "suggestion";
            case 16:
                pd3 pd3Var = (pd3) obj;
                long j = pd3Var.a;
                return (9223372034707292159L & j) != 9205357640488583168L ? new ej(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & pd3Var.a))) : gi4.a;
            case 17:
                ej ejVar = (ej) obj;
                return new pd3((Float.floatToRawIntBits(ejVar.b) & 4294967295L) | (Float.floatToRawIntBits(ejVar.a) << 32));
            case 18:
                return obj;
            case 19:
                return Boolean.valueOf(obj == null);
            case 20:
                rr0 rr0Var = (rr0) obj;
                rr0Var.getClass();
                return rr0Var.I;
            case 21:
                fr frVar = (fr) obj;
                frVar.getClass();
                return frVar.I;
            case 22:
                on onVar = (on) obj;
                onVar.getClass();
                return onVar.I;
            case 23:
                t65 t65Var = (t65) obj;
                t65Var.getClass();
                return t65Var.I;
            case 24:
                ei1 ei1Var = (ei1) obj;
                ei1Var.getClass();
                ei1Var.b(ki1.c);
                return wd5Var;
            case 25:
                ei1 ei1Var2 = (ei1) obj;
                ei1Var2.getClass();
                ei1Var2.b(ki1.c);
                return wd5Var;
            case 26:
                ei1 ei1Var3 = (ei1) obj;
                ei1Var3.getClass();
                ei1Var3.b(ki1.c);
                return wd5Var;
            case 27:
                ei1 ei1Var4 = (ei1) obj;
                ei1Var4.getClass();
                ei1Var4.b(ki1.c);
                return wd5Var;
            case 28:
                s90 s90Var = (s90) obj;
                s90Var.getClass();
                return s90Var.I;
            default:
                po3 po3Var = (po3) obj;
                po3Var.getClass();
                return po3Var.I;
        }
    }

    public /* synthetic */ yv3(byte b) {
        this.I = b;
    }
}

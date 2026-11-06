package defpackage;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class tv3 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ hu2 J;
    public final /* synthetic */ dl4 K;
    public final /* synthetic */ t43 L;

    public /* synthetic */ tv3(hu2 hu2Var, dl4 dl4Var, t43 t43Var, byte b) {
        this.I = b;
        this.J = hu2Var;
        this.K = dl4Var;
        this.L = t43Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        t43 t43Var = this.L;
        dl4 dl4Var = this.K;
        hu2 hu2Var = this.J;
        String str = (String) obj;
        switch (b) {
            case 0:
                str.getClass();
                wm4 wm4Var = hu2Var.h;
                String str2 = dl4Var.a;
                if (!wm4Var.B(str2, str)) {
                    return wm3.J;
                }
                hu2Var.H(str2);
                t43Var.setValue(null);
                return wm3.I;
            default:
                str.getClass();
                wm4 wm4Var2 = hu2Var.h;
                String str3 = dl4Var.a;
                wm4Var2.getClass();
                str3.getClass();
                fl4 fl4Var = wm4Var2.b;
                fl4Var.getClass();
                if (str.length() == 4) {
                    int i = 0;
                    while (true) {
                        if (i >= str.length()) {
                            ArrayList s1 = o70.s1((Collection) fl4Var.g0.getValue());
                            int size = s1.size();
                            int i2 = 0;
                            int i3 = 0;
                            while (true) {
                                if (i3 < size) {
                                    Object obj2 = s1.get(i3);
                                    i3++;
                                    if (!j42.c(((dl4) obj2).a, str3)) {
                                        i2++;
                                    }
                                } else {
                                    i2 = -1;
                                }
                            }
                            if (i2 >= 0) {
                                byte[] bArr = new byte[16];
                                new SecureRandom().nextBytes(bArr);
                                StringBuilder sb = new StringBuilder();
                                sb.append((CharSequence) "");
                                int i4 = 0;
                                for (byte b2 : bArr) {
                                    i4++;
                                    if (i4 > 1) {
                                        sb.append((CharSequence) "");
                                    }
                                    sb.append((CharSequence) String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b2)}, 1)));
                                }
                                sb.append((CharSequence) "");
                                String sb2 = sb.toString();
                                s1.set(i2, dl4.a((dl4) s1.get(i2), fl4.t(str, sb2), sb2, null, 831));
                                fl4Var.A(s1);
                            }
                        } else if (Character.isDigit(str.charAt(i))) {
                            i++;
                        }
                    }
                }
                t43Var.setValue(Boolean.FALSE);
                return wd5.a;
        }
    }
}

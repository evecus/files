package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hs3 extends bp1 {
    private static final hs3 DEFAULT_INSTANCE;
    private static volatile nk3 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private o32 strings_ = vx3.L;

    static {
        hs3 hs3Var = new hs3();
        DEFAULT_INSTANCE = hs3Var;
        bp1.h(hs3.class, hs3Var);
    }

    public static hs3 j() {
        return DEFAULT_INSTANCE;
    }

    public static gs3 l() {
        return (gs3) ((xo1) DEFAULT_INSTANCE.d(5));
    }

    @Override // defpackage.bp1
    public final Object d(int i) {
        nk3 nk3Var;
        switch (pt1.F(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new j04(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new hs3();
            case 4:
                return new gs3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                nk3 nk3Var2 = PARSER;
                if (nk3Var2 != null) {
                    return nk3Var2;
                }
                synchronized (hs3.class) {
                    try {
                        nk3Var = PARSER;
                        if (nk3Var == null) {
                            nk3Var = new zo1();
                            PARSER = nk3Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return nk3Var;
            default:
                e1.a();
                return null;
        }
    }

    public final void i(Iterable iterable) {
        o32 o32Var = this.strings_;
        if (!((f4) o32Var).I) {
            int size = o32Var.size();
            o32Var = o32Var.a(size == 0 ? 10 : size * 2);
            this.strings_ = o32Var;
        }
        Charset charset = r32.a;
        if (iterable instanceof ch2) {
            List g = ((ch2) iterable).g();
            ch2 ch2Var = (ch2) o32Var;
            int size2 = o32Var.size();
            for (Object obj : g) {
                if (obj == null) {
                    String str = "Element at index " + (ch2Var.size() - size2) + " is null.";
                    for (int size3 = ch2Var.size() - 1; size3 >= size2; size3--) {
                        ch2Var.remove(size3);
                    }
                    zy.m(str);
                    return;
                }
                if (obj instanceof f00) {
                    ch2Var.b((f00) obj);
                } else {
                    ch2Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof kt3) {
            o32Var.addAll((Collection) iterable);
            return;
        }
        if ((o32Var instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) o32Var).ensureCapacity(((Collection) iterable).size() + o32Var.size());
        }
        int size4 = o32Var.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (o32Var.size() - size4) + " is null.";
                for (int size5 = o32Var.size() - 1; size5 >= size4; size5--) {
                    o32Var.remove(size5);
                }
                zy.m(str2);
                return;
            }
            o32Var.add(obj2);
        }
    }

    public final o32 k() {
        return this.strings_;
    }
}

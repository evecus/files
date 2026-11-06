package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class jw0 implements tm1 {
    public final /* synthetic */ byte I = 0;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ jw0(p63 p63Var, List list, boolean z) {
        this.K = p63Var;
        this.J = z;
        this.L = list;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        final byte b2 = 0;
        Object obj2 = this.L;
        Object obj3 = this.K;
        final boolean z = this.J;
        switch (b) {
            case 0:
                final p63 p63Var = (p63) obj3;
                final List list = (List) obj2;
                ti2 ti2Var = new ti2() { // from class: kw0
                    @Override // defpackage.ti2
                    public final void e(vi2 vi2Var, ji2 ji2Var) {
                        boolean z2 = z;
                        List list2 = list;
                        p63 p63Var2 = p63Var;
                        if (z2 && !list2.contains(p63Var2)) {
                            list2.add(p63Var2);
                        }
                        if (ji2Var == ji2.ON_START && !list2.contains(p63Var2)) {
                            list2.add(p63Var2);
                        }
                        if (ji2Var == ji2.ON_STOP) {
                            list2.remove(p63Var2);
                        }
                    }
                };
                p63Var.P.j.a(ti2Var);
                return new ow0(p63Var, ti2Var, (byte) 0);
            default:
                final is0 is0Var = (is0) obj3;
                final dl0 dl0Var = (dl0) obj2;
                cj4 cj4Var = (cj4) obj;
                if (z) {
                    rm1 rm1Var = new rm1() { // from class: ti3
                        @Override // defpackage.rm1
                        public final Object invoke() {
                            byte b3 = b2;
                            fj0 fj0Var = null;
                            dl0 dl0Var2 = dl0Var;
                            is0 is0Var2 = is0Var;
                            boolean z2 = false;
                            boolean z3 = false;
                            boolean z4 = false;
                            boolean z5 = false;
                            byte b4 = 1;
                            switch (b3) {
                                case 0:
                                    if (is0Var2.b()) {
                                        p70.g0(dl0Var2, null, null, new ui3(is0Var2, fj0Var, z2 ? (byte) 1 : (byte) 0), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 1:
                                    if (is0Var2.c()) {
                                        p70.g0(dl0Var2, null, null, new ui3(is0Var2, fj0Var, b4), 3);
                                        z5 = true;
                                    }
                                    return Boolean.valueOf(z5);
                                case 2:
                                    if (is0Var2.b()) {
                                        p70.g0(dl0Var2, null, null, new ui3(is0Var2, fj0Var, z2 ? (byte) 1 : (byte) 0), 3);
                                        z4 = true;
                                    }
                                    return Boolean.valueOf(z4);
                                default:
                                    if (is0Var2.c()) {
                                        p70.g0(dl0Var2, null, null, new ui3(is0Var2, fj0Var, b4), 3);
                                        z3 = true;
                                    }
                                    return Boolean.valueOf(z3);
                            }
                        }
                    };
                    d82[] d82VarArr = aj4.a;
                    cj4Var.c(ii4.y, new v4(null, rm1Var));
                    final byte b3 = 1;
                    cj4Var.c(ii4.A, new v4(null, new rm1() { // from class: ti3
                        @Override // defpackage.rm1
                        public final Object invoke() {
                            byte b32 = b3;
                            fj0 fj0Var = null;
                            dl0 dl0Var2 = dl0Var;
                            is0 is0Var2 = is0Var;
                            boolean z2 = false;
                            boolean z3 = false;
                            boolean z4 = false;
                            boolean z5 = false;
                            byte b4 = 1;
                            switch (b32) {
                                case 0:
                                    if (is0Var2.b()) {
                                        p70.g0(dl0Var2, null, null, new ui3(is0Var2, fj0Var, z2 ? (byte) 1 : (byte) 0), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 1:
                                    if (is0Var2.c()) {
                                        p70.g0(dl0Var2, null, null, new ui3(is0Var2, fj0Var, b4), 3);
                                        z5 = true;
                                    }
                                    return Boolean.valueOf(z5);
                                case 2:
                                    if (is0Var2.b()) {
                                        p70.g0(dl0Var2, null, null, new ui3(is0Var2, fj0Var, z2 ? (byte) 1 : (byte) 0), 3);
                                        z4 = true;
                                    }
                                    return Boolean.valueOf(z4);
                                default:
                                    if (is0Var2.c()) {
                                        p70.g0(dl0Var2, null, null, new ui3(is0Var2, fj0Var, b4), 3);
                                        z3 = true;
                                    }
                                    return Boolean.valueOf(z3);
                            }
                        }
                    }));
                } else {
                    final byte b4 = 2;
                    rm1 rm1Var2 = new rm1() { // from class: ti3
                        @Override // defpackage.rm1
                        public final Object invoke() {
                            byte b32 = b4;
                            fj0 fj0Var = null;
                            dl0 dl0Var2 = dl0Var;
                            is0 is0Var2 = is0Var;
                            boolean z2 = false;
                            boolean z3 = false;
                            boolean z4 = false;
                            boolean z5 = false;
                            byte b42 = 1;
                            switch (b32) {
                                case 0:
                                    if (is0Var2.b()) {
                                        p70.g0(dl0Var2, null, null, new ui3(is0Var2, fj0Var, z2 ? (byte) 1 : (byte) 0), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 1:
                                    if (is0Var2.c()) {
                                        p70.g0(dl0Var2, null, null, new ui3(is0Var2, fj0Var, b42), 3);
                                        z5 = true;
                                    }
                                    return Boolean.valueOf(z5);
                                case 2:
                                    if (is0Var2.b()) {
                                        p70.g0(dl0Var2, null, null, new ui3(is0Var2, fj0Var, z2 ? (byte) 1 : (byte) 0), 3);
                                        z4 = true;
                                    }
                                    return Boolean.valueOf(z4);
                                default:
                                    if (is0Var2.c()) {
                                        p70.g0(dl0Var2, null, null, new ui3(is0Var2, fj0Var, b42), 3);
                                        z3 = true;
                                    }
                                    return Boolean.valueOf(z3);
                            }
                        }
                    };
                    d82[] d82VarArr2 = aj4.a;
                    cj4Var.c(ii4.z, new v4(null, rm1Var2));
                    final byte b5 = 3;
                    cj4Var.c(ii4.B, new v4(null, new rm1() { // from class: ti3
                        @Override // defpackage.rm1
                        public final Object invoke() {
                            byte b32 = b5;
                            fj0 fj0Var = null;
                            dl0 dl0Var2 = dl0Var;
                            is0 is0Var2 = is0Var;
                            boolean z2 = false;
                            boolean z3 = false;
                            boolean z4 = false;
                            boolean z5 = false;
                            byte b42 = 1;
                            switch (b32) {
                                case 0:
                                    if (is0Var2.b()) {
                                        p70.g0(dl0Var2, null, null, new ui3(is0Var2, fj0Var, z2 ? (byte) 1 : (byte) 0), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 1:
                                    if (is0Var2.c()) {
                                        p70.g0(dl0Var2, null, null, new ui3(is0Var2, fj0Var, b42), 3);
                                        z5 = true;
                                    }
                                    return Boolean.valueOf(z5);
                                case 2:
                                    if (is0Var2.b()) {
                                        p70.g0(dl0Var2, null, null, new ui3(is0Var2, fj0Var, z2 ? (byte) 1 : (byte) 0), 3);
                                        z4 = true;
                                    }
                                    return Boolean.valueOf(z4);
                                default:
                                    if (is0Var2.c()) {
                                        p70.g0(dl0Var2, null, null, new ui3(is0Var2, fj0Var, b42), 3);
                                        z3 = true;
                                    }
                                    return Boolean.valueOf(z3);
                            }
                        }
                    }));
                }
                return wd5.a;
        }
    }

    public /* synthetic */ jw0(boolean z, is0 is0Var, dl0 dl0Var) {
        this.J = z;
        this.K = is0Var;
        this.L = dl0Var;
    }
}

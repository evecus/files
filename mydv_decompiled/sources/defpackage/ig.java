package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class ig implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ ig(ir5 ir5Var, wa2 wa2Var, ir5 ir5Var2) {
        this.I = (byte) 0;
        this.J = ir5Var;
        this.L = wa2Var;
        this.K = ir5Var2;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        boolean z = false;
        byte b2 = 1;
        wd5 wd5Var = wd5.a;
        Object obj2 = this.L;
        Object obj3 = this.K;
        Object obj4 = this.J;
        switch (b) {
            case 0:
                ir5 ir5Var = (ir5) obj4;
                wa2 wa2Var = (wa2) obj2;
                ir5 ir5Var2 = (ir5) obj3;
                o10 q = ((y31) obj).S().q();
                if (ir5Var.J.getVisibility() != 8) {
                    ir5Var.j0 = true;
                    qh3 qh3Var = wa2Var.V;
                    AndroidComposeView androidComposeView = qh3Var instanceof AndroidComposeView ? (AndroidComposeView) qh3Var : null;
                    if (androidComposeView != null) {
                        androidComposeView.drawAndroidView(ir5Var2, ba.b(q));
                    }
                    ir5Var.j0 = false;
                }
                return wd5Var;
            case 1:
                di1 di1Var = (di1) obj3;
                tm1 tm1Var = (tm1) obj2;
                ui1 ui1Var = (ui1) obj;
                if (!j42.c(ui1Var, (ui1) obj4)) {
                    if (j42.c(ui1Var, di1Var.c)) {
                        zy.i("Focus search landed at the root.");
                        return null;
                    }
                    z = ((Boolean) tm1Var.invoke(ui1Var)).booleanValue();
                }
                return Boolean.valueOf(z);
            case 2:
                vi2 vi2Var = (vi2) obj4;
                final bj2 bj2Var = (bj2) obj3;
                final tm1 tm1Var2 = (tm1) obj2;
                final r24 r24Var = new r24();
                ti2 ti2Var = new ti2() { // from class: ri2
                    @Override // defpackage.ti2
                    public final void e(vi2 vi2Var2, ji2 ji2Var) {
                        int i = si2.a[ji2Var.ordinal()];
                        r24 r24Var2 = r24Var;
                        if (i == 1) {
                            r24Var2.I = tm1Var2.invoke(bj2.this);
                        } else {
                            if (i != 2) {
                                return;
                            }
                            vr3 vr3Var = (vr3) r24Var2.I;
                            if (vr3Var != null) {
                                vr3Var.a();
                            }
                            r24Var2.I = null;
                        }
                    }
                };
                vi2Var.k().a(ti2Var);
                return new mh(vi2Var, ti2Var, r24Var, b2);
            case 3:
                h94 h94Var = (h94) obj4;
                m94 m94Var = (m94) obj2;
                n43 n43Var = h94Var.J;
                if (n43Var.b(obj3)) {
                    s83.j(obj3, " was used multiple times ", "Key ");
                    return null;
                }
                h94Var.I.remove(obj3);
                n43Var.m(obj3, m94Var);
                return new mh(h94Var, obj3, m94Var, (byte) 2);
            default:
                v22 v22Var = (v22) obj3;
                an3 an3Var = (an3) obj;
                an3Var.getClass();
                an3.g(an3Var, (bn3) obj4, r7.b(((r11) ((jv4) obj2).I.d.getValue()).I, an3Var) + v22Var.a, v22Var.b);
                return wd5Var;
        }
    }

    public /* synthetic */ ig(Object obj, Object obj2, Object obj3, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
        this.L = obj3;
    }
}

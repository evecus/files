package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class hf0 {
    public static final i51 a = new i51(new q7(13), (byte) 1);
    public static final i51 b = new i51(new q7(14), (byte) 1);
    public static final i51 c = new i51(new q7(19), (byte) 1);
    public static final i51 d = new i51(new q7(20), (byte) 1);
    public static final i51 e = new i51(new q7(21), (byte) 1);
    public static final i51 f = new i51(new q7(22), (byte) 1);
    public static final i51 g = new i51(new q7(23), (byte) 1);
    public static final i51 h = new i51(new q7(25), (byte) 1);
    public static final i51 i = new i51(new q7(26), (byte) 1);
    public static final i51 j = new i51(new q7(27), (byte) 1);
    public static final i51 k = new i51(new q7(24), (byte) 1);
    public static final i51 l = new i51(new q7(28), (byte) 1);
    public static final i51 m = new i51(new q7(29), (byte) 1);
    public static final i51 n = new i51(new df0(0), (byte) 1);
    public static final i51 o = new i51(new df0(1), (byte) 1);
    public static final i51 p;
    public static final i51 q;
    public static final i51 r;
    public static final i51 s;
    public static final i51 t;
    public static final i51 u;
    public static final i51 v;
    public static final i51 w;
    public static final i51 x;
    public static final i51 y;

    static {
        new u05(new df0((byte) 6));
        p = new i51(new df0((byte) 2), (byte) 1);
        q = new i51(new df0((byte) 3), (byte) 1);
        r = new i51(new df0((byte) 4), (byte) 1);
        s = new i51(new df0((byte) 5), (byte) 1);
        t = new i51(new q7((byte) 15), (byte) 1);
        u = new i51(new q7((byte) 16), (byte) 1);
        v = new i51(new q7((byte) 17), (byte) 1);
        w = new i51(new q7((byte) 18), (byte) 1);
        x = new i51(new df0((byte) 29), (byte) 0);
        y = new i51(new df0((byte) 13), (byte) 1);
    }

    public static final void a(final qh3 qh3Var, fg fgVar, tc0 tc0Var, fe0 fe0Var, int i2) {
        ay3 ay3Var;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1925803616);
        int i3 = i2 | (go1Var.g(qh3Var) ? 4 : 2) | (go1Var.g(fgVar) ? 32 : 16) | (go1Var.i(tc0Var) ? 256 : 128);
        if (go1Var.T(i3 & 1, (i3 & 147) != 146)) {
            ay3 a2 = a.a(qh3Var.getAccessibilityManager());
            ay3 a3 = b.a(qh3Var.getAutofill());
            ay3 a4 = d.a(qh3Var.getAutofillManager());
            ay3 a5 = c.a(qh3Var.getAutofillTree());
            ay3 a6 = e.a(qh3Var.getClipboardManager());
            ay3 a7 = f.a(qh3Var.getClipboard());
            ay3 a8 = h.a(qh3Var.getDensity());
            ay3 a9 = i.a(qh3Var.getFocusOwner());
            ay3 a10 = j.a(qh3Var.getFontLoader());
            a10.g = false;
            ay3 a11 = k.a(qh3Var.getFontFamilyResolver());
            a11.g = false;
            ay3 a12 = l.a(qh3Var.getHapticFeedBack());
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (z || Q == jpVar) {
                ay3Var = a10;
                final byte b2 = 0;
                Q = new tm1() { // from class: bf0
                    @Override // defpackage.tm1
                    public final Object invoke(Object obj) {
                        byte b3 = b2;
                        qh3 qh3Var2 = qh3Var;
                        switch (b3) {
                            case 0:
                                return qh3Var2.getInputModeManager();
                            case 1:
                                return qh3Var2.getTextInputService();
                            case 2:
                                return qh3Var2.getSoftwareKeyboardController();
                            case 3:
                                return qh3Var2.getTextToolbar();
                            default:
                                return qh3Var2.getPointerIconService();
                        }
                    }
                };
                go1Var.o0(Q);
            } else {
                ay3Var = a10;
            }
            ay3 c2 = m.c((tm1) Q);
            ay3 a13 = n.a(qh3Var.getLayoutDirection());
            boolean z2 = i4 == 4;
            Object Q2 = go1Var.Q();
            if (z2 || Q2 == jpVar) {
                final byte b3 = 1;
                Q2 = new tm1() { // from class: bf0
                    @Override // defpackage.tm1
                    public final Object invoke(Object obj) {
                        byte b32 = b3;
                        qh3 qh3Var2 = qh3Var;
                        switch (b32) {
                            case 0:
                                return qh3Var2.getInputModeManager();
                            case 1:
                                return qh3Var2.getTextInputService();
                            case 2:
                                return qh3Var2.getSoftwareKeyboardController();
                            case 3:
                                return qh3Var2.getTextToolbar();
                            default:
                                return qh3Var2.getPointerIconService();
                        }
                    }
                };
                go1Var.o0(Q2);
            }
            ay3 c3 = p.c((tm1) Q2);
            boolean z3 = i4 == 4;
            Object Q3 = go1Var.Q();
            if (z3 || Q3 == jpVar) {
                final byte b4 = 2;
                Q3 = new tm1() { // from class: bf0
                    @Override // defpackage.tm1
                    public final Object invoke(Object obj) {
                        byte b32 = b4;
                        qh3 qh3Var2 = qh3Var;
                        switch (b32) {
                            case 0:
                                return qh3Var2.getInputModeManager();
                            case 1:
                                return qh3Var2.getTextInputService();
                            case 2:
                                return qh3Var2.getSoftwareKeyboardController();
                            case 3:
                                return qh3Var2.getTextToolbar();
                            default:
                                return qh3Var2.getPointerIconService();
                        }
                    }
                };
                go1Var.o0(Q3);
            }
            ay3 c4 = q.c((tm1) Q3);
            boolean z4 = i4 == 4;
            Object Q4 = go1Var.Q();
            boolean z5 = z4;
            final byte b5 = 3;
            if (z5 || Q4 == jpVar) {
                Q4 = new tm1() { // from class: bf0
                    @Override // defpackage.tm1
                    public final Object invoke(Object obj) {
                        byte b32 = b5;
                        qh3 qh3Var2 = qh3Var;
                        switch (b32) {
                            case 0:
                                return qh3Var2.getInputModeManager();
                            case 1:
                                return qh3Var2.getTextInputService();
                            case 2:
                                return qh3Var2.getSoftwareKeyboardController();
                            case 3:
                                return qh3Var2.getTextToolbar();
                            default:
                                return qh3Var2.getPointerIconService();
                        }
                    }
                };
                go1Var.o0(Q4);
            }
            ay3 c5 = r.c((tm1) Q4);
            ay3 a14 = s.a(fgVar);
            ay3 a15 = t.a(qh3Var.getViewConfiguration());
            ay3 a16 = u.a(qh3Var.getWindowInfo());
            boolean z6 = i4 == 4;
            Object Q5 = go1Var.Q();
            if (z6 || Q5 == jpVar) {
                final byte b6 = 4;
                Q5 = new tm1() { // from class: bf0
                    @Override // defpackage.tm1
                    public final Object invoke(Object obj) {
                        byte b32 = b6;
                        qh3 qh3Var2 = qh3Var;
                        switch (b32) {
                            case 0:
                                return qh3Var2.getInputModeManager();
                            case 1:
                                return qh3Var2.getTextInputService();
                            case 2:
                                return qh3Var2.getSoftwareKeyboardController();
                            case 3:
                                return qh3Var2.getTextToolbar();
                            default:
                                return qh3Var2.getPointerIconService();
                        }
                    }
                };
                go1Var.o0(Q5);
            }
            mw2.c(new ay3[]{a2, a3, a4, a5, a6, a7, a8, a9, ay3Var, a11, a12, c2, a13, c3, c4, c5, a14, a15, a16, w.c((tm1) Q5), g.a(qh3Var.getGraphicsContext()), pq2.a.a(qh3Var.getRetainedValuesStore()), o.a(qh3Var.getLocaleList())}, tc0Var, go1Var, ((i3 >> 3) & 112) | 8);
        } else {
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new cf0(qh3Var, fgVar, tc0Var, i2, (byte) 0);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}

package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class di1 implements bi1 {
    public final AndroidComposeView a;
    public final AndroidComposeView b;
    public final zh1 d;
    public x33 f;
    public ui1 h;
    public final ui1 c = new ui1(2, null, 14);
    public final ci1 e = new ci1(this);
    public final e43 g = new e43(1);

    public di1(AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
        this.a = androidComposeView;
        this.b = androidComposeView2;
        this.d = new zh1(this, androidComposeView2);
    }

    public final boolean a(boolean z) {
        ja3 ja3Var;
        if (g() != null) {
            ui1 g = g();
            j(null);
            if (g != null) {
                oi1 oi1Var = oi1.I;
                oi1 oi1Var2 = oi1.K;
                g.k0(oi1Var, oi1Var2);
                if (!g.getNode().isAttached()) {
                    q02.b("visitAncestors called on an unattached node");
                }
                k13 parent$ui = g.getNode().getParent$ui();
                wa2 U = ut0.U(g);
                while (U != null) {
                    if ((U.n0.f.getAggregateChildKindSet$ui() & 1024) != 0) {
                        while (parent$ui != null) {
                            if ((parent$ui.getKindSet$ui() & 1024) != 0) {
                                k13 k13Var = parent$ui;
                                b53 b53Var = null;
                                while (k13Var != null) {
                                    if (k13Var instanceof ui1) {
                                        ((ui1) k13Var).k0(oi1.J, oi1Var2);
                                    } else if ((k13Var.getKindSet$ui() & 1024) != 0 && (k13Var instanceof wt0)) {
                                        int i = 0;
                                        for (k13 k13Var2 = ((wt0) k13Var).J; k13Var2 != null; k13Var2 = k13Var2.getChild$ui()) {
                                            if ((k13Var2.getKindSet$ui() & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    k13Var = k13Var2;
                                                } else {
                                                    if (b53Var == null) {
                                                        b53Var = new b53(new k13[16]);
                                                    }
                                                    if (k13Var != null) {
                                                        b53Var.c(k13Var);
                                                        k13Var = null;
                                                    }
                                                    b53Var.c(k13Var2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    k13Var = ut0.M(b53Var);
                                }
                            }
                            parent$ui = parent$ui.getParent$ui();
                        }
                    }
                    U = U.v();
                    parent$ui = (U == null || (ja3Var = U.n0) == null) ? null : ja3Var.e;
                }
            }
        }
        return true;
    }

    public final boolean b(int i, boolean z, boolean z2) {
        boolean z3 = true;
        if (z) {
            a(z);
        } else {
            int ordinal = vt0.N(i, this.c).ordinal();
            if (ordinal == 0) {
                a(z);
            } else {
                if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                    s83.v();
                    return false;
                }
                z3 = false;
            }
        }
        if (z3 && z2) {
            this.a.clearOwnerFocus();
        }
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [k13] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [k13] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [b53] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [b53] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    public final void c() {
        zz1 zz1Var;
        ja3 ja3Var;
        boolean z;
        wt0 wt0Var;
        ja3 ja3Var2;
        ui1 g = g();
        if (g != null) {
            if (!g.getNode().isAttached()) {
                q02.b("visitAncestors called on an unattached node");
            }
            k13 node = g.getNode();
            wa2 U = ut0.U(g);
            loop0: while (true) {
                if (U == null) {
                    wt0Var = 0;
                    break;
                }
                if ((U.n0.f.getAggregateChildKindSet$ui() & 2097152) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui() & 2097152) != 0) {
                            ?? r8 = 0;
                            wt0Var = node;
                            while (wt0Var != 0) {
                                if (wt0Var instanceof zz1) {
                                    break loop0;
                                }
                                if ((wt0Var.getKindSet$ui() & 2097152) != 0 && (wt0Var instanceof wt0)) {
                                    k13 k13Var = wt0Var.J;
                                    int i = 0;
                                    wt0Var = wt0Var;
                                    r8 = r8;
                                    while (k13Var != null) {
                                        if ((k13Var.getKindSet$ui() & 2097152) != 0) {
                                            i++;
                                            r8 = r8;
                                            if (i == 1) {
                                                wt0Var = k13Var;
                                            } else {
                                                if (r8 == 0) {
                                                    r8 = new b53(new k13[16]);
                                                }
                                                if (wt0Var != 0) {
                                                    r8.c(wt0Var);
                                                    wt0Var = 0;
                                                }
                                                r8.c(k13Var);
                                            }
                                        }
                                        k13Var = k13Var.getChild$ui();
                                        wt0Var = wt0Var;
                                        r8 = r8;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                wt0Var = ut0.M(r8);
                            }
                        }
                        node = node.getParent$ui();
                    }
                }
                U = U.v();
                node = (U == null || (ja3Var2 = U.n0) == null) ? null : ja3Var2.e;
            }
            zz1Var = (zz1) wt0Var;
        } else {
            zz1Var = null;
        }
        if (zz1Var != null) {
            k13 k13Var2 = (k13) zz1Var;
            if (!k13Var2.getNode().isAttached()) {
                q02.b("visitAncestors called on an unattached node");
            }
            k13 parent$ui = k13Var2.getNode().getParent$ui();
            wa2 U2 = ut0.U(zz1Var);
            ArrayList arrayList = null;
            while (U2 != null) {
                if ((U2.n0.f.getAggregateChildKindSet$ui() & 2097152) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & 2097152) != 0) {
                            k13 k13Var3 = parent$ui;
                            b53 b53Var = null;
                            while (k13Var3 != null) {
                                if (k13Var3 instanceof zz1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(k13Var3);
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z && (k13Var3.getKindSet$ui() & 2097152) != 0 && (k13Var3 instanceof wt0)) {
                                    int i2 = 0;
                                    for (k13 k13Var4 = ((wt0) k13Var3).J; k13Var4 != null; k13Var4 = k13Var4.getChild$ui()) {
                                        if ((k13Var4.getKindSet$ui() & 2097152) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                k13Var3 = k13Var4;
                                            } else {
                                                if (b53Var == null) {
                                                    b53Var = new b53(new k13[16]);
                                                }
                                                if (k13Var3 != null) {
                                                    b53Var.c(k13Var3);
                                                    k13Var3 = null;
                                                }
                                                b53Var.c(k13Var4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                k13Var3 = ut0.M(b53Var);
                            }
                        }
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                U2 = U2.v();
                parent$ui = (U2 == null || (ja3Var = U2.n0) == null) ? null : ja3Var.e;
            }
            zz1Var.R();
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((zz1) arrayList.get(i3)).R();
                }
            }
        }
    }

    public final void d() {
        ja3 ja3Var;
        if (this.d.e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            return;
        }
        ui1 p = mu0.p(this.c);
        if (p != null) {
            if (!p.getNode().isAttached()) {
                q02.b("visitAncestors called on an unattached node");
            }
            k13 node = p.getNode();
            wa2 U = ut0.U(p);
            while (U != null) {
                if ((U.n0.f.getAggregateChildKindSet$ui() & 131072) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui() & 131072) != 0) {
                            k13 k13Var = node;
                            b53 b53Var = null;
                            while (k13Var != null) {
                                if ((k13Var.getKindSet$ui() & 131072) != 0 && (k13Var instanceof wt0)) {
                                    int i = 0;
                                    for (k13 k13Var2 = ((wt0) k13Var).J; k13Var2 != null; k13Var2 = k13Var2.getChild$ui()) {
                                        if ((k13Var2.getKindSet$ui() & 131072) != 0) {
                                            i++;
                                            if (i == 1) {
                                                k13Var = k13Var2;
                                            } else {
                                                if (b53Var == null) {
                                                    b53Var = new b53(new k13[16]);
                                                }
                                                if (k13Var != null) {
                                                    b53Var.c(k13Var);
                                                    k13Var = null;
                                                }
                                                b53Var.c(k13Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                k13Var = ut0.M(b53Var);
                            }
                        }
                        node = node.getParent$ui();
                    }
                }
                U = U.v();
                node = (U == null || (ja3Var = U.n0) == null) ? null : ja3Var.e;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
    
        if (r7 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a3 A[Catch: all -> 0x0344, TryCatch #0 {all -> 0x0344, blocks: (B:3:0x0007, B:5:0x000e, B:9:0x0019, B:13:0x0023, B:16:0x002f, B:18:0x0039, B:19:0x003e, B:21:0x004a, B:23:0x0051, B:25:0x0059, B:29:0x0063, B:34:0x01a3, B:36:0x01ad, B:37:0x01b0, B:39:0x01bf, B:42:0x01cd, B:46:0x01d9, B:49:0x01df, B:50:0x01e4, B:52:0x01ec, B:54:0x01f4, B:56:0x01f8, B:58:0x0200, B:60:0x0208, B:66:0x0210, B:68:0x0219, B:69:0x021d, B:64:0x0220, B:75:0x0228, B:86:0x022d, B:89:0x0232, B:91:0x0238, B:98:0x023c, B:103:0x0245, B:105:0x024d, B:113:0x0264, B:115:0x026b, B:149:0x026f, B:144:0x02b7, B:117:0x027b, B:119:0x0283, B:121:0x0287, B:123:0x028f, B:125:0x0297, B:131:0x029f, B:133:0x02a8, B:134:0x02ac, B:129:0x02af, B:155:0x02bc, B:159:0x02cc, B:161:0x02d3, B:195:0x02d7, B:190:0x031f, B:163:0x02e3, B:165:0x02eb, B:167:0x02ef, B:169:0x02f7, B:171:0x02ff, B:177:0x0307, B:179:0x0310, B:180:0x0314, B:175:0x0317, B:202:0x0326, B:204:0x032d, B:217:0x006d, B:219:0x0077, B:220:0x007a, B:222:0x0084, B:225:0x0092, B:229:0x009e, B:264:0x00f9, B:266:0x00fd, B:231:0x00a3, B:233:0x00ab, B:235:0x00af, B:237:0x00b7, B:239:0x00bf, B:245:0x00c7, B:247:0x00d0, B:248:0x00d4, B:243:0x00d7, B:254:0x00df, B:268:0x00e4, B:271:0x00e9, B:273:0x00ef, B:280:0x00f3, B:285:0x0105, B:287:0x010f, B:288:0x0112, B:290:0x0120, B:293:0x012e, B:297:0x013a, B:332:0x0195, B:334:0x0199, B:299:0x013f, B:301:0x0147, B:303:0x014b, B:305:0x0153, B:307:0x015b, B:313:0x0163, B:315:0x016c, B:316:0x0170, B:311:0x0173, B:322:0x017b, B:337:0x0180, B:340:0x0185, B:342:0x018b, B:349:0x018f), top: B:2:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v20, types: [b53] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [b53] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v23, types: [k13] */
    /* JADX WARN: Type inference failed for: r12v24, types: [k13] */
    /* JADX WARN: Type inference failed for: r12v28, types: [k13] */
    /* JADX WARN: Type inference failed for: r12v29, types: [k13] */
    /* JADX WARN: Type inference failed for: r12v33, types: [k13] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v42, types: [k13] */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [b53] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [b53] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(android.view.KeyEvent r13, defpackage.rm1 r14) {
        /*
            Method dump skipped, instructions count: 841
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.di1.e(android.view.KeyEvent, rm1):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0129, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean f(int r20, defpackage.m14 r21, defpackage.tm1 r22) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.di1.f(int, m14, tm1):java.lang.Boolean");
    }

    public final ui1 g() {
        ui1 ui1Var = this.h;
        if (ui1Var == null || !ui1Var.isAttached()) {
            return null;
        }
        return this.h;
    }

    public final boolean h(int i, boolean z) {
        ui1 g = g();
        AndroidComposeView androidComposeView = this.a;
        byte b = 1;
        if (g == null || !g.I || !androidComposeView.mo23moveFocusInChildren3ESFkO8(i)) {
            r24 r24Var = new r24();
            r24Var.I = Boolean.FALSE;
            ui1 g2 = g();
            Boolean f = f(i, androidComposeView.getEmbeddedViewFocusRect(), new ha(r24Var, i, b));
            if (!j42.c(f, Boolean.TRUE) || g2 == g()) {
                if (f != null && r24Var.I != null) {
                    if (!f.booleanValue() || !((Boolean) r24Var.I).booleanValue()) {
                        if (c21.B(i) && z && b(i, false, false)) {
                            Boolean f2 = f(i, null, new ia((byte) 3, i));
                            if (f2 != null ? f2.booleanValue() : false) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean i(int i) {
        if (!b(i, false, false)) {
            return false;
        }
        Boolean f = f(i, null, new ia((byte) 2, i));
        boolean booleanValue = f != null ? f.booleanValue() : false;
        if (!booleanValue) {
            this.a.clearOwnerFocus();
        }
        return booleanValue;
    }

    public final void j(ui1 ui1Var) {
        ui1 ui1Var2 = this.h;
        this.h = ui1Var;
        e43 e43Var = this.g;
        Object[] objArr = e43Var.a;
        int i = e43Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((ai1) objArr[i2]).onFocusChanged(ui1Var2, ui1Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009d, code lost:
    
        r33 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a7, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == r33) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        r0 = r4.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00af, code lost:
    
        if (r4.e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c0, code lost:
    
        if (((r4.a[r0 >> 3] >> ((r0 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c8, code lost:
    
        r0 = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ca, code lost:
    
        if (r0 <= 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cc, code lost:
    
        r0 = java.lang.Long.compare((r4.d * 32) ^ Long.MIN_VALUE, (r0 * 25) ^ Long.MIN_VALUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00db, code lost:
    
        if (r0 > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00dd, code lost:
    
        r0 = r4.a;
        r6 = r4.c;
        r12 = r4.b;
        r13 = (r6 + 7) >> 3;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e9, code lost:
    
        if (r14 >= r13) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00eb, code lost:
    
        r8 = r0[r14] & (-9187201950435737472L);
        r0[r14] = ((~r8) + (r8 >>> 7)) & (-72340172838076674L);
        r14 = r14 + 1;
        r5 = r5;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0106, code lost:
    
        r15 = r5;
        r16 = r6;
        r40 = 128;
        r5 = defpackage.dq.d1(r0);
        r6 = r5 - 1;
        r13 = 72057594037927935L;
        r0[r6] = (r0[r6] & 72057594037927935L) | (-72057594037927936L);
        r0[r5] = r0[0];
        r5 = r16;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0127, code lost:
    
        if (r6 == r5) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0129, code lost:
    
        r8 = r6 >> 3;
        r9 = (r6 & 7) << 3;
        r16 = (r0[r8] >> r9) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0137, code lost:
    
        if (r16 != 128) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x013e, code lost:
    
        if (r16 == 254) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0141, code lost:
    
        r16 = defpackage.i82.Q(r12[r6]) * r28;
        r17 = r13;
        r13 = (r16 ^ (r16 << 16)) >>> 7;
        r14 = r4.b(r13);
        r13 = r13 & r5;
        r29 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0165, code lost:
    
        if ((((r14 - r13) & r5) / 8) != (((r6 - r13) & r5) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0167, code lost:
    
        r37 = r7;
        r0[r8] = ((~(255 << r9)) & r0[r8]) | ((r16 & 127) << r9);
        r0[r0.length - 1] = (r0[0] & r17) | Long.MIN_VALUE;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0185, code lost:
    
        r13 = r17;
        r15 = r29;
        r7 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x018c, code lost:
    
        r37 = r7;
        r7 = r14 >> 3;
        r26 = r0[r7];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x019e, code lost:
    
        if (((r26 >> r8) & 255) != 128) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01a0, code lost:
    
        r15 = r5;
        r35 = r6;
        r0[r7] = (r26 & (~(255 << r8))) | ((r16 & 127) << r8);
        r0[r8] = (r0[r8] & (~(255 << r9))) | (128 << r9);
        r12[r14] = r12[r35];
        r12[r35] = r33;
        r6 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01e3, code lost:
    
        r0[r0.length - 1] = (r0[0] & r17) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c7, code lost:
    
        r15 = r5;
        r35 = r6;
        r0[r7] = (r26 & (~(255 << r8))) | ((r16 & 127) << r8);
        r5 = r12[r14];
        r12[r14] = r12[r35];
        r12[r35] = r5;
        r6 = r35 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0139, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01f2, code lost:
    
        r37 = r7;
        r4.e = defpackage.ia4.a(r4.c) - r4.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x027a, code lost:
    
        r0 = r4.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x027e, code lost:
    
        r14 = r0;
        r4.d++;
        r0 = r4.e;
        r3 = r4.a;
        r5 = r14 >> 3;
        r6 = r3[r5];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0297, code lost:
    
        if (((r6 >> r8) & 255) != r40) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0299, code lost:
    
        r21 = r37 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x029b, code lost:
    
        r4.e = r0 - r21;
        r0 = r4.c;
        r6 = (r6 & (~(255 << r8))) | (r10 << r8);
        r3[r5] = r6;
        r3[(((r14 - 7) & r0) + (r0 & 7)) >> 3] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0201, code lost:
    
        r37 = true;
        r40 = 128;
        r0 = defpackage.ia4.b(r4.c);
        r5 = r4.a;
        r6 = r4.b;
        r7 = r4.c;
        r4.c(r0);
        r0 = r4.a;
        r8 = r4.b;
        r9 = r4.c;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x021c, code lost:
    
        if (r12 >= r7) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x022b, code lost:
    
        if (((r5[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= 128) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x022d, code lost:
    
        r13 = r6[r12];
        r15 = defpackage.i82.Q(r13) * r28;
        r15 = r15 ^ (r15 << 16);
        r16 = r0;
        r0 = r4.b(r15 >>> 7);
        r17 = r5;
        r18 = r6;
        r5 = r15 & 127;
        r15 = r0 >> 3;
        r19 = (r0 & 7) << 3;
        r5 = (r16[r15] & (~(255 << r19))) | (r5 << r19);
        r16[r15] = r5;
        r16[(((r0 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r0] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0271, code lost:
    
        r12 = r12 + 1;
        r0 = r16;
        r5 = r17;
        r6 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x026b, code lost:
    
        r16 = r0;
        r17 = r5;
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c2, code lost:
    
        r37 = true;
        r40 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0347, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0349, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(android.view.KeyEvent r41) {
        /*
            Method dump skipped, instructions count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.di1.k(android.view.KeyEvent):boolean");
    }
}

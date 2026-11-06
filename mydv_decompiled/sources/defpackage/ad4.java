package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.media3.common.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class ad4 {
    public static hx1 a = null;
    public static hx1 b = null;
    public static final int c = 9;
    public static final int d = 6;
    public static final int e = 10;
    public static final int f = 5;
    public static final int g = 15;

    public ad4() {
        new ConcurrentHashMap();
    }

    public static final qg A(vg vgVar, int i) {
        Object obj;
        Iterator<T> it = vgVar.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((wa2) ((Map.Entry) obj).getKey()).J == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (qg) entry.getValue();
        }
        return null;
    }

    public static final String B(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [tm1] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [k13] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [k13] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [b53] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [b53] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final void C(tt0 tt0Var, Object obj, tm1 tm1Var) {
        ja3 ja3Var;
        if (!tt0Var.getNode().isAttached()) {
            q02.b("visitAncestors called on an unattached node");
        }
        k13 parent$ui = tt0Var.getNode().getParent$ui();
        wa2 U = ut0.U(tt0Var);
        while (U != null) {
            if ((U.n0.f.getAggregateChildKindSet$ui() & 262144) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & 262144) != 0) {
                        wt0 wt0Var = parent$ui;
                        ?? r4 = 0;
                        while (wt0Var != 0) {
                            if (wt0Var instanceof la5) {
                                la5 la5Var = (la5) wt0Var;
                                if (!(obj.equals(la5Var.g()) ? ((Boolean) tm1Var.invoke(la5Var)).booleanValue() : true)) {
                                    return;
                                }
                            } else if ((wt0Var.getKindSet$ui() & 262144) != 0 && (wt0Var instanceof wt0)) {
                                k13 k13Var = wt0Var.J;
                                int i = 0;
                                wt0Var = wt0Var;
                                r4 = r4;
                                while (k13Var != null) {
                                    if ((k13Var.getKindSet$ui() & 262144) != 0) {
                                        i++;
                                        r4 = r4;
                                        if (i == 1) {
                                            wt0Var = k13Var;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new b53(new k13[16]);
                                            }
                                            if (wt0Var != 0) {
                                                r4.c(wt0Var);
                                                wt0Var = 0;
                                            }
                                            r4.c(k13Var);
                                        }
                                    }
                                    k13Var = k13Var.getChild$ui();
                                    wt0Var = wt0Var;
                                    r4 = r4;
                                }
                                if (i == 1) {
                                }
                            }
                            wt0Var = ut0.M(r4);
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            U = U.v();
            parent$ui = (U == null || (ja3Var = U.n0) == null) ? null : ja3Var.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [tm1] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [k13] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [k13] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [b53] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [b53] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void D(la5 la5Var, tm1 tm1Var) {
        ja3 ja3Var;
        if (!la5Var.getNode().isAttached()) {
            q02.b("visitAncestors called on an unattached node");
        }
        k13 parent$ui = la5Var.getNode().getParent$ui();
        wa2 U = ut0.U(la5Var);
        while (U != null) {
            if ((U.n0.f.getAggregateChildKindSet$ui() & 262144) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & 262144) != 0) {
                        wt0 wt0Var = parent$ui;
                        ?? r5 = 0;
                        while (wt0Var != 0) {
                            boolean z = true;
                            if (wt0Var instanceof la5) {
                                la5 la5Var2 = (la5) wt0Var;
                                if (j42.c(la5Var.g(), la5Var2.g()) && la5Var.getClass() == la5Var2.getClass()) {
                                    z = ((Boolean) tm1Var.invoke(la5Var2)).booleanValue();
                                }
                                if (!z) {
                                    return;
                                }
                            } else if ((wt0Var.getKindSet$ui() & 262144) != 0 && (wt0Var instanceof wt0)) {
                                k13 k13Var = wt0Var.J;
                                int i = 0;
                                wt0Var = wt0Var;
                                r5 = r5;
                                while (k13Var != null) {
                                    if ((k13Var.getKindSet$ui() & 262144) != 0) {
                                        i++;
                                        r5 = r5;
                                        if (i == 1) {
                                            wt0Var = k13Var;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new b53(new k13[16]);
                                            }
                                            if (wt0Var != 0) {
                                                r5.c(wt0Var);
                                                wt0Var = 0;
                                            }
                                            r5.c(k13Var);
                                        }
                                    }
                                    k13Var = k13Var.getChild$ui();
                                    wt0Var = wt0Var;
                                    r5 = r5;
                                }
                                if (i == 1) {
                                }
                            }
                            wt0Var = ut0.M(r5);
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            U = U.v();
            parent$ui = (U == null || (ja3Var = U.n0) == null) ? null : ja3Var.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [tm1] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [k13] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [k13] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [b53] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [b53] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void E(k13 k13Var, String str, tm1 tm1Var) {
        if (!k13Var.getNode().isAttached()) {
            q02.b("visitSubtreeIf called on an unattached node");
        }
        b53 b53Var = new b53(new k13[16]);
        k13 child$ui = k13Var.getNode().getChild$ui();
        if (child$ui == null) {
            ut0.h(b53Var, k13Var.getNode());
        } else {
            b53Var.c(child$ui);
        }
        while (true) {
            int i = b53Var.K;
            if (i == 0) {
                return;
            }
            k13 k13Var2 = (k13) b53Var.l(i - 1);
            if ((k13Var2.getAggregateChildKindSet$ui() & 262144) != 0) {
                for (k13 k13Var3 = k13Var2; k13Var3 != null && k13Var3.isAttached(); k13Var3 = k13Var3.getChild$ui()) {
                    if ((k13Var3.getKindSet$ui() & 262144) != 0) {
                        wt0 wt0Var = k13Var3;
                        ?? r6 = 0;
                        while (wt0Var != 0) {
                            if (wt0Var instanceof la5) {
                                la5 la5Var = (la5) wt0Var;
                                ka5 ka5Var = str.equals(la5Var.g()) ? (ka5) tm1Var.invoke(la5Var) : ka5.I;
                                if (ka5Var == ka5.K) {
                                    return;
                                }
                                if (ka5Var == ka5.J) {
                                    break;
                                }
                            } else if ((wt0Var.getKindSet$ui() & 262144) != 0 && (wt0Var instanceof wt0)) {
                                k13 k13Var4 = wt0Var.J;
                                int i2 = 0;
                                wt0Var = wt0Var;
                                r6 = r6;
                                while (k13Var4 != null) {
                                    if ((k13Var4.getKindSet$ui() & 262144) != 0) {
                                        i2++;
                                        r6 = r6;
                                        if (i2 == 1) {
                                            wt0Var = k13Var4;
                                        } else {
                                            if (r6 == 0) {
                                                r6 = new b53(new k13[16]);
                                            }
                                            if (wt0Var != 0) {
                                                r6.c(wt0Var);
                                                wt0Var = 0;
                                            }
                                            r6.c(k13Var4);
                                        }
                                    }
                                    k13Var4 = k13Var4.getChild$ui();
                                    wt0Var = wt0Var;
                                    r6 = r6;
                                }
                                if (i2 == 1) {
                                }
                            }
                            wt0Var = ut0.M(r6);
                        }
                    }
                }
            }
            ut0.h(b53Var, k13Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, la5] */
    /* JADX WARN: Type inference failed for: r13v0, types: [tm1] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [k13] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [k13] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [b53] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [b53] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void F(la5 la5Var, tm1 tm1Var) {
        k13 k13Var = (k13) la5Var;
        if (!k13Var.getNode().isAttached()) {
            q02.b("visitSubtreeIf called on an unattached node");
        }
        b53 b53Var = new b53(new k13[16]);
        k13 child$ui = k13Var.getNode().getChild$ui();
        if (child$ui == null) {
            ut0.h(b53Var, k13Var.getNode());
        } else {
            b53Var.c(child$ui);
        }
        while (true) {
            int i = b53Var.K;
            if (i == 0) {
                return;
            }
            k13 k13Var2 = (k13) b53Var.l(i - 1);
            if ((k13Var2.getAggregateChildKindSet$ui() & 262144) != 0) {
                for (k13 k13Var3 = k13Var2; k13Var3 != null && k13Var3.isAttached(); k13Var3 = k13Var3.getChild$ui()) {
                    if ((k13Var3.getKindSet$ui() & 262144) != 0) {
                        wt0 wt0Var = k13Var3;
                        ?? r7 = 0;
                        while (wt0Var != 0) {
                            if (wt0Var instanceof la5) {
                                la5 la5Var2 = (la5) wt0Var;
                                ka5 ka5Var = (j42.c(la5Var.g(), la5Var2.g()) && la5Var.getClass() == la5Var2.getClass()) ? (ka5) tm1Var.invoke(la5Var2) : ka5.I;
                                if (ka5Var == ka5.K) {
                                    return;
                                }
                                if (ka5Var == ka5.J) {
                                    break;
                                }
                            } else if ((wt0Var.getKindSet$ui() & 262144) != 0 && (wt0Var instanceof wt0)) {
                                k13 k13Var4 = wt0Var.J;
                                int i2 = 0;
                                wt0Var = wt0Var;
                                r7 = r7;
                                while (k13Var4 != null) {
                                    if ((k13Var4.getKindSet$ui() & 262144) != 0) {
                                        i2++;
                                        r7 = r7;
                                        if (i2 == 1) {
                                            wt0Var = k13Var4;
                                        } else {
                                            if (r7 == 0) {
                                                r7 = new b53(new k13[16]);
                                            }
                                            if (wt0Var != 0) {
                                                r7.c(wt0Var);
                                                wt0Var = 0;
                                            }
                                            r7.c(k13Var4);
                                        }
                                    }
                                    k13Var4 = k13Var4.getChild$ui();
                                    wt0Var = wt0Var;
                                    r7 = r7;
                                }
                                if (i2 == 1) {
                                }
                            }
                            wt0Var = ut0.M(r7);
                        }
                    }
                }
            }
            ut0.h(b53Var, k13Var2);
        }
    }

    public static final void G(aj ajVar, cj cjVar) {
        cjVar.J.setValue(ajVar.e.getValue());
        hj hjVar = cjVar.K;
        hj hjVar2 = ajVar.f;
        int b2 = hjVar.b();
        for (int i = 0; i < b2; i++) {
            hjVar.e(hjVar2.a(i), i);
        }
        cjVar.M = ajVar.h;
        cjVar.L = ajVar.g;
        cjVar.N = ((Boolean) ajVar.i.getValue()).booleanValue();
    }

    public static final void H(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0115 A[Catch: CancellationException -> 0x003c, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x003c, blocks: (B:16:0x0037, B:18:0x0100, B:20:0x0115, B:25:0x0138, B:27:0x0148, B:29:0x0152, B:36:0x015f, B:37:0x0164, B:39:0x0165), top: B:15:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.cj r24, defpackage.wi r25, long r26, final defpackage.tm1 r28, defpackage.gj0 r29) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ad4.a(cj, wi, long, tm1, gj0):java.lang.Object");
    }

    public static Object b(float f2, float f3, bj bjVar, hn1 hn1Var, k05 k05Var, int i) {
        if ((i & 8) != 0) {
            bjVar = qb.g0(0.0f, 0.0f, null, 7);
        }
        bj bjVar2 = bjVar;
        ub5 ub5Var = p70.F;
        Float f4 = new Float(f2);
        Float f5 = new Float(f3);
        Float f6 = new Float(0.0f);
        tm1 tm1Var = ub5Var.a;
        hj hjVar = (hj) tm1Var.invoke(f6);
        if (hjVar == null) {
            hjVar = ((hj) tm1Var.invoke(f4)).c();
        }
        hj hjVar2 = hjVar;
        Object a2 = a(new cj(ub5Var, f4, hjVar2, 56), new a25(bjVar2, ub5Var, f4, f5, hjVar2), Long.MIN_VALUE, new i9(hn1Var, (byte) 28), k05Var);
        wd5 wd5Var = wd5.a;
        el0 el0Var = el0.I;
        if (a2 != el0Var) {
            a2 = wd5Var;
        }
        return a2 == el0Var ? a2 : wd5Var;
    }

    public static final Object c(cj cjVar, up0 up0Var, boolean z, tm1 tm1Var, gj0 gj0Var) {
        Object a2 = a(cjVar, new tp0(up0Var, cjVar.I, cjVar.J.getValue(), cjVar.K), z ? cjVar.L : Long.MIN_VALUE, tm1Var, gj0Var);
        return a2 == el0.I ? a2 : wd5.a;
    }

    public static final Object d(cj cjVar, Float f2, bj bjVar, boolean z, tm1 tm1Var, gj0 gj0Var) {
        Object a2 = a(cjVar, new a25(bjVar, cjVar.I, cjVar.J.getValue(), f2, cjVar.K), z ? cjVar.L : Long.MIN_VALUE, tm1Var, gj0Var);
        return a2 == el0.I ? a2 : wd5.a;
    }

    public static /* synthetic */ Object e(cj cjVar, Float f2, ku4 ku4Var, boolean z, tm1 tm1Var, gj0 gj0Var, int i) {
        if ((i & 2) != 0) {
            ku4Var = qb.g0(0.0f, 0.0f, null, 7);
        }
        ku4 ku4Var2 = ku4Var;
        if ((i & 8) != 0) {
            tm1Var = new ol4((byte) 19);
        }
        return d(cjVar, f2, ku4Var2, z, tm1Var, gj0Var);
    }

    public static StaticLayout f(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            r02.a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            r02.a("invalid end value");
        }
        if (i3 < 0) {
            r02.a("invalid maxLines value");
        }
        if (i < 0) {
            r02.a("invalid width value");
        }
        if (i4 < 0) {
            r02.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        obtain.setTextDirection(textDirectionHeuristic);
        obtain.setAlignment(alignment);
        obtain.setMaxLines(i3);
        obtain.setEllipsize(truncateAt);
        obtain.setEllipsizedWidth(i4);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(z);
        obtain.setBreakStrategy(i6);
        obtain.setHyphenationFrequency(i9);
        obtain.setIndents(null, null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            ed.h(obtain, i5);
        }
        if (i10 >= 28) {
            ls1.c(obtain);
        }
        if (i10 >= 33) {
            el.i(obtain, i7, i8);
        }
        if (i10 >= 35) {
            e71.a(obtain);
        }
        return obtain.build();
    }

    public static final void k(yr1 yr1Var, sh5 sh5Var) {
        ArrayList arrayList = sh5Var.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            uh5 uh5Var = (uh5) arrayList.get(i);
            if (uh5Var instanceof wh5) {
                pk3 pk3Var = new pk3();
                wh5 wh5Var = (wh5) uh5Var;
                pk3Var.d = wh5Var.J;
                pk3Var.n = true;
                pk3Var.c();
                pk3Var.s.a.setFillType(wh5Var.K == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
                pk3Var.c();
                pk3Var.c();
                pk3Var.b = wh5Var.L;
                pk3Var.c();
                pk3Var.c = wh5Var.M;
                pk3Var.c();
                pk3Var.g = wh5Var.N;
                pk3Var.c();
                pk3Var.e = wh5Var.O;
                pk3Var.c();
                pk3Var.f = wh5Var.P;
                pk3Var.o = true;
                pk3Var.c();
                pk3Var.h = wh5Var.Q;
                pk3Var.o = true;
                pk3Var.c();
                pk3Var.i = wh5Var.R;
                pk3Var.o = true;
                pk3Var.c();
                pk3Var.j = wh5Var.S;
                pk3Var.o = true;
                pk3Var.c();
                pk3Var.k = wh5Var.T;
                pk3Var.p = true;
                pk3Var.c();
                pk3Var.l = wh5Var.U;
                pk3Var.p = true;
                pk3Var.c();
                pk3Var.m = wh5Var.V;
                pk3Var.p = true;
                pk3Var.c();
                yr1Var.e(i, pk3Var);
            } else if (uh5Var instanceof sh5) {
                yr1 yr1Var2 = new yr1();
                sh5 sh5Var2 = (sh5) uh5Var;
                yr1Var2.k = sh5Var2.I;
                yr1Var2.c();
                yr1Var2.l = sh5Var2.J;
                yr1Var2.s = true;
                yr1Var2.c();
                yr1Var2.o = sh5Var2.M;
                yr1Var2.s = true;
                yr1Var2.c();
                yr1Var2.p = sh5Var2.N;
                yr1Var2.s = true;
                yr1Var2.c();
                yr1Var2.q = sh5Var2.O;
                yr1Var2.s = true;
                yr1Var2.c();
                yr1Var2.r = sh5Var2.P;
                yr1Var2.s = true;
                yr1Var2.c();
                yr1Var2.m = sh5Var2.K;
                yr1Var2.s = true;
                yr1Var2.c();
                yr1Var2.n = sh5Var2.L;
                yr1Var2.s = true;
                yr1Var2.c();
                yr1Var2.f = sh5Var2.Q;
                yr1Var2.g = true;
                yr1Var2.c();
                k(yr1Var2, sh5Var2);
                yr1Var.e(i, yr1Var2);
            }
        }
    }

    public static final fk3 l() {
        return new fk3(0.0f);
    }

    public static final void m(aj ajVar, long j, float f2, wi wiVar, cj cjVar, tm1 tm1Var) {
        long b2 = f2 == 0.0f ? wiVar.b() : (long) ((j - ajVar.c) / f2);
        ajVar.g = j;
        ajVar.e.setValue(wiVar.f(b2));
        ajVar.f = wiVar.d(b2);
        if (wiVar.e(b2)) {
            ajVar.h = ajVar.g;
            ajVar.i.setValue(Boolean.FALSE);
        }
        G(ajVar, cjVar);
        tm1Var.invoke(ajVar);
    }

    public static sk1 n(sk1[] sk1VarArr, int i) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        sk1 sk1Var = null;
        int i3 = Log.LOG_LEVEL_OFF;
        for (sk1 sk1Var2 : sk1VarArr) {
            int abs = (Math.abs(fb4.v(sk1Var2) - i2) * 2) + (fb4.G(sk1Var2) == z ? 0 : 1);
            if (sk1Var == null || i3 > abs) {
                sk1Var = sk1Var2;
                i3 = abs;
            }
        }
        return sk1Var;
    }

    public static final qb4 o(int i, List list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((qb4) list.get(i2)).d() == i) {
                return (qb4) list.get(i2);
            }
        }
        return null;
    }

    public static final la5 p(k13 k13Var, Object obj) {
        ja3 ja3Var;
        if (!k13Var.getNode().isAttached()) {
            q02.b("visitAncestors called on an unattached node");
        }
        k13 parent$ui = k13Var.getNode().getParent$ui();
        wa2 U = ut0.U(k13Var);
        while (U != null) {
            if ((U.n0.f.getAggregateChildKindSet$ui() & 262144) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & 262144) != 0) {
                        k13 k13Var2 = parent$ui;
                        b53 b53Var = null;
                        while (k13Var2 != null) {
                            if (k13Var2 instanceof la5) {
                                la5 la5Var = (la5) k13Var2;
                                if (obj.equals(la5Var.g())) {
                                    return la5Var;
                                }
                            }
                            if ((k13Var2.getKindSet$ui() & 262144) != 0 && (k13Var2 instanceof wt0)) {
                                int i = 0;
                                for (k13 k13Var3 = ((wt0) k13Var2).J; k13Var3 != null; k13Var3 = k13Var3.getChild$ui()) {
                                    if ((k13Var3.getKindSet$ui() & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            k13Var2 = k13Var3;
                                        } else {
                                            if (b53Var == null) {
                                                b53Var = new b53(new k13[16]);
                                            }
                                            if (k13Var2 != null) {
                                                b53Var.c(k13Var2);
                                                k13Var2 = null;
                                            }
                                            b53Var.c(k13Var3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            k13Var2 = ut0.M(b53Var);
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            U = U.v();
            parent$ui = (U == null || (ja3Var = U.n0) == null) ? null : ja3Var.e;
        }
        return null;
    }

    public static final long q(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final float r(tk0 tk0Var) {
        z13 z13Var = (z13) tk0Var.get(q8.t0);
        float A = z13Var != null ? z13Var.A() : 1.0f;
        if (A >= 0.0f) {
            return A;
        }
        lr3.b("negative scale factor");
        return A;
    }

    public static final hx1 s() {
        hx1 hx1Var = a;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        epVar.z(15.5f, 14.0f);
        epVar.v(-0.79f);
        epVar.y(-0.28f, -0.27f);
        epVar.q(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
        epVar.q(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
        epVar.C(3.0f, 5.91f, 3.0f, 9.5f);
        epVar.C(5.91f, 16.0f, 9.5f, 16.0f);
        epVar.r(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
        epVar.y(0.27f, 0.28f);
        epVar.M(0.79f);
        epVar.y(5.0f, 4.99f);
        epVar.x(20.49f, 19.0f);
        epVar.y(-4.99f, -5.0f);
        epVar.p();
        epVar.z(9.5f, 14.0f);
        epVar.q(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        epVar.C(7.01f, 5.0f, 9.5f, 5.0f);
        epVar.C(14.0f, 7.01f, 14.0f, 9.5f);
        epVar.C(11.99f, 14.0f, 9.5f, 14.0f);
        epVar.p();
        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
        hx1 b2 = gx1Var.b();
        a = b2;
        return b2;
    }

    public static final hx1 t() {
        hx1 hx1Var = b;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.Settings", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep r = r7.r(19.14f, 12.94f);
        r.r(0.04f, -0.3f, 0.06f, -0.61f, 0.06f, -0.94f);
        r.r(0.0f, -0.32f, -0.02f, -0.64f, -0.07f, -0.94f);
        r.y(2.03f, -1.58f);
        r.r(0.18f, -0.14f, 0.23f, -0.41f, 0.12f, -0.61f);
        r.y(-1.92f, -3.32f);
        r.r(-0.12f, -0.22f, -0.37f, -0.29f, -0.59f, -0.22f);
        r.y(-2.39f, 0.96f);
        r.r(-0.5f, -0.38f, -1.03f, -0.7f, -1.62f, -0.94f);
        r.x(14.4f, 2.81f);
        r.r(-0.04f, -0.24f, -0.24f, -0.41f, -0.48f, -0.41f);
        r.v(-3.84f);
        r.r(-0.24f, 0.0f, -0.43f, 0.17f, -0.47f, 0.41f);
        r.x(9.25f, 5.35f);
        r.q(8.66f, 5.59f, 8.12f, 5.92f, 7.63f, 6.29f);
        r.x(5.24f, 5.33f);
        r.r(-0.22f, -0.08f, -0.47f, 0.0f, -0.59f, 0.22f);
        r.x(2.74f, 8.87f);
        r.q(2.62f, 9.08f, 2.66f, 9.34f, 2.86f, 9.48f);
        r.y(2.03f, 1.58f);
        r.q(4.84f, 11.36f, 4.8f, 11.69f, 4.8f, 12.0f);
        r.D(0.02f, 0.64f, 0.07f, 0.94f);
        r.y(-2.03f, 1.58f);
        r.r(-0.18f, 0.14f, -0.23f, 0.41f, -0.12f, 0.61f);
        r.y(1.92f, 3.32f);
        r.r(0.12f, 0.22f, 0.37f, 0.29f, 0.59f, 0.22f);
        r.y(2.39f, -0.96f);
        r.r(0.5f, 0.38f, 1.03f, 0.7f, 1.62f, 0.94f);
        r.y(0.36f, 2.54f);
        r.r(0.05f, 0.24f, 0.24f, 0.41f, 0.48f, 0.41f);
        r.v(3.84f);
        r.r(0.24f, 0.0f, 0.44f, -0.17f, 0.47f, -0.41f);
        r.y(0.36f, -2.54f);
        r.r(0.59f, -0.24f, 1.13f, -0.56f, 1.62f, -0.94f);
        r.y(2.39f, 0.96f);
        r.r(0.22f, 0.08f, 0.47f, 0.0f, 0.59f, -0.22f);
        r.y(1.92f, -3.32f);
        r.r(0.12f, -0.22f, 0.07f, -0.47f, -0.12f, -0.61f);
        r.x(19.14f, 12.94f);
        r.p();
        r.z(12.0f, 15.6f);
        r.r(-1.98f, 0.0f, -3.6f, -1.62f, -3.6f, -3.6f);
        r.D(1.62f, -3.6f, 3.6f, -3.6f);
        r.D(3.6f, 1.62f, 3.6f, 3.6f);
        r.C(13.98f, 15.6f, 12.0f, 15.6f);
        r.p();
        gx1.a(gx1Var, (ArrayList) r.J, rt4Var);
        hx1 b2 = gx1Var.b();
        b = b2;
        return b2;
    }

    public static final u55 u(ki4 ki4Var) {
        tm1 tm1Var;
        ArrayList arrayList = new ArrayList();
        Object g2 = ki4Var.I.g(ii4.a);
        if (g2 == null) {
            g2 = null;
        }
        v4 v4Var = (v4) g2;
        if (v4Var == null || (tm1Var = (tm1) v4Var.b) == null || !((Boolean) tm1Var.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (u55) arrayList.get(0);
    }

    public static final vl0 v(wr5 wr5Var) {
        return wr5Var instanceof ws1 ? ((ws1) wr5Var).d() : ul0.b;
    }

    public static jk3 w(Object obj) {
        return new jk3(obj, q8.B0);
    }

    public static final t43 x(Object obj, fe0 fe0Var) {
        go1 go1Var = (go1) fe0Var;
        Object Q = go1Var.Q();
        if (Q == de0.a) {
            Q = w(obj);
            go1Var.o0(Q);
        }
        t43 t43Var = (t43) Q;
        t43Var.setValue(obj);
        return t43Var;
    }

    public static final vh5 y(hx1 hx1Var, fe0 fe0Var) {
        go1 go1Var = (go1) fe0Var;
        iu0 iu0Var = (iu0) go1Var.k(hf0.h);
        float f2 = hx1Var.j;
        boolean f3 = go1Var.f((Float.floatToRawIntBits(iu0Var.getDensity()) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        Object Q = go1Var.Q();
        if (f3 || Q == de0.a) {
            yr1 yr1Var = new yr1();
            k(yr1Var, hx1Var.f);
            float f4 = hx1Var.b;
            float f5 = hx1Var.c;
            long floatToRawIntBits = (Float.floatToRawIntBits(iu0Var.P(f4)) << 32) | (Float.floatToRawIntBits(iu0Var.P(f5)) & 4294967295L);
            float f6 = hx1Var.d;
            float f7 = hx1Var.e;
            if (Float.isNaN(f6)) {
                f6 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            }
            if (Float.isNaN(f7)) {
                f7 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            }
            long floatToRawIntBits2 = (Float.floatToRawIntBits(f6) << 32) | (4294967295L & Float.floatToRawIntBits(f7));
            vh5 vh5Var = new vh5(yr1Var);
            String str = hx1Var.a;
            long j = hx1Var.g;
            hw hwVar = j != 16 ? new hw(j, hx1Var.h) : null;
            boolean z = hx1Var.i;
            vh5Var.I.setValue(new fq4(floatToRawIntBits));
            vh5Var.J.setValue(Boolean.valueOf(z));
            hh5 hh5Var = vh5Var.K;
            hh5Var.g.setValue(hwVar);
            hh5Var.i.setValue(new fq4(floatToRawIntBits2));
            hh5Var.c = str;
            go1Var.o0(vh5Var);
            Q = vh5Var;
        }
        return (vh5) Q;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.m65 z(defpackage.m65 r30, defpackage.da2 r31) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ad4.z(m65, da2):m65");
    }

    public abstract Typeface g(Context context, fk1 fk1Var, Resources resources, int i);

    public abstract Typeface h(Context context, sk1[] sk1VarArr, int i);

    public Typeface i(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface j(Context context, Resources resources, int i, String str, int i2) {
        File C = kb4.C(context);
        if (C == null) {
            return null;
        }
        try {
            if (kb4.m(C, resources, i)) {
                return Typeface.createFromFile(C.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            C.delete();
        }
    }
}

package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.autofill.AutofillId;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class wb implements es0, View.OnAttachStateChangeListener {
    public final AndroidComposeView I;
    public final va J;
    public th0 K;
    public final ArrayList L = new ArrayList();
    public sb M = sb.I;
    public boolean N = true;
    public final iz O = qb.g(1, 6, null);
    public q33 P;
    public long Q;
    public final q33 R;
    public ti4 S;
    public boolean T;
    public final z1 U;

    public wb(AndroidComposeView androidComposeView, va vaVar) {
        this.I = androidComposeView;
        this.J = vaVar;
        new Handler(Looper.getMainLooper());
        q33 q33Var = q22.a;
        q33Var.getClass();
        this.P = q33Var;
        this.R = new q33();
        this.S = new ti4(androidComposeView.getSemanticsOwner().a(), q33Var);
        this.U = new z1(this, (byte) 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (defpackage.rt0.n(100, r0) == r4) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0083 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fj0 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.vb
            if (r0 == 0) goto L13
            r0 = r9
            vb r0 = (defpackage.vb) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.L = r1
            goto L18
        L13:
            vb r0 = new vb
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.J
            int r1 = r0.L
            r2 = 2
            r3 = 1
            el0 r4 = defpackage.el0.I
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2d
            fz r1 = r0.I
            defpackage.mu0.V(r9)
        L2b:
            r9 = r1
            goto L44
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r8)
            r8 = 0
            return r8
        L34:
            fz r1 = r0.I
            defpackage.mu0.V(r9)
            goto L52
        L3a:
            defpackage.mu0.V(r9)
            fz r9 = new fz
            iz r1 = r8.O
            r9.<init>(r1)
        L44:
            r0.I = r9
            r0.L = r3
            java.lang.Object r1 = r9.a(r0)
            if (r1 != r4) goto L4f
            goto L85
        L4f:
            r7 = r1
            r1 = r9
            r9 = r7
        L52:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L86
            r1.c()
            boolean r9 = r8.d()
            if (r9 == 0) goto L66
            r8.f()
        L66:
            androidx.compose.ui.platform.AndroidComposeView r9 = r8.I
            android.os.Handler r9 = r9.getHandler()
            boolean r5 = r8.T
            if (r5 != 0) goto L79
            if (r9 == 0) goto L79
            r8.T = r3
            z1 r5 = r8.U
            r9.post(r5)
        L79:
            r0.I = r1
            r0.L = r2
            r5 = 100
            java.lang.Object r9 = defpackage.rt0.n(r5, r0)
            if (r9 != r4) goto L2b
        L85:
            return r4
        L86:
            wd5 r8 = defpackage.wd5.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb.a(fj0):java.lang.Object");
    }

    public final void b(p22 p22Var) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        p22 p22Var2 = p22Var;
        int[] iArr3 = p22Var2.b;
        long[] jArr = p22Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j5 = jArr[i3];
            char c2 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j5 & 255) < 128) {
                        int i7 = iArr3[(i3 << 3) + i6];
                        c = c2;
                        ti4 ti4Var = (ti4) this.R.b(i7);
                        vi4 vi4Var = (vi4) p22Var2.b(i7);
                        si4 si4Var = vi4Var != null ? vi4Var.a : null;
                        if (si4Var == null) {
                            throw r7.t("no value for specified key");
                        }
                        j2 = j6;
                        int i8 = si4Var.f;
                        n43 n43Var = si4Var.d.I;
                        if (ti4Var == null) {
                            Object[] objArr = n43Var.b;
                            long[] jArr2 = n43Var.a;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i9 = i4;
                                int i10 = 0;
                                while (true) {
                                    long j7 = jArr2[i10];
                                    j = j5;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                bj4 bj4Var = (bj4) objArr[(i10 << 3) + i12];
                                                bj4 bj4Var2 = zi4.C;
                                                if (j42.c(bj4Var, bj4Var2)) {
                                                    Object g = n43Var.g(bj4Var2);
                                                    if (g == null) {
                                                        g = null;
                                                    }
                                                    List list = (List) g;
                                                    h(i8, String.valueOf(list != null ? (oj) o70.U0(list) : null));
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i9;
                                        }
                                        if (i11 != i9) {
                                            break;
                                        }
                                    }
                                    if (i10 == length2) {
                                        break;
                                    }
                                    i10++;
                                    j5 = j;
                                    i9 = 8;
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            Object[] objArr2 = n43Var.b;
                            long[] jArr3 = n43Var.a;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i13 = 0;
                                while (true) {
                                    long j8 = jArr4[i13];
                                    long[] jArr5 = jArr4;
                                    i = i6;
                                    if ((((~j8) << c) & j8 & j2) != j2) {
                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j8 & 255) < 128) {
                                                j3 = j8;
                                                bj4 bj4Var3 = (bj4) objArr2[(i13 << 3) + i15];
                                                bj4 bj4Var4 = zi4.C;
                                                if (j42.c(bj4Var3, bj4Var4)) {
                                                    Object g2 = ti4Var.a.I.g(bj4Var4);
                                                    if (g2 == null) {
                                                        g2 = null;
                                                    }
                                                    List list2 = (List) g2;
                                                    oj ojVar = list2 != null ? (oj) o70.U0(list2) : null;
                                                    Object g3 = n43Var.g(bj4Var4);
                                                    if (g3 == null) {
                                                        g3 = null;
                                                    }
                                                    List list3 = (List) g3;
                                                    oj ojVar2 = list3 != null ? (oj) o70.U0(list3) : null;
                                                    if (!j42.c(ojVar, ojVar2)) {
                                                        h(i8, String.valueOf(ojVar2));
                                                    }
                                                }
                                            } else {
                                                j3 = j8;
                                            }
                                            i15++;
                                            j8 = j3 >> 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                    }
                                    if (i13 == length3) {
                                        break;
                                    }
                                    i13++;
                                    i6 = i;
                                    jArr4 = jArr5;
                                }
                                i2 = 8;
                            }
                        }
                        i = i6;
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        j = j5;
                        c = c2;
                        j2 = j6;
                        i = i6;
                        i2 = i4;
                    }
                    j5 = j >> i2;
                    i6 = i + 1;
                    i4 = i2;
                    c2 = c;
                    j6 = j2;
                    iArr3 = iArr2;
                    p22Var2 = p22Var;
                }
                iArr = iArr3;
                if (i5 != i4) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            p22Var2 = p22Var;
            iArr3 = iArr;
        }
    }

    public final p22 c() {
        if (this.N) {
            this.N = false;
            this.P = mw2.C(this.I.getSemanticsOwner(), new t5((byte) 3));
            this.Q = System.currentTimeMillis();
        }
        return this.P;
    }

    public final boolean d() {
        return this.K != null;
    }

    public final void f() {
        th0 th0Var = this.K;
        if (th0Var != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.L;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                qh0 qh0Var = (qh0) arrayList.get(i);
                int ordinal = qh0Var.c().ordinal();
                if (ordinal == 0) {
                    g73 b = qh0Var.b();
                    if (b != null) {
                        ((sh0) th0Var).d(b.E());
                    }
                } else {
                    if (ordinal != 1) {
                        s83.v();
                        return;
                    }
                    sh0 sh0Var = (sh0) th0Var;
                    AutofillId b2 = sh0Var.b(qh0Var.a());
                    if (b2 != null) {
                        sh0Var.e(b2);
                    }
                }
            }
            ((sh0) th0Var).a();
            arrayList.clear();
        }
    }

    public final void g(si4 si4Var, ti4 ti4Var) {
        List i;
        int i2;
        List i3;
        bj1 bj1Var = new bj1(ti4Var, this, (byte) 2);
        si4Var.getClass();
        i = si4Var.i((r4 & 1) != 0 ? !si4Var.b : false, (r4 & 2) == 0);
        int size = i.size();
        int i4 = 0;
        for (i2 = 0; i2 < size; i2++) {
            Object obj = i.get(i2);
            if (c().a(((si4) obj).f)) {
                bj1Var.invoke(Integer.valueOf(i4), obj);
                i4++;
            }
        }
        i3 = si4Var.i((r4 & 1) != 0 ? !si4Var.b : false, (r4 & 2) == 0);
        int size2 = i3.size();
        for (int i5 = 0; i5 < size2; i5++) {
            si4 si4Var2 = (si4) i3.get(i5);
            p22 c = c();
            int i6 = si4Var2.f;
            if (c.a(i6)) {
                q33 q33Var = this.R;
                if (q33Var.a(i6)) {
                    Object b = q33Var.b(i6);
                    if (b == null) {
                        throw r7.t("node not present in pruned tree before this change");
                    }
                    g(si4Var2, (ti4) b);
                } else {
                    continue;
                }
            }
        }
    }

    public final void h(int i, String str) {
        th0 th0Var;
        if (Build.VERSION.SDK_INT >= 29 && (th0Var = this.K) != null) {
            sh0 sh0Var = (sh0) th0Var;
            AutofillId b = sh0Var.b(i);
            if (b == null) {
                throw r7.t("Invalid content capture ID");
            }
            sh0Var.f(b, str);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v22 android.view.autofill.AutofillId, still in use, count: 2, list:
          (r1v22 android.view.autofill.AutofillId) from 0x0095: IF  (r1v22 android.view.autofill.AutofillId) == (null android.view.autofill.AutofillId)  -> B:22:0x0070 A[HIDDEN] (LINE:150)
          (r1v22 android.view.autofill.AutofillId) from 0x009c: PHI (r1v11 android.view.autofill.AutofillId) = (r1v10 android.view.autofill.AutofillId), (r1v22 android.view.autofill.AutofillId) binds: [B:100:0x0098, B:42:0x0095] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:24:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(defpackage.si4 r11, int r12) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb.i(si4, int):void");
    }

    public final void j(si4 si4Var) {
        List i;
        if (d()) {
            this.L.add(new qh0(si4Var.f, this.Q, rh0.J, null));
            i = si4Var.i((r4 & 1) != 0 ? !si4Var.b : false, (r4 & 2) == 0);
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                j((si4) i.get(i2));
            }
        }
    }

    public final void k() {
        q33 q33Var = this.R;
        q33Var.c();
        p22 c = c();
        int[] iArr = c.b;
        Object[] objArr = c.c;
        long[] jArr = c.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            q33Var.i(iArr[i4], new ti4(((vi4) objArr[i4]).a, c()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.S = new ti4(this.I.getSemanticsOwner().a(), c());
    }

    @Override // defpackage.es0
    public final void onStart(vi2 vi2Var) {
        this.K = (th0) this.J.invoke();
        i(this.I.getSemanticsOwner().a(), -1);
        f();
    }

    @Override // defpackage.es0
    public final void onStop(vi2 vi2Var) {
        j(this.I.getSemanticsOwner().a());
        f();
        this.K = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.I.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.U);
        this.K = null;
    }

    @Override // defpackage.es0
    public final void onCreate(vi2 vi2Var) {
    }

    @Override // defpackage.es0
    public final void onDestroy(vi2 vi2Var) {
    }

    @Override // defpackage.es0
    public final void onPause(vi2 vi2Var) {
    }

    @Override // defpackage.es0
    public final void onResume(vi2 vi2Var) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}

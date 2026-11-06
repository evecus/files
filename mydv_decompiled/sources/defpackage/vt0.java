package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.util.TypedValue;
import android.view.View;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class vt0 {
    public static hx1 a;
    public static hx1 b;
    public static hx1 c;

    public static Intent A(Context context, ComponentName componentName) {
        String B = B(context, componentName);
        if (B == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), B);
        return B(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String B(Context context, ComponentName componentName) {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i >= 29 ? 269222528 : i >= 24 ? 787072 : 640);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final void C(t43 t43Var) {
        t43Var.setValue(wd5.a);
    }

    public static cy0 D(v52 v52Var, y52 y52Var) {
        return v52Var instanceof e62 ? ((e62) v52Var).L(true, y52Var) : v52Var.R(y52Var.k(), true, new sd(y52Var));
    }

    public static final boolean E(tk0 tk0Var) {
        v52 v52Var = (v52) tk0Var.get(q8.r0);
        if (v52Var != null) {
            return v52Var.isActive();
        }
        return true;
    }

    public static boolean F(ok3 ok3Var) {
        return !qx4.s(ok3Var.b(), ".class", true);
    }

    public static final float G(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static final int H(float f, int i, int i2) {
        return i + ((int) Math.round((i2 - i) * f));
    }

    public static final vw2 I(p74 p74Var, int i, int i2, int i3, int i4, int i5, ww2 ww2Var, List list, bn3[] bn3VarArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        float f;
        long j;
        int i10;
        int i11;
        int i12;
        List list2 = list;
        long j2 = i5;
        int i13 = i7 - i6;
        int[] iArr2 = new int[i13];
        int i14 = i6;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        float f2 = 0.0f;
        while (i14 < i7) {
            pw2 pw2Var = (pw2) list2.get(i14);
            float I = ut0.I(ut0.G(pw2Var));
            if (I > 0.0f) {
                f2 += I;
                i16++;
                j = j2;
                i10 = i14;
            } else {
                int i19 = i3 - i17;
                bn3 bn3Var = bn3VarArr[i14];
                j = j2;
                if (bn3Var == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i10 = i14;
                        i11 = i16;
                        i12 = Log.LOG_LEVEL_OFF;
                    } else {
                        i10 = i14;
                        i11 = i16;
                        i12 = i19 < 0 ? 0 : i19;
                    }
                    bn3Var = pw2Var.u(p74Var.b(0, i12, i4, false));
                } else {
                    i10 = i14;
                    i11 = i16;
                }
                bn3 bn3Var2 = bn3Var;
                int e = p74Var.e(bn3Var2);
                int d = p74Var.d(bn3Var2);
                iArr2[i10 - i6] = e;
                int i20 = i19 - e;
                if (i20 < 0) {
                    i20 = 0;
                }
                i18 = Math.min(i5, i20);
                i17 += e + i18;
                i15 = Math.max(i15, d);
                bn3VarArr[i10] = bn3Var2;
                i16 = i11;
            }
            i14 = i10 + 1;
            j2 = j;
        }
        long j3 = j2;
        if (i16 == 0) {
            i17 -= i18;
            i9 = 0;
        } else {
            long j4 = (r22 - 1) * j3;
            long j5 = ((i3 != Integer.MAX_VALUE ? i3 : i) - i17) - j4;
            if (j5 < 0) {
                j5 = 0;
            }
            float f3 = j5 / f2;
            for (int i21 = i6; i21 < i7; i21++) {
                j5 -= Math.round(ut0.I(ut0.G((pw2) list2.get(i21))) * f3);
            }
            int i22 = i6;
            int i23 = i15;
            int i24 = 0;
            while (i22 < i7) {
                if (bn3VarArr[i22] == null) {
                    pw2 pw2Var2 = (pw2) list2.get(i22);
                    f = f3;
                    q74 G = ut0.G(pw2Var2);
                    float I2 = ut0.I(G);
                    if (I2 <= 0.0f) {
                        o02.b("All weights <= 0 should have placeables");
                    }
                    int signum = Long.signum(j5);
                    long j6 = j5 - signum;
                    int max = Math.max(0, Math.round(I2 * f) + signum);
                    bn3 u = pw2Var2.u(p74Var.b((!(G != null ? G.b : true) || max == Integer.MAX_VALUE) ? 0 : max, max, i4, true));
                    int e2 = p74Var.e(u);
                    int d2 = p74Var.d(u);
                    iArr2[i22 - i6] = e2;
                    i24 += e2;
                    int max2 = Math.max(i23, d2);
                    bn3VarArr[i22] = u;
                    i23 = max2;
                    j5 = j6;
                } else {
                    f = f3;
                }
                i22++;
                list2 = list;
                f3 = f;
            }
            i9 = (int) (i24 + j4);
            int i25 = i3 - i17;
            if (i9 < 0) {
                i9 = 0;
            }
            if (i9 > i25) {
                i9 = i25;
            }
            i15 = i23;
        }
        int i26 = i9 + i17;
        if (i26 < 0) {
            i26 = 0;
        }
        int max3 = Math.max(i26, i);
        int max4 = Math.max(i15, Math.max(i2, 0));
        int[] iArr3 = new int[i13];
        p74Var.a(max3, iArr2, iArr3, ww2Var);
        return p74Var.c(bn3VarArr, ww2Var, iArr3, max3, max4, iArr, i8, i6, i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bb, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.mg3 J(defpackage.h00... r11) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vt0.J(h00[]):mg3");
    }

    public static final rj3 M(fe0 fe0Var, int i) {
        TypedValue typedValue;
        go1 go1Var = (go1) fe0Var;
        Context context = (Context) go1Var.k(rb.b);
        Resources resources = (Resources) go1Var.k(rb.c);
        w44 w44Var = (w44) go1Var.k(rb.e);
        synchronized (w44Var) {
            typedValue = (TypedValue) w44Var.a.b(i);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                q33 q33Var = w44Var.a;
                int d = q33Var.d(i);
                Object[] objArr = q33Var.c;
                Object obj = objArr[d];
                q33Var.b[d] = i;
                objArr[d] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !jx4.G(charSequence, ".xml")) {
            go1Var.d0(-1771643000);
            boolean g = go1Var.g(context.getTheme()) | go1Var.g(charSequence) | go1Var.e(i);
            Object Q = go1Var.Q();
            if (g || Q == de0.a) {
                try {
                    Drawable drawable = resources.getDrawable(i, null);
                    drawable.getClass();
                    Q = new dd(((BitmapDrawable) drawable).getBitmap());
                    go1Var.o0(Q);
                } catch (Exception e) {
                    throw new vb0("Error attempting to load resource: " + ((Object) charSequence), e);
                }
            }
            dw dwVar = new dw((tw1) Q, (((dd) r3).a.getHeight() & 4294967295L) | (((dd) r3).a.getWidth() << 32));
            go1Var.q(false);
            return dwVar;
        }
        go1Var.d0(-1771798434);
        Resources.Theme theme = context.getTheme();
        int i2 = typedValue.changingConfigurations;
        kx1 kx1Var = (kx1) go1Var.k(rb.d);
        jx1 jx1Var = new jx1(theme, i);
        WeakReference weakReference = (WeakReference) kx1Var.a.get(jx1Var);
        ix1 ix1Var = weakReference != null ? (ix1) weakReference.get() : null;
        if (ix1Var == null) {
            XmlResourceParser xml = resources.getXml(i);
            h06.b(xml);
            if (!j42.c(xml.getName(), "vector")) {
                s83.t("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                return null;
            }
            ix1Var = hc4.X(theme, resources, xml, i2);
            kx1Var.a.put(jx1Var, new WeakReference(ix1Var));
        }
        vh5 y = ad4.y(ix1Var.b(), go1Var);
        go1Var.q(false);
        return y;
    }

    public static final um0 N(int i, ui1 ui1Var) {
        int ordinal = ui1Var.o0().ordinal();
        um0 um0Var = um0.I;
        if (ordinal != 0) {
            um0 um0Var2 = um0.J;
            if (ordinal == 1) {
                ui1 t = mu0.t(ui1Var);
                if (t == null) {
                    s83.t("ActiveParent with no focused child");
                    return null;
                }
                um0 N = N(i, t);
                um0 um0Var3 = N != um0Var ? N : null;
                if (um0Var3 != null) {
                    return um0Var3;
                }
                if (ui1Var.K) {
                    return um0Var;
                }
                ui1Var.K = true;
                try {
                    gi1 l0 = ui1Var.l0();
                    g10 g10Var = new g10(i);
                    di1 di1Var = (di1) ut0.V(ui1Var).getFocusOwner();
                    ui1 g = di1Var.g();
                    l0.k.invoke(g10Var);
                    ui1 g2 = di1Var.g();
                    if (!g10Var.b) {
                        return (g == g2 || g2 == null) ? um0Var : ki1.d == ki1.c ? um0Var2 : um0.K;
                    }
                    ki1 ki1Var = ki1.b;
                    return um0Var2;
                } finally {
                    ui1Var.K = false;
                }
            }
            if (ordinal == 2) {
                return um0Var2;
            }
            if (ordinal != 3) {
                s83.v();
                return null;
            }
        }
        return um0Var;
    }

    public static final um0 O(int i, ui1 ui1Var) {
        if (!ui1Var.L) {
            ui1Var.L = true;
            try {
                gi1 l0 = ui1Var.l0();
                g10 g10Var = new g10(i);
                di1 di1Var = (di1) ut0.V(ui1Var).getFocusOwner();
                ui1 g = di1Var.g();
                l0.j.invoke(g10Var);
                ui1 g2 = di1Var.g();
                boolean z = g10Var.b;
                um0 um0Var = um0.J;
                if (z) {
                    ki1 ki1Var = ki1.b;
                    return um0Var;
                }
                if (g != g2 && g2 != null) {
                    return ki1.d == ki1.c ? um0Var : um0.K;
                }
            } finally {
                ui1Var.L = false;
            }
        }
        return um0.I;
    }

    public static final um0 P(int i, ui1 ui1Var) {
        k13 k13Var;
        ja3 ja3Var;
        int ordinal = ui1Var.o0().ordinal();
        um0 um0Var = um0.I;
        if (ordinal != 0) {
            if (ordinal == 1) {
                ui1 t = mu0.t(ui1Var);
                if (t != null) {
                    return N(i, t);
                }
                s83.t("ActiveParent with no focused child");
                return null;
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    s83.v();
                    return null;
                }
                if (!ui1Var.getNode().isAttached()) {
                    q02.b("visitAncestors called on an unattached node");
                }
                k13 parent$ui = ui1Var.getNode().getParent$ui();
                wa2 U = ut0.U(ui1Var);
                loop0: while (true) {
                    if (U == null) {
                        k13Var = null;
                        break;
                    }
                    if ((U.n0.f.getAggregateChildKindSet$ui() & 1024) != 0) {
                        while (parent$ui != null) {
                            if ((parent$ui.getKindSet$ui() & 1024) != 0) {
                                k13Var = parent$ui;
                                b53 b53Var = null;
                                while (k13Var != null) {
                                    if (k13Var instanceof ui1) {
                                        break loop0;
                                    }
                                    if ((k13Var.getKindSet$ui() & 1024) != 0 && (k13Var instanceof wt0)) {
                                        int i2 = 0;
                                        for (k13 k13Var2 = ((wt0) k13Var).J; k13Var2 != null; k13Var2 = k13Var2.getChild$ui()) {
                                            if ((k13Var2.getKindSet$ui() & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
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
                                        if (i2 == 1) {
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
                ui1 ui1Var2 = (ui1) k13Var;
                if (ui1Var2 == null) {
                    return um0Var;
                }
                int ordinal2 = ui1Var2.o0().ordinal();
                if (ordinal2 == 0) {
                    return O(i, ui1Var2);
                }
                if (ordinal2 == 1) {
                    return P(i, ui1Var2);
                }
                if (ordinal2 == 2) {
                    return um0.J;
                }
                if (ordinal2 != 3) {
                    s83.v();
                    return null;
                }
                um0 P = P(i, ui1Var2);
                um0 um0Var2 = P != um0Var ? P : null;
                return um0Var2 == null ? O(i, ui1Var2) : um0Var2;
            }
        }
        return um0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean Q(ui1 ui1Var) {
        b53 b53Var;
        ja3 ja3Var;
        di1 di1Var;
        boolean z;
        int i;
        b53 b53Var2;
        int i2;
        int i3;
        ja3 ja3Var2;
        di1 di1Var2 = (di1) ut0.V(ui1Var).getFocusOwner();
        ui1 g = di1Var2.g();
        oi1 o0 = ui1Var.o0();
        if (g == ui1Var) {
            ui1Var.k0(o0, o0);
            return true;
        }
        b53 b53Var3 = null;
        if ((g == null || g.I) && !ui1Var.I && !((di1) ut0.V(ui1Var).getFocusOwner()).a.mo24requestOwnerFocus7o62pno(null, null)) {
            return false;
        }
        if (g != null) {
            b53Var = new b53(new ui1[16]);
            if (!g.getNode().isAttached()) {
                q02.b("visitAncestors called on an unattached node");
            }
            k13 parent$ui = g.getNode().getParent$ui();
            wa2 U = ut0.U(g);
            while (U != null) {
                if ((U.n0.f.getAggregateChildKindSet$ui() & 1024) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & 1024) != 0) {
                            b53 b53Var4 = b53Var3;
                            k13 k13Var = parent$ui;
                            while (k13Var != null) {
                                if (k13Var instanceof ui1) {
                                    b53Var.c((ui1) k13Var);
                                } else if ((k13Var.getKindSet$ui() & 1024) != 0 && (k13Var instanceof wt0)) {
                                    int i4 = 0;
                                    for (k13 k13Var2 = ((wt0) k13Var).J; k13Var2 != null; k13Var2 = k13Var2.getChild$ui()) {
                                        if ((k13Var2.getKindSet$ui() & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                k13Var = k13Var2;
                                            } else {
                                                if (b53Var4 == null) {
                                                    b53Var4 = new b53(new k13[16]);
                                                }
                                                if (k13Var != null) {
                                                    b53Var4.c(k13Var);
                                                    k13Var = null;
                                                }
                                                b53Var4.c(k13Var2);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                k13Var = ut0.M(b53Var4);
                            }
                        }
                        parent$ui = parent$ui.getParent$ui();
                        b53Var3 = null;
                    }
                }
                U = U.v();
                parent$ui = (U == null || (ja3Var2 = U.n0) == null) ? null : ja3Var2.e;
                b53Var3 = null;
            }
        } else {
            b53Var = null;
        }
        ui1[] ui1VarArr = new ui1[16];
        ui1[] ui1VarArr2 = new ui1[16];
        if (!ui1Var.getNode().isAttached()) {
            q02.b("visitAncestors called on an unattached node");
        }
        k13 parent$ui2 = ui1Var.getNode().getParent$ui();
        wa2 U2 = ut0.U(ui1Var);
        boolean z2 = true;
        int i5 = 0;
        int i6 = 0;
        while (U2 != null) {
            if ((U2.n0.f.getAggregateChildKindSet$ui() & 1024) != 0) {
                while (parent$ui2 != null) {
                    if ((parent$ui2.getKindSet$ui() & 1024) != 0) {
                        k13 k13Var3 = parent$ui2;
                        b53 b53Var5 = null;
                        while (k13Var3 != null) {
                            if (k13Var3 instanceof ui1) {
                                ui1 ui1Var2 = k13Var3;
                                if (j42.c(b53Var != null ? Boolean.valueOf(b53Var.k(ui1Var2)) : null, Boolean.TRUE)) {
                                    int i7 = i5 + 1;
                                    if (ui1VarArr.length < i7) {
                                        int length = ui1VarArr.length;
                                        di1Var = di1Var2;
                                        ?? r1 = new Object[Math.max(i7, length * 2)];
                                        i3 = i7;
                                        System.arraycopy(ui1VarArr, 0, r1, 0, length);
                                        ui1VarArr = r1;
                                    } else {
                                        di1Var = di1Var2;
                                        i3 = i7;
                                    }
                                    ui1VarArr[i5] = ui1Var2;
                                    i5 = i3;
                                } else {
                                    di1Var = di1Var2;
                                    int i8 = i6 + 1;
                                    if (ui1VarArr2.length < i8) {
                                        int length2 = ui1VarArr2.length;
                                        ?? r6 = new Object[Math.max(i8, length2 * 2)];
                                        i2 = i8;
                                        System.arraycopy(ui1VarArr2, 0, r6, 0, length2);
                                        ui1VarArr2 = r6;
                                    } else {
                                        i2 = i8;
                                    }
                                    ui1VarArr2[i6] = ui1Var2;
                                    i6 = i2;
                                }
                                if (ui1Var2 == g) {
                                    z2 = false;
                                }
                                z = false;
                            } else {
                                di1Var = di1Var2;
                                z = true;
                            }
                            if (z && (k13Var3.getKindSet$ui() & 1024) != 0 && (k13Var3 instanceof wt0)) {
                                int i9 = 0;
                                for (k13 k13Var4 = ((wt0) k13Var3).J; k13Var4 != null; k13Var4 = k13Var4.getChild$ui()) {
                                    if ((k13Var4.getKindSet$ui() & 1024) != 0) {
                                        int i10 = i9 + 1;
                                        if (i10 == 1) {
                                            k13Var3 = k13Var4;
                                            i = i10;
                                        } else {
                                            if (b53Var5 == null) {
                                                i = i10;
                                                b53Var2 = new b53(new k13[16]);
                                            } else {
                                                i = i10;
                                                b53Var2 = b53Var5;
                                            }
                                            if (k13Var3 != null) {
                                                b53Var2.c(k13Var3);
                                                k13Var3 = null;
                                            }
                                            b53Var2.c(k13Var4);
                                            b53Var5 = b53Var2;
                                        }
                                        i9 = i;
                                    }
                                }
                                if (i9 == 1) {
                                    di1Var2 = di1Var;
                                }
                            }
                            k13Var3 = ut0.M(b53Var5);
                            di1Var2 = di1Var;
                        }
                    }
                    parent$ui2 = parent$ui2.getParent$ui();
                    di1Var2 = di1Var2;
                }
            }
            di1 di1Var3 = di1Var2;
            U2 = U2.v();
            parent$ui2 = (U2 == null || (ja3Var = U2.n0) == null) ? null : ja3Var.e;
            di1Var2 = di1Var3;
        }
        di1 di1Var4 = di1Var2;
        if (z2 && g != null && !R(g, false)) {
            return false;
        }
        mu0.P(ui1Var, new eq(ui1Var, (byte) 7));
        int ordinal = ui1Var.o0().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        s83.v();
                        return false;
                    }
                }
            }
            ((di1) ut0.V(ui1Var).getFocusOwner()).j(ui1Var);
        }
        oi1 oi1Var = oi1.K;
        oi1 oi1Var2 = oi1.I;
        if (z2 && g != null) {
            g.k0(oi1Var2, oi1Var);
        }
        oi1 oi1Var3 = oi1.J;
        if (b53Var != null) {
            int i11 = b53Var.K - 1;
            Object[] objArr = b53Var.I;
            if (i11 < objArr.length) {
                while (i11 >= 0) {
                    ui1 ui1Var3 = (ui1) objArr[i11];
                    if (di1Var4.g() != ui1Var) {
                        return false;
                    }
                    ui1Var3.k0(oi1Var3, oi1Var);
                    i11--;
                }
            }
        }
        int i12 = i6 - 1;
        if (i12 < ui1VarArr2.length) {
            while (i12 >= 0) {
                ui1 ui1Var4 = ui1VarArr2[i12];
                if (di1Var4.g() != ui1Var) {
                    return false;
                }
                ui1Var4.k0(ui1Var4 == g ? oi1Var2 : oi1Var, oi1Var3);
                i12--;
            }
        }
        if (di1Var4.g() != ui1Var) {
            return false;
        }
        ui1Var.k0(o0, oi1Var2);
        return di1Var4.g() == ui1Var;
    }

    public static final boolean R(ui1 ui1Var, boolean z) {
        int ordinal = ui1Var.o0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ui1 t = mu0.t(ui1Var);
                if (!(t != null ? R(t, z) : true)) {
                    return false;
                }
                ui1Var.k0(oi1.J, oi1.K);
                return true;
            }
            if (ordinal == 2) {
                return z;
            }
            if (ordinal != 3) {
                s83.v();
                return false;
            }
        }
        return true;
    }

    public static ok3 S(ok3 ok3Var, ok3 ok3Var2) {
        ok3Var.getClass();
        String s = ok3Var2.I.s();
        ok3 ok3Var3 = u44.L;
        String replace = jx4.S(ok3Var.I.s(), s).replace('\\', '/');
        replace.getClass();
        return ok3Var3.f(replace);
    }

    public static final View T(tt0 tt0Var) {
        if (!tt0Var.getNode().isAttached()) {
            q02.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) za2.a(ut0.U(tt0Var));
    }

    public static final void U(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static long V(long j, long j2) {
        long j3 = j + j2;
        return (((j2 ^ j) > 0L ? 1 : ((j2 ^ j) == 0L ? 0 : -1)) < 0) | ((j ^ j3) >= 0) ? j3 : ((j3 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    public static long W(long j, long j2) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = ((j ^ j2) >>> 63) + Long.MAX_VALUE;
        if (!((numberOfLeadingZeros < 64) | ((j2 == Long.MIN_VALUE) & (j < 0)))) {
            long j4 = j * j2;
            if (j == 0 || j4 / j == j2) {
                return j4;
            }
        }
        return j3;
    }

    public static ArrayList X(Map map, int i, Integer num, boolean z) {
        map.getClass();
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[360];
        double d = 0.0d;
        for (Map.Entry entry : map.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            int intValue2 = ((Number) entry.getValue()).intValue();
            zs1 zs1Var = new zs1(intValue);
            arrayList.add(zs1Var);
            int floor = (int) Math.floor(zs1Var.b);
            iArr[floor] = iArr[floor] + intValue2;
            d += intValue2;
        }
        double[] dArr = new double[360];
        int i2 = 0;
        for (int i3 = 0; i3 < 360; i3++) {
            double d2 = iArr[i3] / d;
            int i4 = i3 + 16;
            for (int i5 = i3 - 14; i5 < i4; i5++) {
                int i6 = i5 % 360;
                if (i6 < 0) {
                    i6 += 360;
                }
                dArr[i6] = dArr[i6] + d2;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            zs1 zs1Var2 = (zs1) obj;
            double d3 = zs1Var2.b;
            double d4 = zs1Var2.c;
            int rint = ((int) Math.rint(d3)) % 360;
            if (rint < 0) {
                rint += 360;
            }
            double d5 = dArr[rint];
            if (!z || (d4 >= 5.0d && d5 > 0.01d)) {
                arrayList2.add(new za4(zs1Var2, ((d4 - 48.0d) * (d4 < 48.0d ? 0.1d : 0.3d)) + (d5 * 100.0d * 0.7d)));
            }
        }
        t70.H0(new se3((byte) 4), arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (int i8 = 90; 14 < i8; i8--) {
            arrayList3.clear();
            int size2 = arrayList2.size();
            int i9 = 0;
            while (i9 < size2) {
                Object obj2 = arrayList2.get(i9);
                i9++;
                zs1 zs1Var3 = ((za4) obj2).a;
                int size3 = arrayList3.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size3) {
                        arrayList3.add(zs1Var3);
                        break;
                    }
                    Object obj3 = arrayList3.get(i10);
                    i10++;
                    if (180.0d - Math.abs(Math.abs(zs1Var3.b - ((zs1) obj3).b) - 180.0d) < i8) {
                        break;
                    }
                }
                if (arrayList3.size() >= i) {
                    break;
                }
            }
            if (arrayList3.size() >= i) {
                break;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (arrayList3.isEmpty() && num != null) {
            arrayList4.add(num);
        }
        int size4 = arrayList3.size();
        while (i2 < size4) {
            Object obj4 = arrayList3.get(i2);
            i2++;
            arrayList4.add(Integer.valueOf(((zs1) obj4).a));
        }
        return arrayList4;
    }

    public static final String Y(Object[] objArr, int i, int i2, x3 x3Var) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == x3Var) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static final int Z(p33 p33Var) {
        int a2;
        int i = p33Var.b;
        int a3 = p33Var.a(0);
        while (p33Var.b != 0 && p33Var.a(0) == a3) {
            p33Var.f(0, p33Var.b());
            p33Var.e(p33Var.b - 1);
            int i2 = p33Var.b;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int a4 = p33Var.a(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int a5 = p33Var.a(i6);
                if (i5 >= i2 || (a2 = p33Var.a(i5)) <= a5) {
                    if (a5 > a4) {
                        p33Var.f(i4, a5);
                        p33Var.f(i6, a4);
                        i4 = i6;
                    }
                } else if (a2 > a4) {
                    p33Var.f(i4, a2);
                    p33Var.f(i5, a4);
                    i4 = i5;
                }
            }
        }
        return a3;
    }

    public static final long a(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static String a0(int i) {
        return i == 0 ? "Unspecified" : i == 1 ? "Text" : i == 2 ? "Ascii" : i == 3 ? "Number" : i == 4 ? "Phone" : i == 5 ? "Uri" : i == 6 ? "Email" : i == 7 ? "Password" : i == 8 ? "NumberPassword" : i == 9 ? "Decimal" : i == 10 ? "PasswordVisible" : i == 11 ? "PostalAddress" : i == 12 ? "PersonName" : i == 13 ? "EmailSubject" : i == 14 ? "ShortMessage" : i == 15 ? "LongMessage" : i == 16 ? "Filter" : i == 17 ? "Phonetic" : i == 18 ? "DateTime" : i == 19 ? "Date" : i == 20 ? "Time" : i == 21 ? "NumberSigned" : i == 22 ? "DecimalSigned" : i == 23 ? "DecimalPassword" : i == 24 ? "NumberPasswordSigned" : i == 25 ? "DecimalPasswordSigned" : "Invalid";
    }

    public static x52 b() {
        return new x52(null);
    }

    public static final void b0(int i, int i2) {
        if (!(i > 0 && i2 > 0)) {
            t02.a("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        t02.a("minLines " + i + " must be less than or equal to maxLines " + i2);
    }

    public static final void c(final Object obj, final int i, final ye2 ye2Var, final tc0 tc0Var, fe0 fe0Var, final int i2) {
        int i3;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(872548579);
        if ((i2 & 6) == 0) {
            i3 = (go1Var.i(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go1Var.e(i) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= go1Var.i(ye2Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= go1Var.i(tc0Var) ? 2048 : 1024;
        }
        if (go1Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            boolean g = go1Var.g(obj) | go1Var.g(ye2Var);
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (g || Q == jpVar) {
                Q = new we2(obj, ye2Var);
                go1Var.o0(Q);
            }
            we2 we2Var = (we2) Q;
            we2Var.c = i;
            jk3 jk3Var = we2Var.g;
            i51 i51Var = ym3.a;
            we2 we2Var2 = (we2) go1Var.k(i51Var);
            ns4 i4 = o63.i();
            tm1 e = i4 != null ? i4.e() : null;
            ns4 j = o63.j(i4);
            try {
                if (we2Var2 != ((we2) jk3Var.getValue())) {
                    jk3Var.setValue(we2Var2);
                    if (we2Var.d > 0) {
                        we2 we2Var3 = we2Var.e;
                        if (we2Var3 != null) {
                            we2Var3.b();
                        }
                        if (we2Var2 != null) {
                            we2Var2.a();
                        } else {
                            we2Var2 = null;
                        }
                        we2Var.e = we2Var2;
                    }
                }
                o63.o(i4, j, e);
                boolean g2 = go1Var.g(we2Var);
                Object Q2 = go1Var.Q();
                if (g2 || Q2 == jpVar) {
                    Q2 = new i9(we2Var, (byte) 12);
                    go1Var.o0(Q2);
                }
                mw2.e(we2Var, (tm1) Q2, go1Var);
                mw2.b(i51Var.a(we2Var), tc0Var, go1Var, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                o63.o(i4, j, e);
                throw th;
            }
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: xe2
                @Override // defpackage.hn1
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    vt0.c(obj, i, ye2Var, tc0Var, (fe0) obj2, mu0.X(i2 | 1));
                    return wd5.a;
                }
            };
        }
    }

    public static final void d(p33 p33Var, int i) {
        if (p33Var.b == 0 || !(p33Var.a(0) == i || p33Var.a(p33Var.b - 1) == i)) {
            int i2 = p33Var.b;
            p33Var.c(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int a2 = p33Var.a(i3);
                if (i <= a2) {
                    break;
                }
                p33Var.f(i2, a2);
                i2 = i3;
            }
            p33Var.f(i2, i);
        }
    }

    public static void e(wr4 wr4Var, List list, y04 y04Var) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int c2 = wr4Var.c((bo1) list.get(i));
            int O = wr4Var.O(wr4Var.q(c2), wr4Var.b);
            Object obj = O < wr4Var.f(wr4Var.q(c2 + 1), wr4Var.b) ? wr4Var.c[wr4Var.g(O)] : de0.a;
            x04 x04Var = obj instanceof x04 ? (x04) obj : null;
            if (x04Var != null) {
                x04Var.a = y04Var;
            }
        }
    }

    public static final int f(int i, b53 b53Var) {
        int i2 = b53Var.K - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = b53Var.I;
            int i5 = ((x32) objArr[i4]).a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((x32) objArr[i3]).a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static zf1 g(zf1 zf1Var, int i) {
        ez ezVar;
        if (i < 0 && i != -2 && i != -1) {
            s83.h(hf1.u(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i == -1) {
            i = 0;
            ezVar = ez.J;
        } else {
            ezVar = ez.I;
        }
        int i2 = i;
        ez ezVar2 = ezVar;
        return zf1Var instanceof un1 ? hf1.l((un1) zf1Var, null, i2, ezVar2, 1) : new t40(zf1Var, null, i2, ezVar2, 2);
    }

    public static void h(long j, cz czVar, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            s83.t("Failed requirement.");
            return;
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((h00) arrayList4.get(i8)).d() < i7) {
                s83.t("Failed requirement.");
                return;
            }
        }
        h00 h00Var = (h00) arrayList.get(i2);
        h00 h00Var2 = (h00) arrayList4.get(i3 - 1);
        if (i7 == h00Var.d()) {
            int intValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            h00 h00Var3 = (h00) arrayList4.get(i9);
            i4 = i9;
            i5 = intValue;
            h00Var = h00Var3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (h00Var.i(i7) == h00Var2.i(i7)) {
            int min = Math.min(h00Var.d(), h00Var2.d());
            int i10 = 0;
            for (int i11 = i7; i11 < min && h00Var.i(i11) == h00Var2.i(i11); i11++) {
                i10++;
            }
            long j3 = (czVar.J / 4) + j + 2 + i10 + 1;
            czVar.g0(-i10);
            czVar.g0(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                czVar.g0(h00Var.i(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 == ((h00) arrayList4.get(i4)).d()) {
                    czVar.g0(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    zy.i("Check failed.");
                    return;
                }
            }
            cz czVar2 = new cz();
            czVar.g0(((int) ((czVar2.J / 4) + j3)) * (-1));
            h(j3, czVar2, i12, arrayList4, i4, i3, arrayList5);
            czVar.q(czVar2);
            return;
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((h00) arrayList4.get(i14 - 1)).i(i7) != ((h00) arrayList4.get(i14)).i(i7)) {
                i13++;
            }
        }
        long j4 = (czVar.J / 4) + j + 2 + (i13 * 2);
        czVar.g0(i13);
        czVar.g0(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int i16 = ((h00) arrayList4.get(i15)).i(i7);
            if (i15 == i4 || i16 != ((h00) arrayList4.get(i15 - 1)).i(i7)) {
                czVar.g0(i16 & 255);
            }
        }
        cz czVar3 = new cz();
        int i17 = i4;
        while (i17 < i3) {
            byte i18 = ((h00) arrayList4.get(i17)).i(i7);
            int i19 = i17 + 1;
            int i20 = i19;
            while (true) {
                if (i20 >= i3) {
                    i20 = i3;
                    break;
                } else if (i18 != ((h00) arrayList4.get(i20)).i(i7)) {
                    break;
                } else {
                    i20++;
                }
            }
            if (i19 == i20 && i7 + 1 == ((h00) arrayList4.get(i17)).d()) {
                czVar.g0(((Number) arrayList5.get(i17)).intValue());
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i20;
            } else {
                czVar.g0(((int) ((czVar3.J / 4) + j4)) * (-1));
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i20;
                h(j2, czVar3, i7 + 1, arrayList, i17, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j4 = j2;
            i17 = i6;
            arrayList5 = arrayList3;
        }
        czVar.q(czVar3);
    }

    public static final p33 i(me2 me2Var, ye2 ye2Var, cy cyVar) {
        int i;
        a4 a4Var = j42.D(ye2Var.I).c;
        b53 b53Var = cyVar.a;
        int i2 = 1;
        if (!(b53Var.K != 0) && a4Var.isEmpty()) {
            return n22.a;
        }
        p33 p33Var = new p33();
        if (cyVar.a.K != 0) {
            int i3 = b53Var.K;
            if (i3 == 0) {
                s83.l("MutableVector is empty.");
                return null;
            }
            Object[] objArr = b53Var.I;
            int i4 = ((ae2) objArr[0]).a;
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = ((ae2) objArr[i5]).a;
                if (i6 < i4) {
                    i4 = i6;
                }
            }
            if (i4 < 0) {
                t02.a("negative minIndex");
            }
            int i7 = b53Var.K;
            if (i7 == 0) {
                s83.l("MutableVector is empty.");
                return null;
            }
            Object[] objArr2 = b53Var.I;
            int i8 = ((ae2) objArr2[0]).b;
            for (int i9 = 0; i9 < i7; i9++) {
                int i10 = ((ae2) objArr2[i9]).b;
                if (i10 > i8) {
                    i8 = i10;
                }
            }
            i = Math.min(i8, me2Var.a() - 1);
            i2 = i4;
        } else {
            i = 0;
        }
        int c2 = a4Var.c();
        for (int i11 = 0; i11 < c2; i11++) {
            we2 we2Var = (we2) a4Var.get(i11);
            int x = sv2.x(we2Var.c, me2Var, we2Var.a);
            if ((i2 > x || x > i) && x >= 0 && x < me2Var.a()) {
                p33Var.c(x);
            }
        }
        if (i2 <= i) {
            while (true) {
                p33Var.c(i2);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        int i12 = p33Var.b;
        if (i12 == 0) {
            return p33Var;
        }
        int[] iArr = p33Var.a;
        iArr.getClass();
        Arrays.sort(iArr, 0, i12);
        return p33Var;
    }

    public static final void j(tk0 tk0Var, CancellationException cancellationException) {
        v52 v52Var = (v52) tk0Var.get(q8.r0);
        if (v52Var != null) {
            v52Var.e(cancellationException);
        }
    }

    public static long k(long j, long j2) {
        long j3 = j + j2;
        dq2.p(j, j2, ((j ^ j2) < 0) | ((j ^ j3) >= 0));
        return j3;
    }

    public static final int l(float f, float f2, float f3, int i, int i2) {
        if (i == i2) {
            return -1;
        }
        int i3 = i - 2;
        if (i3 < 0) {
            i3 = 0;
        }
        return mw2.P((f3 * (i - 1 <= 1 ? r3 : 1)) + (f2 * i3) + f);
    }

    public static t43 m() {
        return new jk3(wd5.a, q8.v0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long n(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i = ((int) ((j ^ j2) >> 63)) | 1;
        switch (nr2.a[roundingMode.ordinal()]) {
            case 1:
                dq2.r(j4 == 0);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i >= 0) {
                    return j3;
                }
                return j3 + i;
            case 4:
                return j3 + i;
            case 5:
                if (i <= 0) {
                    return j3;
                }
                return j3 + i;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j4);
                long abs2 = abs - (Math.abs(j2) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (abs2 <= 0) {
                    return j3;
                }
                return j3 + i;
            default:
                throw new AssertionError();
        }
    }

    public static final void o(y31 y31Var, jr1 jr1Var) {
        long j;
        Canvas canvas;
        boolean z;
        boolean z2;
        Canvas canvas2;
        float f;
        o10 q = y31Var.S().q();
        jr1 jr1Var2 = (jr1) y31Var.S().c;
        lr1 lr1Var = jr1Var.a;
        if (jr1Var.s) {
            return;
        }
        long j2 = jr1Var.h;
        Canvas b2 = ba.b(q);
        boolean isHardwareAccelerated = b2.isHardwareAccelerated();
        if (!isHardwareAccelerated) {
            long j3 = jr1Var.t;
            float f2 = (int) (j3 >> 32);
            float f3 = f2 - jr1Var.v;
            float f4 = (int) (j3 & 4294967295L);
            float f5 = f4 - jr1Var.w;
            long j4 = jr1Var.u;
            float f6 = f2 + ((int) (j4 >> 32)) + jr1Var.x;
            float f7 = f4 + ((int) (j4 & 4294967295L)) + jr1Var.y;
            float alpha = lr1Var.getAlpha();
            c80 colorFilter = lr1Var.getColorFilter();
            int L = lr1Var.L();
            if (alpha >= 1.0f && L == 3 && colorFilter == null) {
                canvas2 = b2;
                if (lr1Var.j() != 1) {
                    canvas2.save();
                    f = f3;
                    b2 = canvas2;
                    b2.translate(f, f5);
                    Matrix G = lr1Var.G();
                    G.preTranslate(jr1Var.v, jr1Var.w);
                    b2.concat(G);
                    long j5 = jr1Var.h;
                    float f8 = jr1Var.v;
                    jr1Var.h = pd3.e(j5, (Float.floatToRawIntBits(jr1Var.w) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32));
                }
            } else {
                canvas2 = b2;
            }
            pd pdVar = jr1Var.p;
            if (pdVar == null) {
                pdVar = i42.U();
                jr1Var.p = pdVar;
            }
            pdVar.d(alpha);
            pdVar.e(L);
            pdVar.g(colorFilter);
            Paint s0 = i42.s0(pdVar);
            f = f3;
            b2 = canvas2;
            b2.saveLayer(f, f5, f6, f7, s0);
            b2.translate(f, f5);
            Matrix G2 = lr1Var.G();
            G2.preTranslate(jr1Var.v, jr1Var.w);
            b2.concat(G2);
            long j52 = jr1Var.h;
            float f82 = jr1Var.v;
            jr1Var.h = pd3.e(j52, (Float.floatToRawIntBits(jr1Var.w) & 4294967295L) | (Float.floatToRawIntBits(f82) << 32));
        }
        jr1Var.a();
        if (!lr1Var.n()) {
            try {
                jr1Var.a.z(jr1Var.b, jr1Var.c, jr1Var, jr1Var.e);
            } catch (Throwable unused) {
            }
        }
        boolean z3 = lr1Var.I() > 0.0f;
        if (z3) {
            q.s();
        }
        boolean z4 = !isHardwareAccelerated && jr1Var.A;
        if (z4) {
            q.f();
            yg3 d = jr1Var.d();
            if (d instanceof wg3) {
                pt1.k(q, ((wg3) d).a);
            } else if (d instanceof xg3) {
                yd ydVar = jr1Var.m;
                if (ydVar != null) {
                    ydVar.e();
                } else {
                    ydVar = ae.a();
                    jr1Var.m = ydVar;
                }
                hf1.j(ydVar, ((xg3) d).a);
                pt1.i(q, ydVar);
            } else {
                if (!(d instanceof vg3)) {
                    s83.v();
                    return;
                }
                pt1.i(q, ((vg3) d).a);
            }
        }
        if (jr1Var2 != null) {
            f60 f60Var = jr1Var2.r;
            if (!f60Var.e) {
                p02.a("Only add dependencies during a tracking");
            }
            o43 o43Var = f60Var.c;
            if (o43Var != null) {
                o43Var.d(jr1Var);
            } else if (f60Var.a != null) {
                o43 o43Var2 = ka4.a;
                o43 o43Var3 = new o43();
                jr1 jr1Var3 = f60Var.a;
                jr1Var3.getClass();
                o43Var3.d(jr1Var3);
                o43Var3.d(jr1Var);
                f60Var.c = o43Var3;
                f60Var.a = null;
            } else {
                f60Var.a = jr1Var;
            }
            o43 o43Var4 = f60Var.d;
            if (o43Var4 != null) {
                z2 = !o43Var4.l(jr1Var);
            } else if (f60Var.b != jr1Var) {
                z2 = true;
            } else {
                f60Var.b = null;
                z2 = false;
            }
            if (z2) {
                jr1Var.q++;
            }
        }
        if (((aa) q).a.isHardwareAccelerated()) {
            j = j2;
            canvas = b2;
            z = z3;
            lr1Var.i(q);
        } else {
            r10 r10Var = jr1Var.o;
            if (r10Var == null) {
                r10Var = new r10();
                jr1Var.o = r10Var;
            }
            pn pnVar = r10Var.J;
            iu0 iu0Var = jr1Var.b;
            da2 da2Var = jr1Var.c;
            long b0 = ut0.b0(jr1Var.u);
            iu0 u = pnVar.u();
            da2 C = pnVar.C();
            canvas = b2;
            o10 q2 = pnVar.q();
            j = j2;
            long H = pnVar.H();
            z = z3;
            jr1 jr1Var4 = (jr1) pnVar.c;
            pnVar.V(iu0Var);
            pnVar.W(da2Var);
            pnVar.U(q);
            pnVar.X(b0);
            pnVar.c = jr1Var;
            q.f();
            try {
                jr1Var.c(r10Var);
            } finally {
                q.n();
                pnVar.V(u);
                pnVar.W(C);
                pnVar.U(q2);
                pnVar.X(H);
                pnVar.c = jr1Var4;
            }
        }
        if (z4) {
            q.n();
        }
        if (z) {
            q.g();
        }
        if (!isHardwareAccelerated) {
            canvas.restore();
        }
        jr1Var.h = j;
    }

    public static final void p(tk0 tk0Var) {
        v52 v52Var = (v52) tk0Var.get(q8.r0);
        if (v52Var != null && !v52Var.isActive()) {
            throw v52Var.t();
        }
    }

    public static final float q(float f) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f) & 8589934591L) / 3)) + 709952852);
        float f2 = intBitsToFloat - ((intBitsToFloat - (f / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static final void r(c4 c4Var, le0 le0Var, String str) {
        le0Var.b().getClass();
        p70.Y(1, null);
        d4.N(str, c4Var.a());
        throw null;
    }

    public static final zf1 s(zf1 zf1Var, tk0 tk0Var) {
        if (tk0Var.get(q8.r0) == null) {
            return tk0Var.equals(l91.I) ? zf1Var : zf1Var instanceof un1 ? hf1.l((un1) zf1Var, tk0Var, 0, null, 6) : new t40(zf1Var, tk0Var, 0, null, 12);
        }
        s83.s(tk0Var, "Flow context cannot contain job in it. Had ");
        return null;
    }

    public static long t(long j, long j2) {
        dq2.q(CmcdData.OBJECT_TYPE_AUDIO_ONLY, j);
        dq2.q("b", j2);
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long j3 = j >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j4 = j2 >> numberOfTrailingZeros2;
        while (j3 != j4) {
            long j5 = j3 - j4;
            long j6 = (j5 >> 63) & j5;
            long j7 = (j5 - j6) - j6;
            j4 += j6;
            j3 = j7 >> Long.numberOfTrailingZeros(j7);
        }
        return j3 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static final float u(Layout layout, int i, Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = w55.a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : cz1.a[paragraphAlignment.ordinal()]) == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final float v(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = w55.a;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? cz1.a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - measureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - measureText;
        }
        return width - width2;
    }

    public static b73 w(vr5 vr5Var) {
        k02 k02Var = c73.a;
        ul0 ul0Var = ul0.b;
        k02Var.getClass();
        ul0Var.getClass();
        ts0 ts0Var = new ts0(vr5Var, k02Var, ul0Var);
        k60 a2 = s24.a(b73.class);
        String b2 = a2.b();
        if (b2 != null) {
            return (b73) ts0Var.p(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b2));
        }
        s83.t("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static final v52 x(tk0 tk0Var) {
        v52 v52Var = (v52) tk0Var.get(q8.r0);
        if (v52Var != null) {
            return v52Var;
        }
        zy.h(tk0Var, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final hx1 y() {
        hx1 hx1Var = b;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.MoreVert", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep r = r7.r(12.0f, 8.0f);
        r.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        r.D(-0.9f, -2.0f, -2.0f, -2.0f);
        r.D(-2.0f, 0.9f, -2.0f, 2.0f);
        r.D(0.9f, 2.0f, 2.0f, 2.0f);
        r.p();
        r.z(12.0f, 10.0f);
        r.r(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        r.D(0.9f, 2.0f, 2.0f, 2.0f);
        r.D(2.0f, -0.9f, 2.0f, -2.0f);
        r.D(-0.9f, -2.0f, -2.0f, -2.0f);
        r.p();
        r.z(12.0f, 16.0f);
        r.r(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        r.D(0.9f, 2.0f, 2.0f, 2.0f);
        r.D(2.0f, -0.9f, 2.0f, -2.0f);
        r.D(-0.9f, -2.0f, -2.0f, -2.0f);
        r.p();
        gx1.a(gx1Var, (ArrayList) r.J, rt4Var);
        hx1 b2 = gx1Var.b();
        b = b2;
        return b2;
    }

    public static Intent z(nk nkVar) {
        Intent parentActivityIntent = nkVar.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String B = B(nkVar, nkVar.getComponentName());
            if (B == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(nkVar, B);
            try {
                return B(nkVar, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                android.util.Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + B + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract void K(Throwable th);

    public abstract void L(mc3 mc3Var);
}

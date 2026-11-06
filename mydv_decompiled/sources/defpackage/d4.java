package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.work.impl.WorkDatabase;
import com.github.mytv.dv.widget.RefreshWidgetAction;
import j$.util.DesugarCollections;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class d4 {
    public static hx1 a;
    public static hx1 b;
    public static hx1 c;

    public static k33 A(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("ActionCallbackBroadcastReceiver:parameters");
        if (bundle2 == null) {
            s83.t("The intent must contain a parameters bundle using extra: ActionCallbackBroadcastReceiver:parameters");
            return null;
        }
        k33 R = a5.R(new b7[0]);
        LinkedHashMap linkedHashMap = R.a;
        for (String str : bundle2.keySet()) {
            a7 a7Var = new a7(str);
            Object obj = bundle2.get(str);
            linkedHashMap.get(a7Var);
            if (obj == null) {
                linkedHashMap.remove(a7Var);
            } else {
                linkedHashMap.put(a7Var, obj);
            }
        }
        if (bundle.containsKey("android.widget.extra.CHECKED")) {
            a7 a7Var2 = j16.y0;
            Boolean valueOf = Boolean.valueOf(bundle.getBoolean("android.widget.extra.CHECKED"));
            linkedHashMap.get(a7Var2);
            linkedHashMap.put(a7Var2, valueOf);
        }
        return R;
    }

    public static final void B(BroadcastReceiver broadcastReceiver, tk0 tk0Var, hn1 hn1Var) {
        if (vk1.a.get()) {
            zy.i("goAsync must never be called when the AsyncRequestWorker is meant to be used");
            return;
        }
        dj0 H = i42.H(tk0Var);
        p70.g0(H, null, null, new o1(H, broadcastReceiver.goAsync(), hn1Var, null, (byte) 4), 3);
    }

    public static final BoringLayout.Metrics C(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
            return null;
        }
        return BoringLayout.isBoring(charSequence, textPaint, null);
    }

    public static final boolean D(lo loVar) {
        int i = loVar.a;
        return Integer.MIN_VALUE <= i && i < -1;
    }

    public static void E(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static Object[] F(int i, Object[] objArr) {
        if (objArr.length < i) {
            return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    public static String G(int i) {
        return i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK";
    }

    public static final Object I(ns1 ns1Var, yf yfVar) {
        return g4.b0(ns1Var, yfVar);
    }

    public static final Object J(ui1 ui1Var, int i, tm1 tm1Var) {
        int i2;
        int i3;
        Object obj;
        k13 k13Var;
        ee2 n0;
        ja3 ja3Var;
        if (!ui1Var.getNode().isAttached()) {
            q02.b("visitAncestors called on an unattached node");
        }
        k13 parent$ui = ui1Var.getNode().getParent$ui();
        wa2 U = ut0.U(ui1Var);
        loop0: while (true) {
            i2 = 0;
            i3 = 1;
            obj = null;
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
                                int i4 = 0;
                                for (k13 k13Var2 = ((wt0) k13Var).J; k13Var2 != null; k13Var2 = k13Var2.getChild$ui()) {
                                    if ((k13Var2.getKindSet$ui() & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
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
                                if (i4 == 1) {
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
        if ((ui1Var2 == null || !j42.c(ui1Var2.n0(), ui1Var.n0())) && (n0 = ui1Var.n0()) != null) {
            int i5 = 5;
            if (i != 5) {
                i5 = 6;
                if (i != 6) {
                    i5 = 3;
                    if (i != 3) {
                        i5 = 4;
                        if (i != 4) {
                            if (i == 1) {
                                i3 = 2;
                            } else if (i != 2) {
                                zy.i("Unsupported direction for beyond bounds layout");
                            }
                            if (n0.I.a() > 0 || !n0.I.d() || !n0.isAttached()) {
                                return tm1Var.invoke(ee2.L);
                            }
                            boolean k0 = n0.k0(i3);
                            fe2 fe2Var = n0.I;
                            int b2 = k0 ? fe2Var.b() : fe2Var.e();
                            r24 r24Var = new r24();
                            cy cyVar = n0.J;
                            cyVar.getClass();
                            ae2 ae2Var = new ae2(b2, b2);
                            cyVar.a.c(ae2Var);
                            r24Var.I = ae2Var;
                            int c2 = n0.I.c() * 2;
                            int a2 = n0.I.a();
                            if (c2 > a2) {
                                c2 = a2;
                            }
                            while (obj == null && n0.j0((ae2) r24Var.I, i3) && i2 < c2) {
                                ae2 ae2Var2 = (ae2) r24Var.I;
                                int i6 = ae2Var2.a;
                                int i7 = ae2Var2.b;
                                if (n0.k0(i3)) {
                                    i7++;
                                } else {
                                    i6--;
                                }
                                cy cyVar2 = n0.J;
                                cyVar2.getClass();
                                ae2 ae2Var3 = new ae2(i6, i7);
                                cyVar2.a.c(ae2Var3);
                                n0.J.a.k((ae2) r24Var.I);
                                r24Var.I = ae2Var3;
                                i2++;
                                ut0.U(n0).k();
                                obj = tm1Var.invoke(new de2(n0, r24Var, i3));
                            }
                            n0.J.a.k((ae2) r24Var.I);
                            ut0.U(n0).k();
                            return obj;
                        }
                    }
                }
            }
            i3 = i5;
            if (n0.I.a() > 0) {
            }
            return tm1Var.invoke(ee2.L);
        }
        return null;
    }

    public static final void M(k60 k60Var, t72 t72Var) {
        t72Var.getClass();
        String c2 = k60Var.c();
        if (c2 == null) {
            c2 = String.valueOf(k60Var);
        }
        N(c2, t72Var);
        throw null;
    }

    public static final void N(String str, t72 t72Var) {
        String sb;
        t72Var.getClass();
        StringBuilder sb2 = new StringBuilder("in the polymorphic scope of '");
        k60 k60Var = (k60) t72Var;
        sb2.append(k60Var.c());
        sb2.append('\'');
        String sb3 = sb2.toString();
        if (str == null) {
            sb = hf1.t('.', "Class discriminator was missing and no default serializers were registered ", sb3);
        } else {
            StringBuilder F = r7.F("Serializer for subclass '", str, "' is not found ", sb3, ".\nCheck if class with serial name '");
            r7.N(F, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            F.append(k60Var.c());
            F.append("' has to be sealed and '@Serializable'.");
            sb = F.toString();
        }
        throw new zj4(sb);
    }

    public static void O(View view, float[] fArr, float[] fArr2, int[] iArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            O((View) parent, fArr, fArr2, iArr);
            qb.Z(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            qb.Z(fArr, view.getLeft(), view.getTop(), fArr2);
        } else {
            view.getLocationInWindow(iArr);
            qb.Z(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            qb.Z(fArr, iArr[0], iArr[1], fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        o7.P(matrix, fArr2);
        qb.Y(fArr, fArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P(defpackage.tk0 r5, java.lang.Object r6, java.lang.Object r7, defpackage.hn1 r8, defpackage.fj0 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.r40
            if (r0 == 0) goto L13
            r0 = r9
            r40 r0 = (defpackage.r40) r0
            int r1 = r0.M
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.M = r1
            goto L18
        L13:
            r40 r0 = new r40
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.L
            int r1 = r0.M
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L31
            java.lang.Object r5 = r0.K
            tk0 r6 = r0.J
            defpackage.mu0.V(r9)     // Catch: java.lang.Throwable -> L2b
            r7 = r5
            r5 = r6
            goto L68
        L2b:
            r7 = move-exception
            r4 = r7
            r7 = r5
            r5 = r6
            r6 = r4
            goto L6c
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r5)
            r5 = 0
            return r5
        L38:
            defpackage.mu0.V(r9)
            java.lang.Object r7 = defpackage.j42.l0(r5, r7)
            r0.I = r6     // Catch: java.lang.Throwable -> L58
            r0.J = r5     // Catch: java.lang.Throwable -> L58
            r0.K = r7     // Catch: java.lang.Throwable -> L58
            r0.M = r2     // Catch: java.lang.Throwable -> L58
            mu4 r9 = new mu4     // Catch: java.lang.Throwable -> L58
            r9.<init>(r0, r5)     // Catch: java.lang.Throwable -> L58
            boolean r0 = defpackage.r7.O(r8)     // Catch: java.lang.Throwable -> L58
            if (r0 != 0) goto L5a
            java.lang.Object r6 = defpackage.mu0.Y(r8, r6, r9)     // Catch: java.lang.Throwable -> L58
        L56:
            r9 = r6
            goto L63
        L58:
            r6 = move-exception
            goto L6c
        L5a:
            r0 = 2
            defpackage.p70.A(r0, r8)     // Catch: java.lang.Throwable -> L58
            java.lang.Object r6 = r8.invoke(r6, r9)     // Catch: java.lang.Throwable -> L58
            goto L56
        L63:
            el0 r6 = defpackage.el0.I
            if (r9 != r6) goto L68
            return r6
        L68:
            defpackage.j42.Y(r5, r7)
            return r9
        L6c:
            defpackage.j42.Y(r5, r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d4.P(tk0, java.lang.Object, java.lang.Object, hn1, fj0):java.lang.Object");
    }

    public static final void a(u45 u45Var, tc0 tc0Var, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(2080741862);
        if ((i & 6) == 0) {
            i2 = (go1Var.i(u45Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.i(tc0Var) ? 32 : 16;
        }
        byte b2 = 1;
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            a5.d(u45Var, tc0Var, go1Var, i2 & WebSocketProtocol.PAYLOAD_SHORT);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new fb0(u45Var, tc0Var, i, b2);
        }
    }

    public static final void b(rm1 rm1Var, tw0 tw0Var, tc0 tc0Var, fe0 fe0Var, int i) {
        int i2;
        byte b2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(826668973);
        if ((i & 6) == 0) {
            i2 = (go1Var.i(rm1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.g(tw0Var) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.i(tc0Var) ? 256 : 128;
        }
        int i3 = i2;
        byte b3 = 1;
        if (go1Var.T(i3 & 1, (i3 & 147) != 146)) {
            View view = (View) go1Var.k(rb.f);
            iu0 iu0Var = (iu0) go1Var.k(hf0.h);
            da2 da2Var = (da2) go1Var.k(hf0.n);
            eo1 b0 = qb.b0(go1Var);
            t43 x = ad4.x(tc0Var, go1Var);
            Object[] objArr = new Object[0];
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            Object obj = Q;
            if (Q == jpVar) {
                u7 u7Var = new u7(b3);
                go1Var.o0(u7Var);
                obj = u7Var;
            }
            UUID uuid = (UUID) ut0.N(objArr, (rm1) obj, go1Var);
            boolean g = go1Var.g(view) | go1Var.g(iu0Var) | go1Var.e(tw0Var.g) | go1Var.g(null);
            Object Q2 = go1Var.Q();
            if (g || Q2 == jpVar) {
                vw0 vw0Var = new vw0(rm1Var, tw0Var, view, da2Var, iu0Var, uuid);
                b2 = 1;
                tc0 tc0Var2 = new tc0(-1338939603, new fc(x, r13), true);
                qw0 qw0Var = vw0Var.P;
                qw0Var.setParentCompositionContext(b0);
                qw0Var.S.setValue(tc0Var2);
                qw0Var.W = true;
                qw0Var.d();
                go1Var.o0(vw0Var);
                Q2 = vw0Var;
            } else {
                b2 = 1;
            }
            vw0 vw0Var2 = (vw0) Q2;
            boolean i4 = go1Var.i(vw0Var2);
            Object Q3 = go1Var.Q();
            Object obj2 = Q3;
            if (i4 || Q3 == jpVar) {
                gc gcVar = new gc(vw0Var2, r13);
                go1Var.o0(gcVar);
                obj2 = gcVar;
            }
            mw2.e(vw0Var2, (tm1) obj2, go1Var);
            int i5 = (go1Var.i(vw0Var2) ? 1 : 0) | ((i3 & 14) == 4 ? b2 : (byte) 0) | ((i3 & 112) == 32 ? b2 : (byte) 0) | (go1Var.e(da2Var.ordinal()) ? 1 : 0);
            Object Q4 = go1Var.Q();
            if (i5 != 0 || Q4 == jpVar) {
                hc hcVar = new hc(vw0Var2, rm1Var, tw0Var, da2Var, (byte) 0);
                go1Var.o0(hcVar);
                Q4 = hcVar;
            }
            mw2.L(go1Var, (rm1) Q4);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new ic(rm1Var, tw0Var, tc0Var, i, (byte) 0);
        }
    }

    public static final void c(l13 l13Var, hn1 hn1Var, fe0 fe0Var, int i) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1090521195);
        int i2 = (go1Var.g(l13Var) ? 4 : 2) | i | (go1Var.i(hn1Var) ? 32 : 16);
        byte b2 = 3;
        if (go1Var.T(i2 & 1, (i2 & 19) != 18)) {
            Object Q = go1Var.Q();
            if (Q == de0.a) {
                Q = kc.b;
                go1Var.o0(Q);
            }
            uw2 uw2Var = (uw2) Q;
            int i3 = ((i2 << 3) & 112) | ((i2 >> 3) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK;
            long j = go1Var.T;
            int i4 = (int) (j ^ (j >>> 32));
            am3 m = go1Var.m();
            l13 x0 = i42.x0(go1Var, l13Var);
            xd0.c.getClass();
            int i5 = ((i3 << 6) & 896) | 6;
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(wa2.A0);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, q8.c0, uw2Var);
            qi4.k(go1Var, q8.b0, m);
            qi4.k(go1Var, q8.d0, Integer.valueOf(i4));
            qi4.j(go1Var);
            qi4.k(go1Var, q8.a0, x0);
            hn1Var.invoke(go1Var, Integer.valueOf((i5 >> 6) & 14));
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new bj1(b2, i, l13Var, hn1Var);
        }
    }

    public static final void d(l13 l13Var, xx3 xx3Var, tc0 tc0Var, fe0 fe0Var, int i) {
        int i2;
        tc0 tc0Var2 = wx5.g;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-714464401);
        if ((i & 6) == 0) {
            i2 = (go1Var.g(l13Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.g(xx3Var) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.i(tc0Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go1Var.i(tc0Var) ? 2048 : 1024;
        }
        if (go1Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            Object Q = go1Var.Q();
            if (Q == de0.a) {
                jk3 jk3Var = new jk3(null, q8.v0);
                go1Var.o0(jk3Var);
                Q = jk3Var;
            }
            bv g = g(tc0Var2, go1Var, (i2 >> 6) & 14);
            mw2.b(xx3Var.a(g), p70.u0(274270255, new so2((byte) 3, (t43) Q, (Object) l13Var, (Object) tc0Var, (Object) g), go1Var), go1Var, 56);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new ve(l13Var, xx3Var, tc0Var, i, (byte) 1);
        }
    }

    public static final g12 e() {
        return new g12((byte) 2, false);
    }

    public static final ag1 f(ag1 ag1Var, tk0 tk0Var) {
        return !(ag1Var instanceof nj4) ? ag1Var instanceof xa3 ? ag1Var : new kh1(ag1Var, tk0Var) : ag1Var;
    }

    public static final bv g(tc0 tc0Var, fe0 fe0Var, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && ((go1) fe0Var).g(tc0Var)) || (i & 6) == 4;
        go1 go1Var = (go1) fe0Var;
        Object Q = go1Var.Q();
        jp jpVar = de0.a;
        if (z || Q == jpVar) {
            Q = new bv(tc0Var);
            go1Var.o0(Q);
        }
        bv bvVar = (bv) Q;
        boolean g = go1Var.g(bvVar);
        Object Q2 = go1Var.Q();
        if (g || Q2 == jpVar) {
            Q2 = new v1((Object) bvVar, (byte) 10);
            go1Var.o0(Q2);
        }
        mw2.e(bvVar, (tm1) Q2, go1Var);
        return bvVar;
    }

    public static final CursorAnchorInfo h(CursorAnchorInfo.Builder builder, d55 d55Var, td3 td3Var, u55 u55Var, Matrix matrix, m14 m14Var, m14 m14Var2, boolean z, boolean z2, boolean z3, boolean z4) {
        builder.reset();
        builder.setMatrix(matrix);
        long j = d55Var.b;
        d65 d65Var = d55Var.c;
        int f = d65.f(j);
        builder.setSelectionRange(f, d65.e(d55Var.b));
        s44 s44Var = s44.J;
        if (z && f >= 0) {
            int k = td3Var.k(f);
            m14 c2 = u55Var.c(k);
            float q = ut0.q(c2.a, 0.0f, (int) (u55Var.c >> 32));
            boolean m = m(m14Var, q, c2.b);
            boolean m2 = m(m14Var, q, c2.d);
            boolean z5 = u55Var.a(k) == s44Var;
            int i = (m || m2) ? 1 : 0;
            if (!m || !m2) {
                i |= 2;
            }
            if (z5) {
                i |= 4;
            }
            float f2 = c2.b;
            float f3 = c2.d;
            builder.setInsertionMarkerLocation(q, f2, f3, f3, i);
        }
        if (z2) {
            int f4 = d65Var != null ? d65.f(d65Var.a) : -1;
            int e = d65Var != null ? d65.e(d65Var.a) : -1;
            if (f4 >= 0 && f4 < e) {
                builder.setComposingText(f4, d55Var.a.J.subSequence(f4, e));
                int k2 = td3Var.k(f4);
                int k3 = td3Var.k(e);
                float[] fArr = new float[(k3 - k2) * 4];
                u55Var.b.a(ui4.c(k2, k3), fArr);
                for (int i2 = f4; i2 < e; i2++) {
                    int k4 = td3Var.k(i2);
                    int i3 = (k4 - k2) * 4;
                    float f5 = fArr[i3];
                    float f6 = fArr[i3 + 1];
                    float f7 = fArr[i3 + 2];
                    float f8 = fArr[i3 + 3];
                    int i4 = (m14Var.a < f7 ? 1 : 0) & (f5 < m14Var.c ? 1 : 0) & (m14Var.b < f8 ? 1 : 0) & (f6 < m14Var.d ? 1 : 0);
                    if (!m(m14Var, f5, f6) || !m(m14Var, f7, f8)) {
                        i4 |= 2;
                    }
                    if (u55Var.a(k4) == s44Var) {
                        i4 |= 4;
                    }
                    builder.addCharacterBounds(i2, f5, f6, f7, f8, i4);
                }
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33 && z3) {
            l5.k(builder, m14Var2);
        }
        if (i5 >= 34 && z4) {
            z4.a(builder, u55Var, m14Var);
        }
        return builder.build();
    }

    public static void i(AndroidComposeView androidComposeView, float[] fArr, float[] fArr2, int[] iArr) {
        nw2.d(fArr);
        O(androidComposeView, fArr, fArr2, iArr);
    }

    public static final void k(ux5 ux5Var, String str) {
        dz5 b2;
        WorkDatabase workDatabase = ux5Var.c;
        workDatabase.getClass();
        oy5 w = workDatabase.w();
        ru0 r = workDatabase.r();
        ArrayList n0 = p70.n0(str);
        while (!n0.isEmpty()) {
            String str2 = (String) u70.L0(n0);
            sx5 d = w.d(str2);
            if (d != sx5.K && d != sx5.L) {
                ((Number) g4.V(w.a, false, true, new pu0(str2, (byte) 15))).intValue();
            }
            n0.addAll(r.a(str2));
        }
        yt3 yt3Var = ux5Var.f;
        yt3Var.getClass();
        synchronized (yt3Var.k) {
            fr2.e().a(yt3.l, "Processor cancelling " + str);
            yt3Var.i.add(str);
            b2 = yt3Var.b(str);
        }
        yt3.e(str, b2, 1);
        Iterator it = ux5Var.e.iterator();
        while (it.hasNext()) {
            ((na4) it.next()).d(str);
        }
    }

    public static int l(kb0 kb0Var, kb0 kb0Var2) {
        kb0Var2.getClass();
        o75 o75Var = (o75) kb0Var;
        o75Var.getClass();
        long j = o75Var.I;
        if (kb0Var2 instanceof o75) {
            return t41.c(o75.b(j, ((o75) kb0Var2).I), 0L);
        }
        throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) ("ValueTimeMark(reading=" + j + ')')) + " and " + kb0Var2);
    }

    public static final boolean m(m14 m14Var, float f, float f2) {
        float f3 = m14Var.a;
        if (f > m14Var.c || f3 > f) {
            return false;
        }
        return f2 <= m14Var.d && m14Var.b <= f2;
    }

    public static void n() {
        Exception exc = new Exception();
        String simpleName = j16.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    public static final BoringLayout o(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z, TextUtils.TruncateAt truncateAt, int i2) {
        return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, truncateAt, i2);
    }

    public static final ExecutorService p(boolean z) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new vf0(z));
        newFixedThreadPool.getClass();
        return newFixedThreadPool;
    }

    public static xw0 q(q0 q0Var, int i) {
        xw0 i84Var;
        if (q0Var.r(u53.a)) {
            i84Var = new f84();
        } else {
            if (!q0Var.r(u53.e)) {
                hn3.i(q0Var, "unrecognized digest OID: ");
                return null;
            }
            i84Var = new i84(256);
        }
        return (u53.e.r(q0Var) || i84Var.d() != i) ? new yw0(i, i84Var) : i84Var;
    }

    public static Intent r(ha5 ha5Var, c7 c7Var) {
        Intent putExtra = new Intent().setComponent(ha5Var.o.b).putExtra("ActionCallbackBroadcastReceiver:callbackClass", RefreshWidgetAction.class.getCanonicalName()).putExtra("ActionCallbackBroadcastReceiver:appWidgetId", ha5Var.b);
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(((k33) c7Var).a);
        ArrayList arrayList = new ArrayList(unmodifiableMap.size());
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            a7 a7Var = (a7) entry.getKey();
            arrayList.add(new uj3(a7Var.a, entry.getValue()));
        }
        uj3[] uj3VarArr = (uj3[]) arrayList.toArray(new uj3[0]);
        putExtra.putExtra("ActionCallbackBroadcastReceiver:parameters", i42.b0((uj3[]) Arrays.copyOf(uj3VarArr, uj3VarArr.length)));
        return putExtra;
    }

    public static final String s(int i) {
        return hf1.u(i, "appWidget-");
    }

    public static final File t(Context context, String str) {
        context.getClass();
        str.getClass();
        return new File(context.getApplicationContext().getFilesDir(), j42.d0(str, "datastore/"));
    }

    public static final void u(w23 w23Var, o10 o10Var, wy wyVar, float f, an4 an4Var, m35 m35Var, z31 z31Var) {
        ArrayList arrayList = w23Var.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            yj3 yj3Var = (yj3) arrayList.get(i);
            yj3Var.a.f(o10Var, wyVar, f, an4Var, m35Var, z31Var);
            o10Var.m(0.0f, yj3Var.a.f);
        }
    }

    public static final ArrayList v(Bundle bundle) {
        int i = bundle.getInt("appWidgetMinHeight", 0);
        int i2 = bundle.getInt("appWidgetMaxWidth", 0);
        v11 v11Var = null;
        v11 v11Var2 = (i == 0 || i2 == 0) ? null : new v11(vt0.a(i2, i));
        int i3 = bundle.getInt("appWidgetMaxHeight", 0);
        int i4 = bundle.getInt("appWidgetMinWidth", 0);
        if (i3 != 0 && i4 != 0) {
            v11Var = new v11(vt0.a(i4, i3));
        }
        return dq.b1(new v11[]{v11Var2, v11Var});
    }

    public static final hx1 w() {
        hx1 hx1Var = a;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.CheckCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep r = r7.r(12.0f, 2.0f);
        r.q(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        r.D(4.48f, 10.0f, 10.0f, 10.0f);
        r.D(10.0f, -4.48f, 10.0f, -10.0f);
        r.C(17.52f, 2.0f, 12.0f, 2.0f);
        r.p();
        r.z(10.0f, 17.0f);
        r.y(-5.0f, -5.0f);
        r.y(1.41f, -1.41f);
        r.x(10.0f, 14.17f);
        r.y(7.59f, -7.59f);
        r.x(19.0f, 8.0f);
        r.y(-9.0f, 9.0f);
        r.p();
        gx1.a(gx1Var, (ArrayList) r.J, rt4Var);
        hx1 b2 = gx1Var.b();
        a = b2;
        return b2;
    }

    public static long x(Context context, int i) {
        return qb.i(context.getResources().getColor(i, context.getTheme()));
    }

    public static final hx1 y() {
        hx1 hx1Var = c;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.Delete", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep r = r7.r(6.0f, 19.0f);
        r.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        r.v(8.0f);
        r.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        r.L(7.0f);
        r.u(6.0f);
        r.M(12.0f);
        r.p();
        r.z(19.0f, 4.0f);
        r.v(-3.5f);
        r.y(-1.0f, -1.0f);
        r.v(-5.0f);
        r.y(-1.0f, 1.0f);
        r.u(5.0f);
        r.M(2.0f);
        r.v(14.0f);
        r.L(4.0f);
        r.p();
        gx1.a(gx1Var, (ArrayList) r.J, rt4Var);
        hx1 b2 = gx1Var.b();
        c = b2;
        return b2;
    }

    public static d5 z() {
        d5 d5Var = d5.g;
        if (d5Var != null) {
            return d5Var;
        }
        d5 d5Var2 = new d5((byte) 2);
        d5.g = d5Var2;
        return d5Var2;
    }

    public abstract void K();

    public abstract void L();

    public boolean j() {
        return false;
    }

    public void H() {
    }
}

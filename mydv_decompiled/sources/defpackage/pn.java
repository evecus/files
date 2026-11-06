package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.g;
import com.github.mytv.dv.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class pn implements ap, i94 {
    public static volatile pn e;
    public static final Object f = new Object();
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;
    public Object d;

    public pn(byte b) {
        this.a = b;
        switch (b) {
            case 4:
                this.b = new ep((byte) 4);
                this.c = new ep((byte) 4);
                this.d = new ep((byte) 4);
                break;
            case 5:
                this.b = new n43();
                break;
            case 10:
                long[] jArr = ia4.a;
                this.b = new n43();
                break;
            default:
                this.b = new ss2(16);
                long[] jArr2 = ia4.a;
                this.c = new n43();
                this.d = new o63((byte) 20);
                break;
        }
    }

    public static pn A(Context context) {
        if (e == null) {
            synchronized (f) {
                try {
                    if (e == null) {
                        e = new pn(context);
                    }
                } finally {
                }
            }
        }
        return e;
    }

    public static pn N(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new pn(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public static void S(pn pnVar, v44 v44Var, yc ycVar, Object obj) {
        uq uqVar = new uq(v44Var);
        synchronized (((o63) pnVar.d)) {
            try {
                if (obj == null) {
                    ((n43) pnVar.c).m(uqVar, new tq(null));
                } else {
                    ((ss2) pnVar.b).b(uqVar, new tq(obj));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int B() {
        if (D().a.isEmpty()) {
            return -1;
        }
        long j = ((yw2) o70.a1(D().a)).a + D().h;
        long I = I() - 1;
        if (j > I) {
            j = I;
        }
        return (int) j;
    }

    public da2 C() {
        return ((r10) this.d).I.b;
    }

    public zi3 D() {
        zi3 zi3Var = (zi3) this.c;
        if (zi3Var != null) {
            return zi3Var;
        }
        j42.g0("layoutInfo");
        throw null;
    }

    public int E() {
        if (D().a.isEmpty()) {
            return 0;
        }
        return Math.abs(((((yw2) o70.a1(D().a)).j + D().b) + D().c) - D().g);
    }

    public int F() {
        if (D().a.isEmpty()) {
            return 0;
        }
        int i = ((yw2) o70.T0(D().a)).j + (-D().f);
        return Math.abs(i <= 0 ? i : 0);
    }

    public int G(int i) {
        e60 e60Var = (e60) this.c;
        if (i < 0) {
            return -1;
        }
        int childCount = ((r14) this.b).a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int b = i - (i2 - e60Var.b(i2));
            if (b == 0) {
                while (e60Var.e(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    public long H() {
        return ((r10) this.d).I.d;
    }

    public int I() {
        return ((Number) ((ej3) this.b).invoke()).intValue();
    }

    public View J(int i) {
        return ((r14) this.b).a.getChildAt(i);
    }

    public int K() {
        return ((r14) this.b).a.getChildCount();
    }

    public void L(View view) {
        ((ArrayList) this.d).add(view);
        r14 r14Var = (r14) this.b;
        g G = RecyclerView.G(view);
        if (G != null) {
            G.onEnteredHiddenState(r14Var.a);
        }
    }

    public boolean M() {
        return !(((st4) ((ep) this.b).J).isEmpty() && ((st4) ((ep) this.d).J).isEmpty() && ((st4) ((ep) this.c).J).isEmpty());
    }

    public void O() {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            tl1 tl1Var = ((ql1) it.next()).a;
            if (tl1Var.q >= 1) {
                Iterator it2 = tl1Var.c.o().iterator();
                while (it2.hasNext()) {
                    r7.K(it2.next());
                }
            }
        }
    }

    public void P() {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            tl1 tl1Var = ((ql1) it.next()).a;
            if (tl1Var.q >= 1) {
                Iterator it2 = tl1Var.c.o().iterator();
                while (it2.hasNext()) {
                    r7.K(it2.next());
                }
            }
        }
    }

    public void Q() {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            tl1 tl1Var = ((ql1) it.next()).a;
            if (tl1Var.q >= 1) {
                Iterator it2 = tl1Var.c.o().iterator();
                while (it2.hasNext()) {
                    r7.K(it2.next());
                }
            }
        }
    }

    public void R(k1 k1Var, j34 j34Var) {
        Exception exc;
        Exception exc2;
        int i;
        int i2;
        p33 p33Var = (p33) this.b;
        int i3 = p33Var.b;
        e43 e43Var = (e43) this.c;
        e43 e43Var2 = new e43();
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = i4 + 1;
            try {
                try {
                    switch (p33Var.a(i4)) {
                        case 0:
                            k1Var.g();
                            i4 = i6;
                        case 1:
                            int i7 = i5 + 1;
                            k1Var.b(e43Var.g(i5));
                            i5 = i7;
                            i4 = i6;
                        case 2:
                            int i8 = i4 + 2;
                            i4 += 3;
                            k1Var.f(p33Var.a(i6), p33Var.a(i8));
                        case 3:
                            int i9 = i4 + 2;
                            try {
                                i = i4 + 3;
                            } catch (Exception e2) {
                                exc = e2;
                                i4 = i9;
                            }
                            try {
                                i4 += 4;
                                k1Var.d(p33Var.a(i6), p33Var.a(i9), p33Var.a(i));
                            } catch (Exception e3) {
                                exc = e3;
                                i4 = i;
                                throw new nd0(e43Var, e43Var2, p33Var, i4 - 1, exc);
                            }
                        case 4:
                            k1Var.j();
                            i4 = i6;
                        case 5:
                            i4 += 2;
                            i2 = i5 + 1;
                            k1Var.a(p33Var.a(i6), e43Var.g(i5));
                            i5 = i2;
                        case 6:
                            i4 += 2;
                            try {
                                i2 = i5 + 1;
                                k1Var.h(p33Var.a(i6), e43Var.g(i5));
                                i5 = i2;
                            } catch (Exception e4) {
                                exc2 = e4;
                                exc = exc2;
                                throw new nd0(e43Var, e43Var2, p33Var, i4 - 1, exc);
                            }
                        case 7:
                            int i10 = i5 + 1;
                            Object g = e43Var.g(i5);
                            g.getClass();
                            p70.A(2, g);
                            i5 += 2;
                            ((hn1) g).invoke(k1Var.k(), e43Var.g(i10));
                            i4 = i6;
                        case 8:
                            Object obj = k1Var.c;
                            if (obj instanceof ld0) {
                                ld0 ld0Var = (ld0) obj;
                                if (j34Var.f.k(ld0Var)) {
                                    ld0Var.d();
                                }
                            }
                            e43Var2.a(obj);
                            k1Var.c();
                            i4 = i6;
                        default:
                            i4 = i6;
                    }
                } catch (Exception e5) {
                    exc2 = e5;
                    i4 = i6;
                    exc = exc2;
                    throw new nd0(e43Var, e43Var2, p33Var, i4 - 1, exc);
                }
            } catch (Throwable th) {
                k1Var.i();
                throw th;
            }
        }
        if (i5 != e43Var.b) {
            ke0.a("Applier operation size mismatch");
        }
        e43Var.d();
        p33Var.b = 0;
        k1Var.i();
    }

    public void T() {
        ((TypedArray) this.b).recycle();
    }

    public void U(o10 o10Var) {
        ((r10) this.d).I.c = o10Var;
    }

    public void V(iu0 iu0Var) {
        ((r10) this.d).I.a = iu0Var;
    }

    public void W(da2 da2Var) {
        ((r10) this.d).I.b = da2Var;
    }

    public void X(long j) {
        ((r10) this.d).I.d = j;
    }

    public void Y(View view) {
        if (((ArrayList) this.d).remove(view)) {
            r14 r14Var = (r14) this.b;
            g G = RecyclerView.G(view);
            if (G != null) {
                G.onLeftHiddenState(r14Var.a);
            }
        }
    }

    public void Z() {
        n43 n43Var = (n43) this.b;
        String str = (String) this.c;
        List list = (List) n43Var.k(str);
        if (list != null) {
            list.remove((rm1) this.d);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        n43Var.m(str, list);
    }

    @Override // defpackage.ap
    public void a(int i, Object obj) {
        p33 p33Var = (p33) this.b;
        p33Var.c(5);
        p33Var.c(i);
        ((e43) this.c).a(obj);
    }

    @Override // defpackage.ap
    public void b(Object obj) {
        ((p33) this.b).c(1);
        ((e43) this.c).a(obj);
    }

    @Override // defpackage.ap
    public void c() {
        ((p33) this.b).c(8);
    }

    @Override // defpackage.ap
    public void d(int i, int i2, int i3) {
        p33 p33Var = (p33) this.b;
        p33Var.c(3);
        p33Var.c(i);
        p33Var.c(i2);
        p33Var.c(i3);
    }

    @Override // defpackage.ap
    public void e(Object obj, hn1 hn1Var) {
        ((p33) this.b).c(7);
        e43 e43Var = (e43) this.c;
        e43Var.a(hn1Var);
        e43Var.a(obj);
    }

    @Override // defpackage.ap
    public void f(int i, int i2) {
        p33 p33Var = (p33) this.b;
        p33Var.c(2);
        p33Var.c(i);
        p33Var.c(i2);
    }

    @Override // defpackage.ap
    public void g() {
        ((p33) this.b).c(0);
    }

    @Override // defpackage.ap
    public void h(int i, Object obj) {
        p33 p33Var = (p33) this.b;
        p33Var.c(6);
        p33Var.c(i);
        ((e43) this.c).a(obj);
    }

    public void j(wa2 wa2Var, a52 a52Var) {
        ep epVar = (ep) this.b;
        ep epVar2 = (ep) this.c;
        ep epVar3 = (ep) this.d;
        int ordinal = a52Var.ordinal();
        if (ordinal == 0) {
            epVar.m(wa2Var);
            epVar3.m(wa2Var);
            return;
        }
        if (ordinal == 1) {
            epVar2.m(wa2Var);
            epVar3.m(wa2Var);
            return;
        }
        if (ordinal == 2) {
            if (wa2Var.P != null) {
                epVar3.m(wa2Var);
                return;
            } else {
                epVar.m(wa2Var);
                return;
            }
        }
        if (ordinal != 3) {
            s83.v();
        } else if (wa2Var.P != null) {
            epVar3.m(wa2Var);
        } else {
            epVar2.m(wa2Var);
        }
    }

    public void k(View view, int i, boolean z) {
        RecyclerView recyclerView = ((r14) this.b).a;
        int childCount = i < 0 ? recyclerView.getChildCount() : G(i);
        ((e60) this.c).f(childCount, z);
        if (z) {
            L(view);
        }
        recyclerView.addView(view, childCount);
        g G = RecyclerView.G(view);
        c cVar = recyclerView.U;
        if (cVar == null || G == null) {
            return;
        }
        cVar.onViewAttachedToWindow(G);
    }

    public void l(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = ((r14) this.b).a;
        int childCount = i < 0 ? recyclerView.getChildCount() : G(i);
        ((e60) this.c).f(childCount, z);
        if (z) {
            L(view);
        }
        g G = RecyclerView.G(view);
        if (G != null) {
            if (!G.isTmpDetached() && !G.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(G);
                zy.j(sb, recyclerView.w());
                return;
            }
            G.clearTmpDetachFlag();
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public boolean m(wa2 wa2Var) {
        return !(wa2Var.P == null) && (((st4) ((ep) this.b).J).contains(wa2Var) || ((st4) ((ep) this.c).J).contains(wa2Var));
    }

    public void n(int i) {
        g G;
        int G2 = G(i);
        ((e60) this.c).g(G2);
        RecyclerView recyclerView = ((r14) this.b).a;
        View childAt = recyclerView.getChildAt(G2);
        if (childAt != null && (G = RecyclerView.G(childAt)) != null) {
            if (G.isTmpDetached() && !G.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                sb.append(G);
                zy.j(sb, recyclerView.w());
                return;
            }
            G.addFlags(256);
        }
        recyclerView.detachViewFromParent(G2);
    }

    public void o(Bundle bundle) {
        HashSet hashSet = (HashSet) this.c;
        String string = ((Context) this.d).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (j02.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    p((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new vb0(e2);
            }
        }
    }

    public Object p(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.b;
        if (ui4.m()) {
            try {
                Trace.beginSection(ui4.s(cls.getSimpleName()));
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                j02 j02Var = (j02) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> dependencies = j02Var.dependencies();
                if (!dependencies.isEmpty()) {
                    for (Class cls2 : dependencies) {
                        if (!hashMap.containsKey(cls2)) {
                            p(cls2, hashSet);
                        }
                    }
                }
                obj = j02Var.create((Context) this.d);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th) {
                throw new vb0(th);
            }
        }
        return obj;
    }

    public o10 q() {
        return ((r10) this.d).I.c;
    }

    public View r(int i) {
        return ((r14) this.b).a.getChildAt(G(i));
    }

    public int s() {
        return ((r14) this.b).a.getChildCount() - ((ArrayList) this.d).size();
    }

    public ColorStateList t(int i) {
        int resourceId;
        ColorStateList b;
        TypedArray typedArray = (TypedArray) this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (b = z9.b((Context) this.d, resourceId)) == null) ? typedArray.getColorStateList(i) : b;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return ((e60) this.c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            case 8:
                String str = (String) this.d;
                String str2 = (String) this.c;
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.b;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public iu0 u() {
        return ((r10) this.d).I.a;
    }

    public Drawable v(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : j42.C((Context) this.d, resourceId);
    }

    public Drawable w(int i) {
        int resourceId;
        Drawable g;
        if (!((TypedArray) this.b).hasValue(i) || (resourceId = ((TypedArray) this.b).getResourceId(i, 0)) == 0) {
            return null;
        }
        nl a = nl.a();
        Context context = (Context) this.d;
        synchronized (a) {
            g = a.a.g(context, resourceId, true);
        }
        return g;
    }

    public int x() {
        if (D().a.isEmpty()) {
            return -1;
        }
        long j = ((yw2) o70.T0(D().a)).a - D().h;
        if (j < 0) {
            j = 0;
        }
        return (int) j;
    }

    public Typeface y(int i, int i2, lm lmVar) {
        int resourceId = ((TypedArray) this.b).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        TypedValue typedValue = (TypedValue) this.c;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.c = typedValue;
        }
        TypedValue typedValue2 = typedValue;
        Context context = (Context) this.d;
        ThreadLocal threadLocal = d54.a;
        if (context.isRestricted()) {
            return null;
        }
        return d54.b(context, resourceId, typedValue2, i2, lmVar, true);
    }

    public boolean z() {
        return !D().a.isEmpty();
    }

    @Override // defpackage.ap
    public void i() {
    }

    public pn(r14 r14Var) {
        this.a = (byte) 3;
        this.b = r14Var;
        this.c = new e60((byte) 0);
        this.d = new ArrayList();
    }

    public pn(View view) {
        this.a = (byte) 6;
        this.b = view;
        this.c = ut0.K(dh2.J, new eq(this, (byte) 12));
        this.d = new ep(view);
    }

    public pn(ej3 ej3Var) {
        this.a = (byte) 9;
        this.b = ej3Var;
    }

    public pn(Context context, TypedArray typedArray) {
        this.a = (byte) 13;
        this.d = context;
        this.b = typedArray;
    }

    public pn(r10 r10Var) {
        this.a = (byte) 2;
        this.d = r10Var;
        this.b = new ep((Object) this, (byte) 2);
    }

    public pn(Runnable runnable) {
        this.a = (byte) 7;
        this.d = new CopyOnWriteArrayList();
        this.b = new HashMap();
        this.c = runnable;
    }

    public pn(Context context) {
        this.a = (byte) 0;
        this.d = context.getApplicationContext();
        this.c = new HashSet();
        this.b = new HashMap();
    }

    public /* synthetic */ pn(Object obj, String str, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = str;
        this.d = obj2;
    }

    public pn(Object obj) {
        this.a = (byte) 11;
        this.b = new p33();
        this.c = new e43();
        this.d = obj;
    }
}

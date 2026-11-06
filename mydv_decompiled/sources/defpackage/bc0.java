package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class bc0 implements oe3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nk b;

    public /* synthetic */ bc0(nk nkVar, byte b) {
        this.a = b;
        this.b = nkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oe3
    public final void a(ic0 ic0Var) {
        Bundle bundle;
        Bundle bundle2;
        byte b = this.a;
        nk nkVar = this.b;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (b) {
            case 0:
                ic0Var.getClass();
                Bundle f = ((da) nkVar.L.K).f("android:support:activity-result");
                if (f != null) {
                    gc0 gc0Var = nkVar.P;
                    LinkedHashMap linkedHashMap = gc0Var.b;
                    LinkedHashMap linkedHashMap2 = gc0Var.a;
                    Bundle bundle3 = gc0Var.g;
                    ArrayList<Integer> integerArrayList = f.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = f.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = f.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        gc0Var.d.addAll(stringArrayList2);
                    }
                    Bundle bundle4 = f.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    if (bundle4 != null) {
                        bundle3.putAll(bundle4);
                    }
                    int size = stringArrayList.size();
                    for (int i = 0; i < size; i++) {
                        String str = stringArrayList.get(i);
                        if (linkedHashMap.containsKey(str)) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (!bundle3.containsKey(str)) {
                                p70.x(linkedHashMap2).remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i);
                        num2.getClass();
                        int intValue = num2.intValue();
                        String str2 = stringArrayList.get(i);
                        str2.getClass();
                        String str3 = str2;
                        linkedHashMap2.put(Integer.valueOf(intValue), str3);
                        gc0Var.b.put(str3, Integer.valueOf(intValue));
                    }
                    return;
                }
                return;
            default:
                ll1 ll1Var = (ll1) nkVar.c0.J;
                nk nkVar2 = ll1Var.L;
                tl1 tl1Var = ll1Var.K;
                ts0 ts0Var = tl1Var.c;
                if (tl1Var.r != null) {
                    zy.i("Already attached");
                    return;
                }
                tl1Var.r = ll1Var;
                tl1Var.s = ll1Var;
                tl1Var.k.add(ll1Var);
                je3 b2 = nkVar2.b();
                tl1Var.f = b2;
                b2.a(ll1Var, tl1Var.g);
                vr5 f2 = nkVar2.f();
                ul0 ul0Var = ul0.b;
                ul0Var.getClass();
                ts0 ts0Var2 = new ts0(f2, wl1.f, ul0Var);
                k60 a = s24.a(wl1.class);
                String b3 = a.b();
                if (b3 == null) {
                    s83.t("Local and anonymous classes can not be ViewModels");
                    return;
                }
                wl1 wl1Var = (wl1) ts0Var2.p(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b3));
                tl1Var.E = wl1Var;
                ts0Var.M = wl1Var;
                HashMap hashMap = (HashMap) ts0Var.K;
                HashMap hashMap2 = (HashMap) ts0Var.L;
                ll1 ll1Var2 = tl1Var.r;
                byte b4 = 2;
                byte b5 = 1;
                if (ll1Var2 != null) {
                    da g = ll1Var2.g();
                    g.s("android:support:fragments", new ey0(tl1Var, b5));
                    Bundle f3 = g.f("android:support:fragments");
                    if (f3 != null) {
                        for (String str4 : f3.keySet()) {
                            if (str4.startsWith("result_") && (bundle2 = f3.getBundle(str4)) != null) {
                                bundle2.setClassLoader(tl1Var.r.I.getClassLoader());
                                tl1Var.j.put(str4.substring(7), bundle2);
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        for (String str5 : f3.keySet()) {
                            if (str5.startsWith("fragment_") && (bundle = f3.getBundle(str5)) != null) {
                                bundle.setClassLoader(tl1Var.r.I.getClassLoader());
                                arrayList.add((xl1) bundle.getParcelable("state"));
                            }
                        }
                        hashMap2.clear();
                        int size2 = arrayList.size();
                        int i2 = 0;
                        while (i2 < size2) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            xl1 xl1Var = (xl1) obj;
                            hashMap2.put(xl1Var.J, xl1Var);
                        }
                        ul1 ul1Var = (ul1) f3.getParcelable("state");
                        if (ul1Var != null) {
                            hashMap.clear();
                            ArrayList arrayList2 = ul1Var.I;
                            int size3 = arrayList2.size();
                            int i3 = 0;
                            while (i3 < size3) {
                                Object obj2 = arrayList2.get(i3);
                                i3++;
                                xl1 xl1Var2 = (xl1) hashMap2.remove((String) obj2);
                                if (xl1Var2 != null) {
                                    r7.K(tl1Var.E.b.get(xl1Var2.J));
                                    ClassLoader classLoader = tl1Var.r.I.getClassLoader();
                                    tl1Var.t.a(xl1Var2.I);
                                    Bundle bundle5 = xl1Var2.R;
                                    if (bundle5 == null) {
                                        throw null;
                                    }
                                    bundle5.setClassLoader(classLoader);
                                    throw null;
                                }
                            }
                            wl1 wl1Var2 = tl1Var.E;
                            wl1Var2.getClass();
                            Iterator it = new ArrayList(wl1Var2.b.values()).iterator();
                            if (it.hasNext()) {
                                r7.K(it.next());
                                throw null;
                            }
                            ArrayList arrayList3 = ul1Var.J;
                            ((ArrayList) ts0Var.J).clear();
                            if (arrayList3 != null) {
                                Iterator it2 = arrayList3.iterator();
                                if (it2.hasNext()) {
                                    String str6 = (String) it2.next();
                                    r7.K(hashMap.get(str6));
                                    zy.i(r7.C("No instantiated fragment for (", str6, ")"));
                                    return;
                                }
                            }
                            if (ul1Var.K != null) {
                                tl1Var.d = new ArrayList(ul1Var.K.length);
                                int i4 = 0;
                                while (true) {
                                    nt[] ntVarArr = ul1Var.K;
                                    if (i4 < ntVarArr.length) {
                                        mt a2 = ntVarArr[i4].a(tl1Var);
                                        if (tl1.h(2)) {
                                            StringBuilder C = hf1.C("restoreAllState: back stack #", i4, " (index ");
                                            C.append(a2.q);
                                            C.append("): ");
                                            C.append(a2);
                                            Log.v("FragmentManager", C.toString());
                                            PrintWriter printWriter = new PrintWriter(new er2());
                                            a2.c("  ", printWriter, false);
                                            printWriter.close();
                                        }
                                        tl1Var.d.add(a2);
                                        i4++;
                                    }
                                }
                            } else {
                                tl1Var.d = null;
                            }
                            tl1Var.h.set(ul1Var.L);
                            String str7 = ul1Var.M;
                            if (str7 != null) {
                                r7.K(((HashMap) ts0Var.K).get(str7));
                            }
                            ArrayList arrayList4 = ul1Var.N;
                            if (arrayList4 != null) {
                                for (int i5 = 0; i5 < arrayList4.size(); i5++) {
                                    tl1Var.i.put((String) arrayList4.get(i5), (ot) ul1Var.O.get(i5));
                                }
                            }
                            tl1Var.x = new ArrayDeque(ul1Var.P);
                        }
                    }
                }
                ll1 ll1Var3 = tl1Var.r;
                if (ll1Var3 != null) {
                    gc0 gc0Var2 = ll1Var3.L.P;
                    tl1Var.u = gc0Var2.c("FragmentManager:StartActivityForResult", new o7(b5), new pl1(tl1Var, b5));
                    tl1Var.v = gc0Var2.c("FragmentManager:StartIntentSenderForResult", new o7(b4), new pl1(tl1Var, b4));
                    tl1Var.w = gc0Var2.c("FragmentManager:RequestPermissions", new o7(objArr2 == true ? 1 : 0), new pl1(tl1Var, objArr == true ? 1 : 0));
                }
                ll1 ll1Var4 = tl1Var.r;
                if (ll1Var4 != null) {
                    ll1Var4.i(tl1Var.l);
                }
                ll1 ll1Var5 = tl1Var.r;
                if (ll1Var5 != null) {
                    ol1 ol1Var = tl1Var.m;
                    nk nkVar3 = ll1Var5.L;
                    ol1Var.getClass();
                    nkVar3.R.add(ol1Var);
                }
                ll1 ll1Var6 = tl1Var.r;
                if (ll1Var6 != null) {
                    ol1 ol1Var2 = tl1Var.n;
                    nk nkVar4 = ll1Var6.L;
                    ol1Var2.getClass();
                    nkVar4.T.add(ol1Var2);
                }
                ll1 ll1Var7 = tl1Var.r;
                if (ll1Var7 != null) {
                    ol1 ol1Var3 = tl1Var.o;
                    nk nkVar5 = ll1Var7.L;
                    ol1Var3.getClass();
                    nkVar5.U.add(ol1Var3);
                }
                ll1 ll1Var8 = tl1Var.r;
                if (ll1Var8 != null) {
                    ql1 ql1Var = tl1Var.p;
                    nk nkVar6 = ll1Var8.L;
                    ql1Var.getClass();
                    pn pnVar = nkVar6.K;
                    ((CopyOnWriteArrayList) pnVar.d).add(ql1Var);
                    ((Runnable) pnVar.c).run();
                    return;
                }
                return;
        }
    }
}

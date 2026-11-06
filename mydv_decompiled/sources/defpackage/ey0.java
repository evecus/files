package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class ey0 implements u94 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ey0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.u94
    public final Bundle a() {
        nt[] ntVarArr;
        ArrayList arrayList;
        int size;
        uj3[] uj3VarArr;
        byte b = this.a;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                Map d = ((k94) obj).d();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : d.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
            case 1:
                tl1 tl1Var = (tl1) obj;
                Bundle bundle2 = new Bundle();
                Iterator it = tl1Var.b().iterator();
                while (it.hasNext()) {
                    ((eu4) it.next()).getClass();
                }
                Iterator it2 = tl1Var.b().iterator();
                while (it2.hasNext()) {
                    ((eu4) it2.next()).a();
                }
                tl1Var.e(true);
                tl1Var.y = true;
                tl1Var.E.getClass();
                ts0 ts0Var = tl1Var.c;
                ts0Var.getClass();
                HashMap hashMap = (HashMap) ts0Var.K;
                ArrayList arrayList2 = new ArrayList(hashMap.size());
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    r7.K(it3.next());
                }
                ts0 ts0Var2 = tl1Var.c;
                ts0Var2.getClass();
                ArrayList arrayList3 = new ArrayList(((HashMap) ts0Var2.L).values());
                if (!arrayList3.isEmpty()) {
                    ts0 ts0Var3 = tl1Var.c;
                    synchronized (((ArrayList) ts0Var3.J)) {
                        try {
                            ntVarArr = null;
                            if (((ArrayList) ts0Var3.J).isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = new ArrayList(((ArrayList) ts0Var3.J).size());
                                Iterator it4 = ((ArrayList) ts0Var3.J).iterator();
                                if (it4.hasNext()) {
                                    r7.K(it4.next());
                                    throw null;
                                }
                            }
                        } finally {
                        }
                    }
                    ArrayList arrayList4 = tl1Var.d;
                    if (arrayList4 != null && (size = arrayList4.size()) > 0) {
                        ntVarArr = new nt[size];
                        for (int i2 = 0; i2 < size; i2++) {
                            ntVarArr[i2] = new nt((mt) tl1Var.d.get(i2));
                            if (tl1.h(2)) {
                                StringBuilder C = hf1.C("saveAllState: adding back stack #", i2, ": ");
                                C.append(tl1Var.d.get(i2));
                                Log.v("FragmentManager", C.toString());
                            }
                        }
                    }
                    ul1 ul1Var = new ul1();
                    ul1Var.I = arrayList2;
                    ul1Var.J = arrayList;
                    ul1Var.K = ntVarArr;
                    ul1Var.L = tl1Var.h.get();
                    ul1Var.N.addAll(tl1Var.i.keySet());
                    ul1Var.O.addAll(tl1Var.i.values());
                    ul1Var.P = new ArrayList(tl1Var.x);
                    bundle2.putParcelable("state", ul1Var);
                    for (String str2 : tl1Var.j.keySet()) {
                        bundle2.putBundle(hf1.w("result_", str2), (Bundle) tl1Var.j.get(str2));
                    }
                    int size2 = arrayList3.size();
                    while (i < size2) {
                        Object obj2 = arrayList3.get(i);
                        i++;
                        xl1 xl1Var = (xl1) obj2;
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("state", xl1Var);
                        bundle2.putBundle("fragment_" + xl1Var.J, bundle3);
                    }
                } else if (tl1.h(2)) {
                    Log.v("FragmentManager", "saveAllState: no fragments!");
                }
                return bundle2;
            default:
                ns nsVar = (ns) obj;
                for (Map.Entry entry2 : sv2.X((LinkedHashMap) nsVar.d).entrySet()) {
                    nsVar.d(((fw4) ((w43) entry2.getValue())).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : sv2.X((LinkedHashMap) nsVar.b).entrySet()) {
                    nsVar.d(((u94) entry3.getValue()).a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) nsVar.a;
                if (linkedHashMap.isEmpty()) {
                    uj3VarArr = new uj3[0];
                } else {
                    ArrayList arrayList5 = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                        arrayList5.add(new uj3((String) entry4.getKey(), entry4.getValue()));
                    }
                    uj3VarArr = (uj3[]) arrayList5.toArray(new uj3[0]);
                }
                return i42.b0((uj3[]) Arrays.copyOf(uj3VarArr, uj3VarArr.length));
        }
    }
}

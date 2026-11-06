package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.logging.Level;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class d63 implements bs1 {
    public final /* synthetic */ byte I;
    public final ArrayList J;

    public d63(zw zwVar) {
        s93 s93Var;
        this.I = (byte) 4;
        zwVar.getClass();
        nv nvVar = new nv((pg0) zwVar.b, (byte) 0);
        nv nvVar2 = new nv((ov) zwVar.c, (byte) 1);
        nv nvVar3 = new nv((pg0) zwVar.e, (byte) 4);
        pg0 pg0Var = (pg0) zwVar.d;
        nv nvVar4 = new nv(pg0Var, (byte) 2);
        nv nvVar5 = new nv(pg0Var, (byte) 3);
        q93 q93Var = new q93(pg0Var);
        p93 p93Var = new p93(pg0Var);
        if (Build.VERSION.SDK_INT >= 28) {
            Context context = (Context) zwVar.a;
            String str = fx5.a;
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            s93Var = new s93((ConnectivityManager) systemService);
        } else {
            s93Var = null;
        }
        this.J = dq.b1(new og0[]{nvVar, nvVar2, nvVar3, nvVar4, nvVar5, q93Var, p93Var, s93Var});
    }

    public void a(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z = obj instanceof Object[];
        ArrayList arrayList = this.J;
        if (z) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    @Override // defpackage.bs1
    public Object b(Object obj) {
        switch (this.I) {
        }
        return Integer.valueOf(((tn5) obj).a());
    }

    public void c() {
        ArrayList arrayList = this.J;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (obj != null) {
                zl1.c();
                return;
            } else {
                try {
                    throw null;
                } catch (Exception e) {
                    k63.e.log(Level.WARNING, "could not delete file ", (Throwable) e);
                }
            }
        }
        arrayList.clear();
    }

    public zf1 d(ky5 ky5Var) {
        ky5Var.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.J;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            if (((og0) obj).c(ky5Var)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(p70.J(arrayList, 10));
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            arrayList3.add(((og0) obj2).b(ky5Var.j));
        }
        return o7.p(new xg0((zf1[]) o70.r1(arrayList3).toArray(new zf1[0]), (byte) 4));
    }

    @Override // defpackage.bs1
    public Iterator l() {
        byte b = this.I;
        ArrayList arrayList = this.J;
        switch (b) {
        }
        return arrayList.iterator();
    }

    public /* synthetic */ d63(ArrayList arrayList, byte b) {
        this.I = b;
        this.J = arrayList;
    }

    public d63(byte b) {
        this.I = b;
        switch (b) {
            case 3:
                this.J = new ArrayList(2);
                break;
            default:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.J = new ArrayList();
                break;
        }
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class ee3 {
    public boolean b;
    public final ArrayList a = new ArrayList();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    public ee3(boolean z) {
        this.b = z;
    }

    public abstract void b();

    public final void e() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            hf1.E((AutoCloseable) it.next());
        }
        copyOnWriteArrayList.clear();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((de3) obj).e();
        }
        arrayList.clear();
    }

    public final void f(boolean z) {
        this.b = z;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            de3 de3Var = (de3) obj;
            de3Var.f(de3Var.e && z);
        }
    }

    public void a() {
    }

    public void c(gt gtVar) {
    }

    public void d(gt gtVar) {
    }
}

package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class oa5 implements Iterator, w72 {
    public final ArrayList I;
    public Iterator J;

    public oa5(Iterator it) {
        it.getClass();
        this.I = new ArrayList();
        this.J = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.J.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.J.next();
        View view = (View) next;
        view.getClass();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        v2 v2Var = viewGroup != null ? new v2(viewGroup, (byte) 4) : null;
        ArrayList arrayList = this.I;
        if (v2Var != null && v2Var.hasNext()) {
            arrayList.add(this.J);
            this.J = v2Var;
            return next;
        }
        while (!this.J.hasNext() && !arrayList.isEmpty()) {
            this.J = (Iterator) o70.a1(arrayList);
            u70.L0(arrayList);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

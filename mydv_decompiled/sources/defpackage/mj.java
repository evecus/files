package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class mj implements Appendable {
    public final StringBuilder I;
    public final ArrayList J;
    public final ArrayList K;

    public mj() {
        this.I = new StringBuilder(16);
        this.J = new ArrayList();
        this.K = new ArrayList();
        new ArrayList();
    }

    public final void a(oj ojVar) {
        StringBuilder sb = this.I;
        int length = sb.length();
        sb.append(ojVar.J);
        List list = ojVar.I;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                nj njVar = (nj) list.get(i);
                Object obj = njVar.a;
                this.K.add(new lj(njVar.d, njVar.b + length, njVar.c + length, obj));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof oj) {
            a((oj) charSequence);
            return this;
        }
        this.I.append(charSequence);
        return this;
    }

    public final void b(CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof oj;
        StringBuilder sb = this.I;
        if (!z) {
            sb.append(charSequence, i, i2);
            return;
        }
        oj ojVar = (oj) charSequence;
        int length = sb.length();
        sb.append((CharSequence) ojVar.J, i, i2);
        List b = pj.b(ojVar, i, i2, null);
        if (b != null) {
            int size = b.size();
            for (int i3 = 0; i3 < size; i3++) {
                nj njVar = (nj) b.get(i3);
                Object obj = njVar.a;
                this.K.add(new lj(njVar.d, njVar.b + length, njVar.c + length, obj));
            }
        }
    }

    public final void c(tm1 tm1Var) {
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            nj njVar = (nj) tm1Var.invoke(((lj) arrayList.get(i)).a(Integer.MIN_VALUE));
            Object obj = njVar.a;
            arrayList.set(i, new lj(njVar.d, njVar.b, njVar.c, obj));
        }
    }

    public final void d() {
        ArrayList arrayList = this.J;
        if (arrayList.isEmpty()) {
            r02.c("Nothing to pop.");
        }
        ((lj) arrayList.remove(arrayList.size() - 1)).c = this.I.length();
    }

    public final void e(int i) {
        ArrayList arrayList = this.J;
        if (i >= arrayList.size()) {
            r02.c(i + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i) {
            d();
        }
    }

    public final oj f() {
        StringBuilder sb = this.I;
        String sb2 = sb.toString();
        ArrayList arrayList = this.K;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((lj) arrayList.get(i)).a(sb.length()));
        }
        return new oj(sb2, arrayList2);
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        b(charSequence, i, i2);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.I.append(c);
        return this;
    }

    public mj(oj ojVar) {
        this();
        a(ojVar);
    }
}

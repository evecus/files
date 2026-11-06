package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ls3 {
    public final List a;
    public final List[] b;
    public int c;
    public int d;
    public boolean e;
    public final /* synthetic */ ms3 f;

    public ls3(ms3 ms3Var, List list) {
        this.f = ms3Var;
        this.a = list;
        this.b = new List[list.size()];
        if (list.isEmpty()) {
            t02.a("NestedPrefetchController shouldn't be created with no states");
        }
    }

    public final int a() {
        List list = this.a;
        int size = list.size();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.min(i, ((bf2) list.get(i2)).e);
        }
        if (i == Integer.MAX_VALUE) {
            return 0;
        }
        return i;
    }

    public final int b() {
        List list = this.a;
        int size = list.size();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.min(i, ((bf2) list.get(i2)).f);
        }
        if (i == Integer.MAX_VALUE) {
            return 0;
        }
        return i;
    }

    public final boolean c(re reVar, int i, boolean z) {
        List list;
        List[] listArr = this.b;
        int i2 = this.c;
        List list2 = this.a;
        if (i2 >= list2.size()) {
            return false;
        }
        if (this.f.h) {
            t02.c("Should not execute nested prefetch on canceled request");
        }
        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
        try {
            int size = list2.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((bf2) list2.get(i3)).d = i;
            }
            Trace.endSection();
            Trace.beginSection("compose:lazy:prefetch:nested");
            while (this.c < list2.size()) {
                try {
                    if (listArr[this.c] == null) {
                        if (reVar.a() <= 0) {
                            return true;
                        }
                        int i4 = this.c;
                        bf2 bf2Var = (bf2) list2.get(i4);
                        tm1 tm1Var = bf2Var.a;
                        if (tm1Var == null) {
                            list = o91.I;
                        } else {
                            ze2 ze2Var = new ze2(bf2Var, bf2Var.d);
                            tm1Var.invoke(ze2Var);
                            ArrayList arrayList = ze2Var.b;
                            bf2Var.f = arrayList.size();
                            list = arrayList;
                        }
                        listArr[i4] = list;
                    }
                    List list3 = listArr[this.c];
                    list3.getClass();
                    while (this.d < list3.size()) {
                        ms3 ms3Var = (ms3) list3.get(this.d);
                        if (z) {
                            ms3 ms3Var2 = ms3Var != null ? ms3Var : null;
                            if (ms3Var2 != null) {
                                ms3Var2.m = true;
                            }
                        }
                        this.e = true;
                        if (ms3Var.c(reVar)) {
                            return true;
                        }
                        this.d++;
                    }
                    this.d = 0;
                    this.c++;
                } finally {
                }
            }
            return false;
        } finally {
        }
    }

    public final boolean d() {
        return this.e;
    }

    public final void e() {
        this.e = false;
    }
}

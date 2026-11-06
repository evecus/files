package coil3.util;

import defpackage.hn1;
import defpackage.tm1;
import defpackage.u70;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class CollectionsKt {
    /* renamed from: component1-wuMLFU8, reason: not valid java name */
    public static final int m118component1wuMLFU8(long j) {
        return IntPair.m125getFirstimpl(j);
    }

    /* renamed from: component2-wuMLFU8, reason: not valid java name */
    public static final int m119component2wuMLFU8(long j) {
        return IntPair.m126getSecondimpl(j);
    }

    public static final <R, T> T firstNotNullOfOrNullIndices(List<? extends R> list, tm1 tm1Var) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = (T) tm1Var.invoke(list.get(i));
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    public static final <T, R> List<R> flatMapIndices(List<? extends T> list, tm1 tm1Var) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            u70.I0(arrayList, (Iterable) tm1Var.invoke(list.get(i)));
        }
        return arrayList;
    }

    public static final <T, R> R foldIndices(List<? extends T> list, R r, hn1 hn1Var) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            r = (R) hn1Var.invoke(r, list.get(i));
        }
        return r;
    }

    public static final <T> void forEachIndexedIndices(List<? extends T> list, hn1 hn1Var) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            hn1Var.invoke(Integer.valueOf(i), list.get(i));
        }
    }

    public static final <T> void forEachIndices(List<? extends T> list, tm1 tm1Var) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            tm1Var.invoke(list.get(i));
        }
    }

    public static final <T, R> List<R> mapNotNullIndices(List<? extends T> list, tm1 tm1Var) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object invoke = tm1Var.invoke(list.get(i));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    public static final <T> void removeIfIndices(List<T> list, tm1 tm1Var) {
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = i2 - i;
            if (((Boolean) tm1Var.invoke(list.get(i3))).booleanValue()) {
                list.remove(i3);
                i++;
            }
        }
    }
}

package androidx.media3.common.util;

import android.os.Bundle;
import android.util.SparseArray;
import defpackage.c34;
import defpackage.dy1;
import defpackage.iy1;
import defpackage.pn1;
import defpackage.zx1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class BundleCollectionUtil {
    private BundleCollectionUtil() {
    }

    public static HashMap<String, String> bundleToStringHashMap(Bundle bundle) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (bundle != Bundle.EMPTY) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    hashMap.put(str, string);
                }
            }
        }
        return hashMap;
    }

    public static iy1 bundleToStringImmutableMap(Bundle bundle) {
        return bundle == Bundle.EMPTY ? c34.O : iy1.a(bundleToStringHashMap(bundle));
    }

    public static void ensureClassLoader(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) Util.castNonNull(BundleCollectionUtil.class.getClassLoader()));
        }
    }

    public static <T> dy1 fromBundleList(pn1 pn1Var, List<Bundle> list) {
        zx1 n = dy1.n();
        for (int i = 0; i < list.size(); i++) {
            Bundle bundle = list.get(i);
            bundle.getClass();
            n.c(pn1Var.apply(bundle));
        }
        return n.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> SparseArray<T> fromBundleSparseArray(pn1 pn1Var, SparseArray<Bundle> sparseArray) {
        SparseArray<T> sparseArray2 = (SparseArray<T>) new SparseArray(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), pn1Var.apply(sparseArray.valueAt(i)));
        }
        return sparseArray2;
    }

    public static Bundle getBundleWithDefault(Bundle bundle, String str, Bundle bundle2) {
        Bundle bundle3 = bundle.getBundle(str);
        return bundle3 != null ? bundle3 : bundle2;
    }

    public static ArrayList<Integer> getIntegerArrayListWithDefault(Bundle bundle, String str, ArrayList<Integer> arrayList) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(str);
        return integerArrayList != null ? integerArrayList : arrayList;
    }

    public static Bundle stringMapToBundle(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public static <T> ArrayList<Bundle> toBundleArrayList(Collection<T> collection, pn1 pn1Var) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) pn1Var.apply(it.next()));
        }
        return arrayList;
    }

    public static <T> dy1 toBundleList(List<T> list, pn1 pn1Var) {
        zx1 n = dy1.n();
        for (int i = 0; i < list.size(); i++) {
            n.c((Bundle) pn1Var.apply(list.get(i)));
        }
        return n.f();
    }

    public static <T> SparseArray<Bundle> toBundleSparseArray(SparseArray<T> sparseArray, pn1 pn1Var) {
        SparseArray<Bundle> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), (Bundle) pn1Var.apply(sparseArray.valueAt(i)));
        }
        return sparseArray2;
    }
}

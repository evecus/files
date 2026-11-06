package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class o70 extends u70 {
    public static ArrayList N0(Iterable iterable, int i) {
        iterable.getClass();
        hc4.j(i, i);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator h0 = hc4.h0(iterable.iterator(), i, i);
            while (h0.hasNext()) {
                arrayList.add((List) h0.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i) + (size % i == 0 ? 0 : 1));
        int i2 = 0;
        while (i2 >= 0 && i2 < size) {
            int i3 = size - i2;
            if (i <= i3) {
                i3 = i;
            }
            ArrayList arrayList3 = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList3.add(list.get(i4 + i2));
            }
            arrayList2.add(arrayList3);
            i2 += i;
        }
        return arrayList2;
    }

    public static boolean O0(Iterable iterable, Object obj) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : W0(iterable, obj) >= 0;
    }

    public static List P0(Iterable iterable) {
        LinkedHashSet linkedHashSet;
        iterable.getClass();
        if (iterable instanceof Collection) {
            linkedHashSet = new LinkedHashSet((Collection) iterable);
        } else {
            linkedHashSet = new LinkedHashSet();
            n1(iterable, linkedHashSet);
        }
        return r1(linkedHashSet);
    }

    public static List Q0(Iterable iterable, int i) {
        ArrayList arrayList;
        Object obj;
        iterable.getClass();
        if (i < 0) {
            s83.h(r7.z("Requested element count ", i, " is less than zero."));
            return null;
        }
        if (i == 0) {
            return r1(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return o91.I;
            }
            if (size == 1) {
                if (iterable instanceof List) {
                    obj = a1((List) iterable);
                } else {
                    Iterator it = iterable.iterator();
                    if (!it.hasNext()) {
                        s83.l("Collection is empty.");
                        return null;
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                    obj = next;
                }
                return p70.j0(obj);
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj2 : iterable) {
            if (i2 >= i) {
                arrayList.add(obj2);
            } else {
                i2++;
            }
        }
        return p70.o0(arrayList);
    }

    public static List R0(List list) {
        list.getClass();
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return l1(list, size);
    }

    public static Object S0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return T0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        s83.l("Collection is empty.");
        return null;
    }

    public static Object T0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        s83.l("List is empty.");
        return null;
    }

    public static Object U0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object V0(int i, List list) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static int W0(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                p70.A0();
                throw null;
            }
            if (j42.c(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void X0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, tm1 tm1Var) {
        iterable.getClass();
        sb.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            } else {
                qi4.a(sb, obj, tm1Var);
            }
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void Y0(List list, StringBuilder sb, v1 v1Var, int i) {
        if ((i & 64) != 0) {
            v1Var = null;
        }
        X0(list, sb, "\n", "", "", -1, "...", v1Var);
    }

    public static String Z0(Iterable iterable, String str, String str2, String str3, int i, tm1 tm1Var, int i2) {
        if ((i2 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i2 & 2) != 0 ? "" : str2;
        String str6 = (i2 & 4) != 0 ? "" : str3;
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            tm1Var = null;
        }
        iterable.getClass();
        str4.getClass();
        str5.getClass();
        StringBuilder sb = new StringBuilder();
        X0(iterable, sb, str4, str5, str6, i3, "...", tm1Var);
        return sb.toString();
    }

    public static Object a1(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        s83.l("List is empty.");
        return null;
    }

    public static Object b1(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable c1(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Comparable d1(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList e1(List list, Object obj) {
        list.getClass();
        ArrayList arrayList = new ArrayList(p70.J(list, 10));
        boolean z = false;
        for (Object obj2 : list) {
            boolean z2 = true;
            if (!z && j42.c(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList f1(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            u70.I0(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList g1(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List h1(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return r1(iterable);
        }
        List t1 = t1(iterable);
        Collections.reverse(t1);
        return t1;
    }

    public static Object i1(List list) {
        int size = list.size();
        if (size == 0) {
            s83.l("List is empty.");
            return null;
        }
        if (size == 1) {
            return list.get(0);
        }
        s83.t("List has more than one element.");
        return null;
    }

    public static List j1(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List t1 = t1(iterable);
            t70.G0(t1);
            return t1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return r1(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        array.getClass();
        List asList = Arrays.asList(array);
        asList.getClass();
        return asList;
    }

    public static List k1(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List t1 = t1(iterable);
            t70.H0(comparator, t1);
            return t1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return r1(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List asList = Arrays.asList(array);
        asList.getClass();
        return asList;
    }

    public static List l1(Iterable iterable, int i) {
        iterable.getClass();
        if (i < 0) {
            s83.h(r7.z("Requested element count ", i, " is less than zero."));
            return null;
        }
        if (i == 0) {
            return o91.I;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return r1(iterable);
            }
            if (i == 1) {
                return p70.j0(S0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return p70.o0(arrayList);
    }

    public static List m1(int i, List list) {
        list.getClass();
        if (i < 0) {
            s83.h(r7.z("Requested element count ", i, " is less than zero."));
            return null;
        }
        if (i == 0) {
            return o91.I;
        }
        int size = list.size();
        if (i >= size) {
            return r1(list);
        }
        if (i == 1) {
            return p70.j0(a1(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static final void n1(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static float[] o1(Collection collection) {
        collection.getClass();
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static HashSet p1(ArrayList arrayList) {
        HashSet hashSet = new HashSet(sv2.J(p70.J(arrayList, 12)));
        n1(arrayList, hashSet);
        return hashSet;
    }

    public static int[] q1(List list) {
        list.getClass();
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List r1(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return p70.o0(t1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return o91.I;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return p70.j0(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList s1(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final List t1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        n1(iterable, arrayList);
        return arrayList;
    }

    public static Set u1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(sv2.J(collection.size()));
                    n1(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                Set singleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                singleton.getClass();
                return singleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            n1(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set singleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                singleton2.getClass();
                return singleton2;
            }
        }
        return t91.I;
    }
}

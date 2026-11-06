package j$.util;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public interface List<E> extends Collection<E> {

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* renamed from: j$.util.List$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$replaceAll(java.util.List list, UnaryOperator unaryOperator) {
            Objects.requireNonNull(unaryOperator);
            ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                listIterator.set(unaryOperator.apply(listIterator.next()));
            }
        }

        public static void $default$sort(java.util.List list, java.util.Comparator comparator) {
            Object[] array = list.toArray();
            Arrays.sort(array, comparator);
            ListIterator<E> listIterator = list.listIterator();
            for (Object obj : array) {
                listIterator.next();
                listIterator.set(obj);
            }
        }

        public static Spliterator $default$spliterator(java.util.List list) {
            return list instanceof RandomAccess ? new a(list) : Spliterators.spliterator(list, 16);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* renamed from: j$.util.List$-EL, reason: invalid class name */
    public final /* synthetic */ class EL {
        public static /* synthetic */ void sort(java.util.List list, java.util.Comparator comparator) {
            if (list instanceof List) {
                ((List) list).sort(comparator);
            } else {
                CC.$default$sort(list, comparator);
            }
        }
    }

    void replaceAll(UnaryOperator<E> unaryOperator);

    void sort(java.util.Comparator<? super E> comparator);

    @Override // j$.util.Collection
    Spliterator<E> spliterator();
}

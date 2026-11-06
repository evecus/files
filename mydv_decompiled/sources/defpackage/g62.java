package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class g62 {
    public final String a;

    public g62(String str) {
        str.getClass();
        this.a = str;
    }

    public static g62 d() {
        return new g62(", ");
    }

    public static g62 e() {
        return new g62(String.valueOf(','));
    }

    public static CharSequence f(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final void a(StringBuilder sb, Iterable iterable) {
        b(sb, iterable.iterator());
    }

    public final void b(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(f(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.a);
                    sb.append(f(it.next()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final String c(List list) {
        Iterator it = list.iterator();
        StringBuilder sb = new StringBuilder();
        b(sb, it);
        return sb.toString();
    }
}

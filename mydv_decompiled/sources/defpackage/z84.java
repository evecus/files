package defpackage;

import java.util.Iterator;
import java.util.WeakHashMap;
import okhttp3.internal.url._UrlKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class z84 implements Iterable {
    public final WeakHashMap I = new WeakHashMap();

    public final y84 c() {
        y84 y84Var = new y84();
        y84Var.M = true;
        this.I.put(y84Var, Boolean.FALSE);
        return y84Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z84)) {
            return false;
        }
        iterator();
        ((z84) obj).iterator();
        return true;
    }

    public final int hashCode() {
        iterator();
        return 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        x84 x84Var = new x84();
        this.I.put(x84Var, Boolean.FALSE);
        return x84Var;
    }

    public final String toString() {
        iterator();
        return _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
    }
}

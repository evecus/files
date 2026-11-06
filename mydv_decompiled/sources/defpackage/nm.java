package defpackage;

import android.graphics.Typeface;
import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class nm {
    public final Typeface a;
    public final String b;
    public final int c;

    public nm(Typeface typeface, String str, int i) {
        this.a = typeface;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nm)) {
            return false;
        }
        nm nmVar = (nm) obj;
        return this.c == nmVar.c && Objects.equals(this.a, nmVar.a) && Objects.equals(this.b, nmVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c));
    }
}

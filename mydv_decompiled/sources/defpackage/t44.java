package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class t44 implements i80 {
    public final int a;

    public t44(int i) {
        this.a = i;
    }

    @Override // defpackage.i80
    public final long a(Context context) {
        return qb.i(context.getColor(this.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t44) && this.a == ((t44) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return hf1.y(new StringBuilder("ResourceColorProvider(resId="), this.a, ')');
    }
}

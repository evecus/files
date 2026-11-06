package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class bj4 {
    public final String a;
    public final hn1 b;
    public final boolean c;

    public /* synthetic */ bj4(String str) {
        this(str, new yi4((byte) 15));
    }

    public final String toString() {
        return hf1.w("AccessibilityKey: ", this.a);
    }

    public bj4(String str, hn1 hn1Var) {
        this.a = str;
        this.b = hn1Var;
    }

    public bj4(String str, int i) {
        this(str);
        this.c = true;
    }

    public bj4(String str, boolean z, hn1 hn1Var) {
        this(str, hn1Var);
        this.c = z;
    }
}

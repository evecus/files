package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class dx4 implements kj {
    public final String a;

    public /* synthetic */ dx4(String str) {
        this.a = str;
    }

    public static final /* synthetic */ dx4 a(String str) {
        return new dx4(str);
    }

    public final /* synthetic */ String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dx4) {
            return this.a.equals(((dx4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return r7.C("StringAnnotation(value=", this.a, ")");
    }
}

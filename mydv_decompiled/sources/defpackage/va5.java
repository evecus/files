package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class va5 extends ta5 {
    public final /* synthetic */ byte L;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.L) {
            case 0:
                int i = this.K;
                this.K = i + 2;
                return this.I[i];
            default:
                int i2 = this.K;
                this.K = i2 + 2;
                return this.I[i2 + 1];
        }
    }
}

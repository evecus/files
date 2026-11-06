package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class az4 extends mn4 implements dw4 {
    @Override // defpackage.dw4
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.P;
            objArr.getClass();
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.Q + ((int) ((n() + this.S) - this.Q))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void u(int i) {
        synchronized (this) {
            Object[] objArr = this.P;
            objArr.getClass();
            b(Integer.valueOf(((Number) objArr[((int) ((this.Q + ((int) ((n() + this.S) - this.Q))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}

package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ua5 extends ta5 {
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.K;
        this.K = i + 2;
        Object[] objArr = this.I;
        return new cv2(objArr[i], objArr[i + 1]);
    }
}

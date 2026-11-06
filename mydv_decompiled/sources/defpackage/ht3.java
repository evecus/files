package defpackage;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class ht3 extends m70 {
    public final gt3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht3(KSerializer kSerializer) {
        super(kSerializer);
        kSerializer.getClass();
        this.b = new gt3(kSerializer.getDescriptor());
    }

    @Override // defpackage.x1
    public final Object a() {
        return (ft3) g(j());
    }

    @Override // defpackage.x1
    public final int b(Object obj) {
        ft3 ft3Var = (ft3) obj;
        ft3Var.getClass();
        return ft3Var.d();
    }

    @Override // defpackage.x1
    public final Iterator c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // defpackage.x1, kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return e(decoder);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    @Override // defpackage.x1
    public final Object h(Object obj) {
        ft3 ft3Var = (ft3) obj;
        ft3Var.getClass();
        return ft3Var.a();
    }

    @Override // defpackage.m70
    public final void i(int i, Object obj, Object obj2) {
        ((ft3) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public Object j() {
        return new boolean[0];
    }

    public void k(me0 me0Var, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        me0Var.getClass();
        zArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((ax4) me0Var).t(this.b, i2, zArr[i2]);
        }
    }

    @Override // defpackage.m70, kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        int d = d(obj);
        gt3 gt3Var = this.b;
        me0 s = ((ax4) encoder).s(gt3Var);
        k(s, obj, d);
        s.a(gt3Var);
    }
}

package defpackage;

import java.util.Arrays;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ab1 implements KSerializer {
    public final Enum[] a;
    public final u05 b;

    public ab1(String str, Enum[] enumArr) {
        enumArr.getClass();
        this.a = enumArr;
        this.b = new u05(new ka(this, str, (byte) 15));
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        int g = decoder.g(getDescriptor());
        Enum[] enumArr = this.a;
        if (g >= 0 && g < enumArr.length) {
            return enumArr[g];
        }
        throw new zj4(g + " is not among valid " + getDescriptor().a() + " enum values, values size is " + enumArr.length);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.b.getValue();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Enum r5 = (Enum) obj;
        r5.getClass();
        Enum[] enumArr = this.a;
        int f1 = dq.f1(enumArr, r5);
        if (f1 != -1) {
            encoder.l(getDescriptor(), f1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r5);
        String a = getDescriptor().a();
        String arrays = Arrays.toString(enumArr);
        arrays.getClass();
        sb.append(" is not a valid enum ");
        sb.append(a);
        sb.append(", must be one of ");
        sb.append(arrays);
        throw new zj4(sb.toString());
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().a() + '>';
    }
}

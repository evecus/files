package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class w41 implements KSerializer {
    public static final w41 a = new w41();
    public static final lt3 b = new lt3("kotlin.time.Duration", it3.l);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        jp jpVar = t41.J;
        String p = decoder.p();
        p.getClass();
        try {
            long b0 = sp0.b0(p);
            if (b0 == t41.M) {
                throw new IllegalStateException("invariant failed");
            }
            return new t41(b0);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(r7.C("Invalid ISO duration string format: '", p, "'."), e);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        long j = ((t41) obj).I;
        jp jpVar = t41.J;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long j2 = j < 0 ? t41.j(j) : j;
        long h = t41.h(j2, x41.HOURS);
        boolean z = false;
        int h2 = t41.f(j2) ? 0 : (int) (t41.h(j2, x41.MINUTES) % 60);
        int h3 = t41.f(j2) ? 0 : (int) (t41.h(j2, x41.SECONDS) % 60);
        int e = t41.e(j2);
        if (t41.f(j)) {
            h = 9999999999999L;
        }
        boolean z2 = h != 0;
        boolean z3 = (h3 == 0 && e == 0) ? false : true;
        if (h2 != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(h);
            sb.append('H');
        }
        if (z) {
            sb.append(h2);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            t41.b(sb, h3, e, 9, "S", true);
        }
        encoder.r(sb.toString());
    }
}

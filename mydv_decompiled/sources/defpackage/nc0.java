package defpackage;

import coil3.decode.Decoder;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class nc0 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Decoder.Factory J;

    public /* synthetic */ nc0(Decoder.Factory factory, byte b) {
        this.I = b;
        this.J = factory;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        List j0;
        List j02;
        byte b = this.I;
        Decoder.Factory factory = this.J;
        switch (b) {
            case 0:
                j0 = p70.j0(factory);
                return j0;
            default:
                j02 = p70.j0(factory);
                return j02;
        }
    }
}

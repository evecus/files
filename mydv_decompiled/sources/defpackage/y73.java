package defpackage;

import androidx.media3.exoplayer.RendererCapabilities;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class y73 implements jn1 {
    public final /* synthetic */ jh4 I;
    public final /* synthetic */ p63 J;
    public final /* synthetic */ g94 K;
    public final /* synthetic */ t43 L;
    public final /* synthetic */ cw4 M;

    public y73(jh4 jh4Var, p63 p63Var, h94 h94Var, t43 t43Var, cw4 cw4Var) {
        this.I = jh4Var;
        this.J = p63Var;
        this.K = h94Var;
        this.L = t43Var;
        this.M = cw4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    @Override // defpackage.jn1
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        p63 p63Var;
        th thVar = (th) obj;
        p63 p63Var2 = (p63) obj2;
        fe0 fe0Var = (fe0) obj3;
        ((Number) obj4).intValue();
        boolean c = j42.c(this.I.c.getValue(), this.J);
        if (!((Boolean) this.L.getValue()).booleanValue() && !c) {
            List list = (List) this.M.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    p63Var = 0;
                    break;
                }
                p63Var = listIterator.previous();
                if (j42.c(p63Var2, (p63) p63Var)) {
                    break;
                }
            }
            p63Var2 = p63Var;
        }
        go1 go1Var = (go1) fe0Var;
        if (p63Var2 == null) {
            go1Var.d0(105930796);
        } else {
            go1Var.d0(-1520603531);
            rt0.c(p63Var2, this.K, p70.u0(-1263531443, new s63(p63Var2, thVar, (byte) 1), go1Var), go1Var, RendererCapabilities.DECODER_SUPPORT_MASK);
        }
        go1Var.q(false);
        return wd5.a;
    }
}

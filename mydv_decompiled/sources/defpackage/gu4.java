package defpackage;

import androidx.media3.common.util.Log;
import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gu4 implements Iterator {
    public String J;
    public final CharSequence K;
    public final u50 L;
    public final /* synthetic */ byte O;
    public final /* synthetic */ hu4 P;
    public int I = 2;
    public int M = 0;
    public int N = Log.LOG_LEVEL_OFF;

    public gu4(hu4 hu4Var, iu4 iu4Var, CharSequence charSequence, byte b) {
        this.O = b;
        this.P = hu4Var;
        this.L = iu4Var.a;
        this.K = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        r3 = r3 + 1;
     */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean hasNext() {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gu4.hasNext():boolean");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            zy.k();
            return null;
        }
        this.I = 2;
        String str = this.J;
        this.J = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

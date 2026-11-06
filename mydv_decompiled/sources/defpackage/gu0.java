package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gu0 implements oj4 {
    public final CharSequence a;
    public final int b;
    public final hn1 c;

    public gu0(CharSequence charSequence, int i, hn1 hn1Var) {
        charSequence.getClass();
        this.a = charSequence;
        this.b = i;
        this.c = hn1Var;
    }

    @Override // defpackage.oj4
    public final Iterator iterator() {
        return new fu0(this);
    }
}

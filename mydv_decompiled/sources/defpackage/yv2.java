package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class yv2 extends w1 {
    public final /* synthetic */ zv2 I;

    public yv2(zv2 zv2Var) {
        this.I = zv2Var;
    }

    @Override // defpackage.w1
    public final int c() {
        return this.I.a.groupCount() + 1;
    }

    @Override // defpackage.w1, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof wv2) {
            return super.contains((wv2) obj);
        }
        return false;
    }

    public final wv2 d(int i) {
        Matcher matcher = this.I.a;
        u22 c0 = ut0.c0(matcher.start(i), matcher.end(i));
        if (c0.I < 0) {
            return null;
        }
        String group = matcher.group(i);
        group.getClass();
        return new wv2(group, c0);
    }

    @Override // defpackage.w1, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new v95(new ep1(new v70(p70.S(this), (byte) 0), new tf2(this, (byte) 9)));
    }
}

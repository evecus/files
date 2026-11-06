package defpackage;

import androidx.recyclerview.widget.g;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zr0 {
    public g a;
    public g b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public zr0(g gVar, g gVar2, int i, int i2, int i3, int i4) {
        this.a = gVar;
        this.b = gVar2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
        sb.append(this.a);
        sb.append(", newHolder=");
        sb.append(this.b);
        sb.append(", fromX=");
        sb.append(this.c);
        sb.append(", fromY=");
        sb.append(this.d);
        sb.append(", toX=");
        sb.append(this.e);
        sb.append(", toY=");
        return hf1.y(sb, this.f, '}');
    }
}

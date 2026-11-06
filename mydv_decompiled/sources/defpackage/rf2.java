package defpackage;

import androidx.media3.common.util.Log;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class rf2 extends d1 {
    public final pf2 c;
    public final pe2 d;
    public final long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ pe2 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ tv j;
    public final /* synthetic */ uv k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ long n;
    public final /* synthetic */ ag2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf2(long j, boolean z, pf2 pf2Var, pe2 pe2Var, int i, int i2, tv tvVar, uv uvVar, int i3, int i4, long j2, ag2 ag2Var) {
        super((byte) 3);
        this.f = z;
        this.g = pe2Var;
        this.h = i;
        this.i = i2;
        this.j = tvVar;
        this.k = uvVar;
        this.l = i3;
        this.m = i4;
        this.n = j2;
        this.o = ag2Var;
        this.c = pf2Var;
        this.d = pe2Var;
        this.e = eh0.b(0, z ? dh0.h(j) : Integer.MAX_VALUE, 0, z ? Log.LOG_LEVEL_OFF : dh0.g(j), 5);
    }

    public final vf2 o(int i, long j) {
        pf2 pf2Var = this.c;
        Object c = pf2Var.c(i);
        Object u = pf2Var.b.u(i);
        return new vf2(i, l(this.d, i, j), this.f, this.j, this.k, this.g.J.getLayoutDirection(), this.l, this.m, i == this.h + (-1) ? 0 : this.i, this.n, c, u, this.o.o, j);
    }
}

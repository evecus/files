package defpackage;

import androidx.media3.common.util.Log;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class p35 {
    public final oj a;
    public final m65 b;
    public final boolean e;
    public final iu0 g;
    public final kj1 h;
    public final List i;
    public zw j;
    public da2 k;
    public final int c = Log.LOG_LEVEL_OFF;
    public final boolean d = true;
    public final boolean f = true;

    public p35(oj ojVar, iu0 iu0Var, kj1 kj1Var, m65 m65Var, List list, boolean z) {
        this.a = ojVar;
        this.b = m65Var;
        this.e = z;
        this.g = iu0Var;
        this.h = kj1Var;
        this.i = list;
    }

    public final void a(da2 da2Var) {
        zw zwVar = this.j;
        if (zwVar == null || da2Var != this.k || zwVar.a()) {
            this.k = da2Var;
            zwVar = new zw(this.a, this.g, this.h, ad4.z(this.b, da2Var), this.i, this.e);
        }
        this.j = zwVar;
    }
}

package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class r63 {
    public final p63 a;
    public final i73 b;
    public final Bundle c;
    public ki2 d;
    public final b73 e;
    public final String f;
    public final Bundle g;
    public final da h;
    public boolean i;
    public final xi2 j;
    public ki2 k;
    public final x94 l;
    public final u05 m;

    public r63(p63 p63Var) {
        this.a = p63Var;
        this.b = p63Var.J;
        this.c = p63Var.K;
        this.d = p63Var.L;
        this.e = p63Var.M;
        this.f = p63Var.N;
        this.g = p63Var.O;
        this.h = new da(new v94(p63Var, new q94(p63Var, (byte) 1)));
        u05 u05Var = new u05(new gw2((byte) 4));
        this.j = new xi2(p63Var, true);
        this.k = ki2.J;
        this.l = (x94) u05Var.getValue();
        this.m = new u05(new gw2((byte) 5));
    }

    public final Bundle a() {
        Bundle bundle = this.c;
        if (bundle == null) {
            return null;
        }
        Bundle b0 = i42.b0((uj3[]) Arrays.copyOf(new uj3[0], 0));
        b0.putAll(bundle);
        return b0;
    }

    public final void b() {
        if (!this.i) {
            da daVar = this.h;
            ((v94) daVar.J).a();
            this.i = true;
            if (this.e != null) {
                qb.E(this.a);
            }
            daVar.p(this.g);
        }
        int ordinal = this.d.ordinal();
        int ordinal2 = this.k.ordinal();
        xi2 xi2Var = this.j;
        if (ordinal >= ordinal2) {
            ki2 ki2Var = this.k;
            xi2Var.d("setCurrentState");
            xi2Var.f(ki2Var);
        } else {
            ki2 ki2Var2 = this.d;
            ki2Var2.getClass();
            xi2Var.d("setCurrentState");
            xi2Var.f(ki2Var2);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(s24.a(p63.class).c());
        sb.append("(" + this.f + ')');
        sb.append(" destination=");
        sb.append(this.b);
        return sb.toString();
    }
}

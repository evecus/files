package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class u92 {
    public boolean a;
    public final Object b;
    public Object c;
    public Object d;

    public u92() {
        this.b = new Object();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = true;
    }

    public boolean a() {
        boolean z;
        synchronized (this.b) {
            z = this.a;
        }
        return z;
    }

    public u92(le2 le2Var, vy4 vy4Var, ns3 ns3Var) {
        this.b = le2Var;
        this.c = vy4Var;
        this.d = ns3Var;
        this.a = true;
    }
}

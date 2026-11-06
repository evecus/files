package defpackage;

import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ts0 implements mt4, ai5 {
    public final /* synthetic */ byte I;
    public Object J;
    public Object K;
    public Object L;
    public Object M;

    public ts0(sr srVar) {
        this.I = (byte) 2;
        this.J = srVar;
        this.K = new o83();
        new LinkedHashSet();
        this.L = new LinkedHashSet();
        this.M = new LinkedHashSet();
    }

    public static void b(ts0 ts0Var, l83 l83Var) {
        ts0Var.getClass();
        l83Var.getClass();
        if (((LinkedHashSet) ts0Var.L).add(l83Var)) {
            o83 o83Var = (o83) ts0Var.K;
            if (l83Var.c != null) {
                s83.j(l83Var, "' is already registered with a dispatcher", "Handler '");
                return;
            }
            o83Var.e.addFirst(l83Var);
            l83Var.c = ts0Var;
            o83Var.b();
        }
    }

    @Override // defpackage.xh5
    public boolean a() {
        return false;
    }

    public void c(n83 n83Var) {
        if (((LinkedHashSet) this.M).add(n83Var)) {
            ((o83) this.K).a(this, n83Var, -1);
        }
    }

    @Override // defpackage.mt4
    public void cancel() {
        ((Socket) this.J).close();
    }

    @Override // defpackage.xh5
    public hj d(long j, hj hjVar, hj hjVar2, hj hjVar3) {
        hj hjVar4 = (hj) this.L;
        if (hjVar4 == null) {
            hjVar4 = hjVar3.c();
            this.L = hjVar4;
        }
        int b = hjVar4.b();
        int i = 0;
        while (true) {
            hj hjVar5 = (hj) this.L;
            if (i >= b) {
                if (hjVar5 != null) {
                    return hjVar5;
                }
                j42.g0("velocityVector");
                throw null;
            }
            if (hjVar5 == null) {
                j42.g0("velocityVector");
                throw null;
            }
            long j2 = j;
            hjVar5.e(((ij) this.J).get(i).b(j2, hjVar.a(i), hjVar2.a(i), hjVar3.a(i)), i);
            i++;
            j = j2;
        }
    }

    public void e(ce3 ce3Var, int i) {
        if (i != 1 && i != 0) {
            s83.h(hf1.u(i, "Unsupported priority value: "));
        } else if (((LinkedHashSet) this.M).add(ce3Var)) {
            ((o83) this.K).a(this, ce3Var, i);
        }
    }

    public void g(n83 n83Var, j83 j83Var) {
        o83 o83Var = (o83) this.K;
        if (o83Var.g != 0) {
            return;
        }
        l83 c = o83Var.c(-1);
        o83Var.f = c;
        o83Var.g = -1;
        o83Var.h = n83Var;
        if (j83Var != null) {
            if (c != null) {
                c.d(j83Var);
            }
            o83Var.a.i(null, new q83(j83Var));
        }
    }

    @Override // defpackage.mt4
    public eq4 getSink() {
        return (rs0) this.M;
    }

    @Override // defpackage.mt4
    public ut4 getSource() {
        return (ss0) this.L;
    }

    @Override // defpackage.xh5
    public hj i(long j, hj hjVar, hj hjVar2, hj hjVar3) {
        hj hjVar4 = (hj) this.K;
        if (hjVar4 == null) {
            hjVar4 = hjVar.c();
            this.K = hjVar4;
        }
        int b = hjVar4.b();
        int i = 0;
        while (true) {
            hj hjVar5 = (hj) this.K;
            if (i >= b) {
                if (hjVar5 != null) {
                    return hjVar5;
                }
                j42.g0("valueVector");
                throw null;
            }
            if (hjVar5 == null) {
                j42.g0("valueVector");
                throw null;
            }
            long j2 = j;
            hjVar5.e(((ij) this.J).get(i).e(j2, hjVar.a(i), hjVar2.a(i), hjVar3.a(i)), i);
            i++;
            j = j2;
        }
    }

    @Override // defpackage.xh5
    public hj j(hj hjVar, hj hjVar2, hj hjVar3) {
        hj hjVar4 = (hj) this.M;
        if (hjVar4 == null) {
            hjVar4 = hjVar3.c();
            this.M = hjVar4;
        }
        int b = hjVar4.b();
        int i = 0;
        while (true) {
            hj hjVar5 = (hj) this.M;
            if (i >= b) {
                if (hjVar5 != null) {
                    return hjVar5;
                }
                j42.g0("endVelocityVector");
                throw null;
            }
            if (hjVar5 == null) {
                j42.g0("endVelocityVector");
                throw null;
            }
            hjVar5.e(((ij) this.J).get(i).d(hjVar.a(i), hjVar2.a(i), hjVar3.a(i)), i);
            i++;
        }
    }

    @Override // defpackage.xh5
    public long k(hj hjVar, hj hjVar2, hj hjVar3) {
        int b = hjVar.b();
        long j = 0;
        for (int i = 0; i < b; i++) {
            j = Math.max(j, ((ij) this.J).get(i).c(hjVar.a(i), hjVar2.a(i), hjVar3.a(i)));
        }
        return j;
    }

    public void l(kp3 kp3Var, boolean z) {
        aq3 aq3Var = (aq3) this.M;
        List list = kp3Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((rp3) list.get(i)).l()) {
                q(kp3Var);
                return;
            }
        }
        na3 na3Var = (na3) this.J;
        if (na3Var == null) {
            zy.i("layoutCoordinates not set");
            return;
        }
        dq2.Q0(kp3Var, na3Var.M(0L), new ap3((Object) this, (Object) aq3Var, (byte) 1));
        if (((yp3) this.K) == yp3.J) {
            if (z) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((rp3) list.get(i2)).a();
                }
            }
            s32 s32Var = kp3Var.b;
            if (s32Var != null) {
                s32Var.c = !aq3Var.c;
            }
        }
    }

    public void m() {
        Iterator it = ((HashMap) this.K).values().iterator();
        while (it.hasNext()) {
            r7.K(it.next());
        }
    }

    public ArrayList n() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((HashMap) this.K).values().iterator();
        while (it.hasNext()) {
            r7.K(it.next());
        }
        return arrayList;
    }

    public List o() {
        ArrayList arrayList;
        if (((ArrayList) this.J).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.J)) {
            arrayList = new ArrayList((ArrayList) this.J);
        }
        return arrayList;
    }

    public qr5 p(k60 k60Var, String str) {
        qr5 qr5Var;
        qr5 a;
        synchronized (((o63) this.M)) {
            try {
                qr5Var = (qr5) ((vr5) this.J).a.get(str);
                if (k60Var.d(qr5Var)) {
                    ur5 ur5Var = (ur5) this.K;
                    if (ur5Var instanceof x94) {
                        x94 x94Var = (x94) ur5Var;
                        qr5Var.getClass();
                        li2 li2Var = x94Var.d;
                        if (li2Var != null) {
                            da daVar = x94Var.e;
                            daVar.getClass();
                            sp0.k(qr5Var, daVar, li2Var);
                        }
                    }
                    qr5Var.getClass();
                } else {
                    l33 l33Var = new l33((vl0) this.L);
                    l33Var.a.put(i42.q, str);
                    ur5 ur5Var2 = (ur5) this.K;
                    try {
                        try {
                            a = ur5Var2.c(k60Var, l33Var);
                        } catch (AbstractMethodError unused) {
                            a = ur5Var2.a(sv2.B(k60Var));
                        }
                    } catch (AbstractMethodError unused2) {
                        a = ur5Var2.b(sv2.B(k60Var), l33Var);
                    }
                    qr5Var = a;
                    vr5 vr5Var = (vr5) this.J;
                    vr5Var.getClass();
                    qr5Var.getClass();
                    qr5 qr5Var2 = (qr5) vr5Var.a.put(str, qr5Var);
                    if (qr5Var2 != null) {
                        qr5Var2.m();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qr5Var;
    }

    public void q(kp3 kp3Var) {
        if (((yp3) this.K) == yp3.J) {
            na3 na3Var = (na3) this.J;
            if (na3Var == null) {
                zy.i("layoutCoordinates not set");
                return;
            }
            dq2.O0(kp3Var, na3Var.M(0L), new zp3((aq3) this.M, (byte) 1));
        }
        this.K = yp3.K;
    }

    public String toString() {
        switch (this.I) {
            case 0:
                String socket = ((Socket) this.J).toString();
                socket.getClass();
                return socket;
            default:
                return super.toString();
        }
    }

    public ts0(vr5 vr5Var, ur5 ur5Var, vl0 vl0Var) {
        this.I = (byte) 5;
        vr5Var.getClass();
        vl0Var.getClass();
        this.J = vr5Var;
        this.K = ur5Var;
        this.L = vl0Var;
        this.M = new o63((byte) 17);
    }

    public ts0(Socket socket) {
        this.I = (byte) 0;
        this.J = socket;
        this.K = new AtomicInteger();
        this.L = new ss0(this);
        this.M = new rs0(this);
    }

    public ts0(aq3 aq3Var) {
        this.I = (byte) 3;
        this.M = aq3Var;
        this.K = yp3.I;
    }

    public ts0() {
        this.I = (byte) 1;
        this.J = new ArrayList();
        this.K = new HashMap();
        this.L = new HashMap();
    }

    public ts0(ij ijVar) {
        this.I = (byte) 4;
        this.J = ijVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ts0(nf1 nf1Var) {
        this(new ep((Object) nf1Var, (byte) 28));
        this.I = (byte) 4;
    }
}

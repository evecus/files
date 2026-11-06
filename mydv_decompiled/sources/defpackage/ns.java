package defpackage;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ns {
    public final Object a;
    public Serializable b;
    public final Serializable c;
    public Object d;
    public Object e;

    public ns(Map map) {
        map.getClass();
        this.a = new LinkedHashMap(map);
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new ey0(this, (byte) 2);
    }

    public l10 a(ms msVar, rm1 rm1Var) {
        int i;
        int i2;
        p24 p24Var = new p24();
        p24Var.I = -1;
        synchronized (this.a) {
            Throwable th = (Throwable) this.b;
            if (th != null) {
                msVar.b(th);
                return k04.O;
            }
            xq xqVar = (xq) this.c;
            do {
                i = xqVar.get();
                i2 = i + 1;
            } while (!xqVar.compareAndSet(i, i2));
            boolean z = true;
            byte b = 0;
            if ((134217727 & i2) != 1) {
                z = false;
            }
            p24Var.I = (i2 >>> 27) & 15;
            ((e43) this.d).a(msVar);
            if (z) {
                try {
                    rm1Var.invoke();
                } catch (Throwable th2) {
                    b(th2);
                }
            }
            return new da(new ls(msVar, this, p24Var, b));
        }
    }

    public void b(Throwable th) {
        int i;
        synchronized (this.a) {
            try {
                if (((Throwable) this.b) != null) {
                    return;
                }
                this.b = th;
                e43 e43Var = (e43) this.d;
                Object[] objArr = e43Var.a;
                int i2 = e43Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((ms) objArr[i3]).b(th);
                }
                ((e43) this.d).d();
                xq xqVar = (xq) this.c;
                do {
                    i = xqVar.get();
                } while (!xqVar.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(tm1 tm1Var) {
        int i;
        synchronized (this.a) {
            try {
                e43 e43Var = (e43) this.d;
                this.d = (e43) this.e;
                this.e = e43Var;
                xq xqVar = (xq) this.c;
                do {
                    i = xqVar.get();
                } while (!xqVar.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = e43Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    tm1Var.invoke(e43Var.g(i3));
                }
                e43Var.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.a).put(str, obj);
        w43 w43Var = (w43) ((LinkedHashMap) this.c).get(str);
        if (w43Var != null) {
            ((fw4) w43Var).h(obj);
        }
        w43 w43Var2 = (w43) ((LinkedHashMap) this.d).get(str);
        if (w43Var2 != null) {
            ((fw4) w43Var2).h(obj);
        }
    }

    public ns() {
        this.a = new Object();
        this.c = new xq(0);
        this.d = new e43();
        this.e = new e43();
    }
}

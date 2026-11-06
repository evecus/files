package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class e60 {
    public final /* synthetic */ byte a;
    public long b;
    public Object c;

    public e60(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = DesugarCollections.synchronizedList(new ArrayList());
                break;
            default:
                this.b = 0L;
                break;
        }
    }

    public void a(int i) {
        if (i < 64) {
            this.b &= ~(1 << i);
            return;
        }
        e60 e60Var = (e60) this.c;
        if (e60Var != null) {
            e60Var.a(i - 64);
        }
    }

    public int b(int i) {
        e60 e60Var = (e60) this.c;
        if (e60Var == null) {
            long j = this.b;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.b);
        }
        return Long.bitCount(this.b) + e60Var.b(i - 64);
    }

    public void c() {
        if (((e60) this.c) == null) {
            this.c = new e60((byte) 0);
        }
    }

    public void d(a63 a63Var) {
        this.b++;
        Thread thread = new Thread(a63Var);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.b + ")");
        ((List) this.c).add(a63Var);
        thread.start();
    }

    public boolean e(int i) {
        if (i < 64) {
            return ((1 << i) & this.b) != 0;
        }
        c();
        return ((e60) this.c).e(i - 64);
    }

    public void f(int i, boolean z) {
        if (i >= 64) {
            c();
            ((e60) this.c).f(i - 64, z);
            return;
        }
        long j = this.b;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.b = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            i(i);
        } else {
            a(i);
        }
        if (z2 || ((e60) this.c) != null) {
            c();
            ((e60) this.c).f(0, z2);
        }
    }

    public boolean g(int i) {
        if (i >= 64) {
            c();
            return ((e60) this.c).g(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        e60 e60Var = (e60) this.c;
        if (e60Var != null) {
            if (e60Var.e(0)) {
                i(63);
            }
            ((e60) this.c).g(0);
        }
        return z;
    }

    public void h() {
        this.b = 0L;
        e60 e60Var = (e60) this.c;
        if (e60Var != null) {
            e60Var.h();
        }
    }

    public void i(int i) {
        if (i < 64) {
            this.b |= 1 << i;
        } else {
            c();
            ((e60) this.c).i(i - 64);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (((e60) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((e60) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }
}

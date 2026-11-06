package defpackage;

import android.content.IntentSender;
import java.lang.reflect.Array;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class yz implements ap {
    public final /* synthetic */ byte a = 0;
    public int b;
    public int c;
    public final Object d;

    public yz(q0 q0Var, int i) {
        this.d = q0Var;
        this.b = i;
        int floor = ((int) Math.floor((31 - Integer.numberOfLeadingZeros(r0 * 15)) / (31 - Integer.numberOfLeadingZeros(16)))) + 1 + ((int) Math.ceil((i * 8) / (31 - Integer.numberOfLeadingZeros(16))));
        this.c = floor;
        String b = zw0.b(q0Var);
        if (((ns5) ns5.c.get(d1.d(i, floor, b))) != null) {
            return;
        }
        s83.t("cannot find OID for digest algorithm: ".concat(b));
        throw null;
    }

    @Override // defpackage.ap
    public void a(int i, Object obj) {
        ((ap) this.d).a(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // defpackage.ap
    public void b(Object obj) {
        this.c++;
        ((ap) this.d).b(obj);
    }

    @Override // defpackage.ap
    public void c() {
        ((ap) this.d).c();
    }

    @Override // defpackage.ap
    public void d(int i, int i2, int i3) {
        int i4 = this.c == 0 ? this.b : 0;
        ((ap) this.d).d(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.ap
    public void e(Object obj, hn1 hn1Var) {
        ((ap) this.d).e(obj, hn1Var);
    }

    @Override // defpackage.ap
    public void f(int i, int i2) {
        ((ap) this.d).f(i + (this.c == 0 ? this.b : 0), i2);
    }

    @Override // defpackage.ap
    public void g() {
        if (this.c <= 0) {
            ke0.a("OffsetApplier up called with no corresponding down");
        }
        this.c--;
        ((ap) this.d).g();
    }

    @Override // defpackage.ap
    public void h(int i, Object obj) {
        ((ap) this.d).h(i + (this.c == 0 ? this.b : 0), obj);
    }

    public b32 j() {
        return new b32((IntentSender) this.d, null, this.b, this.c);
    }

    public byte k(int i, int i2) {
        return ((byte[][]) this.d)[i2][i];
    }

    public int l() {
        return this.c;
    }

    public rm1 m() {
        return (rm1) this.d;
    }

    public int n() {
        return this.b;
    }

    public void o(int i, int i2, int i3) {
        ((byte[][]) this.d)[i2][i] = (byte) i3;
    }

    public void p(int i, int i2) {
        this.c = i;
        this.b = i2;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                int i = this.b;
                int i2 = this.c;
                StringBuilder sb = new StringBuilder((i * 2 * i2) + 2);
                for (int i3 = 0; i3 < i2; i3++) {
                    byte[] bArr = ((byte[][]) this.d)[i3];
                    for (int i4 = 0; i4 < i; i4++) {
                        byte b = bArr[i4];
                        if (b == 0) {
                            sb.append(" 0");
                        } else if (b != 1) {
                            sb.append("  ");
                        } else {
                            sb.append(" 1");
                        }
                    }
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ap
    public void i() {
    }

    public yz(int i, int i2) {
        this.d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
        this.b = i;
        this.c = i2;
    }

    public yz(IntentSender intentSender) {
        intentSender.getClass();
        this.d = intentSender;
    }

    public yz(ap apVar, int i) {
        this.d = apVar;
        this.b = i;
    }

    public yz(int i, int i2, rm1 rm1Var) {
        this.b = i;
        this.c = i2;
        this.d = rm1Var;
    }
}

package defpackage;

import androidx.media3.common.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class wr4 {
    public final tr4 a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public q33 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final a32 p;
    public final a32 q;
    public final a32 r;
    public q33 s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public p33 x;

    public wr4(tr4 tr4Var) {
        this.a = tr4Var;
        int[] iArr = tr4Var.I;
        this.b = iArr;
        Object[] objArr = tr4Var.K;
        this.c = objArr;
        this.d = tr4Var.Q;
        this.e = tr4Var.R;
        this.f = tr4Var.S;
        int i = tr4Var.J;
        this.g = i;
        this.h = (iArr.length / 5) - i;
        int i2 = tr4Var.L;
        this.k = i2;
        this.l = objArr.length - i2;
        this.m = i;
        this.p = new a32();
        this.q = new a32();
        this.r = new a32();
        this.u = i;
        this.v = -1;
    }

    public static int h(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public static void y(wr4 wr4Var) {
        int i = wr4Var.v;
        int q = wr4Var.q(i);
        int[] iArr = wr4Var.b;
        int i2 = (q * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | C.BUFFER_FLAG_FIRST_SAMPLE;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        wr4Var.V(wr4Var.F(i, iArr));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r2 = r8.b;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        defpackage.dq.O0(r4 + r3, r3, r5, r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        defpackage.dq.O0(r5, r5 + r4, r3 + r4, r2, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(int r9) {
        /*
            r8 = this;
            int r0 = r8.h
            int r1 = r8.g
            if (r1 == r9) goto Lab
            java.util.ArrayList r2 = r8.d
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L59
            int r2 = r8.h
            int r3 = r8.n()
            int r3 = r3 - r2
            java.util.ArrayList r2 = r8.d
            if (r1 >= r9) goto L39
            int r2 = defpackage.vr4.b(r2, r1, r3)
        L1d:
            java.util.ArrayList r4 = r8.d
            int r4 = r4.size()
            if (r2 >= r4) goto L59
            java.util.ArrayList r4 = r8.d
            java.lang.Object r4 = r4.get(r2)
            bo1 r4 = (defpackage.bo1) r4
            int r5 = r4.a
            if (r5 >= 0) goto L59
            int r5 = r5 + r3
            if (r5 >= r9) goto L59
            r4.a = r5
            int r2 = r2 + 1
            goto L1d
        L39:
            int r2 = defpackage.vr4.b(r2, r9, r3)
        L3d:
            java.util.ArrayList r4 = r8.d
            int r4 = r4.size()
            if (r2 >= r4) goto L59
            java.util.ArrayList r4 = r8.d
            java.lang.Object r4 = r4.get(r2)
            bo1 r4 = (defpackage.bo1) r4
            int r5 = r4.a
            if (r5 < 0) goto L59
            int r5 = r3 - r5
            int r5 = -r5
            r4.a = r5
            int r2 = r2 + 1
            goto L3d
        L59:
            if (r0 <= 0) goto L70
            int[] r2 = r8.b
            int r3 = r9 * 5
            int r4 = r0 * 5
            int r5 = r1 * 5
            if (r9 >= r1) goto L6a
            int r4 = r4 + r3
            defpackage.dq.O0(r4, r3, r5, r2, r2)
            goto L70
        L6a:
            int r6 = r5 + r4
            int r3 = r3 + r4
            defpackage.dq.O0(r5, r6, r3, r2, r2)
        L70:
            if (r9 >= r1) goto L74
            int r1 = r9 + r0
        L74:
            int r2 = r8.n()
            if (r1 >= r2) goto L7b
            goto L80
        L7b:
            java.lang.String r3 = "Check failed"
            defpackage.ke0.a(r3)
        L80:
            if (r1 >= r2) goto Lab
            int[] r3 = r8.b
            int r4 = r1 * 5
            int r4 = r4 + 2
            r3 = r3[r4]
            r5 = -2
            if (r3 <= r5) goto L8f
            r6 = r3
            goto L95
        L8f:
            int r6 = r8.o()
            int r6 = r6 + r3
            int r6 = r6 - r5
        L95:
            if (r6 >= r9) goto L98
            goto L9f
        L98:
            int r7 = r8.o()
            int r7 = r7 - r6
            int r7 = r7 - r5
            int r6 = -r7
        L9f:
            if (r6 == r3) goto La5
            int[] r3 = r8.b
            r3[r4] = r6
        La5:
            int r1 = r1 + 1
            if (r1 != r9) goto L80
            int r1 = r1 + r0
            goto L80
        Lab:
            r8.g = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wr4.A(int):void");
    }

    public final void B(int i, int i2) {
        int i3 = this.l;
        int i4 = this.k;
        int i5 = this.m;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int min = Math.min(i2 + 1, o());
        if (i5 != min) {
            int length = this.c.length - i3;
            if (min < i5) {
                int q = q(min);
                int q2 = q(i5);
                int i7 = this.g;
                while (q < q2) {
                    int i8 = (q * 5) + 4;
                    int i9 = this.b[i8];
                    if (i9 < 0) {
                        ke0.a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    q++;
                    if (q == i7) {
                        q += this.h;
                    }
                }
            } else {
                int q3 = q(i5);
                int q4 = q(min);
                while (q3 < q4) {
                    int i10 = (q3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (i11 >= 0) {
                        ke0.a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    q3++;
                    if (q3 == this.g) {
                        q3 += this.h;
                    }
                }
            }
            this.m = min;
        }
        this.k = i;
    }

    public final List C(bo1 bo1Var, wr4 wr4Var) {
        if (wr4Var.n <= 0) {
            ke0.a("Check failed");
        }
        if (this.n != 0) {
            ke0.a("Check failed");
        }
        if (!bo1Var.a()) {
            ke0.a("Check failed");
        }
        int c = c(bo1Var) + 1;
        int i = this.t;
        if (i > c || c >= this.u) {
            ke0.a("Check failed");
        }
        int F = F(c, this.b);
        int t = t(c);
        int E = x(c) ? 1 : E(c);
        List i2 = li4.i(this, c, wr4Var, false, false, true);
        V(F);
        boolean z = E > 0;
        while (F >= i) {
            int q = q(F);
            int[] iArr = this.b;
            int i3 = q * 5;
            int i4 = i3 + 3;
            iArr[i4] = iArr[i4] - t;
            if (z) {
                int i5 = iArr[i3 + 1];
                if ((1073741824 & i5) != 0) {
                    z = false;
                } else {
                    vr4.f(q, (i5 & 67108863) - E, iArr);
                }
            }
            F = F(F, this.b);
        }
        if (z) {
            if (this.o < E) {
                ke0.a("Check failed");
            }
            this.o -= E;
        }
        return i2;
    }

    public final Object D(int i) {
        int q = q(i);
        int[] iArr = this.b;
        if ((iArr[(q * 5) + 1] & 1073741824) != 0) {
            return this.c[g(f(q, iArr))];
        }
        return null;
    }

    public final int E(int i) {
        return this.b[(q(i) * 5) + 1] & 67108863;
    }

    public final int F(int i, int[] iArr) {
        int i2 = iArr[(q(i) * 5) + 2];
        return i2 > -2 ? i2 : (o() + i2) - (-2);
    }

    public final Object G(Object obj) {
        if (this.n > 0) {
            w(1, this.v);
        }
        Object[] objArr = this.c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[g(i)];
        if (this.i > this.j) {
            ke0.a("Writing to an invalid slot");
        }
        this.c[g(this.i - 1)] = obj;
        return obj2;
    }

    public final void H() {
        int i;
        p33 p33Var = this.x;
        if (p33Var != null) {
            while (p33Var.b != 0) {
                int Z = vt0.Z(p33Var);
                int q = q(Z);
                int i2 = Z + 1;
                int t = t(Z) + Z;
                while (true) {
                    if (i2 >= t) {
                        i = 0;
                        break;
                    } else {
                        if ((this.b[(q(i2) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        i2 += t(i2);
                    }
                }
                int[] iArr = this.b;
                int i3 = (q * 5) + 1;
                int i4 = iArr[i3];
                if (((67108864 & i4) != 0 ? 1 : 0) != i) {
                    iArr[i3] = (i << 26) | ((-67108865) & i4);
                    int F = F(Z, iArr);
                    if (F >= 0) {
                        vt0.d(p33Var, F);
                    }
                }
            }
        }
    }

    public final boolean I() {
        if (this.n != 0) {
            ke0.a("Cannot remove group while inserting");
        }
        int i = this.t;
        int i2 = this.i;
        int f = f(q(i), this.b);
        int M = M();
        P(this.v);
        p33 p33Var = this.x;
        if (p33Var != null) {
            while (true) {
                int i3 = p33Var.b;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    dq2.K0("IntList is empty.");
                    throw null;
                }
                if (p33Var.a[0] < i) {
                    break;
                }
                vt0.Z(p33Var);
            }
        }
        boolean J = J(i, this.t - i);
        K(f, this.i - f, i - 1);
        this.t = i;
        this.i = i2;
        this.o -= M;
        return J;
    }

    public final boolean J(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            A(i);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.e;
                int i3 = i + i2;
                int b = vr4.b(this.d, i3, n() - this.h);
                if (b >= this.d.size()) {
                    b--;
                }
                int i4 = b + 1;
                int i5 = 0;
                while (b >= 0) {
                    bo1 bo1Var = (bo1) this.d.get(b);
                    int c = c(bo1Var);
                    if (c < i) {
                        break;
                    }
                    if (c < i3) {
                        bo1Var.a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i5 == 0) {
                            i5 = b + 1;
                        }
                        i4 = b;
                    }
                    b--;
                }
                r0 = i4 < i5;
                if (r0) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.g = i;
            this.h += i2;
            int i6 = this.m;
            if (i6 > i) {
                this.m = Math.max(i, i6 - i2);
            }
            int i7 = this.u;
            if (i7 >= this.g) {
                this.u = i7 - i2;
            }
            int i8 = this.v;
            if (i8 >= 0 && (this.b[(q(i8) * 5) + 1] & C.BUFFER_FLAG_NOT_DEPENDED_ON) != 0) {
                V(i8);
            }
        }
        return r0;
    }

    public final void K(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.l;
            int i5 = i + i2;
            B(i5, i3);
            this.k = i;
            this.l = i4 + i2;
            Arrays.fill(this.c, i, i5, (Object) null);
            int i6 = this.j;
            if (i6 >= i) {
                this.j = i6 - i2;
            }
        }
    }

    public final Object L(int i, int i2, Object obj) {
        int O = O(q(i), this.b);
        int f = f(q(i + 1), this.b);
        int i3 = O + i2;
        if (i3 < O || i3 >= f) {
            ke0.a("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int g = g(i3);
        Object[] objArr = this.c;
        Object obj2 = objArr[g];
        objArr[g] = obj;
        return obj2;
    }

    public final int M() {
        int q = q(this.t);
        int i = this.t;
        int[] iArr = this.b;
        int i2 = q * 5;
        int i3 = iArr[i2 + 3] + i;
        this.t = i3;
        this.i = f(q(i3), iArr);
        int i4 = this.b[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    public final void N() {
        int i = this.u;
        this.t = i;
        this.i = f(q(i), this.b);
    }

    public final int O(int i, int[] iArr) {
        if (i >= n()) {
            return this.c.length - this.l;
        }
        int d = vr4.d(i, iArr);
        return d < 0 ? (this.c.length - this.l) + d + 1 : d;
    }

    public final io1 P(int i) {
        bo1 S;
        HashMap hashMap = this.e;
        if (hashMap == null || (S = S(i)) == null) {
            return null;
        }
        return (io1) hashMap.get(S);
    }

    public final void Q() {
        if (this.n != 0) {
            ke0.a("Key must be supplied when inserting");
        }
        jp jpVar = de0.a;
        R(0, jpVar, false, jpVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R(int i, Object obj, boolean z, Object obj2) {
        int i2;
        int i3 = this.v;
        Object[] objArr = this.n > 0;
        this.r.d(this.o);
        jp jpVar = de0.a;
        if (objArr == true) {
            int i4 = this.t;
            int f = f(q(i4), this.b);
            v(1);
            this.i = f;
            this.j = f;
            int q = q(i4);
            int i5 = obj != jpVar ? 1 : 0;
            int i6 = (z || obj2 == jpVar) ? 0 : 1;
            int h = h(f, this.k, this.l, this.c.length);
            if (h >= 0 && this.m < i4) {
                h = -(((this.c.length - this.l) - h) + 1);
            }
            int[] iArr = this.b;
            int i7 = this.v;
            int i8 = q * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = h;
            int i9 = (z ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                w(i9, i4);
                Object[] objArr2 = this.c;
                int i10 = this.i;
                if (z) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                if (i5 != 0) {
                    objArr2[i10] = obj;
                    i10++;
                }
                if (i6 != 0) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                this.i = i10;
            }
            this.o = 0;
            i2 = i4 + 1;
            this.v = i4;
            this.t = i2;
            if (i3 >= 0) {
                P(i3);
            }
        } else {
            this.p.d(i3);
            this.q.d((n() - this.h) - this.u);
            int i11 = this.t;
            int q2 = q(i11);
            if (!j42.c(obj2, jpVar)) {
                if (z) {
                    W(this.t, obj2);
                } else {
                    U(obj2);
                }
            }
            this.i = O(q2, this.b);
            this.j = f(q(this.t + 1), this.b);
            int[] iArr2 = this.b;
            int i12 = q2 * 5;
            this.o = iArr2[i12 + 1] & 67108863;
            this.v = i11;
            this.t = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.u = i2;
    }

    public final bo1 S(int i) {
        ArrayList arrayList;
        int c;
        if (i < 0 || i >= o() || (c = vr4.c((arrayList = this.d), i, o())) < 0) {
            return null;
        }
        return (bo1) arrayList.get(c);
    }

    public final void T(Object obj) {
        if (this.n <= 0 || this.i == this.k) {
            G(obj);
            return;
        }
        q33 q33Var = this.s;
        if (q33Var == null) {
            q33Var = new q33();
        }
        this.s = q33Var;
        int i = this.v;
        Object b = q33Var.b(i);
        if (b == null) {
            b = new e43();
            q33Var.i(i, b);
        }
        ((e43) b).a(obj);
    }

    public final void U(Object obj) {
        int q = q(this.t);
        int i = (q * 5) + 1;
        if ((this.b[i] & 268435456) == 0) {
            ke0.a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.c;
        int[] iArr = this.b;
        objArr[g(Integer.bitCount(iArr[i] >> 29) + f(q, iArr))] = obj;
    }

    public final void V(int i) {
        if (i >= 0) {
            p33 p33Var = this.x;
            if (p33Var == null) {
                p33Var = new p33();
                this.x = p33Var;
            }
            vt0.d(p33Var, i);
        }
    }

    public final void W(int i, Object obj) {
        int q = q(i);
        int[] iArr = this.b;
        if (q >= iArr.length || (iArr[(q * 5) + 1] & 1073741824) == 0) {
            ke0.a("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.c[g(f(q, this.b))] = obj;
    }

    public final void a(int i) {
        if (i < 0) {
            ke0.a("Cannot seek backwards");
        }
        if (this.n > 0) {
            jr3.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.t + i;
        int i3 = this.v;
        if (i2 < i3 || i2 > this.u) {
            ke0.a("Cannot seek outside the current group (" + i3 + "-" + this.u + ")");
        }
        this.t = i2;
        int f = f(q(i2), this.b);
        this.i = f;
        this.j = f;
    }

    public final bo1 b(int i) {
        ArrayList arrayList = this.d;
        int c = vr4.c(arrayList, i, o());
        if (c >= 0) {
            return (bo1) arrayList.get(c);
        }
        if (i > this.g) {
            i = -(o() - i);
        }
        bo1 bo1Var = new bo1(i);
        arrayList.add(-(c + 1), bo1Var);
        return bo1Var;
    }

    public final int c(bo1 bo1Var) {
        int i = bo1Var.a;
        return i < 0 ? o() + i : i;
    }

    public final void d() {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            this.q.d((n() - this.h) - this.u);
        }
    }

    public final void e(boolean z) {
        this.w = true;
        if (z && this.p.a == 0) {
            A(o());
            B(this.c.length - this.l, this.g);
            int i = this.k;
            Arrays.fill(this.c, i, this.l + i, (Object) null);
            H();
        }
        int[] iArr = this.b;
        int i2 = this.g;
        Object[] objArr = this.c;
        int i3 = this.k;
        ArrayList arrayList = this.d;
        HashMap hashMap = this.e;
        q33 q33Var = this.f;
        tr4 tr4Var = this.a;
        if (!tr4Var.O) {
            jr3.a("Unexpected writer close()");
        }
        tr4Var.O = false;
        tr4Var.I = iArr;
        tr4Var.J = i2;
        tr4Var.K = objArr;
        tr4Var.L = i3;
        tr4Var.Q = arrayList;
        tr4Var.R = hashMap;
        tr4Var.S = q33Var;
    }

    public final int f(int i, int[] iArr) {
        if (i >= n()) {
            return this.c.length - this.l;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.c.length - this.l) + i2 + 1 : i2;
    }

    public final int g(int i) {
        return (this.l * (i < this.k ? 0 : 1)) + i;
    }

    public final void i() {
        e43 e43Var;
        boolean z = this.n > 0;
        int i = this.t;
        int i2 = this.u;
        int i3 = this.v;
        int q = q(i3);
        int i4 = this.o;
        int i5 = i - i3;
        int i6 = q * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.b[i7] & 1073741824) != 0;
        a32 a32Var = this.r;
        if (z) {
            q33 q33Var = this.s;
            if (q33Var != null && (e43Var = (e43) q33Var.b(i3)) != null) {
                Object[] objArr = e43Var.a;
                int i8 = e43Var.b;
                for (int i9 = 0; i9 < i8; i9++) {
                    G(objArr[i9]);
                }
            }
            int[] iArr = this.b;
            iArr[i6 + 3] = i5;
            vr4.f(q, i4, iArr);
            int c = a32Var.c();
            if (z2) {
                i4 = 1;
            }
            this.o = c + i4;
            int F = F(i3, this.b);
            this.v = F;
            int o = F < 0 ? o() : q(F + 1);
            int f = o >= 0 ? f(o, this.b) : 0;
            this.i = f;
            this.j = f;
            return;
        }
        if (i != i2) {
            ke0.a("Expected to be at the end of a group");
        }
        int[] iArr2 = this.b;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        vr4.f(q, i4, iArr2);
        int c2 = this.p.c();
        this.u = (n() - this.h) - this.q.c();
        this.v = c2;
        int F2 = F(i3, this.b);
        int c3 = a32Var.c();
        this.o = c3;
        if (F2 == c2) {
            this.o = c3 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (F2 != 0 && F2 != c2 && (i14 != 0 || i13 != 0)) {
                int q2 = q(F2);
                if (i13 != 0) {
                    int[] iArr3 = this.b;
                    int i15 = (q2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.b;
                    vr4.f(q2, (iArr4[(q2 * 5) + 1] & 67108863) + i14, iArr4);
                }
                int[] iArr5 = this.b;
                if ((iArr5[(q2 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                F2 = F(F2, iArr5);
            }
        }
        this.o += i14;
    }

    public final void j() {
        if (this.n <= 0) {
            jr3.b("Unbalanced begin/end insert");
        }
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            if (this.r.a != this.p.a) {
                ke0.a("startGroup/endGroup mismatch while inserting");
            }
            this.u = (n() - this.h) - this.q.c();
        }
    }

    public final void k(int i) {
        boolean z = false;
        if (!(this.n <= 0)) {
            ke0.a("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.v;
        if (i2 != i) {
            if (i >= i2 && i < this.u) {
                z = true;
            }
            if (!z) {
                ke0.a("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.t;
            int i4 = this.i;
            int i5 = this.j;
            this.t = i;
            Q();
            this.t = i3;
            this.i = i4;
            this.j = i5;
        }
    }

    public final void l(int i, int i2, int i3) {
        if (i >= this.g) {
            i = -((o() - i) + 2);
        }
        while (i3 < i2) {
            this.b[(q(i3) * 5) + 2] = i;
            int i4 = this.b[(q(i3) * 5) + 3] + i3;
            l(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0140, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r21, defpackage.hn1 r22) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wr4.m(int, hn1):void");
    }

    public final int n() {
        return this.b.length / 5;
    }

    public final int o() {
        return n() - this.h;
    }

    public final Object p(int i) {
        int q = q(i);
        int[] iArr = this.b;
        int i2 = (q * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return de0.a;
        }
        return this.c[Integer.bitCount(iArr[i2] >> 29) + f(q, iArr)];
    }

    public final int q(int i) {
        return (this.h * (i < this.g ? 0 : 1)) + i;
    }

    public final int r(int i) {
        return this.b[q(i) * 5];
    }

    public final Object s(int i) {
        int q = q(i);
        int[] iArr = this.b;
        int i2 = q * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.c[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final int t(int i) {
        return this.b[(q(i) * 5) + 3];
    }

    public final String toString() {
        int i = this.t;
        int i2 = this.u;
        int o = o();
        int i3 = this.g;
        int i4 = this.h + i3;
        StringBuilder D = hf1.D("SlotWriter(current = ", i, " end=", i2, " size = ");
        D.append(o);
        D.append(" gap=");
        D.append(i3);
        D.append("-");
        return nt3.n(D, i4, ")");
    }

    public final boolean u(int i, int i2) {
        int n;
        int t;
        if (i2 == this.v) {
            n = this.u;
        } else {
            a32 a32Var = this.p;
            if (i2 > a32Var.b(0)) {
                t = t(i2);
            } else {
                int[] iArr = (int[]) a32Var.b;
                int min = Math.min(iArr.length, a32Var.a);
                int i3 = 0;
                while (true) {
                    if (i3 >= min) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    t = t(i2);
                } else {
                    n = (n() - this.h) - ((int[]) this.q.b)[i3];
                }
            }
            n = t + i2;
        }
        return i > i2 && i < n;
    }

    public final void v(int i) {
        if (i > 0) {
            int i2 = this.t;
            A(i2);
            int i3 = this.g;
            int i4 = this.h;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i6 = max - i5;
                dq.O0(0, 0, i3 * 5, iArr, iArr2);
                dq.O0((i3 + i6) * 5, (i4 + i3) * 5, length * 5, iArr, iArr2);
                this.b = iArr2;
                i4 = i6;
                iArr = iArr2;
            }
            int i7 = this.u;
            if (i7 >= i3) {
                this.u = i7 + i;
            }
            int i8 = i3 + i;
            this.g = i8;
            this.h = i4 - i;
            int h = h(i5 > 0 ? f(q(i2 + i), iArr) : 0, this.m >= i3 ? this.k : 0, this.l, this.c.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.b[(i9 * 5) + 4] = h;
            }
            int i10 = this.m;
            if (i10 >= i3) {
                this.m = i10 + i;
            }
        }
    }

    public final void w(int i, int i2) {
        if (i > 0) {
            B(this.i, i2);
            int i3 = this.k;
            int i4 = this.l;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.j;
            if (i9 >= i3) {
                this.j = i9 + i;
            }
            this.k = i3 + i;
            this.l = i4 - i;
        }
    }

    public final boolean x(int i) {
        return (this.b[(q(i) * 5) + 1] & 1073741824) != 0;
    }

    public final void z(tr4 tr4Var, int i) {
        if (this.n <= 0) {
            ke0.a("Check failed");
        }
        if (i == 0 && this.t == 0 && this.a.J == 0) {
            int[] iArr = tr4Var.I;
            int i2 = iArr[(i * 5) + 3];
            int i3 = tr4Var.J;
            if (i2 == i3) {
                int[] iArr2 = this.b;
                Object[] objArr = this.c;
                ArrayList arrayList = this.d;
                HashMap hashMap = this.e;
                q33 q33Var = this.f;
                Object[] objArr2 = tr4Var.K;
                int i4 = tr4Var.L;
                HashMap hashMap2 = tr4Var.R;
                q33 q33Var2 = tr4Var.S;
                this.b = iArr;
                this.c = objArr2;
                this.d = tr4Var.Q;
                this.g = i3;
                this.h = (iArr.length / 5) - i3;
                this.k = i4;
                this.l = objArr2.length - i4;
                this.m = i3;
                this.e = hashMap2;
                this.f = q33Var2;
                tr4Var.I = iArr2;
                tr4Var.J = 0;
                tr4Var.K = objArr;
                tr4Var.L = 0;
                tr4Var.Q = arrayList;
                tr4Var.R = hashMap;
                tr4Var.S = q33Var;
                return;
            }
        }
        wr4 j = tr4Var.j();
        try {
            li4.i(j, i, this, true, true, false);
            j.e(true);
        } catch (Throwable th) {
            j.e(false);
            throw th;
        }
    }
}

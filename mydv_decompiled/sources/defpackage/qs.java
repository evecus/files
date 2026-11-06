package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class qs implements Serializable {
    public final transient mc3 I;
    public final int J;
    public final ArrayList K;
    public final int L;
    public o06 M;
    public final ArrayList N;
    public final TreeMap O;
    public final Stack P;
    public final TreeMap Q;
    public int R;
    public boolean S;
    public transient int T;

    public qs(qs qsVar, mc3 mc3Var, int i, boolean z) {
        this.I = mc3Var;
        this.J = qsVar.J;
        this.L = qsVar.L;
        this.M = qsVar.M;
        ArrayList arrayList = qsVar.N;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        this.N = arrayList2;
        TreeMap treeMap = qsVar.O;
        TreeMap treeMap2 = new TreeMap();
        for (Integer num : treeMap.keySet()) {
            treeMap2.put(num, new LinkedList((Collection) treeMap.get(num)));
        }
        this.O = treeMap2;
        Stack stack = qsVar.P;
        Stack stack2 = new Stack();
        stack2.addAll(stack);
        this.P = stack2;
        ArrayList arrayList3 = qsVar.K;
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList3.get(i2);
            i2++;
            ts tsVar = (ts) obj;
            ts tsVar2 = new ts(tsVar.J);
            tsVar2.I = tsVar.I;
            tsVar2.K = tsVar.K;
            tsVar2.L = tsVar.L;
            tsVar2.M = tsVar.M;
            tsVar2.N = tsVar.N;
            arrayList4.add(tsVar2);
        }
        this.K = arrayList4;
        this.Q = new TreeMap((Map) qsVar.Q);
        this.R = qsVar.R;
        this.T = i;
        this.S = z;
    }

    public static void e(o06 o06Var, int i, int i2, int i3) {
        byte[] bArr;
        if (o06Var != null) {
            int i4 = o06Var.I;
            if (i4 < i2 || i4 > i3 || (bArr = o06Var.J) == null || bArr.length != i) {
                zy.i("XMSS node in BDS state out of bounds");
            }
        }
    }

    public final void a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4;
        int i;
        int i2;
        byte[] s = g4.s(bArr3);
        int i3 = 1;
        byte[] i4 = g06.i(1, bArr3);
        char c = 2;
        byte[] i5 = g06.i(2, bArr3);
        mc3 mc3Var = this.I;
        int i6 = ((yz) mc3Var.a).b;
        byte[] bArr5 = new byte[i6];
        byte[] bArr6 = new byte[i6 * 2];
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = this.J;
            int i10 = i3 << i9;
            Stack stack = this.P;
            if (i8 >= i10) {
                this.M = (o06) stack.pop();
                return;
            }
            dq2.a0(s, i8, 16);
            char c2 = c;
            mc3Var.i(mc3Var.h(bArr2, s), bArr);
            g73 e = mc3Var.e(s);
            dq2.a0(i4, i8, 16);
            o06 b = p06.b(mc3Var, e, i4, bArr5, bArr6);
            dq2.a0(i5, i7, 20);
            dq2.a0(i5, i8, 24);
            int i11 = i8;
            int i12 = 0;
            while (!stack.isEmpty()) {
                int i13 = ((o06) stack.peek()).I;
                int i14 = b.I;
                if (i13 == i14) {
                    int i15 = i8 / (i3 << i14);
                    if (i15 == i3) {
                        this.N.add(b);
                    }
                    int i16 = this.L;
                    mc3 mc3Var2 = mc3Var;
                    int i17 = 3;
                    if (i15 == 3) {
                        if (i14 < i9 - i16) {
                            ts tsVar = (ts) this.K.get(i14);
                            tsVar.I = b;
                            tsVar.K = i14;
                            bArr4 = s;
                            if (i14 == tsVar.J) {
                                i = 1;
                                tsVar.N = true;
                                i17 = 3;
                            }
                        } else {
                            bArr4 = s;
                        }
                        i = 1;
                        i17 = 3;
                    } else {
                        bArr4 = s;
                        i = 1;
                    }
                    if (i15 < i17 || (i15 & 1) != i) {
                        i2 = i;
                    } else {
                        if (i14 >= i9 - i16 && i14 <= i9 - 2) {
                            Integer valueOf = Integer.valueOf(i14);
                            TreeMap treeMap = this.O;
                            if (treeMap.get(valueOf) == null) {
                                LinkedList linkedList = new LinkedList();
                                linkedList.add(b);
                                treeMap.put(Integer.valueOf(i14), linkedList);
                            } else {
                                ((List) treeMap.get(Integer.valueOf(i14))).add(b);
                            }
                        }
                        i2 = 1;
                    }
                    int i18 = (i11 - 1) / 2;
                    dq2.a0(i5, i18, 24);
                    b = p06.c(this.I, (o06) stack.pop(), b, i5, bArr5, bArr6).a();
                    int i19 = i12 + 1;
                    dq2.a0(i5, i19, 20);
                    i11 = i18;
                    i12 = i19;
                    i3 = i2;
                    mc3Var = mc3Var2;
                    s = bArr4;
                }
            }
            stack.push(b);
            i8++;
            c = c2;
            i3 = i3;
            mc3Var = mc3Var;
            s = s;
            i7 = 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [boolean] */
    public final void b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i;
        int i2;
        mc3 mc3Var;
        int i3;
        ?? r9;
        o06 o06Var;
        mc3 mc3Var2;
        Stack stack;
        byte[] bArr4 = bArr;
        if (this.S) {
            zy.i("index already used");
            return;
        }
        int i4 = this.R;
        if (i4 > this.T - 1) {
            zy.i("index out of bounds");
            return;
        }
        int i5 = 0;
        while (true) {
            i = this.J;
            if (i5 >= i) {
                i5 = 0;
                break;
            } else if (((i4 >> i5) & 1) == 0) {
                break;
            } else {
                i5++;
            }
        }
        int i6 = (this.R >> (i5 + 1)) & 1;
        TreeMap treeMap = this.Q;
        ArrayList arrayList = this.N;
        if (i6 == 0 && i5 < i - 1) {
            treeMap.put(Integer.valueOf(i5), (o06) arrayList.get(i5));
        }
        byte[] s = g4.s(bArr3);
        byte[] i7 = g06.i(1, bArr3);
        byte[] i8 = g06.i(2, bArr3);
        mc3 mc3Var3 = this.I;
        int i9 = ((yz) mc3Var3.a).b;
        byte[] bArr5 = new byte[i9];
        byte[] bArr6 = new byte[i9 * 2];
        int i10 = 1;
        ArrayList arrayList2 = this.K;
        int i11 = this.L;
        if (i5 == 0) {
            dq2.a0(s, this.R, 16);
            mc3Var3.i(mc3Var3.h(bArr2, s), bArr4);
            g73 e = mc3Var3.e(s);
            dq2.a0(i7, this.R, 16);
            arrayList.set(0, p06.b(mc3Var3, e, i7, bArr5, bArr6));
            i3 = 0;
            i2 = i;
            mc3Var = mc3Var3;
        } else {
            int i12 = i5 - 1;
            dq2.a0(i8, i12, 20);
            i2 = i;
            dq2.a0(i8, this.R >> i5, 24);
            mc3Var3.i(new byte[i9], bArr4);
            o06 o06Var2 = (o06) treeMap.get(Integer.valueOf(i12));
            if (o06Var2 == null) {
                zy.i("missing keep node in BDS state");
                return;
            }
            mc3Var = mc3Var3;
            arrayList.set(i5, p06.c(this.I, (o06) arrayList.get(i12), o06Var2, i8, bArr5, bArr6).a());
            treeMap.remove(Integer.valueOf(i12));
            for (int i13 = 0; i13 < i5; i13++) {
                if (i13 < i2 - i11) {
                    o06Var = ((ts) arrayList2.get(i13)).I;
                } else {
                    List list = (List) this.O.get(Integer.valueOf(i13));
                    if (list == null || list.isEmpty()) {
                        zy.i("missing retain node in BDS state");
                        return;
                    }
                    o06Var = (o06) list.remove(0);
                }
                arrayList.set(i13, o06Var);
            }
            int min = Math.min(i5, i2 - i11);
            int i14 = 0;
            while (i14 < min) {
                int i15 = ((i10 << i14) * 3) + this.R + 1;
                if (i15 < (i10 << i2)) {
                    ts tsVar = (ts) arrayList2.get(i14);
                    tsVar.I = null;
                    tsVar.K = tsVar.J;
                    tsVar.L = i15;
                    r9 = i10;
                    tsVar.M = r9;
                    tsVar.N = false;
                } else {
                    r9 = i10;
                }
                i14++;
                i10 = r9;
            }
            i3 = 0;
        }
        int i16 = i10;
        ts tsVar2 = null;
        int i17 = i3;
        while (i17 < ((i2 - i11) >> i16)) {
            int size = arrayList2.size();
            ts tsVar3 = tsVar2;
            int i18 = i3;
            while (i18 < size) {
                Object obj = arrayList2.get(i18);
                i18++;
                ts tsVar4 = (ts) obj;
                if (!tsVar4.N && tsVar4.M && (tsVar3 == null || tsVar4.a() < tsVar3.a() || (tsVar4.a() == tsVar3.a() && tsVar4.L < tsVar3.L))) {
                    tsVar3 = tsVar4;
                }
            }
            if (tsVar3 != null) {
                int i19 = tsVar3.J;
                if (tsVar3.N || !tsVar3.M) {
                    zy.i("finished or not initialized");
                    return;
                }
                dq2.a0(s, tsVar3.L, 16);
                byte[] i20 = g06.i(1, s);
                dq2.a0(i20, tsVar3.L, 16);
                byte[] i21 = g06.i(2, s);
                dq2.a0(i21, tsVar3.L, 24);
                int i22 = tsVar3.L;
                int i23 = ((yz) mc3Var.a).b;
                byte[] bArr7 = new byte[i23];
                byte[] bArr8 = new byte[i23 * 2];
                mc3Var.i(mc3Var.h(bArr2, s), bArr4);
                o06 b = p06.b(mc3Var, mc3Var.e(s), i20, bArr7, bArr8);
                int i24 = 0;
                while (true) {
                    stack = this.P;
                    if (stack.isEmpty() || ((o06) stack.peek()).I != b.I || ((o06) stack.peek()).I == i19) {
                        break;
                    }
                    i22 = (i22 - 1) / 2;
                    dq2.a0(i21, i22, 24);
                    o06 o06Var3 = (o06) stack.pop();
                    mc3 mc3Var4 = mc3Var;
                    byte[] bArr9 = bArr7;
                    byte[] bArr10 = i21;
                    b = p06.c(mc3Var4, o06Var3, b, bArr10, bArr9, bArr8).a();
                    i24++;
                    dq2.a0(bArr10, i24, 20);
                    i21 = bArr10;
                    mc3Var = mc3Var4;
                    bArr7 = bArr9;
                }
                byte[] bArr11 = bArr7;
                mc3Var2 = mc3Var;
                byte[] bArr12 = i21;
                o06 o06Var4 = tsVar3.I;
                if (o06Var4 == null) {
                    tsVar3.I = b;
                } else if (o06Var4.I == b.I) {
                    dq2.a0(bArr12, (i22 - 1) / 2, 24);
                    b = p06.c(mc3Var2, tsVar3.I, b, bArr12, bArr11, bArr8).a();
                    tsVar3.I = b;
                    dq2.a0(bArr12, i24 + 1, 20);
                } else {
                    stack.push(b);
                }
                if (tsVar3.I.I == i19) {
                    tsVar3.N = true;
                } else {
                    tsVar3.K = b.I;
                    tsVar3.L++;
                }
            } else {
                mc3Var2 = mc3Var;
            }
            i17++;
            bArr4 = bArr;
            mc3Var = mc3Var2;
            i16 = 1;
            tsVar2 = null;
            i3 = 0;
        }
        this.R++;
    }

    public final void c() {
        int i;
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            zy.i("authenticationPath == null");
            return;
        }
        TreeMap treeMap = this.O;
        if (treeMap == null) {
            zy.i("retain == null");
            return;
        }
        Stack stack = this.P;
        if (stack == null) {
            zy.i("stack == null");
            return;
        }
        ArrayList arrayList2 = this.K;
        if (arrayList2 == null) {
            zy.i("treeHashInstances == null");
            return;
        }
        TreeMap treeMap2 = this.Q;
        if (treeMap2 == null) {
            zy.i("keep == null");
            return;
        }
        int i2 = this.J;
        if (i2 < 2 || i2 > 30) {
            zy.i("treeHeight in BDS state out of bounds");
            return;
        }
        int i3 = this.L;
        if (i3 <= i2 && i3 >= 2) {
            int i4 = i2 - i3;
            if ((i4 & 1) == 0) {
                int i5 = (1 << i2) - 1;
                int i6 = this.T;
                if (i6 < 0 || i6 > i5 || (i = this.R) < 0 || i > i6 + 1) {
                    zy.i("index in BDS state out of bounds");
                    return;
                }
                o06 o06Var = this.M;
                if (o06Var == null) {
                    if (!arrayList.isEmpty()) {
                        zy.i("authenticationPath present without root");
                        return;
                    }
                } else if (o06Var.I != i2 || arrayList.size() != i2) {
                    zy.i("inconsistent root or authenticationPath in BDS state");
                    return;
                }
                if (arrayList2.size() != i4 || treeMap.size() > i3 - 1 || stack.size() > i2 || treeMap2.size() > i2) {
                    zy.i("inconsistent collection size in BDS state");
                    return;
                }
                return;
            }
        }
        zy.i("k in BDS state out of bounds");
    }

    public final void d(q06 q06Var) {
        String str;
        int i;
        int i2;
        c();
        int i3 = q06Var.a;
        int i4 = this.J;
        if (i4 == i3) {
            int i5 = q06Var.b;
            int i6 = this.L;
            if (i6 == i5) {
                int i7 = q06Var.e;
                e(this.M, i7, i4, i4);
                int i8 = 0;
                while (true) {
                    ArrayList arrayList = this.N;
                    if (i8 < arrayList.size()) {
                        o06 o06Var = (o06) arrayList.get(i8);
                        if (o06Var == null) {
                            zy.i("null XMSS node in BDS state");
                            return;
                        } else {
                            e(o06Var, i7, i8, i8);
                            i8++;
                        }
                    } else {
                        TreeMap treeMap = this.O;
                        for (Integer num : treeMap.keySet()) {
                            int intValue = num.intValue();
                            if (intValue < i4 - i6 || intValue > i4 - 2) {
                                str = "retain height in BDS state out of bounds";
                                break;
                            }
                            List<o06> list = (List) treeMap.get(num);
                            int i9 = (1 << ((i4 - intValue) - 1)) - 1;
                            if (list == null || list.size() > i9) {
                                str = "retain queue in BDS state out of bounds";
                                break;
                            }
                            for (o06 o06Var2 : list) {
                                if (o06Var2 == null) {
                                    zy.i("null XMSS node in BDS state");
                                    return;
                                }
                                e(o06Var2, i7, intValue, intValue);
                            }
                        }
                        for (o06 o06Var3 : this.P) {
                            if (o06Var3 == null) {
                                zy.i("null XMSS node in BDS state");
                                return;
                            }
                            e(o06Var3, i7, 0, i4);
                        }
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList2 = this.K;
                            if (i10 >= arrayList2.size()) {
                                TreeMap treeMap2 = this.Q;
                                for (Integer num2 : treeMap2.keySet()) {
                                    int intValue2 = num2.intValue();
                                    if (intValue2 < 0 || intValue2 > i4 - 2) {
                                        str = "keep height in BDS state out of bounds";
                                    } else {
                                        o06 o06Var4 = (o06) treeMap2.get(num2);
                                        if (o06Var4 == null) {
                                            zy.i("null XMSS node in BDS state");
                                            return;
                                        }
                                        e(o06Var4, i7, intValue2, intValue2);
                                    }
                                }
                                return;
                            }
                            ts tsVar = (ts) arrayList2.get(i10);
                            if (tsVar == null || tsVar.J != i10 || (i = tsVar.K) < 0 || i > i10 || (i2 = tsVar.L) < 0 || i2 > (1 << i4) - 1) {
                                break;
                            }
                            e(tsVar.I, i7, 0, i10);
                            i10++;
                        }
                        str = "tree hash in BDS state out of bounds";
                    }
                }
            }
        }
        str = "BDS state does not match XMSS parameters";
        zy.i(str);
    }

    public final void f(byte[] bArr) {
        o06 o06Var = this.M;
        if (o06Var == null || bArr == null || Arrays.equals(g4.s(o06Var.J), bArr)) {
            return;
        }
        zy.i("BDS state root does not match the private key root");
    }

    public qs(qs qsVar, q0 q0Var, int i) {
        this(qsVar, new mc3(i > 0 ? new yz(q0Var, i) : new yz(q0Var, zw0.a(q0Var).d())), qsVar.T, qsVar.S);
        c();
    }

    public qs(int i, int i2, int i3, int i4, boolean z, o06 o06Var, ArrayList arrayList, TreeMap treeMap, Stack stack, ArrayList arrayList2, TreeMap treeMap2) {
        this.I = null;
        this.J = i;
        this.L = i2;
        this.T = i3;
        this.R = i4;
        this.S = z;
        this.M = o06Var;
        this.N = arrayList;
        this.O = treeMap;
        this.P = stack;
        this.K = arrayList2;
        this.Q = treeMap2;
        c();
    }

    public qs(mc3 mc3Var, int i, int i2, int i3) {
        this.I = mc3Var;
        this.J = i;
        this.T = i3;
        this.L = i2;
        if (i2 <= i && i2 >= 2) {
            int i4 = i - i2;
            if (i4 % 2 == 0) {
                this.N = new ArrayList();
                this.O = new TreeMap();
                this.P = new Stack();
                this.K = new ArrayList();
                for (int i5 = 0; i5 < i4; i5++) {
                    this.K.add(new ts(i5));
                }
                this.Q = new TreeMap();
                this.R = 0;
                this.S = false;
                return;
            }
        }
        s83.t("illegal value for BDS parameter k");
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qs(defpackage.q06 r5, byte[] r6, byte[] r7, byte[] r8) {
        /*
            r4 = this;
            mc3 r0 = new mc3
            yz r1 = new yz
            q0 r2 = r5.c
            int r3 = r5.e
            r1.<init>(r2, r3)
            r0.<init>(r1)
            int r1 = r5.a
            int r5 = r5.b
            r2 = 1
            int r3 = r2 << r1
            int r3 = r3 - r2
            r4.<init>(r0, r1, r5, r3)
            r4.a(r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qs.<init>(q06, byte[], byte[], byte[]):void");
    }
}

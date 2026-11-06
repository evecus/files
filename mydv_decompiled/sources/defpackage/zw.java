package defpackage;

import android.text.Layout;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zw implements ak3 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.List] */
    public zw(oj ojVar, iu0 iu0Var, kj1 kj1Var, m65 m65Var, List list, boolean z) {
        int i;
        String str;
        int i2;
        List list2;
        oj ojVar2 = ojVar;
        m65 m65Var2 = m65Var;
        this.a = ojVar2;
        this.b = list;
        final byte b = 0;
        rm1 rm1Var = new rm1(this) { // from class: x23
            public final /* synthetic */ zw J;

            {
                this.J = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11 */
            /* JADX WARN: Type inference failed for: r0v12 */
            /* JADX WARN: Type inference failed for: r0v15 */
            /* JADX WARN: Type inference failed for: r0v18 */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v6 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v9 */
            @Override // defpackage.rm1
            public final Object invoke() {
                byte b2 = b;
                zj3 zj3Var = null;
                int i3 = 1;
                zw zwVar = this.J;
                switch (b2) {
                    case 0:
                        ArrayList arrayList = (ArrayList) zwVar.e;
                        if (!arrayList.isEmpty()) {
                            ?? r0 = arrayList.get(0);
                            float b3 = ((zj3) r0).a.b();
                            int size = arrayList.size() - 1;
                            boolean z2 = r0;
                            if (1 <= size) {
                                while (true) {
                                    Object obj = arrayList.get(i3);
                                    float b4 = ((zj3) obj).a.b();
                                    r0 = z2;
                                    if (Float.compare(b3, b4) < 0) {
                                        r0 = obj;
                                        b3 = b4;
                                    }
                                    if (i3 != size) {
                                        i3++;
                                        z2 = r0;
                                    }
                                }
                            }
                            zj3Var = r0;
                        }
                        zj3 zj3Var2 = zj3Var;
                        return Float.valueOf(zj3Var2 != null ? zj3Var2.a.b() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) zwVar.e;
                        if (!arrayList2.isEmpty()) {
                            ?? r02 = arrayList2.get(0);
                            float c = ((zj3) r02).a.i.c();
                            int size2 = arrayList2.size() - 1;
                            boolean z3 = r02;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj2 = arrayList2.get(i3);
                                    float c2 = ((zj3) obj2).a.i.c();
                                    r02 = z3;
                                    if (Float.compare(c, c2) < 0) {
                                        r02 = obj2;
                                        c = c2;
                                    }
                                    if (i3 != size2) {
                                        i3++;
                                        z3 = r02;
                                    }
                                }
                            }
                            zj3Var = r02;
                        }
                        zj3 zj3Var3 = zj3Var;
                        return Float.valueOf(zj3Var3 != null ? zj3Var3.a.i.c() : 0.0f);
                }
            }
        };
        dh2 dh2Var = dh2.J;
        this.c = ut0.K(dh2Var, rm1Var);
        final byte b2 = 1;
        this.d = ut0.K(dh2Var, new rm1(this) { // from class: x23
            public final /* synthetic */ zw J;

            {
                this.J = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11 */
            /* JADX WARN: Type inference failed for: r0v12 */
            /* JADX WARN: Type inference failed for: r0v15 */
            /* JADX WARN: Type inference failed for: r0v18 */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v6 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v9 */
            @Override // defpackage.rm1
            public final Object invoke() {
                byte b22 = b2;
                zj3 zj3Var = null;
                int i3 = 1;
                zw zwVar = this.J;
                switch (b22) {
                    case 0:
                        ArrayList arrayList = (ArrayList) zwVar.e;
                        if (!arrayList.isEmpty()) {
                            ?? r0 = arrayList.get(0);
                            float b3 = ((zj3) r0).a.b();
                            int size = arrayList.size() - 1;
                            boolean z2 = r0;
                            if (1 <= size) {
                                while (true) {
                                    Object obj = arrayList.get(i3);
                                    float b4 = ((zj3) obj).a.b();
                                    r0 = z2;
                                    if (Float.compare(b3, b4) < 0) {
                                        r0 = obj;
                                        b3 = b4;
                                    }
                                    if (i3 != size) {
                                        i3++;
                                        z2 = r0;
                                    }
                                }
                            }
                            zj3Var = r0;
                        }
                        zj3 zj3Var2 = zj3Var;
                        return Float.valueOf(zj3Var2 != null ? zj3Var2.a.b() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) zwVar.e;
                        if (!arrayList2.isEmpty()) {
                            ?? r02 = arrayList2.get(0);
                            float c = ((zj3) r02).a.i.c();
                            int size2 = arrayList2.size() - 1;
                            boolean z3 = r02;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj2 = arrayList2.get(i3);
                                    float c2 = ((zj3) obj2).a.i.c();
                                    r02 = z3;
                                    if (Float.compare(c, c2) < 0) {
                                        r02 = obj2;
                                        c = c2;
                                    }
                                    if (i3 != size2) {
                                        i3++;
                                        z3 = r02;
                                    }
                                }
                            }
                            zj3Var = r02;
                        }
                        zj3 zj3Var3 = zj3Var;
                        return Float.valueOf(zj3Var3 != null ? zj3Var3.a.i.c() : 0.0f);
                }
            }
        });
        ck3 ck3Var = m65Var2.b;
        oj ojVar3 = pj.a;
        ArrayList arrayList = ojVar2.L;
        String str2 = ojVar2.J;
        o91 o91Var = o91.I;
        List k1 = arrayList != null ? o70.k1(arrayList, new xi1((byte) 7)) : o91Var;
        ArrayList arrayList2 = new ArrayList();
        pp ppVar = new pp();
        int size = k1.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            nj njVar = (nj) k1.get(i3);
            nj d = nj.d(njVar, ck3Var.a((ck3) njVar.a), b, 14);
            Object obj = d.a;
            int i5 = d.c;
            int i6 = d.b;
            while (i4 < i6 && !ppVar.isEmpty()) {
                nj njVar2 = (nj) ppVar.last();
                List list3 = k1;
                int i7 = njVar2.c;
                o91 o91Var2 = o91Var;
                Object obj2 = njVar2.a;
                if (i6 < i7) {
                    arrayList2.add(new nj(i4, i6, obj2));
                    i4 = i6;
                    k1 = list3;
                    o91Var = o91Var2;
                } else {
                    int i8 = size;
                    arrayList2.add(new nj(i4, i7, obj2));
                    i4 = njVar2.c;
                    while (!ppVar.isEmpty() && i4 == ((nj) ppVar.last()).c) {
                        ppVar.removeLast();
                    }
                    k1 = list3;
                    o91Var = o91Var2;
                    size = i8;
                }
            }
            List list4 = k1;
            o91 o91Var3 = o91Var;
            int i9 = size;
            if (i4 < i6) {
                arrayList2.add(new nj(i4, i6, ck3Var));
                i4 = i6;
            }
            nj njVar3 = (nj) ppVar.l();
            if (njVar3 != null) {
                int i10 = njVar3.c;
                Object obj3 = njVar3.a;
                int i11 = njVar3.b;
                if (i11 == i6 && i10 == i5) {
                    ppVar.removeLast();
                    ppVar.addLast(new nj(i6, i5, ((ck3) obj3).a((ck3) obj)));
                } else if (i11 == i10) {
                    arrayList2.add(new nj(i11, i10, obj3));
                    ppVar.removeLast();
                    ppVar.addLast(new nj(i6, i5, obj));
                } else {
                    if (i10 < i5) {
                        s83.d();
                        throw null;
                    }
                    ppVar.addLast(new nj(i6, i5, ((ck3) obj3).a((ck3) obj)));
                }
            } else {
                ppVar.addLast(new nj(i6, i5, obj));
            }
            i3++;
            k1 = list4;
            o91Var = o91Var3;
            size = i9;
            b = 0;
        }
        o91 o91Var4 = o91Var;
        while (i4 <= str2.length() && !ppVar.isEmpty()) {
            nj njVar4 = (nj) ppVar.last();
            Object obj4 = njVar4.a;
            int i12 = njVar4.c;
            arrayList2.add(new nj(i4, i12, obj4));
            while (!ppVar.isEmpty() && i12 == ((nj) ppVar.last()).c) {
                ppVar.removeLast();
            }
            i4 = i12;
        }
        if (i4 < str2.length()) {
            arrayList2.add(new nj(i4, str2.length(), ck3Var));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new nj(0, 0, ck3Var));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i13 = i;
        while (i13 < size2) {
            nj njVar5 = (nj) arrayList2.get(i13);
            int i14 = njVar5.b;
            int i15 = njVar5.c;
            String substring = i14 != i15 ? str2.substring(i14, i15) : "";
            List b3 = pj.b(ojVar2, i14, i15, new t5((byte) 9));
            oj ojVar4 = new oj(substring, b3 == null ? o91Var4 : b3);
            ck3 ck3Var2 = (ck3) njVar5.a;
            if (ck3Var2.b == 0) {
                str = str2;
                i2 = size2;
                ck3Var2 = new ck3(ck3Var2.a, ck3Var.b, ck3Var2.c, ck3Var2.d, ck3Var2.e, ck3Var2.f, ck3Var2.g, ck3Var2.h, ck3Var2.i);
            } else {
                str = str2;
                i2 = size2;
            }
            m65 m65Var3 = new m65(m65Var2.a, ck3Var.a(ck3Var2));
            ?? r5 = ojVar4.I;
            o91 o91Var5 = r5 == 0 ? o91Var4 : r5;
            List list5 = (List) this.b;
            ArrayList arrayList4 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i16 = 0;
            while (i16 < size3) {
                nj njVar6 = (nj) list5.get(i16);
                int i17 = njVar6.b;
                ck3 ck3Var3 = ck3Var;
                int i18 = njVar6.c;
                if (pj.c(i14, i15, i17, i18)) {
                    if (i14 > i17 || i18 > i15) {
                        r02.a("placeholder can not overlap with paragraph.");
                    }
                    list2 = list5;
                    arrayList4.add(new nj(i17 - i14, i18 - i14, njVar6.a));
                } else {
                    list2 = list5;
                }
                i16++;
                list5 = list2;
                ck3Var = ck3Var3;
            }
            arrayList3.add(new zj3(new xd(substring, m65Var3, o91Var5, arrayList4, kj1Var, iu0Var, z), i14, i15));
            i13++;
            ojVar2 = ojVar;
            m65Var2 = m65Var;
            str2 = str;
            size2 = i2;
        }
        this.e = arrayList3;
    }

    @Override // defpackage.ak3
    public boolean a() {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((zj3) arrayList.get(i)).a.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ak3
    public float b() {
        return ((Number) ((uc2) this.c).getValue()).floatValue();
    }

    @Override // defpackage.ak3
    public float c() {
        return ((Number) ((uc2) this.d).getValue()).floatValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r6.getRunCount() == 1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.text.Bidi d(int r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.a
            android.text.Layout r0 = (android.text.Layout) r0
            java.lang.Object r1 = r14.b
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r14.c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r14.d
            boolean[] r3 = (boolean[]) r3
            boolean r4 = r3[r15]
            if (r4 == 0) goto L1b
            java.lang.Object r14 = r2.get(r15)
            java.text.Bidi r14 = (java.text.Bidi) r14
            return r14
        L1b:
            r4 = 0
            if (r15 != 0) goto L20
            r5 = r4
            goto L2c
        L20:
            int r5 = r15 + (-1)
            java.lang.Object r5 = r1.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
        L2c:
            java.lang.Object r1 = r1.get(r15)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r11 = r1 - r5
            java.lang.Object r6 = r14.e
            char[] r6 = (char[]) r6
            if (r6 == 0) goto L44
            int r7 = r6.length
            if (r7 >= r11) goto L42
            goto L44
        L42:
            r7 = r6
            goto L47
        L44:
            char[] r6 = new char[r11]
            goto L42
        L47:
            java.lang.CharSequence r6 = r0.getText()
            android.text.TextUtils.getChars(r6, r5, r1, r7, r4)
            boolean r1 = java.text.Bidi.requiresBidi(r7, r4, r11)
            r5 = 0
            r13 = 1
            if (r1 == 0) goto L76
            int r1 = r14.h(r15)
            int r1 = r0.getLineForOffset(r1)
            int r0 = r0.getParagraphDirection(r1)
            r1 = -1
            if (r0 != r1) goto L67
            r12 = r13
            goto L68
        L67:
            r12 = r4
        L68:
            java.text.Bidi r6 = new java.text.Bidi
            r9 = 0
            r10 = 0
            r8 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            int r0 = r6.getRunCount()
            if (r0 != r13) goto L77
        L76:
            r6 = r5
        L77:
            r2.set(r15, r6)
            r3[r15] = r13
            if (r6 == 0) goto L87
            java.lang.Object r15 = r14.e
            char[] r15 = (char[]) r15
            if (r7 != r15) goto L86
            r7 = r5
            goto L87
        L86:
            r7 = r15
        L87:
            r14.e = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zw.d(int):java.text.Bidi");
    }

    public float e(int i, boolean z) {
        Layout layout = (Layout) this.a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public float f(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        Layout layout = (Layout) this.a;
        if (!z2) {
            return e(i, z);
        }
        int J = k21.J(layout, i, z2);
        int lineStart = layout.getLineStart(J);
        int lineEnd = layout.getLineEnd(J);
        if (i != lineStart && i != lineEnd) {
            return e(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return e(i, z);
        }
        int g = g(i, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(h(g))) == -1;
        int i4 = i(lineEnd, lineStart);
        int h = h(g);
        int i5 = lineStart - h;
        int i6 = i4 - h;
        Bidi d = d(g);
        Bidi createLineBidi = d != null ? d.createLineBidi(i5, i6) : null;
        if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
            boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == isRtlCharAt) {
                z3 = !z3;
            }
            return i == lineStart ? z3 : !z3 ? layout.getLineLeft(J) : layout.getLineRight(J);
        }
        int runCount = createLineBidi.getRunCount();
        fa2[] fa2VarArr = new fa2[runCount];
        for (int i7 = 0; i7 < runCount; i7++) {
            fa2VarArr[i7] = new fa2(createLineBidi.getRunStart(i7) + lineStart, createLineBidi.getRunLimit(i7) + lineStart, createLineBidi.getRunLevel(i7) % 2 == 1);
        }
        int runCount2 = createLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i8 = 0; i8 < runCount2; i8++) {
            bArr[i8] = (byte) createLineBidi.getRunLevel(i8);
        }
        Bidi.reorderVisually(bArr, 0, fa2VarArr, 0, runCount);
        if (i == lineStart) {
            int i9 = 0;
            while (true) {
                if (i9 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (fa2VarArr[i9].a == i) {
                    i3 = i9;
                    break;
                }
                i9++;
            }
            boolean z4 = (z || z3 == fa2VarArr[i3].c) ? !z3 : z3;
            return (i3 == 0 && z4) ? layout.getLineLeft(J) : (i3 != runCount - 1 || z4) ? z4 ? layout.getPrimaryHorizontal(fa2VarArr[i3 - 1].a) : layout.getPrimaryHorizontal(fa2VarArr[i3 + 1].a) : layout.getLineRight(J);
        }
        int i10 = i > i4 ? i(i, lineStart) : i;
        int i11 = 0;
        while (true) {
            if (i11 >= runCount) {
                i2 = -1;
                break;
            }
            if (fa2VarArr[i11].b == i10) {
                i2 = i11;
                break;
            }
            i11++;
        }
        boolean z5 = (z || z3 == fa2VarArr[i2].c) ? z3 : !z3;
        return (i2 == 0 && z5) ? layout.getLineLeft(J) : (i2 != runCount - 1 || z5) ? z5 ? layout.getPrimaryHorizontal(fa2VarArr[i2 - 1].b) : layout.getPrimaryHorizontal(fa2VarArr[i2 + 1].b) : layout.getLineRight(J);
    }

    public int g(int i, boolean z) {
        ArrayList arrayList = (ArrayList) this.b;
        int B = p70.B(arrayList, Integer.valueOf(i));
        int i2 = B < 0 ? -(B + 1) : B + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public int h(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.b).get(i - 1)).intValue();
    }

    public int i(int i, int i2) {
        while (i > i2) {
            char charAt = ((Layout) this.a).getText().charAt(i - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((j42.m(charAt, 8192) < 0 || j42.m(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public zw(Layout layout) {
        this.a = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int I = jx4.I(((Layout) this.a).getText(), '\n', i, 4);
            i = I < 0 ? ((Layout) this.a).getText().length() : I + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < ((Layout) this.a).getText().length());
        this.b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        this.c = arrayList2;
        this.d = new boolean[((ArrayList) this.b).size()];
        ((ArrayList) this.b).size();
    }
}

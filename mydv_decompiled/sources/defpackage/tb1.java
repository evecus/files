package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class tb1 {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public tb1(long j, byte[] bArr, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }

    public static tb1 a(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[xb1.D[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new tb1(wrap.array(), 4, 1);
    }

    public static tb1 b(vb1 vb1Var, ByteOrder byteOrder) {
        vb1[] vb1VarArr = {vb1Var};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[xb1.D[5]]);
        wrap.order(byteOrder);
        vb1 vb1Var2 = vb1VarArr[0];
        wrap.putInt((int) vb1Var2.a);
        wrap.putInt((int) vb1Var2.b);
        return new tb1(wrap.array(), 5, 1);
    }

    public static tb1 c(int i, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[xb1.D[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i}[0]);
        return new tb1(wrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) {
        Object g = g(byteOrder);
        if (g == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (g instanceof String) {
            return Double.parseDouble((String) g);
        }
        if (g instanceof long[]) {
            if (((long[]) g).length == 1) {
                return r3[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g instanceof int[]) {
            if (((int[]) g).length == 1) {
                return r3[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g instanceof double[]) {
            double[] dArr = (double[]) g;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g instanceof vb1[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        vb1[] vb1VarArr = (vb1[]) g;
        if (vb1VarArr.length == 1) {
            return vb1VarArr[0].a();
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final int e(ByteOrder byteOrder) {
        Object g = g(byteOrder);
        if (g == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (g instanceof String) {
            return Integer.parseInt((String) g);
        }
        if (g instanceof long[]) {
            long[] jArr = (long[]) g;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) g;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String f(ByteOrder byteOrder) {
        Object g = g(byteOrder);
        if (g == null) {
            return null;
        }
        if (g instanceof String) {
            return (String) g;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (g instanceof long[]) {
            long[] jArr = (long[]) g;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (g instanceof int[]) {
            int[] iArr = (int[]) g;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (g instanceof double[]) {
            double[] dArr = (double[]) g;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(g instanceof vb1[])) {
            return null;
        }
        vb1[] vb1VarArr = (vb1[]) g;
        while (i < vb1VarArr.length) {
            sb.append(vb1VarArr[i].a);
            sb.append('/');
            sb.append(vb1VarArr[i].b);
            i++;
            if (i != vb1VarArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:107:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v14, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v15, types: [long[]] */
    /* JADX WARN: Type inference failed for: r13v16, types: [vb1[]] */
    /* JADX WARN: Type inference failed for: r13v17, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v18, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v19, types: [vb1[]] */
    /* JADX WARN: Type inference failed for: r13v20, types: [double[]] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v22, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable g(java.nio.ByteOrder r13) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tb1.g(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(xb1.C[this.a]);
        sb.append(", data length:");
        return nt3.n(sb, this.d.length, ")");
    }

    public tb1(byte[] bArr, int i, int i2) {
        this(-1L, bArr, i, i2);
    }
}

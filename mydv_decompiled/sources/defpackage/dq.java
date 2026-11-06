package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class dq extends i42 {
    public static boolean L0(int i, int[] iArr) {
        iArr.getClass();
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (i == iArr[i2]) {
                break;
            }
            i2++;
        }
        return i2 >= 0;
    }

    public static boolean M0(Object[] objArr, Object obj) {
        objArr.getClass();
        return f1(objArr, obj) >= 0;
    }

    public static boolean N0(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr != null && objArr2 != null && objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                Object obj2 = objArr2[i];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!N0((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if ((obj instanceof qc5) && (obj2 instanceof qc5)) {
                            if (!hc4.r(((qc5) obj).I, ((qc5) obj2).I)) {
                            }
                        } else if ((obj instanceof gd5) && (obj2 instanceof gd5)) {
                            if (!hc4.p(((gd5) obj).I, ((gd5) obj2).I)) {
                            }
                        } else if ((obj instanceof vc5) && (obj2 instanceof vc5)) {
                            if (!hc4.q(((vc5) obj).I, ((vc5) obj2).I)) {
                            }
                        } else if ((obj instanceof ad5) && (obj2 instanceof ad5)) {
                            if (!hc4.s(((ad5) obj).I, ((ad5) obj2).I)) {
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static void O0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void P0(int i, int i2, int i3, long[] jArr, long[] jArr2) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static void Q0(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static void R0(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static /* synthetic */ void S0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        O0(i, 0, i2, iArr, iArr2);
    }

    public static /* synthetic */ void T0(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        Q0(0, i, i2, objArr, objArr2);
    }

    public static void U0(float[] fArr, float[] fArr2, int i) {
        int length = (i & 8) != 0 ? fArr.length : 6;
        fArr.getClass();
        fArr2.getClass();
        System.arraycopy(fArr, 0, fArr2, 0, length);
    }

    public static byte[] V0(byte[] bArr, int i, int i2) {
        bArr.getClass();
        i42.n0(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static Object[] W0(Object[] objArr, int i, int i2) {
        objArr.getClass();
        i42.n0(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static void X0(int i, int i2, Object obj, Object[] objArr) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }

    public static void Y0(int i, int i2, int i3, int[] iArr) {
        if ((i3 & 4) != 0) {
            i2 = iArr.length;
        }
        iArr.getClass();
        Arrays.fill(iArr, 0, i2, i);
    }

    public static void Z0(long[] jArr, long j) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j);
    }

    public static ArrayList b1(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static u22 c1(int[] iArr) {
        return new u22(0, iArr.length - 1, 1);
    }

    public static int d1(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static Object e1(int i, Object[] objArr) {
        objArr.getClass();
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static int f1(Object[] objArr, Object obj) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static String g1(byte[] bArr, tm1 tm1Var) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b : bArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) "");
            }
            sb.append((CharSequence) tm1Var.invoke(Byte.valueOf(b)));
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static String h1(Object[] objArr, String str, tm1 tm1Var, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str2 = (i & 2) != 0 ? "" : "innermostOf(";
        String str3 = (i & 4) == 0 ? ")" : "";
        if ((i & 32) != 0) {
            tm1Var = null;
        }
        objArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            qi4.a(sb, obj, tm1Var);
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static Float i1(float[] fArr) {
        fArr.getClass();
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    public static int j1(int[] iArr) {
        if (iArr.length == 0) {
            zy.k();
            return 0;
        }
        int i = iArr[0];
        int i2 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i3 = iArr[i2];
                if (i < i3) {
                    i = i3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public static float[] k1(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        int length2 = fArr2.length;
        float[] copyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(fArr2, 0, copyOf, length, length2);
        return copyOf;
    }

    public static char l1(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            s83.l("Array is empty.");
            return (char) 0;
        }
        if (length == 1) {
            return cArr[0];
        }
        s83.t("Array has more than one element.");
        return (char) 0;
    }

    public static List m1(int i, byte[] bArr) {
        if (i < 0) {
            s83.h(r7.z("Requested element count ", i, " is less than zero."));
            return null;
        }
        if (i != 0) {
            int i2 = 0;
            if (i < bArr.length) {
                if (i == 1) {
                    return p70.j0(Byte.valueOf(bArr[0]));
                }
                ArrayList arrayList = new ArrayList(i);
                int length = bArr.length;
                int i3 = 0;
                while (i2 < length) {
                    arrayList.add(Byte.valueOf(bArr[i2]));
                    i3++;
                    if (i3 == i) {
                        break;
                    }
                    i2++;
                }
                return arrayList;
            }
            int length2 = bArr.length;
            if (length2 != 0) {
                if (length2 == 1) {
                    return p70.j0(Byte.valueOf(bArr[0]));
                }
                ArrayList arrayList2 = new ArrayList(bArr.length);
                int length3 = bArr.length;
                while (i2 < length3) {
                    arrayList2.add(Byte.valueOf(bArr[i2]));
                    i2++;
                }
                return arrayList2;
            }
        }
        return o91.I;
    }

    public static List n1(int[] iArr) {
        iArr.getClass();
        int length = iArr.length;
        if (length == 0) {
            return o91.I;
        }
        if (length == 1) {
            return p70.j0(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static List o1(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return o91.I;
        }
        if (length == 1) {
            return p70.j0(objArr[0]);
        }
        List asList = Arrays.asList(Arrays.copyOf(objArr, objArr.length));
        asList.getClass();
        return asList;
    }

    public static Set p1(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return t91.I;
        }
        if (length == 1) {
            Set singleton = Collections.singleton(objArr[0]);
            singleton.getClass();
            return singleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(sv2.J(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }
}

package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ow extends f83 {
    public final /* synthetic */ byte e;

    public static int[] g(String str) {
        return new int[]{((Number) f83.a.d(str)).intValue()};
    }

    public static long[] h(String str) {
        return new long[]{((Number) f83.b.d(str)).longValue()};
    }

    public static boolean[] i(String str) {
        return new boolean[]{((Boolean) f83.c.d(str)).booleanValue()};
    }

    @Override // defpackage.f83
    public final Object a(Bundle bundle, String str) {
        switch (this.e) {
            case 0:
                bundle.getClass();
                if (!bundle.containsKey(str) || sp0.Y(bundle, str)) {
                    return null;
                }
                boolean[] booleanArray = bundle.getBooleanArray(str);
                if (booleanArray != null) {
                    return booleanArray;
                }
                jl2.W(str);
                throw null;
            case 1:
                bundle.getClass();
                if (!bundle.containsKey(str) || sp0.Y(bundle, str)) {
                    return null;
                }
                float[] floatArray = bundle.getFloatArray(str);
                if (floatArray != null) {
                    return floatArray;
                }
                jl2.W(str);
                throw null;
            case 2:
                bundle.getClass();
                if (!bundle.containsKey(str) || sp0.Y(bundle, str)) {
                    return null;
                }
                int[] intArray = bundle.getIntArray(str);
                if (intArray != null) {
                    return intArray;
                }
                jl2.W(str);
                throw null;
            case 3:
                bundle.getClass();
                if (!bundle.containsKey(str) || sp0.Y(bundle, str)) {
                    return null;
                }
                long[] longArray = bundle.getLongArray(str);
                if (longArray != null) {
                    return longArray;
                }
                jl2.W(str);
                throw null;
            default:
                bundle.getClass();
                if (!bundle.containsKey(str) || sp0.Y(bundle, str)) {
                    return null;
                }
                String[] stringArray = bundle.getStringArray(str);
                if (stringArray != null) {
                    return stringArray;
                }
                jl2.W(str);
                throw null;
        }
    }

    @Override // defpackage.f83
    public final String b() {
        switch (this.e) {
            case 0:
                return "boolean[]";
            case 1:
                return "float[]";
            case 2:
                return "integer[]";
            case 3:
                return "long[]";
            default:
                return "string[]";
        }
    }

    @Override // defpackage.f83
    public final Object c(Object obj, String str) {
        switch (this.e) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return i(str);
                }
                boolean[] i = i(str);
                int length = zArr.length;
                boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(i, 0, copyOf, length, 1);
                return copyOf;
            case 1:
                float[] fArr = (float[]) obj;
                return fArr != null ? dq.k1(fArr, new float[]{Float.parseFloat(str)}) : new float[]{Float.parseFloat(str)};
            case 2:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return g(str);
                }
                int[] g = g(str);
                int length2 = iArr.length;
                int[] copyOf2 = Arrays.copyOf(iArr, length2 + 1);
                System.arraycopy(g, 0, copyOf2, length2, 1);
                return copyOf2;
            case 3:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return h(str);
                }
                long[] h = h(str);
                int length3 = jArr.length;
                long[] copyOf3 = Arrays.copyOf(jArr, length3 + 1);
                System.arraycopy(h, 0, copyOf3, length3, 1);
                return copyOf3;
            default:
                String[] strArr = (String[]) obj;
                if (strArr == null) {
                    return new String[]{str};
                }
                String[] strArr2 = {str};
                int length4 = strArr.length;
                Object[] copyOf4 = Arrays.copyOf(strArr, length4 + 1);
                System.arraycopy(strArr2, 0, copyOf4, length4, 1);
                return (String[]) copyOf4;
        }
    }

    @Override // defpackage.f83
    public final Object d(String str) {
        switch (this.e) {
            case 0:
                return i(str);
            case 1:
                return new float[]{Float.parseFloat(str)};
            case 2:
                return g(str);
            case 3:
                return h(str);
            default:
                return new String[]{str};
        }
    }

    @Override // defpackage.f83
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.e) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                str.getClass();
                if (zArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putBooleanArray(str, zArr);
                    break;
                }
            case 1:
                float[] fArr = (float[]) obj;
                str.getClass();
                if (fArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putFloatArray(str, fArr);
                    break;
                }
            case 2:
                int[] iArr = (int[]) obj;
                str.getClass();
                if (iArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putIntArray(str, iArr);
                    break;
                }
            case 3:
                long[] jArr = (long[]) obj;
                str.getClass();
                if (jArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putLongArray(str, jArr);
                    break;
                }
            default:
                String[] strArr = (String[]) obj;
                str.getClass();
                if (strArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putStringArray(str, strArr);
                    break;
                }
        }
    }

    @Override // defpackage.f83
    public final boolean f(Object obj, Object obj2) {
        Boolean[] boolArr;
        Float[] fArr;
        Integer[] numArr;
        Long[] lArr;
        Object[] objArr = null;
        int i = 0;
        switch (this.e) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                boolean[] zArr2 = (boolean[]) obj2;
                if (zArr != null) {
                    boolArr = new Boolean[zArr.length];
                    int length = zArr.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        boolArr[i2] = Boolean.valueOf(zArr[i2]);
                    }
                } else {
                    boolArr = null;
                }
                if (zArr2 != null) {
                    objArr = new Boolean[zArr2.length];
                    int length2 = zArr2.length;
                    while (i < length2) {
                        objArr[i] = Boolean.valueOf(zArr2[i]);
                        i++;
                    }
                }
                return dq.N0(boolArr, objArr);
            case 1:
                float[] fArr2 = (float[]) obj;
                float[] fArr3 = (float[]) obj2;
                if (fArr2 != null) {
                    fArr = new Float[fArr2.length];
                    int length3 = fArr2.length;
                    for (int i3 = 0; i3 < length3; i3++) {
                        fArr[i3] = Float.valueOf(fArr2[i3]);
                    }
                } else {
                    fArr = null;
                }
                if (fArr3 != null) {
                    objArr = new Float[fArr3.length];
                    int length4 = fArr3.length;
                    while (i < length4) {
                        objArr[i] = Float.valueOf(fArr3[i]);
                        i++;
                    }
                }
                return dq.N0(fArr, objArr);
            case 2:
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                if (iArr != null) {
                    numArr = new Integer[iArr.length];
                    int length5 = iArr.length;
                    for (int i4 = 0; i4 < length5; i4++) {
                        numArr[i4] = Integer.valueOf(iArr[i4]);
                    }
                } else {
                    numArr = null;
                }
                if (iArr2 != null) {
                    objArr = new Integer[iArr2.length];
                    int length6 = iArr2.length;
                    while (i < length6) {
                        objArr[i] = Integer.valueOf(iArr2[i]);
                        i++;
                    }
                }
                return dq.N0(numArr, objArr);
            case 3:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                if (jArr != null) {
                    lArr = new Long[jArr.length];
                    int length7 = jArr.length;
                    for (int i5 = 0; i5 < length7; i5++) {
                        lArr[i5] = Long.valueOf(jArr[i5]);
                    }
                } else {
                    lArr = null;
                }
                if (jArr2 != null) {
                    objArr = new Long[jArr2.length];
                    int length8 = jArr2.length;
                    while (i < length8) {
                        objArr[i] = Long.valueOf(jArr2[i]);
                        i++;
                    }
                }
                return dq.N0(lArr, objArr);
            default:
                return dq.N0((String[]) obj, (String[]) obj2);
        }
    }
}

package defpackage;

import android.util.Log;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class cp0 {
    public final LinkedHashMap a;

    public cp0(byte b) {
        switch (b) {
            case 2:
                this.a = new LinkedHashMap();
                break;
            case 3:
                this.a = new LinkedHashMap();
                break;
            case 4:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = new LinkedHashMap();
                break;
        }
    }

    public static String e(int i, int i2, String str) {
        return i + '-' + i2 + '-' + str;
    }

    public void a(kz2 kz2Var) {
        kz2Var.getClass();
        byte b = kz2Var.a;
        byte b2 = kz2Var.b;
        Integer valueOf = Integer.valueOf(b);
        LinkedHashMap linkedHashMap = this.a;
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new TreeMap();
            linkedHashMap.put(valueOf, obj);
        }
        TreeMap treeMap = (TreeMap) obj;
        if (treeMap.containsKey(Integer.valueOf(b2))) {
            Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(b2)) + " with " + kz2Var);
        }
        treeMap.put(Integer.valueOf(b2), kz2Var);
    }

    public ArrayList b() {
        String str;
        ArrayList P = p70.P(this.a.values());
        ArrayList arrayList = new ArrayList();
        int size = P.size();
        int i = 0;
        while (i < size) {
            Object obj = P.get(i);
            i++;
            f13 f13Var = (f13) obj;
            String str2 = null;
            d13 d13Var = f13Var instanceof d13 ? (d13) f13Var : null;
            if (d13Var != null) {
                byte[] bArr = d13Var.a;
                Charset charset = g13.a;
                if (bArr.length == 0) {
                    str = "";
                } else {
                    try {
                        str = new String(bArr, g13.a);
                    } catch (Exception unused) {
                        str = null;
                    }
                }
                if (str != null && str.length() > 0) {
                    str2 = str;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public dp0 c() {
        dp0 dp0Var = new dp0(this.a);
        c5.j0(dp0Var);
        return dp0Var;
    }

    public ArrayList d(int i) {
        Iterable<f13> iterable = (List) this.a.get(Integer.valueOf(i));
        if (iterable == null) {
            iterable = o91.I;
        }
        ArrayList arrayList = new ArrayList();
        for (f13 f13Var : iterable) {
            d13 d13Var = f13Var instanceof d13 ? (d13) f13Var : null;
            byte[] bArr = d13Var != null ? d13Var.a : null;
            if (bArr != null) {
                arrayList.add(bArr);
            }
        }
        return arrayList;
    }

    public long f(int i) {
        Long g = g(i);
        if (g != null) {
            return g.longValue();
        }
        return 0L;
    }

    public Long g(int i) {
        List<f13> list = (List) this.a.get(Integer.valueOf(i));
        if (list != null) {
            for (f13 f13Var : list) {
                e13 e13Var = f13Var instanceof e13 ? (e13) f13Var : null;
                Long valueOf = e13Var != null ? Long.valueOf(e13Var.a) : null;
                if (valueOf != null) {
                    return valueOf;
                }
            }
        }
        return null;
    }

    public void h(Object obj, String str) {
        Object[] objArr;
        str.getClass();
        if (obj == null) {
            obj = null;
        } else {
            k60 a = s24.a(obj.getClass());
            if (!a.equals(s24.a(Boolean.TYPE)) && !a.equals(s24.a(Byte.TYPE)) && !a.equals(s24.a(Integer.TYPE)) && !a.equals(s24.a(Long.TYPE)) && !a.equals(s24.a(Float.TYPE)) && !a.equals(s24.a(Double.TYPE)) && !a.equals(s24.a(String.class)) && !a.equals(s24.a(Boolean[].class)) && !a.equals(s24.a(Byte[].class)) && !a.equals(s24.a(Integer[].class)) && !a.equals(s24.a(Long[].class)) && !a.equals(s24.a(Float[].class)) && !a.equals(s24.a(Double[].class)) && !a.equals(s24.a(String[].class))) {
                int i = 0;
                if (a.equals(s24.a(boolean[].class))) {
                    boolean[] zArr = (boolean[]) obj;
                    String str2 = np0.a;
                    int length = zArr.length;
                    objArr = new Boolean[length];
                    while (i < length) {
                        objArr[i] = Boolean.valueOf(zArr[i]);
                        i++;
                    }
                } else if (a.equals(s24.a(byte[].class))) {
                    byte[] bArr = (byte[]) obj;
                    String str3 = np0.a;
                    int length2 = bArr.length;
                    objArr = new Byte[length2];
                    while (i < length2) {
                        objArr[i] = Byte.valueOf(bArr[i]);
                        i++;
                    }
                } else if (a.equals(s24.a(int[].class))) {
                    int[] iArr = (int[]) obj;
                    String str4 = np0.a;
                    int length3 = iArr.length;
                    objArr = new Integer[length3];
                    while (i < length3) {
                        objArr[i] = Integer.valueOf(iArr[i]);
                        i++;
                    }
                } else if (a.equals(s24.a(long[].class))) {
                    long[] jArr = (long[]) obj;
                    String str5 = np0.a;
                    int length4 = jArr.length;
                    objArr = new Long[length4];
                    while (i < length4) {
                        objArr[i] = Long.valueOf(jArr[i]);
                        i++;
                    }
                } else if (a.equals(s24.a(float[].class))) {
                    float[] fArr = (float[]) obj;
                    String str6 = np0.a;
                    int length5 = fArr.length;
                    objArr = new Float[length5];
                    while (i < length5) {
                        objArr[i] = Float.valueOf(fArr[i]);
                        i++;
                    }
                } else {
                    if (!a.equals(s24.a(double[].class))) {
                        j0.k("Key ", str, " has invalid type ", a);
                        return;
                    }
                    double[] dArr = (double[]) obj;
                    String str7 = np0.a;
                    int length6 = dArr.length;
                    objArr = new Double[length6];
                    while (i < length6) {
                        objArr[i] = Double.valueOf(dArr[i]);
                        i++;
                    }
                }
                obj = objArr;
            }
        }
        this.a.put(str, obj);
    }

    public void i(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            h(entry.getValue(), (String) entry.getKey());
        }
    }

    public wv4 j(nx5 nx5Var) {
        nx5Var.getClass();
        return (wv4) this.a.remove(nx5Var);
    }

    public List k(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.a;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (j42.c(((nx5) entry.getKey()).a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap2.remove((nx5) it.next());
        }
        return o70.r1(linkedHashMap.values());
    }

    public String l(int i) {
        String str = (String) o70.U0(m(i));
        return str == null ? "" : str;
    }

    public ArrayList m(int i) {
        String str;
        Iterable<f13> iterable = (List) this.a.get(Integer.valueOf(i));
        if (iterable == null) {
            iterable = o91.I;
        }
        ArrayList arrayList = new ArrayList();
        for (f13 f13Var : iterable) {
            String str2 = null;
            d13 d13Var = f13Var instanceof d13 ? (d13) f13Var : null;
            if (d13Var != null) {
                byte[] bArr = d13Var.a;
                Charset charset = g13.a;
                if (bArr.length == 0) {
                    str = "";
                } else {
                    try {
                        str = new String(bArr, g13.a);
                    } catch (Exception unused) {
                        str = null;
                    }
                }
                if (str != null && str.length() > 0) {
                    str2 = str;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public wv4 n(nx5 nx5Var) {
        LinkedHashMap linkedHashMap = this.a;
        Object obj = linkedHashMap.get(nx5Var);
        if (obj == null) {
            obj = new wv4(nx5Var);
            linkedHashMap.put(nx5Var, obj);
        }
        return (wv4) obj;
    }

    public cp0(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }
}

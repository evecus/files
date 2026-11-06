package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class i73 {
    public static final /* synthetic */ int M = 0;
    public final String I;
    public final c8 J;
    public k73 K;
    public final cu4 L;

    static {
        new LinkedHashMap();
    }

    public i73(u83 u83Var) {
        LinkedHashMap linkedHashMap = v83.b;
        this.I = sv2.D(u83Var.getClass());
        this.J = new c8(this);
        this.L = new cu4(0);
    }

    public final Bundle c(Bundle bundle) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.J.e;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle b0 = i42.b0((uj3[]) Arrays.copyOf(new uj3[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            ((n63) entry.getValue()).getClass();
            str.getClass();
        }
        if (bundle != null) {
            b0.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                n63 n63Var = (n63) entry2.getValue();
                n63Var.getClass();
                f83 f83Var = n63Var.a;
                str2.getClass();
                if (!b0.containsKey(str2) || !sp0.Y(b0, str2)) {
                    try {
                        f83Var.a(b0, str2);
                    } catch (IllegalStateException unused) {
                    }
                }
                zl1.j(r7.E("Wrong argument type for '", str2, "' in argument savedState. "), f83Var.b(), " expected.");
                return null;
            }
        }
        return b0;
    }

    public final Map d() {
        return sv2.X((LinkedHashMap) this.J.e);
    }

    public h73 e(pn pnVar) {
        boolean e;
        v24 v24Var;
        zv2 d;
        c8 c8Var = this.J;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c8Var.e;
        Uri uri = (Uri) pnVar.b;
        ArrayList arrayList = (ArrayList) c8Var.d;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        h73 h73Var = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            f73 f73Var = (f73) obj;
            f73Var.getClass();
            u05 u05Var = f73Var.d;
            if (((v24) u05Var.getValue()) == null) {
                e = true;
            } else if (uri == null) {
                e = false;
            } else {
                v24 v24Var2 = (v24) u05Var.getValue();
                v24Var2.getClass();
                e = v24Var2.e(uri.toString());
            }
            if (e) {
                Bundle d2 = uri != null ? f73Var.d(uri, linkedHashMap) : null;
                int b = f73Var.b(uri);
                String str = (String) pnVar.c;
                boolean z = str != null && str.equals(null);
                if (d2 == null) {
                    if (z) {
                        Bundle b0 = i42.b0((uj3[]) Arrays.copyOf(new uj3[0], 0));
                        if (uri != null && (v24Var = (v24) u05Var.getValue()) != null && (d = v24Var.d(uri.toString())) != null) {
                            f73Var.e(d, b0, linkedHashMap);
                            if (((Boolean) f73Var.e.getValue()).booleanValue()) {
                                f73Var.f(uri, b0, linkedHashMap);
                            }
                        }
                        if (sv2.N(linkedHashMap, new tf2(b0, (byte) 13)).isEmpty()) {
                        }
                    }
                }
                h73 h73Var2 = new h73((i73) c8Var.c, d2, f73Var.l, b, z);
                if (h73Var == null || h73Var2.compareTo(h73Var) > 0) {
                    h73Var = h73Var2;
                }
            }
        }
        return h73Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 1
            if (r10 != r11) goto L5
            goto Ld0
        L5:
            r1 = 0
            if (r11 == 0) goto Ld1
            boolean r2 = r11 instanceof defpackage.i73
            if (r2 != 0) goto Le
            goto Ld1
        Le:
            c8 r2 = r10.J
            java.lang.Object r3 = r2.d
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            i73 r11 = (defpackage.i73) r11
            cu4 r4 = r11.L
            c8 r5 = r11.J
            java.lang.Object r6 = r5.d
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r3 = r3.equals(r6)
            cu4 r6 = r10.L
            int r7 = r6.e()
            int r8 = r4.e()
            if (r7 != r8) goto L5e
            du4 r7 = new du4
            r7.<init>(r6)
            oj4 r7 = defpackage.qj4.w(r7)
            ng0 r7 = (defpackage.ng0) r7
            java.util.Iterator r7 = r7.iterator()
        L3d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L5c
            java.lang.Object r8 = r7.next()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            java.lang.Object r9 = defpackage.qb.y(r6, r8)
            java.lang.Object r8 = defpackage.qb.y(r4, r8)
            boolean r8 = defpackage.j42.c(r9, r8)
            if (r8 != 0) goto L3d
            goto L5e
        L5c:
            r4 = r0
            goto L5f
        L5e:
            r4 = r1
        L5f:
            java.util.Map r6 = r10.d()
            int r6 = r6.size()
            java.util.Map r7 = r11.d()
            int r7 = r7.size()
            if (r6 != r7) goto Lb5
            java.util.Map r10 = r10.d()
            java.util.Set r10 = r10.entrySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            r10.getClass()
            java.util.Iterator r10 = r10.iterator()
        L82:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto Lb3
            java.lang.Object r6 = r10.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.util.Map r7 = r11.d()
            java.lang.Object r8 = r6.getKey()
            boolean r7 = r7.containsKey(r8)
            if (r7 == 0) goto Lb5
            java.util.Map r7 = r11.d()
            java.lang.Object r8 = r6.getKey()
            java.lang.Object r7 = r7.get(r8)
            java.lang.Object r6 = r6.getValue()
            boolean r6 = defpackage.j42.c(r7, r6)
            if (r6 == 0) goto Lb5
            goto L82
        Lb3:
            r10 = r0
            goto Lb6
        Lb5:
            r10 = r1
        Lb6:
            int r11 = r2.b
            int r6 = r5.b
            if (r11 != r6) goto Ld1
            java.lang.Object r11 = r2.f
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r2 = r5.f
            java.lang.String r2 = (java.lang.String) r2
            boolean r11 = defpackage.j42.c(r11, r2)
            if (r11 == 0) goto Ld1
            if (r3 == 0) goto Ld1
            if (r4 == 0) goto Ld1
            if (r10 == 0) goto Ld1
        Ld0:
            return r0
        Ld1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i73.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        c8 c8Var = this.J;
        int i = c8Var.b * 31;
        String str = (String) c8Var.f;
        int hashCode = i + (str != null ? str.hashCode() : 0);
        ArrayList arrayList = (ArrayList) c8Var.d;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            hashCode = (((f73) obj).a.hashCode() + (hashCode * 31)) * 961;
        }
        cu4 cu4Var = this.L;
        cu4Var.getClass();
        if (cu4Var.e() > 0) {
            cu4Var.f(0).getClass();
            zl1.c();
            return 0;
        }
        for (String str2 : d().keySet()) {
            int n = hf1.n(hashCode * 31, 31, str2);
            Object obj2 = d().get(str2);
            hashCode = n + (obj2 != null ? obj2.hashCode() : 0);
        }
        return hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("(0x");
        c8 c8Var = this.J;
        c8Var.getClass();
        sb.append(Integer.toHexString(c8Var.b));
        sb.append(")");
        String str = (String) c8Var.f;
        if (str != null && !jx4.L(str)) {
            sb.append(" route=");
            sb.append((String) c8Var.f);
        }
        return sb.toString();
    }
}

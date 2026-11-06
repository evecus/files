package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Shader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class yv {
    public int a;
    public Object b;
    public Object c;

    public yv(byte b) {
        switch (b) {
            case 3:
                this.b = new int[16];
                this.c = new pp();
                break;
            default:
                this.b = new WeakHashMap();
                this.c = new BigInteger[8];
                this.a = 0;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01da, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01dc, code lost:
    
        r0 = new defpackage.g12(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e3, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f5, code lost:
    
        if (r11 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f8, code lost:
    
        if (r11 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fa, code lost:
    
        r16 = (int[]) r0.J;
        r17 = (float[]) r0.K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0208, code lost:
    
        if (r10 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x020a, code lost:
    
        if (r10 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x020c, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x021f, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r16, r17, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0268, code lost:
    
        return new defpackage.yv(r11, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0219, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x021c, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0223, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, (int[]) r0.J, (float[]) r0.K);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0235, code lost:
    
        if (r25 <= 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0237, code lost:
    
        r20 = (int[]) r0.J;
        r21 = (float[]) r0.K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0246, code lost:
    
        if (r10 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0249, code lost:
    
        if (r10 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x024b, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x025c, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r20, r21, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0256, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0259, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0270, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e7, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e9, code lost:
    
        r0 = new defpackage.g12(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r0 = new defpackage.g12(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.yv d(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv.d(android.content.res.Resources, int, android.content.res.Resources$Theme):yv");
    }

    public static int l(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int i4 = ((og2) list.get(i3)).a - i;
            if (i4 < 0) {
                i2 = i3 + 1;
            } else {
                if (i4 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public synchronized void a(BigInteger bigInteger) {
        ((WeakHashMap) this.b).put(bigInteger, Boolean.TRUE);
        BigInteger[] bigIntegerArr = (BigInteger[]) this.c;
        int i = this.a;
        bigIntegerArr[i] = bigInteger;
        this.a = (i + 1) % bigIntegerArr.length;
    }

    public boolean b(int i, int i2) {
        int i3 = i(i);
        return i3 == i2 || i3 == -1 || i3 == -2;
    }

    public synchronized boolean c(BigInteger bigInteger) {
        return ((WeakHashMap) this.b).containsKey(bigInteger);
    }

    public void e(int i, int i2) {
        if (i > 131072) {
            t02.a("Requested item capacity " + i + " is larger than max supported: 131072!");
        }
        int[] iArr = (int[]) this.b;
        if (iArr.length < i) {
            int length = iArr.length;
            while (length < i) {
                length *= 2;
            }
            int[] iArr2 = new int[length];
            dq.S0(i2, 0, 12, (int[]) this.b, iArr2);
            this.b = iArr2;
        }
    }

    public void f(int i) {
        pp ppVar = (pp) this.c;
        int i2 = this.a;
        int i3 = i - i2;
        if (i3 < 0 || i3 >= 131072) {
            int max = Math.max(i - (((int[]) this.b).length / 2), 0);
            this.a = max;
            int i4 = max - i2;
            int[] iArr = (int[]) this.b;
            if (i4 >= 0) {
                if (i4 < iArr.length) {
                    dq.O0(0, i4, iArr.length, iArr, iArr);
                }
                int[] iArr2 = (int[]) this.b;
                Arrays.fill(iArr2, Math.max(0, iArr2.length - i4), ((int[]) this.b).length, 0);
            } else {
                int i5 = -i4;
                if (iArr.length + i5 < 131072) {
                    e(iArr.length + i5 + 1, i5);
                } else {
                    if (i5 < iArr.length) {
                        dq.O0(i5, 0, iArr.length - i5, iArr, iArr);
                    }
                    int[] iArr3 = (int[]) this.b;
                    Arrays.fill(iArr3, 0, Math.min(iArr3.length, i5), 0);
                }
            }
        } else {
            e(i3 + 1, 0);
        }
        while (!ppVar.isEmpty() && ((og2) ppVar.first()).a < this.a) {
            ppVar.removeFirst();
        }
        while (!ppVar.isEmpty() && ((og2) ppVar.last()).a > this.a + ((int[]) this.b).length) {
            ppVar.removeLast();
        }
    }

    public int g(int i, int i2) {
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (!b(i, i2));
        return i;
    }

    public int[] h(int i) {
        pp ppVar = (pp) this.c;
        og2 og2Var = (og2) o70.V0(l(i, ppVar), ppVar);
        if (og2Var != null) {
            return og2Var.b;
        }
        return null;
    }

    public int i(int i) {
        int i2 = this.a;
        if (i < i2) {
            return -1;
        }
        if (i >= ((int[]) this.b).length + i2) {
            return -1;
        }
        return r2[i - i2] - 1;
    }

    public boolean j() {
        ColorStateList colorStateList;
        return ((Shader) this.b) == null && (colorStateList = (ColorStateList) this.c) != null && colorStateList.isStateful();
    }

    public void k() {
        dq.Y0(0, 0, 6, (int[]) this.b);
        ((pp) this.c).clear();
    }

    public void m(int i, int[] iArr) {
        pp ppVar = (pp) this.c;
        int l = l(i, ppVar);
        if (l < 0) {
            if (iArr == null) {
                return;
            }
            ppVar.add(-(l + 1), new og2(i, iArr));
        } else if (iArr == null) {
            ppVar.d(l);
        } else {
            ((og2) ppVar.get(l)).b = iArr;
        }
    }

    public void n(int i, int i2) {
        if (i < 0) {
            t02.a("Negative lanes are not supported");
        }
        f(i);
        ((int[]) this.b)[i - this.a] = i2 + 1;
    }

    public yv(Shader shader, ColorStateList colorStateList, int i) {
        this.b = shader;
        this.c = colorStateList;
        this.a = i;
    }
}

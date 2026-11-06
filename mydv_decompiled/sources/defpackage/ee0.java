package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class ee0 {
    public boolean a;
    public final Object b;

    public ee0() {
        this.a = true;
        this.b = Collections.singletonList(null);
    }

    public boolean a() {
        return this.a;
    }

    public boolean b(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            s83.d();
            return false;
        }
        if (((n84) this.b) == null) {
            return a();
        }
        char c = 2;
        for (int i2 = 0; i2 < i && c == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            ee0 ee0Var = r35.a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            c = 2;
                            break;
                    }
                }
                c = 0;
            }
            c = 1;
        }
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return a();
        }
        return false;
    }

    public void c() {
        this.a = false;
    }

    public void d(byte b) {
        ((yw0) this.b).q(String.valueOf(b));
    }

    public void e(char c) {
        yw0 yw0Var = (yw0) this.b;
        yw0Var.i(yw0Var.b, 1);
        char[] cArr = (char[]) yw0Var.c;
        int i = yw0Var.b;
        yw0Var.b = i + 1;
        cArr[i] = c;
    }

    public void f(int i) {
        ((yw0) this.b).q(String.valueOf(i));
    }

    public void g(long j) {
        ((yw0) this.b).q(String.valueOf(j));
    }

    public void h(String str) {
        str.getClass();
        ((yw0) this.b).q(str);
    }

    public void i(short s) {
        ((yw0) this.b).q(String.valueOf(s));
    }

    public void j(String str) {
        int i;
        str.getClass();
        yw0 yw0Var = (yw0) this.b;
        yw0Var.i(yw0Var.b, str.length() + 2);
        char[] cArr = (char[]) yw0Var.c;
        int i2 = yw0Var.b;
        int i3 = i2 + 1;
        cArr[i2] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i3);
        int i4 = length + i3;
        int i5 = i3;
        while (i5 < i4) {
            char c = cArr[i5];
            byte[] bArr = ex4.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i6 = i5 - i3; i6 < length2; i6++) {
                    yw0Var.i(i5, 2);
                    char charAt = str.charAt(i6);
                    byte[] bArr2 = ex4.b;
                    if (charAt < bArr2.length) {
                        byte b = bArr2[charAt];
                        if (b == 0) {
                            i = i5 + 1;
                            ((char[]) yw0Var.c)[i5] = charAt;
                        } else {
                            if (b == 1) {
                                String str2 = ex4.a[charAt];
                                str2.getClass();
                                yw0Var.i(i5, str2.length());
                                str2.getChars(0, str2.length(), (char[]) yw0Var.c, i5);
                                int length3 = str2.length() + i5;
                                yw0Var.b = length3;
                                i5 = length3;
                            } else {
                                char[] cArr2 = (char[]) yw0Var.c;
                                cArr2[i5] = '\\';
                                cArr2[i5 + 1] = (char) b;
                                i5 += 2;
                                yw0Var.b = i5;
                            }
                        }
                    } else {
                        i = i5 + 1;
                        ((char[]) yw0Var.c)[i5] = charAt;
                    }
                    i5 = i;
                }
                yw0Var.i(i5, 1);
                ((char[]) yw0Var.c)[i5] = '\"';
                yw0Var.b = i5 + 1;
                return;
            }
            i5++;
        }
        cArr[i4] = '\"';
        yw0Var.b = i4 + 1;
    }

    public ee0(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public ee0(n84 n84Var, boolean z) {
        this.b = n84Var;
        this.a = z;
    }

    public ee0(yw0 yw0Var) {
        this.b = yw0Var;
        this.a = true;
    }

    public ee0(ArrayList arrayList) {
        this.a = false;
        this.b = arrayList;
    }

    public void k() {
    }

    public void l() {
    }
}

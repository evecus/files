package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class c8 {
    public final /* synthetic */ byte a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public c8(b bVar) {
        this.a = (byte) 0;
        this.c = new a32(30);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.b = 0;
        this.f = bVar;
        this.g = new ep((Object) this, (byte) 11);
    }

    public static /* synthetic */ void s(c8 c8Var, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = c8Var.b;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        c8Var.r(str, i, str2);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b8 A(int i, int i2, int i3, Object obj) {
        b8 b8Var = (b8) ((a32) this.c).a();
        if (b8Var == null) {
            return new b8(i, i2, i3, obj);
        }
        b8Var.a = i;
        b8Var.b = i2;
        b8Var.d = i3;
        b8Var.c = obj;
        return b8Var;
    }

    public void B() {
        this.b = -1;
        L(null);
        b();
    }

    public void C(int i) {
        ColorStateList colorStateList;
        this.b = i;
        nl nlVar = (nl) this.d;
        if (nlVar != null) {
            Context context = ((View) this.c).getContext();
            synchronized (nlVar) {
                colorStateList = nlVar.a.i(context, i);
            }
        } else {
            colorStateList = null;
        }
        L(colorStateList);
        b();
    }

    public String D(String str, boolean z) {
        str.getClass();
        int i = this.b;
        try {
            if (g() == 6 && j42.c(F(z), str)) {
                this.e = null;
                if (g() == 5) {
                    return F(z);
                }
            }
            return null;
        } finally {
            this.b = i;
            this.e = null;
        }
    }

    public byte E() {
        String str = (String) this.g;
        int i = this.b;
        while (true) {
            int I = I(i);
            if (I == -1) {
                this.b = I;
                return (byte) 10;
            }
            char charAt = str.charAt(I);
            if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                this.b = I;
                return mw2.t(charAt);
            }
            i = I + 1;
        }
    }

    public String F(boolean z) {
        String l;
        byte E = E();
        if (z) {
            if (E != 1 && E != 0) {
                return null;
            }
            l = m();
        } else {
            if (E != 1) {
                return null;
            }
            l = l();
        }
        this.e = l;
        return l;
    }

    public void G(b8 b8Var) {
        b bVar = (b) this.f;
        ((ArrayList) this.e).add(b8Var);
        byte b = b8Var.a;
        if (b == 1) {
            bVar.d(b8Var.b, b8Var.d);
            return;
        }
        if (b == 2) {
            int i = b8Var.b;
            int i2 = b8Var.d;
            RecyclerView recyclerView = bVar.a;
            recyclerView.M(i, i2, false);
            recyclerView.Q0 = true;
            return;
        }
        if (b == 4) {
            bVar.c(b8Var.b, b8Var.d, b8Var.c);
        } else if (b == 8) {
            bVar.e(b8Var.b, b8Var.d);
        } else {
            hn3.i(b8Var, "Unknown update op type for ");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0123 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void H() {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c8.H():void");
    }

    public int I(int i) {
        if (i < ((String) this.g).length()) {
            return i;
        }
        return -1;
    }

    public void J(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            b8 b8Var = (b8) arrayList.get(i);
            b8Var.c = null;
            ((a32) this.c).e(b8Var);
        }
        arrayList.clear();
    }

    public void K(gv1 gv1Var) {
        int f1 = dq.f1((gv1[]) this.c, gv1Var);
        if (f1 >= 0) {
            gv1[] gv1VarArr = (gv1[]) this.c;
            int i = f1 + 1;
            dq.Q0(f1, i, this.b, gv1VarArr, gv1VarArr);
            gv1[] gv1VarArr2 = (gv1[]) this.c;
            int i2 = this.b;
            gv1VarArr2[i2 - 1] = null;
            float[] fArr = (float[]) this.d;
            System.arraycopy(fArr, i, fArr, f1, i2 - i);
            byte[] bArr = (byte[]) this.e;
            dq.R0(bArr, f1, i, bArr, this.b);
            this.b--;
        }
    }

    public void L(ColorStateList colorStateList) {
        if (colorStateList != null) {
            e85 e85Var = (e85) this.e;
            if (e85Var == null) {
                e85Var = new e85();
                this.e = e85Var;
            }
            e85Var.a = colorStateList;
            e85Var.d = true;
        } else {
            this.e = null;
        }
        b();
    }

    public void M(ColorStateList colorStateList) {
        e85 e85Var = (e85) this.f;
        if (e85Var == null) {
            e85Var = new e85();
            this.f = e85Var;
        }
        e85Var.a = colorStateList;
        e85Var.d = true;
        b();
    }

    public void N(PorterDuff.Mode mode) {
        e85 e85Var = (e85) this.f;
        if (e85Var == null) {
            e85Var = new e85();
            this.f = e85Var;
        }
        e85Var.b = mode;
        e85Var.c = true;
        b();
    }

    public int O() {
        char charAt;
        int i = this.b;
        if (i == -1) {
            return i;
        }
        String str = (String) this.g;
        while (i < str.length() && ((charAt = str.charAt(i)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i++;
        }
        this.b = i;
        return i;
    }

    public boolean P() {
        int O = O();
        String str = (String) this.g;
        if (O >= str.length() || O == -1 || str.charAt(O) != ',') {
            return false;
        }
        this.b++;
        return true;
    }

    public boolean Q(boolean z) {
        int I = I(O());
        String str = (String) this.g;
        int length = str.length() - I;
        if (length >= 4 && I != -1) {
            int i = 0;
            while (true) {
                if (i < 4) {
                    if ("null".charAt(i) != str.charAt(I + i)) {
                        break;
                    }
                    i++;
                } else if (length <= 4 || mw2.t(str.charAt(I + 4)) != 0) {
                    if (z) {
                        this.b = I + 4;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public void R(char c) {
        String str = (String) this.g;
        int i = this.b;
        if (i > 0 && c == '\"') {
            try {
                this.b = i - 1;
                String m = m();
                this.b = i;
                if (j42.c(m, "null")) {
                    r("Expected string literal but 'null' literal was found", this.b - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.b = i;
                throw th;
            }
        }
        String X = mw2.X(mw2.t(c));
        int i2 = this.b;
        int i3 = i2 > 0 ? i2 - 1 : i2;
        s(this, hf1.x("Expected ", X, ", but had '", (i2 == str.length() || i3 < 0) ? "EOF" : String.valueOf(str.charAt(i3)), "' instead"), i3, null, 4);
        throw null;
    }

    public int S(int i, int i2) {
        int i3;
        int i4;
        a32 a32Var = (a32) this.c;
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b8 b8Var = (b8) arrayList.get(size);
            byte b = b8Var.a;
            int i5 = b8Var.b;
            if (b == 8) {
                int i6 = b8Var.d;
                if (i5 < i6) {
                    i4 = i6;
                    i3 = i5;
                } else {
                    i3 = i6;
                    i4 = i5;
                }
                if (i < i3 || i > i4) {
                    if (i < i5) {
                        if (i2 == 1) {
                            b8Var.b = i5 + 1;
                            b8Var.d = i6 + 1;
                        } else if (i2 == 2) {
                            b8Var.b = i5 - 1;
                            b8Var.d = i6 - 1;
                        }
                    }
                } else if (i3 == i5) {
                    if (i2 == 1) {
                        b8Var.d = i6 + 1;
                    } else if (i2 == 2) {
                        b8Var.d = i6 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        b8Var.b = i5 + 1;
                    } else if (i2 == 2) {
                        b8Var.b = i5 - 1;
                    }
                    i--;
                }
            } else if (i5 <= i) {
                if (b == 1) {
                    i -= b8Var.d;
                } else if (b == 2) {
                    i += b8Var.d;
                }
            } else if (i2 == 1) {
                b8Var.b = i5 + 1;
            } else if (i2 == 2) {
                b8Var.b = i5 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            b8 b8Var2 = (b8) arrayList.get(size2);
            byte b2 = b8Var2.a;
            int i7 = b8Var2.d;
            if (b2 == 8) {
                if (i7 == b8Var2.b || i7 < 0) {
                    arrayList.remove(size2);
                    b8Var2.c = null;
                    a32Var.e(b8Var2);
                }
            } else if (i7 <= 0) {
                arrayList.remove(size2);
                b8Var2.c = null;
                a32Var.e(b8Var2);
            }
        }
        return i;
    }

    public int a(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.f).append((char) (u(charSequence, i + 3) + (u(charSequence, i) << 12) + (u(charSequence, i + 1) << 8) + (u(charSequence, i + 2) << 4)));
            return i2;
        }
        this.b = i;
        if (i2 < charSequence.length()) {
            return a(charSequence, this.b);
        }
        s(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public void b() {
        View view = (View) this.c;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((e85) this.e) != null) {
                e85 e85Var = (e85) this.g;
                if (e85Var == null) {
                    e85Var = new e85();
                    this.g = e85Var;
                }
                e85Var.a();
                WeakHashMap weakHashMap = dr5.a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    e85Var.d = true;
                    e85Var.a = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    e85Var.c = true;
                    e85Var.b = backgroundTintMode;
                }
                if (e85Var.d || e85Var.c) {
                    int[] drawableState = view.getDrawableState();
                    PorterDuff.Mode mode = nl.b;
                    z44.o(background, e85Var, drawableState);
                    return;
                }
            }
            e85 e85Var2 = (e85) this.f;
            if (e85Var2 != null) {
                int[] drawableState2 = view.getDrawableState();
                PorterDuff.Mode mode2 = nl.b;
                z44.o(background, e85Var2, drawableState2);
            } else {
                e85 e85Var3 = (e85) this.e;
                if (e85Var3 != null) {
                    int[] drawableState3 = view.getDrawableState();
                    PorterDuff.Mode mode3 = nl.b;
                    z44.o(background, e85Var3, drawableState3);
                }
            }
        }
    }

    public boolean c() {
        int i = this.b;
        if (i == -1) {
            return false;
        }
        String str = (String) this.g;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.b = i;
                return (charAt == ',' || charAt == ':' || charAt == ']' || charAt == '}') ? false : true;
            }
            i++;
        }
        this.b = i;
        return false;
    }

    public boolean d(int i) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            b8 b8Var = (b8) arrayList.get(i2);
            byte b = b8Var.a;
            if (b != 8) {
                if (b == 1) {
                    int i3 = b8Var.b;
                    int i4 = b8Var.d + i3;
                    while (i3 < i4) {
                        if (t(i3, i2 + 1) == i) {
                            return true;
                        }
                        i3++;
                    }
                } else {
                    continue;
                }
            } else {
                if (t(b8Var.d, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void e(int i, String str) {
        String str2 = (String) this.g;
        if (str2.length() - i < str.length()) {
            s(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                s(this, "Expected valid boolean literal prefix, but had '" + m() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.b = str.length() + i;
    }

    public String f() {
        String str;
        StringBuilder sb = (StringBuilder) this.f;
        String str2 = (String) this.g;
        i('\"');
        int i = this.b;
        int I = jx4.I(str2, '\"', i, 4);
        if (I == -1) {
            m();
            int i2 = this.b;
            s(this, r7.C("Expected quotation mark '\"', but had '", (i2 == str2.length() || i2 < 0) ? "EOF" : String.valueOf(str2.charAt(i2)), "' instead"), i2, null, 4);
            throw null;
        }
        int i3 = i;
        while (i3 < I) {
            if (str2.charAt(i3) == '\\') {
                int i4 = this.b;
                char charAt = str2.charAt(i3);
                boolean z = false;
                while (charAt != '\"') {
                    if (charAt == '\\') {
                        sb.append((CharSequence) str2, i4, i3);
                        int I2 = I(i3 + 1);
                        if (I2 == -1) {
                            s(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int i5 = I2 + 1;
                        char charAt2 = str2.charAt(I2);
                        if (charAt2 == 'u') {
                            i5 = a(str2, i5);
                        } else {
                            char c = charAt2 < 'u' ? j50.a[charAt2] : (char) 0;
                            if (c == 0) {
                                s(this, "Invalid escaped char '" + charAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb.append(c);
                        }
                        i4 = I(i5);
                        if (i4 == -1) {
                            s(this, "Unexpected EOF", i4, null, 4);
                            throw null;
                        }
                    } else {
                        i3++;
                        if (i3 >= str2.length()) {
                            sb.append((CharSequence) str2, i4, i3);
                            i4 = I(i3);
                            if (i4 == -1) {
                                s(this, "Unexpected EOF", i4, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            charAt = str2.charAt(i3);
                        }
                    }
                    i3 = i4;
                    z = true;
                    charAt = str2.charAt(i3);
                }
                if (z) {
                    sb.append((CharSequence) str2, i4, i3);
                    String sb2 = sb.toString();
                    sb.setLength(0);
                    str = sb2;
                } else {
                    str = str2.subSequence(i4, i3).toString();
                }
                this.b = i3 + 1;
                return str;
            }
            i3++;
        }
        this.b = I + 1;
        return str2.substring(i, I);
    }

    public byte g() {
        String str = (String) this.g;
        int i = this.b;
        while (i != -1 && i < str.length()) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.b = i2;
                return mw2.t(charAt);
            }
            i = i2;
        }
        this.b = str.length();
        return (byte) 10;
    }

    public byte h(byte b) {
        String str = (String) this.g;
        byte g = g();
        if (g == b) {
            return g;
        }
        String X = mw2.X(b);
        int i = this.b;
        int i2 = i > 0 ? i - 1 : i;
        s(this, hf1.x("Expected ", X, ", but had '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
        throw null;
    }

    public void i(char c) {
        int i = this.b;
        if (i == -1) {
            R(c);
            throw null;
        }
        String str = (String) this.g;
        while (i < str.length()) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.b = i2;
                if (charAt == c) {
                    return;
                }
                R(c);
                throw null;
            }
            i = i2;
        }
        this.b = -1;
        R(c);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01b6, code lost:
    
        s(r22, "Expected numeric literal", r12, null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01bc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0121, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0104, code lost:
    
        s(r22, "Unexpected symbol '" + r15 + "' in numeric literal", r12, null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0118, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011d, code lost:
    
        if (r12 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011f, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0122, code lost:
    
        if (r1 == r12) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0124, code lost:
    
        if (r14 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0128, code lost:
    
        if (r1 == (r12 - 1)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012e, code lost:
    
        if (r20 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0130, code lost:
    
        if (r3 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0138, code lost:
    
        if (r2.charAt(r12) != '\"') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013a, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013d, code lost:
    
        s(r22, "Expected closing quotation mark", r12, null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0144, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0145, code lost:
    
        s(r22, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014c, code lost:
    
        r22.b = r12;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0150, code lost:
    
        if (r21 == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0152, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0155, code lost:
    
        if (r11 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0157, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0166, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x016b, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0171, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0179, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017b, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a5, code lost:
    
        if (r14 == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a7, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ac, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01af, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b0, code lost:
    
        s(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x017e, code lost:
    
        s(r22, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0197, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0198, code lost:
    
        s(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x019e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x015f, code lost:
    
        if (r11 != true) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0161, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x019f, code lost:
    
        defpackage.s83.v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01a2, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a3, code lost:
    
        r10 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long j() {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c8.j():long");
    }

    public void k() {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((b) this.f).a((b8) arrayList.get(i));
        }
        J(arrayList);
        this.b = 0;
    }

    public String l() {
        String str = (String) this.e;
        if (str == null) {
            return f();
        }
        str.getClass();
        this.e = null;
        return str;
    }

    public String m() {
        String str;
        StringBuilder sb = (StringBuilder) this.f;
        String str2 = (String) this.g;
        String str3 = (String) this.e;
        if (str3 != null) {
            str3.getClass();
            this.e = null;
            return str3;
        }
        int O = O();
        if (O >= str2.length() || O == -1) {
            s(this, "EOF", O, null, 4);
            throw null;
        }
        byte t = mw2.t(str2.charAt(O));
        if (t == 1) {
            return l();
        }
        if (t != 0) {
            s(this, "Expected beginning of the string, but got " + str2.charAt(O), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (mw2.t(str2.charAt(O)) == 0) {
            O++;
            if (O >= str2.length()) {
                sb.append((CharSequence) str2, this.b, O);
                int I = I(O);
                if (I == -1) {
                    this.b = O;
                    sb.append((CharSequence) str2, 0, 0);
                    String sb2 = sb.toString();
                    sb.setLength(0);
                    return sb2;
                }
                O = I;
                z = true;
            }
        }
        int i = this.b;
        if (z) {
            sb.append((CharSequence) str2, i, O);
            String sb3 = sb.toString();
            sb.setLength(0);
            str = sb3;
        } else {
            str = str2.subSequence(i, O).toString();
        }
        this.b = O;
        return str;
    }

    public String n() {
        String m = m();
        if (!j42.c(m, "null") || ((String) this.g).charAt(this.b - 1) == '\"') {
            return m;
        }
        s(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public void o() {
        b bVar = (b) this.f;
        k();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            b8 b8Var = (b8) arrayList.get(i);
            byte b = b8Var.a;
            if (b == 1) {
                bVar.a(b8Var);
                bVar.d(b8Var.b, b8Var.d);
            } else if (b == 2) {
                bVar.a(b8Var);
                int i2 = b8Var.b;
                int i3 = b8Var.d;
                RecyclerView recyclerView = bVar.a;
                recyclerView.M(i2, i3, true);
                recyclerView.Q0 = true;
                recyclerView.N0.b += i3;
            } else if (b == 4) {
                bVar.a(b8Var);
                bVar.c(b8Var.b, b8Var.d, b8Var.c);
            } else if (b == 8) {
                bVar.a(b8Var);
                bVar.e(b8Var.b, b8Var.d);
            }
        }
        J(arrayList);
        this.b = 0;
    }

    public void p(b8 b8Var) {
        int i;
        a32 a32Var = (a32) this.c;
        byte b = b8Var.a;
        if (b == 1 || b == 8) {
            s83.t("should not dispatch add or move for pre layout");
            return;
        }
        int S = S(b8Var.b, b);
        int i2 = b8Var.b;
        byte b2 = b8Var.a;
        if (b2 == 2) {
            i = 0;
        } else {
            if (b2 != 4) {
                hn3.i(b8Var, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i3 = 1;
        for (int i4 = 1; i4 < b8Var.d; i4++) {
            int S2 = S((i * i4) + b8Var.b, b8Var.a);
            byte b3 = b8Var.a;
            if (b3 == 2 ? S2 != S : !(b3 == 4 && S2 == S + 1)) {
                b8 A = A(b3, S, i3, b8Var.c);
                q(A, i2);
                A.c = null;
                a32Var.e(A);
                if (b8Var.a == 4) {
                    i2 += i3;
                }
                i3 = 1;
                S = S2;
            } else {
                i3++;
            }
        }
        Object obj = b8Var.c;
        b8Var.c = null;
        a32Var.e(b8Var);
        if (i3 > 0) {
            b8 A2 = A(b8Var.a, S, i3, obj);
            q(A2, i2);
            A2.c = null;
            a32Var.e(A2);
        }
    }

    public void q(b8 b8Var, int i) {
        b bVar = (b) this.f;
        bVar.a(b8Var);
        byte b = b8Var.a;
        if (b != 2) {
            if (b == 4) {
                bVar.c(i, b8Var.d, b8Var.c);
                return;
            } else {
                s83.t("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i2 = b8Var.d;
        RecyclerView recyclerView = bVar.a;
        recyclerView.M(i, i2, true);
        recyclerView.Q0 = true;
        recyclerView.N0.b += i2;
    }

    public void r(String str, int i, String str2) {
        String a = ((g72) this.d).a();
        String str3 = (String) this.g;
        str3.getClass();
        throw new q62(mu0.s(i, str, a, str2, ((n62) this.c).j ? mu0.N(str3, i).toString() : null));
    }

    public int t(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        while (i2 < size) {
            b8 b8Var = (b8) arrayList.get(i2);
            byte b = b8Var.a;
            int i3 = b8Var.b;
            if (b == 8) {
                if (i3 == i) {
                    i = b8Var.d;
                } else {
                    if (i3 < i) {
                        i--;
                    }
                    if (b8Var.d <= i) {
                        i++;
                    }
                }
            } else if (i3 > i) {
                continue;
            } else if (b == 2) {
                int i4 = b8Var.d;
                if (i < i3 + i4) {
                    return -1;
                }
                i -= i4;
            } else if (b == 1) {
                i += b8Var.d;
            }
            i2++;
        }
        return i;
    }

    public String toString() {
        switch (this.a) {
            case 4:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.g);
                sb.append("', currentPosition=");
                return hf1.y(sb, this.b, ')');
            default:
                return super.toString();
        }
    }

    public int u(CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(i);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        s(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public ColorStateList v() {
        e85 e85Var = (e85) this.f;
        if (e85Var != null) {
            return e85Var.a;
        }
        return null;
    }

    public PorterDuff.Mode w() {
        e85 e85Var = (e85) this.f;
        if (e85Var != null) {
            return e85Var.b;
        }
        return null;
    }

    public boolean x() {
        return ((ArrayList) this.d).size() > 0;
    }

    public void y(AttributeSet attributeSet, int i) {
        ColorStateList i2;
        View view = (View) this.c;
        Context context = view.getContext();
        int[] iArr = qz3.y;
        pn N = pn.N(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) N.b;
        View view2 = (View) this.c;
        dr5.g(view2, view2.getContext(), iArr, attributeSet, (TypedArray) N.b, i);
        try {
            if (typedArray.hasValue(0)) {
                this.b = typedArray.getResourceId(0, -1);
                nl nlVar = (nl) this.d;
                Context context2 = view.getContext();
                int i3 = this.b;
                synchronized (nlVar) {
                    i2 = nlVar.a.i(context2, i3);
                }
                if (i2 != null) {
                    L(i2);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(N.t(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(h41.b(typedArray.getInt(2, -1), null));
            }
            N.T();
        } catch (Throwable th) {
            N.T();
            throw th;
        }
    }

    public h73 z(String str) {
        f73 f73Var;
        str.getClass();
        u05 u05Var = (u05) this.g;
        if (u05Var == null || (f73Var = (f73) u05Var.getValue()) == null) {
            return null;
        }
        int i = i73.M;
        Uri parse = Uri.parse("android-app://androidx.navigation/".concat(str));
        parse.getClass();
        Bundle d = f73Var.d(parse, (LinkedHashMap) this.e);
        if (d == null) {
            return null;
        }
        return new h73((i73) this.c, d, f73Var.l, f73Var.b(parse), false);
    }

    public c8(View view) {
        this.a = (byte) 1;
        this.b = -1;
        this.c = view;
        this.d = nl.a();
    }

    public c8(i73 i73Var) {
        this.a = (byte) 2;
        this.c = i73Var;
        this.d = new ArrayList();
        this.e = new LinkedHashMap();
    }

    public c8(String str, n62 n62Var) {
        this.a = (byte) 4;
        str.getClass();
        this.c = n62Var;
        this.d = new g72(n62Var);
        this.f = new StringBuilder();
        this.g = str;
    }

    public c8() {
        this.a = (byte) 3;
        this.c = new gv1[32];
        this.d = new float[32];
        this.e = new byte[32];
        o43 o43Var = ka4.a;
        this.f = new o43();
        this.g = new o43();
    }
}

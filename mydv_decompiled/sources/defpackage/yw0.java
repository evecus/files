package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class yw0 implements xw0 {
    public final /* synthetic */ byte a;
    public int b;
    public Object c;

    public yw0(byte b) {
        char[] cArr;
        this.a = b;
        switch (b) {
            case 5:
                this.c = new long[2];
                return;
            default:
                h50 h50Var = h50.c;
                synchronized (h50Var) {
                    pp ppVar = h50Var.a;
                    cArr = null;
                    char[] cArr2 = (char[]) (ppVar.isEmpty() ? null : ppVar.removeLast());
                    if (cArr2 != null) {
                        h50Var.b -= cArr2.length;
                        cArr = cArr2;
                    }
                }
                this.c = cArr == null ? new char[128] : cArr;
                return;
        }
    }

    public static void h(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = j42.m(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    @Override // defpackage.xw0
    public int a(int i, byte[] bArr) {
        xw0 xw0Var = (xw0) this.c;
        byte[] bArr2 = new byte[xw0Var.d()];
        xw0Var.a(0, bArr2);
        int i2 = this.b;
        System.arraycopy(bArr2, 0, bArr, i, i2);
        return i2;
    }

    @Override // defpackage.xw0
    public void b(byte b) {
        ((xw0) this.c).b(b);
    }

    @Override // defpackage.xw0
    public String c() {
        return ((xw0) this.c).c() + "/" + (this.b * 8);
    }

    @Override // defpackage.xw0
    public int d() {
        return this.b;
    }

    public void e(long j) {
        if (g(j)) {
            return;
        }
        int i = this.b;
        long[] jArr = (long[]) this.c;
        if (i >= jArr.length) {
            jArr = Arrays.copyOf(jArr, Math.max(i + 1, jArr.length * 2));
            this.c = jArr;
        }
        jArr[i] = j;
        if (i >= this.b) {
            this.b = i + 1;
        }
    }

    public void f() {
        this.b = 0;
    }

    public boolean g(long j) {
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.c)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public void i(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.c;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.c = Arrays.copyOf(cArr, i3);
        }
    }

    public long j(int i) {
        return ((long[]) this.c)[i];
    }

    public int k() {
        return this.b;
    }

    public boolean l() {
        return this.b == 0;
    }

    public void m(hm1 hm1Var, int i, int i2) {
        ((w64) this.c).e(new oz4(hm1Var), i, i2);
    }

    public void n() {
        h50 h50Var = h50.c;
        char[] cArr = (char[]) this.c;
        h50Var.getClass();
        synchronized (h50Var) {
            int i = h50Var.b;
            if (cArr.length + i < zp.a) {
                h50Var.b = i + cArr.length;
                h50Var.a.addLast(cArr);
            }
        }
    }

    public void o(long j) {
        int i = this.b;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.c)[i2]) {
                int i3 = this.b - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.c;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.b--;
                return;
            }
            i2++;
        }
    }

    public void p(int i) {
        int i2 = this.b;
        if (i < i2) {
            int i3 = i2 - 1;
            while (i < i3) {
                long[] jArr = (long[]) this.c;
                int i4 = i + 1;
                jArr[i] = jArr[i4];
                i = i4;
            }
            this.b--;
        }
    }

    public void q(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        i(this.b, length);
        str.getChars(0, str.length(), (char[]) this.c, this.b);
        this.b += length;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return new String((char[]) this.c, 0, this.b);
            default:
                return super.toString();
        }
    }

    @Override // defpackage.xw0
    public void update(byte[] bArr, int i, int i2) {
        ((xw0) this.c).update(bArr, i, i2);
    }

    public yw0(int i, xw0 xw0Var) {
        this.a = (byte) 0;
        this.c = xw0Var;
        this.b = i;
    }

    public yw0(int i, List list) {
        this.a = (byte) 3;
        this.b = i;
        this.c = list;
    }

    public yw0(w64 w64Var, int i) {
        this.a = (byte) 6;
        this.c = w64Var;
        this.a = (byte) 6;
        this.b = i;
    }
}

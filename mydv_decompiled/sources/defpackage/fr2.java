package defpackage;

import android.util.Log;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fr2 {
    public static final Object c = new Object();
    public static volatile fr2 d;
    public final /* synthetic */ byte a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ fr2(byte b, int i) {
        this.a = b;
        this.b = i;
    }

    public static fr2 e() {
        fr2 fr2Var;
        synchronized (c) {
            try {
                if (d == null) {
                    d = new fr2((byte) 0, 3);
                }
                fr2Var = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fr2Var;
    }

    public static String h(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public void a(String str, String str2) {
        if (this.b <= 3) {
            Log.d(str, str2);
        }
    }

    public void b(String str, String str2, Throwable th) {
        if (this.b <= 3) {
            Log.d(str, str2, th);
        }
    }

    public void c(String str, String str2) {
        if (this.b <= 6) {
            Log.e(str, str2);
        }
    }

    public void d(String str, String str2, Throwable th) {
        if (this.b <= 6) {
            Log.e(str, str2, th);
        }
    }

    public int f() {
        switch (this.a) {
        }
        return this.b;
    }

    public void g(String str, String str2) {
        if (this.b <= 4) {
            Log.i(str, str2);
        }
    }

    public void i(String str, String str2) {
        if (this.b <= 5) {
            Log.w(str, str2);
        }
    }
}

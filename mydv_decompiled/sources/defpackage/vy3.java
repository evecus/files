package defpackage;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class vy3 {
    public final uy3 a;
    public final String b;
    public final Bitmap c;
    public final String d;
    public final String e;
    public final boolean f;

    public /* synthetic */ vy3(uy3 uy3Var, String str, Bitmap bitmap, String str2, int i) {
        this((i & 1) != 0 ? uy3.I : uy3Var, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : bitmap, (i & 8) != 0 ? "" : str2, "", false);
    }

    public static vy3 a(vy3 vy3Var, uy3 uy3Var, String str, Bitmap bitmap, boolean z, int i) {
        if ((i & 1) != 0) {
            uy3Var = vy3Var.a;
        }
        uy3 uy3Var2 = uy3Var;
        if ((i & 2) != 0) {
            str = vy3Var.b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            bitmap = vy3Var.c;
        }
        Bitmap bitmap2 = bitmap;
        String str3 = vy3Var.d;
        String str4 = vy3Var.e;
        if ((i & 32) != 0) {
            z = vy3Var.f;
        }
        vy3Var.getClass();
        uy3Var2.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new vy3(uy3Var2, str2, bitmap2, str3, str4, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy3)) {
            return false;
        }
        vy3 vy3Var = (vy3) obj;
        return this.a == vy3Var.a && j42.c(this.b, vy3Var.b) && j42.c(this.c, vy3Var.c) && j42.c(this.d, vy3Var.d) && j42.c(this.e, vy3Var.e) && this.f == vy3Var.f;
    }

    public final int hashCode() {
        int n = hf1.n(this.a.hashCode() * 31, 31, this.b);
        Bitmap bitmap = this.c;
        return hf1.n(hf1.n((n + (bitmap == null ? 0 : bitmap.hashCode())) * 31, 31, this.d), 31, this.e) + (this.f ? 1231 : 1237);
    }

    public final String toString() {
        return "UiState(status=" + this.a + ", message=" + this.b + ", qrBitmap=" + this.c + ", cookieHeader=" + this.d + ", userNickname=" + this.e + ", codeInput=" + this.f + ")";
    }

    public vy3(uy3 uy3Var, String str, Bitmap bitmap, String str2, String str3, boolean z) {
        uy3Var.getClass();
        str.getClass();
        str2.getClass();
        this.a = uy3Var;
        this.b = str;
        this.c = bitmap;
        this.d = str2;
        this.e = str3;
        this.f = z;
    }
}

package defpackage;

import android.net.Uri;
import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class sk1 {
    public final Uri a;
    public final int b;
    public final int c;
    public final boolean d;
    public final String e;
    public final int f;

    public sk1(String str, String str2) {
        this.a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.b = 0;
        this.c = 400;
        this.d = false;
        this.e = str2;
        this.f = 0;
    }

    public final String a() {
        if (g()) {
            return this.a.getAuthority();
        }
        return null;
    }

    public final int b() {
        return this.b;
    }

    public final Uri c() {
        return this.a;
    }

    public final String d() {
        return this.e;
    }

    public final int e() {
        return this.c;
    }

    public final boolean f() {
        return this.d;
    }

    public final boolean g() {
        return Objects.equals(this.a.getScheme(), "systemfont");
    }

    public sk1(Uri uri, int i, int i2, boolean z, String str, int i3) {
        uri.getClass();
        this.a = uri;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = str;
        this.f = i3;
    }
}

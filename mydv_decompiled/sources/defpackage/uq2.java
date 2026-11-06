package defpackage;

import android.os.Build;
import java.util.Locale;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class uq2 {
    public static final uq2 b = a(new Locale[0]);
    public final wq2 a;

    public uq2(wq2 wq2Var) {
        this.a = wq2Var;
    }

    public static uq2 a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new uq2(new xq2(dl.a(localeArr))) : new uq2(new vq2(localeArr));
    }

    public static uq2 b(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(split[i]);
        }
        return a(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uq2) {
            return this.a.equals(((uq2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}

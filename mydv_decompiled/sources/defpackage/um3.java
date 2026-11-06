package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class um3 {
    public CharSequence a;
    public IconCompat b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;

    public static um3 a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        CharSequence charSequence = bundle.getCharSequence("name");
        IconCompat a = bundle2 != null ? IconCompat.a(bundle2) : null;
        String string = bundle.getString("uri");
        String string2 = bundle.getString("key");
        boolean z = bundle.getBoolean("isBot");
        boolean z2 = bundle.getBoolean("isImportant");
        um3 um3Var = new um3();
        um3Var.a = charSequence;
        um3Var.b = a;
        um3Var.c = string;
        um3Var.d = string2;
        um3Var.e = z;
        um3Var.f = z2;
        return um3Var;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.a);
        IconCompat iconCompat = this.b;
        Bundle bundle2 = null;
        if (iconCompat != null) {
            iconCompat.getClass();
            Bundle bundle3 = new Bundle();
            switch (iconCompat.a) {
                case -1:
                    bundle3.putParcelable("obj", (Parcelable) iconCompat.b);
                    break;
                case 0:
                default:
                    s83.t("Invalid icon");
                    return null;
                case 1:
                case 5:
                    bundle3.putParcelable("obj", (Bitmap) iconCompat.b);
                    break;
                case 2:
                case 4:
                case 6:
                    bundle3.putString("obj", (String) iconCompat.b);
                    break;
                case 3:
                    bundle3.putByteArray("obj", (byte[]) iconCompat.b);
                    break;
            }
            bundle3.putInt("type", iconCompat.a);
            bundle3.putInt("int1", iconCompat.e);
            bundle3.putInt("int2", iconCompat.f);
            bundle3.putString("string1", iconCompat.j);
            ColorStateList colorStateList = iconCompat.g;
            if (colorStateList != null) {
                bundle3.putParcelable("tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.h;
            if (mode != IconCompat.k) {
                bundle3.putString("tint_mode", mode.name());
            }
            bundle2 = bundle3;
        }
        bundle.putBundle("icon", bundle2);
        bundle.putString("uri", this.c);
        bundle.putString("key", this.d);
        bundle.putBoolean("isBot", this.e);
        bundle.putBoolean("isImportant", this.f);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof um3)) {
            return false;
        }
        um3 um3Var = (um3) obj;
        String str = this.d;
        String str2 = um3Var.d;
        return (str == null && str2 == null) ? Objects.equals(Objects.toString(this.a), Objects.toString(um3Var.a)) && Objects.equals(this.c, um3Var.c) && Boolean.valueOf(this.e).equals(Boolean.valueOf(um3Var.e)) && Boolean.valueOf(this.f).equals(Boolean.valueOf(um3Var.f)) : Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.d;
        return str != null ? str.hashCode() : Objects.hash(this.a, this.c, Boolean.valueOf(this.e), Boolean.valueOf(this.f));
    }
}

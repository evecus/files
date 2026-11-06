package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ii0 implements hi0, ji0 {
    public final /* synthetic */ byte a = 0;
    public ClipData b;
    public byte c;
    public int d;
    public Uri e;
    public Bundle f;

    public ii0(ii0 ii0Var) {
        ClipData clipData = ii0Var.b;
        clipData.getClass();
        this.b = clipData;
        byte b = ii0Var.c;
        if (b < 0) {
            Locale locale = Locale.US;
            s83.t("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (b > 5) {
            Locale locale2 = Locale.US;
            s83.t("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.c = b;
        int i = ii0Var.d;
        if ((i & 1) == i) {
            this.d = i;
            this.e = ii0Var.e;
            this.f = ii0Var.f;
            return;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    }

    @Override // defpackage.ji0
    public ClipData a() {
        return this.b;
    }

    @Override // defpackage.hi0
    public void b(Uri uri) {
        this.e = uri;
    }

    @Override // defpackage.hi0
    public ki0 build() {
        return new ki0(new ii0(this));
    }

    @Override // defpackage.hi0
    public void c(int i) {
        this.d = i;
    }

    @Override // defpackage.ji0
    public ContentInfo d() {
        return null;
    }

    @Override // defpackage.ji0
    public int getFlags() {
        return this.d;
    }

    @Override // defpackage.ji0
    public int getSource() {
        return this.c;
    }

    @Override // defpackage.hi0
    public void setExtras(Bundle bundle) {
        this.f = bundle;
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 1:
                Uri uri = this.e;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.b.getDescription());
                sb.append(", source=");
                byte b = this.c;
                sb.append(b != 0 ? b != 1 ? b != 2 ? b != 3 ? b != 4 ? b != 5 ? String.valueOf((int) b) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i = this.d;
                sb.append((i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return hf1.z(sb, this.f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ii0() {
    }
}

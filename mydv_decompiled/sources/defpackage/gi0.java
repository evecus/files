package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gi0 implements hi0, ji0 {
    public final /* synthetic */ byte a = 0;
    public final Object b;

    public gi0(ClipData clipData, int i) {
        this.b = tb.b(clipData, i);
    }

    @Override // defpackage.ji0
    public ClipData a() {
        return ((ContentInfo) this.b).getClip();
    }

    @Override // defpackage.hi0
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.b).setLinkUri(uri);
    }

    @Override // defpackage.hi0
    public ki0 build() {
        return new ki0(new gi0(((ContentInfo.Builder) this.b).build()));
    }

    @Override // defpackage.hi0
    public void c(int i) {
        ((ContentInfo.Builder) this.b).setFlags(i);
    }

    @Override // defpackage.ji0
    public ContentInfo d() {
        return (ContentInfo) this.b;
    }

    @Override // defpackage.ji0
    public int getFlags() {
        return ((ContentInfo) this.b).getFlags();
    }

    @Override // defpackage.ji0
    public int getSource() {
        return ((ContentInfo) this.b).getSource();
    }

    @Override // defpackage.hi0
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.b).setExtras(bundle);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "ContentInfoCompat{" + ((ContentInfo) this.b) + "}";
            default:
                return super.toString();
        }
    }

    public gi0(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.b = contentInfo;
    }
}

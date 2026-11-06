package androidx.media3.extractor.metadata.id3;

import defpackage.hf1;
import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class UrlLinkFrame extends Id3Frame {
    public final String description;
    public final String url;

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.description = str2;
        this.url = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && UrlLinkFrame.class == obj.getClass()) {
            UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
            if (this.id.equals(urlLinkFrame.id) && Objects.equals(this.description, urlLinkFrame.description) && Objects.equals(this.url, urlLinkFrame.url)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int n = hf1.n(527, 31, this.id);
        String str = this.description;
        int hashCode = (n + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.url;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public String toString() {
        return this.id + ": url=" + this.url;
    }
}

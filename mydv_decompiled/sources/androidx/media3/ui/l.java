package androidx.media3.ui;

import defpackage.mr3;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements mr3 {
    public final /* synthetic */ byte I;

    public /* synthetic */ l(byte b) {
        this.I = b;
    }

    @Override // defpackage.mr3
    public final boolean apply(Object obj) {
        boolean lambda$removeAllEmbeddedStyling$0;
        boolean lambda$removeEmbeddedFontSizes$1;
        switch (this.I) {
            case 0:
                lambda$removeAllEmbeddedStyling$0 = SubtitleViewUtils.lambda$removeAllEmbeddedStyling$0(obj);
                return lambda$removeAllEmbeddedStyling$0;
            default:
                lambda$removeEmbeddedFontSizes$1 = SubtitleViewUtils.lambda$removeEmbeddedFontSizes$1(obj);
                return lambda$removeEmbeddedFontSizes$1;
        }
    }
}

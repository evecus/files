package androidx.media3.extractor.text.webvtt;

import androidx.media3.extractor.text.webvtt.WebvttCueParser;
import java.util.Comparator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Comparator {
    public final /* synthetic */ byte I;

    public /* synthetic */ a(byte b) {
        this.I = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$static$0;
        int lambda$getCues$0;
        switch (this.I) {
            case 0:
                lambda$static$0 = WebvttCueParser.Element.lambda$static$0((WebvttCueParser.Element) obj, (WebvttCueParser.Element) obj2);
                return lambda$static$0;
            default:
                lambda$getCues$0 = WebvttSubtitle.lambda$getCues$0((WebvttCueInfo) obj, (WebvttCueInfo) obj2);
                return lambda$getCues$0;
        }
    }
}

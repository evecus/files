package androidx.media3.extractor.text.ssa;

import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import defpackage.j42;
import defpackage.sp0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class SsaDialogueFormat {
    public final int endTimeIndex;
    public final int layerIndex;
    public final int length;
    public final int startTimeIndex;
    public final int styleIndex;
    public final int textIndex;

    private SsaDialogueFormat(int i, int i2, int i3, int i4, int i5, int i6) {
        this.layerIndex = i;
        this.startTimeIndex = i2;
        this.endTimeIndex = i3;
        this.styleIndex = i4;
        this.textIndex = i5;
        this.length = i6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static SsaDialogueFormat fromFormatLine(String str) {
        char c;
        sp0.o(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < split.length; i6++) {
            String j0 = j42.j0(split[i6].trim());
            j0.getClass();
            switch (j0.hashCode()) {
                case 100571:
                    if (j0.equals(TtmlNode.END)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3556653:
                    if (j0.equals("text")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 102749521:
                    if (j0.equals("layer")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 109757538:
                    if (j0.equals(TtmlNode.START)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (j0.equals("style")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    i3 = i6;
                    break;
                case 1:
                    i5 = i6;
                    break;
                case 2:
                    i = i6;
                    break;
                case 3:
                    i2 = i6;
                    break;
                case 4:
                    i4 = i6;
                    break;
            }
        }
        if (i2 == -1 || i3 == -1 || i5 == -1) {
            return null;
        }
        return new SsaDialogueFormat(i, i2, i3, i4, i5, split.length);
    }
}

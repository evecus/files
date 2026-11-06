package androidx.media3.extractor.mp4;

import androidx.media3.common.util.Util;
import androidx.media3.extractor.SniffFailure;
import defpackage.yx1;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class UnsupportedBrandsSniffFailure implements SniffFailure {
    public final yx1 compatibleBrands;
    public final int majorBrand;

    public UnsupportedBrandsSniffFailure(int i, int[] iArr) {
        this.majorBrand = i;
        this.compatibleBrands = iArr != null ? yx1.a(iArr) : yx1.K;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(this.compatibleBrands.J);
        int i = 0;
        while (true) {
            yx1 yx1Var = this.compatibleBrands;
            if (i >= yx1Var.J) {
                return "UnsupportedBrands{major=" + Util.toFourccString(this.majorBrand) + ", compatible=" + arrayList + "}";
            }
            arrayList.add(Util.toFourccString(yx1Var.b(i)));
            i++;
        }
    }
}

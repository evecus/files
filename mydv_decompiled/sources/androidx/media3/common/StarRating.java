package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.util.Util;
import defpackage.sp0;
import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class StarRating extends Rating {
    private static final String FIELD_MAX_STARS = Util.intToStringMaxRadix(1);
    private static final String FIELD_STAR_RATING = Util.intToStringMaxRadix(2);
    private static final int MAX_STARS_DEFAULT = 5;
    private static final int TYPE = 2;
    private final int maxStars;
    private final float starRating;

    public StarRating(int i, float f) {
        boolean z = false;
        sp0.p(i > 0, "maxStars must be a positive integer");
        if (f >= 0.0f && f <= i) {
            z = true;
        }
        sp0.p(z, "starRating is out of range [0, maxStars]");
        this.maxStars = i;
        this.starRating = f;
    }

    public static StarRating fromBundle(Bundle bundle) {
        sp0.o(bundle.getInt(Rating.FIELD_RATING_TYPE, -1) == 2);
        int i = bundle.getInt(FIELD_MAX_STARS, 5);
        float f = bundle.getFloat(FIELD_STAR_RATING, -1.0f);
        return f == -1.0f ? new StarRating(i) : new StarRating(i, f);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StarRating)) {
            return false;
        }
        StarRating starRating = (StarRating) obj;
        return this.maxStars == starRating.maxStars && this.starRating == starRating.starRating;
    }

    public int getMaxStars() {
        return this.maxStars;
    }

    public float getStarRating() {
        return this.starRating;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.maxStars), Float.valueOf(this.starRating));
    }

    @Override // androidx.media3.common.Rating
    public boolean isRated() {
        return this.starRating != -1.0f;
    }

    @Override // androidx.media3.common.Rating
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(Rating.FIELD_RATING_TYPE, 2);
        bundle.putInt(FIELD_MAX_STARS, this.maxStars);
        bundle.putFloat(FIELD_STAR_RATING, this.starRating);
        return bundle;
    }

    public StarRating(int i) {
        sp0.p(i > 0, "maxStars must be a positive integer");
        this.maxStars = i;
        this.starRating = -1.0f;
    }
}

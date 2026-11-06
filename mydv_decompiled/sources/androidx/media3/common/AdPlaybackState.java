package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Util;
import defpackage.sp0;
import defpackage.vt0;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class AdPlaybackState {
    public static final int AD_STATE_AVAILABLE = 1;
    public static final int AD_STATE_ERROR = 4;
    public static final int AD_STATE_PLAYED = 3;
    public static final int AD_STATE_SKIPPED = 2;
    public static final int AD_STATE_UNAVAILABLE = 0;
    public final int adGroupCount;
    private final AdGroup[] adGroups;
    public final long adResumePositionUs;
    public final Object adsId;
    public final long contentDurationUs;
    public final int removedAdGroupCount;
    public static final AdPlaybackState NONE = new AdPlaybackState(null, new AdGroup[0], 0, C.TIME_UNSET, 0);
    private static final AdGroup REMOVED_AD_GROUP = new AdGroup(0).withAdCount(0);
    private static final String FIELD_AD_GROUPS = Util.intToStringMaxRadix(1);
    private static final String FIELD_AD_RESUME_POSITION_US = Util.intToStringMaxRadix(2);
    private static final String FIELD_CONTENT_DURATION_US = Util.intToStringMaxRadix(3);
    private static final String FIELD_REMOVED_AD_GROUP_COUNT = Util.intToStringMaxRadix(4);

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface AdState {
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class SkipInfo {
        public final String labelId;
        public final long skipDurationUs;
        public final long skipOffsetUs;
        private static final String FIELD_SKIP_OFFSET_US = Util.intToStringMaxRadix(0);
        private static final String FIELD_SKIP_DURATION_US = Util.intToStringMaxRadix(1);
        private static final String FIELD_LABEL_ID = Util.intToStringMaxRadix(2);

        public SkipInfo(long j, long j2, String str) {
            sp0.o((j == C.TIME_UNSET && j2 == C.TIME_UNSET && str == null) ? false : true);
            this.skipOffsetUs = j == C.TIME_UNSET ? 0L : j;
            this.skipDurationUs = j2;
            this.labelId = str;
        }

        public static SkipInfo fromBundle(Bundle bundle) {
            return new SkipInfo(bundle.getLong(FIELD_SKIP_OFFSET_US), bundle.getLong(FIELD_SKIP_DURATION_US), bundle.getString(FIELD_LABEL_ID));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && SkipInfo.class == obj.getClass()) {
                SkipInfo skipInfo = (SkipInfo) obj;
                if (this.skipOffsetUs == skipInfo.skipOffsetUs && this.skipDurationUs == skipInfo.skipDurationUs && Objects.equals(this.labelId, skipInfo.labelId)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.skipOffsetUs), Long.valueOf(this.skipDurationUs), this.labelId);
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(FIELD_SKIP_OFFSET_US, this.skipOffsetUs);
            bundle.putLong(FIELD_SKIP_DURATION_US, this.skipDurationUs);
            bundle.putString(FIELD_LABEL_ID, this.labelId);
            return bundle;
        }
    }

    public AdPlaybackState(Object obj, long... jArr) {
        this(obj, createEmptyAdGroups(jArr), 0L, C.TIME_UNSET, 0);
    }

    private static AdGroup[] createEmptyAdGroups(long[] jArr) {
        int length = jArr.length;
        AdGroup[] adGroupArr = new AdGroup[length];
        for (int i = 0; i < length; i++) {
            adGroupArr[i] = new AdGroup(jArr[i]);
        }
        return adGroupArr;
    }

    public static AdPlaybackState fromAdPlaybackState(Object obj, AdPlaybackState adPlaybackState) {
        int i = adPlaybackState.adGroupCount - adPlaybackState.removedAdGroupCount;
        AdGroup[] adGroupArr = new AdGroup[i];
        int i2 = 0;
        while (i2 < i) {
            AdGroup adGroup = adPlaybackState.adGroups[i2];
            long j = adGroup.timeUs;
            int i3 = adGroup.count;
            int i4 = adGroup.originalCount;
            int[] iArr = adGroup.states;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            MediaItem[] mediaItemArr = adGroup.mediaItems;
            MediaItem[] mediaItemArr2 = (MediaItem[]) Arrays.copyOf(mediaItemArr, mediaItemArr.length);
            long[] jArr = adGroup.durationsUs;
            adGroupArr[i2] = new AdGroup(j, i3, i4, copyOf, mediaItemArr2, Arrays.copyOf(jArr, jArr.length), adGroup.contentResumeOffsetUs, adGroup.isServerSideInserted, adGroup.ids, adGroup.skipInfos, adGroup.isPlaceholder);
            i2++;
            i = i;
        }
        return new AdPlaybackState(obj, adGroupArr, adPlaybackState.adResumePositionUs, adPlaybackState.contentDurationUs, adPlaybackState.removedAdGroupCount);
    }

    public static AdPlaybackState fromBundle(Bundle bundle, int i) {
        AdGroup[] adGroupArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_AD_GROUPS);
        if (parcelableArrayList == null) {
            adGroupArr = new AdGroup[0];
        } else {
            AdGroup[] adGroupArr2 = new AdGroup[parcelableArrayList.size()];
            for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                adGroupArr2[i2] = AdGroup.fromBundle((Bundle) parcelableArrayList.get(i2), i);
            }
            adGroupArr = adGroupArr2;
        }
        String str = FIELD_AD_RESUME_POSITION_US;
        AdPlaybackState adPlaybackState = NONE;
        return new AdPlaybackState(null, adGroupArr, bundle.getLong(str, adPlaybackState.adResumePositionUs), bundle.getLong(FIELD_CONTENT_DURATION_US, adPlaybackState.contentDurationUs), bundle.getInt(FIELD_REMOVED_AD_GROUP_COUNT, adPlaybackState.removedAdGroupCount));
    }

    private boolean isPositionBeforeAdGroup(long j, long j2, int i) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        AdGroup adGroup = getAdGroup(i);
        long j3 = adGroup.timeUs;
        return j3 == Long.MIN_VALUE ? j2 == C.TIME_UNSET || adGroup.isLivePostrollPlaceholder() || j < j2 : j < j3;
    }

    public static long sumOfDurations(long... jArr) {
        long j = 0;
        for (long j2 : jArr) {
            if (j2 != C.TIME_UNSET) {
                j = vt0.V(j, j2);
            }
        }
        return j;
    }

    public AdPlaybackState copy() {
        int length = this.adGroups.length;
        AdGroup[] adGroupArr = new AdGroup[length];
        for (int i = 0; i < length; i++) {
            adGroupArr[i] = this.adGroups[i].copy();
        }
        return new AdPlaybackState(this.adsId, adGroupArr, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public boolean endsWithLivePostrollPlaceHolder() {
        int i = this.adGroupCount - 1;
        return i >= 0 && isLivePostrollPlaceholder(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AdPlaybackState.class == obj.getClass()) {
            AdPlaybackState adPlaybackState = (AdPlaybackState) obj;
            if (Objects.equals(this.adsId, adPlaybackState.adsId) && this.adGroupCount == adPlaybackState.adGroupCount && this.adResumePositionUs == adPlaybackState.adResumePositionUs && this.contentDurationUs == adPlaybackState.contentDurationUs && this.removedAdGroupCount == adPlaybackState.removedAdGroupCount && Arrays.equals(this.adGroups, adPlaybackState.adGroups)) {
                return true;
            }
        }
        return false;
    }

    public AdGroup getAdGroup(int i) {
        int i2 = this.removedAdGroupCount;
        return i < i2 ? REMOVED_AD_GROUP : this.adGroups[i - i2];
    }

    public int getAdGroupIndexAfterPositionUs(long j, long j2) {
        if (j != Long.MIN_VALUE && (j2 == C.TIME_UNSET || j < j2)) {
            int i = this.removedAdGroupCount;
            while (i < this.adGroupCount && ((getAdGroup(i).timeUs != Long.MIN_VALUE && getAdGroup(i).timeUs <= j) || !getAdGroup(i).shouldPlayAdGroup())) {
                i++;
            }
            if (i < this.adGroupCount && (j2 == C.TIME_UNSET || getAdGroup(i).timeUs <= j2)) {
                return i;
            }
        }
        return -1;
    }

    public int getAdGroupIndexForPositionUs(long j, long j2) {
        AdPlaybackState adPlaybackState;
        int i = this.adGroupCount - 1;
        int i2 = i - (isLivePostrollPlaceholder(i) ? 1 : 0);
        while (true) {
            adPlaybackState = this;
            if (i2 < 0) {
                break;
            }
            long j3 = j;
            long j4 = j2;
            if (!adPlaybackState.isPositionBeforeAdGroup(j3, j4, i2)) {
                break;
            }
            i2--;
            this = adPlaybackState;
            j = j3;
            j2 = j4;
        }
        if (i2 < 0 || !adPlaybackState.getAdGroup(i2).hasUnplayedAds()) {
            return -1;
        }
        return i2;
    }

    public int getAdIndexOfAdId(int i, String str) {
        return getAdGroup(i).getIndexOfAdId(str);
    }

    public int hashCode() {
        int i = this.adGroupCount * 31;
        Object obj = this.adsId;
        return Arrays.hashCode(this.adGroups) + ((((((((i + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.adResumePositionUs)) * 31) + ((int) this.contentDurationUs)) * 31) + this.removedAdGroupCount) * 31);
    }

    public boolean isAdInErrorState(int i, int i2) {
        AdGroup adGroup;
        int i3;
        return i < this.adGroupCount && (i3 = (adGroup = getAdGroup(i)).count) != -1 && i2 < i3 && adGroup.states[i2] == 4;
    }

    public boolean isLivePostrollPlaceholder(int i) {
        return i == this.adGroupCount - 1 && getAdGroup(i).isLivePostrollPlaceholder();
    }

    public Bundle toBundle(int i) {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (AdGroup adGroup : this.adGroups) {
            arrayList.add(adGroup.toBundle(i));
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(FIELD_AD_GROUPS, arrayList);
        }
        long j = this.adResumePositionUs;
        AdPlaybackState adPlaybackState = NONE;
        if (j != adPlaybackState.adResumePositionUs) {
            bundle.putLong(FIELD_AD_RESUME_POSITION_US, j);
        }
        long j2 = this.contentDurationUs;
        if (j2 != adPlaybackState.contentDurationUs) {
            bundle.putLong(FIELD_CONTENT_DURATION_US, j2);
        }
        int i2 = this.removedAdGroupCount;
        if (i2 != adPlaybackState.removedAdGroupCount) {
            bundle.putInt(FIELD_REMOVED_AD_GROUP_COUNT, i2);
        }
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=");
        sb.append(this.adsId);
        sb.append(", adResumePositionUs=");
        sb.append(this.adResumePositionUs);
        sb.append(", adGroups=[");
        for (int i = 0; i < this.adGroups.length; i++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.adGroups[i].timeUs);
            sb.append(", contentResumeOffsetUs=");
            sb.append(this.adGroups[i].contentResumeOffsetUs);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < this.adGroups[i].states.length; i2++) {
                sb.append("ad(state=");
                int i3 = this.adGroups[i].states[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(this.adGroups[i].durationsUs[i2]);
                sb.append(')');
                if (i2 < this.adGroups[i].states.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < this.adGroups.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    public AdPlaybackState withAdCount(int i, int i2) {
        sp0.o(i2 > 0);
        int i3 = i - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        if (adGroupArr[i3].count == i2) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = this.adGroups[i3].withAdCount(i2);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withAdDurationsUs(long[][] jArr) {
        int i = 0;
        sp0.o(jArr.length == this.adGroupCount);
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        while (true) {
            int i2 = this.adGroupCount;
            int i3 = this.removedAdGroupCount;
            if (i >= i2 - i3) {
                return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, i3);
            }
            adGroupArr2[i] = adGroupArr2[i].withAdDurationsUs(jArr[i3 + i]);
            i++;
        }
    }

    public AdPlaybackState withAdGroupTimeUs(int i, long j) {
        int i2 = i - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = this.adGroups[i2].withTimeUs(j);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withAdId(int i, int i2, String str) {
        int i3 = i - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = adGroupArr2[i3].withAdId(str, i2);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withAdLoadError(int i, int i2) {
        int i3 = i - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = adGroupArr2[i3].withAdState(4, i2);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withAdResumePositionUs(long j) {
        return this.adResumePositionUs == j ? this : new AdPlaybackState(this.adsId, this.adGroups, j, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withAdSkipInfo(int i, int i2, SkipInfo skipInfo) {
        int i3 = i - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = adGroupArr2[i3].withAdSkipInfo(skipInfo, i2);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withAdsId(Object obj) {
        return new AdPlaybackState(obj, this.adGroups, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withAvailableAd(int i, int i2) {
        return withAvailableAdMediaItem(i, i2, MediaItem.fromUri(Uri.EMPTY));
    }

    public AdPlaybackState withAvailableAdMediaItem(int i, int i2, MediaItem mediaItem) {
        MediaItem.LocalConfiguration localConfiguration;
        int i3 = i - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        sp0.z(adGroupArr2[i3].isServerSideInserted || !((localConfiguration = mediaItem.localConfiguration) == null || localConfiguration.uri.equals(Uri.EMPTY)));
        adGroupArr2[i3] = adGroupArr2[i3].withAdMediaItem(mediaItem, i2);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @Deprecated
    public AdPlaybackState withAvailableAdUri(int i, int i2, Uri uri) {
        return withAvailableAdMediaItem(i, i2, MediaItem.fromUri(uri));
    }

    public AdPlaybackState withContentDurationUs(long j) {
        return this.contentDurationUs == j ? this : new AdPlaybackState(this.adsId, this.adGroups, this.adResumePositionUs, j, this.removedAdGroupCount);
    }

    public AdPlaybackState withContentResumeOffsetUs(int i, long j) {
        int i2 = i - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        if (adGroupArr[i2].contentResumeOffsetUs == j) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withContentResumeOffsetUs(j);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withIsPlaceholder(int i, boolean z, boolean z2) {
        int i2 = i - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup adGroup = adGroupArr[i2];
        if (adGroup.isPlaceholder == z && adGroup.isServerSideInserted == z2) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withIsPlaceholder(z, z2);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withIsServerSideInserted(int i, boolean z) {
        int i2 = i - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        if (adGroupArr[i2].isServerSideInserted == z) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withIsServerSideInserted(z);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @Deprecated
    public AdPlaybackState withLastAdRemoved(int i) {
        int i2 = i - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withLastAdRemoved();
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withLivePostrollPlaceholderAppended(boolean z) {
        return withNewAdGroup(this.adGroupCount, Long.MIN_VALUE).withIsPlaceholder(this.adGroupCount, true, z);
    }

    public AdPlaybackState withNewAdGroup(int i, long j) {
        int i2 = i - this.removedAdGroupCount;
        AdGroup adGroup = new AdGroup(j);
        AdGroup[] adGroupArr = (AdGroup[]) Util.nullSafeArrayAppend(this.adGroups, adGroup);
        System.arraycopy(adGroupArr, i2, adGroupArr, i2 + 1, this.adGroups.length - i2);
        adGroupArr[i2] = adGroup;
        return new AdPlaybackState(this.adsId, adGroupArr, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withOriginalAdCount(int i, int i2) {
        int i3 = i - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        if (adGroupArr[i3].originalCount == i2) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = adGroupArr2[i3].withOriginalAdCount(i2);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withPlayedAd(int i, int i2) {
        int i3 = i - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = adGroupArr2[i3].withAdState(3, i2);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withRemovedAdGroupCount(int i) {
        int i2 = this.removedAdGroupCount;
        if (i2 == i) {
            return this;
        }
        sp0.o(i > i2);
        int i3 = this.adGroupCount - i;
        AdGroup[] adGroupArr = new AdGroup[i3];
        System.arraycopy(this.adGroups, i - this.removedAdGroupCount, adGroupArr, 0, i3);
        return new AdPlaybackState(this.adsId, adGroupArr, this.adResumePositionUs, this.contentDurationUs, i);
    }

    public AdPlaybackState withRemovedAdGroupCountBefore(long j) {
        int i = this.removedAdGroupCount;
        while (i < this.adGroupCount) {
            long j2 = getAdGroup(i).timeUs;
            if (j <= j2 || j2 == Long.MIN_VALUE) {
                break;
            }
            i++;
        }
        return withRemovedAdGroupCount(i);
    }

    public AdPlaybackState withRemovedAdsAfterIndex(int i, int i2) {
        int i3 = i - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = adGroupArr2[i3].withRemovedAdsAfterIndex(i2);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withResetAdGroup(int i) {
        int i2 = i - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withAllAdsReset();
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withSkippedAd(int i, int i2) {
        int i3 = i - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = adGroupArr2[i3].withAdState(2, i2);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withSkippedAdGroup(int i) {
        int i2 = i - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withAllAdsSkipped();
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withUnavailableAdGroup(int i) {
        int i2 = i - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withAllAdsUnavailable();
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public boolean endsWithLivePostrollPlaceHolder(boolean z) {
        int i = this.adGroupCount - 1;
        return i >= 0 && isLivePostrollPlaceholder(i, z);
    }

    @Deprecated
    public AdPlaybackState withLivePostrollPlaceholderAppended() {
        return withLivePostrollPlaceholderAppended(true);
    }

    private AdPlaybackState(Object obj, AdGroup[] adGroupArr, long j, long j2, int i) {
        this.adsId = obj;
        this.adResumePositionUs = j;
        this.contentDurationUs = j2;
        this.adGroupCount = adGroupArr.length + i;
        this.adGroups = adGroupArr;
        this.removedAdGroupCount = i;
    }

    public boolean isLivePostrollPlaceholder(int i, boolean z) {
        return i == this.adGroupCount - 1 && getAdGroup(i).isLivePostrollPlaceholder(z);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class AdGroup {
        public final long contentResumeOffsetUs;
        public final int count;
        public final long[] durationsUs;
        public final String[] ids;
        public final boolean isPlaceholder;
        public final boolean isServerSideInserted;
        public final MediaItem[] mediaItems;
        public final int originalCount;
        public final SkipInfo[] skipInfos;
        public final int[] states;
        public final long timeUs;

        @Deprecated
        public final Uri[] uris;
        private static final String FIELD_TIME_US = Util.intToStringMaxRadix(0);
        private static final String FIELD_COUNT = Util.intToStringMaxRadix(1);
        private static final String FIELD_URIS = Util.intToStringMaxRadix(2);
        private static final String FIELD_STATES = Util.intToStringMaxRadix(3);
        private static final String FIELD_DURATIONS_US = Util.intToStringMaxRadix(4);
        private static final String FIELD_CONTENT_RESUME_OFFSET_US = Util.intToStringMaxRadix(5);
        private static final String FIELD_IS_SERVER_SIDE_INSERTED = Util.intToStringMaxRadix(6);
        private static final String FIELD_ORIGINAL_COUNT = Util.intToStringMaxRadix(7);
        static final String FIELD_MEDIA_ITEMS = Util.intToStringMaxRadix(8);
        static final String FIELD_IDS = Util.intToStringMaxRadix(9);
        static final String FIELD_IS_PLACEHOLDER = Util.intToStringMaxRadix(10);
        private static final String FIELD_SKIP_INFOS = Util.intToStringMaxRadix(11);

        private AdGroup(long j, int i, int i2, int[] iArr, MediaItem[] mediaItemArr, long[] jArr, long j2, boolean z, String[] strArr, SkipInfo[] skipInfoArr, boolean z2) {
            Uri uri;
            int i3 = 0;
            sp0.o(iArr.length == mediaItemArr.length);
            sp0.o(iArr.length == skipInfoArr.length);
            this.timeUs = j;
            this.count = i;
            this.originalCount = i2;
            this.states = iArr;
            this.mediaItems = mediaItemArr;
            this.durationsUs = jArr;
            this.contentResumeOffsetUs = j2;
            this.isServerSideInserted = z;
            this.uris = new Uri[mediaItemArr.length];
            while (true) {
                Uri[] uriArr = this.uris;
                if (i3 >= uriArr.length) {
                    this.ids = strArr;
                    this.skipInfos = skipInfoArr;
                    this.isPlaceholder = z2;
                    return;
                }
                MediaItem mediaItem = mediaItemArr[i3];
                if (mediaItem == null) {
                    uri = null;
                } else {
                    MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
                    localConfiguration.getClass();
                    uri = localConfiguration.uri;
                }
                uriArr[i3] = uri;
                i3++;
            }
        }

        private static long[] copyDurationsUsWithSpaceForAdCount(long[] jArr, int i) {
            int length = jArr.length;
            int max = Math.max(i, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, C.TIME_UNSET);
            return copyOf;
        }

        private static SkipInfo[] copySkipInfosWithSpaceForAdCount(SkipInfo[] skipInfoArr, int i) {
            return (SkipInfo[]) Arrays.copyOf(skipInfoArr, Math.max(i, skipInfoArr.length));
        }

        private static int[] copyStatesWithSpaceForAdCount(int[] iArr, int i) {
            int length = iArr.length;
            int max = Math.max(i, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        public static AdGroup fromBundle(Bundle bundle, int i) {
            long j = bundle.getLong(FIELD_TIME_US);
            int i2 = bundle.getInt(FIELD_COUNT);
            int i3 = bundle.getInt(FIELD_ORIGINAL_COUNT);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_URIS);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(FIELD_MEDIA_ITEMS);
            int[] intArray = bundle.getIntArray(FIELD_STATES);
            long[] longArray = bundle.getLongArray(FIELD_DURATIONS_US);
            long j2 = bundle.getLong(FIELD_CONTENT_RESUME_OFFSET_US);
            boolean z = bundle.getBoolean(FIELD_IS_SERVER_SIDE_INSERTED);
            ArrayList<String> stringArrayList = bundle.getStringArrayList(FIELD_IDS);
            ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(FIELD_SKIP_INFOS);
            boolean z2 = bundle.getBoolean(FIELD_IS_PLACEHOLDER);
            if (intArray == null) {
                intArray = new int[0];
            }
            MediaItem[] mediaItemsFromBundleArrays = getMediaItemsFromBundleArrays(parcelableArrayList2, parcelableArrayList, i);
            if (longArray == null) {
                longArray = new long[0];
            }
            return new AdGroup(j, i2, i3, intArray, mediaItemsFromBundleArrays, longArray, j2, z, stringArrayList == null ? new String[0] : (String[]) stringArrayList.toArray(new String[0]), parcelableArrayList3 == null ? new SkipInfo[0] : getSkipInfosFromBundleArrays(parcelableArrayList3), z2);
        }

        private ArrayList<Bundle> getMediaItemsArrayBundles(int i) {
            ArrayList<Bundle> arrayList = new ArrayList<>();
            MediaItem[] mediaItemArr = this.mediaItems;
            int length = mediaItemArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                MediaItem mediaItem = mediaItemArr[i2];
                arrayList.add(mediaItem == null ? null : mediaItem.toBundleIncludeLocalConfiguration(i));
            }
            return arrayList;
        }

        private static MediaItem[] getMediaItemsFromBundleArrays(ArrayList<Bundle> arrayList, ArrayList<Uri> arrayList2, int i) {
            int i2 = 0;
            if (arrayList != null) {
                MediaItem[] mediaItemArr = new MediaItem[arrayList.size()];
                while (i2 < arrayList.size()) {
                    Bundle bundle = arrayList.get(i2);
                    mediaItemArr[i2] = bundle == null ? null : MediaItem.fromBundle(bundle, i);
                    i2++;
                }
                return mediaItemArr;
            }
            if (arrayList2 == null) {
                return new MediaItem[0];
            }
            MediaItem[] mediaItemArr2 = new MediaItem[arrayList2.size()];
            while (i2 < arrayList2.size()) {
                Uri uri = arrayList2.get(i2);
                mediaItemArr2[i2] = uri == null ? null : MediaItem.fromUri(uri);
                i2++;
            }
            return mediaItemArr2;
        }

        private ArrayList<Bundle> getSkipInfoArrayBundles() {
            ArrayList<Bundle> arrayList = new ArrayList<>();
            SkipInfo[] skipInfoArr = this.skipInfos;
            int length = skipInfoArr.length;
            for (int i = 0; i < length; i++) {
                SkipInfo skipInfo = skipInfoArr[i];
                arrayList.add(skipInfo == null ? null : skipInfo.toBundle());
            }
            return arrayList;
        }

        private static SkipInfo[] getSkipInfosFromBundleArrays(List<Bundle> list) {
            SkipInfo[] skipInfoArr = new SkipInfo[list.size()];
            for (int i = 0; i < list.size(); i++) {
                Bundle bundle = list.get(i);
                skipInfoArr[i] = bundle == null ? null : SkipInfo.fromBundle(bundle);
            }
            return skipInfoArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AdGroup withIsPlaceholder(boolean z, boolean z2) {
            return new AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, z2, this.ids, this.skipInfos, z);
        }

        public AdGroup copy() {
            long j = this.timeUs;
            int i = this.count;
            int i2 = this.originalCount;
            int[] iArr = this.states;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            MediaItem[] mediaItemArr = this.mediaItems;
            MediaItem[] mediaItemArr2 = (MediaItem[]) Arrays.copyOf(mediaItemArr, mediaItemArr.length);
            long[] jArr = this.durationsUs;
            long[] copyOf2 = Arrays.copyOf(jArr, jArr.length);
            long j2 = this.contentResumeOffsetUs;
            boolean z = this.isServerSideInserted;
            String[] strArr = this.ids;
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            SkipInfo[] skipInfoArr = this.skipInfos;
            return new AdGroup(j, i, i2, copyOf, mediaItemArr2, copyOf2, j2, z, strArr2, (SkipInfo[]) Arrays.copyOf(skipInfoArr, skipInfoArr.length), this.isPlaceholder);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && AdGroup.class == obj.getClass()) {
                AdGroup adGroup = (AdGroup) obj;
                if (this.timeUs == adGroup.timeUs && this.count == adGroup.count && this.originalCount == adGroup.originalCount && Arrays.equals(this.mediaItems, adGroup.mediaItems) && Arrays.equals(this.states, adGroup.states) && Arrays.equals(this.durationsUs, adGroup.durationsUs) && this.contentResumeOffsetUs == adGroup.contentResumeOffsetUs && this.isServerSideInserted == adGroup.isServerSideInserted && Arrays.equals(this.ids, adGroup.ids) && Arrays.equals(this.skipInfos, adGroup.skipInfos) && this.isPlaceholder == adGroup.isPlaceholder) {
                    return true;
                }
            }
            return false;
        }

        public int getFirstAdIndexToPlay() {
            return getNextAdIndexToPlay(-1);
        }

        public int getIndexOfAdId(String str) {
            int i = 0;
            while (true) {
                String[] strArr = this.ids;
                if (i >= strArr.length) {
                    return -1;
                }
                if (Objects.equals(strArr[i], str)) {
                    return i;
                }
                i++;
            }
        }

        public int getNextAdIndexToPlay(int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.states;
                if (i3 >= iArr.length || this.isServerSideInserted || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public boolean hasUnplayedAds() {
            if (this.count == -1) {
                return true;
            }
            for (int i = 0; i < this.count; i++) {
                int i2 = this.states[i];
                if (i2 == 0 || i2 == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i = ((this.count * 31) + this.originalCount) * 31;
            long j = this.timeUs;
            int hashCode = (Arrays.hashCode(this.durationsUs) + ((Arrays.hashCode(this.states) + ((Arrays.hashCode(this.mediaItems) + ((i + ((int) (j ^ (j >>> 32)))) * 31)) * 31)) * 31)) * 31;
            long j2 = this.contentResumeOffsetUs;
            return ((Arrays.hashCode(this.skipInfos) + ((((((hashCode + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.isServerSideInserted ? 1 : 0)) * 31) + Arrays.hashCode(this.ids)) * 31)) * 31) + (this.isPlaceholder ? 1 : 0);
        }

        public boolean isLivePostrollPlaceholder() {
            return this.isPlaceholder && this.timeUs == Long.MIN_VALUE && this.count == -1;
        }

        public boolean shouldPlayAdGroup() {
            return this.count == -1 || getFirstAdIndexToPlay() < this.count;
        }

        public Bundle toBundle(int i) {
            Bundle bundle = new Bundle();
            bundle.putLong(FIELD_TIME_US, this.timeUs);
            bundle.putInt(FIELD_COUNT, this.count);
            bundle.putInt(FIELD_ORIGINAL_COUNT, this.originalCount);
            bundle.putParcelableArrayList(FIELD_URIS, new ArrayList<>(Arrays.asList(this.uris)));
            bundle.putParcelableArrayList(FIELD_MEDIA_ITEMS, getMediaItemsArrayBundles(i));
            bundle.putIntArray(FIELD_STATES, this.states);
            bundle.putLongArray(FIELD_DURATIONS_US, this.durationsUs);
            bundle.putLong(FIELD_CONTENT_RESUME_OFFSET_US, this.contentResumeOffsetUs);
            bundle.putBoolean(FIELD_IS_SERVER_SIDE_INSERTED, this.isServerSideInserted);
            bundle.putStringArrayList(FIELD_IDS, new ArrayList<>(Arrays.asList(this.ids)));
            bundle.putParcelableArrayList(FIELD_SKIP_INFOS, getSkipInfoArrayBundles());
            bundle.putBoolean(FIELD_IS_PLACEHOLDER, this.isPlaceholder);
            return bundle;
        }

        public AdGroup withAdCount(int i) {
            int[] copyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i);
            long[] copyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(this.durationsUs, i);
            return new AdGroup(this.timeUs, i, this.originalCount, copyStatesWithSpaceForAdCount, (MediaItem[]) Arrays.copyOf(this.mediaItems, i), copyDurationsUsWithSpaceForAdCount, this.contentResumeOffsetUs, this.isServerSideInserted, (String[]) Arrays.copyOf(this.ids, i), copySkipInfosWithSpaceForAdCount(this.skipInfos, i), this.isPlaceholder);
        }

        public AdGroup withAdDurationsUs(long[] jArr) {
            int length = jArr.length;
            MediaItem[] mediaItemArr = this.mediaItems;
            if (length < mediaItemArr.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, mediaItemArr.length);
            } else if (this.count != -1 && jArr.length > mediaItemArr.length) {
                jArr = Arrays.copyOf(jArr, mediaItemArr.length);
            }
            return new AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.mediaItems, jArr, this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public AdGroup withAdId(String str, int i) {
            int[] copyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i + 1);
            long[] jArr = this.durationsUs;
            if (jArr.length != copyStatesWithSpaceForAdCount.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, copyStatesWithSpaceForAdCount.length);
            }
            long[] jArr2 = jArr;
            MediaItem[] mediaItemArr = this.mediaItems;
            if (mediaItemArr.length != copyStatesWithSpaceForAdCount.length) {
                mediaItemArr = (MediaItem[]) Arrays.copyOf(mediaItemArr, copyStatesWithSpaceForAdCount.length);
            }
            MediaItem[] mediaItemArr2 = mediaItemArr;
            String[] strArr = (String[]) Arrays.copyOf(this.ids, copyStatesWithSpaceForAdCount.length);
            strArr[i] = str;
            return new AdGroup(this.timeUs, this.count, this.originalCount, copyStatesWithSpaceForAdCount, mediaItemArr2, jArr2, this.contentResumeOffsetUs, this.isServerSideInserted, strArr, this.skipInfos, this.isPlaceholder);
        }

        public AdGroup withAdMediaItem(MediaItem mediaItem, int i) {
            int[] copyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i + 1);
            long[] jArr = this.durationsUs;
            if (jArr.length != copyStatesWithSpaceForAdCount.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, copyStatesWithSpaceForAdCount.length);
            }
            long[] jArr2 = jArr;
            MediaItem[] mediaItemArr = (MediaItem[]) Arrays.copyOf(this.mediaItems, copyStatesWithSpaceForAdCount.length);
            mediaItemArr[i] = mediaItem;
            copyStatesWithSpaceForAdCount[i] = 1;
            String[] strArr = this.ids;
            if (strArr.length != copyStatesWithSpaceForAdCount.length) {
                strArr = (String[]) Arrays.copyOf(strArr, copyStatesWithSpaceForAdCount.length);
            }
            String[] strArr2 = strArr;
            SkipInfo[] skipInfoArr = this.skipInfos;
            if (skipInfoArr.length != copyStatesWithSpaceForAdCount.length) {
                skipInfoArr = copySkipInfosWithSpaceForAdCount(skipInfoArr, copyStatesWithSpaceForAdCount.length);
            }
            return new AdGroup(this.timeUs, this.count, this.originalCount, copyStatesWithSpaceForAdCount, mediaItemArr, jArr2, this.contentResumeOffsetUs, this.isServerSideInserted, strArr2, skipInfoArr, this.isPlaceholder);
        }

        public AdGroup withAdSkipInfo(SkipInfo skipInfo, int i) {
            int[] copyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i + 1);
            long[] jArr = this.durationsUs;
            if (jArr.length != copyStatesWithSpaceForAdCount.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, copyStatesWithSpaceForAdCount.length);
            }
            long[] jArr2 = jArr;
            MediaItem[] mediaItemArr = this.mediaItems;
            if (mediaItemArr.length != copyStatesWithSpaceForAdCount.length) {
                mediaItemArr = (MediaItem[]) Arrays.copyOf(mediaItemArr, copyStatesWithSpaceForAdCount.length);
            }
            MediaItem[] mediaItemArr2 = mediaItemArr;
            String[] strArr = this.ids;
            if (strArr.length != copyStatesWithSpaceForAdCount.length) {
                strArr = (String[]) Arrays.copyOf(strArr, copyStatesWithSpaceForAdCount.length);
            }
            String[] strArr2 = strArr;
            SkipInfo[] copySkipInfosWithSpaceForAdCount = copySkipInfosWithSpaceForAdCount(this.skipInfos, copyStatesWithSpaceForAdCount.length);
            copySkipInfosWithSpaceForAdCount[i] = skipInfo;
            return new AdGroup(this.timeUs, this.count, this.originalCount, copyStatesWithSpaceForAdCount, mediaItemArr2, jArr2, this.contentResumeOffsetUs, this.isServerSideInserted, strArr2, copySkipInfosWithSpaceForAdCount, this.isPlaceholder);
        }

        public AdGroup withAdState(int i, int i2) {
            int i3 = this.count;
            sp0.o(i3 == -1 || i2 < i3);
            int[] copyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i2 + 1);
            int i4 = copyStatesWithSpaceForAdCount[i2];
            sp0.o(i4 == 0 || i4 == 1 || i4 == i);
            long[] jArr = this.durationsUs;
            if (jArr.length != copyStatesWithSpaceForAdCount.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, copyStatesWithSpaceForAdCount.length);
            }
            long[] jArr2 = jArr;
            MediaItem[] mediaItemArr = this.mediaItems;
            if (mediaItemArr.length != copyStatesWithSpaceForAdCount.length) {
                mediaItemArr = (MediaItem[]) Arrays.copyOf(mediaItemArr, copyStatesWithSpaceForAdCount.length);
            }
            MediaItem[] mediaItemArr2 = mediaItemArr;
            String[] strArr = this.ids;
            if (strArr.length != copyStatesWithSpaceForAdCount.length) {
                strArr = (String[]) Arrays.copyOf(strArr, copyStatesWithSpaceForAdCount.length);
            }
            String[] strArr2 = strArr;
            copyStatesWithSpaceForAdCount[i2] = i;
            SkipInfo[] skipInfoArr = this.skipInfos;
            if (skipInfoArr.length != copyStatesWithSpaceForAdCount.length) {
                skipInfoArr = copySkipInfosWithSpaceForAdCount(skipInfoArr, copyStatesWithSpaceForAdCount.length);
            }
            return new AdGroup(this.timeUs, this.count, this.originalCount, copyStatesWithSpaceForAdCount, mediaItemArr2, jArr2, this.contentResumeOffsetUs, this.isServerSideInserted, strArr2, skipInfoArr, this.isPlaceholder);
        }

        @Deprecated
        public AdGroup withAdUri(Uri uri, int i) {
            return withAdMediaItem(MediaItem.fromUri(uri), i);
        }

        public AdGroup withAllAdsReset() {
            if (this.count == -1) {
                return this;
            }
            int[] iArr = this.states;
            int length = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, length);
            for (int i = 0; i < length; i++) {
                int i2 = copyOf[i];
                if (i2 == 3 || i2 == 2 || i2 == 4) {
                    copyOf[i] = this.mediaItems[i] == null ? 0 : 1;
                }
            }
            return new AdGroup(this.timeUs, length, this.originalCount, copyOf, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public AdGroup withAllAdsSkipped() {
            if (this.count == -1) {
                return new AdGroup(this.timeUs, 0, this.originalCount, new int[0], new MediaItem[0], new long[0], this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
            }
            int[] iArr = this.states;
            int length = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, length);
            for (int i = 0; i < length; i++) {
                int i2 = copyOf[i];
                if (i2 == 1 || i2 == 0) {
                    copyOf[i] = 2;
                }
            }
            return new AdGroup(this.timeUs, length, this.originalCount, copyOf, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public AdGroup withAllAdsUnavailable() {
            if (this.count == -1) {
                return this;
            }
            int length = this.states.length;
            int[] iArr = new int[length];
            Arrays.fill(iArr, 0);
            long[] jArr = new long[length];
            Arrays.fill(jArr, C.TIME_UNSET);
            long j = this.timeUs;
            int i = this.count;
            return new AdGroup(j, i, this.originalCount, iArr, new MediaItem[i], jArr, 0L, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public AdGroup withContentResumeOffsetUs(long j) {
            return new AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.mediaItems, this.durationsUs, j, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public AdGroup withIsServerSideInserted(boolean z) {
            return new AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, z, this.ids, this.skipInfos, this.isPlaceholder);
        }

        @Deprecated
        public AdGroup withLastAdRemoved() {
            int[] iArr = this.states;
            int length = iArr.length - 1;
            int[] copyOf = Arrays.copyOf(iArr, length);
            MediaItem[] mediaItemArr = (MediaItem[]) Arrays.copyOf(this.mediaItems, length);
            long[] jArr = this.durationsUs;
            if (jArr.length > length) {
                jArr = Arrays.copyOf(jArr, length);
            }
            long[] jArr2 = jArr;
            return new AdGroup(this.timeUs, length, this.originalCount, copyOf, mediaItemArr, jArr2, this.contentResumeOffsetUs != 0 ? AdPlaybackState.sumOfDurations(jArr2) : 0L, this.isServerSideInserted, (String[]) Arrays.copyOf(this.ids, length), (SkipInfo[]) Arrays.copyOf(this.skipInfos, length), this.isPlaceholder);
        }

        public AdGroup withOriginalAdCount(int i) {
            return new AdGroup(this.timeUs, this.count, i, this.states, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public AdGroup withRemovedAdsAfterIndex(int i) {
            sp0.o(i >= 0);
            int i2 = this.count;
            if (i2 == -1 || i >= i2 - 1) {
                return this;
            }
            int i3 = i + 1;
            long[] copyOf = Arrays.copyOf(this.durationsUs, i3);
            return new AdGroup(this.timeUs, i3, this.originalCount, Arrays.copyOf(this.states, i3), (MediaItem[]) Arrays.copyOf(this.mediaItems, i3), copyOf, this.contentResumeOffsetUs != 0 ? AdPlaybackState.sumOfDurations(copyOf) : 0L, this.isServerSideInserted, (String[]) Arrays.copyOf(this.ids, i3), (SkipInfo[]) Arrays.copyOf(this.skipInfos, i3), this.isPlaceholder);
        }

        public AdGroup withTimeUs(long j) {
            return new AdGroup(j, this.count, this.originalCount, this.states, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public boolean isLivePostrollPlaceholder(boolean z) {
            return this.isServerSideInserted == z && isLivePostrollPlaceholder();
        }

        public AdGroup(long j) {
            this(j, -1, -1, new int[0], new MediaItem[0], new long[0], 0L, false, new String[0], new SkipInfo[0], false);
        }

        @Deprecated
        public Bundle toBundle() {
            return toBundle(10);
        }

        @Deprecated
        public static AdGroup fromBundle(Bundle bundle) {
            return fromBundle(bundle, 10);
        }
    }

    public AdPlaybackState withAdDurationsUs(int i, long... jArr) {
        int i2 = i - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withAdDurationsUs(jArr);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @Deprecated
    public static AdPlaybackState fromBundle(Bundle bundle) {
        return fromBundle(bundle, 10);
    }

    @Deprecated
    public Bundle toBundle() {
        return toBundle(10);
    }
}

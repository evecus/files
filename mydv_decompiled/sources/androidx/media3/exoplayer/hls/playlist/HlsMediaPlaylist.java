package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.StreamKey;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.iy1;
import defpackage.li4;
import defpackage.rt0;
import defpackage.s83;
import defpackage.sp0;
import defpackage.tj1;
import defpackage.x24;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class HlsMediaPlaylist extends HlsPlaylist {
    public static final int PLAYLIST_TYPE_EVENT = 2;
    public static final int PLAYLIST_TYPE_UNKNOWN = 0;
    public static final int PLAYLIST_TYPE_VOD = 1;
    public final int discontinuitySequence;
    public final long durationUs;
    public final boolean hasDiscontinuitySequence;
    public final boolean hasEndTag;
    public final boolean hasPositiveStartOffset;
    public final boolean hasProgramDateTime;
    public final dy1 interstitials;
    public final Segment lastSeenInitSegment;
    public final long mediaSequence;
    public final long partTargetDurationUs;
    public final int playlistType;
    public final boolean preciseStart;
    public final DrmInitData protectionSchemes;
    public final Map<Uri, RenditionReport> renditionReports;
    public final List<Segment> segments;
    public final ServerControl serverControl;
    public final long startOffsetUs;
    public final long startTimeUs;
    public final long targetDurationUs;
    public final List<Part> trailingParts;
    public final int version;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Interstitial {
        public static final String CUE_TRIGGER_ONCE = "ONCE";
        public static final String CUE_TRIGGER_POST = "POST";
        public static final String CUE_TRIGGER_PRE = "PRE";
        public static final String NAVIGATION_RESTRICTION_JUMP = "JUMP";
        public static final String NAVIGATION_RESTRICTION_SKIP = "SKIP";
        public static final String SNAP_TYPE_IN = "IN";
        public static final String SNAP_TYPE_OUT = "OUT";
        public static final String TIMELINE_OCCUPIES_POINT = "POINT";
        public static final String TIMELINE_OCCUPIES_RANGE = "RANGE";
        public static final String TIMELINE_STYLE_HIGHLIGHT = "HIGHLIGHT";
        public static final String TIMELINE_STYLE_PRIMARY = "PRIMARY";
        public final Uri assetListUri;
        public final Uri assetUri;
        public final dy1 clientDefinedAttributes;
        public final boolean contentMayVary;
        public final List<String> cue;
        public final long durationUs;
        public final long endDateUnixUs;
        public final boolean endOnNext;
        public final String id;
        public final long plannedDurationUs;
        public final long playoutLimitUs;
        public final dy1 restrictions;
        public final long resumeOffsetUs;
        public final long skipControlDurationUs;
        public final String skipControlLabelId;
        public final long skipControlOffsetUs;
        public final dy1 snapTypes;
        public final long startDateUnixUs;
        public final String timelineOccupies;
        public final String timelineStyle;

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        public static final class Builder {
            private Uri assetListUri;
            private Uri assetUri;
            private Boolean contentMayVary;
            private boolean endOnNext;
            private final String id;
            private String skipControlLabelId;
            private String timelineOccupies;
            private String timelineStyle;
            private final Map<String, ClientDefinedAttribute> clientDefinedAttributes = new HashMap();
            private long startDateUnixUs = C.TIME_UNSET;
            private long endDateUnixUs = C.TIME_UNSET;
            private long durationUs = C.TIME_UNSET;
            private long plannedDurationUs = C.TIME_UNSET;
            private List<String> cue = new ArrayList();
            private long resumeOffsetUs = C.TIME_UNSET;
            private long playoutLimitUs = C.TIME_UNSET;
            private List<String> snapTypes = new ArrayList();
            private List<String> restrictions = new ArrayList();
            private long skipControlOffsetUs = C.TIME_UNSET;
            private long skipControlDurationUs = C.TIME_UNSET;

            public Builder(String str) {
                this.id = str;
            }

            public Interstitial build() {
                Uri uri;
                Uri uri2 = this.assetListUri;
                if ((uri2 != null || (uri = this.assetUri) == null) && (uri2 == null || (uri = this.assetUri) != null)) {
                    return null;
                }
                Uri uri3 = uri;
                long j = this.startDateUnixUs;
                if (j == C.TIME_UNSET) {
                    return null;
                }
                String str = this.id;
                long j2 = this.endDateUnixUs;
                long j3 = this.durationUs;
                long j4 = this.plannedDurationUs;
                List<String> list = this.cue;
                boolean z = this.endOnNext;
                long j5 = this.resumeOffsetUs;
                long j6 = this.playoutLimitUs;
                List<String> list2 = this.snapTypes;
                List<String> list3 = this.restrictions;
                ArrayList arrayList = new ArrayList(this.clientDefinedAttributes.values());
                Boolean bool = this.contentMayVary;
                boolean z2 = bool == null || bool.booleanValue();
                String str2 = this.timelineOccupies;
                if (str2 == null) {
                    str2 = Interstitial.TIMELINE_OCCUPIES_POINT;
                }
                String str3 = str2;
                String str4 = this.timelineStyle;
                if (str4 == null) {
                    str4 = Interstitial.TIMELINE_STYLE_HIGHLIGHT;
                }
                return new Interstitial(str, uri3, uri2, j, j2, j3, j4, list, z, j5, j6, list2, list3, arrayList, z2, str3, str4, this.skipControlOffsetUs, this.skipControlDurationUs, this.skipControlLabelId);
            }

            public Builder setAssetListUri(Uri uri) {
                if (uri == null) {
                    return this;
                }
                Uri uri2 = this.assetListUri;
                if (uri2 != null) {
                    sp0.t(uri2.equals(uri), "Can't change assetListUri from %s to %s", this.assetListUri, uri);
                }
                this.assetListUri = uri;
                return this;
            }

            public Builder setAssetUri(Uri uri) {
                if (uri == null) {
                    return this;
                }
                Uri uri2 = this.assetUri;
                if (uri2 != null) {
                    sp0.t(uri2.equals(uri), "Can't change assetUri from %s to %s", this.assetUri, uri);
                }
                this.assetUri = uri;
                return this;
            }

            public Builder setClientDefinedAttributes(List<ClientDefinedAttribute> list) {
                if (!list.isEmpty()) {
                    for (int i = 0; i < list.size(); i++) {
                        ClientDefinedAttribute clientDefinedAttribute = list.get(i);
                        String str = clientDefinedAttribute.name;
                        ClientDefinedAttribute clientDefinedAttribute2 = this.clientDefinedAttributes.get(str);
                        if (clientDefinedAttribute2 != null) {
                            boolean equals = clientDefinedAttribute2.equals(clientDefinedAttribute);
                            Object[] objArr = {str, clientDefinedAttribute2.textValue, Double.valueOf(clientDefinedAttribute2.doubleValue), clientDefinedAttribute.textValue, Double.valueOf(clientDefinedAttribute.doubleValue)};
                            if (!equals) {
                                s83.t(li4.h("Can't change %s from %s %s to %s %s", objArr));
                                return null;
                            }
                        }
                        this.clientDefinedAttributes.put(str, clientDefinedAttribute);
                    }
                }
                return this;
            }

            public Builder setContentMayVary(Boolean bool) {
                if (bool == null) {
                    return this;
                }
                Boolean bool2 = this.contentMayVary;
                if (bool2 != null) {
                    sp0.t(bool2.equals(bool), "Can't change contentMayVary from %s to %s", this.contentMayVary, bool);
                }
                this.contentMayVary = bool;
                return this;
            }

            public Builder setCue(List<String> list) {
                if (list.isEmpty()) {
                    return this;
                }
                if (!this.cue.isEmpty()) {
                    boolean equals = this.cue.equals(list);
                    StringBuilder sb = new StringBuilder("Can't change cue from ");
                    List<String> list2 = this.cue;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator<T> it = list2.iterator();
                    if (it.hasNext()) {
                        while (true) {
                            sb2.append((CharSequence) it.next());
                            if (!it.hasNext()) {
                                break;
                            }
                            sb2.append((CharSequence) ", ");
                        }
                    }
                    sb.append(sb2.toString());
                    sb.append(" to ");
                    StringBuilder sb3 = new StringBuilder();
                    Iterator<T> it2 = list.iterator();
                    if (it2.hasNext()) {
                        while (true) {
                            sb3.append((CharSequence) it2.next());
                            if (!it2.hasNext()) {
                                break;
                            }
                            sb3.append((CharSequence) ", ");
                        }
                    }
                    sb.append(sb3.toString());
                    sp0.p(equals, sb.toString());
                }
                this.cue = list;
                return this;
            }

            public Builder setDurationUs(long j) {
                long j2;
                if (j == C.TIME_UNSET) {
                    return this;
                }
                long j3 = this.durationUs;
                if (j3 != C.TIME_UNSET) {
                    j2 = j;
                    sp0.r(j3 == j, "Can't change durationUs from %s to %s", j3, j2);
                } else {
                    j2 = j;
                }
                this.durationUs = j2;
                return this;
            }

            public Builder setEndDateUnixUs(long j) {
                long j2;
                if (j == C.TIME_UNSET) {
                    return this;
                }
                long j3 = this.endDateUnixUs;
                if (j3 != C.TIME_UNSET) {
                    j2 = j;
                    sp0.r(j3 == j, "Can't change endDateUnixUs from %s to %s", j3, j2);
                } else {
                    j2 = j;
                }
                this.endDateUnixUs = j2;
                return this;
            }

            public Builder setEndOnNext(boolean z) {
                if (!z) {
                    return this;
                }
                this.endOnNext = true;
                return this;
            }

            public Builder setPlannedDurationUs(long j) {
                long j2;
                if (j == C.TIME_UNSET) {
                    return this;
                }
                long j3 = this.plannedDurationUs;
                if (j3 != C.TIME_UNSET) {
                    j2 = j;
                    sp0.r(j3 == j, "Can't change plannedDurationUs from %s to %s", j3, j2);
                } else {
                    j2 = j;
                }
                this.plannedDurationUs = j2;
                return this;
            }

            public Builder setPlayoutLimitUs(long j) {
                long j2;
                if (j == C.TIME_UNSET) {
                    return this;
                }
                long j3 = this.playoutLimitUs;
                if (j3 != C.TIME_UNSET) {
                    j2 = j;
                    sp0.r(j3 == j, "Can't change playoutLimitUs from %s to %s", j3, j2);
                } else {
                    j2 = j;
                }
                this.playoutLimitUs = j2;
                return this;
            }

            public Builder setRestrictions(List<String> list) {
                if (list.isEmpty()) {
                    return this;
                }
                if (!this.restrictions.isEmpty()) {
                    boolean equals = this.restrictions.equals(list);
                    StringBuilder sb = new StringBuilder("Can't change restrictions from ");
                    List<String> list2 = this.restrictions;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator<T> it = list2.iterator();
                    if (it.hasNext()) {
                        while (true) {
                            sb2.append((CharSequence) it.next());
                            if (!it.hasNext()) {
                                break;
                            }
                            sb2.append((CharSequence) ", ");
                        }
                    }
                    sb.append(sb2.toString());
                    sb.append(" to ");
                    StringBuilder sb3 = new StringBuilder();
                    Iterator<T> it2 = list.iterator();
                    if (it2.hasNext()) {
                        while (true) {
                            sb3.append((CharSequence) it2.next());
                            if (!it2.hasNext()) {
                                break;
                            }
                            sb3.append((CharSequence) ", ");
                        }
                    }
                    sb.append(sb3.toString());
                    sp0.p(equals, sb.toString());
                }
                this.restrictions = list;
                return this;
            }

            public Builder setResumeOffsetUs(long j) {
                long j2;
                if (j == C.TIME_UNSET) {
                    return this;
                }
                long j3 = this.resumeOffsetUs;
                if (j3 != C.TIME_UNSET) {
                    j2 = j;
                    sp0.r(j3 == j, "Can't change resumeOffsetUs from %s to %s", j3, j2);
                } else {
                    j2 = j;
                }
                this.resumeOffsetUs = j2;
                return this;
            }

            public Builder setSkipControlDurationUs(long j) {
                long j2;
                if (j == C.TIME_UNSET) {
                    return this;
                }
                long j3 = this.skipControlDurationUs;
                if (j3 != C.TIME_UNSET) {
                    j2 = j;
                    sp0.r(j3 == j, "Can't change skipControlDurationUs from %s to %s", j3, j2);
                } else {
                    j2 = j;
                }
                this.skipControlDurationUs = j2;
                return this;
            }

            public Builder setSkipControlLabelId(String str) {
                if (str == null) {
                    return this;
                }
                String str2 = this.skipControlLabelId;
                if (str2 != null) {
                    sp0.t(str2.equals(str), "Can't change skipControlLabelId from %s to %s", this.skipControlLabelId, str);
                }
                this.skipControlLabelId = str;
                return this;
            }

            public Builder setSkipControlOffsetUs(long j) {
                long j2;
                if (j == C.TIME_UNSET) {
                    return this;
                }
                long j3 = this.skipControlOffsetUs;
                if (j3 != C.TIME_UNSET) {
                    j2 = j;
                    sp0.r(j3 == j, "Can't change skipControlOffsetUs from %s to %s", j3, j2);
                } else {
                    j2 = j;
                }
                this.skipControlOffsetUs = j2;
                return this;
            }

            public Builder setSnapTypes(List<String> list) {
                if (list.isEmpty()) {
                    return this;
                }
                if (!this.snapTypes.isEmpty()) {
                    boolean equals = this.snapTypes.equals(list);
                    StringBuilder sb = new StringBuilder("Can't change snapTypes from ");
                    List<String> list2 = this.snapTypes;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator<T> it = list2.iterator();
                    if (it.hasNext()) {
                        while (true) {
                            sb2.append((CharSequence) it.next());
                            if (!it.hasNext()) {
                                break;
                            }
                            sb2.append((CharSequence) ", ");
                        }
                    }
                    sb.append(sb2.toString());
                    sb.append(" to ");
                    StringBuilder sb3 = new StringBuilder();
                    Iterator<T> it2 = list.iterator();
                    if (it2.hasNext()) {
                        while (true) {
                            sb3.append((CharSequence) it2.next());
                            if (!it2.hasNext()) {
                                break;
                            }
                            sb3.append((CharSequence) ", ");
                        }
                    }
                    sb.append(sb3.toString());
                    sp0.p(equals, sb.toString());
                }
                this.snapTypes = list;
                return this;
            }

            public Builder setStartDateUnixUs(long j) {
                long j2;
                if (j == C.TIME_UNSET) {
                    return this;
                }
                long j3 = this.startDateUnixUs;
                if (j3 != C.TIME_UNSET) {
                    j2 = j;
                    sp0.r(j3 == j, "Can't change startDateUnixUs from %s to %s", j3, j2);
                } else {
                    j2 = j;
                }
                this.startDateUnixUs = j2;
                return this;
            }

            public Builder setTimelineOccupies(String str) {
                if (str == null) {
                    return this;
                }
                String str2 = this.timelineOccupies;
                if (str2 != null) {
                    sp0.t(str2.equals(str), "Can't change timelineOccupies from %s to %s", this.timelineOccupies, str);
                }
                this.timelineOccupies = str;
                return this;
            }

            public Builder setTimelineStyle(String str) {
                if (str == null) {
                    return this;
                }
                String str2 = this.timelineStyle;
                if (str2 != null) {
                    sp0.t(str2.equals(str), "Can't change timelineStyle from %s to %s", this.timelineStyle, str);
                }
                this.timelineStyle = str;
                return this;
            }
        }

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface CueTriggerType {
        }

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface NavigationRestriction {
        }

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface SnapType {
        }

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface TimelineOccupiesType {
        }

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface TimelineStyleType {
        }

        public Interstitial(String str, Uri uri, Uri uri2, long j, long j2, long j3, long j4, List<String> list, boolean z, long j5, long j6, List<String> list2, List<String> list3, List<ClientDefinedAttribute> list4, boolean z2, String str2, String str3, long j7, long j8, String str4) {
            sp0.o((uri == null || uri2 == null) && !(uri == null && uri2 == null));
            this.id = str;
            this.assetUri = uri;
            this.assetListUri = uri2;
            this.startDateUnixUs = j;
            this.endDateUnixUs = j2;
            this.durationUs = j3;
            this.plannedDurationUs = j4;
            this.cue = list;
            this.endOnNext = z;
            this.resumeOffsetUs = j5;
            this.playoutLimitUs = j6;
            this.snapTypes = dy1.p(list2);
            this.restrictions = dy1.p(list3);
            this.clientDefinedAttributes = dy1.v(new tj1((byte) 1), list4);
            this.contentMayVary = z2;
            this.timelineOccupies = str2;
            this.timelineStyle = str3;
            this.skipControlOffsetUs = j7;
            this.skipControlDurationUs = j8;
            this.skipControlLabelId = str4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$new$0(ClientDefinedAttribute clientDefinedAttribute, ClientDefinedAttribute clientDefinedAttribute2) {
            return clientDefinedAttribute.name.compareTo(clientDefinedAttribute2.name);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Interstitial)) {
                return false;
            }
            Interstitial interstitial = (Interstitial) obj;
            return this.startDateUnixUs == interstitial.startDateUnixUs && this.endDateUnixUs == interstitial.endDateUnixUs && this.durationUs == interstitial.durationUs && this.plannedDurationUs == interstitial.plannedDurationUs && this.endOnNext == interstitial.endOnNext && this.resumeOffsetUs == interstitial.resumeOffsetUs && this.playoutLimitUs == interstitial.playoutLimitUs && this.contentMayVary == interstitial.contentMayVary && this.skipControlOffsetUs == interstitial.skipControlOffsetUs && this.skipControlDurationUs == interstitial.skipControlDurationUs && Objects.equals(this.id, interstitial.id) && Objects.equals(this.assetUri, interstitial.assetUri) && Objects.equals(this.assetListUri, interstitial.assetListUri) && Objects.equals(this.cue, interstitial.cue) && Objects.equals(this.snapTypes, interstitial.snapTypes) && Objects.equals(this.restrictions, interstitial.restrictions) && Objects.equals(this.clientDefinedAttributes, interstitial.clientDefinedAttributes) && Objects.equals(this.timelineOccupies, interstitial.timelineOccupies) && Objects.equals(this.timelineStyle, interstitial.timelineStyle) && Objects.equals(this.skipControlLabelId, interstitial.skipControlLabelId);
        }

        public int hashCode() {
            return Objects.hash(this.id, this.assetUri, this.assetListUri, Long.valueOf(this.startDateUnixUs), Long.valueOf(this.endDateUnixUs), Long.valueOf(this.durationUs), Long.valueOf(this.plannedDurationUs), this.cue, Boolean.valueOf(this.endOnNext), Long.valueOf(this.resumeOffsetUs), Long.valueOf(this.playoutLimitUs), this.snapTypes, this.restrictions, this.clientDefinedAttributes, Boolean.valueOf(this.contentMayVary), this.timelineOccupies, this.timelineStyle, Long.valueOf(this.skipControlOffsetUs), Long.valueOf(this.skipControlDurationUs), this.skipControlLabelId);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Part extends SegmentBase {
        public final boolean isIndependent;
        public final boolean isPreload;

        public Part(String str, Segment segment, long j, int i, long j2, DrmInitData drmInitData, String str2, String str3, long j3, long j4, boolean z, boolean z2, boolean z3) {
            super(str, segment, j, i, j2, drmInitData, str2, str3, j3, j4, z);
            this.isIndependent = z2;
            this.isPreload = z3;
        }

        public Part copyWith(long j, int i) {
            return new Part(this.url, this.initializationSegment, this.durationUs, i, j, this.drmInitData, this.fullSegmentEncryptionKeyUri, this.encryptionIV, this.byteRangeOffset, this.byteRangeLength, this.hasGapTag, this.isIndependent, this.isPreload);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaylistType {
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class RenditionReport {
        public final long lastMediaSequence;
        public final int lastPartIndex;
        public final Uri playlistUri;

        public RenditionReport(Uri uri, long j, int i) {
            this.playlistUri = uri;
            this.lastMediaSequence = j;
            this.lastPartIndex = i;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class SegmentBase implements Comparable<Long> {
        public final long byteRangeLength;
        public final long byteRangeOffset;
        public final DrmInitData drmInitData;
        public final long durationUs;
        public final String encryptionIV;
        public final String fullSegmentEncryptionKeyUri;
        public final boolean hasGapTag;
        public final Segment initializationSegment;
        public final int relativeDiscontinuitySequence;
        public final long relativeStartTimeUs;
        public final String url;

        private SegmentBase(String str, Segment segment, long j, int i, long j2, DrmInitData drmInitData, String str2, String str3, long j3, long j4, boolean z) {
            this.url = str;
            this.initializationSegment = segment;
            this.durationUs = j;
            this.relativeDiscontinuitySequence = i;
            this.relativeStartTimeUs = j2;
            this.drmInitData = drmInitData;
            this.fullSegmentEncryptionKeyUri = str2;
            this.encryptionIV = str3;
            this.byteRangeOffset = j3;
            this.byteRangeLength = j4;
            this.hasGapTag = z;
        }

        @Override // java.lang.Comparable
        public int compareTo(Long l) {
            if (this.relativeStartTimeUs > l.longValue()) {
                return 1;
            }
            return this.relativeStartTimeUs < l.longValue() ? -1 : 0;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class ServerControl {
        public final boolean canBlockReload;
        public final boolean canSkipDateRanges;
        public final long holdBackUs;
        public final long partHoldBackUs;
        public final long skipUntilUs;

        public ServerControl(long j, boolean z, long j2, long j3, boolean z2) {
            this.skipUntilUs = j;
            this.canSkipDateRanges = z;
            this.holdBackUs = j2;
            this.partHoldBackUs = j3;
            this.canBlockReload = z2;
        }
    }

    public HlsMediaPlaylist(int i, String str, List<String> list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, DrmInitData drmInitData, List<Segment> list2, List<Part> list3, ServerControl serverControl, Map<Uri, RenditionReport> map, List<Interstitial> list4, Segment segment) {
        super(str, list, z3);
        long j6;
        this.playlistType = i;
        this.startTimeUs = j2;
        this.preciseStart = z;
        this.hasDiscontinuitySequence = z2;
        this.discontinuitySequence = i2;
        this.mediaSequence = j3;
        this.version = i3;
        this.targetDurationUs = j4;
        this.partTargetDurationUs = j5;
        this.hasEndTag = z4;
        this.hasProgramDateTime = z5;
        this.protectionSchemes = drmInitData;
        this.segments = dy1.p(list2);
        this.trailingParts = dy1.p(list3);
        this.renditionReports = iy1.a(map);
        this.interstitials = dy1.p(list4);
        this.lastSeenInitSegment = segment;
        if (!list3.isEmpty()) {
            Part part = (Part) rt0.z(list3);
            j6 = part.relativeStartTimeUs + part.durationUs;
            this.durationUs = j6;
        } else if (list2.isEmpty()) {
            this.durationUs = 0L;
            j6 = 0;
        } else {
            Segment segment2 = (Segment) rt0.z(list2);
            j6 = segment2.relativeStartTimeUs + segment2.durationUs;
            this.durationUs = j6;
        }
        this.startOffsetUs = j != C.TIME_UNSET ? j >= 0 ? Math.min(j6, j) : Math.max(0L, j6 + j) : C.TIME_UNSET;
        this.hasPositiveStartOffset = j >= 0;
        this.serverControl = serverControl;
    }

    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    /* renamed from: copy, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ HlsPlaylist copy2(List list) {
        return copy((List<StreamKey>) list);
    }

    public HlsMediaPlaylist copyWith(long j, int i) {
        return new HlsMediaPlaylist(this.playlistType, this.baseUri, this.tags, this.startOffsetUs, this.preciseStart, j, true, i, this.mediaSequence, this.version, this.targetDurationUs, this.partTargetDurationUs, this.hasIndependentSegments, this.hasEndTag, this.hasProgramDateTime, this.protectionSchemes, this.segments, this.trailingParts, this.serverControl, this.renditionReports, this.interstitials, this.lastSeenInitSegment);
    }

    public HlsMediaPlaylist copyWithEndTag() {
        return this.hasEndTag ? this : new HlsMediaPlaylist(this.playlistType, this.baseUri, this.tags, this.startOffsetUs, this.preciseStart, this.startTimeUs, this.hasDiscontinuitySequence, this.discontinuitySequence, this.mediaSequence, this.version, this.targetDurationUs, this.partTargetDurationUs, this.hasIndependentSegments, true, this.hasProgramDateTime, this.protectionSchemes, this.segments, this.trailingParts, this.serverControl, this.renditionReports, this.interstitials, this.lastSeenInitSegment);
    }

    public long getEndTimeUs() {
        return this.startTimeUs + this.durationUs;
    }

    public boolean isNewerThan(HlsMediaPlaylist hlsMediaPlaylist) {
        if (hlsMediaPlaylist != null) {
            long j = this.mediaSequence;
            long j2 = hlsMediaPlaylist.mediaSequence;
            if (j <= j2) {
                if (j < j2) {
                    return false;
                }
                int size = this.segments.size() - hlsMediaPlaylist.segments.size();
                if (size != 0) {
                    return size > 0;
                }
                int size2 = this.trailingParts.size();
                int size3 = hlsMediaPlaylist.trailingParts.size();
                if (size2 <= size3 && (size2 != size3 || !this.hasEndTag || hlsMediaPlaylist.hasEndTag)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    public HlsPlaylist copy(List<StreamKey> list) {
        return this;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class ClientDefinedAttribute {
        public static final int TYPE_DOUBLE = 2;
        public static final int TYPE_HEX_TEXT = 1;
        public static final int TYPE_TEXT = 0;
        private final double doubleValue;
        public final String name;
        private final String textValue;
        public final int type;

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }

        public ClientDefinedAttribute(String str, String str2, int i) {
            boolean z = true;
            if (i == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
                z = false;
            }
            sp0.z(z);
            this.name = str;
            this.type = i;
            this.textValue = str2;
            this.doubleValue = 0.0d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClientDefinedAttribute)) {
                return false;
            }
            ClientDefinedAttribute clientDefinedAttribute = (ClientDefinedAttribute) obj;
            return this.type == clientDefinedAttribute.type && Double.compare(this.doubleValue, clientDefinedAttribute.doubleValue) == 0 && Objects.equals(this.name, clientDefinedAttribute.name) && Objects.equals(this.textValue, clientDefinedAttribute.textValue);
        }

        public double getDoubleValue() {
            sp0.z(this.type == 2);
            return this.doubleValue;
        }

        public String getTextValue() {
            sp0.z(this.type != 2);
            String str = this.textValue;
            str.getClass();
            return str;
        }

        public int hashCode() {
            return Objects.hash(this.name, Integer.valueOf(this.type), Double.valueOf(this.doubleValue), this.textValue);
        }

        public ClientDefinedAttribute(String str, double d) {
            this.name = str;
            this.type = 2;
            this.doubleValue = d;
            this.textValue = null;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Segment extends SegmentBase {
        public final List<Part> parts;
        public final String title;

        public Segment(String str, Segment segment, String str2, long j, int i, long j2, DrmInitData drmInitData, String str3, String str4, long j3, long j4, boolean z, List<Part> list) {
            super(str, segment, j, i, j2, drmInitData, str3, str4, j3, j4, z);
            this.title = str2;
            this.parts = dy1.p(list);
        }

        public Segment copyWith(long j, int i) {
            ArrayList arrayList = new ArrayList();
            long j2 = j;
            for (int i2 = 0; i2 < this.parts.size(); i2++) {
                Part part = this.parts.get(i2);
                arrayList.add(part.copyWith(j2, i));
                j2 += part.durationUs;
            }
            return new Segment(this.url, this.initializationSegment, this.title, this.durationUs, i, j, this.drmInitData, this.fullSegmentEncryptionKeyUri, this.encryptionIV, this.byteRangeOffset, this.byteRangeLength, this.hasGapTag, arrayList);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Segment(String str, long j, long j2, String str2, String str3) {
            this(str, null, "", 0L, -1, C.TIME_UNSET, null, str2, str3, j, j2, false, x24.M);
            ay1 ay1Var = dy1.J;
        }
    }
}

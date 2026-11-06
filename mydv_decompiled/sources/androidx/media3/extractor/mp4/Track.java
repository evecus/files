package androidx.media3.extractor.mp4;

import androidx.media3.common.C;
import androidx.media3.common.Format;
import defpackage.fy1;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Track {
    public static final long TIMESCALE_UNSET = -1;
    public static final int TRANSFORMATION_CEA608_CDAT = 1;
    public static final int TRANSFORMATION_NONE = 0;
    public final int chapterTrackId;
    public final long durationUs;
    public final fy1 editListDurations;
    public final fy1 editListMediaTimes;
    public final Format format;
    public final int id;
    public final long mediaDurationUs;
    public final long movieTimescale;
    public final int nalUnitLengthFieldLength;
    private final TrackEncryptionBox[] sampleDescriptionEncryptionBoxes;
    public final int sampleTransformation;
    public final boolean shouldBeExposed;
    public final long timescale;
    public final int type;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Transformation {
    }

    @Deprecated
    public Track(int i, int i2, long j, long j2, long j3, long j4, Format format, int i3, TrackEncryptionBox[] trackEncryptionBoxArr, int i4, long[] jArr, long[] jArr2, boolean z, int i5) {
        fy1 fy1Var;
        this.id = i;
        this.type = i2;
        this.timescale = j;
        this.movieTimescale = j2;
        this.durationUs = j3;
        this.mediaDurationUs = j4;
        this.format = format;
        this.sampleTransformation = i3;
        fy1 fy1Var2 = null;
        this.sampleDescriptionEncryptionBoxes = trackEncryptionBoxArr == null ? null : (TrackEncryptionBox[]) trackEncryptionBoxArr.clone();
        this.nalUnitLengthFieldLength = i4;
        fy1 fy1Var3 = fy1.K;
        if (jArr == null) {
            fy1Var = null;
        } else if (jArr.length == 0) {
            fy1Var = fy1Var3;
        } else {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            fy1Var = new fy1(copyOf, copyOf.length);
        }
        this.editListDurations = fy1Var;
        if (jArr2 != null) {
            if (jArr2.length == 0) {
                fy1Var2 = fy1Var3;
            } else {
                long[] copyOf2 = Arrays.copyOf(jArr2, jArr2.length);
                fy1Var2 = new fy1(copyOf2, copyOf2.length);
            }
        }
        this.editListMediaTimes = fy1Var2;
        this.shouldBeExposed = z;
        this.chapterTrackId = i5;
    }

    public Builder buildUpon() {
        return new Builder();
    }

    @Deprecated
    public Track copyWithFormat(Format format) {
        return buildUpon().setFormat(format).build();
    }

    @Deprecated
    public Track copyWithoutEditLists() {
        return buildUpon().setEditListDurations(null).setEditListMediaTimes(null).build();
    }

    public TrackEncryptionBox getSampleDescriptionEncryptionBox(int i) {
        TrackEncryptionBox[] trackEncryptionBoxArr = this.sampleDescriptionEncryptionBoxes;
        if (trackEncryptionBoxArr == null) {
            return null;
        }
        return trackEncryptionBoxArr[i];
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private int chapterTrackId;
        private long durationUs;
        private fy1 editListDurations;
        private fy1 editListMediaTimes;
        private Format format;
        private int id;
        private long mediaDurationUs;
        private long movieTimescale;
        private int nalUnitLengthFieldLength;
        private TrackEncryptionBox[] sampleDescriptionEncryptionBoxes;
        private int sampleTransformation;
        private boolean shouldBeExposed;
        private long timescale;
        private int type;

        private Builder(Track track) {
            this.id = track.id;
            this.type = track.type;
            this.timescale = track.timescale;
            this.movieTimescale = track.movieTimescale;
            this.durationUs = track.durationUs;
            this.mediaDurationUs = track.mediaDurationUs;
            this.format = track.format;
            this.sampleTransformation = track.sampleTransformation;
            this.sampleDescriptionEncryptionBoxes = track.sampleDescriptionEncryptionBoxes;
            this.nalUnitLengthFieldLength = track.nalUnitLengthFieldLength;
            this.editListDurations = track.editListDurations;
            this.editListMediaTimes = track.editListMediaTimes;
            this.shouldBeExposed = track.shouldBeExposed;
            this.chapterTrackId = track.chapterTrackId;
        }

        public Track build() {
            this.format.getClass();
            return new Track(this);
        }

        public Builder setChapterTrackId(int i) {
            this.chapterTrackId = i;
            return this;
        }

        public Builder setDurationUs(long j) {
            this.durationUs = j;
            return this;
        }

        public Builder setEditListDurations(fy1 fy1Var) {
            this.editListDurations = fy1Var;
            return this;
        }

        public Builder setEditListMediaTimes(fy1 fy1Var) {
            this.editListMediaTimes = fy1Var;
            return this;
        }

        public Builder setFormat(Format format) {
            this.format = format;
            return this;
        }

        public Builder setId(int i) {
            this.id = i;
            return this;
        }

        public Builder setMediaDurationUs(long j) {
            this.mediaDurationUs = j;
            return this;
        }

        public Builder setMovieTimescale(long j) {
            this.movieTimescale = j;
            return this;
        }

        public Builder setNalUnitLengthFieldLength(int i) {
            this.nalUnitLengthFieldLength = i;
            return this;
        }

        public Builder setSampleDescriptionEncryptionBoxes(TrackEncryptionBox[] trackEncryptionBoxArr) {
            this.sampleDescriptionEncryptionBoxes = trackEncryptionBoxArr == null ? null : (TrackEncryptionBox[]) trackEncryptionBoxArr.clone();
            return this;
        }

        public Builder setSampleTransformation(int i) {
            this.sampleTransformation = i;
            return this;
        }

        public Builder setShouldBeExposed(boolean z) {
            this.shouldBeExposed = z;
            return this;
        }

        public Builder setTimescale(long j) {
            this.timescale = j;
            return this;
        }

        public Builder setType(int i) {
            this.type = i;
            return this;
        }

        public Builder() {
            this.type = -1;
            this.timescale = -1L;
            this.movieTimescale = -1L;
            this.durationUs = C.TIME_UNSET;
            this.mediaDurationUs = C.TIME_UNSET;
            this.sampleTransformation = 0;
            this.shouldBeExposed = true;
            this.chapterTrackId = -1;
        }
    }

    private Track(Builder builder) {
        this.id = builder.id;
        this.type = builder.type;
        this.timescale = builder.timescale;
        this.movieTimescale = builder.movieTimescale;
        this.durationUs = builder.durationUs;
        this.mediaDurationUs = builder.mediaDurationUs;
        Format format = builder.format;
        format.getClass();
        this.format = format;
        this.sampleTransformation = builder.sampleTransformation;
        this.sampleDescriptionEncryptionBoxes = builder.sampleDescriptionEncryptionBoxes;
        this.nalUnitLengthFieldLength = builder.nalUnitLengthFieldLength;
        this.editListDurations = builder.editListDurations;
        this.editListMediaTimes = builder.editListMediaTimes;
        this.shouldBeExposed = builder.shouldBeExposed;
        this.chapterTrackId = builder.chapterTrackId;
    }
}

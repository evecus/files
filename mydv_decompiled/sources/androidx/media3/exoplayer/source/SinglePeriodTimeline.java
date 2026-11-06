package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import defpackage.sp0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class SinglePeriodTimeline extends Timeline {
    private final long elapsedRealtimeEpochOffsetMs;
    private final boolean isDynamic;
    private final boolean isSeekable;
    private final MediaItem.LiveConfiguration liveConfiguration;
    private final Object manifest;
    private final MediaItem mediaItem;
    private final long periodDurationUs;
    private final long presentationStartTimeMs;
    private final boolean suppressPositionProjection;
    private final long windowDefaultStartPositionUs;
    private final long windowDurationUs;
    private final long windowPositionInPeriodUs;
    private final long windowStartTimeMs;
    private static final Object UID = new Object();
    private static final MediaItem MEDIA_ITEM = new MediaItem.Builder().setMediaId("SinglePeriodTimeline").setUri(Uri.EMPTY).build();

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SinglePeriodTimeline(long r24, long r26, long r28, long r30, long r32, long r34, long r36, boolean r38, boolean r39, boolean r40, java.lang.Object r41, java.lang.Object r42) {
        /*
            r23 = this;
            androidx.media3.common.MediaItem r0 = androidx.media3.exoplayer.source.SinglePeriodTimeline.MEDIA_ITEM
            androidx.media3.common.MediaItem$Builder r1 = r0.buildUpon()
            r2 = r42
            androidx.media3.common.MediaItem$Builder r1 = r1.setTag(r2)
            androidx.media3.common.MediaItem r21 = r1.build()
            if (r40 == 0) goto L17
            androidx.media3.common.MediaItem$LiveConfiguration r0 = r0.liveConfiguration
        L14:
            r22 = r0
            goto L19
        L17:
            r0 = 0
            goto L14
        L19:
            r19 = 0
            r2 = r23
            r3 = r24
            r5 = r26
            r7 = r28
            r9 = r30
            r11 = r32
            r13 = r34
            r15 = r36
            r17 = r38
            r18 = r39
            r20 = r41
            r2.<init>(r3, r5, r7, r9, r11, r13, r15, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.SinglePeriodTimeline.<init>(long, long, long, long, long, long, long, boolean, boolean, boolean, java.lang.Object, java.lang.Object):void");
    }

    @Override // androidx.media3.common.Timeline
    public int getIndexOfPeriod(Object obj) {
        return UID.equals(obj) ? 0 : -1;
    }

    @Override // androidx.media3.common.Timeline
    public Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
        sp0.u(i, 1);
        return period.set(null, z ? UID : null, 0, this.periodDurationUs, -this.windowPositionInPeriodUs, AdPlaybackState.NONE, false);
    }

    @Override // androidx.media3.common.Timeline
    public int getPeriodCount() {
        return 1;
    }

    @Override // androidx.media3.common.Timeline
    public Object getUidOfPeriod(int i) {
        sp0.u(i, 1);
        return UID;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r1 > r3) goto L10;
     */
    @Override // androidx.media3.common.Timeline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.media3.common.Timeline.Window getWindow(int r25, androidx.media3.common.Timeline.Window r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 1
            r2 = r25
            defpackage.sp0.u(r2, r1)
            long r1 = r0.windowDefaultStartPositionUs
            boolean r14 = r0.isDynamic
            if (r14 == 0) goto L2d
            boolean r3 = r0.suppressPositionProjection
            if (r3 != 0) goto L2d
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2d
            long r3 = r0.windowDurationUs
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L26
        L23:
            r16 = r5
            goto L2f
        L26:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2d
            goto L23
        L2d:
            r16 = r1
        L2f:
            java.lang.Object r4 = androidx.media3.common.Timeline.Window.SINGLE_WINDOW_UID
            androidx.media3.common.MediaItem r5 = r0.mediaItem
            java.lang.Object r6 = r0.manifest
            long r7 = r0.presentationStartTimeMs
            long r9 = r0.windowStartTimeMs
            long r11 = r0.elapsedRealtimeEpochOffsetMs
            boolean r13 = r0.isSeekable
            androidx.media3.common.MediaItem$LiveConfiguration r15 = r0.liveConfiguration
            long r1 = r0.windowDurationUs
            r21 = 0
            r18 = r1
            long r0 = r0.windowPositionInPeriodUs
            r20 = 0
            r3 = r26
            r22 = r0
            androidx.media3.common.Timeline$Window r0 = r3.set(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.SinglePeriodTimeline.getWindow(int, androidx.media3.common.Timeline$Window, long):androidx.media3.common.Timeline$Window");
    }

    @Override // androidx.media3.common.Timeline
    public int getWindowCount() {
        return 1;
    }

    public SinglePeriodTimeline(long j, boolean z, boolean z2, boolean z3, Object obj, MediaItem mediaItem) {
        this(j, j, 0L, 0L, z, z2, z3, obj, mediaItem);
    }

    @Deprecated
    public SinglePeriodTimeline(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, Object obj, Object obj2) {
        this(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, j, j2, j3, j4, z, z2, z3, obj, obj2);
    }

    public SinglePeriodTimeline(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, Object obj, MediaItem mediaItem) {
        this(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, j, j2, j3, j4, z, z2, false, obj, mediaItem, z3 ? mediaItem.liveConfiguration : null);
    }

    @Deprecated
    public SinglePeriodTimeline(long j, boolean z, boolean z2, boolean z3, Object obj, Object obj2) {
        this(j, j, 0L, 0L, z, z2, z3, obj, obj2);
    }

    @Deprecated
    public SinglePeriodTimeline(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, Object obj, MediaItem mediaItem, MediaItem.LiveConfiguration liveConfiguration) {
        this(j, j2, j3, j4, j5, j6, j7, z, z2, false, obj, mediaItem, liveConfiguration);
    }

    public SinglePeriodTimeline(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, Object obj, MediaItem mediaItem, MediaItem.LiveConfiguration liveConfiguration) {
        this.presentationStartTimeMs = j;
        this.windowStartTimeMs = j2;
        this.elapsedRealtimeEpochOffsetMs = j3;
        this.periodDurationUs = j4;
        this.windowDurationUs = j5;
        this.windowPositionInPeriodUs = j6;
        this.windowDefaultStartPositionUs = j7;
        this.isSeekable = z;
        this.isDynamic = z2;
        this.suppressPositionProjection = z3;
        this.manifest = obj;
        mediaItem.getClass();
        this.mediaItem = mediaItem;
        this.liveConfiguration = liveConfiguration;
    }
}

package androidx.media3.common;

import defpackage.r7;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class VideoFrameProcessingException extends Exception {
    public final long presentationTimeUs;

    public VideoFrameProcessingException(String str, long j) {
        super(str + getPresentationTimeUsString(j));
        this.presentationTimeUs = j;
    }

    public static VideoFrameProcessingException from(Exception exc, long j) {
        return exc instanceof VideoFrameProcessingException ? (VideoFrameProcessingException) exc : new VideoFrameProcessingException(exc, j);
    }

    private static String getPresentationTimeUsString(long j) {
        return j == C.TIME_UNSET ? " @UNSET" : r7.A(" @", j);
    }

    public static VideoFrameProcessingException from(Exception exc) {
        return from(exc, C.TIME_UNSET);
    }

    public VideoFrameProcessingException(String str) {
        this(str, C.TIME_UNSET);
    }

    public VideoFrameProcessingException(String str, Throwable th) {
        this(str, th, C.TIME_UNSET);
    }

    public VideoFrameProcessingException(String str, Throwable th, long j) {
        super(str + getPresentationTimeUsString(j), th);
        this.presentationTimeUs = j;
    }

    public VideoFrameProcessingException(Throwable th) {
        this(th, C.TIME_UNSET);
    }

    public VideoFrameProcessingException(Throwable th, long j) {
        super(getPresentationTimeUsString(j), th);
        this.presentationTimeUs = j;
    }
}

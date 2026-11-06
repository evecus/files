package androidx.media3.exoplayer.source.preload;

import androidx.media3.common.MediaItem;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class PreloadException extends Exception {
    public final MediaItem mediaItem;

    public PreloadException(MediaItem mediaItem, String str, Throwable th) {
        super(str, th);
        this.mediaItem = mediaItem;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        if (r3 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean errorInfoEquals(androidx.media3.exoplayer.source.preload.PreloadException r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L4f
            java.lang.Throwable r2 = r6.getCause()
            java.lang.Throwable r3 = r7.getCause()
            if (r2 == 0) goto L31
            if (r3 == 0) goto L31
            java.lang.String r4 = r2.getMessage()
            java.lang.String r5 = r3.getMessage()
            boolean r4 = j$.util.Objects.equals(r4, r5)
            if (r4 != 0) goto L22
            return r1
        L22:
            java.lang.Class r2 = r2.getClass()
            java.lang.Class r3 = r3.getClass()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L36
            return r1
        L31:
            if (r2 != 0) goto L4f
            if (r3 == 0) goto L36
            goto L4f
        L36:
            androidx.media3.common.MediaItem r2 = r6.mediaItem
            androidx.media3.common.MediaItem r3 = r7.mediaItem
            boolean r2 = j$.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L4f
            java.lang.String r6 = r6.getMessage()
            java.lang.String r7 = r7.getMessage()
            boolean r6 = j$.util.Objects.equals(r6, r7)
            if (r6 == 0) goto L4f
            return r0
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.preload.PreloadException.errorInfoEquals(androidx.media3.exoplayer.source.preload.PreloadException):boolean");
    }
}

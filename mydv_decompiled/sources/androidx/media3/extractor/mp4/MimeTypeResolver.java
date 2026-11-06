package androidx.media3.extractor.mp4;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import j$.util.Objects;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class MimeTypeResolver {
    private MimeTypeResolver() {
    }

    public static String getContainerMimeType(List<TrackSampleTable> list) {
        Iterator<TrackSampleTable> it = list.iterator();
        boolean z = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = it.next().track.format.sampleMimeType;
            if (MimeTypes.isVideo(str2)) {
                return MimeTypes.VIDEO_MP4;
            }
            if (MimeTypes.isAudio(str2)) {
                z = true;
            } else if (MimeTypes.isImage(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, MimeTypes.IMAGE_AVIF)) {
                    str = MimeTypes.IMAGE_AVIF;
                }
            }
        }
        return z ? MimeTypes.AUDIO_MP4 : str != null ? str : MimeTypes.APPLICATION_MP4;
    }

    public static String getContainerMimeType(Format format) {
        String str = format.sampleMimeType;
        if (MimeTypes.isVideo(str)) {
            return MimeTypes.VIDEO_MP4;
        }
        if (MimeTypes.isAudio(str)) {
            return MimeTypes.AUDIO_MP4;
        }
        if (MimeTypes.isImage(str)) {
            if (Objects.equals(str, "image/heic")) {
                return "image/heif";
            }
            if (Objects.equals(str, MimeTypes.IMAGE_AVIF)) {
                return MimeTypes.IMAGE_AVIF;
            }
            return MimeTypes.APPLICATION_MP4;
        }
        return MimeTypes.APPLICATION_MP4;
    }
}

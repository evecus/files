package defpackage;

import android.text.TextUtils;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.exoplayer.source.preload.DefaultPreloadManager;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import androidx.media3.extractor.mp3.Mp3Extractor;
import androidx.media3.extractor.mp4.Mp4Extractor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class js0 implements mr3 {
    public final /* synthetic */ byte I;

    public /* synthetic */ js0(byte b) {
        this.I = b;
    }

    @Override // defpackage.mr3
    public final boolean apply(Object obj) {
        boolean lambda$preloadMediaSourceHolderInternal$0;
        boolean lambda$getId3TlenUs$2;
        boolean lambda$readQuickTimeChapters$6;
        boolean lambda$maybeSetDefaultSampleOffsetForAuxiliaryTracks$4;
        boolean lambda$shouldSeekToAxteAtom$3;
        boolean lambda$getAuxiliaryTrackTypesForAuxiliaryTracks$5;
        switch (this.I) {
            case 0:
                lambda$preloadMediaSourceHolderInternal$0 = DefaultPreloadManager.lambda$preloadMediaSourceHolderInternal$0((DefaultPreloadManager.PreloadStatus) obj);
                return lambda$preloadMediaSourceHolderInternal$0;
            case 1:
                String str = (String) obj;
                if (str != null) {
                    String j0 = j42.j0(str);
                    if (!TextUtils.isEmpty(j0) && ((!j0.contains("text") || j0.contains(MimeTypes.TEXT_VTT)) && !j0.contains("html") && !j0.contains("xml"))) {
                        return true;
                    }
                }
                return false;
            case 2:
                lambda$getId3TlenUs$2 = Mp3Extractor.lambda$getId3TlenUs$2((TextInformationFrame) obj);
                return lambda$getId3TlenUs$2;
            case 3:
                lambda$readQuickTimeChapters$6 = Mp4Extractor.lambda$readQuickTimeChapters$6((Metadata.Entry) obj);
                return lambda$readQuickTimeChapters$6;
            case 4:
                lambda$maybeSetDefaultSampleOffsetForAuxiliaryTracks$4 = Mp4Extractor.lambda$maybeSetDefaultSampleOffsetForAuxiliaryTracks$4((MdtaMetadataEntry) obj);
                return lambda$maybeSetDefaultSampleOffsetForAuxiliaryTracks$4;
            case 5:
                lambda$shouldSeekToAxteAtom$3 = Mp4Extractor.lambda$shouldSeekToAxteAtom$3((MdtaMetadataEntry) obj);
                return lambda$shouldSeekToAxteAtom$3;
            default:
                lambda$getAuxiliaryTrackTypesForAuxiliaryTracks$5 = Mp4Extractor.lambda$getAuxiliaryTrackTypesForAuxiliaryTracks$5((MdtaMetadataEntry) obj);
                return lambda$getAuxiliaryTrackTypesForAuxiliaryTracks$5;
        }
    }
}

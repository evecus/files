package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.DataReader;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface ProgressiveMediaExtractor {

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Factory {
        ProgressiveMediaExtractor createProgressiveMediaExtractor(PlayerId playerId);
    }

    void disableSeekingOnMp3Streams();

    long getCurrentInputPosition();

    String getUnderlyingImplementationName();

    void init(DataReader dataReader, Uri uri, Map<String, List<String>> map, long j, long j2, ExtractorOutput extractorOutput);

    int read(PositionHolder positionHolder);

    void release();

    void seek(long j, long j2);
}

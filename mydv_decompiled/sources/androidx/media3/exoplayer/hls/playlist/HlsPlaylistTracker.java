package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import androidx.media3.exoplayer.hls.HlsDataSourceFactory;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.contentsteering.ContentSteeringTracker;
import defpackage.gz4;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public interface HlsPlaylistTracker {

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Factory {
        HlsPlaylistTracker createTracker(HlsDataSourceFactory hlsDataSourceFactory, LoadErrorHandlingPolicy loadErrorHandlingPolicy, HlsPlaylistParserFactory hlsPlaylistParserFactory, CmcdConfiguration cmcdConfiguration, gz4 gz4Var);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface PlaylistEventListener {
        void onPlaylistChanged();

        boolean onPlaylistError(Uri uri, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean z);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class PlaylistResetException extends IOException {
        public final Uri url;

        public PlaylistResetException(Uri uri) {
            this.url = uri;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class PlaylistStuckException extends IOException {
        public final Uri url;

        public PlaylistStuckException(Uri uri) {
            this.url = uri;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface PrimaryPlaylistListener {
        void onPrimaryPlaylistRefreshed(HlsMediaPlaylist hlsMediaPlaylist);
    }

    void addListener(PlaylistEventListener playlistEventListener);

    void deactivatePlaylistForPlayback(Uri uri);

    boolean excludeMediaPlaylist(Uri uri, long j);

    ContentSteeringTracker getContentSteeringTracker();

    long getInitialStartTimeUs();

    HlsMultivariantPlaylist getMultivariantPlaylist();

    HlsMediaPlaylist getPlaylistSnapshot(Uri uri, boolean z);

    HlsRedundantGroup getRedundantGroup(Uri uri);

    List<HlsRedundantGroup> getRedundantGroups(int i);

    boolean isExcluded(Uri uri, long j);

    boolean isExcluded(HlsRedundantGroup hlsRedundantGroup, long j);

    boolean isLive();

    boolean isSnapshotValid(Uri uri);

    void maybeThrowPlaylistRefreshError(Uri uri);

    void maybeThrowPrimaryPlaylistRefreshError();

    void refreshPlaylist(Uri uri);

    void removeListener(PlaylistEventListener playlistEventListener);

    void start(Uri uri, MediaSourceEventListener.EventDispatcher eventDispatcher, PrimaryPlaylistListener primaryPlaylistListener, BandwidthMeter bandwidthMeter);

    void stop();
}

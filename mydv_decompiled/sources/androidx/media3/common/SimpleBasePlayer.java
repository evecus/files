package androidx.media3.common;

import android.graphics.Rect;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.Timeline;
import androidx.media3.common.Tracks;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.Util;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.ep4;
import defpackage.fl2;
import defpackage.fp4;
import defpackage.gz4;
import defpackage.h8;
import defpackage.po4;
import defpackage.s83;
import defpackage.so4;
import defpackage.sp0;
import defpackage.to4;
import defpackage.uo4;
import defpackage.w7;
import defpackage.ws0;
import defpackage.x24;
import defpackage.xo4;
import defpackage.zx1;
import defpackage.zy;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class SimpleBasePlayer extends BasePlayer {
    private static final long POSITION_DISCONTINUITY_THRESHOLD_MS = 1000;
    private final HandlerWrapper applicationHandler;
    private final Looper applicationLooper;
    private final ListenerSet<Player.Listener> listeners;
    private final Set<fl2> pendingOperations;
    private final Timeline.Period period;
    private boolean released;
    private State state;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class LivePositionSupplier implements PositionSupplier {
        private long finalValue = C.TIME_UNSET;
        private final PositionSupplier livePosition;

        public LivePositionSupplier(PositionSupplier positionSupplier) {
            this.livePosition = positionSupplier;
        }

        public void disconnect(long j) {
            this.finalValue = j;
        }

        @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
        public long get() {
            long j = this.finalValue;
            return j != C.TIME_UNSET ? j : this.livePosition.get();
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class PlaceholderUid {
        private PlaceholderUid() {
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class PlaylistTimeline extends Timeline {
        private final int[] firstPeriodIndexByWindowIndex;
        private final HashMap<Object, Integer> periodIndexByUid;
        private final dy1 playlist;
        private final int[] windowIndexByPeriodIndex;

        public PlaylistTimeline(List<MediaItemData> list) {
            int size = list.size();
            this.playlist = dy1.p(list);
            this.firstPeriodIndexByWindowIndex = new int[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                MediaItemData mediaItemData = list.get(i2);
                this.firstPeriodIndexByWindowIndex[i2] = i;
                i += getPeriodCountInMediaItem(mediaItemData);
            }
            this.windowIndexByPeriodIndex = new int[i];
            this.periodIndexByUid = new HashMap<>();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                MediaItemData mediaItemData2 = list.get(i4);
                for (int i5 = 0; i5 < getPeriodCountInMediaItem(mediaItemData2); i5++) {
                    this.periodIndexByUid.put(mediaItemData2.getPeriodUid(i5), Integer.valueOf(i3));
                    this.windowIndexByPeriodIndex[i3] = i4;
                    i3++;
                }
            }
        }

        private static int getPeriodCountInMediaItem(MediaItemData mediaItemData) {
            if (mediaItemData.periods.isEmpty()) {
                return 1;
            }
            return mediaItemData.periods.size();
        }

        @Override // androidx.media3.common.Timeline
        public int getFirstWindowIndex(boolean z) {
            return super.getFirstWindowIndex(z);
        }

        @Override // androidx.media3.common.Timeline
        public int getIndexOfPeriod(Object obj) {
            Integer num = this.periodIndexByUid.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // androidx.media3.common.Timeline
        public int getLastWindowIndex(boolean z) {
            return super.getLastWindowIndex(z);
        }

        @Override // androidx.media3.common.Timeline
        public int getNextWindowIndex(int i, int i2, boolean z) {
            return super.getNextWindowIndex(i, i2, z);
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
            int i2 = this.windowIndexByPeriodIndex[i];
            return ((MediaItemData) this.playlist.get(i2)).getPeriod(i2, i - this.firstPeriodIndexByWindowIndex[i2], period);
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Period getPeriodByUid(Object obj, Timeline.Period period) {
            Integer num = this.periodIndexByUid.get(obj);
            num.getClass();
            return getPeriod(num.intValue(), period, true);
        }

        @Override // androidx.media3.common.Timeline
        public int getPeriodCount() {
            return this.windowIndexByPeriodIndex.length;
        }

        @Override // androidx.media3.common.Timeline
        public int getPreviousWindowIndex(int i, int i2, boolean z) {
            return super.getPreviousWindowIndex(i, i2, z);
        }

        @Override // androidx.media3.common.Timeline
        public Object getUidOfPeriod(int i) {
            int i2 = this.windowIndexByPeriodIndex[i];
            return ((MediaItemData) this.playlist.get(i2)).getPeriodUid(i - this.firstPeriodIndexByWindowIndex[i2]);
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Window getWindow(int i, Timeline.Window window, long j) {
            return ((MediaItemData) this.playlist.get(i)).getWindow(this.firstPeriodIndexByWindowIndex[i], window);
        }

        @Override // androidx.media3.common.Timeline
        public int getWindowCount() {
            return this.playlist.size();
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface PositionSupplier {
        public static final PositionSupplier ZERO;

        static {
            int i = fp4.a;
            ZERO = new ep4(0L);
        }

        long get();
    }

    public SimpleBasePlayer(Looper looper, Clock clock) {
        this.applicationLooper = looper;
        this.applicationHandler = clock.createHandler(looper, null);
        this.pendingOperations = Collections.newSetFromMap(new IdentityHashMap());
        this.period = new Timeline.Period();
        this.listeners = new ListenerSet<>(looper, clock, new w7(this, (byte) 17));
    }

    private static List<MediaItemData> buildMutablePlaylistFromState(State state, Timeline.Period period, Timeline.Window window) {
        if (state.timeline instanceof PlaylistTimeline) {
            return new ArrayList(((PlaylistTimeline) state.timeline).playlist);
        }
        ArrayList arrayList = new ArrayList(state.timeline.getWindowCount());
        for (int i = 0; i < state.timeline.getWindowCount(); i++) {
            arrayList.add(MediaItemData.buildFromState(state, i, period, window));
        }
        return arrayList;
    }

    private static State buildStateForNewPosition(State.Builder builder, State state, long j, Timeline timeline, int i, long j2, boolean z, Timeline.Window window) {
        long j3;
        int i2 = i;
        long positionOrDefaultInMediaItem = getPositionOrDefaultInMediaItem(j, state, window);
        boolean z2 = false;
        if (timeline.isEmpty() || (i2 != -1 && i2 < timeline.getWindowCount())) {
            j3 = j2;
        } else {
            j3 = -9223372036854775807L;
            i2 = 0;
        }
        if (!timeline.isEmpty() && j3 == C.TIME_UNSET) {
            j3 = timeline.getWindow(i2, window).getDefaultPositionMs();
        }
        boolean z3 = state.timeline.isEmpty() || timeline.isEmpty();
        boolean z4 = (z3 || state.timeline.getWindow(getCurrentMediaItemIndexInternal(state), window).uid.equals(timeline.getWindow(i2, window).uid)) ? false : true;
        if (timeline.isEmpty()) {
            builder.setPlaylist(timeline, Tracks.EMPTY, null);
        } else if (timeline instanceof PlaylistTimeline) {
            MediaItemData mediaItemData = (MediaItemData) ((PlaylistTimeline) timeline).playlist.get(i2);
            builder.setPlaylist(timeline, mediaItemData.tracks, mediaItemData.mediaMetadata);
        } else {
            if (!z3 && !z4) {
                z2 = true;
            }
            builder.setPlaylist(timeline, z2 ? state.currentTracks : Tracks.EMPTY, z2 ? state.currentMetadata : null);
        }
        if (z3 || z4 || j3 < positionOrDefaultInMediaItem) {
            State.Builder contentPositionMs = builder.setCurrentMediaItemIndex(i2).setCurrentAd(-1, -1).setContentPositionMs(j3);
            int i3 = fp4.a;
            contentPositionMs.setContentBufferedPositionMs(new ep4(j3)).setTotalBufferedDurationMs(PositionSupplier.ZERO);
        } else if (j3 == positionOrDefaultInMediaItem) {
            builder.setCurrentMediaItemIndex(i2);
            if (state.currentAdGroupIndex == -1 || !z) {
                State.Builder currentAd = builder.setCurrentAd(-1, -1);
                long contentBufferedPositionMsInternal = getContentBufferedPositionMsInternal(state, window) - positionOrDefaultInMediaItem;
                int i4 = fp4.a;
                currentAd.setTotalBufferedDurationMs(new ep4(contentBufferedPositionMsInternal));
            } else {
                long j4 = state.adBufferedPositionMsSupplier.get() - state.adPositionMsSupplier.get();
                int i5 = fp4.a;
                builder.setTotalBufferedDurationMs(new ep4(j4));
            }
        } else {
            long max = Math.max(getContentBufferedPositionMsInternal(state, window), j3);
            long max2 = Math.max(0L, state.totalBufferedDurationMsSupplier.get() - (j3 - positionOrDefaultInMediaItem));
            State.Builder contentPositionMs2 = builder.setCurrentMediaItemIndex(i2).setCurrentAd(-1, -1).setContentPositionMs(j3);
            int i6 = fp4.a;
            contentPositionMs2.setContentBufferedPositionMs(new ep4(max)).setTotalBufferedDurationMs(new ep4(max2));
        }
        return builder.build();
    }

    private void clearVideoOutput(Object obj) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(27)) {
            updateStateForPendingOperation(handleClearVideoOutput(obj), new po4(state, (byte) 6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaMetadata getCombinedMediaMetadata(MediaItem mediaItem, Tracks tracks) {
        MediaMetadata.Builder builder = new MediaMetadata.Builder();
        int size = tracks.getGroups().size();
        for (int i = 0; i < size; i++) {
            Tracks.Group group = (Tracks.Group) tracks.getGroups().get(i);
            for (int i2 = 0; i2 < group.length; i2++) {
                if (group.isTrackSelected(i2)) {
                    Format trackFormat = group.getTrackFormat(i2);
                    if (trackFormat.metadata != null) {
                        for (int i3 = 0; i3 < trackFormat.metadata.length(); i3++) {
                            trackFormat.metadata.get(i3).populateMediaMetadata(builder);
                        }
                    }
                }
            }
        }
        return builder.populate(mediaItem.mediaMetadata).build();
    }

    private static long getContentBufferedPositionMsInternal(State state, Timeline.Window window) {
        return getPositionOrDefaultInMediaItem(state.contentBufferedPositionMsSupplier.get(), state, window);
    }

    private static long getContentPositionMsInternal(State state, Timeline.Window window) {
        return getPositionOrDefaultInMediaItem(state.contentPositionMsSupplier.get(), state, window);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getCurrentMediaItemIndexInternal(State state) {
        int i = state.currentMediaItemIndex;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    private static int getCurrentPeriodIndexInternal(State state, Timeline.Window window, Timeline.Period period) {
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(state);
        return state.timeline.isEmpty() ? currentMediaItemIndexInternal : getPeriodIndexFromWindowPosition(state.timeline, currentMediaItemIndexInternal, getContentPositionMsInternal(state, window), window, period);
    }

    private static long getCurrentPeriodOrAdPositionMs(State state, Object obj, Timeline.Period period, Timeline.Window window) {
        return state.currentAdGroupIndex != -1 ? state.adPositionMsSupplier.get() : getContentPositionMsInternal(state, window) - state.timeline.getPeriodByUid(obj, period).getPositionInWindowMs();
    }

    private static int getMediaItemIndexInNewPlaylist(Timeline timeline, Timeline timeline2, int i, Timeline.Period period, Timeline.Window window) {
        if (timeline.isEmpty()) {
            if (i < timeline2.getWindowCount()) {
                return i;
            }
            return -1;
        }
        Object obj = timeline.getPeriod(timeline.getWindow(i, window).firstPeriodIndex, period, true).uid;
        obj.getClass();
        if (timeline2.getIndexOfPeriod(obj) == -1) {
            return -1;
        }
        return timeline2.getPeriodByUid(obj, period).windowIndex;
    }

    private static int getMediaItemTransitionReason(State state, State state2, int i, boolean z, Timeline.Window window) {
        Timeline timeline = state.timeline;
        Timeline timeline2 = state2.timeline;
        if (timeline2.isEmpty() && timeline.isEmpty()) {
            return -1;
        }
        if (timeline2.isEmpty() != timeline.isEmpty()) {
            return 3;
        }
        Object obj = state.timeline.getWindow(getCurrentMediaItemIndexInternal(state), window).uid;
        Object obj2 = state2.timeline.getWindow(getCurrentMediaItemIndexInternal(state2), window).uid;
        if ((obj instanceof PlaceholderUid) && !(obj2 instanceof PlaceholderUid)) {
            return -1;
        }
        if (!obj.equals(obj2)) {
            if (i == 0) {
                return 1;
            }
            return i == 1 ? 2 : 3;
        }
        if (i != 0 || getContentPositionMsInternal(state, window) <= getContentPositionMsInternal(state2, window)) {
            return (i == 1 && z) ? 2 : -1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getPeriodIndexFromWindowPosition(Timeline timeline, int i, long j, Timeline.Window window, Timeline.Period period) {
        return timeline.getIndexOfPeriod(timeline.getPeriodPositionUs(window, period, i, Util.msToUs(j)).first);
    }

    private static long getPeriodOrAdDurationMs(State state, Object obj, Timeline.Period period) {
        state.timeline.getPeriodByUid(obj, period);
        int i = state.currentAdGroupIndex;
        return Util.usToMs(i == -1 ? period.durationUs : period.getAdDurationUs(i, state.currentAdIndexInAdGroup));
    }

    private static int getPositionDiscontinuityReason(State state, State state2, boolean z, Timeline.Window window, Timeline.Period period) {
        if (state2.hasPositionDiscontinuity) {
            return state2.positionDiscontinuityReason;
        }
        if (z) {
            return 1;
        }
        if (state.timeline.isEmpty()) {
            return -1;
        }
        if (state2.timeline.isEmpty()) {
            return 4;
        }
        Object uidOfPeriod = state.timeline.getUidOfPeriod(getCurrentPeriodIndexInternal(state, window, period));
        Object uidOfPeriod2 = state2.timeline.getUidOfPeriod(getCurrentPeriodIndexInternal(state2, window, period));
        if ((uidOfPeriod instanceof PlaceholderUid) && !(uidOfPeriod2 instanceof PlaceholderUid)) {
            return -1;
        }
        if (uidOfPeriod2.equals(uidOfPeriod) && state.currentAdGroupIndex == state2.currentAdGroupIndex && state.currentAdIndexInAdGroup == state2.currentAdIndexInAdGroup) {
            long currentPeriodOrAdPositionMs = getCurrentPeriodOrAdPositionMs(state, uidOfPeriod, period, window);
            if (Math.abs(currentPeriodOrAdPositionMs - getCurrentPeriodOrAdPositionMs(state2, uidOfPeriod2, period, window)) < 1000) {
                return -1;
            }
            long periodOrAdDurationMs = getPeriodOrAdDurationMs(state, uidOfPeriod, period);
            return (periodOrAdDurationMs == C.TIME_UNSET || currentPeriodOrAdPositionMs < periodOrAdDurationMs) ? 5 : 0;
        }
        if (state2.timeline.getIndexOfPeriod(uidOfPeriod) == -1) {
            return 4;
        }
        long currentPeriodOrAdPositionMs2 = getCurrentPeriodOrAdPositionMs(state, uidOfPeriod, period, window);
        long periodOrAdDurationMs2 = getPeriodOrAdDurationMs(state, uidOfPeriod, period);
        return (periodOrAdDurationMs2 == C.TIME_UNSET || currentPeriodOrAdPositionMs2 < periodOrAdDurationMs2) ? 3 : 0;
    }

    private static Player.PositionInfo getPositionInfo(State state, boolean z, Timeline.Window window, Timeline.Period period) {
        Object obj;
        MediaItem mediaItem;
        Object obj2;
        long contentPositionMsInternal;
        long j;
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(state);
        int currentPeriodIndexInternal = getCurrentPeriodIndexInternal(state, window, period);
        if (state.timeline.isEmpty()) {
            obj = null;
            mediaItem = null;
            obj2 = null;
        } else {
            Object obj3 = state.timeline.getPeriod(currentPeriodIndexInternal, period, true).uid;
            Object obj4 = state.timeline.getWindow(currentMediaItemIndexInternal, window).uid;
            obj2 = obj3;
            mediaItem = window.mediaItem;
            obj = obj4;
        }
        if (z) {
            j = state.discontinuityPositionMs;
            contentPositionMsInternal = state.currentAdGroupIndex == -1 ? j : getContentPositionMsInternal(state, window);
        } else {
            contentPositionMsInternal = getContentPositionMsInternal(state, window);
            j = state.currentAdGroupIndex != -1 ? state.adPositionMsSupplier.get() : contentPositionMsInternal;
        }
        return new Player.PositionInfo(obj, currentMediaItemIndexInternal, mediaItem, obj2, currentPeriodIndexInternal, j, contentPositionMsInternal, state.currentAdGroupIndex, state.currentAdIndexInAdGroup);
    }

    private static long getPositionOrDefaultInMediaItem(long j, State state, Timeline.Window window) {
        if (j != C.TIME_UNSET) {
            return j;
        }
        if (state.timeline.isEmpty()) {
            return 0L;
        }
        return state.timeline.getWindow(getCurrentMediaItemIndexInternal(state), window).getDefaultPositionMs();
    }

    private static State getStateWithNewPlaylist(State state, List<MediaItemData> list, Timeline.Period period, Timeline.Window window) {
        State.Builder buildUpon = state.buildUpon();
        PlaylistTimeline playlistTimeline = new PlaylistTimeline(list);
        Timeline timeline = state.timeline;
        long j = state.contentPositionMsSupplier.get();
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(state);
        int mediaItemIndexInNewPlaylist = getMediaItemIndexInNewPlaylist(timeline, playlistTimeline, currentMediaItemIndexInternal, period, window);
        long j2 = mediaItemIndexInNewPlaylist == -1 ? C.TIME_UNSET : j;
        for (int i = currentMediaItemIndexInternal + 1; mediaItemIndexInNewPlaylist == -1 && i < timeline.getWindowCount(); i++) {
            mediaItemIndexInNewPlaylist = getMediaItemIndexInNewPlaylist(timeline, playlistTimeline, i, period, window);
        }
        if (state.playbackState != 1 && mediaItemIndexInNewPlaylist == -1) {
            buildUpon.setPlaybackState(4).setIsLoading(false);
        }
        return buildStateForNewPosition(buildUpon, state, j, playlistTimeline, mediaItemIndexInNewPlaylist, j2, true, window);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v9, types: [androidx.media3.common.Timeline] */
    private static State getStateWithNewPlaylistAndPosition(State state, List<MediaItemData> list, int i, long j, Timeline.Window window) {
        State.Builder buildUpon = state.buildUpon();
        PlaylistTimeline playlistTimeline = list == null ? state.timeline : new PlaylistTimeline(list);
        if (state.playbackState != 1) {
            if (playlistTimeline.isEmpty() || (i != -1 && i >= playlistTimeline.getWindowCount())) {
                buildUpon.setPlaybackState(4).setIsLoading(false);
            } else {
                buildUpon.setPlaybackState(2);
            }
        }
        return buildStateForNewPosition(buildUpon, state, state.contentPositionMsSupplier.get(), playlistTimeline, i, j, false, window);
    }

    private static Size getSurfaceHolderSize(SurfaceHolder surfaceHolder) {
        if (!surfaceHolder.getSurface().isValid()) {
            return Size.ZERO;
        }
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        return new Size(surfaceFrame.width(), surfaceFrame.height());
    }

    private static int getTimelineChangeReason(Timeline timeline, Timeline timeline2, Timeline.Window window) {
        if (timeline.getWindowCount() != timeline2.getWindowCount()) {
            return 0;
        }
        int i = 0;
        while (true) {
            if (i >= timeline.getWindowCount()) {
                return 1;
            }
            Object obj = timeline.getWindow(i, window).uid;
            Object obj2 = timeline2.getWindow(i, window).uid;
            boolean z = (obj instanceof PlaceholderUid) && !(obj2 instanceof PlaceholderUid);
            if (!obj.equals(obj2) && !z) {
                return 0;
            }
            i++;
        }
    }

    private static boolean isPlaying(State state) {
        return state.playWhenReady && state.playbackState == 3 && state.playbackSuppressionReason == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ State lambda$addMediaItems$3(State state, List list, int i) {
        List<MediaItemData> buildMutablePlaylistFromState = buildMutablePlaylistFromState(state, this.period, this.window);
        for (int i2 = 0; i2 < list.size(); i2++) {
            buildMutablePlaylistFromState.add(i2 + i, getPlaceholderMediaItemData((MediaItem) list.get(i2)));
        }
        return !state.timeline.isEmpty() ? getStateWithNewPlaylist(state, buildMutablePlaylistFromState, this.period, this.window) : getStateWithNewPlaylistAndPosition(state, buildMutablePlaylistFromState, state.currentMediaItemIndex, state.contentPositionMsSupplier.get(), this.window);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$clearVideoOutput$23(State state) {
        return state.buildUpon().setSurfaceSize(Size.ZERO).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$decreaseDeviceVolume$28(State state) {
        return state.buildUpon().setDeviceVolume(Math.max(0, state.deviceVolume - 1)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$decreaseDeviceVolume$29(State state) {
        return state.buildUpon().setDeviceVolume(Math.max(0, state.deviceVolume - 1)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$increaseDeviceVolume$26(State state) {
        return state.buildUpon().setDeviceVolume(state.deviceVolume + 1).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$increaseDeviceVolume$27(State state) {
        return state.buildUpon().setDeviceVolume(state.deviceVolume + 1).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ State lambda$moveMediaItems$4(State state, int i, int i2, int i3) {
        List<MediaItemData> buildMutablePlaylistFromState = buildMutablePlaylistFromState(state, this.period, this.window);
        Util.moveItems(buildMutablePlaylistFromState, i, i2, i3);
        return getStateWithNewPlaylist(state, buildMutablePlaylistFromState, this.period, this.window);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$mute$17(State state) {
        return state.buildUpon().setVolume(0.0f).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Player.Listener listener, FlagSet flagSet) {
        listener.onEvents(this, new Player.Events(flagSet));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$prepare$7(State state) {
        return state.buildUpon().setPlayerError(null).setPlaybackState(state.timeline.isEmpty() ? 4 : 2).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ State lambda$removeMediaItems$6(State state, int i, int i2) {
        List<MediaItemData> buildMutablePlaylistFromState = buildMutablePlaylistFromState(state, this.period, this.window);
        Util.removeRange(buildMutablePlaylistFromState, i, i2);
        return getStateWithNewPlaylist(state, buildMutablePlaylistFromState, this.period, this.window);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ State lambda$replaceMediaItems$5(State state, List list, int i, int i2) {
        List<MediaItemData> buildMutablePlaylistFromState = buildMutablePlaylistFromState(state, this.period, this.window);
        for (int i3 = 0; i3 < list.size(); i3++) {
            buildMutablePlaylistFromState.add(i3 + i, getPlaceholderMediaItemData((MediaItem) list.get(i3)));
        }
        State stateWithNewPlaylist = !state.timeline.isEmpty() ? getStateWithNewPlaylist(state, buildMutablePlaylistFromState, this.period, this.window) : getStateWithNewPlaylistAndPosition(state, buildMutablePlaylistFromState, state.currentMediaItemIndex, state.contentPositionMsSupplier.get(), this.window);
        if (i2 >= i) {
            return stateWithNewPlaylist;
        }
        Util.removeRange(buildMutablePlaylistFromState, i2, i);
        return getStateWithNewPlaylist(stateWithNewPlaylist, buildMutablePlaylistFromState, this.period, this.window);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ State lambda$seekTo$10(boolean z, State state, int i, long j) {
        return z ? state : getStateWithNewPlaylistAndPosition(state, null, i, j, this.window);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setAudioAttributes$32(State state, AudioAttributes audioAttributes) {
        return state.buildUpon().setAudioAttributes(audioAttributes).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setDeviceMuted$30(State state, boolean z) {
        return state.buildUpon().setIsDeviceMuted(z).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setDeviceMuted$31(State state, boolean z) {
        return state.buildUpon().setIsDeviceMuted(z).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setDeviceVolume$24(State state, int i) {
        return state.buildUpon().setDeviceVolume(i).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setDeviceVolume$25(State state, int i) {
        return state.buildUpon().setDeviceVolume(i).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ State lambda$setMediaItemsInternal$2(List list, State state, int i, long j) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(getPlaceholderMediaItemData((MediaItem) list.get(i2)));
        }
        return getStateWithNewPlaylistAndPosition(state, arrayList, i, j, this.window);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setPlayWhenReady$1(State state, boolean z) {
        return state.buildUpon().setPlayWhenReady(z, 1).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setPlaybackParameters$11(State state, PlaybackParameters playbackParameters) {
        return state.buildUpon().setPlaybackParameters(playbackParameters).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setPlaylistMetadata$15(State state, MediaMetadata mediaMetadata) {
        return state.buildUpon().setPlaylistMetadata(mediaMetadata).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setRepeatMode$8(State state, int i) {
        return state.buildUpon().setRepeatMode(i).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setShuffleModeEnabled$9(State state, boolean z) {
        return state.buildUpon().setShuffleModeEnabled(z).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setTrackSelectionParameters$14(State state, TrackSelectionParameters trackSelectionParameters) {
        return state.buildUpon().setTrackSelectionParameters(trackSelectionParameters).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setVideoSurface$19(State state) {
        return state.buildUpon().setSurfaceSize(Size.UNKNOWN).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setVideoSurfaceHolder$20(State state, SurfaceHolder surfaceHolder) {
        return state.buildUpon().setSurfaceSize(getSurfaceHolderSize(surfaceHolder)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setVideoSurfaceView$21(State state, SurfaceView surfaceView) {
        return state.buildUpon().setSurfaceSize(getSurfaceHolderSize(surfaceView.getHolder())).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setVideoTextureView$22(State state, Size size) {
        return state.buildUpon().setSurfaceSize(size).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setVolume$16(State state, float f) {
        return state.buildUpon().setVolume(f).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public State lambda$stop$12(State state) {
        State.Builder totalBufferedDurationMs = state.buildUpon().setPlaybackState(1).setTotalBufferedDurationMs(PositionSupplier.ZERO);
        long contentPositionMsInternal = getContentPositionMsInternal(state, this.window);
        int i = fp4.a;
        return totalBufferedDurationMs.setContentBufferedPositionMs(new ep4(contentPositionMsInternal)).setAdBufferedPositionMs(state.adPositionMsSupplier).setIsLoading(false).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$unmute$18(State state) {
        return state.buildUpon().setVolume(state.unmuteVolume).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$34(State state, int i, Player.Listener listener) {
        listener.onTimelineChanged(state.timeline, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$35(int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, Player.Listener listener) {
        listener.onPositionDiscontinuity(i);
        listener.onPositionDiscontinuity(positionInfo, positionInfo2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$37(State state, Player.Listener listener) {
        listener.onPlayerErrorChanged(state.playerError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$38(State state, Player.Listener listener) {
        listener.onPlayerError((PlaybackException) Util.castNonNull(state.playerError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$39(State state, Player.Listener listener) {
        listener.onTrackSelectionParametersChanged(state.trackSelectionParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$40(State state, Player.Listener listener) {
        listener.onTracksChanged(state.currentTracks);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$41(State state, Player.Listener listener) {
        listener.onMediaMetadataChanged(state.currentMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$42(State state, Player.Listener listener) {
        listener.onLoadingChanged(state.isLoading);
        listener.onIsLoadingChanged(state.isLoading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$43(State state, Player.Listener listener) {
        listener.onPlayerStateChanged(state.playWhenReady, state.playbackState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$44(State state, Player.Listener listener) {
        listener.onPlaybackStateChanged(state.playbackState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$45(State state, Player.Listener listener) {
        listener.onPlayWhenReadyChanged(state.playWhenReady, state.playWhenReadyChangeReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$46(State state, Player.Listener listener) {
        listener.onPlaybackSuppressionReasonChanged(state.playbackSuppressionReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$47(State state, Player.Listener listener) {
        listener.onIsPlayingChanged(isPlaying(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$48(State state, Player.Listener listener) {
        listener.onPlaybackParametersChanged(state.playbackParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$49(State state, Player.Listener listener) {
        listener.onRepeatModeChanged(state.repeatMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$50(State state, Player.Listener listener) {
        listener.onShuffleModeEnabledChanged(state.shuffleModeEnabled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$51(State state, Player.Listener listener) {
        listener.onSeekBackIncrementChanged(state.seekBackIncrementMs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$52(State state, Player.Listener listener) {
        listener.onSeekForwardIncrementChanged(state.seekForwardIncrementMs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$53(State state, Player.Listener listener) {
        listener.onMaxSeekToPreviousPositionChanged(state.maxSeekToPreviousPositionMs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$54(State state, Player.Listener listener) {
        listener.onAudioAttributesChanged(state.audioAttributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$55(State state, Player.Listener listener) {
        listener.onAudioSessionIdChanged(state.audioSessionId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$56(State state, Player.Listener listener) {
        listener.onVideoSizeChanged(state.videoSize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$57(State state, Player.Listener listener) {
        listener.onDeviceInfoChanged(state.deviceInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$58(State state, Player.Listener listener) {
        listener.onPlaylistMetadataChanged(state.playlistMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$59(State state, Player.Listener listener) {
        listener.onSurfaceSizeChanged(state.surfaceSize.getWidth(), state.surfaceSize.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$60(State state, Player.Listener listener) {
        listener.onVolumeChanged(state.volume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$61(State state, Player.Listener listener) {
        listener.onDeviceVolumeChanged(state.deviceVolume, state.isDeviceMuted);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$62(State state, Player.Listener listener) {
        listener.onCues(state.currentCues.cues);
        listener.onCues(state.currentCues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$63(State state, Player.Listener listener) {
        listener.onMetadata(state.timedMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$64(State state, Player.Listener listener) {
        listener.onAvailableCommandsChanged(state.availableCommands);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateStateForPendingOperation$65(fl2 fl2Var) {
        Util.castNonNull(this.state);
        this.pendingOperations.remove(fl2Var);
        if (!this.pendingOperations.isEmpty() || this.released) {
            return;
        }
        updateStateAndInformListeners(getState(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOrRunOnApplicationHandler(Runnable runnable) {
        if (this.applicationHandler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.applicationHandler.post(runnable);
        }
    }

    @RequiresNonNull({"state"})
    private void setMediaItemsInternal(final List<MediaItem> list, final int i, final long j) {
        sp0.o(i == -1 || i >= 0);
        final State state = this.state;
        if (shouldHandleCommand(20) || (list.size() == 1 && shouldHandleCommand(31))) {
            updateStateForPendingOperation(handleSetMediaItems(list, i, j), new gz4() { // from class: wo4
                @Override // defpackage.gz4
                public final Object get() {
                    SimpleBasePlayer.State lambda$setMediaItemsInternal$2;
                    lambda$setMediaItemsInternal$2 = SimpleBasePlayer.this.lambda$setMediaItemsInternal$2(list, state, i, j);
                    return lambda$setMediaItemsInternal$2;
                }
            });
        }
    }

    @RequiresNonNull({"state"})
    private boolean shouldHandleCommand(int i) {
        return !this.released && this.state.availableCommands.contains(i);
    }

    @RequiresNonNull({"state"})
    private void updateStateAndInformListeners(final State state, boolean z, boolean z2) {
        State state2 = this.state;
        this.state = state;
        final byte b = 0;
        if (state.hasPositionDiscontinuity || state.newlyRenderedFirstFrame) {
            this.state = state.buildUpon().clearPositionDiscontinuity().setNewlyRenderedFirstFrame(false).build();
        }
        final byte b2 = 1;
        boolean z3 = state2.playWhenReady != state.playWhenReady;
        boolean z4 = state2.playbackState != state.playbackState;
        final int positionDiscontinuityReason = getPositionDiscontinuityReason(state2, state, z, this.window, this.period);
        boolean equals = state2.timeline.equals(state.timeline);
        int mediaItemTransitionReason = getMediaItemTransitionReason(state2, state, positionDiscontinuityReason, z2, this.window);
        if (!equals) {
            this.listeners.queueEvent(0, new to4(state, getTimelineChangeReason(state2.timeline, state.timeline, this.window), b2));
        }
        if (positionDiscontinuityReason != -1) {
            final Player.PositionInfo positionInfo = getPositionInfo(state2, false, this.window, this.period);
            final Player.PositionInfo positionInfo2 = getPositionInfo(state, state.hasPositionDiscontinuity, this.window, this.period);
            this.listeners.queueEvent(11, new ListenerSet.Event() { // from class: ro4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.lambda$updateStateAndInformListeners$35(positionDiscontinuityReason, positionInfo, positionInfo2, (Player.Listener) obj);
                }
            });
        }
        if (mediaItemTransitionReason != -1) {
            this.listeners.queueEvent(1, new to4(state.timeline.isEmpty() ? null : state.timeline.getWindow(getCurrentMediaItemIndexInternal(state), this.window).mediaItem, mediaItemTransitionReason, b));
        }
        final byte b3 = 17;
        final byte b4 = 16;
        if (!Objects.equals(state2.playerError, state.playerError)) {
            this.listeners.queueEvent(10, new ListenerSet.Event() { // from class: qo4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b5 = b4;
                    SimpleBasePlayer.State state3 = state;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b5) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state3, listener);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state3, listener);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state3, listener);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state3, listener);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state3, listener);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state3, listener);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state3, listener);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state3, listener);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state3, listener);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state3, listener);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state3, listener);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state3, listener);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state3, listener);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$62(state3, listener);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$63(state3, listener);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$64(state3, listener);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state3, listener);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state3, listener);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state3, listener);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state3, listener);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state3, listener);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state3, listener);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state3, listener);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state3, listener);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state3, listener);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state3, listener);
                            break;
                        case 26:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state3, listener);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state3, listener);
                            break;
                    }
                }
            });
            if (state.playerError != null) {
                this.listeners.queueEvent(10, new ListenerSet.Event() { // from class: qo4
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj) {
                        byte b5 = b3;
                        SimpleBasePlayer.State state3 = state;
                        Player.Listener listener = (Player.Listener) obj;
                        switch (b5) {
                            case 0:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state3, listener);
                                break;
                            case 1:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state3, listener);
                                break;
                            case 2:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state3, listener);
                                break;
                            case 3:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state3, listener);
                                break;
                            case 4:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state3, listener);
                                break;
                            case 5:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state3, listener);
                                break;
                            case 6:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state3, listener);
                                break;
                            case 7:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state3, listener);
                                break;
                            case 8:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state3, listener);
                                break;
                            case 9:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state3, listener);
                                break;
                            case 10:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state3, listener);
                                break;
                            case 11:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state3, listener);
                                break;
                            case 12:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state3, listener);
                                break;
                            case 13:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$62(state3, listener);
                                break;
                            case 14:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$63(state3, listener);
                                break;
                            case 15:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$64(state3, listener);
                                break;
                            case 16:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state3, listener);
                                break;
                            case 17:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state3, listener);
                                break;
                            case 18:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state3, listener);
                                break;
                            case 19:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state3, listener);
                                break;
                            case 20:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state3, listener);
                                break;
                            case 21:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state3, listener);
                                break;
                            case 22:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state3, listener);
                                break;
                            case 23:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state3, listener);
                                break;
                            case 24:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state3, listener);
                                break;
                            case 25:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state3, listener);
                                break;
                            case 26:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state3, listener);
                                break;
                            default:
                                SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state3, listener);
                                break;
                        }
                    }
                });
            }
        }
        final byte b5 = 19;
        final byte b6 = 18;
        if (!state2.trackSelectionParameters.equals(state.trackSelectionParameters)) {
            this.listeners.queueEvent(19, new ListenerSet.Event() { // from class: qo4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b6;
                    SimpleBasePlayer.State state3 = state;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state3, listener);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state3, listener);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state3, listener);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state3, listener);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state3, listener);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state3, listener);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state3, listener);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state3, listener);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state3, listener);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state3, listener);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state3, listener);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state3, listener);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state3, listener);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$62(state3, listener);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$63(state3, listener);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$64(state3, listener);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state3, listener);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state3, listener);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state3, listener);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state3, listener);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state3, listener);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state3, listener);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state3, listener);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state3, listener);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state3, listener);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state3, listener);
                            break;
                        case 26:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state3, listener);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state3, listener);
                            break;
                    }
                }
            });
        }
        final byte b7 = 2;
        if (!state2.currentTracks.equals(state.currentTracks)) {
            this.listeners.queueEvent(2, new ListenerSet.Event() { // from class: qo4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b5;
                    SimpleBasePlayer.State state3 = state;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state3, listener);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state3, listener);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state3, listener);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state3, listener);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state3, listener);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state3, listener);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state3, listener);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state3, listener);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state3, listener);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state3, listener);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state3, listener);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state3, listener);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state3, listener);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$62(state3, listener);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$63(state3, listener);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$64(state3, listener);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state3, listener);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state3, listener);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state3, listener);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state3, listener);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state3, listener);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state3, listener);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state3, listener);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state3, listener);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state3, listener);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state3, listener);
                            break;
                        case 26:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state3, listener);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state3, listener);
                            break;
                    }
                }
            });
        }
        final byte b8 = 20;
        if (!state2.currentMetadata.equals(state.currentMetadata)) {
            this.listeners.queueEvent(14, new ListenerSet.Event() { // from class: qo4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b8;
                    SimpleBasePlayer.State state3 = state;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state3, listener);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state3, listener);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state3, listener);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state3, listener);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state3, listener);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state3, listener);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state3, listener);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state3, listener);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state3, listener);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state3, listener);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state3, listener);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state3, listener);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state3, listener);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$62(state3, listener);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$63(state3, listener);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$64(state3, listener);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state3, listener);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state3, listener);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state3, listener);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state3, listener);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state3, listener);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state3, listener);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state3, listener);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state3, listener);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state3, listener);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state3, listener);
                            break;
                        case 26:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state3, listener);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state3, listener);
                            break;
                    }
                }
            });
        }
        final byte b9 = 21;
        final byte b10 = 3;
        if (state2.isLoading != state.isLoading) {
            this.listeners.queueEvent(3, new ListenerSet.Event() { // from class: qo4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b9;
                    SimpleBasePlayer.State state3 = state;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state3, listener);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state3, listener);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state3, listener);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state3, listener);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state3, listener);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state3, listener);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state3, listener);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state3, listener);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state3, listener);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state3, listener);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state3, listener);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state3, listener);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state3, listener);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$62(state3, listener);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$63(state3, listener);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$64(state3, listener);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state3, listener);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state3, listener);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state3, listener);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state3, listener);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state3, listener);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state3, listener);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state3, listener);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state3, listener);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state3, listener);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state3, listener);
                            break;
                        case 26:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state3, listener);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state3, listener);
                            break;
                    }
                }
            });
        }
        final byte b11 = 22;
        if (z3 || z4) {
            this.listeners.queueEvent(-1, new ListenerSet.Event() { // from class: qo4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b11;
                    SimpleBasePlayer.State state3 = state;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state3, listener);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state3, listener);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state3, listener);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state3, listener);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state3, listener);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state3, listener);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state3, listener);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state3, listener);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state3, listener);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state3, listener);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state3, listener);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state3, listener);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state3, listener);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$62(state3, listener);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$63(state3, listener);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$64(state3, listener);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state3, listener);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state3, listener);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state3, listener);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state3, listener);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state3, listener);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state3, listener);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state3, listener);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state3, listener);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state3, listener);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state3, listener);
                            break;
                        case 26:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state3, listener);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state3, listener);
                            break;
                    }
                }
            });
        }
        final byte b12 = 4;
        if (z4) {
            final byte b13 = 23;
            this.listeners.queueEvent(4, new ListenerSet.Event() { // from class: qo4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b13;
                    SimpleBasePlayer.State state3 = state;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state3, listener);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state3, listener);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state3, listener);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state3, listener);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state3, listener);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state3, listener);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state3, listener);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state3, listener);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state3, listener);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state3, listener);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state3, listener);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state3, listener);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state3, listener);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$62(state3, listener);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$63(state3, listener);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$64(state3, listener);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state3, listener);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state3, listener);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state3, listener);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state3, listener);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state3, listener);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state3, listener);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state3, listener);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state3, listener);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state3, listener);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state3, listener);
                            break;
                        case 26:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state3, listener);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state3, listener);
                            break;
                    }
                }
            });
        }
        final byte b14 = 24;
        final byte b15 = 5;
        if (z3 || state2.playWhenReadyChangeReason != state.playWhenReadyChangeReason) {
            this.listeners.queueEvent(5, new ListenerSet.Event() { // from class: qo4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b14;
                    SimpleBasePlayer.State state3 = state;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state3, listener);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state3, listener);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state3, listener);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state3, listener);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state3, listener);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state3, listener);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state3, listener);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state3, listener);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state3, listener);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state3, listener);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state3, listener);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state3, listener);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state3, listener);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$62(state3, listener);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$63(state3, listener);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$64(state3, listener);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state3, listener);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state3, listener);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state3, listener);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state3, listener);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state3, listener);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state3, listener);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state3, listener);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state3, listener);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state3, listener);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state3, listener);
                            break;
                        case 26:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state3, listener);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state3, listener);
                            break;
                    }
                }
            });
        }
        final byte b16 = 25;
        if (state2.playbackSuppressionReason != state.playbackSuppressionReason) {
            this.listeners.queueEvent(6, new ListenerSet.Event() { // from class: qo4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b16;
                    SimpleBasePlayer.State state3 = state;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state3, listener);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state3, listener);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state3, listener);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state3, listener);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state3, listener);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state3, listener);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state3, listener);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state3, listener);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state3, listener);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state3, listener);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state3, listener);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state3, listener);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state3, listener);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$62(state3, listener);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$63(state3, listener);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$64(state3, listener);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state3, listener);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state3, listener);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state3, listener);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state3, listener);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state3, listener);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state3, listener);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state3, listener);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state3, listener);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state3, listener);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state3, listener);
                            break;
                        case 26:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state3, listener);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state3, listener);
                            break;
                    }
                }
            });
        }
        final byte b17 = 26;
        if (isPlaying(state2) != isPlaying(state)) {
            this.listeners.queueEvent(7, new ListenerSet.Event() { // from class: qo4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b17;
                    SimpleBasePlayer.State state3 = state;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state3, listener);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state3, listener);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state3, listener);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state3, listener);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state3, listener);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state3, listener);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state3, listener);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state3, listener);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state3, listener);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state3, listener);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state3, listener);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state3, listener);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state3, listener);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$62(state3, listener);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$63(state3, listener);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$64(state3, listener);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state3, listener);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state3, listener);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state3, listener);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state3, listener);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state3, listener);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state3, listener);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state3, listener);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state3, listener);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state3, listener);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state3, listener);
                            break;
                        case 26:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state3, listener);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state3, listener);
                            break;
                    }
                }
            });
        }
        final byte b18 = 12;
        if (!state2.playbackParameters.equals(state.playbackParameters)) {
            final byte b19 = 27;
            this.listeners.queueEvent(12, new ListenerSet.Event() { // from class: qo4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b19;
                    SimpleBasePlayer.State state3 = state;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state3, listener);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state3, listener);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state3, listener);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state3, listener);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state3, listener);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state3, listener);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state3, listener);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state3, listener);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state3, listener);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state3, listener);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state3, listener);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state3, listener);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state3, listener);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$62(state3, listener);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$63(state3, listener);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$64(state3, listener);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state3, listener);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state3, listener);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state3, listener);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state3, listener);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state3, listener);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state3, listener);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state3, listener);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state3, listener);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state3, listener);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state3, listener);
                            break;
                        case 26:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state3, listener);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state3, listener);
                            break;
                    }
                }
            });
        }
        if (state2.repeatMode != state.repeatMode) {
            this.listeners.queueEvent(8, new ListenerSet.Event() { // from class: qo4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b;
                    SimpleBasePlayer.State state3 = state;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state3, listener);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state3, listener);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state3, listener);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state3, listener);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state3, listener);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state3, listener);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state3, listener);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state3, listener);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state3, listener);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state3, listener);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state3, listener);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state3, listener);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state3, listener);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$62(state3, listener);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$63(state3, listener);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$64(state3, listener);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state3, listener);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state3, listener);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state3, listener);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state3, listener);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state3, listener);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state3, listener);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state3, listener);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state3, listener);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state3, listener);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state3, listener);
                            break;
                        case 26:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state3, listener);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state3, listener);
                            break;
                    }
                }
            });
        }
        if (state2.shuffleModeEnabled != state.shuffleModeEnabled) {
            this.listeners.queueEvent(9, new ListenerSet.Event() { // from class: qo4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b2;
                    SimpleBasePlayer.State state3 = state;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state3, listener);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state3, listener);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state3, listener);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state3, listener);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state3, listener);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state3, listener);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state3, listener);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state3, listener);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state3, listener);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state3, listener);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state3, listener);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state3, listener);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state3, listener);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$62(state3, listener);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$63(state3, listener);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$64(state3, listener);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state3, listener);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state3, listener);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state3, listener);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state3, listener);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state3, listener);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state3, listener);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state3, listener);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state3, listener);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state3, listener);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state3, listener);
                            break;
                        case 26:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state3, listener);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state3, listener);
                            break;
                    }
                }
            });
        }
        if (state2.seekBackIncrementMs != state.seekBackIncrementMs) {
            this.listeners.queueEvent(16, new ListenerSet.Event() { // from class: qo4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b7;
                    SimpleBasePlayer.State state3 = state;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state3, listener);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state3, listener);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state3, listener);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state3, listener);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state3, listener);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state3, listener);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state3, listener);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state3, listener);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state3, listener);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state3, listener);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state3, listener);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state3, listener);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state3, listener);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$62(state3, listener);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$63(state3, listener);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$64(state3, listener);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state3, listener);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state3, listener);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state3, listener);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state3, listener);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state3, listener);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state3, listener);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state3, listener);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state3, listener);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state3, listener);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state3, listener);
                            break;
                        case 26:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state3, listener);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state3, listener);
                            break;
                    }
                }
            });
        }
        if (state2.seekForwardIncrementMs != state.seekForwardIncrementMs) {
            this.listeners.queueEvent(17, new ListenerSet.Event() { // from class: qo4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b10;
                    SimpleBasePlayer.State state3 = state;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state3, listener);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state3, listener);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state3, listener);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state3, listener);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state3, listener);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state3, listener);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state3, listener);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state3, listener);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state3, listener);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state3, listener);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state3, listener);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state3, listener);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state3, listener);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$62(state3, listener);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$63(state3, listener);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$64(state3, listener);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state3, listener);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state3, listener);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state3, listener);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state3, listener);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state3, listener);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state3, listener);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state3, listener);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state3, listener);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state3, listener);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state3, listener);
                            break;
                        case 26:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state3, listener);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state3, listener);
                            break;
                    }
                }
            });
        }
        if (state2.maxSeekToPreviousPositionMs != state.maxSeekToPreviousPositionMs) {
            this.listeners.queueEvent(18, new ListenerSet.Event() { // from class: qo4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b12;
                    SimpleBasePlayer.State state3 = state;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state3, listener);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state3, listener);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state3, listener);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state3, listener);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state3, listener);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state3, listener);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state3, listener);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state3, listener);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state3, listener);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state3, listener);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state3, listener);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state3, listener);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state3, listener);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$62(state3, listener);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$63(state3, listener);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$64(state3, listener);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state3, listener);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state3, listener);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state3, listener);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state3, listener);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state3, listener);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state3, listener);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state3, listener);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state3, listener);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state3, listener);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state3, listener);
                            break;
                        case 26:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state3, listener);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state3, listener);
                            break;
                    }
                }
            });
        }
        if (!state2.audioAttributes.equals(state.audioAttributes)) {
            this.listeners.queueEvent(20, new ListenerSet.Event() { // from class: qo4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b15;
                    SimpleBasePlayer.State state3 = state;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state3, listener);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state3, listener);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state3, listener);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state3, listener);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state3, listener);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state3, listener);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state3, listener);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state3, listener);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state3, listener);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state3, listener);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state3, listener);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state3, listener);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state3, listener);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$62(state3, listener);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$63(state3, listener);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$64(state3, listener);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state3, listener);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state3, listener);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state3, listener);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state3, listener);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state3, listener);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state3, listener);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state3, listener);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state3, listener);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state3, listener);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state3, listener);
                            break;
                        case 26:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state3, listener);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state3, listener);
                            break;
                    }
                }
            });
        }
        if (state2.audioSessionId != state.audioSessionId) {
            final byte b20 = 6;
            this.listeners.queueEvent(21, new ListenerSet.Event() { // from class: qo4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b20;
                    SimpleBasePlayer.State state3 = state;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state3, listener);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state3, listener);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state3, listener);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state3, listener);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state3, listener);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state3, listener);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state3, listener);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state3, listener);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state3, listener);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state3, listener);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state3, listener);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state3, listener);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state3, listener);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$62(state3, listener);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$63(state3, listener);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$64(state3, listener);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state3, listener);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state3, listener);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state3, listener);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state3, listener);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state3, listener);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state3, listener);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state3, listener);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state3, listener);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state3, listener);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state3, listener);
                            break;
                        case 26:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state3, listener);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state3, listener);
                            break;
                    }
                }
            });
        }
        if (!state2.videoSize.equals(state.videoSize)) {
            final byte b21 = 7;
            this.listeners.queueEvent(25, new ListenerSet.Event() { // from class: qo4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b21;
                    SimpleBasePlayer.State state3 = state;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state3, listener);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state3, listener);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state3, listener);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state3, listener);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state3, listener);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state3, listener);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state3, listener);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state3, listener);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state3, listener);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state3, listener);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state3, listener);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state3, listener);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state3, listener);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$62(state3, listener);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$63(state3, listener);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$64(state3, listener);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state3, listener);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state3, listener);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state3, listener);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state3, listener);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state3, listener);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state3, listener);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state3, listener);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state3, listener);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state3, listener);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state3, listener);
                            break;
                        case 26:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state3, listener);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state3, listener);
                            break;
                    }
                }
            });
        }
        if (!state2.deviceInfo.equals(state.deviceInfo)) {
            final byte b22 = 8;
            this.listeners.queueEvent(29, new ListenerSet.Event() { // from class: qo4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b22;
                    SimpleBasePlayer.State state3 = state;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state3, listener);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state3, listener);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state3, listener);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state3, listener);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state3, listener);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state3, listener);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state3, listener);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state3, listener);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state3, listener);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state3, listener);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state3, listener);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state3, listener);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state3, listener);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$62(state3, listener);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$63(state3, listener);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$64(state3, listener);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state3, listener);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state3, listener);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state3, listener);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state3, listener);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state3, listener);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state3, listener);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state3, listener);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state3, listener);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state3, listener);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state3, listener);
                            break;
                        case 26:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state3, listener);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state3, listener);
                            break;
                    }
                }
            });
        }
        if (!state2.playlistMetadata.equals(state.playlistMetadata)) {
            final byte b23 = 9;
            this.listeners.queueEvent(15, new ListenerSet.Event() { // from class: qo4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b23;
                    SimpleBasePlayer.State state3 = state;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state3, listener);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state3, listener);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state3, listener);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state3, listener);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state3, listener);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state3, listener);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state3, listener);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state3, listener);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state3, listener);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state3, listener);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state3, listener);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state3, listener);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state3, listener);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$62(state3, listener);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$63(state3, listener);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$64(state3, listener);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state3, listener);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state3, listener);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state3, listener);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state3, listener);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state3, listener);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state3, listener);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state3, listener);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state3, listener);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state3, listener);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state3, listener);
                            break;
                        case 26:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state3, listener);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state3, listener);
                            break;
                    }
                }
            });
        }
        if (state.newlyRenderedFirstFrame) {
            this.listeners.queueEvent(26, new s83(b6));
        }
        if (!state2.surfaceSize.equals(state.surfaceSize)) {
            final byte b24 = 10;
            this.listeners.queueEvent(24, new ListenerSet.Event() { // from class: qo4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b24;
                    SimpleBasePlayer.State state3 = state;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state3, listener);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state3, listener);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state3, listener);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state3, listener);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state3, listener);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state3, listener);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state3, listener);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state3, listener);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state3, listener);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state3, listener);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state3, listener);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state3, listener);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state3, listener);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$62(state3, listener);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$63(state3, listener);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$64(state3, listener);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state3, listener);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state3, listener);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state3, listener);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state3, listener);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state3, listener);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state3, listener);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state3, listener);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state3, listener);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state3, listener);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state3, listener);
                            break;
                        case 26:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state3, listener);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state3, listener);
                            break;
                    }
                }
            });
        }
        if (state2.volume != state.volume) {
            final byte b25 = 11;
            this.listeners.queueEvent(22, new ListenerSet.Event() { // from class: qo4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b25;
                    SimpleBasePlayer.State state3 = state;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state3, listener);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state3, listener);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state3, listener);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state3, listener);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state3, listener);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state3, listener);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state3, listener);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state3, listener);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state3, listener);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state3, listener);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state3, listener);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state3, listener);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state3, listener);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$62(state3, listener);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$63(state3, listener);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$64(state3, listener);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state3, listener);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state3, listener);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state3, listener);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state3, listener);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state3, listener);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state3, listener);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state3, listener);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state3, listener);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state3, listener);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state3, listener);
                            break;
                        case 26:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state3, listener);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state3, listener);
                            break;
                    }
                }
            });
        }
        if (state2.deviceVolume != state.deviceVolume || state2.isDeviceMuted != state.isDeviceMuted) {
            this.listeners.queueEvent(30, new ListenerSet.Event() { // from class: qo4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b18;
                    SimpleBasePlayer.State state3 = state;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state3, listener);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state3, listener);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state3, listener);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state3, listener);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state3, listener);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state3, listener);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state3, listener);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state3, listener);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state3, listener);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state3, listener);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state3, listener);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state3, listener);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state3, listener);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$62(state3, listener);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$63(state3, listener);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$64(state3, listener);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state3, listener);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state3, listener);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state3, listener);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state3, listener);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state3, listener);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state3, listener);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state3, listener);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state3, listener);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state3, listener);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state3, listener);
                            break;
                        case 26:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state3, listener);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state3, listener);
                            break;
                    }
                }
            });
        }
        if (!state2.currentCues.equals(state.currentCues)) {
            final byte b26 = 13;
            this.listeners.queueEvent(27, new ListenerSet.Event() { // from class: qo4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b26;
                    SimpleBasePlayer.State state3 = state;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state3, listener);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state3, listener);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state3, listener);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state3, listener);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state3, listener);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state3, listener);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state3, listener);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state3, listener);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state3, listener);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state3, listener);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state3, listener);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state3, listener);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state3, listener);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$62(state3, listener);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$63(state3, listener);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$64(state3, listener);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state3, listener);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state3, listener);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state3, listener);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state3, listener);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state3, listener);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state3, listener);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state3, listener);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state3, listener);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state3, listener);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state3, listener);
                            break;
                        case 26:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state3, listener);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state3, listener);
                            break;
                    }
                }
            });
        }
        if (!state2.timedMetadata.equals(state.timedMetadata) && state.timedMetadata.presentationTimeUs != C.TIME_UNSET) {
            final byte b27 = 14;
            this.listeners.queueEvent(28, new ListenerSet.Event() { // from class: qo4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b27;
                    SimpleBasePlayer.State state3 = state;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state3, listener);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state3, listener);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state3, listener);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state3, listener);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state3, listener);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state3, listener);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state3, listener);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state3, listener);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state3, listener);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state3, listener);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state3, listener);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state3, listener);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state3, listener);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$62(state3, listener);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$63(state3, listener);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$64(state3, listener);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state3, listener);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state3, listener);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state3, listener);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state3, listener);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state3, listener);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state3, listener);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state3, listener);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state3, listener);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state3, listener);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state3, listener);
                            break;
                        case 26:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state3, listener);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state3, listener);
                            break;
                    }
                }
            });
        }
        if (!state2.availableCommands.equals(state.availableCommands)) {
            final byte b28 = 15;
            this.listeners.queueEvent(13, new ListenerSet.Event() { // from class: qo4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    byte b52 = b28;
                    SimpleBasePlayer.State state3 = state;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (b52) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$49(state3, listener);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$50(state3, listener);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$51(state3, listener);
                            break;
                        case 3:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$52(state3, listener);
                            break;
                        case 4:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$53(state3, listener);
                            break;
                        case 5:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$54(state3, listener);
                            break;
                        case 6:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$55(state3, listener);
                            break;
                        case 7:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$56(state3, listener);
                            break;
                        case 8:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$57(state3, listener);
                            break;
                        case 9:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state3, listener);
                            break;
                        case 10:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state3, listener);
                            break;
                        case 11:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$60(state3, listener);
                            break;
                        case 12:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$61(state3, listener);
                            break;
                        case 13:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$62(state3, listener);
                            break;
                        case 14:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$63(state3, listener);
                            break;
                        case 15:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$64(state3, listener);
                            break;
                        case 16:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$37(state3, listener);
                            break;
                        case 17:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$38(state3, listener);
                            break;
                        case 18:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state3, listener);
                            break;
                        case 19:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state3, listener);
                            break;
                        case 20:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$41(state3, listener);
                            break;
                        case 21:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$42(state3, listener);
                            break;
                        case 22:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$43(state3, listener);
                            break;
                        case 23:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$44(state3, listener);
                            break;
                        case 24:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$45(state3, listener);
                            break;
                        case 25:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$46(state3, listener);
                            break;
                        case 26:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$47(state3, listener);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$48(state3, listener);
                            break;
                    }
                }
            });
        }
        this.listeners.flushEvents();
    }

    @RequiresNonNull({"state"})
    private void updateStateForPendingOperation(fl2 fl2Var, gz4 gz4Var, boolean z, boolean z2) {
        if (fl2Var.isDone() && this.pendingOperations.isEmpty()) {
            updateStateAndInformListeners(getState(), z, z2);
            return;
        }
        this.pendingOperations.add(fl2Var);
        updateStateAndInformListeners(getPlaceholderState((State) gz4Var.get()), z, z2);
        fl2Var.a(new ws0(this, (byte) 3), new h8(this, fl2Var, (byte) 26));
    }

    @EnsuresNonNull({"state"})
    private void verifyApplicationThreadAndInitState() {
        verifyApplicationThread();
        if (this.state == null) {
            this.state = getState();
        }
    }

    @Override // androidx.media3.common.Player
    public final void addListener(Player.Listener listener) {
        ListenerSet<Player.Listener> listenerSet = this.listeners;
        listener.getClass();
        listenerSet.add(listener);
    }

    @Override // androidx.media3.common.Player
    public final void addMediaItems(int i, final List<MediaItem> list) {
        verifyApplicationThreadAndInitState();
        sp0.o(i >= 0);
        final State state = this.state;
        int windowCount = state.timeline.getWindowCount();
        if (!shouldHandleCommand(20) || list.isEmpty()) {
            return;
        }
        final int min = Math.min(i, windowCount);
        updateStateForPendingOperation(handleAddMediaItems(min, list), new gz4() { // from class: yo4
            @Override // defpackage.gz4
            public final Object get() {
                SimpleBasePlayer.State lambda$addMediaItems$3;
                lambda$addMediaItems$3 = SimpleBasePlayer.this.lambda$addMediaItems$3(state, list, min);
                return lambda$addMediaItems$3;
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurface() {
        clearVideoOutput(null);
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        clearVideoOutput(surfaceHolder);
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurfaceView(SurfaceView surfaceView) {
        clearVideoOutput(surfaceView);
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoTextureView(TextureView textureView) {
        clearVideoOutput(textureView);
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final void decreaseDeviceVolume() {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(26)) {
            updateStateForPendingOperation(handleDecreaseDeviceVolume(1), new po4(state, (byte) 4));
        }
    }

    @Override // androidx.media3.common.Player
    public final Looper getApplicationLooper() {
        return this.applicationLooper;
    }

    @Override // androidx.media3.common.Player
    public final AudioAttributes getAudioAttributes() {
        verifyApplicationThreadAndInitState();
        return this.state.audioAttributes;
    }

    @Override // androidx.media3.common.BasePlayer, androidx.media3.common.Player
    public final int getAudioSessionId() {
        verifyApplicationThreadAndInitState();
        return this.state.audioSessionId;
    }

    @Override // androidx.media3.common.Player
    public final Player.Commands getAvailableCommands() {
        verifyApplicationThreadAndInitState();
        return this.state.availableCommands;
    }

    @Override // androidx.media3.common.Player
    public final long getBufferedPosition() {
        verifyApplicationThreadAndInitState();
        return isPlayingAd() ? Math.max(this.state.adBufferedPositionMsSupplier.get(), this.state.adPositionMsSupplier.get()) : getContentBufferedPosition();
    }

    @Override // androidx.media3.common.Player
    public final long getContentBufferedPosition() {
        verifyApplicationThreadAndInitState();
        return Math.max(getContentBufferedPositionMsInternal(this.state, this.window), getContentPositionMsInternal(this.state, this.window));
    }

    @Override // androidx.media3.common.Player
    public final long getContentPosition() {
        verifyApplicationThreadAndInitState();
        return getContentPositionMsInternal(this.state, this.window);
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentAdGroupIndex() {
        verifyApplicationThreadAndInitState();
        return this.state.currentAdGroupIndex;
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentAdIndexInAdGroup() {
        verifyApplicationThreadAndInitState();
        return this.state.currentAdIndexInAdGroup;
    }

    @Override // androidx.media3.common.Player
    public final CueGroup getCurrentCues() {
        verifyApplicationThreadAndInitState();
        return this.state.currentCues;
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentMediaItemIndex() {
        verifyApplicationThreadAndInitState();
        return getCurrentMediaItemIndexInternal(this.state);
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentPeriodIndex() {
        verifyApplicationThreadAndInitState();
        return getCurrentPeriodIndexInternal(this.state, this.window, this.period);
    }

    @Override // androidx.media3.common.Player
    public final long getCurrentPosition() {
        verifyApplicationThreadAndInitState();
        return isPlayingAd() ? this.state.adPositionMsSupplier.get() : getContentPosition();
    }

    @Override // androidx.media3.common.Player
    public final Timeline getCurrentTimeline() {
        verifyApplicationThreadAndInitState();
        return this.state.timeline;
    }

    @Override // androidx.media3.common.Player
    public final Tracks getCurrentTracks() {
        verifyApplicationThreadAndInitState();
        return this.state.currentTracks;
    }

    @Override // androidx.media3.common.Player
    public final DeviceInfo getDeviceInfo() {
        verifyApplicationThreadAndInitState();
        return this.state.deviceInfo;
    }

    @Override // androidx.media3.common.Player
    public final int getDeviceVolume() {
        verifyApplicationThreadAndInitState();
        return this.state.deviceVolume;
    }

    @Override // androidx.media3.common.Player
    public final long getDuration() {
        verifyApplicationThreadAndInitState();
        if (!isPlayingAd()) {
            return getContentDuration();
        }
        this.state.timeline.getPeriod(getCurrentPeriodIndex(), this.period);
        Timeline.Period period = this.period;
        State state = this.state;
        return Util.usToMs(period.getAdDurationUs(state.currentAdGroupIndex, state.currentAdIndexInAdGroup));
    }

    @Override // androidx.media3.common.Player
    public final long getMaxSeekToPreviousPosition() {
        verifyApplicationThreadAndInitState();
        return this.state.maxSeekToPreviousPositionMs;
    }

    @Override // androidx.media3.common.Player
    public final MediaMetadata getMediaMetadata() {
        verifyApplicationThreadAndInitState();
        return this.state.currentMetadata;
    }

    public MediaItemData getPlaceholderMediaItemData(MediaItem mediaItem) {
        return new MediaItemData.Builder(new PlaceholderUid()).setMediaItem(mediaItem).setIsDynamic(true).setIsPlaceholder(true).build();
    }

    @Override // androidx.media3.common.Player
    public final boolean getPlayWhenReady() {
        verifyApplicationThreadAndInitState();
        return this.state.playWhenReady;
    }

    @Override // androidx.media3.common.Player
    public final PlaybackParameters getPlaybackParameters() {
        verifyApplicationThreadAndInitState();
        return this.state.playbackParameters;
    }

    @Override // androidx.media3.common.Player
    public final int getPlaybackState() {
        verifyApplicationThreadAndInitState();
        return this.state.playbackState;
    }

    @Override // androidx.media3.common.Player
    public final int getPlaybackSuppressionReason() {
        verifyApplicationThreadAndInitState();
        return this.state.playbackSuppressionReason;
    }

    @Override // androidx.media3.common.Player
    public final PlaybackException getPlayerError() {
        verifyApplicationThreadAndInitState();
        return this.state.playerError;
    }

    @Override // androidx.media3.common.Player
    public final MediaMetadata getPlaylistMetadata() {
        verifyApplicationThreadAndInitState();
        return this.state.playlistMetadata;
    }

    @Override // androidx.media3.common.Player
    public final int getRepeatMode() {
        verifyApplicationThreadAndInitState();
        return this.state.repeatMode;
    }

    @Override // androidx.media3.common.Player
    public final long getSeekBackIncrement() {
        verifyApplicationThreadAndInitState();
        return this.state.seekBackIncrementMs;
    }

    @Override // androidx.media3.common.Player
    public final long getSeekForwardIncrement() {
        verifyApplicationThreadAndInitState();
        return this.state.seekForwardIncrementMs;
    }

    @Override // androidx.media3.common.Player
    public final boolean getShuffleModeEnabled() {
        verifyApplicationThreadAndInitState();
        return this.state.shuffleModeEnabled;
    }

    public abstract State getState();

    @Override // androidx.media3.common.Player
    public final Size getSurfaceSize() {
        verifyApplicationThreadAndInitState();
        return this.state.surfaceSize;
    }

    @Override // androidx.media3.common.Player
    public final long getTotalBufferedDuration() {
        verifyApplicationThreadAndInitState();
        return this.state.totalBufferedDurationMsSupplier.get();
    }

    @Override // androidx.media3.common.Player
    public final TrackSelectionParameters getTrackSelectionParameters() {
        verifyApplicationThreadAndInitState();
        return this.state.trackSelectionParameters;
    }

    @Override // androidx.media3.common.Player
    public final VideoSize getVideoSize() {
        verifyApplicationThreadAndInitState();
        return this.state.videoSize;
    }

    @Override // androidx.media3.common.Player
    public final float getVolume() {
        verifyApplicationThreadAndInitState();
        return this.state.volume;
    }

    public fl2 handleAddMediaItems(int i, List<MediaItem> list) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    public fl2 handleClearVideoOutput(Object obj) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
    }

    public fl2 handleDecreaseDeviceVolume(int i) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    public fl2 handleIncreaseDeviceVolume(int i) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    public fl2 handleMoveMediaItems(int i, int i2, int i3) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    public fl2 handlePrepare() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_PREPARE");
    }

    public fl2 handleRelease() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_RELEASE");
    }

    public fl2 handleRemoveMediaItems(int i, int i2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    public fl2 handleReplaceMediaItems(int i, int i2, List<MediaItem> list) {
        fl2 handleAddMediaItems = handleAddMediaItems(i2, list);
        return i == i2 ? handleAddMediaItems : Util.transformFutureAsync(handleAddMediaItems, new w7(handleRemoveMediaItems(i, i2), (byte) 18));
    }

    public fl2 handleSeek(int i, long j, int i2) {
        throw new IllegalStateException("Missing implementation to handle one of the COMMAND_SEEK_*");
    }

    public fl2 handleSetAudioAttributes(AudioAttributes audioAttributes, boolean z) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_AUDIO_ATTRIBUTES");
    }

    public fl2 handleSetDeviceMuted(boolean z, int i) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    public fl2 handleSetDeviceVolume(int i, int i2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_DEVICE_VOLUME or COMMAND_SET_DEVICE_VOLUME_WITH_FLAGS");
    }

    public fl2 handleSetMediaItems(List<MediaItem> list, int i, long j) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_MEDIA_ITEM(S)");
    }

    public fl2 handleSetPlayWhenReady(boolean z) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_PLAY_PAUSE");
    }

    public fl2 handleSetPlaybackParameters(PlaybackParameters playbackParameters) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_SPEED_AND_PITCH");
    }

    public fl2 handleSetPlaylistMetadata(MediaMetadata mediaMetadata) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_PLAYLIST_METADATA");
    }

    public fl2 handleSetRepeatMode(int i) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_REPEAT_MODE");
    }

    public fl2 handleSetShuffleModeEnabled(boolean z) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_SHUFFLE_MODE");
    }

    public fl2 handleSetTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_TRACK_SELECTION_PARAMETERS");
    }

    public fl2 handleSetVideoOutput(Object obj) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
    }

    @Deprecated
    public fl2 handleSetVolume(float f) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VOLUME");
    }

    public fl2 handleStop() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_STOP");
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final void increaseDeviceVolume() {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(26)) {
            updateStateForPendingOperation(handleIncreaseDeviceVolume(1), new po4(state, (byte) 7));
        }
    }

    public final void invalidateState() {
        verifyApplicationThreadAndInitState();
        if (!this.pendingOperations.isEmpty() || this.released) {
            return;
        }
        updateStateAndInformListeners(getState(), false, false);
    }

    @Override // androidx.media3.common.Player
    public final boolean isDeviceMuted() {
        verifyApplicationThreadAndInitState();
        return this.state.isDeviceMuted;
    }

    @Override // androidx.media3.common.Player
    public final boolean isLoading() {
        verifyApplicationThreadAndInitState();
        return this.state.isLoading;
    }

    @Override // androidx.media3.common.Player
    public final boolean isPlayingAd() {
        verifyApplicationThreadAndInitState();
        return this.state.currentAdGroupIndex != -1;
    }

    @Override // androidx.media3.common.Player
    public final void moveMediaItems(final int i, int i2, int i3) {
        verifyApplicationThreadAndInitState();
        sp0.o(i >= 0 && i2 >= i && i3 >= 0);
        final State state = this.state;
        int windowCount = state.timeline.getWindowCount();
        if (!shouldHandleCommand(20) || windowCount == 0 || i >= windowCount) {
            return;
        }
        final int min = Math.min(i2, windowCount);
        final int min2 = Math.min(i3, windowCount - (min - i));
        if (i == min || min2 == i) {
            return;
        }
        updateStateForPendingOperation(handleMoveMediaItems(i, min, min2), new gz4() { // from class: ap4
            @Override // defpackage.gz4
            public final Object get() {
                SimpleBasePlayer.State lambda$moveMediaItems$4;
                lambda$moveMediaItems$4 = SimpleBasePlayer.this.lambda$moveMediaItems$4(state, i, min, min2);
                return lambda$moveMediaItems$4;
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void mute() {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(24) && this.state.volume != 0.0f) {
            updateStateForPendingOperation(handleSetVolume(0.0f, 1), new po4(state, (byte) 1));
        }
    }

    @Override // androidx.media3.common.Player
    public final void prepare() {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(2)) {
            updateStateForPendingOperation(handlePrepare(), new po4(state, (byte) 8));
        }
    }

    @Override // androidx.media3.common.Player
    public final void release() {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(32)) {
            updateStateForPendingOperation(handleRelease(), new po4(state, (byte) 5));
            this.released = true;
            this.listeners.release();
            State.Builder totalBufferedDurationMs = this.state.buildUpon().setPlaybackState(1).setTotalBufferedDurationMs(PositionSupplier.ZERO);
            long contentPositionMsInternal = getContentPositionMsInternal(state, this.window);
            int i = fp4.a;
            this.state = totalBufferedDurationMs.setContentBufferedPositionMs(new ep4(contentPositionMsInternal)).setAdBufferedPositionMs(state.adPositionMsSupplier).setIsLoading(false).build();
        }
    }

    @Override // androidx.media3.common.Player
    public final void removeListener(Player.Listener listener) {
        verifyApplicationThreadAndInitState();
        this.listeners.remove(listener);
    }

    @Override // androidx.media3.common.Player
    public final void removeMediaItems(final int i, int i2) {
        final int min;
        verifyApplicationThreadAndInitState();
        sp0.o(i >= 0 && i2 >= i);
        final State state = this.state;
        int windowCount = state.timeline.getWindowCount();
        if (!shouldHandleCommand(20) || windowCount == 0 || i >= windowCount || i == (min = Math.min(i2, windowCount))) {
            return;
        }
        updateStateForPendingOperation(handleRemoveMediaItems(i, min), new gz4() { // from class: cp4
            @Override // defpackage.gz4
            public final Object get() {
                SimpleBasePlayer.State lambda$removeMediaItems$6;
                lambda$removeMediaItems$6 = SimpleBasePlayer.this.lambda$removeMediaItems$6(state, i, min);
                return lambda$removeMediaItems$6;
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void replaceMediaItems(final int i, int i2, final List<MediaItem> list) {
        verifyApplicationThreadAndInitState();
        sp0.o(i >= 0 && i <= i2);
        final State state = this.state;
        int windowCount = state.timeline.getWindowCount();
        if (!shouldHandleCommand(20) || i > windowCount) {
            return;
        }
        final int min = Math.min(i2, windowCount);
        updateStateForPendingOperation(handleReplaceMediaItems(i, min, list), new gz4() { // from class: vo4
            @Override // defpackage.gz4
            public final Object get() {
                SimpleBasePlayer.State lambda$replaceMediaItems$5;
                lambda$replaceMediaItems$5 = SimpleBasePlayer.this.lambda$replaceMediaItems$5(state, list, min, i);
                return lambda$replaceMediaItems$5;
            }
        });
    }

    @Override // androidx.media3.common.BasePlayer
    public final void seekTo(final int i, final long j, int i2, boolean z) {
        verifyApplicationThreadAndInitState();
        sp0.o(i == -1 || i >= 0);
        final State state = this.state;
        if (shouldHandleCommand(i2)) {
            final boolean z2 = i == -1 || isPlayingAd() || (!state.timeline.isEmpty() && i >= state.timeline.getWindowCount());
            updateStateForPendingOperation(handleSeek(i, j, i2), new gz4() { // from class: bp4
                @Override // defpackage.gz4
                public final Object get() {
                    SimpleBasePlayer.State lambda$seekTo$10;
                    lambda$seekTo$10 = SimpleBasePlayer.this.lambda$seekTo$10(z2, state, i, j);
                    return lambda$seekTo$10;
                }
            }, !z2, z);
        }
    }

    @Override // androidx.media3.common.Player
    public final void setAudioAttributes(AudioAttributes audioAttributes, boolean z) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(35)) {
            updateStateForPendingOperation(handleSetAudioAttributes(audioAttributes, z), new xo4(state, audioAttributes, (byte) 4));
        }
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final void setDeviceMuted(boolean z) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(26)) {
            updateStateForPendingOperation(handleSetDeviceMuted(z, 1), new so4(state, z, (byte) 2));
        }
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final void setDeviceVolume(int i) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(25)) {
            updateStateForPendingOperation(handleSetDeviceVolume(i, 1), new uo4(state, i, (byte) 0));
        }
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItems(List<MediaItem> list, boolean z) {
        verifyApplicationThreadAndInitState();
        setMediaItemsInternal(list, z ? -1 : this.state.currentMediaItemIndex, z ? C.TIME_UNSET : this.state.contentPositionMsSupplier.get());
    }

    @Override // androidx.media3.common.Player
    public final void setPlayWhenReady(boolean z) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(1)) {
            updateStateForPendingOperation(handleSetPlayWhenReady(z), new so4(state, z, (byte) 0));
        }
    }

    @Override // androidx.media3.common.Player
    public final void setPlaybackParameters(PlaybackParameters playbackParameters) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(13)) {
            updateStateForPendingOperation(handleSetPlaybackParameters(playbackParameters), new xo4(state, playbackParameters, (byte) 6));
        }
    }

    @Override // androidx.media3.common.Player
    public final void setPlaylistMetadata(MediaMetadata mediaMetadata) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(19)) {
            updateStateForPendingOperation(handleSetPlaylistMetadata(mediaMetadata), new xo4(state, mediaMetadata, (byte) 1));
        }
    }

    @Override // androidx.media3.common.Player
    public final void setRepeatMode(int i) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(15)) {
            updateStateForPendingOperation(handleSetRepeatMode(i), new uo4(state, i, (byte) 2));
        }
    }

    @Override // androidx.media3.common.Player
    public final void setShuffleModeEnabled(boolean z) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(14)) {
            updateStateForPendingOperation(handleSetShuffleModeEnabled(z), new so4(state, z, (byte) 1));
        }
    }

    @Override // androidx.media3.common.Player
    public final void setTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(29)) {
            updateStateForPendingOperation(handleSetTrackSelectionParameters(trackSelectionParameters), new xo4(state, trackSelectionParameters, (byte) 7));
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurface(Surface surface) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(27)) {
            if (surface == null) {
                clearVideoSurface();
            } else {
                updateStateForPendingOperation(handleSetVideoOutput(surface), new po4(state, (byte) 2));
            }
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(27)) {
            if (surfaceHolder == null) {
                clearVideoSurface();
            } else {
                updateStateForPendingOperation(handleSetVideoOutput(surfaceHolder), new xo4(state, surfaceHolder, (byte) 2));
            }
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurfaceView(SurfaceView surfaceView) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(27)) {
            if (surfaceView == null) {
                clearVideoSurface();
            } else {
                updateStateForPendingOperation(handleSetVideoOutput(surfaceView), new xo4(state, surfaceView, (byte) 3));
            }
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoTextureView(TextureView textureView) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(27)) {
            if (textureView == null) {
                clearVideoSurface();
            } else {
                updateStateForPendingOperation(handleSetVideoOutput(textureView), new xo4(state, textureView.isAvailable() ? new Size(textureView.getWidth(), textureView.getHeight()) : Size.ZERO, (byte) 0));
            }
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVolume(final float f) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(24)) {
            updateStateForPendingOperation(handleSetVolume(f, 0), new gz4() { // from class: zo4
                @Override // defpackage.gz4
                public final Object get() {
                    SimpleBasePlayer.State lambda$setVolume$16;
                    lambda$setVolume$16 = SimpleBasePlayer.lambda$setVolume$16(SimpleBasePlayer.State.this, f);
                    return lambda$setVolume$16;
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void stop() {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(3)) {
            updateStateForPendingOperation(handleStop(), new xo4(this, state));
        }
    }

    @Override // androidx.media3.common.Player
    public final void unmute() {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(24) && this.state.volume == 0.0f) {
            updateStateForPendingOperation(handleSetVolume(state.unmuteVolume, 2), new po4(state, (byte) 0));
        }
    }

    public final void verifyApplicationThread() {
        if (Thread.currentThread() == this.applicationLooper.getThread()) {
            return;
        }
        zy.i(Util.formatInvariant("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\n", Thread.currentThread().getName(), this.applicationLooper.getThread().getName()));
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class State {
        public final PositionSupplier adBufferedPositionMsSupplier;
        public final PositionSupplier adPositionMsSupplier;
        public final AudioAttributes audioAttributes;
        public final int audioSessionId;
        public final Player.Commands availableCommands;
        public final PositionSupplier contentBufferedPositionMsSupplier;
        public final PositionSupplier contentPositionMsSupplier;
        public final int currentAdGroupIndex;
        public final int currentAdIndexInAdGroup;
        public final CueGroup currentCues;
        public final int currentMediaItemIndex;
        public final MediaMetadata currentMetadata;
        public final Tracks currentTracks;
        public final DeviceInfo deviceInfo;
        public final int deviceVolume;
        public final long discontinuityPositionMs;
        public final boolean hasPositionDiscontinuity;
        public final boolean isDeviceMuted;
        public final boolean isLoading;
        public final long maxSeekToPreviousPositionMs;
        public final boolean newlyRenderedFirstFrame;
        public final boolean playWhenReady;
        public final int playWhenReadyChangeReason;
        public final PlaybackParameters playbackParameters;
        public final int playbackState;
        public final int playbackSuppressionReason;
        public final PlaybackException playerError;
        public final MediaMetadata playlistMetadata;
        public final int positionDiscontinuityReason;
        public final int repeatMode;
        public final long seekBackIncrementMs;
        public final long seekForwardIncrementMs;
        public final boolean shuffleModeEnabled;
        public final Size surfaceSize;
        public final Metadata timedMetadata;
        public final Timeline timeline;
        public final PositionSupplier totalBufferedDurationMsSupplier;
        public final TrackSelectionParameters trackSelectionParameters;
        public final float unmuteVolume;
        private final boolean usesDerivedMediaMetadata;
        public final VideoSize videoSize;
        public final float volume;

        /* JADX WARN: Removed duplicated region for block: B:21:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0135  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0192  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private State(androidx.media3.common.SimpleBasePlayer.State.Builder r18) {
            /*
                Method dump skipped, instructions count: 700
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.SimpleBasePlayer.State.<init>(androidx.media3.common.SimpleBasePlayer$State$Builder):void");
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return this.playWhenReady == state.playWhenReady && this.playWhenReadyChangeReason == state.playWhenReadyChangeReason && this.availableCommands.equals(state.availableCommands) && this.playbackState == state.playbackState && this.playbackSuppressionReason == state.playbackSuppressionReason && Objects.equals(this.playerError, state.playerError) && this.repeatMode == state.repeatMode && this.shuffleModeEnabled == state.shuffleModeEnabled && this.isLoading == state.isLoading && this.seekBackIncrementMs == state.seekBackIncrementMs && this.seekForwardIncrementMs == state.seekForwardIncrementMs && this.maxSeekToPreviousPositionMs == state.maxSeekToPreviousPositionMs && this.playbackParameters.equals(state.playbackParameters) && this.trackSelectionParameters.equals(state.trackSelectionParameters) && this.audioAttributes.equals(state.audioAttributes) && this.volume == state.volume && this.unmuteVolume == state.unmuteVolume && this.videoSize.equals(state.videoSize) && this.currentCues.equals(state.currentCues) && this.deviceInfo.equals(state.deviceInfo) && this.deviceVolume == state.deviceVolume && this.isDeviceMuted == state.isDeviceMuted && this.surfaceSize.equals(state.surfaceSize) && this.newlyRenderedFirstFrame == state.newlyRenderedFirstFrame && this.timedMetadata.equals(state.timedMetadata) && this.timeline.equals(state.timeline) && this.currentTracks.equals(state.currentTracks) && this.currentMetadata.equals(state.currentMetadata) && this.playlistMetadata.equals(state.playlistMetadata) && this.currentMediaItemIndex == state.currentMediaItemIndex && this.currentAdGroupIndex == state.currentAdGroupIndex && this.currentAdIndexInAdGroup == state.currentAdIndexInAdGroup && this.contentPositionMsSupplier.equals(state.contentPositionMsSupplier) && this.adPositionMsSupplier.equals(state.adPositionMsSupplier) && this.contentBufferedPositionMsSupplier.equals(state.contentBufferedPositionMsSupplier) && this.adBufferedPositionMsSupplier.equals(state.adBufferedPositionMsSupplier) && this.totalBufferedDurationMsSupplier.equals(state.totalBufferedDurationMsSupplier) && this.hasPositionDiscontinuity == state.hasPositionDiscontinuity && this.positionDiscontinuityReason == state.positionDiscontinuityReason && this.discontinuityPositionMs == state.discontinuityPositionMs;
        }

        public dy1 getPlaylist() {
            Timeline timeline = this.timeline;
            if (timeline instanceof PlaylistTimeline) {
                return ((PlaylistTimeline) timeline).playlist;
            }
            Timeline.Window window = new Timeline.Window();
            Timeline.Period period = new Timeline.Period();
            zx1 o = dy1.o(this.timeline.getWindowCount());
            for (int i = 0; i < this.timeline.getWindowCount(); i++) {
                o.c(MediaItemData.buildFromState(this, i, period, window));
            }
            return o.f();
        }

        public int hashCode() {
            int hashCode = (((((((((this.availableCommands.hashCode() + 217) * 31) + (this.playWhenReady ? 1 : 0)) * 31) + this.playWhenReadyChangeReason) * 31) + this.playbackState) * 31) + this.playbackSuppressionReason) * 31;
            PlaybackException playbackException = this.playerError;
            int hashCode2 = (((((((hashCode + (playbackException == null ? 0 : playbackException.hashCode())) * 31) + this.repeatMode) * 31) + (this.shuffleModeEnabled ? 1 : 0)) * 31) + (this.isLoading ? 1 : 0)) * 31;
            long j = this.seekBackIncrementMs;
            int i = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.seekForwardIncrementMs;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.maxSeekToPreviousPositionMs;
            int hashCode3 = (((((this.totalBufferedDurationMsSupplier.hashCode() + ((this.adBufferedPositionMsSupplier.hashCode() + ((this.contentBufferedPositionMsSupplier.hashCode() + ((this.adPositionMsSupplier.hashCode() + ((this.contentPositionMsSupplier.hashCode() + ((((((((this.playlistMetadata.hashCode() + ((this.currentMetadata.hashCode() + ((this.currentTracks.hashCode() + ((this.timeline.hashCode() + ((this.timedMetadata.hashCode() + ((((this.surfaceSize.hashCode() + ((((((this.deviceInfo.hashCode() + ((this.currentCues.hashCode() + ((this.videoSize.hashCode() + ((Float.floatToRawIntBits(this.unmuteVolume) + ((Float.floatToRawIntBits(this.volume) + ((this.audioAttributes.hashCode() + ((this.trackSelectionParameters.hashCode() + ((this.playbackParameters.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + this.deviceVolume) * 31) + (this.isDeviceMuted ? 1 : 0)) * 31)) * 31) + (this.newlyRenderedFirstFrame ? 1 : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + this.currentMediaItemIndex) * 31) + this.currentAdGroupIndex) * 31) + this.currentAdIndexInAdGroup) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + (this.hasPositionDiscontinuity ? 1 : 0)) * 31) + this.positionDiscontinuityReason) * 31;
            long j4 = this.discontinuityPositionMs;
            return hashCode3 + ((int) ((j4 >>> 32) ^ j4));
        }

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        public static final class Builder {
            private PositionSupplier adBufferedPositionMsSupplier;
            private Long adPositionMs;
            private PositionSupplier adPositionMsSupplier;
            private AudioAttributes audioAttributes;
            private int audioSessionId;
            private Player.Commands availableCommands;
            private PositionSupplier contentBufferedPositionMsSupplier;
            private Long contentPositionMs;
            private PositionSupplier contentPositionMsSupplier;
            private int currentAdGroupIndex;
            private int currentAdIndexInAdGroup;
            private CueGroup currentCues;
            private int currentMediaItemIndex;
            private MediaMetadata currentMetadata;
            private Tracks currentTracks;
            private DeviceInfo deviceInfo;
            private int deviceVolume;
            private long discontinuityPositionMs;
            private boolean hasPositionDiscontinuity;
            private boolean isDeviceMuted;
            private boolean isLoading;
            private long maxSeekToPreviousPositionMs;
            private boolean newlyRenderedFirstFrame;
            private boolean playWhenReady;
            private int playWhenReadyChangeReason;
            private PlaybackParameters playbackParameters;
            private int playbackState;
            private int playbackSuppressionReason;
            private PlaybackException playerError;
            private dy1 playlist;
            private MediaMetadata playlistMetadata;
            private int positionDiscontinuityReason;
            private int repeatMode;
            private long seekBackIncrementMs;
            private long seekForwardIncrementMs;
            private boolean shuffleModeEnabled;
            private Size surfaceSize;
            private Metadata timedMetadata;
            private Timeline timeline;
            private PositionSupplier totalBufferedDurationMsSupplier;
            private TrackSelectionParameters trackSelectionParameters;
            private float unmuteVolume;
            private VideoSize videoSize;
            private float volume;

            private Builder(State state) {
                this.availableCommands = state.availableCommands;
                this.playWhenReady = state.playWhenReady;
                this.playWhenReadyChangeReason = state.playWhenReadyChangeReason;
                this.playbackState = state.playbackState;
                this.playbackSuppressionReason = state.playbackSuppressionReason;
                this.playerError = state.playerError;
                this.repeatMode = state.repeatMode;
                this.shuffleModeEnabled = state.shuffleModeEnabled;
                this.isLoading = state.isLoading;
                this.seekBackIncrementMs = state.seekBackIncrementMs;
                this.seekForwardIncrementMs = state.seekForwardIncrementMs;
                this.maxSeekToPreviousPositionMs = state.maxSeekToPreviousPositionMs;
                this.playbackParameters = state.playbackParameters;
                this.trackSelectionParameters = state.trackSelectionParameters;
                this.audioAttributes = state.audioAttributes;
                this.audioSessionId = state.audioSessionId;
                this.volume = state.volume;
                this.unmuteVolume = state.unmuteVolume;
                this.videoSize = state.videoSize;
                this.currentCues = state.currentCues;
                this.deviceInfo = state.deviceInfo;
                this.deviceVolume = state.deviceVolume;
                this.isDeviceMuted = state.isDeviceMuted;
                this.surfaceSize = state.surfaceSize;
                this.newlyRenderedFirstFrame = state.newlyRenderedFirstFrame;
                this.timedMetadata = state.timedMetadata;
                Timeline timeline = state.timeline;
                this.timeline = timeline;
                if (timeline instanceof PlaylistTimeline) {
                    this.playlist = ((PlaylistTimeline) timeline).playlist;
                } else {
                    this.currentTracks = state.currentTracks;
                    this.currentMetadata = state.usesDerivedMediaMetadata ? null : state.currentMetadata;
                }
                this.playlistMetadata = state.playlistMetadata;
                this.currentMediaItemIndex = state.currentMediaItemIndex;
                this.currentAdGroupIndex = state.currentAdGroupIndex;
                this.currentAdIndexInAdGroup = state.currentAdIndexInAdGroup;
                this.contentPositionMs = null;
                this.contentPositionMsSupplier = state.contentPositionMsSupplier;
                this.adPositionMs = null;
                this.adPositionMsSupplier = state.adPositionMsSupplier;
                this.contentBufferedPositionMsSupplier = state.contentBufferedPositionMsSupplier;
                this.adBufferedPositionMsSupplier = state.adBufferedPositionMsSupplier;
                this.totalBufferedDurationMsSupplier = state.totalBufferedDurationMsSupplier;
                this.hasPositionDiscontinuity = state.hasPositionDiscontinuity;
                this.positionDiscontinuityReason = state.positionDiscontinuityReason;
                this.discontinuityPositionMs = state.discontinuityPositionMs;
            }

            public State build() {
                return new State(this);
            }

            public Builder clearPositionDiscontinuity() {
                this.hasPositionDiscontinuity = false;
                return this;
            }

            public Builder setAdBufferedPositionMs(PositionSupplier positionSupplier) {
                this.adBufferedPositionMsSupplier = positionSupplier;
                return this;
            }

            public Builder setAdPositionMs(long j) {
                this.adPositionMs = Long.valueOf(j);
                return this;
            }

            public Builder setAudioAttributes(AudioAttributes audioAttributes) {
                this.audioAttributes = audioAttributes;
                return this;
            }

            public Builder setAudioSessionId(int i) {
                this.audioSessionId = i;
                return this;
            }

            public Builder setAvailableCommands(Player.Commands commands) {
                this.availableCommands = commands;
                return this;
            }

            public Builder setContentBufferedPositionMs(PositionSupplier positionSupplier) {
                this.contentBufferedPositionMsSupplier = positionSupplier;
                return this;
            }

            public Builder setContentPositionMs(long j) {
                this.contentPositionMs = Long.valueOf(j);
                return this;
            }

            public Builder setCurrentAd(int i, int i2) {
                sp0.o((i == -1) == (i2 == -1));
                this.currentAdGroupIndex = i;
                this.currentAdIndexInAdGroup = i2;
                return this;
            }

            public Builder setCurrentCues(CueGroup cueGroup) {
                this.currentCues = cueGroup;
                return this;
            }

            public Builder setCurrentMediaItemIndex(int i) {
                this.currentMediaItemIndex = i;
                return this;
            }

            public Builder setDeviceInfo(DeviceInfo deviceInfo) {
                this.deviceInfo = deviceInfo;
                return this;
            }

            public Builder setDeviceVolume(int i) {
                sp0.o(i >= 0);
                this.deviceVolume = i;
                return this;
            }

            public Builder setIsDeviceMuted(boolean z) {
                this.isDeviceMuted = z;
                return this;
            }

            public Builder setIsLoading(boolean z) {
                this.isLoading = z;
                return this;
            }

            public Builder setMaxSeekToPreviousPositionMs(long j) {
                this.maxSeekToPreviousPositionMs = j;
                return this;
            }

            public Builder setNewlyRenderedFirstFrame(boolean z) {
                this.newlyRenderedFirstFrame = z;
                return this;
            }

            public Builder setPlayWhenReady(boolean z, int i) {
                this.playWhenReady = z;
                this.playWhenReadyChangeReason = i;
                return this;
            }

            public Builder setPlaybackParameters(PlaybackParameters playbackParameters) {
                this.playbackParameters = playbackParameters;
                return this;
            }

            public Builder setPlaybackState(int i) {
                this.playbackState = i;
                return this;
            }

            public Builder setPlaybackSuppressionReason(int i) {
                this.playbackSuppressionReason = i;
                return this;
            }

            public Builder setPlayerError(PlaybackException playbackException) {
                this.playerError = playbackException;
                return this;
            }

            public Builder setPlaylist(List<MediaItemData> list) {
                HashSet hashSet = new HashSet();
                for (int i = 0; i < list.size(); i++) {
                    sp0.p(hashSet.add(list.get(i).uid), "Duplicate MediaItemData UID in playlist");
                }
                this.playlist = dy1.p(list);
                this.timeline = new PlaylistTimeline(this.playlist);
                this.currentTracks = null;
                this.currentMetadata = null;
                return this;
            }

            public Builder setPlaylistMetadata(MediaMetadata mediaMetadata) {
                this.playlistMetadata = mediaMetadata;
                return this;
            }

            public Builder setPositionDiscontinuity(int i, long j) {
                this.hasPositionDiscontinuity = true;
                this.positionDiscontinuityReason = i;
                this.discontinuityPositionMs = j;
                return this;
            }

            public Builder setRepeatMode(int i) {
                this.repeatMode = i;
                return this;
            }

            public Builder setSeekBackIncrementMs(long j) {
                this.seekBackIncrementMs = j;
                return this;
            }

            public Builder setSeekForwardIncrementMs(long j) {
                this.seekForwardIncrementMs = j;
                return this;
            }

            public Builder setShuffleModeEnabled(boolean z) {
                this.shuffleModeEnabled = z;
                return this;
            }

            public Builder setSurfaceSize(Size size) {
                this.surfaceSize = size;
                return this;
            }

            public Builder setTimedMetadata(Metadata metadata) {
                this.timedMetadata = metadata;
                return this;
            }

            public Builder setTotalBufferedDurationMs(PositionSupplier positionSupplier) {
                this.totalBufferedDurationMsSupplier = positionSupplier;
                return this;
            }

            public Builder setTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
                this.trackSelectionParameters = trackSelectionParameters;
                return this;
            }

            public Builder setUnmuteVolume(float f) {
                sp0.o(f >= 0.0f && f <= 1.0f);
                this.unmuteVolume = f;
                return this;
            }

            public Builder setVideoSize(VideoSize videoSize) {
                this.videoSize = videoSize;
                return this;
            }

            public Builder setVolume(float f) {
                sp0.o(f >= 0.0f && f <= 1.0f);
                this.unmuteVolume = f != 0.0f ? f : this.volume;
                this.volume = f;
                return this;
            }

            public Builder setAdPositionMs(PositionSupplier positionSupplier) {
                this.adPositionMs = null;
                this.adPositionMsSupplier = positionSupplier;
                return this;
            }

            public Builder setContentPositionMs(PositionSupplier positionSupplier) {
                this.contentPositionMs = null;
                this.contentPositionMsSupplier = positionSupplier;
                return this;
            }

            public Builder setPlaylist(Timeline timeline, Tracks tracks, MediaMetadata mediaMetadata) {
                this.playlist = null;
                this.timeline = timeline;
                this.currentTracks = tracks;
                this.currentMetadata = mediaMetadata;
                return this;
            }

            public Builder() {
                this.availableCommands = Player.Commands.EMPTY;
                this.playWhenReady = false;
                this.playWhenReadyChangeReason = 1;
                this.playbackState = 1;
                this.playbackSuppressionReason = 0;
                this.playerError = null;
                this.repeatMode = 0;
                this.shuffleModeEnabled = false;
                this.isLoading = false;
                this.seekBackIncrementMs = 5000L;
                this.seekForwardIncrementMs = 15000L;
                this.maxSeekToPreviousPositionMs = C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
                this.playbackParameters = PlaybackParameters.DEFAULT;
                this.trackSelectionParameters = TrackSelectionParameters.DEFAULT;
                this.audioAttributes = AudioAttributes.DEFAULT;
                this.audioSessionId = 0;
                this.volume = 1.0f;
                this.unmuteVolume = 1.0f;
                this.videoSize = VideoSize.UNKNOWN;
                this.currentCues = CueGroup.EMPTY_TIME_ZERO;
                this.deviceInfo = DeviceInfo.UNKNOWN;
                this.deviceVolume = 0;
                this.isDeviceMuted = false;
                this.surfaceSize = Size.UNKNOWN;
                this.newlyRenderedFirstFrame = false;
                this.timedMetadata = new Metadata(C.TIME_UNSET, new Metadata.Entry[0]);
                ay1 ay1Var = dy1.J;
                this.playlist = x24.M;
                this.timeline = Timeline.EMPTY;
                this.currentTracks = null;
                this.currentMetadata = null;
                this.playlistMetadata = MediaMetadata.EMPTY;
                this.currentMediaItemIndex = -1;
                this.currentAdGroupIndex = -1;
                this.currentAdIndexInAdGroup = -1;
                this.contentPositionMs = null;
                int i = fp4.a;
                this.contentPositionMsSupplier = new ep4(C.TIME_UNSET);
                this.adPositionMs = null;
                PositionSupplier positionSupplier = PositionSupplier.ZERO;
                this.adPositionMsSupplier = positionSupplier;
                this.contentBufferedPositionMsSupplier = new ep4(C.TIME_UNSET);
                this.adBufferedPositionMsSupplier = positionSupplier;
                this.totalBufferedDurationMsSupplier = positionSupplier;
                this.hasPositionDiscontinuity = false;
                this.positionDiscontinuityReason = 5;
                this.discontinuityPositionMs = 0L;
            }
        }
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurface(Surface surface) {
        clearVideoOutput(surface);
    }

    public fl2 handleSetVolume(float f, int i) {
        return handleSetVolume(f);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class PeriodData {
        public final AdPlaybackState adPlaybackState;
        public final long durationUs;
        public final boolean isPlaceholder;
        public final Object uid;

        private PeriodData(Builder builder) {
            this.uid = builder.uid;
            this.durationUs = builder.durationUs;
            this.adPlaybackState = builder.adPlaybackState;
            this.isPlaceholder = builder.isPlaceholder;
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PeriodData)) {
                return false;
            }
            PeriodData periodData = (PeriodData) obj;
            return this.uid.equals(periodData.uid) && this.durationUs == periodData.durationUs && this.adPlaybackState.equals(periodData.adPlaybackState) && this.isPlaceholder == periodData.isPlaceholder;
        }

        public int hashCode() {
            int hashCode = (this.uid.hashCode() + 217) * 31;
            long j = this.durationUs;
            return ((this.adPlaybackState.hashCode() + ((hashCode + ((int) (j ^ (j >>> 32)))) * 31)) * 31) + (this.isPlaceholder ? 1 : 0);
        }

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        public static final class Builder {
            private AdPlaybackState adPlaybackState;
            private long durationUs;
            private boolean isPlaceholder;
            private Object uid;

            private Builder(PeriodData periodData) {
                this.uid = periodData.uid;
                this.durationUs = periodData.durationUs;
                this.adPlaybackState = periodData.adPlaybackState;
                this.isPlaceholder = periodData.isPlaceholder;
            }

            public PeriodData build() {
                return new PeriodData(this);
            }

            public Builder setAdPlaybackState(AdPlaybackState adPlaybackState) {
                this.adPlaybackState = adPlaybackState;
                return this;
            }

            public Builder setDurationUs(long j) {
                sp0.o(j == C.TIME_UNSET || j >= 0);
                this.durationUs = j;
                return this;
            }

            public Builder setIsPlaceholder(boolean z) {
                this.isPlaceholder = z;
                return this;
            }

            public Builder setUid(Object obj) {
                this.uid = obj;
                return this;
            }

            public Builder(Object obj) {
                this.uid = obj;
                this.durationUs = 0L;
                this.adPlaybackState = AdPlaybackState.NONE;
                this.isPlaceholder = false;
            }
        }
    }

    @Override // androidx.media3.common.Player
    public final void decreaseDeviceVolume(int i) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(34)) {
            updateStateForPendingOperation(handleDecreaseDeviceVolume(i), new po4(state, (byte) 9));
        }
    }

    @Override // androidx.media3.common.Player
    public final void increaseDeviceVolume(int i) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(34)) {
            updateStateForPendingOperation(handleIncreaseDeviceVolume(i), new po4(state, (byte) 3));
        }
    }

    @Override // androidx.media3.common.Player
    public final void setDeviceMuted(boolean z, int i) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(34)) {
            updateStateForPendingOperation(handleSetDeviceMuted(z, i), new so4(state, z, (byte) 3));
        }
    }

    @Override // androidx.media3.common.Player
    public final void setDeviceVolume(int i, int i2) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (shouldHandleCommand(33)) {
            updateStateForPendingOperation(handleSetDeviceVolume(i, i2), new uo4(state, i, (byte) 1));
        }
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItems(List<MediaItem> list, int i, long j) {
        verifyApplicationThreadAndInitState();
        if (i == -1) {
            State state = this.state;
            int i2 = state.currentMediaItemIndex;
            long j2 = state.contentPositionMsSupplier.get();
            i = i2;
            j = j2;
        }
        setMediaItemsInternal(list, i, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$release$13(State state) {
        return state;
    }

    public State getPlaceholderState(State state) {
        return state;
    }

    public SimpleBasePlayer(Looper looper) {
        this(looper, Clock.DEFAULT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ fl2 lambda$handleReplaceMediaItems$33(fl2 fl2Var, Object obj) {
        return fl2Var;
    }

    @RequiresNonNull({"state"})
    private void updateStateForPendingOperation(fl2 fl2Var, gz4 gz4Var) {
        updateStateForPendingOperation(fl2Var, gz4Var, false, false);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class MediaItemData {
        public final long defaultPositionUs;
        public final long durationUs;
        public final long elapsedRealtimeEpochOffsetMs;
        public final boolean isDynamic;
        public final boolean isPlaceholder;
        public final boolean isSeekable;
        public final MediaItem.LiveConfiguration liveConfiguration;
        public final Object manifest;
        public final MediaItem mediaItem;
        public final MediaMetadata mediaMetadata;
        private final long[] periodPositionInWindowUs;
        public final dy1 periods;
        public final long positionInFirstPeriodUs;
        public final long presentationStartTimeMs;
        public final Tracks tracks;
        public final Object uid;
        public final long windowStartTimeMs;

        private MediaItemData(Builder builder) {
            int i = 0;
            if (builder.liveConfiguration == null) {
                sp0.p(builder.presentationStartTimeMs == C.TIME_UNSET, "presentationStartTimeMs can only be set if liveConfiguration != null");
                sp0.p(builder.windowStartTimeMs == C.TIME_UNSET, "windowStartTimeMs can only be set if liveConfiguration != null");
                sp0.p(builder.elapsedRealtimeEpochOffsetMs == C.TIME_UNSET, "elapsedRealtimeEpochOffsetMs can only be set if liveConfiguration != null");
            } else if (builder.presentationStartTimeMs != C.TIME_UNSET && builder.windowStartTimeMs != C.TIME_UNSET) {
                sp0.p(builder.windowStartTimeMs >= builder.presentationStartTimeMs, "windowStartTimeMs can't be less than presentationStartTimeMs");
            }
            int size = builder.periods.size();
            if (builder.durationUs != C.TIME_UNSET) {
                sp0.p(builder.defaultPositionUs <= builder.durationUs, "defaultPositionUs can't be greater than durationUs");
            }
            this.uid = builder.uid;
            this.tracks = builder.tracks;
            this.mediaItem = builder.mediaItem;
            this.mediaMetadata = builder.mediaMetadata;
            this.manifest = builder.manifest;
            this.liveConfiguration = builder.liveConfiguration;
            this.presentationStartTimeMs = builder.presentationStartTimeMs;
            this.windowStartTimeMs = builder.windowStartTimeMs;
            this.elapsedRealtimeEpochOffsetMs = builder.elapsedRealtimeEpochOffsetMs;
            this.isSeekable = builder.isSeekable;
            this.isDynamic = builder.isDynamic;
            this.defaultPositionUs = builder.defaultPositionUs;
            this.durationUs = builder.durationUs;
            long j = builder.positionInFirstPeriodUs;
            this.positionInFirstPeriodUs = j;
            this.isPlaceholder = builder.isPlaceholder;
            dy1 dy1Var = builder.periods;
            this.periods = dy1Var;
            long[] jArr = new long[dy1Var.size()];
            this.periodPositionInWindowUs = jArr;
            if (dy1Var.isEmpty()) {
                return;
            }
            jArr[0] = -j;
            while (i < size - 1) {
                long[] jArr2 = this.periodPositionInWindowUs;
                int i2 = i + 1;
                jArr2[i2] = jArr2[i] + ((PeriodData) this.periods.get(i)).durationUs;
                i = i2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static MediaItemData buildFromState(State state, int i, Timeline.Period period, Timeline.Window window) {
            boolean z = SimpleBasePlayer.getCurrentMediaItemIndexInternal(state) == i;
            state.timeline.getWindow(i, window);
            zx1 n = dy1.n();
            for (int i2 = window.firstPeriodIndex; i2 <= window.lastPeriodIndex; i2++) {
                state.timeline.getPeriod(i2, period, true);
                Object obj = period.uid;
                obj.getClass();
                n.c(new PeriodData.Builder(obj).setAdPlaybackState(period.adPlaybackState).setDurationUs(period.durationUs).setIsPlaceholder(period.isPlaceholder).build());
            }
            return new Builder(window.uid).setDefaultPositionUs(window.defaultPositionUs).setDurationUs(window.durationUs).setElapsedRealtimeEpochOffsetMs(window.elapsedRealtimeEpochOffsetMs).setIsDynamic(window.isDynamic).setIsPlaceholder(window.isPlaceholder).setIsSeekable(window.isSeekable).setLiveConfiguration(window.liveConfiguration).setManifest(window.manifest).setMediaItem(window.mediaItem).setMediaMetadata(z ? state.currentMetadata : null).setPeriods(n.f()).setPositionInFirstPeriodUs(window.positionInFirstPeriodUs).setPresentationStartTimeMs(window.presentationStartTimeMs).setTracks(z ? state.currentTracks : Tracks.EMPTY).setWindowStartTimeMs(window.windowStartTimeMs).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Timeline.Period getPeriod(int i, int i2, Timeline.Period period) {
            if (this.periods.isEmpty()) {
                Object obj = this.uid;
                long j = this.positionInFirstPeriodUs;
                period.set(obj, obj, i, j + this.durationUs, -j, AdPlaybackState.NONE, this.isPlaceholder);
                return period;
            }
            PeriodData periodData = (PeriodData) this.periods.get(i2);
            Object obj2 = periodData.uid;
            period.set(obj2, Pair.create(this.uid, obj2), i, periodData.durationUs, this.periodPositionInWindowUs[i2], periodData.adPlaybackState, periodData.isPlaceholder);
            return period;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object getPeriodUid(int i) {
            if (this.periods.isEmpty()) {
                return this.uid;
            }
            return Pair.create(this.uid, ((PeriodData) this.periods.get(i)).uid);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Timeline.Window getWindow(int i, Timeline.Window window) {
            int size;
            boolean z;
            if (this.periods.isEmpty()) {
                size = 1;
                z = true;
            } else {
                size = this.periods.size();
                z = true;
            }
            window.set(this.uid, this.mediaItem, this.manifest, this.presentationStartTimeMs, this.windowStartTimeMs, this.elapsedRealtimeEpochOffsetMs, this.isSeekable, this.isDynamic, this.liveConfiguration, this.defaultPositionUs, this.durationUs, i, (i + size) - 1, this.positionInFirstPeriodUs);
            window.isPlaceholder = this.isPlaceholder;
            return window;
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaItemData)) {
                return false;
            }
            MediaItemData mediaItemData = (MediaItemData) obj;
            return this.uid.equals(mediaItemData.uid) && this.tracks.equals(mediaItemData.tracks) && this.mediaItem.equals(mediaItemData.mediaItem) && Objects.equals(this.mediaMetadata, mediaItemData.mediaMetadata) && Objects.equals(this.manifest, mediaItemData.manifest) && Objects.equals(this.liveConfiguration, mediaItemData.liveConfiguration) && this.presentationStartTimeMs == mediaItemData.presentationStartTimeMs && this.windowStartTimeMs == mediaItemData.windowStartTimeMs && this.elapsedRealtimeEpochOffsetMs == mediaItemData.elapsedRealtimeEpochOffsetMs && this.isSeekable == mediaItemData.isSeekable && this.isDynamic == mediaItemData.isDynamic && this.defaultPositionUs == mediaItemData.defaultPositionUs && this.durationUs == mediaItemData.durationUs && this.positionInFirstPeriodUs == mediaItemData.positionInFirstPeriodUs && this.isPlaceholder == mediaItemData.isPlaceholder && this.periods.equals(mediaItemData.periods);
        }

        public int hashCode() {
            int hashCode = (this.mediaItem.hashCode() + ((this.tracks.hashCode() + ((this.uid.hashCode() + 217) * 31)) * 31)) * 31;
            MediaMetadata mediaMetadata = this.mediaMetadata;
            int hashCode2 = (hashCode + (mediaMetadata == null ? 0 : mediaMetadata.hashCode())) * 31;
            Object obj = this.manifest;
            int hashCode3 = (hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
            MediaItem.LiveConfiguration liveConfiguration = this.liveConfiguration;
            int hashCode4 = liveConfiguration != null ? liveConfiguration.hashCode() : 0;
            long j = this.presentationStartTimeMs;
            int i = (((hashCode3 + hashCode4) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.windowStartTimeMs;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.elapsedRealtimeEpochOffsetMs;
            int i3 = (((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.isSeekable ? 1 : 0)) * 31) + (this.isDynamic ? 1 : 0)) * 31;
            long j4 = this.defaultPositionUs;
            int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.durationUs;
            int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
            long j6 = this.positionInFirstPeriodUs;
            return this.periods.hashCode() + ((((i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + (this.isPlaceholder ? 1 : 0)) * 31);
        }

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        public static final class Builder {
            private long defaultPositionUs;
            private long durationUs;
            private long elapsedRealtimeEpochOffsetMs;
            private boolean isDynamic;
            private boolean isPlaceholder;
            private boolean isSeekable;
            private MediaItem.LiveConfiguration liveConfiguration;
            private Object manifest;
            private MediaItem mediaItem;
            private MediaMetadata mediaMetadata;
            private dy1 periods;
            private long positionInFirstPeriodUs;
            private long presentationStartTimeMs;
            private Tracks tracks;
            private Object uid;
            private long windowStartTimeMs;

            private Builder(MediaItemData mediaItemData) {
                this.uid = mediaItemData.uid;
                this.tracks = mediaItemData.tracks;
                this.mediaItem = mediaItemData.mediaItem;
                this.mediaMetadata = mediaItemData.mediaMetadata;
                this.manifest = mediaItemData.manifest;
                this.liveConfiguration = mediaItemData.liveConfiguration;
                this.presentationStartTimeMs = mediaItemData.presentationStartTimeMs;
                this.windowStartTimeMs = mediaItemData.windowStartTimeMs;
                this.elapsedRealtimeEpochOffsetMs = mediaItemData.elapsedRealtimeEpochOffsetMs;
                this.isSeekable = mediaItemData.isSeekable;
                this.isDynamic = mediaItemData.isDynamic;
                this.defaultPositionUs = mediaItemData.defaultPositionUs;
                this.durationUs = mediaItemData.durationUs;
                this.positionInFirstPeriodUs = mediaItemData.positionInFirstPeriodUs;
                this.isPlaceholder = mediaItemData.isPlaceholder;
                this.periods = mediaItemData.periods;
            }

            public MediaItemData build() {
                return new MediaItemData(this);
            }

            public Builder setDefaultPositionUs(long j) {
                sp0.o(j >= 0);
                this.defaultPositionUs = j;
                return this;
            }

            public Builder setDurationUs(long j) {
                sp0.o(j == C.TIME_UNSET || j >= 0);
                this.durationUs = j;
                return this;
            }

            public Builder setElapsedRealtimeEpochOffsetMs(long j) {
                this.elapsedRealtimeEpochOffsetMs = j;
                return this;
            }

            public Builder setIsDynamic(boolean z) {
                this.isDynamic = z;
                return this;
            }

            public Builder setIsPlaceholder(boolean z) {
                this.isPlaceholder = z;
                return this;
            }

            public Builder setIsSeekable(boolean z) {
                this.isSeekable = z;
                return this;
            }

            public Builder setLiveConfiguration(MediaItem.LiveConfiguration liveConfiguration) {
                this.liveConfiguration = liveConfiguration;
                return this;
            }

            public Builder setManifest(Object obj) {
                this.manifest = obj;
                return this;
            }

            public Builder setMediaItem(MediaItem mediaItem) {
                this.mediaItem = mediaItem;
                return this;
            }

            public Builder setMediaMetadata(MediaMetadata mediaMetadata) {
                this.mediaMetadata = mediaMetadata;
                return this;
            }

            public Builder setPeriods(List<PeriodData> list) {
                int size = list.size();
                int i = 0;
                while (i < size - 1) {
                    sp0.p(list.get(i).durationUs != C.TIME_UNSET, "Periods other than last need a duration");
                    int i2 = i + 1;
                    for (int i3 = i2; i3 < size; i3++) {
                        sp0.p(!list.get(i).uid.equals(list.get(i3).uid), "Duplicate PeriodData UIDs in period list");
                    }
                    i = i2;
                }
                this.periods = dy1.p(list);
                return this;
            }

            public Builder setPositionInFirstPeriodUs(long j) {
                sp0.o(j >= 0);
                this.positionInFirstPeriodUs = j;
                return this;
            }

            public Builder setPresentationStartTimeMs(long j) {
                this.presentationStartTimeMs = j;
                return this;
            }

            public Builder setTracks(Tracks tracks) {
                this.tracks = tracks;
                return this;
            }

            public Builder setUid(Object obj) {
                this.uid = obj;
                return this;
            }

            public Builder setWindowStartTimeMs(long j) {
                this.windowStartTimeMs = j;
                return this;
            }

            public Builder(Object obj) {
                this.uid = obj;
                this.tracks = Tracks.EMPTY;
                this.mediaItem = MediaItem.EMPTY;
                this.mediaMetadata = null;
                this.manifest = null;
                this.liveConfiguration = null;
                this.presentationStartTimeMs = C.TIME_UNSET;
                this.windowStartTimeMs = C.TIME_UNSET;
                this.elapsedRealtimeEpochOffsetMs = C.TIME_UNSET;
                this.isSeekable = false;
                this.isDynamic = false;
                this.defaultPositionUs = 0L;
                this.durationUs = C.TIME_UNSET;
                this.positionInFirstPeriodUs = 0L;
                this.isPlaceholder = false;
                ay1 ay1Var = dy1.J;
                this.periods = x24.M;
            }
        }
    }
}

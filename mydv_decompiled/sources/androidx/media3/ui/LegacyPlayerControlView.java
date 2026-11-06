package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.C;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.RepeatModeUtil;
import androidx.media3.common.util.Util;
import androidx.media3.ui.TimeBar;
import defpackage.sp0;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class LegacyPlayerControlView extends FrameLayout {
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    private static final int MAX_UPDATE_INTERVAL_MS = 1000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private long[] adGroupTimesMs;
    private final float buttonAlphaDisabled;
    private final float buttonAlphaEnabled;
    private final ComponentListener componentListener;
    private long currentBufferedPosition;
    private long currentPosition;
    private long currentWindowOffset;
    private final TextView durationView;
    private long[] extraAdGroupTimesMs;
    private boolean[] extraPlayedAdGroups;
    private final View fastForwardButton;
    private final StringBuilder formatBuilder;
    private final Formatter formatter;
    private final Runnable hideAction;
    private long hideAtMs;
    private boolean isAttachedToWindow;
    private boolean multiWindowTimeBar;
    private final View nextButton;
    private final View pauseButton;
    private final Timeline.Period period;
    private final View playButton;
    private boolean[] playedAdGroups;
    private Player player;
    private final TextView positionView;
    private final View previousButton;
    private ProgressUpdateListener progressUpdateListener;
    private final String repeatAllButtonContentDescription;
    private final Drawable repeatAllButtonDrawable;
    private final String repeatOffButtonContentDescription;
    private final Drawable repeatOffButtonDrawable;
    private final String repeatOneButtonContentDescription;
    private final Drawable repeatOneButtonDrawable;
    private final ImageView repeatToggleButton;
    private int repeatToggleModes;
    private final View rewindButton;
    private boolean scrubbing;
    private boolean showFastForwardButton;
    private boolean showMultiWindowTimeBar;
    private boolean showNextButton;
    private boolean showPlayButtonIfSuppressed;
    private boolean showPreviousButton;
    private boolean showRewindButton;
    private boolean showShuffleButton;
    private int showTimeoutMs;
    private final ImageView shuffleButton;
    private final Drawable shuffleOffButtonDrawable;
    private final String shuffleOffContentDescription;
    private final Drawable shuffleOnButtonDrawable;
    private final String shuffleOnContentDescription;
    private final TimeBar timeBar;
    private int timeBarMinUpdateIntervalMs;
    private final Runnable updateProgressAction;
    private final CopyOnWriteArrayList<VisibilityListener> visibilityListeners;
    private final View vrButton;
    private final Timeline.Window window;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class ComponentListener implements Player.Listener, TimeBar.OnScrubListener, View.OnClickListener {
        private ComponentListener() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Player player = LegacyPlayerControlView.this.player;
            if (player == null) {
                return;
            }
            if (LegacyPlayerControlView.this.nextButton == view) {
                player.seekToNext();
                return;
            }
            if (LegacyPlayerControlView.this.previousButton == view) {
                player.seekToPrevious();
                return;
            }
            if (LegacyPlayerControlView.this.fastForwardButton == view) {
                if (player.getPlaybackState() != 4) {
                    player.seekForward();
                    return;
                }
                return;
            }
            if (LegacyPlayerControlView.this.rewindButton == view) {
                player.seekBack();
                return;
            }
            if (LegacyPlayerControlView.this.playButton == view) {
                Util.handlePlayButtonAction(player);
                return;
            }
            if (LegacyPlayerControlView.this.pauseButton == view) {
                Util.handlePauseButtonAction(player);
            } else if (LegacyPlayerControlView.this.repeatToggleButton == view) {
                player.setRepeatMode(RepeatModeUtil.getNextRepeatMode(player.getRepeatMode(), LegacyPlayerControlView.this.repeatToggleModes));
            } else if (LegacyPlayerControlView.this.shuffleButton == view) {
                player.setShuffleModeEnabled(!player.getShuffleModeEnabled());
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public void onEvents(Player player, Player.Events events) {
            if (events.containsAny(4, 5)) {
                LegacyPlayerControlView.this.updatePlayPauseButton();
            }
            if (events.containsAny(4, 5, 7)) {
                LegacyPlayerControlView.this.updateProgress();
            }
            if (events.contains(8)) {
                LegacyPlayerControlView.this.updateRepeatModeButton();
            }
            if (events.contains(9)) {
                LegacyPlayerControlView.this.updateShuffleButton();
            }
            if (events.containsAny(8, 9, 11, 0, 13)) {
                LegacyPlayerControlView.this.updateNavigation();
            }
            if (events.containsAny(11, 0)) {
                LegacyPlayerControlView.this.updateTimeline();
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public void onScrubMove(TimeBar timeBar, long j) {
            if (LegacyPlayerControlView.this.positionView != null) {
                LegacyPlayerControlView.this.positionView.setText(Util.getStringForTime(LegacyPlayerControlView.this.formatBuilder, LegacyPlayerControlView.this.formatter, j));
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public void onScrubStart(TimeBar timeBar, long j) {
            LegacyPlayerControlView.this.scrubbing = true;
            if (LegacyPlayerControlView.this.positionView != null) {
                LegacyPlayerControlView.this.positionView.setText(Util.getStringForTime(LegacyPlayerControlView.this.formatBuilder, LegacyPlayerControlView.this.formatter, j));
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public void onScrubStop(TimeBar timeBar, long j, boolean z) {
            LegacyPlayerControlView.this.scrubbing = false;
            if (z || LegacyPlayerControlView.this.player == null) {
                return;
            }
            LegacyPlayerControlView legacyPlayerControlView = LegacyPlayerControlView.this;
            legacyPlayerControlView.seekToTimeBarPosition(legacyPlayerControlView.player, j);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onCues(List list) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onRenderedFirstFrame() {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onAudioAttributesChanged(AudioAttributes audioAttributes) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onAudioSessionIdChanged(int i) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onAvailableCommandsChanged(Player.Commands commands) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onCues(CueGroup cueGroup) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onIsLoadingChanged(boolean z) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onIsPlayingChanged(boolean z) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onLoadingChanged(boolean z) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onMaxSeekToPreviousPositionChanged(long j) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onMetadata(Metadata metadata) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlaybackStateChanged(int i) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlaybackSuppressionReasonChanged(int i) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlayerError(PlaybackException playbackException) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlayerErrorChanged(PlaybackException playbackException) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPositionDiscontinuity(int i) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onRepeatModeChanged(int i) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onSeekBackIncrementChanged(long j) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onSeekForwardIncrementChanged(long j) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onShuffleModeEnabledChanged(boolean z) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onSkipSilenceEnabledChanged(boolean z) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onTracksChanged(Tracks tracks) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onVideoSizeChanged(VideoSize videoSize) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onVolumeChanged(float f) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onDeviceVolumeChanged(int i, boolean z) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onMediaItemTransition(MediaItem mediaItem, int i) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlayWhenReadyChanged(boolean z, int i) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlayerStateChanged(boolean z, int i) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onSurfaceSizeChanged(int i, int i2) {
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onTimelineChanged(Timeline timeline, int i) {
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface ProgressUpdateListener {
        void onProgressUpdate(long j, long j2);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface VisibilityListener {
        void onVisibilityChange(int i);
    }

    static {
        MediaLibraryInfo.registerModule("media3.ui");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LegacyPlayerControlView(android.content.Context r7, android.util.AttributeSet r8, int r9, android.util.AttributeSet r10) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.LegacyPlayerControlView.<init>(android.content.Context, android.util.AttributeSet, int, android.util.AttributeSet):void");
    }

    private static boolean canShowMultiWindowTimeBar(Timeline timeline, Timeline.Window window) {
        if (timeline.getWindowCount() > 100) {
            return false;
        }
        int windowCount = timeline.getWindowCount();
        for (int i = 0; i < windowCount; i++) {
            if (timeline.getWindow(i, window).durationUs == C.TIME_UNSET) {
                return false;
            }
        }
        return true;
    }

    private static int getRepeatToggleModes(TypedArray typedArray, int i) {
        return typedArray.getInt(R.styleable.LegacyPlayerControlView_repeat_toggle_modes, i);
    }

    private void hideAfterTimeout() {
        removeCallbacks(this.hideAction);
        if (this.showTimeoutMs <= 0) {
            this.hideAtMs = C.TIME_UNSET;
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        int i = this.showTimeoutMs;
        this.hideAtMs = uptimeMillis + i;
        if (this.isAttachedToWindow) {
            postDelayed(this.hideAction, i);
        }
    }

    private static boolean isHandledMediaKey(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    private void requestPlayPauseAccessibilityFocus() {
        View view;
        View view2;
        boolean shouldShowPlayButton = Util.shouldShowPlayButton(this.player, this.showPlayButtonIfSuppressed);
        if (shouldShowPlayButton && (view2 = this.playButton) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (shouldShowPlayButton || (view = this.pauseButton) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    private void requestPlayPauseFocus() {
        View view;
        View view2;
        boolean shouldShowPlayButton = Util.shouldShowPlayButton(this.player, this.showPlayButtonIfSuppressed);
        if (shouldShowPlayButton && (view2 = this.playButton) != null) {
            view2.requestFocus();
        } else {
            if (shouldShowPlayButton || (view = this.pauseButton) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    private void seekTo(Player player, int i, long j) {
        player.seekTo(i, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekToTimeBarPosition(Player player, long j) {
        int currentMediaItemIndex;
        Timeline currentTimeline = player.getCurrentTimeline();
        if (this.multiWindowTimeBar && !currentTimeline.isEmpty()) {
            int windowCount = currentTimeline.getWindowCount();
            currentMediaItemIndex = 0;
            while (true) {
                long durationMs = currentTimeline.getWindow(currentMediaItemIndex, this.window).getDurationMs();
                if (j < durationMs) {
                    break;
                }
                if (currentMediaItemIndex == windowCount - 1) {
                    j = durationMs;
                    break;
                } else {
                    j -= durationMs;
                    currentMediaItemIndex++;
                }
            }
        } else {
            currentMediaItemIndex = player.getCurrentMediaItemIndex();
        }
        seekTo(player, currentMediaItemIndex, j);
        updateProgress();
    }

    private void updateAll() {
        updatePlayPauseButton();
        updateNavigation();
        updateRepeatModeButton();
        updateShuffleButton();
        updateTimeline();
    }

    private void updateButton(boolean z, boolean z2, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.buttonAlphaEnabled : this.buttonAlphaDisabled);
        view.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateNavigation() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (isVisible() && this.isAttachedToWindow) {
            Player player = this.player;
            if (player != null) {
                z = player.isCommandAvailable(5);
                z3 = player.isCommandAvailable(7);
                z4 = player.isCommandAvailable(11);
                z5 = player.isCommandAvailable(12);
                z2 = player.isCommandAvailable(9);
            } else {
                z = false;
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
            }
            updateButton(this.showPreviousButton, z3, this.previousButton);
            updateButton(this.showRewindButton, z4, this.rewindButton);
            updateButton(this.showFastForwardButton, z5, this.fastForwardButton);
            updateButton(this.showNextButton, z2, this.nextButton);
            TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setEnabled(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlayPauseButton() {
        boolean z;
        boolean z2;
        if (isVisible() && this.isAttachedToWindow) {
            boolean shouldShowPlayButton = Util.shouldShowPlayButton(this.player, this.showPlayButtonIfSuppressed);
            View view = this.playButton;
            if (view != null) {
                z = !shouldShowPlayButton && view.isFocused();
                z2 = !shouldShowPlayButton && this.playButton.isAccessibilityFocused();
                this.playButton.setVisibility(shouldShowPlayButton ? 0 : 8);
            } else {
                z = false;
                z2 = false;
            }
            View view2 = this.pauseButton;
            if (view2 != null) {
                z |= shouldShowPlayButton && view2.isFocused();
                z2 |= shouldShowPlayButton && this.pauseButton.isAccessibilityFocused();
                this.pauseButton.setVisibility(shouldShowPlayButton ? 8 : 0);
            }
            if (z) {
                requestPlayPauseFocus();
            }
            if (z2) {
                requestPlayPauseAccessibilityFocus();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateProgress() {
        long j;
        long j2;
        if (isVisible() && this.isAttachedToWindow) {
            Player player = this.player;
            if (player != null) {
                j = player.getContentPosition() + this.currentWindowOffset;
                j2 = player.getContentBufferedPosition() + this.currentWindowOffset;
            } else {
                j = 0;
                j2 = 0;
            }
            boolean z = j != this.currentPosition;
            boolean z2 = j2 != this.currentBufferedPosition;
            this.currentPosition = j;
            this.currentBufferedPosition = j2;
            TextView textView = this.positionView;
            if (textView != null && !this.scrubbing && z) {
                textView.setText(Util.getStringForTime(this.formatBuilder, this.formatter, j));
            }
            TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setPosition(j);
                this.timeBar.setBufferedPosition(j2);
            }
            ProgressUpdateListener progressUpdateListener = this.progressUpdateListener;
            if (progressUpdateListener != null && (z || z2)) {
                progressUpdateListener.onProgressUpdate(j, j2);
            }
            removeCallbacks(this.updateProgressAction);
            int playbackState = player == null ? 1 : player.getPlaybackState();
            if (player == null || !player.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.updateProgressAction, 1000L);
                return;
            }
            TimeBar timeBar2 = this.timeBar;
            long min = Math.min(timeBar2 != null ? timeBar2.getPreferredUpdateDelay() : 1000L, 1000 - (j % 1000));
            float f = player.getPlaybackParameters().speed;
            postDelayed(this.updateProgressAction, Util.constrainValue(f > 0.0f ? (long) (min / f) : 1000L, this.timeBarMinUpdateIntervalMs, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRepeatModeButton() {
        ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.repeatToggleButton) != null) {
            if (this.repeatToggleModes == 0) {
                updateButton(false, false, imageView);
                return;
            }
            Player player = this.player;
            if (player == null) {
                updateButton(true, false, imageView);
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
                return;
            }
            updateButton(true, true, imageView);
            int repeatMode = player.getRepeatMode();
            if (repeatMode == 0) {
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
            } else if (repeatMode == 1) {
                this.repeatToggleButton.setImageDrawable(this.repeatOneButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOneButtonContentDescription);
            } else if (repeatMode == 2) {
                this.repeatToggleButton.setImageDrawable(this.repeatAllButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatAllButtonContentDescription);
            }
            this.repeatToggleButton.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateShuffleButton() {
        ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.shuffleButton) != null) {
            Player player = this.player;
            if (!this.showShuffleButton) {
                updateButton(false, false, imageView);
                return;
            }
            if (player == null) {
                updateButton(true, false, imageView);
                this.shuffleButton.setImageDrawable(this.shuffleOffButtonDrawable);
                this.shuffleButton.setContentDescription(this.shuffleOffContentDescription);
            } else {
                updateButton(true, true, imageView);
                this.shuffleButton.setImageDrawable(player.getShuffleModeEnabled() ? this.shuffleOnButtonDrawable : this.shuffleOffButtonDrawable);
                this.shuffleButton.setContentDescription(player.getShuffleModeEnabled() ? this.shuffleOnContentDescription : this.shuffleOffContentDescription);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTimeline() {
        int i;
        Timeline.Window window;
        long j;
        Player player = this.player;
        if (player == null) {
            return;
        }
        boolean z = true;
        this.multiWindowTimeBar = this.showMultiWindowTimeBar && canShowMultiWindowTimeBar(player.getCurrentTimeline(), this.window);
        long j2 = 0;
        this.currentWindowOffset = 0L;
        Timeline currentTimeline = player.getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            i = 0;
        } else {
            int currentMediaItemIndex = player.getCurrentMediaItemIndex();
            boolean z2 = this.multiWindowTimeBar;
            int i2 = z2 ? 0 : currentMediaItemIndex;
            int windowCount = z2 ? currentTimeline.getWindowCount() - 1 : currentMediaItemIndex;
            i = 0;
            long j3 = 0;
            while (true) {
                if (i2 > windowCount) {
                    break;
                }
                if (i2 == currentMediaItemIndex) {
                    this.currentWindowOffset = Util.usToMs(j3);
                }
                currentTimeline.getWindow(i2, this.window);
                Timeline.Window window2 = this.window;
                long j4 = window2.durationUs;
                long j5 = C.TIME_UNSET;
                if (j4 == C.TIME_UNSET) {
                    sp0.z(this.multiWindowTimeBar ^ z);
                    break;
                }
                int i3 = window2.firstPeriodIndex;
                while (true) {
                    window = this.window;
                    if (i3 <= window.lastPeriodIndex) {
                        currentTimeline.getPeriod(i3, this.period);
                        int removedAdGroupCount = this.period.getRemovedAdGroupCount();
                        int adGroupCount = this.period.getAdGroupCount();
                        while (removedAdGroupCount < adGroupCount) {
                            long adGroupTimeUs = this.period.getAdGroupTimeUs(removedAdGroupCount);
                            if (adGroupTimeUs == Long.MIN_VALUE) {
                                j = j2;
                                long j6 = this.period.durationUs;
                                if (j6 == j5) {
                                    removedAdGroupCount++;
                                    j2 = j;
                                    j5 = C.TIME_UNSET;
                                } else {
                                    adGroupTimeUs = j6;
                                }
                            } else {
                                j = j2;
                            }
                            long positionInWindowUs = this.period.getPositionInWindowUs() + adGroupTimeUs;
                            if (positionInWindowUs >= j) {
                                long[] jArr = this.adGroupTimesMs;
                                if (i == jArr.length) {
                                    int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                    this.adGroupTimesMs = Arrays.copyOf(jArr, length);
                                    this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, length);
                                }
                                this.adGroupTimesMs[i] = Util.usToMs(positionInWindowUs + j3);
                                this.playedAdGroups[i] = this.period.hasPlayedAdGroup(removedAdGroupCount);
                                i++;
                            }
                            removedAdGroupCount++;
                            j2 = j;
                            j5 = C.TIME_UNSET;
                        }
                        i3++;
                        j5 = C.TIME_UNSET;
                    }
                }
                j3 += window.durationUs;
                i2++;
                j2 = j2;
                z = true;
            }
            j2 = j3;
        }
        long usToMs = Util.usToMs(j2);
        TextView textView = this.durationView;
        if (textView != null) {
            textView.setText(Util.getStringForTime(this.formatBuilder, this.formatter, usToMs));
        }
        TimeBar timeBar = this.timeBar;
        if (timeBar != null) {
            timeBar.setDuration(usToMs);
            int length2 = this.extraAdGroupTimesMs.length;
            int i4 = i + length2;
            long[] jArr2 = this.adGroupTimesMs;
            if (i4 > jArr2.length) {
                this.adGroupTimesMs = Arrays.copyOf(jArr2, i4);
                this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, i4);
            }
            System.arraycopy(this.extraAdGroupTimesMs, 0, this.adGroupTimesMs, i, length2);
            System.arraycopy(this.extraPlayedAdGroups, 0, this.playedAdGroups, i, length2);
            this.timeBar.setAdGroupTimesMs(this.adGroupTimesMs, this.playedAdGroups, i4);
        }
        updateProgress();
    }

    public void addVisibilityListener(VisibilityListener visibilityListener) {
        visibilityListener.getClass();
        this.visibilityListeners.add(visibilityListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Player player = this.player;
        if (player == null || !isHandledMediaKey(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (player.getPlaybackState() == 4) {
                return true;
            }
            player.seekForward();
            return true;
        }
        if (keyCode == 89) {
            player.seekBack();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            Util.handlePlayPauseButtonAction(player, this.showPlayButtonIfSuppressed);
            return true;
        }
        if (keyCode == 87) {
            player.seekToNext();
            return true;
        }
        if (keyCode == 88) {
            player.seekToPrevious();
            return true;
        }
        if (keyCode == 126) {
            Util.handlePlayButtonAction(player);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        Util.handlePauseButtonAction(player);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.hideAction);
        } else if (motionEvent.getAction() == 1) {
            hideAfterTimeout();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Player getPlayer() {
        return this.player;
    }

    public boolean getShowShuffleButton() {
        return this.showShuffleButton;
    }

    public int getShowTimeoutMs() {
        return this.showTimeoutMs;
    }

    public boolean getShowVrButton() {
        View view = this.vrButton;
        return view != null && view.getVisibility() == 0;
    }

    public void hide() {
        if (isVisible()) {
            setVisibility(8);
            Iterator<VisibilityListener> it = this.visibilityListeners.iterator();
            while (it.hasNext()) {
                it.next().onVisibilityChange(getVisibility());
            }
            removeCallbacks(this.updateProgressAction);
            removeCallbacks(this.hideAction);
            this.hideAtMs = C.TIME_UNSET;
        }
    }

    public boolean isVisible() {
        return getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttachedToWindow = true;
        long j = this.hideAtMs;
        if (j != C.TIME_UNSET) {
            long uptimeMillis = j - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                hide();
            } else {
                postDelayed(this.hideAction, uptimeMillis);
            }
        } else if (isVisible()) {
            hideAfterTimeout();
        }
        updateAll();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        removeCallbacks(this.updateProgressAction);
        removeCallbacks(this.hideAction);
    }

    public void removeVisibilityListener(VisibilityListener visibilityListener) {
        this.visibilityListeners.remove(visibilityListener);
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        if (jArr == null) {
            this.extraAdGroupTimesMs = new long[0];
            this.extraPlayedAdGroups = new boolean[0];
        } else {
            zArr.getClass();
            sp0.o(jArr.length == zArr.length);
            this.extraAdGroupTimesMs = jArr;
            this.extraPlayedAdGroups = zArr;
        }
        updateTimeline();
    }

    public void setPlayer(Player player) {
        sp0.z(Looper.myLooper() == Looper.getMainLooper());
        sp0.o(player == null || player.getApplicationLooper() == Looper.getMainLooper());
        Player player2 = this.player;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.removeListener(this.componentListener);
        }
        this.player = player;
        if (player != null) {
            player.addListener(this.componentListener);
        }
        updateAll();
    }

    public void setProgressUpdateListener(ProgressUpdateListener progressUpdateListener) {
        this.progressUpdateListener = progressUpdateListener;
    }

    public void setRepeatToggleModes(int i) {
        this.repeatToggleModes = i;
        Player player = this.player;
        if (player != null) {
            int repeatMode = player.getRepeatMode();
            if (i == 0 && repeatMode != 0) {
                this.player.setRepeatMode(0);
            } else if (i == 1 && repeatMode == 2) {
                this.player.setRepeatMode(1);
            } else if (i == 2 && repeatMode == 1) {
                this.player.setRepeatMode(2);
            }
        }
        updateRepeatModeButton();
    }

    public void setShowFastForwardButton(boolean z) {
        this.showFastForwardButton = z;
        updateNavigation();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.showMultiWindowTimeBar = z;
        updateTimeline();
    }

    public void setShowNextButton(boolean z) {
        this.showNextButton = z;
        updateNavigation();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.showPlayButtonIfSuppressed = z;
        updatePlayPauseButton();
    }

    public void setShowPreviousButton(boolean z) {
        this.showPreviousButton = z;
        updateNavigation();
    }

    public void setShowRewindButton(boolean z) {
        this.showRewindButton = z;
        updateNavigation();
    }

    public void setShowShuffleButton(boolean z) {
        this.showShuffleButton = z;
        updateShuffleButton();
    }

    public void setShowTimeoutMs(int i) {
        this.showTimeoutMs = i;
        if (isVisible()) {
            hideAfterTimeout();
        }
    }

    public void setShowVrButton(boolean z) {
        View view = this.vrButton;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.timeBarMinUpdateIntervalMs = Util.constrainValue(i, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.vrButton;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            updateButton(getShowVrButton(), onClickListener != null, this.vrButton);
        }
    }

    public void show() {
        if (!isVisible()) {
            setVisibility(0);
            Iterator<VisibilityListener> it = this.visibilityListeners.iterator();
            while (it.hasNext()) {
                it.next().onVisibilityChange(getVisibility());
            }
            updateAll();
            requestPlayPauseFocus();
            requestPlayPauseAccessibilityFocus();
        }
        hideAfterTimeout();
    }

    public int getRepeatToggleModes() {
        return this.repeatToggleModes;
    }

    public LegacyPlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LegacyPlayerControlView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public LegacyPlayerControlView(Context context) {
        this(context, null);
    }
}

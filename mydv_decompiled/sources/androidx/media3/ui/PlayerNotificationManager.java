package androidx.media3.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.core.graphics.drawable.IconCompat;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaItem;
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
import androidx.media3.common.util.NotificationUtil;
import androidx.media3.common.util.Util;
import defpackage.db3;
import defpackage.eb3;
import defpackage.ib3;
import defpackage.lc3;
import defpackage.mc3;
import defpackage.nc3;
import defpackage.of0;
import defpackage.qc3;
import defpackage.rc3;
import defpackage.s83;
import defpackage.sp0;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class PlayerNotificationManager {
    private static final String ACTION_DISMISS = "androidx.media3.ui.notification.dismiss";
    public static final String ACTION_FAST_FORWARD = "androidx.media3.ui.notification.ffwd";
    public static final String ACTION_NEXT = "androidx.media3.ui.notification.next";
    public static final String ACTION_PAUSE = "androidx.media3.ui.notification.pause";
    public static final String ACTION_PLAY = "androidx.media3.ui.notification.play";
    public static final String ACTION_PREVIOUS = "androidx.media3.ui.notification.prev";
    public static final String ACTION_REWIND = "androidx.media3.ui.notification.rewind";
    public static final String ACTION_STOP = "androidx.media3.ui.notification.stop";
    public static final String EXTRA_INSTANCE_ID = "INSTANCE_ID";
    private static final int MSG_START_OR_UPDATE_NOTIFICATION = 1;
    private static final int MSG_UPDATE_NOTIFICATION_BITMAP = 2;
    private static int instanceIdCounter;
    private int badgeIconType;
    private ib3 builder;
    private List<eb3> builderActions;
    private final String channelId;
    private int color;
    private boolean colorized;
    private final Context context;
    private int currentNotificationTag;
    private final CustomActionReceiver customActionReceiver;
    private final Map<String, eb3> customActions;
    private int defaults;
    private final PendingIntent dismissPendingIntent;
    private String groupKey;
    private final int instanceId;
    private final IntentFilter intentFilter;
    private boolean isNotificationStarted;
    private final Handler mainHandler;
    private final MediaDescriptionAdapter mediaDescriptionAdapter;
    private MediaSession.Token mediaSessionToken;
    private final NotificationBroadcastReceiver notificationBroadcastReceiver;
    private final int notificationId;
    private final NotificationListener notificationListener;
    private final rc3 notificationManager;
    private final Map<String, eb3> playbackActions;
    private Player player;
    private final Player.Listener playerListener;
    private int priority;
    private boolean showPlayButtonIfSuppressed;
    private int smallIconResourceId;
    private boolean useChronometer;
    private boolean useFastForwardAction;
    private boolean useFastForwardActionInCompactView;
    private boolean useNextAction;
    private boolean useNextActionInCompactView;
    private boolean usePlayPauseActions;
    private boolean usePreviousAction;
    private boolean usePreviousActionInCompactView;
    private boolean useRewindAction;
    private boolean useRewindActionInCompactView;
    private boolean useStopAction;
    private int visibility;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class BitmapCallback {
        private final int notificationTag;

        private BitmapCallback(int i) {
            this.notificationTag = i;
        }

        public void onBitmap(Bitmap bitmap) {
            if (bitmap != null) {
                PlayerNotificationManager.this.postUpdateNotificationBitmap(bitmap, this.notificationTag);
            }
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface CustomActionReceiver {
        Map<String, eb3> createCustomActions(Context context, int i);

        List<String> getCustomActions(Player player);

        void onCustomAction(Player player, String str, Intent intent);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface MediaDescriptionAdapter {
        PendingIntent createCurrentContentIntent(Player player);

        CharSequence getCurrentContentText(Player player);

        CharSequence getCurrentContentTitle(Player player);

        Bitmap getCurrentLargeIcon(Player player, BitmapCallback bitmapCallback);

        CharSequence getCurrentSubText(Player player);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class MediaStyle extends lc3 {
        private final int[] actionsToShowInCompact;
        private final MediaSession.Token token;

        public MediaStyle(MediaSession.Token token, int[] iArr) {
            this.token = token;
            this.actionsToShowInCompact = iArr;
        }

        @Override // defpackage.lc3
        public void apply(db3 db3Var) {
            Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
            mediaStyle.setShowActionsInCompactView(this.actionsToShowInCompact);
            MediaSession.Token token = this.token;
            if (token != null) {
                mediaStyle.setMediaSession(token);
            }
            ((Notification.Builder) ((mc3) db3Var).b).setStyle(mediaStyle);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public class NotificationBroadcastReceiver extends BroadcastReceiver {
        private NotificationBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Player player = PlayerNotificationManager.this.player;
            if (player != null && PlayerNotificationManager.this.isNotificationStarted && intent.getIntExtra(PlayerNotificationManager.EXTRA_INSTANCE_ID, PlayerNotificationManager.this.instanceId) == PlayerNotificationManager.this.instanceId) {
                String action = intent.getAction();
                if (PlayerNotificationManager.ACTION_PLAY.equals(action)) {
                    Util.handlePlayButtonAction(player);
                    return;
                }
                if (PlayerNotificationManager.ACTION_PAUSE.equals(action)) {
                    Util.handlePauseButtonAction(player);
                    return;
                }
                if (PlayerNotificationManager.ACTION_PREVIOUS.equals(action)) {
                    if (player.isCommandAvailable(7)) {
                        player.seekToPrevious();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_REWIND.equals(action)) {
                    if (player.isCommandAvailable(11)) {
                        player.seekBack();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_FAST_FORWARD.equals(action)) {
                    if (player.isCommandAvailable(12)) {
                        player.seekForward();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_NEXT.equals(action)) {
                    if (player.isCommandAvailable(9)) {
                        player.seekToNext();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_STOP.equals(action)) {
                    if (player.isCommandAvailable(3)) {
                        player.stop();
                    }
                    if (player.isCommandAvailable(20)) {
                        player.clearMediaItems();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_DISMISS.equals(action)) {
                    PlayerNotificationManager.this.stopNotification(true);
                } else {
                    if (action == null || PlayerNotificationManager.this.customActionReceiver == null || !PlayerNotificationManager.this.customActions.containsKey(action)) {
                        return;
                    }
                    PlayerNotificationManager.this.customActionReceiver.onCustomAction(player, action, intent);
                }
            }
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface NotificationListener {
        void onNotificationCancelled(int i, boolean z);

        void onNotificationPosted(int i, Notification notification, boolean z);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public class PlayerListener implements Player.Listener {
        private PlayerListener() {
        }

        @Override // androidx.media3.common.Player.Listener
        public void onEvents(Player player, Player.Events events) {
            if (events.containsAny(4, 5, 7, 0, 12, 11, 8, 9, 14)) {
                PlayerNotificationManager.this.postStartOrUpdateNotification();
            }
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
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Priority {
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Visibility {
    }

    public PlayerNotificationManager(Context context, String str, int i, MediaDescriptionAdapter mediaDescriptionAdapter, NotificationListener notificationListener, CustomActionReceiver customActionReceiver, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, String str2) {
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.channelId = str;
        this.notificationId = i;
        this.mediaDescriptionAdapter = mediaDescriptionAdapter;
        this.notificationListener = notificationListener;
        this.customActionReceiver = customActionReceiver;
        this.smallIconResourceId = i2;
        this.groupKey = str2;
        int i10 = instanceIdCounter;
        instanceIdCounter = i10 + 1;
        this.instanceId = i10;
        this.mainHandler = Util.createHandler(Looper.getMainLooper(), new of0(this, (byte) 3));
        this.notificationManager = new rc3(applicationContext);
        this.playerListener = new PlayerListener();
        this.notificationBroadcastReceiver = new NotificationBroadcastReceiver();
        this.intentFilter = new IntentFilter();
        this.usePreviousAction = true;
        this.useNextAction = true;
        this.usePlayPauseActions = true;
        this.showPlayButtonIfSuppressed = true;
        this.useRewindAction = true;
        this.useFastForwardAction = true;
        this.colorized = true;
        this.useChronometer = true;
        this.color = 0;
        this.defaults = 0;
        this.priority = -1;
        this.badgeIconType = 1;
        this.visibility = 1;
        Map<String, eb3> createPlaybackActions = createPlaybackActions(applicationContext, i10, i3, i4, i5, i6, i7, i8, i9);
        this.playbackActions = createPlaybackActions;
        Iterator<String> it = createPlaybackActions.keySet().iterator();
        while (it.hasNext()) {
            this.intentFilter.addAction(it.next());
        }
        Map<String, eb3> createCustomActions = customActionReceiver != null ? customActionReceiver.createCustomActions(applicationContext, this.instanceId) : Collections.EMPTY_MAP;
        this.customActions = createCustomActions;
        Iterator<String> it2 = createCustomActions.keySet().iterator();
        while (it2.hasNext()) {
            this.intentFilter.addAction(it2.next());
        }
        this.dismissPendingIntent = createBroadcastIntent(ACTION_DISMISS, applicationContext, this.instanceId);
        this.intentFilter.addAction(ACTION_DISMISS);
    }

    private static PendingIntent createBroadcastIntent(String str, Context context, int i) {
        Intent intent = new Intent(str).setPackage(context.getPackageName());
        intent.putExtra(EXTRA_INSTANCE_ID, i);
        return PendingIntent.getBroadcast(context, i, intent, 201326592);
    }

    private static Map<String, eb3> createPlaybackActions(Context context, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        HashMap hashMap = new HashMap();
        hashMap.put(ACTION_PLAY, new eb3(i2, context.getString(R.string.exo_controls_play_description), createBroadcastIntent(ACTION_PLAY, context, i)));
        hashMap.put(ACTION_PAUSE, new eb3(i3, context.getString(R.string.exo_controls_pause_description), createBroadcastIntent(ACTION_PAUSE, context, i)));
        hashMap.put(ACTION_STOP, new eb3(i4, context.getString(R.string.exo_controls_stop_description), createBroadcastIntent(ACTION_STOP, context, i)));
        hashMap.put(ACTION_REWIND, new eb3(i5, context.getString(R.string.exo_controls_rewind_description), createBroadcastIntent(ACTION_REWIND, context, i)));
        hashMap.put(ACTION_FAST_FORWARD, new eb3(i6, context.getString(R.string.exo_controls_fastforward_description), createBroadcastIntent(ACTION_FAST_FORWARD, context, i)));
        hashMap.put(ACTION_PREVIOUS, new eb3(i7, context.getString(R.string.exo_controls_previous_description), createBroadcastIntent(ACTION_PREVIOUS, context, i)));
        hashMap.put(ACTION_NEXT, new eb3(i8, context.getString(R.string.exo_controls_next_description), createBroadcastIntent(ACTION_NEXT, context, i)));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            Player player = this.player;
            if (player != null) {
                startOrUpdateNotification(player, null);
            }
        } else {
            if (i != 2) {
                return false;
            }
            Player player2 = this.player;
            if (player2 != null && this.isNotificationStarted && this.currentNotificationTag == message.arg1) {
                startOrUpdateNotification(player2, (Bitmap) message.obj);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postStartOrUpdateNotification() {
        if (this.mainHandler.hasMessages(1)) {
            return;
        }
        this.mainHandler.sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postUpdateNotificationBitmap(Bitmap bitmap, int i) {
        this.mainHandler.obtainMessage(2, i, -1, bitmap).sendToTarget();
    }

    private static void setLargeIcon(ib3 ib3Var, Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            Context context = ib3Var.a;
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = context.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(com.github.mytv.dv.R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(com.github.mytv.dv.R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.b = bitmap;
            iconCompat = iconCompat2;
        }
        ib3Var.h = iconCompat;
    }

    private void startOrUpdateNotification(Player player, Bitmap bitmap) {
        boolean ongoing = getOngoing(player);
        ib3 createNotification = createNotification(player, this.builder, ongoing, bitmap);
        this.builder = createNotification;
        if (createNotification == null) {
            stopNotification(false);
            return;
        }
        Notification a = createNotification.a();
        rc3 rc3Var = this.notificationManager;
        int i = this.notificationId;
        rc3Var.getClass();
        Bundle bundle = a.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            rc3Var.b.notify(null, i, a);
        } else {
            nc3 nc3Var = new nc3(rc3Var.a.getPackageName(), i, a);
            synchronized (rc3.f) {
                try {
                    qc3 qc3Var = rc3.g;
                    if (qc3Var == null) {
                        qc3Var = new qc3(rc3Var.a.getApplicationContext());
                        rc3.g = qc3Var;
                    }
                    qc3Var.J.obtainMessage(0, nc3Var).sendToTarget();
                } catch (Throwable th) {
                    throw th;
                }
            }
            rc3Var.b.cancel(null, i);
        }
        if (!this.isNotificationStarted) {
            Util.registerReceiverNotExported(this.context, this.notificationBroadcastReceiver, this.intentFilter);
        }
        NotificationListener notificationListener = this.notificationListener;
        if (notificationListener != null) {
            notificationListener.onNotificationPosted(this.notificationId, a, ongoing || !this.isNotificationStarted);
        }
        this.isNotificationStarted = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopNotification(boolean z) {
        if (this.isNotificationStarted) {
            this.isNotificationStarted = false;
            this.mainHandler.removeMessages(1);
            rc3 rc3Var = this.notificationManager;
            rc3Var.b.cancel(null, this.notificationId);
            this.context.unregisterReceiver(this.notificationBroadcastReceiver);
            NotificationListener notificationListener = this.notificationListener;
            if (notificationListener != null) {
                notificationListener.onNotificationCancelled(this.notificationId, z);
            }
        }
    }

    public ib3 createNotification(Player player, ib3 ib3Var, boolean z, Bitmap bitmap) {
        if (player.getPlaybackState() == 1 && player.isCommandAvailable(17) && player.getCurrentTimeline().isEmpty()) {
            this.builderActions = null;
            return null;
        }
        List<String> actions = getActions(player);
        ArrayList arrayList = new ArrayList(actions.size());
        for (int i = 0; i < actions.size(); i++) {
            String str = actions.get(i);
            eb3 eb3Var = this.playbackActions.containsKey(str) ? this.playbackActions.get(str) : this.customActions.get(str);
            if (eb3Var != null) {
                arrayList.add(eb3Var);
            }
        }
        if (ib3Var == null || !arrayList.equals(this.builderActions)) {
            Context context = this.context;
            String str2 = this.channelId;
            ib3Var = new ib3();
            ib3Var.b = new ArrayList();
            ib3Var.c = new ArrayList();
            ib3Var.d = new ArrayList();
            ib3Var.j = true;
            ib3Var.r = 0;
            ib3Var.s = 0;
            ib3Var.u = 0;
            Notification notification = new Notification();
            ib3Var.w = notification;
            ib3Var.a = context;
            ib3Var.t = str2;
            notification.when = System.currentTimeMillis();
            notification.audioStreamType = -1;
            ib3Var.i = 0;
            ib3Var.x = new ArrayList();
            ib3Var.v = true;
            this.builderActions = arrayList;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                eb3 eb3Var2 = (eb3) arrayList.get(i2);
                if (eb3Var2 != null) {
                    ib3Var.b.add(eb3Var2);
                }
            }
        }
        Notification notification2 = ib3Var.w;
        MediaStyle mediaStyle = new MediaStyle(this.mediaSessionToken, getActionIndicesForCompactView(actions, player));
        if (ib3Var.l != mediaStyle) {
            ib3Var.l = mediaStyle;
            mediaStyle.setBuilder(ib3Var);
        }
        notification2.deleteIntent = this.dismissPendingIntent;
        ib3Var.u = this.badgeIconType;
        if (z) {
            notification2.flags |= 2;
        } else {
            notification2.flags &= -3;
        }
        ib3Var.r = this.color;
        ib3Var.o = this.colorized;
        ib3Var.p = true;
        notification2.icon = this.smallIconResourceId;
        ib3Var.s = this.visibility;
        ib3Var.i = this.priority;
        int i3 = this.defaults;
        notification2.defaults = i3;
        if ((i3 & 4) != 0) {
            notification2.flags |= 1;
        }
        if (this.useChronometer && player.isCommandAvailable(16) && player.isPlaying() && !player.isPlayingAd() && !player.isCurrentMediaItemDynamic() && player.getPlaybackParameters().speed == 1.0f) {
            notification2.when = System.currentTimeMillis() - player.getContentPosition();
            ib3Var.j = true;
            ib3Var.k = true;
        } else {
            ib3Var.j = false;
            ib3Var.k = false;
        }
        ib3Var.e = ib3.b(this.mediaDescriptionAdapter.getCurrentContentTitle(player));
        ib3Var.f = ib3.b(this.mediaDescriptionAdapter.getCurrentContentText(player));
        ib3Var.m = ib3.b(this.mediaDescriptionAdapter.getCurrentSubText(player));
        if (bitmap == null) {
            MediaDescriptionAdapter mediaDescriptionAdapter = this.mediaDescriptionAdapter;
            int i4 = this.currentNotificationTag + 1;
            this.currentNotificationTag = i4;
            bitmap = mediaDescriptionAdapter.getCurrentLargeIcon(player, new BitmapCallback(i4));
        }
        setLargeIcon(ib3Var, bitmap);
        ib3Var.g = this.mediaDescriptionAdapter.createCurrentContentIntent(player);
        String str3 = this.groupKey;
        if (str3 != null) {
            ib3Var.n = str3;
        }
        notification2.flags |= 8;
        return ib3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int[] getActionIndicesForCompactView(java.util.List<java.lang.String> r7, androidx.media3.common.Player r8) {
        /*
            r6 = this;
            java.lang.String r0 = "androidx.media3.ui.notification.pause"
            int r0 = r7.indexOf(r0)
            java.lang.String r1 = "androidx.media3.ui.notification.play"
            int r1 = r7.indexOf(r1)
            boolean r2 = r6.usePreviousActionInCompactView
            r3 = -1
            if (r2 == 0) goto L18
            java.lang.String r2 = "androidx.media3.ui.notification.prev"
            int r2 = r7.indexOf(r2)
            goto L24
        L18:
            boolean r2 = r6.useRewindActionInCompactView
            if (r2 == 0) goto L23
            java.lang.String r2 = "androidx.media3.ui.notification.rewind"
            int r2 = r7.indexOf(r2)
            goto L24
        L23:
            r2 = r3
        L24:
            boolean r4 = r6.useNextActionInCompactView
            if (r4 == 0) goto L2f
            java.lang.String r4 = "androidx.media3.ui.notification.next"
            int r7 = r7.indexOf(r4)
            goto L3b
        L2f:
            boolean r4 = r6.useFastForwardActionInCompactView
            if (r4 == 0) goto L3a
            java.lang.String r4 = "androidx.media3.ui.notification.ffwd"
            int r7 = r7.indexOf(r4)
            goto L3b
        L3a:
            r7 = r3
        L3b:
            r4 = 3
            int[] r4 = new int[r4]
            r5 = 0
            if (r2 == r3) goto L44
            r4[r5] = r2
            r5 = 1
        L44:
            boolean r6 = r6.showPlayButtonIfSuppressed
            boolean r6 = androidx.media3.common.util.Util.shouldShowPlayButton(r8, r6)
            if (r0 == r3) goto L54
            if (r6 != 0) goto L54
            int r6 = r5 + 1
            r4[r5] = r0
        L52:
            r5 = r6
            goto L5d
        L54:
            if (r1 == r3) goto L5d
            if (r6 == 0) goto L5d
            int r6 = r5 + 1
            r4[r5] = r1
            goto L52
        L5d:
            if (r7 == r3) goto L64
            int r6 = r5 + 1
            r4[r5] = r7
            r5 = r6
        L64:
            int[] r6 = java.util.Arrays.copyOf(r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerNotificationManager.getActionIndicesForCompactView(java.util.List, androidx.media3.common.Player):int[]");
    }

    public List<String> getActions(Player player) {
        boolean isCommandAvailable = player.isCommandAvailable(7);
        boolean isCommandAvailable2 = player.isCommandAvailable(11);
        boolean isCommandAvailable3 = player.isCommandAvailable(12);
        boolean isCommandAvailable4 = player.isCommandAvailable(9);
        ArrayList arrayList = new ArrayList();
        if (this.usePreviousAction && isCommandAvailable) {
            arrayList.add(ACTION_PREVIOUS);
        }
        if (this.useRewindAction && isCommandAvailable2) {
            arrayList.add(ACTION_REWIND);
        }
        if (this.usePlayPauseActions) {
            if (Util.shouldShowPlayButton(player, this.showPlayButtonIfSuppressed)) {
                arrayList.add(ACTION_PLAY);
            } else {
                arrayList.add(ACTION_PAUSE);
            }
        }
        if (this.useFastForwardAction && isCommandAvailable3) {
            arrayList.add(ACTION_FAST_FORWARD);
        }
        if (this.useNextAction && isCommandAvailable4) {
            arrayList.add(ACTION_NEXT);
        }
        CustomActionReceiver customActionReceiver = this.customActionReceiver;
        if (customActionReceiver != null) {
            arrayList.addAll(customActionReceiver.getCustomActions(player));
        }
        if (this.useStopAction) {
            arrayList.add(ACTION_STOP);
        }
        return arrayList;
    }

    public boolean getOngoing(Player player) {
        int playbackState = player.getPlaybackState();
        return (playbackState == 2 || playbackState == 3) && player.getPlayWhenReady();
    }

    public final void invalidate() {
        if (this.isNotificationStarted) {
            postStartOrUpdateNotification();
        }
    }

    public final void setBadgeIconType(int i) {
        if (this.badgeIconType == i) {
            return;
        }
        if (i != 0 && i != 1 && i != 2) {
            s83.d();
        } else {
            this.badgeIconType = i;
            invalidate();
        }
    }

    public final void setColor(int i) {
        if (this.color != i) {
            this.color = i;
            invalidate();
        }
    }

    public final void setColorized(boolean z) {
        if (this.colorized != z) {
            this.colorized = z;
            invalidate();
        }
    }

    public final void setDefaults(int i) {
        if (this.defaults != i) {
            this.defaults = i;
            invalidate();
        }
    }

    public final void setMediaSessionToken(MediaSession.Token token) {
        if (Objects.equals(this.mediaSessionToken, token)) {
            return;
        }
        this.mediaSessionToken = token;
        invalidate();
    }

    public final void setPlayer(Player player) {
        boolean z = true;
        sp0.z(Looper.myLooper() == Looper.getMainLooper());
        if (player != null && player.getApplicationLooper() != Looper.getMainLooper()) {
            z = false;
        }
        sp0.o(z);
        Player player2 = this.player;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.removeListener(this.playerListener);
            if (player == null) {
                stopNotification(false);
            }
        }
        this.player = player;
        if (player != null) {
            player.addListener(this.playerListener);
            postStartOrUpdateNotification();
        }
    }

    public final void setPriority(int i) {
        if (this.priority == i) {
            return;
        }
        if (i != -2 && i != -1 && i != 0 && i != 1 && i != 2) {
            s83.d();
        } else {
            this.priority = i;
            invalidate();
        }
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        if (this.showPlayButtonIfSuppressed != z) {
            this.showPlayButtonIfSuppressed = z;
            invalidate();
        }
    }

    public final void setSmallIcon(int i) {
        if (this.smallIconResourceId != i) {
            this.smallIconResourceId = i;
            invalidate();
        }
    }

    public final void setUseChronometer(boolean z) {
        if (this.useChronometer != z) {
            this.useChronometer = z;
            invalidate();
        }
    }

    public final void setUseFastForwardAction(boolean z) {
        if (this.useFastForwardAction != z) {
            this.useFastForwardAction = z;
            invalidate();
        }
    }

    public final void setUseFastForwardActionInCompactView(boolean z) {
        if (this.useFastForwardActionInCompactView != z) {
            this.useFastForwardActionInCompactView = z;
            if (z) {
                this.useNextActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUseNextAction(boolean z) {
        if (this.useNextAction != z) {
            this.useNextAction = z;
            invalidate();
        }
    }

    public final void setUseNextActionInCompactView(boolean z) {
        if (this.useNextActionInCompactView != z) {
            this.useNextActionInCompactView = z;
            if (z) {
                this.useFastForwardActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUsePlayPauseActions(boolean z) {
        if (this.usePlayPauseActions != z) {
            this.usePlayPauseActions = z;
            invalidate();
        }
    }

    public final void setUsePreviousAction(boolean z) {
        if (this.usePreviousAction != z) {
            this.usePreviousAction = z;
            invalidate();
        }
    }

    public final void setUsePreviousActionInCompactView(boolean z) {
        if (this.usePreviousActionInCompactView != z) {
            this.usePreviousActionInCompactView = z;
            if (z) {
                this.useRewindActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUseRewindAction(boolean z) {
        if (this.useRewindAction != z) {
            this.useRewindAction = z;
            invalidate();
        }
    }

    public final void setUseRewindActionInCompactView(boolean z) {
        if (this.useRewindActionInCompactView != z) {
            this.useRewindActionInCompactView = z;
            if (z) {
                this.usePreviousActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUseStopAction(boolean z) {
        if (this.useStopAction == z) {
            return;
        }
        this.useStopAction = z;
        invalidate();
    }

    public final void setVisibility(int i) {
        if (this.visibility == i) {
            return;
        }
        if (i != -1 && i != 0 && i != 1) {
            s83.r();
        } else {
            this.visibility = i;
            invalidate();
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class Builder {
        protected int channelDescriptionResourceId;
        protected final String channelId;
        protected int channelImportance;
        protected int channelNameResourceId;
        protected final Context context;
        protected CustomActionReceiver customActionReceiver;
        protected int fastForwardActionIconResourceId;
        protected String groupKey;
        protected MediaDescriptionAdapter mediaDescriptionAdapter;
        protected int nextActionIconResourceId;
        protected final int notificationId;
        protected NotificationListener notificationListener;
        protected int pauseActionIconResourceId;
        protected int playActionIconResourceId;
        protected int previousActionIconResourceId;
        protected int rewindActionIconResourceId;
        protected int smallIconResourceId;
        protected int stopActionIconResourceId;

        public Builder(Context context, int i, String str) {
            sp0.o(i > 0);
            this.context = context;
            this.notificationId = i;
            this.channelId = str;
            this.channelImportance = 2;
            this.mediaDescriptionAdapter = new DefaultMediaDescriptionAdapter(null);
            this.smallIconResourceId = R.drawable.exo_notification_small_icon;
            this.playActionIconResourceId = R.drawable.exo_notification_play;
            this.pauseActionIconResourceId = R.drawable.exo_notification_pause;
            this.stopActionIconResourceId = R.drawable.exo_notification_stop;
            this.rewindActionIconResourceId = R.drawable.exo_notification_rewind;
            this.fastForwardActionIconResourceId = R.drawable.exo_notification_fastforward;
            this.previousActionIconResourceId = R.drawable.exo_notification_previous;
            this.nextActionIconResourceId = R.drawable.exo_notification_next;
        }

        public PlayerNotificationManager build() {
            int i = this.channelNameResourceId;
            if (i != 0) {
                NotificationUtil.createNotificationChannel(this.context, this.channelId, i, this.channelDescriptionResourceId, this.channelImportance);
            }
            return new PlayerNotificationManager(this.context, this.channelId, this.notificationId, this.mediaDescriptionAdapter, this.notificationListener, this.customActionReceiver, this.smallIconResourceId, this.playActionIconResourceId, this.pauseActionIconResourceId, this.stopActionIconResourceId, this.rewindActionIconResourceId, this.fastForwardActionIconResourceId, this.previousActionIconResourceId, this.nextActionIconResourceId, this.groupKey);
        }

        public Builder setChannelDescriptionResourceId(int i) {
            this.channelDescriptionResourceId = i;
            return this;
        }

        public Builder setChannelImportance(int i) {
            this.channelImportance = i;
            return this;
        }

        public Builder setChannelNameResourceId(int i) {
            this.channelNameResourceId = i;
            return this;
        }

        public Builder setCustomActionReceiver(CustomActionReceiver customActionReceiver) {
            this.customActionReceiver = customActionReceiver;
            return this;
        }

        public Builder setFastForwardActionIconResourceId(int i) {
            this.fastForwardActionIconResourceId = i;
            return this;
        }

        public Builder setGroup(String str) {
            this.groupKey = str;
            return this;
        }

        public Builder setMediaDescriptionAdapter(MediaDescriptionAdapter mediaDescriptionAdapter) {
            this.mediaDescriptionAdapter = mediaDescriptionAdapter;
            return this;
        }

        public Builder setNextActionIconResourceId(int i) {
            this.nextActionIconResourceId = i;
            return this;
        }

        public Builder setNotificationListener(NotificationListener notificationListener) {
            this.notificationListener = notificationListener;
            return this;
        }

        public Builder setPauseActionIconResourceId(int i) {
            this.pauseActionIconResourceId = i;
            return this;
        }

        public Builder setPlayActionIconResourceId(int i) {
            this.playActionIconResourceId = i;
            return this;
        }

        public Builder setPreviousActionIconResourceId(int i) {
            this.previousActionIconResourceId = i;
            return this;
        }

        public Builder setRewindActionIconResourceId(int i) {
            this.rewindActionIconResourceId = i;
            return this;
        }

        public Builder setSmallIconResourceId(int i) {
            this.smallIconResourceId = i;
            return this;
        }

        public Builder setStopActionIconResourceId(int i) {
            this.stopActionIconResourceId = i;
            return this;
        }

        @Deprecated
        public Builder(Context context, int i, String str, MediaDescriptionAdapter mediaDescriptionAdapter) {
            this(context, i, str);
            this.mediaDescriptionAdapter = mediaDescriptionAdapter;
        }
    }
}

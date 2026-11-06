package androidx.media3.exoplayer.analytics;

import android.util.Base64;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.PlaybackSessionManager;
import androidx.media3.exoplayer.source.MediaSource;
import defpackage.gz4;
import defpackage.tr;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class DefaultPlaybackSessionManager implements PlaybackSessionManager {
    public static final gz4 DEFAULT_SESSION_ID_GENERATOR = new tr(1);
    private static final Random RANDOM = new Random();
    private static final int SESSION_ID_LENGTH = 12;
    private String currentSessionId;
    private Timeline currentTimeline;
    private long lastRemovedCurrentWindowSequenceNumber;
    private PlaybackSessionManager.Listener listener;
    private final Timeline.Period period;
    private final gz4 sessionIdGenerator;
    private final HashMap<String, SessionDescriptor> sessions;
    private final Timeline.Window window;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class SessionDescriptor {
        private MediaSource.MediaPeriodId adMediaPeriodId;
        private boolean isActive;
        private boolean isCreated;
        private final String sessionId;
        private int windowIndex;
        private long windowSequenceNumber;

        public SessionDescriptor(String str, int i, MediaSource.MediaPeriodId mediaPeriodId) {
            this.sessionId = str;
            this.windowIndex = i;
            this.windowSequenceNumber = mediaPeriodId == null ? -1L : mediaPeriodId.windowSequenceNumber;
            if (mediaPeriodId == null || !mediaPeriodId.isAd()) {
                return;
            }
            this.adMediaPeriodId = mediaPeriodId;
        }

        private int resolveWindowIndexToNewTimeline(Timeline timeline, Timeline timeline2, int i) {
            if (i >= timeline.getWindowCount()) {
                if (i < timeline2.getWindowCount()) {
                    return i;
                }
                return -1;
            }
            timeline.getWindow(i, DefaultPlaybackSessionManager.this.window);
            for (int i2 = DefaultPlaybackSessionManager.this.window.firstPeriodIndex; i2 <= DefaultPlaybackSessionManager.this.window.lastPeriodIndex; i2++) {
                int indexOfPeriod = timeline2.getIndexOfPeriod(timeline.getUidOfPeriod(i2));
                if (indexOfPeriod != -1) {
                    return timeline2.getPeriod(indexOfPeriod, DefaultPlaybackSessionManager.this.period).windowIndex;
                }
            }
            return -1;
        }

        public boolean belongsToSession(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            if (mediaPeriodId != null) {
                long j = mediaPeriodId.windowSequenceNumber;
                if (j != -1) {
                    MediaSource.MediaPeriodId mediaPeriodId2 = this.adMediaPeriodId;
                    return mediaPeriodId2 == null ? !mediaPeriodId.isAd() && mediaPeriodId.windowSequenceNumber == this.windowSequenceNumber : j == mediaPeriodId2.windowSequenceNumber && mediaPeriodId.adGroupIndex == mediaPeriodId2.adGroupIndex && mediaPeriodId.adIndexInAdGroup == mediaPeriodId2.adIndexInAdGroup;
                }
            }
            return i == this.windowIndex;
        }

        public boolean isFinishedAtEventTime(AnalyticsListener.EventTime eventTime) {
            MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
            if (mediaPeriodId == null) {
                return this.windowIndex != eventTime.windowIndex;
            }
            long j = this.windowSequenceNumber;
            if (j == -1) {
                return false;
            }
            if (mediaPeriodId.windowSequenceNumber > j) {
                return true;
            }
            if (this.adMediaPeriodId == null) {
                return false;
            }
            int indexOfPeriod = eventTime.timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
            int indexOfPeriod2 = eventTime.timeline.getIndexOfPeriod(this.adMediaPeriodId.periodUid);
            MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
            if (mediaPeriodId2.windowSequenceNumber < this.adMediaPeriodId.windowSequenceNumber || indexOfPeriod < indexOfPeriod2) {
                return false;
            }
            if (indexOfPeriod > indexOfPeriod2) {
                return true;
            }
            boolean isAd = mediaPeriodId2.isAd();
            MediaSource.MediaPeriodId mediaPeriodId3 = eventTime.mediaPeriodId;
            if (!isAd) {
                int i = mediaPeriodId3.nextAdGroupIndex;
                return i == -1 || i > this.adMediaPeriodId.adGroupIndex;
            }
            int i2 = mediaPeriodId3.adGroupIndex;
            int i3 = mediaPeriodId3.adIndexInAdGroup;
            MediaSource.MediaPeriodId mediaPeriodId4 = this.adMediaPeriodId;
            int i4 = mediaPeriodId4.adGroupIndex;
            return i2 > i4 || (i2 == i4 && i3 > mediaPeriodId4.adIndexInAdGroup);
        }

        public void maybeSetWindowSequenceNumber(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            if (this.windowSequenceNumber != -1 || i != this.windowIndex || mediaPeriodId == null || mediaPeriodId.windowSequenceNumber < DefaultPlaybackSessionManager.this.getMinWindowSequenceNumber()) {
                return;
            }
            this.windowSequenceNumber = mediaPeriodId.windowSequenceNumber;
        }

        public boolean tryResolvingToNewTimeline(Timeline timeline, Timeline timeline2) {
            int resolveWindowIndexToNewTimeline = resolveWindowIndexToNewTimeline(timeline, timeline2, this.windowIndex);
            this.windowIndex = resolveWindowIndexToNewTimeline;
            if (resolveWindowIndexToNewTimeline == -1) {
                return false;
            }
            MediaSource.MediaPeriodId mediaPeriodId = this.adMediaPeriodId;
            return mediaPeriodId == null || timeline2.getIndexOfPeriod(mediaPeriodId.periodUid) != -1;
        }
    }

    public DefaultPlaybackSessionManager(gz4 gz4Var) {
        this.sessionIdGenerator = gz4Var;
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        this.sessions = new HashMap<>();
        this.currentTimeline = Timeline.EMPTY;
        this.lastRemovedCurrentWindowSequenceNumber = -1L;
    }

    private void clearCurrentSession(SessionDescriptor sessionDescriptor) {
        if (sessionDescriptor.windowSequenceNumber != -1 && sessionDescriptor.isCreated) {
            this.lastRemovedCurrentWindowSequenceNumber = sessionDescriptor.windowSequenceNumber;
        }
        this.currentSessionId = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String generateDefaultSessionId() {
        byte[] bArr = new byte[12];
        RANDOM.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getMinWindowSequenceNumber() {
        SessionDescriptor sessionDescriptor = this.sessions.get(this.currentSessionId);
        return (sessionDescriptor == null || sessionDescriptor.windowSequenceNumber == -1) ? this.lastRemovedCurrentWindowSequenceNumber + 1 : sessionDescriptor.windowSequenceNumber;
    }

    private SessionDescriptor getOrAddSession(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        SessionDescriptor sessionDescriptor = null;
        long j = Long.MAX_VALUE;
        for (SessionDescriptor sessionDescriptor2 : this.sessions.values()) {
            sessionDescriptor2.maybeSetWindowSequenceNumber(i, mediaPeriodId);
            if (sessionDescriptor2.belongsToSession(i, mediaPeriodId)) {
                long j2 = sessionDescriptor2.windowSequenceNumber;
                if (j2 == -1 || j2 < j) {
                    sessionDescriptor = sessionDescriptor2;
                    j = j2;
                } else if (j2 == j && ((SessionDescriptor) Util.castNonNull(sessionDescriptor)).adMediaPeriodId != null && sessionDescriptor2.adMediaPeriodId != null) {
                    sessionDescriptor = sessionDescriptor2;
                }
            }
        }
        if (sessionDescriptor != null) {
            return sessionDescriptor;
        }
        String str = (String) this.sessionIdGenerator.get();
        SessionDescriptor sessionDescriptor3 = new SessionDescriptor(str, i, mediaPeriodId);
        this.sessions.put(str, sessionDescriptor3);
        return sessionDescriptor3;
    }

    @RequiresNonNull({"listener"})
    private void updateCurrentSession(AnalyticsListener.EventTime eventTime) {
        if (eventTime.timeline.isEmpty()) {
            String str = this.currentSessionId;
            if (str != null) {
                SessionDescriptor sessionDescriptor = this.sessions.get(str);
                sessionDescriptor.getClass();
                clearCurrentSession(sessionDescriptor);
                return;
            }
            return;
        }
        SessionDescriptor sessionDescriptor2 = this.sessions.get(this.currentSessionId);
        SessionDescriptor orAddSession = getOrAddSession(eventTime.windowIndex, eventTime.mediaPeriodId);
        this.currentSessionId = orAddSession.sessionId;
        updateSessions(eventTime);
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
        if (mediaPeriodId == null || !mediaPeriodId.isAd()) {
            return;
        }
        if (sessionDescriptor2 != null && sessionDescriptor2.windowSequenceNumber == eventTime.mediaPeriodId.windowSequenceNumber && sessionDescriptor2.adMediaPeriodId != null && sessionDescriptor2.adMediaPeriodId.adGroupIndex == eventTime.mediaPeriodId.adGroupIndex && sessionDescriptor2.adMediaPeriodId.adIndexInAdGroup == eventTime.mediaPeriodId.adIndexInAdGroup) {
            return;
        }
        MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
        this.listener.onAdPlaybackStarted(eventTime, getOrAddSession(eventTime.windowIndex, new MediaSource.MediaPeriodId(mediaPeriodId2.periodUid, mediaPeriodId2.windowSequenceNumber)).sessionId, orAddSession.sessionId);
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized boolean belongsToSession(AnalyticsListener.EventTime eventTime, String str) {
        SessionDescriptor sessionDescriptor = this.sessions.get(str);
        if (sessionDescriptor == null) {
            return false;
        }
        sessionDescriptor.maybeSetWindowSequenceNumber(eventTime.windowIndex, eventTime.mediaPeriodId);
        return sessionDescriptor.belongsToSession(eventTime.windowIndex, eventTime.mediaPeriodId);
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized void finishAllSessions(AnalyticsListener.EventTime eventTime) {
        PlaybackSessionManager.Listener listener;
        try {
            String str = this.currentSessionId;
            if (str != null) {
                SessionDescriptor sessionDescriptor = this.sessions.get(str);
                sessionDescriptor.getClass();
                clearCurrentSession(sessionDescriptor);
            }
            Iterator<SessionDescriptor> it = this.sessions.values().iterator();
            while (it.hasNext()) {
                SessionDescriptor next = it.next();
                it.remove();
                if (next.isCreated && (listener = this.listener) != null) {
                    listener.onSessionFinished(eventTime, next.sessionId, false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized String getActiveSessionId() {
        return this.currentSessionId;
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized String getSessionForMediaPeriodId(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        return getOrAddSession(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, mediaPeriodId).sessionId;
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public void setListener(PlaybackSessionManager.Listener listener) {
        this.listener = listener;
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized void updateSessions(AnalyticsListener.EventTime eventTime) {
        this.listener.getClass();
        if (eventTime.timeline.isEmpty()) {
            return;
        }
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
        if (mediaPeriodId != null) {
            long j = mediaPeriodId.windowSequenceNumber;
            if (j != -1 && j < getMinWindowSequenceNumber()) {
                return;
            }
            SessionDescriptor sessionDescriptor = this.sessions.get(this.currentSessionId);
            if (sessionDescriptor != null && sessionDescriptor.windowSequenceNumber == -1 && sessionDescriptor.windowIndex != eventTime.windowIndex) {
                return;
            }
        }
        SessionDescriptor orAddSession = getOrAddSession(eventTime.windowIndex, eventTime.mediaPeriodId);
        if (this.currentSessionId == null) {
            this.currentSessionId = orAddSession.sessionId;
        }
        MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
        if (mediaPeriodId2 != null && mediaPeriodId2.isAd()) {
            MediaSource.MediaPeriodId mediaPeriodId3 = eventTime.mediaPeriodId;
            MediaSource.MediaPeriodId mediaPeriodId4 = new MediaSource.MediaPeriodId(mediaPeriodId3.periodUid, mediaPeriodId3.windowSequenceNumber, mediaPeriodId3.adGroupIndex);
            SessionDescriptor orAddSession2 = getOrAddSession(eventTime.windowIndex, mediaPeriodId4);
            if (!orAddSession2.isCreated) {
                orAddSession2.isCreated = true;
                eventTime.timeline.getPeriodByUid(eventTime.mediaPeriodId.periodUid, this.period);
                this.listener.onSessionCreated(new AnalyticsListener.EventTime(eventTime.realtimeMs, eventTime.timeline, eventTime.windowIndex, mediaPeriodId4, Math.max(0L, Util.usToMs(this.period.getAdGroupTimeUs(eventTime.mediaPeriodId.adGroupIndex)) + this.period.getPositionInWindowMs()), eventTime.currentTimeline, eventTime.currentWindowIndex, eventTime.currentMediaPeriodId, eventTime.currentPlaybackPositionMs, eventTime.totalBufferedDurationMs), orAddSession2.sessionId);
            }
        }
        if (!orAddSession.isCreated) {
            orAddSession.isCreated = true;
            this.listener.onSessionCreated(eventTime, orAddSession.sessionId);
        }
        if (orAddSession.sessionId.equals(this.currentSessionId) && !orAddSession.isActive) {
            orAddSession.isActive = true;
            this.listener.onSessionActive(eventTime, orAddSession.sessionId);
        }
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized void updateSessionsWithDiscontinuity(AnalyticsListener.EventTime eventTime, int i) {
        try {
            this.listener.getClass();
            boolean z = i == 0;
            Iterator<SessionDescriptor> it = this.sessions.values().iterator();
            while (it.hasNext()) {
                SessionDescriptor next = it.next();
                if (next.isFinishedAtEventTime(eventTime)) {
                    it.remove();
                    boolean equals = next.sessionId.equals(this.currentSessionId);
                    if (equals) {
                        clearCurrentSession(next);
                    }
                    if (next.isCreated) {
                        this.listener.onSessionFinished(eventTime, next.sessionId, z && equals && next.isActive);
                    }
                }
            }
            updateCurrentSession(eventTime);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized void updateSessionsWithTimelineChange(AnalyticsListener.EventTime eventTime) {
        try {
            this.listener.getClass();
            Timeline timeline = this.currentTimeline;
            this.currentTimeline = eventTime.timeline;
            Iterator<SessionDescriptor> it = this.sessions.values().iterator();
            while (it.hasNext()) {
                SessionDescriptor next = it.next();
                if (next.tryResolvingToNewTimeline(timeline, this.currentTimeline) && !next.isFinishedAtEventTime(eventTime)) {
                }
                it.remove();
                if (next.sessionId.equals(this.currentSessionId)) {
                    clearCurrentSession(next);
                }
                if (next.isCreated) {
                    this.listener.onSessionFinished(eventTime, next.sessionId, false);
                }
            }
            updateCurrentSession(eventTime);
        } catch (Throwable th) {
            throw th;
        }
    }

    public DefaultPlaybackSessionManager() {
        this(DEFAULT_SESSION_ID_GENERATOR);
    }
}

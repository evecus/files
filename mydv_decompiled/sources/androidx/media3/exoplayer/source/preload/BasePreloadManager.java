package androidx.media3.exoplayer.source.preload;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import defpackage.mr3;
import defpackage.of;
import defpackage.qu;
import defpackage.ru;
import defpackage.sp0;
import defpackage.su;
import defpackage.tu;
import defpackage.w7;
import defpackage.zy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class BasePreloadManager<T, PreloadStatusT> {
    private final Handler applicationHandler;
    private int indexForSourceHolderToClear;
    private int indexForSourceHolderToPreload;
    private final ListenerSet<PreloadManagerListener> listeners;
    private final Object lock = new Object();
    private final MediaSource.Factory mediaSourceFactory;
    private final BasePreloadManager<T, PreloadStatusT>.MediaSourceHolderMap mediaSourceHolderMap;
    protected final RankingDataComparator<T> rankingDataComparator;
    private final List<BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder> sourceHolderPriorityList;
    private final TargetPreloadStatusControl<T, PreloadStatusT> targetPreloadStatusControl;
    private PreloadStatusT targetPreloadStatusOfCurrentPreloadingSource;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static abstract class BuilderBase<T, PreloadStatusT> {
        protected MediaSourceFactorySupplier mediaSourceFactorySupplier;
        protected RankingDataComparator<T> rankingDataComparator;
        protected final TargetPreloadStatusControl<T, PreloadStatusT> targetPreloadStatusControl;

        public BuilderBase(RankingDataComparator<T> rankingDataComparator, TargetPreloadStatusControl<T, PreloadStatusT> targetPreloadStatusControl, MediaSourceFactorySupplier mediaSourceFactorySupplier) {
            this.rankingDataComparator = rankingDataComparator;
            this.targetPreloadStatusControl = targetPreloadStatusControl;
            this.mediaSourceFactorySupplier = mediaSourceFactorySupplier;
        }

        public abstract BasePreloadManager<T, PreloadStatusT> build();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public class MediaSourceHolder implements Comparable<BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder> {
        public final MediaItem mediaItem;
        private MediaSource mediaSource;
        public final T rankingData;
        private boolean released;

        public MediaSourceHolder(MediaItem mediaItem, T t, MediaSource mediaSource) {
            this.mediaItem = mediaItem;
            this.rankingData = t;
            this.mediaSource = mediaSource;
        }

        @Override // java.lang.Comparable
        public int compareTo(BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolder) {
            return BasePreloadManager.this.rankingDataComparator.compare(this.rankingData, mediaSourceHolder.rankingData);
        }

        public synchronized MediaSource getMediaSource() {
            return this.mediaSource;
        }

        public final boolean isReleased() {
            return this.released;
        }

        public final void release() {
            this.released = true;
        }

        public synchronized void setMediaSource(MediaSource mediaSource) {
            this.mediaSource = mediaSource;
        }
    }

    public BasePreloadManager(RankingDataComparator<T> rankingDataComparator, TargetPreloadStatusControl<T, PreloadStatusT> targetPreloadStatusControl, MediaSource.Factory factory) {
        Handler createHandlerForCurrentOrMainLooper = Util.createHandlerForCurrentOrMainLooper();
        this.applicationHandler = createHandlerForCurrentOrMainLooper;
        this.rankingDataComparator = rankingDataComparator;
        this.targetPreloadStatusControl = targetPreloadStatusControl;
        this.mediaSourceFactory = factory;
        this.listeners = new ListenerSet<>(createHandlerForCurrentOrMainLooper.getLooper());
        this.mediaSourceHolderMap = new MediaSourceHolderMap();
        rankingDataComparator.setInvalidationListener(new w7(this, (byte) 3));
        this.sourceHolderPriorityList = new ArrayList();
    }

    private BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder getCurrentlyPreloadingMediaSourceHolder() {
        if (this.indexForSourceHolderToPreload >= this.sourceHolderPriorityList.size()) {
            return null;
        }
        return this.sourceHolderPriorityList.get(this.indexForSourceHolderToPreload);
    }

    private boolean isCurrentlyPreloading(BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolder) {
        boolean z;
        synchronized (this.lock) {
            z = mediaSourceHolder == getCurrentlyPreloadingMediaSourceHolder();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onCompleted$0(MediaSourceHolder mediaSourceHolder, PreloadManagerListener preloadManagerListener) {
        preloadManagerListener.onCompleted(mediaSourceHolder.mediaItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onCompleted$1(MediaSource mediaSource, mr3 mr3Var) {
        PreloadStatusT targetPreloadStatusIfCurrentlyPreloading = getTargetPreloadStatusIfCurrentlyPreloading(mediaSource);
        if (targetPreloadStatusIfCurrentlyPreloading == null) {
            return;
        }
        BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolder = this.mediaSourceHolderMap.get(mediaSource);
        mediaSourceHolder.getClass();
        if (mr3Var.apply(targetPreloadStatusIfCurrentlyPreloading)) {
            this.listeners.sendEvent(new tu(mediaSourceHolder, (byte) 0));
            maybeAdvanceToNextMediaSourceHolder();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onCompleted$2(MediaSourceHolder mediaSourceHolder, PreloadManagerListener preloadManagerListener) {
        preloadManagerListener.onCompleted(mediaSourceHolder.mediaItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onCompleted$3(MediaItem mediaItem, mr3 mr3Var) {
        PreloadStatusT targetPreloadStatusIfCurrentlyPreloading = getTargetPreloadStatusIfCurrentlyPreloading(mediaItem);
        if (targetPreloadStatusIfCurrentlyPreloading == null) {
            return;
        }
        BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolder = this.mediaSourceHolderMap.get(mediaItem);
        mediaSourceHolder.getClass();
        if (mr3Var.apply(targetPreloadStatusIfCurrentlyPreloading)) {
            this.listeners.sendEvent(new tu(mediaSourceHolder, (byte) 1));
            maybeAdvanceToNextMediaSourceHolder();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$5(MediaSource mediaSource, mr3 mr3Var, PreloadException preloadException) {
        PreloadStatusT targetPreloadStatusIfCurrentlyPreloading = getTargetPreloadStatusIfCurrentlyPreloading(mediaSource);
        if (targetPreloadStatusIfCurrentlyPreloading != null && mr3Var.apply(targetPreloadStatusIfCurrentlyPreloading)) {
            this.listeners.sendEvent(new su(preloadException, (byte) 0));
            maybeAdvanceToNextMediaSourceHolder();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$7(MediaItem mediaItem, mr3 mr3Var, PreloadException preloadException) {
        PreloadStatusT targetPreloadStatusIfCurrentlyPreloading = getTargetPreloadStatusIfCurrentlyPreloading(mediaItem);
        if (targetPreloadStatusIfCurrentlyPreloading != null && mr3Var.apply(targetPreloadStatusIfCurrentlyPreloading)) {
            this.listeners.sendEvent(new su(preloadException, (byte) 1));
            maybeAdvanceToNextMediaSourceHolder();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onMediaSourceUpdated$9(MediaItem mediaItem, MediaSource mediaSource) {
        if (getTargetPreloadStatusIfCurrentlyPreloading(mediaItem) == null) {
            return;
        }
        BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolder = this.mediaSourceHolderMap.get(mediaItem);
        mediaSourceHolder.getClass();
        this.mediaSourceHolderMap.remove(mediaItem);
        mediaSourceHolder.setMediaSource(mediaSource);
        this.mediaSourceHolderMap.put(mediaItem, mediaSource, mediaSourceHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSkipped$8(MediaSource mediaSource, mr3 mr3Var) {
        PreloadStatusT targetPreloadStatusIfCurrentlyPreloading = getTargetPreloadStatusIfCurrentlyPreloading(mediaSource);
        if (targetPreloadStatusIfCurrentlyPreloading != null && mr3Var.apply(targetPreloadStatusIfCurrentlyPreloading)) {
            maybeAdvanceToNextMediaSourceHolder();
        }
    }

    private void maybeAdvanceToNextMediaSourceHolder() {
        synchronized (this.lock) {
            do {
                try {
                    int i = this.indexForSourceHolderToPreload + 1;
                    this.indexForSourceHolderToPreload = i;
                    if (i >= this.sourceHolderPriorityList.size()) {
                        break;
                    }
                } finally {
                }
            } while (!maybeStartPreloadingNextSourceHolder());
        }
    }

    private boolean maybeStartPreloadingNextSourceHolder() {
        if (!shouldStartPreloadingNextSource()) {
            return false;
        }
        BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolder = this.sourceHolderPriorityList.get(this.indexForSourceHolderToPreload);
        if (mediaSourceHolder.isReleased()) {
            return false;
        }
        PreloadStatusT targetPreloadStatus = this.targetPreloadStatusControl.getTargetPreloadStatus(mediaSourceHolder.rankingData);
        this.targetPreloadStatusOfCurrentPreloadingSource = targetPreloadStatus;
        preloadMediaSourceHolderInternal(mediaSourceHolder, targetPreloadStatus);
        return true;
    }

    private void resetSourceHolderPriorityList() {
        this.sourceHolderPriorityList.clear();
        this.sourceHolderPriorityList.addAll(this.mediaSourceHolderMap.values());
        Collections.sort(this.sourceHolderPriorityList);
        this.indexForSourceHolderToPreload = 0;
        this.indexForSourceHolderToClear = this.sourceHolderPriorityList.size() - 1;
    }

    private void verifyApplicationThread() {
        if (Looper.myLooper() == this.applicationHandler.getLooper()) {
            return;
        }
        zy.i("Preload manager is accessed on the wrong thread.");
    }

    public final void add(MediaSource mediaSource, T t) {
        BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder createMediaSourceHolder = createMediaSourceHolder(mediaSource.getMediaItem(), mediaSource, t);
        this.mediaSourceHolderMap.put(createMediaSourceHolder.mediaItem, createMediaSourceHolder.getMediaSource(), createMediaSourceHolder);
    }

    public void addListener(PreloadManagerListener preloadManagerListener) {
        this.listeners.add(preloadManagerListener);
    }

    public final void addMediaItems(List<MediaItem> list, List<T> list2) {
        sp0.o(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i), (MediaItem) list2.get(i));
        }
        invalidate();
    }

    public final void addMediaSources(List<MediaSource> list, List<T> list2) {
        sp0.o(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i), (MediaSource) list2.get(i));
        }
        invalidate();
    }

    public void clearListeners() {
        verifyApplicationThread();
        this.listeners.clear();
    }

    public abstract BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder createMediaSourceHolder(MediaItem mediaItem, MediaSource mediaSource, T t);

    public final MediaSource getMediaSource(MediaItem mediaItem) {
        if (!this.mediaSourceHolderMap.containsKey(mediaItem)) {
            return null;
        }
        BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolder = this.mediaSourceHolderMap.get(mediaItem);
        mediaSourceHolder.getClass();
        return mediaSourceHolder.getMediaSource();
    }

    public BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder getMediaSourceHolderToClear() {
        synchronized (this.lock) {
            try {
                int i = this.indexForSourceHolderToPreload;
                int i2 = this.indexForSourceHolderToClear;
                if (i >= i2) {
                    return null;
                }
                return this.sourceHolderPriorityList.get(i2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int getSourceCount() {
        return this.mediaSourceHolderMap.size();
    }

    public final PreloadStatusT getTargetPreloadStatusIfCurrentlyPreloading(MediaItem mediaItem) {
        synchronized (this.lock) {
            try {
                BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder currentlyPreloadingMediaSourceHolder = getCurrentlyPreloadingMediaSourceHolder();
                if (currentlyPreloadingMediaSourceHolder != null && mediaItem.equals(currentlyPreloadingMediaSourceHolder.mediaItem)) {
                    return this.targetPreloadStatusOfCurrentPreloadingSource;
                }
                return null;
            } finally {
            }
        }
    }

    public final void invalidate() {
        synchronized (this.lock) {
            try {
                resetSourceHolderPriorityList();
                while (this.indexForSourceHolderToPreload < this.sourceHolderPriorityList.size() && !maybeStartPreloadingNextSourceHolder()) {
                    this.indexForSourceHolderToPreload++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onCompleted(MediaSource mediaSource, mr3 mr3Var) {
        this.applicationHandler.post(new qu(this, mediaSource, mr3Var, (byte) 1));
    }

    public final void onError(PreloadException preloadException, MediaSource mediaSource, mr3 mr3Var) {
        this.applicationHandler.post(new ru((Object) this, (Object) mediaSource, (Object) mr3Var, (Object) preloadException, (byte) 1));
    }

    public final void onMediaSourceUpdated(MediaItem mediaItem, MediaSource mediaSource) {
        Util.postOrRun(this.applicationHandler, new of(this, mediaItem, mediaSource, (byte) 2));
    }

    public final void onSkipped(MediaSource mediaSource, mr3 mr3Var) {
        Util.postOrRun(this.applicationHandler, new qu(this, mediaSource, mr3Var, (byte) 0));
    }

    public final void onSourceCleared() {
        synchronized (this.lock) {
            this.indexForSourceHolderToClear--;
        }
    }

    public abstract void preloadMediaSourceHolderInternal(BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolder, PreloadStatusT preloadstatust);

    public final void release() {
        reset();
        releaseInternal();
        clearListeners();
    }

    public void releaseMediaSourceHolderInternal(BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolder) {
        mediaSourceHolder.release();
    }

    public final boolean remove(MediaItem mediaItem) {
        BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolder = this.mediaSourceHolderMap.get(mediaItem);
        if (mediaSourceHolder == null) {
            return false;
        }
        releaseMediaSourceHolderInternal(mediaSourceHolder);
        this.mediaSourceHolderMap.remove(mediaItem);
        if (!isCurrentlyPreloading(mediaSourceHolder)) {
            return true;
        }
        maybeAdvanceToNextMediaSourceHolder();
        return true;
    }

    public void removeListener(PreloadManagerListener preloadManagerListener) {
        verifyApplicationThread();
        this.listeners.remove(preloadManagerListener);
    }

    public final void removeMediaItems(List<MediaItem> list) {
        BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder currentlyPreloadingMediaSourceHolder;
        for (MediaItem mediaItem : list) {
            BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolder = this.mediaSourceHolderMap.get(mediaItem);
            if (mediaSourceHolder != null) {
                releaseMediaSourceHolderInternal(mediaSourceHolder);
                this.mediaSourceHolderMap.remove(mediaItem);
            }
        }
        synchronized (this.lock) {
            currentlyPreloadingMediaSourceHolder = getCurrentlyPreloadingMediaSourceHolder();
        }
        if (currentlyPreloadingMediaSourceHolder == null || !currentlyPreloadingMediaSourceHolder.isReleased()) {
            return;
        }
        maybeAdvanceToNextMediaSourceHolder();
    }

    public final void removeMediaSources(List<MediaSource> list) {
        BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder currentlyPreloadingMediaSourceHolder;
        for (MediaSource mediaSource : list) {
            BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolder = this.mediaSourceHolderMap.get(mediaSource);
            if (mediaSourceHolder != null) {
                releaseMediaSourceHolderInternal(mediaSourceHolder);
                this.mediaSourceHolderMap.remove(mediaSource);
            }
        }
        synchronized (this.lock) {
            currentlyPreloadingMediaSourceHolder = getCurrentlyPreloadingMediaSourceHolder();
        }
        if (currentlyPreloadingMediaSourceHolder == null || !currentlyPreloadingMediaSourceHolder.isReleased()) {
            return;
        }
        maybeAdvanceToNextMediaSourceHolder();
    }

    public final void reset() {
        Iterator<BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder> it = this.mediaSourceHolderMap.values().iterator();
        while (it.hasNext()) {
            releaseMediaSourceHolderInternal(it.next());
        }
        this.mediaSourceHolderMap.clear();
        synchronized (this.lock) {
            resetSourceHolderPriorityList();
            this.targetPreloadStatusOfCurrentPreloadingSource = null;
        }
    }

    public boolean shouldStartPreloadingNextSource() {
        return true;
    }

    public final void onCompleted(MediaItem mediaItem, mr3 mr3Var) {
        this.applicationHandler.post(new of(this, mediaItem, mr3Var, (byte) 3));
    }

    public final void onError(PreloadException preloadException, MediaItem mediaItem, mr3 mr3Var) {
        this.applicationHandler.post(new ru((Object) this, (Object) mediaItem, (Object) mr3Var, (Object) preloadException, (byte) 0));
    }

    public final void add(MediaItem mediaItem, T t) {
        add(this.mediaSourceFactory.createMediaSource(mediaItem), (MediaSource) t);
    }

    public void releaseInternal() {
    }

    public final PreloadStatusT getTargetPreloadStatusIfCurrentlyPreloading(MediaSource mediaSource) {
        synchronized (this.lock) {
            try {
                BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder currentlyPreloadingMediaSourceHolder = getCurrentlyPreloadingMediaSourceHolder();
                if (currentlyPreloadingMediaSourceHolder != null && mediaSource == currentlyPreloadingMediaSourceHolder.getMediaSource()) {
                    return this.targetPreloadStatusOfCurrentPreloadingSource;
                }
                return null;
            } finally {
            }
        }
    }

    public final boolean remove(MediaSource mediaSource) {
        BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolder = this.mediaSourceHolderMap.get(mediaSource);
        if (mediaSourceHolder == null) {
            return false;
        }
        releaseMediaSourceHolderInternal(mediaSourceHolder);
        this.mediaSourceHolderMap.remove(mediaSource);
        if (!isCurrentlyPreloading(mediaSourceHolder)) {
            return true;
        }
        maybeAdvanceToNextMediaSourceHolder();
        return true;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class MediaSourceHolderMap {
        private final HashMap<MediaItem, BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder> mediaItemToMediaSourceHolder = new HashMap<>();
        private final HashMap<MediaSource, MediaItem> mediaSourceToMediaItem = new HashMap<>();

        public MediaSourceHolderMap() {
        }

        public synchronized void clear() {
            this.mediaItemToMediaSourceHolder.clear();
            this.mediaSourceToMediaItem.clear();
        }

        public synchronized boolean containsKey(MediaItem mediaItem) {
            return this.mediaItemToMediaSourceHolder.containsKey(mediaItem);
        }

        public synchronized BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder get(MediaSource mediaSource) {
            MediaItem mediaItem = this.mediaSourceToMediaItem.get(mediaSource);
            if (mediaItem == null) {
                return null;
            }
            BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolder = this.mediaItemToMediaSourceHolder.get(mediaItem);
            mediaSourceHolder.getClass();
            return mediaSourceHolder;
        }

        public synchronized void put(MediaItem mediaItem, MediaSource mediaSource, BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder mediaSourceHolder) {
            this.mediaItemToMediaSourceHolder.put(mediaItem, mediaSourceHolder);
            this.mediaSourceToMediaItem.put(mediaSource, mediaItem);
        }

        public synchronized boolean remove(MediaItem mediaItem) {
            BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder remove = this.mediaItemToMediaSourceHolder.remove(mediaItem);
            if (remove == null) {
                return false;
            }
            this.mediaSourceToMediaItem.remove(remove.getMediaSource()).getClass();
            return true;
        }

        public synchronized int size() {
            return this.mediaItemToMediaSourceHolder.size();
        }

        public synchronized Collection<BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder> values() {
            return this.mediaItemToMediaSourceHolder.values();
        }

        public synchronized BasePreloadManager<T, PreloadStatusT>.MediaSourceHolder get(MediaItem mediaItem) {
            return this.mediaItemToMediaSourceHolder.get(mediaItem);
        }

        public synchronized boolean remove(MediaSource mediaSource) {
            MediaItem remove = this.mediaSourceToMediaItem.remove(mediaSource);
            if (remove == null) {
                return false;
            }
            this.mediaItemToMediaSourceHolder.remove(remove).getClass();
            return true;
        }
    }
}

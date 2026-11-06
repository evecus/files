package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.media3.common.FlagSet;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.ReorderingBufferQueue;
import androidx.media3.datasource.ByteArrayDataSource;
import androidx.media3.datasource.cache.CacheWriter;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.offline.DownloadHelper;
import androidx.media3.exoplayer.offline.DownloadManager;
import androidx.media3.exoplayer.offline.ProgressiveDownloader;
import androidx.media3.exoplayer.scheduler.RequirementsWatcher;
import androidx.media3.exoplayer.source.preload.BasePreloadManager;
import androidx.media3.exoplayer.source.preload.RankingDataComparator;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.RandomTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelectionUtil;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.extractor.BinarySearchSeeker;
import androidx.media3.extractor.FlacStreamMetadata;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.ts.SeiReader;
import coil3.EventListener;
import coil3.ImageLoader;
import coil3.request.ImageRequest;
import java.util.Collection;
import java.util.List;
import okhttp3.android.AndroidDns;
import okhttp3.internal.dns.DnsQuery;
import okhttp3.internal.dns.Question;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class w7 implements n7, DnsQuery.Factory, lp, RankingDataComparator.InvalidationListener, ByteArrayDataSource.UriResolver, TrackSelector.InvalidationListener, DefaultTrackSelector.TrackInfo.Factory, DrmSessionManagerProvider, RequirementsWatcher.Listener, BinarySearchSeeker.SeekTimestampConverter, EventListener.Factory, qv2, CacheWriter.ProgressListener, TrackSelectionUtil.AdaptiveTrackSelectionFactory, ReorderingBufferQueue.OutputConsumer, ListenerSet.IterationFinishedEvent, mq, Consumer, rz4 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ w7(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // defpackage.n7
    public void a(Object obj) {
        ((tm1) ((t43) this.J).getValue()).invoke(obj);
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((zx1) this.J).c((CuesWithTiming) obj);
    }

    @Override // defpackage.lp
    public int b(int i, da2 da2Var) {
        return ((tv) this.J).a(0, i, da2Var);
    }

    @Override // defpackage.qv2
    public Object c(Object obj, Object obj2) {
        return sv2.a0((List) ((Collection) obj2), new mv2(((j33) this.J).N, obj));
    }

    @Override // androidx.media3.container.ReorderingBufferQueue.OutputConsumer
    public void consume(long j, ParsableByteArray parsableByteArray) {
        ((SeiReader) this.J).lambda$new$0(j, parsableByteArray);
    }

    @Override // coil3.EventListener.Factory
    public EventListener create(ImageRequest imageRequest) {
        EventListener eventListener$lambda$0;
        eventListener$lambda$0 = ImageLoader.Builder.eventListener$lambda$0((EventListener) this.J, imageRequest);
        return eventListener$lambda$0;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelectionUtil.AdaptiveTrackSelectionFactory
    public ExoTrackSelection createAdaptiveTrackSelection(ExoTrackSelection.Definition definition) {
        ExoTrackSelection lambda$createTrackSelections$0;
        lambda$createTrackSelections$0 = ((RandomTrackSelection.Factory) this.J).lambda$createTrackSelections$0(definition);
        return lambda$createTrackSelections$0;
    }

    public fl2 d(Object obj) {
        fl2 lambda$handleReplaceMediaItems$33;
        lambda$handleReplaceMediaItems$33 = SimpleBasePlayer.lambda$handleReplaceMediaItems$33((fl2) this.J, obj);
        return lambda$handleReplaceMediaItems$33;
    }

    @Override // defpackage.rz4
    public sz4 e(qz4 qz4Var) {
        Context context = (Context) this.J;
        String str = qz4Var.b;
        yw0 yw0Var = qz4Var.c;
        yw0Var.getClass();
        if (str != null && str.length() != 0) {
            return new mm1(context, str, yw0Var, true, true);
        }
        s83.t("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    }

    public boolean f(uu2 uu2Var, int i, Bundle bundle) {
        hi0 hi0Var;
        ql qlVar = (ql) this.J;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((e12) uu2Var.I).b();
                Parcelable parcelable = (Parcelable) ((e12) uu2Var.I).e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        e12 e12Var = (e12) uu2Var.I;
        ClipData clipData = new ClipData(e12Var.d(), new ClipData.Item(e12Var.a()));
        if (i2 >= 31) {
            hi0Var = new gi0(clipData, 2);
        } else {
            ii0 ii0Var = new ii0();
            ii0Var.b = clipData;
            ii0Var.c = (byte) 2;
            hi0Var = ii0Var;
        }
        hi0Var.b(e12Var.c());
        hi0Var.setExtras(bundle);
        return dr5.f(qlVar, hi0Var.build()) == null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManagerProvider
    public DrmSessionManager get(MediaItem mediaItem) {
        DrmSessionManager lambda$createMediaSourceInternal$3;
        lambda$createMediaSourceInternal$3 = DownloadHelper.lambda$createMediaSourceInternal$3((DrmSessionManager) this.J, mediaItem);
        return lambda$createMediaSourceInternal$3;
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        ((SimpleBasePlayer) this.J).lambda$new$0((Player.Listener) obj, flagSet);
    }

    @Override // okhttp3.internal.dns.DnsQuery.Factory
    public DnsQuery newQuery(Question question) {
        DnsQuery queryFactory$lambda$0;
        queryFactory$lambda$0 = AndroidDns.queryFactory$lambda$0((AndroidDns) this.J, question);
        return queryFactory$lambda$0;
    }

    @Override // androidx.media3.datasource.cache.CacheWriter.ProgressListener
    public void onProgress(long j, long j2, long j3) {
        ((ProgressiveDownloader) this.J).onProgress(j, j2, j3);
    }

    @Override // androidx.media3.exoplayer.source.preload.RankingDataComparator.InvalidationListener
    public void onRankingDataComparatorInvalidated() {
        ((BasePreloadManager) this.J).invalidate();
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public void onRendererCapabilitiesChanged(Renderer renderer) {
        byte b = this.I;
    }

    @Override // androidx.media3.exoplayer.scheduler.RequirementsWatcher.Listener
    public void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i) {
        ((DownloadManager) this.J).onRequirementsStateChanged(requirementsWatcher, i);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public void onTrackSelectionsInvalidated(TrackSelectionParameters trackSelectionParameters) {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 5:
                ((TrackSelector) obj).onParametersActivated(trackSelectionParameters);
                break;
            default:
                ((DefaultTrackSelector) obj).onParametersActivated(trackSelectionParameters);
                break;
        }
    }

    @Override // androidx.media3.datasource.ByteArrayDataSource.UriResolver
    public byte[] resolve(Uri uri) {
        byte[] lambda$new$0;
        lambda$new$0 = ByteArrayDataSource.lambda$new$0((byte[]) this.J, uri);
        return lambda$new$0;
    }

    @Override // androidx.media3.extractor.BinarySearchSeeker.SeekTimestampConverter
    public long timeUsToTargetTime(long j) {
        return ((FlacStreamMetadata) this.J).getSampleNumber(j);
    }

    @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
    public List create(int i, TrackGroup trackGroup, int[] iArr) {
        List lambda$selectImageTrack$5;
        lambda$selectImageTrack$5 = DefaultTrackSelector.lambda$selectImageTrack$5((DefaultTrackSelector.Parameters) this.J, i, trackGroup, iArr);
        return lambda$selectImageTrack$5;
    }

    private final void g(Renderer renderer) {
    }

    private final void h(Renderer renderer) {
    }
}

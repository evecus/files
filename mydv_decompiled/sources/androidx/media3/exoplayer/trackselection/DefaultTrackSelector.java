package androidx.media3.exoplayer.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.RendererConfiguration;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.util.SpatializerWrapper;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.hf1;
import defpackage.lb0;
import defpackage.m63;
import defpackage.mm0;
import defpackage.mr3;
import defpackage.o54;
import defpackage.ob0;
import defpackage.og3;
import defpackage.qe;
import defpackage.ry1;
import defpackage.sp0;
import defpackage.sy1;
import defpackage.w7;
import defpackage.x24;
import defpackage.xq0;
import defpackage.z1;
import defpackage.zx1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class DefaultTrackSelector extends MappingTrackSelector implements RendererCapabilities.Listener {
    private static final String AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE = "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.";
    private static final og3 FORMAT_VALUE_ORDERING = new lb0(new qe(2));
    private static final float FRACTION_TO_CONSIDER_FULLSCREEN = 0.98f;
    protected static final int SELECTION_ELIGIBILITY_ADAPTIVE = 2;
    protected static final int SELECTION_ELIGIBILITY_FIXED = 1;
    protected static final int SELECTION_ELIGIBILITY_NO = 0;
    private static final String TAG = "DefaultTrackSelector";
    private Parameters applicationParameters;
    private AudioAttributes audioAttributes;
    public final Context context;
    private Boolean deviceIsTV;
    private volatile Thread playbackThread;
    private Parameters playerParameters;
    private SpatializerWrapper spatializer;
    private final ExoTrackSelection.Factory trackSelectionFactory;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class AudioTrackInfo extends TrackInfo<AudioTrackInfo> implements Comparable<AudioTrackInfo> {
        private final boolean allowMixedMimeTypes;
        private final int bitrate;
        private final int channelCount;
        private final boolean hasMainOrNoRoleFlag;
        private final boolean isDefaultSelectionFlag;
        private final boolean isObjectBasedAudio;
        private final boolean isWithinConstraints;
        private final boolean isWithinRendererCapabilities;
        private final String language;
        private final int localeLanguageMatchIndex;
        private final int localeLanguageScore;
        private final Parameters parameters;
        private final int preferredLabelMatchIndex;
        private final int preferredLanguageIndex;
        private final int preferredLanguageScore;
        private final int preferredMimeTypeMatchIndex;
        private final int preferredRoleFlagsScore;
        private final int sampleRate;
        private final int selectionEligibility;
        private final boolean usesHardwareAcceleration;
        private final boolean usesPrimaryDecoder;

        public AudioTrackInfo(int i, TrackGroup trackGroup, int i2, Parameters parameters, int i3, boolean z, mr3 mr3Var, int i4) {
            super(i, trackGroup, i2);
            int i5;
            int i6;
            int i7;
            this.parameters = parameters;
            int i8 = parameters.allowAudioNonSeamlessAdaptiveness ? 24 : 16;
            this.allowMixedMimeTypes = parameters.allowAudioMixedMimeTypeAdaptiveness && (i4 & i8) != 0;
            this.language = DefaultTrackSelector.normalizeUndeterminedLanguageToNull(this.format.language);
            this.isWithinRendererCapabilities = hf1.m(i3, false);
            int i9 = 0;
            while (true) {
                int size = parameters.preferredAudioLanguages.size();
                i5 = Log.LOG_LEVEL_OFF;
                if (i9 >= size) {
                    i6 = 0;
                    i9 = Integer.MAX_VALUE;
                    break;
                } else {
                    i6 = DefaultTrackSelector.getFormatLanguageScore(this.format, (String) parameters.preferredAudioLanguages.get(i9), false);
                    if (i6 > 0) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            this.preferredLanguageIndex = i9;
            this.preferredLanguageScore = i6;
            this.preferredRoleFlagsScore = DefaultTrackSelector.getRoleFlagMatchScore(this.format.roleFlags, parameters.preferredAudioRoleFlags);
            this.preferredLabelMatchIndex = DefaultTrackSelector.getBestLabelMatchIndex(this.format, parameters.preferredAudioLabels);
            Format format = this.format;
            int i10 = format.roleFlags;
            this.hasMainOrNoRoleFlag = i10 == 0 || (i10 & 1) != 0;
            this.isDefaultSelectionFlag = (format.selectionFlags & 1) != 0;
            this.isObjectBasedAudio = DefaultTrackSelector.isObjectBasedAudio(format);
            Format format2 = this.format;
            int i11 = format2.channelCount;
            this.channelCount = i11;
            this.sampleRate = format2.sampleRate;
            int i12 = format2.bitrate;
            this.bitrate = i12;
            this.isWithinConstraints = (i12 == -1 || i12 <= parameters.maxAudioBitrate) && (i11 == -1 || i11 <= parameters.maxAudioChannelCount) && mr3Var.apply(format2);
            String[] systemLanguageCodes = Util.getSystemLanguageCodes();
            int i13 = 0;
            while (true) {
                if (i13 >= systemLanguageCodes.length) {
                    i7 = 0;
                    i13 = Integer.MAX_VALUE;
                    break;
                } else {
                    i7 = DefaultTrackSelector.getFormatLanguageScore(this.format, systemLanguageCodes[i13], false);
                    if (i7 > 0) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            this.localeLanguageMatchIndex = i13;
            this.localeLanguageScore = i7;
            int i14 = 0;
            while (true) {
                if (i14 < parameters.preferredAudioMimeTypes.size()) {
                    String str = this.format.sampleMimeType;
                    if (str != null && str.equals(parameters.preferredAudioMimeTypes.get(i14))) {
                        i5 = i14;
                        break;
                    }
                    i14++;
                } else {
                    break;
                }
            }
            this.preferredMimeTypeMatchIndex = i5;
            this.usesPrimaryDecoder = (i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 128;
            this.usesHardwareAcceleration = (i3 & 64) == 64;
            this.selectionEligibility = evaluateSelectionEligibility(i3, z, i8);
        }

        public static int compareSelections(List<AudioTrackInfo> list, List<AudioTrackInfo> list2) {
            return ((AudioTrackInfo) Collections.max(list)).compareTo((AudioTrackInfo) Collections.max(list2));
        }

        public static dy1 createForTrackGroup(int i, TrackGroup trackGroup, Parameters parameters, int[] iArr, boolean z, mr3 mr3Var, int i2) {
            zx1 n = dy1.n();
            for (int i3 = 0; i3 < trackGroup.length; i3++) {
                n.c(new AudioTrackInfo(i, trackGroup, i3, parameters, iArr[i3], z, mr3Var, i2));
            }
            return n.f();
        }

        private int evaluateSelectionEligibility(int i, boolean z, int i2) {
            if (!hf1.m(i, this.parameters.exceedRendererCapabilitiesIfNecessary)) {
                return 0;
            }
            if (!this.isWithinConstraints && !this.parameters.exceedAudioConstraintsIfNecessary) {
                return 0;
            }
            Parameters parameters = this.parameters;
            if (parameters.audioOffloadPreferences.audioOffloadMode == 2 && !DefaultTrackSelector.rendererSupportsOffload(parameters, i, this.format)) {
                return 0;
            }
            if (!hf1.m(i, false) || !this.isWithinConstraints || this.format.bitrate == -1) {
                return 1;
            }
            Parameters parameters2 = this.parameters;
            if (parameters2.forceHighestSupportedBitrate || parameters2.forceLowestBitrate) {
                return 1;
            }
            return ((!parameters2.allowMultipleAdaptiveSelections && z) || parameters2.audioOffloadPreferences.audioOffloadMode == 2 || (i & i2) == 0) ? 1 : 2;
        }

        @Override // java.lang.Comparable
        public int compareTo(AudioTrackInfo audioTrackInfo) {
            og3 a = (this.isWithinConstraints && this.isWithinRendererCapabilities) ? DefaultTrackSelector.FORMAT_VALUE_ORDERING : DefaultTrackSelector.FORMAT_VALUE_ORDERING.a();
            ob0 d = ob0.a.d(this.isWithinRendererCapabilities, audioTrackInfo.isWithinRendererCapabilities);
            Integer valueOf = Integer.valueOf(this.preferredLanguageIndex);
            Integer valueOf2 = Integer.valueOf(audioTrackInfo.preferredLanguageIndex);
            o54 o54Var = o54.I;
            ob0 c = d.c(valueOf, valueOf2, o54Var).a(this.preferredLanguageScore, audioTrackInfo.preferredLanguageScore).a(this.preferredRoleFlagsScore, audioTrackInfo.preferredRoleFlagsScore).c(Integer.valueOf(this.preferredLabelMatchIndex), Integer.valueOf(audioTrackInfo.preferredLabelMatchIndex), o54Var).d(this.isDefaultSelectionFlag, audioTrackInfo.isDefaultSelectionFlag).d(this.hasMainOrNoRoleFlag, audioTrackInfo.hasMainOrNoRoleFlag).c(Integer.valueOf(this.localeLanguageMatchIndex), Integer.valueOf(audioTrackInfo.localeLanguageMatchIndex), o54Var).a(this.localeLanguageScore, audioTrackInfo.localeLanguageScore).d(this.isWithinConstraints, audioTrackInfo.isWithinConstraints).c(Integer.valueOf(this.preferredMimeTypeMatchIndex), Integer.valueOf(audioTrackInfo.preferredMimeTypeMatchIndex), o54Var);
            if (this.parameters.forceLowestBitrate) {
                c = c.c(Integer.valueOf(this.bitrate), Integer.valueOf(audioTrackInfo.bitrate), DefaultTrackSelector.FORMAT_VALUE_ORDERING.a());
            }
            ob0 c2 = c.d(this.usesPrimaryDecoder, audioTrackInfo.usesPrimaryDecoder).d(this.usesHardwareAcceleration, audioTrackInfo.usesHardwareAcceleration).d(this.isObjectBasedAudio, audioTrackInfo.isObjectBasedAudio).c(Integer.valueOf(this.channelCount), Integer.valueOf(audioTrackInfo.channelCount), a).c(Integer.valueOf(this.sampleRate), Integer.valueOf(audioTrackInfo.sampleRate), a);
            if (Objects.equals(this.language, audioTrackInfo.language)) {
                c2 = c2.c(Integer.valueOf(this.bitrate), Integer.valueOf(audioTrackInfo.bitrate), a);
            }
            return c2.f();
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(AudioTrackInfo audioTrackInfo) {
            int i;
            String str;
            int i2;
            if (!this.parameters.allowAudioMixedChannelCountAdaptiveness && ((i2 = this.format.channelCount) == -1 || i2 != audioTrackInfo.format.channelCount)) {
                return false;
            }
            if (!this.allowMixedMimeTypes && ((str = this.format.sampleMimeType) == null || !TextUtils.equals(str, audioTrackInfo.format.sampleMimeType))) {
                return false;
            }
            Parameters parameters = this.parameters;
            if (!parameters.allowAudioMixedSampleRateAdaptiveness && ((i = this.format.sampleRate) == -1 || i != audioTrackInfo.format.sampleRate)) {
                return false;
            }
            if (parameters.allowAudioMixedDecoderSupportAdaptiveness) {
                return true;
            }
            return this.usesPrimaryDecoder == audioTrackInfo.usesPrimaryDecoder && this.usesHardwareAcceleration == audioTrackInfo.usesHardwareAcceleration;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class OtherTrackScore implements Comparable<OtherTrackScore> {
        private final boolean isDefault;
        private final boolean isWithinRendererCapabilities;

        public OtherTrackScore(Format format, int i) {
            this.isDefault = (format.selectionFlags & 1) != 0;
            this.isWithinRendererCapabilities = hf1.m(i, false);
        }

        @Override // java.lang.Comparable
        public int compareTo(OtherTrackScore otherTrackScore) {
            return ob0.a.d(this.isWithinRendererCapabilities, otherTrackScore.isWithinRendererCapabilities).d(this.isDefault, otherTrackScore.isDefault).f();
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static abstract class TrackInfo<T extends TrackInfo<T>> {
        public final Format format;
        public final int rendererIndex;
        public final TrackGroup trackGroup;
        public final int trackIndex;

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        public interface Factory<T extends TrackInfo<T>> {
            List<T> create(int i, TrackGroup trackGroup, int[] iArr);
        }

        public TrackInfo(int i, TrackGroup trackGroup, int i2) {
            this.rendererIndex = i;
            this.trackGroup = trackGroup;
            this.trackIndex = i2;
            this.format = trackGroup.getFormat(i2);
        }

        public abstract int getSelectionEligibility();

        public abstract boolean isCompatibleForAdaptationWith(T t);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class VideoTrackInfo extends TrackInfo<VideoTrackInfo> {
        private static final float MIN_REASONABLE_FRAME_RATE = 10.0f;
        private final boolean allowMixedMimeTypes;
        private final int bitrate;
        private final int codecPreferenceScore;
        private final boolean hasMainOrNoRoleFlag;
        private final boolean hasReasonableFrameRate;
        private final boolean isHdr;
        private final boolean isWithinMaxConstraints;
        private final boolean isWithinMinConstraints;
        private final boolean isWithinRendererCapabilities;
        private final Parameters parameters;
        private final int pixelCount;
        private final int preferredLabelMatchIndex;
        private final int preferredLanguageIndex;
        private final int preferredLanguageScore;
        private final int preferredMimeTypeMatchIndex;
        private final int preferredRoleFlagsScore;
        private final String resolvedMimeType;
        private final int selectedAudioLanguageScore;
        private final int selectionEligibility;
        private final boolean usesHardwareAcceleration;
        private final boolean usesPrimaryDecoder;
        private final boolean usesPrimaryOrFallbackDecoder;

        /* JADX WARN: Removed duplicated region for block: B:104:0x011e A[EDGE_INSN: B:104:0x011e->B:80:0x011e BREAK  A[LOOP:1: B:73:0x0103->B:102:0x011b], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:105:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x00bf A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x012e A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x013a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public VideoTrackInfo(int r5, androidx.media3.common.TrackGroup r6, int r7, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters r8, int r9, java.lang.String r10, int r11, boolean r12) {
            /*
                Method dump skipped, instructions count: 359
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo.<init>(int, androidx.media3.common.TrackGroup, int, androidx.media3.exoplayer.trackselection.DefaultTrackSelector$Parameters, int, java.lang.String, int, boolean):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int compareNonQualityPreferences(VideoTrackInfo videoTrackInfo, VideoTrackInfo videoTrackInfo2) {
            ob0 d = ob0.a.d(videoTrackInfo.isWithinRendererCapabilities, videoTrackInfo2.isWithinRendererCapabilities);
            Integer valueOf = Integer.valueOf(videoTrackInfo.preferredLanguageIndex);
            Integer valueOf2 = Integer.valueOf(videoTrackInfo2.preferredLanguageIndex);
            o54 o54Var = o54.I;
            return d.c(valueOf, valueOf2, o54Var).a(videoTrackInfo.preferredLanguageScore, videoTrackInfo2.preferredLanguageScore).a(videoTrackInfo.preferredRoleFlagsScore, videoTrackInfo2.preferredRoleFlagsScore).c(Integer.valueOf(videoTrackInfo.preferredLabelMatchIndex), Integer.valueOf(videoTrackInfo2.preferredLabelMatchIndex), o54Var).d(videoTrackInfo.hasMainOrNoRoleFlag, videoTrackInfo2.hasMainOrNoRoleFlag).a(videoTrackInfo.selectedAudioLanguageScore, videoTrackInfo2.selectedAudioLanguageScore).d(videoTrackInfo.hasReasonableFrameRate, videoTrackInfo2.hasReasonableFrameRate).d(videoTrackInfo.isWithinMaxConstraints, videoTrackInfo2.isWithinMaxConstraints).d(videoTrackInfo.isWithinMinConstraints, videoTrackInfo2.isWithinMinConstraints).c(Integer.valueOf(videoTrackInfo.preferredMimeTypeMatchIndex), Integer.valueOf(videoTrackInfo2.preferredMimeTypeMatchIndex), o54Var).d(videoTrackInfo.usesPrimaryOrFallbackDecoder, videoTrackInfo2.usesPrimaryOrFallbackDecoder).d(videoTrackInfo.usesHardwareAcceleration, videoTrackInfo2.usesHardwareAcceleration).f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int compareQualityPreferences(VideoTrackInfo videoTrackInfo, VideoTrackInfo videoTrackInfo2) {
            og3 a = (videoTrackInfo.isWithinMaxConstraints && videoTrackInfo.isWithinRendererCapabilities) ? DefaultTrackSelector.FORMAT_VALUE_ORDERING : DefaultTrackSelector.FORMAT_VALUE_ORDERING.a();
            boolean z = videoTrackInfo.parameters.forceLowestBitrate;
            ob0 ob0Var = ob0.a;
            if (z) {
                ob0Var = ob0Var.c(Integer.valueOf(videoTrackInfo.bitrate), Integer.valueOf(videoTrackInfo2.bitrate), DefaultTrackSelector.FORMAT_VALUE_ORDERING.a());
            }
            ob0 c = ob0Var.d(videoTrackInfo.isHdr, videoTrackInfo2.isHdr).c(Integer.valueOf(videoTrackInfo.pixelCount), Integer.valueOf(videoTrackInfo2.pixelCount), a);
            if (videoTrackInfo.usesPrimaryOrFallbackDecoder && videoTrackInfo.usesHardwareAcceleration) {
                c = c.a(videoTrackInfo.codecPreferenceScore, videoTrackInfo2.codecPreferenceScore);
            }
            return c.d(videoTrackInfo.usesPrimaryDecoder, videoTrackInfo2.usesPrimaryDecoder).c(Integer.valueOf(videoTrackInfo.bitrate), Integer.valueOf(videoTrackInfo2.bitrate), a).f();
        }

        public static int compareSelections(List<VideoTrackInfo> list, List<VideoTrackInfo> list2) {
            byte b = 1;
            byte b2 = 2;
            return ob0.a.c((VideoTrackInfo) Collections.max(list, new b(b)), (VideoTrackInfo) Collections.max(list2, new b(b)), new b(b)).a(list.size(), list2.size()).c((VideoTrackInfo) Collections.max(list, new b(b2)), (VideoTrackInfo) Collections.max(list2, new b(b2)), new b(b2)).f();
        }

        public static dy1 createForTrackGroup(int i, TrackGroup trackGroup, Parameters parameters, int[] iArr, String str, int i2, Point point) {
            int maxVideoPixelsToRetainForViewport = DefaultTrackSelector.getMaxVideoPixelsToRetainForViewport(trackGroup, point != null ? point.x : parameters.viewportWidth, point != null ? point.y : parameters.viewportHeight, parameters.viewportOrientationMayChange);
            zx1 n = dy1.n();
            for (int i3 = 0; i3 < trackGroup.length; i3++) {
                int pixelCount = trackGroup.getFormat(i3).getPixelCount();
                n.c(new VideoTrackInfo(i, trackGroup, i3, parameters, iArr[i3], str, i2, maxVideoPixelsToRetainForViewport == Integer.MAX_VALUE || (pixelCount != -1 && pixelCount <= maxVideoPixelsToRetainForViewport)));
            }
            return n.f();
        }

        private int evaluateSelectionEligibility(int i, int i2) {
            if ((this.format.roleFlags & 16384) != 0 || !hf1.m(i, this.parameters.exceedRendererCapabilitiesIfNecessary)) {
                return 0;
            }
            if (!this.isWithinMaxConstraints && !this.parameters.exceedVideoConstraintsIfNecessary) {
                return 0;
            }
            if (!hf1.m(i, false) || !this.isWithinMinConstraints || !this.isWithinMaxConstraints || this.format.bitrate == -1) {
                return 1;
            }
            Parameters parameters = this.parameters;
            return (parameters.forceHighestSupportedBitrate || parameters.forceLowestBitrate || (i & i2) == 0) ? 1 : 2;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(VideoTrackInfo videoTrackInfo) {
            if (!this.allowMixedMimeTypes && !Objects.equals(this.resolvedMimeType, videoTrackInfo.resolvedMimeType)) {
                return false;
            }
            if (this.parameters.allowVideoMixedDecoderSupportAdaptiveness) {
                return true;
            }
            return this.usesPrimaryOrFallbackDecoder == videoTrackInfo.usesPrimaryOrFallbackDecoder && this.usesHardwareAcceleration == videoTrackInfo.usesHardwareAcceleration;
        }
    }

    private DefaultTrackSelector(TrackSelectionParameters trackSelectionParameters, ExoTrackSelection.Factory factory, Context context) {
        this.context = context != null ? context.getApplicationContext() : null;
        this.trackSelectionFactory = factory;
        Parameters build = trackSelectionParameters instanceof Parameters ? (Parameters) trackSelectionParameters : Parameters.DEFAULT.buildUpon().set(trackSelectionParameters).build();
        this.applicationParameters = build;
        this.playerParameters = build;
        this.audioAttributes = AudioAttributes.DEFAULT;
        if (build.constrainAudioChannelCountToDeviceCapabilities && context == null) {
            Log.w(TAG, AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE);
        }
    }

    private static void applyLegacyRendererOverrides(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, Parameters parameters, ExoTrackSelection.Definition[] definitionArr) {
        int rendererCount = mappedTrackInfo.getRendererCount();
        for (int i = 0; i < rendererCount; i++) {
            TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i);
            if (parameters.hasSelectionOverride(i, trackGroups)) {
                SelectionOverride selectionOverride = parameters.getSelectionOverride(i, trackGroups);
                definitionArr[i] = (selectionOverride == null || selectionOverride.tracks.length == 0) ? null : new ExoTrackSelection.Definition(trackGroups.get(selectionOverride.groupIndex), selectionOverride.tracks, selectionOverride.type);
            }
        }
    }

    private static void applyRendererDisableOverrides(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, Parameters parameters, ExoTrackSelection.Definition[] definitionArr) {
        for (int i = 0; i < mappedTrackInfo.getRendererCount(); i++) {
            int rendererType = mappedTrackInfo.getRendererType(i);
            if (parameters.getRendererDisabled(i) || parameters.disabledTrackTypes.contains(Integer.valueOf(rendererType))) {
                definitionArr[i] = null;
            }
        }
    }

    private static void applyTrackSelectionOverrides(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, TrackSelectionParameters trackSelectionParameters, ExoTrackSelection.Definition[] definitionArr) {
        int rendererCount = mappedTrackInfo.getRendererCount();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < rendererCount; i++) {
            collectTrackSelectionOverrides(mappedTrackInfo.getTrackGroups(i), trackSelectionParameters, hashMap);
        }
        collectTrackSelectionOverrides(mappedTrackInfo.getUnmappedTrackGroups(), trackSelectionParameters, hashMap);
        for (int i2 = 0; i2 < rendererCount; i2++) {
            TrackSelectionOverride trackSelectionOverride = (TrackSelectionOverride) hashMap.get(Integer.valueOf(mappedTrackInfo.getRendererType(i2)));
            if (trackSelectionOverride != null) {
                definitionArr[i2] = (trackSelectionOverride.trackIndices.isEmpty() || mappedTrackInfo.getTrackGroups(i2).indexOf(trackSelectionOverride.mediaTrackGroup) == -1) ? null : new ExoTrackSelection.Definition(trackSelectionOverride.mediaTrackGroup, sp0.j0(trackSelectionOverride.trackIndices));
            }
        }
    }

    private static void collectTrackSelectionOverrides(TrackGroupArray trackGroupArray, TrackSelectionParameters trackSelectionParameters, Map<Integer, TrackSelectionOverride> map) {
        TrackSelectionOverride trackSelectionOverride;
        for (int i = 0; i < trackGroupArray.length; i++) {
            TrackSelectionOverride trackSelectionOverride2 = (TrackSelectionOverride) trackSelectionParameters.overrides.get(trackGroupArray.get(i));
            if (trackSelectionOverride2 != null && ((trackSelectionOverride = map.get(Integer.valueOf(trackSelectionOverride2.getType()))) == null || (trackSelectionOverride.trackIndices.isEmpty() && !trackSelectionOverride2.trackIndices.isEmpty()))) {
                map.put(Integer.valueOf(trackSelectionOverride2.getType()), trackSelectionOverride2);
            }
        }
    }

    private static Pair<ExoTrackSelection.Definition, Integer> findDefinitionForType(ExoTrackSelection.Definition[] definitionArr, int i) {
        for (int i2 = 0; i2 < definitionArr.length; i2++) {
            ExoTrackSelection.Definition definition = definitionArr[i2];
            if (definition != null && definition.group.type == i) {
                return Pair.create(definition, Integer.valueOf(i2));
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getBestLabelMatchIndex(Format format, dy1 dy1Var) {
        for (int i = 0; i < dy1Var.size(); i++) {
            for (int i2 = 0; i2 < format.labels.size(); i2++) {
                if (format.labels.get(i2).value.equals(dy1Var.get(i))) {
                    return i;
                }
            }
        }
        return Log.LOG_LEVEL_OFF;
    }

    public static int getFormatLanguageScore(Format format, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(format.language)) {
            return 4;
        }
        String normalizeUndeterminedLanguageToNull = normalizeUndeterminedLanguageToNull(str);
        String normalizeUndeterminedLanguageToNull2 = normalizeUndeterminedLanguageToNull(format.language);
        if (normalizeUndeterminedLanguageToNull2 == null || normalizeUndeterminedLanguageToNull == null) {
            return (z && normalizeUndeterminedLanguageToNull2 == null) ? 1 : 0;
        }
        if (normalizeUndeterminedLanguageToNull2.startsWith(normalizeUndeterminedLanguageToNull) || normalizeUndeterminedLanguageToNull.startsWith(normalizeUndeterminedLanguageToNull2)) {
            return 3;
        }
        return Util.splitAtFirst(normalizeUndeterminedLanguageToNull2, "-")[0].equals(Util.splitAtFirst(normalizeUndeterminedLanguageToNull, "-")[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getMaxVideoPixelsToRetainForViewport(TrackGroup trackGroup, int i, int i2, boolean z) {
        int i3;
        int i4 = Log.LOG_LEVEL_OFF;
        if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
            for (int i5 = 0; i5 < trackGroup.length; i5++) {
                Format format = trackGroup.getFormat(i5);
                int i6 = format.width;
                if (i6 > 0 && (i3 = format.height) > 0) {
                    Point maxVideoSizeInViewport = TrackSelectionUtil.getMaxVideoSizeInViewport(z, i, i2, i6, i3);
                    int i7 = format.width;
                    int i8 = format.height;
                    int i9 = i7 * i8;
                    if (i7 >= ((int) (maxVideoSizeInViewport.x * FRACTION_TO_CONSIDER_FULLSCREEN)) && i8 >= ((int) (maxVideoSizeInViewport.y * FRACTION_TO_CONSIDER_FULLSCREEN)) && i9 < i4) {
                        i4 = i9;
                    }
                }
            }
        }
        return i4;
    }

    private static String getPreferredLanguageFromCaptioningManager(Context context) {
        CaptioningManager captioningManager;
        Locale locale;
        if (context == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            return null;
        }
        return Util.getLocaleLanguageTag(locale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getRoleFlagMatchScore(int i, int i2) {
        return (i == 0 || i != i2) ? Integer.bitCount(i & i2) : Log.LOG_LEVEL_OFF;
    }

    private static sy1 getSelectedPrimaryTrackGroupIds(ExoTrackSelection.Definition[] definitionArr, Parameters parameters) {
        int i = sy1.K;
        ry1 ry1Var = new ry1(4);
        for (int i2 = 0; i2 < definitionArr.length; i2++) {
            ExoTrackSelection.Definition definition = definitionArr[i2];
            if (definition != null && !parameters.getRendererDisabled(i2) && !parameters.disabledTrackTypes.contains(Integer.valueOf(definition.group.type))) {
                ry1Var.f(definition.group.id);
                int i3 = 0;
                while (true) {
                    int[] iArr = definition.tracks;
                    if (i3 < iArr.length) {
                        String str = definition.group.getFormat(iArr[i3]).primaryTrackGroupId;
                        if (str != null) {
                            ry1Var.c(str);
                        }
                        i3++;
                    }
                }
            }
        }
        return ry1Var.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getVideoCodecPreferenceScore(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isAudioFormatWithinAudioChannelCountConstraints, reason: merged with bridge method [inline-methods] */
    public boolean lambda$selectAudioTrack$2(Format format, Parameters parameters) {
        int i;
        SpatializerWrapper spatializerWrapper;
        SpatializerWrapper spatializerWrapper2;
        if (!parameters.constrainAudioChannelCountToDeviceCapabilities) {
            return true;
        }
        Boolean bool = this.deviceIsTV;
        if ((bool != null && bool.booleanValue()) || (i = format.channelCount) == -1 || i <= 2) {
            return true;
        }
        if (!isDolbyAudio(format) || (Build.VERSION.SDK_INT >= 32 && (spatializerWrapper2 = this.spatializer) != null && spatializerWrapper2.isSpatializationSupported())) {
            return Build.VERSION.SDK_INT >= 32 && (spatializerWrapper = this.spatializer) != null && spatializerWrapper.isSpatializationSupported() && this.spatializer.isAvailable() && this.spatializer.isEnabled() && this.spatializer.canBeSpatialized(this.audioAttributes, format);
        }
        return true;
    }

    private static boolean isDolbyAudio(Format format) {
        String str = format.sampleMimeType;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isObjectBasedAudio(Format format) {
        String str = format.sampleMimeType;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
        }
        return false;
    }

    @Deprecated
    public static boolean isSupported(int i, boolean z) {
        return hf1.m(i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$selectAudioTrack$3(final Parameters parameters, boolean z, int[] iArr, int i, TrackGroup trackGroup, int[] iArr2) {
        return AudioTrackInfo.createForTrackGroup(i, trackGroup, parameters, iArr2, z, new mr3() { // from class: dt0
            @Override // defpackage.mr3
            public final boolean apply(Object obj) {
                boolean lambda$selectAudioTrack$2;
                lambda$selectAudioTrack$2 = DefaultTrackSelector.this.lambda$selectAudioTrack$2(parameters, (Format) obj);
                return lambda$selectAudioTrack$2;
            }
        }, iArr[i]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$selectImageTrack$5(Parameters parameters, int i, TrackGroup trackGroup, int[] iArr) {
        return ImageTrackInfo.createForTrackGroup(i, trackGroup, parameters, iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$selectTextTrack$4(Parameters parameters, String str, String str2, int i, TrackGroup trackGroup, int[] iArr) {
        return TextTrackInfo.createForTrackGroup(i, trackGroup, parameters, iArr, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$selectVideoTrack$1(Parameters parameters, String str, int[] iArr, Point point, int i, TrackGroup trackGroup, int[] iArr2) {
        return VideoTrackInfo.createForTrackGroup(i, trackGroup, parameters, iArr2, str, iArr[i], point);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    private static void maybeConfigureRendererForOffload(Parameters parameters, MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, RendererConfiguration[] rendererConfigurationArr, ExoTrackSelection[] exoTrackSelectionArr) {
        int i = -1;
        boolean z = false;
        int i2 = 0;
        for (int i3 = 0; i3 < mappedTrackInfo.getRendererCount(); i3++) {
            int rendererType = mappedTrackInfo.getRendererType(i3);
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i3];
            if (rendererType != 1 && exoTrackSelection != null) {
                return;
            }
            if (rendererType == 1 && exoTrackSelection != null && exoTrackSelection.length() == 1) {
                if (rendererSupportsOffload(parameters, iArr[i3][mappedTrackInfo.getTrackGroups(i3).indexOf(exoTrackSelection.getTrackGroup())][exoTrackSelection.getIndexInTrackGroup(0)], exoTrackSelection.getSelectedFormat())) {
                    i2++;
                    i = i3;
                }
            }
        }
        if (i2 == 1) {
            int i4 = parameters.audioOffloadPreferences.isGaplessSupportRequired ? 1 : 2;
            RendererConfiguration rendererConfiguration = rendererConfigurationArr[i];
            if (rendererConfiguration != null && rendererConfiguration.tunneling) {
                z = true;
            }
            rendererConfigurationArr[i] = new RendererConfiguration(i4, z);
        }
    }

    private static void maybeConfigureRenderersForTunneling(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, RendererConfiguration[] rendererConfigurationArr, ExoTrackSelection[] exoTrackSelectionArr) {
        boolean z;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < mappedTrackInfo.getRendererCount(); i3++) {
            int rendererType = mappedTrackInfo.getRendererType(i3);
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i3];
            if ((rendererType == 1 || rendererType == 2) && exoTrackSelection != null && rendererSupportsTunneling(iArr[i3], mappedTrackInfo.getTrackGroups(i3), exoTrackSelection)) {
                if (rendererType == 1) {
                    if (i2 != -1) {
                        z = false;
                        break;
                    }
                    i2 = i3;
                } else {
                    if (i != -1) {
                        z = false;
                        break;
                    }
                    i = i3;
                }
            }
        }
        z = true;
        if (z && ((i2 == -1 || i == -1) ? false : true)) {
            RendererConfiguration rendererConfiguration = new RendererConfiguration(0, true);
            rendererConfigurationArr[i2] = rendererConfiguration;
            rendererConfigurationArr[i] = rendererConfiguration;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeInvalidateForAudioChannelCountConstraints() {
        SpatializerWrapper spatializerWrapper;
        if (!this.playerParameters.constrainAudioChannelCountToDeviceCapabilities || Build.VERSION.SDK_INT < 32 || (spatializerWrapper = this.spatializer) == null || !spatializerWrapper.isSpatializationSupported()) {
            return;
        }
        invalidate(null);
    }

    private void maybeInvalidateForRendererCapabilitiesChange(Renderer renderer) {
        if (this.playerParameters.allowInvalidateSelectionsOnRendererCapabilitiesChange) {
            invalidateForRendererCapabilitiesChange(renderer);
        }
    }

    public static String normalizeUndeterminedLanguageToNull(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean rendererSupportsOffload(Parameters parameters, int i, Format format) {
        if ((i & RendererCapabilities.AUDIO_OFFLOAD_SUPPORT_MASK) == 0) {
            return false;
        }
        TrackSelectionParameters.AudioOffloadPreferences audioOffloadPreferences = parameters.audioOffloadPreferences;
        if (audioOffloadPreferences.isSpeedChangeSupportRequired && (i & 2048) == 0) {
            return false;
        }
        if (audioOffloadPreferences.isGaplessSupportRequired) {
            boolean z = (format.encoderDelay == 0 && format.encoderPadding == 0) ? false : true;
            boolean z2 = (i & 1024) != 0;
            if (z && !z2) {
                return false;
            }
        }
        return true;
    }

    private static boolean rendererSupportsTunneling(int[][] iArr, TrackGroupArray trackGroupArray, ExoTrackSelection exoTrackSelection) {
        if (exoTrackSelection == null) {
            return false;
        }
        int indexOf = trackGroupArray.indexOf(exoTrackSelection.getTrackGroup());
        for (int i = 0; i < exoTrackSelection.length(); i++) {
            if ((iArr[indexOf][exoTrackSelection.getIndexInTrackGroup(i)] & 32) != 32) {
                return false;
            }
        }
        return true;
    }

    private <T extends TrackInfo<T>> Pair<ExoTrackSelection.Definition, Integer> selectTracksForType(int i, MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, TrackInfo.Factory<T> factory, Comparator<List<T>> comparator) {
        int i2;
        RandomAccess randomAccess;
        MappingTrackSelector.MappedTrackInfo mappedTrackInfo2 = mappedTrackInfo;
        ArrayList arrayList = new ArrayList();
        int rendererCount = mappedTrackInfo2.getRendererCount();
        int i3 = 0;
        while (i3 < rendererCount) {
            if (i == mappedTrackInfo2.getRendererType(i3)) {
                TrackGroupArray trackGroups = mappedTrackInfo2.getTrackGroups(i3);
                for (int i4 = 0; i4 < trackGroups.length; i4++) {
                    TrackGroup trackGroup = trackGroups.get(i4);
                    List<T> create = factory.create(i3, trackGroup, iArr[i3][i4]);
                    boolean[] zArr = new boolean[trackGroup.length];
                    int i5 = 0;
                    while (i5 < trackGroup.length) {
                        T t = create.get(i5);
                        int selectionEligibility = t.getSelectionEligibility();
                        if (zArr[i5] || selectionEligibility == 0) {
                            i2 = rendererCount;
                        } else {
                            if (selectionEligibility == 1) {
                                randomAccess = dy1.t(t);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t);
                                int i6 = i5 + 1;
                                while (i6 < trackGroup.length) {
                                    T t2 = create.get(i6);
                                    int i7 = rendererCount;
                                    if (t2.getSelectionEligibility() == 2 && t.isCompatibleForAdaptationWith(t2)) {
                                        arrayList2.add(t2);
                                        zArr[i6] = true;
                                    }
                                    i6++;
                                    rendererCount = i7;
                                }
                                randomAccess = arrayList2;
                            }
                            i2 = rendererCount;
                            arrayList.add(randomAccess);
                        }
                        i5++;
                        rendererCount = i2;
                    }
                }
            }
            i3++;
            mappedTrackInfo2 = mappedTrackInfo;
            rendererCount = rendererCount;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((TrackInfo) list.get(i8)).trackIndex;
        }
        TrackInfo trackInfo = (TrackInfo) list.get(0);
        return Pair.create(new ExoTrackSelection.Definition(trackInfo.trackGroup, iArr2), Integer.valueOf(trackInfo.rendererIndex));
    }

    private void setParametersInternal(Parameters parameters) {
        parameters.getClass();
        boolean equals = this.applicationParameters.equals(parameters);
        this.applicationParameters = parameters;
        if (equals) {
            return;
        }
        if (parameters.constrainAudioChannelCountToDeviceCapabilities && this.context == null) {
            Log.w(TAG, AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE);
        }
        invalidate(parameters);
    }

    public Parameters.Builder buildUponParameters() {
        return getParameters().buildUpon();
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public void init(TrackSelector.InvalidationListener invalidationListener, BandwidthMeter bandwidthMeter) {
        super.init(invalidationListener, bandwidthMeter);
        this.playerParameters = getParameters();
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public boolean isSetParametersSupported() {
        return true;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public void onParametersActivated(TrackSelectionParameters trackSelectionParameters) {
        if (trackSelectionParameters == null) {
            return;
        }
        if (trackSelectionParameters instanceof Parameters) {
            this.playerParameters = (Parameters) trackSelectionParameters;
        } else {
            this.playerParameters = new Parameters.Builder().set(trackSelectionParameters).build();
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities.Listener
    public void onRendererCapabilitiesChanged(Renderer renderer) {
        maybeInvalidateForRendererCapabilitiesChange(renderer);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public void release() {
        SpatializerWrapper spatializerWrapper;
        if (this.playbackThread != null) {
            sp0.A(Thread.currentThread().equals(this.playbackThread), "DefaultTrackSelector is accessed on the wrong thread.");
        }
        if (Build.VERSION.SDK_INT >= 32 && (spatializerWrapper = this.spatializer) != null) {
            spatializerWrapper.release();
            this.spatializer = null;
        }
        super.release();
    }

    public void selectAllTracks(ExoTrackSelection.Definition[] definitionArr, MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, Parameters parameters) {
        String str;
        String str2;
        Pair<ExoTrackSelection.Definition, Integer> selectTextTrack;
        int rendererCount = mappedTrackInfo.getRendererCount();
        Pair<ExoTrackSelection.Definition, Integer> findDefinitionForType = findDefinitionForType(definitionArr, 1);
        if (findDefinitionForType == null && (findDefinitionForType = selectAudioTrack(mappedTrackInfo, iArr, iArr2, parameters)) != null) {
            definitionArr[((Integer) findDefinitionForType.second).intValue()] = (ExoTrackSelection.Definition) findDefinitionForType.first;
        }
        if (findDefinitionForType == null) {
            str = null;
        } else {
            Object obj = findDefinitionForType.first;
            str = ((ExoTrackSelection.Definition) obj).group.getFormat(((ExoTrackSelection.Definition) obj).tracks[0]).language;
        }
        Pair<ExoTrackSelection.Definition, Integer> findDefinitionForType2 = findDefinitionForType(definitionArr, 2);
        Pair<ExoTrackSelection.Definition, Integer> findDefinitionForType3 = findDefinitionForType(definitionArr, 4);
        if (findDefinitionForType2 == null && findDefinitionForType3 == null) {
            str2 = str;
            Pair<ExoTrackSelection.Definition, Integer> selectVideoTrack = selectVideoTrack(mappedTrackInfo, iArr, iArr2, parameters, str2);
            Pair<ExoTrackSelection.Definition, Integer> selectImageTrack = (parameters.isPrioritizeImageOverVideoEnabled || selectVideoTrack == null) ? selectImageTrack(mappedTrackInfo, iArr, parameters) : null;
            if (selectImageTrack != null) {
                definitionArr[((Integer) selectImageTrack.second).intValue()] = (ExoTrackSelection.Definition) selectImageTrack.first;
            } else if (selectVideoTrack != null) {
                definitionArr[((Integer) selectVideoTrack.second).intValue()] = (ExoTrackSelection.Definition) selectVideoTrack.first;
            }
        } else {
            str2 = str;
        }
        if (findDefinitionForType(definitionArr, 3) == null && (selectTextTrack = selectTextTrack(mappedTrackInfo, iArr, parameters, str2)) != null) {
            definitionArr[((Integer) selectTextTrack.second).intValue()] = (ExoTrackSelection.Definition) selectTextTrack.first;
        }
        selectMetadataTracks(definitionArr, mappedTrackInfo, iArr, parameters);
        for (int i = 0; i < rendererCount; i++) {
            int rendererType = mappedTrackInfo.getRendererType(i);
            if (rendererType != 2 && rendererType != 1 && rendererType != 3 && rendererType != 4 && rendererType != 5 && definitionArr[i] == null) {
                definitionArr[i] = selectOtherTrack(rendererType, mappedTrackInfo.getTrackGroups(i), iArr[i], parameters);
            }
        }
    }

    public Pair<ExoTrackSelection.Definition, Integer> selectAudioTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, final int[] iArr2, final Parameters parameters) {
        byte b;
        final boolean z = false;
        int i = 0;
        while (true) {
            b = 2;
            if (i < mappedTrackInfo.getRendererCount()) {
                if (2 == mappedTrackInfo.getRendererType(i) && mappedTrackInfo.getTrackGroups(i).length > 0) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return selectTracksForType(1, mappedTrackInfo, iArr, new TrackInfo.Factory() { // from class: ft0
            @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final List create(int i2, TrackGroup trackGroup, int[] iArr3) {
                List lambda$selectAudioTrack$3;
                lambda$selectAudioTrack$3 = DefaultTrackSelector.this.lambda$selectAudioTrack$3(parameters, z, iArr2, i2, trackGroup, iArr3);
                return lambda$selectAudioTrack$3;
            }
        }, new a(b));
    }

    public Pair<ExoTrackSelection.Definition, Integer> selectImageTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, Parameters parameters) {
        if (parameters.audioOffloadPreferences.audioOffloadMode == 2) {
            return null;
        }
        return selectTracksForType(4, mappedTrackInfo, iArr, new w7(parameters, (byte) 6), new b((byte) 0));
    }

    public void selectMetadataTracks(ExoTrackSelection.Definition[] definitionArr, MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, Parameters parameters) {
        int k = hf1.k(0, 0, 0, 0);
        if (parameters.audioOffloadPreferences.audioOffloadMode == 2) {
            return;
        }
        sy1 selectedPrimaryTrackGroupIds = getSelectedPrimaryTrackGroupIds(definitionArr, parameters);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < mappedTrackInfo.getRendererCount(); i++) {
            if (mappedTrackInfo.getRendererType(i) == 5) {
                TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i);
                for (int i2 = 0; i2 < trackGroups.length; i2++) {
                    TrackGroup trackGroup = trackGroups.get(i2);
                    arrayList.add(trackGroup);
                    int[] iArr2 = (int[]) iArr[i][i2].clone();
                    for (int i3 = 0; i3 < iArr2.length; i3++) {
                        String str = trackGroup.getFormat(i3).primaryTrackGroupId;
                        if (str != null && !selectedPrimaryTrackGroupIds.contains(str)) {
                            iArr2[i3] = k;
                        }
                    }
                    arrayList2.add(iArr2);
                }
            }
        }
        TrackGroup[] trackGroupArr = new TrackGroup[arrayList.size()];
        Util.nullSafeListToArray(arrayList, trackGroupArr);
        TrackGroupArray trackGroupArray = new TrackGroupArray(trackGroupArr);
        int[][] iArr3 = new int[arrayList2.size()][];
        Util.nullSafeListToArray(arrayList2, iArr3);
        for (int i4 = 0; i4 < mappedTrackInfo.getRendererCount(); i4++) {
            if (mappedTrackInfo.getRendererType(i4) == 5) {
                ExoTrackSelection.Definition selectOtherTrack = selectOtherTrack(5, trackGroupArray, iArr3, parameters);
                definitionArr[i4] = selectOtherTrack;
                if (selectOtherTrack == null) {
                    return;
                } else {
                    Arrays.fill(iArr3[trackGroupArray.indexOf(selectOtherTrack.group)], k);
                }
            }
        }
    }

    public ExoTrackSelection.Definition selectOtherTrack(int i, TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) {
        if (parameters.audioOffloadPreferences.audioOffloadMode == 2) {
            return null;
        }
        int i2 = 0;
        TrackGroup trackGroup = null;
        OtherTrackScore otherTrackScore = null;
        for (int i3 = 0; i3 < trackGroupArray.length; i3++) {
            TrackGroup trackGroup2 = trackGroupArray.get(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < trackGroup2.length; i4++) {
                if (hf1.m(iArr2[i4], parameters.exceedRendererCapabilitiesIfNecessary)) {
                    OtherTrackScore otherTrackScore2 = new OtherTrackScore(trackGroup2.getFormat(i4), iArr2[i4]);
                    if (otherTrackScore == null || otherTrackScore2.compareTo(otherTrackScore) > 0) {
                        trackGroup = trackGroup2;
                        i2 = i4;
                        otherTrackScore = otherTrackScore2;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new ExoTrackSelection.Definition(trackGroup, i2);
    }

    public Pair<ExoTrackSelection.Definition, Integer> selectTextTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, Parameters parameters, String str) {
        byte b = 2;
        if (parameters.audioOffloadPreferences.audioOffloadMode == 2) {
            return null;
        }
        return selectTracksForType(3, mappedTrackInfo, iArr, new xq0(parameters, str, parameters.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager ? getPreferredLanguageFromCaptioningManager(this.context) : null, b), new a((byte) 0));
    }

    @Override // androidx.media3.exoplayer.trackselection.MappingTrackSelector
    public final Pair<RendererConfiguration[], ExoTrackSelection[]> selectTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
        Context context;
        this.playbackThread = Thread.currentThread();
        Boolean bool = this.deviceIsTV;
        if (bool == null && (context = this.context) != null) {
            bool = Boolean.valueOf(Util.isTv(context));
            this.deviceIsTV = bool;
        }
        if (this.playerParameters.constrainAudioChannelCountToDeviceCapabilities && Build.VERSION.SDK_INT >= 32 && this.spatializer == null) {
            this.spatializer = new SpatializerWrapper(this.context, new z1(this, (byte) 5), bool);
        }
        int rendererCount = mappedTrackInfo.getRendererCount();
        ExoTrackSelection.Definition[] definitionArr = new ExoTrackSelection.Definition[rendererCount];
        applyTrackSelectionOverrides(mappedTrackInfo, this.playerParameters, definitionArr);
        applyLegacyRendererOverrides(mappedTrackInfo, this.playerParameters, definitionArr);
        applyRendererDisableOverrides(mappedTrackInfo, this.playerParameters, definitionArr);
        selectAllTracks(definitionArr, mappedTrackInfo, iArr, iArr2, this.playerParameters);
        applyTrackSelectionOverrides(mappedTrackInfo, this.playerParameters, definitionArr);
        applyLegacyRendererOverrides(mappedTrackInfo, this.playerParameters, definitionArr);
        applyRendererDisableOverrides(mappedTrackInfo, this.playerParameters, definitionArr);
        ExoTrackSelection[] createTrackSelections = this.trackSelectionFactory.createTrackSelections(definitionArr, getBandwidthMeter(), mediaPeriodId, timeline);
        RendererConfiguration[] rendererConfigurationArr = new RendererConfiguration[rendererCount];
        for (int i = 0; i < rendererCount; i++) {
            rendererConfigurationArr[i] = (this.playerParameters.getRendererDisabled(i) || this.playerParameters.disabledTrackTypes.contains(Integer.valueOf(mappedTrackInfo.getRendererType(i))) || (mappedTrackInfo.getRendererType(i) != -2 && createTrackSelections[i] == null)) ? null : RendererConfiguration.DEFAULT;
        }
        if (this.playerParameters.tunnelingEnabled) {
            maybeConfigureRenderersForTunneling(mappedTrackInfo, iArr, rendererConfigurationArr, createTrackSelections);
        }
        Parameters parameters = this.playerParameters;
        if (parameters.audioOffloadPreferences.audioOffloadMode != 0) {
            maybeConfigureRendererForOffload(parameters, mappedTrackInfo, iArr, rendererConfigurationArr, createTrackSelections);
        }
        return Pair.create(rendererConfigurationArr, createTrackSelections);
    }

    public Pair<ExoTrackSelection.Definition, Integer> selectVideoTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, final int[] iArr2, final Parameters parameters, final String str) {
        Context context;
        final Point point = null;
        if (parameters.audioOffloadPreferences.audioOffloadMode == 2) {
            return null;
        }
        if (parameters.isViewportSizeLimitedByPhysicalDisplaySize && (context = this.context) != null) {
            point = Util.getCurrentDisplayModeSize(context);
        }
        return selectTracksForType(2, mappedTrackInfo, iArr, new TrackInfo.Factory() { // from class: et0
            @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final List create(int i, TrackGroup trackGroup, int[] iArr3) {
                List lambda$selectVideoTrack$1;
                lambda$selectVideoTrack$1 = DefaultTrackSelector.lambda$selectVideoTrack$1(DefaultTrackSelector.Parameters.this, str, iArr2, point, i, trackGroup, iArr3);
                return lambda$selectVideoTrack$1;
            }
        }, new a((byte) 1));
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public void setAudioAttributes(AudioAttributes audioAttributes) {
        if (this.audioAttributes.equals(audioAttributes)) {
            return;
        }
        this.audioAttributes = audioAttributes;
        maybeInvalidateForAudioChannelCountConstraints();
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public void setParameters(TrackSelectionParameters trackSelectionParameters) {
        if (trackSelectionParameters instanceof Parameters) {
            setParametersInternal((Parameters) trackSelectionParameters);
        }
        setParametersInternal(new Parameters.Builder().set(trackSelectionParameters).build());
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Parameters extends TrackSelectionParameters {
        public static final Parameters DEFAULT;

        @Deprecated
        public static final Parameters DEFAULT_WITHOUT_CONTEXT;
        private static final String FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS;
        private static final String FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS;
        private static final String FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS;
        private static final String FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS;
        private static final String FIELD_ALLOW_AUDIO_NON_SEAMLESS_ADAPTIVENESS;
        private static final String FIELD_ALLOW_INVALIDATE_SELECTIONS_ON_RENDERER_CAPABILITIES_CHANGE;
        private static final String FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS;
        private static final String FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS;
        private static final String FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS;
        private static final String FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS;
        private static final String FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES;
        private static final String FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY;
        private static final String FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY;
        private static final String FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY;
        private static final String FIELD_RENDERER_DISABLED_INDICES;
        private static final String FIELD_SELECTION_OVERRIDES;
        private static final String FIELD_SELECTION_OVERRIDES_RENDERER_INDICES;
        private static final String FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS;
        private static final String FIELD_TUNNELING_ENABLED;
        public final boolean allowAudioMixedChannelCountAdaptiveness;
        public final boolean allowAudioMixedDecoderSupportAdaptiveness;
        public final boolean allowAudioMixedMimeTypeAdaptiveness;
        public final boolean allowAudioMixedSampleRateAdaptiveness;
        public final boolean allowAudioNonSeamlessAdaptiveness;
        public final boolean allowInvalidateSelectionsOnRendererCapabilitiesChange;
        public final boolean allowMultipleAdaptiveSelections;
        public final boolean allowVideoMixedDecoderSupportAdaptiveness;
        public final boolean allowVideoMixedMimeTypeAdaptiveness;
        public final boolean allowVideoNonSeamlessAdaptiveness;
        public final boolean constrainAudioChannelCountToDeviceCapabilities;
        public final boolean exceedAudioConstraintsIfNecessary;
        public final boolean exceedRendererCapabilitiesIfNecessary;
        public final boolean exceedVideoConstraintsIfNecessary;
        private final SparseBooleanArray rendererDisabledFlags;
        private final SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides;
        public final boolean tunnelingEnabled;

        static {
            Parameters build = new Builder().build();
            DEFAULT = build;
            DEFAULT_WITHOUT_CONTEXT = build;
            FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY = Util.intToStringMaxRadix(1000);
            FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS = Util.intToStringMaxRadix(1001);
            FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS = Util.intToStringMaxRadix(1002);
            FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY = Util.intToStringMaxRadix(1003);
            FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS = Util.intToStringMaxRadix(1004);
            FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS = Util.intToStringMaxRadix(1005);
            FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS = Util.intToStringMaxRadix(AnalyticsListener.EVENT_BANDWIDTH_ESTIMATE);
            FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY = Util.intToStringMaxRadix(AnalyticsListener.EVENT_AUDIO_ENABLED);
            FIELD_TUNNELING_ENABLED = Util.intToStringMaxRadix(AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED);
            FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS = Util.intToStringMaxRadix(AnalyticsListener.EVENT_AUDIO_INPUT_FORMAT_CHANGED);
            FIELD_SELECTION_OVERRIDES_RENDERER_INDICES = Util.intToStringMaxRadix(AnalyticsListener.EVENT_AUDIO_POSITION_ADVANCING);
            FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS = Util.intToStringMaxRadix(AnalyticsListener.EVENT_AUDIO_UNDERRUN);
            FIELD_SELECTION_OVERRIDES = Util.intToStringMaxRadix(AnalyticsListener.EVENT_AUDIO_DECODER_RELEASED);
            FIELD_RENDERER_DISABLED_INDICES = Util.intToStringMaxRadix(AnalyticsListener.EVENT_AUDIO_DISABLED);
            FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS = Util.intToStringMaxRadix(AnalyticsListener.EVENT_AUDIO_SINK_ERROR);
            FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS = Util.intToStringMaxRadix(AnalyticsListener.EVENT_VIDEO_ENABLED);
            FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES = Util.intToStringMaxRadix(AnalyticsListener.EVENT_VIDEO_DECODER_INITIALIZED);
            FIELD_ALLOW_INVALIDATE_SELECTIONS_ON_RENDERER_CAPABILITIES_CHANGE = Util.intToStringMaxRadix(AnalyticsListener.EVENT_VIDEO_INPUT_FORMAT_CHANGED);
            FIELD_ALLOW_AUDIO_NON_SEAMLESS_ADAPTIVENESS = Util.intToStringMaxRadix(AnalyticsListener.EVENT_DROPPED_VIDEO_FRAMES);
        }

        private Parameters(Builder builder) {
            super(builder);
            this.exceedVideoConstraintsIfNecessary = builder.exceedVideoConstraintsIfNecessary;
            this.allowVideoMixedMimeTypeAdaptiveness = builder.allowVideoMixedMimeTypeAdaptiveness;
            this.allowVideoNonSeamlessAdaptiveness = builder.allowVideoNonSeamlessAdaptiveness;
            this.allowVideoMixedDecoderSupportAdaptiveness = builder.allowVideoMixedDecoderSupportAdaptiveness;
            this.exceedAudioConstraintsIfNecessary = builder.exceedAudioConstraintsIfNecessary;
            this.allowAudioMixedMimeTypeAdaptiveness = builder.allowAudioMixedMimeTypeAdaptiveness;
            this.allowAudioMixedSampleRateAdaptiveness = builder.allowAudioMixedSampleRateAdaptiveness;
            this.allowAudioMixedChannelCountAdaptiveness = builder.allowAudioMixedChannelCountAdaptiveness;
            this.allowAudioMixedDecoderSupportAdaptiveness = builder.allowAudioMixedDecoderSupportAdaptiveness;
            this.allowAudioNonSeamlessAdaptiveness = builder.allowAudioNonSeamlessAdaptiveness;
            this.constrainAudioChannelCountToDeviceCapabilities = builder.constrainAudioChannelCountToDeviceCapabilities;
            this.exceedRendererCapabilitiesIfNecessary = builder.exceedRendererCapabilitiesIfNecessary;
            this.tunnelingEnabled = builder.tunnelingEnabled;
            this.allowMultipleAdaptiveSelections = builder.allowMultipleAdaptiveSelections;
            this.allowInvalidateSelectionsOnRendererCapabilitiesChange = builder.allowInvalidateSelectionsOnRendererCapabilitiesChange;
            this.selectionOverrides = builder.selectionOverrides;
            this.rendererDisabledFlags = builder.rendererDisabledFlags;
        }

        private static boolean areRendererDisabledFlagsEqual(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean areSelectionOverridesEqual(Map<TrackGroupArray, SelectionOverride> map, Map<TrackGroupArray, SelectionOverride> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<TrackGroupArray, SelectionOverride> entry : map.entrySet()) {
                TrackGroupArray key = entry.getKey();
                if (!map2.containsKey(key) || !Objects.equals(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        public static Parameters fromBundle(Bundle bundle) {
            return new Builder(bundle).build();
        }

        @Deprecated
        public static Parameters getDefaults(Context context) {
            return DEFAULT;
        }

        private static int[] getKeysFromSparseBooleanArray(SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i = 0; i < sparseBooleanArray.size(); i++) {
                iArr[i] = sparseBooleanArray.keyAt(i);
            }
            return iArr;
        }

        private static void putSelectionOverridesToBundle(Bundle bundle, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray2 = new SparseArray();
            for (int i = 0; i < sparseArray.size(); i++) {
                int keyAt = sparseArray.keyAt(i);
                for (Map.Entry<TrackGroupArray, SelectionOverride> entry : sparseArray.valueAt(i).entrySet()) {
                    SelectionOverride value = entry.getValue();
                    if (value != null) {
                        sparseArray2.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(keyAt));
                }
                bundle.putIntArray(FIELD_SELECTION_OVERRIDES_RENDERER_INDICES, sp0.j0(arrayList));
                bundle.putParcelableArrayList(FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS, BundleCollectionUtil.toBundleArrayList(arrayList2, new mm0((byte) 4)));
                bundle.putSparseParcelableArray(FIELD_SELECTION_OVERRIDES, BundleCollectionUtil.toBundleSparseArray(sparseArray2, new mm0((byte) 5)));
            }
        }

        @Override // androidx.media3.common.TrackSelectionParameters
        public Builder buildUpon() {
            return new Builder();
        }

        @Override // androidx.media3.common.TrackSelectionParameters
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Parameters.class == obj.getClass()) {
                Parameters parameters = (Parameters) obj;
                if (super.equals(parameters) && this.exceedVideoConstraintsIfNecessary == parameters.exceedVideoConstraintsIfNecessary && this.allowVideoMixedMimeTypeAdaptiveness == parameters.allowVideoMixedMimeTypeAdaptiveness && this.allowVideoNonSeamlessAdaptiveness == parameters.allowVideoNonSeamlessAdaptiveness && this.allowVideoMixedDecoderSupportAdaptiveness == parameters.allowVideoMixedDecoderSupportAdaptiveness && this.exceedAudioConstraintsIfNecessary == parameters.exceedAudioConstraintsIfNecessary && this.allowAudioMixedMimeTypeAdaptiveness == parameters.allowAudioMixedMimeTypeAdaptiveness && this.allowAudioMixedSampleRateAdaptiveness == parameters.allowAudioMixedSampleRateAdaptiveness && this.allowAudioMixedChannelCountAdaptiveness == parameters.allowAudioMixedChannelCountAdaptiveness && this.allowAudioMixedDecoderSupportAdaptiveness == parameters.allowAudioMixedDecoderSupportAdaptiveness && this.allowAudioNonSeamlessAdaptiveness == parameters.allowAudioNonSeamlessAdaptiveness && this.constrainAudioChannelCountToDeviceCapabilities == parameters.constrainAudioChannelCountToDeviceCapabilities && this.exceedRendererCapabilitiesIfNecessary == parameters.exceedRendererCapabilitiesIfNecessary && this.tunnelingEnabled == parameters.tunnelingEnabled && this.allowMultipleAdaptiveSelections == parameters.allowMultipleAdaptiveSelections && this.allowInvalidateSelectionsOnRendererCapabilitiesChange == parameters.allowInvalidateSelectionsOnRendererCapabilitiesChange && areRendererDisabledFlagsEqual(this.rendererDisabledFlags, parameters.rendererDisabledFlags) && areSelectionOverridesEqual(this.selectionOverrides, parameters.selectionOverrides)) {
                    return true;
                }
            }
            return false;
        }

        public boolean getRendererDisabled(int i) {
            return this.rendererDisabledFlags.get(i);
        }

        @Deprecated
        public SelectionOverride getSelectionOverride(int i, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i);
            if (map != null) {
                return map.get(trackGroupArray);
            }
            return null;
        }

        @Deprecated
        public boolean hasSelectionOverride(int i, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i);
            return map != null && map.containsKey(trackGroupArray);
        }

        @Override // androidx.media3.common.TrackSelectionParameters
        public int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.exceedVideoConstraintsIfNecessary ? 1 : 0)) * 31) + (this.allowVideoMixedMimeTypeAdaptiveness ? 1 : 0)) * 31) + (this.allowVideoNonSeamlessAdaptiveness ? 1 : 0)) * 31) + (this.allowVideoMixedDecoderSupportAdaptiveness ? 1 : 0)) * 31) + (this.exceedAudioConstraintsIfNecessary ? 1 : 0)) * 31) + (this.allowAudioMixedMimeTypeAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedSampleRateAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedChannelCountAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedDecoderSupportAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioNonSeamlessAdaptiveness ? 1 : 0)) * 31) + (this.constrainAudioChannelCountToDeviceCapabilities ? 1 : 0)) * 31) + (this.exceedRendererCapabilitiesIfNecessary ? 1 : 0)) * 31) + (this.tunnelingEnabled ? 1 : 0)) * 31) + (this.allowMultipleAdaptiveSelections ? 1 : 0)) * 31) + (this.allowInvalidateSelectionsOnRendererCapabilitiesChange ? 1 : 0);
        }

        @Override // androidx.media3.common.TrackSelectionParameters
        public Bundle toBundle() {
            Bundle bundle = super.toBundle();
            bundle.putBoolean(FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY, this.exceedVideoConstraintsIfNecessary);
            bundle.putBoolean(FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS, this.allowVideoMixedMimeTypeAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS, this.allowVideoNonSeamlessAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS, this.allowVideoMixedDecoderSupportAdaptiveness);
            bundle.putBoolean(FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY, this.exceedAudioConstraintsIfNecessary);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS, this.allowAudioMixedMimeTypeAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS, this.allowAudioMixedSampleRateAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS, this.allowAudioMixedChannelCountAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS, this.allowAudioMixedDecoderSupportAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_NON_SEAMLESS_ADAPTIVENESS, this.allowAudioNonSeamlessAdaptiveness);
            bundle.putBoolean(FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES, this.constrainAudioChannelCountToDeviceCapabilities);
            bundle.putBoolean(FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY, this.exceedRendererCapabilitiesIfNecessary);
            bundle.putBoolean(FIELD_TUNNELING_ENABLED, this.tunnelingEnabled);
            bundle.putBoolean(FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS, this.allowMultipleAdaptiveSelections);
            bundle.putBoolean(FIELD_ALLOW_INVALIDATE_SELECTIONS_ON_RENDERER_CAPABILITIES_CHANGE, this.allowInvalidateSelectionsOnRendererCapabilitiesChange);
            putSelectionOverridesToBundle(bundle, this.selectionOverrides);
            bundle.putIntArray(FIELD_RENDERER_DISABLED_INDICES, getKeysFromSparseBooleanArray(this.rendererDisabledFlags));
            return bundle;
        }

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        public static final class Builder extends TrackSelectionParameters.Builder {
            private boolean allowAudioMixedChannelCountAdaptiveness;
            private boolean allowAudioMixedDecoderSupportAdaptiveness;
            private boolean allowAudioMixedMimeTypeAdaptiveness;
            private boolean allowAudioMixedSampleRateAdaptiveness;
            private boolean allowAudioNonSeamlessAdaptiveness;
            private boolean allowInvalidateSelectionsOnRendererCapabilitiesChange;
            private boolean allowMultipleAdaptiveSelections;
            private boolean allowVideoMixedDecoderSupportAdaptiveness;
            private boolean allowVideoMixedMimeTypeAdaptiveness;
            private boolean allowVideoNonSeamlessAdaptiveness;
            private boolean constrainAudioChannelCountToDeviceCapabilities;
            private boolean exceedAudioConstraintsIfNecessary;
            private boolean exceedRendererCapabilitiesIfNecessary;
            private boolean exceedVideoConstraintsIfNecessary;
            private final SparseBooleanArray rendererDisabledFlags;
            private final SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides;
            private boolean tunnelingEnabled;

            private Builder(Bundle bundle) {
                super(bundle);
                init();
                Parameters parameters = Parameters.DEFAULT;
                setExceedVideoConstraintsIfNecessary(bundle.getBoolean(Parameters.FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY, parameters.exceedVideoConstraintsIfNecessary));
                setAllowVideoMixedMimeTypeAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS, parameters.allowVideoMixedMimeTypeAdaptiveness));
                setAllowVideoNonSeamlessAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS, parameters.allowVideoNonSeamlessAdaptiveness));
                setAllowVideoMixedDecoderSupportAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS, parameters.allowVideoMixedDecoderSupportAdaptiveness));
                setExceedAudioConstraintsIfNecessary(bundle.getBoolean(Parameters.FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY, parameters.exceedAudioConstraintsIfNecessary));
                setAllowAudioMixedMimeTypeAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS, parameters.allowAudioMixedMimeTypeAdaptiveness));
                setAllowAudioMixedSampleRateAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS, parameters.allowAudioMixedSampleRateAdaptiveness));
                setAllowAudioMixedChannelCountAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS, parameters.allowAudioMixedChannelCountAdaptiveness));
                setAllowAudioMixedDecoderSupportAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS, parameters.allowAudioMixedDecoderSupportAdaptiveness));
                setAllowAudioNonSeamlessAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_AUDIO_NON_SEAMLESS_ADAPTIVENESS, parameters.allowAudioNonSeamlessAdaptiveness));
                setConstrainAudioChannelCountToDeviceCapabilities(bundle.getBoolean(Parameters.FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES, parameters.constrainAudioChannelCountToDeviceCapabilities));
                setExceedRendererCapabilitiesIfNecessary(bundle.getBoolean(Parameters.FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY, parameters.exceedRendererCapabilitiesIfNecessary));
                setTunnelingEnabled(bundle.getBoolean(Parameters.FIELD_TUNNELING_ENABLED, parameters.tunnelingEnabled));
                setAllowMultipleAdaptiveSelections(bundle.getBoolean(Parameters.FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS, parameters.allowMultipleAdaptiveSelections));
                setAllowInvalidateSelectionsOnRendererCapabilitiesChange(bundle.getBoolean(Parameters.FIELD_ALLOW_INVALIDATE_SELECTIONS_ON_RENDERER_CAPABILITIES_CHANGE, parameters.allowInvalidateSelectionsOnRendererCapabilitiesChange));
                this.selectionOverrides = new SparseArray<>();
                setSelectionOverridesFromBundle(bundle);
                this.rendererDisabledFlags = makeSparseBooleanArrayFromTrueKeys(bundle.getIntArray(Parameters.FIELD_RENDERER_DISABLED_INDICES));
            }

            private static SparseArray<Map<TrackGroupArray, SelectionOverride>> cloneSelectionOverrides(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
                SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2 = new SparseArray<>();
                for (int i = 0; i < sparseArray.size(); i++) {
                    sparseArray2.put(sparseArray.keyAt(i), new HashMap(sparseArray.valueAt(i)));
                }
                return sparseArray2;
            }

            private void init() {
                this.exceedVideoConstraintsIfNecessary = true;
                this.allowVideoMixedMimeTypeAdaptiveness = false;
                this.allowVideoNonSeamlessAdaptiveness = true;
                this.allowVideoMixedDecoderSupportAdaptiveness = false;
                this.exceedAudioConstraintsIfNecessary = true;
                this.allowAudioMixedMimeTypeAdaptiveness = false;
                this.allowAudioMixedSampleRateAdaptiveness = false;
                this.allowAudioMixedChannelCountAdaptiveness = false;
                this.allowAudioMixedDecoderSupportAdaptiveness = false;
                this.allowAudioNonSeamlessAdaptiveness = true;
                this.constrainAudioChannelCountToDeviceCapabilities = true;
                this.exceedRendererCapabilitiesIfNecessary = true;
                this.tunnelingEnabled = false;
                this.allowMultipleAdaptiveSelections = true;
                this.allowInvalidateSelectionsOnRendererCapabilitiesChange = false;
            }

            private SparseBooleanArray makeSparseBooleanArrayFromTrueKeys(int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int i : iArr) {
                    sparseBooleanArray.append(i, true);
                }
                return sparseBooleanArray;
            }

            private void setSelectionOverridesFromBundle(Bundle bundle) {
                List fromBundleList;
                int[] intArray = bundle.getIntArray(Parameters.FIELD_SELECTION_OVERRIDES_RENDERER_INDICES);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(Parameters.FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS);
                if (parcelableArrayList == null) {
                    ay1 ay1Var = dy1.J;
                    fromBundleList = x24.M;
                } else {
                    fromBundleList = BundleCollectionUtil.fromBundleList(new mm0((byte) 6), parcelableArrayList);
                }
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(Parameters.FIELD_SELECTION_OVERRIDES);
                SparseArray sparseArray = sparseParcelableArray == null ? new SparseArray() : BundleCollectionUtil.fromBundleSparseArray(new mm0((byte) 7), sparseParcelableArray);
                if (intArray == null || intArray.length != fromBundleList.size()) {
                    return;
                }
                for (int i = 0; i < intArray.length; i++) {
                    setSelectionOverride(intArray[i], (TrackGroupArray) fromBundleList.get(i), (SelectionOverride) sparseArray.get(i));
                }
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Parameters build() {
                return new Parameters(this);
            }

            @Deprecated
            public Builder clearSelectionOverride(int i, TrackGroupArray trackGroupArray) {
                Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i);
                if (map != null && map.containsKey(trackGroupArray)) {
                    map.remove(trackGroupArray);
                    if (map.isEmpty()) {
                        this.selectionOverrides.remove(i);
                    }
                }
                return this;
            }

            @Deprecated
            public Builder clearSelectionOverrides(int i) {
                Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i);
                if (map != null && !map.isEmpty()) {
                    this.selectionOverrides.remove(i);
                }
                return this;
            }

            public Builder setAllowAudioMixedChannelCountAdaptiveness(boolean z) {
                this.allowAudioMixedChannelCountAdaptiveness = z;
                return this;
            }

            public Builder setAllowAudioMixedDecoderSupportAdaptiveness(boolean z) {
                this.allowAudioMixedDecoderSupportAdaptiveness = z;
                return this;
            }

            public Builder setAllowAudioMixedMimeTypeAdaptiveness(boolean z) {
                this.allowAudioMixedMimeTypeAdaptiveness = z;
                return this;
            }

            public Builder setAllowAudioMixedSampleRateAdaptiveness(boolean z) {
                this.allowAudioMixedSampleRateAdaptiveness = z;
                return this;
            }

            public Builder setAllowAudioNonSeamlessAdaptiveness(boolean z) {
                this.allowAudioNonSeamlessAdaptiveness = z;
                return this;
            }

            public Builder setAllowInvalidateSelectionsOnRendererCapabilitiesChange(boolean z) {
                this.allowInvalidateSelectionsOnRendererCapabilitiesChange = z;
                return this;
            }

            public Builder setAllowMultipleAdaptiveSelections(boolean z) {
                this.allowMultipleAdaptiveSelections = z;
                return this;
            }

            public Builder setAllowVideoMixedDecoderSupportAdaptiveness(boolean z) {
                this.allowVideoMixedDecoderSupportAdaptiveness = z;
                return this;
            }

            public Builder setAllowVideoMixedMimeTypeAdaptiveness(boolean z) {
                this.allowVideoMixedMimeTypeAdaptiveness = z;
                return this;
            }

            public Builder setAllowVideoNonSeamlessAdaptiveness(boolean z) {
                this.allowVideoNonSeamlessAdaptiveness = z;
                return this;
            }

            public Builder setConstrainAudioChannelCountToDeviceCapabilities(boolean z) {
                this.constrainAudioChannelCountToDeviceCapabilities = z;
                return this;
            }

            @Deprecated
            public Builder setDisabledTextTrackSelectionFlags(int i) {
                return setIgnoredTextSelectionFlags(i);
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setDisabledTrackTypes(Set set) {
                return setDisabledTrackTypes((Set<Integer>) set);
            }

            public Builder setExceedAudioConstraintsIfNecessary(boolean z) {
                this.exceedAudioConstraintsIfNecessary = z;
                return this;
            }

            public Builder setExceedRendererCapabilitiesIfNecessary(boolean z) {
                this.exceedRendererCapabilitiesIfNecessary = z;
                return this;
            }

            public Builder setExceedVideoConstraintsIfNecessary(boolean z) {
                this.exceedVideoConstraintsIfNecessary = z;
                return this;
            }

            public Builder setRendererDisabled(int i, boolean z) {
                if (this.rendererDisabledFlags.get(i) == z) {
                    return this;
                }
                SparseBooleanArray sparseBooleanArray = this.rendererDisabledFlags;
                if (z) {
                    sparseBooleanArray.put(i, true);
                    return this;
                }
                sparseBooleanArray.delete(i);
                return this;
            }

            @Deprecated
            public Builder setSelectionOverride(int i, TrackGroupArray trackGroupArray, SelectionOverride selectionOverride) {
                Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i);
                if (map == null) {
                    map = new HashMap<>();
                    this.selectionOverrides.put(i, map);
                }
                if (map.containsKey(trackGroupArray) && Objects.equals(map.get(trackGroupArray), selectionOverride)) {
                    return this;
                }
                map.put(trackGroupArray, selectionOverride);
                return this;
            }

            public Builder setTunnelingEnabled(boolean z) {
                this.tunnelingEnabled = z;
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder addOverride(TrackSelectionOverride trackSelectionOverride) {
                super.addOverride(trackSelectionOverride);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder clearOverride(TrackGroup trackGroup) {
                super.clearOverride(trackGroup);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder clearOverrides() {
                super.clearOverrides();
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder clearOverridesOfType(int i) {
                super.clearOverridesOfType(i);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder clearVideoSizeConstraints() {
                super.clearVideoSizeConstraints();
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder clearViewportSizeConstraints() {
                super.clearViewportSizeConstraints();
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder set(TrackSelectionParameters trackSelectionParameters) {
                super.set(trackSelectionParameters);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setAudioOffloadPreferences(TrackSelectionParameters.AudioOffloadPreferences audioOffloadPreferences) {
                super.setAudioOffloadPreferences(audioOffloadPreferences);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setDisabledTrackTypes(Set<Integer> set) {
                super.setDisabledTrackTypes(set);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setForceHighestSupportedBitrate(boolean z) {
                super.setForceHighestSupportedBitrate(z);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setForceLowestBitrate(boolean z) {
                super.setForceLowestBitrate(z);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setIgnoredTextSelectionFlags(int i) {
                super.setIgnoredTextSelectionFlags(i);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setMaxAudioBitrate(int i) {
                super.setMaxAudioBitrate(i);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setMaxAudioChannelCount(int i) {
                super.setMaxAudioChannelCount(i);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setMaxVideoBitrate(int i) {
                super.setMaxVideoBitrate(i);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setMaxVideoFrameRate(int i) {
                super.setMaxVideoFrameRate(i);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setMaxVideoSize(int i, int i2) {
                super.setMaxVideoSize(i, i2);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setMaxVideoSizeSd() {
                super.setMaxVideoSizeSd();
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setMinVideoBitrate(int i) {
                super.setMinVideoBitrate(i);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setMinVideoFrameRate(int i) {
                super.setMinVideoFrameRate(i);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setMinVideoSize(int i, int i2) {
                super.setMinVideoSize(i, i2);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setOverrideForType(TrackSelectionOverride trackSelectionOverride) {
                super.setOverrideForType(trackSelectionOverride);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setPreferredAudioLabels(String... strArr) {
                super.setPreferredAudioLabels(strArr);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setPreferredAudioLanguage(String str) {
                super.setPreferredAudioLanguage(str);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setPreferredAudioLanguages(String... strArr) {
                super.setPreferredAudioLanguages(strArr);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setPreferredAudioMimeType(String str) {
                super.setPreferredAudioMimeType(str);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setPreferredAudioMimeTypes(String... strArr) {
                super.setPreferredAudioMimeTypes(strArr);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setPreferredAudioRoleFlags(int i) {
                super.setPreferredAudioRoleFlags(i);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setPreferredTextLabels(String... strArr) {
                super.setPreferredTextLabels(strArr);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setPreferredTextLanguage(String str) {
                super.setPreferredTextLanguage(str);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setPreferredTextLanguages(String... strArr) {
                super.setPreferredTextLanguages(strArr);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setPreferredTextRoleFlags(int i) {
                super.setPreferredTextRoleFlags(i);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setPreferredVideoLabels(String... strArr) {
                super.setPreferredVideoLabels(strArr);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setPreferredVideoLanguage(String str) {
                super.setPreferredVideoLanguage(str);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setPreferredVideoLanguages(String... strArr) {
                super.setPreferredVideoLanguages(strArr);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setPreferredVideoMimeType(String str) {
                super.setPreferredVideoMimeType(str);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setPreferredVideoMimeTypes(String... strArr) {
                super.setPreferredVideoMimeTypes(strArr);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setPreferredVideoRoleFlags(int i) {
                super.setPreferredVideoRoleFlags(i);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setPrioritizeImageOverVideoEnabled(boolean z) {
                super.setPrioritizeImageOverVideoEnabled(z);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setSelectTextByDefault(boolean z) {
                super.setSelectTextByDefault(z);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setSelectUndeterminedTextLanguage(boolean z) {
                super.setSelectUndeterminedTextLanguage(z);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setTrackTypeDisabled(int i, boolean z) {
                super.setTrackTypeDisabled(i, z);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setViewportSize(int i, int i2, boolean z) {
                super.setViewportSize(i, i2, z);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings() {
                super.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings();
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Builder setViewportSizeToPhysicalDisplaySize(boolean z) {
                super.setViewportSizeToPhysicalDisplaySize(z);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @Deprecated
            public Builder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
                super.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @Deprecated
            public Builder setViewportSizeToPhysicalDisplaySize(Context context, boolean z) {
                super.setViewportSizeToPhysicalDisplaySize(context, z);
                return this;
            }

            @Deprecated
            public Builder clearSelectionOverrides() {
                if (this.selectionOverrides.size() == 0) {
                    return this;
                }
                this.selectionOverrides.clear();
                return this;
            }

            public Builder() {
                this.selectionOverrides = new SparseArray<>();
                this.rendererDisabledFlags = new SparseBooleanArray();
                init();
            }

            @Deprecated
            public Builder(Context context) {
                this();
            }

            private Builder(Parameters parameters) {
                super(parameters);
                this.exceedVideoConstraintsIfNecessary = parameters.exceedVideoConstraintsIfNecessary;
                this.allowVideoMixedMimeTypeAdaptiveness = parameters.allowVideoMixedMimeTypeAdaptiveness;
                this.allowVideoNonSeamlessAdaptiveness = parameters.allowVideoNonSeamlessAdaptiveness;
                this.allowVideoMixedDecoderSupportAdaptiveness = parameters.allowVideoMixedDecoderSupportAdaptiveness;
                this.exceedAudioConstraintsIfNecessary = parameters.exceedAudioConstraintsIfNecessary;
                this.allowAudioMixedMimeTypeAdaptiveness = parameters.allowAudioMixedMimeTypeAdaptiveness;
                this.allowAudioMixedSampleRateAdaptiveness = parameters.allowAudioMixedSampleRateAdaptiveness;
                this.allowAudioMixedChannelCountAdaptiveness = parameters.allowAudioMixedChannelCountAdaptiveness;
                this.allowAudioMixedDecoderSupportAdaptiveness = parameters.allowAudioMixedDecoderSupportAdaptiveness;
                this.allowAudioNonSeamlessAdaptiveness = parameters.allowAudioNonSeamlessAdaptiveness;
                this.constrainAudioChannelCountToDeviceCapabilities = parameters.constrainAudioChannelCountToDeviceCapabilities;
                this.exceedRendererCapabilitiesIfNecessary = parameters.exceedRendererCapabilitiesIfNecessary;
                this.tunnelingEnabled = parameters.tunnelingEnabled;
                this.allowMultipleAdaptiveSelections = parameters.allowMultipleAdaptiveSelections;
                this.allowInvalidateSelectionsOnRendererCapabilitiesChange = parameters.allowInvalidateSelectionsOnRendererCapabilitiesChange;
                this.selectionOverrides = cloneSelectionOverrides(parameters.selectionOverrides);
                this.rendererDisabledFlags = parameters.rendererDisabledFlags.clone();
            }
        }

        private static boolean areSelectionOverridesEqual(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (indexOfKey < 0 || !areSelectionOverridesEqual(sparseArray.valueAt(i), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Deprecated
    /* loaded from: classes2.dex */
    public static final class ParametersBuilder extends TrackSelectionParameters.Builder {
        private final Parameters.Builder delegate = new Parameters.Builder();

        public ParametersBuilder() {
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder addOverride(TrackSelectionOverride trackSelectionOverride) {
            this.delegate.addOverride(trackSelectionOverride);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public Parameters build() {
            return this.delegate.build();
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder clearOverride(TrackGroup trackGroup) {
            this.delegate.clearOverride(trackGroup);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder clearOverrides() {
            this.delegate.clearOverrides();
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder clearOverridesOfType(int i) {
            this.delegate.clearOverridesOfType(i);
            return this;
        }

        @Deprecated
        public ParametersBuilder clearSelectionOverride(int i, TrackGroupArray trackGroupArray) {
            this.delegate.clearSelectionOverride(i, trackGroupArray);
            return this;
        }

        @Deprecated
        public ParametersBuilder clearSelectionOverrides(int i) {
            this.delegate.clearSelectionOverrides(i);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder clearVideoSizeConstraints() {
            this.delegate.clearVideoSizeConstraints();
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder clearViewportSizeConstraints() {
            this.delegate.clearViewportSizeConstraints();
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder set(TrackSelectionParameters trackSelectionParameters) {
            this.delegate.set(trackSelectionParameters);
            return this;
        }

        public ParametersBuilder setAllowAudioMixedChannelCountAdaptiveness(boolean z) {
            this.delegate.setAllowAudioMixedChannelCountAdaptiveness(z);
            return this;
        }

        public ParametersBuilder setAllowAudioMixedDecoderSupportAdaptiveness(boolean z) {
            this.delegate.setAllowAudioMixedDecoderSupportAdaptiveness(z);
            return this;
        }

        public ParametersBuilder setAllowAudioMixedMimeTypeAdaptiveness(boolean z) {
            this.delegate.setAllowAudioMixedMimeTypeAdaptiveness(z);
            return this;
        }

        public ParametersBuilder setAllowAudioMixedSampleRateAdaptiveness(boolean z) {
            this.delegate.setAllowAudioMixedSampleRateAdaptiveness(z);
            return this;
        }

        public ParametersBuilder setAllowMultipleAdaptiveSelections(boolean z) {
            this.delegate.setAllowMultipleAdaptiveSelections(z);
            return this;
        }

        public ParametersBuilder setAllowVideoMixedDecoderSupportAdaptiveness(boolean z) {
            this.delegate.setAllowVideoMixedDecoderSupportAdaptiveness(z);
            return this;
        }

        public ParametersBuilder setAllowVideoMixedMimeTypeAdaptiveness(boolean z) {
            this.delegate.setAllowVideoMixedMimeTypeAdaptiveness(z);
            return this;
        }

        public ParametersBuilder setAllowVideoNonSeamlessAdaptiveness(boolean z) {
            this.delegate.setAllowVideoNonSeamlessAdaptiveness(z);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setAudioOffloadPreferences(TrackSelectionParameters.AudioOffloadPreferences audioOffloadPreferences) {
            this.delegate.setAudioOffloadPreferences(audioOffloadPreferences);
            return this;
        }

        @Deprecated
        public ParametersBuilder setDisabledTextTrackSelectionFlags(int i) {
            this.delegate.setDisabledTextTrackSelectionFlags(i);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setDisabledTrackTypes(Set<Integer> set) {
            this.delegate.setDisabledTrackTypes(set);
            return this;
        }

        public ParametersBuilder setExceedAudioConstraintsIfNecessary(boolean z) {
            this.delegate.setExceedAudioConstraintsIfNecessary(z);
            return this;
        }

        public ParametersBuilder setExceedRendererCapabilitiesIfNecessary(boolean z) {
            this.delegate.setExceedRendererCapabilitiesIfNecessary(z);
            return this;
        }

        public ParametersBuilder setExceedVideoConstraintsIfNecessary(boolean z) {
            this.delegate.setExceedVideoConstraintsIfNecessary(z);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setForceHighestSupportedBitrate(boolean z) {
            this.delegate.setForceHighestSupportedBitrate(z);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setForceLowestBitrate(boolean z) {
            this.delegate.setForceLowestBitrate(z);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setIgnoredTextSelectionFlags(int i) {
            this.delegate.setIgnoredTextSelectionFlags(i);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxAudioBitrate(int i) {
            this.delegate.setMaxAudioBitrate(i);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxAudioChannelCount(int i) {
            this.delegate.setMaxAudioChannelCount(i);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxVideoBitrate(int i) {
            this.delegate.setMaxVideoBitrate(i);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxVideoFrameRate(int i) {
            this.delegate.setMaxVideoFrameRate(i);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxVideoSize(int i, int i2) {
            this.delegate.setMaxVideoSize(i, i2);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxVideoSizeSd() {
            this.delegate.setMaxVideoSizeSd();
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setMinVideoBitrate(int i) {
            this.delegate.setMinVideoBitrate(i);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setMinVideoFrameRate(int i) {
            this.delegate.setMinVideoFrameRate(i);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setMinVideoSize(int i, int i2) {
            this.delegate.setMinVideoSize(i, i2);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setOverrideForType(TrackSelectionOverride trackSelectionOverride) {
            this.delegate.setOverrideForType(trackSelectionOverride);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioLabels(String... strArr) {
            this.delegate.setPreferredAudioLabels(strArr);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioLanguage(String str) {
            this.delegate.setPreferredAudioLanguage(str);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioLanguages(String... strArr) {
            this.delegate.setPreferredAudioLanguages(strArr);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioMimeType(String str) {
            this.delegate.setPreferredAudioMimeType(str);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioMimeTypes(String... strArr) {
            this.delegate.setPreferredAudioMimeTypes(strArr);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioRoleFlags(int i) {
            this.delegate.setPreferredAudioRoleFlags(i);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredTextLabels(String... strArr) {
            this.delegate.setPreferredTextLabels(strArr);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredTextLanguage(String str) {
            this.delegate.setPreferredTextLanguage(str);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings() {
            this.delegate.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings();
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredTextLanguages(String... strArr) {
            this.delegate.setPreferredTextLanguages(strArr);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredTextRoleFlags(int i) {
            this.delegate.setPreferredTextRoleFlags(i);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredVideoLabels(String... strArr) {
            this.delegate.setPreferredVideoLabels(strArr);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredVideoLanguage(String str) {
            this.delegate.setPreferredVideoLanguage(str);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredVideoLanguages(String... strArr) {
            this.delegate.setPreferredVideoLanguages(strArr);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredVideoMimeType(String str) {
            this.delegate.setPreferredVideoMimeType(str);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredVideoMimeTypes(String... strArr) {
            this.delegate.setPreferredVideoMimeTypes(strArr);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredVideoRoleFlags(int i) {
            this.delegate.setPreferredVideoRoleFlags(i);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setPrioritizeImageOverVideoEnabled(boolean z) {
            this.delegate.setPrioritizeImageOverVideoEnabled(z);
            return this;
        }

        public ParametersBuilder setRendererDisabled(int i, boolean z) {
            this.delegate.setRendererDisabled(i, z);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setSelectTextByDefault(boolean z) {
            this.delegate.setSelectTextByDefault(z);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setSelectUndeterminedTextLanguage(boolean z) {
            this.delegate.setSelectUndeterminedTextLanguage(z);
            return this;
        }

        @Deprecated
        public ParametersBuilder setSelectionOverride(int i, TrackGroupArray trackGroupArray, SelectionOverride selectionOverride) {
            this.delegate.setSelectionOverride(i, trackGroupArray, selectionOverride);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setTrackTypeDisabled(int i, boolean z) {
            this.delegate.setTrackTypeDisabled(i, z);
            return this;
        }

        public ParametersBuilder setTunnelingEnabled(boolean z) {
            this.delegate.setTunnelingEnabled(z);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setViewportSize(int i, int i2, boolean z) {
            this.delegate.setViewportSize(i, i2, z);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setViewportSizeToPhysicalDisplaySize(boolean z) {
            this.delegate.setViewportSizeToPhysicalDisplaySize(z);
            return this;
        }

        @Deprecated
        public ParametersBuilder clearSelectionOverrides() {
            this.delegate.clearSelectionOverrides();
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setDisabledTrackTypes(Set set) {
            return setDisabledTrackTypes((Set<Integer>) set);
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
            this.delegate.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public ParametersBuilder setViewportSizeToPhysicalDisplaySize(Context context, boolean z) {
            this.delegate.setViewportSizeToPhysicalDisplaySize(context, z);
            return this;
        }

        public ParametersBuilder(Context context) {
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public Parameters getParameters() {
        return this.applicationParameters;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class ImageTrackInfo extends TrackInfo<ImageTrackInfo> implements Comparable<ImageTrackInfo> {
        private final int pixelCount;
        private final int selectionEligibility;

        public ImageTrackInfo(int i, TrackGroup trackGroup, int i2, Parameters parameters, int i3) {
            super(i, trackGroup, i2);
            this.selectionEligibility = hf1.m(i3, parameters.exceedRendererCapabilitiesIfNecessary) ? 1 : 0;
            this.pixelCount = this.format.getPixelCount();
        }

        public static int compareSelections(List<ImageTrackInfo> list, List<ImageTrackInfo> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static dy1 createForTrackGroup(int i, TrackGroup trackGroup, Parameters parameters, int[] iArr) {
            zx1 n = dy1.n();
            for (int i2 = 0; i2 < trackGroup.length; i2++) {
                n.c(new ImageTrackInfo(i, trackGroup, i2, parameters, iArr[i2]));
            }
            return n.f();
        }

        @Override // java.lang.Comparable
        public int compareTo(ImageTrackInfo imageTrackInfo) {
            return Integer.compare(this.pixelCount, imageTrackInfo.pixelCount);
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(ImageTrackInfo imageTrackInfo) {
            return false;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class TextTrackInfo extends TrackInfo<TextTrackInfo> implements Comparable<TextTrackInfo> {
        private final boolean hasCaptionRoleFlags;
        private final boolean isDefault;
        private final boolean isForced;
        private final boolean isWithinRendererCapabilities;
        private final int preferredLabelMatchIndex;
        private final int preferredLanguageIndex;
        private final int preferredLanguageScore;
        private final int preferredRoleFlagsScore;
        private final int selectedAudioLanguageScore;
        private final int selectionEligibility;

        public TextTrackInfo(int i, TrackGroup trackGroup, int i2, Parameters parameters, int i3, String str, String str2) {
            super(i, trackGroup, i2);
            int i4;
            int i5 = 0;
            this.isWithinRendererCapabilities = hf1.m(i3, false);
            int i6 = this.format.selectionFlags & (~parameters.ignoredTextSelectionFlags);
            this.isDefault = (i6 & 1) != 0;
            this.isForced = (i6 & 2) != 0;
            dy1 t = str2 != null ? dy1.t(str2) : parameters.preferredTextLanguages.isEmpty() ? dy1.t("") : parameters.preferredTextLanguages;
            int i7 = 0;
            while (true) {
                if (i7 >= t.size()) {
                    i4 = 0;
                    i7 = Integer.MAX_VALUE;
                    break;
                } else {
                    i4 = DefaultTrackSelector.getFormatLanguageScore(this.format, (String) t.get(i7), parameters.selectUndeterminedTextLanguage);
                    if (i4 > 0) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.preferredLanguageIndex = i7;
            this.preferredLanguageScore = i4;
            int roleFlagMatchScore = DefaultTrackSelector.getRoleFlagMatchScore(this.format.roleFlags, str2 != null ? 1088 : parameters.preferredTextRoleFlags);
            this.preferredRoleFlagsScore = roleFlagMatchScore;
            Format format = this.format;
            this.hasCaptionRoleFlags = (1088 & format.roleFlags) != 0;
            int bestLabelMatchIndex = DefaultTrackSelector.getBestLabelMatchIndex(format, parameters.preferredTextLabels);
            this.preferredLabelMatchIndex = bestLabelMatchIndex;
            int formatLanguageScore = DefaultTrackSelector.getFormatLanguageScore(this.format, str, DefaultTrackSelector.normalizeUndeterminedLanguageToNull(str) == null);
            this.selectedAudioLanguageScore = formatLanguageScore;
            boolean z = i4 > 0 || (parameters.preferredTextLanguages.isEmpty() && roleFlagMatchScore > 0) || ((parameters.preferredTextLanguages.isEmpty() && bestLabelMatchIndex != Integer.MAX_VALUE) || this.isDefault || ((this.isForced && formatLanguageScore > 0) || parameters.selectTextByDefault));
            if (hf1.m(i3, parameters.exceedRendererCapabilitiesIfNecessary) && z) {
                i5 = 1;
            }
            this.selectionEligibility = i5;
        }

        public static int compareSelections(List<TextTrackInfo> list, List<TextTrackInfo> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static dy1 createForTrackGroup(int i, TrackGroup trackGroup, Parameters parameters, int[] iArr, String str, String str2) {
            zx1 n = dy1.n();
            for (int i2 = 0; i2 < trackGroup.length; i2++) {
                n.c(new TextTrackInfo(i, trackGroup, i2, parameters, iArr[i2], str, str2));
            }
            return n.f();
        }

        @Override // java.lang.Comparable
        public int compareTo(TextTrackInfo textTrackInfo) {
            ob0 d = ob0.a.d(this.isWithinRendererCapabilities, textTrackInfo.isWithinRendererCapabilities);
            Integer valueOf = Integer.valueOf(this.preferredLanguageIndex);
            Integer valueOf2 = Integer.valueOf(textTrackInfo.preferredLanguageIndex);
            Comparator comparator = o54.I;
            ob0 d2 = d.c(valueOf, valueOf2, comparator).a(this.preferredLanguageScore, textTrackInfo.preferredLanguageScore).a(this.preferredRoleFlagsScore, textTrackInfo.preferredRoleFlagsScore).c(Integer.valueOf(this.preferredLabelMatchIndex), Integer.valueOf(textTrackInfo.preferredLabelMatchIndex), comparator).d(this.isDefault, textTrackInfo.isDefault);
            Boolean valueOf3 = Boolean.valueOf(this.isForced);
            Boolean valueOf4 = Boolean.valueOf(textTrackInfo.isForced);
            if (this.preferredLanguageScore == 0) {
                comparator = m63.I;
            }
            ob0 a = d2.c(valueOf3, valueOf4, comparator).a(this.selectedAudioLanguageScore, textTrackInfo.selectedAudioLanguageScore);
            if (this.preferredRoleFlagsScore == 0) {
                a = a.e(this.hasCaptionRoleFlags, textTrackInfo.hasCaptionRoleFlags);
            }
            return a.f();
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(TextTrackInfo textTrackInfo) {
            return false;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class SelectionOverride {
        private static final String FIELD_GROUP_INDEX = Util.intToStringMaxRadix(0);
        private static final String FIELD_TRACKS = Util.intToStringMaxRadix(1);
        private static final String FIELD_TRACK_TYPE = Util.intToStringMaxRadix(2);
        public final int groupIndex;
        public final int length;
        public final int[] tracks;
        public final int type;

        public SelectionOverride(int i, int[] iArr, int i2) {
            this.groupIndex = i;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.tracks = copyOf;
            this.length = iArr.length;
            this.type = i2;
            Arrays.sort(copyOf);
        }

        public static SelectionOverride fromBundle(Bundle bundle) {
            int i = bundle.getInt(FIELD_GROUP_INDEX, -1);
            int[] intArray = bundle.getIntArray(FIELD_TRACKS);
            int i2 = bundle.getInt(FIELD_TRACK_TYPE, -1);
            sp0.o(i >= 0 && i2 >= 0);
            intArray.getClass();
            return new SelectionOverride(i, intArray, i2);
        }

        public boolean containsTrack(int i) {
            for (int i2 : this.tracks) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && SelectionOverride.class == obj.getClass()) {
                SelectionOverride selectionOverride = (SelectionOverride) obj;
                if (this.groupIndex == selectionOverride.groupIndex && Arrays.equals(this.tracks, selectionOverride.tracks) && this.type == selectionOverride.type) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((Arrays.hashCode(this.tracks) + (this.groupIndex * 31)) * 31) + this.type;
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(FIELD_GROUP_INDEX, this.groupIndex);
            bundle.putIntArray(FIELD_TRACKS, this.tracks);
            bundle.putInt(FIELD_TRACK_TYPE, this.type);
            return bundle;
        }

        public SelectionOverride(int i, int... iArr) {
            this(i, iArr, 0);
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public RendererCapabilities.Listener getRendererCapabilitiesListener() {
        return this;
    }

    @Deprecated
    public void setParameters(ParametersBuilder parametersBuilder) {
        setParametersInternal(parametersBuilder.build());
    }

    public void setParameters(Parameters.Builder builder) {
        setParametersInternal(builder.build());
    }

    public DefaultTrackSelector(Context context, ExoTrackSelection.Factory factory) {
        this(context, Parameters.DEFAULT, factory);
    }

    public DefaultTrackSelector(Context context, TrackSelectionParameters trackSelectionParameters) {
        this(context, trackSelectionParameters, new AdaptiveTrackSelection.Factory());
    }

    @Deprecated
    public DefaultTrackSelector(TrackSelectionParameters trackSelectionParameters, ExoTrackSelection.Factory factory) {
        this(trackSelectionParameters, factory, (Context) null);
    }

    public DefaultTrackSelector(Context context, TrackSelectionParameters trackSelectionParameters, ExoTrackSelection.Factory factory) {
        this(trackSelectionParameters, factory, context);
    }

    public DefaultTrackSelector(Context context) {
        this(context, new AdaptiveTrackSelection.Factory());
    }
}

package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.extractor.ts.TsExtractor;
import defpackage.gz4;
import defpackage.hf1;
import defpackage.r7;
import defpackage.sp0;
import defpackage.tr;
import defpackage.wi4;
import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class MediaCodecInfo {
    public static final int MAX_SUPPORTED_INSTANCES_UNKNOWN = -1;
    public static final String TAG = "MediaCodecInfo";
    private static final gz4 VENDOR_API_LEVEL = wi4.t(new tr(3));
    public final boolean adaptive;
    public final MediaCodecInfo.CodecCapabilities capabilities;
    public final String codecMimeType;
    public final boolean detachedSurfaceSupported;
    public final boolean hardwareAccelerated;
    private final boolean isVideo;
    private float maxFrameRate;
    private int maxFrameRateHeight;
    private int maxFrameRateWidth;
    public final String mimeType;
    public final String name;
    public final boolean secure;
    public final boolean softwareOnly;
    public final boolean tunneling;
    public final boolean vendor;

    public MediaCodecInfo(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        str.getClass();
        this.name = str;
        this.mimeType = str2;
        this.codecMimeType = str3;
        this.capabilities = codecCapabilities;
        this.hardwareAccelerated = z;
        this.softwareOnly = z2;
        this.vendor = z3;
        this.adaptive = z4;
        this.tunneling = z5;
        this.secure = z6;
        this.detachedSurfaceSupported = z7;
        this.isVideo = MimeTypes.isVideo(str2);
        this.maxFrameRate = -3.4028235E38f;
        this.maxFrameRateWidth = -1;
        this.maxFrameRateHeight = -1;
    }

    private static int adjustMaxInputChannelCount(String str, String str2, int i) {
        if (i > 1 || ((Build.VERSION.SDK_INT >= 26 && i > 0) || MimeTypes.AUDIO_MPEG.equals(str2) || MimeTypes.AUDIO_AMR_NB.equals(str2) || MimeTypes.AUDIO_AMR_WB.equals(str2) || MimeTypes.AUDIO_AAC.equals(str2) || MimeTypes.AUDIO_VORBIS.equals(str2) || MimeTypes.AUDIO_OPUS.equals(str2) || MimeTypes.AUDIO_RAW.equals(str2) || MimeTypes.AUDIO_FLAC.equals(str2) || MimeTypes.AUDIO_ALAW.equals(str2) || MimeTypes.AUDIO_MLAW.equals(str2) || MimeTypes.AUDIO_MSGSM.equals(str2))) {
            return i;
        }
        int i2 = MimeTypes.AUDIO_AC3.equals(str2) ? 6 : MimeTypes.AUDIO_E_AC3.equals(str2) ? 16 : 30;
        Log.w(TAG, "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i2 + "]");
        return i2;
    }

    private static Point alignVideoSize(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(Util.ceilDivide(i, widthAlignment) * widthAlignment, Util.ceilDivide(i2, heightAlignment) * heightAlignment);
    }

    private static boolean areSizeAndRateSupported(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Range<Double> achievableFrameRatesFor;
        Point alignVideoSize = alignVideoSize(videoCapabilities, i, i2);
        int i3 = alignVideoSize.x;
        int i4 = alignVideoSize.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double floor = Math.floor(d);
        if (videoCapabilities.areSizeAndRateSupported(i3, i4, floor)) {
            return Build.VERSION.SDK_INT < 24 || (achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4)) == null || floor <= achievableFrameRatesFor.getUpper().doubleValue();
        }
        return false;
    }

    private float computeMaxSupportedFrameRate(int i, int i2) {
        float f = 1024.0f;
        if (isVideoSizeAndRateSupported(i, i2, 1024.0d)) {
            return 1024.0f;
        }
        float f2 = 0.0f;
        while (true) {
            float f3 = f - f2;
            if (Math.abs(f3) <= 5.0f) {
                return f2;
            }
            float f4 = (f3 / 2.0f) + f2;
            if (isVideoSizeAndRateSupported(i, i2, f4)) {
                f2 = f4;
            } else {
                f = f4;
            }
        }
    }

    private static MediaCodecInfo.CodecProfileLevel[] estimateLegacyAc4ProfileLevels(Context context, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        int i = ((codecCapabilities == null || (audioCapabilities = codecCapabilities.getAudioCapabilities()) == null) ? 2 : audioCapabilities.getMaxInputChannelCount()) > 18 ? 16 : 8;
        return Util.isAutomotive(context) ? new MediaCodecInfo.CodecProfileLevel[]{MediaCodecUtil.createCodecProfileLevel(AnalyticsListener.EVENT_DRM_KEYS_REMOVED, i)} : new MediaCodecInfo.CodecProfileLevel[]{MediaCodecUtil.createCodecProfileLevel(TsExtractor.TS_STREAM_TYPE_AIT, i), MediaCodecUtil.createCodecProfileLevel(513, i), MediaCodecUtil.createCodecProfileLevel(514, i), MediaCodecUtil.createCodecProfileLevel(AnalyticsListener.EVENT_DRM_KEYS_REMOVED, i), MediaCodecUtil.createCodecProfileLevel(AnalyticsListener.EVENT_PLAYER_RELEASED, i)};
    }

    private static MediaCodecInfo.CodecProfileLevel[] estimateLegacyVp9ProfileLevels(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int intValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
        return new MediaCodecInfo.CodecProfileLevel[]{MediaCodecUtil.createCodecProfileLevel(1, intValue >= 180000000 ? 1024 : intValue >= 120000000 ? 512 : intValue >= 60000000 ? 256 : intValue >= 30000000 ? 128 : intValue >= 18000000 ? 64 : intValue >= 12000000 ? 32 : intValue >= 7200000 ? 16 : intValue >= 3600000 ? 8 : intValue >= 1800000 ? 4 : intValue >= 800000 ? 2 : 1)};
    }

    private static boolean isAdaptive(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private boolean isCodecProfileAndLevelSupported(Context context, Format format, boolean z) {
        CodecSpecificDataUtil.MediaCodecProfileAndLevel mediaCodecProfileAndLevel = CodecSpecificDataUtil.getMediaCodecProfileAndLevel(format);
        String str = format.sampleMimeType;
        if (str != null && str.equals(MimeTypes.VIDEO_MV_HEVC)) {
            String normalizeMimeType = MimeTypes.normalizeMimeType(this.codecMimeType);
            if (normalizeMimeType.equals(MimeTypes.VIDEO_MV_HEVC)) {
                return true;
            }
            if (normalizeMimeType.equals(MimeTypes.VIDEO_H265)) {
                mediaCodecProfileAndLevel = MediaCodecUtil.getHevcBaseLayerCodecProfileAndLevel(format);
            }
        }
        if (mediaCodecProfileAndLevel == null) {
            return true;
        }
        if (!mediaCodecProfileAndLevel.isSupportableByMediaCodec()) {
            return false;
        }
        int profile = mediaCodecProfileAndLevel.getProfile();
        int level = mediaCodecProfileAndLevel.getLevel();
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(format.sampleMimeType)) {
            String str2 = this.mimeType;
            str2.getClass();
            switch (str2) {
                case "video/av01":
                case "video/hevc":
                    level = 0;
                    profile = 2;
                    break;
                case "video/avc":
                    profile = 8;
                    level = 0;
                    break;
            }
        }
        if (!this.isVideo && !this.mimeType.equals(MimeTypes.AUDIO_AC4) && profile != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] profileLevels = getProfileLevels();
        if (this.mimeType.equals(MimeTypes.AUDIO_AC4) && profileLevels.length == 0) {
            profileLevels = estimateLegacyAc4ProfileLevels(context, this.capabilities);
        }
        if (Build.VERSION.SDK_INT == 23 && MimeTypes.VIDEO_VP9.equals(this.mimeType) && profileLevels.length == 0) {
            profileLevels = estimateLegacyVp9ProfileLevels(this.capabilities);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : profileLevels) {
            if (codecProfileLevel.profile == profile && ((codecProfileLevel.level >= level || !z) && !needsProfileExcludedWorkaround(this.mimeType, profile))) {
                return true;
            }
        }
        logNoSupport("codec.profileLevel, " + format.codecs + ", " + this.codecMimeType);
        return false;
    }

    private boolean isCompressedAudioBitDepthSupported(Format format) {
        return (Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_FLAC) && format.pcmEncoding == 22 && Build.VERSION.SDK_INT < 34 && this.name.equals("c2.android.flac.decoder")) ? false : true;
    }

    private static boolean isDetachedSurfaceSupported(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface") && !needsDetachedSurfaceUnsupportedWorkaround();
    }

    private boolean isSampleMimeTypeSupported(Format format) {
        return this.mimeType.equals(format.sampleMimeType) || this.mimeType.equals(MediaCodecUtil.getAlternativeCodecMimeType(format));
    }

    private static boolean isSecure(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean isTunneling(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Integer lambda$static$0() {
        String systemProperty = Util.getSystemProperty("ro.vendor.api_level");
        if (systemProperty == null) {
            systemProperty = "";
        }
        return sp0.q0(systemProperty);
    }

    private void logAssumedSupport(String str) {
        StringBuilder E = r7.E("AssumedSupport [", str, "] [");
        E.append(this.name);
        E.append(", ");
        E.append(this.mimeType);
        E.append("] [");
        E.append(Util.DEVICE_DEBUG_INFO);
        E.append("]");
        Log.d(TAG, E.toString());
    }

    private void logNoSupport(String str) {
        StringBuilder E = r7.E("NoSupport [", str, "] [");
        E.append(this.name);
        E.append(", ");
        E.append(this.mimeType);
        E.append("] [");
        E.append(Util.DEVICE_DEBUG_INFO);
        E.append("]");
        Log.d(TAG, E.toString());
    }

    private static boolean needsAdaptationFlushWorkaround(String str) {
        return MimeTypes.AUDIO_OPUS.equals(str);
    }

    private static boolean needsAdaptationReconfigureWorkaround(String str) {
        return MediaLibraryInfo.enableWorkarounds() && Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean needsDetachedSurfaceUnsupportedWorkaround() {
        Integer num = (Integer) VENDOR_API_LEVEL.get();
        if (num == null || num.intValue() > 202604) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return str.equals("Xiaomi") || str.equals("OPPO") || str.equals("realme") || str.equals("motorola") || str.equals("LENOVO") || str.equals("Fairphone");
    }

    private static boolean needsProfileExcludedWorkaround(String str, int i) {
        if (MediaLibraryInfo.enableWorkarounds() && MimeTypes.VIDEO_H265.equals(str) && 2 == i) {
            String str2 = Build.DEVICE;
            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean needsRotatedVerticalResolutionWorkaround(String str) {
        if (MediaLibraryInfo.enableWorkarounds()) {
            return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(Build.DEVICE)) ? false : true;
        }
        return false;
    }

    public static MediaCodecInfo newInstance(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new MediaCodecInfo(str, str2, str3, codecCapabilities, z, z2, z3, (z4 || codecCapabilities == null || !isAdaptive(codecCapabilities)) ? false : true, codecCapabilities != null && isTunneling(codecCapabilities), z5 || (codecCapabilities != null && isSecure(codecCapabilities)), isDetachedSurfaceSupported(codecCapabilities));
    }

    @Deprecated
    public final Point alignVideoSizeV21(int i, int i2) {
        return alignVideoSize(i, i2);
    }

    public DecoderReuseEvaluation canReuseCodec(Format format, Format format2) {
        Format format3;
        Format format4;
        int i;
        int i2 = !Objects.equals(format.sampleMimeType, format2.sampleMimeType) ? 8 : 0;
        if (this.isVideo) {
            if (format.rotationDegrees != format2.rotationDegrees) {
                i2 |= 1024;
            }
            boolean z = (format.width == format2.width && format.height == format2.height) ? false : true;
            if (!this.adaptive && z) {
                i2 |= 512;
            }
            if ((!ColorInfo.isEquivalentToAssumedSdrDefault(format.colorInfo) || !ColorInfo.isEquivalentToAssumedSdrDefault(format2.colorInfo)) && !Objects.equals(format.colorInfo, format2.colorInfo)) {
                i2 |= 2048;
            }
            if (needsAdaptationReconfigureWorkaround(this.name) && !format.initializationDataEquals(format2)) {
                i2 |= 2;
            }
            int i3 = format.decodedWidth;
            if (i3 != -1 && (i = format.decodedHeight) != -1 && i3 == format2.decodedWidth && i == format2.decodedHeight && z) {
                i2 |= 2;
            }
            if (i2 == 0 && Objects.equals(format2.sampleMimeType, MimeTypes.VIDEO_DOLBY_VISION)) {
                Pair<Integer, Integer> codecProfileAndLevel = CodecSpecificDataUtil.getCodecProfileAndLevel(format);
                Pair<Integer, Integer> codecProfileAndLevel2 = CodecSpecificDataUtil.getCodecProfileAndLevel(format2);
                if (codecProfileAndLevel == null || codecProfileAndLevel2 == null || !((Integer) codecProfileAndLevel.first).equals(codecProfileAndLevel2.first)) {
                    i2 |= 2;
                }
            }
            if (i2 == 0) {
                return new DecoderReuseEvaluation(this.name, format, format2, format.initializationDataEquals(format2) ? 3 : 2, 0);
            }
            format3 = format;
            format4 = format2;
        } else {
            format3 = format;
            format4 = format2;
            if (format3.channelCount != format4.channelCount) {
                i2 |= 4096;
            }
            if (format3.sampleRate != format4.sampleRate) {
                i2 |= 8192;
            }
            if (format3.pcmEncoding != format4.pcmEncoding) {
                i2 |= 16384;
            }
            if (i2 == 0 && (this.mimeType.equals(MimeTypes.AUDIO_AAC) || this.mimeType.equals(MimeTypes.AUDIO_AC4))) {
                Pair<Integer, Integer> codecProfileAndLevel3 = CodecSpecificDataUtil.getCodecProfileAndLevel(format3);
                Pair<Integer, Integer> codecProfileAndLevel4 = CodecSpecificDataUtil.getCodecProfileAndLevel(format4);
                if (codecProfileAndLevel3 != null && codecProfileAndLevel4 != null) {
                    int intValue = ((Integer) codecProfileAndLevel3.first).intValue();
                    int intValue2 = ((Integer) codecProfileAndLevel4.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new DecoderReuseEvaluation(this.name, format3, format4, 3, 0);
                    }
                    if (this.mimeType.equals(MimeTypes.AUDIO_AC4) && codecProfileAndLevel3.equals(codecProfileAndLevel4)) {
                        return new DecoderReuseEvaluation(this.name, format3, format4, 3, 0);
                    }
                }
            }
            if (i2 == 0 && (this.mimeType.equals(MimeTypes.AUDIO_E_AC3_JOC) || this.mimeType.equals(MimeTypes.AUDIO_E_AC3))) {
                return new DecoderReuseEvaluation(this.name, format3, format4, 3, 0);
            }
            if (!format3.initializationDataEquals(format4)) {
                i2 |= 32;
            }
            if (needsAdaptationFlushWorkaround(this.mimeType)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new DecoderReuseEvaluation(this.name, format3, format4, 1, 0);
            }
        }
        return new DecoderReuseEvaluation(this.name, format3, format4, 0, i2);
    }

    public float getMaxSupportedFrameRate(int i, int i2) {
        if (!this.isVideo) {
            return -3.4028235E38f;
        }
        float f = this.maxFrameRate;
        if (f != -3.4028235E38f && this.maxFrameRateWidth == i && this.maxFrameRateHeight == i2) {
            return f;
        }
        float computeMaxSupportedFrameRate = computeMaxSupportedFrameRate(i, i2);
        this.maxFrameRate = computeMaxSupportedFrameRate;
        this.maxFrameRateWidth = i;
        this.maxFrameRateHeight = i2;
        return computeMaxSupportedFrameRate;
    }

    public int getMaxSupportedInstances() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            return -1;
        }
        return codecCapabilities.getMaxSupportedInstances();
    }

    public MediaCodecInfo.CodecProfileLevel[] getProfileLevels() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean isAudioChannelCountSupported(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            logNoSupport("channelCount.aCaps");
            return false;
        }
        if (adjustMaxInputChannelCount(this.name, this.mimeType, audioCapabilities.getMaxInputChannelCount()) >= i) {
            return true;
        }
        logNoSupport(hf1.u(i, "channelCount.support, "));
        return false;
    }

    @Deprecated
    public final boolean isAudioChannelCountSupportedV21(int i) {
        return isAudioChannelCountSupported(i);
    }

    public boolean isAudioSampleRateSupported(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            logNoSupport("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        }
        logNoSupport(hf1.u(i, "sampleRate.support, "));
        return false;
    }

    @Deprecated
    public final boolean isAudioSampleRateSupportedV21(int i) {
        return isAudioSampleRateSupported(i);
    }

    public boolean isFormatFunctionallySupported(Context context, Format format) {
        return isSampleMimeTypeSupported(format) && isCodecProfileAndLevelSupported(context, format, false) && isCompressedAudioBitDepthSupported(format);
    }

    public boolean isFormatSupported(Context context, Format format) {
        int i;
        int i2;
        if (!isSampleMimeTypeSupported(format) || !isCodecProfileAndLevelSupported(context, format, true) || !isCompressedAudioBitDepthSupported(format)) {
            return false;
        }
        if (!this.isVideo) {
            int i3 = format.sampleRate;
            return (i3 == -1 || isAudioSampleRateSupported(i3)) && ((i = format.channelCount) == -1 || isAudioChannelCountSupported(i));
        }
        int i4 = format.width;
        if (i4 <= 0 || (i2 = format.height) <= 0) {
            return true;
        }
        return isVideoSizeAndRateSupported(i4, i2, format.frameRate);
    }

    public boolean isHdr10PlusOutOfBandMetadataSupported() {
        if (Build.VERSION.SDK_INT >= 29 && MimeTypes.VIDEO_VP9.equals(this.mimeType)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : getProfileLevels()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isSeamlessAdaptationSupported(Format format) {
        if (this.isVideo) {
            return this.adaptive;
        }
        CodecSpecificDataUtil.MediaCodecProfileAndLevel mediaCodecProfileAndLevel = CodecSpecificDataUtil.getMediaCodecProfileAndLevel(format);
        return mediaCodecProfileAndLevel != null && mediaCodecProfileAndLevel.isSupportableByMediaCodec() && mediaCodecProfileAndLevel.getProfile() == 42;
    }

    public boolean isVideoSizeAndRateSupported(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            logNoSupport("sizeAndRate.vCaps");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int areResolutionAndFrameRateCovered = MediaCodecPerformancePointCoverageProvider.areResolutionAndFrameRateCovered(videoCapabilities, i, i2, d);
            if (areResolutionAndFrameRateCovered == 2) {
                return true;
            }
            if (areResolutionAndFrameRateCovered == 1) {
                StringBuilder D = hf1.D("sizeAndRate.cover, ", i, "x", i2, "@");
                D.append(d);
                logNoSupport(D.toString());
                return false;
            }
        }
        if (!areSizeAndRateSupported(videoCapabilities, i, i2, d)) {
            if (i >= i2 || !needsRotatedVerticalResolutionWorkaround(this.name) || !areSizeAndRateSupported(videoCapabilities, i2, i, d)) {
                StringBuilder D2 = hf1.D("sizeAndRate.support, ", i, "x", i2, "@");
                D2.append(d);
                logNoSupport(D2.toString());
                return false;
            }
            StringBuilder D3 = hf1.D("sizeAndRate.rotated, ", i, "x", i2, "@");
            D3.append(d);
            logAssumedSupport(D3.toString());
        }
        return true;
    }

    @Deprecated
    public final boolean isVideoSizeAndRateSupportedV21(int i, int i2, double d) {
        return isVideoSizeAndRateSupported(i, i2, d);
    }

    public String toString() {
        return this.name;
    }

    public Point alignVideoSize(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return alignVideoSize(videoCapabilities, i, i2);
    }
}

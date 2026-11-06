package com.github.mytv.dv.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.text.ttml.TtmlNode;
import defpackage.cj5;
import defpackage.dq;
import defpackage.fl4;
import defpackage.fw4;
import defpackage.hf1;
import defpackage.jx4;
import defpackage.lq5;
import defpackage.o70;
import defpackage.p04;
import defpackage.p70;
import defpackage.pa;
import defpackage.pu0;
import defpackage.s83;
import defpackage.uj3;
import defpackage.v2;
import defpackage.za1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class VideoPlayUrlResolver {
    public static final int $stable = 0;
    public static final VideoPlayUrlResolver INSTANCE = new VideoPlayUrlResolver();
    private static volatile Map<String, uj3> decoderMaxDims;
    private static volatile fl4 settingsManager;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[cj5.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[lq5.values().length];
            try {
                iArr2[2] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[3] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[4] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[0] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[1] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private VideoPlayUrlResolver() {
    }

    private final boolean fitsDeviceDecoder(BitRate bitRate) {
        return fitsDeviceDecoder$app(bitRate.getPlayAddr().getWidth(), bitRate.getPlayAddr().getHeight(), isHevcVariant(bitRate));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1() {
        try {
            decoderMaxDims = INSTANCE.queryDecoderMaxDims();
        } catch (Throwable unused) {
        }
    }

    private final boolean isHevcVariant(BitRate bitRate) {
        return bitRate.isH265() == 1 || bitRate.isBytevc1() == 1;
    }

    private final Map<String, uj3> queryDecoderMaxDims() {
        LinkedHashMap linkedHashMap;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i = 0;
        MediaCodecList mediaCodecList = new MediaCodecList(0);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (String str : p70.k0(MimeTypes.VIDEO_H265, MimeTypes.VIDEO_H264)) {
            MediaCodecInfo[] codecInfos = mediaCodecList.getCodecInfos();
            codecInfos.getClass();
            int length = codecInfos.length;
            int i2 = i;
            int i3 = i2;
            int i4 = i3;
            while (i2 < length) {
                MediaCodecInfo mediaCodecInfo = codecInfos[i2];
                if (!mediaCodecInfo.isEncoder()) {
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    supportedTypes.getClass();
                    if (dq.M0(supportedTypes, str)) {
                        try {
                            videoCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities();
                        } catch (Throwable unused) {
                        }
                        if (videoCapabilities != null) {
                            Integer upper = videoCapabilities.getSupportedWidths().getUpper();
                            Integer upper2 = videoCapabilities.getSupportedHeights().getUpper();
                            if (upper.intValue() > 0 && upper2.intValue() > 0) {
                                linkedHashMap = linkedHashMap2;
                                if (upper.intValue() * upper2.intValue() > i3 * i4) {
                                    try {
                                        i3 = upper.intValue();
                                        i4 = upper2.intValue();
                                    } catch (Throwable unused2) {
                                    }
                                }
                                i2++;
                                linkedHashMap2 = linkedHashMap;
                            }
                        }
                    }
                }
                linkedHashMap = linkedHashMap2;
                i2++;
                linkedHashMap2 = linkedHashMap;
            }
            LinkedHashMap linkedHashMap3 = linkedHashMap2;
            if (i3 <= 0 || i4 <= 0) {
                linkedHashMap2 = linkedHashMap3;
            } else {
                linkedHashMap3.put(str, new uj3(Integer.valueOf(i3), Integer.valueOf(i4)));
                linkedHashMap2 = linkedHashMap3;
            }
            i = 0;
        }
        return linkedHashMap2;
    }

    public static /* synthetic */ String resolveFinalPlayUrl$default(VideoPlayUrlResolver videoPlayUrlResolver, Video video, lq5 lq5Var, Aweme aweme, int i, Object obj) {
        if ((i & 2) != 0) {
            lq5Var = null;
        }
        if ((i & 4) != 0) {
            aweme = null;
        }
        return videoPlayUrlResolver.resolveFinalPlayUrl(video, lq5Var, aweme);
    }

    public static /* synthetic */ String resolveH264PlayUrl$default(VideoPlayUrlResolver videoPlayUrlResolver, Video video, lq5 lq5Var, int i, Object obj) {
        if ((i & 2) != 0) {
            lq5Var = null;
        }
        return videoPlayUrlResolver.resolveH264PlayUrl(video, lq5Var);
    }

    private final lq5 resolveTargetResolution(lq5 lq5Var) {
        String str;
        p04 p04Var;
        if (lq5Var != null) {
            return lq5Var;
        }
        fl4 fl4Var = settingsManager;
        Object obj = null;
        lq5 lq5Var2 = (fl4Var == null || (p04Var = fl4Var.n) == null) ? null : (lq5) ((fw4) p04Var.I).getValue();
        if (lq5Var2 != null) {
            return lq5Var2;
        }
        za1 za1Var = lq5.O;
        v2 o = hf1.o(za1Var, za1Var);
        while (true) {
            if (!o.hasNext()) {
                break;
            }
            Object next = o.next();
            String str2 = ((lq5) next).J;
            fl4 fl4Var2 = settingsManager;
            if (fl4Var2 != null) {
                SharedPreferences sharedPreferences = fl4Var2.a;
                str = TtmlNode.TEXT_EMPHASIS_AUTO;
                String string = sharedPreferences.getString("video_resolution", TtmlNode.TEXT_EMPHASIS_AUTO);
                if (string != null) {
                    str = string;
                }
            } else {
                str = null;
            }
            if (str2.equals(str)) {
                obj = next;
                break;
            }
        }
        lq5 lq5Var3 = (lq5) obj;
        return lq5Var3 == null ? lq5.L : lq5Var3;
    }

    private final List<String> selectCandidateUrls(PlayAddr playAddr, PlayAddr playAddr2, List<BitRate> list, lq5 lq5Var, boolean z) {
        cj5 cj5Var;
        p04 p04Var;
        ArrayList arrayList;
        PlayAddr playAddr3;
        List<String> urlList;
        PlayAddr playAddr4;
        List<String> urlList2;
        if (z) {
            cj5Var = cj5.L;
        } else {
            fl4 fl4Var = settingsManager;
            if (fl4Var == null || (p04Var = fl4Var.r) == null || (cj5Var = (cj5) ((fw4) p04Var.I).getValue()) == null) {
                cj5Var = cj5.K;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (INSTANCE.fitsDeviceDecoder((BitRate) obj)) {
                arrayList2.add(obj);
            }
        }
        int ordinal = cj5Var.ordinal();
        List<String> list2 = null;
        if (ordinal != 0) {
            int i = 0;
            if (ordinal == 1) {
                arrayList = new ArrayList();
                int size = arrayList2.size();
                while (i < size) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    if (((BitRate) obj2).isH265() != 1) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                if (ordinal != 2) {
                    s83.v();
                    return null;
                }
                arrayList = new ArrayList();
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj3 = arrayList2.get(i);
                    i++;
                    if (((BitRate) obj3).isH265() == 1) {
                        arrayList.add(obj3);
                    }
                }
            }
        } else {
            arrayList = arrayList2;
        }
        if (z) {
            arrayList2 = arrayList;
        }
        int ordinal2 = lq5Var.ordinal();
        if (ordinal2 == 0) {
            if (WhenMappings.$EnumSwitchMapping$0[cj5Var.ordinal()] != 3) {
                return playAddr.getUrlList();
            }
            if (!fitsDeviceDecoder$app(playAddr2.getWidth(), playAddr2.getHeight(), true)) {
                return playAddr.getUrlList();
            }
            List<String> urlList3 = playAddr2.getUrlList();
            return urlList3.isEmpty() ? playAddr.getUrlList() : urlList3;
        }
        if (ordinal2 != 1) {
            if (ordinal2 != 2 && ordinal2 != 3 && ordinal2 != 4) {
                s83.v();
                return null;
            }
            int ordinal3 = lq5Var.ordinal();
            pu0 pu0Var = new pu0(ordinal3 != 2 ? ordinal3 != 3 ? ordinal3 != 4 ? "" : "540" : "720" : "1080", (byte) 9);
            List<String> list3 = (List) pu0Var.invoke(arrayList);
            if (list3 != null) {
                return list3;
            }
            List<String> list4 = (List) pu0Var.invoke(arrayList2);
            return list4 == null ? playAddr.getUrlList() : list4;
        }
        BitRate highestQualityBitRate = DataModelKt.highestQualityBitRate(arrayList);
        if (highestQualityBitRate != null && (playAddr4 = highestQualityBitRate.getPlayAddr()) != null && (urlList2 = playAddr4.getUrlList()) != null) {
            if (urlList2.isEmpty()) {
                urlList2 = null;
            }
            if (urlList2 != null) {
                return urlList2;
            }
        }
        BitRate highestQualityBitRate2 = DataModelKt.highestQualityBitRate(arrayList2);
        if (highestQualityBitRate2 != null && (playAddr3 = highestQualityBitRate2.getPlayAddr()) != null && (urlList = playAddr3.getUrlList()) != null && !urlList.isEmpty()) {
            list2 = urlList;
        }
        return list2 == null ? playAddr.getUrlList() : list2;
    }

    public static /* synthetic */ List selectCandidateUrls$default(VideoPlayUrlResolver videoPlayUrlResolver, PlayAddr playAddr, PlayAddr playAddr2, List list, lq5 lq5Var, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        return videoPlayUrlResolver.selectCandidateUrls(playAddr, playAddr2, list, lq5Var, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List selectCandidateUrls$lambda$6(String str, List list) {
        Object obj;
        PlayAddr playAddr;
        List<String> urlList;
        list.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jx4.D(((BitRate) obj).getGearName(), str, true)) {
                break;
            }
        }
        BitRate bitRate = (BitRate) obj;
        if (bitRate == null || (playAddr = bitRate.getPlayAddr()) == null || (urlList = playAddr.getUrlList()) == null || urlList.isEmpty()) {
            return null;
        }
        return urlList;
    }

    public final boolean fitsDeviceDecoder$app(int i, int i2, boolean z) {
        Map<String, uj3> map;
        if (i <= 0 || i2 <= 0 || (map = decoderMaxDims) == null) {
            return true;
        }
        uj3 uj3Var = map.get(z ? MimeTypes.VIDEO_H265 : MimeTypes.VIDEO_H264);
        if (uj3Var == null) {
            return true;
        }
        return i <= ((Number) uj3Var.I).intValue() && i2 <= ((Number) uj3Var.J).intValue();
    }

    public final void init(Context context) {
        context.getClass();
        if (settingsManager == null) {
            synchronized (this) {
                if (settingsManager == null) {
                    Context applicationContext = context.getApplicationContext();
                    applicationContext.getClass();
                    settingsManager = new fl4(applicationContext);
                }
            }
        }
        if (decoderMaxDims == null) {
            new Thread(new pa((byte) 1)).start();
        }
    }

    public final boolean isPathSigned$app(String str) {
        str.getClass();
        if (!jx4.D(str, "douyinvod.com", false)) {
            return false;
        }
        Pattern compile = Pattern.compile("douyinvod\\.com/[0-9a-f]{32}/[0-9a-f]{8}/");
        compile.getClass();
        return compile.matcher(str).find();
    }

    public final String resolveFinalPlayUrl(Video video, lq5 lq5Var, Aweme aweme) {
        video.getClass();
        if (aweme == null) {
            return resolveFinalPlayUrl(video, lq5Var);
        }
        PlayAddr playAddr = aweme.getVideo().getPlayAddr();
        if (playAddr.getUrlList().isEmpty()) {
            playAddr = null;
        }
        if (playAddr == null) {
            playAddr = video.getPlayAddr();
        }
        PlayAddr playAddr2 = playAddr;
        PlayAddr playAddr265 = aweme.getVideo().getPlayAddr265();
        PlayAddr playAddr3 = playAddr265.getUrlList().isEmpty() ? null : playAddr265;
        if (playAddr3 == null) {
            playAddr3 = video.getPlayAddr265();
        }
        PlayAddr playAddr4 = playAddr3;
        if (!aweme.getVideo().getBitRate().isEmpty()) {
            video = aweme.getVideo();
        }
        return selectBestPlayUrl$app(selectCandidateUrls$default(this, playAddr2, playAddr4, video.getBitRate(), resolveTargetResolution(lq5Var), false, 16, null));
    }

    public final String resolveH264PlayUrl(Video video, lq5 lq5Var) {
        video.getClass();
        return selectBestPlayUrl$app(selectCandidateUrls(video.getPlayAddr(), video.getPlayAddr265(), video.getBitRate(), resolveTargetResolution(lq5Var), true));
    }

    public final String selectBestPlayUrl$app(List<String> list) {
        Object obj;
        Object obj2;
        Object obj3;
        list.getClass();
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (INSTANCE.isPathSigned$app((String) obj2)) {
                    break;
                }
            }
            String str = (String) obj2;
            if (str != null) {
                return str;
            }
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it2.next();
                if (jx4.D((String) obj3, "douyin.com/aweme/v1/play", false)) {
                    break;
                }
            }
            String str2 = (String) obj3;
            if (str2 != null) {
                return str2;
            }
            Iterator<T> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                String str3 = (String) next;
                if (jx4.D(str3, "signature=", false) && jx4.D(str3, "douyinvod.com", false)) {
                    obj = next;
                    break;
                }
            }
            String str4 = (String) obj;
            if (str4 != null) {
                return str4;
            }
            String str5 = (String) o70.b1(list);
            if (str5 != null) {
                return str5;
            }
        }
        return "";
    }

    public static /* synthetic */ String resolveFinalPlayUrl$default(VideoPlayUrlResolver videoPlayUrlResolver, Video video, lq5 lq5Var, int i, Object obj) {
        if ((i & 2) != 0) {
            lq5Var = null;
        }
        return videoPlayUrlResolver.resolveFinalPlayUrl(video, lq5Var);
    }

    public final String resolveFinalPlayUrl(Video video, lq5 lq5Var) {
        video.getClass();
        return selectBestPlayUrl$app(selectCandidateUrls$default(this, video.getPlayAddr(), video.getPlayAddr265(), video.getBitRate(), resolveTargetResolution(lq5Var), false, 16, null));
    }
}

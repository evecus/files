package com.github.mytv.dv.model;

import androidx.media3.exoplayer.Renderer;
import defpackage.g54;
import defpackage.h54;
import defpackage.i62;
import defpackage.jx4;
import defpackage.l62;
import defpackage.lq5;
import defpackage.mk2;
import defpackage.mw2;
import defpackage.o70;
import defpackage.o90;
import defpackage.o91;
import defpackage.p70;
import defpackage.p91;
import defpackage.qx4;
import defpackage.s83;
import defpackage.sp;
import defpackage.sp0;
import defpackage.sv2;
import defpackage.u62;
import defpackage.uj3;
import defpackage.ut0;
import defpackage.wd5;
import defpackage.zk4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class DataModelKt {
    private static final i62 LenientJson = sp0.d(new o90(26));
    private static final List<String> PULL_URL_MAP_ORDER_HIGH_TO_LOW = p70.k0("FULL_HD1", "HD1", "SD2", "SD1");
    private static final Map<String, String> PULL_URL_MAP_QUALITY_NAMES = sv2.K(new uj3("FULL_HD1", "蓝光"), new uj3("HD1", "超清"), new uj3("SD2", "高清"), new uj3("SD1", "标清"));

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[lq5.values().length];
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
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 LenientJson$lambda$0(l62 l62Var) {
        l62Var.getClass();
        l62Var.b = true;
        l62Var.c = true;
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int encodingScore(BitRate bitRate) {
        return (bitRate.isH265() == 1 || bitRate.isBytevc1() == 1) ? 1 : 0;
    }

    private static final List<String> extractMainLiveUrls(b bVar) {
        c jsonObjectOrNull;
        b bVar2;
        c jsonObjectOrNull2;
        String nonEmptyStringOrNull;
        String nonEmptyStringOrNull2;
        if (bVar == null || (jsonObjectOrNull = jsonObjectOrNull(bVar)) == null || (bVar2 = (b) jsonObjectOrNull.get("main")) == null || (jsonObjectOrNull2 = jsonObjectOrNull(bVar2)) == null) {
            return o91.I;
        }
        mk2 K = p70.K();
        b bVar3 = (b) jsonObjectOrNull2.get("flv");
        if (bVar3 != null && (nonEmptyStringOrNull2 = nonEmptyStringOrNull(bVar3)) != null) {
            K.add(nonEmptyStringOrNull2);
        }
        b bVar4 = (b) jsonObjectOrNull2.get("hls");
        if (bVar4 != null && (nonEmptyStringOrNull = nonEmptyStringOrNull(bVar4)) != null) {
            K.add(nonEmptyStringOrNull);
        }
        return p70.D(K);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [g54] */
    private static final List<LiveStreamQuality> extractQualities(LiveCorePullData liveCorePullData) {
        b options;
        c jsonObjectOrNull;
        b bVar;
        o91 g54Var;
        b options2 = liveCorePullData.getOptions();
        if (options2 == null || (options = unwrapEmbeddedJsonStringOrNull(options2)) == null) {
            options = liveCorePullData.getOptions();
        }
        o91 o91Var = o91.I;
        if (options == null || (jsonObjectOrNull = jsonObjectOrNull(options)) == null) {
            return o91Var;
        }
        b bVar2 = (b) jsonObjectOrNull.get("qualities");
        if ((bVar2 == null || (bVar = unwrapEmbeddedJsonStringOrNull(bVar2)) == null) && (bVar = (b) jsonObjectOrNull.get("qualities")) == null) {
            return o91Var;
        }
        try {
            i62 i62Var = LenientJson;
            KSerializer serializer = LiveStreamQuality.Companion.serializer();
            serializer.getClass();
            g54Var = (List) i62Var.a(new sp(serializer), bVar);
        } catch (Throwable th) {
            g54Var = new g54(th);
        }
        if (h54.a(g54Var) == null) {
            o91Var = g54Var;
        }
        return o91Var;
    }

    private static final b extractStreamDataRoot(LiveCorePullData liveCorePullData) {
        b streamData = liveCorePullData.getStreamData();
        if (streamData == null) {
            return null;
        }
        b unwrapEmbeddedJsonStringOrNull = unwrapEmbeddedJsonStringOrNull(streamData);
        return unwrapEmbeddedJsonStringOrNull == null ? streamData : unwrapEmbeddedJsonStringOrNull;
    }

    public static final List<Aweme> filterPrimaryAwemes(List<Aweme> list) {
        if (list == null) {
            return o91.I;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (isPrimaryAweme((Aweme) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final List<Aweme> filterPrimaryPlayableAwemes(List<Aweme> list) {
        if (list == null) {
            return o91.I;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Aweme aweme = (Aweme) obj;
            if (isPrimaryAweme(aweme) && !aweme.getVideo().getPlayAddr().getUrlList().isEmpty()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final String formatCount(long j) {
        return j >= 100000000 ? String.format("%.1f亿", Arrays.copyOf(new Object[]{Double.valueOf(j / 1.0E8d)}, 1)) : j >= Renderer.DEFAULT_DURATION_TO_PROGRESS_US ? String.format("%.1f万", Arrays.copyOf(new Object[]{Double.valueOf(j / 10000.0d)}, 1)) : j >= 1000 ? String.format("%.1fk", Arrays.copyOf(new Object[]{Double.valueOf(j / 1000.0d)}, 1)) : String.valueOf(j);
    }

    public static final BitRate highestQualityBitRate(List<BitRate> list) {
        Object obj;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!((BitRate) obj2).getPlayAddr().getUrlList().isEmpty()) {
                arrayList.add(obj2);
            }
        }
        final Comparator comparator = new Comparator() { // from class: com.github.mytv.dv.model.DataModelKt$highestQualityBitRate$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                BitRate bitRate = (BitRate) t;
                BitRate bitRate2 = (BitRate) t2;
                return Integer.valueOf(bitRate.getPlayAddr().getHeight() * bitRate.getPlayAddr().getWidth()).compareTo(Integer.valueOf(bitRate2.getPlayAddr().getHeight() * bitRate2.getPlayAddr().getWidth()));
            }
        };
        final Comparator comparator2 = new Comparator() { // from class: com.github.mytv.dv.model.DataModelKt$highestQualityBitRate$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compare = comparator.compare(t, t2);
                return compare != 0 ? compare : Integer.valueOf(((BitRate) t).getFps()).compareTo(Integer.valueOf(((BitRate) t2).getFps()));
            }
        };
        final Comparator comparator3 = new Comparator() { // from class: com.github.mytv.dv.model.DataModelKt$highestQualityBitRate$$inlined$thenBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int encodingScore;
                int encodingScore2;
                int compare = comparator2.compare(t, t2);
                if (compare != 0) {
                    return compare;
                }
                encodingScore = DataModelKt.encodingScore((BitRate) t);
                Integer valueOf = Integer.valueOf(encodingScore);
                encodingScore2 = DataModelKt.encodingScore((BitRate) t2);
                return valueOf.compareTo(Integer.valueOf(encodingScore2));
            }
        };
        final Comparator comparator4 = new Comparator() { // from class: com.github.mytv.dv.model.DataModelKt$highestQualityBitRate$$inlined$thenBy$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compare = comparator3.compare(t, t2);
                return compare != 0 ? compare : Integer.valueOf(((BitRate) t).getBitRateValue()).compareTo(Integer.valueOf(((BitRate) t2).getBitRateValue()));
            }
        };
        Comparator comparator5 = new Comparator() { // from class: com.github.mytv.dv.model.DataModelKt$highestQualityBitRate$$inlined$thenBy$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compare = comparator4.compare(t, t2);
                if (compare != 0) {
                    return compare;
                }
                return (jx4.D(((BitRate) t).getGearName(), "adapt_lowest", true) ? r0 : 1).compareTo((Integer) (jx4.D(((BitRate) t2).getGearName(), "adapt_lowest", true) ? 0 : 1));
            }
        };
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                Object next2 = it.next();
                if (comparator5.compare(next, next2) < 0) {
                    next = next2;
                }
            }
            obj = next;
        } else {
            obj = null;
        }
        return (BitRate) obj;
    }

    public static final boolean isPrimaryAweme(Aweme aweme) {
        aweme.getClass();
        return aweme.getAwemeType() == 0;
    }

    private static final c jsonObjectOrNull(b bVar) {
        if (bVar instanceof c) {
            return (c) bVar;
        }
        return null;
    }

    private static final d jsonPrimitiveOrNull(b bVar) {
        if (bVar instanceof d) {
            return (d) bVar;
        }
        return null;
    }

    private static final String nonEmptyStringOrNull(b bVar) {
        d jsonPrimitiveOrNull = jsonPrimitiveOrNull(bVar);
        if (jsonPrimitiveOrNull != null) {
            if (!jsonPrimitiveOrNull.d()) {
                jsonPrimitiveOrNull = null;
            }
            if (jsonPrimitiveOrNull != null) {
                String c = jsonPrimitiveOrNull.c();
                if (c.length() > 0) {
                    return c;
                }
            }
        }
        return null;
    }

    public static final ResolvedLiveStream resolveLiveStreamBySdkData(StreamUrl streamUrl) {
        streamUrl.getClass();
        ResolvedStreamQuality resolvedStreamQuality = (ResolvedStreamQuality) o70.U0(resolveSdkQualities(streamUrl));
        if (resolvedStreamQuality != null) {
            return resolvedStreamQuality.toResolvedLiveStream();
        }
        return null;
    }

    public static final ResolvedLiveStream resolveLiveStreamForQuality(StreamUrl streamUrl, lq5 lq5Var) {
        streamUrl.getClass();
        lq5Var.getClass();
        List<ResolvedStreamQuality> resolveSdkQualities = resolveSdkQualities(streamUrl);
        return !resolveSdkQualities.isEmpty() ? resolveSdkQualities.get(selectQualityIndex(resolveSdkQualities.size(), lq5Var)).toResolvedLiveStream() : resolveLiveStreamWithFallback(streamUrl, lq5Var);
    }

    public static final ResolvedLiveStream resolveLiveStreamWithFallback(StreamUrl streamUrl, lq5 lq5Var) {
        String str;
        LiveCorePullData pullData;
        List<LiveStreamQuality> extractQualities;
        String name;
        streamUrl.getClass();
        lq5Var.getClass();
        Map<String, String> flvPullUrl = streamUrl.getFlvPullUrl();
        Map<String, String> map = p91.I;
        if (flvPullUrl == null) {
            flvPullUrl = map;
        }
        Map<String, String> hlsPullUrlMap = streamUrl.getHlsPullUrlMap();
        if (hlsPullUrlMap != null) {
            map = hlsPullUrlMap;
        }
        List<String> list = PULL_URL_MAP_ORDER_HIGH_TO_LOW;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String str2 = (String) obj;
            if (flvPullUrl.containsKey(str2) || map.containsKey(str2)) {
                arrayList.add(obj);
            }
        }
        str = "默认";
        if (!arrayList.isEmpty()) {
            String str3 = (String) arrayList.get(selectQualityIndex(arrayList.size(), lq5Var));
            mk2 K = p70.K();
            String str4 = flvPullUrl.get(str3);
            if (str4 != null) {
                if (jx4.L(str4)) {
                    str4 = null;
                }
                if (str4 != null) {
                    K.add(str4);
                }
            }
            String str5 = map.get(str3);
            if (str5 != null) {
                r5 = jx4.L(str5) ? null : str5;
                if (r5 != null) {
                    K.add(r5);
                }
            }
            mk2 D = p70.D(K);
            String str6 = PULL_URL_MAP_QUALITY_NAMES.get(str3);
            return new ResolvedLiveStream(D, str6 != null ? str6 : "默认");
        }
        List P0 = o70.P0(zk4.u(flvPullUrl.keySet(), map.keySet()));
        if (!P0.isEmpty()) {
            String str7 = (String) P0.get(selectQualityIndex(P0.size(), lq5Var));
            mk2 K2 = p70.K();
            String str8 = flvPullUrl.get(str7);
            if (str8 != null) {
                if (jx4.L(str8)) {
                    str8 = null;
                }
                if (str8 != null) {
                    K2.add(str8);
                }
            }
            String str9 = map.get(str7);
            if (str9 != null) {
                if (jx4.L(str9)) {
                    str9 = null;
                }
                if (str9 != null) {
                    K2.add(str9);
                }
            }
            mk2 D2 = p70.D(K2);
            if (!D2.isEmpty()) {
                LiveCoreSdkData liveCoreSdkData = streamUrl.getLiveCoreSdkData();
                if (liveCoreSdkData != null && (pullData = liveCoreSdkData.getPullData()) != null && (extractQualities = extractQualities(pullData)) != null) {
                    Iterator<T> it = extractQualities.iterator();
                    if (it.hasNext()) {
                        r5 = it.next();
                        if (it.hasNext()) {
                            int level = ((LiveStreamQuality) r5).getLevel();
                            do {
                                Object next = it.next();
                                int level2 = ((LiveStreamQuality) next).getLevel();
                                if (level < level2) {
                                    r5 = next;
                                    level = level2;
                                }
                            } while (it.hasNext());
                        }
                    }
                    LiveStreamQuality liveStreamQuality = (LiveStreamQuality) r5;
                    if (liveStreamQuality != null && (name = liveStreamQuality.getName()) != null && !jx4.L(name)) {
                        str = name;
                    }
                }
                return new ResolvedLiveStream(D2, str);
            }
        }
        return null;
    }

    public static /* synthetic */ ResolvedLiveStream resolveLiveStreamWithFallback$default(StreamUrl streamUrl, lq5 lq5Var, int i, Object obj) {
        if ((i & 1) != 0) {
            lq5Var = lq5.L;
        }
        return resolveLiveStreamWithFallback(streamUrl, lq5Var);
    }

    private static final List<ResolvedStreamQuality> resolveSdkQualities(StreamUrl streamUrl) {
        LiveCorePullData pullData;
        List D;
        c jsonObjectOrNull;
        b bVar;
        LiveCoreSdkData liveCoreSdkData = streamUrl.getLiveCoreSdkData();
        if (liveCoreSdkData != null && (pullData = liveCoreSdkData.getPullData()) != null) {
            List<LiveStreamQuality> extractQualities = extractQualities(pullData);
            if (extractQualities.isEmpty()) {
                extractQualities = null;
            }
            if (extractQualities != null) {
                b extractStreamDataRoot = extractStreamDataRoot(pullData);
                c jsonObjectOrNull2 = (extractStreamDataRoot == null || (jsonObjectOrNull = jsonObjectOrNull(extractStreamDataRoot)) == null || (bVar = (b) jsonObjectOrNull.get("data")) == null) ? null : jsonObjectOrNull(bVar);
                Map<String, String> flvPullUrl = streamUrl.getFlvPullUrl();
                Map<String, String> map = p91.I;
                if (flvPullUrl == null) {
                    flvPullUrl = map;
                }
                List r1 = o70.r1(flvPullUrl.values());
                Map<String, String> hlsPullUrlMap = streamUrl.getHlsPullUrlMap();
                if (hlsPullUrlMap != null) {
                    map = hlsPullUrlMap;
                }
                List r12 = o70.r1(map.values());
                ArrayList arrayList = new ArrayList();
                for (LiveStreamQuality liveStreamQuality : extractQualities) {
                    if (jsonObjectOrNull2 != null) {
                        D = extractMainLiveUrls((b) jsonObjectOrNull2.get(liveStreamQuality.getSdkKey()));
                    } else {
                        mk2 K = p70.K();
                        String str = (String) o70.V0(r1.size() - liveStreamQuality.getLevel(), r1);
                        if (str != null) {
                            if (jx4.L(str)) {
                                str = null;
                            }
                            if (str != null) {
                                K.add(str);
                            }
                        }
                        String str2 = (String) o70.V0(r12.size() - liveStreamQuality.getLevel(), r12);
                        if (str2 != null) {
                            if (jx4.L(str2)) {
                                str2 = null;
                            }
                            if (str2 != null) {
                                K.add(str2);
                            }
                        }
                        D = p70.D(K);
                    }
                    if (D.isEmpty()) {
                        D = null;
                    }
                    ResolvedStreamQuality resolvedStreamQuality = D != null ? new ResolvedStreamQuality(liveStreamQuality.getName(), liveStreamQuality.getLevel(), D) : null;
                    if (resolvedStreamQuality != null) {
                        arrayList.add(resolvedStreamQuality);
                    }
                }
                return o70.k1(arrayList, new Comparator() { // from class: com.github.mytv.dv.model.DataModelKt$resolveSdkQualities$$inlined$sortedByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return Integer.valueOf(((ResolvedStreamQuality) t2).getLevel()).compareTo(Integer.valueOf(((ResolvedStreamQuality) t).getLevel()));
                    }
                });
            }
        }
        return o91.I;
    }

    private static final int selectQualityIndex(int i, lq5 lq5Var) {
        int i2;
        int i3 = i - 1;
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[lq5Var.ordinal()];
        if (i4 == 1 || i4 == 2) {
            i2 = 0;
        } else if (i4 == 3) {
            i2 = mw2.O(i3 * 0.3333333333333333d);
        } else if (i4 == 4) {
            i2 = mw2.O(i3 * 0.5d);
        } else {
            if (i4 != 5) {
                s83.v();
                return 0;
            }
            i2 = i3;
        }
        return ut0.r(i2, 0, i3);
    }

    public static final Aweme takeIfPrimaryAweme(Aweme aweme) {
        if (aweme == null || !isPrimaryAweme(aweme)) {
            return null;
        }
        return aweme;
    }

    private static final b unwrapEmbeddedJsonStringOrNull(b bVar) {
        Object g54Var;
        if (!(bVar instanceof d)) {
            return bVar;
        }
        d dVar = (d) bVar;
        if (dVar.d()) {
            String obj = jx4.g0(dVar.c()).toString();
            if (obj.length() != 0 && (qx4.y(obj, "{", false) || qx4.y(obj, "[", false))) {
                try {
                    i62 i62Var = LenientJson;
                    i62Var.getClass();
                    g54Var = (b) i62Var.b(obj, u62.a);
                } catch (Throwable th) {
                    g54Var = new g54(th);
                }
                return (b) (g54Var instanceof g54 ? null : g54Var);
            }
        }
        return null;
    }
}

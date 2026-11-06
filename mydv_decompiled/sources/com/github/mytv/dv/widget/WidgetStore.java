package com.github.mytv.dv.widget;

import android.content.Context;
import android.content.SharedPreferences;
import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.model.MixInfo;
import defpackage.dl4;
import defpackage.er0;
import defpackage.fl4;
import defpackage.fw4;
import defpackage.g54;
import defpackage.i62;
import defpackage.j42;
import defpackage.jx4;
import defpackage.l62;
import defpackage.m45;
import defpackage.o63;
import defpackage.o70;
import defpackage.o91;
import defpackage.p70;
import defpackage.sp0;
import defpackage.wd5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class WidgetStore {
    public static final int $stable = 0;
    private static final String HISTORY = "history";
    private static final String LATER = "later";
    private static final String LIVE = "live";
    private static final String MIX = "mix";
    private static final String PREFS = "mydv_desktop_widgets";
    private static final String SEARCH = "search";
    public static final WidgetStore INSTANCE = new WidgetStore();
    private static final i62 json = sp0.d(new m45(19));

    private WidgetStore() {
    }

    private final boolean canSave(Context context, String str) {
        return !jx4.L(str) && new fl4(context).i().equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 json$lambda$0(l62 l62Var) {
        l62Var.getClass();
        l62Var.b = true;
        l62Var.a = true;
        return wd5.a;
    }

    private final SharedPreferences prefs(Context context) {
        return context.getApplicationContext().getSharedPreferences(PREFS, 0);
    }

    private final <T> T read(Context context, String str, T t) {
        if (prefs(context).getString(str, null) == null) {
            return t;
        }
        try {
            o63 o63Var = json.b;
            j42.f0();
            throw null;
        } catch (Throwable th) {
            g54 g54Var = new g54(th);
            g54 g54Var2 = g54Var instanceof g54 ? null : g54Var;
            return g54Var2 != null ? (T) g54Var2 : t;
        }
    }

    private final <T> void write(Context context, String str, T t) {
        prefs(context).edit();
        o63 o63Var = json.b;
        j42.f0();
        throw null;
    }

    public final void clear(Context context) {
        context.getClass();
        prefs(context).edit().clear().commit();
    }

    public final VideoListSnapshot history(Context context) {
        Object g54Var;
        context.getClass();
        Object videoListSnapshot = new VideoListSnapshot((String) null, (WidgetLoadState) null, (List) null, 7, (er0) null);
        String string = prefs(context).getString(HISTORY, null);
        if (string != null) {
            try {
                i62 i62Var = json;
                o63 o63Var = i62Var.b;
                g54Var = i62Var.b(string, VideoListSnapshot.Companion.serializer());
            } catch (Throwable th) {
                g54Var = new g54(th);
            }
            boolean z = g54Var instanceof g54;
            Object obj = g54Var;
            if (z) {
                obj = null;
            }
            if (obj != null) {
                videoListSnapshot = obj;
            }
        }
        return (VideoListSnapshot) videoListSnapshot;
    }

    public final boolean isLocked(fl4 fl4Var) {
        Object obj;
        fl4Var.getClass();
        Iterator it = ((Iterable) ((fw4) fl4Var.h0.I).getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (j42.c(((dl4) obj).a, fl4Var.i())) {
                break;
            }
        }
        dl4 dl4Var = (dl4) obj;
        return dl4Var != null && dl4Var.b();
    }

    public final VideoListSnapshot later(Context context) {
        Object g54Var;
        context.getClass();
        Object videoListSnapshot = new VideoListSnapshot((String) null, (WidgetLoadState) null, (List) null, 7, (er0) null);
        String string = prefs(context).getString(LATER, null);
        if (string != null) {
            try {
                i62 i62Var = json;
                o63 o63Var = i62Var.b;
                g54Var = i62Var.b(string, VideoListSnapshot.Companion.serializer());
            } catch (Throwable th) {
                g54Var = new g54(th);
            }
            boolean z = g54Var instanceof g54;
            Object obj = g54Var;
            if (z) {
                obj = null;
            }
            if (obj != null) {
                videoListSnapshot = obj;
            }
        }
        return (VideoListSnapshot) videoListSnapshot;
    }

    public final LiveSnapshot live(Context context) {
        Object g54Var;
        context.getClass();
        Object liveSnapshot = new LiveSnapshot((String) null, (WidgetLoadState) null, (List) null, 0L, 15, (er0) null);
        String string = prefs(context).getString(LIVE, null);
        if (string != null) {
            try {
                i62 i62Var = json;
                o63 o63Var = i62Var.b;
                g54Var = i62Var.b(string, LiveSnapshot.Companion.serializer());
            } catch (Throwable th) {
                g54Var = new g54(th);
            }
            boolean z = g54Var instanceof g54;
            Object obj = g54Var;
            if (z) {
                obj = null;
            }
            if (obj != null) {
                liveSnapshot = obj;
            }
        }
        return (LiveSnapshot) liveSnapshot;
    }

    public final MixSnapshot mix(Context context) {
        Object g54Var;
        context.getClass();
        Object mixSnapshot = new MixSnapshot((String) null, (WidgetLoadState) null, (List) null, 7, (er0) null);
        String string = prefs(context).getString(MIX, null);
        if (string != null) {
            try {
                i62 i62Var = json;
                o63 o63Var = i62Var.b;
                g54Var = i62Var.b(string, MixSnapshot.Companion.serializer());
            } catch (Throwable th) {
                g54Var = new g54(th);
            }
            boolean z = g54Var instanceof g54;
            Object obj = g54Var;
            if (z) {
                obj = null;
            }
            if (obj != null) {
                mixSnapshot = obj;
            }
        }
        return (MixSnapshot) mixSnapshot;
    }

    public final synchronized void recordVideo(Context context, Aweme aweme) {
        Object obj;
        try {
            context.getClass();
            aweme.getClass();
            fl4 fl4Var = new fl4(context);
            String i = fl4Var.i();
            if (!jx4.L(i) && fl4Var.v() && !isLocked(fl4Var)) {
                WidgetVideo widgetVideo = WidgetDataKt.toWidgetVideo(aweme);
                VideoListSnapshot history = history(context);
                if (!j42.c(history.getAccountId(), i)) {
                    history = null;
                }
                if (history == null) {
                    history = new VideoListSnapshot(i, (WidgetLoadState) null, (List) null, 6, (er0) null);
                }
                VideoListSnapshot videoListSnapshot = history;
                WidgetLoadState widgetLoadState = WidgetLoadState.READY;
                List j0 = p70.j0(widgetVideo);
                List<WidgetVideo> items = videoListSnapshot.getItems();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : items) {
                    if (!j42.c(((WidgetVideo) obj2).getId(), widgetVideo.getId())) {
                        arrayList.add(obj2);
                    }
                }
                saveHistory(context, VideoListSnapshot.copy$default(videoListSnapshot, null, widgetLoadState, o70.l1(o70.f1(j0, arrayList), 20), 1, null));
                MixInfo mixInfo = aweme.getMixInfo();
                if (mixInfo == null) {
                    return;
                }
                if (jx4.L(mixInfo.getMixId())) {
                    return;
                }
                MixSnapshot mix = mix(context);
                if (!j42.c(mix.getAccountId(), i)) {
                    mix = null;
                }
                if (mix == null) {
                    mix = new MixSnapshot(i, (WidgetLoadState) null, (List) null, 6, (er0) null);
                }
                Iterator<T> it = mix.getItems().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (j42.c(((WidgetMixItem) obj).getId(), mixInfo.getMixId())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                WidgetMixItem widgetMixItem = (WidgetMixItem) obj;
                int currentEpisode = mixInfo.getStatis().getCurrentEpisode();
                int episode = widgetMixItem != null ? widgetMixItem.getEpisode() : 0;
                if (currentEpisode < episode) {
                    currentEpisode = episode;
                }
                int N = j42.N(mixInfo.getStatis().getTotalEpisode(), mixInfo.getStatis().getUpdatedToEpisode(), mixInfo.getStatis().getCurrentEpisode(), widgetMixItem != null ? widgetMixItem.getTotal() : 0);
                String mixId = mixInfo.getMixId();
                String mixName = mixInfo.getMixName();
                if (jx4.L(mixName)) {
                    mixName = widgetMixItem != null ? widgetMixItem.getName() : null;
                    if (mixName == null) {
                        mixName = "";
                    }
                }
                String str = mixName;
                String nickname = aweme.getAuthor().getNickname();
                if (jx4.L(nickname)) {
                    nickname = widgetMixItem != null ? widgetMixItem.getAuthor() : null;
                    if (nickname == null) {
                        nickname = "";
                    }
                }
                String str2 = nickname;
                String str3 = (String) o70.U0(mixInfo.getCoverUrl().getUrlList());
                if (str3 == null) {
                    String coverUrl = widgetVideo.getCoverUrl();
                    if (jx4.L(coverUrl)) {
                        coverUrl = widgetMixItem != null ? widgetMixItem.getCoverUrl() : null;
                        if (coverUrl == null) {
                            coverUrl = "";
                        }
                    }
                    str3 = coverUrl;
                }
                String str4 = str3;
                String awemeId = aweme.getAwemeId();
                List<WidgetEpisode> nextEpisodes = widgetMixItem != null ? widgetMixItem.getNextEpisodes() : null;
                if (nextEpisodes == null) {
                    nextEpisodes = o91.I;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : nextEpisodes) {
                    if (((WidgetEpisode) obj3).getNumber() > currentEpisode) {
                        arrayList2.add(obj3);
                    }
                }
                WidgetMixItem widgetMixItem2 = new WidgetMixItem(mixId, str, str2, str4, currentEpisode, N, awemeId, arrayList2);
                WidgetLoadState widgetLoadState2 = WidgetLoadState.READY;
                List j02 = p70.j0(widgetMixItem2);
                List<WidgetMixItem> items2 = mix.getItems();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : items2) {
                    if (!j42.c(((WidgetMixItem) obj4).getId(), mixInfo.getMixId())) {
                        arrayList3.add(obj4);
                    }
                }
                saveMix(context, MixSnapshot.copy$default(mix, null, widgetLoadState2, o70.l1(o70.f1(j02, arrayList3), 3), 1, null));
            }
        } finally {
        }
    }

    public final void saveHistory(Context context, VideoListSnapshot videoListSnapshot) {
        context.getClass();
        videoListSnapshot.getClass();
        if (canSave(context, videoListSnapshot.getAccountId())) {
            SharedPreferences.Editor edit = prefs(context).edit();
            i62 i62Var = json;
            o63 o63Var = i62Var.b;
            edit.putString(HISTORY, i62Var.c(VideoListSnapshot.Companion.serializer(), videoListSnapshot)).commit();
        }
    }

    public final void saveLater(Context context, VideoListSnapshot videoListSnapshot) {
        context.getClass();
        videoListSnapshot.getClass();
        if (canSave(context, videoListSnapshot.getAccountId())) {
            SharedPreferences.Editor edit = prefs(context).edit();
            i62 i62Var = json;
            o63 o63Var = i62Var.b;
            edit.putString(LATER, i62Var.c(VideoListSnapshot.Companion.serializer(), videoListSnapshot)).commit();
        }
    }

    public final void saveLive(Context context, LiveSnapshot liveSnapshot) {
        context.getClass();
        liveSnapshot.getClass();
        if (canSave(context, liveSnapshot.getAccountId())) {
            SharedPreferences.Editor edit = prefs(context).edit();
            i62 i62Var = json;
            o63 o63Var = i62Var.b;
            edit.putString(LIVE, i62Var.c(LiveSnapshot.Companion.serializer(), liveSnapshot)).commit();
        }
    }

    public final void saveMix(Context context, MixSnapshot mixSnapshot) {
        context.getClass();
        mixSnapshot.getClass();
        if (canSave(context, mixSnapshot.getAccountId())) {
            SharedPreferences.Editor edit = prefs(context).edit();
            i62 i62Var = json;
            o63 o63Var = i62Var.b;
            edit.putString(MIX, i62Var.c(MixSnapshot.Companion.serializer(), mixSnapshot)).commit();
        }
    }

    public final void saveSearch(Context context, SearchSnapshot searchSnapshot) {
        context.getClass();
        searchSnapshot.getClass();
        if (canSave(context, searchSnapshot.getAccountId())) {
            SharedPreferences.Editor edit = prefs(context).edit();
            i62 i62Var = json;
            o63 o63Var = i62Var.b;
            edit.putString(SEARCH, i62Var.c(SearchSnapshot.Companion.serializer(), searchSnapshot)).commit();
        }
    }

    public final SearchSnapshot search(Context context) {
        Object g54Var;
        context.getClass();
        Object searchSnapshot = new SearchSnapshot((String) null, (WidgetLoadState) null, (List) null, 7, (er0) null);
        String string = prefs(context).getString(SEARCH, null);
        if (string != null) {
            try {
                i62 i62Var = json;
                o63 o63Var = i62Var.b;
                g54Var = i62Var.b(string, SearchSnapshot.Companion.serializer());
            } catch (Throwable th) {
                g54Var = new g54(th);
            }
            boolean z = g54Var instanceof g54;
            Object obj = g54Var;
            if (z) {
                obj = null;
            }
            if (obj != null) {
                searchSnapshot = obj;
            }
        }
        return (SearchSnapshot) searchSnapshot;
    }
}

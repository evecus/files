package com.github.mytv.dv.widget;

import android.content.Context;
import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.model.HotWord;
import com.github.mytv.dv.model.LiveRoom;
import defpackage.el0;
import defpackage.fj0;
import defpackage.fl4;
import defpackage.k21;
import defpackage.p70;
import defpackage.s83;
import defpackage.wd5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class WidgetUpdater {
    public static final int $stable = 0;
    public static final WidgetUpdater INSTANCE = new WidgetUpdater();

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WidgetKind.values().length];
            try {
                iArr[WidgetKind.HISTORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WidgetKind.LATER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WidgetKind.MIX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WidgetKind.LIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WidgetKind.SEARCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private WidgetUpdater() {
    }

    public final Object pushLive(Context context, List<LiveRoom> list, fj0 fj0Var) {
        fl4 fl4Var = new fl4(context);
        WidgetStore widgetStore = WidgetStore.INSTANCE;
        String i = fl4Var.i();
        WidgetLoadState widgetLoadState = WidgetLoadState.READY;
        ArrayList arrayList = new ArrayList(p70.J(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(WidgetDataKt.toWidgetLiveItem((LiveRoom) it.next()));
        }
        widgetStore.saveLive(context, new LiveSnapshot(i, widgetLoadState, arrayList, System.currentTimeMillis()));
        Object updateKind = updateKind(context, WidgetKind.LIVE, fj0Var);
        return updateKind == el0.I ? updateKind : wd5.a;
    }

    public final Object pushSearch(Context context, List<HotWord> list, fj0 fj0Var) {
        fl4 fl4Var = new fl4(context);
        WidgetStore widgetStore = WidgetStore.INSTANCE;
        String i = fl4Var.i();
        WidgetLoadState widgetLoadState = WidgetLoadState.READY;
        ArrayList arrayList = new ArrayList(p70.J(list, 10));
        for (HotWord hotWord : list) {
            arrayList.add(new WidgetHotWord(hotWord.getWord(), hotWord.getLabel()));
        }
        widgetStore.saveSearch(context, new SearchSnapshot(i, widgetLoadState, arrayList));
        Object updateKind = updateKind(context, WidgetKind.SEARCH, fj0Var);
        return updateKind == el0.I ? updateKind : wd5.a;
    }

    public final Object pushVideos(Context context, WidgetKind widgetKind, List<Aweme> list, fj0 fj0Var) {
        if (widgetKind != WidgetKind.HISTORY && widgetKind != WidgetKind.LATER) {
            s83.t("Failed requirement.");
            return null;
        }
        String i = new fl4(context).i();
        WidgetLoadState widgetLoadState = WidgetLoadState.READY;
        ArrayList arrayList = new ArrayList(p70.J(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(WidgetDataKt.toWidgetVideo((Aweme) it.next()));
        }
        VideoListSnapshot videoListSnapshot = new VideoListSnapshot(i, widgetLoadState, arrayList);
        if (widgetKind == WidgetKind.HISTORY) {
            WidgetStore.INSTANCE.saveHistory(context, videoListSnapshot);
        } else {
            WidgetStore.INSTANCE.saveLater(context, videoListSnapshot);
        }
        Object updateKind = updateKind(context, widgetKind, fj0Var);
        return updateKind == el0.I ? updateKind : wd5.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        if (updateKind(r7, r8, r0) != r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (updateKind(r7, r8, r0) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object recordVideo(android.content.Context r7, com.github.mytv.dv.model.Aweme r8, defpackage.fj0 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.github.mytv.dv.widget.WidgetUpdater$recordVideo$1
            if (r0 == 0) goto L13
            r0 = r9
            com.github.mytv.dv.widget.WidgetUpdater$recordVideo$1 r0 = (com.github.mytv.dv.widget.WidgetUpdater$recordVideo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.github.mytv.dv.widget.WidgetUpdater$recordVideo$1 r0 = new com.github.mytv.dv.widget.WidgetUpdater$recordVideo$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            el0 r5 = defpackage.el0.I
            if (r1 == 0) goto L45
            if (r1 == r3) goto L39
            if (r1 != r2) goto L33
            java.lang.Object r6 = r0.L$1
            com.github.mytv.dv.model.Aweme r6 = (com.github.mytv.dv.model.Aweme) r6
            java.lang.Object r6 = r0.L$0
            android.content.Context r6 = (android.content.Context) r6
            defpackage.mu0.V(r9)
            goto L6b
        L33:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r6)
            return r4
        L39:
            java.lang.Object r7 = r0.L$1
            com.github.mytv.dv.model.Aweme r7 = (com.github.mytv.dv.model.Aweme) r7
            java.lang.Object r7 = r0.L$0
            android.content.Context r7 = (android.content.Context) r7
            defpackage.mu0.V(r9)
            goto L5c
        L45:
            defpackage.mu0.V(r9)
            com.github.mytv.dv.widget.WidgetStore r9 = com.github.mytv.dv.widget.WidgetStore.INSTANCE
            r9.recordVideo(r7, r8)
            com.github.mytv.dv.widget.WidgetKind r8 = com.github.mytv.dv.widget.WidgetKind.HISTORY
            r0.L$0 = r7
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r8 = r6.updateKind(r7, r8, r0)
            if (r8 != r5) goto L5c
            goto L6a
        L5c:
            com.github.mytv.dv.widget.WidgetKind r8 = com.github.mytv.dv.widget.WidgetKind.MIX
            r0.L$0 = r4
            r0.L$1 = r4
            r0.label = r2
            java.lang.Object r6 = r6.updateKind(r7, r8, r0)
            if (r6 != r5) goto L6b
        L6a:
            return r5
        L6b:
            wd5 r6 = defpackage.wd5.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.widget.WidgetUpdater.recordVideo(android.content.Context, com.github.mytv.dv.model.Aweme, fj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (defpackage.k21.u0(r8, r7, r0) == r4) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateAll(android.content.Context r8, defpackage.fj0 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.github.mytv.dv.widget.WidgetUpdater$updateAll$1
            if (r0 == 0) goto L13
            r0 = r9
            com.github.mytv.dv.widget.WidgetUpdater$updateAll$1 r0 = (com.github.mytv.dv.widget.WidgetUpdater$updateAll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.github.mytv.dv.widget.WidgetUpdater$updateAll$1 r0 = new com.github.mytv.dv.widget.WidgetUpdater$updateAll$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r7 = r0.result
            int r9 = r0.label
            r1 = 2
            r2 = 1
            r3 = 0
            if (r9 == 0) goto L48
            if (r9 == r2) goto L33
            if (r9 != r1) goto L2d
            java.lang.Object r8 = r0.L$0
            android.content.Context r8 = (android.content.Context) r8
            defpackage.mu0.V(r7)
            goto L91
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r7)
            return r3
        L33:
            java.lang.Object r8 = r0.L$4
            com.github.mytv.dv.widget.WidgetKind r8 = (com.github.mytv.dv.widget.WidgetKind) r8
            java.lang.Object r8 = r0.L$2
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.L$1
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.lang.Object r9 = r0.L$0
            android.content.Context r9 = (android.content.Context) r9
            defpackage.mu0.V(r7)
            r7 = r9
            goto L56
        L48:
            defpackage.mu0.V(r7)
            ya1 r7 = com.github.mytv.dv.widget.WidgetKind.getEntries()
            java.util.Iterator r7 = r7.iterator()
            r6 = r8
            r8 = r7
            r7 = r6
        L56:
            boolean r9 = r8.hasNext()
            el0 r4 = defpackage.el0.I
            if (r9 == 0) goto L79
            java.lang.Object r9 = r8.next()
            com.github.mytv.dv.widget.WidgetKind r9 = (com.github.mytv.dv.widget.WidgetKind) r9
            com.github.mytv.dv.widget.WidgetUpdater r5 = com.github.mytv.dv.widget.WidgetUpdater.INSTANCE
            r0.L$0 = r7
            r0.L$1 = r3
            r0.L$2 = r8
            r0.L$3 = r3
            r0.L$4 = r3
            r0.label = r2
            java.lang.Object r9 = r5.updateKind(r7, r9, r0)
            if (r9 != r4) goto L56
            goto L90
        L79:
            com.github.mytv.dv.widget.NowPlayingWidget r8 = new com.github.mytv.dv.widget.NowPlayingWidget
            r8.<init>()
            r0.L$0 = r3
            r0.L$1 = r3
            r0.L$2 = r3
            r0.L$3 = r3
            r0.L$4 = r3
            r0.label = r1
            java.lang.Object r7 = defpackage.k21.u0(r8, r7, r0)
            if (r7 != r4) goto L91
        L90:
            return r4
        L91:
            wd5 r7 = defpackage.wd5.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.widget.WidgetUpdater.updateAll(android.content.Context, fj0):java.lang.Object");
    }

    public final Object updateKind(Context context, WidgetKind widgetKind, fj0 fj0Var) {
        int i = WhenMappings.$EnumSwitchMapping$0[widgetKind.ordinal()];
        el0 el0Var = el0.I;
        wd5 wd5Var = wd5.a;
        if (i == 1) {
            Object u0 = k21.u0(new ContinueWidget(), context, fj0Var);
            return u0 == el0Var ? u0 : wd5Var;
        }
        if (i == 2) {
            Object u02 = k21.u0(new WatchLaterWidget(), context, fj0Var);
            return u02 == el0Var ? u02 : wd5Var;
        }
        if (i == 3) {
            Object u03 = k21.u0(new MixWidget(), context, fj0Var);
            return u03 == el0Var ? u03 : wd5Var;
        }
        if (i == 4) {
            Object u04 = k21.u0(new LiveWidget(), context, fj0Var);
            return u04 == el0Var ? u04 : wd5Var;
        }
        if (i == 5) {
            Object u05 = k21.u0(new SearchWidget(), context, fj0Var);
            return u05 == el0Var ? u05 : wd5Var;
        }
        s83.v();
        return null;
    }
}

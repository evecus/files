package com.github.mytv.dv.widget;

import android.content.Context;
import defpackage.er0;
import defpackage.s83;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class WidgetRefresher {
    public static final int $stable = 0;
    public static final WidgetRefresher INSTANCE = new WidgetRefresher();

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

    private WidgetRefresher() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x007b, code lost:
    
        if (r1.size() < (r11 + 4)) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x012a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x029c  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, kq5] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [o91] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x00a6 -> B:10:0x00aa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadMixItem(defpackage.kq5 r20, com.github.mytv.dv.model.Aweme r21, defpackage.fj0 r22) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.widget.WidgetRefresher.loadMixItem(kq5, com.github.mytv.dv.model.Aweme, fj0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0079 A[LOOP:0: B:11:0x0073->B:13:0x0079, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshHistory(android.content.Context r5, defpackage.kq5 r6, java.lang.String r7, defpackage.fj0 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.github.mytv.dv.widget.WidgetRefresher$refreshHistory$1
            if (r0 == 0) goto L13
            r0 = r8
            com.github.mytv.dv.widget.WidgetRefresher$refreshHistory$1 r0 = (com.github.mytv.dv.widget.WidgetRefresher$refreshHistory$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.github.mytv.dv.widget.WidgetRefresher$refreshHistory$1 r0 = new com.github.mytv.dv.widget.WidgetRefresher$refreshHistory$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r4 = r0.result
            int r8 = r0.label
            r1 = 0
            r2 = 1
            if (r8 == 0) goto L3d
            if (r8 != r2) goto L37
            java.lang.Object r5 = r0.L$2
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r0.L$1
            kq5 r5 = (defpackage.kq5) r5
            java.lang.Object r5 = r0.L$0
            android.content.Context r5 = (android.content.Context) r5
            defpackage.mu0.V(r4)
            h54 r4 = (defpackage.h54) r4
            java.lang.Object r4 = r4.I
            goto L53
        L37:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return r1
        L3d:
            defpackage.mu0.V(r4)
            r0.L$0 = r5
            r0.L$1 = r1
            r0.L$2 = r7
            r0.label = r2
            r1 = 0
            java.lang.Object r4 = r6.F(r1, r0)
            el0 r6 = defpackage.el0.I
            if (r4 != r6) goto L53
            return r6
        L53:
            defpackage.mu0.V(r4)
            com.github.mytv.dv.model.UserWorksResponse r4 = (com.github.mytv.dv.model.UserWorksResponse) r4
            java.util.List r4 = r4.getAwemeList()
            java.util.List r4 = com.github.mytv.dv.model.DataModelKt.filterPrimaryPlayableAwemes(r4)
            com.github.mytv.dv.widget.WidgetStore r6 = com.github.mytv.dv.widget.WidgetStore.INSTANCE
            com.github.mytv.dv.widget.WidgetLoadState r8 = com.github.mytv.dv.widget.WidgetLoadState.READY
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.p70.J(r4, r1)
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L73:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L87
            java.lang.Object r1 = r4.next()
            com.github.mytv.dv.model.Aweme r1 = (com.github.mytv.dv.model.Aweme) r1
            com.github.mytv.dv.widget.WidgetVideo r1 = com.github.mytv.dv.widget.WidgetDataKt.toWidgetVideo(r1)
            r0.add(r1)
            goto L73
        L87:
            com.github.mytv.dv.widget.VideoListSnapshot r4 = new com.github.mytv.dv.widget.VideoListSnapshot
            r4.<init>(r7, r8, r0)
            r6.saveHistory(r5, r4)
            wd5 r4 = defpackage.wd5.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.widget.WidgetRefresher.refreshHistory(android.content.Context, kq5, java.lang.String, fj0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070 A[LOOP:0: B:11:0x006a->B:13:0x0070, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshLater(android.content.Context r5, defpackage.kq5 r6, java.lang.String r7, defpackage.fj0 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.github.mytv.dv.widget.WidgetRefresher$refreshLater$1
            if (r0 == 0) goto L13
            r0 = r8
            com.github.mytv.dv.widget.WidgetRefresher$refreshLater$1 r0 = (com.github.mytv.dv.widget.WidgetRefresher$refreshLater$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.github.mytv.dv.widget.WidgetRefresher$refreshLater$1 r0 = new com.github.mytv.dv.widget.WidgetRefresher$refreshLater$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r4 = r0.result
            int r8 = r0.label
            r1 = 0
            r2 = 1
            if (r8 == 0) goto L3d
            if (r8 != r2) goto L37
            java.lang.Object r5 = r0.L$2
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r0.L$1
            kq5 r5 = (defpackage.kq5) r5
            java.lang.Object r5 = r0.L$0
            android.content.Context r5 = (android.content.Context) r5
            defpackage.mu0.V(r4)
            h54 r4 = (defpackage.h54) r4
            java.lang.Object r4 = r4.I
            goto L52
        L37:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return r1
        L3d:
            defpackage.mu0.V(r4)
            r0.L$0 = r5
            r0.L$1 = r1
            r0.L$2 = r7
            r0.label = r2
            r4 = 0
            java.lang.Object r4 = r6.G(r4, r0)
            el0 r6 = defpackage.el0.I
            if (r4 != r6) goto L52
            return r6
        L52:
            defpackage.mu0.V(r4)
            java.util.List r4 = (java.util.List) r4
            com.github.mytv.dv.widget.WidgetStore r6 = com.github.mytv.dv.widget.WidgetStore.INSTANCE
            com.github.mytv.dv.widget.WidgetLoadState r8 = com.github.mytv.dv.widget.WidgetLoadState.READY
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.p70.J(r4, r1)
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L6a:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L7e
            java.lang.Object r1 = r4.next()
            com.github.mytv.dv.model.Aweme r1 = (com.github.mytv.dv.model.Aweme) r1
            com.github.mytv.dv.widget.WidgetVideo r1 = com.github.mytv.dv.widget.WidgetDataKt.toWidgetVideo(r1)
            r0.add(r1)
            goto L6a
        L7e:
            com.github.mytv.dv.widget.VideoListSnapshot r4 = new com.github.mytv.dv.widget.VideoListSnapshot
            r4.<init>(r7, r8, r0)
            r6.saveLater(r5, r4)
            wd5 r4 = defpackage.wd5.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.widget.WidgetRefresher.refreshLater(android.content.Context, kq5, java.lang.String, fj0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9 A[LOOP:2: B:33:0x00b7->B:34:0x00b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshLive(android.content.Context r7, defpackage.kq5 r8, java.lang.String r9, defpackage.fj0 r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.github.mytv.dv.widget.WidgetRefresher$refreshLive$1
            if (r0 == 0) goto L13
            r0 = r10
            com.github.mytv.dv.widget.WidgetRefresher$refreshLive$1 r0 = (com.github.mytv.dv.widget.WidgetRefresher$refreshLive$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.github.mytv.dv.widget.WidgetRefresher$refreshLive$1 r0 = new com.github.mytv.dv.widget.WidgetRefresher$refreshLive$1
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r6 = r0.result
            int r10 = r0.label
            r1 = 0
            r2 = 1
            if (r10 == 0) goto L3e
            if (r10 != r2) goto L38
            java.lang.Object r7 = r0.L$2
            r9 = r7
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r7 = r0.L$1
            kq5 r7 = (defpackage.kq5) r7
            java.lang.Object r7 = r0.L$0
            android.content.Context r7 = (android.content.Context) r7
            defpackage.mu0.V(r6)
            h54 r6 = (defpackage.h54) r6
            java.lang.Object r6 = r6.I
        L36:
            r1 = r9
            goto L52
        L38:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r6)
            return r1
        L3e:
            defpackage.mu0.V(r6)
            r0.L$0 = r7
            r0.L$1 = r1
            r0.L$2 = r9
            r0.label = r2
            java.lang.Object r6 = r8.m(r0)
            el0 r8 = defpackage.el0.I
            if (r6 != r8) goto L36
            return r8
        L52:
            defpackage.mu0.V(r6)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r6 = r6.iterator()
        L60:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L7b
            java.lang.Object r9 = r6.next()
            r10 = r9
            com.github.mytv.dv.model.LiveRoom r10 = (com.github.mytv.dv.model.LiveRoom) r10
            java.lang.String r10 = r10.getResolvedRoomId()
            boolean r10 = defpackage.jx4.L(r10)
            if (r10 != 0) goto L60
            r8.add(r9)
            goto L60
        L7b:
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int r10 = r8.size()
            r0 = 0
            r2 = r0
        L8b:
            if (r2 >= r10) goto La4
            java.lang.Object r3 = r8.get(r2)
            int r2 = r2 + 1
            r4 = r3
            com.github.mytv.dv.model.LiveRoom r4 = (com.github.mytv.dv.model.LiveRoom) r4
            java.lang.String r4 = r4.getResolvedRoomId()
            boolean r4 = r6.add(r4)
            if (r4 == 0) goto L8b
            r9.add(r3)
            goto L8b
        La4:
            com.github.mytv.dv.widget.WidgetStore r6 = com.github.mytv.dv.widget.WidgetStore.INSTANCE
            com.github.mytv.dv.widget.WidgetLoadState r2 = com.github.mytv.dv.widget.WidgetLoadState.READY
            java.util.ArrayList r3 = new java.util.ArrayList
            r8 = 10
            int r8 = defpackage.p70.J(r9, r8)
            r3.<init>(r8)
            int r8 = r9.size()
        Lb7:
            if (r0 >= r8) goto Lc9
            java.lang.Object r10 = r9.get(r0)
            int r0 = r0 + 1
            com.github.mytv.dv.model.LiveRoom r10 = (com.github.mytv.dv.model.LiveRoom) r10
            com.github.mytv.dv.widget.WidgetLiveItem r10 = com.github.mytv.dv.widget.WidgetDataKt.toWidgetLiveItem(r10)
            r3.add(r10)
            goto Lb7
        Lc9:
            long r4 = java.lang.System.currentTimeMillis()
            com.github.mytv.dv.widget.LiveSnapshot r0 = new com.github.mytv.dv.widget.LiveSnapshot
            r0.<init>(r1, r2, r3, r4)
            r6.saveLive(r7, r0)
            wd5 r6 = defpackage.wd5.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.widget.WidgetRefresher.refreshLive(android.content.Context, kq5, java.lang.String, fj0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00af, code lost:
    
        if (r9 == r7) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f3 A[LOOP:0: B:28:0x00e6->B:30:0x00f3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0106 A[EDGE_INSN: B:31:0x0106->B:32:0x0106 BREAK  A[LOOP:0: B:28:0x00e6->B:30:0x00f3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0096  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x023f -> B:11:0x0243). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshMix(android.content.Context r20, defpackage.kq5 r21, java.lang.String r22, defpackage.fl4 r23, defpackage.fj0 r24) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.widget.WidgetRefresher.refreshMix(android.content.Context, kq5, java.lang.String, fl4, fj0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c A[LOOP:1: B:22:0x008a->B:23:0x008c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshSearch(android.content.Context r5, defpackage.kq5 r6, java.lang.String r7, defpackage.fj0 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.github.mytv.dv.widget.WidgetRefresher$refreshSearch$1
            if (r0 == 0) goto L13
            r0 = r8
            com.github.mytv.dv.widget.WidgetRefresher$refreshSearch$1 r0 = (com.github.mytv.dv.widget.WidgetRefresher$refreshSearch$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.github.mytv.dv.widget.WidgetRefresher$refreshSearch$1 r0 = new com.github.mytv.dv.widget.WidgetRefresher$refreshSearch$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r4 = r0.result
            int r8 = r0.label
            r1 = 0
            r2 = 1
            if (r8 == 0) goto L3d
            if (r8 != r2) goto L37
            java.lang.Object r5 = r0.L$2
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r0.L$1
            kq5 r5 = (defpackage.kq5) r5
            java.lang.Object r5 = r0.L$0
            android.content.Context r5 = (android.content.Context) r5
            defpackage.mu0.V(r4)
            h54 r4 = (defpackage.h54) r4
            java.lang.Object r4 = r4.I
            goto L51
        L37:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return r1
        L3d:
            defpackage.mu0.V(r4)
            r0.L$0 = r5
            r0.L$1 = r1
            r0.L$2 = r7
            r0.label = r2
            java.lang.Object r4 = r6.k(r0)
            el0 r6 = defpackage.el0.I
            if (r4 != r6) goto L51
            return r6
        L51:
            defpackage.mu0.V(r4)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        L5f:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L7a
            java.lang.Object r8 = r4.next()
            r0 = r8
            com.github.mytv.dv.model.HotWord r0 = (com.github.mytv.dv.model.HotWord) r0
            java.lang.String r0 = r0.getWord()
            boolean r0 = defpackage.jx4.L(r0)
            if (r0 != 0) goto L5f
            r6.add(r8)
            goto L5f
        L7a:
            java.util.ArrayList r4 = new java.util.ArrayList
            r8 = 10
            int r8 = defpackage.p70.J(r6, r8)
            r4.<init>(r8)
            int r8 = r6.size()
            r0 = 0
        L8a:
            if (r0 >= r8) goto La5
            java.lang.Object r1 = r6.get(r0)
            int r0 = r0 + 1
            com.github.mytv.dv.model.HotWord r1 = (com.github.mytv.dv.model.HotWord) r1
            com.github.mytv.dv.widget.WidgetHotWord r2 = new com.github.mytv.dv.widget.WidgetHotWord
            java.lang.String r3 = r1.getWord()
            int r1 = r1.getLabel()
            r2.<init>(r3, r1)
            r4.add(r2)
            goto L8a
        La5:
            com.github.mytv.dv.widget.WidgetStore r6 = com.github.mytv.dv.widget.WidgetStore.INSTANCE
            com.github.mytv.dv.widget.SearchSnapshot r8 = new com.github.mytv.dv.widget.SearchSnapshot
            com.github.mytv.dv.widget.WidgetLoadState r0 = com.github.mytv.dv.widget.WidgetLoadState.READY
            r8.<init>(r7, r0, r4)
            r6.saveSearch(r5, r8)
            wd5 r4 = defpackage.wd5.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.widget.WidgetRefresher.refreshSearch(android.content.Context, kq5, java.lang.String, fj0):java.lang.Object");
    }

    private final void saveError(Context context, WidgetKind widgetKind, String str) {
        int i = WhenMappings.$EnumSwitchMapping$0[widgetKind.ordinal()];
        if (i == 1) {
            WidgetStore.INSTANCE.saveHistory(context, new VideoListSnapshot(str, WidgetLoadState.ERROR, (List) null, 4, (er0) null));
            return;
        }
        if (i == 2) {
            WidgetStore.INSTANCE.saveLater(context, new VideoListSnapshot(str, WidgetLoadState.ERROR, (List) null, 4, (er0) null));
            return;
        }
        if (i == 3) {
            WidgetStore.INSTANCE.saveMix(context, new MixSnapshot(str, WidgetLoadState.ERROR, (List) null, 4, (er0) null));
        } else if (i == 4) {
            WidgetStore.INSTANCE.saveLive(context, new LiveSnapshot(str, WidgetLoadState.ERROR, (List) null, 0L, 12, (er0) null));
        } else if (i != 5) {
            s83.v();
        } else {
            WidgetStore.INSTANCE.saveSearch(context, new SearchSnapshot(str, WidgetLoadState.ERROR, (List) null, 4, (er0) null));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|8|9))|94|6|7|8|9) */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01cf, code lost:
    
        if (r11 == r10) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0202, code lost:
    
        if (r11 == r10) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x029e, code lost:
    
        if (r11.updateKind(r2, r13, r6) == r10) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0091, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0092, code lost:
    
        r11 = r0;
        r13 = r3;
        r12 = r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x022f A[Catch: all -> 0x0091, TryCatch #1 {all -> 0x0091, blocks: (B:22:0x008b, B:31:0x022b, B:33:0x022f, B:35:0x0239, B:39:0x026b), top: B:8:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x026b A[Catch: all -> 0x0091, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0091, blocks: (B:22:0x008b, B:31:0x022b, B:33:0x022f, B:35:0x0239, B:39:0x026b), top: B:8:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0130  */
    /* JADX WARN: Type inference failed for: r11v22, types: [com.github.mytv.dv.widget.WidgetRefresher] */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r12v1, types: [s] */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.github.mytv.dv.widget.WidgetUpdater] */
    /* JADX WARN: Type inference failed for: r12v70 */
    /* JADX WARN: Type inference failed for: r12v71 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refresh(android.content.Context r12, com.github.mytv.dv.widget.WidgetKind r13, defpackage.fj0 r14) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.widget.WidgetRefresher.refresh(android.content.Context, com.github.mytv.dv.widget.WidgetKind, fj0):java.lang.Object");
    }
}

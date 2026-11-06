package com.github.mytv.dv.widget;

import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.model.DataModelKt;
import defpackage.jx4;
import defpackage.o70;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class WidgetDataKt {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r0 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.github.mytv.dv.widget.WidgetLiveItem toWidgetLiveItem(com.github.mytv.dv.model.LiveRoom r6) {
        /*
            r6.getClass()
            java.lang.String r1 = r6.getResolvedRoomId()
            java.lang.String r0 = r6.getTitle()
            boolean r2 = defpackage.jx4.L(r0)
            if (r2 == 0) goto L13
            java.lang.String r0 = "正在直播"
        L13:
            r2 = r0
            com.github.mytv.dv.model.Author r0 = r6.getOwner()
            java.lang.String r0 = r0.getNickname()
            boolean r3 = defpackage.jx4.L(r0)
            if (r3 == 0) goto L24
            java.lang.String r0 = "主播"
        L24:
            r3 = r0
            com.github.mytv.dv.model.Author r0 = r6.getOwner()
            com.github.mytv.dv.model.Avatar r0 = r0.getAvatarThumb()
            java.util.List r0 = r0.getUrlList()
            java.lang.Object r0 = defpackage.o70.U0(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L4f
            com.github.mytv.dv.model.Author r0 = r6.getOwner()
            com.github.mytv.dv.model.Avatar r0 = r0.getAvatarMedium()
            java.util.List r0 = r0.getUrlList()
            java.lang.Object r0 = defpackage.o70.U0(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L4f
            java.lang.String r0 = ""
        L4f:
            r4 = r0
            com.github.mytv.dv.model.RoomViewStats r0 = r6.getRoomViewStats()
            if (r0 == 0) goto L69
            java.lang.String r0 = r0.getDisplayShort()
            if (r0 == 0) goto L69
            boolean r5 = defpackage.jx4.L(r0)
            if (r5 != 0) goto L63
            goto L64
        L63:
            r0 = 0
        L64:
            if (r0 != 0) goto L67
            goto L69
        L67:
            r5 = r0
            goto L77
        L69:
            java.lang.String r6 = r6.getUserCount()
            boolean r0 = defpackage.jx4.L(r6)
            if (r0 == 0) goto L75
            java.lang.String r6 = "0"
        L75:
            r0 = r6
            goto L67
        L77:
            com.github.mytv.dv.widget.WidgetLiveItem r0 = new com.github.mytv.dv.widget.WidgetLiveItem
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.widget.WidgetDataKt.toWidgetLiveItem(com.github.mytv.dv.model.LiveRoom):com.github.mytv.dv.widget.WidgetLiveItem");
    }

    public static final WidgetVideo toWidgetVideo(Aweme aweme) {
        aweme.getClass();
        long duration = aweme.getVideo().getDuration() / 1000;
        String awemeId = aweme.getAwemeId();
        String desc = aweme.getDesc();
        if (jx4.L(desc)) {
            desc = "无标题视频";
        }
        String str = desc;
        String nickname = aweme.getAuthor().getNickname();
        String str2 = (String) o70.U0(aweme.getAuthor().getAvatarThumb().getUrlList());
        if (str2 == null && (str2 = (String) o70.U0(aweme.getAuthor().getAvatarMedium().getUrlList())) == null) {
            str2 = "";
        }
        String str3 = (String) o70.U0(aweme.getVideo().getOriginCover().getUrlList());
        if (str3 == null && (str3 = (String) o70.U0(aweme.getVideo().getCover().getUrlList())) == null) {
            str3 = "";
        }
        return new WidgetVideo(awemeId, str, nickname, str2, str3, duration > 0 ? String.format("%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(duration / 60), Long.valueOf(duration % 60)}, 2)) : "", DataModelKt.formatCount(aweme.getStatistics().getDiggCount()));
    }
}

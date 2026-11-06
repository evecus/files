package com.github.mytv.dv.widget;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.github.mytv.dv.MainActivity;
import defpackage.hf1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class WidgetRoutes {
    public static final int $stable = 0;
    public static final String EXTRA_ROUTE = "com.github.mytv.dv.widget.ROUTE";
    public static final WidgetRoutes INSTANCE = new WidgetRoutes();

    private WidgetRoutes() {
    }

    public final String history() {
        return "profile/history";
    }

    public final String home() {
        return "home";
    }

    public final Intent intent(Context context, String str) {
        context.getClass();
        str.getClass();
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.addFlags(872415232);
        intent.putExtra(EXTRA_ROUTE, str);
        return intent;
    }

    public final String later() {
        return "profile/later";
    }

    public final String live() {
        return "live";
    }

    public final String liveRoom(String str) {
        str.getClass();
        return hf1.w("live/room?id=", Uri.encode(str));
    }

    public final String login() {
        return "login";
    }

    public final String mixDetail(String str) {
        str.getClass();
        return hf1.w("mix/detail?id=", Uri.encode(str));
    }

    public final String playHistory(String str) {
        str.getClass();
        return hf1.w("play/history?id=", Uri.encode(str));
    }

    public final String playLater(String str) {
        str.getClass();
        return hf1.w("play/later?id=", Uri.encode(str));
    }

    public final String playMix(String str, String str2) {
        str.getClass();
        str2.getClass();
        return "mix/play?id=" + Uri.encode(str) + "&aweme=" + Uri.encode(str2);
    }

    public final String search() {
        return "search";
    }

    public final String searchResult(String str) {
        str.getClass();
        return hf1.w("search/results?query=", Uri.encode(str));
    }
}

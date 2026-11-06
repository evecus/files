package defpackage;

import android.icu.text.Transliterator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import coil3.network.internal.UtilsKt;
import com.github.mytv.dv.model.Cover;
import com.github.mytv.dv.model.EpisodeExtra;
import com.github.mytv.dv.model.LiveRoom;
import com.github.mytv.dv.model.RoomViewStats;
import com.github.mytv.dv.model.SearchLiveLives;
import com.github.mytv.dv.model.StreamUrl;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class n11 {
    public static final zy0 Companion = new zy0();
    public static final Map n = sv2.K(new uj3("accept", "application/json, text/plain, */*"), new uj3("accept-language", "zh-CN,zh;q=0.9,en;q=0.8"), new uj3("cache-control", "no-cache"), new uj3("pragma", "no-cache"), new uj3("priority", "u=1, i"), new uj3("sec-ch-ua", "\"Not/A)Brand\";v=\"8\", \"Chromium\";v=\"147\", \"Google Chrome\";v=\"147\""), new uj3("sec-ch-ua-mobile", "?0"), new uj3("sec-ch-ua-platform", "\"Windows\""), new uj3("sec-fetch-dest", "empty"), new uj3("sec-fetch-mode", "cors"), new uj3("sec-fetch-site", "same-origin"), new uj3("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36"));
    public static final Map o = sv2.K(new uj3("/aweme/v1/web/tab/feed/", "https://www.douyin.com/?recommend=1"), new uj3("/aweme/v2/web/module/feed/", "https://www.douyin.com/channel/300203"), new uj3("/aweme/v1/web/general/search/single/", "https://www.douyin.com/search/"), new uj3("/aweme/v1/web/search/item/", "https://www.douyin.com/search/"), new uj3("/aweme/v1/web/api/suggest_words/", "https://www.douyin.com/search/"), new uj3("/aweme/v1/web/search/sug/", "https://www.douyin.com/search/"), new uj3("/aweme/v1/web/hot/search/list/", "https://www.douyin.com/search/"), new uj3("/aweme/v1/web/home/channel/setting/", "https://www.douyin.com/?recommend=1"), new uj3("/aweme/v1/web/aweme/detail/", "https://www.douyin.com/"), new uj3("/aweme/v1/web/aweme/related/", "https://www.douyin.com/video/"), new uj3("/aweme/v1/web/comment/list/", "https://www.douyin.com/video/"), new uj3("/aweme/v1/web/comment/list/reply/", "https://www.douyin.com/video/"), new uj3("/aweme/v1/web/user/profile/self/", "https://www.douyin.com/user/self"), new uj3("/aweme/v1/web/user/profile/other/", "https://www.douyin.com/user/"), new uj3("/aweme/v1/web/aweme/post/", "https://www.douyin.com/user/"), new uj3("/aweme/v1/web/aweme/favorite/", "https://www.douyin.com/user/"), new uj3("/aweme/v1/web/aweme/listcollection/", "https://www.douyin.com/user/self?showTab=favorite_collection"), new uj3("/aweme/v1/web/history/read/", "https://www.douyin.com/user/self?showTab=history"), new uj3("/aweme/v1/web/follow/feed/", "https://www.douyin.com/follow"), new uj3("/webcast/web/feed/follow/", "https://live.douyin.com/follow"), new uj3("/webcast/room/info_by_scene/", "https://live.douyin.com/"), new uj3("/webcast/room/web/enter/", "https://live.douyin.com/"), new uj3("/webcast/web/partition/detail/room/v2/", "https://live.douyin.com/"), new uj3("/webcast/feed/", "https://live.douyin.com/"), new uj3("/aweme/v1/web/seo/inner/link/", "https://www.douyin.com/search/"), new uj3("/aweme/v1/web/watchlater/list/", "https://www.douyin.com/user/self?showTab=watchlater"), new uj3("/aweme/v1/web/user/following/list/", "https://www.douyin.com/user/self?showTab=following"), new uj3("/aweme/v1/web/user/follower/list/", "https://www.douyin.com/user/self?showTab=follower"), new uj3("/aweme/v1/web/mix/detail/", "https://www.douyin.com/collection/"), new uj3("/aweme/v1/web/mix/aweme/", "https://www.douyin.com/collection/"), new uj3("/aweme/v1/web/series/detail/", "https://www.douyin.com/collection/"), new uj3("/aweme/v1/web/series/aweme/", "https://www.douyin.com/collection/"), new uj3("/aweme/v1/web/series/list/", "https://www.douyin.com/user/"), new uj3("/aweme/v1/web/mix/listcollection/", "https://www.douyin.com/user/self?showTab=favorite_collection"), new uj3("/aweme/v1/web/danmaku/get_v2/", "https://www.douyin.com/video/"), new uj3("/aweme/v1/web/history/write/", "https://www.douyin.com/"), new uj3("/aweme/v2/web/aweme/stats/", "https://www.douyin.com/"), new uj3("/aweme/v1/web/commit/dislike/item/", "https://www.douyin.com/?recommend=1"), new uj3("/aweme/v1/web/commit/item/digg/", "https://www.douyin.com/"), new uj3("/aweme/v1/web/aweme/collect/", "https://www.douyin.com/"));
    public final fl4 a;
    public final s b;
    public final z62 c = sp0.d(new o90((byte) 29));
    public final OkHttpClient d;
    public final OkHttpClient e;
    public boolean f;
    public long g;
    public String h;
    public long i;
    public volatile String j;
    public volatile String k;
    public final u05 l;
    public final u05 m;

    public n11(fl4 fl4Var, s sVar) {
        this.a = fl4Var;
        this.b = sVar;
        ne5 ne5Var = oe5.a;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        oe5.a(builder);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.d = builder.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).followRedirects(true).followSslRedirects(true).build();
        OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
        oe5.a(builder2);
        this.e = builder2.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).followRedirects(false).followSslRedirects(false).build();
        this.h = "";
        this.l = new u05(new eq(this, (byte) 6));
        this.m = new u05(new df0((byte) 12));
    }

    public static String B0(Map map) {
        Set entrySet = map.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entrySet) {
            Map.Entry entry = (Map.Entry) obj;
            if (!jx4.L((CharSequence) entry.getKey()) && !jx4.L((CharSequence) entry.getValue())) {
                arrayList.add(obj);
            }
        }
        return o70.Z0(arrayList, "; ", null, null, 0, new m90((byte) 16), 30);
    }

    public static Object C(n11 n11Var, String str, Map map, String str2, String str3, gj0 gj0Var, int i) {
        String str4 = (i & 16) != 0 ? "" : str2;
        String str5 = (i & 32) != 0 ? null : str3;
        n11Var.getClass();
        return n11Var.B(str, o70.Z0(map.entrySet(), "&", null, null, 0, new yy0((byte) 5), 30), str4, str5, gj0Var);
    }

    public static String D(n11 n11Var) {
        u22 u22Var = new u22(1, WebSocketProtocol.PAYLOAD_SHORT, 1);
        ArrayList arrayList = new ArrayList(p70.J(u22Var, 10));
        Iterator it = u22Var.iterator();
        while (((t22) it).K) {
            ((l22) it).nextInt();
            b4 b4Var = f04.I;
            arrayList.add(Character.valueOf(jx4.Q("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789")));
        }
        return o70.Z0(arrayList, "", null, null, 0, null, 62).concat("==");
    }

    public static final String F(int i) {
        u22 u22Var = new u22(1, i, 1);
        ArrayList arrayList = new ArrayList(p70.J(u22Var, 10));
        Iterator it = u22Var.iterator();
        while (((t22) it).K) {
            ((l22) it).nextInt();
            b4 b4Var = f04.I;
            arrayList.add(Character.valueOf(jx4.Q("0123456789abcdef")));
        }
        return o70.Z0(arrayList, "", null, null, 0, null, 62);
    }

    public static void F0(Request.Builder builder, String str, String str2) {
        for (Map.Entry entry : n.entrySet()) {
            builder.header((String) entry.getKey(), (String) entry.getValue());
        }
        builder.header("referer", str);
        builder.header("Cookie", str2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4.equals("/aweme/v1/web/mix/detail/") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0090, code lost:
    
        r4 = (java.lang.String) r5.get("series_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0098, code lost:
    
        if (r4 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009a, code lost:
    
        r4 = (java.lang.String) r5.get("mix_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a2, code lost:
    
        if (r4 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00aa, code lost:
    
        return r0.concat(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a5, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        if (r4.equals("/aweme/v1/web/series/list/") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        r4 = (java.lang.String) r5.get("sec_user_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        if (r4 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        r4 = "?";
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
    
        if (r4.equals("/aweme/v1/web/user/profile/other/") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        if (r4.equals("/aweme/v1/web/comment/list/") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ca, code lost:
    
        r4 = (java.lang.String) r5.get("aweme_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d2, code lost:
    
        if (r4 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d5, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00da, code lost:
    
        return r0.concat(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0060, code lost:
    
        if (r4.equals("/aweme/v1/web/series/aweme/") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006a, code lost:
    
        if (r4.equals("/aweme/v1/web/mix/aweme/") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0073, code lost:
    
        if (r4.equals("/aweme/v1/web/aweme/post/") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        if (r4.equals("/aweme/v1/web/series/detail/") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c7, code lost:
    
        if (r4.equals("/aweme/v1/web/aweme/related/") == false) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String X(java.lang.String r4, java.util.Map r5) {
        /*
            java.util.Map r0 = defpackage.n11.o
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Ldb
            int r1 = r4.hashCode()
            java.lang.String r2 = "sec_user_id"
            java.lang.String r3 = ""
            switch(r1) {
                case -2087632636: goto Lc1;
                case -2069559693: goto Lab;
                case -1563470402: goto L87;
                case -899069969: goto L6d;
                case -567007565: goto L64;
                case -535776120: goto L5a;
                case 305903945: goto L50;
                case 480749745: goto L46;
                case 1239398161: goto L3c;
                case 1763322099: goto L32;
                case 2025859342: goto L17;
                default: goto L15;
            }
        L15:
            goto Lc9
        L17:
            java.lang.String r1 = "/aweme/v1/web/comment/list/reply/"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L21
            goto Lc9
        L21:
            java.lang.String r4 = "item_id"
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L2c
            goto L2d
        L2c:
            r3 = r4
        L2d:
            java.lang.String r4 = r0.concat(r3)
            return r4
        L32:
            java.lang.String r1 = "/aweme/v1/web/mix/detail/"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L90
            goto Lc9
        L3c:
            java.lang.String r1 = "/aweme/v1/web/series/list/"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L76
            goto Lc9
        L46:
            java.lang.String r1 = "/aweme/v1/web/user/profile/other/"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L76
            goto Lc9
        L50:
            java.lang.String r1 = "/aweme/v1/web/comment/list/"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto Lca
            goto Lc9
        L5a:
            java.lang.String r1 = "/aweme/v1/web/series/aweme/"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L90
            goto Lc9
        L64:
            java.lang.String r1 = "/aweme/v1/web/mix/aweme/"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L90
            goto Lc9
        L6d:
            java.lang.String r1 = "/aweme/v1/web/aweme/post/"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L76
            goto Lc9
        L76:
            java.lang.Object r4 = r5.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L7f
            goto L80
        L7f:
            r3 = r4
        L80:
            java.lang.String r4 = "?"
        L82:
            java.lang.String r4 = defpackage.r7.C(r0, r3, r4)
            return r4
        L87:
            java.lang.String r1 = "/aweme/v1/web/series/detail/"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L90
            goto Lc9
        L90:
            java.lang.String r4 = "series_id"
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto La5
            java.lang.String r4 = "mix_id"
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto La5
            goto La6
        La5:
            r3 = r4
        La6:
            java.lang.String r4 = r0.concat(r3)
            return r4
        Lab:
            java.lang.String r1 = "/aweme/v1/web/aweme/favorite/"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto Lb4
            goto Lc9
        Lb4:
            java.lang.Object r4 = r5.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto Lbd
            goto Lbe
        Lbd:
            r3 = r4
        Lbe:
            java.lang.String r4 = "?showTab=like"
            goto L82
        Lc1:
            java.lang.String r1 = "/aweme/v1/web/aweme/related/"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto Lca
        Lc9:
            return r0
        Lca:
            java.lang.String r4 = "aweme_id"
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto Ld5
            goto Ld6
        Ld5:
            r3 = r4
        Ld6:
            java.lang.String r4 = r0.concat(r3)
            return r4
        Ldb:
            java.lang.String r4 = "https://www.douyin.com/?recommend=1"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.X(java.lang.String, java.util.Map):java.lang.String");
    }

    public static LinkedHashMap b(n11 n11Var) {
        n11Var.getClass();
        Companion.getClass();
        LinkedHashMap a = zy0.a();
        a.put("device_platform", "web");
        a.put("app_name", "douyin_web");
        a.put("live_id", "1");
        a.put("enter_from", "web_live");
        a.put("language", "zh-CN");
        a.put("tz_name", "Asia/Shanghai");
        return a;
    }

    public static Object c0(n11 n11Var, int i, int i2, int i3, int i4, List list, gj0 gj0Var, int i5) {
        int i6;
        int i7;
        if ((i5 & 4) != 0) {
            i6 = i2 == 1 ? 0 : 2;
        } else {
            i6 = i3;
        }
        if ((i5 & 16) != 0) {
            int i8 = (i2 - 1) * i;
            if (i8 < 0) {
                i8 = 0;
            }
            i7 = i8;
        } else {
            i7 = i4;
        }
        return n11Var.b0(i, i2, i6, "", i7, list, gj0Var);
    }

    public static String d(String str, String str2) {
        if (jx4.L(str)) {
            return "https://www.douyin.com/search/";
        }
        return "https://www.douyin.com/search/" + URLEncoder.encode(str, "UTF-8") + "?aid=" + UUID.randomUUID() + "&type=" + str2;
    }

    public static String e(Map map, String str, String str2) {
        return str + str2 + "?" + o70.Z0(map.entrySet(), "&", null, null, 0, new yy0((byte) 0), 30);
    }

    public static LinkedHashMap g(n11 n11Var, String str, int i, int i2, String str2, String str3, String str4, String str5) {
        n11Var.getClass();
        Companion.getClass();
        LinkedHashMap a = zy0.a();
        a.put("search_channel", "aweme_video_web");
        a.put("enable_history", "1");
        a.put("sort_type", str2);
        a.put("publish_time", str3);
        a.put("filter_duration", str4);
        jx4.L("0");
        a.put("search_range", "0");
        a.put("keyword", str);
        a.put("search_source", "normal_search");
        a.put("query_correct_type", "1");
        a.put("is_filter_search", "1");
        a.put("from_group_id", "");
        a.put("offset", String.valueOf(i));
        a.put("count", String.valueOf(i2));
        a.put("need_filter_settings", i != 0 ? "0" : "1");
        if (!jx4.L(str5)) {
            a.put("search_id", str5);
        }
        a.put("list_type", "single");
        n11Var.D0(a);
        return a;
    }

    public static String i(Map map, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put("uifid", str);
        linkedHashMap.put("timestamp", str2);
        String str3 = str + "_" + str2 + "_A96D855A08C0A9707F8BEF0D9A527E4E_" + o70.Z0(linkedHashMap.entrySet(), "&", null, null, 0, new yy0((byte) 1), 30);
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = str3.getBytes(z50.a);
        bytes.getClass();
        byte[] digest = messageDigest.digest(bytes);
        digest.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b : digest) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) "");
            }
            sb.append((CharSequence) String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static void k(String str, Response response) {
        String header$default;
        if (!j42.c(response.request().url().host(), "www.douyin.com") || (header$default = Response.header$default(response, "bd-tt-error-code", null, 2, null)) == null || jx4.L(header$default) || header$default.equals("0")) {
            return;
        }
        throw new Exception("bd-tt-error-code=" + header$default + ": " + jx4.f0(200, str));
    }

    public static String p0() {
        String str = Build.VERSION.RELEASE;
        str.getClass();
        String obj = jx4.g0(str).toString();
        if (jx4.L(obj)) {
            obj = "16";
        }
        String str2 = Build.MODEL;
        str2.getClass();
        String obj2 = jx4.g0(str2).toString();
        String str3 = "Pixel 10 Pro";
        if (jx4.L(obj2)) {
            obj2 = "Pixel 10 Pro";
        }
        for (int i = 0; i < obj2.length(); i++) {
            char charAt = obj2.charAt(i);
            if (' ' > charAt || charAt >= 127) {
                if (Build.VERSION.SDK_INT >= 24) {
                    try {
                        String transliterate = Transliterator.getInstance("Any-Latin; Latin-ASCII").transliterate(obj2);
                        transliterate.getClass();
                        obj2 = jx4.g0(transliterate).toString();
                        if (obj2.length() > 0) {
                            for (int i2 = 0; i2 < obj2.length(); i2++) {
                                char charAt2 = obj2.charAt(i2);
                                if (' ' > charAt2 || charAt2 >= 127) {
                                    break;
                                }
                            }
                            str3 = obj2;
                        }
                    } catch (Exception unused) {
                    }
                }
                return hf1.x("com.ss.android.ugc.aweme/391000 (Linux; U; Android ", obj, "; zh_CN; ", str3, ")");
            }
        }
        str3 = obj2;
        return hf1.x("com.ss.android.ugc.aweme/391000 (Linux; U; Android ", obj, "; zh_CN; ", str3, ")");
    }

    public static /* synthetic */ Object r(n11 n11Var, String str, Map map, String str2, boolean z, gj0 gj0Var, int i) {
        String str3 = (i & 4) != 0 ? "https://www.douyin.com" : "https://live.douyin.com";
        if ((i & 8) != 0) {
            str2 = null;
        }
        return n11Var.q(str, map, str3, str2, (i & 32) != 0 ? true : z, true, (i & 128) == 0, gj0Var);
    }

    public static uj3 r0(String str) {
        String obj;
        int I;
        String str2 = (String) o70.U0(jx4.X(str, new String[]{";"}, 6));
        if (str2 == null || (obj = jx4.g0(str2).toString()) == null || (I = jx4.I(obj, '=', 0, 6)) <= 0) {
            return null;
        }
        return new uj3(jx4.g0(obj.substring(0, I)).toString(), jx4.g0(obj.substring(I + 1)).toString());
    }

    public static /* synthetic */ Object t(n11 n11Var, String str, Map map, Map map2, gj0 gj0Var, int i) {
        if ((i & 4) != 0) {
            map2 = p91.I;
        }
        return n11Var.s(str, map, map2, "https://www.douyin.com", (i & 32) == 0, gj0Var);
    }

    public static /* synthetic */ Object w(n11 n11Var, String str, LinkedHashMap linkedHashMap, Map map, gj0 gj0Var, int i) {
        return n11Var.v(str, linkedHashMap, map, "https://www.douyin.com", "https://www.douyin.com/?recommend=1", (i & 32) != 0, (i & 64) != 0, gj0Var);
    }

    public static String x(String str, List list) {
        String str2;
        Iterator it = list.iterator();
        do {
            str2 = "";
            if (!it.hasNext()) {
                break;
            }
            zv2 a = v24.a((v24) it.next(), str);
            String str3 = a != null ? (String) o70.V0(1, a.a()) : null;
            str2 = str3 != null ? str3 : "";
        } while (jx4.L(str2));
        return str2;
    }

    public final String A() {
        String str;
        String str2;
        try {
            Log.d("LiveWS", "[ttwid] fetchTtwid: requesting ttwid.bytedance.com ...");
            Response execute = this.d.newCall(new Request.Builder().url("https://ttwid.bytedance.com/ttwid/union/register/").header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36").header("Accept", "application/json, text/plain, */*").header(UtilsKt.CONTENT_TYPE, "application/json").header("Origin", "https://www.douyin.com").header("Referer", "https://www.douyin.com/").post(RequestBody.Companion.create("{\"region\":\"cn\",\"aid\":1768,\"needFid\":false,\"service\":\"www.ixigua.com\",\"migrate_info\":{\"ticket\":\"\",\"source\":\"node\"},\"cbUrlProtocol\":\"https\",\"union\":true}", MediaType.Companion.get("application/json; charset=utf-8"))).build()).execute();
            try {
                Log.d("LiveWS", "[ttwid] fetchTtwid response: http=" + execute.code() + ", Set-Cookie count=" + execute.headers("Set-Cookie").size());
                Iterator<T> it = execute.headers("Set-Cookie").iterator();
                while (it.hasNext()) {
                    uj3 r0 = r0((String) it.next());
                    if (r0 != null) {
                        String str3 = (String) r0.I;
                        String str4 = (String) r0.J;
                        if (j42.c(str3, "ttwid")) {
                            Log.d("LiveWS", "[ttwid] fetchTtwid OK (Set-Cookie): " + jx4.f0(30, str4) + "...");
                            execute.close();
                            return str4;
                        }
                    }
                }
                ResponseBody body = execute.body();
                if (body == null || (str = body.string()) == null) {
                    str = "";
                }
                Pattern compile = Pattern.compile("\"ttwid\"\\s*:\\s*\"([^\"]+)\"");
                compile.getClass();
                Matcher matcher = compile.matcher(str);
                matcher.getClass();
                zv2 r = rt0.r(matcher, 0, str);
                if (r == null || (str2 = (String) o70.V0(1, r.a())) == null) {
                    Log.w("LiveWS", "[ttwid] fetchTtwid: no ttwid found in response");
                    execute.close();
                    return null;
                }
                Log.d("LiveWS", "[ttwid] fetchTtwid OK (body): " + jx4.f0(30, str2) + "...");
                execute.close();
                return str2;
            } finally {
            }
        } catch (Exception e) {
            Log.w("LiveWS", "[ttwid] fetchTtwid FAILED: " + e.getClass().getSimpleName() + ": " + e.getMessage());
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0(java.lang.String r8, java.lang.String r9, defpackage.gj0 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.l11
            if (r0 == 0) goto L14
            r0 = r10
            l11 r0 = (defpackage.l11) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.K = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            l11 r0 = new l11
            r0.<init>(r7, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r5.I
            int r0 = r5.K
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L27
            defpackage.mu0.V(r10)     // Catch: java.lang.Throwable -> L6a
            goto L67
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r7)
            r7 = 0
            return r7
        L2e:
            defpackage.mu0.V(r10)
            zy0 r10 = defpackage.n11.Companion     // Catch: java.lang.Throwable -> L6a
            r10.getClass()     // Catch: java.lang.Throwable -> L6a
            java.util.LinkedHashMap r3 = defpackage.zy0.a()     // Catch: java.lang.Throwable -> L6a
            r7.D0(r3)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r10 = "author_id"
            uj3 r0 = new uj3     // Catch: java.lang.Throwable -> L6a
            r0.<init>(r10, r8)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r8 = "aweme_id"
            uj3 r10 = new uj3     // Catch: java.lang.Throwable -> L6a
            r10.<init>(r8, r9)     // Catch: java.lang.Throwable -> L6a
            r8 = 2
            uj3[] r8 = new defpackage.uj3[r8]     // Catch: java.lang.Throwable -> L6a
            r9 = 0
            r8[r9] = r0     // Catch: java.lang.Throwable -> L6a
            r8[r1] = r10     // Catch: java.lang.Throwable -> L6a
            java.util.Map r4 = defpackage.sv2.K(r8)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = "/aweme/v1/web/history/write/"
            r5.K = r1     // Catch: java.lang.Throwable -> L6a
            r6 = 56
            r1 = r7
            java.lang.Object r7 = t(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L6a
            el0 r8 = defpackage.el0.I
            if (r7 != r8) goto L67
            return r8
        L67:
            wd5 r7 = defpackage.wd5.a     // Catch: java.lang.Throwable -> L6a
            return r7
        L6a:
            r0 = move-exception
            r7 = r0
            g54 r8 = new g54
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.A0(java.lang.String, java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:13:0x004e, B:17:0x0057), top: B:11:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, defpackage.gj0 r11) {
        /*
            r6 = this;
            java.lang.String r0 = "generateABogusParam: a_bogus returned EMPTY for "
            boolean r1 = r11 instanceof defpackage.tz0
            if (r1 == 0) goto L16
            r1 = r11
            tz0 r1 = (defpackage.tz0) r1
            int r2 = r1.L
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.L = r2
        L14:
            r11 = r1
            goto L1c
        L16:
            tz0 r1 = new tz0
            r1.<init>(r6, r11)
            goto L14
        L1c:
            java.lang.Object r1 = r11.J
            int r2 = r11.L
            r3 = 1
            java.lang.String r4 = "DouyinDirectApi"
            if (r2 == 0) goto L37
            if (r2 != r3) goto L30
            java.lang.String r7 = r11.I
            defpackage.mu0.V(r1)     // Catch: java.lang.Exception -> L2d
            goto L4e
        L2d:
            r0 = move-exception
        L2e:
            r6 = r0
            goto L6e
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r6)
            r6 = 0
            return r6
        L37:
            defpackage.mu0.V(r1)
            s r6 = r6.b
            r11.I = r7     // Catch: java.lang.Exception -> L6b
            r11.L = r3     // Catch: java.lang.Exception -> L6b
            r5 = r9
            r9 = r7
            r7 = r8
            r8 = r5
            java.lang.Object r1 = r6.c(r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L67
            el0 r6 = defpackage.el0.I
            if (r1 != r6) goto L4d
            return r6
        L4d:
            r7 = r9
        L4e:
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L2d
            boolean r6 = defpackage.jx4.L(r1)     // Catch: java.lang.Exception -> L2d
            if (r6 != 0) goto L57
            return r1
        L57:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2d
            r6.<init>(r0)     // Catch: java.lang.Exception -> L2d
            r6.append(r7)     // Catch: java.lang.Exception -> L2d
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L2d
            android.util.Log.w(r4, r6)     // Catch: java.lang.Exception -> L2d
            goto L7f
        L67:
            r0 = move-exception
            r6 = r0
            r7 = r9
            goto L6e
        L6b:
            r0 = move-exception
            r9 = r7
            goto L2e
        L6e:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "generateABogusParam: exception for "
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            android.util.Log.e(r4, r7, r6)
        L7f:
            java.lang.String r6 = ""
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.B(java.lang.String, java.lang.String, java.lang.String, java.lang.String, gj0):java.lang.Object");
    }

    public final void C0(String str) {
        fl4 fl4Var = this.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(fl4Var.h());
        linkedHashMap.put("msToken", str);
        fl4Var.H(o70.Z0(linkedHashMap.entrySet(), "; ", null, null, 0, new yy0((byte) 3), 30));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r3 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D0(java.util.LinkedHashMap r7) {
        /*
            r6 = this;
            fl4 r0 = r6.a
            java.util.LinkedHashMap r1 = r0.h()
            java.lang.String r2 = "msToken"
            java.lang.Object r3 = r1.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
            if (r3 == 0) goto L1b
            boolean r5 = defpackage.jx4.L(r3)
            if (r5 != 0) goto L18
            goto L19
        L18:
            r3 = r4
        L19:
            if (r3 != 0) goto L1f
        L1b:
            java.lang.String r3 = r6.E()
        L1f:
            r7.put(r2, r3)
            java.lang.String r6 = "dy_swidth"
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L2e
            java.lang.String r6 = "2560"
        L2e:
            java.lang.String r2 = "screen_width"
            r7.put(r2, r6)
            java.lang.String r6 = "dy_sheight"
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L3f
            java.lang.String r6 = "1440"
        L3f:
            java.lang.String r2 = "screen_height"
            r7.put(r2, r6)
            java.lang.String r6 = "device_web_cpu_core"
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L50
            java.lang.String r6 = "24"
        L50:
            java.lang.String r2 = "cpu_core_num"
            r7.put(r2, r6)
            java.lang.String r6 = "device_web_memory_size"
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L61
            java.lang.String r6 = "8"
        L61:
            java.lang.String r2 = "device_memory"
            r7.put(r2, r6)
            java.lang.String r6 = "s_v_web_id"
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L7a
            java.lang.String r2 = "verifyFp"
            r7.put(r2, r6)
            java.lang.String r2 = "fp"
            r7.put(r2, r6)
        L7a:
            java.lang.String r6 = "UIFID"
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L89
            java.lang.String r1 = "uifid"
            r7.put(r1, r6)
        L89:
            java.lang.String r6 = r0.r()
            boolean r0 = defpackage.jx4.L(r6)
            if (r0 != 0) goto La9
            r0 = 0
        L94:
            int r1 = r6.length()
            if (r0 >= r1) goto La8
            char r1 = r6.charAt(r0)
            boolean r1 = java.lang.Character.isDigit(r1)
            if (r1 != 0) goto La5
            goto La9
        La5:
            int r0 = r0 + 1
            goto L94
        La8:
            r4 = r6
        La9:
            if (r4 == 0) goto Lb0
            java.lang.String r6 = "webid"
            r7.put(r6, r4)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.D0(java.util.LinkedHashMap):void");
    }

    public final String E() {
        if (j42.c(Looper.myLooper(), Looper.getMainLooper())) {
            return D(this);
        }
        try {
            Response execute = this.d.newCall(new Request.Builder().url("https://mssdk.bytedance.com/web/r/token?ms_appid=6383&msToken=1YFEsL4NQgAICNSpgOo3_Yv-ue-AhfJaweBQP0xAJRNQfOqWBTklpusHaMMr80OxFFahFPSxag23YunZwRWW9PXPneC35kCHv00w-2_iQH8PynyH34b8TXekDayIhN2BQAklnxxsbompAg_WQcoErnxP8gBiWXsSkIRlw32-eUYRQu1cDIAd5Q%3D%3D").post(RequestBody.Companion.create("{\"dataType\":8,\"magic\":538969122,\"strData\":\"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\",\"tspFromClient\":" + (System.currentTimeMillis() / 1000) + ",\"ulr\":0,\"version\":1}", MediaType.Companion.get("application/json; charset=utf-8"))).header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/146.0.0.0 Safari/537.36").header(UtilsKt.CONTENT_TYPE, "text/plain;charset=UTF-8").build()).execute();
            try {
                Iterator<String> it = execute.headers("Set-Cookie").iterator();
                while (it.hasNext()) {
                    uj3 r0 = r0(it.next());
                    if (r0 != null && j42.c(r0.I, "msToken")) {
                        String str = (String) r0.J;
                        if (str.length() == 120 || str.length() == 128) {
                            execute.close();
                            return str;
                        }
                    }
                }
                execute.close();
            } finally {
            }
        } catch (Exception unused) {
        }
        return D(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E0(java.util.LinkedHashMap r4) {
        /*
            r3 = this;
            fl4 r0 = r3.a
            java.util.LinkedHashMap r0 = r0.h()
            java.lang.String r1 = "msToken"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L1a
            boolean r2 = defpackage.jx4.L(r0)
            if (r2 != 0) goto L17
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 != 0) goto L1e
        L1a:
            java.lang.String r0 = r3.E()
        L1e:
            r4.put(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.E0(java.util.LinkedHashMap):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (r12 != r10) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(defpackage.gj0 r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.uz0
            if (r0 == 0) goto L14
            r0 = r12
            uz0 r0 = (defpackage.uz0) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.L = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            uz0 r0 = new uz0
            r0.<init>(r11, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.J
            int r0 = r6.L
            r8 = 2
            r1 = 1
            r9 = 0
            el0 r10 = defpackage.el0.I
            if (r0 == 0) goto L39
            if (r0 == r1) goto L33
            if (r0 != r8) goto L2d
            defpackage.mu0.V(r12)     // Catch: java.lang.Throwable -> L79
            goto L76
        L2d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r11)
            return r9
        L33:
            n11 r11 = r6.I
            defpackage.mu0.V(r12)     // Catch: java.lang.Throwable -> L79
            goto L62
        L39:
            defpackage.mu0.V(r12)
            zy0 r12 = defpackage.n11.Companion     // Catch: java.lang.Throwable -> L79
            r12.getClass()     // Catch: java.lang.Throwable -> L79
            java.util.LinkedHashMap r3 = defpackage.zy0.a()     // Catch: java.lang.Throwable -> L79
            java.lang.String r12 = "channel"
            java.lang.String r0 = "channel_pc_web"
            r3.put(r12, r0)     // Catch: java.lang.Throwable -> L79
            r11.D0(r3)     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = "/aweme/v1/web/home/channel/setting/"
            r6.I = r11     // Catch: java.lang.Throwable -> L79
            r6.L = r1     // Catch: java.lang.Throwable -> L79
            r4 = 0
            r5 = 0
            r7 = 252(0xfc, float:3.53E-43)
            r1 = r11
            java.lang.Object r12 = r(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L79
            if (r12 != r10) goto L61
            goto L75
        L61:
            r11 = r1
        L62:
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> L79
            os0 r0 = defpackage.sx0.a     // Catch: java.lang.Throwable -> L79
            ez0 r1 = new ez0     // Catch: java.lang.Throwable -> L79
            r1.<init>(r11, r12, r9, r8)     // Catch: java.lang.Throwable -> L79
            r6.I = r9     // Catch: java.lang.Throwable -> L79
            r6.L = r8     // Catch: java.lang.Throwable -> L79
            java.lang.Object r12 = defpackage.p70.D0(r0, r1, r6)     // Catch: java.lang.Throwable -> L79
            if (r12 != r10) goto L76
        L75:
            return r10
        L76:
            com.github.mytv.dv.model.ChannelSettingResponse r12 = (com.github.mytv.dv.model.ChannelSettingResponse) r12     // Catch: java.lang.Throwable -> L79
            return r12
        L79:
            r0 = move-exception
            r11 = r0
            g54 r12 = new g54
            r12.<init>(r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.G(gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        if (r10 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0057, code lost:
    
        if (o(r5) == r8) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v0, types: [n11] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G0(defpackage.gj0 r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.util.LinkedHashMap r14) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.G0(gj0, java.lang.String, java.lang.String, java.lang.String, java.util.LinkedHashMap):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c1, code lost:
    
        if (r15 != r10) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(long r12, int r14, defpackage.gj0 r15) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.H(long, int, gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        if (r15 != r10) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(java.lang.String r12, int r13, int r14, defpackage.gj0 r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof defpackage.wz0
            if (r0 == 0) goto L14
            r0 = r15
            wz0 r0 = (defpackage.wz0) r0
            int r1 = r0.N
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.N = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            wz0 r0 = new wz0
            r0.<init>(r11, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.L
            int r0 = r6.N
            r8 = 2
            r1 = 1
            r9 = 0
            el0 r10 = defpackage.el0.I
            if (r0 == 0) goto L3d
            if (r0 == r1) goto L33
            if (r0 != r8) goto L2d
            defpackage.mu0.V(r15)     // Catch: java.lang.Throwable -> L96
            goto L93
        L2d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r11)
            return r9
        L33:
            byte r14 = r6.K
            int r13 = r6.J
            n11 r11 = r6.I
            defpackage.mu0.V(r15)     // Catch: java.lang.Throwable -> L96
            goto L7a
        L3d:
            defpackage.mu0.V(r15)
            zy0 r15 = defpackage.n11.Companion     // Catch: java.lang.Throwable -> L96
            r15.getClass()     // Catch: java.lang.Throwable -> L96
            java.util.LinkedHashMap r3 = defpackage.zy0.a()     // Catch: java.lang.Throwable -> L96
            java.lang.String r15 = "aweme_id"
            r3.put(r15, r12)     // Catch: java.lang.Throwable -> L96
            java.lang.String r12 = "cursor"
            java.lang.String r15 = java.lang.String.valueOf(r13)     // Catch: java.lang.Throwable -> L96
            r3.put(r12, r15)     // Catch: java.lang.Throwable -> L96
            java.lang.String r12 = "count"
            java.lang.String r15 = java.lang.String.valueOf(r14)     // Catch: java.lang.Throwable -> L96
            r3.put(r12, r15)     // Catch: java.lang.Throwable -> L96
            r11.D0(r3)     // Catch: java.lang.Throwable -> L96
            java.lang.String r2 = "/aweme/v1/web/comment/list/"
            r6.I = r11     // Catch: java.lang.Throwable -> L96
            r6.J = r13     // Catch: java.lang.Throwable -> L96
            r6.K = r14     // Catch: java.lang.Throwable -> L96
            r6.N = r1     // Catch: java.lang.Throwable -> L96
            r4 = 0
            r5 = 0
            r7 = 252(0xfc, float:3.53E-43)
            r1 = r11
            java.lang.Object r15 = r(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L96
            if (r15 != r10) goto L79
            goto L92
        L79:
            r11 = r1
        L7a:
            java.lang.String r15 = (java.lang.String) r15     // Catch: java.lang.Throwable -> L96
            os0 r12 = defpackage.sx0.a     // Catch: java.lang.Throwable -> L96
            ez0 r0 = new ez0     // Catch: java.lang.Throwable -> L96
            r1 = 4
            r0.<init>(r11, r15, r9, r1)     // Catch: java.lang.Throwable -> L96
            r6.I = r9     // Catch: java.lang.Throwable -> L96
            r6.J = r13     // Catch: java.lang.Throwable -> L96
            r6.K = r14     // Catch: java.lang.Throwable -> L96
            r6.N = r8     // Catch: java.lang.Throwable -> L96
            java.lang.Object r15 = defpackage.p70.D0(r12, r0, r6)     // Catch: java.lang.Throwable -> L96
            if (r15 != r10) goto L93
        L92:
            return r10
        L93:
            com.github.mytv.dv.model.CommentListResponse r15 = (com.github.mytv.dv.model.CommentListResponse) r15     // Catch: java.lang.Throwable -> L96
            return r15
        L96:
            r0 = move-exception
            r11 = r0
            g54 r12 = new g54
            r12.<init>(r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.I(java.lang.String, int, int, gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        if (r13 != r10) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(int r12, defpackage.gj0 r13, java.lang.String r14, java.lang.String r15) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.xz0
            if (r0 == 0) goto L14
            r0 = r13
            xz0 r0 = (defpackage.xz0) r0
            int r1 = r0.M
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.M = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            xz0 r0 = new xz0
            r0.<init>(r11, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.K
            int r0 = r6.M
            r8 = 2
            r1 = 1
            r9 = 0
            el0 r10 = defpackage.el0.I
            if (r0 == 0) goto L3b
            if (r0 == r1) goto L33
            if (r0 != r8) goto L2d
            defpackage.mu0.V(r13)     // Catch: java.lang.Throwable -> L96
            goto L93
        L2d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r11)
            return r9
        L33:
            byte r12 = r6.J
            n11 r11 = r6.I
            defpackage.mu0.V(r13)     // Catch: java.lang.Throwable -> L96
            goto L7c
        L3b:
            defpackage.mu0.V(r13)
            zy0 r13 = defpackage.n11.Companion     // Catch: java.lang.Throwable -> L96
            r13.getClass()     // Catch: java.lang.Throwable -> L96
            java.util.LinkedHashMap r3 = defpackage.zy0.a()     // Catch: java.lang.Throwable -> L96
            java.lang.String r13 = "item_id"
            r3.put(r13, r14)     // Catch: java.lang.Throwable -> L96
            java.lang.String r13 = "comment_id"
            r3.put(r13, r15)     // Catch: java.lang.Throwable -> L96
            java.lang.String r13 = "cursor"
            r14 = 0
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch: java.lang.Throwable -> L96
            r3.put(r13, r14)     // Catch: java.lang.Throwable -> L96
            java.lang.String r13 = "count"
            java.lang.String r14 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L96
            r3.put(r13, r14)     // Catch: java.lang.Throwable -> L96
            r11.D0(r3)     // Catch: java.lang.Throwable -> L96
            java.lang.String r2 = "/aweme/v1/web/comment/list/reply/"
            r6.I = r11     // Catch: java.lang.Throwable -> L96
            r6.J = r12     // Catch: java.lang.Throwable -> L96
            r6.M = r1     // Catch: java.lang.Throwable -> L96
            r4 = 0
            r5 = 0
            r7 = 252(0xfc, float:3.53E-43)
            r1 = r11
            java.lang.Object r13 = r(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L96
            if (r13 != r10) goto L7b
            goto L92
        L7b:
            r11 = r1
        L7c:
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L96
            os0 r14 = defpackage.sx0.a     // Catch: java.lang.Throwable -> L96
            ez0 r15 = new ez0     // Catch: java.lang.Throwable -> L96
            r0 = 5
            r15.<init>(r11, r13, r9, r0)     // Catch: java.lang.Throwable -> L96
            r6.I = r9     // Catch: java.lang.Throwable -> L96
            r6.J = r12     // Catch: java.lang.Throwable -> L96
            r6.M = r8     // Catch: java.lang.Throwable -> L96
            java.lang.Object r13 = defpackage.p70.D0(r14, r15, r6)     // Catch: java.lang.Throwable -> L96
            if (r13 != r10) goto L93
        L92:
            return r10
        L93:
            com.github.mytv.dv.model.CommentListResponse r13 = (com.github.mytv.dv.model.CommentListResponse) r13     // Catch: java.lang.Throwable -> L96
            return r13
        L96:
            r0 = move-exception
            r11 = r0
            g54 r12 = new g54
            r12.<init>(r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.J(int, gj0, java.lang.String, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0132, code lost:
    
        if (r2 != r15) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(java.lang.String r17, java.lang.String r18, long r19, long r21, long r23, java.lang.String r25, defpackage.gj0 r26) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.K(java.lang.String, java.lang.String, long, long, long, java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r12 != r10) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(defpackage.gj0 r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.zz0
            if (r0 == 0) goto L14
            r0 = r12
            zz0 r0 = (defpackage.zz0) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.L = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            zz0 r0 = new zz0
            r0.<init>(r11, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.J
            int r0 = r6.L
            r8 = 2
            r1 = 1
            r9 = 0
            el0 r10 = defpackage.el0.I
            if (r0 == 0) goto L39
            if (r0 == r1) goto L33
            if (r0 != r8) goto L2d
            defpackage.mu0.V(r12)     // Catch: java.lang.Throwable -> L72
            goto L6f
        L2d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r11)
            return r9
        L33:
            n11 r11 = r6.I
            defpackage.mu0.V(r12)     // Catch: java.lang.Throwable -> L72
            goto L5b
        L39:
            defpackage.mu0.V(r12)
            zy0 r12 = defpackage.n11.Companion     // Catch: java.lang.Throwable -> L72
            r12.getClass()     // Catch: java.lang.Throwable -> L72
            java.util.LinkedHashMap r3 = defpackage.zy0.a()     // Catch: java.lang.Throwable -> L72
            r11.D0(r3)     // Catch: java.lang.Throwable -> L72
            java.lang.String r2 = "/aweme/v1/web/emoji/list"
            r6.I = r11     // Catch: java.lang.Throwable -> L72
            r6.L = r1     // Catch: java.lang.Throwable -> L72
            r4 = 0
            r5 = 0
            r7 = 252(0xfc, float:3.53E-43)
            r1 = r11
            java.lang.Object r12 = r(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L72
            if (r12 != r10) goto L5a
            goto L6e
        L5a:
            r11 = r1
        L5b:
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> L72
            os0 r0 = defpackage.sx0.a     // Catch: java.lang.Throwable -> L72
            gz0 r1 = new gz0     // Catch: java.lang.Throwable -> L72
            r1.<init>(r11, r12, r9, r8)     // Catch: java.lang.Throwable -> L72
            r6.I = r9     // Catch: java.lang.Throwable -> L72
            r6.L = r8     // Catch: java.lang.Throwable -> L72
            java.lang.Object r12 = defpackage.p70.D0(r0, r1, r6)     // Catch: java.lang.Throwable -> L72
            if (r12 != r10) goto L6f
        L6e:
            return r10
        L6f:
            com.github.mytv.dv.model.EmojiListResponse r12 = (com.github.mytv.dv.model.EmojiListResponse) r12     // Catch: java.lang.Throwable -> L72
            return r12
        L72:
            r0 = move-exception
            r11 = r0
            g54 r12 = new g54
            r12.<init>(r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.L(gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(int r10, int r11, java.util.List r12, defpackage.gj0 r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.a01
            if (r0 == 0) goto L14
            r0 = r13
            a01 r0 = (defpackage.a01) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.K = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            a01 r0 = new a01
            r0.<init>(r9, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r7.I
            int r0 = r7.K
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2b
            defpackage.mu0.V(r13)
            h54 r13 = (defpackage.h54) r13
            java.lang.Object r9 = r13.I
            return r9
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r9)
            r9 = 0
            return r9
        L32:
            defpackage.mu0.V(r13)
            r7.K = r1
            r4 = 0
            r5 = 0
            r8 = 28
            r1 = r9
            r2 = r10
            r3 = r11
            r6 = r12
            java.lang.Object r9 = c0(r1, r2, r3, r4, r5, r6, r7, r8)
            el0 r10 = defpackage.el0.I
            if (r9 != r10) goto L48
            return r10
        L48:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.M(int, int, java.util.List, gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f9, code lost:
    
        if (r1 != r10) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(long r16, int r18, int r19, defpackage.gj0 r20) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.N(long, int, int, gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (r11 != r9) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(defpackage.gj0 r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.c01
            if (r0 == 0) goto L14
            r0 = r11
            c01 r0 = (defpackage.c01) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.L = r1
        L12:
            r2 = r0
            goto L1a
        L14:
            c01 r0 = new c01
            r0.<init>(r10, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r2.J
            int r0 = r2.L
            r7 = 2
            r1 = 1
            r8 = 0
            el0 r9 = defpackage.el0.I
            if (r0 == 0) goto L39
            if (r0 == r1) goto L33
            if (r0 != r7) goto L2d
            defpackage.mu0.V(r11)     // Catch: java.lang.Throwable -> L79
            goto L76
        L2d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r10)
            return r8
        L33:
            n11 r10 = r2.I
            defpackage.mu0.V(r11)     // Catch: java.lang.Throwable -> L79
            goto L61
        L39:
            defpackage.mu0.V(r11)
            zy0 r11 = defpackage.n11.Companion     // Catch: java.lang.Throwable -> L79
            r11.getClass()     // Catch: java.lang.Throwable -> L79
            java.util.LinkedHashMap r6 = defpackage.zy0.a()     // Catch: java.lang.Throwable -> L79
            r10.E0(r6)     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = "/aweme/v1/web/hot/search/list/"
            java.lang.String r11 = ""
            java.lang.String r0 = "general"
            java.lang.String r5 = d(r11, r0)     // Catch: java.lang.Throwable -> L79
            r2.I = r10     // Catch: java.lang.Throwable -> L79
            r2.L = r1     // Catch: java.lang.Throwable -> L79
            java.lang.String r4 = "https://www.douyin.com"
            r1 = r10
            java.lang.Object r11 = r1.u(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L79
            if (r11 != r9) goto L60
            goto L75
        L60:
            r10 = r1
        L61:
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L79
            os0 r0 = defpackage.sx0.a     // Catch: java.lang.Throwable -> L79
            ez0 r1 = new ez0     // Catch: java.lang.Throwable -> L79
            r3 = 7
            r1.<init>(r10, r11, r8, r3)     // Catch: java.lang.Throwable -> L79
            r2.I = r8     // Catch: java.lang.Throwable -> L79
            r2.L = r7     // Catch: java.lang.Throwable -> L79
            java.lang.Object r11 = defpackage.p70.D0(r0, r1, r2)     // Catch: java.lang.Throwable -> L79
            if (r11 != r9) goto L76
        L75:
            return r9
        L76:
            com.github.mytv.dv.model.HotSearchResponse r11 = (com.github.mytv.dv.model.HotSearchResponse) r11     // Catch: java.lang.Throwable -> L79
            return r11
        L79:
            r0 = move-exception
            r10 = r0
            g54 r11 = new g54
            r11.<init>(r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.O(gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bc, code lost:
    
        if (r1 != r10) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(boolean r12, defpackage.gj0 r13) {
        /*
            r11 = this;
            java.lang.String r2 = "web_homepage_hot_web_live_card"
            java.lang.String r3 = "0"
            java.lang.String r4 = "1"
            boolean r5 = r13 instanceof defpackage.d01
            if (r5 == 0) goto L19
            r5 = r13
            d01 r5 = (defpackage.d01) r5
            int r6 = r5.M
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L19
            int r6 = r6 - r7
            r5.M = r6
            goto L1e
        L19:
            d01 r5 = new d01
            r5.<init>(r11, r13)
        L1e:
            java.lang.Object r1 = r5.K
            int r6 = r5.M
            r7 = 2
            r8 = 1
            r9 = 0
            el0 r10 = defpackage.el0.I
            if (r6 == 0) goto L40
            if (r6 == r8) goto L38
            if (r6 != r7) goto L32
            defpackage.mu0.V(r1)     // Catch: java.lang.Throwable -> Lc2
            goto Lbf
        L32:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r0)
            return r9
        L38:
            boolean r0 = r5.I
            n11 r2 = r5.J
            defpackage.mu0.V(r1)     // Catch: java.lang.Throwable -> Lc2
            goto La7
        L40:
            defpackage.mu0.V(r1)
            java.util.LinkedHashMap r1 = b(r11)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r6 = "need_map"
            r1.put(r6, r4)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r6 = "liveid"
            r1.put(r6, r4)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r6 = "is_draw"
            r1.put(r6, r4)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r4 = "inner_from_drawer"
            r1.put(r4, r3)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r4 = "custom_count"
            if (r12 == 0) goto L62
            java.lang.String r6 = "15"
            goto L64
        L62:
            java.lang.String r6 = "8"
        L64:
            r1.put(r4, r6)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r4 = "action"
            java.lang.String r6 = "load_more"
            r1.put(r4, r6)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r4 = "action_type"
            java.lang.String r6 = "loadmore"
            r1.put(r4, r6)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r4 = "enter_source"
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r4 = "source_key"
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> Lc2
            if (r12 == 0) goto L8d
            java.lang.String r2 = "is_ssr"
            java.lang.String r4 = "true"
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r2 = "maxtime"
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> Lc2
        L8d:
            r11.D0(r1)     // Catch: java.lang.Throwable -> Lc2
            r2 = r1
            java.lang.String r1 = "/webcast/feed/"
            r5.J = r11     // Catch: java.lang.Throwable -> Lc2
            r5.I = r12     // Catch: java.lang.Throwable -> Lc2
            r5.M = r8     // Catch: java.lang.Throwable -> Lc2
            r3 = 0
            r4 = 0
            r6 = 216(0xd8, float:3.03E-43)
            r0 = r11
            java.lang.Object r1 = r(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lc2
            if (r1 != r10) goto La5
            goto Lbe
        La5:
            r2 = r11
            r0 = r12
        La7:
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lc2
            os0 r3 = defpackage.sx0.a     // Catch: java.lang.Throwable -> Lc2
            ez0 r4 = new ez0     // Catch: java.lang.Throwable -> Lc2
            r6 = 9
            r4.<init>(r2, r1, r9, r6)     // Catch: java.lang.Throwable -> Lc2
            r5.J = r9     // Catch: java.lang.Throwable -> Lc2
            r5.I = r0     // Catch: java.lang.Throwable -> Lc2
            r5.M = r7     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r1 = defpackage.p70.D0(r3, r4, r5)     // Catch: java.lang.Throwable -> Lc2
            if (r1 != r10) goto Lbf
        Lbe:
            return r10
        Lbf:
            com.github.mytv.dv.model.LiveFeedResponseHome r1 = (com.github.mytv.dv.model.LiveFeedResponseHome) r1     // Catch: java.lang.Throwable -> Lc2
            return r1
        Lc2:
            r0 = move-exception
            g54 r1 = new g54
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.P(boolean, gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r13 != r10) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q(java.lang.String r12, defpackage.gj0 r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.e01
            if (r0 == 0) goto L14
            r0 = r13
            e01 r0 = (defpackage.e01) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.L = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            e01 r0 = new e01
            r0.<init>(r11, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.J
            int r0 = r6.L
            r8 = 2
            r1 = 1
            r9 = 0
            el0 r10 = defpackage.el0.I
            if (r0 == 0) goto L39
            if (r0 == r1) goto L33
            if (r0 != r8) goto L2d
            defpackage.mu0.V(r13)     // Catch: java.lang.Throwable -> L74
            goto L71
        L2d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r11)
            return r9
        L33:
            n11 r11 = r6.I
            defpackage.mu0.V(r13)     // Catch: java.lang.Throwable -> L74
            goto L5b
        L39:
            defpackage.mu0.V(r13)
            java.util.LinkedHashMap r3 = b(r11)     // Catch: java.lang.Throwable -> L74
            java.lang.String r13 = "scene"
            r3.put(r13, r12)     // Catch: java.lang.Throwable -> L74
            r11.D0(r3)     // Catch: java.lang.Throwable -> L74
            java.lang.String r2 = "/webcast/web/feed/follow/"
            r6.I = r11     // Catch: java.lang.Throwable -> L74
            r6.L = r1     // Catch: java.lang.Throwable -> L74
            r4 = 0
            r5 = 0
            r7 = 216(0xd8, float:3.03E-43)
            r1 = r11
            java.lang.Object r13 = r(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L74
            if (r13 != r10) goto L5a
            goto L70
        L5a:
            r11 = r1
        L5b:
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L74
            os0 r12 = defpackage.sx0.a     // Catch: java.lang.Throwable -> L74
            ez0 r0 = new ez0     // Catch: java.lang.Throwable -> L74
            r1 = 8
            r0.<init>(r11, r13, r9, r1)     // Catch: java.lang.Throwable -> L74
            r6.I = r9     // Catch: java.lang.Throwable -> L74
            r6.L = r8     // Catch: java.lang.Throwable -> L74
            java.lang.Object r13 = defpackage.p70.D0(r12, r0, r6)     // Catch: java.lang.Throwable -> L74
            if (r13 != r10) goto L71
        L70:
            return r10
        L71:
            com.github.mytv.dv.model.LiveFeedResponse r13 = (com.github.mytv.dv.model.LiveFeedResponse) r13     // Catch: java.lang.Throwable -> L74
            return r13
        L74:
            r0 = move-exception
            r11 = r0
            g54 r12 = new g54
            r12.<init>(r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.Q(java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        if (r13 != r10) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R(int r12, defpackage.gj0 r13, java.lang.String r14, java.lang.String r15) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.f01
            if (r0 == 0) goto L14
            r0 = r13
            f01 r0 = (defpackage.f01) r0
            int r1 = r0.M
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.M = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            f01 r0 = new f01
            r0.<init>(r11, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.K
            int r0 = r6.M
            r8 = 2
            r1 = 1
            r9 = 0
            el0 r10 = defpackage.el0.I
            if (r0 == 0) goto L3b
            if (r0 == r1) goto L33
            if (r0 != r8) goto L2d
            defpackage.mu0.V(r13)     // Catch: java.lang.Throwable -> L8f
            goto L8c
        L2d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r11)
            return r9
        L33:
            int r12 = r6.J
            n11 r11 = r6.I
            defpackage.mu0.V(r13)     // Catch: java.lang.Throwable -> L8f
            goto L74
        L3b:
            defpackage.mu0.V(r13)
            java.util.LinkedHashMap r3 = b(r11)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r13 = "partition"
            r3.put(r13, r14)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r13 = "partition_type"
            r3.put(r13, r15)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r13 = "count"
            java.lang.String r14 = "15"
            r3.put(r13, r14)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r13 = "offset"
            java.lang.String r14 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L8f
            r3.put(r13, r14)     // Catch: java.lang.Throwable -> L8f
            r11.D0(r3)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r2 = "/webcast/web/partition/detail/room/v2/"
            r6.I = r11     // Catch: java.lang.Throwable -> L8f
            r6.J = r12     // Catch: java.lang.Throwable -> L8f
            r6.M = r1     // Catch: java.lang.Throwable -> L8f
            r4 = 0
            r5 = 1
            r7 = 216(0xd8, float:3.03E-43)
            r1 = r11
            java.lang.Object r13 = r(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L8f
            if (r13 != r10) goto L73
            goto L8b
        L73:
            r11 = r1
        L74:
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L8f
            os0 r14 = defpackage.sx0.a     // Catch: java.lang.Throwable -> L8f
            ez0 r15 = new ez0     // Catch: java.lang.Throwable -> L8f
            r0 = 10
            r15.<init>(r11, r13, r9, r0)     // Catch: java.lang.Throwable -> L8f
            r6.I = r9     // Catch: java.lang.Throwable -> L8f
            r6.J = r12     // Catch: java.lang.Throwable -> L8f
            r6.M = r8     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r13 = defpackage.p70.D0(r14, r15, r6)     // Catch: java.lang.Throwable -> L8f
            if (r13 != r10) goto L8c
        L8b:
            return r10
        L8c:
            com.github.mytv.dv.model.LiveFeedResponse r13 = (com.github.mytv.dv.model.LiveFeedResponse) r13     // Catch: java.lang.Throwable -> L8f
            return r13
        L8f:
            r0 = move-exception
            r11 = r0
            g54 r12 = new g54
            r12.<init>(r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.R(int, gj0, java.lang.String, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if (r13 != r10) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S(java.lang.String r12, defpackage.gj0 r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.g01
            if (r0 == 0) goto L14
            r0 = r13
            g01 r0 = (defpackage.g01) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.L = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            g01 r0 = new g01
            r0.<init>(r11, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.J
            int r0 = r6.L
            r8 = 2
            r1 = 1
            r9 = 0
            el0 r10 = defpackage.el0.I
            if (r0 == 0) goto L39
            if (r0 == r1) goto L33
            if (r0 != r8) goto L2d
            defpackage.mu0.V(r13)     // Catch: java.lang.Throwable -> L82
            goto L7f
        L2d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r11)
            return r9
        L33:
            n11 r11 = r6.I
            defpackage.mu0.V(r13)     // Catch: java.lang.Throwable -> L82
            goto L69
        L39:
            defpackage.mu0.V(r13)
            java.util.LinkedHashMap r3 = b(r11)     // Catch: java.lang.Throwable -> L82
            java.lang.String r13 = "room_id"
            r3.put(r13, r12)     // Catch: java.lang.Throwable -> L82
            java.lang.String r12 = "scene"
            java.lang.String r13 = "aweme_video_feed_pc"
            r3.put(r12, r13)     // Catch: java.lang.Throwable -> L82
            java.lang.String r12 = "region"
            java.lang.String r13 = "cn"
            r3.put(r12, r13)     // Catch: java.lang.Throwable -> L82
            r11.D0(r3)     // Catch: java.lang.Throwable -> L82
            java.lang.String r2 = "/webcast/room/info_by_scene/"
            r6.I = r11     // Catch: java.lang.Throwable -> L82
            r6.L = r1     // Catch: java.lang.Throwable -> L82
            r4 = 0
            r5 = 0
            r7 = 216(0xd8, float:3.03E-43)
            r1 = r11
            java.lang.Object r13 = r(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L82
            if (r13 != r10) goto L68
            goto L7e
        L68:
            r11 = r1
        L69:
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L82
            os0 r12 = defpackage.sx0.a     // Catch: java.lang.Throwable -> L82
            ez0 r0 = new ez0     // Catch: java.lang.Throwable -> L82
            r1 = 11
            r0.<init>(r11, r13, r9, r1)     // Catch: java.lang.Throwable -> L82
            r6.I = r9     // Catch: java.lang.Throwable -> L82
            r6.L = r8     // Catch: java.lang.Throwable -> L82
            java.lang.Object r13 = defpackage.p70.D0(r12, r0, r6)     // Catch: java.lang.Throwable -> L82
            if (r13 != r10) goto L7f
        L7e:
            return r10
        L7f:
            com.github.mytv.dv.model.LiveRoomResponse r13 = (com.github.mytv.dv.model.LiveRoomResponse) r13     // Catch: java.lang.Throwable -> L82
            return r13
        L82:
            r0 = move-exception
            r11 = r0
            g54 r12 = new g54
            r12.<init>(r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.S(java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d4, code lost:
    
        if (r0 != r9) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T(java.lang.String r14, long r15, int r17, boolean r18, defpackage.gj0 r19) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.T(java.lang.String, long, int, boolean, gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        if (r14 != r11) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U(java.lang.String r13, defpackage.gj0 r14) {
        /*
            r12 = this;
            java.lang.String r0 = "https://www.douyin.com/collection/"
            boolean r1 = r14 instanceof defpackage.i01
            if (r1 == 0) goto L16
            r1 = r14
            i01 r1 = (defpackage.i01) r1
            int r2 = r1.L
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.L = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            i01 r1 = new i01
            r1.<init>(r12, r14)
            goto L14
        L1c:
            java.lang.Object r14 = r7.J
            int r1 = r7.L
            r9 = 2
            r2 = 1
            r10 = 0
            el0 r11 = defpackage.el0.I
            if (r1 == 0) goto L3b
            if (r1 == r2) goto L35
            if (r1 != r9) goto L2f
            defpackage.mu0.V(r14)     // Catch: java.lang.Throwable -> L8d
            goto L8a
        L2f:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r12)
            return r10
        L35:
            n11 r12 = r7.I
            defpackage.mu0.V(r14)     // Catch: java.lang.Throwable -> L8d
            goto L74
        L3b:
            defpackage.mu0.V(r14)
            zy0 r14 = defpackage.n11.Companion     // Catch: java.lang.Throwable -> L8d
            r14.getClass()     // Catch: java.lang.Throwable -> L8d
            java.util.LinkedHashMap r4 = defpackage.zy0.a()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r14 = "series_id"
            r4.put(r14, r13)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r14 = "req_from"
            java.lang.String r1 = "channel_pc_web"
            r4.put(r14, r1)     // Catch: java.lang.Throwable -> L8d
            r12.D0(r4)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r3 = "/aweme/v1/web/series/detail/"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L8d
            r14.append(r13)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r5 = r14.toString()     // Catch: java.lang.Throwable -> L8d
            r7.I = r12     // Catch: java.lang.Throwable -> L8d
            r7.L = r2     // Catch: java.lang.Throwable -> L8d
            r6 = 0
            r8 = 116(0x74, float:1.63E-43)
            r2 = r12
            java.lang.Object r14 = r(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L8d
            if (r14 != r11) goto L73
            goto L89
        L73:
            r12 = r2
        L74:
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> L8d
            os0 r13 = defpackage.sx0.a     // Catch: java.lang.Throwable -> L8d
            ez0 r0 = new ez0     // Catch: java.lang.Throwable -> L8d
            r1 = 13
            r0.<init>(r12, r14, r10, r1)     // Catch: java.lang.Throwable -> L8d
            r7.I = r10     // Catch: java.lang.Throwable -> L8d
            r7.L = r9     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r14 = defpackage.p70.D0(r13, r0, r7)     // Catch: java.lang.Throwable -> L8d
            if (r14 != r11) goto L8a
        L89:
            return r11
        L8a:
            com.github.mytv.dv.model.MixDetailResponse r14 = (com.github.mytv.dv.model.MixDetailResponse) r14     // Catch: java.lang.Throwable -> L8d
            return r14
        L8d:
            r0 = move-exception
            r12 = r0
            g54 r13 = new g54
            r13.<init>(r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.U(java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x02c3 A[Catch: all -> 0x0323, TryCatch #0 {all -> 0x0323, blocks: (B:13:0x0040, B:15:0x02b8, B:16:0x02bd, B:18:0x02c3, B:19:0x02c5, B:21:0x0303, B:29:0x0053, B:31:0x028c, B:33:0x028e, B:36:0x0294, B:41:0x006b, B:46:0x00df, B:49:0x012e, B:52:0x014c, B:55:0x0198, B:58:0x01b2, B:63:0x01dc, B:67:0x01f4, B:69:0x0250, B:70:0x026c, B:76:0x01a6, B:77:0x018c, B:78:0x009f, B:80:0x007d), top: B:7:0x0032, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0303 A[Catch: all -> 0x0323, TRY_LEAVE, TryCatch #0 {all -> 0x0323, blocks: (B:13:0x0040, B:15:0x02b8, B:16:0x02bd, B:18:0x02c3, B:19:0x02c5, B:21:0x0303, B:29:0x0053, B:31:0x028c, B:33:0x028e, B:36:0x0294, B:41:0x006b, B:46:0x00df, B:49:0x012e, B:52:0x014c, B:55:0x0198, B:58:0x01b2, B:63:0x01dc, B:67:0x01f4, B:69:0x0250, B:70:0x026c, B:76:0x01a6, B:77:0x018c, B:78:0x009f, B:80:0x007d), top: B:7:0x0032, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0250 A[Catch: all -> 0x0323, TryCatch #0 {all -> 0x0323, blocks: (B:13:0x0040, B:15:0x02b8, B:16:0x02bd, B:18:0x02c3, B:19:0x02c5, B:21:0x0303, B:29:0x0053, B:31:0x028c, B:33:0x028e, B:36:0x0294, B:41:0x006b, B:46:0x00df, B:49:0x012e, B:52:0x014c, B:55:0x0198, B:58:0x01b2, B:63:0x01dc, B:67:0x01f4, B:69:0x0250, B:70:0x026c, B:76:0x01a6, B:77:0x018c, B:78:0x009f, B:80:0x007d), top: B:7:0x0032, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a6 A[Catch: all -> 0x0323, TryCatch #0 {all -> 0x0323, blocks: (B:13:0x0040, B:15:0x02b8, B:16:0x02bd, B:18:0x02c3, B:19:0x02c5, B:21:0x0303, B:29:0x0053, B:31:0x028c, B:33:0x028e, B:36:0x0294, B:41:0x006b, B:46:0x00df, B:49:0x012e, B:52:0x014c, B:55:0x0198, B:58:0x01b2, B:63:0x01dc, B:67:0x01f4, B:69:0x0250, B:70:0x026c, B:76:0x01a6, B:77:0x018c, B:78:0x009f, B:80:0x007d), top: B:7:0x0032, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018c A[Catch: all -> 0x0323, TryCatch #0 {all -> 0x0323, blocks: (B:13:0x0040, B:15:0x02b8, B:16:0x02bd, B:18:0x02c3, B:19:0x02c5, B:21:0x0303, B:29:0x0053, B:31:0x028c, B:33:0x028e, B:36:0x0294, B:41:0x006b, B:46:0x00df, B:49:0x012e, B:52:0x014c, B:55:0x0198, B:58:0x01b2, B:63:0x01dc, B:67:0x01f4, B:69:0x0250, B:70:0x026c, B:76:0x01a6, B:77:0x018c, B:78:0x009f, B:80:0x007d), top: B:7:0x0032, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x009f A[Catch: all -> 0x0323, TryCatch #0 {all -> 0x0323, blocks: (B:13:0x0040, B:15:0x02b8, B:16:0x02bd, B:18:0x02c3, B:19:0x02c5, B:21:0x0303, B:29:0x0053, B:31:0x028c, B:33:0x028e, B:36:0x0294, B:41:0x006b, B:46:0x00df, B:49:0x012e, B:52:0x014c, B:55:0x0198, B:58:0x01b2, B:63:0x01dc, B:67:0x01f4, B:69:0x0250, B:70:0x026c, B:76:0x01a6, B:77:0x018c, B:78:0x009f, B:80:0x007d), top: B:7:0x0032, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(int r35, boolean r36, java.util.List r37, defpackage.gj0 r38) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.V(int, boolean, java.util.List, gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0122, code lost:
    
        if (r2 != r11) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W(int r17, int r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, defpackage.gj0 r22) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.W(int, int, java.lang.String, java.lang.String, java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00be, code lost:
    
        if (r1 != r9) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y(java.lang.String r13, int r14, java.lang.String r15, int r16, defpackage.gj0 r17) {
        /*
            r12 = this;
            r1 = r17
            boolean r2 = r1 instanceof defpackage.m01
            if (r2 == 0) goto L16
            r2 = r1
            m01 r2 = (defpackage.m01) r2
            int r3 = r2.N
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.N = r3
        L14:
            r5 = r2
            goto L1c
        L16:
            m01 r2 = new m01
            r2.<init>(r12, r1)
            goto L14
        L1c:
            java.lang.Object r1 = r5.L
            int r2 = r5.N
            r7 = 2
            r3 = 1
            r8 = 0
            el0 r9 = defpackage.el0.I
            if (r2 == 0) goto L42
            if (r2 == r3) goto L36
            if (r2 != r7) goto L30
            defpackage.mu0.V(r1)     // Catch: java.lang.Throwable -> Lc4
            goto Lc1
        L30:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r0)
            return r8
        L36:
            int r0 = r5.K
            byte r2 = r5.J
            n11 r3 = r5.I
            defpackage.mu0.V(r1)     // Catch: java.lang.Throwable -> Lc4
            r11 = r0
            r10 = r2
            goto La7
        L42:
            defpackage.mu0.V(r1)
            zy0 r1 = defpackage.n11.Companion     // Catch: java.lang.Throwable -> Lc4
            r1.getClass()     // Catch: java.lang.Throwable -> Lc4
            java.util.LinkedHashMap r2 = defpackage.zy0.a()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = "aweme_id"
            r2.put(r1, r13)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = "count"
            java.lang.String r6 = java.lang.String.valueOf(r14)     // Catch: java.lang.Throwable -> Lc4
            r2.put(r1, r6)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = "filterGids"
            boolean r6 = defpackage.jx4.L(r15)     // Catch: java.lang.Throwable -> Lc4
            if (r6 == 0) goto L66
            r4 = r13
            goto L67
        L66:
            r4 = r15
        L67:
            r2.put(r1, r4)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = "awemePcRecRawData"
            java.lang.String r4 = "{\"is_client\":true}"
            r2.put(r1, r4)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = "sub_channel_id"
            java.lang.String r4 = "3"
            r2.put(r1, r4)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = "Seo-Flag"
            java.lang.String r4 = "0"
            r2.put(r1, r4)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = "refresh_index"
            java.lang.String r4 = java.lang.String.valueOf(r16)     // Catch: java.lang.Throwable -> Lc4
            r2.put(r1, r4)     // Catch: java.lang.Throwable -> Lc4
            r12.D0(r2)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = "/aweme/v1/web/aweme/related/"
            java.lang.String r4 = "https://www.douyin.com/?recommend=1"
            r5.I = r12     // Catch: java.lang.Throwable -> Lc4
            r5.J = r14     // Catch: java.lang.Throwable -> Lc4
            r11 = r16
            r5.K = r11     // Catch: java.lang.Throwable -> Lc4
            r5.N = r3     // Catch: java.lang.Throwable -> Lc4
            r3 = r4
            r4 = 1
            r6 = 84
            r0 = r12
            java.lang.Object r1 = r(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lc4
            if (r1 != r9) goto La5
            goto Lc0
        La5:
            r3 = r12
            r10 = r14
        La7:
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lc4
            os0 r0 = defpackage.sx0.a     // Catch: java.lang.Throwable -> Lc4
            ez0 r2 = new ez0     // Catch: java.lang.Throwable -> Lc4
            r4 = 16
            r2.<init>(r3, r1, r8, r4)     // Catch: java.lang.Throwable -> Lc4
            r5.I = r8     // Catch: java.lang.Throwable -> Lc4
            r5.J = r10     // Catch: java.lang.Throwable -> Lc4
            r5.K = r11     // Catch: java.lang.Throwable -> Lc4
            r5.N = r7     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r1 = defpackage.p70.D0(r0, r2, r5)     // Catch: java.lang.Throwable -> Lc4
            if (r1 != r9) goto Lc1
        Lc0:
            return r9
        Lc1:
            com.github.mytv.dv.model.FeedResponse r1 = (com.github.mytv.dv.model.FeedResponse) r1     // Catch: java.lang.Throwable -> Lc4
            return r1
        Lc4:
            r0 = move-exception
            g54 r1 = new g54
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.Y(java.lang.String, int, java.lang.String, int, gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        if (r12 != r9) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z(java.lang.String r11, defpackage.gj0 r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.n01
            if (r0 == 0) goto L14
            r0 = r12
            n01 r0 = (defpackage.n01) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.L = r1
        L12:
            r2 = r0
            goto L1a
        L14:
            n01 r0 = new n01
            r0.<init>(r10, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r2.J
            int r0 = r2.L
            r1 = 1
            r7 = 2
            r8 = 0
            el0 r9 = defpackage.el0.I
            if (r0 == 0) goto L39
            if (r0 == r1) goto L33
            if (r0 != r7) goto L2d
            defpackage.mu0.V(r12)     // Catch: java.lang.Throwable -> L84
            goto L81
        L2d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r10)
            return r8
        L33:
            n11 r10 = r2.I
            defpackage.mu0.V(r12)     // Catch: java.lang.Throwable -> L84
            goto L6b
        L39:
            defpackage.mu0.V(r12)
            zy0 r12 = defpackage.n11.Companion     // Catch: java.lang.Throwable -> L84
            r12.getClass()     // Catch: java.lang.Throwable -> L84
            java.util.LinkedHashMap r6 = defpackage.zy0.a()     // Catch: java.lang.Throwable -> L84
            java.lang.String r12 = "keyword"
            r6.put(r12, r11)     // Catch: java.lang.Throwable -> L84
            java.lang.String r12 = "source"
            java.lang.String r0 = "aweme_video_web"
            r6.put(r12, r0)     // Catch: java.lang.Throwable -> L84
            r10.E0(r6)     // Catch: java.lang.Throwable -> L84
            java.lang.String r3 = "/aweme/v1/web/search/sug/"
            java.lang.String r12 = "general"
            java.lang.String r5 = d(r11, r12)     // Catch: java.lang.Throwable -> L84
            r2.I = r10     // Catch: java.lang.Throwable -> L84
            r2.L = r1     // Catch: java.lang.Throwable -> L84
            java.lang.String r4 = "https://www.douyin.com"
            r1 = r10
            java.lang.Object r12 = r1.u(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L84
            if (r12 != r9) goto L6a
            goto L80
        L6a:
            r10 = r1
        L6b:
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> L84
            os0 r11 = defpackage.sx0.a     // Catch: java.lang.Throwable -> L84
            ez0 r0 = new ez0     // Catch: java.lang.Throwable -> L84
            r1 = 17
            r0.<init>(r10, r12, r8, r1)     // Catch: java.lang.Throwable -> L84
            r2.I = r8     // Catch: java.lang.Throwable -> L84
            r2.L = r7     // Catch: java.lang.Throwable -> L84
            java.lang.Object r12 = defpackage.p70.D0(r11, r0, r2)     // Catch: java.lang.Throwable -> L84
            if (r12 != r9) goto L81
        L80:
            return r9
        L81:
            com.github.mytv.dv.model.SearchSugResponse r12 = (com.github.mytv.dv.model.SearchSugResponse) r12     // Catch: java.lang.Throwable -> L84
            return r12
        L84:
            r0 = move-exception
            r10 = r0
            g54 r11 = new g54
            r11.<init>(r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.Z(java.lang.String, gj0):java.lang.Object");
    }

    public final LinkedHashMap a(int i, int i2, String str, String str2) {
        Companion.getClass();
        LinkedHashMap a = zy0.a();
        a.put("search_channel", "aweme_live");
        a.put("keyword", str);
        a.put("search_source", "normal_search");
        a.put("query_correct_type", "1");
        a.put("is_filter_search", "0");
        a.put("offset", String.valueOf(i));
        a.put("count", String.valueOf(i2));
        a.put("need_filter_settings", i != 0 ? "0" : "1");
        if (!jx4.L(str2)) {
            a.put("search_id", str2);
        }
        a.put("list_type", "single");
        D0(a);
        return a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009f, code lost:
    
        if (r12 != r9) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a0(int r11, defpackage.gj0 r12, java.lang.String r13, java.lang.String r14) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.o01
            if (r0 == 0) goto L14
            r0 = r12
            o01 r0 = (defpackage.o01) r0
            int r1 = r0.M
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.M = r1
        L12:
            r2 = r0
            goto L1a
        L14:
            o01 r0 = new o01
            r0.<init>(r10, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r2.K
            int r0 = r2.M
            r1 = 1
            r7 = 2
            r8 = 0
            el0 r9 = defpackage.el0.I
            if (r0 == 0) goto L3c
            if (r0 == r1) goto L34
            if (r0 != r7) goto L2e
            defpackage.mu0.V(r12)     // Catch: java.lang.Throwable -> La5
            goto La2
        L2e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r10)
            return r8
        L34:
            byte r11 = r2.J
            n11 r10 = r2.I
            defpackage.mu0.V(r12)     // Catch: java.lang.Throwable -> La5
            goto L8a
        L3c:
            defpackage.mu0.V(r12)
            zy0 r12 = defpackage.n11.Companion     // Catch: java.lang.Throwable -> La5
            r12.getClass()     // Catch: java.lang.Throwable -> La5
            java.util.LinkedHashMap r6 = defpackage.zy0.a()     // Catch: java.lang.Throwable -> La5
            java.lang.String r12 = "count"
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> La5
            r6.put(r12, r0)     // Catch: java.lang.Throwable -> La5
            java.lang.String r12 = "business_id"
            java.lang.String r0 = "30068"
            r6.put(r12, r0)     // Catch: java.lang.Throwable -> La5
            int r12 = r14.length()     // Catch: java.lang.Throwable -> La5
            if (r12 <= 0) goto L63
            java.lang.String r12 = "from_group_id"
            r6.put(r12, r14)     // Catch: java.lang.Throwable -> La5
        L63:
            int r12 = r13.length()     // Catch: java.lang.Throwable -> La5
            if (r12 <= 0) goto L6e
            java.lang.String r12 = "query"
            r6.put(r12, r13)     // Catch: java.lang.Throwable -> La5
        L6e:
            r10.E0(r6)     // Catch: java.lang.Throwable -> La5
            java.lang.String r3 = "/aweme/v1/web/api/suggest_words/"
            java.lang.String r12 = "general"
            java.lang.String r5 = d(r13, r12)     // Catch: java.lang.Throwable -> La5
            r2.I = r10     // Catch: java.lang.Throwable -> La5
            r2.J = r11     // Catch: java.lang.Throwable -> La5
            r2.M = r1     // Catch: java.lang.Throwable -> La5
            java.lang.String r4 = "https://www.douyin.com"
            r1 = r10
            java.lang.Object r12 = r1.u(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> La5
            if (r12 != r9) goto L89
            goto La1
        L89:
            r10 = r1
        L8a:
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> La5
            os0 r13 = defpackage.sx0.a     // Catch: java.lang.Throwable -> La5
            ez0 r14 = new ez0     // Catch: java.lang.Throwable -> La5
            r0 = 18
            r14.<init>(r10, r12, r8, r0)     // Catch: java.lang.Throwable -> La5
            r2.I = r8     // Catch: java.lang.Throwable -> La5
            r2.J = r11     // Catch: java.lang.Throwable -> La5
            r2.M = r7     // Catch: java.lang.Throwable -> La5
            java.lang.Object r12 = defpackage.p70.D0(r13, r14, r2)     // Catch: java.lang.Throwable -> La5
            if (r12 != r9) goto La2
        La1:
            return r9
        La2:
            com.github.mytv.dv.model.SuggestWordsResponse r12 = (com.github.mytv.dv.model.SuggestWordsResponse) r12     // Catch: java.lang.Throwable -> La5
            return r12
        La5:
            r0 = move-exception
            r10 = r0
            g54 r11 = new g54
            r11.<init>(r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.a0(int, gj0, java.lang.String, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0240, code lost:
    
        if (r1 != r15) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019d A[Catch: all -> 0x0246, TryCatch #0 {all -> 0x0246, blocks: (B:12:0x003c, B:13:0x0243, B:20:0x0053, B:22:0x0225, B:26:0x0068, B:28:0x0201, B:33:0x0079, B:36:0x00b0, B:39:0x0143, B:42:0x0154, B:45:0x0165, B:48:0x0176, B:51:0x0184, B:53:0x018a, B:55:0x0197, B:60:0x019d, B:61:0x01a7, B:64:0x01b3, B:67:0x01c6, B:68:0x01db, B:72:0x01d8, B:75:0x0097), top: B:7:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c6 A[Catch: all -> 0x0246, TRY_ENTER, TryCatch #0 {all -> 0x0246, blocks: (B:12:0x003c, B:13:0x0243, B:20:0x0053, B:22:0x0225, B:26:0x0068, B:28:0x0201, B:33:0x0079, B:36:0x00b0, B:39:0x0143, B:42:0x0154, B:45:0x0165, B:48:0x0176, B:51:0x0184, B:53:0x018a, B:55:0x0197, B:60:0x019d, B:61:0x01a7, B:64:0x01b3, B:67:0x01c6, B:68:0x01db, B:72:0x01d8, B:75:0x0097), top: B:7:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d8 A[Catch: all -> 0x0246, TryCatch #0 {all -> 0x0246, blocks: (B:12:0x003c, B:13:0x0243, B:20:0x0053, B:22:0x0225, B:26:0x0068, B:28:0x0201, B:33:0x0079, B:36:0x00b0, B:39:0x0143, B:42:0x0154, B:45:0x0165, B:48:0x0176, B:51:0x0184, B:53:0x018a, B:55:0x0197, B:60:0x019d, B:61:0x01a7, B:64:0x01b3, B:67:0x01c6, B:68:0x01db, B:72:0x01d8, B:75:0x0097), top: B:7:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b0(int r24, int r25, int r26, java.lang.String r27, int r28, java.util.List r29, defpackage.gj0 r30) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.b0(int, int, int, java.lang.String, int, java.util.List, gj0):java.lang.Object");
    }

    public final Map c(String str, d32 d32Var) {
        Object g54Var;
        if (!d32Var.a()) {
            return p91.I;
        }
        try {
            g54Var = g4.A(d32Var.d);
        } catch (Throwable th) {
            g54Var = new g54(th);
        }
        Throwable a = h54.a(g54Var);
        if (a != null) {
            String str2 = (String) this.a.h().get("bd_ticket_guard_client_data");
            if (str2 == null) {
                str2 = "";
            }
            String c0 = g4.c0(str2);
            if (jx4.L(c0)) {
                c0 = null;
            }
            g54Var = c0;
            if (g54Var == null) {
                throw a;
            }
        }
        return sv2.K(new uj3("bd-ticket-guard-client-data", g4.l(str, d32Var)), new uj3("bd-ticket-guard-ree-public-key", (String) g54Var), new uj3("bd-ticket-guard-version", "2"), new uj3("bd-ticket-guard-web-sign-type", "1"), new uj3("bd-ticket-guard-web-version", "2"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0101, code lost:
    
        if (r2 != r11) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d0(long r20, int r22, defpackage.gj0 r23) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.d0(long, int, gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ec, code lost:
    
        if (r0 != r11) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e0(java.lang.String r14, long r15, int r17, defpackage.gj0 r18) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.e0(java.lang.String, long, int, gj0):java.lang.Object");
    }

    public final LinkedHashMap f(int i, int i2, String str, String str2, String str3, String str4) {
        boolean z = (jx4.L(str3) && jx4.L(str4)) ? false : true;
        Companion.getClass();
        LinkedHashMap a = zy0.a();
        a.put("search_channel", "aweme_user_web");
        if (z) {
            a.put("search_filter_value", hf1.x("{\"douyin_user_fans\":[\"", str3, "\"],\"douyin_user_type\":[\"", str4, "\"]}"));
        }
        a.put("keyword", str);
        a.put("search_source", "switch_tab");
        a.put("query_correct_type", "1");
        a.put("is_filter_search", z ? "1" : "0");
        a.put("offset", String.valueOf(i));
        a.put("count", String.valueOf(i2));
        a.put("need_filter_settings", i != 0 ? "0" : "1");
        if (!jx4.L(str2)) {
            a.put("search_id", str2);
        }
        a.put("list_type", "single");
        D0(a);
        return a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d9, code lost:
    
        if (r2 != r13) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f0(java.lang.String r17, java.lang.String r18, long r19, int r21, defpackage.gj0 r22) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.f0(java.lang.String, java.lang.String, long, int, gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00df, code lost:
    
        if (r2 != r13) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g0(java.lang.String r17, java.lang.String r18, long r19, int r21, defpackage.gj0 r22) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.g0(java.lang.String, java.lang.String, long, int, gj0):java.lang.Object");
    }

    public final void h(Response response) {
        List<String> headers = response.headers("Set-Cookie");
        if (headers.isEmpty()) {
            return;
        }
        fl4 fl4Var = this.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(fl4Var.h());
        Iterator<T> it = headers.iterator();
        boolean z = false;
        while (it.hasNext()) {
            uj3 r0 = r0((String) it.next());
            if (r0 != null) {
                String str = (String) r0.I;
                String str2 = (String) r0.J;
                if (!jx4.L(str2)) {
                    linkedHashMap.put(str, str2);
                    z = true;
                }
            }
        }
        if (z) {
            fl4Var.H(o70.Z0(linkedHashMap.entrySet(), "; ", null, null, 0, new yy0((byte) 4), 30));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        if (r0 != r11) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h0(java.lang.String r13, long r14, int r16, defpackage.gj0 r17) {
        /*
            r12 = this;
            r0 = r17
            boolean r1 = r0 instanceof defpackage.u01
            if (r1 == 0) goto L16
            r1 = r0
            u01 r1 = (defpackage.u01) r1
            int r2 = r1.N
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.N = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            u01 r1 = new u01
            r1.<init>(r12, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.L
            int r1 = r7.N
            r9 = 2
            r2 = 1
            r10 = 0
            el0 r11 = defpackage.el0.I
            if (r1 == 0) goto L45
            if (r1 == r2) goto L36
            if (r1 != r9) goto L30
            defpackage.mu0.V(r0)     // Catch: java.lang.Throwable -> Laf
            goto Lac
        L30:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r12)
            return r10
        L36:
            byte r12 = r7.K
            long r1 = r7.J
            n11 r13 = r7.I
            defpackage.mu0.V(r0)     // Catch: java.lang.Throwable -> Laf
            r3 = r13
            r13 = r12
            r12 = r3
            r3 = r0
            r0 = r1
            goto L92
        L45:
            defpackage.mu0.V(r0)
            zy0 r0 = defpackage.n11.Companion     // Catch: java.lang.Throwable -> Laf
            r0.getClass()     // Catch: java.lang.Throwable -> Laf
            java.util.LinkedHashMap r4 = defpackage.zy0.a()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r0 = "sec_user_id"
            r4.put(r0, r13)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r13 = "count"
            java.lang.String r0 = java.lang.String.valueOf(r16)     // Catch: java.lang.Throwable -> Laf
            r4.put(r13, r0)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r13 = "cursor"
            java.lang.String r0 = java.lang.String.valueOf(r14)     // Catch: java.lang.Throwable -> Laf
            r4.put(r13, r0)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r13 = "req_from"
            java.lang.String r0 = "channel_pc_web"
            r4.put(r13, r0)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r13 = "read_new_mix"
            java.lang.String r0 = "true"
            r4.put(r13, r0)     // Catch: java.lang.Throwable -> Laf
            r12.D0(r4)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r3 = "/aweme/v1/web/series/list/"
            r7.I = r12     // Catch: java.lang.Throwable -> Laf
            r7.J = r14     // Catch: java.lang.Throwable -> Laf
            r13 = r16
            r7.K = r13     // Catch: java.lang.Throwable -> Laf
            r7.N = r2     // Catch: java.lang.Throwable -> Laf
            r5 = 0
            r6 = 0
            r8 = 124(0x7c, float:1.74E-43)
            r2 = r12
            java.lang.Object r3 = r(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Laf
            if (r3 != r11) goto L91
            goto Lab
        L91:
            r0 = r14
        L92:
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Laf
            os0 r2 = defpackage.sx0.a     // Catch: java.lang.Throwable -> Laf
            ez0 r4 = new ez0     // Catch: java.lang.Throwable -> Laf
            r5 = 23
            r4.<init>(r12, r3, r10, r5)     // Catch: java.lang.Throwable -> Laf
            r7.I = r10     // Catch: java.lang.Throwable -> Laf
            r7.J = r0     // Catch: java.lang.Throwable -> Laf
            r7.K = r13     // Catch: java.lang.Throwable -> Laf
            r7.N = r9     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r0 = defpackage.p70.D0(r2, r4, r7)     // Catch: java.lang.Throwable -> Laf
            if (r0 != r11) goto Lac
        Lab:
            return r11
        Lac:
            com.github.mytv.dv.model.MixListResponse r0 = (com.github.mytv.dv.model.MixListResponse) r0     // Catch: java.lang.Throwable -> Laf
            return r0
        Laf:
            r0 = move-exception
            r12 = r0
            g54 r13 = new g54
            r13.<init>(r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.h0(java.lang.String, long, int, gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
    
        if (r13 != r10) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i0(java.lang.String r12, defpackage.gj0 r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.v01
            if (r0 == 0) goto L14
            r0 = r13
            v01 r0 = (defpackage.v01) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.L = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            v01 r0 = new v01
            r0.<init>(r11, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.J
            int r0 = r6.L
            r8 = 2
            r1 = 1
            r9 = 0
            el0 r10 = defpackage.el0.I
            if (r0 == 0) goto L39
            if (r0 == r1) goto L33
            if (r0 != r8) goto L2d
            defpackage.mu0.V(r13)     // Catch: java.lang.Throwable -> L8e
            goto L8b
        L2d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r11)
            return r9
        L33:
            n11 r11 = r6.I
            defpackage.mu0.V(r13)     // Catch: java.lang.Throwable -> L8e
            goto L75
        L39:
            defpackage.mu0.V(r13)
            zy0 r13 = defpackage.n11.Companion     // Catch: java.lang.Throwable -> L8e
            r13.getClass()     // Catch: java.lang.Throwable -> L8e
            java.util.LinkedHashMap r3 = defpackage.zy0.a()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r13 = "sec_user_id"
            r3.put(r13, r12)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r12 = "source"
            java.lang.String r13 = "channel_pc_web"
            r3.put(r12, r13)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r12 = "publish_video_strategy_type"
            java.lang.String r13 = "2"
            r3.put(r12, r13)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r12 = "personal_center_strategy"
            java.lang.String r13 = "1"
            r3.put(r12, r13)     // Catch: java.lang.Throwable -> L8e
            r11.D0(r3)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = "/aweme/v1/web/user/profile/other/"
            r6.I = r11     // Catch: java.lang.Throwable -> L8e
            r6.L = r1     // Catch: java.lang.Throwable -> L8e
            r4 = 0
            r5 = 0
            r7 = 252(0xfc, float:3.53E-43)
            r1 = r11
            java.lang.Object r13 = r(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L8e
            if (r13 != r10) goto L74
            goto L8a
        L74:
            r11 = r1
        L75:
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L8e
            os0 r12 = defpackage.sx0.a     // Catch: java.lang.Throwable -> L8e
            ez0 r0 = new ez0     // Catch: java.lang.Throwable -> L8e
            r1 = 24
            r0.<init>(r11, r13, r9, r1)     // Catch: java.lang.Throwable -> L8e
            r6.I = r9     // Catch: java.lang.Throwable -> L8e
            r6.L = r8     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r13 = defpackage.p70.D0(r12, r0, r6)     // Catch: java.lang.Throwable -> L8e
            if (r13 != r10) goto L8b
        L8a:
            return r10
        L8b:
            com.github.mytv.dv.model.UserProfileResponse r13 = (com.github.mytv.dv.model.UserProfileResponse) r13     // Catch: java.lang.Throwable -> L8e
            return r13
        L8e:
            r0 = move-exception
            r11 = r0
            g54 r12 = new g54
            r12.<init>(r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.i0(java.lang.String, gj0):java.lang.Object");
    }

    public final LiveRoom j(SearchLiveLives searchLiveLives) {
        Object obj;
        z62 z62Var = this.c;
        if (jx4.L(searchLiveLives.getRawdata())) {
            return new LiveRoom((String) null, searchLiveLives.getAwemeId(), (String) null, (String) null, (String) null, (Cover) null, (String) null, (RoomViewStats) null, searchLiveLives.getAuthor(), (StreamUrl) null, 0, (List) null, (EpisodeExtra) null, 7933, (er0) null);
        }
        try {
            String rawdata = searchLiveLives.getRawdata();
            z62Var.getClass();
            rawdata.getClass();
            b bVar = (b) z62Var.b(rawdata, u62.a);
            bVar.getClass();
            c cVar = (c) bVar;
            LiveRoom liveRoom = (LiveRoom) z62Var.a(LiveRoom.Companion.serializer(), cVar);
            b bVar2 = (b) cVar.get("user_count");
            String str = null;
            if (bVar2 != null) {
                d a = r62.a(bVar2);
                if (!(a instanceof JsonNull)) {
                    str = a.c();
                }
            }
            String str2 = str;
            obj = liveRoom;
            if (str2 != null) {
                if (jx4.L(str2)) {
                    obj = liveRoom;
                } else {
                    boolean c = j42.c(liveRoom.getUserCount(), "0");
                    obj = liveRoom;
                    if (c) {
                        obj = LiveRoom.copy$default(liveRoom, null, null, null, null, null, null, str2, null, null, null, 0, null, null, 8127, null);
                    }
                }
            }
        } catch (Throwable th) {
            obj = new g54(th);
        }
        Throwable a2 = h54.a(obj);
        Object obj2 = obj;
        if (a2 != null) {
            obj2 = new LiveRoom((String) null, searchLiveLives.getAwemeId(), (String) null, (String) null, (String) null, (Cover) null, (String) null, (RoomViewStats) null, searchLiveLives.getAuthor(), (StreamUrl) null, 0, (List) null, (EpisodeExtra) null, 7933, (er0) null);
        }
        return (LiveRoom) obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x006f, code lost:
    
        if (r12 != r10) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003b  */
    /* JADX WARN: Type inference failed for: r9v0, types: [fj0] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j0(defpackage.gj0 r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.w01
            if (r0 == 0) goto L14
            r0 = r12
            w01 r0 = (defpackage.w01) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.L = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            w01 r0 = new w01
            r0.<init>(r11, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.J
            int r0 = r6.L
            r8 = 2
            r1 = 1
            r9 = 0
            el0 r10 = defpackage.el0.I
            if (r0 == 0) goto L3b
            if (r0 == r1) goto L35
            if (r0 != r8) goto L2f
            n11 r11 = r6.I
            defpackage.mu0.V(r12)     // Catch: java.lang.Throwable -> La6
            goto L72
        L2f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r11)
            return r9
        L35:
            n11 r11 = r6.I
            defpackage.mu0.V(r12)     // Catch: java.lang.Throwable -> La6
            goto L5d
        L3b:
            defpackage.mu0.V(r12)
            zy0 r12 = defpackage.n11.Companion     // Catch: java.lang.Throwable -> La6
            r12.getClass()     // Catch: java.lang.Throwable -> La6
            java.util.LinkedHashMap r3 = defpackage.zy0.a()     // Catch: java.lang.Throwable -> La6
            r11.D0(r3)     // Catch: java.lang.Throwable -> La6
            java.lang.String r2 = "/aweme/v1/web/user/profile/self/"
            r6.I = r11     // Catch: java.lang.Throwable -> La6
            r6.L = r1     // Catch: java.lang.Throwable -> La6
            r4 = 0
            r5 = 0
            r7 = 252(0xfc, float:3.53E-43)
            r1 = r11
            java.lang.Object r12 = r(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> La6
            if (r12 != r10) goto L5c
            goto L71
        L5c:
            r11 = r1
        L5d:
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> La6
            os0 r0 = defpackage.sx0.a     // Catch: java.lang.Throwable -> La6
            gz0 r1 = new gz0     // Catch: java.lang.Throwable -> La6
            r2 = 4
            r1.<init>(r11, r12, r9, r2)     // Catch: java.lang.Throwable -> La6
            r6.I = r11     // Catch: java.lang.Throwable -> La6
            r6.L = r8     // Catch: java.lang.Throwable -> La6
            java.lang.Object r12 = defpackage.p70.D0(r0, r1, r6)     // Catch: java.lang.Throwable -> La6
            if (r12 != r10) goto L72
        L71:
            return r10
        L72:
            com.github.mytv.dv.model.UserProfileResponse r12 = (com.github.mytv.dv.model.UserProfileResponse) r12     // Catch: java.lang.Throwable -> La6
            com.github.mytv.dv.model.Author r0 = r12.getUser()     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto La5
            java.lang.String r0 = r0.getUid()     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto La5
            boolean r1 = defpackage.jx4.L(r0)     // Catch: java.lang.Throwable -> La6
            if (r1 != 0) goto L9e
            r1 = 0
        L87:
            int r2 = r0.length()     // Catch: java.lang.Throwable -> La6
            if (r1 >= r2) goto L9d
            char r2 = r0.charAt(r1)     // Catch: java.lang.Throwable -> La6
            char r2 = (char) r2     // Catch: java.lang.Throwable -> La6
            char r2 = (char) r2     // Catch: java.lang.Throwable -> La6
            boolean r2 = java.lang.Character.isDigit(r2)     // Catch: java.lang.Throwable -> La6
            if (r2 != 0) goto L9a
            goto L9e
        L9a:
            int r1 = r1 + 1
            goto L87
        L9d:
            r9 = r0
        L9e:
            if (r9 == 0) goto La5
            fl4 r11 = r11.a     // Catch: java.lang.Throwable -> La6
            r11.I(r9)     // Catch: java.lang.Throwable -> La6
        La5:
            return r12
        La6:
            r0 = move-exception
            r11 = r0
            g54 r12 = new g54
            r12.<init>(r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.j0(gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0122, code lost:
    
        if (r1 != r14) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k0(java.lang.String r18, long r19, int r21, defpackage.gj0 r22) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.k0(java.lang.String, long, int, gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0089, code lost:
    
        if (o(r0) != r5) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        if (defpackage.p70.D0(defpackage.ur0.I, new defpackage.r(r6, r3, 16), r0) == r5) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.gj0 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.cz0
            if (r0 == 0) goto L13
            r0 = r7
            cz0 r0 = (defpackage.cz0) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            cz0 r0 = new cz0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.I
            int r1 = r0.K
            r2 = 2
            r3 = 0
            r4 = 1
            el0 r5 = defpackage.el0.I
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r2) goto L2b
            defpackage.mu0.V(r7)
            goto L8c
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r6)
            return r3
        L31:
            defpackage.mu0.V(r7)
            goto L83
        L35:
            defpackage.mu0.V(r7)
            boolean r7 = r6.f
            if (r7 != 0) goto L83
            fl4 r7 = r6.a
            java.util.LinkedHashMap r1 = r7.h()
            java.lang.String r7 = r7.g()
            boolean r7 = defpackage.jx4.L(r7)
            if (r7 != 0) goto L6d
            java.lang.String r7 = "ttwid"
            java.lang.Object r7 = r1.get(r7)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            if (r7 == 0) goto L6d
            boolean r7 = defpackage.jx4.L(r7)
            if (r7 == 0) goto L5d
            goto L6d
        L5d:
            java.lang.String r7 = "s_v_web_id"
            java.lang.Object r7 = r1.get(r7)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            if (r7 == 0) goto L6d
            boolean r7 = defpackage.jx4.L(r7)
            if (r7 == 0) goto L83
        L6d:
            r6.f = r4
            r0.K = r4
            os0 r7 = defpackage.sx0.a
            ur0 r7 = defpackage.ur0.I
            r r1 = new r
            r4 = 16
            r1.<init>(r6, r3, r4)
            java.lang.Object r7 = defpackage.p70.D0(r7, r1, r0)
            if (r7 != r5) goto L83
            goto L8b
        L83:
            r0.K = r2
            java.lang.Object r6 = r6.o(r0)
            if (r6 != r5) goto L8c
        L8b:
            return r5
        L8c:
            wd5 r6 = defpackage.wd5.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.l(gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d3, code lost:
    
        if (r15 != r12) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l0(java.lang.String r14, defpackage.gj0 r15) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.l0(java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:29|30))(4:31|32|33|(1:35))|12|13|(1:15)|16|(4:20|(1:22)|23|24)(2:26|27)))|38|6|7|(0)(0)|12|13|(0)|16|(5:18|20|(0)|23|24)|26|27) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0028, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004b, code lost:
    
        r8 = new defpackage.g54(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.lang.String r6, java.lang.String r7, defpackage.gj0 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.dz0
            if (r0 == 0) goto L13
            r0 = r8
            dz0 r0 = (defpackage.dz0) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.L = r1
            goto L18
        L13:
            dz0 r0 = new dz0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.J
            int r1 = r0.L
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            if (r1 != r2) goto L2a
            java.lang.String r7 = r0.I
            defpackage.mu0.V(r8)     // Catch: java.lang.Throwable -> L28
            goto L48
        L28:
            r5 = move-exception
            goto L4b
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r5)
            return r3
        L30:
            defpackage.mu0.V(r8)
            os0 r8 = defpackage.sx0.a     // Catch: java.lang.Throwable -> L28
            ez0 r1 = new ez0     // Catch: java.lang.Throwable -> L28
            r4 = 0
            r1.<init>(r5, r6, r3, r4)     // Catch: java.lang.Throwable -> L28
            r0.I = r7     // Catch: java.lang.Throwable -> L28
            r0.L = r2     // Catch: java.lang.Throwable -> L28
            java.lang.Object r8 = defpackage.p70.D0(r8, r1, r0)     // Catch: java.lang.Throwable -> L28
            el0 r5 = defpackage.el0.I
            if (r8 != r5) goto L48
            return r5
        L48:
            com.github.mytv.dv.model.InteractionMutationResponse r8 = (com.github.mytv.dv.model.InteractionMutationResponse) r8     // Catch: java.lang.Throwable -> L28
            goto L50
        L4b:
            g54 r8 = new g54
            r8.<init>(r5)
        L50:
            boolean r5 = r8 instanceof defpackage.g54
            if (r5 == 0) goto L55
            r8 = r3
        L55:
            com.github.mytv.dv.model.InteractionMutationResponse r8 = (com.github.mytv.dv.model.InteractionMutationResponse) r8
            if (r8 != 0) goto L5a
            goto L74
        L5a:
            int r5 = r8.getStatusCode()
            if (r5 == 0) goto L74
            java.lang.String r5 = r8.getStatusMsg()
            boolean r6 = defpackage.jx4.L(r5)
            if (r6 == 0) goto L70
            java.lang.String r5 = "失败"
            java.lang.String r5 = defpackage.r7.B(r7, r5)
        L70:
            defpackage.zy.i(r5)
            return r3
        L74:
            wd5 r5 = defpackage.wd5.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.m(java.lang.String, java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b9, code lost:
    
        if (r1 != r9) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m0(long r15, int r17, int r18, defpackage.gj0 r19) {
        /*
            r14 = this;
            r1 = r19
            boolean r2 = r1 instanceof defpackage.z01
            if (r2 == 0) goto L16
            r2 = r1
            z01 r2 = (defpackage.z01) r2
            int r3 = r2.O
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.O = r3
        L14:
            r5 = r2
            goto L1c
        L16:
            z01 r2 = new z01
            r2.<init>(r14, r1)
            goto L14
        L1c:
            java.lang.Object r1 = r5.M
            int r2 = r5.O
            r7 = 2
            r3 = 1
            r8 = 0
            el0 r9 = defpackage.el0.I
            if (r2 == 0) goto L45
            if (r2 == r3) goto L36
            if (r2 != r7) goto L30
            defpackage.mu0.V(r1)     // Catch: java.lang.Throwable -> Lbf
            goto Lbc
        L30:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r0)
            return r8
        L36:
            int r0 = r5.K
            byte r2 = r5.J
            long r3 = r5.I
            n11 r6 = r5.L
            defpackage.mu0.V(r1)     // Catch: java.lang.Throwable -> Lbf
            r13 = r0
            r12 = r2
            r10 = r3
            goto La0
        L45:
            defpackage.mu0.V(r1)
            zy0 r1 = defpackage.n11.Companion     // Catch: java.lang.Throwable -> Lbf
            r1.getClass()     // Catch: java.lang.Throwable -> Lbf
            java.util.LinkedHashMap r2 = defpackage.zy0.a()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r1 = "count"
            java.lang.String r4 = java.lang.String.valueOf(r17)     // Catch: java.lang.Throwable -> Lbf
            r2.put(r1, r4)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r1 = "max_cursor"
            java.lang.String r4 = java.lang.String.valueOf(r15)     // Catch: java.lang.Throwable -> Lbf
            r2.put(r1, r4)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r1 = "directory"
            r4 = 0
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> Lbf
            r2.put(r1, r6)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r1 = "category"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> Lbf
            r2.put(r1, r4)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r1 = "status"
            java.lang.String r4 = java.lang.String.valueOf(r18)     // Catch: java.lang.Throwable -> Lbf
            r2.put(r1, r4)     // Catch: java.lang.Throwable -> Lbf
            r14.D0(r2)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r1 = "/aweme/v1/web/history/read/"
            r5.L = r14     // Catch: java.lang.Throwable -> Lbf
            r10 = r15
            r5.I = r10     // Catch: java.lang.Throwable -> Lbf
            r12 = r17
            r5.J = r12     // Catch: java.lang.Throwable -> Lbf
            r13 = r18
            r5.K = r13     // Catch: java.lang.Throwable -> Lbf
            r5.O = r3     // Catch: java.lang.Throwable -> Lbf
            r3 = 0
            r4 = 0
            r6 = 252(0xfc, float:3.53E-43)
            r0 = r14
            java.lang.Object r1 = r(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lbf
            if (r1 != r9) goto L9f
            goto Lbb
        L9f:
            r6 = r14
        La0:
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lbf
            os0 r0 = defpackage.sx0.a     // Catch: java.lang.Throwable -> Lbf
            ez0 r2 = new ez0     // Catch: java.lang.Throwable -> Lbf
            r3 = 26
            r2.<init>(r6, r1, r8, r3)     // Catch: java.lang.Throwable -> Lbf
            r5.L = r8     // Catch: java.lang.Throwable -> Lbf
            r5.I = r10     // Catch: java.lang.Throwable -> Lbf
            r5.J = r12     // Catch: java.lang.Throwable -> Lbf
            r5.K = r13     // Catch: java.lang.Throwable -> Lbf
            r5.O = r7     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r1 = defpackage.p70.D0(r0, r2, r5)     // Catch: java.lang.Throwable -> Lbf
            if (r1 != r9) goto Lbc
        Lbb:
            return r9
        Lbc:
            com.github.mytv.dv.model.UserWorksResponse r1 = (com.github.mytv.dv.model.UserWorksResponse) r1     // Catch: java.lang.Throwable -> Lbf
            return r1
        Lbf:
            r0 = move-exception
            g54 r1 = new g54
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.m0(long, int, int, gj0):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:29|30))(4:31|32|33|(1:35))|12|13|(1:15)|16|(4:20|(1:22)|23|24)(2:26|27)))|38|6|7|(0)(0)|12|13|(0)|16|(5:18|20|(0)|23|24)|26|27) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0028, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004b, code lost:
    
        r8 = new defpackage.g54(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.String r6, java.lang.String r7, defpackage.gj0 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.fz0
            if (r0 == 0) goto L13
            r0 = r8
            fz0 r0 = (defpackage.fz0) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.L = r1
            goto L18
        L13:
            fz0 r0 = new fz0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.J
            int r1 = r0.L
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            if (r1 != r2) goto L2a
            java.lang.String r7 = r0.I
            defpackage.mu0.V(r8)     // Catch: java.lang.Throwable -> L28
            goto L48
        L28:
            r5 = move-exception
            goto L4b
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r5)
            return r3
        L30:
            defpackage.mu0.V(r8)
            os0 r8 = defpackage.sx0.a     // Catch: java.lang.Throwable -> L28
            gz0 r1 = new gz0     // Catch: java.lang.Throwable -> L28
            r4 = 0
            r1.<init>(r5, r6, r3, r4)     // Catch: java.lang.Throwable -> L28
            r0.I = r7     // Catch: java.lang.Throwable -> L28
            r0.L = r2     // Catch: java.lang.Throwable -> L28
            java.lang.Object r8 = defpackage.p70.D0(r8, r1, r0)     // Catch: java.lang.Throwable -> L28
            el0 r5 = defpackage.el0.I
            if (r8 != r5) goto L48
            return r5
        L48:
            com.github.mytv.dv.model.ApiStatusResponse r8 = (com.github.mytv.dv.model.ApiStatusResponse) r8     // Catch: java.lang.Throwable -> L28
            goto L50
        L4b:
            g54 r8 = new g54
            r8.<init>(r5)
        L50:
            boolean r5 = r8 instanceof defpackage.g54
            if (r5 == 0) goto L55
            r8 = r3
        L55:
            com.github.mytv.dv.model.ApiStatusResponse r8 = (com.github.mytv.dv.model.ApiStatusResponse) r8
            if (r8 != 0) goto L5a
            goto L74
        L5a:
            int r5 = r8.getStatusCode()
            if (r5 == 0) goto L74
            java.lang.String r5 = r8.getStatusMsg()
            boolean r6 = defpackage.jx4.L(r5)
            if (r6 == 0) goto L70
            java.lang.String r5 = "失败"
            java.lang.String r5 = defpackage.r7.B(r7, r5)
        L70:
            defpackage.zy.i(r5)
            return r3
        L74:
            wd5 r5 = defpackage.wd5.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.n(java.lang.String, java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        if (r13 != r10) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n0(int r12, defpackage.gj0 r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.a11
            if (r0 == 0) goto L14
            r0 = r13
            a11 r0 = (defpackage.a11) r0
            int r1 = r0.M
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.M = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            a11 r0 = new a11
            r0.<init>(r11, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.K
            int r0 = r6.M
            r8 = 2
            r1 = 1
            r9 = 0
            el0 r10 = defpackage.el0.I
            if (r0 == 0) goto L3b
            if (r0 == r1) goto L33
            if (r0 != r8) goto L2d
            defpackage.mu0.V(r13)     // Catch: java.lang.Throwable -> L96
            goto L93
        L2d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r11)
            return r9
        L33:
            int r12 = r6.I
            n11 r11 = r6.J
            defpackage.mu0.V(r13)     // Catch: java.lang.Throwable -> L96
            goto L7b
        L3b:
            defpackage.mu0.V(r13)
            zy0 r13 = defpackage.n11.Companion     // Catch: java.lang.Throwable -> L96
            r13.getClass()     // Catch: java.lang.Throwable -> L96
            java.util.LinkedHashMap r3 = defpackage.zy0.a()     // Catch: java.lang.Throwable -> L96
            java.lang.String r13 = "offset"
            java.lang.String r0 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L96
            r3.put(r13, r0)     // Catch: java.lang.Throwable -> L96
            java.lang.String r13 = "list_type"
            r0 = 0
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L96
            r3.put(r13, r2)     // Catch: java.lang.Throwable -> L96
            java.lang.String r13 = "operate_type"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L96
            r3.put(r13, r0)     // Catch: java.lang.Throwable -> L96
            r11.D0(r3)     // Catch: java.lang.Throwable -> L96
            java.lang.String r2 = "/aweme/v1/web/watchlater/list/"
            r6.J = r11     // Catch: java.lang.Throwable -> L96
            r6.I = r12     // Catch: java.lang.Throwable -> L96
            r6.M = r1     // Catch: java.lang.Throwable -> L96
            r4 = 0
            r5 = 0
            r7 = 252(0xfc, float:3.53E-43)
            r1 = r11
            java.lang.Object r13 = r(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L96
            if (r13 != r10) goto L7a
            goto L92
        L7a:
            r11 = r1
        L7b:
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L96
            os0 r0 = defpackage.sx0.a     // Catch: java.lang.Throwable -> L96
            ez0 r1 = new ez0     // Catch: java.lang.Throwable -> L96
            r2 = 27
            r1.<init>(r11, r13, r9, r2)     // Catch: java.lang.Throwable -> L96
            r6.J = r9     // Catch: java.lang.Throwable -> L96
            r6.I = r12     // Catch: java.lang.Throwable -> L96
            r6.M = r8     // Catch: java.lang.Throwable -> L96
            java.lang.Object r13 = defpackage.p70.D0(r0, r1, r6)     // Catch: java.lang.Throwable -> L96
            if (r13 != r10) goto L93
        L92:
            return r10
        L93:
            com.github.mytv.dv.model.UserWorksResponse r13 = (com.github.mytv.dv.model.UserWorksResponse) r13     // Catch: java.lang.Throwable -> L96
            return r13
        L96:
            r0 = move-exception
            r11 = r0
            g54 r12 = new g54
            r12.<init>(r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.n0(int, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.gj0 r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.hz0
            if (r0 == 0) goto L13
            r0 = r12
            hz0 r0 = (defpackage.hz0) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            hz0 r0 = new hz0
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.I
            int r1 = r0.K
            r2 = 0
            r3 = 1
            wd5 r4 = defpackage.wd5.a
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            defpackage.mu0.V(r12)
            return r4
        L28:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r11)
            return r2
        L2e:
            defpackage.mu0.V(r12)
            fl4 r12 = r11.a
            java.util.LinkedHashMap r12 = r12.h()
            java.lang.String r1 = "UIFID"
            java.lang.Object r1 = r12.get(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L47
            boolean r1 = defpackage.jx4.L(r1)
            if (r1 == 0) goto L7d
        L47:
            java.lang.String r1 = "UIFID_TEMP"
            java.lang.Object r12 = r12.get(r1)
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            if (r12 == 0) goto L57
            boolean r12 = defpackage.jx4.L(r12)
            if (r12 == 0) goto L7d
        L57:
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r11.g
            long r7 = r5 - r7
            r9 = 60000(0xea60, double:2.9644E-319)
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 >= 0) goto L67
            goto L7d
        L67:
            r11.g = r5
            os0 r12 = defpackage.sx0.a
            ur0 r12 = defpackage.ur0.I
            zg0 r1 = new zg0
            r1.<init>(r11, r2, r3)
            r0.K = r3
            java.lang.Object r11 = defpackage.p70.D0(r12, r1, r0)
            el0 r12 = defpackage.el0.I
            if (r11 != r12) goto L7d
            return r12
        L7d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.o(gj0):java.lang.Object");
    }

    public final void o0(Response response) {
        if (j42.c(response.request().url().host(), "www.douyin.com")) {
            String str = !jx4.L(this.a.l().e) ? "hmac" : "ecdsa";
            String header$default = Response.header$default(response, "bd-ticket-guard-key-sign-result", null, 2, null);
            String header$default2 = Response.header$default(response, "bd-ticket-guard-sign-res-static-ts-sign", null, 2, null);
            String header$default3 = Response.header$default(response, "bd-ticket-guard-sign-res-static-sign", null, 2, null);
            StringBuilder F = r7.F("ticket-guard verdicts: algo=", str, ", key-sign-result=", header$default, ", ts-sign=");
            F.append(header$default2);
            F.append(", sign=");
            F.append(header$default3);
            Log.d("DouyinDirectApi", F.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        if (r14 != r11) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.String r13, defpackage.gj0 r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.iz0
            if (r0 == 0) goto L14
            r0 = r14
            iz0 r0 = (defpackage.iz0) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.L = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            iz0 r0 = new iz0
            r0.<init>(r12, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.J
            int r0 = r6.L
            r8 = 2
            r9 = 1
            r10 = 0
            el0 r11 = defpackage.el0.I
            if (r0 == 0) goto L39
            if (r0 == r9) goto L33
            if (r0 != r8) goto L2d
            defpackage.mu0.V(r14)     // Catch: java.lang.Throwable -> L7b
            goto L70
        L2d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r12)
            return r10
        L33:
            n11 r12 = r6.I
            defpackage.mu0.V(r14)     // Catch: java.lang.Throwable -> L7b
            goto L5c
        L39:
            defpackage.mu0.V(r14)
            boolean r14 = defpackage.jx4.L(r13)     // Catch: java.lang.Throwable -> L7b
            if (r14 != 0) goto L73
            java.util.LinkedHashMap r3 = defpackage.k04.p(r13)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = "/webcast/room/web/enter/"
            java.lang.String r4 = defpackage.k04.v(r13)     // Catch: java.lang.Throwable -> L7b
            r6.I = r12     // Catch: java.lang.Throwable -> L7b
            r6.L = r9     // Catch: java.lang.Throwable -> L7b
            r5 = 1
            r7 = 208(0xd0, float:2.91E-43)
            r1 = r12
            java.lang.Object r14 = r(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L7b
            if (r14 != r11) goto L5b
            goto L6f
        L5b:
            r12 = r1
        L5c:
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> L7b
            os0 r13 = defpackage.sx0.a     // Catch: java.lang.Throwable -> L7b
            ez0 r0 = new ez0     // Catch: java.lang.Throwable -> L7b
            r0.<init>(r12, r14, r10, r9)     // Catch: java.lang.Throwable -> L7b
            r6.I = r10     // Catch: java.lang.Throwable -> L7b
            r6.L = r8     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r14 = defpackage.p70.D0(r13, r0, r6)     // Catch: java.lang.Throwable -> L7b
            if (r14 != r11) goto L70
        L6f:
            return r11
        L70:
            com.github.mytv.dv.model.LiveRoomEnterResponse r14 = (com.github.mytv.dv.model.LiveRoomEnterResponse) r14     // Catch: java.lang.Throwable -> L7b
            return r14
        L73:
            java.lang.String r12 = "webRid 不能为空"
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L7b
            r13.<init>(r12)     // Catch: java.lang.Throwable -> L7b
            throw r13     // Catch: java.lang.Throwable -> L7b
        L7b:
            r0 = move-exception
            r12 = r0
            g54 r13 = new g54
            r13.<init>(r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.p(java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.String r17, java.util.Map r18, java.lang.String r19, java.lang.String r20, boolean r21, boolean r22, boolean r23, defpackage.gj0 r24) {
        /*
            Method dump skipped, instructions count: 182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.q(java.lang.String, java.util.Map, java.lang.String, java.lang.String, boolean, boolean, boolean, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String q0() {
        /*
            r9 = this;
            fl4 r9 = r9.a
            java.lang.String r9 = r9.q()
            boolean r0 = defpackage.jx4.L(r9)
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L23
            r0 = r1
        Lf:
            int r3 = r9.length()
            if (r0 >= r3) goto L24
            char r3 = r9.charAt(r0)
            boolean r3 = java.lang.Character.isDigit(r3)
            if (r3 != 0) goto L20
            goto L23
        L20:
            int r0 = r0 + 1
            goto Lf
        L23:
            r9 = r2
        L24:
            if (r9 != 0) goto L27
            return r2
        L27:
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            java.nio.charset.Charset r2 = defpackage.z50.a
            byte[] r9 = r9.getBytes(r2)
            r9.getClass()
            byte[] r9 = r0.digest(r9)
            r9.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = ""
            r0.append(r2)
            int r3 = r9.length
            r4 = r1
            r5 = r4
        L4a:
            if (r4 >= r3) goto L6d
            r6 = r9[r4]
            r7 = 1
            int r5 = r5 + r7
            if (r5 <= r7) goto L55
            r0.append(r2)
        L55:
            java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r1] = r6
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r8, r7)
            java.lang.String r7 = "%02x"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            r0.append(r6)
            int r4 = r4 + 1
            goto L4a
        L6d:
            r0.append(r2)
            java.lang.String r9 = r0.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.q0():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(java.lang.String r15, java.util.Map r16, java.util.Map r17, java.lang.String r18, boolean r19, defpackage.gj0 r20) {
        /*
            r14 = this;
            r0 = r20
            boolean r1 = r0 instanceof defpackage.mz0
            if (r1 == 0) goto L16
            r1 = r0
            mz0 r1 = (defpackage.mz0) r1
            int r2 = r1.P
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r2 & r4
            if (r5 == 0) goto L16
            int r2 = r2 - r4
            r1.P = r2
        L14:
            r9 = r1
            goto L1c
        L16:
            mz0 r1 = new mz0
            r1.<init>(r14, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r9.N
            int r1 = r9.P
            r10 = 2
            r2 = 1
            r11 = 0
            el0 r12 = defpackage.el0.I
            if (r1 == 0) goto L49
            if (r1 == r2) goto L35
            if (r1 != r10) goto L2f
            defpackage.mu0.V(r0)
            return r0
        L2f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r0)
            return r11
        L35:
            boolean r1 = r9.M
            java.lang.String r2 = r9.L
            java.util.Map r4 = r9.K
            java.util.Map r5 = r9.J
            java.lang.String r6 = r9.I
            defpackage.mu0.V(r0)
            r7 = r4
            r4 = r2
            r2 = r7
            r7 = r1
            r1 = r5
            r5 = r6
            goto L6b
        L49:
            defpackage.mu0.V(r0)
            r9.I = r15
            r1 = r16
            r9.J = r1
            r4 = r17
            r9.K = r4
            r5 = r18
            r9.L = r5
            r6 = r19
            r9.M = r6
            r9.P = r2
            java.lang.Object r2 = r14.l(r9)
            if (r2 != r12) goto L67
            goto L89
        L67:
            r2 = r4
            r4 = r5
            r7 = r6
            r5 = r15
        L6b:
            os0 r0 = defpackage.sx0.a
            ur0 r13 = defpackage.ur0.I
            nz0 r0 = new nz0
            r8 = 0
            r6 = 0
            r3 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.I = r11
            r9.J = r11
            r9.K = r11
            r9.L = r11
            r9.M = r7
            r9.P = r10
            java.lang.Object r0 = defpackage.p70.D0(r13, r0, r9)
            if (r0 != r12) goto L8a
        L89:
            return r12
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.s(java.lang.String, java.util.Map, java.util.Map, java.lang.String, boolean, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s0(int r8, defpackage.gj0 r9, java.lang.String r10) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.c11
            if (r0 == 0) goto L14
            r0 = r9
            c11 r0 = (defpackage.c11) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.K = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            c11 r0 = new c11
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r5.I
            int r0 = r5.K
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L27
            defpackage.mu0.V(r9)     // Catch: java.lang.Throwable -> L86
            goto L83
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r7)
            r7 = 0
            return r7
        L2e:
            defpackage.mu0.V(r9)
            zy0 r9 = defpackage.n11.Companion     // Catch: java.lang.Throwable -> L86
            r9.getClass()     // Catch: java.lang.Throwable -> L86
            java.util.LinkedHashMap r3 = defpackage.zy0.a()     // Catch: java.lang.Throwable -> L86
            r7.D0(r3)     // Catch: java.lang.Throwable -> L86
            java.lang.String r9 = "aweme_type"
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L86
            uj3 r0 = new uj3     // Catch: java.lang.Throwable -> L86
            r0.<init>(r9, r8)     // Catch: java.lang.Throwable -> L86
            java.lang.String r8 = "item_id"
            uj3 r9 = new uj3     // Catch: java.lang.Throwable -> L86
            r9.<init>(r8, r10)     // Catch: java.lang.Throwable -> L86
            java.lang.String r8 = "play_delta"
            java.lang.String r10 = "1"
            uj3 r2 = new uj3     // Catch: java.lang.Throwable -> L86
            r2.<init>(r8, r10)     // Catch: java.lang.Throwable -> L86
            java.lang.String r8 = "source"
            java.lang.String r10 = "0"
            uj3 r4 = new uj3     // Catch: java.lang.Throwable -> L86
            r4.<init>(r8, r10)     // Catch: java.lang.Throwable -> L86
            r8 = 4
            uj3[] r8 = new defpackage.uj3[r8]     // Catch: java.lang.Throwable -> L86
            r10 = 0
            r8[r10] = r0     // Catch: java.lang.Throwable -> L86
            r8[r1] = r9     // Catch: java.lang.Throwable -> L86
            r9 = 2
            r8[r9] = r2     // Catch: java.lang.Throwable -> L86
            r9 = 3
            r8[r9] = r4     // Catch: java.lang.Throwable -> L86
            java.util.Map r4 = defpackage.sv2.K(r8)     // Catch: java.lang.Throwable -> L86
            java.lang.String r2 = "/aweme/v2/web/aweme/stats/"
            r5.K = r1     // Catch: java.lang.Throwable -> L86
            r6 = 56
            r1 = r7
            java.lang.Object r7 = t(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L86
            el0 r8 = defpackage.el0.I
            if (r7 != r8) goto L83
            return r8
        L83:
            wd5 r7 = defpackage.wd5.a     // Catch: java.lang.Throwable -> L86
            return r7
        L86:
            r0 = move-exception
            r7 = r0
            g54 r8 = new g54
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.s0(int, gj0, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        if (r11.n((java.lang.String) r13, "合集观看记录", r6) != r10) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t0(int r12, defpackage.gj0 r13, java.lang.String r14, java.lang.String r15) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.d11
            if (r0 == 0) goto L14
            r0 = r13
            d11 r0 = (defpackage.d11) r0
            int r1 = r0.M
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.M = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            d11 r0 = new d11
            r0.<init>(r11, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.K
            int r0 = r6.M
            r8 = 2
            r1 = 1
            r9 = 0
            el0 r10 = defpackage.el0.I
            if (r0 == 0) goto L3b
            if (r0 == r1) goto L33
            if (r0 != r8) goto L2d
            defpackage.mu0.V(r13)     // Catch: java.lang.Throwable -> L8d
            goto L8a
        L2d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r11)
            return r9
        L33:
            int r12 = r6.J
            n11 r11 = r6.I
            defpackage.mu0.V(r13)     // Catch: java.lang.Throwable -> L8d
            goto L79
        L3b:
            defpackage.mu0.V(r13)
            zy0 r13 = defpackage.n11.Companion     // Catch: java.lang.Throwable -> L8d
            r13.getClass()     // Catch: java.lang.Throwable -> L8d
            java.util.LinkedHashMap r3 = defpackage.zy0.a()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r13 = "mix_id"
            r3.put(r13, r14)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r13 = "episode"
            java.lang.String r14 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L8d
            r3.put(r13, r14)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r13 = "item_id"
            r3.put(r13, r15)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r13 = "scene"
            java.lang.String r14 = "pc_web"
            r3.put(r13, r14)     // Catch: java.lang.Throwable -> L8d
            r11.D0(r3)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r2 = "/aweme/v1/web/mix/watch/record/"
            r6.I = r11     // Catch: java.lang.Throwable -> L8d
            r6.J = r12     // Catch: java.lang.Throwable -> L8d
            r6.M = r1     // Catch: java.lang.Throwable -> L8d
            r4 = 0
            r5 = 0
            r7 = 252(0xfc, float:3.53E-43)
            r1 = r11
            java.lang.Object r13 = r(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L8d
            if (r13 != r10) goto L78
            goto L89
        L78:
            r11 = r1
        L79:
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L8d
            java.lang.String r14 = "合集观看记录"
            r6.I = r9     // Catch: java.lang.Throwable -> L8d
            r6.J = r12     // Catch: java.lang.Throwable -> L8d
            r6.M = r8     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r11 = r11.n(r13, r14, r6)     // Catch: java.lang.Throwable -> L8d
            if (r11 != r10) goto L8a
        L89:
            return r10
        L8a:
            wd5 r11 = defpackage.wd5.a     // Catch: java.lang.Throwable -> L8d
            return r11
        L8d:
            r0 = move-exception
            r11 = r0
            g54 r12 = new g54
            r12.<init>(r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.t0(int, gj0, java.lang.String, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(defpackage.gj0 r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.util.LinkedHashMap r21) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.u(gj0, java.lang.String, java.lang.String, java.lang.String, java.util.LinkedHashMap):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a2 A[Catch: all -> 0x0104, TryCatch #0 {all -> 0x0104, blocks: (B:13:0x0033, B:14:0x009a, B:16:0x00a2, B:18:0x00a8, B:19:0x00aa, B:20:0x00b3, B:22:0x00b9, B:24:0x00c5, B:27:0x00cd, B:33:0x00d1, B:36:0x00d9, B:38:0x00df, B:40:0x00e5, B:46:0x00f0, B:50:0x00f6, B:51:0x0103, B:55:0x0046, B:56:0x007c, B:64:0x0056), top: B:8:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f6 A[Catch: all -> 0x0104, TryCatch #0 {all -> 0x0104, blocks: (B:13:0x0033, B:14:0x009a, B:16:0x00a2, B:18:0x00a8, B:19:0x00aa, B:20:0x00b3, B:22:0x00b9, B:24:0x00c5, B:27:0x00cd, B:33:0x00d1, B:36:0x00d9, B:38:0x00df, B:40:0x00e5, B:46:0x00f0, B:50:0x00f6, B:51:0x0103, B:55:0x0046, B:56:0x007c, B:64:0x0056), top: B:8:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u0(int r15, defpackage.gj0 r16, java.lang.String r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.u0(int, gj0, java.lang.String, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.String r17, java.util.LinkedHashMap r18, java.util.Map r19, java.lang.String r20, java.lang.String r21, boolean r22, boolean r23, defpackage.gj0 r24) {
        /*
            r16 = this;
            r3 = r16
            r0 = r24
            boolean r1 = r0 instanceof defpackage.qz0
            if (r1 == 0) goto L18
            r1 = r0
            qz0 r1 = (defpackage.qz0) r1
            int r2 = r1.R
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r2 & r4
            if (r5 == 0) goto L18
            int r2 = r2 - r4
            r1.R = r2
        L16:
            r10 = r1
            goto L1e
        L18:
            qz0 r1 = new qz0
            r1.<init>(r3, r0)
            goto L16
        L1e:
            java.lang.Object r0 = r10.P
            int r1 = r10.R
            r11 = 2
            r2 = 1
            r12 = 0
            el0 r13 = defpackage.el0.I
            if (r1 == 0) goto L51
            if (r1 == r2) goto L37
            if (r1 != r11) goto L31
            defpackage.mu0.V(r0)
            return r0
        L31:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r0)
            return r12
        L37:
            boolean r1 = r10.O
            boolean r2 = r10.N
            java.lang.String r4 = r10.M
            java.lang.String r5 = r10.L
            java.util.Map r6 = r10.K
            java.util.LinkedHashMap r7 = r10.J
            java.lang.String r8 = r10.I
            defpackage.mu0.V(r0)
            r14 = r7
            r7 = r1
            r1 = r14
            r14 = r2
            r2 = r6
            r6 = r4
            r4 = r5
            r5 = r8
            goto L7e
        L51:
            defpackage.mu0.V(r0)
            r0 = r17
            r10.I = r0
            r1 = r18
            r10.J = r1
            r4 = r19
            r10.K = r4
            r5 = r20
            r10.L = r5
            r6 = r21
            r10.M = r6
            r7 = r22
            r10.N = r7
            r8 = r23
            r10.O = r8
            r10.R = r2
            java.lang.Object r2 = r3.l(r10)
            if (r2 != r13) goto L79
            goto Lb3
        L79:
            r2 = r4
            r4 = r5
            r14 = r7
            r7 = r8
            r5 = r0
        L7e:
            fl4 r0 = r3.a
            d32 r8 = r0.l()
            if (r14 == 0) goto L93
            boolean r0 = r8.a()
            if (r0 == 0) goto L8d
            goto L93
        L8d:
            java.lang.String r0 = "请先在设置中补充互动安全凭据"
            defpackage.zy.i(r0)
            return r12
        L93:
            os0 r0 = defpackage.sx0.a
            ur0 r15 = defpackage.ur0.I
            rz0 r0 = new rz0
            r9 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.I = r12
            r10.J = r12
            r10.K = r12
            r10.L = r12
            r10.M = r12
            r10.N = r14
            r10.O = r7
            r10.R = r11
            java.lang.Object r0 = defpackage.p70.D0(r15, r0, r10)
            if (r0 != r13) goto Lb4
        Lb3:
            return r13
        Lb4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.v(java.lang.String, java.util.LinkedHashMap, java.util.Map, java.lang.String, java.lang.String, boolean, boolean, gj0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0096 A[Catch: all -> 0x00f4, TryCatch #0 {all -> 0x00f4, blocks: (B:12:0x0029, B:13:0x008e, B:15:0x0096, B:17:0x009c, B:18:0x00ab, B:20:0x00b1, B:22:0x00c1, B:25:0x00c9, B:27:0x00cf, B:29:0x00d5, B:35:0x00e0, B:39:0x00bf, B:40:0x00e6, B:41:0x00f3, B:45:0x003c, B:47:0x0073, B:52:0x0049), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e6 A[Catch: all -> 0x00f4, TryCatch #0 {all -> 0x00f4, blocks: (B:12:0x0029, B:13:0x008e, B:15:0x0096, B:17:0x009c, B:18:0x00ab, B:20:0x00b1, B:22:0x00c1, B:25:0x00c9, B:27:0x00cf, B:29:0x00d5, B:35:0x00e0, B:39:0x00bf, B:40:0x00e6, B:41:0x00f3, B:45:0x003c, B:47:0x0073, B:52:0x0049), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r10v0, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [o91] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v0(java.lang.String r8, int r9, int r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, defpackage.gj0 r14) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.v0(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a5, code lost:
    
        if (r1 != r14) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w0(java.lang.String r17, int r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, defpackage.gj0 r23) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.w0(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b0, code lost:
    
        if (r12.m((java.lang.String) r14, "不感兴趣", r7) != r11) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x0(java.lang.String r13, defpackage.gj0 r14) {
        /*
            r12 = this;
            java.lang.String r0 = "aweme_id"
            java.lang.String r1 = "uifid"
            boolean r2 = r14 instanceof defpackage.i11
            if (r2 == 0) goto L18
            r2 = r14
            i11 r2 = (defpackage.i11) r2
            int r3 = r2.L
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.L = r3
        L16:
            r7 = r2
            goto L1e
        L18:
            i11 r2 = new i11
            r2.<init>(r12, r14)
            goto L16
        L1e:
            java.lang.Object r14 = r7.J
            int r2 = r7.L
            r9 = 2
            r3 = 1
            r10 = 0
            el0 r11 = defpackage.el0.I
            if (r2 == 0) goto L3e
            if (r2 == r3) goto L38
            if (r2 != r9) goto L32
            defpackage.mu0.V(r14)     // Catch: java.lang.Throwable -> Lb6
            goto Lb3
        L32:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r12)
            return r10
        L38:
            n11 r12 = r7.I
            defpackage.mu0.V(r14)     // Catch: java.lang.Throwable -> Lb6
            goto La4
        L3e:
            defpackage.mu0.V(r14)
            zy0 r14 = defpackage.n11.Companion     // Catch: java.lang.Throwable -> Lb6
            r14.getClass()     // Catch: java.lang.Throwable -> Lb6
            java.util.LinkedHashMap r5 = defpackage.zy0.a()     // Catch: java.lang.Throwable -> Lb6
            r12.D0(r5)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r14 = r12.q0()     // Catch: java.lang.Throwable -> Lb6
            if (r14 == 0) goto L5b
            java.lang.String r2 = "uid"
            java.lang.Object r14 = r5.put(r2, r14)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> Lb6
        L5b:
            java.lang.Object r14 = r5.get(r1)     // Catch: java.lang.Throwable -> Lb6
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14     // Catch: java.lang.Throwable -> Lb6
            if (r14 == 0) goto L69
            boolean r14 = defpackage.jx4.L(r14)     // Catch: java.lang.Throwable -> Lb6
            if (r14 == 0) goto L89
        L69:
            fl4 r14 = r12.a     // Catch: java.lang.Throwable -> Lb6
            java.util.LinkedHashMap r14 = r14.h()     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r2 = "UIFID_TEMP"
            java.lang.Object r14 = r14.get(r2)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> Lb6
            if (r14 == 0) goto L89
            boolean r2 = defpackage.jx4.L(r14)     // Catch: java.lang.Throwable -> Lb6
            if (r2 != 0) goto L80
            goto L81
        L80:
            r14 = r10
        L81:
            if (r14 == 0) goto L89
            java.lang.Object r14 = r5.put(r1, r14)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> Lb6
        L89:
            r5.put(r0, r13)     // Catch: java.lang.Throwable -> Lb6
            java.util.Map r6 = java.util.Collections.singletonMap(r0, r13)     // Catch: java.lang.Throwable -> Lb6
            r6.getClass()     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r4 = "/aweme/v1/web/commit/dislike/item/"
            r7.I = r12     // Catch: java.lang.Throwable -> Lb6
            r7.L = r3     // Catch: java.lang.Throwable -> Lb6
            r8 = 8
            r3 = r12
            java.lang.Object r14 = w(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lb6
            if (r14 != r11) goto La3
            goto Lb2
        La3:
            r12 = r3
        La4:
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r13 = "不感兴趣"
            r7.I = r10     // Catch: java.lang.Throwable -> Lb6
            r7.L = r9     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object r12 = r12.m(r14, r13, r7)     // Catch: java.lang.Throwable -> Lb6
            if (r12 != r11) goto Lb3
        Lb2:
            return r11
        Lb3:
            wd5 r12 = defpackage.wd5.a     // Catch: java.lang.Throwable -> Lb6
            return r12
        Lb6:
            r0 = move-exception
            r12 = r0
            g54 r13 = new g54
            r13.<init>(r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.x0(java.lang.String, gj0):java.lang.Object");
    }

    public final void y(String str, LinkedHashMap linkedHashMap) {
        String str2;
        String str3;
        String str4;
        String str5;
        CharSequence charSequence;
        if (!linkedHashMap.containsKey("msToken") || (charSequence = (CharSequence) linkedHashMap.get("msToken")) == null || jx4.L(charSequence)) {
            Pattern compile = Pattern.compile("\"msToken\"\\s*:\\s*\"([^\"]+)\"");
            compile.getClass();
            Matcher matcher = compile.matcher(str);
            matcher.getClass();
            zv2 r = rt0.r(matcher, 0, str);
            if (r != null && (str2 = (String) o70.V0(1, r.a())) != null) {
                linkedHashMap.put("msToken", str2);
            }
        }
        if (!linkedHashMap.containsKey("odin_tt")) {
            Pattern compile2 = Pattern.compile("\"odin_tt\"\\s*:\\s*\"([^\"]+)\"");
            compile2.getClass();
            Matcher matcher2 = compile2.matcher(str);
            matcher2.getClass();
            zv2 r2 = rt0.r(matcher2, 0, str);
            if (r2 != null && (str5 = (String) o70.V0(1, r2.a())) != null) {
                linkedHashMap.put("odin_tt", str5);
            }
        }
        fl4 fl4Var = this.a;
        if (jx4.L(fl4Var.r())) {
            Pattern compile3 = Pattern.compile("\\\\\"user_unique_id\\\\\":\\\\\"(\\d+)\\\\\"");
            compile3.getClass();
            Matcher matcher3 = compile3.matcher(str);
            matcher3.getClass();
            zv2 r3 = rt0.r(matcher3, 0, str);
            if (r3 != null && (str4 = (String) o70.V0(1, r3.a())) != null) {
                fl4Var.J(str4);
            }
            if (jx4.L(fl4Var.r())) {
                Pattern compile4 = Pattern.compile("\"user_unique_id\"\\s*:\\s*\"(\\d+)\"");
                compile4.getClass();
                Matcher matcher4 = compile4.matcher(str);
                matcher4.getClass();
                zv2 r4 = rt0.r(matcher4, 0, str);
                if (r4 == null || (str3 = (String) o70.V0(1, r4.a())) == null) {
                    return;
                }
                fl4Var.J(str3);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d8, code lost:
    
        if (r11.m(r14, r12, r6) != r10) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y0(java.lang.String r12, boolean r13, defpackage.gj0 r14) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.y0(java.lang.String, boolean, gj0):java.lang.Object");
    }

    public final void z(LinkedHashMap linkedHashMap) {
        String str;
        try {
            Request build = new Request.Builder().url("https://www.douyin.com/?recommend=1").header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36").header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7").header("Accept-Language", "zh-CN,zh;q=0.9,en;q=0.8").header("Accept-Encoding", "identity").header("sec-fetch-site", "none").header("sec-fetch-mode", "navigate").header("sec-fetch-user", "?1").header("sec-fetch-dest", "document").header("sec-ch-ua-platform", "\"Windows\"").header("sec-ch-ua-mobile", "?0").header("sec-ch-ua", "\"Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126\"").header("Upgrade-Insecure-Requests", "1").header("Cookie", o70.Z0(linkedHashMap.entrySet(), "; ", null, null, 0, new m90((byte) 17), 30)).get().build();
            Request request = build;
            int i = 0;
            while (i < 5) {
                Response execute = this.e.newCall(request).execute();
                try {
                    Iterator<T> it = execute.headers("Set-Cookie").iterator();
                    while (it.hasNext()) {
                        uj3 r0 = r0((String) it.next());
                        if (r0 != null) {
                            linkedHashMap.put((String) r0.I, (String) r0.J);
                        }
                    }
                    int code = execute.code();
                    if (300 > code || code >= 400) {
                        ResponseBody body = execute.body();
                        if (body == null || (str = body.string()) == null) {
                            str = "";
                        }
                        y(str, linkedHashMap);
                        i = 5;
                    } else {
                        String header$default = Response.header$default(execute, "Location", null, 2, null);
                        if (header$default == null) {
                            execute.close();
                            return;
                        }
                        if (!qx4.y(header$default, "http", false)) {
                            header$default = "https://www.douyin.com" + header$default;
                        }
                        request = build.newBuilder().url(header$default).header("Cookie", o70.Z0(linkedHashMap.entrySet(), "; ", null, null, 0, new m90((byte) 10), 30)).build();
                        i++;
                    }
                    execute.close();
                } finally {
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d7, code lost:
    
        if (r12.m(r15, r13, r7) != r11) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z0(java.lang.String r13, boolean r14, defpackage.gj0 r15) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n11.z0(java.lang.String, boolean, gj0):java.lang.Object");
    }
}

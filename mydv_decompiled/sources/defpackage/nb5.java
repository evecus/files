package defpackage;

import android.net.Uri;
import android.provider.BaseColumns;
import java.util.HashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class nb5 implements BaseColumns {
    public static final Uri a = Uri.parse("content://android.media.tv/channel");

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("VIDEO_FORMAT_480I", "VIDEO_RESOLUTION_SD");
        hashMap.put("VIDEO_FORMAT_480P", "VIDEO_RESOLUTION_ED");
        hashMap.put("VIDEO_FORMAT_576I", "VIDEO_RESOLUTION_SD");
        hashMap.put("VIDEO_FORMAT_576P", "VIDEO_RESOLUTION_ED");
        hashMap.put("VIDEO_FORMAT_720P", "VIDEO_RESOLUTION_HD");
        hashMap.put("VIDEO_FORMAT_1080I", "VIDEO_RESOLUTION_HD");
        hashMap.put("VIDEO_FORMAT_1080P", "VIDEO_RESOLUTION_FHD");
        hashMap.put("VIDEO_FORMAT_2160P", "VIDEO_RESOLUTION_UHD");
        hashMap.put("VIDEO_FORMAT_4320P", "VIDEO_RESOLUTION_UHD");
    }
}

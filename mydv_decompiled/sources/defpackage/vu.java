package defpackage;

import android.content.ContentValues;
import android.os.Build;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class vu {
    public static final String[] b;
    public ContentValues a;

    static {
        int i = Build.VERSION.SDK_INT;
        String[] strArr = {"_id", "package_name", "title", "episode_title", i >= 24 ? "season_display_number" : "season_number", i >= 24 ? "episode_display_number" : "episode_number", "short_description", "long_description", "poster_art_uri", "thumbnail_uri", "audio_language", "canonical_genre", "content_rating", "video_width", "video_height", "internal_provider_data", "series_id"};
        String[] strArr2 = {"searchable", "internal_provider_flag1", "internal_provider_flag2", "internal_provider_flag3", "internal_provider_flag4"};
        String[] strArr3 = {"season_title"};
        b = i >= 26 ? (String[]) g4.u(strArr, strArr2, strArr3, new String[]{"review_rating", "review_rating_style"}) : i >= 24 ? (String[]) g4.u(strArr, strArr2, strArr3) : (String[]) g4.u(strArr, strArr2);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

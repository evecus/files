package defpackage;

import android.content.ContentValues;
import android.os.Build;
import androidx.media3.exoplayer.offline.DownloadService;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class at3 extends uu {
    static {
    }

    /* JADX WARN: Removed duplicated region for block: B:377:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.at3 a(android.database.Cursor r18) {
        /*
            Method dump skipped, instructions count: 1864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at3.a(android.database.Cursor):at3");
    }

    public final ContentValues b() {
        ContentValues contentValues = new ContentValues(this.a);
        int i = Build.VERSION.SDK_INT;
        if (i < 24) {
            contentValues.remove("season_title");
        }
        if (i < 26) {
            contentValues.remove("review_rating_style");
            contentValues.remove("review_rating");
        }
        if (i < 26) {
            contentValues.remove("internal_provider_id");
            contentValues.remove("preview_video_uri");
            contentValues.remove("last_playback_position_millis");
            contentValues.remove("duration_millis");
            contentValues.remove("intent_uri");
            contentValues.remove("transient");
            contentValues.remove("type");
            contentValues.remove("poster_art_aspect_ratio");
            contentValues.remove("poster_thumbnail_aspect_ratio");
            contentValues.remove("logo_uri");
            contentValues.remove("availability");
            contentValues.remove("starting_price");
            contentValues.remove("offer_price");
            contentValues.remove("release_date");
            contentValues.remove("item_count");
            contentValues.remove("live");
            contentValues.remove("interaction_count");
            contentValues.remove("author");
            contentValues.remove(DownloadService.KEY_CONTENT_ID);
            contentValues.remove("logo_content_description");
            contentValues.remove("genre");
            contentValues.remove("start_time_utc_millis");
            contentValues.remove("end_time_utc_millis");
            contentValues.remove("preview_audio_uri");
            contentValues.remove("tv_series_item_type");
        }
        contentValues.remove("browsable");
        if (i < 26) {
            contentValues.remove("channel_id");
            contentValues.remove("weight");
        }
        return contentValues;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof at3) {
            return this.a.equals(((at3) obj).a);
        }
        return false;
    }

    public final String toString() {
        return "PreviewProgram{" + this.a.toString() + "}";
    }
}

package defpackage;

import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import com.github.mytv.dv.model.Aweme;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class mb5 {
    public static final jb5 Companion = new jb5();
    public static final Map c = sv2.K(new uj3("mydv_recommend", "推荐"), new uj3("mydv_watch_later", "稍后再看"));
    public final Context a;
    public final o53 b = new o53();

    public mb5(Application application) {
        this.a = application.getApplicationContext();
    }

    public static at3 a(long j, int i, Aweme aweme) {
        String str;
        String awemeId = aweme.getAwemeId();
        if (jx4.L(awemeId)) {
            awemeId = null;
        }
        if (awemeId == null || ((str = (String) o70.U0(aweme.getVideo().getCover().getUrlList())) == null && (str = (String) o70.U0(aweme.getVideo().getOriginCover().getUrlList())) == null && (str = (String) o70.U0(aweme.getVideo().getDynamicCover().getUrlList())) == null)) {
            return null;
        }
        boolean z = aweme.getVideo().getHeight() > aweme.getVideo().getWidth();
        String obj = jx4.g0(aweme.getAuthor().getNickname()).toString();
        zs3 zs3Var = new zs3();
        Long valueOf = Long.valueOf(j);
        ContentValues contentValues = zs3Var.a;
        contentValues.put("channel_id", valueOf);
        contentValues.put("type", (Integer) 4);
        String desc = aweme.getDesc();
        if (jx4.L(desc)) {
            desc = "（无标题）";
        }
        contentValues.put("title", jx4.f0(60, desc));
        contentValues.put("short_description", obj.length() == 0 ? "" : "@".concat(obj));
        Uri parse = Uri.parse(str);
        contentValues.put("poster_art_uri", parse == null ? null : parse.toString());
        contentValues.put("poster_art_aspect_ratio", Integer.valueOf(z ? 4 : 0));
        contentValues.put("duration_millis", Integer.valueOf(aweme.getVideo().getDuration()));
        Uri parse2 = Uri.parse("mydv://douyin/video/".concat(awemeId));
        contentValues.put("intent_uri", parse2 != null ? parse2.toString() : null);
        contentValues.put("internal_provider_id", awemeId);
        int i2 = 30 - i;
        contentValues.put("weight", Integer.valueOf(i2 >= 1 ? i2 : 1));
        at3 at3Var = new at3();
        at3Var.a = contentValues;
        return at3Var;
    }

    public final long b(String str, boolean z) {
        Object obj;
        Context context = this.a;
        g73 g73Var = new g73((Object) context, (byte) 8);
        List k = g73Var.k();
        k.getClass();
        Iterator it = k.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (j42.c(((ys3) obj).a.getAsString("internal_provider_id"), str)) {
                break;
            }
        }
        ys3 ys3Var = (ys3) obj;
        if (ys3Var != null) {
            return ys3Var.b();
        }
        g12 g12Var = new g12((byte) 25);
        ((ContentValues) g12Var.J).put("display_name", ((CharSequence) sv2.E(str, c)).toString());
        ((ContentValues) g12Var.J).put("internal_provider_id", str);
        Uri parse = Uri.parse("mydv://douyin");
        ((ContentValues) g12Var.J).put("app_link_intent_uri", parse != null ? parse.toString() : null);
        File file = new File(context.getCacheDir(), "tv_channel_logo.png");
        if (!file.exists() || file.length() == 0) {
            Bitmap createBitmap = Bitmap.createBitmap(96, 96, Bitmap.Config.ARGB_8888);
            createBitmap.getClass();
            Canvas canvas = new Canvas(createBitmap);
            Drawable applicationIcon = context.getPackageManager().getApplicationIcon(context.getPackageName());
            applicationIcon.getClass();
            applicationIcon.setBounds(0, 0, 96, 96);
            applicationIcon.draw(canvas);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.close();
            } finally {
            }
        }
        Uri fromFile = Uri.fromFile(file);
        fromFile.getClass();
        g12Var.K = fromFile;
        ys3 k2 = g12Var.k();
        if (!z) {
            return g73Var.t(k2);
        }
        if (Build.VERSION.SDK_INT < 26) {
            return -1L;
        }
        long t = g73Var.t(k2);
        x9.v((Context) g73Var.J, t);
        return t;
    }

    public final ArrayList c(long j) {
        ArrayList arrayList = new ArrayList();
        Cursor query = this.a.getContentResolver().query(ob5.a, null, null, null, null);
        if (query == null) {
            return arrayList;
        }
        while (query.moveToNext()) {
            try {
                at3 a = at3.a(query);
                Long asLong = a.a.getAsLong("channel_id");
                if ((asLong == null ? -1L : asLong.longValue()) == j) {
                    arrayList.add(a);
                }
            } finally {
            }
        }
        query.close();
        return arrayList;
    }
}

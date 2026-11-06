package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ys3 {
    public ContentValues a;
    public volatile Bitmap b;
    public Uri c;
    public boolean d;
    public volatile boolean e;

    public static ys3 a(Cursor cursor) {
        if (!cursor.getString(2).equals("TYPE_PREVIEW")) {
            return null;
        }
        g12 g12Var = new g12((byte) 25);
        ((ContentValues) g12Var.J).put("_id", Long.valueOf(cursor.getInt(0)));
        ((ContentValues) g12Var.J).put("package_name", cursor.getString(1));
        ((ContentValues) g12Var.J).put("type", cursor.getString(2));
        ((ContentValues) g12Var.J).put("display_name", cursor.getString(3).toString());
        String string = cursor.getString(4);
        ContentValues contentValues = (ContentValues) g12Var.J;
        if (string == null) {
            contentValues.remove("description");
        } else {
            contentValues.put("description", string.toString());
        }
        Uri parse = Uri.parse(cursor.getString(5));
        ((ContentValues) g12Var.J).put("app_link_intent_uri", parse != null ? parse.toString() : null);
        ((ContentValues) g12Var.J).put("internal_provider_id", cursor.getString(6));
        ((ContentValues) g12Var.J).put("internal_provider_data", cursor.getBlob(7));
        ((ContentValues) g12Var.J).put("internal_provider_flag1", Long.valueOf(cursor.getLong(8)));
        ((ContentValues) g12Var.J).put("internal_provider_flag2", Long.valueOf(cursor.getLong(9)));
        ((ContentValues) g12Var.J).put("internal_provider_flag3", Long.valueOf(cursor.getLong(10)));
        ((ContentValues) g12Var.J).put("internal_provider_flag4", Long.valueOf(cursor.getLong(11)));
        return g12Var.k();
    }

    public final long b() {
        Long asLong = this.a.getAsLong("_id");
        if (asLong == null) {
            return -1L;
        }
        return asLong.longValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ys3) {
            return this.a.equals(((ys3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Channel{" + this.a.toString() + "}";
    }
}

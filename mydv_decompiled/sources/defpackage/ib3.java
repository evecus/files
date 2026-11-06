package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ib3 {
    public Context a;
    public ArrayList b;
    public ArrayList c;
    public ArrayList d;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public boolean j;
    public boolean k;
    public lc3 l;
    public CharSequence m;
    public String n;
    public boolean o;
    public boolean p;
    public Bundle q;
    public int r;
    public int s;
    public String t;
    public int u;
    public boolean v;
    public Notification w;
    public ArrayList x;

    public static CharSequence b(CharSequence charSequence) {
        return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public static String c(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String charSequence2 = charSequence.toString();
        return charSequence2 == null ? charSequence2 : charSequence2.length() > 5120 ? charSequence2.substring(0, 5120) : charSequence2;
    }

    public final Notification a() {
        Notification build;
        Bundle bundle;
        RemoteViews makeHeadsUpContentView;
        RemoteViews makeBigContentView;
        mc3 mc3Var = new mc3(this);
        ib3 ib3Var = (ib3) mc3Var.c;
        lc3 lc3Var = ib3Var.l;
        if (lc3Var != null) {
            lc3Var.apply(mc3Var);
        }
        RemoteViews makeContentView = lc3Var != null ? lc3Var.makeContentView(mc3Var) : null;
        Notification.Builder builder = (Notification.Builder) mc3Var.b;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            build = builder.build();
        } else if (i >= 24) {
            build = builder.build();
        } else {
            builder.setExtras((Bundle) mc3Var.d);
            build = builder.build();
        }
        if (makeContentView != null) {
            build.contentView = makeContentView;
        }
        if (lc3Var != null && (makeBigContentView = lc3Var.makeBigContentView(mc3Var)) != null) {
            build.bigContentView = makeBigContentView;
        }
        if (lc3Var != null && (makeHeadsUpContentView = ib3Var.l.makeHeadsUpContentView(mc3Var)) != null) {
            build.headsUpContentView = makeHeadsUpContentView;
        }
        if (lc3Var != null && (bundle = build.extras) != null) {
            lc3Var.addCompatExtras(bundle);
        }
        return build;
    }
}

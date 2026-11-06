package defpackage;

import android.widget.RemoteViews;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class o34 {
    public static final o34 d = new o34(new long[0], new RemoteViews[0], 1);
    public final long[] a;
    public final RemoteViews[] b;
    public final int c;

    public o34(long[] jArr, RemoteViews[] remoteViewsArr, int i) {
        this.a = jArr;
        this.b = remoteViewsArr;
        this.c = i;
        if (jArr.length != remoteViewsArr.length) {
            s83.t("RemoteCollectionItems has different number of ids and views");
            throw null;
        }
        if (i < 1) {
            s83.t("View type count must be >= 1");
            throw null;
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = o70.P0(arrayList).size();
        if (size <= this.c) {
            return;
        }
        throw new IllegalArgumentException(("View type count is set to " + this.c + ", but the collection contains " + size + " different layout ids").toString());
    }
}

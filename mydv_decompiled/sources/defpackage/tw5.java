package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class tw5 extends ContentObserver {
    public final /* synthetic */ iz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw5(iz izVar, Handler handler) {
        super(handler);
        this.a = izVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.d(wd5.a);
    }
}

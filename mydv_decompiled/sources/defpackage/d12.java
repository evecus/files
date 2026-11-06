package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class d12 implements e12 {
    public final InputContentInfo a;

    public d12(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // defpackage.e12
    public final Uri a() {
        return this.a.getContentUri();
    }

    @Override // defpackage.e12
    public final void b() {
        this.a.requestPermission();
    }

    @Override // defpackage.e12
    public final Uri c() {
        return this.a.getLinkUri();
    }

    @Override // defpackage.e12
    public final ClipDescription d() {
        return this.a.getDescription();
    }

    @Override // defpackage.e12
    public final Object e() {
        return this.a;
    }

    public d12(Object obj) {
        this.a = (InputContentInfo) obj;
    }
}

package defpackage;

import android.view.ContentInfo;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class br5 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static ki0 b(View view, ki0 ki0Var) {
        ContentInfo d = ki0Var.a.d();
        Objects.requireNonNull(d);
        ContentInfo performReceiveContent = view.performReceiveContent(d);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == d ? ki0Var : new ki0(new gi0(performReceiveContent));
    }
}

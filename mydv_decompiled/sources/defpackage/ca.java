package defpackage;

import android.content.ClipData;
import android.os.Build;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ca implements v60 {
    public final da a;

    public ca(da daVar) {
        this.a = daVar;
    }

    public final void a(u60 u60Var) {
        da daVar = this.a;
        if (u60Var != null) {
            daVar.l().setPrimaryClip(u60Var.a());
        } else if (Build.VERSION.SDK_INT >= 28) {
            ck.d(daVar.l());
        } else {
            daVar.l().setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}

package defpackage;

import android.graphics.Typeface;
import androidx.media3.common.C;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class no3 implements mo3 {
    public static Typeface b(String str, qk1 qk1Var, int i) {
        if (i == 0 && j42.c(qk1Var, qk1.M) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        if (i == 0 && j42.c(qk1Var, qk1.P) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT_BOLD;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), qk1Var.I, i == 1);
    }

    @Override // defpackage.mo3
    public final Typeface a(int i, qk1 qk1Var) {
        return b(null, qk1Var, i);
    }

    @Override // defpackage.mo3
    public final Typeface i(fp1 fp1Var, qk1 qk1Var, int i) {
        fp1Var.getClass();
        return b(C.SANS_SERIF_NAME, qk1Var, i);
    }
}

package defpackage;

import android.R;
import android.os.Build;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public enum d35 {
    /* JADX INFO: Fake field, exist only in values array */
    Cut(R.string.cut, R.attr.actionModeCutDrawable, j16.t0),
    /* JADX INFO: Fake field, exist only in values array */
    Copy(R.string.copy, R.attr.actionModeCopyDrawable, j16.u0),
    /* JADX INFO: Fake field, exist only in values array */
    Paste(R.string.paste, R.attr.actionModePasteDrawable, j16.v0),
    /* JADX INFO: Fake field, exist only in values array */
    SelectAll(R.string.selectAll, R.attr.actionModeSelectAllDrawable, j16.w0),
    Autofill(Build.VERSION.SDK_INT <= 26 ? com.github.mytv.dv.R.string.androidx_compose_foundation_autofill : R.string.autofill, 0, j16.x0);

    public final Object I;
    public final int J;
    public final int K;

    d35(int i, int i2, Object obj) {
        this.I = obj;
        this.J = i;
        this.K = i2;
    }
}

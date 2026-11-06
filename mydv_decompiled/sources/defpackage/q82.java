package defpackage;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class q82 extends k13 implements t82, ye0 {
    public Map I;
    public Map J;
    public Map K;
    public Map L;
    public t33 M;
    public boolean N;
    public vs3 R;
    public rv4 S;
    public final LinkedHashMap O = new LinkedHashMap();
    public final LinkedHashMap P = new LinkedHashMap();
    public final LinkedHashMap Q = new LinkedHashMap();
    public final long T = ViewConfiguration.getLongPressTimeout();

    public q82(Map map, Map map2, Map map3, Map map4, t33 t33Var, boolean z) {
        this.I = map;
        this.J = map2;
        this.K = map3;
        this.L = map4;
        this.M = t33Var;
        this.N = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022f  */
    @Override // defpackage.t82
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.view.KeyEvent r17) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q82.b(android.view.KeyEvent):boolean");
    }

    public final void j0(boolean z) {
        vs3 vs3Var;
        t33 t33Var = this.M;
        if (t33Var == null || (vs3Var = this.R) == null) {
            return;
        }
        this.R = null;
        p70.g0(getCoroutineScope(), null, null, new a40(t33Var, z, vs3Var, (fj0) null), 3);
    }

    @Override // defpackage.k13
    public final void onAttach() {
        t33 t33Var = this.M;
        if (t33Var != null && this.N) {
            this.S = p70.g0(getCoroutineScope(), null, null, new q30(t33Var, this, null, (byte) 3), 3);
        }
    }

    @Override // defpackage.k13
    public final void onDetach() {
        rv4 rv4Var = this.S;
        if (rv4Var != null) {
            rv4Var.e(null);
        }
        this.S = null;
    }

    @Override // defpackage.t82
    public final boolean t(KeyEvent keyEvent) {
        keyEvent.getClass();
        return false;
    }
}

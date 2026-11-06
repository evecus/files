package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class m13 {
    public final AndroidComposeView a;
    public e43 b;
    public e43 c;
    public e43 d;
    public e43 e;
    public boolean f;

    public m13(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [k13] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [k13] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [b53] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [b53] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void b(k13 k13Var, yx3 yx3Var) {
        if (!k13Var.getNode().isAttached()) {
            q02.b("visitSubtreeIf called on an unattached node");
        }
        b53 b53Var = new b53(new k13[16]);
        k13 child$ui = k13Var.getNode().getChild$ui();
        if (child$ui == null) {
            ut0.h(b53Var, k13Var.getNode());
        } else {
            b53Var.c(child$ui);
        }
        while (true) {
            int i = b53Var.K;
            if (i == 0) {
                return;
            }
            k13 k13Var2 = (k13) b53Var.l(i - 1);
            if ((k13Var2.getAggregateChildKindSet$ui() & 32) != 0) {
                for (k13 k13Var3 = k13Var2; k13Var3 != null && k13Var3.isAttached(); k13Var3 = k13Var3.getChild$ui()) {
                    if ((k13Var3.getKindSet$ui() & 32) != 0) {
                        wt0 wt0Var = k13Var3;
                        ?? r5 = 0;
                        while (wt0Var != 0) {
                            if (wt0Var instanceof n13) {
                                if (((n13) wt0Var).I().i(yx3Var)) {
                                    break;
                                }
                            } else if ((wt0Var.getKindSet$ui() & 32) != 0 && (wt0Var instanceof wt0)) {
                                k13 k13Var4 = wt0Var.J;
                                int i2 = 0;
                                wt0Var = wt0Var;
                                r5 = r5;
                                while (k13Var4 != null) {
                                    if ((k13Var4.getKindSet$ui() & 32) != 0) {
                                        i2++;
                                        r5 = r5;
                                        if (i2 == 1) {
                                            wt0Var = k13Var4;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new b53(new k13[16]);
                                            }
                                            if (wt0Var != 0) {
                                                r5.c(wt0Var);
                                                wt0Var = 0;
                                            }
                                            r5.c(k13Var4);
                                        }
                                    }
                                    k13Var4 = k13Var4.getChild$ui();
                                    wt0Var = wt0Var;
                                    r5 = r5;
                                }
                                if (i2 == 1) {
                                }
                            }
                            wt0Var = ut0.M(r5);
                        }
                    }
                }
            }
            ut0.h(b53Var, k13Var2);
        }
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.a.registerOnEndApplyChangesListener(new eq(this, (byte) 16));
    }
}

package defpackage;

import androidx.media3.exoplayer.RendererCapabilities;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class h94 implements g94 {
    public static final da M = new da((Object) new sg(26), (Object) new u73((byte) 20), (byte) 10);
    public final Map I;
    public final n43 J;
    public j94 K;
    public final i9 L;

    public h94(Map map) {
        this.I = map;
        long[] jArr = ia4.a;
        this.J = new n43();
        this.L = new i9(this, (byte) 20);
    }

    @Override // defpackage.g94
    public final void b(Object obj, tc0 tc0Var, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(533563200);
        if ((i & 6) == 0) {
            i2 = (go1Var.i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go1Var.i(tc0Var) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= go1Var.i(this) ? 256 : 128;
        }
        if (go1Var.T(i2 & 1, (i2 & 147) != 146)) {
            go1Var.g0(obj);
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                i9 i9Var = this.L;
                if (!((Boolean) i9Var.invoke(obj)).booleanValue()) {
                    s83.j(obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.", "Type of the key ");
                    return;
                }
                Map map = (Map) this.I.get(obj);
                i51 i51Var = l94.a;
                m94 m94Var = new m94(new k94(map, i9Var));
                go1Var.o0(m94Var);
                Q = m94Var;
            }
            m94 m94Var2 = (m94) Q;
            mw2.c(new ay3[]{l94.a.a(m94Var2), qq2.a.a(m94Var2)}, tc0Var, go1Var, (i2 & 112) | 8);
            boolean i3 = go1Var.i(this) | go1Var.i(obj) | go1Var.i(m94Var2);
            Object Q2 = go1Var.Q();
            if (i3 || Q2 == jpVar) {
                Q2 = new ig(this, obj, m94Var2, (byte) 3);
                go1Var.o0(Q2);
            }
            mw2.e(wd5.a, (tm1) Q2, go1Var);
            if (go1Var.y && go1Var.G.i == go1Var.z) {
                go1Var.z = -1;
                go1Var.y = false;
            }
            go1Var.q(false);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new pc0((g94) this, obj, tc0Var, i, (byte) 5);
        }
    }

    @Override // defpackage.g94
    public final void f(Object obj) {
        if (this.J.k(obj) == null) {
            this.I.remove(obj);
        }
    }
}

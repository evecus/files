package defpackage;

import androidx.media3.exoplayer.RendererCapabilities;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class eg2 implements j94, g94 {
    public final k94 I;
    public final g94 J;
    public final o43 K;

    public eg2(j94 j94Var, Map map, g94 g94Var) {
        i9 i9Var = new i9(j94Var, (byte) 13);
        i51 i51Var = l94.a;
        this.I = new k94(map, i9Var);
        this.J = g94Var;
        o43 o43Var = ka4.a;
        this.K = new o43();
    }

    @Override // defpackage.j94
    public final i94 a(String str, rm1 rm1Var) {
        return this.I.a(str, rm1Var);
    }

    @Override // defpackage.g94
    public final void b(Object obj, tc0 tc0Var, fe0 fe0Var, int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-858296452);
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
            this.J.b(obj, tc0Var, go1Var, i2 & WebSocketProtocol.PAYLOAD_SHORT);
            boolean i3 = go1Var.i(this) | go1Var.i(obj);
            Object Q = go1Var.Q();
            if (i3 || Q == de0.a) {
                Q = new m1(this, obj, (byte) 8);
                go1Var.o0(Q);
            }
            mw2.e(obj, (tm1) Q, go1Var);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new pc0((g94) this, obj, tc0Var, i, (byte) 3);
        }
    }

    @Override // defpackage.j94
    public final boolean c(Object obj) {
        return this.I.c(obj);
    }

    @Override // defpackage.j94
    public final Map d() {
        o43 o43Var = this.K;
        Object[] objArr = o43Var.b;
        long[] jArr = o43Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.J.f(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return this.I.d();
    }

    @Override // defpackage.j94
    public final Object e(String str) {
        return this.I.e(str);
    }

    @Override // defpackage.g94
    public final void f(Object obj) {
        this.J.f(obj);
    }
}

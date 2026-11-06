package defpackage;

import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class hw5 {
    public static final q33 a;
    public static final fw5[] b;

    static {
        q33 q33Var = new q33(8);
        fw5.a.getClass();
        gw5 gw5Var = ew5.g;
        q33Var.i(1, gw5Var);
        gw5 gw5Var2 = ew5.f;
        q33Var.i(2, gw5Var2);
        gw5 gw5Var3 = ew5.b;
        q33Var.i(4, gw5Var3);
        gw5 gw5Var4 = ew5.d;
        q33Var.i(8, gw5Var4);
        gw5 gw5Var5 = ew5.h;
        q33Var.i(16, gw5Var5);
        gw5 gw5Var6 = ew5.e;
        q33Var.i(32, gw5Var6);
        gw5 gw5Var7 = ew5.i;
        q33Var.i(64, gw5Var7);
        gw5 gw5Var8 = ew5.c;
        q33Var.i(128, gw5Var8);
        a = q33Var;
        b = new fw5[]{gw5Var, gw5Var2, gw5Var3, gw5Var7, gw5Var5, gw5Var6, gw5Var4, ew5.j, gw5Var8};
    }

    public static final void a(fs2 fs2Var, y02 y02Var, long j, int i, int i2) {
        if (wi4.i(j, -1L)) {
            return;
        }
        float f = (int) ((j >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        float f2 = (int) ((j >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        float f3 = i - ((int) ((j >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        float f4 = i2 - ((int) (j & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        fs2Var.a(y02Var.b, f);
        fs2Var.a(y02Var.c, f2);
        fs2Var.a(y02Var.d, f3);
        fs2Var.a(y02Var.e, f4);
    }
}

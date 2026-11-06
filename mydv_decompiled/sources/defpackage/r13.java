package defpackage;

import android.os.Build;
import android.view.SoundEffectConstants;
import androidx.media3.extractor.ts.TsExtractor;
import java.util.Map;
import java.util.Set;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class r13 {
    public static final i51 a = new i51(new gw2((byte) 1), (byte) 0);
    public static final i51 b = new i51(new gw2((byte) 2), (byte) 0);
    public static final Map c;
    public static final Set d;
    public static final Map e;

    static {
        uj3 uj3Var = new uj3(21, 17);
        uj3 uj3Var2 = new uj3(22, 66);
        uj3 uj3Var3 = new uj3(19, 33);
        uj3 uj3Var4 = new uj3(166, 33);
        Integer valueOf = Integer.valueOf(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
        c = sv2.K(uj3Var, uj3Var2, uj3Var3, uj3Var4, new uj3(20, valueOf), new uj3(167, valueOf), new uj3(51, 33), new uj3(47, valueOf), new uj3(29, 17), new uj3(32, 66), new uj3(21, 17), new uj3(22, 66), new uj3(19, 33), new uj3(166, 33), new uj3(20, valueOf), new uj3(167, valueOf));
        d = dq.p1(new Integer[]{23, 66, 160});
        e = sv2.K(new uj3(88, 19), new uj3(87, 20), new uj3(89, 21), new uj3(90, 22), new uj3(85, 23), new uj3(Integer.valueOf(WebSocketProtocol.PAYLOAD_SHORT), 23), new uj3(127, 23));
    }

    public static final l13 a(l13 l13Var, rm1 rm1Var) {
        l13Var.getClass();
        rm1Var.getClass();
        return o7.J(l13Var, new oe(rm1Var, (byte) 4));
    }

    public static final int b(int i, boolean z) {
        return Build.VERSION.SDK_INT >= 31 ? SoundEffectConstants.getConstantForFocusDirection(i, z) : SoundEffectConstants.getContantForFocusDirection(i);
    }

    public static l13 c(l13 l13Var, Map map) {
        l13Var.getClass();
        p91 p91Var = p91.I;
        return l13Var.then(new n82(map, p91Var, p91Var, p91Var, null, false));
    }

    public static l13 d(l13 l13Var, rm1 rm1Var, rm1 rm1Var2, rm1 rm1Var3, rm1 rm1Var4, rm1 rm1Var5, rm1 rm1Var6, rm1 rm1Var7, tm1 tm1Var, Map map, Map map2, t64 t64Var, t33 t33Var, int i) {
        uj3 uj3Var;
        zn znVar;
        uj3 uj3Var2;
        char c2;
        zn znVar2;
        uj3 uj3Var3;
        char c3;
        zn znVar3;
        uj3 uj3Var4;
        char c4;
        zn znVar4;
        uj3 uj3Var5;
        char c5;
        zn znVar5;
        rm1 rm1Var8 = (i & 1) != 0 ? null : rm1Var;
        rm1 rm1Var9 = (i & 4) != 0 ? null : rm1Var2;
        rm1 rm1Var10 = (i & 16) != 0 ? null : rm1Var3;
        rm1 rm1Var11 = (i & 64) != 0 ? null : rm1Var4;
        rm1 rm1Var12 = (i & 256) != 0 ? null : rm1Var5;
        rm1 rm1Var13 = (i & 512) != 0 ? null : rm1Var6;
        rm1 rm1Var14 = (i & 1024) != 0 ? null : rm1Var7;
        tm1 tm1Var2 = (i & 2048) != 0 ? null : tm1Var;
        int i2 = i & 4096;
        Map map3 = p91.I;
        Map map4 = i2 != 0 ? map3 : map;
        if ((i & 8192) == 0) {
            map3 = map2;
        }
        boolean z = (i & 16384) == 0;
        t64 t64Var2 = (65536 & i) != 0 ? null : t64Var;
        t33 t33Var2 = (i & 131072) != 0 ? null : t33Var;
        l13Var.getClass();
        uj3 uj3Var6 = new uj3(21, rm1Var8);
        uj3 uj3Var7 = new uj3(22, rm1Var9);
        t33 t33Var3 = t33Var2;
        uj3 uj3Var8 = new uj3(19, rm1Var10);
        uj3 uj3Var9 = new uj3(166, rm1Var10);
        uj3 uj3Var10 = new uj3(20, rm1Var11);
        Map map5 = map4;
        uj3 uj3Var11 = new uj3(167, rm1Var11);
        uj3 uj3Var12 = new uj3(23, rm1Var12);
        Map map6 = map3;
        uj3 uj3Var13 = new uj3(66, rm1Var12);
        boolean z2 = z;
        uj3 uj3Var14 = new uj3(160, rm1Var12);
        rm1 rm1Var15 = rm1Var12;
        uj3 uj3Var15 = new uj3(82, rm1Var14);
        uj3 uj3Var16 = new uj3(176, rm1Var14);
        uj3 uj3Var17 = new uj3(259, rm1Var14);
        uj3 uj3Var18 = new uj3(36, rm1Var14);
        uj3 uj3Var19 = new uj3(40, rm1Var13);
        uj3 uj3Var20 = new uj3(51, null);
        uj3 uj3Var21 = new uj3(47, null);
        uj3 uj3Var22 = new uj3(29, null);
        uj3 uj3Var23 = new uj3(32, null);
        uj3 uj3Var24 = new uj3(7, tm1Var2 != null ? new zn(tm1Var2, (byte) 4) : null);
        uj3 uj3Var25 = new uj3(8, tm1Var2 != null ? new zn(tm1Var2, (byte) 5) : null);
        uj3 uj3Var26 = new uj3(9, tm1Var2 != null ? new zn(tm1Var2, (byte) 6) : null);
        if (tm1Var2 != null) {
            uj3Var = uj3Var26;
            znVar = new zn(tm1Var2, (byte) 7);
        } else {
            uj3Var = uj3Var26;
            znVar = null;
        }
        uj3 uj3Var27 = new uj3(10, znVar);
        if (tm1Var2 != null) {
            c2 = 11;
            uj3Var2 = uj3Var27;
            znVar2 = new zn(tm1Var2, (byte) 8);
        } else {
            uj3Var2 = uj3Var27;
            c2 = 11;
            znVar2 = null;
        }
        uj3 uj3Var28 = new uj3(11, znVar2);
        if (tm1Var2 != null) {
            c3 = '\f';
            uj3Var3 = uj3Var28;
            znVar3 = new zn(tm1Var2, (byte) 9);
        } else {
            uj3Var3 = uj3Var28;
            c3 = '\f';
            znVar3 = null;
        }
        uj3 uj3Var29 = new uj3(12, znVar3);
        if (tm1Var2 != null) {
            c4 = '\r';
            uj3Var4 = uj3Var29;
            znVar4 = new zn(tm1Var2, (byte) 10);
        } else {
            uj3Var4 = uj3Var29;
            c4 = '\r';
            znVar4 = null;
        }
        uj3 uj3Var30 = new uj3(13, znVar4);
        if (tm1Var2 != null) {
            c5 = 14;
            uj3Var5 = uj3Var30;
            znVar5 = new zn(tm1Var2, (byte) 1);
        } else {
            uj3Var5 = uj3Var30;
            c5 = 14;
            znVar5 = null;
        }
        uj3 uj3Var31 = new uj3(14, znVar5);
        uj3 uj3Var32 = new uj3(15, tm1Var2 != null ? new zn(tm1Var2, (byte) 2) : null);
        uj3 uj3Var33 = new uj3(16, tm1Var2 != null ? new zn(tm1Var2, (byte) 3) : null);
        uj3[] uj3VarArr = new uj3[28];
        uj3VarArr[0] = uj3Var6;
        uj3VarArr[1] = uj3Var7;
        uj3VarArr[2] = uj3Var8;
        uj3VarArr[3] = uj3Var9;
        uj3VarArr[4] = uj3Var10;
        uj3VarArr[5] = uj3Var11;
        uj3VarArr[6] = uj3Var12;
        uj3VarArr[7] = uj3Var13;
        uj3VarArr[8] = uj3Var14;
        uj3VarArr[9] = uj3Var15;
        uj3VarArr[10] = uj3Var16;
        uj3VarArr[c2] = uj3Var17;
        uj3VarArr[c3] = uj3Var18;
        uj3VarArr[c4] = uj3Var19;
        uj3VarArr[c5] = uj3Var20;
        uj3VarArr[15] = uj3Var21;
        uj3VarArr[16] = uj3Var22;
        uj3VarArr[17] = uj3Var23;
        uj3VarArr[18] = uj3Var24;
        uj3VarArr[19] = uj3Var25;
        uj3VarArr[20] = uj3Var;
        uj3VarArr[21] = uj3Var2;
        uj3VarArr[22] = uj3Var3;
        uj3VarArr[23] = uj3Var4;
        uj3VarArr[24] = uj3Var5;
        uj3VarArr[25] = uj3Var31;
        uj3VarArr[26] = uj3Var32;
        uj3VarArr[27] = uj3Var33;
        l13 then = l13Var.then(new n82(sv2.K(uj3VarArr), sv2.K(new uj3(21, null), new uj3(22, null), new uj3(19, null), new uj3(166, null), new uj3(20, null), new uj3(167, null), new uj3(66, rm1Var13), new uj3(160, rm1Var13), new uj3(23, rm1Var13)), map5, map6, t33Var3, t33Var3 != null));
        l13 i0 = i42.i0(t64Var2, rm1Var13, t33Var3, rm1Var15 == null ? new gw2((byte) 3) : rm1Var15);
        then.getClass();
        if (z2) {
            i0 = i13.a;
        }
        return then.then(i0);
    }

    public static final boolean e(fe0 fe0Var) {
        return ((bw0) ((go1) fe0Var).k(cw0.a)).f;
    }
}

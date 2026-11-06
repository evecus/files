package defpackage;

import android.content.Context;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fh extends r92 implements tm1 {
    public static final fh K;
    public static final fh L;
    public static final fh M;
    public static final fh N;
    public static final fh O;
    public static final fh P;
    public static final fh Q;
    public static final fh R;
    public static final fh S;
    public static final fh T;
    public final /* synthetic */ byte J;

    static {
        int i = 1;
        K = new fh((byte) 0, i);
        L = new fh((byte) 1, i);
        M = new fh((byte) 2, i);
        N = new fh((byte) 3, i);
        O = new fh((byte) 4, i);
        P = new fh((byte) 5, i);
        Q = new fh((byte) 6, i);
        R = new fh((byte) 7, i);
        S = new fh((byte) 8, i);
        T = new fh((byte) 9, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fh(byte b) {
        super(1);
        this.J = b;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        switch (this.J) {
            case 0:
                return obj;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case 3:
                return obj;
            case 4:
                return qb.g0(0.0f, 0.0f, null, 7);
            case 5:
                z22 z22Var = (z22) obj;
                long j = z22Var.a;
                return z22Var;
            case 6:
                return ma1.d;
            case 7:
                r7.m((y31) obj, x70.f, 0L, 0L, 0.0f, WebSocketProtocol.PAYLOAD_SHORT);
                return wd5.a;
            case 8:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return "  " + ((bs3) entry.getKey()).a + " = " + entry.getValue();
            case 9:
                ((Context) obj).getClass();
                return o91.I;
            case 10:
                return new z22((((int) (((z22) obj).a & 4294967295L)) & 4294967295L) | (0 << 32));
            case 11:
                return new z22((((int) (((z22) obj).a >> 32)) << 32) | (4294967295L & 0));
            case 12:
                return new z22((((int) (((z22) obj).a & 4294967295L)) & 4294967295L) | (0 << 32));
            default:
                return new z22((((int) (((z22) obj).a >> 32)) << 32) | (4294967295L & 0));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fh(byte b, int i) {
        super(i);
        this.J = b;
    }
}

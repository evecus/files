package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.LruCache;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class c74 {
    public static final k80 a;
    public static final k80 b;

    static {
        long j = qb.j(4294947766L);
        long j2 = qb.j(4285005849L);
        long j3 = qb.j(4287758375L);
        long j4 = qb.j(4294957786L);
        long j5 = qb.j(4294957786L);
        long j6 = qb.j(4282384396L);
        long j7 = qb.j(4294947766L);
        long j8 = qb.j(4287758375L);
        long j9 = qb.j(4293311933L);
        long j10 = qb.j(4282657066L);
        long j11 = qb.j(4284301120L);
        long j12 = qb.j(4294957786L);
        long j13 = qb.j(4294957786L);
        long j14 = qb.j(4281079062L);
        long j15 = qb.j(4293311933L);
        long j16 = qb.j(4284301120L);
        long j17 = qb.j(4291409136L);
        long j18 = qb.j(4281342802L);
        long j19 = qb.j(4282856040L);
        long j20 = qb.j(4293516799L);
        long j21 = qb.j(4293516799L);
        long j22 = qb.j(4279962166L);
        long j23 = qb.j(4291409136L);
        long j24 = qb.j(4282856040L);
        long j25 = qb.j(4294948011L);
        long j26 = qb.j(4285071365L);
        long j27 = qb.j(4287823882L);
        long j28 = qb.j(4294957782L);
        long j29 = qb.j(4279636755L);
        long j30 = qb.j(4293517792L);
        long j31 = qb.j(4279636755L);
        long j32 = qb.j(4293517792L);
        long j33 = qb.j(4283450436L);
        long j34 = qb.j(4292068290L);
        long j35 = qb.j(4294947766L);
        long j36 = qb.j(4279636755L);
        long j37 = qb.j(4282136632L);
        long j38 = qb.j(4279241997L);
        long j39 = qb.j(4280163099L);
        long j40 = qb.j(4280426271L);
        long j41 = qb.j(4281149737L);
        long j42 = qb.j(4281873460L);
        long j43 = qb.j(4288449933L);
        long j44 = qb.j(4283450436L);
        long j45 = qb.j(4293517792L);
        long j46 = qb.j(4281544495L);
        long j47 = qb.j(4290641974L);
        long j48 = qb.j(4278190080L);
        i51 i51Var = q80.a;
        a = new k80(j, j2, j3, j4, j47, j9, j10, j11, j12, j17, j18, j19, j20, j29, j30, j31, j32, j33, j34, j35, j45, j46, j25, j26, j27, j28, j43, j44, j48, j37, j36, j40, j41, j42, j39, j38, j5, j7, j6, j8, j13, j15, j14, j16, j21, j23, j22, j24);
        long j49 = qb.j(4290641974L);
        long j50 = qb.j(4294967295L);
        long j51 = qb.j(4294957786L);
        long j52 = qb.j(4282384396L);
        long j53 = qb.j(4294957786L);
        long j54 = qb.j(4282384396L);
        long j55 = qb.j(4294947766L);
        long j56 = qb.j(4287758375L);
        long j57 = qb.j(4285945431L);
        long j58 = qb.j(4294967295L);
        long j59 = qb.j(4294957786L);
        long j60 = qb.j(4281079062L);
        long j61 = qb.j(4294957786L);
        long j62 = qb.j(4281079062L);
        long j63 = qb.j(4293311933L);
        long j64 = qb.j(4284301120L);
        long j65 = qb.j(4284435329L);
        long j66 = qb.j(4294967295L);
        long j67 = qb.j(4293516799L);
        long j68 = qb.j(4279962166L);
        long j69 = qb.j(4293516799L);
        long j70 = qb.j(4279962166L);
        long j71 = qb.j(4291409136L);
        long j72 = qb.j(4282856040L);
        long j73 = qb.j(4290386458L);
        long j74 = qb.j(4294967295L);
        long j75 = qb.j(4294957782L);
        long j76 = qb.j(4282449922L);
        long j77 = qb.j(4294965495L);
        long j78 = qb.j(4280163099L);
        long j79 = qb.j(4294965495L);
        long j80 = qb.j(4280163099L);
        long j81 = qb.j(4293975774L);
        long j82 = qb.j(4283450436L);
        long j83 = qb.j(4290641974L);
        long j84 = qb.j(4292925656L);
        long j85 = qb.j(4294965495L);
        long j86 = qb.j(4294967295L);
        long j87 = qb.j(4294636273L);
        long j88 = qb.j(4294241515L);
        long j89 = qb.j(4293846758L);
        long j90 = qb.j(4293517792L);
        long j91 = qb.j(4286739572L);
        long j92 = qb.j(4292068290L);
        b = new k80(j49, j50, j51, j52, qb.j(4294947766L), j57, j58, j59, j60, j65, j66, j67, j68, j77, j78, j79, j80, j81, j82, j83, qb.j(4281544495L), qb.j(4294438894L), j73, j74, j75, j76, j91, j92, qb.j(4278190080L), j85, j84, j88, j89, j90, j87, j86, j53, j55, j54, j56, j61, j63, j62, j64, j69, j71, j70, j72);
    }

    public static final k80 a(Context context, t80 t80Var, s90 s90Var, z70 z70Var, x70 x70Var, boolean z) {
        context.getClass();
        t80Var.getClass();
        s90Var.getClass();
        z70Var.getClass();
        if (t80Var != t80.K || x70Var == null) {
            return (t80Var != t80.L || Build.VERSION.SDK_INT < 31) ? z ? a : b : z ? k21.t(context) : k21.u(context);
        }
        LruCache lruCache = va4.a;
        return va4.b(x70Var.a, z, xh0.c(ma4.P, s90Var), z70Var.K);
    }
}

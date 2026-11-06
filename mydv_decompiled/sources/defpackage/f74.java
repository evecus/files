package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class f74 extends ta2 {
    public static final f74 c = new f74("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f74(String str, byte b) {
        super(str);
        this.b = b;
    }

    @Override // defpackage.uw2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo35measure3p2s80s(ww2 ww2Var, List list, long j) {
        switch (this.b) {
            case 0:
                int size = list.size();
                p91 p91Var = p91.I;
                if (size == 0) {
                    return ww2Var.A(dh0.j(j), dh0.i(j), p91Var, new u73((byte) 19));
                }
                if (size == 1) {
                    bn3 u = ((pw2) list.get(0)).u(j);
                    return ww2Var.A(eh0.g(u.I, j), eh0.f(u.J, j), p91Var, new sa(u, (byte) 5));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < size2; i3++) {
                    bn3 u2 = ((pw2) list.get(i3)).u(j);
                    i = Math.max(u2.I, i);
                    i2 = Math.max(u2.J, i2);
                    arrayList.add(u2);
                }
                return ww2Var.A(eh0.g(i, j), eh0.f(i2, j), p91Var, new xi3(arrayList, (byte) 1));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}

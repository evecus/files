package defpackage;

import com.github.mytv.dv.model.Author;
import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.model.DataModelKt;
import com.github.mytv.dv.model.UserListResponse;
import com.github.mytv.dv.model.UserWorksResponse;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class cx3 extends k05 implements tm1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ gx3 K;
    public final /* synthetic */ Author L;
    public final /* synthetic */ long M;
    public final /* synthetic */ int N;
    public final /* synthetic */ int O;
    public final /* synthetic */ boolean P;
    public final /* synthetic */ n24 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cx3(gx3 gx3Var, Author author, long j, int i, int i2, boolean z, n24 n24Var, fj0 fj0Var, byte b) {
        super(1, fj0Var);
        this.I = b;
        this.K = gx3Var;
        this.L = author;
        this.M = j;
        this.N = i;
        this.O = i2;
        this.P = z;
        this.Q = n24Var;
    }

    @Override // defpackage.fu
    public final fj0 create(fj0 fj0Var) {
        switch (this.I) {
            case 0:
                return new cx3(this.L, this.K, this.M, this.N, this.O, this.P, this.Q, fj0Var, (byte) 0);
            case 1:
                return new cx3(this.K, this.L, this.M, this.N, this.O, this.P, this.Q, fj0Var, (byte) 1);
            case 2:
                return new cx3(this.K, this.L, this.M, this.N, this.O, this.P, this.Q, fj0Var, (byte) 2);
            default:
                return new cx3(this.L, this.K, this.M, this.N, this.O, this.P, this.Q, fj0Var, (byte) 3);
        }
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        fj0 fj0Var = (fj0) obj;
        switch (b) {
        }
        return ((cx3) create(fj0Var)).invokeSuspend(wd5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object y;
        Object z;
        Object A;
        String str;
        Object D;
        byte b = this.I;
        List list = o91.I;
        long j = this.M;
        Author author = this.L;
        el0 el0Var = el0.I;
        gx3 gx3Var = this.K;
        n24 n24Var = this.Q;
        int i = this.N;
        int i2 = this.O;
        boolean z2 = this.P;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                boolean z3 = this.J;
                try {
                    if (!z3) {
                        mu0.V(obj);
                        String secUid = author.getSecUid();
                        if (secUid.length() > 0) {
                            kq5 kq5Var = gx3Var.b;
                            this.J = true;
                            y = kq5Var.y(secUid, j, this);
                            if (y == el0Var) {
                                return el0Var;
                            }
                        }
                        return wd5Var;
                    }
                    if (!z3) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                    y = ((h54) obj).I;
                    if (i == gx3Var.y) {
                        boolean z4 = this.P;
                        long j2 = this.M;
                        if (!(y instanceof g54)) {
                            UserWorksResponse userWorksResponse = (UserWorksResponse) y;
                            if (gx3.z(userWorksResponse, z4)) {
                                n24Var.I = true;
                            } else {
                                List<Aweme> filterPrimaryPlayableAwemes = DataModelKt.filterPrimaryPlayableAwemes(userWorksResponse.getAwemeList());
                                if (filterPrimaryPlayableAwemes.isEmpty()) {
                                    filterPrimaryPlayableAwemes = DataModelKt.filterPrimaryAwemes(userWorksResponse.getAwemeList());
                                }
                                fw4 fw4Var = gx3Var.n;
                                fw4Var.h(z4 ? gx3.p((List) fw4Var.getValue(), filterPrimaryPlayableAwemes) : filterPrimaryPlayableAwemes);
                                gx3Var.q = gx3.w(z4, filterPrimaryPlayableAwemes.size(), userWorksResponse.getHasMore(), j2, userWorksResponse.getMaxCursor());
                                gx3Var.p = userWorksResponse.getMaxCursor();
                            }
                        }
                        Throwable a = h54.a(y);
                        if (a != null) {
                            n24Var.I = true;
                            if (!z2) {
                                gx3Var.S0.i(null, "加载喜欢列表失败: " + a.getMessage());
                            }
                        }
                    }
                    return wd5Var;
                } finally {
                    gx3Var.N(i2, z2, gx3Var.q, n24Var.I);
                }
            case 1:
                boolean z5 = this.J;
                try {
                    if (!z5) {
                        mu0.V(obj);
                        kq5 kq5Var2 = gx3Var.b;
                        String secUid2 = author.getSecUid();
                        String uid = author.getUid();
                        long j3 = this.M;
                        this.J = true;
                        z = kq5Var2.z(secUid2, uid, j3, this);
                        if (z == el0Var) {
                            return el0Var;
                        }
                    } else {
                        if (!z5) {
                            zy.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mu0.V(obj);
                        z = ((h54) obj).I;
                    }
                    if (i == gx3Var.y) {
                        boolean z6 = this.P;
                        long j4 = this.M;
                        if (!(z instanceof g54)) {
                            UserListResponse userListResponse = (UserListResponse) z;
                            List followers = userListResponse.getFollowers();
                            if (followers != null) {
                                list = followers;
                            }
                            fw4 fw4Var2 = gx3Var.a0;
                            fw4Var2.i(null, z6 ? o70.f1((Collection) fw4Var2.getValue(), list) : list);
                            Long l = new Long(userListResponse.getMinTime());
                            if (l.longValue() <= 0) {
                                l = null;
                            }
                            long longValue = l != null ? l.longValue() : userListResponse.getOffset();
                            gx3Var.d0 = gx3.w(z6, list.size(), userListResponse.getHasMore(), j4, longValue);
                            gx3Var.c0 = longValue;
                        }
                        Throwable a2 = h54.a(z);
                        if (a2 != null) {
                            n24Var.I = true;
                            if (!z2) {
                                gx3Var.S0.i(null, "加载粉丝列表失败: " + a2.getMessage());
                            }
                        }
                    }
                    return wd5Var;
                } finally {
                    gx3Var.N(i2, z2, gx3Var.d0, n24Var.I);
                }
            case 2:
                boolean z7 = this.J;
                try {
                    if (!z7) {
                        mu0.V(obj);
                        kq5 kq5Var3 = gx3Var.b;
                        String secUid3 = author.getSecUid();
                        String uid2 = author.getUid();
                        long j5 = this.M;
                        this.J = true;
                        A = kq5Var3.A(secUid3, uid2, j5, this);
                        if (A == el0Var) {
                            return el0Var;
                        }
                    } else {
                        if (!z7) {
                            zy.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mu0.V(obj);
                        A = ((h54) obj).I;
                    }
                    if (i == gx3Var.y) {
                        boolean z8 = this.P;
                        long j6 = this.M;
                        if (A instanceof g54) {
                            str = "加载关注列表失败: ";
                        } else {
                            UserListResponse userListResponse2 = (UserListResponse) A;
                            List followings = userListResponse2.getFollowings();
                            if (followings != null) {
                                list = followings;
                            }
                            fw4 fw4Var3 = gx3Var.e0;
                            fw4Var3.i(null, z8 ? o70.f1((Collection) fw4Var3.getValue(), list) : list);
                            str = "加载关注列表失败: ";
                            Long l2 = new Long(userListResponse2.getMinTime());
                            if (l2.longValue() <= 0) {
                                l2 = null;
                            }
                            long longValue2 = l2 != null ? l2.longValue() : userListResponse2.getOffset();
                            gx3Var.h0 = gx3.w(z8, list.size(), userListResponse2.getHasMore(), j6, longValue2);
                            gx3Var.g0 = longValue2;
                        }
                        Throwable a3 = h54.a(A);
                        if (a3 != null) {
                            n24Var.I = true;
                            if (!z2) {
                                gx3Var.S0.i(null, str + a3.getMessage());
                            }
                        }
                    }
                    return wd5Var;
                } finally {
                    gx3Var.N(i2, z2, gx3Var.h0, n24Var.I);
                }
            default:
                boolean z9 = this.J;
                try {
                    if (!z9) {
                        mu0.V(obj);
                        String secUid4 = author.getSecUid();
                        if (secUid4.length() > 0) {
                            kq5 kq5Var4 = gx3Var.b;
                            this.J = true;
                            D = kq5Var4.D(secUid4, j, this);
                            if (D == el0Var) {
                                return el0Var;
                            }
                        }
                        return wd5Var;
                    }
                    if (!z9) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                    D = ((h54) obj).I;
                    if (i == gx3Var.y) {
                        boolean z10 = this.P;
                        long j7 = this.M;
                        if (!(D instanceof g54)) {
                            UserWorksResponse userWorksResponse2 = (UserWorksResponse) D;
                            if (gx3.z(userWorksResponse2, z10)) {
                                n24Var.I = true;
                            } else {
                                List<Aweme> filterPrimaryPlayableAwemes2 = DataModelKt.filterPrimaryPlayableAwemes(userWorksResponse2.getAwemeList());
                                fw4 fw4Var4 = gx3Var.g;
                                fw4Var4.h(z10 ? gx3.p((List) fw4Var4.getValue(), filterPrimaryPlayableAwemes2) : filterPrimaryPlayableAwemes2);
                                gx3Var.j = gx3.w(z10, filterPrimaryPlayableAwemes2.size(), userWorksResponse2.getHasMore(), j7, userWorksResponse2.getMaxCursor());
                                gx3Var.i = userWorksResponse2.getMaxCursor();
                            }
                        }
                        if (h54.a(D) != null) {
                            n24Var.I = true;
                        }
                    }
                    return wd5Var;
                } finally {
                    gx3Var.N(i2, z2, gx3Var.j, n24Var.I);
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cx3(Author author, gx3 gx3Var, long j, int i, int i2, boolean z, n24 n24Var, fj0 fj0Var, byte b) {
        super(1, fj0Var);
        this.I = b;
        this.L = author;
        this.K = gx3Var;
        this.M = j;
        this.N = i;
        this.O = i2;
        this.P = z;
        this.Q = n24Var;
    }
}

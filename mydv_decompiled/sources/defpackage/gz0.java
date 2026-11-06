package defpackage;

import com.github.mytv.dv.model.ApiStatusResponse;
import com.github.mytv.dv.model.DanmakuResponse;
import com.github.mytv.dv.model.EmojiListResponse;
import com.github.mytv.dv.model.FeedResponse;
import com.github.mytv.dv.model.UserProfileResponse;
import com.github.mytv.dv.model.WorkDetailResponse;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class gz0 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ n11 J;
    public final /* synthetic */ String K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gz0(n11 n11Var, String str, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.J = n11Var;
        this.K = str;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        String str = this.K;
        n11 n11Var = this.J;
        switch (b) {
            case 0:
                return new gz0(n11Var, str, fj0Var, (byte) 0);
            case 1:
                return new gz0(n11Var, str, fj0Var, (byte) 1);
            case 2:
                return new gz0(n11Var, str, fj0Var, (byte) 2);
            case 3:
                return new gz0(n11Var, str, fj0Var, (byte) 3);
            case 4:
                return new gz0(n11Var, str, fj0Var, (byte) 4);
            default:
                return new gz0(n11Var, str, fj0Var, (byte) 5);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
        }
        return ((gz0) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        String str = this.K;
        n11 n11Var = this.J;
        switch (b) {
            case 0:
                mu0.V(obj);
                z62 z62Var = n11Var.c;
                o63 o63Var = z62Var.b;
                return z62Var.b(str, ApiStatusResponse.Companion.serializer());
            case 1:
                mu0.V(obj);
                z62 z62Var2 = n11Var.c;
                o63 o63Var2 = z62Var2.b;
                return z62Var2.b(str, DanmakuResponse.Companion.serializer());
            case 2:
                mu0.V(obj);
                z62 z62Var3 = n11Var.c;
                o63 o63Var3 = z62Var3.b;
                return z62Var3.b(str, EmojiListResponse.Companion.serializer());
            case 3:
                mu0.V(obj);
                z62 z62Var4 = n11Var.c;
                o63 o63Var4 = z62Var4.b;
                return z62Var4.b(str, FeedResponse.Companion.serializer());
            case 4:
                mu0.V(obj);
                z62 z62Var5 = n11Var.c;
                o63 o63Var5 = z62Var5.b;
                return z62Var5.b(str, UserProfileResponse.Companion.serializer());
            default:
                mu0.V(obj);
                z62 z62Var6 = n11Var.c;
                o63 o63Var6 = z62Var6.b;
                return z62Var6.b(str, WorkDetailResponse.Companion.serializer());
        }
    }
}

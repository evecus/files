package defpackage;

import androidx.media3.common.C;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class jf5 extends k05 implements hn1 {
    public long I;
    public boolean J;
    public final /* synthetic */ String K;
    public final /* synthetic */ String L;
    public final /* synthetic */ OkHttpClient M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf5(String str, String str2, OkHttpClient okHttpClient, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = str;
        this.L = str2;
        this.M = okHttpClient;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new jf5(this.K, this.L, this.M, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((jf5) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        long j;
        boolean z = this.J;
        String str = this.K;
        if (!z) {
            mu0.V(obj);
            int length = str.length();
            String str2 = this.L;
            if (length != 0) {
                str2 = hf1.w(str, str2);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if5 if5Var = new if5(str2, this.M, null);
            this.I = currentTimeMillis;
            this.J = true;
            obj = qi4.n(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, if5Var, this);
            el0 el0Var = el0.I;
            if (obj == el0Var) {
                return el0Var;
            }
            j = currentTimeMillis;
        } else {
            if (!z) {
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.I;
            mu0.V(obj);
        }
        return j42.c((Boolean) obj, Boolean.TRUE) ? new uj3(str, new Long(System.currentTimeMillis() - j)) : new uj3(str, new Long(Long.MAX_VALUE));
    }
}

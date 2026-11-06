package defpackage;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bo3 extends k05 implements hn1 {
    public o53 I;
    public co3 J;
    public long K;
    public byte L;
    public /* synthetic */ Object M;
    public final /* synthetic */ CharSequence N;
    public final /* synthetic */ long O;
    public final /* synthetic */ co3 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo3(long j, fj0 fj0Var, co3 co3Var, CharSequence charSequence) {
        super(2, fj0Var);
        this.N = charSequence;
        this.O = j;
        this.P = co3Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        bo3 bo3Var = new bo3(this.O, fj0Var, this.P, this.N);
        bo3Var.M = obj;
        return bo3Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((bo3) create(hn3.c(obj), (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        long j;
        o53 o53Var;
        co3 co3Var;
        s25 s25Var;
        byte b = this.L;
        if (b == 0) {
            mu0.V(obj);
            TextClassifier c = hn3.c(this.M);
            long j2 = this.O;
            int f = d65.f(j2);
            int e = d65.e(j2);
            CharSequence charSequence = this.N;
            TextSelection.Request.Builder builder = new TextSelection.Request.Builder(charSequence, f, e);
            co3 co3Var2 = this.P;
            TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(co3Var2.d());
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection suggestSelection = c.suggestSelection(defaultLocales.build());
            long c2 = ui4.c(suggestSelection.getSelectionStartIndex(), suggestSelection.getSelectionEndIndex());
            el0 el0Var = el0.I;
            if (i < 31 || suggestSelection.getTextClassification() == null) {
                this.K = c2;
                this.L = (byte) 2;
                if (this.P.b(this.N, c2, c, this) != el0Var) {
                    j = c2;
                }
            } else {
                TextClassification textClassification = suggestSelection.getTextClassification();
                textClassification.getClass();
                s25 c3 = co3Var2.c(charSequence, c2, textClassification);
                o53Var = co3Var2.e;
                this.M = c3;
                this.I = o53Var;
                this.J = co3Var2;
                this.K = c2;
                this.L = (byte) 1;
                if (o53Var.e(this) != el0Var) {
                    co3Var = co3Var2;
                    s25Var = c3;
                    j = c2;
                    co3Var.g.setValue(s25Var);
                }
            }
            return el0Var;
        }
        if (b == 1) {
            j = this.K;
            co3Var = this.J;
            o53Var = this.I;
            s25Var = (s25) this.M;
            mu0.V(obj);
            try {
                co3Var.g.setValue(s25Var);
            } finally {
                o53Var.g(null);
            }
        } else {
            if (b != 2) {
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.K;
            mu0.V(obj);
        }
        return new d65(j);
    }
}

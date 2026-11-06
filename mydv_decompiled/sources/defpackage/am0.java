package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class am0 extends r92 implements tm1 {
    public final /* synthetic */ byte J;
    public final /* synthetic */ Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ am0(Object obj, byte b) {
        super(1);
        this.J = b;
        this.K = obj;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        switch (this.J) {
            case 0:
                return Boolean.valueOf(!j42.c(obj, ((ea5) this.K).d.getValue()));
            case 1:
                ((n54) obj).b(((Number) ((cw4) this.K).getValue()).floatValue());
                return wd5.a;
            case 2:
                ((fl2) this.K).cancel(false);
                return wd5.a;
            case 3:
                return obj == ((e43) this.K) ? "(this)" : String.valueOf(obj);
            case 4:
                return obj == ((f43) this.K) ? "(this)" : String.valueOf(obj);
            case 5:
                return obj == ((ja4) this.K) ? "(this)" : String.valueOf(obj);
            default:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    fw4 fw4Var = ((yp4) this.K).g;
                    te1 te1Var = new te1(th);
                    fw4Var.getClass();
                    fw4Var.i(null, te1Var);
                }
                Object obj2 = yp4.k;
                yp4 yp4Var = (yp4) this.K;
                synchronized (obj2) {
                    yp4.j.remove(yp4Var.b().getAbsolutePath());
                }
                return wd5.a;
        }
    }
}

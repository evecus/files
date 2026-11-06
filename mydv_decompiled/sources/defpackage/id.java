package defpackage;

import android.os.Build;
import android.view.View;
import com.github.mytv.dv.widget.WidgetPlayback;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class id implements ag1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ id(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fe, code lost:
    
        if (defpackage.k21.u0(r1, r5, r13) == r3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0100, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007a, code lost:
    
        if (r4 == r3) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.github.mytv.dv.widget.WidgetPlayback r18, defpackage.fj0 r19) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.id.a(com.github.mytv.dv.widget.WidgetPlayback, fj0):java.lang.Object");
    }

    @Override // defpackage.ag1
    public final Object emit(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = null;
        wd5 wd5Var = wd5.a;
        Object obj3 = this.J;
        switch (b) {
            case 0:
                g12 g12Var = (g12) obj3;
                if (Build.VERSION.SDK_INT >= 34) {
                    l5.n(g12Var.q(), (View) g12Var.J);
                }
                return wd5Var;
            case 1:
                ej1 ej1Var = ej1.T;
                Iterator it = ((List) obj).iterator();
                if (it.hasNext()) {
                    obj2 = it.next();
                }
                mu5 mu5Var = (mu5) obj2;
                r41 r41Var = (r41) obj3;
                r41Var.e = mu5Var;
                bu5 bu5Var = bu5.c;
                if (mu5Var != null) {
                    cu5 cu5Var = (cu5) mu5Var.c.get(ej1Var);
                    if (cu5Var == null) {
                        cu5Var = new cu5(ej1Var, bu5Var);
                    }
                    bu5Var = cu5Var.b;
                }
                r41Var.b.setValue(bu5Var);
                return wd5Var;
            case 2:
                ((r24) obj3).I = obj;
                throw new f1(this);
            case 3:
                i83 i83Var = (i83) obj;
                q73 q73Var = (q73) obj3;
                if (j42.c(i83Var, g83.a)) {
                    q73Var.b();
                } else {
                    if (!(i83Var instanceof h83)) {
                        s83.v();
                        return null;
                    }
                    q73Var.a(((h83) i83Var).a.getRoute(), new be(i83Var, q73Var, (byte) 16));
                }
                return wd5Var;
            case 4:
                return a((WidgetPlayback) obj, fj0Var);
            default:
                c32 c32Var = (c32) obj;
                gt4 gt4Var = (gt4) obj3;
                if (c32Var instanceof th1) {
                    gt4Var.add(c32Var);
                } else if (c32Var instanceof uh1) {
                    gt4Var.remove(((uh1) c32Var).a);
                } else if (c32Var instanceof vs3) {
                    gt4Var.add(c32Var);
                } else if (c32Var instanceof ws3) {
                    gt4Var.remove(((ws3) c32Var).a);
                } else if (c32Var instanceof us3) {
                    gt4Var.remove(((us3) c32Var).a);
                } else if (c32Var instanceof i31) {
                    gt4Var.add(c32Var);
                } else if (c32Var instanceof j31) {
                    gt4Var.remove(((j31) c32Var).a);
                } else if (c32Var instanceof h31) {
                    gt4Var.remove(((h31) c32Var).a);
                }
                return wd5Var;
        }
    }
}

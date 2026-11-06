package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gw0 extends RuntimeException {
    public final vd0 I;

    public gw0(vd0 vd0Var) {
        this.I = vd0Var;
        if (vd0Var.b) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = vd0Var.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            wd0 wd0Var = (wd0) list.get(i);
            if (!dq.L0(wd0Var.a, iArr)) {
                if (wd0Var.a == 100) {
                    int i3 = i + 2;
                    if (i3 < size && ((wd0) list.get(i3)).a == 1000) {
                        break;
                    } else {
                        u70.M0(arrayList);
                    }
                } else {
                    arrayList.add(wd0Var);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            stackTraceElementArr[i4] = new StackTraceElement("$$compose", hf1.u(((wd0) arrayList.get(i4)).a, "m$"), "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        vd0 vd0Var = this.I;
        if (!vd0Var.b) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        mk2 K = p70.K();
        List list = vd0Var.a;
        list.getClass();
        xv2 xv2Var = new xv2(list);
        int c = xv2Var.c();
        for (int i = 0; i < c; i++) {
            ((wd0) xv2Var.get(i)).getClass();
        }
        mk2 D = p70.D(K);
        D.getClass();
        xv2 xv2Var2 = new xv2(D);
        int c2 = xv2Var2.c();
        for (int i2 = 0; i2 < c2; i2++) {
            String str = (String) xv2Var2.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}

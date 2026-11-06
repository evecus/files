package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class dd1 extends fb4 {
    public final Object e;
    public final String f;
    public final pi5 g;
    public final os4 h;

    public dd1(Object obj, String str, k04 k04Var, pi5 pi5Var) {
        Collection asList;
        this.e = obj;
        this.f = str;
        this.g = pi5Var;
        os4 os4Var = new os4(str + " value: " + obj);
        StackTraceElement[] stackTrace = os4Var.getStackTrace();
        stackTrace.getClass();
        int length = stackTrace.length + (-2);
        length = length < 0 ? 0 : length;
        if (length < 0) {
            s83.h(r7.z("Requested element count ", length, " is less than zero."));
            throw null;
        }
        if (length == 0) {
            asList = o91.I;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                asList = dq.o1(stackTrace);
            } else if (length == 1) {
                asList = p70.j0(stackTrace[length2 - 1]);
            } else {
                asList = Arrays.asList(dq.W0(stackTrace, length2 - length, length2));
                asList.getClass();
            }
        }
        os4Var.setStackTrace((StackTraceElement[]) asList.toArray(new StackTraceElement[0]));
        this.h = os4Var;
    }

    @Override // defpackage.fb4
    public final Object i() {
        int ordinal = this.g.ordinal();
        if (ordinal == 0) {
            throw this.h;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return null;
            }
            s83.v();
            return null;
        }
        Log.d("do4", this.f + " value: " + this.e);
        return null;
    }
}

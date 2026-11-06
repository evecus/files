package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class l73 extends j73 {
    public final v83 f;
    public final String g;
    public final ArrayList h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l73(v83 v83Var, String str) {
        super(v83Var.b(sv2.D(p73.class)), null);
        v83Var.getClass();
        str.getClass();
        this.h = new ArrayList();
        this.f = v83Var;
        this.g = str;
    }

    public final k73 c() {
        int hashCode;
        k73 k73Var = (k73) super.a();
        n73 n73Var = k73Var.N;
        n73Var.getClass();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            i73 i73Var = (i73) obj;
            if (i73Var != null) {
                cu4 cu4Var = n73Var.b;
                k73 k73Var2 = n73Var.a;
                c8 c8Var = k73Var2.J;
                c8 c8Var2 = i73Var.J;
                int i2 = c8Var2.b;
                String str = (String) c8Var2.f;
                if (i2 == 0 && str == null) {
                    s83.t("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                    return null;
                }
                String str2 = (String) c8Var.f;
                if (str2 != null && j42.c(str, str2)) {
                    s83.u("Destination ", i73Var, " cannot have the same route as graph ", k73Var2);
                    return null;
                }
                if (i2 == c8Var.b) {
                    s83.u("Destination ", i73Var, " cannot have the same id as graph ", k73Var2);
                    return null;
                }
                i73 i73Var2 = (i73) qb.y(cu4Var, i2);
                if (i73Var2 == i73Var) {
                    continue;
                } else {
                    if (i73Var.K != null) {
                        zy.i("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                        return null;
                    }
                    if (i73Var2 != null) {
                        i73Var2.K = null;
                    }
                    i73Var.K = k73Var2;
                    cu4Var.d(c8Var2.b, i73Var);
                }
            }
        }
        String str3 = this.g;
        if (str3 == null) {
            if (this.b != null) {
                zy.i("You must set a start destination route");
                return null;
            }
            zy.i("You must set a start destination id");
            return null;
        }
        k73 k73Var3 = n73Var.a;
        if (str3 != null) {
            if (str3.equals((String) k73Var3.J.f)) {
                s83.u("Start destination ", str3, " cannot use the same route as the graph ", k73Var3);
            } else if (jx4.L(str3)) {
                s83.t("Cannot have an empty start destination route");
            } else {
                int i3 = i73.M;
                hashCode = "android-app://androidx.navigation/".concat(str3).hashCode();
            }
            return k73Var;
        }
        hashCode = 0;
        n73Var.c = hashCode;
        n73Var.e = str3;
        return k73Var;
    }
}

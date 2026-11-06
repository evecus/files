package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class q73 {
    public final Context a;
    public final a73 b;
    public final yc c;
    public final Activity d;
    public boolean e;
    public final jt f;
    public final boolean g;

    public q73(Context context) {
        Object obj;
        context.getClass();
        this.a = context;
        this.b = new a73(this, new v63(this, (byte) 0));
        byte b = 2;
        this.c = new yc(context, (byte) 2);
        Iterator it = qj4.x(context, new yy0((byte) 24)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.d = (Activity) obj;
        this.f = new jt(this, b);
        this.g = true;
        v83 v83Var = this.b.t;
        v83Var.a(new p73(v83Var));
        this.b.t.a(new i7(this.a));
        new u05(new v63(this, (byte) 1));
    }

    public final void a(String str, tm1 tm1Var) {
        str.getClass();
        a73 a73Var = this.b;
        a73Var.getClass();
        d83 S = il2.S(tm1Var);
        if (a73Var.c == null) {
            zl1.h("Cannot navigate to ", str, ". Navigation graph has not been set for NavController ", a73Var, 46);
            return;
        }
        k73 j = a73Var.j();
        h73 h = j.h(str, true, j);
        if (h == null) {
            zy.j(r7.E("Navigation destination that matches route ", str, " cannot be found in the navigation graph "), a73Var.c);
            return;
        }
        i73 i73Var = h.I;
        Bundle c = i73Var.c(h.J);
        if (c == null) {
            c = i42.b0((uj3[]) Arrays.copyOf(new uj3[0], 0));
        }
        int i = i73.M;
        String str2 = (String) i73Var.J.f;
        Uri parse = Uri.parse(str2 != null ? "android-app://androidx.navigation/".concat(str2) : "");
        parse.getClass();
        pn d = lq2.G(parse).d();
        Intent intent = new Intent();
        intent.setDataAndType((Uri) d.b, null);
        intent.setAction(null);
        c.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        a73Var.l(i73Var, c, S);
    }

    public final void b() {
        a73 a73Var = this.b;
        if (a73Var.f.isEmpty()) {
            return;
        }
        i73 g = a73Var.g();
        g.getClass();
        if (a73Var.m(g.J.b, true, false)) {
            a73Var.b();
        }
    }
}

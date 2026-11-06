package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class vv5 {
    public static final yv5 b;
    public final yv5 a;

    static {
        int i = Build.VERSION.SDK_INT;
        b = (i >= 36 ? new lv5() : i >= 35 ? new kv5() : i >= 34 ? new jv5() : i >= 31 ? new iv5() : i >= 30 ? new hv5() : i >= 29 ? new gv5() : new fv5()).b().a.a().a.b().a.c();
    }

    public vv5(yv5 yv5Var) {
        this.a = yv5Var;
    }

    public yv5 a() {
        return this.a;
    }

    public yv5 b() {
        return this.a;
    }

    public yv5 c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv5)) {
            return false;
        }
        vv5 vv5Var = (vv5) obj;
        return t() == vv5Var.t() && s() == vv5Var.s() && Objects.equals(n(), vv5Var.n()) && Objects.equals(l(), vv5Var.l()) && Objects.equals(h(), vv5Var.h());
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public List<Rect> g(int i) {
        return Collections.EMPTY_LIST;
    }

    public tx0 h() {
        return null;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(t()), Boolean.valueOf(s()), n(), l(), h());
    }

    public o12 i(int i) {
        return o12.e;
    }

    public o12 j(int i) {
        if ((i & 8) == 0) {
            return o12.e;
        }
        s83.t("Unable to query the maximum insets for IME");
        return null;
    }

    public o12 k() {
        return n();
    }

    public o12 l() {
        return o12.e;
    }

    public o12 m() {
        return n();
    }

    public o12 n() {
        return o12.e;
    }

    public o12 o() {
        return n();
    }

    public yv5 r(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean s() {
        return false;
    }

    public boolean t() {
        return false;
    }

    public boolean u(int i) {
        return true;
    }

    public void q() {
    }

    public void A(int i) {
    }

    public void B(Rect[][] rectArr) {
    }

    public void C(Rect[][] rectArr) {
    }

    public void d(View view) {
    }

    public void e(yv5 yv5Var) {
    }

    public void p(View view) {
    }

    public void v(vx0 vx0Var) {
    }

    public void w(o12[] o12VarArr) {
    }

    public void x(o12 o12Var) {
    }

    public void y(yv5 yv5Var) {
    }

    public void z(o12 o12Var) {
    }
}

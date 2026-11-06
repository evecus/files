package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.RemoteViews;
import com.github.mytv.dv.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class mc2 {
    public static final Map a = sv2.K(new uj3(rc2.L, Integer.valueOf(R.layout.glance_text)), new uj3(rc2.M, Integer.valueOf(R.layout.glance_list)), new uj3(rc2.N, Integer.valueOf(R.layout.glance_check_box)), new uj3(rc2.O, Integer.valueOf(R.layout.glance_check_box_backport)), new uj3(rc2.P, Integer.valueOf(R.layout.glance_button)), new uj3(rc2.Z, Integer.valueOf(R.layout.glance_swtch)), new uj3(rc2.a0, Integer.valueOf(R.layout.glance_swtch_backport)), new uj3(rc2.Q, Integer.valueOf(R.layout.glance_frame)), new uj3(rc2.b0, Integer.valueOf(R.layout.glance_image_crop)), new uj3(rc2.e0, Integer.valueOf(R.layout.glance_image_crop_decorative)), new uj3(rc2.c0, Integer.valueOf(R.layout.glance_image_fit)), new uj3(rc2.f0, Integer.valueOf(R.layout.glance_image_fit_decorative)), new uj3(rc2.d0, Integer.valueOf(R.layout.glance_image_fill_bounds)), new uj3(rc2.g0, Integer.valueOf(R.layout.glance_image_fill_bounds_decorative)), new uj3(rc2.R, Integer.valueOf(R.layout.glance_linear_progress_indicator)), new uj3(rc2.S, Integer.valueOf(R.layout.glance_circular_progress_indicator)), new uj3(rc2.T, Integer.valueOf(R.layout.glance_vertical_grid_one_column)), new uj3(rc2.U, Integer.valueOf(R.layout.glance_vertical_grid_two_columns)), new uj3(rc2.V, Integer.valueOf(R.layout.glance_vertical_grid_three_columns)), new uj3(rc2.W, Integer.valueOf(R.layout.glance_vertical_grid_four_columns)), new uj3(rc2.X, Integer.valueOf(R.layout.glance_vertical_grid_five_columns)), new uj3(rc2.Y, Integer.valueOf(R.layout.glance_vertical_grid_auto_fit)), new uj3(rc2.h0, Integer.valueOf(R.layout.glance_radio_button)), new uj3(rc2.i0, Integer.valueOf(R.layout.glance_radio_button_backport)));
    public static final int b;
    public static final int c;

    static {
        int size = to1.f.size();
        b = size;
        c = Build.VERSION.SDK_INT >= 31 ? to1.h : to1.h / size;
    }

    public static final x34 a(ha5 ha5Var, lq1 lq1Var, int i) {
        Map singletonMap;
        Context context = ha5Var.a;
        Integer valueOf = Integer.valueOf(R.id.rootStubId);
        int i2 = Build.VERSION.SDK_INT;
        nc2 nc2Var = nc2.I;
        if (i2 >= 31) {
            short s = to1.h;
            if (i >= s) {
                s83.h(r7.x(s, i, "Index of the root view cannot be more than ", ", currently "));
                return null;
            }
            tq4 tq4Var = new tq4(nc2Var, nc2Var);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), to1.g + i);
            yt5 yt5Var = (yt5) lq1Var.foldIn(null, cx1.O);
            if (yt5Var != null) {
                a5.m(remoteViews, yt5Var, R.id.rootView);
            }
            dt1 dt1Var = (dt1) lq1Var.foldIn(null, cx1.P);
            if (dt1Var != null) {
                a5.l(remoteViews, dt1Var, R.id.rootView);
            }
            if (i2 >= 33) {
                remoteViews.removeAllViews(R.id.rootView);
            }
            if (i2 >= 33) {
                singletonMap = p91.I;
            } else {
                Map singletonMap2 = Collections.singletonMap(tq4Var, valueOf);
                singletonMap2.getClass();
                singletonMap = Collections.singletonMap(0, singletonMap2);
                singletonMap.getClass();
            }
            return new x34(remoteViews, new n12(R.id.rootView, 0, singletonMap, 2));
        }
        int i3 = b * i;
        short s2 = to1.h;
        if (i3 >= s2) {
            or0.f("Index of the root view cannot be more than ", s2 / 4, i, ", currently ");
            return null;
        }
        yt5 yt5Var2 = (yt5) lq1Var.foldIn(null, cx1.M);
        ex0 ex0Var = dx0.a;
        ex0 ex0Var2 = yt5Var2 != null ? yt5Var2.a : ex0Var;
        dt1 dt1Var2 = (dt1) lq1Var.foldIn(null, cx1.N);
        if (dt1Var2 != null) {
            ex0Var = dt1Var2.a;
        }
        cx0 cx0Var = cx0.a;
        boolean equals = ex0Var2.equals(cx0Var);
        nc2 nc2Var2 = nc2.L;
        nc2 nc2Var3 = equals ? nc2Var2 : nc2Var;
        if (!ex0Var.equals(cx0Var)) {
            nc2Var2 = nc2Var;
        }
        nc2 nc2Var4 = nc2.J;
        nc2 nc2Var5 = nc2Var3 == nc2Var4 ? nc2Var : nc2Var3;
        if (nc2Var2 != nc2Var4) {
            nc2Var = nc2Var2;
        }
        tq4 tq4Var2 = new tq4(nc2Var5, nc2Var);
        Integer num = (Integer) to1.f.get(tq4Var2);
        if (num != null) {
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), i3 + to1.g + num.intValue());
            Map singletonMap3 = Collections.singletonMap(tq4Var2, valueOf);
            singletonMap3.getClass();
            Map singletonMap4 = Collections.singletonMap(0, singletonMap3);
            singletonMap4.getClass();
            return new x34(remoteViews2, new n12(0, 0, singletonMap4, 3));
        }
        throw new IllegalStateException("Cannot find root element for size [" + nc2Var3 + ", " + nc2Var2 + ']');
    }

    public static final n12 b(RemoteViews remoteViews, ha5 ha5Var, rc2 rc2Var, int i, lq1 lq1Var, r8 r8Var, s8 s8Var) {
        int intValue;
        if (i > 10) {
            Log.e("GlanceAppWidget", "Truncated " + rc2Var + " container from " + i + " to 10 elements", new IllegalArgumentException(rc2Var + " container cannot have more than 10 elements"));
        }
        int i2 = i <= 10 ? i : 10;
        Integer f = f(rc2Var, lq1Var);
        if (f != null) {
            intValue = f.intValue();
        } else {
            nh0 nh0Var = (nh0) to1.a.get(new oh0(rc2Var, i2, r8Var, s8Var));
            Integer valueOf = nh0Var != null ? Integer.valueOf(nh0Var.a) : null;
            if (valueOf == null) {
                throw new IllegalArgumentException("Cannot find container " + rc2Var + " with " + i + " children");
            }
            intValue = valueOf.intValue();
        }
        Map map = (Map) to1.b.get(rc2Var);
        if (map == null) {
            hn3.i(rc2Var, "Cannot find generated children for ");
            return null;
        }
        n12 d = d(remoteViews, ha5Var, intValue, lq1Var);
        int i3 = d.a;
        n12 n12Var = new n12(i3, d.b, map);
        if (Build.VERSION.SDK_INT >= 33) {
            remoteViews.removeAllViews(i3);
        }
        return n12Var;
    }

    public static final n12 c(RemoteViews remoteViews, ha5 ha5Var, rc2 rc2Var, lq1 lq1Var) {
        Integer f = f(rc2Var, lq1Var);
        if (f != null || (f = (Integer) a.get(rc2Var)) != null) {
            return d(remoteViews, ha5Var, f.intValue(), lq1Var);
        }
        hn3.i(rc2Var, "Cannot use `insertView` with a container like ");
        return null;
    }

    public static final n12 d(RemoteViews remoteViews, ha5 ha5Var, int i, lq1 lq1Var) {
        Integer valueOf;
        int i2;
        int i3 = ha5Var.e;
        yt5 yt5Var = (yt5) lq1Var.foldIn(null, cx1.Q);
        ex0 ex0Var = dx0.a;
        ex0 ex0Var2 = yt5Var != null ? yt5Var.a : ex0Var;
        dt1 dt1Var = (dt1) lq1Var.foldIn(null, cx1.R);
        if (dt1Var != null) {
            ex0Var = dt1Var.a;
        }
        if (lq1Var.c(new c22((byte) 5))) {
            valueOf = null;
        } else {
            if (ha5Var.i.getAndSet(true)) {
                zy.i("At most one view can be set as AppWidgetBackground.");
                return null;
            }
            valueOf = Integer.valueOf(android.R.id.background);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            if (valueOf != null) {
                i2 = valueOf.intValue();
            } else {
                int incrementAndGet = ha5Var.g.incrementAndGet();
                if (incrementAndGet >= to1.j) {
                    zy.i("There are too many views");
                    return null;
                }
                i2 = incrementAndGet + to1.i;
            }
            RemoteViews s = ub.s(i, i2, ha5Var.a.getPackageName());
            int i5 = ha5Var.h.a;
            if (i4 >= 31) {
                ub.a(remoteViews, i5, s, i3);
            } else {
                remoteViews.addView(i5, s);
            }
            return new n12(i2, 0, null, 6);
        }
        if (i4 >= 31) {
            bx0 bx0Var = bx0.a;
            boolean equals = ex0Var2.equals(bx0Var);
            nc2 nc2Var = nc2.I;
            nc2 nc2Var2 = nc2.K;
            nc2 nc2Var3 = equals ? nc2Var2 : nc2Var;
            if (ex0Var.equals(bx0Var)) {
                nc2Var = nc2Var2;
            }
            return new n12(hc4.V(remoteViews, ha5Var, e(remoteViews, ha5Var, i3, nc2Var3, nc2Var), i, valueOf), 0, null, 6);
        }
        nc2 g = g(ex0Var2);
        nc2 g2 = g(ex0Var);
        int e = e(remoteViews, ha5Var, i3, g, g2);
        nc2 nc2Var4 = nc2.J;
        if (g != nc2Var4 && g2 != nc2Var4) {
            return new n12(hc4.V(remoteViews, ha5Var, e, i, valueOf), 0, null, 6);
        }
        ia2 ia2Var = (ia2) to1.e.get(new tq4(g, g2));
        if (ia2Var != null) {
            return new n12(hc4.V(remoteViews, ha5Var, R.id.glanceViewStub, i, valueOf), hc4.V(remoteViews, ha5Var, e, ia2Var.a, null), null, 4);
        }
        j0.k("Could not find complex layout for width=", g, ", height=", g2);
        return null;
    }

    public static final int e(RemoteViews remoteViews, ha5 ha5Var, int i, nc2 nc2Var, nc2 nc2Var2) {
        nc2 nc2Var3 = nc2.I;
        nc2 nc2Var4 = nc2.J;
        nc2 nc2Var5 = nc2Var == nc2Var4 ? nc2Var3 : nc2Var;
        if (nc2Var2 != nc2Var4) {
            nc2Var3 = nc2Var2;
        }
        tq4 tq4Var = new tq4(nc2Var5, nc2Var3);
        Map map = (Map) ha5Var.h.c.get(Integer.valueOf(i));
        int i2 = 0;
        if (map == null) {
            zy.i(hf1.u(i, "Parent doesn't have child position "));
            return 0;
        }
        Integer num = (Integer) map.get(tq4Var);
        if (num == null) {
            throw new IllegalStateException("No child for position " + i + " and size " + nc2Var + " x " + nc2Var2);
        }
        int intValue = num.intValue();
        Collection values = map.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (((Number) obj).intValue() != intValue) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            hc4.V(remoteViews, ha5Var, ((Number) obj2).intValue(), R.layout.glance_deleted_view, Integer.valueOf(R.id.deletedViewId));
        }
        return intValue;
    }

    public static final Integer f(rc2 rc2Var, lq1 lq1Var) {
        if (Build.VERSION.SDK_INT >= 33) {
            e9 e9Var = (e9) lq1Var.foldIn(null, cx1.S);
            yt5 yt5Var = (yt5) lq1Var.foldIn(null, cx1.T);
            bx0 bx0Var = bx0.a;
            boolean equals = yt5Var != null ? yt5Var.a.equals(bx0Var) : false;
            dt1 dt1Var = (dt1) lq1Var.foldIn(null, cx1.U);
            boolean equals2 = dt1Var != null ? dt1Var.a.equals(bx0Var) : false;
            if (e9Var != null) {
                t8 t8Var = e9Var.a;
                ia2 ia2Var = (ia2) to1.c.get(new lx(rc2Var, t8Var.a, t8Var.b));
                if (ia2Var != null) {
                    return Integer.valueOf(ia2Var.a);
                }
                j0.k("Cannot find ", rc2Var, " with alignment ", t8Var);
                return null;
            }
            if (equals || equals2) {
                ia2 ia2Var2 = (ia2) to1.d.get(new o74(rc2Var, equals, equals2));
                if (ia2Var2 != null) {
                    return Integer.valueOf(ia2Var2.a);
                }
                hn3.h(rc2Var, " with defaultWeight set", "Cannot find ");
                return null;
            }
        }
        return null;
    }

    public static final nc2 g(ex0 ex0Var) {
        if (ex0Var instanceof dx0) {
            return nc2.I;
        }
        if (ex0Var instanceof bx0) {
            return nc2.K;
        }
        if (ex0Var instanceof cx0) {
            return nc2.L;
        }
        if (ex0Var instanceof ax0) {
            return nc2.J;
        }
        s83.v();
        return null;
    }
}

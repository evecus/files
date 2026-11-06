package com.materialkolor.ktx;

import defpackage.p70;
import defpackage.qb;
import defpackage.x70;
import defpackage.ys1;
import defpackage.zs1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class HctKt {
    /* renamed from: from-4WTKRHQ, reason: not valid java name */
    public static final zs1 m183from4WTKRHQ(ys1 ys1Var, long j) {
        ys1Var.getClass();
        return new zs1(qb.i0(j));
    }

    public static final long toColor(zs1 zs1Var) {
        zs1Var.getClass();
        return qb.i(zs1Var.a);
    }

    public static final List<x70> toColors(List<zs1> list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(p70.J(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new x70(toColor((zs1) it.next())));
        }
        return arrayList;
    }

    /* renamed from: toHct-8_81llA, reason: not valid java name */
    public static final zs1 m184toHct8_81llA(long j) {
        return m183from4WTKRHQ(zs1.e, j);
    }

    public static final List<zs1> toHcts(List<x70> list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(p70.J(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m184toHct8_81llA(((x70) it.next()).a));
        }
        return arrayList;
    }
}

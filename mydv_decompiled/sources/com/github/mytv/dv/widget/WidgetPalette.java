package com.github.mytv.dv.widget;

import defpackage.i80;
import defpackage.j80;
import defpackage.jl2;
import defpackage.k80;
import defpackage.l51;
import defpackage.pp0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class WidgetPalette {
    public static final int $stable = 0;
    private final k80 dark;
    private final boolean isDark;
    private final k80 light;
    private final i80 onPrimaryFixed;
    private final i80 primaryFixed;
    private final j80 providers;
    private final i80 surfaceContainer;
    private final i80 surfaceContainerHigh;
    private final i80 surfaceContainerHighest;
    private final i80 surfaceContainerLow;

    public WidgetPalette(k80 k80Var, k80 k80Var2, boolean z) {
        k80Var.getClass();
        k80Var2.getClass();
        this.light = k80Var;
        this.dark = k80Var2;
        this.isDark = z;
        pp0 pp0Var = new pp0(k80Var.a, k80Var2.a);
        pp0 pp0Var2 = new pp0(k80Var.b, k80Var2.b);
        pp0 pp0Var3 = new pp0(k80Var.c, k80Var2.c);
        pp0 pp0Var4 = new pp0(k80Var.d, k80Var2.d);
        pp0 pp0Var5 = new pp0(k80Var.f, k80Var2.f);
        pp0 pp0Var6 = new pp0(k80Var.g, k80Var2.g);
        long j = k80Var.h;
        long j2 = k80Var2.h;
        this.providers = new l51(pp0Var, pp0Var2, pp0Var3, pp0Var4, pp0Var5, pp0Var6, new pp0(j, j2), new pp0(k80Var.i, k80Var2.i), new pp0(k80Var.j, k80Var2.j), new pp0(k80Var.k, k80Var2.k), new pp0(k80Var.l, k80Var2.l), new pp0(k80Var.m, k80Var2.m), new pp0(k80Var.w, k80Var2.w), new pp0(k80Var.y, k80Var2.y), new pp0(k80Var.x, k80Var2.x), new pp0(k80Var.z, k80Var2.z), new pp0(k80Var.n, k80Var2.n), new pp0(k80Var.o, k80Var2.o), new pp0(k80Var.p, k80Var2.p), new pp0(k80Var.q, k80Var2.q), new pp0(k80Var.r, k80Var2.r), new pp0(k80Var.s, k80Var2.s), new pp0(k80Var.A, k80Var2.A), new pp0(k80Var.v, k80Var2.v), new pp0(k80Var.u, k80Var2.u), new pp0(k80Var.e, k80Var2.e), new pp0(jl2.k(j), jl2.k(j2)));
        this.surfaceContainerLow = new pp0(k80Var.I, k80Var2.I);
        this.surfaceContainer = new pp0(k80Var.F, k80Var2.F);
        this.surfaceContainerHigh = new pp0(k80Var.G, k80Var2.G);
        this.surfaceContainerHighest = new pp0(k80Var.H, k80Var2.H);
        this.primaryFixed = new pp0(k80Var.K, k80Var2.K);
        this.onPrimaryFixed = new pp0(k80Var.M, k80Var2.M);
    }

    public final k80 getCurrent() {
        return this.isDark ? this.dark : this.light;
    }

    public final k80 getDark() {
        return this.dark;
    }

    public final k80 getLight() {
        return this.light;
    }

    public final i80 getOnPrimaryFixed() {
        return this.onPrimaryFixed;
    }

    public final i80 getPrimaryFixed() {
        return this.primaryFixed;
    }

    public final j80 getProviders() {
        return this.providers;
    }

    public final i80 getSurfaceContainer() {
        return this.surfaceContainer;
    }

    public final i80 getSurfaceContainerHigh() {
        return this.surfaceContainerHigh;
    }

    public final i80 getSurfaceContainerHighest() {
        return this.surfaceContainerHighest;
    }

    public final i80 getSurfaceContainerLow() {
        return this.surfaceContainerLow;
    }

    public final boolean isDark() {
        return this.isDark;
    }
}

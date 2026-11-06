package defpackage;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class zc4 {
    public static final uc4 Companion = new uc4();
    public final fl4 a;
    public final Context b;
    public final fw4 c;
    public final p04 d;
    public final mn4 e;
    public final n04 f;
    public final mn4 g;
    public final n04 h;
    public vc4 i;
    public volatile wc4 j;
    public final ConcurrentHashMap.KeySetView k;
    public volatile String l;
    public final zf1 m;

    public zc4(Application application, fl4 fl4Var) {
        this.a = fl4Var;
        Context applicationContext = application.getApplicationContext();
        this.b = applicationContext != null ? applicationContext : application;
        fw4 c = o7.c(dg0.I);
        this.c = c;
        this.d = sv2.j(c);
        ez ezVar = ez.J;
        mn4 b = o7.b(1, 1, ezVar);
        this.e = b;
        this.f = new n04(b);
        mn4 b2 = o7.b(1, 1, ezVar);
        this.g = b2;
        this.h = new n04(b2);
        ConcurrentHashMap.KeySetView newKeySet = ConcurrentHashMap.newKeySet();
        newKeySet.getClass();
        this.k = newKeySet;
        this.l = "";
        zf1 p = o7.p(new ig1(vt0.g(new u00(new gu2(this, null, (byte) 13)), -1), this, (byte) 4));
        os0 os0Var = sx0.a;
        this.m = vt0.s(p, ur0.I);
    }

    public final void a() {
        try {
            wc4 wc4Var = this.j;
            this.j = null;
            vc4 vc4Var = this.i;
            if (vc4Var != null) {
                vc4Var.f();
            }
            this.i = null;
            if (wc4Var != null) {
                wc4Var.u();
            }
            this.k.clear();
            fw4 fw4Var = this.c;
            dg0 dg0Var = dg0.I;
            fw4Var.getClass();
            fw4Var.i(null, dg0Var);
            Log.i("SearchInputServer", "搜索输入服务器已停止");
        } catch (Exception e) {
            Log.e("SearchInputServer", "服务器停止失败", e);
        }
    }
}

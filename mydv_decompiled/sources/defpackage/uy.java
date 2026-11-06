package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class uy extends pg0 {
    public final hl f;

    public uy(Context context, mc3 mc3Var) {
        super(context, mc3Var);
        this.f = new hl(this, (byte) 1);
    }

    @Override // defpackage.pg0
    public final void c() {
        fr2.e().a(vy.a, getClass().getSimpleName().concat(": registering receiver"));
        this.b.registerReceiver(this.f, e());
    }

    @Override // defpackage.pg0
    public final void d() {
        fr2.e().a(vy.a, getClass().getSimpleName().concat(": unregistering receiver"));
        this.b.unregisterReceiver(this.f);
    }

    public IntentFilter e() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    public abstract void f(Intent intent);
}

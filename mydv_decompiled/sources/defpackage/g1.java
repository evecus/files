package defpackage;

import androidx.appcompat.widget.ActionBarContextView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class g1 implements cs5 {
    public boolean a = false;
    public byte b;
    public final /* synthetic */ ActionBarContextView c;

    public g1(ActionBarContextView actionBarContextView) {
        this.c = actionBarContextView;
    }

    @Override // defpackage.cs5
    public final void a() {
        this.a = true;
    }

    @Override // defpackage.cs5
    public final void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.a = false;
    }

    @Override // defpackage.cs5
    public final void c() {
        if (this.a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.c;
        actionBarContextView.N = null;
        super/*android.view.ViewGroup*/.setVisibility(this.b);
    }
}

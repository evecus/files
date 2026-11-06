package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class fk3 extends lw4 implements Parcelable, bt4, t43, cw4 {
    public static final Parcelable.Creator<fk3> CREATOR = new ek3((byte) 0);
    public ys4 J;

    public fk3(float f) {
        ns4 h = ws4.h();
        ys4 ys4Var = new ys4(h.g(), f);
        if (!(h instanceof zq1)) {
            ys4Var.b = new ys4(1L, f);
        }
        this.J = ys4Var;
    }

    @Override // defpackage.bt4
    public final q8 b() {
        return q8.B0;
    }

    @Override // defpackage.kw4
    public final mw4 c() {
        return this.J;
    }

    @Override // defpackage.lw4, defpackage.kw4
    public final mw4 d(mw4 mw4Var, mw4 mw4Var2, mw4 mw4Var3) {
        if (((ys4) mw4Var2).c == ((ys4) mw4Var3).c) {
            return mw4Var2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.kw4
    public final void e(mw4 mw4Var) {
        this.J = (ys4) mw4Var;
    }

    @Override // defpackage.cw4
    public final /* bridge */ /* synthetic */ Object getValue() {
        return i82.d(this);
    }

    public final float h() {
        return ((ys4) ws4.t(this.J, this)).c;
    }

    public final void i(float f) {
        ns4 h;
        ys4 ys4Var = (ys4) ws4.f(this.J);
        if (ys4Var.c == f) {
            return;
        }
        ys4 ys4Var2 = this.J;
        synchronized (ws4.c) {
            h = ws4.h();
            ((ys4) ws4.o(ys4Var2, this, h, ys4Var)).c = f;
        }
        ws4.m(h, this);
    }

    @Override // defpackage.t43
    public final /* bridge */ /* synthetic */ void setValue(Object obj) {
        i82.E(this, obj);
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((ys4) ws4.f(this.J)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(h());
    }
}

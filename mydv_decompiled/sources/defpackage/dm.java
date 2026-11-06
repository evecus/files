package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class dm implements jm, DialogInterface.OnClickListener {
    public o8 I;
    public em J;
    public CharSequence K;
    public final /* synthetic */ km L;

    public dm(km kmVar) {
        this.L = kmVar;
    }

    @Override // defpackage.jm
    public final boolean b() {
        o8 o8Var = this.I;
        if (o8Var != null) {
            return o8Var.isShowing();
        }
        return false;
    }

    @Override // defpackage.jm
    public final int c() {
        return 0;
    }

    @Override // defpackage.jm
    public final void dismiss() {
        o8 o8Var = this.I;
        if (o8Var != null) {
            o8Var.dismiss();
            this.I = null;
        }
    }

    @Override // defpackage.jm
    public final void e(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.jm
    public final CharSequence f() {
        return this.K;
    }

    @Override // defpackage.jm
    public final Drawable h() {
        return null;
    }

    @Override // defpackage.jm
    public final void i(CharSequence charSequence) {
        this.K = charSequence;
    }

    @Override // defpackage.jm
    public final void k(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.jm
    public final void m(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.jm
    public final void n(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.jm
    public final void o(int i, int i2) {
        if (this.J == null) {
            return;
        }
        km kmVar = this.L;
        n8 n8Var = new n8(kmVar.getPopupContext());
        CharSequence charSequence = this.K;
        if (charSequence != null) {
            n8Var.setTitle(charSequence);
        }
        em emVar = this.J;
        int selectedItemPosition = kmVar.getSelectedItemPosition();
        j8 j8Var = n8Var.a;
        j8Var.k = emVar;
        j8Var.l = this;
        j8Var.o = selectedItemPosition;
        j8Var.n = true;
        o8 create = n8Var.create();
        this.I = create;
        AlertController$RecycleListView alertController$RecycleListView = create.O.e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.I.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        km kmVar = this.L;
        kmVar.setSelection(i);
        if (kmVar.getOnItemClickListener() != null) {
            kmVar.performItemClick(null, i, this.J.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.jm
    public final int p() {
        return 0;
    }

    @Override // defpackage.jm
    public final void q(ListAdapter listAdapter) {
        this.J = (em) listAdapter;
    }
}

package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class n8 {
    public final j8 a;
    public final int b;

    public n8(Context context, int i) {
        this.a = new j8(new ContextThemeWrapper(context, o8.i(context, i)));
        this.b = i;
    }

    public o8 create() {
        j8 j8Var = this.a;
        o8 o8Var = new o8(j8Var.a, this.b);
        View view = j8Var.e;
        m8 m8Var = o8Var.O;
        if (view != null) {
            m8Var.v = view;
        } else {
            CharSequence charSequence = j8Var.d;
            if (charSequence != null) {
                m8Var.d = charSequence;
                TextView textView = m8Var.t;
                if (textView != null) {
                    textView.setText(charSequence);
                }
                m8Var.c.setTitle(charSequence);
            }
            Drawable drawable = j8Var.c;
            if (drawable != null) {
                m8Var.r = drawable;
                ImageView imageView = m8Var.s;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    m8Var.s.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = j8Var.f;
        if (charSequence2 != null) {
            m8Var.c(-1, charSequence2, j8Var.g);
        }
        CharSequence charSequence3 = j8Var.h;
        if (charSequence3 != null) {
            m8Var.c(-2, charSequence3, j8Var.i);
        }
        if (j8Var.k != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) j8Var.b.inflate(m8Var.z, (ViewGroup) null);
            int i = j8Var.n ? m8Var.A : m8Var.B;
            ListAdapter listAdapter = j8Var.k;
            if (listAdapter == null) {
                listAdapter = new l8(j8Var.a, i, R.id.text1, null);
            }
            m8Var.w = listAdapter;
            m8Var.x = j8Var.o;
            if (j8Var.l != null) {
                alertController$RecycleListView.setOnItemClickListener(new i8(j8Var, m8Var));
            }
            if (j8Var.n) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            m8Var.e = alertController$RecycleListView;
        }
        View view2 = j8Var.m;
        if (view2 != null) {
            m8Var.f = view2;
            m8Var.g = false;
        }
        o8Var.setCancelable(true);
        o8Var.setCanceledOnTouchOutside(true);
        o8Var.setOnCancelListener(null);
        o8Var.setOnDismissListener(null);
        iy2 iy2Var = j8Var.j;
        if (iy2Var != null) {
            o8Var.setOnKeyListener(iy2Var);
        }
        return o8Var;
    }

    public Context getContext() {
        return this.a.a;
    }

    public n8 setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        j8 j8Var = this.a;
        j8Var.h = j8Var.a.getText(i);
        j8Var.i = onClickListener;
        return this;
    }

    public n8 setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        j8 j8Var = this.a;
        j8Var.f = j8Var.a.getText(i);
        j8Var.g = onClickListener;
        return this;
    }

    public n8 setTitle(CharSequence charSequence) {
        this.a.d = charSequence;
        return this;
    }

    public n8 setView(View view) {
        this.a.m = view;
        return this;
    }

    public n8(Context context) {
        this(context, o8.i(context, 0));
    }
}

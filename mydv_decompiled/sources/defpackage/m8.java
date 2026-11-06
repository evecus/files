package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.github.mytv.dv.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class m8 {
    public final int A;
    public final int B;
    public final boolean C;
    public final k8 D;
    public final Context a;
    public final o8 b;
    public final Window c;
    public CharSequence d;
    public AlertController$RecycleListView e;
    public View f;
    public Button h;
    public CharSequence i;
    public Message j;
    public Button k;
    public CharSequence l;
    public Message m;
    public Button n;
    public CharSequence o;
    public Message p;
    public NestedScrollView q;
    public Drawable r;
    public ImageView s;
    public TextView t;
    public TextView u;
    public View v;
    public ListAdapter w;
    public final int y;
    public final int z;
    public boolean g = false;
    public int x = -1;
    public final f6 E = new f6(this, 1);

    public m8(Context context, o8 o8Var, Window window) {
        this.a = context;
        this.b = o8Var;
        this.c = window;
        k8 k8Var = new k8();
        k8Var.a = new WeakReference(o8Var);
        this.D = k8Var;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, qz3.e, R.attr.alertDialogStyle, 0);
        this.y = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.z = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.A = obtainStyledAttributes.getResourceId(7, 0);
        this.B = obtainStyledAttributes.getResourceId(3, 0);
        this.C = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        o8Var.f().h(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void c(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.D.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.o = charSequence;
            this.p = obtainMessage;
        } else if (i == -2) {
            this.l = charSequence;
            this.m = obtainMessage;
        } else if (i != -1) {
            s83.t("Button does not exist");
        } else {
            this.i = charSequence;
            this.j = obtainMessage;
        }
    }
}

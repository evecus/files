package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.github.mytv.dv.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class o8 extends lc0 implements DialogInterface, rk {
    public kl M;
    public final ll N;
    public final m8 O;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [ll] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o8(android.view.ContextThemeWrapper r5, int r6) {
        /*
            r4 = this;
            int r6 = i(r5, r6)
            r0 = 1
            r1 = 2130968700(0x7f04007c, float:1.7546061E38)
            if (r6 != 0) goto L19
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L1a
        L19:
            r2 = r6
        L1a:
            r4.<init>(r5, r2)
            ll r2 = new ll
            r2.<init>()
            r4.N = r2
            xk r2 = r4.f()
            if (r6 != 0) goto L38
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L38:
            r5 = r2
            kl r5 = (defpackage.kl) r5
            r5.z0 = r6
            r2.d()
            m8 r5 = new m8
            android.content.Context r6 = r4.getContext()
            android.view.Window r0 = r4.getWindow()
            r5.<init>(r6, r4, r0)
            r4.O = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o8.<init>(android.view.ContextThemeWrapper, int):void");
    }

    public static int i(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.lc0, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        kl klVar = (kl) f();
        klVar.v();
        ((ViewGroup) klVar.h0.findViewById(android.R.id.content)).addView(view, layoutParams);
        klVar.U.a(klVar.T.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        f().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return e41.A(this.N, getWindow().getDecorView(), this, keyEvent);
    }

    public final xk f() {
        kl klVar = this.M;
        if (klVar != null) {
            return klVar;
        }
        vk vkVar = xk.I;
        kl klVar2 = new kl(getContext(), getWindow(), this, this);
        this.M = klVar2;
        return klVar2;
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        kl klVar = (kl) f();
        klVar.v();
        return klVar.T.findViewById(i);
    }

    public final void h(Bundle bundle) {
        f().a();
        super.onCreate(bundle);
        f().d();
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        kl klVar = (kl) f();
        if (klVar.V != null) {
            klVar.z();
            klVar.V.getClass();
            klVar.A(0);
        }
    }

    public final void j(CharSequence charSequence) {
        super.setTitle(charSequence);
        f().l(charSequence);
    }

    public final boolean l(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.lc0, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View findViewById;
        h(bundle);
        m8 m8Var = this.O;
        m8Var.b.setContentView(m8Var.y);
        Context context = m8Var.a;
        Window window = m8Var.c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        View view = m8Var.f;
        if (view == null) {
            view = null;
        }
        boolean z = view != null;
        if (!z || !m8.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (m8Var.g) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (m8Var.e != null) {
                ((LinearLayout.LayoutParams) ((tj2) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup b = m8.b(findViewById6, findViewById3);
        ViewGroup b2 = m8.b(findViewById7, findViewById4);
        ViewGroup b3 = m8.b(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        m8Var.q = nestedScrollView;
        nestedScrollView.setFocusable(false);
        m8Var.q.setNestedScrollingEnabled(false);
        TextView textView = (TextView) b2.findViewById(android.R.id.message);
        m8Var.u = textView;
        if (textView != null) {
            textView.setVisibility(8);
            m8Var.q.removeView(m8Var.u);
            if (m8Var.e != null) {
                ViewGroup viewGroup2 = (ViewGroup) m8Var.q.getParent();
                int indexOfChild = viewGroup2.indexOfChild(m8Var.q);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(m8Var.e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                b2.setVisibility(8);
            }
        }
        Button button = (Button) b3.findViewById(android.R.id.button1);
        m8Var.h = button;
        f6 f6Var = m8Var.E;
        button.setOnClickListener(f6Var);
        boolean isEmpty = TextUtils.isEmpty(m8Var.i);
        Button button2 = m8Var.h;
        if (isEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText(m8Var.i);
            m8Var.h.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) b3.findViewById(android.R.id.button2);
        m8Var.k = button3;
        button3.setOnClickListener(f6Var);
        boolean isEmpty2 = TextUtils.isEmpty(m8Var.l);
        Button button4 = m8Var.k;
        if (isEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(m8Var.l);
            m8Var.k.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) b3.findViewById(android.R.id.button3);
        m8Var.n = button5;
        button5.setOnClickListener(f6Var);
        boolean isEmpty3 = TextUtils.isEmpty(m8Var.o);
        Button button6 = m8Var.n;
        if (isEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText(m8Var.o);
            m8Var.n.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = m8Var.h;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = m8Var.k;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = m8Var.n;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            b3.setVisibility(8);
        }
        if (m8Var.v != null) {
            b.addView(m8Var.v, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            m8Var.s = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(m8Var.d) || !m8Var.C) {
                window.findViewById(R.id.title_template).setVisibility(8);
                m8Var.s.setVisibility(8);
                b.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                m8Var.t = textView2;
                textView2.setText(m8Var.d);
                Drawable drawable = m8Var.r;
                if (drawable != null) {
                    m8Var.s.setImageDrawable(drawable);
                } else {
                    m8Var.t.setPadding(m8Var.s.getPaddingLeft(), m8Var.s.getPaddingTop(), m8Var.s.getPaddingRight(), m8Var.s.getPaddingBottom());
                    m8Var.s.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i2 = (b == null || b.getVisibility() == 8) ? 0 : 1;
        boolean z3 = b3.getVisibility() != 8;
        if (!z3 && (findViewById = b2.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = m8Var.q;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = m8Var.e != null ? b.findViewById(R.id.titleDividerNoCustom) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = b2.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = m8Var.e;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z3 || i2 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.I, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.J);
            }
        }
        if (!z2) {
            View view2 = m8Var.e;
            if (view2 == null) {
                view2 = m8Var.q;
            }
            if (view2 != null) {
                int i3 = z3 ? 2 : 0;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = dr5.a;
                view2.setScrollIndicators(i2 | i3, 3);
                if (findViewById11 != null) {
                    b2.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    b2.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = m8Var.e;
        if (alertController$RecycleListView2 == null || (listAdapter = m8Var.w) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = m8Var.x;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.O.q;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.O.q;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.lc0, android.app.Dialog
    public final void onStop() {
        super.onStop();
        kl klVar = (kl) f();
        klVar.z();
        qu5 qu5Var = klVar.V;
        if (qu5Var != null) {
            qu5Var.k(false);
        }
    }

    @Override // defpackage.lc0, android.app.Dialog
    public final void setContentView(int i) {
        d();
        f().i(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        j(charSequence);
        m8 m8Var = this.O;
        m8Var.d = charSequence;
        TextView textView = m8Var.t;
        if (textView != null) {
            textView.setText(charSequence);
        }
        m8Var.c.setTitle(charSequence);
    }

    @Override // defpackage.lc0, android.app.Dialog
    public final void setContentView(View view) {
        d();
        f().j(view);
    }

    @Override // defpackage.lc0, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        f().k(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        f().l(getContext().getString(i));
    }
}

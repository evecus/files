package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.github.mytv.dv.R;
import defpackage.ky2;
import defpackage.pn;
import defpackage.qz3;
import defpackage.sx2;
import defpackage.xy2;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class ListMenuItemView extends LinearLayout implements xy2, AbsListView.SelectionBoundsAdjuster {
    public ky2 I;
    public ImageView J;
    public RadioButton K;
    public TextView L;
    public CheckBox M;
    public TextView N;
    public ImageView O;
    public ImageView P;
    public LinearLayout Q;
    public final Drawable R;
    public final int S;
    public final Context T;
    public boolean U;
    public final Drawable V;
    public final boolean W;
    public LayoutInflater a0;
    public boolean b0;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        pn N = pn.N(getContext(), attributeSet, qz3.r, R.attr.listMenuViewStyle);
        this.R = N.v(5);
        TypedArray typedArray = (TypedArray) N.b;
        this.S = typedArray.getResourceId(1, -1);
        this.U = typedArray.getBoolean(7, false);
        this.T = context;
        this.V = N.v(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.W = obtainStyledAttributes.hasValue(0);
        N.T();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        LayoutInflater layoutInflater = this.a0;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater from = LayoutInflater.from(getContext());
        this.a0 = from;
        return from;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.O;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if ((r1.o() ? r0.j : r0.h) != 0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    @Override // defpackage.xy2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.ky2 r11) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.a(ky2):void");
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.P;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.P.getLayoutParams();
        rect.top = this.P.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // defpackage.xy2
    public ky2 getItemData() {
        return this.I;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.R);
        TextView textView = (TextView) findViewById(R.id.title);
        this.L = textView;
        int i = this.S;
        if (i != -1) {
            textView.setTextAppearance(this.T, i);
        }
        this.N = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.O = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.V);
        }
        this.P = (ImageView) findViewById(R.id.group_divider);
        this.Q = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.J != null && this.U) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.J.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        CompoundButton compoundButton3;
        if (!z && this.K == null && this.M == null) {
            return;
        }
        if ((this.I.x & 4) != 0) {
            if (this.K == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.K = radioButton;
                LinearLayout linearLayout = this.Q;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.K;
            compoundButton2 = this.M;
            compoundButton3 = compoundButton2;
        } else {
            if (this.M == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.M = checkBox;
                LinearLayout linearLayout2 = this.Q;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.M;
            compoundButton2 = this.K;
            compoundButton3 = compoundButton;
        }
        if (!z) {
            if (compoundButton3 != null) {
                compoundButton3.setVisibility(8);
            }
            RadioButton radioButton2 = this.K;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
                return;
            }
            return;
        }
        compoundButton.setChecked(this.I.isChecked());
        if (compoundButton.getVisibility() != 0) {
            compoundButton.setVisibility(0);
        }
        if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
            return;
        }
        compoundButton2.setVisibility(8);
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.I.x & 4) != 0) {
            if (this.K == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.K = radioButton;
                LinearLayout linearLayout = this.Q;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.K;
        } else {
            if (this.M == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.M = checkBox;
                LinearLayout linearLayout2 = this.Q;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.M;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.b0 = z;
        this.U = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.P;
        if (imageView != null) {
            imageView.setVisibility((this.W || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        sx2 sx2Var = this.I.n;
        boolean z = this.b0;
        if (z || this.U) {
            ImageView imageView = this.J;
            if (imageView == null && drawable == null && !this.U) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.J = imageView2;
                LinearLayout linearLayout = this.Q;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.U) {
                this.J.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.J;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.J.getVisibility() != 0) {
                this.J.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.L;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.L.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.L.getVisibility() != 0) {
                this.L.setVisibility(0);
            }
        }
    }
}

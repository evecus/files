package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import com.github.mytv.dv.R;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class nl {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static nl c;
    public z44 a;

    public static synchronized nl a() {
        nl nlVar;
        synchronized (nl.class) {
            try {
                if (c == null) {
                    c();
                }
                nlVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nlVar;
    }

    public static synchronized void c() {
        synchronized (nl.class) {
            if (c == null) {
                nl nlVar = new nl();
                c = nlVar;
                nlVar.a = z44.d();
                z44 z44Var = c.a;
                ml mlVar = new ml();
                mlVar.a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                mlVar.b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                mlVar.c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
                mlVar.d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                mlVar.e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                mlVar.f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                z44Var.m(mlVar);
            }
        }
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.f(context, i);
    }
}

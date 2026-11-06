package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class px1 extends nx1 {
    public final Field a;
    public final Field b;
    public final Field c;

    public px1(Field field, Field field2, Field field3) {
        this.a = field;
        this.b = field2;
        this.c = field3;
    }

    @Override // defpackage.nx1
    public final boolean a(InputMethodManager inputMethodManager) {
        try {
            this.c.set(inputMethodManager, null);
            return true;
        } catch (IllegalAccessException unused) {
            return false;
        }
    }

    @Override // defpackage.nx1
    public final Object b(InputMethodManager inputMethodManager) {
        try {
            return this.a.get(inputMethodManager);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    @Override // defpackage.nx1
    public final View c(InputMethodManager inputMethodManager) {
        try {
            return (View) this.b.get(inputMethodManager);
        } catch (ClassCastException | IllegalAccessException unused) {
            return null;
        }
    }
}

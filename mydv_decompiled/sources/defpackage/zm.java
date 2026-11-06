package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zm implements View.OnClickListener {
    public final View I;
    public final String J;
    public Method K;
    public Context L;

    public zm(View view, String str) {
        this.I = view;
        this.J = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        Method method2 = this.K;
        if (method2 == null) {
            View view2 = this.I;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.J;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder E = r7.E("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    E.append(view2.getClass());
                    E.append(str);
                    throw new IllegalStateException(E.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.K = method;
                        this.L = context;
                        method2 = method;
                        break;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            method2.invoke(this.L, view);
        } catch (IllegalAccessException e) {
            zl1.i("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            zl1.i("Could not execute method for android:onClick", e2);
        }
    }
}

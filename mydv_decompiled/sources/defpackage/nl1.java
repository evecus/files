package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class nl1 implements LayoutInflater.Factory2 {
    public final tl1 I;

    public nl1(tl1 tl1Var) {
        this.I = tl1Var;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        boolean equals = ml1.class.getName().equals(str);
        tl1 tl1Var = this.I;
        if (equals) {
            return new ml1(context, attributeSet, tl1Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, oz3.a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z = jl1.class.isAssignableFrom(rl1.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    if (resourceId != -1) {
                        tl1Var.g();
                    }
                    if (string != null) {
                        ts0 ts0Var = tl1Var.c;
                        ArrayList arrayList = (ArrayList) ts0Var.J;
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            r7.K(arrayList.get(size));
                        }
                        Iterator it = ((HashMap) ts0Var.K).values().iterator();
                        while (it.hasNext()) {
                            if (it.next() != null) {
                                zl1.c();
                                return null;
                            }
                        }
                    }
                    if (id != -1) {
                        tl1Var.g();
                    }
                    rl1 rl1Var = tl1Var.t;
                    context.getClassLoader();
                    rl1Var.a(attributeValue);
                    throw null;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}

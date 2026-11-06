package defpackage;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.github.mytv.dv.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class cr5 {
    public static final ArrayList d = new ArrayList();
    public WeakHashMap a;
    public SparseArray b;
    public WeakReference c;

    public static cr5 a(View view) {
        cr5 cr5Var = (cr5) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (cr5Var != null) {
            return cr5Var;
        }
        cr5 cr5Var2 = new cr5();
        cr5Var2.a = null;
        cr5Var2.b = null;
        cr5Var2.c = null;
        view.setTag(R.id.tag_unhandled_key_event_manager, cr5Var2);
        return cr5Var2;
    }

    public final boolean b(View view, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = this.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = d;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    try {
                        if (this.a == null) {
                            this.a = new WeakHashMap();
                        }
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ArrayList arrayList2 = d;
                            View view2 = (View) ((WeakReference) arrayList2.get(size)).get();
                            if (view2 == null) {
                                arrayList2.remove(size);
                            } else {
                                this.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    this.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View c = c(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (c != null && !KeyEvent.isModifierKey(keyCode)) {
                SparseArray sparseArray = this.b;
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    this.b = sparseArray;
                }
                sparseArray.put(keyCode, new WeakReference(c));
            }
        }
        return c != null;
    }

    public final View c(View view) {
        int size;
        WeakHashMap weakHashMap = this.a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View c = c(viewGroup.getChildAt(childCount));
                    if (c != null) {
                        return c;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                arrayList.get(size).getClass();
                zl1.c();
            }
        }
        return null;
    }
}

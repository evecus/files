package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class c63 implements Iterable {
    public final /* synthetic */ byte I;
    public final ArrayList J;
    public final Object K;

    public c63(HashMap hashMap) {
        this.I = (byte) 0;
        this.K = new HashMap();
        this.J = new ArrayList();
        String str = (String) hashMap.get("cookie");
        if (str != null) {
            for (String str2 : str.split(";")) {
                String[] split = str2.trim().split("=");
                if (split.length == 2) {
                    ((HashMap) this.K).put(split[0], split[1]);
                }
            }
        }
    }

    public static c63 f(Context context) {
        return new c63(context);
    }

    public void c(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(((Context) this.K).getPackageManager());
        }
        if (component != null) {
            e(component);
        }
        this.J.add(intent);
    }

    public void d(nk nkVar) {
        Intent z = vt0.z(nkVar);
        if (z == null) {
            z = vt0.z(nkVar);
        }
        if (z != null) {
            ComponentName component = z.getComponent();
            if (component == null) {
                component = z.resolveActivity(((Context) this.K).getPackageManager());
            }
            e(component);
            this.J.add(z);
        }
    }

    public void e(ComponentName componentName) {
        Context context = (Context) this.K;
        ArrayList arrayList = this.J;
        int size = arrayList.size();
        try {
            for (Intent A = vt0.A(context, componentName); A != null; A = vt0.A(context, A.getComponent())) {
                arrayList.add(size, A);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public void h() {
        ArrayList arrayList = this.J;
        if (arrayList.isEmpty()) {
            zy.i("No intents added to TaskStackBuilder; cannot startActivities");
            return;
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        ((Context) this.K).startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.I) {
            case 0:
                return ((HashMap) this.K).keySet().iterator();
            default:
                return this.J.iterator();
        }
    }

    public void j() {
        Iterator it = this.J.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            zl1.c();
        }
    }

    public c63(Context context) {
        this.I = (byte) 1;
        this.J = new ArrayList();
        this.K = context;
    }
}

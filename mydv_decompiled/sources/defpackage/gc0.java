package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class gc0 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();
    public final /* synthetic */ nk h;

    public gc0(nk nkVar) {
        this.h = nkVar;
    }

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        s7 s7Var = (s7) this.e.get(str);
        if ((s7Var != null ? s7Var.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                s7Var.a.a(s7Var.b.L(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new m7(intent, i2));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i, o7 o7Var, Intent intent) {
        o5 o5Var;
        int i2;
        Bundle bundleExtra;
        byte b = o7Var.a;
        Bundle bundle = null;
        byte b2 = 0;
        nk nkVar = this.h;
        switch (b) {
            case 0:
                String[] strArr = (String[]) intent;
                if (strArr.length == 0) {
                    o5Var = new o5(p91.I);
                    break;
                } else {
                    for (String str : strArr) {
                        if (z9.a(nkVar, str) == 0) {
                        }
                    }
                    int J = sv2.J(strArr.length);
                    if (J < 16) {
                        J = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(J);
                    for (String str2 : strArr) {
                        linkedHashMap.put(str2, Boolean.TRUE);
                    }
                    o5Var = new o5(linkedHashMap);
                    break;
                }
            default:
                o5Var = null;
                break;
        }
        if (o5Var != null) {
            new Handler(Looper.getMainLooper()).post(new fc0(this, i, o5Var, b2));
            return;
        }
        Intent intent2 = intent;
        switch (o7Var.a) {
            case 0:
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) intent);
                putExtra.getClass();
                intent2 = putExtra;
                break;
            case 1:
                break;
            default:
                b32 b32Var = (b32) intent;
                Intent intent3 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent a = b32Var.a();
                if (a != null && (bundleExtra = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent3.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        yz yzVar = new yz(b32Var.d());
                        yzVar.p(b32Var.c(), b32Var.b());
                        b32Var = yzVar.j();
                    }
                }
                intent3.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", b32Var);
                if (tl1.h(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent3);
                }
                intent2 = intent3;
                break;
        }
        if (intent2.getExtras() != null) {
            Bundle extras = intent2.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                intent2.setExtrasClassLoader(nkVar.getClassLoader());
            }
        }
        if (intent2.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intent2.getAction())) {
            String[] stringArrayExtra = intent2.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            f7.n(nkVar, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intent2.getAction())) {
            f7.o(nkVar, intent2, i, bundle2);
            return;
        }
        b32 b32Var2 = (b32) intent2.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            b32Var2.getClass();
            i2 = i;
            try {
                f7.p(nkVar, b32Var2.d(), i2, b32Var2.a(), b32Var2.b(), b32Var2.c(), bundle2);
            } catch (IntentSender.SendIntentException e) {
                e = e;
                new Handler(Looper.getMainLooper()).post(new fc0(this, i2, e, (byte) 1));
            }
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            i2 = i;
        }
    }

    public final t7 c(String str, o7 o7Var, n7 n7Var) {
        str.getClass();
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            q7 q7Var = new q7((byte) 0);
            Iterator it = new ng0(new ep1(q7Var, new i9(q7Var, (byte) 24))).iterator();
            while (it.hasNext()) {
                Number number = (Number) it.next();
                Integer valueOf = Integer.valueOf(number.intValue());
                LinkedHashMap linkedHashMap2 = this.a;
                if (!linkedHashMap2.containsKey(valueOf)) {
                    int intValue = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue), str);
                    linkedHashMap.put(str, Integer.valueOf(intValue));
                }
            }
            s83.l("Sequence contains no element matching the predicate.");
            return null;
        }
        this.e.put(str, new s7(n7Var, o7Var));
        LinkedHashMap linkedHashMap3 = this.f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            n7Var.a(obj);
        }
        Bundle bundle = this.g;
        m7 m7Var = (m7) o7.z(bundle, str, m7.class);
        if (m7Var != null) {
            bundle.remove(str);
            n7Var.a(o7Var.L(m7Var.J, m7Var.I));
        }
        return new t7(this, str, o7Var);
    }
}

package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.view.textclassifier.TextClassification;
import android.widget.Toast;
import androidx.work.impl.WorkDatabase;
import com.github.mytv.dv.MainActivity;
import com.github.mytv.dv.model.Author;
import com.github.mytv.dv.model.MixInfo;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import okhttp3.Dns;
import okhttp3.OkHttpClient;
import okhttp3.internal.dns.StateMachineDnsCall;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jt2 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ jt2(w63 w63Var, p63 p63Var, boolean z) {
        this.I = (byte) 8;
        this.K = w63Var;
        this.J = p63Var;
    }

    private final Object a() {
        be beVar = (be) this.K;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.J;
        synchronized (pn4.b) {
            LinkedHashMap linkedHashMap = pn4.c;
            linkedHashMap.remove(beVar);
            if (linkedHashMap.isEmpty()) {
                fr2.e().a(fx5.a, "NetworkRequestConstraintController unregister shared callback");
                connectivityManager.unregisterNetworkCallback(pn4.a);
                pn4.d = null;
                pn4.e = false;
            }
        }
        return wd5.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rm1
    public final Object invoke() {
        wd5 enqueue$lambda$1;
        byte b = 2;
        byte b2 = 1;
        Integer num = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (this.I) {
            case 0:
                MainActivity mainActivity = (MainActivity) this.K;
                t43 t43Var = (t43) this.J;
                lt2 lt2Var = MainActivity.Companion;
                boolean z = lf5.a;
                cf5 cf5Var = (cf5) t43Var.getValue();
                cf5Var.getClass();
                String str = cf5Var.c;
                cf5 cf5Var2 = (cf5) t43Var.getValue();
                cf5Var2.getClass();
                String str2 = cf5Var2.d;
                cf5 cf5Var3 = (cf5) t43Var.getValue();
                cf5Var3.getClass();
                String str3 = cf5Var3.e;
                str.getClass();
                lf5.d.h(null);
                if (!lf5.a) {
                    lf5.a = true;
                    fw4 fw4Var = lf5.c;
                    Float valueOf = Float.valueOf(0.0f);
                    fw4Var.getClass();
                    fw4Var.i(null, valueOf);
                    Toast.makeText(mainActivity, "开始下载更新...", 0).show();
                    xq1 xq1Var = xq1.I;
                    os0 os0Var = sx0.a;
                    p70.g0(xq1Var, ur0.I, null, new nu1(mainActivity, str, str2, str3, null), 2);
                }
                return wd5.a;
            case 1:
                p34 p34Var = (p34) this.K;
                t43 t43Var2 = (t43) this.J;
                lt2 lt2Var2 = MainActivity.Companion;
                if (!p34Var.i) {
                    OkHttpClient okHttpClient = t34.a;
                    String str4 = p34Var.a;
                    SharedPreferences sharedPreferences = t34.i;
                    if (sharedPreferences == null) {
                        j42.g0("prefs");
                        throw null;
                    }
                    sharedPreferences.edit().putString("last_announcement_id", str4).apply();
                    fw4 fw4Var2 = t34.f;
                    Boolean bool = Boolean.TRUE;
                    fw4Var2.getClass();
                    fw4Var2.i(null, bool);
                }
                t43Var2.setValue(Boolean.FALSE);
                return wd5.a;
            case 2:
                cw4 cw4Var = (cw4) this.K;
                Locale locale = (Locale) this.J;
                float floatValue = ((Number) cw4Var.getValue()).floatValue();
                return floatValue > 1.0f ? r7.C("已下载 ", String.format(locale, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(floatValue - 1.0f)}, 1)), " MB · 大小未知") : floatValue > 0.0f ? pt1.t((int) (floatValue * 100.0f), "%") : "0%";
            case 3:
                hu2 hu2Var = (hu2) this.K;
                Author author = (Author) this.J;
                hu2Var.q(new h83(new of5(author.getUid(), author.getSecUid())));
                return wd5.a;
            case 4:
                ((hu2) this.K).q(new h83(new xz2(((MixInfo) this.J).getMixId())));
                return wd5.a;
            case 5:
                ((tm1) this.K).invoke((ab4) this.J);
                return wd5.a;
            case 6:
                or0 or0Var = (or0) this.K;
                vv2 vv2Var = (vv2) this.J;
                iu0 iu0Var = ut0.U(vv2Var).g0;
                vv2Var.M.h();
                int h = vv2Var.N.h();
                or0Var.getClass();
                return Integer.valueOf(mw2.P(0.33333334f * h));
            case 7:
                iz1 iz1Var = (iz1) this.K;
                tm1 tm1Var = (tm1) this.J;
                if (iz1Var != null) {
                    tm1Var.invoke(iz1Var.b);
                }
                return wd5.a;
            case 8:
                w63 w63Var = (w63) this.K;
                p63 p63Var = (p63) this.J;
                p63Var.getClass();
                synchronized (w63Var.a) {
                    try {
                        fw4 fw4Var3 = w63Var.b;
                        Iterable iterable = (Iterable) fw4Var3.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : iterable) {
                            if (j42.c((p63) obj, p63Var)) {
                                fw4Var3.i(null, arrayList);
                            } else {
                                arrayList.add(obj);
                            }
                        }
                        fw4Var3.i(null, arrayList);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return wd5.a;
            case 9:
                ow3 ow3Var = (ow3) this.K;
                hu2 hu2Var2 = (hu2) this.J;
                ow3 ow3Var2 = ow3.P;
                gx3 gx3Var = hu2Var2.p;
                if (ow3Var == ow3Var2) {
                    gx3Var.G(true);
                } else {
                    gx3Var.H(true);
                }
                return wd5.a;
            case 10:
                String str5 = (String) this.K;
                t43 t43Var3 = (t43) this.J;
                if (((String) t43Var3.getValue()).length() < 6) {
                    t43Var3.setValue(((String) t43Var3.getValue()) + str5);
                }
                return wd5.a;
            case 11:
                ez3 ez3Var = (ez3) this.K;
                ((t43) this.J).setValue(Boolean.TRUE);
                if (!ez3Var.g) {
                    p70.g0(ez3Var.d, null, null, new gu2(ez3Var.i, objArr == true ? 1 : 0, (byte) 9), 3);
                    ez3Var.m();
                }
                return wd5.a;
            case 12:
                Class cls = (Class) this.K;
                Method method = (Method) this.J;
                String name = method.getName();
                Class<?>[] parameterTypes = method.getParameterTypes();
                Method method2 = cls.getMethod(name, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
                method2.getClass();
                if (Modifier.isPublic(method2.getModifiers())) {
                    Class<?> returnType = method.getReturnType();
                    returnType.getClass();
                    if (method2.getReturnType().equals(returnType)) {
                        r4 = true;
                    }
                }
                return Boolean.valueOf(r4);
            case 13:
                Object obj2 = this.K;
                b94 b94Var = (b94) this.J;
                Method method3 = obj2.getClass().getMethod("getWindowAreaComponent", null);
                method3.getClass();
                if (Modifier.isPublic(method3.getModifiers())) {
                    Class<?> loadClass = b94Var.a.loadClass("androidx.window.extensions.area.WindowAreaComponent");
                    loadClass.getClass();
                    if (method3.getReturnType().equals(loadClass)) {
                        r4 = true;
                    }
                }
                return Boolean.valueOf(r4);
            case 14:
                ag2 ag2Var = (ag2) this.K;
                if (!((Boolean) ((t43) this.J).getValue()).booleanValue() && (((gk3) ag2Var.e.b).h() > 0 || ((gk3) ag2Var.e.c).h() > 60)) {
                    r4 = true;
                }
                return Boolean.valueOf(r4);
            case 15:
                hu2 hu2Var3 = (hu2) this.K;
                cw4 cw4Var2 = (cw4) this.J;
                ye4 ye4Var = hu2Var3.o;
                boolean z2 = !((Boolean) cw4Var2.getValue()).booleanValue();
                fw4 fw4Var4 = ye4Var.O;
                Boolean valueOf2 = Boolean.valueOf(z2);
                fw4Var4.getClass();
                fw4Var4.i(null, valueOf2);
                return wd5.a;
            case 16:
                ((tm1) this.K).invoke((re4) this.J);
                return wd5.a;
            case 17:
                zg2 zg2Var = (zg2) this.K;
                List list = (List) this.J;
                Iterator it = zg2Var.g().m.iterator();
                if (it.hasNext()) {
                    Integer valueOf3 = Integer.valueOf(((ug2) it.next()).a);
                    while (true) {
                        num = valueOf3;
                        while (it.hasNext()) {
                            valueOf3 = Integer.valueOf(((ug2) it.next()).a);
                            if (num.compareTo(valueOf3) < 0) {
                                break;
                            }
                        }
                    }
                }
                return Boolean.valueOf((num != null ? num.intValue() : -1) >= list.size() + (-4));
            case 18:
                ot4 ot4Var = (ot4) this.K;
                ki1 ki1Var = (ki1) this.J;
                if (ot4Var != null) {
                    ((yt0) ot4Var).a();
                }
                try {
                    ki1.a(ki1Var);
                } catch (Throwable unused) {
                }
                return wd5.a;
            case 19:
                hu2 hu2Var4 = (hu2) this.K;
                t80 t80Var = (t80) this.J;
                wm4 wm4Var = hu2Var4.h;
                wm4Var.getClass();
                fw4 fw4Var5 = wm4Var.y;
                fw4Var5.getClass();
                fw4Var5.i(null, t80Var);
                wm4Var.b.a.edit().putString("color_source", t80Var.J).apply();
                return wd5.a;
            case 20:
                ((t43) this.J).setValue(((dl4) this.K).a);
                return wd5.a;
            case 21:
                ((fg) this.K).a((String) this.J);
                return wd5.a;
            case 22:
                hu2 hu2Var5 = (hu2) this.K;
                nd5 nd5Var = (nd5) this.J;
                wm4 wm4Var2 = hu2Var5.h;
                wm4Var2.getClass();
                fl4 fl4Var = wm4Var2.b;
                fl4Var.getClass();
                fl4Var.a.edit().putString("ui_form_factor", nd5Var.J).apply();
                fw4 fw4Var6 = fl4Var.i;
                fw4Var6.getClass();
                fw4Var6.i(null, nd5Var);
                return wd5.a;
            case 23:
                p70.g0((dl0) this.K, null, null, new t53((Context) this.J, objArr2 == true ? 1 : 0, b2), 3);
                return wd5.a;
            case 24:
                hu2 hu2Var6 = (hu2) this.K;
                cj5 cj5Var = (cj5) this.J;
                wm4 wm4Var3 = hu2Var6.h;
                wm4Var3.getClass();
                fl4 fl4Var2 = wm4Var3.b;
                fl4Var2.getClass();
                fl4Var2.a.edit().putString("video_codec_preference", cj5Var.J).apply();
                fw4 fw4Var7 = fl4Var2.q;
                fw4Var7.getClass();
                fw4Var7.i(null, cj5Var);
                return wd5.a;
            case 25:
                return a();
            case 26:
                enqueue$lambda$1 = StateMachineDnsCall.enqueue$lambda$1((Dns.Callback) this.K, (StateMachineDnsCall) this.J);
                return enqueue$lambda$1;
            case 27:
                return ((pu0) this.K).invoke((WorkDatabase) this.J);
            case 28:
                x9.w((Context) this.K, (TextClassification) this.J);
                return wd5.a;
            default:
                p70.g0((dl0) this.K, null, gl0.L, new mu1(b, (fj0) (objArr3 == true ? 1 : 0), (tm1) this.J), 1);
                return wd5.a;
        }
    }

    public /* synthetic */ jt2(Object obj, Object obj2, byte b) {
        this.I = b;
        this.K = obj;
        this.J = obj2;
    }
}

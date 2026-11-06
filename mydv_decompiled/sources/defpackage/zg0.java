package defpackage;

import android.util.Log;
import android.view.View;
import android.view.textclassifier.TextClassifier;
import com.whl.quickjs.wrapper.QuickJSContext;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zg0 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zg0(Object obj, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.J = obj;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.J;
        switch (b) {
            case 0:
                return new zg0((ky5) obj2, fj0Var, (byte) 0);
            case 1:
                return new zg0((n11) obj2, fj0Var, (byte) 1);
            case 2:
                return new zg0((View) obj2, fj0Var, (byte) 2);
            case 3:
                return new zg0((co3) obj2, fj0Var, (byte) 3);
            case 4:
                return new zg0((no4) obj2, fj0Var, (byte) 4);
            default:
                return new zg0((rm1) obj2, fj0Var, (byte) 5);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                ((zg0) create((hh0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                return wd5Var;
            case 1:
                return ((zg0) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 2:
                ((zg0) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                return wd5Var;
            case 3:
                return ((zg0) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            case 4:
                return ((zg0) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            default:
                ((zg0) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
                return wd5Var;
        }
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        boolean z = false;
        switch (this.I) {
            case 0:
                mu0.V(obj);
                String str = ah0.a;
                ky5 ky5Var = (ky5) this.J;
                fr2.e().a(str, "Constraints changed for " + ky5Var);
                return wd5.a;
            case 1:
                mu0.V(obj);
                n11 n11Var = (n11) this.J;
                zy0 zy0Var = n11.Companion;
                fl4 fl4Var = n11Var.a;
                try {
                    Response execute = n11Var.e.newCall(new Request.Builder().url("https://www.douyin.com/").header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36").header("Accept", "*/*").head().build()).execute();
                    try {
                        Iterator<T> it = execute.headers("Set-Cookie").iterator();
                        while (it.hasNext()) {
                            uj3 r0 = n11.r0((String) it.next());
                            if (r0 != null) {
                                Object obj2 = r0.J;
                                if (j42.c(r0.I, "UIFID_TEMP") && !jx4.L((CharSequence) obj2)) {
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(fl4Var.h());
                                    linkedHashMap.put("UIFID_TEMP", obj2);
                                    fl4Var.H(o70.Z0(linkedHashMap.entrySet(), "; ", null, null, 0, new m90((byte) 14), 30));
                                    Log.i("DouyinDirectApi", "UIFID_TEMP acquired (len=" + ((String) obj2).length() + ")");
                                    String str2 = (String) obj2;
                                    execute.close();
                                    return str2;
                                }
                            }
                        }
                        execute.close();
                        Log.w("DouyinDirectApi", "fetchUifidTemp: homepage HEAD did not return UIFID_TEMP");
                        return null;
                    } finally {
                    }
                } catch (Exception e) {
                    Log.w("DouyinDirectApi", "fetchUifidTemp failed: " + e.getMessage());
                    return null;
                }
            case 2:
                mu0.V(obj);
                View view = (View) this.J;
                view.performHapticFeedback(3);
                view.playSoundEffect(0);
                return wd5.a;
            case 3:
                mu0.V(obj);
                co3 co3Var = (co3) this.J;
                TextClassifier i = ck.i(co3Var.b, co3Var.c);
                co3Var.f = i;
                return i;
            case 4:
                mu0.V(obj);
                if (((no4) this.J).d && ((no4) this.J).e != null) {
                    return Boolean.TRUE;
                }
                try {
                    QuickJSContext create = QuickJSContext.create();
                    ((no4) this.J).e = create;
                    InputStream open = ((no4) this.J).a.getAssets().open("sign.js");
                    open.getClass();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, z50.a), 8192);
                    try {
                        String u = wi4.u(bufferedReader);
                        bufferedReader.close();
                        create.evaluate(qx4.x(u, "\r", "", false));
                        Object evaluate = create.evaluate("(function(){ return typeof getMSSDKSignature === 'function'; })()");
                        bool = evaluate instanceof Boolean ? (Boolean) evaluate : null;
                    } finally {
                    }
                } catch (Exception e2) {
                    Log.e("SignJs", "Failed to initialize sign.js runtime with QuickJS", e2);
                    no4 no4Var = (no4) this.J;
                    no4Var.d = false;
                    QuickJSContext quickJSContext = no4Var.e;
                    no4Var.e = null;
                    if (quickJSContext != null) {
                        no4Var.b.execute(new h(quickJSContext, (byte) 20));
                    }
                }
                if (bool != null ? bool.booleanValue() : false) {
                    ((no4) this.J).d = true;
                    Log.i("SignJs", "SignJs runtime initialized successfully with QuickJS");
                    z = true;
                    return Boolean.valueOf(z);
                }
                Log.e("SignJs", "getMSSDKSignature is missing in sign.js");
                no4 no4Var2 = (no4) this.J;
                no4Var2.d = false;
                QuickJSContext quickJSContext2 = no4Var2.e;
                no4Var2.e = null;
                if (quickJSContext2 != null) {
                    no4Var2.b.execute(new h(quickJSContext2, (byte) 20));
                }
                return Boolean.FALSE;
            default:
                mu0.V(obj);
                ((rm1) this.J).invoke();
                return wd5.a;
        }
    }
}

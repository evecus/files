package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import coil3.ImageLoader;
import coil3.decode.BitmapFactoryDecoder;
import coil3.decode.DecodeResult;
import coil3.disk.DiskCache;
import coil3.memory.MemoryCache;
import coil3.network.NetworkClient;
import coil3.network.okhttp.OkHttpNetworkFetcher;
import coil3.util.UtilsKt;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Handshake;
import okhttp3.OkHttpClient;
import okhttp3.internal.connection.ConnectPlan;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class eq implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ eq(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        DecodeResult decode$lambda$0$0;
        List j0;
        List connectTls$lambda$1;
        List peerCertificates_delegate$lambda$0;
        List handshake$lambda$2;
        MemoryCache build$lambda$1;
        we0 we0Var;
        DiskCache diskCache;
        NetworkClient asNetworkClient;
        int N;
        uj3 uj3Var;
        uj3 uj3Var2;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj = this.J;
        switch (b) {
            case 0:
                return new v2((Object[]) obj, (byte) 1);
            case 1:
                decode$lambda$0$0 = BitmapFactoryDecoder.decode$lambda$0$0((BitmapFactoryDecoder) obj);
                return decode$lambda$0$0;
            case 2:
                rm1 rm1Var = ((ma0) obj).d0;
                if (rm1Var != null) {
                    rm1Var.invoke();
                }
                return Boolean.TRUE;
            case 3:
                j0 = p70.j0((uj3) obj);
                return j0;
            case 4:
                boolean b2 = z22.b(0L, 0L);
                View view = ((be0) obj).a;
                return b2 ? c5.q(view) : a5.B(qb.m(view.getContext()));
            case 5:
                connectTls$lambda$1 = ConnectPlan.connectTls$lambda$1((Handshake) obj);
                return connectTls$lambda$1;
            case 6:
                ne5 ne5Var = oe5.a;
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                oe5.a(builder);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                return builder.connectTimeout(15L, timeUnit).readTimeout(60L, timeUnit).followRedirects(true).followSslRedirects(true).addNetworkInterceptor(new bz0((n11) obj)).build();
            case 7:
                ((ui1) obj).l0();
                return wd5Var;
            case 8:
                return ((go1) obj).n();
            case 9:
                peerCertificates_delegate$lambda$0 = Handshake.peerCertificates_delegate$lambda$0((rm1) obj);
                return peerCertificates_delegate$lambda$0;
            case 10:
                handshake$lambda$2 = Handshake.Companion.handshake$lambda$2((List) obj);
                return handshake$lambda$2;
            case 11:
                build$lambda$1 = ImageLoader.Builder.build$lambda$1((ImageLoader.Builder) obj);
                return build$lambda$1;
            case 12:
                Object systemService = ((View) ((pn) obj).b).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 13:
                ab2 ab2Var = ((wa2) obj).o0;
                ab2Var.p.h0 = true;
                ns2 ns2Var = ab2Var.q;
                if (ns2Var != null) {
                    ns2Var.E0();
                }
                return wd5Var;
            case 14:
                cb2 cb2Var = (cb2) obj;
                if (!((Boolean) cb2Var.g.getValue()).booleanValue() && (we0Var = cb2Var.c) != null) {
                    we0Var.o();
                }
                return wd5Var;
            case 15:
                ru2 ru2Var = (ru2) ((zi2) obj).a.J;
                if (!ru2Var.J) {
                    if (ru2Var.K) {
                        kr3.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    ru2Var.a();
                    ru2Var.K = true;
                }
                return wd5Var;
            case 16:
                m13 m13Var = (m13) obj;
                m13Var.f = false;
                HashSet hashSet = new HashSet();
                e43 e43Var = m13Var.d;
                if (e43Var != null) {
                    Object[] objArr = e43Var.a;
                    int i = e43Var.b;
                    for (int i2 = 0; i2 < i; i2++) {
                        wa2 wa2Var = (wa2) objArr[i2];
                        e43 e43Var2 = m13Var.e;
                        if (e43Var2 == null) {
                            e43Var2 = new e43();
                            m13Var.e = e43Var2;
                        }
                        yx3 yx3Var = (yx3) e43Var2.g(i2);
                        if (wa2Var.n0.f.isAttached()) {
                            m13.b(wa2Var.n0.f, yx3Var);
                        }
                    }
                    e43Var.d();
                    e43 e43Var3 = m13Var.e;
                    if (e43Var3 != null) {
                        e43Var3.d();
                    }
                }
                e43 e43Var4 = m13Var.b;
                if (e43Var4 != null) {
                    Object[] objArr2 = e43Var4.a;
                    int i3 = e43Var4.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        wt wtVar = (wt) objArr2[i4];
                        e43 e43Var5 = m13Var.c;
                        if (e43Var5 == null) {
                            e43Var5 = new e43();
                            m13Var.c = e43Var5;
                        }
                        yx3 yx3Var2 = (yx3) e43Var5.g(i4);
                        if (wtVar.isAttached()) {
                            m13.b(wtVar, yx3Var2);
                        }
                    }
                    e43Var4.d();
                    e43 e43Var6 = m13Var.c;
                    if (e43Var6 != null) {
                        e43Var6.d();
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((wt) it.next()).l0();
                }
                return wd5Var;
            case 17:
                r63 r63Var = ((p63) obj).P;
                if (!r63Var.i) {
                    zy.i("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                    return null;
                }
                if (r63Var.j.i == ki2.I) {
                    zy.i("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                    return null;
                }
                p63 p63Var = r63Var.a;
                ur5 ur5Var = (ur5) r63Var.m.getValue();
                vl0 v = ad4.v(p63Var);
                ur5Var.getClass();
                v.getClass();
                ts0 ts0Var = new ts0(p63Var.f(), ur5Var, v);
                k60 a = s24.a(q63.class);
                String b3 = a.b();
                if (b3 != null) {
                    return ((q63) ts0Var.p(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b3))).p();
                }
                s83.t("Local and anonymous classes can not be ViewModels");
                return null;
            case 18:
                return new f73((String) obj);
            case 19:
                return rt0.k((Context) obj);
            case 20:
                List list = (List) ((cw4) obj).getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (j42.c(((p63) obj2).J.I, "composable")) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 21:
                return ((d93) obj).d;
            case 22:
                return ((h93) obj).j0();
            case 23:
                diskCache = ((ImageLoader) obj).getDiskCache();
                return diskCache;
            case 24:
                asNetworkClient = OkHttpNetworkFetcher.asNetworkClient((Call.Factory) obj);
                return asNetworkClient;
            case 25:
                return new he3((je3) obj);
            case 26:
                o14 o14Var = (o14) obj;
                o14Var.i = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    o14Var.a();
                    return wd5Var;
                } finally {
                    Trace.endSection();
                }
            case 27:
                u44 u44Var = (u44) obj;
                ClassLoader classLoader = u44Var.I;
                ke1 ke1Var = u44Var.J;
                Enumeration<URL> resources = classLoader.getResources("");
                resources.getClass();
                ArrayList list2 = Collections.list(resources);
                list2.getClass();
                ArrayList arrayList2 = new ArrayList();
                int size = list2.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj3 = list2.get(i5);
                    i5++;
                    URL url = (URL) obj3;
                    url.getClass();
                    if (j42.c(url.getProtocol(), UtilsKt.SCHEME_FILE)) {
                        String str = ok3.J;
                        uj3Var2 = new uj3(ke1Var, o63.g(new File(url.toURI())));
                    } else {
                        uj3Var2 = null;
                    }
                    if (uj3Var2 != null) {
                        arrayList2.add(uj3Var2);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                resources2.getClass();
                ArrayList list3 = Collections.list(resources2);
                list3.getClass();
                ArrayList arrayList3 = new ArrayList();
                int size2 = list3.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj4 = list3.get(i6);
                    i6++;
                    URL url2 = (URL) obj4;
                    url2.getClass();
                    String url3 = url2.toString();
                    url3.getClass();
                    if (qx4.y(url3, "jar:file:", false) && (N = jx4.N(url3, 6, "!")) != -1) {
                        String str2 = ok3.J;
                        uj3Var = new uj3(g06.d(o63.g(new File(URI.create(url3.substring(4, N)))), ke1Var, new yv3((byte) 4)), u44.L);
                    } else {
                        uj3Var = null;
                    }
                    if (uj3Var != null) {
                        arrayList3.add(uj3Var);
                    }
                }
                return o70.f1(arrayList2, arrayList3);
            case 28:
                f94 f94Var = (f94) obj;
                z94 z94Var = f94Var.I;
                Object obj5 = f94Var.L;
                if (obj5 != null) {
                    return z94Var.b(f94Var, obj5);
                }
                s83.t("Value should be initialized");
                return null;
            default:
                da daVar = ((m94) obj).K;
                if (daVar == null) {
                    return null;
                }
                Bundle b0 = i42.b0((uj3[]) Arrays.copyOf(new uj3[0], 0));
                daVar.q(b0);
                if (b0.isEmpty()) {
                    return null;
                }
                return b0;
        }
    }
}

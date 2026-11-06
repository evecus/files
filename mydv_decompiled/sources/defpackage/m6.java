package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.flac.FlacConstants;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.media3.extractor.ts.TsExtractor;
import coil3.compose.AsyncImagePainter;
import coil3.compose.internal.UtilsKt;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class m6 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ m6(tm1 tm1Var, String str, t43 t43Var) {
        this.I = (byte) 15;
        this.K = tm1Var;
        this.J = str;
        this.L = t43Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final Object a(Object obj) {
        Integer e;
        Integer d;
        Integer d2;
        Integer e2;
        u55 u55Var;
        u55 u55Var2;
        v55 v55Var;
        v55 v55Var2;
        u55 u55Var3;
        u55 u55Var4;
        v55 v55Var3;
        v55 v55Var4;
        Integer d3;
        Integer e3;
        Integer e4;
        Integer d4;
        v05 v05Var;
        k82 k82Var = (k82) this.J;
        d45 d45Var = (d45) this.K;
        n24 n24Var = (n24) this.L;
        g45 g45Var = (g45) obj;
        int ordinal = k82Var.ordinal();
        wd5 wd5Var = wd5.a;
        d55 d55Var = null;
        switch (ordinal) {
            case 0:
                g45Var.e.a = null;
                if (g45Var.g.J.length() > 0) {
                    if (d65.c(g45Var.f)) {
                        g45Var.i();
                        return wd5Var;
                    }
                    boolean f = g45Var.f();
                    long j = g45Var.f;
                    if (f) {
                        int f2 = d65.f(j);
                        g45Var.q(f2, f2);
                        return wd5Var;
                    }
                    int e5 = d65.e(j);
                    g45Var.q(e5, e5);
                }
                return wd5Var;
            case 1:
                g45Var.e.a = null;
                if (g45Var.g.J.length() > 0) {
                    if (d65.c(g45Var.f)) {
                        g45Var.m();
                        return wd5Var;
                    }
                    boolean f3 = g45Var.f();
                    long j2 = g45Var.f;
                    if (f3) {
                        int e6 = d65.e(j2);
                        g45Var.q(e6, e6);
                        return wd5Var;
                    }
                    int f4 = d65.f(j2);
                    g45Var.q(f4, f4);
                    return wd5Var;
                }
                return wd5Var;
            case 2:
                c65 c65Var = g45Var.e;
                c65Var.a = null;
                oj ojVar = g45Var.g;
                String str = ojVar.J;
                String str2 = ojVar.J;
                if (str.length() > 0) {
                    if (g45Var.f()) {
                        c65Var.a = null;
                        if (str2.length() > 0 && (d = g45Var.d()) != null) {
                            int intValue = d.intValue();
                            g45Var.q(intValue, intValue);
                            return wd5Var;
                        }
                    } else {
                        c65Var.a = null;
                        if (str2.length() > 0 && (e = g45Var.e()) != null) {
                            int intValue2 = e.intValue();
                            g45Var.q(intValue2, intValue2);
                            return wd5Var;
                        }
                    }
                }
                return wd5Var;
            case 3:
                c65 c65Var2 = g45Var.e;
                c65Var2.a = null;
                oj ojVar2 = g45Var.g;
                String str3 = ojVar2.J;
                String str4 = ojVar2.J;
                if (str3.length() > 0) {
                    if (g45Var.f()) {
                        c65Var2.a = null;
                        if (str4.length() > 0 && (e2 = g45Var.e()) != null) {
                            int intValue3 = e2.intValue();
                            g45Var.q(intValue3, intValue3);
                            return wd5Var;
                        }
                    } else {
                        c65Var2.a = null;
                        if (str4.length() > 0 && (d2 = g45Var.d()) != null) {
                            int intValue4 = d2.intValue();
                            g45Var.q(intValue4, intValue4);
                            return wd5Var;
                        }
                    }
                }
                return wd5Var;
            case 4:
                g45Var.j();
                return wd5Var;
            case 5:
                g45Var.l();
                return wd5Var;
            case 6:
                g45Var.o();
                return wd5Var;
            case 7:
                g45Var.n();
                return wd5Var;
            case 8:
                g45Var.e.a = null;
                if (g45Var.g.J.length() > 0) {
                    if (g45Var.f()) {
                        g45Var.o();
                        return wd5Var;
                    }
                    g45Var.n();
                    return wd5Var;
                }
                return wd5Var;
            case 9:
                g45Var.e.a = null;
                if (g45Var.g.J.length() > 0) {
                    if (g45Var.f()) {
                        g45Var.n();
                        return wd5Var;
                    }
                    g45Var.o();
                    return wd5Var;
                }
                return wd5Var;
            case 10:
                if (g45Var.g.J.length() > 0 && (u55Var = g45Var.c) != null) {
                    int g = g45Var.g(u55Var, -1);
                    g45Var.q(g, g);
                    return wd5Var;
                }
                return wd5Var;
            case 11:
                if (g45Var.g.J.length() > 0 && (u55Var2 = g45Var.c) != null) {
                    int g2 = g45Var.g(u55Var2, 1);
                    g45Var.q(g2, g2);
                    return wd5Var;
                }
                return wd5Var;
            case 12:
            case NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED /* 48 */:
                return wd5Var;
            case 13:
                if (g45Var.g.J.length() > 0 && (v55Var = g45Var.i) != null) {
                    int h = g45Var.h(v55Var, -1);
                    g45Var.q(h, h);
                    return wd5Var;
                }
                return wd5Var;
            case 14:
                if (g45Var.g.J.length() > 0 && (v55Var2 = g45Var.i) != null) {
                    int h2 = g45Var.h(v55Var2, 1);
                    g45Var.q(h2, h2);
                    return wd5Var;
                }
                return wd5Var;
            case 15:
                g45Var.e.a = null;
                if (g45Var.g.J.length() > 0) {
                    g45Var.q(0, 0);
                    return wd5Var;
                }
                return wd5Var;
            case 16:
                g45Var.e.a = null;
                oj ojVar3 = g45Var.g;
                if (ojVar3.J.length() > 0) {
                    int length = ojVar3.J.length();
                    g45Var.q(length, length);
                    return wd5Var;
                }
                return wd5Var;
            case 17:
                d45Var.b.a(false);
                return wd5Var;
            case 18:
                d45Var.b.o();
                return wd5Var;
            case 19:
                d45Var.b.c();
                return wd5Var;
            case 20:
                List a = g45Var.a(new ol4((byte) 23));
                if (a != null) {
                    d45Var.a(a);
                    return wd5Var;
                }
                return wd5Var;
            case 21:
                List a2 = g45Var.a(new ol4((byte) 24));
                if (a2 != null) {
                    d45Var.a(a2);
                    return wd5Var;
                }
                return wd5Var;
            case 22:
                List a3 = g45Var.a(new ol4((byte) 25));
                if (a3 != null) {
                    d45Var.a(a3);
                    return wd5Var;
                }
                return wd5Var;
            case 23:
                List a4 = g45Var.a(new ol4((byte) 26));
                if (a4 != null) {
                    d45Var.a(a4);
                    return wd5Var;
                }
                return wd5Var;
            case 24:
                List a5 = g45Var.a(new ol4((byte) 27));
                if (a5 != null) {
                    d45Var.a(a5);
                    return wd5Var;
                }
                return wd5Var;
            case 25:
                List a6 = g45Var.a(new ol4((byte) 28));
                if (a6 != null) {
                    d45Var.a(a6);
                    return wd5Var;
                }
                return wd5Var;
            case 26:
                g45Var.e.a = null;
                oj ojVar4 = g45Var.g;
                if (ojVar4.J.length() > 0) {
                    g45Var.q(0, ojVar4.J.length());
                    return wd5Var;
                }
                return wd5Var;
            case 27:
                g45Var.i();
                g45Var.p();
                return wd5Var;
            case 28:
                g45Var.m();
                g45Var.p();
                return wd5Var;
            case 29:
                if (g45Var.g.J.length() > 0 && (u55Var3 = g45Var.c) != null) {
                    int g3 = g45Var.g(u55Var3, -1);
                    g45Var.q(g3, g3);
                }
                g45Var.p();
                return wd5Var;
            case 30:
                if (g45Var.g.J.length() > 0 && (u55Var4 = g45Var.c) != null) {
                    int g4 = g45Var.g(u55Var4, 1);
                    g45Var.q(g4, g4);
                }
                g45Var.p();
                return wd5Var;
            case 31:
                if (g45Var.g.J.length() > 0 && (v55Var3 = g45Var.i) != null) {
                    int h3 = g45Var.h(v55Var3, -1);
                    g45Var.q(h3, h3);
                }
                g45Var.p();
                return wd5Var;
            case 32:
                if (g45Var.g.J.length() > 0 && (v55Var4 = g45Var.i) != null) {
                    int h4 = g45Var.h(v55Var4, 1);
                    g45Var.q(h4, h4);
                }
                g45Var.p();
                return wd5Var;
            case 33:
                g45Var.e.a = null;
                if (g45Var.g.J.length() > 0) {
                    g45Var.q(0, 0);
                }
                g45Var.p();
                return wd5Var;
            case 34:
                g45Var.e.a = null;
                oj ojVar5 = g45Var.g;
                if (ojVar5.J.length() > 0) {
                    int length2 = ojVar5.J.length();
                    g45Var.q(length2, length2);
                }
                g45Var.p();
                return wd5Var;
            case 35:
                c65 c65Var3 = g45Var.e;
                c65Var3.a = null;
                oj ojVar6 = g45Var.g;
                String str5 = ojVar6.J;
                String str6 = ojVar6.J;
                if (str5.length() > 0) {
                    if (g45Var.f()) {
                        c65Var3.a = null;
                        if (str6.length() > 0 && (e3 = g45Var.e()) != null) {
                            int intValue5 = e3.intValue();
                            g45Var.q(intValue5, intValue5);
                        }
                    } else {
                        c65Var3.a = null;
                        if (str6.length() > 0 && (d3 = g45Var.d()) != null) {
                            int intValue6 = d3.intValue();
                            g45Var.q(intValue6, intValue6);
                        }
                    }
                }
                g45Var.p();
                return wd5Var;
            case TsExtractor.TS_STREAM_TYPE_H265 /* 36 */:
                c65 c65Var4 = g45Var.e;
                c65Var4.a = null;
                oj ojVar7 = g45Var.g;
                String str7 = ojVar7.J;
                String str8 = ojVar7.J;
                if (str7.length() > 0) {
                    if (g45Var.f()) {
                        c65Var4.a = null;
                        if (str8.length() > 0 && (d4 = g45Var.d()) != null) {
                            int intValue7 = d4.intValue();
                            g45Var.q(intValue7, intValue7);
                        }
                    } else {
                        c65Var4.a = null;
                        if (str8.length() > 0 && (e4 = g45Var.e()) != null) {
                            int intValue8 = e4.intValue();
                            g45Var.q(intValue8, intValue8);
                        }
                    }
                }
                g45Var.p();
                return wd5Var;
            case 37:
                g45Var.j();
                g45Var.p();
                return wd5Var;
            case FlacConstants.STREAM_INFO_BLOCK_SIZE /* 38 */:
                g45Var.l();
                g45Var.p();
                return wd5Var;
            case NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI /* 39 */:
                g45Var.o();
                g45Var.p();
                return wd5Var;
            case NalUnitUtil.H265_NAL_UNIT_TYPE_SUFFIX_SEI /* 40 */:
                g45Var.n();
                g45Var.p();
                return wd5Var;
            case 41:
                g45Var.e.a = null;
                if (g45Var.g.J.length() > 0) {
                    if (g45Var.f()) {
                        g45Var.o();
                    } else {
                        g45Var.n();
                    }
                }
                g45Var.p();
                return wd5Var;
            case AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                g45Var.e.a = null;
                if (g45Var.g.J.length() > 0) {
                    if (g45Var.f()) {
                        g45Var.n();
                    } else {
                        g45Var.o();
                    }
                }
                g45Var.p();
                return wd5Var;
            case 43:
                g45Var.e.a = null;
                if (g45Var.g.J.length() > 0) {
                    long j3 = g45Var.f;
                    int i = d65.c;
                    int i2 = (int) (j3 & 4294967295L);
                    g45Var.q(i2, i2);
                    return wd5Var;
                }
                return wd5Var;
            case 44:
                if (!d45Var.e) {
                    d45Var.a(p70.j0(new eb0("\n", 1)));
                    return wd5Var;
                }
                n24Var.I = d45Var.a.x.J.r.b(d45Var.k);
                return wd5Var;
            case TsExtractor.TS_STREAM_TYPE_MHAS /* 45 */:
                if (d45Var.e) {
                    n24Var.I = false;
                    return wd5Var;
                }
                d45Var.a(p70.j0(new eb0("\t", 1)));
                return wd5Var;
            case 46:
                d45Var.h.a(d55.a(g45Var.h, g45Var.g, g45Var.f, 4));
                rd5 rd5Var = d45Var.h;
                v05 v05Var2 = rd5Var.a;
                if (v05Var2 != null && (v05Var = (v05) v05Var2.a) != null) {
                    rd5Var.a = v05Var;
                    rd5Var.c -= ((d55) v05Var2.b).a.J.length();
                    rd5Var.b = new v05(rd5Var.b, (d55) v05Var2.b);
                    d55Var = (d55) v05Var.b;
                }
                if (d55Var != null) {
                    d45Var.j.invoke(d55Var);
                    return wd5Var;
                }
                return wd5Var;
            case 47:
                rd5 rd5Var2 = d45Var.h;
                v05 v05Var3 = rd5Var2.b;
                if (v05Var3 != null) {
                    rd5Var2.b = (v05) v05Var3.a;
                    d55 d55Var2 = (d55) v05Var3.b;
                    rd5Var2.a = new v05(rd5Var2.a, d55Var2);
                    rd5Var2.c = d55Var2.a.J.length() + rd5Var2.c;
                    d55Var = (d55) v05Var3.b;
                }
                if (d55Var != null) {
                    d45Var.j.invoke(d55Var);
                    return wd5Var;
                }
                return wd5Var;
            default:
                s83.v();
                return null;
        }
    }

    private final Object b(Object obj) {
        final u45 u45Var = (u45) this.J;
        dl0 dl0Var = (dl0) this.K;
        Context context = (Context) this.L;
        t25 t25Var = (t25) obj;
        e43 e43Var = t25Var.a;
        e43 e43Var2 = t25Var.a;
        h35 h35Var = h35.b;
        e43Var.a(h35Var);
        d35 d35Var = d35.Autofill;
        final byte b = 0;
        final byte b2 = 1;
        boolean z = (d65.c(u45Var.l().b) || !u45Var.h() || u45Var.g == null) ? false : true;
        fj0 fj0Var = null;
        byte b3 = 29;
        jt2 jt2Var = new jt2(dl0Var, new p45(u45Var, fj0Var, b2), b3);
        Resources resources = context.getResources();
        byte b4 = 10;
        ap3 ap3Var = new ap3(jt2Var, fj0Var, b4);
        if (z) {
            e43Var2.a(new c35(j16.t0, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, ap3Var));
        }
        d35 d35Var2 = d35.Autofill;
        boolean z2 = (d65.c(u45Var.l().b) || u45Var.g == null) ? false : true;
        final byte b5 = 2;
        jt2 jt2Var2 = new jt2(dl0Var, new p45(u45Var, fj0Var, b5), b3);
        Resources resources2 = context.getResources();
        ap3 ap3Var2 = new ap3(jt2Var2, fj0Var, b4);
        if (z2) {
            e43Var2.a(new c35(j16.u0, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, ap3Var2));
        }
        d35 d35Var3 = d35.Autofill;
        boolean z3 = u45Var.h() && ((Boolean) u45Var.w.getValue()).booleanValue() && u45Var.g != null;
        jt2 jt2Var3 = new jt2(dl0Var, new p45(u45Var, fj0Var, (byte) 3), b3);
        Resources resources3 = context.getResources();
        ap3 ap3Var3 = new ap3(jt2Var3, fj0Var, b4);
        if (z3) {
            e43Var2.a(new c35(j16.v0, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, ap3Var3));
        }
        d35 d35Var4 = d35.Autofill;
        boolean z4 = d65.d(u45Var.l().b) != u45Var.l().a.J.length();
        rm1 rm1Var = new rm1() { // from class: z45
            @Override // defpackage.rm1
            public final Object invoke() {
                byte b6 = b;
                wd5 wd5Var = wd5.a;
                u45 u45Var2 = u45Var;
                switch (b6) {
                    case 0:
                        break;
                    case 1:
                        d55 b7 = u45.b(u45Var2.l().a, ui4.c(0, u45Var2.l().a.J.length()));
                        u45Var2.c.invoke(b7);
                        long j = b7.b;
                        u45Var2.v = new d65(j);
                        u45Var2.t = d55.a(u45Var2.t, null, j, 5);
                        u45Var2.e(true);
                        break;
                    default:
                        rm1 rm1Var2 = u45Var2.f;
                        if (rm1Var2 != null) {
                            rm1Var2.invoke();
                            break;
                        }
                        break;
                }
                return wd5Var;
            }
        };
        rm1 rm1Var2 = new rm1() { // from class: z45
            @Override // defpackage.rm1
            public final Object invoke() {
                byte b6 = b2;
                wd5 wd5Var = wd5.a;
                u45 u45Var2 = u45Var;
                switch (b6) {
                    case 0:
                        break;
                    case 1:
                        d55 b7 = u45.b(u45Var2.l().a, ui4.c(0, u45Var2.l().a.J.length()));
                        u45Var2.c.invoke(b7);
                        long j = b7.b;
                        u45Var2.v = new d65(j);
                        u45Var2.t = d55.a(u45Var2.t, null, j, 5);
                        u45Var2.e(true);
                        break;
                    default:
                        rm1 rm1Var22 = u45Var2.f;
                        if (rm1Var22 != null) {
                            rm1Var22.invoke();
                            break;
                        }
                        break;
                }
                return wd5Var;
            }
        };
        Resources resources4 = context.getResources();
        ap3 ap3Var4 = new ap3(rm1Var2, rm1Var, b4);
        if (z4) {
            e43Var2.a(new c35(j16.w0, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, ap3Var4));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            d35 d35Var5 = d35.Autofill;
            if (u45Var.h() && d65.c(u45Var.l().b)) {
                b = 1;
            }
            rm1 rm1Var3 = new rm1() { // from class: z45
                @Override // defpackage.rm1
                public final Object invoke() {
                    byte b6 = b5;
                    wd5 wd5Var = wd5.a;
                    u45 u45Var2 = u45Var;
                    switch (b6) {
                        case 0:
                            break;
                        case 1:
                            d55 b7 = u45.b(u45Var2.l().a, ui4.c(0, u45Var2.l().a.J.length()));
                            u45Var2.c.invoke(b7);
                            long j = b7.b;
                            u45Var2.v = new d65(j);
                            u45Var2.t = d55.a(u45Var2.t, null, j, 5);
                            u45Var2.e(true);
                            break;
                        default:
                            rm1 rm1Var22 = u45Var2.f;
                            if (rm1Var22 != null) {
                                rm1Var22.invoke();
                                break;
                            }
                            break;
                    }
                    return wd5Var;
                }
            };
            Resources resources5 = context.getResources();
            ap3 ap3Var5 = new ap3(rm1Var3, fj0Var, b4);
            if (b != 0) {
                e43Var2.a(new c35(d35Var5.I, resources5.getString(d35Var5.J), d35Var5.K, ap3Var5));
            }
        }
        e43Var2.a(h35Var);
        return wd5.a;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        long floatToRawIntBits;
        o10 o10Var;
        w31 w31Var;
        Object g;
        boolean z;
        oh2 oh2Var;
        nj njVar;
        AsyncImagePainter.State transformOf$lambda$0;
        byte b = this.I;
        z31 z31Var = me1.a;
        byte b2 = 6;
        byte b3 = 10;
        byte b4 = 20;
        byte b5 = 15;
        byte b6 = 14;
        byte b7 = 2;
        byte b8 = 3;
        Object obj2 = null;
        boolean z2 = false;
        byte b9 = 1;
        wd5 wd5Var = wd5.a;
        Object obj3 = this.L;
        Object obj4 = this.K;
        Object obj5 = this.J;
        switch (b) {
            case 0:
                mb2 mb2Var = (mb2) obj;
                int i = ActionCallbackBroadcastReceiver.a;
                vb2 q = wb2.q();
                q.d();
                ((wb2) q.J).t((String) obj5);
                int i2 = ((lo) obj4).a;
                q.d();
                ((wb2) q.J).s(i2);
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(((k33) obj3).a);
                ArrayList arrayList = new ArrayList(unmodifiableMap.size());
                for (Map.Entry entry : unmodifiableMap.entrySet()) {
                    arrayList.add(new uj3(((a7) entry.getKey()).a, entry.getValue()));
                }
                uj3[] uj3VarArr = (uj3[]) arrayList.toArray(new uj3[0]);
                Bundle b0 = i42.b0(new uj3("ActionCallbackBroadcastReceiver:parameters", i42.b0((uj3[]) Arrays.copyOf(uj3VarArr, uj3VarArr.length))));
                Parcel obtain = Parcel.obtain();
                b0.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                e00 e = g00.e(marshall, 0, marshall.length);
                q.d();
                ((wb2) q.J).r(e);
                wb2 wb2Var = (wb2) q.b();
                mb2Var.d();
                ((zb2) mb2Var.J).D(wb2Var);
                return wd5Var;
            case 1:
                ((ay0) obj).getClass();
                return new ho((q73) obj5, (hu2) obj4, (p63) obj3);
            case 2:
                h74 h74Var = (h74) obj4;
                wy wyVar = (wy) obj3;
                y31 y31Var = (y31) obj;
                by4 by4Var = (by4) ((zw) obj5).b;
                by4Var.getClass();
                float floatValue = Float.valueOf(by4Var.I).floatValue();
                float f = floatValue < 0.0f ? 0.0f : floatValue;
                float f2 = f / 2.0f;
                float f3 = 2.0f * f;
                float min = Math.min(Math.abs(h74Var.b()), Math.abs(h74Var.a()));
                float f4 = h74Var.a;
                float f5 = h74Var.b;
                boolean z3 = f3 > min;
                long j = h74Var.e;
                rx4 rx4Var = new rx4(f, 0.0f, 0, 0, 30);
                if (z3) {
                    r7.n(y31Var, wyVar, (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L), (Float.floatToRawIntBits(h74Var.b()) << 32) | (Float.floatToRawIntBits(h74Var.a()) & 4294967295L), j, 0.0f, null, null, PsExtractor.VIDEO_STREAM_MASK);
                } else if (Float.intBitsToFloat((int) (j >> 32)) < f2) {
                    float f6 = f4 + f;
                    float f7 = f5 + f;
                    float f8 = h74Var.c - f;
                    float f9 = h74Var.d - f;
                    pn S = y31Var.S();
                    long H = S.H();
                    S.q().f();
                    try {
                        ((ep) S.b).o(f6, f7, f8, f9, 0);
                        r7.n(y31Var, wyVar, (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L), (Float.floatToRawIntBits(h74Var.b()) << 32) | (Float.floatToRawIntBits(h74Var.a()) & 4294967295L), j, 0.0f, null, null, PsExtractor.VIDEO_STREAM_MASK);
                    } finally {
                        r7.H(S, H);
                    }
                } else {
                    r7.n(y31Var, wyVar, (Float.floatToRawIntBits(f4 + f2) << 32) | (Float.floatToRawIntBits(f5 + f2) & 4294967295L), (Float.floatToRawIntBits(h74Var.b() - f) << 32) | (Float.floatToRawIntBits(h74Var.a() - f) & 4294967295L), c5.f0(j, f2), 0.0f, rx4Var, null, 208);
                }
                return wd5Var;
            case 3:
                m14 m14Var = (m14) obj4;
                float f10 = m14Var.b;
                float f11 = m14Var.d;
                float f12 = m14Var.a;
                float f13 = m14Var.c;
                wy wyVar2 = (wy) obj3;
                y31 y31Var2 = (y31) obj;
                by4 by4Var2 = (by4) ((zw) obj5).b;
                by4Var2.getClass();
                float floatValue2 = Float.valueOf(by4Var2.I).floatValue();
                float f14 = floatValue2 < 0.0f ? 0.0f : floatValue2;
                boolean z4 = f14 * 2.0f > Math.min(Math.abs(f13 - f12), Math.abs(f11 - f10));
                if (z4) {
                    floatToRawIntBits = m14Var.d();
                } else {
                    float f15 = f14 / 2.0f;
                    floatToRawIntBits = (Float.floatToRawIntBits(f12 + f15) << 32) | (Float.floatToRawIntBits(f15 + f10) & 4294967295L);
                }
                r7.l(y31Var2, wyVar2, floatToRawIntBits, z4 ? m14Var.c() : (Float.floatToRawIntBits((f13 - f12) - f14) << 32) | (Float.floatToRawIntBits((f11 - f10) - f14) & 4294967295L), 0.0f, z4 ? z31Var : new rx4(f14, 0.0f, 0, 0, 30), null, 104);
                return wd5Var;
            case 4:
                of2 of2Var = (of2) obj;
                of2Var.getClass();
                List list = (List) ((t43) obj5).getValue();
                bd0 bd0Var = new bd0(b3);
                byte b10 = 0;
                of2Var.a0(list.size(), new ee(bd0Var, list, b7), new v30(list, b10), new tc0(2039820996, new w30(list, (tm1) obj4, (s33) obj3, b10), true));
                return wd5Var;
            case 5:
                dl0 dl0Var = (dl0) obj5;
                jj3 jj3Var = (jj3) obj3;
                int intValue = ((Integer) obj).intValue();
                gk3 gk3Var = (gk3) ((s33) obj4);
                if (intValue != gk3Var.h()) {
                    gk3Var.i(intValue);
                    p70.g0(dl0Var, null, null, new t30(jj3Var, intValue, null, (byte) 0), 3);
                }
                return wd5Var;
            case 6:
                ei0 ei0Var = (ei0) obj5;
                v52 v52Var = (v52) obj4;
                mc4 mc4Var = (mc4) obj3;
                float floatValue3 = ((Float) obj).floatValue();
                float f16 = ei0Var.K ? 1.0f : -1.0f;
                oc4 oc4Var = ei0Var.J;
                long f17 = oc4Var.f(oc4Var.i(f16 * floatValue3));
                oc4 oc4Var2 = mc4Var.a;
                float h = oc4Var.h(oc4Var.f(oc4Var2.d(oc4Var2.k, f17, 1))) * f16;
                if (Math.abs(h) < Math.abs(floatValue3)) {
                    v52Var.e(e41.a("Scroll animation cancelled because scroll was not consumed (" + h + " < " + floatValue3 + ")", null));
                }
                return wd5Var;
            case 7:
                oh2 oh2Var2 = (oh2) obj5;
                long j2 = ((d55) obj4).b;
                td3 td3Var = (td3) obj3;
                y31 y31Var3 = (y31) obj;
                v55 d = oh2Var2.d();
                if (d != null) {
                    o10 q2 = y31Var3.S().q();
                    long j3 = ((d65) oh2Var2.A.getValue()).a;
                    long j4 = ((d65) oh2Var2.B.getValue()).a;
                    u55 u55Var = d.a;
                    t55 t55Var = u55Var.a;
                    pd pdVar = oh2Var2.y;
                    long j5 = oh2Var2.z;
                    if (!d65.c(j3)) {
                        pdVar.f(j5);
                        int k = td3Var.k(d65.f(j3));
                        int k2 = td3Var.k(d65.e(j3));
                        if (k != k2) {
                            q2.d(u55Var.j(k, k2), pdVar);
                        }
                    } else if (!d65.c(j4)) {
                        long c = t55Var.b.c();
                        x70 x70Var = c == 16 ? null : new x70(c);
                        long j6 = x70Var != null ? x70Var.a : x70.b;
                        pdVar.f(x70.c(j6, x70.d(j6) * 0.2f));
                        int k3 = td3Var.k(d65.f(j4));
                        int k4 = td3Var.k(d65.e(j4));
                        if (k3 != k4) {
                            q2.d(u55Var.j(k3, k4), pdVar);
                        }
                    } else if (!d65.c(j2)) {
                        pdVar.f(j5);
                        int k5 = td3Var.k(d65.f(j2));
                        int k6 = td3Var.k(d65.e(j2));
                        if (k5 != k6) {
                            q2.d(u55Var.j(k5, k6), pdVar);
                        }
                    }
                    boolean z5 = u55Var.d() && t55Var.f != 3;
                    if (z5) {
                        long j7 = u55Var.c;
                        m14 g2 = sv2.g(0L, (Float.floatToRawIntBits((int) (j7 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j7 & 4294967295L)) & 4294967295L));
                        q2.f();
                        q2.q(g2);
                    }
                    yt4 yt4Var = t55Var.b.a;
                    m35 m35Var = yt4Var.m;
                    g55 g55Var = yt4Var.a;
                    if (m35Var == null) {
                        m35Var = m35.b;
                    }
                    m35 m35Var2 = m35Var;
                    an4 an4Var = yt4Var.n;
                    if (an4Var == null) {
                        an4Var = an4.d;
                    }
                    an4 an4Var2 = an4Var;
                    z31 z31Var2 = yt4Var.p;
                    z31 z31Var3 = z31Var2 == null ? z31Var : z31Var2;
                    try {
                        wy d2 = g55Var.d();
                        f55 f55Var = f55.a;
                        try {
                            if (d2 != null) {
                                o10Var = q2;
                                w23.j(u55Var.b, o10Var, d2, g55Var != f55Var ? g55Var.getAlpha() : 1.0f, an4Var2, m35Var2, z31Var3);
                            } else {
                                o10Var = q2;
                                w23.i(u55Var.b, o10Var, g55Var != f55Var ? g55Var.a() : x70.b, an4Var2, m35Var2, z31Var3);
                            }
                            if (z5) {
                                o10Var.n();
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (z5) {
                                q2.n();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return wd5Var;
            case 8:
                o24 o24Var = (o24) obj5;
                aj ajVar = (aj) obj;
                float floatValue4 = ((Number) ajVar.e.getValue()).floatValue() - o24Var.I;
                float a = ((kc4) obj4).a(floatValue4);
                o24Var.I = ((Number) ajVar.e.getValue()).floatValue();
                ((o24) obj3).I = ((Number) ajVar.a.b.invoke(ajVar.f)).floatValue();
                if (Math.abs(floatValue4 - a) > 0.5f) {
                    ajVar.a();
                }
                return wd5Var;
            case 9:
                Context context = (Context) obj4;
                av avVar = (av) obj3;
                yi0 yi0Var = (yi0) obj;
                List list2 = ((v25) obj5).a;
                int size = list2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    u25 u25Var = (u25) list2.get(i3);
                    if (u25Var instanceof c35) {
                        c35 c35Var = (c35) u25Var;
                        yi0.b(yi0Var, new rd(c35Var, b7), c35Var.c == 0 ? null : new tc0(-1930700965, new b35(c35Var, b7), true), new ka(c35Var, avVar, b6), 6);
                    } else if (u25Var instanceof j35) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            rn3.d(yi0Var, context, (j35) u25Var);
                        }
                    } else if (u25Var instanceof h35) {
                        yi0Var.a.add(eu5.h);
                    }
                }
                return wd5Var;
            case 10:
                gt4 gt4Var = (gt4) obj5;
                p63 p63Var = (p63) obj4;
                gt4Var.add(p63Var);
                return new ho((sw0) obj3, p63Var, gt4Var);
            case 11:
                pr4 pr4Var = (pr4) obj5;
                pg3 pg3Var = (pg3) obj3;
                long j8 = ((m21) obj).a;
                long g3 = ((p31) obj4).h0 ? pd3.g(j8, -1.0f) : pd3.g(j8, 1.0f);
                m31 m31Var = n31.a;
                pr4Var.a.a(Float.intBitsToFloat((int) (pg3Var == pg3.I ? g3 & 4294967295L : g3 >> 32)));
                return wd5Var;
            case 12:
                ab4 ab4Var = (ab4) obj;
                ab4Var.getClass();
                i42.P((ab4) obj5, (hu2) obj4, (t43) obj3, ab4Var);
                return wd5Var;
            case 13:
                ya2 ya2Var = (ya2) obj5;
                r10 r10Var = ya2Var.I;
                tm1 tm1Var = (tm1) obj3;
                y31 y31Var4 = (y31) obj;
                w31 w31Var2 = ya2Var.J;
                ya2Var.J = (w31) obj4;
                try {
                    iu0 u = y31Var4.S().u();
                    da2 C = y31Var4.S().C();
                    o10 q3 = y31Var4.S().q();
                    long H2 = y31Var4.S().H();
                    jr1 jr1Var = (jr1) y31Var4.S().c;
                    iu0 u2 = r10Var.J.u();
                    da2 C2 = r10Var.J.C();
                    o10 q4 = r10Var.J.q();
                    long H3 = r10Var.J.H();
                    pn pnVar = r10Var.J;
                    try {
                        jr1 jr1Var2 = (jr1) pnVar.c;
                        pnVar.V(u);
                        pnVar.W(C);
                        pnVar.U(q3);
                        pnVar.X(H2);
                        pnVar.c = jr1Var;
                        q3.f();
                        try {
                            tm1Var.invoke(ya2Var);
                            q3.n();
                            pn pnVar2 = r10Var.J;
                            pnVar2.V(u2);
                            pnVar2.W(C2);
                            pnVar2.U(q4);
                            pnVar2.X(H3);
                            pnVar2.c = jr1Var2;
                            ya2Var.J = w31Var2;
                            return wd5Var;
                        } catch (Throwable th3) {
                            w31Var = w31Var2;
                            try {
                                q3.n();
                                pn pnVar3 = r10Var.J;
                                pnVar3.V(u2);
                                pnVar3.W(C2);
                                pnVar3.U(q4);
                                pnVar3.X(H3);
                                pnVar3.c = jr1Var2;
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                ya2Var.J = w31Var;
                                throw th;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        w31Var = w31Var2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    w31Var = w31Var2;
                }
            case 14:
                vi2 vi2Var = (vi2) obj5;
                final ji2 ji2Var = (ji2) obj4;
                final t43 t43Var = (t43) obj3;
                ti2 ti2Var = new ti2() { // from class: pi2
                    @Override // defpackage.ti2
                    public final void e(vi2 vi2Var2, ji2 ji2Var2) {
                        if (ji2Var2 == ji2.this) {
                            ((rm1) t43Var.getValue()).invoke();
                        }
                    }
                };
                vi2Var.k().a(ti2Var);
                return new ow0(vi2Var, ti2Var, b7);
            case 15:
                tm1 tm1Var2 = (tm1) obj4;
                String str = (String) obj5;
                oi1 oi1Var = (oi1) obj;
                oi1Var.getClass();
                ((t43) obj3).setValue(Boolean.valueOf(oi1Var.b()));
                if (oi1Var.b()) {
                    tm1Var2.invoke(str);
                }
                return wd5Var;
            case 16:
                c33 c33Var = (c33) obj4;
                r24 r24Var = (r24) obj3;
                if (((Set) obj5).contains(obj) && (g = c33Var.b.g(obj)) != null) {
                    if (g instanceof o43) {
                        o43 o43Var = (o43) g;
                        Object[] objArr = o43Var.b;
                        long[] jArr = o43Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j9 = jArr[i4];
                                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                                    for (int i6 = 0; i6 < i5; i6++) {
                                        if ((255 & j9) < 128) {
                                            mj4 mj4Var = (mj4) objArr[(i4 << 3) + i6];
                                            Object obj6 = r24Var.I;
                                            Object obj7 = obj6;
                                            if (obj6 == null) {
                                                ArrayList arrayList2 = new ArrayList();
                                                r24Var.I = arrayList2;
                                                obj7 = arrayList2;
                                            }
                                            ((List) obj7).add(mj4Var);
                                        }
                                        j9 >>= 8;
                                    }
                                    if (i5 != 8) {
                                    }
                                }
                                if (i4 != length) {
                                    i4++;
                                }
                            }
                        }
                    } else {
                        mj4 mj4Var2 = (mj4) g;
                        Object obj8 = r24Var.I;
                        Object obj9 = obj8;
                        if (obj8 == null) {
                            ArrayList arrayList3 = new ArrayList();
                            r24Var.I = arrayList3;
                            obj9 = arrayList3;
                        }
                        ((List) obj9).add(mj4Var2);
                    }
                }
                return wd5Var;
            case 17:
                String str2 = (String) obj;
                str2.getClass();
                ((hu2) obj5).E("", "", "", str2);
                ((t43) obj3).setValue(Boolean.FALSE);
                ((rm1) obj4).invoke();
                return wd5Var;
            case 18:
                uh uhVar = (uh) obj;
                uhVar.getClass();
                return uhVar.a(qb.j0(ma1.e((ve1) obj5, 2), ma1.f((ve1) obj4, 2)), new vq4(new rd((ve1) obj3, (byte) 12)));
            case 19:
                hu2 hu2Var = (hu2) obj5;
                t43 t43Var2 = (t43) obj3;
                String str3 = (String) obj;
                str3.getClass();
                Iterator it = ((List) ((cw4) obj4).getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (j42.c(((dl4) next).a, str3)) {
                            obj2 = next;
                        }
                    }
                }
                dl4 dl4Var = (dl4) obj2;
                if (dl4Var == null || !dl4Var.b()) {
                    hu2Var.H(str3);
                } else {
                    t43Var2.setValue(dl4Var);
                }
                return wd5Var;
            case 20:
                List list3 = (List) obj5;
                List list4 = (List) obj4;
                tm1 tm1Var3 = (tm1) obj3;
                of2 of2Var2 = (of2) obj;
                of2Var2.getClass();
                if (!list3.isEmpty()) {
                    of2Var2.Z("split-history-title", "title", wx5.n);
                    List l1 = o70.l1(list3, 10);
                    of2Var2.a0(l1.size(), new ee(new fa4(b2), l1, b4), new v30(l1, b6), new tc0(2039820996, new qo0(b7, tm1Var3, l1), true));
                }
                if (!list4.isEmpty()) {
                    of2Var2.Z("split-hot-title", "title", wx5.o);
                    List l12 = o70.l1(list4, 14);
                    of2Var2.a0(l12.size(), new ee(new fa4((byte) 7), l12, (byte) 21), new v30(l12, b5), new tc0(2039820996, new qo0(b8, tm1Var3, l12), true));
                }
                return wd5Var;
            case 21:
                List list5 = (List) obj5;
                of2 of2Var3 = (of2) obj;
                of2Var3.getClass();
                of2Var3.a0(list5.size(), new v30(b4, new yv3(b6), list5), new ee(new yv3(b5), list5, (byte) 26), new tc0(802480018, new w30(list5, obj4, (tm1) obj3, b8), true));
                return wd5Var;
            case 22:
                zp4 zp4Var = (zp4) obj5;
                hn3 hn3Var = (hn3) obj4;
                n24 n24Var = (n24) obj3;
                rp3 rp3Var = (rp3) obj;
                long j10 = rp3Var.c;
                u45 u45Var = (u45) zp4Var.d;
                if (!u45Var.i() || u45Var.l().a.J.length() == 0 || (oh2Var = u45Var.d) == null || oh2Var.d() == null) {
                    z = false;
                } else {
                    zp4Var.c(u45Var.l(), j10, false, hn3Var);
                    z = true;
                }
                if (z) {
                    rp3Var.a();
                    n24Var.I = true;
                }
                return wd5Var;
            case 23:
                a85 a85Var = (a85) obj5;
                z75 z75Var = (z75) obj4;
                k32 k32Var = (k32) obj3;
                if (t41.c(a85Var.a(), z75Var.b) < 0) {
                    long j11 = z75Var.b;
                    AtomicReference atomicReference = a85Var.J;
                    while (true) {
                        Object obj10 = atomicReference.get();
                        Long l = (Long) obj10;
                        if (l == null) {
                            zy.i("Start the timer with startTimer before calling addTime");
                            return null;
                        }
                        if (j11 <= 0) {
                            s83.t("Cannot call addTime with a negative duration");
                            return null;
                        }
                        Long valueOf = Long.valueOf(t41.d(j11) + l.longValue());
                        while (!atomicReference.compareAndSet(obj10, valueOf)) {
                            if (atomicReference.get() != obj10) {
                                break;
                            }
                        }
                    }
                }
                p70.g0(a85Var, null, null, new j32(k32Var, z2 ? 1 : 0, b9), 3);
                return wd5Var;
            case 24:
                hu2 hu2Var2 = (hu2) obj5;
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                fl4 fl4Var = hu2Var2.h.b;
                i82.V(fl4Var.a, "tv_launcher_channel_enabled", booleanValue);
                fw4 fw4Var = fl4Var.C;
                fw4Var.getClass();
                fw4Var.i(null, bool);
                p70.g0((dl0) obj4, null, null, new nm4(booleanValue, hu2Var2, (qu2) obj3, null), 3);
                return wd5Var;
            case 25:
                n24 n24Var2 = (n24) obj5;
                nj njVar2 = (nj) obj4;
                yt4 yt4Var2 = (yt4) obj3;
                nj njVar3 = (nj) obj;
                if (n24Var2.I) {
                    Object obj11 = njVar3.a;
                    int i7 = njVar3.c;
                    int i8 = njVar3.b;
                    if ((obj11 instanceof yt4) && i8 == njVar2.b && i7 == njVar2.c) {
                        if (yt4Var2 == null) {
                            yt4Var2 = new yt4(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        }
                        njVar = new nj(i8, i7, yt4Var2);
                        n24Var2.I = njVar2.equals(njVar3);
                        return njVar;
                    }
                }
                njVar = njVar3;
                n24Var2.I = njVar2.equals(njVar3);
                return njVar;
            case 26:
                tm1 tm1Var4 = (tm1) obj4;
                m55 m55Var = (m55) ((r24) obj3).I;
                d55 g4 = ((g12) obj5).g((List) obj);
                if (m55Var != null) {
                    m55Var.a(null, g4);
                }
                tm1Var4.invoke(g4);
                return wd5Var;
            case 27:
                return a(obj);
            case 28:
                return b(obj);
            default:
                transformOf$lambda$0 = UtilsKt.transformOf$lambda$0((rj3) obj5, (rj3) obj4, (rj3) obj3, (AsyncImagePainter.State) obj);
                return transformOf$lambda$0;
        }
    }

    public /* synthetic */ m6(ei0 ei0Var, bf5 bf5Var, v52 v52Var, mc4 mc4Var) {
        this.I = (byte) 6;
        this.J = ei0Var;
        this.K = v52Var;
        this.L = mc4Var;
    }

    public /* synthetic */ m6(o24 o24Var, kc4 kc4Var, o24 o24Var2, mr0 mr0Var) {
        this.I = (byte) 8;
        this.J = o24Var;
        this.K = kc4Var;
        this.L = o24Var2;
    }

    public /* synthetic */ m6(a85 a85Var, z75 z75Var, vo voVar, k32 k32Var) {
        this.I = (byte) 23;
        this.J = a85Var;
        this.K = z75Var;
        this.L = k32Var;
    }

    public /* synthetic */ m6(Object obj, Object obj2, Object obj3, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
        this.L = obj3;
    }
}

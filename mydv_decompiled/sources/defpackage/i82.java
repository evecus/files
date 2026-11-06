package defpackage;

import android.content.SharedPreferences;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.Timeline;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import coil3.network.internal.UtilsKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class i82 {
    public static void A(DefaultLoadControl defaultLoadControl, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        defaultLoadControl.onTracksSelected(rendererArr, trackGroupArray, exoTrackSelectionArr);
    }

    public static void B() {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    public static void C(vp3 vp3Var) {
        vp3Var.y();
    }

    public static void D() {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    public static void E(fk3 fk3Var, Object obj) {
        fk3Var.i(((Number) obj).floatValue());
    }

    public static void F(gk3 gk3Var, Object obj) {
        gk3Var.i(((Number) obj).intValue());
    }

    public static void G(hk3 hk3Var, Object obj) {
        hk3Var.i(((Number) obj).longValue());
    }

    public static void H() {
        throw new IllegalStateException("shouldContinueLoading not implemented");
    }

    public static void I() {
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }

    public static boolean J(DefaultLoadControl defaultLoadControl, long j, float f, boolean z, long j2) {
        return defaultLoadControl.shouldStartPlayback(j, f, z, j2);
    }

    public static int K(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return b0(str);
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    public static /* synthetic */ String L(int i) {
        switch (i) {
            case 1:
                return "Switching Protocols";
            case 2:
                return "OK";
            case 3:
                return "Created";
            case 4:
                return "Accepted";
            case 5:
                return "No Content";
            case 6:
                return "Partial Content";
            case 7:
                return "Multi-Status";
            case 8:
                return "Moved Permanently";
            case 9:
                return "Found";
            case 10:
                return "See Other";
            case 11:
                return "Not Modified";
            case 12:
                return "Temporary Redirect";
            case 13:
                return "Bad Request";
            case 14:
                return "Unauthorized";
            case 15:
                return "Forbidden";
            case 16:
                return "Not Found";
            case 17:
                return "Method Not Allowed";
            case 18:
                return "Not Acceptable";
            case 19:
                return "Request Timeout";
            case 20:
                return "Conflict";
            case 21:
                return "Gone";
            case 22:
                return "Length Required";
            case 23:
                return "Precondition Failed";
            case 24:
                return "Payload Too Large";
            case 25:
                return "Unsupported Media Type";
            case 26:
                return "Requested Range Not Satisfiable";
            case 27:
                return "Expectation Failed";
            case 28:
                return "Too Many Requests";
            case 29:
                return "Internal Server Error";
            case 30:
                return "Not Implemented";
            case 31:
                return "Service Unavailable";
            case 32:
                return "HTTP Version Not Supported";
            default:
                throw null;
        }
    }

    public static /* synthetic */ void M(of2 of2Var, String str, tc0 tc0Var, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        of2Var.Z(str, null, tc0Var);
    }

    public static /* synthetic */ void N(kg2 kg2Var, String str, tc0 tc0Var, int i) {
        n84 n84Var = n84.O0;
        String str2 = (i & 2) != 0 ? null : MimeTypes.BASE_TYPE_VIDEO;
        if ((i & 4) != 0) {
            n84Var = null;
        }
        kg2Var.Z(str, str2, n84Var, tc0Var);
    }

    public static int O(int i, int i2, int i3) {
        return i70.m(i) + i2 + i3;
    }

    public static int P(int i, int i2, int i3, int i4) {
        return i70.n(i) + i2 + i3 + i4;
    }

    public static /* synthetic */ int Q(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static void S(int i, int i2, int i3, int i4, int i5) {
        e21.b(i);
        e21.b(i2);
        e21.b(i3);
        e21.b(i4);
        e21.b(i5);
    }

    public static /* synthetic */ void T(br2 br2Var, dr2 dr2Var, dr2 dr2Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = br2.a;
        while (!atomicReferenceFieldUpdater.compareAndSet(br2Var, dr2Var, dr2Var2) && atomicReferenceFieldUpdater.get(br2Var) == dr2Var) {
        }
    }

    public static /* synthetic */ void U(dr2 dr2Var, dr2 dr2Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = dr2.e;
        while (!atomicReferenceFieldUpdater.compareAndSet(dr2Var, null, dr2Var2) && atomicReferenceFieldUpdater.get(dr2Var) == null) {
        }
    }

    public static void V(SharedPreferences sharedPreferences, String str, boolean z) {
        sharedPreferences.edit().putBoolean(str, z).apply();
    }

    public static /* synthetic */ void W(Object obj) {
        throw new ClassCastException();
    }

    public static /* synthetic */ void X(AtomicReference atomicReference) {
        ol3 ol3Var;
        do {
            ol3Var = ol3.N;
            if (atomicReference.compareAndSet(ol3Var, ol3.L)) {
                return;
            }
        } while (atomicReference.get() == ol3Var);
    }

    public static /* synthetic */ boolean Y(i73 i73Var) {
        return i73Var != null;
    }

    public static /* synthetic */ boolean Z(AtomicReference atomicReference, g53 g53Var, g53 g53Var2) {
        while (!atomicReference.compareAndSet(g53Var, g53Var2)) {
            if (atomicReference.get() != g53Var) {
                return false;
            }
        }
        return true;
    }

    public static void a() {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    public static af2 a0(uu2 uu2Var, int i) {
        ag2 ag2Var = (ag2) uu2Var.I;
        ns4 i2 = o63.i();
        tm1 e = i2 != null ? i2.e() : null;
        ns4 j = o63.j(i2);
        try {
            uf2 uf2Var = (uf2) ag2Var.f.getValue();
            o63.o(i2, j, e);
            return ag2Var.q.a(i, uf2Var.j, ag2Var.d, new c22(i, uf2Var));
        } catch (Throwable th) {
            o63.o(i2, j, e);
            throw th;
        }
    }

    public static void b() {
        List list = Collections.EMPTY_LIST;
    }

    public static /* synthetic */ int b0(String str) {
        if (str == null) {
            zy.m("Name is null");
            return 0;
        }
        if (str.equals(UtilsKt.HTTP_METHOD_GET)) {
            return 1;
        }
        if (str.equals("PUT")) {
            return 2;
        }
        if (str.equals(HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST)) {
            return 3;
        }
        if (str.equals("DELETE")) {
            return 4;
        }
        if (str.equals("HEAD")) {
            return 5;
        }
        if (str.equals("OPTIONS")) {
            return 6;
        }
        if (str.equals("TRACE")) {
            return 7;
        }
        if (str.equals("CONNECT")) {
            return 8;
        }
        if (str.equals("PATCH")) {
            return 9;
        }
        if (str.equals("PROPFIND")) {
            return 10;
        }
        if (str.equals("PROPPATCH")) {
            return 11;
        }
        if (str.equals("MKCOL")) {
            return 12;
        }
        if (str.equals("MOVE")) {
            return 13;
        }
        if (str.equals("COPY")) {
            return 14;
        }
        if (str.equals("LOCK")) {
            return 15;
        }
        if (str.equals("UNLOCK")) {
            return 16;
        }
        s83.t("No enum constant fi.iki.elonen.NanoHTTPD.Method.".concat(str));
        return 0;
    }

    public static long c() {
        return c95.a;
    }

    public static Float d(fk3 fk3Var) {
        return Float.valueOf(fk3Var.h());
    }

    public static Integer e(gk3 gk3Var) {
        return Integer.valueOf(gk3Var.h());
    }

    public static Long f(hk3 hk3Var) {
        return Long.valueOf(hk3Var.h());
    }

    public static boolean g(gr2 gr2Var, int i) {
        char c;
        if (i == 1) {
            c = '(';
        } else if (i == 2) {
            c = 30;
        } else if (i == 3) {
            c = 20;
        } else if (i == 4) {
            c = '\n';
        } else {
            if (i != 5) {
                throw null;
            }
            c = 0;
        }
        if (c == 0) {
            return gr2Var.h();
        }
        if (c == '\n') {
            return gr2Var.b();
        }
        if (c == 20) {
            return gr2Var.g();
        }
        if (c == 30) {
            return gr2Var.a();
        }
        if (c == '(') {
            return gr2Var.f();
        }
        throw new IllegalArgumentException("Level [" + (i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "TRACE" : "DEBUG" : "INFO" : "WARN" : "ERROR") + "] not recognized.");
    }

    public static int h(la2 la2Var, b42 b42Var, a42 a42Var, int i) {
        return la2Var.mo48measure3p2s80s(new p42(b42Var, b42Var.getLayoutDirection()), new tr0(a42Var, dx2.J, ex2.J, (byte) 1), eh0.b(0, i, 0, 0, 13)).getHeight();
    }

    public static int i(na2 na2Var, b42 b42Var, a42 a42Var, int i) {
        return na2Var.mo34measure3p2s80s(new p42(b42Var, b42Var.getLayoutDirection()), new tr0(a42Var, qa3.J, ra3.J, (byte) 2), eh0.b(0, i, 0, 0, 13)).getHeight();
    }

    public static int j(uw2 uw2Var, b42 b42Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        byte b = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new tr0((a42) list.get(i2), c42.J, g42.J, b));
        }
        return uw2Var.mo35measure3p2s80s(new p42(b42Var, b42Var.getLayoutDirection()), arrayList, eh0.b(0, i, 0, 0, 13)).getHeight();
    }

    public static int k(la2 la2Var, b42 b42Var, a42 a42Var, int i) {
        return la2Var.mo48measure3p2s80s(new p42(b42Var, b42Var.getLayoutDirection()), new tr0(a42Var, dx2.J, ex2.I, (byte) 1), eh0.b(0, 0, 0, i, 7)).getWidth();
    }

    public static int l(na2 na2Var, b42 b42Var, a42 a42Var, int i) {
        return na2Var.mo34measure3p2s80s(new p42(b42Var, b42Var.getLayoutDirection()), new tr0(a42Var, qa3.J, ra3.I, (byte) 2), eh0.b(0, 0, 0, i, 7)).getWidth();
    }

    public static int m(uw2 uw2Var, b42 b42Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        byte b = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new tr0((a42) list.get(i2), c42.J, g42.I, b));
        }
        return uw2Var.mo35measure3p2s80s(new p42(b42Var, b42Var.getLayoutDirection()), arrayList, eh0.b(0, 0, 0, i, 7)).getWidth();
    }

    public static int n(la2 la2Var, b42 b42Var, a42 a42Var, int i) {
        return la2Var.mo48measure3p2s80s(new p42(b42Var, b42Var.getLayoutDirection()), new tr0(a42Var, dx2.I, ex2.J, (byte) 1), eh0.b(0, i, 0, 0, 13)).getHeight();
    }

    public static int o(na2 na2Var, b42 b42Var, a42 a42Var, int i) {
        return na2Var.mo34measure3p2s80s(new p42(b42Var, b42Var.getLayoutDirection()), new tr0(a42Var, qa3.I, ra3.J, (byte) 2), eh0.b(0, i, 0, 0, 13)).getHeight();
    }

    public static int p(uw2 uw2Var, b42 b42Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        byte b = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new tr0((a42) list.get(i2), c42.I, g42.J, b));
        }
        return uw2Var.mo35measure3p2s80s(new p42(b42Var, b42Var.getLayoutDirection()), arrayList, eh0.b(0, i, 0, 0, 13)).getHeight();
    }

    public static int q(la2 la2Var, b42 b42Var, a42 a42Var, int i) {
        return la2Var.mo48measure3p2s80s(new p42(b42Var, b42Var.getLayoutDirection()), new tr0(a42Var, dx2.I, ex2.I, (byte) 1), eh0.b(0, 0, 0, i, 7)).getWidth();
    }

    public static int r(na2 na2Var, b42 b42Var, a42 a42Var, int i) {
        return na2Var.mo34measure3p2s80s(new p42(b42Var, b42Var.getLayoutDirection()), new tr0(a42Var, qa3.I, ra3.I, (byte) 2), eh0.b(0, 0, 0, i, 7)).getWidth();
    }

    public static int s(uw2 uw2Var, b42 b42Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        byte b = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new tr0((a42) list.get(i2), c42.I, g42.I, b));
        }
        return uw2Var.mo35measure3p2s80s(new p42(b42Var, b42Var.getLayoutDirection()), arrayList, eh0.b(0, 0, 0, i, 7)).getWidth();
    }

    public static void t(vp3 vp3Var) {
        vp3Var.y();
    }

    public static ji5 u() {
        return new ji5(0L);
    }

    public static ji5 v() {
        return new ji5(0L);
    }

    public static void w() {
        throw new IllegalStateException("onPrepared not implemented");
    }

    public static void x() {
        throw new IllegalStateException("onReleased not implemented");
    }

    public static void y() {
        throw new IllegalStateException("onStopped not implemented");
    }

    public static void z(DefaultLoadControl defaultLoadControl, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        defaultLoadControl.onTracksSelected(timeline, mediaPeriodId, rendererArr, trackGroupArray, exoTrackSelectionArr);
    }
}

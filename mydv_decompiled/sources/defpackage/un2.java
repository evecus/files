package defpackage;

import androidx.media3.common.Format;
import androidx.media3.common.Tracks;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class un2 {
    /* JADX WARN: Removed duplicated region for block: B:54:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.github.mytv.dv.model.LiveRoom r38, int r39, int r40, java.lang.String r41, defpackage.tm1 r42, defpackage.fe0 r43, int r44) {
        /*
            Method dump skipped, instructions count: 1050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.un2.a(com.github.mytv.dv.model.LiveRoom, int, int, java.lang.String, tm1, fe0, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:307:0x08d8  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0996  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0ef1  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0ef4  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0f1b  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0935  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x08db  */
    /* JADX WARN: Type inference failed for: r11v1, types: [fe0, go1] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v21 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r4v107, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final com.github.mytv.dv.model.LiveRoom r70, final boolean r71, final okhttp3.OkHttpClient r72, final androidx.media3.exoplayer.ExoPlayer r73, final java.util.List r74, final int r75, final defpackage.lq5 r76, final defpackage.dp3 r77, final defpackage.po3 r78, final boolean r79, final int r80, final defpackage.tm1 r81, final defpackage.tm1 r82, final defpackage.tm1 r83, final defpackage.rm1 r84, final defpackage.rm1 r85, final defpackage.rm1 r86, final defpackage.rm1 r87, final boolean r88, final boolean r89, final defpackage.tm1 r90, final defpackage.rm1 r91, defpackage.hv4 r92, final defpackage.x70 r93, final defpackage.hn1 r94, final boolean r95, final defpackage.l13 r96, defpackage.fe0 r97, final int r98) {
        /*
            Method dump skipped, instructions count: 3952
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.un2.b(com.github.mytv.dv.model.LiveRoom, boolean, okhttp3.OkHttpClient, androidx.media3.exoplayer.ExoPlayer, java.util.List, int, lq5, dp3, po3, boolean, int, tm1, tm1, tm1, rm1, rm1, rm1, rm1, boolean, boolean, tm1, rm1, hv4, x70, hn1, boolean, l13, fe0, int):void");
    }

    public static final String c(t43 t43Var) {
        return (String) t43Var.getValue();
    }

    public static final void d(t43 t43Var, boolean z) {
        t43Var.setValue(Boolean.valueOf(z));
    }

    public static final void e(t43 t43Var, Tracks tracks) {
        int i;
        ay1 listIterator = tracks.getGroups().listIterator(0);
        listIterator.getClass();
        Format format = null;
        while (listIterator.hasNext()) {
            Tracks.Group group = (Tracks.Group) listIterator.next();
            if (group.getType() == 2) {
                int i2 = group.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        break;
                    }
                    if (group.isTrackSelected(i3)) {
                        format = group.getTrackFormat(i3);
                        break;
                    }
                    i3++;
                }
            }
            if (format != null) {
                break;
            }
        }
        if (format == null) {
            return;
        }
        int i4 = format.width;
        if (i4 <= 0 || (i = format.height) <= 0) {
            t43Var.setValue(null);
            return;
        }
        t43Var.setValue(i4 + "×" + i);
    }

    public static final boolean f(t43 t43Var) {
        return ((Boolean) t43Var.getValue()).booleanValue();
    }

    public static final void g(List list, t43 t43Var, s33 s33Var, t43 t43Var2, t43 t43Var3, t43 t43Var4, t43 t43Var5, t43 t43Var6, ho2 ho2Var, String str) {
        if (((Boolean) t43Var.getValue()).booleanValue()) {
            return;
        }
        gk3 gk3Var = (gk3) s33Var;
        int h = gk3Var.h() + 1;
        if (h >= 0 && h < list.size()) {
            t43Var.setValue(Boolean.TRUE);
            Boolean bool = Boolean.FALSE;
            t43Var2.setValue(bool);
            d(t43Var3, true);
            t43Var4.setValue(bool);
            t43Var5.setValue(null);
            gk3Var.i(h);
            return;
        }
        t43Var.setValue(Boolean.TRUE);
        Boolean bool2 = Boolean.FALSE;
        t43Var2.setValue(bool2);
        d(t43Var3, true);
        t43Var4.setValue(bool2);
        t43Var5.setValue(str);
        tm1 tm1Var = (tm1) t43Var6.getValue();
        if (tm1Var != null) {
            tm1Var.invoke(ho2Var);
        }
    }
}

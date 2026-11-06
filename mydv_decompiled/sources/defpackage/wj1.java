package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class wj1 {
    public static final ss2 a = new ss2(2);
    public static final tj1 b = new tj1(0);

    public static ee0 a(Context context, List list) {
        String str;
        Typeface c;
        Trace.beginSection(ui4.s("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                xj1 xj1Var = (xj1) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (c = wb5.c((str = xj1Var.e))) == null || wb5.d(c) == null) {
                    ProviderInfo b2 = b(context.getPackageManager(), xj1Var, context.getResources());
                    if (b2 == null) {
                        return new ee0();
                    }
                    arrayList.add(c(context, xj1Var, b2.authority));
                } else {
                    arrayList.add(new sk1[]{new sk1(str, xj1Var.f)});
                }
            }
            return new ee0(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, xj1 xj1Var, Resources resources) {
        tj1 tj1Var = b;
        ss2 ss2Var = a;
        Trace.beginSection(ui4.s("FontProvider.getProvider"));
        try {
            List list = xj1Var.d;
            String str = xj1Var.a;
            String str2 = xj1Var.b;
            if (list == null) {
                list = k21.n0(resources, 0);
            }
            vj1 vj1Var = new vj1();
            vj1Var.a = str;
            vj1Var.b = str2;
            vj1Var.c = list;
            ProviderInfo providerInfo = (ProviderInfo) ss2Var.a(vj1Var);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!resolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, tj1Var);
            for (int i = 0; i < list.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                Collections.sort(arrayList2, tj1Var);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    ss2Var.b(vj1Var, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d5 A[Catch: all -> 0x0114, TryCatch #0 {all -> 0x0114, blocks: (B:26:0x00d0, B:28:0x00d5, B:30:0x00db, B:31:0x0104, B:35:0x010d, B:37:0x011b, B:39:0x0126, B:42:0x013c, B:45:0x0148, B:48:0x0153, B:52:0x0131), top: B:25:0x00d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0163 A[Catch: all -> 0x0185, TRY_ENTER, TryCatch #1 {all -> 0x0185, blocks: (B:3:0x0011, B:5:0x0046, B:58:0x0163, B:59:0x0166, B:66:0x017e, B:67:0x0181, B:68:0x0184, B:90:0x004c), top: B:2:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.sk1[] c(android.content.Context r22, defpackage.xj1 r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj1.c(android.content.Context, xj1, java.lang.String):sk1[]");
    }
}

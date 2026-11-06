package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class vq2 implements wq2 {
    public static final Locale[] c = new Locale[0];
    public final Locale[] a;
    public final String b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        uq2 uq2Var = uq2.b;
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
            return;
        }
        if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else if (split.length == 1) {
            new Locale(split[0]);
        } else {
            s83.t("Can not parse language tag: [en-Latn]");
        }
    }

    public vq2(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.a = c;
            this.b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale == null) {
                zy.m(r7.z("list[", i, "] is null"));
                throw null;
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                sb.append(locale2.getLanguage());
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    sb.append('-');
                    sb.append(locale2.getCountry());
                }
                if (i < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.b = sb.toString();
    }

    @Override // defpackage.wq2
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vq2)) {
            return false;
        }
        Locale[] localeArr = ((vq2) obj).a;
        Locale[] localeArr2 = this.a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i = 0; i < localeArr2.length; i++) {
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.wq2
    public final Locale get(int i) {
        if (i < 0) {
            return null;
        }
        Locale[] localeArr = this.a;
        if (i < localeArr.length) {
            return localeArr[i];
        }
        return null;
    }

    @Override // defpackage.wq2
    public final Object getLocaleList() {
        return null;
    }

    public final int hashCode() {
        int i = 1;
        for (Locale locale : this.a) {
            i = (i * 31) + locale.hashCode();
        }
        return i;
    }

    @Override // defpackage.wq2
    public final boolean isEmpty() {
        return this.a.length == 0;
    }

    @Override // defpackage.wq2
    public final int size() {
        return this.a.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.a;
            if (i >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i]);
            if (i < localeArr.length - 1) {
                sb.append(',');
            }
            i++;
        }
    }
}

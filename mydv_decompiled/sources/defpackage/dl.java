package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class dl {
    public static LocaleList a(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static LocaleList c() {
        return LocaleList.getDefault();
    }

    public static uq2 d(Configuration configuration) {
        return uq2.b(configuration.getLocales().toLanguageTags());
    }

    public static LocaleList e(Configuration configuration) {
        return configuration.getLocales();
    }

    public static void f(uq2 uq2Var) {
        LocaleList.setDefault(LocaleList.forLanguageTags(uq2Var.a.a()));
    }

    public static void g(Configuration configuration, uq2 uq2Var) {
        configuration.setLocales(LocaleList.forLanguageTags(uq2Var.a.a()));
    }
}

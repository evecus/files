package defpackage;

import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class yq2 {
    public static final Locale a;

    static {
        Locale locale;
        new HashMap();
        if (!"en".equalsIgnoreCase(Locale.getDefault().getLanguage())) {
            Locale[] availableLocales = Locale.getAvailableLocales();
            for (int i = 0; i != availableLocales.length; i++) {
                if ("en".equalsIgnoreCase(availableLocales[i].getLanguage())) {
                    locale = availableLocales[i];
                    break;
                }
            }
        }
        locale = Locale.getDefault();
        a = locale;
    }
}

package defpackage;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class v10 {
    public final Locale a;
    public final TimeZone b;
    public final SimpleDateFormat c;

    public v10(Locale locale, TimeZone timeZone) {
        this.a = locale;
        this.b = timeZone;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd", locale);
        simpleDateFormat.setTimeZone(timeZone);
        this.c = simpleDateFormat;
    }
}

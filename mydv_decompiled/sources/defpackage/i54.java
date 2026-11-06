package defpackage;

import androidx.media3.exoplayer.MediaPeriodQueue;
import com.github.mytv.dv.model.Aweme;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class i54 {
    public static final ThreadLocal a = new ThreadLocal();

    public static final String a(Aweme aweme) {
        Object g54Var;
        if (aweme.getCreateTime() <= 0) {
            return null;
        }
        long createTime = aweme.getCreateTime();
        long createTime2 = aweme.getCreateTime();
        if (createTime < MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US) {
            createTime2 *= 1000;
        }
        try {
            Locale locale = Locale.getDefault();
            TimeZone timeZone = TimeZone.getDefault();
            ThreadLocal threadLocal = a;
            v10 v10Var = (v10) threadLocal.get();
            if (v10Var == null || !v10Var.a.equals(locale) || !v10Var.b.equals(timeZone)) {
                locale.getClass();
                timeZone.getClass();
                v10Var = new v10(locale, timeZone);
                threadLocal.set(v10Var);
            }
            g54Var = v10Var.c.format(new Date(createTime2));
        } catch (Throwable th) {
            g54Var = new g54(th);
        }
        return (String) (g54Var instanceof g54 ? null : g54Var);
    }
}

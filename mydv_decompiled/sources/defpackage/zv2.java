package defpackage;

import java.util.List;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class zv2 {
    public final Matcher a;
    public final CharSequence b;
    public final yv2 c;
    public xv2 d;

    public zv2(Matcher matcher, CharSequence charSequence) {
        charSequence.getClass();
        this.a = matcher;
        this.b = charSequence;
        this.c = new yv2(this);
    }

    public final List a() {
        xv2 xv2Var = this.d;
        if (xv2Var != null) {
            return xv2Var;
        }
        xv2 xv2Var2 = new xv2(this);
        this.d = xv2Var2;
        return xv2Var2;
    }

    public final u22 b() {
        Matcher matcher = this.a;
        return ut0.c0(matcher.start(), matcher.end());
    }

    public final zv2 c() {
        Matcher matcher = this.a;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.b;
        if (end > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        return rt0.r(matcher2, end, charSequence);
    }
}

package defpackage;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class v24 implements Serializable {
    public final Pattern I;

    public v24(String str, int i) {
        str.getClass();
        Pattern compile = Pattern.compile(str, 66);
        compile.getClass();
        this.I = compile;
    }

    public static zv2 a(v24 v24Var, String str) {
        v24Var.getClass();
        str.getClass();
        Matcher matcher = v24Var.I.matcher(str);
        matcher.getClass();
        return rt0.r(matcher, 0, str);
    }

    public static ep1 b(v24 v24Var, CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() >= 0) {
            return new ep1(new k9(v24Var, charSequence, (byte) 13), u24.I);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + charSequence.length());
    }

    public final zv2 c(int i, String str) {
        Matcher region = this.I.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (region.lookingAt()) {
            return new zv2(region, str);
        }
        return null;
    }

    public final zv2 d(String str) {
        str.getClass();
        Matcher matcher = this.I.matcher(str);
        matcher.getClass();
        if (matcher.matches()) {
            return new zv2(matcher, str);
        }
        return null;
    }

    public final boolean e(CharSequence charSequence) {
        charSequence.getClass();
        return this.I.matcher(charSequence).matches();
    }

    public final String f(String str, tm1 tm1Var) {
        str.getClass();
        Matcher matcher = this.I.matcher(str);
        matcher.getClass();
        int i = 0;
        zv2 r = rt0.r(matcher, 0, str);
        if (r == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append((CharSequence) str, i, r.b().I);
            sb.append((CharSequence) tm1Var.invoke(r));
            i = r.b().J + 1;
            r = r.c();
            if (i >= length) {
                break;
            }
        } while (r != null);
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        return sb.toString();
    }

    public final String toString() {
        String pattern = this.I.toString();
        pattern.getClass();
        return pattern;
    }

    public v24(String str) {
        str.getClass();
        Pattern compile = Pattern.compile(str);
        compile.getClass();
        this.I = compile;
    }
}

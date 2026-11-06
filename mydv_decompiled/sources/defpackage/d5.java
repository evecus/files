package defpackage;

import java.text.BreakIterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class d5 extends b5 {
    public static d5 e;
    public static d5 f;
    public static d5 g;
    public static final s44 h = s44.J;
    public static final s44 i = s44.I;
    public final /* synthetic */ byte c;
    public Object d;

    public /* synthetic */ d5(byte b) {
        this.c = b;
    }

    @Override // defpackage.g5
    public final int[] b(int i2) {
        int i3;
        switch (this.c) {
            case 0:
                int length = i().length();
                if (length <= 0 || i2 >= length) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        j42.g0("impl");
                        throw null;
                    }
                    boolean isBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (isBoundary) {
                        if (breakIterator2 == null) {
                            j42.g0("impl");
                            throw null;
                        }
                        int following = breakIterator2.following(i2);
                        if (following == -1) {
                            return null;
                        }
                        return h(i2, following);
                    }
                    if (breakIterator2 == null) {
                        j42.g0("impl");
                        throw null;
                    }
                    i2 = breakIterator2.following(i2);
                } while (i2 != -1);
                return null;
            case 1:
                if (i().length() <= 0 || i2 >= i().length()) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                while (!p(i2) && (!p(i2) || (i2 != 0 && p(i2 - 1)))) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        j42.g0("impl");
                        throw null;
                    }
                    i2 = breakIterator3.following(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    j42.g0("impl");
                    throw null;
                }
                int following2 = breakIterator4.following(i2);
                if (following2 == -1 || !o(following2)) {
                    return null;
                }
                return h(i2, following2);
            default:
                if (i().length() <= 0 || i2 >= i().length()) {
                    return null;
                }
                u55 u55Var = (u55) this.d;
                s44 s44Var = h;
                if (i2 < 0) {
                    if (u55Var == null) {
                        j42.g0("layoutResult");
                        throw null;
                    }
                    i3 = u55Var.b.d(0);
                } else {
                    if (u55Var == null) {
                        j42.g0("layoutResult");
                        throw null;
                    }
                    int d = u55Var.b.d(i2);
                    i3 = m(d, s44Var) == i2 ? d : d + 1;
                }
                u55 u55Var2 = (u55) this.d;
                if (u55Var2 == null) {
                    j42.g0("layoutResult");
                    throw null;
                }
                if (i3 >= u55Var2.b.f) {
                    return null;
                }
                return h(m(i3, s44Var), m(i3, i) + 1);
        }
    }

    @Override // defpackage.g5
    public final int[] d(int i2) {
        int i3;
        switch (this.c) {
            case 0:
                int length = i().length();
                if (length <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length) {
                    i2 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        j42.g0("impl");
                        throw null;
                    }
                    boolean isBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (isBoundary) {
                        if (breakIterator2 == null) {
                            j42.g0("impl");
                            throw null;
                        }
                        int preceding = breakIterator2.preceding(i2);
                        if (preceding == -1) {
                            return null;
                        }
                        return h(preceding, i2);
                    }
                    if (breakIterator2 == null) {
                        j42.g0("impl");
                        throw null;
                    }
                    i2 = breakIterator2.preceding(i2);
                } while (i2 != -1);
                return null;
            case 1:
                int length2 = i().length();
                if (length2 <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length2) {
                    i2 = length2;
                }
                while (i2 > 0 && !p(i2 - 1) && !o(i2)) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        j42.g0("impl");
                        throw null;
                    }
                    i2 = breakIterator3.preceding(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    j42.g0("impl");
                    throw null;
                }
                int preceding2 = breakIterator4.preceding(i2);
                if (preceding2 == -1 || !p(preceding2)) {
                    return null;
                }
                if (preceding2 == 0 || !p(preceding2 - 1)) {
                    return h(preceding2, i2);
                }
                return null;
            default:
                if (i().length() <= 0 || i2 <= 0) {
                    return null;
                }
                int length3 = i().length();
                u55 u55Var = (u55) this.d;
                s44 s44Var = i;
                if (i2 > length3) {
                    if (u55Var == null) {
                        j42.g0("layoutResult");
                        throw null;
                    }
                    i3 = u55Var.b.d(i().length());
                } else {
                    if (u55Var == null) {
                        j42.g0("layoutResult");
                        throw null;
                    }
                    int d = u55Var.b.d(i2);
                    i3 = m(d, s44Var) + 1 == i2 ? d : d - 1;
                }
                if (i3 < 0) {
                    return null;
                }
                return h(m(i3, h), m(i3, s44Var) + 1);
        }
    }

    @Override // defpackage.b5
    public void j(String str) {
        switch (this.c) {
            case 0:
                this.a = str;
                BreakIterator breakIterator = (BreakIterator) this.d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    j42.g0("impl");
                    throw null;
                }
            case 1:
                this.a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    j42.g0("impl");
                    throw null;
                }
            default:
                super.j(str);
                return;
        }
    }

    public int m(int i2, s44 s44Var) {
        u55 u55Var = (u55) this.d;
        if (u55Var == null) {
            j42.g0("layoutResult");
            throw null;
        }
        int h2 = u55Var.h(i2);
        u55 u55Var2 = (u55) this.d;
        if (u55Var2 == null) {
            j42.g0("layoutResult");
            throw null;
        }
        s44 i3 = u55Var2.i(h2);
        u55 u55Var3 = (u55) this.d;
        if (s44Var != i3) {
            if (u55Var3 != null) {
                return u55Var3.h(i2);
            }
            j42.g0("layoutResult");
            throw null;
        }
        if (u55Var3 != null) {
            return u55Var3.b.c(i2, false) - 1;
        }
        j42.g0("layoutResult");
        throw null;
    }

    public void n(String str, u55 u55Var) {
        this.a = str;
        this.d = u55Var;
    }

    public boolean o(int i2) {
        if (i2 <= 0 || !p(i2 - 1)) {
            return false;
        }
        return i2 == i().length() || !p(i2);
    }

    public boolean p(int i2) {
        if (i2 < 0 || i2 >= i().length()) {
            return false;
        }
        return Character.isLetterOrDigit(i().codePointAt(i2));
    }
}

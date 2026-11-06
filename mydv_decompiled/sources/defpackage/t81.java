package defpackage;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class t81 {
    public static final Pattern a = Pattern.compile("\\[[^\\[\\]]+\\]");
    public static final fw4 b;
    public static final p04 c;
    public static final ConcurrentHashMap d;
    public static final Set e;
    public static final fw4 f;
    public static final p04 g;

    static {
        fw4 c2 = o7.c(p91.I);
        b = c2;
        c = sv2.j(c2);
        d = new ConcurrentHashMap();
        e = DesugarCollections.synchronizedSet(new LinkedHashSet());
        fw4 c3 = o7.c(0);
        f = c3;
        g = sv2.j(c3);
    }
}

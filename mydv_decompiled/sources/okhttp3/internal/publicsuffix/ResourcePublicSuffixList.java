package okhttp3.internal.publicsuffix;

import defpackage.er0;
import defpackage.ke1;
import defpackage.o63;
import defpackage.ok3;
import defpackage.ut4;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ResourcePublicSuffixList extends BasePublicSuffixList {
    public static final Companion Companion = new Companion(null);
    public static final ok3 PUBLIC_SUFFIX_RESOURCE;
    private final ke1 fileSystem;
    private final ok3 path;

    static {
        String str = ok3.J;
        PUBLIC_SUFFIX_RESOURCE = o63.f("okhttp3/internal/publicsuffix/PublicSuffixDatabase.list");
    }

    public /* synthetic */ ResourcePublicSuffixList(ok3 ok3Var, ke1 ke1Var, int i, er0 er0Var) {
        this((i & 1) != 0 ? PUBLIC_SUFFIX_RESOURCE : ok3Var, (i & 2) != 0 ? ke1.RESOURCES : ke1Var);
    }

    public final ke1 getFileSystem() {
        return this.fileSystem;
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public ut4 listSource() {
        return this.fileSystem.source(getPath());
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        private Companion() {
        }
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public ok3 getPath() {
        return this.path;
    }

    public ResourcePublicSuffixList(ok3 ok3Var, ke1 ke1Var) {
        ok3Var.getClass();
        ke1Var.getClass();
        this.path = ok3Var;
        this.fileSystem = ke1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResourcePublicSuffixList() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}

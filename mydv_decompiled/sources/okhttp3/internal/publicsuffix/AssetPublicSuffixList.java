package okhttp3.internal.publicsuffix;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import defpackage.er0;
import defpackage.sp0;
import defpackage.ut4;
import defpackage.zl1;
import java.io.InputStream;
import okhttp3.internal.platform.PlatformRegistry;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class AssetPublicSuffixList extends BasePublicSuffixList {
    public static final Companion Companion = new Companion(null);
    private static final String PUBLIC_SUFFIX_RESOURCE = "PublicSuffixDatabase.list";
    private final String path;

    public /* synthetic */ AssetPublicSuffixList(String str, int i, er0 er0Var) {
        this((i & 1) != 0 ? PUBLIC_SUFFIX_RESOURCE : str);
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public ut4 listSource() {
        Context applicationContext = PlatformRegistry.INSTANCE.getApplicationContext();
        AssetManager assets = applicationContext != null ? applicationContext.getAssets() : null;
        if (assets != null) {
            InputStream open = assets.open(getPath());
            open.getClass();
            return sp0.e0(open);
        }
        if (Build.FINGERPRINT == null) {
            zl1.g("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            return null;
        }
        zl1.g("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        return null;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final String getPUBLIC_SUFFIX_RESOURCE() {
            return AssetPublicSuffixList.PUBLIC_SUFFIX_RESOURCE;
        }

        private Companion() {
        }
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public String getPath() {
        return this.path;
    }

    public AssetPublicSuffixList(String str) {
        str.getClass();
        this.path = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AssetPublicSuffixList() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}

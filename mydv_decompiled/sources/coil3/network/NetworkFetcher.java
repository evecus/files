package coil3.network;

import android.content.Context;
import coil3.ImageLoader;
import coil3.Uri;
import coil3.decode.ImageSource;
import coil3.decode.ImageSourceKt;
import coil3.disk.DiskCache;
import coil3.fetch.Fetcher;
import coil3.network.NetworkHeaders;
import coil3.network.internal.SingleParameterLazy;
import coil3.network.internal.SingleParameterLazyKt;
import coil3.network.internal.UtilsKt;
import coil3.request.Options;
import coil3.util.MimeTypeMap;
import defpackage.cz;
import defpackage.d52;
import defpackage.eq;
import defpackage.er0;
import defpackage.fj0;
import defpackage.gw2;
import defpackage.i02;
import defpackage.j42;
import defpackage.jx4;
import defpackage.ke1;
import defpackage.qx4;
import defpackage.rm1;
import defpackage.s04;
import defpackage.su0;
import defpackage.sv2;
import defpackage.tm1;
import defpackage.tn1;
import defpackage.u05;
import defpackage.uc2;
import defpackage.ut0;
import java.io.IOException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class NetworkFetcher implements Fetcher {
    private final uc2 cacheStrategy;
    private final uc2 concurrentRequestStrategy;
    private final uc2 connectivityChecker;
    private final uc2 diskCache;
    private final uc2 networkClient;
    private final Options options;
    private final String url;

    @su0
    public NetworkFetcher(String str, Options options, uc2 uc2Var, uc2 uc2Var2, uc2 uc2Var3, ConnectivityChecker connectivityChecker) {
        this(str, options, uc2Var, uc2Var2, uc2Var3, new i02(connectivityChecker), new i02(ConcurrentRequestStrategy.UNCOORDINATED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|(2:3|(16:5|6|7|(3:(1:(1:(4:12|13|14|15)(2:18|19))(6:20|21|22|23|24|(1:26)(1:29)))(4:38|39|40|41)|33|(2:35|36)(1:37))(15:66|67|68|(4:70|(2:80|81)|73|(2:75|(2:77|28)))|82|46|47|48|(1:50)|(6:52|(1:54)|55|56|(3:58|24|(0)(0))|28)|60|55|56|(0)|28)|42|(2:44|45)|46|47|48|(0)|(0)|60|55|56|(0)|28))|87|6|7|(0)(0)|42|(0)|46|47|48|(0)|(0)|60|55|56|(0)|28) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x019d, code lost:
    
        if (r15 == r6) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0143, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0144, code lost:
    
        r15 = r0;
        r14 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0043, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0044, code lost:
    
        r15 = r0;
        r14 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x017c A[Catch: Exception -> 0x0043, TryCatch #4 {Exception -> 0x0043, blocks: (B:13:0x003e, B:14:0x01a0, B:24:0x0178, B:26:0x017c), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0103 A[Catch: Exception -> 0x00c8, TRY_LEAVE, TryCatch #1 {Exception -> 0x00c8, blocks: (B:42:0x00fb, B:44:0x0103, B:68:0x008c, B:70:0x0093, B:73:0x00cf, B:75:0x00db, B:78:0x00a8, B:80:0x00b2), top: B:67:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013f A[Catch: Exception -> 0x0143, TryCatch #3 {Exception -> 0x0143, blocks: (B:48:0x0133, B:50:0x013f, B:52:0x0149, B:56:0x0157, B:60:0x0152), top: B:47:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0149 A[Catch: Exception -> 0x0143, TryCatch #3 {Exception -> 0x0143, blocks: (B:48:0x0133, B:50:0x013f, B:52:0x0149, B:56:0x0157, B:60:0x0152), top: B:47:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v2, types: [r24] */
    /* JADX WARN: Type inference failed for: r14v26, types: [r24] */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r1v35, types: [r24] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, r24] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doFetch(defpackage.fj0 r15) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.NetworkFetcher.doFetch(fj0):java.lang.Object");
    }

    private final String getDiskCacheKey() {
        String diskCacheKey = this.options.getDiskCacheKey();
        return diskCacheKey == null ? this.url : diskCacheKey;
    }

    private final ke1 getFileSystem() {
        ke1 fileSystem;
        DiskCache diskCache = (DiskCache) this.diskCache.getValue();
        return (diskCache == null || (fileSystem = diskCache.getFileSystem()) == null) ? this.options.getFileSystem() : fileSystem;
    }

    private final NetworkRequest newRequest() {
        NetworkHeaders.Builder newBuilder = ImageRequestsKt.getHttpHeaders(this.options).newBuilder();
        boolean readEnabled = this.options.getDiskCachePolicy().getReadEnabled();
        boolean z = this.options.getNetworkCachePolicy().getReadEnabled() && ((ConnectivityChecker) this.connectivityChecker.getValue()).isOnline();
        if (!z && readEnabled) {
            newBuilder.set(UtilsKt.CACHE_CONTROL, "only-if-cached, max-stale=2147483647");
        } else if (!z || readEnabled) {
            if (!z && !readEnabled) {
                newBuilder.set(UtilsKt.CACHE_CONTROL, "no-cache, only-if-cached");
            }
        } else if (this.options.getDiskCachePolicy().getWriteEnabled()) {
            newBuilder.set(UtilsKt.CACHE_CONTROL, "no-cache");
        } else {
            newBuilder.set(UtilsKt.CACHE_CONTROL, "no-cache, no-store");
        }
        return new NetworkRequest(this.url, ImageRequestsKt.getHttpMethod(this.options), newBuilder.build(), ImageRequestsKt.getHttpBody(this.options), this.options.getExtras());
    }

    private final DiskCache.Snapshot readFromDiskCache() {
        DiskCache diskCache;
        if (!this.options.getDiskCachePolicy().getReadEnabled() || (diskCache = (DiskCache) this.diskCache.getValue()) == null) {
            return null;
        }
        return diskCache.openSnapshot(getDiskCacheKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void throwIfFailureResponseCode(NetworkResponse networkResponse) {
        int code = networkResponse.getCode();
        if ((200 > code || code >= 300) && networkResponse.getCode() != 304) {
            throw new HttpException(networkResponse);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object toImageSource(coil3.network.NetworkResponseBody r5, defpackage.fj0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof coil3.network.NetworkFetcher$toImageSource$1
            if (r0 == 0) goto L13
            r0 = r6
            coil3.network.NetworkFetcher$toImageSource$1 r0 = (coil3.network.NetworkFetcher$toImageSource$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil3.network.NetworkFetcher$toImageSource$1 r0 = new coil3.network.NetworkFetcher$toImageSource$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2e
            java.lang.Object r5 = r0.L$1
            cz r5 = (defpackage.cz) r5
            java.lang.Object r0 = r0.L$0
            coil3.network.NetworkResponseBody r0 = (coil3.network.NetworkResponseBody) r0
            defpackage.mu0.V(r6)
            goto L4c
        L2e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return r2
        L34:
            defpackage.mu0.V(r6)
            cz r6 = new cz
            r6.<init>()
            r0.L$0 = r2
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r5 = r5.writeTo(r6, r0)
            el0 r0 = defpackage.el0.I
            if (r5 != r0) goto L4b
            return r0
        L4b:
            r5 = r6
        L4c:
            coil3.decode.ImageSource r4 = r4.toImageSource(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.NetworkFetcher.toImageSource(coil3.network.NetworkResponseBody, fj0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NetworkResponse toNetworkResponseOrNull(DiskCache.Snapshot snapshot) {
        Throwable th;
        NetworkResponse networkResponse;
        try {
            s04 m = sv2.m(getFileSystem().source(snapshot.getMetadata()));
            try {
                networkResponse = CacheNetworkResponse.INSTANCE.readFrom(m);
                try {
                    m.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    m.close();
                } catch (Throwable th4) {
                    sv2.i(th3, th4);
                }
                th = th3;
                networkResponse = null;
            }
            if (th == null) {
                return networkResponse;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writeToDiskCache(coil3.disk.DiskCache.Snapshot r11, coil3.network.NetworkResponse r12, coil3.network.NetworkRequest r13, coil3.network.NetworkResponse r14, defpackage.fj0 r15) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.NetworkFetcher.writeToDiskCache(coil3.disk.DiskCache$Snapshot, coil3.network.NetworkResponse, coil3.network.NetworkRequest, coil3.network.NetworkResponse, fj0):java.lang.Object");
    }

    @Override // coil3.fetch.Fetcher
    public Object fetch(fj0 fj0Var) {
        return ((ConcurrentRequestStrategy) this.concurrentRequestStrategy.getValue()).apply(getDiskCacheKey(), new NetworkFetcher$fetch$2(this), fj0Var);
    }

    public final String getMimeType(String str, String str2) {
        String mimeTypeFromUrl;
        if ((str2 == null || qx4.y(str2, UtilsKt.MIME_TYPE_TEXT_PLAIN, false)) && (mimeTypeFromUrl = MimeTypeMap.INSTANCE.getMimeTypeFromUrl(str)) != null) {
            return mimeTypeFromUrl;
        }
        if (str2 != null) {
            return jx4.c0(str2, ';');
        }
        return null;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Factory implements Fetcher.Factory<Uri> {
        private final uc2 cacheStrategyLazy;
        private final uc2 concurrentRequestStrategyLazy;
        private final SingleParameterLazy<Context, ConnectivityChecker> connectivityCheckerLazy;
        private final uc2 networkClientLazy;

        public /* synthetic */ Factory(rm1 rm1Var, rm1 rm1Var2, tm1 tm1Var, rm1 rm1Var3, int i, er0 er0Var) {
            this(rm1Var, (i & 2) != 0 ? new gw2((byte) 8) : rm1Var2, (i & 4) != 0 ? AnonymousClass2.INSTANCE : tm1Var, (i & 8) != 0 ? new gw2((byte) 9) : rm1Var3);
        }

        private final boolean isApplicable(Uri uri) {
            return j42.c(uri.getScheme(), "http") || j42.c(uri.getScheme(), "https");
        }

        @Override // coil3.fetch.Fetcher.Factory
        public Fetcher create(Uri uri, Options options, ImageLoader imageLoader) {
            if (isApplicable(uri)) {
                return new NetworkFetcher(uri.toString(), options, this.networkClientLazy, new u05(new eq(imageLoader, (byte) 23)), this.cacheStrategyLazy, new i02(this.connectivityCheckerLazy.get(options.getContext())), this.concurrentRequestStrategyLazy);
            }
            return null;
        }

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        /* renamed from: coil3.network.NetworkFetcher$Factory$2, reason: invalid class name */
        public static final /* synthetic */ class AnonymousClass2 extends tn1 implements tm1 {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            public AnonymousClass2() {
                super(1, ConnectivityCheckerKt.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);
            }

            @Override // defpackage.tm1
            public final ConnectivityChecker invoke(Context context) {
                return ConnectivityCheckerKt.ConnectivityChecker(context);
            }
        }

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        /* renamed from: coil3.network.NetworkFetcher$Factory$5, reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final /* synthetic */ class AnonymousClass5 extends tn1 implements tm1 {
            public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

            public AnonymousClass5() {
                super(1, ConnectivityCheckerKt.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);
            }

            @Override // defpackage.tm1
            public final ConnectivityChecker invoke(Context context) {
                return ConnectivityCheckerKt.ConnectivityChecker(context);
            }
        }

        public Factory(rm1 rm1Var, rm1 rm1Var2, tm1 tm1Var, rm1 rm1Var3) {
            this.networkClientLazy = ut0.L(rm1Var);
            this.cacheStrategyLazy = ut0.L(rm1Var2);
            this.connectivityCheckerLazy = SingleParameterLazyKt.singleParameterLazy(tm1Var);
            this.concurrentRequestStrategyLazy = ut0.L(rm1Var3);
        }

        public /* synthetic */ Factory(rm1 rm1Var, rm1 rm1Var2, tm1 tm1Var, int i, er0 er0Var) {
            this(rm1Var, (i & 2) != 0 ? new d52((byte) 28) : rm1Var2, (i & 4) != 0 ? AnonymousClass5.INSTANCE : tm1Var);
        }

        @su0
        public /* synthetic */ Factory(rm1 rm1Var, rm1 rm1Var2, tm1 tm1Var) {
            this(rm1Var, rm1Var2, tm1Var, new d52((byte) 27));
        }
    }

    public NetworkFetcher(String str, Options options, uc2 uc2Var, uc2 uc2Var2, uc2 uc2Var3, uc2 uc2Var4, uc2 uc2Var5) {
        this.url = str;
        this.options = options;
        this.networkClient = uc2Var;
        this.diskCache = uc2Var2;
        this.cacheStrategy = uc2Var3;
        this.connectivityChecker = uc2Var4;
        this.concurrentRequestStrategy = uc2Var5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageSource toImageSource(DiskCache.Snapshot snapshot) {
        return ImageSourceKt.ImageSource$default(snapshot.getData(), getFileSystem(), getDiskCacheKey(), snapshot, null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageSource toImageSource(cz czVar) {
        return ImageSourceKt.ImageSource$default(czVar, getFileSystem(), null, 4, null);
    }
}

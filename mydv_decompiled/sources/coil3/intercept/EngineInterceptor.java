package coil3.intercept;

import coil3.Image;
import coil3.ImageLoader;
import coil3.decode.DataSource;
import coil3.memory.MemoryCacheService;
import coil3.request.RequestService;
import coil3.util.Logger;
import coil3.util.SystemCallbacks;
import defpackage.er0;
import defpackage.j42;
import defpackage.pt1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class EngineInterceptor implements Interceptor {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "EngineInterceptor";
    private final ImageLoader imageLoader;
    private final Logger logger;
    private final MemoryCacheService memoryCacheService;
    private final RequestService requestService;
    private final SystemCallbacks systemCallbacks;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class ExecuteResult {
        private final DataSource dataSource;
        private final String diskCacheKey;
        private final Image image;
        private final boolean isSampled;

        public ExecuteResult(Image image, boolean z, DataSource dataSource, String str) {
            this.image = image;
            this.isSampled = z;
            this.dataSource = dataSource;
            this.diskCacheKey = str;
        }

        public static /* synthetic */ ExecuteResult copy$default(ExecuteResult executeResult, Image image, boolean z, DataSource dataSource, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                image = executeResult.image;
            }
            if ((i & 2) != 0) {
                z = executeResult.isSampled;
            }
            if ((i & 4) != 0) {
                dataSource = executeResult.dataSource;
            }
            if ((i & 8) != 0) {
                str = executeResult.diskCacheKey;
            }
            return executeResult.copy(image, z, dataSource, str);
        }

        public final Image component1() {
            return this.image;
        }

        public final boolean component2() {
            return this.isSampled;
        }

        public final DataSource component3() {
            return this.dataSource;
        }

        public final String component4() {
            return this.diskCacheKey;
        }

        public final ExecuteResult copy(Image image, boolean z, DataSource dataSource, String str) {
            return new ExecuteResult(image, z, dataSource, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExecuteResult)) {
                return false;
            }
            ExecuteResult executeResult = (ExecuteResult) obj;
            return j42.c(this.image, executeResult.image) && this.isSampled == executeResult.isSampled && this.dataSource == executeResult.dataSource && j42.c(this.diskCacheKey, executeResult.diskCacheKey);
        }

        public final DataSource getDataSource() {
            return this.dataSource;
        }

        public final String getDiskCacheKey() {
            return this.diskCacheKey;
        }

        public final Image getImage() {
            return this.image;
        }

        public int hashCode() {
            int hashCode = (this.dataSource.hashCode() + ((pt1.o(this.isSampled) + (this.image.hashCode() * 31)) * 31)) * 31;
            String str = this.diskCacheKey;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final boolean isSampled() {
            return this.isSampled;
        }

        public String toString() {
            return "ExecuteResult(image=" + this.image + ", isSampled=" + this.isSampled + ", dataSource=" + this.dataSource + ", diskCacheKey=" + this.diskCacheKey + ")";
        }
    }

    public EngineInterceptor(ImageLoader imageLoader, SystemCallbacks systemCallbacks, RequestService requestService, Logger logger) {
        this.imageLoader = imageLoader;
        this.systemCallbacks = systemCallbacks;
        this.requestService = requestService;
        this.logger = logger;
        this.memoryCacheService = new MemoryCacheService(imageLoader, requestService, logger);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008f -> B:10:0x0096). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object decode(coil3.fetch.SourceFetchResult r8, coil3.ComponentRegistry r9, coil3.request.ImageRequest r10, java.lang.Object r11, coil3.request.Options r12, coil3.EventListener r13, defpackage.fj0 r14) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.EngineInterceptor.decode(coil3.fetch.SourceFetchResult, coil3.ComponentRegistry, coil3.request.ImageRequest, java.lang.Object, coil3.request.Options, coil3.EventListener, fj0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01c7, code lost:
    
        if (r1 == r12) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013d A[Catch: all -> 0x009f, TRY_LEAVE, TryCatch #2 {all -> 0x009f, blocks: (B:36:0x0095, B:38:0x0132, B:40:0x013d), top: B:35:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016b A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:20:0x006d, B:22:0x0166, B:42:0x0147, B:47:0x016b, B:49:0x0170, B:50:0x01d4, B:51:0x01d9), top: B:8:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0129  */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(coil3.request.ImageRequest r16, java.lang.Object r17, coil3.request.Options r18, coil3.EventListener r19, defpackage.fj0 r20) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.EngineInterceptor.execute(coil3.request.ImageRequest, java.lang.Object, coil3.request.Options, coil3.EventListener, fj0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0089 -> B:10:0x008d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetch(coil3.ComponentRegistry r8, coil3.request.ImageRequest r9, java.lang.Object r10, coil3.request.Options r11, coil3.EventListener r12, defpackage.fj0 r13) {
        /*
            r7 = this;
            boolean r0 = r13 instanceof coil3.intercept.EngineInterceptor$fetch$1
            if (r0 == 0) goto L13
            r0 = r13
            coil3.intercept.EngineInterceptor$fetch$1 r0 = (coil3.intercept.EngineInterceptor$fetch$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil3.intercept.EngineInterceptor$fetch$1 r0 = new coil3.intercept.EngineInterceptor$fetch$1
            r0.<init>(r7, r13)
        L18:
            java.lang.Object r13 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L52
            if (r1 != r3) goto L4c
            int r8 = r0.I$0
            java.lang.Object r9 = r0.L$6
            coil3.fetch.Fetcher r9 = (coil3.fetch.Fetcher) r9
            java.lang.Object r10 = r0.L$5
            uj3 r10 = (defpackage.uj3) r10
            java.lang.Object r10 = r0.L$4
            coil3.EventListener r10 = (coil3.EventListener) r10
            java.lang.Object r11 = r0.L$3
            coil3.request.Options r11 = (coil3.request.Options) r11
            java.lang.Object r12 = r0.L$2
            java.lang.Object r1 = r0.L$1
            coil3.request.ImageRequest r1 = (coil3.request.ImageRequest) r1
            java.lang.Object r4 = r0.L$0
            coil3.ComponentRegistry r4 = (coil3.ComponentRegistry) r4
            defpackage.mu0.V(r13)
            r6 = r0
            r0 = r8
            r8 = r4
            r4 = r6
            r6 = r1
            r1 = r9
            r9 = r6
            r6 = r12
            r12 = r10
            r10 = r6
            goto L8d
        L4c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r7)
            return r2
        L52:
            defpackage.mu0.V(r13)
            r13 = 0
        L56:
            coil3.ImageLoader r1 = r7.imageLoader
            uj3 r13 = r8.newFetcher(r10, r11, r1, r13)
            if (r13 == 0) goto Lac
            java.lang.Object r1 = r13.I
            coil3.fetch.Fetcher r1 = (coil3.fetch.Fetcher) r1
            java.lang.Object r13 = r13.J
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            int r13 = r13 + r3
            r12.fetchStart(r9, r1, r11)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.L$3 = r11
            r0.L$4 = r12
            r0.L$5 = r2
            r0.L$6 = r1
            r0.I$0 = r13
            r0.label = r3
            java.lang.Object r4 = r1.fetch(r0)
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L89
            return r5
        L89:
            r6 = r0
            r0 = r13
            r13 = r4
            r4 = r6
        L8d:
            coil3.fetch.FetchResult r13 = (coil3.fetch.FetchResult) r13
            r12.fetchEnd(r9, r1, r11, r13)     // Catch: java.lang.Throwable -> L98
            if (r13 == 0) goto L95
            return r13
        L95:
            r13 = r0
            r0 = r4
            goto L56
        L98:
            r7 = move-exception
            boolean r8 = r13 instanceof coil3.fetch.SourceFetchResult
            if (r8 == 0) goto La0
            r2 = r13
            coil3.fetch.SourceFetchResult r2 = (coil3.fetch.SourceFetchResult) r2
        La0:
            if (r2 == 0) goto Lab
            coil3.decode.ImageSource r8 = r2.getSource()
            if (r8 == 0) goto Lab
            coil3.util.UtilsKt.closeQuietly(r8)
        Lab:
            throw r7
        Lac:
            java.lang.String r7 = "Unable to create a fetcher that supports: "
            defpackage.s83.k(r10, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.EngineInterceptor.fetch(coil3.ComponentRegistry, coil3.request.ImageRequest, java.lang.Object, coil3.request.Options, coil3.EventListener, fj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // coil3.intercept.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object intercept(coil3.intercept.Interceptor.Chain r14, defpackage.fj0 r15) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.EngineInterceptor.intercept(coil3.intercept.Interceptor$Chain, fj0):java.lang.Object");
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        private Companion() {
        }
    }
}

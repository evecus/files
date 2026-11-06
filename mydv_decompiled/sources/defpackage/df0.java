package defpackage;

import coil3.ImageLoader;
import coil3.compose.AsyncImageModelEqualityDelegate;
import coil3.disk.DiskCache;
import coil3.disk.UtilsKt;
import com.github.mytv.dv.model.Cover;
import com.github.mytv.dv.model.DanmakuResponse;
import com.github.mytv.dv.model.EmojiListResponse;
import com.github.mytv.dv.model.EmojiUrl;
import com.github.mytv.dv.model.FeedResponse;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.KSerializer;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class df0 implements rm1 {
    public final /* synthetic */ byte I;

    public /* synthetic */ df0(byte b) {
        this.I = b;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_$0;
        iu2 build$lambda$0;
        DiskCache singletonDiskCache;
        AsyncImageModelEqualityDelegate asyncImageModelEqualityDelegate;
        switch (this.I) {
            case 0:
                hf0.b("LocalLayoutDirection");
                throw null;
            case 1:
                hf0.b("LocalProvidableLocaleList");
                throw null;
            case 2:
            case 3:
                return null;
            case 4:
                hf0.b("LocalTextToolbar");
                throw null;
            case 5:
                hf0.b("LocalUriHandler");
                throw null;
            case 6:
                ke0.b("Unexpected call to default provider");
                throw new d92();
            case 7:
                return new r80(t80.K, s90.K, z70.L, true, v90.K);
            case 8:
                return null;
            case 9:
                _childSerializers$_anonymous_ = Cover._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 10:
                _childSerializers$_anonymous_2 = DanmakuResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 11:
                return new bw0(ww5.K, false, aw0.I, true, false, false, 0, 0);
            case 12:
                ne5 ne5Var = oe5.a;
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                oe5.a(builder);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                return builder.connectTimeout(15L, timeUnit).readTimeout(60L, timeUnit).followRedirects(true).followSslRedirects(true).build();
            case 13:
                return Boolean.TRUE;
            case 14:
                _childSerializers$_anonymous_3 = EmojiListResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 15:
                _childSerializers$_anonymous_4 = EmojiUrl._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 16:
                _childSerializers$_anonymous_5 = FeedResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 17:
                _childSerializers$_anonymous_$0 = FeedResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 18:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 19:
                build$lambda$0 = ImageLoader.Builder.build$lambda$0();
                return build$lambda$0;
            case 20:
                singletonDiskCache = UtilsKt.singletonDiskCache();
                return singletonDiskCache;
            case 21:
                i51 i51Var = kz1.a;
                return gr0.a;
            case 22:
                return null;
            case 23:
                return new wa2(3);
            case 24:
                asyncImageModelEqualityDelegate = AsyncImageModelEqualityDelegate.Default;
                return asyncImageModelEqualityDelegate;
            case 25:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 26:
                return null;
            case 27:
                i51 i51Var2 = pq2.a;
                return q8.p0;
            case 28:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            default:
                return Boolean.FALSE;
        }
    }
}

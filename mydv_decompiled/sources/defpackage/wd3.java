package defpackage;

import coil3.network.CacheStrategy;
import coil3.network.ConcurrentRequestStrategy;
import com.github.mytv.dv.model.SearchLiveResponse;
import com.github.mytv.dv.model.SearchResponse;
import com.github.mytv.dv.model.SearchSugResponse;
import com.github.mytv.dv.model.SearchUserResponse;
import com.github.mytv.dv.model.SearchVideoWorkResponse;
import com.github.mytv.dv.model.SeoLinkResponse;
import com.github.mytv.dv.model.StreamUrl;
import com.github.mytv.dv.widget.SearchSnapshot;
import kotlinx.serialization.KSerializer;
import okhttp3.internal.dns.RealDnsCache;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wd3 implements rm1 {
    public final /* synthetic */ byte I;

    @Override // defpackage.rm1
    public final Object invoke() {
        CacheStrategy cacheStrategy;
        CacheStrategy cacheStrategy2;
        ConcurrentRequestStrategy concurrentRequestStrategy;
        CacheStrategy cacheStrategy3;
        RealDnsCache.Entry wrap$lambda$0$0;
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_8;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                cacheStrategy = CacheStrategy.DEFAULT;
                return cacheStrategy;
            case 1:
                cacheStrategy2 = CacheStrategy.DEFAULT;
                return cacheStrategy2;
            case 2:
                concurrentRequestStrategy = ConcurrentRequestStrategy.UNCOORDINATED;
                return concurrentRequestStrategy;
            case 3:
                cacheStrategy3 = CacheStrategy.DEFAULT;
                return cacheStrategy3;
            case 4:
                os0 os0Var = sx0.a;
                return ur0.I;
            case 5:
                return null;
            case 6:
            case 7:
                return wd5Var;
            case 8:
                return Float.valueOf(0.0f);
            case 9:
                return ad4.w(null);
            case 10:
                return wd5Var;
            case 11:
                return ad4.w(hy5.K);
            case 12:
                return wd5Var;
            case 13:
                wrap$lambda$0$0 = RealDnsCache.wrap$lambda$0$0();
                return wrap$lambda$0$0;
            case 14:
                return new sb4(0);
            case 15:
                _childSerializers$_anonymous_ = SearchLiveResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 16:
                _childSerializers$_anonymous_2 = SearchResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 17:
                _childSerializers$_anonymous_$0 = SearchResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 18:
                _childSerializers$_anonymous_3 = SearchSnapshot._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 19:
                _childSerializers$_anonymous_$02 = SearchSnapshot._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 20:
                _childSerializers$_anonymous_4 = SearchSugResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 21:
                _childSerializers$_anonymous_5 = SearchUserResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 22:
                _childSerializers$_anonymous_6 = SearchVideoWorkResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 23:
                _childSerializers$_anonymous_7 = SeoLinkResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 24:
                return vt0.b();
            case 25:
                return wd5Var;
            case 26:
                return null;
            case 27:
                return ad4.w(bl4.K);
            case 28:
                return ad4.w(Boolean.TRUE);
            default:
                _childSerializers$_anonymous_8 = StreamUrl._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
        }
    }

    public /* synthetic */ wd3(byte b) {
        this.I = b;
    }
}

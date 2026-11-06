package defpackage;

import coil3.compose.AsyncImagePreviewHandler;
import coil3.network.CacheStrategy;
import coil3.network.ConcurrentRequestStrategy;
import com.github.mytv.dv.MainActivity;
import com.github.mytv.dv.model.LiveCorePullOptions;
import com.github.mytv.dv.model.LiveFeedData;
import com.github.mytv.dv.model.LiveFeedResponseHome;
import com.github.mytv.dv.model.LiveRoom;
import com.github.mytv.dv.model.LiveRoomEnterData;
import com.github.mytv.dv.model.MixListResponse;
import com.github.mytv.dv.model.NoticeListResponse;
import com.github.mytv.dv.widget.LiveSnapshot;
import com.github.mytv.dv.widget.MixSnapshot;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class d52 implements rm1 {
    public final /* synthetic */ byte I;

    @Override // defpackage.rm1
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_$0;
        AsyncImagePreviewHandler asyncImagePreviewHandler;
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_8;
        KSerializer _childSerializers$_anonymous_$02;
        ConcurrentRequestStrategy concurrentRequestStrategy;
        CacheStrategy cacheStrategy;
        KSerializer _childSerializers$_anonymous_9;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                return wd5Var;
            case 1:
                return i72.b;
            case 2:
                return d72.b;
            case 3:
                return b72.b;
            case 4:
                return f72.b;
            case 5:
                return k62.b;
            case 6:
                return new wd2(0, 0);
            case 7:
                return new ag2(0, 0);
            case 8:
                return new zg2(new int[]{0}, new int[]{0});
            case 9:
                _childSerializers$_anonymous_ = LiveCorePullOptions._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 10:
                _childSerializers$_anonymous_2 = LiveFeedData._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 11:
                _childSerializers$_anonymous_3 = LiveFeedResponseHome._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 12:
                return wd5Var;
            case 13:
                return Float.valueOf(0.0f);
            case 14:
                _childSerializers$_anonymous_4 = LiveRoom._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 15:
                _childSerializers$_anonymous_5 = LiveRoomEnterData._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 16:
                _childSerializers$_anonymous_6 = LiveSnapshot._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 17:
                _childSerializers$_anonymous_$0 = LiveSnapshot._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 18:
                return null;
            case 19:
                asyncImagePreviewHandler = AsyncImagePreviewHandler.Default;
                return asyncImagePreviewHandler;
            case 20:
                return null;
            case 21:
                lt2 lt2Var = MainActivity.Companion;
                lf5.d.h(null);
                return wd5Var;
            case 22:
                lt2 lt2Var2 = MainActivity.Companion;
                lf5.d.h(null);
                return wd5Var;
            case 23:
                return ad4.w(y03.K);
            case 24:
                _childSerializers$_anonymous_7 = MixListResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 25:
                _childSerializers$_anonymous_8 = MixSnapshot._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
            case 26:
                _childSerializers$_anonymous_$02 = MixSnapshot._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 27:
                concurrentRequestStrategy = ConcurrentRequestStrategy.UNCOORDINATED;
                return concurrentRequestStrategy;
            case 28:
                cacheStrategy = CacheStrategy.DEFAULT;
                return cacheStrategy;
            default:
                _childSerializers$_anonymous_9 = NoticeListResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_9;
        }
    }

    public /* synthetic */ d52(byte b) {
        this.I = b;
    }
}

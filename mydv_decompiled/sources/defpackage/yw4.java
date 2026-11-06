package defpackage;

import android.os.Build;
import android.util.Log;
import androidx.window.extensions.area.WindowAreaComponent;
import androidx.window.extensions.layout.WindowLayoutComponent;
import com.github.mytv.dv.model.StreamUrl;
import com.github.mytv.dv.model.SuggestWordGroup;
import com.github.mytv.dv.model.SuggestWordsResponse;
import com.github.mytv.dv.model.UserListResponse;
import com.github.mytv.dv.model.UserWorksResponse;
import com.github.mytv.dv.widget.VideoListSnapshot;
import com.github.mytv.dv.widget.WidgetMixItem;
import com.github.mytv.dv.widget.WidgetPalette;
import com.github.mytv.dv.widget.WidgetUiKt;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yw4 implements rm1 {
    public final /* synthetic */ byte I;

    public /* synthetic */ yw4(byte b) {
        this.I = b;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        WindowLayoutComponent a;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_$03;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_$04;
        KSerializer _childSerializers$_anonymous_6;
        WidgetPalette LocalWidgetPalette$lambda$0;
        byte b = this.I;
        long j = 0;
        wd5 wd5Var = wd5.a;
        WindowAreaComponent windowAreaComponent = null;
        switch (b) {
            case 0:
                _childSerializers$_anonymous_$0 = StreamUrl._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 1:
                _childSerializers$_anonymous_ = SuggestWordGroup._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 2:
                _childSerializers$_anonymous_2 = SuggestWordsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 3:
                return new r11(0.0f);
            case 4:
            case 5:
                return null;
            case 6:
                return new r22(j);
            case 7:
                return new r22(j);
            case 8:
                return Boolean.TRUE;
            case 9:
                return new lc5();
            case 10:
                _childSerializers$_anonymous_3 = UserListResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 11:
                _childSerializers$_anonymous_$02 = UserListResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 12:
                _childSerializers$_anonymous_4 = UserWorksResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 13:
                _childSerializers$_anonymous_$03 = UserWorksResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            case 14:
                _childSerializers$_anonymous_$1 = UserWorksResponse._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 15:
            case 16:
                return wd5Var;
            case 17:
                return Float.valueOf(0.0f);
            case 18:
                _childSerializers$_anonymous_5 = VideoListSnapshot._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 19:
                _childSerializers$_anonymous_$04 = VideoListSnapshot._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$04;
            case 20:
                _childSerializers$_anonymous_6 = WidgetMixItem._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 21:
                LocalWidgetPalette$lambda$0 = WidgetUiKt.LocalWidgetPalette$lambda$0();
                return LocalWidgetPalette$lambda$0;
            case 22:
                try {
                    ClassLoader classLoader = eu5.class.getClassLoader();
                    if (classLoader != null) {
                        windowAreaComponent = new b94(classLoader).a();
                    }
                } catch (Throwable unused) {
                    if (eu5.e == pi5.I) {
                        Log.d(fu5.a, "Failed to load WindowExtensions");
                    }
                }
                return (Build.VERSION.SDK_INT <= 29 || windowAreaComponent == null || zc1.a() < 3) ? new u91() : new lu5(windowAreaComponent);
            case 23:
                try {
                    ClassLoader classLoader2 = uu5.class.getClassLoader();
                    e94 e94Var = classLoader2 != null ? new e94(classLoader2, new uu2(classLoader2)) : null;
                    if (e94Var == null || (a = e94Var.a()) == null) {
                        return null;
                    }
                    uu2 uu2Var = new uu2(classLoader2);
                    int a2 = zc1.a();
                    return a2 >= 9 ? new wc1(a, uu2Var) : a2 >= 6 ? new vc1(a, uu2Var) : a2 >= 2 ? new uc1(a, uu2Var) : a2 == 1 ? new tc1(a, uu2Var) : new rc1();
                } catch (Throwable unused2) {
                    return null;
                }
            case 24:
                return new k04((byte) 0);
            default:
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
        }
    }

    public /* synthetic */ yw4(Object obj, byte b) {
        this.I = b;
    }
}

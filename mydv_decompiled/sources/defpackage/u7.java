package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.security.NetworkSecurityPolicy;
import android.view.inputmethod.InputMethodManager;
import coil3.Image;
import coil3.decode.BlackholeDecoder;
import com.github.mytv.dv.model.ChannelSettingResponse;
import com.github.mytv.dv.model.CollectListResponse;
import com.github.mytv.dv.model.Comment;
import com.github.mytv.dv.model.CommentListResponse;
import com.github.mytv.dv.model.EpisodeExtra;
import com.github.mytv.dv.model.HotSearchData;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.UUID;
import kotlinx.serialization.KSerializer;
import okhttp3.android.AndroidDns;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class u7 implements rm1 {
    public final /* synthetic */ byte I;

    @Override // defpackage.rm1
    public final Object invoke() {
        Class<?> returnType;
        NetworkSecurityPolicy _init_$lambda$1;
        Image image;
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_6;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                return UUID.randomUUID().toString();
            case 1:
                return UUID.randomUUID();
            case 2:
                _init_$lambda$1 = AndroidDns._init_$lambda$1();
                return _init_$lambda$1;
            case 3:
                return "DEFAULT_TEST_TAG";
            case 4:
                return UUID.randomUUID();
            case 5:
                Process.killProcess(Process.myPid());
                return wd5Var;
            case 6:
                return new rt4(qb.i(1308617531));
            case 7:
                image = BlackholeDecoder.Factory.EMPTY_IMAGE;
                return image;
            case 8:
                _childSerializers$_anonymous_ = ChannelSettingResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 9:
                _childSerializers$_anonymous_2 = CollectListResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 10:
                _childSerializers$_anonymous_3 = Comment._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 11:
                _childSerializers$_anonymous_4 = CommentListResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 12:
                return null;
            case 13:
                throw new IllegalStateException("No default size");
            case 14:
                return new Bundle();
            case 15:
                throw new IllegalStateException("No default context");
            case 16:
                return null;
            case 17:
                throw new IllegalStateException("No default glance id");
            case 18:
                i51 i51Var = ff0.a;
                return l51.B;
            case 19:
                return wd5Var;
            case 20:
                return new Handler(Looper.getMainLooper());
            case 21:
                _childSerializers$_anonymous_5 = EpisodeExtra._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 22:
                return new cj1();
            case 23:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 24:
                try {
                    Method method = (Method) hm1.L.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class<?> cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 25:
                _childSerializers$_anonymous_6 = HotSearchData._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 26:
                try {
                    Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                    declaredField.setAccessible(true);
                    Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                    declaredField2.setAccessible(true);
                    Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                    declaredField3.setAccessible(true);
                    return new px1(declaredField3, declaredField, declaredField2);
                } catch (NoSuchFieldException unused3) {
                    return ox1.a;
                }
            case 27:
                return new r11(48.0f);
            case 28:
                return Long.valueOf(System.nanoTime());
            default:
                return wd5Var;
        }
    }

    public /* synthetic */ u7(byte b) {
        this.I = b;
    }
}

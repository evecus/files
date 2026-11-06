package defpackage;

import android.app.RemoteAction;
import android.view.autofill.AutofillManager;
import android.view.textclassifier.TextClassifier;
import androidx.media3.common.Format;
import androidx.media3.common.video.FrameWriter;
import androidx.media3.common.video.SurfaceHolderFrameWriter;
import com.whl.quickjs.wrapper.MapCreator;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hn3 implements MapCreator, FrameWriter.Info {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ byte a;

    public /* synthetic */ hn3(byte b2) {
        this.a = b2;
    }

    public static /* bridge */ /* synthetic */ RemoteAction a(Object obj) {
        return (RemoteAction) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillManager b(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ TextClassifier c(Object obj) {
        return (TextClassifier) obj;
    }

    public static /* synthetic */ void f(int i, long j) {
        throw new IOException("Content-Length (" + j + ((Object) ") and stream length (") + i + ((Object) ") disagree"));
    }

    public static /* synthetic */ void g(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void h(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void j(String str, Object obj, RuntimeException runtimeException) {
        throw new h0(str + obj, runtimeException, (byte) 1);
    }

    @Override // com.whl.quickjs.wrapper.MapCreator
    public Map get() {
        return new HashMap();
    }

    @Override // androidx.media3.common.video.FrameWriter.Info
    public boolean isSupported(Format format, long j) {
        boolean lambda$getInfo$1;
        lambda$getInfo$1 = SurfaceHolderFrameWriter.lambda$getInfo$1(format, j);
        return lambda$getInfo$1;
    }
}

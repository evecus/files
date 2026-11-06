package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import com.github.mytv.dv.model.Avatar;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class q7 implements rm1 {
    public final /* synthetic */ byte I;

    public /* synthetic */ q7(byte b) {
        this.I = b;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        Choreographer choreographer;
        KSerializer _childSerializers$_anonymous_;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                return Integer.valueOf(f04.I.h(2147418112) + 65536);
            case 1:
                rb.a("LocalConfiguration");
                throw null;
            case 2:
                rb.a("LocalContext");
                throw null;
            case 3:
                rb.a("LocalImageVectorCache");
                throw null;
            case 4:
                rb.a("LocalResourceIdCache");
                throw null;
            case 5:
                rb.a("LocalView");
                throw null;
            case 6:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    os0 os0Var = sx0.a;
                    choreographer = (Choreographer) d4.I(ju2.a, new yf());
                }
                bg bgVar = new bg(choreographer, rt0.j(Looper.getMainLooper()));
                return bgVar.plus(bgVar.R);
            case 7:
            case 8:
            case 9:
                return wd5Var;
            case 10:
                _childSerializers$_anonymous_ = Avatar._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 11:
                return null;
            case 12:
                return new wa2(2);
            case 13:
            case 14:
                return null;
            case 15:
                hf0.b("LocalViewConfiguration");
                throw null;
            case 16:
                hf0.b("LocalWindowInfo");
                throw null;
            case 17:
                return new ef0();
            case 18:
                return null;
            case 19:
                hf0.b("LocalAutofillTree");
                throw null;
            case 20:
                hf0.b("LocalAutofillManager");
                throw null;
            case 21:
                hf0.b("LocalClipboardManager");
                throw null;
            case 22:
                hf0.b("LocalClipboard");
                throw null;
            case 23:
                hf0.b("LocalGraphicsContext");
                throw null;
            case 24:
                hf0.b("LocalFontFamilyResolver");
                throw null;
            case 25:
                hf0.b("LocalDensity");
                throw null;
            case 26:
                hf0.b("LocalFocusManager");
                throw null;
            case 27:
                hf0.b("LocalFontLoader");
                throw null;
            case 28:
                hf0.b("LocalHapticFeedback");
                throw null;
            default:
                hf0.b("LocalInputManager");
                throw null;
        }
    }
}

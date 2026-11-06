package defpackage;

import android.content.Context;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.window.extensions.area.ExtensionWindowAreaPresentation;
import androidx.window.extensions.area.WindowAreaComponent;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class t04 {
    public final WindowAreaComponent a;
    public final ExtensionWindowAreaPresentation b;
    public final Context c;

    public t04(WindowAreaComponent windowAreaComponent, ExtensionWindowAreaPresentation extensionWindowAreaPresentation, int i) {
        Method method;
        this.a = windowAreaComponent;
        this.b = extensionWindowAreaPresentation;
        Context presentationContext = extensionWindowAreaPresentation.getPresentationContext();
        presentationContext.getClass();
        this.c = presentationContext;
        if (i >= 4) {
            extensionWindowAreaPresentation.getWindow();
            return;
        }
        Method[] methods = extensionWindowAreaPresentation.getClass().getMethods();
        methods.getClass();
        int length = methods.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                method = null;
                break;
            }
            method = methods[i2];
            if (j42.c(method != null ? method.getName() : null, "getWindow") && j42.c(method.getReturnType(), Window.class)) {
                break;
            } else {
                i2++;
            }
        }
        if (method == null) {
            return;
        }
    }

    public final void a() {
        this.a.endRearDisplayPresentationSession();
    }

    public final void b(FrameLayout frameLayout) {
        this.b.setPresentationView(frameLayout);
    }
}

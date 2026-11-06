package defpackage;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class dc5 extends cc5 {
    @Override // defpackage.cc5
    public final Font K(sk1 sk1Var) {
        Font d;
        String a = sk1Var.a();
        if (a != null) {
            Typeface create = Typeface.create(a, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                create = null;
            }
            if (create != null && (d = wb5.d(create)) != null) {
                if (TextUtils.isEmpty(sk1Var.d())) {
                    return d;
                }
                try {
                    return new Font.Builder(d).setFontVariationSettings(sk1Var.d()).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}

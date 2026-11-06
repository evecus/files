package defpackage;

import android.text.Editable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class h81 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile h81 b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new bu4(cls, charSequence) : super.newEditable(charSequence);
    }
}

package defpackage;

import android.graphics.Typeface;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ol implements kh0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ol(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.kh0
    public final void accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                super/*android.widget.EditText*/.setTypeface((Typeface) obj);
                break;
            default:
                ((bu3) obj2).d((iw5) obj);
                break;
        }
    }
}

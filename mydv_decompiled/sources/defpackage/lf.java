package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.textclassifier.TextClassification;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lf implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lf(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((c35) obj2).d.invoke(((mf) obj).a);
                break;
            default:
                x9.w((Context) obj2, (TextClassification) obj);
                break;
        }
        return true;
    }
}

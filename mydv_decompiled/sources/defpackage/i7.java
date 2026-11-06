package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@t83("activity")
/* loaded from: classes.dex */
public class i7 extends u83 {
    public final Activity c;

    public i7(Context context) {
        Object obj;
        context.getClass();
        Iterator it = qj4.x(context, new q4((byte) 1)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.c = (Activity) obj;
    }

    @Override // defpackage.u83
    public final i73 a() {
        return new h7(this);
    }

    @Override // defpackage.u83
    public final i73 c(i73 i73Var) {
        throw new IllegalStateException(nt3.n(new StringBuilder("Destination "), ((h7) i73Var).J.b, " does not have an Intent set.").toString());
    }

    @Override // defpackage.u83
    public final boolean f() {
        Activity activity = this.c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}

package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ak1 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ak1(String str, Context context, Object obj, int i, byte b) {
        this.a = b;
        this.b = str;
        this.c = context;
        this.e = obj;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.a;
        int i = this.d;
        Object obj = this.e;
        Context context = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                Object[] objArr = {(xj1) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return dk1.b(str, context, DesugarCollections.unmodifiableList(arrayList), i);
            default:
                try {
                    return dk1.b(str, context, (List) obj, i);
                } catch (Throwable unused) {
                    return new ck1(-3);
                }
        }
    }
}

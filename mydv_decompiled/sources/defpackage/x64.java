package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class x64 {
    public final Context b;
    public final String c;
    public Executor f;
    public Executor g;
    public w7 h;
    public boolean i;
    public boolean o;
    public boolean p;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final cp0 j = new cp0((byte) 3);
    public final LinkedHashSet k = new LinkedHashSet();
    public final LinkedHashSet l = new LinkedHashSet();
    public final ArrayList m = new ArrayList();
    public boolean n = true;
    public final k60 a = s24.a(WorkDatabase.class);

    public x64(Context context, String str) {
        this.b = context;
        this.c = str;
    }

    public final void a(kz2... kz2VarArr) {
        for (kz2 kz2Var : kz2VarArr) {
            Integer valueOf = Integer.valueOf(kz2Var.a);
            LinkedHashSet linkedHashSet = this.l;
            linkedHashSet.add(valueOf);
            linkedHashSet.add(Integer.valueOf(kz2Var.b));
        }
        for (kz2 kz2Var2 : (kz2[]) Arrays.copyOf(kz2VarArr, kz2VarArr.length)) {
            this.j.a(kz2Var2);
        }
    }
}

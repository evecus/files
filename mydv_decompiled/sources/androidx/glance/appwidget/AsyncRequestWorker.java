package androidx.glance.appwidget;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.dp0;
import defpackage.fj0;
import defpackage.i42;
import defpackage.jd;
import defpackage.ju2;
import defpackage.ns1;
import defpackage.os0;
import defpackage.sx0;
import defpackage.vk0;
import defpackage.zb2;
import defpackage.zy;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class AsyncRequestWorker extends CoroutineWorker {
    public final ns1 a;
    public final zb2 b;

    public AsyncRequestWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        os0 os0Var = sx0.a;
        this.a = ju2.a;
        dp0 dp0Var = workerParameters.b;
        dp0Var.getClass();
        Object obj = dp0Var.a.get("request");
        byte[] bArr = null;
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            byte[] bArr2 = new byte[length];
            for (int i = 0; i < length; i++) {
                Object obj2 = objArr[i];
                if (obj2 == null) {
                    zy.m("null cannot be cast to non-null type kotlin.Byte");
                    throw null;
                }
                bArr2[i] = ((Byte) obj2).byteValue();
            }
            bArr = bArr2;
        }
        this.b = zb2.y(bArr);
    }

    @Override // androidx.work.CoroutineWorker
    public final Object doWork(fj0 fj0Var) {
        return i42.o0(new jd(this, null, (byte) 1), fj0Var);
    }

    @Override // androidx.work.CoroutineWorker
    public final vk0 getCoroutineContext() {
        return this.a;
    }
}

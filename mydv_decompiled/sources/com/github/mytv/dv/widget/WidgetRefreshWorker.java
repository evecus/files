package com.github.mytv.dv.widget;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class WidgetRefreshWorker extends CoroutineWorker {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetRefreshWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(defpackage.fj0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.github.mytv.dv.widget.WidgetRefreshWorker$doWork$1
            if (r0 == 0) goto L13
            r0 = r6
            com.github.mytv.dv.widget.WidgetRefreshWorker$doWork$1 r0 = (com.github.mytv.dv.widget.WidgetRefreshWorker$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.github.mytv.dv.widget.WidgetRefreshWorker$doWork$1 r0 = new com.github.mytv.dv.widget.WidgetRefreshWorker$doWork$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            java.lang.Object r0 = r0.L$0
            com.github.mytv.dv.widget.WidgetKind r0 = (com.github.mytv.dv.widget.WidgetKind) r0
            defpackage.mu0.V(r6)
            goto L80
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r5)
            return r2
        L30:
            defpackage.mu0.V(r6)
            dp0 r6 = r5.getInputData()
            java.lang.String r1 = "kind"
            java.lang.String r6 = r6.a(r1)
            if (r6 == 0) goto L9f
            com.github.mytv.dv.widget.WidgetKind r6 = com.github.mytv.dv.widget.WidgetKind.valueOf(r6)     // Catch: java.lang.Throwable -> L44
            goto L4b
        L44:
            r6 = move-exception
            g54 r1 = new g54
            r1.<init>(r6)
            r6 = r1
        L4b:
            boolean r1 = r6 instanceof defpackage.g54
            if (r1 == 0) goto L51
            r6 = r2
        L51:
            com.github.mytv.dv.widget.WidgetKind r6 = (com.github.mytv.dv.widget.WidgetKind) r6
            if (r6 != 0) goto L56
            goto L9f
        L56:
            com.github.mytv.dv.widget.WidgetRefreshScheduler r1 = com.github.mytv.dv.widget.WidgetRefreshScheduler.INSTANCE
            android.content.Context r4 = r5.getApplicationContext()
            r4.getClass()
            boolean r1 = r1.hasWidgets(r4, r6)
            if (r1 != 0) goto L6a
            ml2 r5 = defpackage.nl2.a()
            return r5
        L6a:
            com.github.mytv.dv.widget.WidgetRefresher r1 = com.github.mytv.dv.widget.WidgetRefresher.INSTANCE
            android.content.Context r4 = r5.getApplicationContext()
            r4.getClass()
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r1.refresh(r4, r6, r0)
            el0 r0 = defpackage.el0.I
            if (r6 != r0) goto L80
            return r0
        L80:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L8d
            ml2 r5 = defpackage.nl2.a()
            goto L9e
        L8d:
            int r5 = r5.getRunAttemptCount()
            r6 = 3
            if (r5 < r6) goto L99
            ml2 r5 = defpackage.nl2.a()
            goto L9e
        L99:
            ll2 r5 = new ll2
            r5.<init>()
        L9e:
            return r5
        L9f:
            ml2 r5 = defpackage.nl2.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.widget.WidgetRefreshWorker.doWork(fj0):java.lang.Object");
    }
}

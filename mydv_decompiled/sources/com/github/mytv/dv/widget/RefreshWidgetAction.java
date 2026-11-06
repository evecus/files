package com.github.mytv.dv.widget;

import defpackage.l6;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class RefreshWidgetAction implements l6 {
    public static final int $stable = 0;

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.l6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onAction(android.content.Context r4, defpackage.iq1 r5, defpackage.c7 r6, defpackage.fj0 r7) {
        /*
            r3 = this;
            boolean r5 = r7 instanceof com.github.mytv.dv.widget.RefreshWidgetAction$onAction$1
            if (r5 == 0) goto L13
            r5 = r7
            com.github.mytv.dv.widget.RefreshWidgetAction$onAction$1 r5 = (com.github.mytv.dv.widget.RefreshWidgetAction$onAction$1) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.label = r0
            goto L18
        L13:
            com.github.mytv.dv.widget.RefreshWidgetAction$onAction$1 r5 = new com.github.mytv.dv.widget.RefreshWidgetAction$onAction$1
            r5.<init>(r3, r7)
        L18:
            java.lang.Object r3 = r5.result
            int r7 = r5.label
            wd5 r0 = defpackage.wd5.a
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L3e
            if (r7 != r1) goto L38
            java.lang.Object r4 = r5.L$3
            com.github.mytv.dv.widget.WidgetKind r4 = (com.github.mytv.dv.widget.WidgetKind) r4
            java.lang.Object r4 = r5.L$2
            c7 r4 = (defpackage.c7) r4
            java.lang.Object r4 = r5.L$1
            iq1 r4 = (defpackage.iq1) r4
            java.lang.Object r4 = r5.L$0
            android.content.Context r4 = (android.content.Context) r4
            defpackage.mu0.V(r3)
            return r0
        L38:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r3)
            return r2
        L3e:
            defpackage.mu0.V(r3)
            a7 r3 = com.github.mytv.dv.widget.WidgetActionsKt.access$getWidgetKindParameter$p()
            k33 r6 = (defpackage.k33) r6
            java.util.LinkedHashMap r6 = r6.a
            java.lang.Object r3 = r6.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L7d
            com.github.mytv.dv.widget.WidgetKind r3 = com.github.mytv.dv.widget.WidgetKind.valueOf(r3)     // Catch: java.lang.Throwable -> L56
            goto L5d
        L56:
            r3 = move-exception
            g54 r6 = new g54
            r6.<init>(r3)
            r3 = r6
        L5d:
            boolean r6 = r3 instanceof defpackage.g54
            if (r6 == 0) goto L63
            r3 = r2
        L63:
            com.github.mytv.dv.widget.WidgetKind r3 = (com.github.mytv.dv.widget.WidgetKind) r3
            if (r3 != 0) goto L68
            goto L7d
        L68:
            com.github.mytv.dv.widget.WidgetRefresher r6 = com.github.mytv.dv.widget.WidgetRefresher.INSTANCE
            r5.L$0 = r2
            r5.L$1 = r2
            r5.L$2 = r2
            r5.L$3 = r2
            r5.label = r1
            java.lang.Object r3 = r6.refresh(r4, r3, r5)
            el0 r4 = defpackage.el0.I
            if (r3 != r4) goto L7d
            return r4
        L7d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.widget.RefreshWidgetAction.onAction(android.content.Context, iq1, c7, fj0):java.lang.Object");
    }
}

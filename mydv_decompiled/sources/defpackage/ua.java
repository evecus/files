package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ua extends y4 {
    public final /* synthetic */ AndroidComposeView I;
    public final /* synthetic */ wa2 J;
    public final /* synthetic */ AndroidComposeView K;

    public ua(AndroidComposeView androidComposeView, wa2 wa2Var, AndroidComposeView androidComposeView2) {
        this.I = androidComposeView;
        this.J = wa2Var;
        this.K = androidComposeView2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r2.intValue() == r6.getSemanticsOwner().a().f) goto L19;
     */
    @Override // defpackage.y4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onInitializeAccessibilityNodeInfo(android.view.View r6, defpackage.p5 r7) {
        /*
            r5 = this;
            super.onInitializeAccessibilityNodeInfo(r6, r7)
            androidx.compose.ui.platform.AndroidComposeView r6 = r5.I
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r0 = androidx.compose.ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r6)
            boolean r0 = r0.isEnabled$ui()
            if (r0 == 0) goto L15
            r0 = 0
            android.view.accessibility.AccessibilityNodeInfo r1 = r7.a
            r1.setVisibleToUser(r0)
        L15:
            wa2 r0 = r5.J
            wa2 r1 = r0.v()
        L1b:
            r2 = 0
            if (r1 == 0) goto L2e
            ja3 r3 = r1.n0
            r4 = 8
            boolean r3 = r3.c(r4)
            if (r3 == 0) goto L29
            goto L2f
        L29:
            wa2 r1 = r1.v()
            goto L1b
        L2e:
            r1 = r2
        L2f:
            if (r1 == 0) goto L37
            int r1 = r1.J
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
        L37:
            r1 = -1
            if (r2 == 0) goto L4a
            xi4 r3 = r6.getSemanticsOwner()
            si4 r3 = r3.a()
            int r3 = r3.f
            int r4 = r2.intValue()
            if (r4 != r3) goto L4e
        L4a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
        L4e:
            int r2 = r2.intValue()
            r7.b = r2
            android.view.accessibility.AccessibilityNodeInfo r7 = r7.a
            androidx.compose.ui.platform.AndroidComposeView r5 = r5.K
            r7.setParent(r5, r2)
            int r0 = r0.J
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r2 = androidx.compose.ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r6)
            o33 r2 = r2.getIdToBeforeMap$ui()
            int r2 = r2.d(r0)
            if (r2 == r1) goto L87
            vg r3 = r6.getAndroidViewsHandler$ui()
            qg r3 = defpackage.ad4.A(r3, r2)
            if (r3 == 0) goto L79
            r7.setTraversalBefore(r3)
            goto L7c
        L79:
            r7.setTraversalBefore(r5, r2)
        L7c:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r2 = androidx.compose.ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r6)
            java.lang.String r2 = r2.getExtraDataTestTraversalBeforeVal$ui()
            androidx.compose.ui.platform.AndroidComposeView.access$addExtraDataToAccessibilityNodeInfoHelper(r6, r0, r7, r2)
        L87:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r2 = androidx.compose.ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r6)
            o33 r2 = r2.getIdToAfterMap$ui()
            int r2 = r2.d(r0)
            if (r2 == r1) goto Lb1
            vg r1 = r6.getAndroidViewsHandler$ui()
            qg r1 = defpackage.ad4.A(r1, r2)
            if (r1 == 0) goto La3
            r7.setTraversalAfter(r1)
            goto La6
        La3:
            r7.setTraversalAfter(r5, r2)
        La6:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r5 = androidx.compose.ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r6)
            java.lang.String r5 = r5.getExtraDataTestTraversalAfterVal$ui()
            androidx.compose.ui.platform.AndroidComposeView.access$addExtraDataToAccessibilityNodeInfoHelper(r6, r0, r7, r5)
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ua.onInitializeAccessibilityNodeInfo(android.view.View, p5):void");
    }
}

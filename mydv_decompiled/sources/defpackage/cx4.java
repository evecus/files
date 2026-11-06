package defpackage;

import android.graphics.Canvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class cx4 extends wt0 implements w31 {
    public final sc K;
    public final r61 L;
    public RenderNode M;

    public cx4(r05 r05Var, sc scVar, r61 r61Var) {
        this.K = scVar;
        this.L = r61Var;
        j0(r05Var);
    }

    public static boolean m0(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01fa  */
    @Override // defpackage.w31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(defpackage.zh0 r29) {
        /*
            Method dump skipped, instructions count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cx4.draw(zh0):void");
    }

    public final RenderNode n0() {
        RenderNode renderNode = this.M;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode b = er1.b();
        this.M = b;
        return b;
    }

    @Override // defpackage.w31
    public final void onMeasureResultChanged() {
    }
}

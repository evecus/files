package defpackage;

import android.app.Application;
import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.model.HotWord;
import com.github.mytv.dv.model.LiveRoom;
import com.github.mytv.dv.widget.WidgetKind;
import com.github.mytv.dv.widget.WidgetUpdater;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class au2 implements ag1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Application J;

    public /* synthetic */ au2(Application application, byte b) {
        this.I = b;
        this.J = application;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056 A[LOOP:0: B:11:0x0050->B:13:0x0056, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.fj0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.zt2
            if (r0 == 0) goto L13
            r0 = r5
            zt2 r0 = (defpackage.zt2) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            zt2 r0 = new zt2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.I
            int r1 = r0.K
            r2 = 1
            android.app.Application r4 = r4.J
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            defpackage.mu0.V(r5)
            goto L48
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.mu0.V(r5)
            com.github.mytv.dv.widget.WidgetStore r5 = com.github.mytv.dv.widget.WidgetStore.INSTANCE
            r5.clear(r4)
            com.github.mytv.dv.widget.WidgetPlaybackStore r5 = com.github.mytv.dv.widget.WidgetPlaybackStore.INSTANCE
            r5.clear()
            com.github.mytv.dv.widget.WidgetUpdater r5 = com.github.mytv.dv.widget.WidgetUpdater.INSTANCE
            r0.K = r2
            java.lang.Object r5 = r5.updateAll(r4, r0)
            el0 r0 = defpackage.el0.I
            if (r5 != r0) goto L48
            return r0
        L48:
            ya1 r5 = com.github.mytv.dv.widget.WidgetKind.getEntries()
            java.util.Iterator r5 = r5.iterator()
        L50:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r0 = r5.next()
            com.github.mytv.dv.widget.WidgetKind r0 = (com.github.mytv.dv.widget.WidgetKind) r0
            com.github.mytv.dv.widget.WidgetRefreshScheduler r1 = com.github.mytv.dv.widget.WidgetRefreshScheduler.INSTANCE
            r1.refreshNow(r4, r0)
            goto L50
        L62:
            wd5 r4 = defpackage.wd5.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.au2.a(fj0):java.lang.Object");
    }

    @Override // defpackage.ag1
    public final Object emit(Object obj, fj0 fj0Var) {
        Object pushVideos;
        Object pushSearch;
        Object pushLive;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        el0 el0Var = el0.I;
        Application application = this.J;
        switch (b) {
            case 0:
                return a(fj0Var);
            case 1:
                Object updateAll = WidgetUpdater.INSTANCE.updateAll(application, fj0Var);
                return updateAll == el0Var ? updateAll : wd5Var;
            case 2:
                List<Aweme> list = (List) obj;
                return (list.isEmpty() || (pushVideos = WidgetUpdater.INSTANCE.pushVideos(application, WidgetKind.HISTORY, list, fj0Var)) != el0Var) ? wd5Var : pushVideos;
            case 3:
                List<HotWord> list2 = (List) obj;
                return (list2.isEmpty() || (pushSearch = WidgetUpdater.INSTANCE.pushSearch(application, list2, fj0Var)) != el0Var) ? wd5Var : pushSearch;
            case 4:
                dn2 dn2Var = (dn2) ((Map) obj).get("follow");
                List<LiveRoom> list3 = dn2Var != null ? dn2Var.b : null;
                if (list3 == null) {
                    list3 = o91.I;
                }
                return (list3.isEmpty() || (pushLive = WidgetUpdater.INSTANCE.pushLive(application, list3, fj0Var)) != el0Var) ? wd5Var : pushLive;
            default:
                Object updateAll2 = WidgetUpdater.INSTANCE.updateAll(application, fj0Var);
                return updateAll2 == el0Var ? updateAll2 : wd5Var;
        }
    }
}

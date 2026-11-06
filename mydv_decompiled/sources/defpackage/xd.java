package defpackage;

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class xd implements ak3 {
    public final String a;
    public final m65 b;
    public final List c;
    public final List d;
    public final kj1 e;
    public final iu0 f;
    public final wf g;
    public final CharSequence h;
    public final ja2 i;
    public x81 j;
    public final boolean k;
    public final int l;
    public final int m;

    /* JADX WARN: Code restructure failed: missing block: B:119:0x03ba, code lost:
    
        if ((r6.b.c & 1095216660480L) != 0) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0099, code lost:
    
        if (r7 == 1) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x088c A[LOOP:5: B:283:0x088a->B:284:0x088c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:471:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00aa  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xd] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xd(java.lang.String r46, defpackage.m65 r47, java.util.List r48, java.util.List r49, defpackage.kj1 r50, defpackage.iu0 r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 2544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xd.<init>(java.lang.String, m65, java.util.List, java.util.List, kj1, iu0, boolean):void");
    }

    @Override // defpackage.ak3
    public final boolean a() {
        x81 x81Var = this.j;
        if (x81Var != null ? x81Var.m() : false) {
            return true;
        }
        if (!this.k && mu0.x(this.b)) {
            ep epVar = g81.a;
            ep epVar2 = g81.a;
            cw4 cw4Var = (cw4) epVar2.J;
            if (cw4Var == null) {
                if (c81.d()) {
                    cw4Var = epVar2.s();
                    epVar2.J = cw4Var;
                } else {
                    cw4Var = p70.o;
                }
            }
            if (((Boolean) cw4Var.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ak3
    public final float b() {
        ja2 ja2Var = this.i;
        float f = ja2Var.e;
        TextPaint textPaint = ja2Var.b;
        if (!Float.isNaN(f)) {
            return ja2Var.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = ja2Var.a;
        lineInstance.setText(new v50(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, i42.i);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new u22(i, next, 1));
            } else {
                u22 u22Var = (u22) priorityQueue.peek();
                if (u22Var != null && u22Var.J - u22Var.I < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new u22(i, next, 1));
                }
            }
            i = next;
        }
        float f2 = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                zy.k();
                return 0.0f;
            }
            u22 u22Var2 = (u22) it.next();
            f2 = Layout.getDesiredWidth(ja2Var.b(), u22Var2.I, u22Var2.J, textPaint);
            while (it.hasNext()) {
                u22 u22Var3 = (u22) it.next();
                f2 = Math.max(f2, Layout.getDesiredWidth(ja2Var.b(), u22Var3.I, u22Var3.J, textPaint));
            }
        }
        ja2Var.e = f2;
        return f2;
    }

    @Override // defpackage.ak3
    public final float c() {
        return this.i.c();
    }
}

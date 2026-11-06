package defpackage;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class c23 {
    public long a;
    public final SparseLongArray b = new SparseLongArray();
    public final SparseBooleanArray c = new SparseBooleanArray();
    public final ArrayList d = new ArrayList();
    public final bs2 e = new bs2((Object) null);
    public int f = -1;
    public int g = -1;
    public boolean h;
    public boolean i;
    public pd3 j;

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.b;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j = this.a;
                this.a = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j2 = this.a;
            this.a = 1 + j2;
            sparseLongArray.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.c.put(pointerId2, true);
            }
        }
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f && source == this.g) {
            return;
        }
        this.f = toolType;
        this.g = source;
        this.c.clear();
        this.b.clear();
    }

    public final g12 c(AndroidComposeView androidComposeView, MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.c;
        if (actionMasked == 3 || actionMasked == 4) {
            this.b.clear();
            sparseBooleanArray.clear();
            this.h = false;
            this.i = false;
            this.j = null;
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z2 = actionMasked == 8;
        if (z) {
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            i = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            i = 0;
        }
        ArrayList arrayList = this.d;
        arrayList.clear();
        if (motionEvent.getActionMasked() == 0) {
            boolean z3 = Build.VERSION.SDK_INT >= 34 && (motionEvent.getClassification() == 3 || motionEvent.getClassification() == 5);
            boolean z4 = motionEvent.getButtonState() == 0 && (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584));
            if (z3 || z4) {
                this.h = true;
            }
        }
        if (Build.VERSION.SDK_INT < 34 || !(motionEvent.getClassification() == 3 || motionEvent.getClassification() == 5)) {
            this.i = false;
            int pointerCount = motionEvent.getPointerCount();
            int i2 = 0;
            while (i2 < pointerCount) {
                arrayList.add(d(androidComposeView, motionEvent, null, i2, (z || i2 == i || (z2 && motionEvent.getButtonState() == 0)) ? false : true));
                i2++;
            }
        } else {
            if (motionEvent.getClassification() == 5 && motionEvent.getPointerCount() == 1) {
                if (motionEvent.getActionMasked() == 1) {
                    this.h = false;
                    this.i = false;
                    this.j = null;
                }
                e(motionEvent);
                return null;
            }
            this.i = true;
            if (motionEvent.getActionMasked() == 0) {
                this.j = new pd3((Float.floatToRawIntBits(motionEvent.getRawX(0)) << 32) | (Float.floatToRawIntBits(motionEvent.getRawY(0)) & 4294967295L));
            } else if (motionEvent.getActionMasked() == 5 && motionEvent.getClassification() == 5 && motionEvent.getPointerCount() == 2) {
                this.j = new pd3((Float.floatToRawIntBits((motionEvent.getRawX(1) + motionEvent.getRawX(0)) / 2.0f) << 32) | (Float.floatToRawIntBits((motionEvent.getRawY(1) + motionEvent.getRawY(0)) / 2.0f) & 4294967295L));
            }
            arrayList.add(d(androidComposeView, motionEvent, this.j, 0, false));
        }
        if (motionEvent.getActionMasked() == 1) {
            this.h = false;
            this.i = false;
            this.j = null;
        }
        e(motionEvent);
        motionEvent.getEventTime();
        return new g12(arrayList, motionEvent, (byte) 23);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a0, code lost:
    
        if (r1 != 4) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016f A[EDGE_INSN: B:41:0x016f->B:42:0x016f BREAK  A[LOOP:0: B:20:0x00d7->B:38:0x0166], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.tp3 d(androidx.compose.ui.platform.AndroidComposeView r43, android.view.MotionEvent r44, defpackage.pd3 r45, int r46, boolean r47) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c23.d(androidx.compose.ui.platform.AndroidComposeView, android.view.MotionEvent, pd3, int, boolean):tp3");
    }

    public final void e(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.c;
        SparseLongArray sparseLongArray = this.b;
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!sparseBooleanArray.get(pointerId, false)) {
                sparseLongArray.delete(pointerId);
                sparseBooleanArray.delete(pointerId);
            }
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int keyAt = sparseLongArray.keyAt(size);
                int pointerCount = motionEvent.getPointerCount();
                int i = 0;
                while (true) {
                    if (i >= pointerCount) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(keyAt);
                        break;
                    } else if (motionEvent.getPointerId(i) == keyAt) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }
}

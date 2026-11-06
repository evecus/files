package defpackage;

import android.os.Build;
import android.view.View;
import com.github.mytv.dv.R;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class rq5 {
    public final int a;
    public final Class b;
    public final byte c;
    public final byte d;
    public final /* synthetic */ byte e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rq5(byte b) {
        this(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28);
        this.e = b;
        switch (b) {
            case 1:
                this(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28);
                break;
            case 2:
                this(R.id.tag_state_description, CharSequence.class, 64, 30);
                break;
            case 3:
                this(R.id.tag_accessibility_heading, Boolean.class, 0, 28);
                break;
            default:
                break;
        }
    }

    public final Object a(View view) {
        if (Build.VERSION.SDK_INT < this.c) {
            Object tag = view.getTag(this.a);
            if (this.b.isInstance(tag)) {
                return tag;
            }
            return null;
        }
        switch (this.e) {
            case 0:
                return Boolean.valueOf(yq5.c(view));
            case 1:
                return yq5.a(view);
            case 2:
                return ar5.b(view);
            default:
                return Boolean.valueOf(yq5.b(view));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (r0 == r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        r0 = !r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0085, code lost:
    
        if (r0 == r2) goto L24;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0031. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.view.View r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            byte r1 = r4.c
            byte r2 = r4.e
            if (r0 < r1) goto L2b
            switch(r2) {
                case 0: goto L21;
                case 1: goto L1b;
                case 2: goto L15;
                default: goto Lb;
            }
        Lb:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            defpackage.yq5.d(r5, r4)
            goto L2a
        L15:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            defpackage.ar5.c(r5, r6)
            goto L2a
        L1b:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            defpackage.yq5.e(r5, r6)
            goto L2a
        L21:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            defpackage.yq5.f(r5, r4)
        L2a:
            return
        L2b:
            java.lang.Object r0 = r4.a(r5)
            r1 = 0
            r3 = 1
            switch(r2) {
                case 0: goto L6a;
                case 1: goto L60;
                case 2: goto L55;
                default: goto L34;
            }
        L34:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r2 = r6
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r0 == 0) goto L43
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L43
            r0 = r3
            goto L44
        L43:
            r0 = r1
        L44:
            if (r2 == 0) goto L4e
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L4e
            r2 = r3
            goto L4f
        L4e:
            r2 = r1
        L4f:
            if (r0 != r2) goto L52
        L51:
            r1 = r3
        L52:
            r0 = r1 ^ 1
            goto L88
        L55:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = r6
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
        L5e:
            r0 = r0 ^ r3
            goto L88
        L60:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = r6
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            goto L5e
        L6a:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r2 = r6
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r0 == 0) goto L79
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L79
            r0 = r3
            goto L7a
        L79:
            r0 = r1
        L7a:
            if (r2 == 0) goto L84
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L84
            r2 = r3
            goto L85
        L84:
            r2 = r1
        L85:
            if (r0 != r2) goto L52
            goto L51
        L88:
            if (r0 == 0) goto Lb5
            android.view.View$AccessibilityDelegate r0 = defpackage.dr5.c(r5)
            if (r0 != 0) goto L92
            r0 = 0
            goto La1
        L92:
            boolean r1 = r0 instanceof defpackage.x4
            if (r1 == 0) goto L9b
            x4 r0 = (defpackage.x4) r0
            y4 r0 = r0.a
            goto La1
        L9b:
            y4 r1 = new y4
            r1.<init>(r0)
            r0 = r1
        La1:
            if (r0 != 0) goto La8
            y4 r0 = new y4
            r0.<init>()
        La8:
            defpackage.dr5.h(r5, r0)
            int r0 = r4.a
            r5.setTag(r0, r6)
            byte r4 = r4.d
            defpackage.dr5.e(r4, r5)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rq5.b(android.view.View, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rq5(int i, Class cls, int i2, int i3) {
        this.a = i;
        this.b = cls;
        this.d = i2;
        this.c = i3;
    }
}

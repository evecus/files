package defpackage;

import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class i14 implements InputConnection {
    public final g73 a;
    public final boolean b;
    public int c;
    public d55 d;
    public int e;
    public boolean f;
    public final ArrayList g = new ArrayList();
    public boolean h = true;

    public i14(d55 d55Var, g73 g73Var, boolean z) {
        this.a = g73Var;
        this.b = z;
        this.d = d55Var;
    }

    public final void a(c71 c71Var) {
        this.c++;
        try {
            this.g.add(c71Var);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            ArrayList arrayList = this.g;
            if (!arrayList.isEmpty()) {
                ((l55) this.a.J).e.invoke(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        this.c++;
        return true;
    }

    public final void c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.g.clear();
        this.c = 0;
        this.h = false;
        ArrayList arrayList = ((l55) this.a.J).i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (j42.c(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.h;
        return z ? this.b : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.h;
        if (z) {
            a(new eb0(String.valueOf(charSequence), i));
        }
        return z;
    }

    public final void d(d55 d55Var) {
        this.d = d55Var;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        a(new du0(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        a(new eu0(i, i2));
        return true;
    }

    public final void e(d55 d55Var, pn pnVar) {
        if (this.h) {
            this.d = d55Var;
            if (this.f) {
                ((InputMethodManager) ((uc2) pnVar.c).getValue()).updateExtractedText((View) pnVar.b, this.e, e21.S(d55Var));
            }
            d65 d65Var = d55Var.c;
            long j = d55Var.b;
            int f = d65Var != null ? d65.f(d65Var.a) : -1;
            d65 d65Var2 = d55Var.c;
            int e = d65Var2 != null ? d65.e(d65Var2.a) : -1;
            ((InputMethodManager) ((uc2) pnVar.c).getValue()).updateSelection((View) pnVar.b, d65.f(j), d65.e(j), f, e);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        a(new ue1());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        d55 d55Var = this.d;
        return TextUtils.getCapsMode(d55Var.a.J, d65.f(d55Var.b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.f = z;
        if (z) {
            this.e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return e21.S(this.d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (d65.c(this.d.b)) {
            return null;
        }
        return fb4.q(this.d).J;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return fb4.r(this.d, i).J;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return fb4.s(this.d, i).J;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.h;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    a(new uk4(0, this.d.a.J.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.h;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        break;
                }
                ((l55) this.a.J).f.invoke(new lx1(i2));
            }
            i2 = 1;
            ((l55) this.a.J).f.invoke(new lx1(i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.h;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestCursorUpdates(int r10) {
        /*
            r9 = this;
            boolean r0 = r9.h
            if (r0 == 0) goto L77
            r0 = r10 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            r3 = r10 & 2
            if (r3 == 0) goto L13
            r3 = r2
            goto L14
        L13:
            r3 = r1
        L14:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L4d
            r5 = r10 & 16
            if (r5 == 0) goto L20
            r5 = r2
            goto L21
        L20:
            r5 = r1
        L21:
            r6 = r10 & 8
            if (r6 == 0) goto L27
            r6 = r2
            goto L28
        L27:
            r6 = r1
        L28:
            r7 = r10 & 4
            if (r7 == 0) goto L2e
            r7 = r2
            goto L2f
        L2e:
            r7 = r1
        L2f:
            r8 = 34
            if (r4 < r8) goto L38
            r10 = r10 & 32
            if (r10 == 0) goto L38
            r1 = r2
        L38:
            if (r5 != 0) goto L4a
            if (r6 != 0) goto L4a
            if (r7 != 0) goto L4a
            if (r1 != 0) goto L4a
            if (r4 < r8) goto L47
            r10 = r2
            r1 = r10
        L44:
            r5 = r1
        L45:
            r6 = r5
            goto L50
        L47:
            r10 = r1
            r1 = r2
            goto L44
        L4a:
            r10 = r1
            r1 = r7
            goto L50
        L4d:
            r10 = r1
            r5 = r2
            goto L45
        L50:
            g73 r9 = r9.a
            java.lang.Object r9 = r9.J
            l55 r9 = (defpackage.l55) r9
            om0 r9 = r9.l
            java.lang.Object r4 = r9.c
            monitor-enter(r4)
            r9.f = r5     // Catch: java.lang.Throwable -> L6f
            r9.g = r6     // Catch: java.lang.Throwable -> L6f
            r9.h = r1     // Catch: java.lang.Throwable -> L6f
            r9.i = r10     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r9.e = r2     // Catch: java.lang.Throwable -> L6f
            d55 r10 = r9.j     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            r9.a()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r9 = move-exception
            goto L75
        L71:
            r9.d = r3     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r4)
            return r2
        L75:
            monitor-exit(r4)
            throw r9
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i14.requestCursorUpdates(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((l55) this.a.J).j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.h;
        if (z) {
            a(new sk4(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.h;
        if (z) {
            a(new tk4(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        a(new uk4(i, i2));
        return true;
    }
}

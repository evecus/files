package defpackage;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class l81 extends z71 implements Runnable {
    public final WeakReference I;
    public final WeakReference J;

    public l81(TextView textView, m81 m81Var) {
        this.I = new WeakReference(textView);
        this.J = new WeakReference(m81Var);
    }

    @Override // defpackage.z71
    public final void b() {
        Handler handler;
        TextView textView = (TextView) this.I.get();
        if (textView == null || (handler = textView.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.I.get();
        InputFilter inputFilter = (InputFilter) this.J.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    c81 a = c81.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        a.getClass();
                        length = text.length();
                    }
                    CharSequence g = a.g(0, length, 0, text);
                    if (text == g) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(g);
                    int selectionEnd = Selection.getSelectionEnd(g);
                    textView.setText(g);
                    if (g instanceof Spannable) {
                        Spannable spannable = (Spannable) g;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}

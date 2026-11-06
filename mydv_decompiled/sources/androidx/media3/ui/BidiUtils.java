package androidx.media3.ui;

import android.text.BidiFormatter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextDirectionHeuristics;
import androidx.media3.common.util.Log;
import defpackage.g62;
import defpackage.hf1;
import defpackage.iu4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class BidiUtils {
    private static final String TAG = "BidiUtils";
    private static final iu4 LF_SPLITTER = iu4.a("\n");
    private static final iu4 CRLF_SPLITTER = iu4.a("\r\n");
    private static final g62 LF_JOINER = new g62("\n");

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    public static boolean containsRtl(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int codePointAt = Character.codePointAt(charSequence, i);
            byte directionality = Character.getDirectionality(codePointAt);
            if (directionality == 1 || directionality == 2 || directionality == 16 || directionality == 17) {
                return true;
            }
            i += Character.charCount(codePointAt);
        }
        return false;
    }

    public static CharSequence wrapText(CharSequence charSequence) {
        Spanned spanned;
        Object[] objArr;
        int[] iArr;
        int[] iArr2;
        List<String> b;
        int i;
        BidiFormatter bidiFormatter = BidiFormatter.getInstance();
        int i2 = 0;
        if (charSequence instanceof Spanned) {
            spanned = (Spanned) charSequence;
            objArr = spanned.getSpans(0, charSequence.length(), Object.class);
            iArr = new int[objArr.length];
            iArr2 = new int[objArr.length];
            Arrays.fill(iArr, -1);
            Arrays.fill(iArr2, -1);
        } else {
            spanned = null;
            objArr = null;
            iArr = null;
            iArr2 = null;
        }
        if (charSequence.toString().contains("\r\n")) {
            b = CRLF_SPLITTER.b(charSequence);
            i = 2;
        } else {
            b = LF_SPLITTER.b(charSequence);
            i = 1;
        }
        ArrayList arrayList = new ArrayList(b.size());
        int i3 = 0;
        int i4 = 0;
        for (String str : b) {
            String unicodeWrap = bidiFormatter.unicodeWrap(str, TextDirectionHeuristics.LTR);
            if (objArr != null) {
                spanned.getClass();
                iArr.getClass();
                iArr2.getClass();
                int length = unicodeWrap.length() - str.length();
                if (length > 0) {
                    i3++;
                }
                for (int i5 = i2; i5 < objArr.length; i5++) {
                    if (iArr[i5] < 0 && spanned.getSpanStart(objArr[i5]) >= i4) {
                        if (spanned.getSpanStart(objArr[i5]) < str.length() + i4) {
                            iArr[i5] = i3;
                        }
                    }
                    if (iArr2[i5] < 0 && spanned.getSpanEnd(objArr[i5]) - 1 >= i4 && spanned.getSpanEnd(objArr[i5]) - 1 < str.length() + i4) {
                        iArr2[i5] = i3;
                    }
                }
                i4 += str.length() + i;
                if (length > 0) {
                    i3++;
                }
            }
            arrayList.add(unicodeWrap);
            i2 = 0;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LF_JOINER.c(arrayList));
        if (objArr != null) {
            spanned.getClass();
            iArr.getClass();
            iArr2.getClass();
            for (int i6 = 0; i6 < objArr.length; i6++) {
                int spanStart = spanned.getSpanStart(objArr[i6]) + iArr[i6];
                int spanEnd = spanned.getSpanEnd(objArr[i6]) + iArr2[i6];
                int spanFlags = spanned.getSpanFlags(objArr[i6]);
                if (spanStart < 0 || spanStart >= spannableStringBuilder.length() || spanEnd < 0 || spanEnd > spannableStringBuilder.length()) {
                    StringBuilder D = hf1.D("Span out of bounds: start=", spanStart, ",end=", spanEnd, ",len=");
                    D.append(spannableStringBuilder.length());
                    Log.w(TAG, D.toString());
                } else {
                    spannableStringBuilder.setSpan(objArr[i6], spanStart, spanEnd, spanFlags);
                }
            }
        }
        return spannableStringBuilder;
    }
}

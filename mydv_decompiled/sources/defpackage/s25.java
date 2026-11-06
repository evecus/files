package defpackage;

import android.view.textclassifier.TextClassification;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class s25 {
    public final CharSequence a;
    public final long b;
    public final TextClassification c;
    public final ArrayList d;

    public s25(CharSequence charSequence, long j, TextClassification textClassification, ArrayList arrayList) {
        this.a = charSequence;
        this.b = j;
        this.c = textClassification;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s25)) {
            return false;
        }
        s25 s25Var = (s25) obj;
        return j42.c(this.a, s25Var.a) && d65.b(this.b, s25Var.b) && j42.c(this.c, s25Var.c) && this.d.equals(s25Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = d65.c;
        return this.d.hashCode() + ((this.c.hashCode() + ((i82.Q(this.b) + hashCode) * 31)) * 31);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.a) + ", selection=" + d65.h(this.b) + ", textClassification=" + this.c + ", icons=" + this.d + ")";
    }
}

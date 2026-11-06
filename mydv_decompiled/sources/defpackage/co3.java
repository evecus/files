package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class co3 implements wn3 {
    public final tk0 a;
    public final Context b;
    public final rh4 c;
    public final tq2 d;
    public TextClassifier f;
    public final o53 e = new o53();
    public final jk3 g = ad4.w(null);
    public final Object h = new Object();

    public co3(tk0 tk0Var, Context context, rh4 rh4Var, tq2 tq2Var) {
        this.a = tk0Var;
        this.b = context;
        this.c = rh4Var;
        this.d = tq2Var;
    }

    public final void a(t25 t25Var, String str, long j, m6 m6Var) {
        o53 o53Var = this.e;
        s25 s25Var = null;
        if (o53Var.f()) {
            s25 s25Var2 = (s25) this.g.getValue();
            if (s25Var2 == null || !d65.b(j, s25Var2.b) || !j42.c(str, s25Var2.a)) {
                s25Var2 = null;
            }
            o53Var.g(null);
            s25Var = s25Var2;
        }
        if (s25Var == null) {
            m6Var.invoke(t25Var);
            return;
        }
        ArrayList arrayList = s25Var.d;
        TextClassification textClassification = s25Var.c;
        boolean isEmpty = textClassification.getActions().isEmpty();
        Object obj = this.h;
        if (!isEmpty) {
            t25Var.a.a(new j35(obj, textClassification, 0, (Drawable) arrayList.get(0)));
        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
            t25Var.a.a(new j35(obj, textClassification, -1, textClassification.getIcon()));
        }
        m6Var.invoke(t25Var);
        List<RemoteAction> actions = textClassification.getActions();
        int size = actions.size();
        for (int i = 0; i < size; i++) {
            actions.get(i);
            if (i > 0) {
                t25Var.a.a(new j35(obj, textClassification, i, (Drawable) arrayList.get(i)));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r6v3, types: [m53] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.CharSequence r17, long r18, android.view.textclassifier.TextClassifier r20, defpackage.gj0 r21) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.co3.b(java.lang.CharSequence, long, android.view.textclassifier.TextClassifier, gj0):java.lang.Object");
    }

    public final s25 c(CharSequence charSequence, long j, TextClassification textClassification) {
        Icon icon;
        int size = textClassification.getActions().size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            RemoteAction remoteAction = textClassification.getActions().get(i);
            RemoteAction a = hn3.a(remoteAction);
            Drawable drawable = null;
            if (i != 0 && !a.shouldShowIcon()) {
                remoteAction = null;
            }
            RemoteAction a2 = hn3.a(remoteAction);
            if (a2 != null && (icon = a2.getIcon()) != null) {
                drawable = icon.loadDrawable(this.b);
            }
            arrayList.add(drawable);
        }
        return new s25(charSequence, j, textClassification, arrayList);
    }

    public final LocaleList d() {
        tq2 tq2Var = this.d;
        if (tq2Var == null) {
            b3.h();
            return b3.b(new Locale[]{nn3.a.g().c().a});
        }
        ArrayList arrayList = new ArrayList(p70.J(tq2Var, 10));
        Iterator it = tq2Var.I.iterator();
        while (it.hasNext()) {
            arrayList.add(((sq2) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return b3.b((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}

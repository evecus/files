package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class xq2 implements wq2 {
    public final LocaleList a;

    public xq2(Object obj) {
        this.a = (LocaleList) obj;
    }

    @Override // defpackage.wq2
    public final String a() {
        return this.a.toLanguageTags();
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((wq2) obj).getLocaleList());
    }

    @Override // defpackage.wq2
    public final Locale get(int i) {
        return this.a.get(i);
    }

    @Override // defpackage.wq2
    public final Object getLocaleList() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.wq2
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // defpackage.wq2
    public final int size() {
        return this.a.size();
    }

    public final String toString() {
        return this.a.toString();
    }
}

package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.util.Util;
import defpackage.hf1;
import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class Label {
    private static final String FIELD_LANGUAGE_INDEX = Util.intToStringMaxRadix(0);
    private static final String FIELD_VALUE_INDEX = Util.intToStringMaxRadix(1);
    public final String language;
    public final String value;

    public Label(String str, String str2) {
        this.language = Util.normalizeLanguageCode(str);
        this.value = str2;
    }

    public static Label fromBundle(Bundle bundle) {
        String string = bundle.getString(FIELD_LANGUAGE_INDEX);
        String string2 = bundle.getString(FIELD_VALUE_INDEX);
        string2.getClass();
        return new Label(string, string2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Label label = (Label) obj;
            if (Objects.equals(this.language, label.language) && Objects.equals(this.value, label.value)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.value.hashCode() * 31;
        String str = this.language;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        String str = this.language;
        if (str != null) {
            bundle.putString(FIELD_LANGUAGE_INDEX, str);
        }
        bundle.putString(FIELD_VALUE_INDEX, this.value);
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{ lang=");
        sb.append(this.language);
        sb.append(", '");
        return hf1.z(sb, this.value, "' }");
    }
}

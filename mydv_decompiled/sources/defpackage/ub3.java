package defpackage;

import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ub3 extends lc3 {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public um3 c;
    public CharSequence d;
    public Boolean e;

    @Override // defpackage.lc3
    public final void addCompatExtras(Bundle bundle) {
        super.addCompatExtras(bundle);
        if (Build.VERSION.SDK_INT < 28) {
            bundle.putCharSequence("android.selfDisplayName", this.c.a);
            bundle.putBundle("android.messagingStyleUser", this.c.b());
            bundle.putCharSequence("android.hiddenConversationTitle", this.d);
            if (this.d != null && this.e.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.d);
            }
            ArrayList arrayList = this.a;
            if (!arrayList.isEmpty()) {
                bundle.putParcelableArray("android.messages", tb3.a(arrayList));
            }
            ArrayList arrayList2 = this.b;
            if (!arrayList2.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", tb3.a(arrayList2));
            }
            Boolean bool = this.e;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0147  */
    @Override // defpackage.lc3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void apply(defpackage.db3 r10) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ub3.apply(db3):void");
    }

    public final SpannableStringBuilder c(tb3 tb3Var) {
        String str = xv.b;
        xv xvVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? xv.e : xv.d;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        um3 um3Var = tb3Var.c;
        CharSequence charSequence = um3Var == null ? "" : um3Var.a;
        int i = -16777216;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.c.a;
            int i2 = this.mBuilder.r;
            if (i2 != 0) {
                i = i2;
            }
        }
        SpannableStringBuilder c = xvVar.c(charSequence);
        spannableStringBuilder.append((CharSequence) c);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i), null), spannableStringBuilder.length() - c.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence2 = tb3Var.a;
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) xvVar.c(charSequence2 != null ? charSequence2 : ""));
        return spannableStringBuilder;
    }

    @Override // defpackage.lc3
    public final void clearCompatExtraKeys(Bundle bundle) {
        super.clearCompatExtraKeys(bundle);
        bundle.remove("android.messagingStyleUser");
        bundle.remove("android.selfDisplayName");
        bundle.remove("android.conversationTitle");
        bundle.remove("android.hiddenConversationTitle");
        bundle.remove("android.messages");
        bundle.remove("android.messages.historic");
        bundle.remove("android.isGroupConversation");
    }

    @Override // defpackage.lc3
    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    @Override // defpackage.lc3
    public final void restoreFromCompatExtras(Bundle bundle) {
        super.restoreFromCompatExtras(bundle);
        ArrayList arrayList = this.a;
        arrayList.clear();
        um3 b = (Build.VERSION.SDK_INT < 28 || !bundle.containsKey("android.messagingUser")) ? null : qb3.b(bundle, "android.messagingUser");
        if (b != null) {
            this.c = b;
        } else if (bundle.containsKey("android.messagingStyleUser")) {
            this.c = um3.a(bundle.getBundle("android.messagingStyleUser"));
        } else {
            String string = bundle.getString("android.selfDisplayName");
            um3 um3Var = new um3();
            um3Var.a = string;
            um3Var.b = null;
            um3Var.c = null;
            um3Var.d = null;
            um3Var.e = false;
            um3Var.f = false;
            this.c = um3Var;
        }
        CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
        this.d = charSequence;
        if (charSequence == null) {
            this.d = bundle.getCharSequence("android.hiddenConversationTitle");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null) {
            arrayList.addAll(tb3.b(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
        if (parcelableArray2 != null) {
            this.b.addAll(tb3.b(parcelableArray2));
        }
        if (bundle.containsKey("android.isGroupConversation")) {
            this.e = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
        }
    }
}

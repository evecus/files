package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.github.mytv.dv.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lb3 extends lc3 {
    public int a;
    public um3 b;
    public PendingIntent c;
    public PendingIntent d;
    public PendingIntent e;
    public boolean f;
    public Integer g;
    public Integer h;
    public IconCompat i;
    public CharSequence j;

    @Override // defpackage.lc3
    public final void addCompatExtras(Bundle bundle) {
        super.addCompatExtras(bundle);
        bundle.putInt("android.callType", this.a);
        bundle.putBoolean("android.callIsVideo", this.f);
        um3 um3Var = this.b;
        if (um3Var != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                um3Var.getClass();
                bundle.putParcelable("android.callPerson", jb3.b(ck.N(um3Var)));
            } else {
                bundle.putParcelable("android.callPersonCompat", um3Var.b());
            }
        }
        IconCompat iconCompat = this.i;
        if (iconCompat != null) {
            Context context = this.mBuilder.a;
            iconCompat.getClass();
            bundle.putParcelable("android.verificationIcon", k21.t0(iconCompat, context));
        }
        bundle.putCharSequence("android.verificationText", this.j);
        bundle.putParcelable("android.answerIntent", this.c);
        bundle.putParcelable("android.declineIntent", this.d);
        bundle.putParcelable("android.hangUpIntent", this.e);
        Integer num = this.g;
        if (num != null) {
            bundle.putInt("android.answerColor", num.intValue());
        }
        Integer num2 = this.h;
        if (num2 != null) {
            bundle.putInt("android.declineColor", num2.intValue());
        }
    }

    @Override // defpackage.lc3
    public final void apply(db3 db3Var) {
        int i = Build.VERSION.SDK_INT;
        String str = null;
        r5 = null;
        Notification.CallStyle a = null;
        if (i < 31) {
            Notification.Builder builder = (Notification.Builder) ((mc3) db3Var).b;
            um3 um3Var = this.b;
            builder.setContentTitle(um3Var != null ? um3Var.a : null);
            Bundle bundle = this.mBuilder.q;
            CharSequence charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : this.mBuilder.q.getCharSequence("android.text");
            if (charSequence == null) {
                int i2 = this.a;
                if (i2 == 1) {
                    str = this.mBuilder.a.getResources().getString(R.string.call_notification_incoming_text);
                } else if (i2 == 2) {
                    str = this.mBuilder.a.getResources().getString(R.string.call_notification_ongoing_text);
                } else if (i2 == 3) {
                    str = this.mBuilder.a.getResources().getString(R.string.call_notification_screening_text);
                }
                charSequence = str;
            }
            builder.setContentText(charSequence);
            um3 um3Var2 = this.b;
            if (um3Var2 != null) {
                IconCompat iconCompat = um3Var2.b;
                if (iconCompat != null) {
                    builder.setLargeIcon(k21.t0(iconCompat, this.mBuilder.a));
                }
                um3 um3Var3 = this.b;
                if (i >= 28) {
                    um3Var3.getClass();
                    jb3.a(builder, ck.N(um3Var3));
                } else {
                    builder.addPerson(um3Var3.c);
                }
            }
            builder.setCategory("call");
            return;
        }
        int i3 = this.a;
        if (i3 == 1) {
            um3 um3Var4 = this.b;
            um3Var4.getClass();
            a = kb3.a(ck.N(um3Var4), this.d, this.c);
        } else if (i3 == 2) {
            um3 um3Var5 = this.b;
            um3Var5.getClass();
            a = kb3.b(ck.N(um3Var5), this.e);
        } else if (i3 == 3) {
            um3 um3Var6 = this.b;
            um3Var6.getClass();
            a = kb3.c(ck.N(um3Var6), this.e, this.c);
        } else if (Log.isLoggable("NotifCompat", 3)) {
            Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.a));
        }
        if (a != null) {
            a.setBuilder((Notification.Builder) ((mc3) db3Var).b);
            Integer num = this.g;
            if (num != null) {
                kb3.d(a, num.intValue());
            }
            Integer num2 = this.h;
            if (num2 != null) {
                kb3.e(a, num2.intValue());
            }
            kb3.h(a, this.j);
            IconCompat iconCompat2 = this.i;
            if (iconCompat2 != null) {
                kb3.g(a, k21.t0(iconCompat2, this.mBuilder.a));
            }
            kb3.f(a, this.f);
        }
    }

    public final eb3 c(int i, int i2, Integer num, int i3, PendingIntent pendingIntent) {
        if (num == null) {
            num = Integer.valueOf(this.mBuilder.a.getColor(i3));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.mBuilder.a.getResources().getString(i2));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
        Context context = this.mBuilder.a;
        PorterDuff.Mode mode = IconCompat.k;
        context.getClass();
        IconCompat c = IconCompat.c(context.getResources(), context.getPackageName(), i);
        Bundle bundle = new Bundle();
        CharSequence b = ib3.b(spannableStringBuilder);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!arrayList.isEmpty()) {
        }
        eb3 eb3Var = new eb3(c, b, pendingIntent, bundle, arrayList2.isEmpty() ? null : (u34[]) arrayList2.toArray(new u34[arrayList2.size()]));
        eb3Var.a.putBoolean("key_action_priority", true);
        return eb3Var;
    }

    @Override // defpackage.lc3
    public final boolean displayCustomViewInline() {
        return true;
    }

    @Override // defpackage.lc3
    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    @Override // defpackage.lc3
    public final void restoreFromCompatExtras(Bundle bundle) {
        super.restoreFromCompatExtras(bundle);
        this.a = bundle.getInt("android.callType");
        this.f = bundle.getBoolean("android.callIsVideo");
        if (Build.VERSION.SDK_INT >= 28 && bundle.containsKey("android.callPerson")) {
            this.b = ck.j((Person) bundle.getParcelable("android.callPerson"));
        } else if (bundle.containsKey("android.callPersonCompat")) {
            this.b = um3.a(bundle.getBundle("android.callPersonCompat"));
        }
        if (bundle.containsKey("android.verificationIcon")) {
            Icon icon = (Icon) bundle.getParcelable("android.verificationIcon");
            PorterDuff.Mode mode = IconCompat.k;
            this.i = k21.r(icon);
        } else if (bundle.containsKey("android.verificationIconCompat")) {
            this.i = IconCompat.a(bundle.getBundle("android.verificationIconCompat"));
        }
        this.j = bundle.getCharSequence("android.verificationText");
        this.c = (PendingIntent) bundle.getParcelable("android.answerIntent");
        this.d = (PendingIntent) bundle.getParcelable("android.declineIntent");
        this.e = (PendingIntent) bundle.getParcelable("android.hangUpIntent");
        this.g = bundle.containsKey("android.answerColor") ? Integer.valueOf(bundle.getInt("android.answerColor")) : null;
        this.h = bundle.containsKey("android.declineColor") ? Integer.valueOf(bundle.getInt("android.declineColor")) : null;
    }
}

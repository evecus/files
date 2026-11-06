package defpackage;

import android.app.Notification;
import android.app.Person;
import android.os.Bundle;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class qb3 {
    public static Notification.MessagingStyle a(Person person) {
        return new Notification.MessagingStyle(person);
    }

    public static um3 b(Bundle bundle, String str) {
        Parcelable parcelable = bundle.getParcelable(str);
        if (parcelable instanceof Person) {
            return ck.j((Person) parcelable);
        }
        return null;
    }

    public static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, boolean z) {
        return messagingStyle.setGroupConversation(z);
    }
}

package okhttp3.internal;

import defpackage.o70;
import defpackage.qj4;
import defpackage.sv2;
import defpackage.t72;
import defpackage.tm1;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class LinkedTags<K> extends Tags {
    private final t72 key;
    private final Tags next;
    private final K value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedTags(t72 t72Var, K k, Tags tags) {
        super(null);
        t72Var.getClass();
        k.getClass();
        tags.getClass();
        this.key = t72Var;
        this.value = k;
        this.next = tags;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkedTags toString$lambda$0(LinkedTags linkedTags) {
        linkedTags.getClass();
        Tags tags = linkedTags.next;
        if (tags instanceof LinkedTags) {
            return (LinkedTags) tags;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toString$lambda$1(LinkedTags linkedTags) {
        linkedTags.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(linkedTags.key);
        sb.append('=');
        sb.append(linkedTags.value);
        return sb.toString();
    }

    @Override // okhttp3.internal.Tags
    public <T> T get(t72 t72Var) {
        t72Var.getClass();
        return t72Var.equals(this.key) ? (T) sv2.B(t72Var).cast(this.value) : (T) this.next.get(t72Var);
    }

    @Override // okhttp3.internal.Tags
    public <T> Tags plus(t72 t72Var, T t) {
        t72Var.getClass();
        boolean equals = t72Var.equals(this.key);
        Tags tags = this.next;
        if (!equals) {
            Tags plus = tags.plus(t72Var, null);
            if (plus != this.next) {
                this = new LinkedTags<>(this.key, this.value, plus);
            }
            tags = this;
        }
        return t != null ? new LinkedTags(t72Var, t, tags) : tags;
    }

    public String toString() {
        final byte b = 0;
        List h1 = o70.h1(qj4.z(qj4.x(this, new tm1() { // from class: okhttp3.internal.a
            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                LinkedTags string$lambda$0;
                CharSequence string$lambda$1;
                LinkedTags linkedTags = (LinkedTags) obj;
                switch (b) {
                    case 0:
                        string$lambda$0 = LinkedTags.toString$lambda$0(linkedTags);
                        return string$lambda$0;
                    default:
                        string$lambda$1 = LinkedTags.toString$lambda$1(linkedTags);
                        return string$lambda$1;
                }
            }
        })));
        final byte b2 = 1;
        return o70.Z0(h1, null, "{", "}", 0, new tm1() { // from class: okhttp3.internal.a
            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                LinkedTags string$lambda$0;
                CharSequence string$lambda$1;
                LinkedTags linkedTags = (LinkedTags) obj;
                switch (b2) {
                    case 0:
                        string$lambda$0 = LinkedTags.toString$lambda$0(linkedTags);
                        return string$lambda$0;
                    default:
                        string$lambda$1 = LinkedTags.toString$lambda$1(linkedTags);
                        return string$lambda$1;
                }
            }
        }, 25);
    }
}

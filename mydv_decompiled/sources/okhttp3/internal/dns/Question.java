package okhttp3.internal.dns;

import defpackage.er0;
import defpackage.hf1;
import defpackage.j42;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class Question {

    /* renamed from: class, reason: not valid java name */
    private final int f2class;
    private final String name;
    private final int type;

    public Question(String str, int i, int i2) {
        str.getClass();
        this.name = str;
        this.type = i;
        this.f2class = i2;
    }

    public static /* synthetic */ Question copy$default(Question question, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = question.name;
        }
        if ((i3 & 2) != 0) {
            i = question.type;
        }
        if ((i3 & 4) != 0) {
            i2 = question.f2class;
        }
        return question.copy(str, i, i2);
    }

    public final String component1() {
        return this.name;
    }

    public final int component2() {
        return this.type;
    }

    public final int component3() {
        return this.f2class;
    }

    public final Question copy(String str, int i, int i2) {
        str.getClass();
        return new Question(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Question)) {
            return false;
        }
        Question question = (Question) obj;
        return j42.c(this.name, question.name) && this.type == question.type && this.f2class == question.f2class;
    }

    public final int getClass() {
        return this.f2class;
    }

    public final String getName() {
        return this.name;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.type) * 31) + this.f2class;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Question(name=");
        sb.append(this.name);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", class=");
        return hf1.y(sb, this.f2class, ')');
    }

    public /* synthetic */ Question(String str, int i, int i2, int i3, er0 er0Var) {
        this(str, i, (i3 & 4) != 0 ? 1 : i2);
    }
}

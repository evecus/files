package defpackage;

import com.github.mytv.dv.model.Comment;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class db0 {
    public final String a;
    public final Comment b;
    public final boolean c;
    public final int d;

    static {
        Comment.Companion companion = Comment.Companion;
    }

    public db0(String str, Comment comment, boolean z, int i) {
        this.a = str;
        this.b = comment;
        this.c = z;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db0)) {
            return false;
        }
        db0 db0Var = (db0) obj;
        return this.a.equals(db0Var.a) && this.b.equals(db0Var.b) && this.c == db0Var.c && this.d == db0Var.d;
    }

    public final int hashCode() {
        return ((((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        return "CommentRow(key=" + this.a + ", comment=" + this.b + ", isReply=" + this.c + ", parentIndex=" + this.d + ")";
    }
}

package defpackage;

import javax.security.auth.Destroyable;

/* loaded from: classes2.dex */
public final class a04 extends jq implements Destroyable {
    public static final yv K = new yv((byte) 0);
    public volatile boolean J;

    public final synchronized void a() {
        if (!this.J) {
            this.J = true;
        }
    }

    @Override // javax.security.auth.Destroyable
    public final synchronized void destroy() {
        a();
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.J;
    }
}

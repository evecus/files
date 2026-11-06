package defpackage;

import javax.security.auth.Destroyable;

/* loaded from: classes2.dex */
public final class go0 extends jq implements Destroyable {
    public volatile boolean J;

    @Override // javax.security.auth.Destroyable
    public final synchronized void destroy() {
        if (!this.J) {
            this.J = true;
        }
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.J;
    }
}

package coil3.compose;

import defpackage.c80;
import defpackage.j42;
import defpackage.jp0;
import defpackage.l13;
import defpackage.ni0;
import defpackage.tx;
import defpackage.u8;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class RealSubcomposeAsyncImageScope implements SubcomposeAsyncImageScope, tx {
    private final u8 alignment;
    private final float alpha;
    private final boolean clipToBounds;
    private final c80 colorFilter;
    private final String contentDescription;
    private final ni0 contentScale;
    private final AsyncImagePainter painter;
    private final tx parentScope;

    public RealSubcomposeAsyncImageScope(tx txVar, AsyncImagePainter asyncImagePainter, String str, u8 u8Var, ni0 ni0Var, float f, c80 c80Var, boolean z) {
        this.parentScope = txVar;
        this.painter = asyncImagePainter;
        this.contentDescription = str;
        this.alignment = u8Var;
        this.contentScale = ni0Var;
        this.alpha = f;
        this.colorFilter = c80Var;
        this.clipToBounds = z;
    }

    @Override // coil3.compose.SubcomposeAsyncImageScope, defpackage.tx
    public l13 align(l13 l13Var, u8 u8Var) {
        return this.parentScope.align(l13Var, u8Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealSubcomposeAsyncImageScope)) {
            return false;
        }
        RealSubcomposeAsyncImageScope realSubcomposeAsyncImageScope = (RealSubcomposeAsyncImageScope) obj;
        return j42.c(this.parentScope, realSubcomposeAsyncImageScope.parentScope) && j42.c(this.painter, realSubcomposeAsyncImageScope.painter) && j42.c(this.contentDescription, realSubcomposeAsyncImageScope.contentDescription) && j42.c(this.alignment, realSubcomposeAsyncImageScope.alignment) && j42.c(this.contentScale, realSubcomposeAsyncImageScope.contentScale) && Float.compare(this.alpha, realSubcomposeAsyncImageScope.alpha) == 0 && j42.c(this.colorFilter, realSubcomposeAsyncImageScope.colorFilter) && this.clipToBounds == realSubcomposeAsyncImageScope.clipToBounds;
    }

    @Override // coil3.compose.SubcomposeAsyncImageScope
    public u8 getAlignment() {
        return this.alignment;
    }

    @Override // coil3.compose.SubcomposeAsyncImageScope
    public float getAlpha() {
        return this.alpha;
    }

    @Override // coil3.compose.SubcomposeAsyncImageScope
    public boolean getClipToBounds() {
        return this.clipToBounds;
    }

    @Override // coil3.compose.SubcomposeAsyncImageScope
    public c80 getColorFilter() {
        return this.colorFilter;
    }

    @Override // coil3.compose.SubcomposeAsyncImageScope
    public String getContentDescription() {
        return this.contentDescription;
    }

    @Override // coil3.compose.SubcomposeAsyncImageScope
    public ni0 getContentScale() {
        return this.contentScale;
    }

    @Override // coil3.compose.SubcomposeAsyncImageScope
    public AsyncImagePainter getPainter() {
        return this.painter;
    }

    public int hashCode() {
        int hashCode = (this.painter.hashCode() + (this.parentScope.hashCode() * 31)) * 31;
        String str = this.contentDescription;
        int o = jp0.o(this.alpha, (this.contentScale.hashCode() + ((this.alignment.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31);
        c80 c80Var = this.colorFilter;
        return ((o + (c80Var != null ? c80Var.hashCode() : 0)) * 31) + (this.clipToBounds ? 1231 : 1237);
    }

    @Override // coil3.compose.SubcomposeAsyncImageScope, defpackage.tx
    public l13 matchParentSize(l13 l13Var) {
        return this.parentScope.matchParentSize(l13Var);
    }

    public String toString() {
        return "RealSubcomposeAsyncImageScope(parentScope=" + this.parentScope + ", painter=" + this.painter + ", contentDescription=" + this.contentDescription + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ", clipToBounds=" + this.clipToBounds + ")";
    }
}

package coil3.compose.internal;

import defpackage.c80;
import defpackage.fq;
import defpackage.fq4;
import defpackage.hf1;
import defpackage.hn1;
import defpackage.j42;
import defpackage.jp0;
import defpackage.l13;
import defpackage.mu0;
import defpackage.ni0;
import defpackage.q13;
import defpackage.rj3;
import defpackage.tm1;
import defpackage.u8;
import defpackage.ut0;
import defpackage.z12;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class SubcomposeContentPainterElement extends q13 {
    public static final int $stable = 0;
    private final u8 alignment;
    private final float alpha;
    private final boolean clipToBounds;
    private final c80 colorFilter;
    private final String contentDescription;
    private final ni0 contentScale;
    private final rj3 painter;

    public SubcomposeContentPainterElement(rj3 rj3Var, u8 u8Var, ni0 ni0Var, float f, c80 c80Var, boolean z, String str) {
        this.painter = rj3Var;
        this.alignment = u8Var;
        this.contentScale = ni0Var;
        this.alpha = f;
        this.colorFilter = c80Var;
        this.clipToBounds = z;
        this.contentDescription = str;
    }

    private final rj3 component1() {
        return this.painter;
    }

    private final u8 component2() {
        return this.alignment;
    }

    private final ni0 component3() {
        return this.contentScale;
    }

    private final float component4() {
        return this.alpha;
    }

    private final c80 component5() {
        return this.colorFilter;
    }

    private final boolean component6() {
        return this.clipToBounds;
    }

    private final String component7() {
        return this.contentDescription;
    }

    public static /* synthetic */ SubcomposeContentPainterElement copy$default(SubcomposeContentPainterElement subcomposeContentPainterElement, rj3 rj3Var, u8 u8Var, ni0 ni0Var, float f, c80 c80Var, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            rj3Var = subcomposeContentPainterElement.painter;
        }
        if ((i & 2) != 0) {
            u8Var = subcomposeContentPainterElement.alignment;
        }
        if ((i & 4) != 0) {
            ni0Var = subcomposeContentPainterElement.contentScale;
        }
        if ((i & 8) != 0) {
            f = subcomposeContentPainterElement.alpha;
        }
        if ((i & 16) != 0) {
            c80Var = subcomposeContentPainterElement.colorFilter;
        }
        if ((i & 32) != 0) {
            z = subcomposeContentPainterElement.clipToBounds;
        }
        if ((i & 64) != 0) {
            str = subcomposeContentPainterElement.contentDescription;
        }
        boolean z2 = z;
        String str2 = str;
        c80 c80Var2 = c80Var;
        ni0 ni0Var2 = ni0Var;
        return subcomposeContentPainterElement.copy(rj3Var, u8Var, ni0Var2, f, c80Var2, z2, str2);
    }

    @Override // defpackage.q13, defpackage.l13
    public /* bridge */ /* synthetic */ boolean all(tm1 tm1Var) {
        return hf1.a(this, tm1Var);
    }

    public boolean any(tm1 tm1Var) {
        return ((Boolean) tm1Var.invoke(this)).booleanValue();
    }

    public final SubcomposeContentPainterElement copy(rj3 rj3Var, u8 u8Var, ni0 ni0Var, float f, c80 c80Var, boolean z, String str) {
        return new SubcomposeContentPainterElement(rj3Var, u8Var, ni0Var, f, c80Var, z, str);
    }

    @Override // defpackage.q13
    public SubcomposeContentPainterNode create() {
        return new SubcomposeContentPainterNode(this.painter, this.alignment, this.contentScale, this.alpha, this.colorFilter, this.clipToBounds, this.contentDescription);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubcomposeContentPainterElement)) {
            return false;
        }
        SubcomposeContentPainterElement subcomposeContentPainterElement = (SubcomposeContentPainterElement) obj;
        return j42.c(this.painter, subcomposeContentPainterElement.painter) && j42.c(this.alignment, subcomposeContentPainterElement.alignment) && j42.c(this.contentScale, subcomposeContentPainterElement.contentScale) && Float.compare(this.alpha, subcomposeContentPainterElement.alpha) == 0 && j42.c(this.colorFilter, subcomposeContentPainterElement.colorFilter) && this.clipToBounds == subcomposeContentPainterElement.clipToBounds && j42.c(this.contentDescription, subcomposeContentPainterElement.contentDescription);
    }

    @Override // defpackage.q13, defpackage.l13
    public Object foldIn(Object obj, hn1 hn1Var) {
        return hn1Var.invoke(obj, this);
    }

    public Object foldOut(Object obj, hn1 hn1Var) {
        return hn1Var.invoke(this, obj);
    }

    public int hashCode() {
        int o = jp0.o(this.alpha, (this.contentScale.hashCode() + ((this.alignment.hashCode() + (this.painter.hashCode() * 31)) * 31)) * 31, 31);
        c80 c80Var = this.colorFilter;
        int hashCode = (((o + (c80Var == null ? 0 : c80Var.hashCode())) * 31) + (this.clipToBounds ? 1231 : 1237)) * 31;
        String str = this.contentDescription;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.q13
    public void inspectableProperties(z12 z12Var) {
        z12Var.a = "content";
        fq fqVar = z12Var.c;
        fqVar.b(this.painter, "painter");
        fqVar.b(this.alignment, "alignment");
        fqVar.b(this.contentScale, "contentScale");
        fqVar.b(Float.valueOf(this.alpha), "alpha");
        fqVar.b(this.colorFilter, "colorFilter");
        fqVar.b(Boolean.valueOf(this.clipToBounds), "clipToBounds");
        fqVar.b(this.contentDescription, "contentDescription");
    }

    @Override // defpackage.q13, defpackage.l13
    public /* bridge */ /* synthetic */ l13 then(l13 l13Var) {
        return hf1.e(this, l13Var);
    }

    public String toString() {
        rj3 rj3Var = this.painter;
        u8 u8Var = this.alignment;
        ni0 ni0Var = this.contentScale;
        float f = this.alpha;
        c80 c80Var = this.colorFilter;
        boolean z = this.clipToBounds;
        String str = this.contentDescription;
        StringBuilder sb = new StringBuilder("SubcomposeContentPainterElement(painter=");
        sb.append(rj3Var);
        sb.append(", alignment=");
        sb.append(u8Var);
        sb.append(", contentScale=");
        sb.append(ni0Var);
        sb.append(", alpha=");
        sb.append(f);
        sb.append(", colorFilter=");
        sb.append(c80Var);
        sb.append(", clipToBounds=");
        sb.append(z);
        sb.append(", contentDescription=");
        return hf1.z(sb, str, ")");
    }

    @Override // defpackage.q13
    public void update(SubcomposeContentPainterNode subcomposeContentPainterNode) {
        boolean a = fq4.a(subcomposeContentPainterNode.getPainter().mo43getIntrinsicSizeNHjbRc(), this.painter.mo43getIntrinsicSizeNHjbRc());
        subcomposeContentPainterNode.setPainter(this.painter);
        subcomposeContentPainterNode.setAlignment(this.alignment);
        subcomposeContentPainterNode.setContentScale(this.contentScale);
        subcomposeContentPainterNode.setAlpha(this.alpha);
        subcomposeContentPainterNode.setColorFilter(this.colorFilter);
        subcomposeContentPainterNode.setClipToBounds(this.clipToBounds);
        if (!j42.c(subcomposeContentPainterNode.getContentDescription(), this.contentDescription)) {
            subcomposeContentPainterNode.setContentDescription(this.contentDescription);
            ut0.U(subcomposeContentPainterNode).I();
        }
        if (!a) {
            ut0.U(subcomposeContentPainterNode).H();
        }
        mu0.I(subcomposeContentPainterNode);
    }
}

package defpackage;

import java.text.BreakIterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hr1 extends k21 {
    public final BreakIterator j;

    public hr1(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.j = characterInstance;
    }

    @Override // defpackage.k21
    public final int e0(int i) {
        return this.j.following(i);
    }

    @Override // defpackage.k21
    public final int k0(int i) {
        return this.j.preceding(i);
    }
}

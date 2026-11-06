package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class v2 implements Iterator, w72 {
    public final /* synthetic */ byte I;
    public int J;
    public final Object K;

    public v2(Iterator it) {
        this.I = (byte) 2;
        it.getClass();
        this.K = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.I;
        Object obj = this.K;
        switch (b) {
            case 0:
                if (this.J < ((y2) obj).c()) {
                    break;
                }
                break;
            case 1:
                if (this.J < ((Object[]) obj).length) {
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                if (this.J < ((cu4) obj).e()) {
                    break;
                }
                break;
            default:
                if (this.J < ((ViewGroup) obj).getChildCount()) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.I;
        Object obj = this.K;
        switch (b) {
            case 0:
                if (!hasNext()) {
                    zy.k();
                    return null;
                }
                int i = this.J;
                this.J = i + 1;
                return ((y2) obj).get(i);
            case 1:
                try {
                    int i2 = this.J;
                    this.J = i2 + 1;
                    return ((Object[]) obj)[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.J--;
                    s83.l(e.getMessage());
                    return null;
                }
            case 2:
                int i3 = this.J;
                this.J = i3 + 1;
                if (i3 >= 0) {
                    return new iz1(i3, ((Iterator) obj).next());
                }
                p70.A0();
                throw null;
            case 3:
                int i4 = this.J;
                this.J = i4 + 1;
                return ((cu4) obj).f(i4);
            default:
                int i5 = this.J;
                this.J = i5 + 1;
                View childAt = ((ViewGroup) obj).getChildAt(i5);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.I) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ViewGroup viewGroup = (ViewGroup) this.K;
                int i = this.J - 1;
                this.J = i;
                viewGroup.removeViewAt(i);
                return;
        }
    }

    public /* synthetic */ v2(Object obj, byte b) {
        this.I = b;
        this.K = obj;
    }
}

package androidx.recyclerview.widget;

import android.os.Trace;
import android.view.ViewGroup;
import defpackage.f95;
import defpackage.s14;
import defpackage.t14;
import defpackage.u14;
import defpackage.z14;
import defpackage.zy;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class c {
    private final t14 mObservable = new t14();
    private boolean mHasStableIds = false;
    private s14 mStateRestorationPolicy = s14.I;

    public final void bindViewHolder(g gVar, int i) {
        boolean z = gVar.mBindingAdapter == null;
        if (z) {
            gVar.mPosition = i;
            if (hasStableIds()) {
                gVar.mItemId = getItemId(i);
            }
            gVar.setFlags(1, 519);
            int i2 = f95.a;
            Trace.beginSection("RV OnBindView");
        }
        gVar.mBindingAdapter = this;
        onBindViewHolder(gVar, i, gVar.getUnmodifiedPayloads());
        if (z) {
            gVar.clearPayload();
            ViewGroup.LayoutParams layoutParams = gVar.itemView.getLayoutParams();
            if (layoutParams instanceof z14) {
                ((z14) layoutParams).c = true;
            }
            int i3 = f95.a;
            Trace.endSection();
        }
    }

    public boolean canRestoreState() {
        int ordinal = this.mStateRestorationPolicy.ordinal();
        return ordinal != 1 ? ordinal != 2 : getItemCount() > 0;
    }

    public final g createViewHolder(ViewGroup viewGroup, int i) {
        try {
            int i2 = f95.a;
            Trace.beginSection("RV CreateView");
            g onCreateViewHolder = onCreateViewHolder(viewGroup, i);
            if (onCreateViewHolder.itemView.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            onCreateViewHolder.mItemViewType = i;
            Trace.endSection();
            return onCreateViewHolder;
        } catch (Throwable th) {
            int i3 = f95.a;
            Trace.endSection();
            throw th;
        }
    }

    public int findRelativeAdapterPositionIn(c cVar, g gVar, int i) {
        if (cVar == this) {
            return i;
        }
        return -1;
    }

    public abstract int getItemCount();

    public long getItemId(int i) {
        return -1L;
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public final s14 getStateRestorationPolicy() {
        return this.mStateRestorationPolicy;
    }

    public final boolean hasObservers() {
        return this.mObservable.a();
    }

    public final boolean hasStableIds() {
        return this.mHasStableIds;
    }

    public final void notifyDataSetChanged() {
        this.mObservable.b();
    }

    public final void notifyItemChanged(int i) {
        this.mObservable.d(i, 1, null);
    }

    public final void notifyItemInserted(int i) {
        this.mObservable.e(i, 1);
    }

    public final void notifyItemMoved(int i, int i2) {
        this.mObservable.c(i, i2);
    }

    public final void notifyItemRangeChanged(int i, int i2) {
        this.mObservable.d(i, i2, null);
    }

    public final void notifyItemRangeInserted(int i, int i2) {
        this.mObservable.e(i, i2);
    }

    public final void notifyItemRangeRemoved(int i, int i2) {
        this.mObservable.f(i, i2);
    }

    public final void notifyItemRemoved(int i) {
        this.mObservable.f(i, 1);
    }

    public abstract void onBindViewHolder(g gVar, int i);

    public void onBindViewHolder(g gVar, int i, List<Object> list) {
        onBindViewHolder(gVar, i);
    }

    public abstract g onCreateViewHolder(ViewGroup viewGroup, int i);

    public boolean onFailedToRecycleView(g gVar) {
        return false;
    }

    public void registerAdapterDataObserver(u14 u14Var) {
        this.mObservable.registerObserver(u14Var);
    }

    public void setHasStableIds(boolean z) {
        if (hasObservers()) {
            zy.i("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else {
            this.mHasStableIds = z;
        }
    }

    public void setStateRestorationPolicy(s14 s14Var) {
        this.mStateRestorationPolicy = s14Var;
        this.mObservable.g();
    }

    public void unregisterAdapterDataObserver(u14 u14Var) {
        this.mObservable.unregisterObserver(u14Var);
    }

    public final void notifyItemRangeChanged(int i, int i2, Object obj) {
        this.mObservable.d(i, i2, obj);
    }

    public final void notifyItemChanged(int i, Object obj) {
        this.mObservable.d(i, 1, obj);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    public void onViewAttachedToWindow(g gVar) {
    }

    public void onViewDetachedFromWindow(g gVar) {
    }

    public void onViewRecycled(g gVar) {
    }
}

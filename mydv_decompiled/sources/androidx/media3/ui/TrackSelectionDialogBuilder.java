package androidx.media3.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.common.Format;
import androidx.media3.common.Player;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.ui.TrackSelectionDialogBuilder;
import defpackage.c34;
import defpackage.dy1;
import defpackage.iy1;
import defpackage.j42;
import defpackage.n8;
import defpackage.to4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class TrackSelectionDialogBuilder {
    private boolean allowAdaptiveSelections;
    private boolean allowMultipleOverrides;
    private final DialogCallback callback;
    private final Context context;
    private boolean isDisabled;
    private iy1 overrides;
    private boolean showDisableOption;
    private int themeResId;
    private final CharSequence title;
    private Comparator<Format> trackFormatComparator;
    private final List<Tracks.Group> trackGroups;
    private TrackNameProvider trackNameProvider;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface DialogCallback {
        void onTracksSelected(boolean z, Map<TrackGroup, TrackSelectionOverride> map);
    }

    public TrackSelectionDialogBuilder(Context context, CharSequence charSequence, Player player, int i) {
        this.context = context;
        this.title = charSequence;
        dy1 groups = (player.isCommandAvailable(30) ? player.getCurrentTracks() : Tracks.EMPTY).getGroups();
        this.trackGroups = new ArrayList();
        for (int i2 = 0; i2 < groups.size(); i2++) {
            Tracks.Group group = (Tracks.Group) groups.get(i2);
            if (group.getType() == i) {
                this.trackGroups.add(group);
            }
        }
        this.overrides = player.getTrackSelectionParameters().overrides;
        this.callback = new to4(player, i, (byte) 2);
    }

    private Dialog buildForAndroidX() {
        try {
            Class cls = Integer.TYPE;
            Object newInstance = n8.class.getConstructor(Context.class, cls).newInstance(this.context, Integer.valueOf(this.themeResId));
            View inflate = LayoutInflater.from((Context) n8.class.getMethod("getContext", null).invoke(newInstance, null)).inflate(R.layout.exo_track_selection_dialog, (ViewGroup) null);
            DialogInterface.OnClickListener upDialogView = setUpDialogView(inflate);
            n8.class.getMethod("setTitle", CharSequence.class).invoke(newInstance, this.title);
            n8.class.getMethod("setView", View.class).invoke(newInstance, inflate);
            n8.class.getMethod("setPositiveButton", cls, DialogInterface.OnClickListener.class).invoke(newInstance, Integer.valueOf(android.R.string.ok), upDialogView);
            n8.class.getMethod("setNegativeButton", cls, DialogInterface.OnClickListener.class).invoke(newInstance, Integer.valueOf(android.R.string.cancel), null);
            return (Dialog) n8.class.getMethod("create", null).invoke(newInstance, null);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    private Dialog buildForPlatform() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.context, this.themeResId);
        View inflate = LayoutInflater.from(builder.getContext()).inflate(R.layout.exo_track_selection_dialog, (ViewGroup) null);
        return builder.setTitle(this.title).setView(inflate).setPositiveButton(android.R.string.ok, setUpDialogView(inflate)).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(Player player, int i, boolean z, Map map) {
        if (player.isCommandAvailable(29)) {
            TrackSelectionParameters.Builder buildUpon = player.getTrackSelectionParameters().buildUpon();
            buildUpon.setTrackTypeDisabled(i, z);
            buildUpon.clearOverridesOfType(i);
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                buildUpon.addOverride((TrackSelectionOverride) it.next());
            }
            player.setTrackSelectionParameters(buildUpon.build());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUpDialogView$1(TrackSelectionView trackSelectionView, DialogInterface dialogInterface, int i) {
        this.callback.onTracksSelected(trackSelectionView.getIsDisabled(), trackSelectionView.getOverrides());
    }

    private DialogInterface.OnClickListener setUpDialogView(View view) {
        final TrackSelectionView trackSelectionView = (TrackSelectionView) view.findViewById(R.id.exo_track_selection_view);
        trackSelectionView.setAllowMultipleOverrides(this.allowMultipleOverrides);
        trackSelectionView.setAllowAdaptiveSelections(this.allowAdaptiveSelections);
        trackSelectionView.setShowDisableOption(this.showDisableOption);
        TrackNameProvider trackNameProvider = this.trackNameProvider;
        if (trackNameProvider != null) {
            trackSelectionView.setTrackNameProvider(trackNameProvider);
        }
        trackSelectionView.init(this.trackGroups, this.isDisabled, this.overrides, this.trackFormatComparator, null);
        return new DialogInterface.OnClickListener() { // from class: h95
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                TrackSelectionDialogBuilder.this.lambda$setUpDialogView$1(trackSelectionView, dialogInterface, i);
            }
        };
    }

    public Dialog build() {
        Dialog buildForAndroidX = buildForAndroidX();
        return buildForAndroidX == null ? buildForPlatform() : buildForAndroidX;
    }

    public TrackSelectionDialogBuilder setAllowAdaptiveSelections(boolean z) {
        this.allowAdaptiveSelections = z;
        return this;
    }

    public TrackSelectionDialogBuilder setAllowMultipleOverrides(boolean z) {
        this.allowMultipleOverrides = z;
        return this;
    }

    public TrackSelectionDialogBuilder setIsDisabled(boolean z) {
        this.isDisabled = z;
        return this;
    }

    public TrackSelectionDialogBuilder setOverride(TrackSelectionOverride trackSelectionOverride) {
        Map<TrackGroup, TrackSelectionOverride> e;
        if (trackSelectionOverride == null) {
            e = Collections.EMPTY_MAP;
        } else {
            TrackGroup trackGroup = trackSelectionOverride.mediaTrackGroup;
            j42.k(trackGroup, trackSelectionOverride);
            e = c34.e(1, new Object[]{trackGroup, trackSelectionOverride}, null);
        }
        return setOverrides(e);
    }

    public TrackSelectionDialogBuilder setOverrides(Map<TrackGroup, TrackSelectionOverride> map) {
        this.overrides = iy1.a(map);
        return this;
    }

    public TrackSelectionDialogBuilder setShowDisableOption(boolean z) {
        this.showDisableOption = z;
        return this;
    }

    public TrackSelectionDialogBuilder setTheme(int i) {
        this.themeResId = i;
        return this;
    }

    public void setTrackFormatComparator(Comparator<Format> comparator) {
        this.trackFormatComparator = comparator;
    }

    public TrackSelectionDialogBuilder setTrackNameProvider(TrackNameProvider trackNameProvider) {
        this.trackNameProvider = trackNameProvider;
        return this;
    }

    public TrackSelectionDialogBuilder(Context context, CharSequence charSequence, List<Tracks.Group> list, DialogCallback dialogCallback) {
        this.context = context;
        this.title = charSequence;
        this.trackGroups = dy1.p(list);
        this.callback = dialogCallback;
        this.overrides = c34.O;
    }
}

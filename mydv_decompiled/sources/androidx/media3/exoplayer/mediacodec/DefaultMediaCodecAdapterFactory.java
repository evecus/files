package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import android.os.Build;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter;
import defpackage.gz4;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class DefaultMediaCodecAdapterFactory implements MediaCodecAdapter.Factory {
    private static final int MODE_DEFAULT = 0;
    private static final int MODE_DISABLED = 2;
    private static final int MODE_ENABLED = 1;
    private static final String TAG = "DMCodecAdapterFactory";
    private boolean asyncCryptoFlagEnabled;
    private boolean asyncCryptoSynchronizationEnabled;
    private int asynchronousMode;
    private final gz4 callbackThreadSupplier;
    private final Context context;
    private final gz4 queueingThreadSupplier;

    public DefaultMediaCodecAdapterFactory(Context context, gz4 gz4Var, gz4 gz4Var2) {
        this.context = context;
        this.asynchronousMode = 0;
        this.asyncCryptoFlagEnabled = true;
        this.callbackThreadSupplier = gz4Var;
        this.queueingThreadSupplier = gz4Var2;
    }

    private boolean shouldUseAsynchronousAdapterInDefaultMode() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return true;
        }
        Context context = this.context;
        return context != null && i >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
    public MediaCodecAdapter createAdapter(MediaCodecAdapter.Configuration configuration) {
        gz4 gz4Var;
        int i = this.asynchronousMode;
        if (i != 1 && (i != 0 || !shouldUseAsynchronousAdapterInDefaultMode())) {
            return new SynchronousMediaCodecAdapter.Factory().createAdapter(configuration);
        }
        int trackType = MimeTypes.getTrackType(configuration.format.sampleMimeType);
        Log.i(TAG, "Creating an asynchronous MediaCodec adapter for track type " + Util.getTrackTypeString(trackType));
        gz4 gz4Var2 = this.callbackThreadSupplier;
        AsynchronousMediaCodecAdapter.Factory factory = (gz4Var2 == null || (gz4Var = this.queueingThreadSupplier) == null) ? new AsynchronousMediaCodecAdapter.Factory(trackType) : new AsynchronousMediaCodecAdapter.Factory(gz4Var2, gz4Var);
        factory.setAsyncCryptoFlagEnabled(this.asyncCryptoFlagEnabled);
        factory.setAsyncCryptoSynchronizationEnabled(this.asyncCryptoSynchronizationEnabled);
        return factory.createAdapter(configuration);
    }

    public DefaultMediaCodecAdapterFactory forceDisableAsynchronous() {
        this.asynchronousMode = 2;
        return this;
    }

    public DefaultMediaCodecAdapterFactory forceEnableAsynchronous() {
        this.asynchronousMode = 1;
        return this;
    }

    public DefaultMediaCodecAdapterFactory setAsyncCryptoFlagEnabled(boolean z) {
        this.asyncCryptoFlagEnabled = z;
        return this;
    }

    public DefaultMediaCodecAdapterFactory setAsyncCryptoSynchronizationEnabled(boolean z) {
        this.asyncCryptoSynchronizationEnabled = z;
        return this;
    }

    public DefaultMediaCodecAdapterFactory(Context context) {
        this(context, null, null);
    }

    @Deprecated
    public DefaultMediaCodecAdapterFactory() {
        this.asynchronousMode = 0;
        this.context = null;
        this.callbackThreadSupplier = null;
        this.queueingThreadSupplier = null;
    }
}

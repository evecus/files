package androidx.media3.datasource;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.util.BitmapLoader;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;
import defpackage.fl2;
import defpackage.gz4;
import defpackage.kp0;
import defpackage.lp0;
import defpackage.rl2;
import defpackage.u13;
import defpackage.wi4;
import defpackage.x13;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class DataSourceBitmapLoader implements BitmapLoader {
    public static final gz4 DEFAULT_EXECUTOR_SERVICE = wi4.t(new kp0());
    private final DataSource.Factory dataSourceFactory;
    private final rl2 listeningExecutorService;
    private final boolean makeShared;
    private final int maximumOutputDimension;
    private final BitmapFactory.Options options;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private final Context context;
        private DataSource.Factory dataSourceFactory;
        private rl2 listeningExecutorService;
        private boolean makeShared;
        private int maximumOutputDimension = -1;
        private BitmapFactory.Options options;

        public Builder(Context context) {
            this.context = context;
        }

        public DataSourceBitmapLoader build() {
            return new DataSourceBitmapLoader(this);
        }

        public Builder setBitmapFactoryOptions(BitmapFactory.Options options) {
            this.options = options;
            return this;
        }

        public Builder setDataSourceFactory(DataSource.Factory factory) {
            this.dataSourceFactory = factory;
            return this;
        }

        public Builder setExecutorService(rl2 rl2Var) {
            this.listeningExecutorService = rl2Var;
            return this;
        }

        public Builder setMakeShared(boolean z) {
            this.makeShared = z;
            return this;
        }

        public Builder setMaximumOutputDimension(int i) {
            this.maximumOutputDimension = i;
            return this;
        }
    }

    private DataSourceBitmapLoader(Builder builder) {
        rl2 rl2Var;
        this.dataSourceFactory = builder.dataSourceFactory != null ? builder.dataSourceFactory : new DefaultDataSource.Factory(builder.context);
        if (builder.listeningExecutorService != null) {
            rl2Var = builder.listeningExecutorService;
        } else {
            rl2Var = (rl2) DEFAULT_EXECUTOR_SERVICE.get();
            rl2Var.getClass();
        }
        this.listeningExecutorService = rl2Var;
        this.options = builder.options;
        this.maximumOutputDimension = builder.maximumOutputDimension;
        this.makeShared = builder.makeShared;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bitmap lambda$decodeBitmap$1(byte[] bArr) {
        return maybeAsShared(this.makeShared, BitmapUtil.decode(bArr, bArr.length, this.options, this.maximumOutputDimension));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bitmap lambda$loadBitmap$2(Uri uri) {
        return load(this.dataSourceFactory.createDataSource(), uri, this.options, this.maximumOutputDimension, this.makeShared);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static rl2 lambda$static$0() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        return newSingleThreadExecutor instanceof rl2 ? (rl2) newSingleThreadExecutor : newSingleThreadExecutor instanceof ScheduledExecutorService ? new x13((ScheduledExecutorService) newSingleThreadExecutor) : new u13(newSingleThreadExecutor);
    }

    private static Bitmap load(DataSource dataSource, Uri uri, BitmapFactory.Options options, int i, boolean z) {
        try {
            dataSource.open(new DataSpec(uri));
            byte[] readToEnd = DataSourceUtil.readToEnd(dataSource);
            return maybeAsShared(z, BitmapUtil.decode(readToEnd, readToEnd.length, options, i));
        } finally {
            dataSource.close();
        }
    }

    private static Bitmap maybeAsShared(boolean z, Bitmap bitmap) {
        return z ? BitmapUtil.makeShared(bitmap) : bitmap;
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public fl2 decodeBitmap(byte[] bArr) {
        return ((u13) this.listeningExecutorService).e(new lp0(this, bArr, (byte) 0));
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public fl2 loadBitmap(Uri uri) {
        return ((u13) this.listeningExecutorService).e(new lp0(this, uri, (byte) 1));
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public final fl2 loadBitmapFromMetadata(MediaMetadata mediaMetadata) {
        byte[] bArr = mediaMetadata.artworkData;
        if (bArr != null) {
            return decodeBitmap(bArr);
        }
        Uri uri = mediaMetadata.artworkUri;
        if (uri != null) {
            return loadBitmap(uri);
        }
        return null;
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public boolean supportsMimeType(String str) {
        return Util.isBitmapFactorySupportedMimeType(str);
    }

    @Deprecated
    public DataSourceBitmapLoader(Context context) {
        this(new Builder(context));
    }

    @Deprecated
    public DataSourceBitmapLoader(Context context, int i) {
        this(new Builder(context).setMaximumOutputDimension(i));
    }

    @Deprecated
    public DataSourceBitmapLoader(rl2 rl2Var, DataSource.Factory factory) {
        this(rl2Var, factory, null);
    }

    @Deprecated
    public DataSourceBitmapLoader(rl2 rl2Var, DataSource.Factory factory, BitmapFactory.Options options) {
        this(rl2Var, factory, options, -1);
    }

    @Deprecated
    public DataSourceBitmapLoader(rl2 rl2Var, DataSource.Factory factory, BitmapFactory.Options options, int i) {
        this.listeningExecutorService = rl2Var;
        this.dataSourceFactory = factory;
        this.options = options;
        this.maximumOutputDimension = i;
        this.makeShared = false;
    }
}
